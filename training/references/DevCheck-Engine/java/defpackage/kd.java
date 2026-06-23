package defpackage;

/* loaded from: classes.dex */
public final class kd extends zi0 {
    public int s0;
    public boolean t0;
    public int u0;
    public boolean v0;

    @Override // defpackage.iw
    public final boolean A() {
        return this.v0;
    }

    @Override // defpackage.iw
    public final boolean B() {
        return this.v0;
    }

    public final boolean T() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.r0;
            if (i4 >= i) {
                break;
            }
            iw iwVar = this.q0[i4];
            if ((this.t0 || iwVar.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && !iwVar.A()) || (((i3 = this.s0) == 2 || i3 == 3) && !iwVar.B()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int i5 = 0;
        boolean z2 = false;
        for (int i6 = 0; i6 < this.r0; i6++) {
            iw iwVar2 = this.q0[i6];
            if (this.t0 || iwVar2.c()) {
                if (!z2) {
                    int i7 = this.s0;
                    if (i7 == 0) {
                        i5 = iwVar2.i(2).d();
                    } else if (i7 == 1) {
                        i5 = iwVar2.i(4).d();
                    } else if (i7 == 2) {
                        i5 = iwVar2.i(3).d();
                    } else if (i7 == 3) {
                        i5 = iwVar2.i(5).d();
                    }
                    z2 = true;
                }
                int i8 = this.s0;
                if (i8 == 0) {
                    i5 = Math.min(i5, iwVar2.i(2).d());
                } else if (i8 == 1) {
                    i5 = Math.max(i5, iwVar2.i(4).d());
                } else if (i8 == 2) {
                    i5 = Math.min(i5, iwVar2.i(3).d());
                } else if (i8 == 3) {
                    i5 = Math.max(i5, iwVar2.i(5).d());
                }
            }
        }
        int i9 = i5 + this.u0;
        int i10 = this.s0;
        if (i10 == 0 || i10 == 1) {
            J(i9, i9);
        } else {
            K(i9, i9);
        }
        this.v0 = true;
        return true;
    }

    public final int U() {
        int i = this.s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // defpackage.iw
    public final void b(dr0 dr0Var, boolean z) {
        boolean z2;
        int i;
        int i2;
        ev[] evVarArr = this.Q;
        ev evVar = this.I;
        evVarArr[0] = evVar;
        int i3 = 2;
        ev evVar2 = this.J;
        evVarArr[2] = evVar2;
        ev evVar3 = this.K;
        evVarArr[1] = evVar3;
        ev evVar4 = this.L;
        evVarArr[3] = evVar4;
        for (ev evVar5 : evVarArr) {
            evVar5.i = dr0Var.k(evVar5);
        }
        int i4 = this.s0;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        ev evVar6 = evVarArr[i4];
        if (!this.v0) {
            T();
        }
        if (this.v0) {
            this.v0 = false;
            int i5 = this.s0;
            if (i5 == 0 || i5 == 1) {
                dr0Var.d(evVar.i, this.Y);
                dr0Var.d(evVar3.i, this.Y);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    dr0Var.d(evVar2.i, this.Z);
                    dr0Var.d(evVar4.i, this.Z);
                    return;
                }
                return;
            }
        }
        for (int i6 = 0; i6 < this.r0; i6++) {
            iw iwVar = this.q0[i6];
            if ((this.t0 || iwVar.c()) && ((((i2 = this.s0) == 0 || i2 == 1) && iwVar.p0[0] == 3 && iwVar.I.f != null && iwVar.K.f != null) || ((i2 == 2 || i2 == 3) && iwVar.p0[1] == 3 && iwVar.J.f != null && iwVar.L.f != null))) {
                z2 = true;
                break;
            }
        }
        z2 = false;
        boolean z3 = evVar.g() || evVar3.g();
        boolean z4 = evVar2.g() || evVar4.g();
        int i7 = !(!z2 && (((i = this.s0) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.r0) {
            iw iwVar2 = this.q0[i8];
            if (this.t0 || iwVar2.c()) {
                kp1 k = dr0Var.k(iwVar2.Q[this.s0]);
                ev[] evVarArr2 = iwVar2.Q;
                int i9 = this.s0;
                ev evVar7 = evVarArr2[i9];
                evVar7.i = k;
                ev evVar8 = evVar7.f;
                int i10 = (evVar8 == null || evVar8.d != this) ? 0 : evVar7.g;
                if (i9 == 0 || i9 == i3) {
                    kp1 kp1Var = evVar6.i;
                    int i11 = this.u0 - i10;
                    q9 l = dr0Var.l();
                    kp1 m = dr0Var.m();
                    m.j = 0;
                    l.c(kp1Var, k, m, i11);
                    dr0Var.c(l);
                } else {
                    kp1 kp1Var2 = evVar6.i;
                    int i12 = this.u0 + i10;
                    q9 l2 = dr0Var.l();
                    kp1 m2 = dr0Var.m();
                    m2.j = 0;
                    l2.b(kp1Var2, k, m2, i12);
                    dr0Var.c(l2);
                }
                dr0Var.e(evVar6.i, k, this.u0 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.s0;
        if (i13 == 0) {
            dr0Var.e(evVar3.i, evVar.i, 0, 8);
            dr0Var.e(evVar.i, this.T.K.i, 0, 4);
            dr0Var.e(evVar.i, this.T.I.i, 0, 0);
            return;
        }
        if (i13 == 1) {
            dr0Var.e(evVar.i, evVar3.i, 0, 8);
            dr0Var.e(evVar.i, this.T.I.i, 0, 4);
            dr0Var.e(evVar.i, this.T.K.i, 0, 0);
        } else if (i13 == 2) {
            dr0Var.e(evVar4.i, evVar2.i, 0, 8);
            dr0Var.e(evVar2.i, this.T.L.i, 0, 4);
            dr0Var.e(evVar2.i, this.T.J.i, 0, 0);
        } else if (i13 == 3) {
            dr0Var.e(evVar2.i, evVar4.i, 0, 8);
            dr0Var.e(evVar2.i, this.T.J.i, 0, 4);
            dr0Var.e(evVar2.i, this.T.L.i, 0, 0);
        }
    }

    @Override // defpackage.iw
    public final boolean c() {
        return true;
    }

    @Override // defpackage.iw
    public final String toString() {
        String u = d51.u(new StringBuilder("[Barrier] "), this.h0, " {");
        for (int i = 0; i < this.r0; i++) {
            iw iwVar = this.q0[i];
            if (i > 0) {
                u = u.concat(", ");
            }
            u = u + iwVar.h0;
        }
        return u.concat("}");
    }
}
