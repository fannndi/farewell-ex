package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class sb0 extends zi0 {
    public int A0;
    public ue B0;
    public kv C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public float N0;
    public float O0;
    public int P0;
    public int Q0;
    public int R0;
    public int S0;
    public int T0;
    public int U0;
    public int V0;
    public ArrayList W0;
    public iw[] X0;
    public iw[] Y0;
    public int[] Z0;
    public iw[] a1;
    public int b1;
    public int s0;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public int z0;

    @Override // defpackage.zi0
    public final void S() {
        for (int i = 0; i < this.r0; i++) {
            iw iwVar = this.q0[i];
            if (iwVar != null) {
                iwVar.F = true;
            }
        }
    }

    public final int T(iw iwVar, int i) {
        iw iwVar2;
        if (iwVar != null) {
            int[] iArr = iwVar.p0;
            if (iArr[1] == 3) {
                int i2 = iwVar.s;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (iwVar.z * i);
                        if (i3 != iwVar.k()) {
                            iwVar.g = true;
                            V(iArr[0], iwVar.q(), 1, i3, iwVar);
                        }
                        return i3;
                    }
                    iwVar2 = iwVar;
                    if (i2 == 1) {
                        return iwVar2.k();
                    }
                    if (i2 == 3) {
                        return (int) ((iwVar2.q() * iwVar2.W) + 0.5f);
                    }
                }
            } else {
                iwVar2 = iwVar;
            }
            return iwVar2.k();
        }
        return 0;
    }

    public final int U(iw iwVar, int i) {
        iw iwVar2;
        if (iwVar != null) {
            int[] iArr = iwVar.p0;
            if (iArr[0] == 3) {
                int i2 = iwVar.r;
                if (i2 != 0) {
                    if (i2 == 2) {
                        int i3 = (int) (iwVar.w * i);
                        if (i3 != iwVar.q()) {
                            iwVar.g = true;
                            V(1, i3, iArr[1], iwVar.k(), iwVar);
                        }
                        return i3;
                    }
                    iwVar2 = iwVar;
                    if (i2 == 1) {
                        return iwVar2.q();
                    }
                    if (i2 == 3) {
                        return (int) ((iwVar2.k() * iwVar2.W) + 0.5f);
                    }
                }
            } else {
                iwVar2 = iwVar;
            }
            return iwVar2.q();
        }
        return 0;
    }

    public final void V(int i, int i2, int i3, int i4, iw iwVar) {
        kv kvVar;
        iw iwVar2;
        ue ueVar = this.B0;
        while (true) {
            kvVar = this.C0;
            if (kvVar != null || (iwVar2 = this.T) == null) {
                break;
            } else {
                this.C0 = ((jw) iwVar2).u0;
            }
        }
        ueVar.f1037a = i;
        ueVar.b = i3;
        ueVar.c = i2;
        ueVar.d = i4;
        kvVar.b(iwVar, ueVar);
        iwVar.O(ueVar.e);
        iwVar.L(ueVar.f);
        iwVar.E = ueVar.h;
        iwVar.I(ueVar.g);
    }

    @Override // defpackage.iw
    public final void b(dr0 dr0Var, boolean z) {
        iw iwVar;
        float f;
        int i;
        ArrayList arrayList = this.W0;
        super.b(dr0Var, z);
        iw iwVar2 = this.T;
        boolean z2 = iwVar2 != null && ((jw) iwVar2).v0;
        int i2 = this.T0;
        if (i2 != 0) {
            if (i2 == 1) {
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    ((qb0) arrayList.get(i3)).b(i3, z2, i3 == size + (-1));
                    i3++;
                }
            } else if (i2 != 2) {
                if (i2 == 3) {
                    int size2 = arrayList.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        ((qb0) arrayList.get(i4)).b(i4, z2, i4 == size2 + (-1));
                        i4++;
                    }
                }
            } else if (this.Z0 != null && this.Y0 != null && this.X0 != null) {
                for (int i5 = 0; i5 < this.b1; i5++) {
                    this.a1[i5].D();
                }
                int[] iArr = this.Z0;
                int i6 = iArr[0];
                int i7 = iArr[1];
                float f2 = this.J0;
                iw iwVar3 = null;
                int i8 = 0;
                while (i8 < i6) {
                    if (z2) {
                        i = (i6 - i8) - 1;
                        f = 1.0f - this.J0;
                    } else {
                        f = f2;
                        i = i8;
                    }
                    iw iwVar4 = this.Y0[i];
                    if (iwVar4 != null) {
                        ev evVar = iwVar4.I;
                        if (iwVar4.g0 != 8) {
                            if (i8 == 0) {
                                iwVar4.f(evVar, this.I, this.w0);
                                iwVar4.i0 = this.D0;
                                iwVar4.d0 = f;
                            }
                            if (i8 == i6 - 1) {
                                iwVar4.f(iwVar4.K, this.K, this.x0);
                            }
                            if (i8 > 0 && iwVar3 != null) {
                                ev evVar2 = iwVar3.K;
                                iwVar4.f(evVar, evVar2, this.P0);
                                iwVar3.f(evVar2, evVar, 0);
                            }
                            iwVar3 = iwVar4;
                        }
                    }
                    i8++;
                    f2 = f;
                }
                for (int i9 = 0; i9 < i7; i9++) {
                    iw iwVar5 = this.X0[i9];
                    if (iwVar5 != null) {
                        ev evVar3 = iwVar5.J;
                        if (iwVar5.g0 != 8) {
                            if (i9 == 0) {
                                iwVar5.f(evVar3, this.J, this.s0);
                                iwVar5.j0 = this.E0;
                                iwVar5.e0 = this.K0;
                            }
                            if (i9 == i7 - 1) {
                                iwVar5.f(iwVar5.L, this.L, this.t0);
                            }
                            if (i9 > 0 && iwVar3 != null) {
                                ev evVar4 = iwVar3.L;
                                iwVar5.f(evVar3, evVar4, this.Q0);
                                iwVar3.f(evVar4, evVar3, 0);
                            }
                            iwVar3 = iwVar5;
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (int i11 = 0; i11 < i7; i11++) {
                        int i12 = (i11 * i6) + i10;
                        if (this.V0 == 1) {
                            i12 = (i10 * i7) + i11;
                        }
                        iw[] iwVarArr = this.a1;
                        if (i12 < iwVarArr.length && (iwVar = iwVarArr[i12]) != null && iwVar.g0 != 8) {
                            iw iwVar6 = this.Y0[i10];
                            iw iwVar7 = this.X0[i11];
                            if (iwVar != iwVar6) {
                                iwVar.f(iwVar.I, iwVar6.I, 0);
                                iwVar.f(iwVar.K, iwVar6.K, 0);
                            }
                            if (iwVar != iwVar7) {
                                iwVar.f(iwVar.J, iwVar7.J, 0);
                                iwVar.f(iwVar.L, iwVar7.L, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            ((qb0) arrayList.get(0)).b(0, z2, true);
        }
        this.y0 = false;
    }
}
