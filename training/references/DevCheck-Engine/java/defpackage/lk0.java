package defpackage;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class lk0 implements gp1 {
    public final int g;
    public final ek0 h;
    public final x12 i;
    public long j;
    public long k;
    public final ArrayDeque l;
    public boolean m;
    public final jk0 n;
    public final ik0 o;
    public final kk0 p;
    public final kk0 q;
    public j90 r;
    public IOException s;

    public lk0(int i, ek0 ek0Var, boolean z, boolean z2, ui0 ui0Var) {
        ek0Var.getClass();
        this.g = i;
        this.h = ek0Var;
        this.i = new x12(i);
        this.k = ek0Var.x.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.l = arrayDeque;
        this.n = new jk0(this, ek0Var.w.a(), z2);
        this.o = new ik0(this, z);
        this.p = new kk0(this);
        this.q = new kk0(this);
        if (ui0Var == null) {
            if (h()) {
                return;
            }
            c.n("remotely-initiated streams should have headers");
            throw null;
        }
        if (h()) {
            c.n("locally-initiated streams shouldn't have headers yet");
            throw null;
        }
        arrayDeque.add(ui0Var);
    }

    public final void a() {
        boolean z;
        boolean i;
        TimeZone timeZone = rd2.f888a;
        synchronized (this) {
            try {
                jk0 jk0Var = this.n;
                if (!jk0Var.h && jk0Var.k) {
                    ik0 ik0Var = this.o;
                    if (!ik0Var.g) {
                        if (ik0Var.i) {
                        }
                    }
                    z = true;
                    i = i();
                }
                z = false;
                i = i();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            d(j90.n, null);
        } else {
            if (i) {
                return;
            }
            this.h.j(this.g);
        }
    }

    @Override // defpackage.gp1
    public final lp1 b() {
        return this.n;
    }

    public final void c() {
        ik0 ik0Var = this.o;
        if (ik0Var.i) {
            rw.f("stream closed");
            return;
        }
        if (ik0Var.g) {
            rw.f("stream finished");
            return;
        }
        if (g() != null) {
            IOException iOException = this.s;
            if (iOException != null) {
                throw iOException;
            }
            j90 g = g();
            g.getClass();
            throw new pr1(g);
        }
    }

    public final void d(j90 j90Var, IOException iOException) {
        if (e(j90Var, iOException)) {
            ek0 ek0Var = this.h;
            ek0Var.getClass();
            ek0Var.C.r(this.g, j90Var);
        }
    }

    public final boolean e(j90 j90Var, IOException iOException) {
        TimeZone timeZone = rd2.f888a;
        synchronized (this) {
            if (g() != null) {
                return false;
            }
            this.r = j90Var;
            this.s = iOException;
            notifyAll();
            if (this.n.h) {
                if (this.o.g) {
                    return false;
                }
            }
            this.h.j(this.g);
            return true;
        }
    }

    public final void f(j90 j90Var) {
        if (e(j90Var, null)) {
            this.h.r(this.g, j90Var);
        }
    }

    public final j90 g() {
        j90 j90Var;
        synchronized (this) {
            j90Var = this.r;
        }
        return j90Var;
    }

    public final boolean h() {
        boolean z = (this.g & 1) == 1;
        this.h.getClass();
        return true == z;
    }

    public final boolean i() {
        synchronized (this) {
            try {
                if (g() != null) {
                    return false;
                }
                jk0 jk0Var = this.n;
                if (!jk0Var.h) {
                    if (jk0Var.k) {
                    }
                    return true;
                }
                ik0 ik0Var = this.o;
                if (ik0Var.g || ik0Var.i) {
                    if (this.m) {
                        return false;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002d A[Catch: all -> 0x0022, TryCatch #0 {all -> 0x0022, blocks: (B:4:0x0006, B:6:0x000b, B:8:0x0013, B:11:0x001c, B:13:0x002d, B:14:0x0031, B:22:0x0024), top: B:3:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.ui0 r3, boolean r4) {
        /*
            r2 = this;
            r3.getClass()
            java.util.TimeZone r0 = defpackage.rd2.f888a
            monitor-enter(r2)
            boolean r0 = r2.m     // Catch: java.lang.Throwable -> L22
            r1 = 1
            if (r0 == 0) goto L24
            java.lang.String r0 = ":status"
            java.lang.String r0 = r3.b(r0)     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L24
            java.lang.String r0 = ":method"
            java.lang.String r0 = r3.b(r0)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L1c
            goto L24
        L1c:
            jk0 r3 = r2.n     // Catch: java.lang.Throwable -> L22
            r3.getClass()     // Catch: java.lang.Throwable -> L22
            goto L2b
        L22:
            r3 = move-exception
            goto L43
        L24:
            r2.m = r1     // Catch: java.lang.Throwable -> L22
            java.util.ArrayDeque r0 = r2.l     // Catch: java.lang.Throwable -> L22
            r0.add(r3)     // Catch: java.lang.Throwable -> L22
        L2b:
            if (r4 == 0) goto L31
            jk0 r3 = r2.n     // Catch: java.lang.Throwable -> L22
            r3.h = r1     // Catch: java.lang.Throwable -> L22
        L31:
            boolean r3 = r2.i()     // Catch: java.lang.Throwable -> L22
            r2.notifyAll()     // Catch: java.lang.Throwable -> L22
            monitor-exit(r2)
            if (r3 != 0) goto L42
            ek0 r3 = r2.h
            int r2 = r2.g
            r3.j(r2)
        L42:
            return
        L43:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk0.j(ui0, boolean):void");
    }

    @Override // defpackage.gp1
    public final ap1 n() {
        return this.o;
    }
}
