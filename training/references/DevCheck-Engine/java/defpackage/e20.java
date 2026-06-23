package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class e20 implements ap1 {
    public final OutputStream g;
    public final ip1 h;
    public final /* synthetic */ gr i;

    public e20(gr grVar) {
        this.i = grVar;
        Socket socket = (Socket) grVar.h;
        this.g = socket.getOutputStream();
        this.h = new ip1(socket);
    }

    @Override // defpackage.ap1
    public final bz1 c() {
        return this.h;
    }

    @Override // defpackage.ap1, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        OutputStream outputStream = this.g;
        gr grVar = this.i;
        ip1 ip1Var = this.h;
        ip1Var.h();
        try {
            AtomicInteger atomicInteger = (AtomicInteger) grVar.i;
            Socket socket = (Socket) grVar.h;
            atomicInteger.getClass();
            while (true) {
                int i2 = atomicInteger.get();
                if ((i2 & 1) != 0) {
                    i = 0;
                    break;
                }
                int i3 = i2 | 1;
                if (atomicInteger.compareAndSet(i2, i3)) {
                    i = i3;
                    break;
                }
            }
            if (i != 0) {
                if (i != 3) {
                    if (!socket.isClosed() && !socket.isOutputShutdown()) {
                        outputStream.flush();
                        try {
                            socket.shutdownOutput();
                        } catch (UnsupportedOperationException unused) {
                            outputStream.close();
                        }
                    }
                    return;
                }
                socket.close();
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

    @Override // defpackage.ap1, java.io.Flushable
    public final void flush() {
        ip1 ip1Var = this.h;
        ip1Var.h();
        try {
            this.g.flush();
            if (ip1Var.i()) {
                throw ip1Var.j(null);
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

    @Override // defpackage.ap1
    public final void q(long j, wl wlVar) {
        je2.g(wlVar.h, 0L, j);
        while (j > 0) {
            ip1 ip1Var = this.h;
            ip1Var.f();
            ml1 ml1Var = wlVar.g;
            ml1Var.getClass();
            int min = (int) Math.min(j, ml1Var.c - ml1Var.b);
            ip1Var.h();
            try {
                try {
                    this.g.write(ml1Var.f640a, ml1Var.b, min);
                    if (ip1Var.i()) {
                        throw ip1Var.j(null);
                    }
                    int i = ml1Var.b + min;
                    ml1Var.b = i;
                    long j2 = min;
                    j -= j2;
                    wlVar.h -= j2;
                    if (i == ml1Var.c) {
                        wlVar.g = ml1Var.a();
                        ol1.a(ml1Var);
                    }
                } catch (IOException e) {
                    if (!ip1Var.i()) {
                        throw e;
                    }
                    throw ip1Var.j(e);
                }
            } catch (Throwable th) {
                ip1Var.i();
                throw th;
            }
        }
    }

    public final String toString() {
        return "sink(" + ((Socket) this.i.h) + ')';
    }
}
