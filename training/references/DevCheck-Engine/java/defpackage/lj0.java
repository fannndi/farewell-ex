package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class lj0 extends o92 {
    public static final int[] k = new int[2];

    public static void m(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x0243, code lost:
    
        if (r5 != 1) goto L125;
     */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02aa  */
    @Override // defpackage.w20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.w20 r24) {
        /*
            Method dump skipped, instructions count: 901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj0.a(w20):void");
    }

    @Override // defpackage.o92
    public final void d() {
        iw iwVar;
        iw iwVar2;
        int i;
        iw iwVar3;
        iw iwVar4;
        int i2;
        iw iwVar5 = this.b;
        boolean z = iwVar5.f452a;
        q40 q40Var = this.e;
        if (z) {
            q40Var.d(iwVar5.q());
        }
        boolean z2 = q40Var.j;
        ArrayList arrayList = q40Var.k;
        ArrayList arrayList2 = q40Var.l;
        c30 c30Var = this.i;
        c30 c30Var2 = this.h;
        if (!z2) {
            iw iwVar6 = this.b;
            int i3 = iwVar6.p0[0];
            this.d = i3;
            if (i3 != 3) {
                if (i3 == 4 && (iwVar4 = iwVar6.T) != null && ((i2 = iwVar4.p0[0]) == 1 || i2 == 4)) {
                    int q = (iwVar4.q() - this.b.I.e()) - this.b.K.e();
                    o92.b(c30Var2, iwVar4.d.h, this.b.I.e());
                    o92.b(c30Var, iwVar4.d.i, -this.b.K.e());
                    q40Var.d(q);
                    return;
                }
                if (i3 == 1) {
                    q40Var.d(iwVar6.q());
                }
            }
        } else if (this.d == 4 && (iwVar2 = (iwVar = this.b).T) != null && ((i = iwVar2.p0[0]) == 1 || i == 4)) {
            o92.b(c30Var2, iwVar2.d.h, iwVar.I.e());
            o92.b(c30Var, iwVar2.d.i, -this.b.K.e());
            return;
        }
        if (q40Var.j) {
            iw iwVar7 = this.b;
            if (iwVar7.f452a) {
                ev[] evVarArr = iwVar7.Q;
                ev evVar = evVarArr[0];
                ev evVar2 = evVar.f;
                if (evVar2 != null && evVarArr[1].f != null) {
                    boolean x = iwVar7.x();
                    iw iwVar8 = this.b;
                    if (x) {
                        c30Var2.f = iwVar8.Q[0].e();
                        c30Var.f = -this.b.Q[1].e();
                        return;
                    }
                    c30 h = o92.h(iwVar8.Q[0]);
                    if (h != null) {
                        o92.b(c30Var2, h, this.b.Q[0].e());
                    }
                    c30 h2 = o92.h(this.b.Q[1]);
                    if (h2 != null) {
                        o92.b(c30Var, h2, -this.b.Q[1].e());
                    }
                    c30Var2.b = true;
                    c30Var.b = true;
                    return;
                }
                if (evVar2 != null) {
                    c30 h3 = o92.h(evVar);
                    if (h3 != null) {
                        o92.b(c30Var2, h3, this.b.Q[0].e());
                        o92.b(c30Var, c30Var2, q40Var.g);
                        return;
                    }
                    return;
                }
                ev evVar3 = evVarArr[1];
                if (evVar3.f != null) {
                    c30 h4 = o92.h(evVar3);
                    if (h4 != null) {
                        o92.b(c30Var, h4, -this.b.Q[1].e());
                        o92.b(c30Var2, c30Var, -q40Var.g);
                        return;
                    }
                    return;
                }
                if ((iwVar7 instanceof zi0) || iwVar7.T == null || iwVar7.i(7).f != null) {
                    return;
                }
                iw iwVar9 = this.b;
                o92.b(c30Var2, iwVar9.T.d.h, iwVar9.r());
                o92.b(c30Var, c30Var2, q40Var.g);
                return;
            }
        }
        if (this.d == 3) {
            iw iwVar10 = this.b;
            int i4 = iwVar10.r;
            if (i4 == 2) {
                iw iwVar11 = iwVar10.T;
                if (iwVar11 != null) {
                    q40 q40Var2 = iwVar11.e.e;
                    arrayList2.add(q40Var2);
                    q40Var2.k.add(q40Var);
                    q40Var.b = true;
                    arrayList.add(c30Var2);
                    arrayList.add(c30Var);
                }
            } else if (i4 == 3) {
                if (iwVar10.s == 3) {
                    c30Var2.f106a = this;
                    c30Var.f106a = this;
                    h62 h62Var = iwVar10.e;
                    h62Var.h.f106a = this;
                    h62Var.i.f106a = this;
                    q40Var.f106a = this;
                    if (iwVar10.y()) {
                        arrayList2.add(this.b.e.e);
                        this.b.e.e.k.add(q40Var);
                        h62 h62Var2 = this.b.e;
                        h62Var2.e.f106a = this;
                        arrayList2.add(h62Var2.h);
                        arrayList2.add(this.b.e.i);
                        this.b.e.h.k.add(q40Var);
                        this.b.e.i.k.add(q40Var);
                    } else {
                        boolean x2 = this.b.x();
                        iw iwVar12 = this.b;
                        if (x2) {
                            iwVar12.e.e.l.add(q40Var);
                            arrayList.add(this.b.e.e);
                        } else {
                            iwVar12.e.e.l.add(q40Var);
                        }
                    }
                } else {
                    q40 q40Var3 = iwVar10.e.e;
                    arrayList2.add(q40Var3);
                    q40Var3.k.add(q40Var);
                    this.b.e.h.k.add(q40Var);
                    this.b.e.i.k.add(q40Var);
                    q40Var.b = true;
                    arrayList.add(c30Var2);
                    arrayList.add(c30Var);
                    c30Var2.l.add(q40Var);
                    c30Var.l.add(q40Var);
                }
            }
        }
        iw iwVar13 = this.b;
        ev[] evVarArr2 = iwVar13.Q;
        ev evVar4 = evVarArr2[0];
        ev evVar5 = evVar4.f;
        if (evVar5 != null && evVarArr2[1].f != null) {
            boolean x3 = iwVar13.x();
            iw iwVar14 = this.b;
            if (x3) {
                c30Var2.f = iwVar14.Q[0].e();
                c30Var.f = -this.b.Q[1].e();
                return;
            }
            c30 h5 = o92.h(iwVar14.Q[0]);
            c30 h6 = o92.h(this.b.Q[1]);
            if (h5 != null) {
                h5.b(this);
            }
            if (h6 != null) {
                h6.b(this);
            }
            this.j = 4;
            return;
        }
        if (evVar5 != null) {
            c30 h7 = o92.h(evVar4);
            if (h7 != null) {
                o92.b(c30Var2, h7, this.b.Q[0].e());
                c(c30Var, c30Var2, 1, q40Var);
                return;
            }
            return;
        }
        ev evVar6 = evVarArr2[1];
        if (evVar6.f != null) {
            c30 h8 = o92.h(evVar6);
            if (h8 != null) {
                o92.b(c30Var, h8, -this.b.Q[1].e());
                c(c30Var2, c30Var, -1, q40Var);
                return;
            }
            return;
        }
        if ((iwVar13 instanceof zi0) || (iwVar3 = iwVar13.T) == null) {
            return;
        }
        o92.b(c30Var2, iwVar3.d.h, iwVar13.r());
        c(c30Var, c30Var2, 1, q40Var);
    }

    @Override // defpackage.o92
    public final void e() {
        c30 c30Var = this.h;
        if (c30Var.j) {
            this.b.Y = c30Var.g;
        }
    }

    @Override // defpackage.o92
    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    @Override // defpackage.o92
    public final boolean k() {
        return this.d != 3 || this.b.r == 0;
    }

    public final void n() {
        this.g = false;
        c30 c30Var = this.h;
        c30Var.c();
        c30Var.j = false;
        c30 c30Var2 = this.i;
        c30Var2.c();
        c30Var2.j = false;
        this.e.j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.b.h0;
    }
}
