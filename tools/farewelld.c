/*
 * farewelld — Kernel sysfs write daemon for custom ROM
 * Runs as vendor HAL service, communicates via Unix socket.
 * 
 * Build:
 *   aarch64-linux-android31-clang -O2 -static -o farewelld farewelld.c
 *
 * Install:
 *   /vendor/bin/hw/farewelld (chmod 755, seclabel u:r:farewell_service:s0)
 *   /vendor/etc/init/farewell.rc
 *   /vendor/etc/selinux/farewell_service.cil
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <fcntl.h>
#include <sys/stat.h>
#include <sys/socket.h>
#include <sys/un.h>
#include <errno.h>

#define SOCKET_PATH "/dev/socket/farewell"
#define MAX_BUF 4096
#define MAX_CLIENTS 10

/* Execute a sysfs write with chmod fallback */
static int do_write(const char *path, const char *value) {
    struct stat st;
    int fd;
    
    /* Try write directly first */
    fd = open(path, O_WRONLY | O_TRUNC);
    if (fd < 0) {
        /* Try chmod first (some kernels need this) */
        chmod(path, 0666);
        fd = open(path, O_WRONLY | O_TRUNC);
    }
    if (fd < 0) return -errno;
    
    int len = strlen(value);
    int ret = (int)write(fd, value, len);
    close(fd);
    
    if (ret < 0) return -errno;
    if (ret != len) return -EIO;
    return 0;
}

/* Check if path exists and whether writable */
static int do_check(const char *path, char *out, int out_len) {
    struct stat st;
    if (stat(path, &st) != 0) {
        snprintf(out, out_len, "MISSING");
        return 0;
    }
    int fd = open(path, O_WRONLY);
    if (fd >= 0) { close(fd); snprintf(out, out_len, "EXISTS rw"); }
    else snprintf(out, out_len, "EXISTS ro");
    return 0;
}

/* List contents of a directory */
static int do_list(const char *path, char *out, int out_len) {
    char cmd[512];
    snprintf(cmd, sizeof(cmd), "ls %s 2>/dev/null", path);
    FILE *fp = popen(cmd, "r");
    if (!fp) { snprintf(out, out_len, "ERR"); return 0; }
    int pos = 0;
    char buf[256];
    while (fgets(buf, sizeof(buf), fp) && pos < out_len - 256) {
        int l = strlen(buf);
        if (buf[l-1] == '\n') buf[l-1] = 0;
        pos += snprintf(out + pos, out_len - pos, "%s ", buf);
    }
    pclose(fp);
    if (pos == 0) snprintf(out, out_len, "EMPTY");
    return 0;
}

static void handle_client(int client_fd) {
    char buf[MAX_BUF];
    char response[MAX_BUF];
    int n = (int)read(client_fd, buf, sizeof(buf) - 1);
    if (n <= 0) { close(client_fd); return; }
    buf[n] = '\0';
    
    /* Strip trailing newline */
    while (n > 0 && (buf[n-1] == '\n' || buf[n-1] == '\r')) buf[--n] = '\0';
    
    char cmd[32], path[MAX_BUF], val[MAX_BUF];
    path[0] = val[0] = '\0';
    
    int parsed = sscanf(buf, "%31s %4095s %4095s", cmd, path, val);
    
    response[0] = '\0';
    
    if (parsed >= 2 && strcmp(cmd, "write") == 0) {
        int ret = do_write(path, val);
        if (ret == 0) snprintf(response, sizeof(response), "OK");
        else snprintf(response, sizeof(response), "ERR %d", -ret);
    }
    else if (parsed >= 2 && strcmp(cmd, "check") == 0) {
        do_check(path, response, sizeof(response));
    }
    else if (parsed >= 2 && strcmp(cmd, "read") == 0) {
        FILE *fp = fopen(path, "r");
        if (fp) {
            if (fgets(response, sizeof(response), fp)) {
                int l = strlen(response);
                while (l > 0 && (response[l-1] == '\n' || response[l-1] == '\r')) response[--l] = '\0';
            }
            fclose(fp);
        } else snprintf(response, sizeof(response), "ERR %s", strerror(errno));
    }
    else if (parsed >= 2 && strcmp(cmd, "list") == 0) {
        do_list(path, response, sizeof(response));
    }
    else if (strcmp(cmd, "ping") == 0) {
        snprintf(response, sizeof(response), "PONG");
    }
    else {
        snprintf(response, sizeof(response), "ERR unknown cmd");
    }
    
    write(client_fd, response, strlen(response));
    close(client_fd);
}

int main(int argc, char *argv[]) {
    /* If run as one-shot command, execute directly */
    if (argc >= 3 && strcmp(argv[1], "write") == 0) {
        return (do_write(argv[2], argc > 3 ? argv[3] : "") == 0) ? 0 : 1;
    }
    if (argc >= 2 && strcmp(argv[1], "check") == 0) {
        char resp[256]; do_check(argv[2], resp, sizeof(resp)); printf("%s\n", resp); return 0;
    }
    
    /* Daemon mode: listen on socket */
    unlink(SOCKET_PATH);
    
    int server_fd = socket(AF_UNIX, SOCK_STREAM, 0);
    if (server_fd < 0) { perror("socket"); return 1; }
    
    struct sockaddr_un addr;
    memset(&addr, 0, sizeof(addr));
    addr.sun_family = AF_UNIX;
    strncpy(addr.sun_path, SOCKET_PATH, sizeof(addr.sun_path) - 1);
    
    if (bind(server_fd, (struct sockaddr*)&addr, sizeof(addr)) < 0) { perror("bind"); return 1; }
    chmod(SOCKET_PATH, 0666);
    
    if (listen(server_fd, MAX_CLIENTS) < 0) { perror("listen"); return 1; }
    
    /* Signal readiness */
    fprintf(stderr, "farewelld: ready on %s\n", SOCKET_PATH);
    
    while (1) {
        int client_fd = accept(server_fd, NULL, NULL);
        if (client_fd < 0) { perror("accept"); continue; }
        handle_client(client_fd);
    }
    
    return 0;
}
