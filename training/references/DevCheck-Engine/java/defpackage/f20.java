package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class f20 implements lp1 {
    public final InputStream g;
    public final ip1 h;
    public final /* synthetic */ gr i;

    public f20(gr grVar) {
        this.i = grVar;
        Socket socket = (Socket) grVar.h;
        this.g = socket.getInputStream();
        this.h = new ip1(socket);
    }

    @Override // defpackage.lp1
    public final bz1 c() {
        return this.h;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        gr grVar = this.i;
        ip1 ip1Var = this.h;
        ip1Var.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) grVar.i;
            Socket socket = (Socket) grVar.h;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 2) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 2;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i == 3) {
                    socket.close();
                } else {
                    if (socket.isClosed() || socket.isInputShutdown()) {
                        return;
                    }
                    try {
                        socket.shutdownInput();
                    } catch (UnsupportedOperationException unused) {
                        this.g.close();
                    }
                }
                if (ip1Var.i()) {
                    throw ip1Var.j(null);
                }
            }
        } catch (IOException e) {
            if (!ip1Var.i()) {
                throw e;
            }
            throw ip1Var.j(e);
        } finally {
            ip1Var.i();
        }
    }

    @Override // defpackage.lp1
    public final long g(long j, wl wlVar) {
        ip1 ip1Var = this.h;
        ip1Var.f();
        ml1 E = wlVar.E(1);
        int min = (int) Math.min(8192L, 8192 - E.c);
        try {
            ip1Var.h();
            try {
                int read = this.g.read(E.f640a, E.c, min);
                if (ip1Var.i()) {
                    throw ip1Var.j(null);
                }
                if (read != -1) {
                    E.c += read;
                    long j2 = read;
                    wlVar.h += j2;
                    return j2;
                }
                if (E.b != E.c) {
                    return -1L;
                }
                wlVar.g = E.a();
                ol1.a(E);
                return -1L;
            } catch (IOException e) {
                if (ip1Var.i()) {
                    throw ip1Var.j(e);
                }
                throw e;
            } finally {
                ip1Var.i();
            }
        } catch (AssertionError e2) {
            if (od2.a(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    public final String toString() {
        return "source(" + ((Socket) this.i.h) + ')';
    }
}
