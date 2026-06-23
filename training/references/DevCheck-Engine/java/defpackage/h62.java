package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class h62 extends o92 {
    public c30 k;
    public se l;

    @Override // defpackage.w20
    public final void a(w20 w20Var) {
        float f;
        float f2;
        float f3;
        int i;
        if (d51.A(this.j) == 3) {
            iw iwVar = this.b;
            l(iwVar.J, iwVar.L, 1);
            return;
        }
        q40 q40Var = this.e;
        if (q40Var.c && !q40Var.j && this.d == 3) {
            iw iwVar2 = this.b;
            int i2 = iwVar2.s;
            if (i2 == 2) {
                iw iwVar3 = iwVar2.T;
                if (iwVar3 != null) {
                    if (iwVar3.e.e.j) {
                        q40Var.d((int) ((r5.g * iwVar2.z) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                q40 q40Var2 = iwVar2.d.e;
                if (q40Var2.j) {
                    int i3 = iwVar2.X;
                    if (i3 == -1) {
                        f = q40Var2.g;
                        f2 = iwVar2.W;
                    } else if (i3 == 0) {
                        f3 = q40Var2.g * iwVar2.W;
                        i = (int) (f3 + 0.5f);
                        q40Var.d(i);
                    } else if (i3 != 1) {
                        i = 0;
                        q40Var.d(i);
                    } else {
                        f = q40Var2.g;
                        f2 = iwVar2.W;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    q40Var.d(i);
                }
            }
        }
        c30 c30Var = this.h;
        boolean z = c30Var.c;
        ArrayList arrayList = c30Var.l;
        if (z) {
            c30 c30Var2 = this.i;
            boolean z2 = c30Var2.c;
            ArrayList arrayList2 = c30Var2.l;
            if (z2) {
                if (c30Var.j && c30Var2.j && q40Var.j) {
                    return;
                }
                if (!q40Var.j && this.d == 3) {
                    iw iwVar4 = this.b;
                    if (iwVar4.r == 0 && !iwVar4.y()) {
                        c30 c30Var3 = (c30) arrayList.get(0);
                        c30 c30Var4 = (c30) arrayList2.get(0);
                        int i4 = c30Var3.g + c30Var.f;
                        int i5 = c30Var4.g + c30Var2.f;
                        c30Var.d(i4);
                        c30Var2.d(i5);
                        q40Var.d(i5 - i4);
                        return;
                    }
                }
                if (!q40Var.j && this.d == 3 && this.f721a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    c30 c30Var5 = (c30) arrayList.get(0);
                    int i6 = (((c30) arrayList2.get(0)).g + c30Var2.f) - (c30Var5.g + c30Var.f);
                    int i7 = q40Var.m;
                    if (i6 < i7) {
                        q40Var.d(i6);
                    } else {
                        q40Var.d(i7);
                    }
                }
                if (q40Var.j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    c30 c30Var6 = (c30) arrayList.get(0);
                    c30 c30Var7 = (c30) arrayList2.get(0);
                    int i8 = c30Var6.g;
                    int i9 = c30Var.f + i8;
                    int i10 = c30Var7.g;
                    int i11 = c30Var2.f + i10;
                    float f4 = this.b.e0;
                    if (c30Var6 == c30Var7) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c30Var.d((int) ((((i10 - i8) - q40Var.g) * f4) + i8 + 0.5f));
                    c30Var2.d(c30Var.g + q40Var.g);
                }
            }
        }
    }

    @Override // defpackage.o92
    public final void d() {
        iw iwVar;
        iw iwVar2;
        iw iwVar3;
        iw iwVar4;
        c30 c30Var = this.k;
        iw iwVar5 = this.b;
        boolean z = iwVar5.f452a;
        q40 q40Var = this.e;
        if (z) {
            q40Var.d(iwVar5.k());
        }
        boolean z2 = q40Var.j;
        ArrayList arrayList = q40Var.k;
        ArrayList arrayList2 = q40Var.l;
        c30 c30Var2 = this.i;
        c30 c30Var3 = this.h;
        if (!z2) {
            iw iwVar6 = this.b;
            this.d = iwVar6.p0[1];
            if (iwVar6.E) {
                this.l = new se(this);
            }
            int i = this.d;
            if (i != 3) {
                if (i == 4 && (iwVar4 = this.b.T) != null && iwVar4.p0[1] == 1) {
                    int k = (iwVar4.k() - this.b.J.e()) - this.b.L.e();
                    o92.b(c30Var3, iwVar4.e.h, this.b.J.e());
                    o92.b(c30Var2, iwVar4.e.i, -this.b.L.e());
                    q40Var.d(k);
                    return;
                }
                if (i == 1) {
                    q40Var.d(this.b.k());
                }
            }
        } else if (this.d == 4 && (iwVar2 = (iwVar = this.b).T) != null && iwVar2.p0[1] == 1) {
            o92.b(c30Var3, iwVar2.e.h, iwVar.J.e());
            o92.b(c30Var2, iwVar2.e.i, -this.b.L.e());
            return;
        }
        boolean z3 = q40Var.j;
        if (z3) {
            iw iwVar7 = this.b;
            if (iwVar7.f452a) {
                ev[] evVarArr = iwVar7.Q;
                ev evVar = evVarArr[2];
                ev evVar2 = evVar.f;
                if (evVar2 != null && evVarArr[3].f != null) {
                    boolean y = iwVar7.y();
                    iw iwVar8 = this.b;
                    if (y) {
                        c30Var3.f = iwVar8.Q[2].e();
                        c30Var2.f = -this.b.Q[3].e();
                    } else {
                        c30 h = o92.h(iwVar8.Q[2]);
                        if (h != null) {
                            o92.b(c30Var3, h, this.b.Q[2].e());
                        }
                        c30 h2 = o92.h(this.b.Q[3]);
                        if (h2 != null) {
                            o92.b(c30Var2, h2, -this.b.Q[3].e());
                        }
                        c30Var3.b = true;
                        c30Var2.b = true;
                    }
                    iw iwVar9 = this.b;
                    if (iwVar9.E) {
                        o92.b(c30Var, c30Var3, iwVar9.a0);
                        return;
                    }
                    return;
                }
                if (evVar2 != null) {
                    c30 h3 = o92.h(evVar);
                    if (h3 != null) {
                        o92.b(c30Var3, h3, this.b.Q[2].e());
                        o92.b(c30Var2, c30Var3, q40Var.g);
                        iw iwVar10 = this.b;
                        if (iwVar10.E) {
                            o92.b(c30Var, c30Var3, iwVar10.a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                ev evVar3 = evVarArr[3];
                if (evVar3.f != null) {
                    c30 h4 = o92.h(evVar3);
                    if (h4 != null) {
                        o92.b(c30Var2, h4, -this.b.Q[3].e());
                        o92.b(c30Var3, c30Var2, -q40Var.g);
                    }
                    iw iwVar11 = this.b;
                    if (iwVar11.E) {
                        o92.b(c30Var, c30Var3, iwVar11.a0);
                        return;
                    }
                    return;
                }
                ev evVar4 = evVarArr[4];
                if (evVar4.f != null) {
                    c30 h5 = o92.h(evVar4);
                    if (h5 != null) {
                        o92.b(c30Var, h5, 0);
                        o92.b(c30Var3, c30Var, -this.b.a0);
                        o92.b(c30Var2, c30Var3, q40Var.g);
                        return;
                    }
                    return;
                }
                if ((iwVar7 instanceof zi0) || iwVar7.T == null || iwVar7.i(7).f != null) {
                    return;
                }
                iw iwVar12 = this.b;
                o92.b(c30Var3, iwVar12.T.e.h, iwVar12.s());
                o92.b(c30Var2, c30Var3, q40Var.g);
                iw iwVar13 = this.b;
                if (iwVar13.E) {
                    o92.b(c30Var, c30Var3, iwVar13.a0);
                    return;
                }
                return;
            }
        }
        if (z3 || this.d != 3) {
            q40Var.b(this);
        } else {
            iw iwVar14 = this.b;
            int i2 = iwVar14.s;
            if (i2 == 2) {
                iw iwVar15 = iwVar14.T;
                if (iwVar15 != null) {
                    q40 q40Var2 = iwVar15.e.e;
                    arrayList2.add(q40Var2);
                    q40Var2.k.add(q40Var);
                    q40Var.b = true;
                    arrayList.add(c30Var3);
                    arrayList.add(c30Var2);
                }
            } else if (i2 == 3 && !iwVar14.y()) {
                iw iwVar16 = this.b;
                if (iwVar16.r != 3) {
                    q40 q40Var3 = iwVar16.d.e;
                    arrayList2.add(q40Var3);
                    q40Var3.k.add(q40Var);
                    q40Var.b = true;
                    arrayList.add(c30Var3);
                    arrayList.add(c30Var2);
                }
            }
        }
        iw iwVar17 = this.b;
        ev[] evVarArr2 = iwVar17.Q;
        ev evVar5 = evVarArr2[2];
        ev evVar6 = evVar5.f;
        if (evVar6 != null && evVarArr2[3].f != null) {
            boolean y2 = iwVar17.y();
            iw iwVar18 = this.b;
            if (y2) {
                c30Var3.f = iwVar18.Q[2].e();
                c30Var2.f = -this.b.Q[3].e();
            } else {
                c30 h6 = o92.h(iwVar18.Q[2]);
                c30 h7 = o92.h(this.b.Q[3]);
                if (h6 != null) {
                    h6.b(this);
                }
                if (h7 != null) {
                    h7.b(this);
                }
                this.j = 4;
            }
            if (this.b.E) {
                c(c30Var, c30Var3, 1, this.l);
            }
        } else if (evVar6 != null) {
            c30 h8 = o92.h(evVar5);
            if (h8 != null) {
                o92.b(c30Var3, h8, this.b.Q[2].e());
                c(c30Var2, c30Var3, 1, q40Var);
                if (this.b.E) {
                    c(c30Var, c30Var3, 1, this.l);
                }
                if (this.d == 3) {
                    iw iwVar19 = this.b;
                    if (iwVar19.W > 0.0f) {
                        lj0 lj0Var = iwVar19.d;
                        if (lj0Var.d == 3) {
                            lj0Var.e.k.add(q40Var);
                            arrayList2.add(this.b.d.e);
                            q40Var.f106a = this;
                        }
                    }
                }
            }
        } else {
            ev evVar7 = evVarArr2[3];
            if (evVar7.f != null) {
                c30 h9 = o92.h(evVar7);
                if (h9 != null) {
                    o92.b(c30Var2, h9, -this.b.Q[3].e());
                    c(c30Var3, c30Var2, -1, q40Var);
                    if (this.b.E) {
                        c(c30Var, c30Var3, 1, this.l);
                    }
                }
            } else {
                ev evVar8 = evVarArr2[4];
                if (evVar8.f != null) {
                    c30 h10 = o92.h(evVar8);
                    if (h10 != null) {
                        o92.b(c30Var, h10, 0);
                        c(c30Var3, c30Var, -1, this.l);
                        c(c30Var2, c30Var3, 1, q40Var);
                    }
                } else if (!(iwVar17 instanceof zi0) && (iwVar3 = iwVar17.T) != null) {
                    o92.b(c30Var3, iwVar3.e.h, iwVar17.s());
                    c(c30Var2, c30Var3, 1, q40Var);
                    if (this.b.E) {
                        c(c30Var, c30Var3, 1, this.l);
                    }
                    if (this.d == 3) {
                        iw iwVar20 = this.b;
                        if (iwVar20.W > 0.0f) {
                            lj0 lj0Var2 = iwVar20.d;
                            if (lj0Var2.d == 3) {
                                lj0Var2.e.k.add(q40Var);
                                arrayList2.add(this.b.d.e);
                                q40Var.f106a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            q40Var.c = true;
        }
    }

    @Override // defpackage.o92
    public final void e() {
        c30 c30Var = this.h;
        if (c30Var.j) {
            this.b.Z = c30Var.g;
        }
    }

    @Override // defpackage.o92
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.o92
    public final boolean k() {
        return this.d != 3 || this.b.s == 0;
    }

    public final void m() {
        this.g = false;
        c30 c30Var = this.h;
        c30Var.c();
        c30Var.j = false;
        c30 c30Var2 = this.i;
        c30Var2.c();
        c30Var2.j = false;
        c30 c30Var3 = this.k;
        c30Var3.c();
        c30Var3.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.b.h0;
    }
}
