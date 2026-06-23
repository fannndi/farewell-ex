package defpackage;

import android.text.TextUtils;
import flar2.devcheck.ui.shizuku.ShizukuProcessService;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Callable;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class tn1 implements Callable {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ tn1(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        int i2 = this.g;
        Object obj = this.h;
        switch (i2) {
            case 0:
                wn1 wn1Var = (wn1) obj;
                un1 un1Var = wn1Var.k;
                vn1 vn1Var = wn1Var.j;
                try {
                    wn1Var.i.exitValue();
                    throw new IOException("Created process has terminated");
                } catch (IllegalThreadStateException unused) {
                    k32.k(un1Var);
                    k32.k(wn1Var.l);
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(un1Var));
                    try {
                        Charset charset = StandardCharsets.UTF_8;
                        vn1Var.write("echo SHELL_TEST\n".getBytes(charset));
                        vn1Var.flush();
                        String readLine = bufferedReader.readLine();
                        if (TextUtils.isEmpty(readLine) || !readLine.contains("SHELL_TEST")) {
                            throw new IOException("Created process is not a shell");
                        }
                        vn1Var.write("id\n".getBytes(charset));
                        vn1Var.flush();
                        String readLine2 = bufferedReader.readLine();
                        if (TextUtils.isEmpty(readLine2) || !readLine2.contains("uid=0")) {
                            i = 0;
                        } else {
                            synchronized (ju0.class) {
                                ju0.b = 2;
                                vn1Var.write(("cd " + k32.t(System.getProperty("user.dir")) + "\n").getBytes(charset));
                                vn1Var.flush();
                                i = 1;
                            }
                        }
                        bufferedReader.close();
                        return Integer.valueOf(i);
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return new FileInputStream((File) obj);
            default:
                String str = (String) obj;
                int i3 = ShizukuProcessService.h;
                StringBuilder sb = new StringBuilder();
                try {
                    Process exec = Runtime.getRuntime().exec(new String[]{"sh", "-c", str});
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                    while (true) {
                        String readLine3 = bufferedReader2.readLine();
                        if (readLine3 != null) {
                            sb.append(readLine3);
                            sb.append("\r\n");
                        } else {
                            BufferedReader bufferedReader3 = new BufferedReader(new InputStreamReader(exec.getErrorStream()));
                            while (true) {
                                String readLine4 = bufferedReader3.readLine();
                                if (readLine4 == null) {
                                    exec.waitFor();
                                    return sb.toString().trim();
                                }
                                sb.append(readLine4);
                                sb.append("\r\n");
                            }
                        }
                    }
                } catch (Exception e) {
                    return "Error: " + e.getMessage();
                }
        }
    }
}
