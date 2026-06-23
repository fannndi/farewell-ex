package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class sd1 implements p40 {
    public final /* synthetic */ RecyclerView g;

    public /* synthetic */ sd1(RecyclerView recyclerView) {
        this.g = recyclerView;
    }

    public void a(v2 v2Var) {
        int i = v2Var.f1066a;
        RecyclerView recyclerView = this.g;
        if (i == 1) {
            recyclerView.t.Y(v2Var.b, v2Var.d);
            return;
        }
        if (i == 2) {
            recyclerView.t.b0(v2Var.b, v2Var.d);
        } else if (i == 4) {
            recyclerView.t.c0(v2Var.b, v2Var.d);
        } else {
            if (i != 8) {
                return;
            }
            recyclerView.t.a0(v2Var.b, v2Var.d);
        }
    }

    public te1 b(int i) {
        RecyclerView recyclerView = this.g;
        int i2 = recyclerView.l.i();
        int i3 = 0;
        te1 te1Var = null;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            te1 N = RecyclerView.N(recyclerView.l.h(i3));
            if (N != null && !N.i() && N.i == i) {
                if (!((ArrayList) recyclerView.l.e).contains(N.g)) {
                    te1Var = N;
                    break;
                }
                te1Var = N;
            }
            i3++;
        }
        if (te1Var == null) {
            return null;
        }
        if (!((ArrayList) recyclerView.l.e).contains(te1Var.g)) {
            return te1Var;
        }
        boolean z = RecyclerView.I0;
        return null;
    }

    public void c(int i, int i2, Object obj) {
        int i3;
        int i4;
        RecyclerView recyclerView = this.g;
        int i5 = recyclerView.l.i();
        int i6 = i2 + i;
        for (int i7 = 0; i7 < i5; i7++) {
            View h = recyclerView.l.h(i7);
            te1 N = RecyclerView.N(h);
            if (N != null && !N.p() && (i4 = N.i) >= i && i4 < i6) {
                N.a(2);
                if (obj == null) {
                    N.a(rt0.v);
                } else if ((1024 & N.p) == 0) {
                    if (N.q == null) {
                        ArrayList arrayList = new ArrayList();
                        N.q = arrayList;
                        N.r = Collections.unmodifiableList(arrayList);
                    }
                    N.q.add(obj);
                }
                ((ee1) h.getLayoutParams()).c = true;
            }
        }
        ke1 ke1Var = recyclerView.i;
        ArrayList arrayList2 = ke1Var.c;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            te1 te1Var = (te1) arrayList2.get(size);
            if (te1Var != null && (i3 = te1Var.i) >= i && i3 < i6) {
                te1Var.a(2);
                ke1Var.h(size);
            }
        }
        recyclerView.r0 = true;
    }

    public void d(int i, int i2) {
        RecyclerView recyclerView = this.g;
        int i3 = recyclerView.l.i();
        for (int i4 = 0; i4 < i3; i4++) {
            te1 N = RecyclerView.N(recyclerView.l.h(i4));
            if (N != null && !N.p() && N.i >= i) {
                if (RecyclerView.J0) {
                    N.toString();
                }
                N.m(i2, false);
                recyclerView.n0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.i.c;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            te1 te1Var = (te1) arrayList.get(i5);
            if (te1Var != null && te1Var.i >= i) {
                if (RecyclerView.J0) {
                    te1Var.toString();
                }
                te1Var.m(i2, false);
            }
        }
        recyclerView.requestLayout();
        recyclerView.q0 = true;
    }

    public void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        RecyclerView recyclerView = this.g;
        int i10 = recyclerView.l.i();
        int i11 = -1;
        if (i < i2) {
            i4 = i;
            i3 = i2;
            i5 = -1;
        } else {
            i3 = i;
            i4 = i2;
            i5 = 1;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            te1 N = RecyclerView.N(recyclerView.l.h(i12));
            if (N != null && (i9 = N.i) >= i4 && i9 <= i3) {
                if (RecyclerView.J0) {
                    N.toString();
                }
                if (N.i == i) {
                    N.m(i2 - i, false);
                } else {
                    N.m(i5, false);
                }
                recyclerView.n0.f = true;
            }
        }
        ArrayList arrayList = recyclerView.i.c;
        if (i < i2) {
            i7 = i;
            i6 = i2;
        } else {
            i6 = i;
            i7 = i2;
            i11 = 1;
        }
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            te1 te1Var = (te1) arrayList.get(i13);
            if (te1Var != null && (i8 = te1Var.i) >= i7 && i8 <= i6) {
                if (i8 == i) {
                    te1Var.m(i2 - i, false);
                } else {
                    te1Var.m(i11, false);
                }
                if (RecyclerView.J0) {
                    te1Var.toString();
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.q0 = true;
    }

    @Override // defpackage.p40
    public boolean f(float f) {
        int i;
        int i2;
        RecyclerView recyclerView = this.g;
        if (recyclerView.t.e()) {
            i2 = (int) f;
            i = 0;
        } else if (recyclerView.t.d()) {
            i = (int) f;
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        if (i == 0 && i2 == 0) {
            return false;
        }
        recyclerView.q0();
        return recyclerView.J(i, i2, 0, Integer.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(defpackage.te1 r8, defpackage.sh r9, defpackage.sh r10) {
        /*
            r7 = this;
            r0 = 0
            r8.o(r0)
            androidx.recyclerview.widget.RecyclerView r7 = r7.g
            zd1 r0 = r7.S
            r1 = r0
            x10 r1 = (defpackage.x10) r1
            if (r9 == 0) goto L1d
            r1.getClass()
            int r3 = r9.f936a
            int r5 = r10.f936a
            if (r3 != r5) goto L1f
            int r0 = r9.b
            int r2 = r10.b
            if (r0 == r2) goto L1d
            goto L1f
        L1d:
            r2 = r8
            goto L29
        L1f:
            int r4 = r9.b
            int r6 = r10.b
            r2 = r8
            boolean r8 = r1.g(r2, r3, r4, r5, r6)
            goto L38
        L29:
            r1.l(r2)
            android.view.View r8 = r2.g
            r9 = 0
            r8.setAlpha(r9)
            java.util.ArrayList r8 = r1.i
            r8.add(r2)
            r8 = 1
        L38:
            if (r8 == 0) goto L3d
            r7.Y()
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd1.g(te1, sh, sh):void");
    }

    @Override // defpackage.p40
    public float h() {
        float f;
        RecyclerView recyclerView = this.g;
        if (recyclerView.t.e()) {
            f = recyclerView.i0;
        } else {
            if (!recyclerView.t.d()) {
                return 0.0f;
            }
            f = recyclerView.h0;
        }
        return -f;
    }

    @Override // defpackage.p40
    public void i() {
        this.g.q0();
    }

    public void j(te1 te1Var, sh shVar, sh shVar2) {
        boolean z;
        RecyclerView recyclerView = this.g;
        recyclerView.i.m(te1Var);
        recyclerView.h(te1Var);
        te1Var.o(false);
        x10 x10Var = (x10) recyclerView.S;
        x10Var.getClass();
        int i = shVar.f936a;
        int i2 = shVar.b;
        View view = te1Var.g;
        int left = shVar2 == null ? view.getLeft() : shVar2.f936a;
        int top = shVar2 == null ? view.getTop() : shVar2.b;
        if (te1Var.i() || (i == left && i2 == top)) {
            x10Var.l(te1Var);
            x10Var.h.add(te1Var);
            z = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            z = x10Var.g(te1Var, i, i2, left, top);
        }
        if (z) {
            recyclerView.Y();
        }
    }

    public void k(int i) {
        RecyclerView recyclerView = this.g;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }
}
