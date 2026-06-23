package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class sh0 extends iw {
    public float q0 = -1.0f;
    public int r0 = -1;
    public int s0 = -1;
    public ev t0 = this.J;
    public int u0 = 0;
    public boolean v0;

    public sh0() {
        this.R.clear();
        this.R.add(this.t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.t0;
        }
    }

    @Override // defpackage.iw
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.iw
    public final boolean B() {
        return this.v0;
    }

    @Override // defpackage.iw
    public final void Q(dr0 dr0Var, boolean z) {
        if (this.T == null) {
            return;
        }
        ev evVar = this.t0;
        dr0Var.getClass();
        int n = dr0.n(evVar);
        if (this.u0 == 1) {
            this.Y = n;
            this.Z = 0;
            L(this.T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = n;
        O(this.T.q());
        L(0);
    }

    public final void R(int i) {
        this.t0.l(i);
        this.v0 = true;
    }

    public final void S(int i) {
        if (this.u0 == i) {
            return;
        }
        this.u0 = i;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.u0 == 1) {
            this.t0 = this.I;
        } else {
            this.t0 = this.J;
        }
        arrayList.add(this.t0);
        ev[] evVarArr = this.Q;
        int length = evVarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            evVarArr[i2] = this.t0;
        }
    }

    @Override // defpackage.iw
    public final void b(dr0 dr0Var, boolean z) {
        jw jwVar = (jw) this.T;
        if (jwVar == null) {
            return;
        }
        Object i = jwVar.i(2);
        Object i2 = jwVar.i(4);
        iw iwVar = this.T;
        boolean z2 = iwVar != null && iwVar.p0[0] == 2;
        if (this.u0 == 0) {
            i = jwVar.i(3);
            i2 = jwVar.i(5);
            iw iwVar2 = this.T;
            z2 = iwVar2 != null && iwVar2.p0[1] == 2;
        }
        if (this.v0) {
            ev evVar = this.t0;
            if (evVar.c) {
                kp1 k = dr0Var.k(evVar);
                dr0Var.d(k, this.t0.d());
                if (this.r0 != -1) {
                    if (z2) {
                        dr0Var.f(dr0Var.k(i2), k, 0, 5);
                    }
                } else if (this.s0 != -1 && z2) {
                    kp1 k2 = dr0Var.k(i2);
                    dr0Var.f(k, dr0Var.k(i), 0, 5);
                    dr0Var.f(k2, k, 0, 5);
                }
                this.v0 = false;
                return;
            }
        }
        if (this.r0 != -1) {
            kp1 k3 = dr0Var.k(this.t0);
            dr0Var.e(k3, dr0Var.k(i), this.r0, 8);
            if (z2) {
                dr0Var.f(dr0Var.k(i2), k3, 0, 5);
                return;
            }
            return;
        }
        if (this.s0 != -1) {
            kp1 k4 = dr0Var.k(this.t0);
            kp1 k5 = dr0Var.k(i2);
            dr0Var.e(k4, k5, -this.s0, 8);
            if (z2) {
                dr0Var.f(k4, dr0Var.k(i), 0, 5);
                dr0Var.f(k5, k4, 0, 5);
                return;
            }
            return;
        }
        if (this.q0 != -1.0f) {
            kp1 k6 = dr0Var.k(this.t0);
            kp1 k7 = dr0Var.k(i2);
            float f = this.q0;
            q9 l = dr0Var.l();
            l.d.g(k6, -1.0f);
            l.d.g(k7, f);
            dr0Var.c(l);
        }
    }

    @Override // defpackage.iw
    public final boolean c() {
        return true;
    }

    @Override // defpackage.iw
    public final ev i(int i) {
        int A = d51.A(i);
        if (A != 1) {
            if (A != 2) {
                if (A != 3) {
                    if (A != 4) {
                        return null;
                    }
                }
            }
            if (this.u0 == 0) {
                return this.t0;
            }
            return null;
        }
        if (this.u0 == 1) {
            return this.t0;
        }
        return null;
    }
}
