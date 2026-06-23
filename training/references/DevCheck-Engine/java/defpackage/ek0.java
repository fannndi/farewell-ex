package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class ek0 implements Closeable {
    public static final ym1 F;
    public long A;
    public final fh B;
    public final mk0 C;
    public final dk0 D;
    public final LinkedHashSet E;
    public final bk0 g;
    public final LinkedHashMap h = new LinkedHashMap();
    public final String i;
    public int j;
    public int k;
    public boolean l;
    public final jw1 m;
    public final iw1 n;
    public final iw1 o;
    public final iw1 p;
    public final j70 q;
    public long r;
    public long s;
    public long t;
    public long u;
    public final ub0 v;
    public final ym1 w;
    public ym1 x;
    public final x12 y;
    public long z;

    static {
        ym1 ym1Var = new ym1();
        ym1Var.b(4, 65535);
        ym1Var.b(5, rt0.z);
        F = ym1Var;
    }

    public ek0(yh yhVar) {
        this.g = (bk0) yhVar.j;
        String str = (String) yhVar.i;
        if (str == null) {
            ym0.A("connectionName");
            throw null;
        }
        this.i = str;
        this.k = 3;
        jw1 jw1Var = (jw1) yhVar.g;
        this.m = jw1Var;
        this.n = jw1Var.d();
        this.o = jw1Var.d();
        this.p = jw1Var.d();
        this.q = j70.m;
        this.v = (ub0) yhVar.k;
        ym1 ym1Var = new ym1();
        ym1Var.b(4, 16777216);
        this.w = ym1Var;
        this.x = F;
        this.y = new x12(0);
        this.A = r0.a();
        fh fhVar = (fh) yhVar.h;
        if (fhVar == null) {
            ym0.A("socket");
            throw null;
        }
        this.B = fhVar;
        this.C = new mk0((yc1) fhVar.j);
        this.D = new dk0(this, new hk0((zc1) fhVar.i));
        this.E = new LinkedHashSet();
    }

    public final void a(j90 j90Var, j90 j90Var2, IOException iOException) {
        int i;
        Object[] objArr;
        TimeZone timeZone = rd2.f888a;
        try {
            l(j90Var);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.h.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.h.values().toArray(new lk0[0]);
                this.h.clear();
            }
        }
        lk0[] lk0VarArr = (lk0[]) objArr;
        if (lk0VarArr != null) {
            for (lk0 lk0Var : lk0VarArr) {
                try {
                    lk0Var.d(j90Var2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.C.close();
        } catch (IOException unused3) {
        }
        try {
            ((Socket) ((gr) this.B.h).h).close();
        } catch (IOException unused4) {
        }
        this.n.e();
        this.o.e();
        this.p.e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(j90.i, j90.n, null);
    }

    public final lk0 e(int i) {
        lk0 lk0Var;
        synchronized (this) {
            lk0Var = (lk0) this.h.get(Integer.valueOf(i));
        }
        return lk0Var;
    }

    public final void flush() {
        this.C.flush();
    }

    public final lk0 j(int i) {
        lk0 lk0Var;
        synchronized (this) {
            lk0Var = (lk0) this.h.remove(Integer.valueOf(i));
            notifyAll();
        }
        return lk0Var;
    }

    public final void l(j90 j90Var) {
        synchronized (this.C) {
            synchronized (this) {
                if (this.l) {
                    return;
                }
                this.l = true;
                this.C.l(this.j, j90Var, pd2.f785a);
            }
        }
    }

    public final void m(long j) {
        synchronized (this) {
            try {
                x12.c(this.y, j, 0L, 2);
                long b = this.y.b();
                if (b >= this.w.a() / 2) {
                    v(0, b);
                    x12.c(this.y, 0L, b, 1);
                }
                ub0 ub0Var = this.v;
                x12 x12Var = this.y;
                ub0Var.getClass();
                x12Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.C.i);
        r6 = r2;
        r8.z += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(int r9, boolean r10, defpackage.wl r11, long r12) {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            mk0 r8 = r8.C
            r8.e(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L68
            monitor-enter(r8)
        L12:
            long r4 = r8.z     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            long r6 = r8.A     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L34
            java.util.LinkedHashMap r2 = r8.h     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            if (r2 == 0) goto L2c
            r8.wait()     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            goto L12
        L2a:
            r9 = move-exception
            goto L66
        L2c:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
            throw r9     // Catch: java.lang.Throwable -> L2a java.lang.InterruptedException -> L59
        L34:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L2a
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L2a
            mk0 r4 = r8.C     // Catch: java.lang.Throwable -> L2a
            int r4 = r4.i     // Catch: java.lang.Throwable -> L2a
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L2a
            long r4 = r8.z     // Catch: java.lang.Throwable -> L2a
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L2a
            long r4 = r4 + r6
            r8.z = r4     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r8)
            long r12 = r12 - r6
            mk0 r4 = r8.C
            if (r10 == 0) goto L54
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L54
            r5 = 1
            goto L55
        L54:
            r5 = r3
        L55:
            r4.e(r5, r9, r11, r2)
            goto Ld
        L59:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L2a
            r9.interrupt()     // Catch: java.lang.Throwable -> L2a
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L2a
            r9.<init>()     // Catch: java.lang.Throwable -> L2a
            throw r9     // Catch: java.lang.Throwable -> L2a
        L66:
            monitor-exit(r8)
            throw r9
        L68:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek0.o(int, boolean, wl, long):void");
    }

    public final void r(final int i, final j90 j90Var) {
        iw1.b(this.n, this.i + '[' + i + "] writeSynReset", new af0() { // from class: xj0
            @Override // defpackage.af0
            public final Object a() {
                ek0 ek0Var = ek0.this;
                try {
                    ek0Var.C.r(i, j90Var);
                } catch (IOException e) {
                    j90 j90Var2 = j90.j;
                    ek0Var.a(j90Var2, j90Var2, e);
                }
                return e42.f219a;
            }
        });
    }

    public final void v(final int i, final long j) {
        iw1.b(this.n, this.i + '[' + i + "] windowUpdate", new af0() { // from class: wj0
            @Override // defpackage.af0
            public final Object a() {
                ek0 ek0Var = ek0.this;
                try {
                    ek0Var.C.v(i, j);
                } catch (IOException e) {
                    j90 j90Var = j90.j;
                    ek0Var.a(j90Var, j90Var, e);
                }
                return e42.f219a;
            }
        });
    }
}
