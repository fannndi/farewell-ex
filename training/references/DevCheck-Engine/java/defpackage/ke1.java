package defpackage;

import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class ke1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f531a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public je1 g;
    public final /* synthetic */ RecyclerView h;

    public ke1(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f531a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = Collections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(te1 te1Var, boolean z) {
        RecyclerView.l(te1Var);
        View view = te1Var.g;
        RecyclerView recyclerView = this.h;
        ve1 ve1Var = recyclerView.u0;
        if (ve1Var != null) {
            o0 j = ve1Var.j();
            y62.o(view, j instanceof ue1 ? (o0) ((ue1) j).e.remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.u;
            if (arrayList.size() > 0) {
                throw iy1.e(arrayList, 0);
            }
            td1 td1Var = recyclerView.s;
            if (td1Var != null) {
                td1Var.s(te1Var);
            }
            if (recyclerView.n0 != null) {
                recyclerView.m.m(te1Var);
            }
            if (RecyclerView.J0) {
                Objects.toString(te1Var);
            }
        }
        te1Var.y = null;
        te1Var.x = null;
        je1 c = c();
        c.getClass();
        int i = te1Var.l;
        ArrayList arrayList2 = c.b(i).f425a;
        if (((ie1) c.f478a.get(i)).b <= arrayList2.size()) {
            bw0.c(view);
        } else if (RecyclerView.I0 && arrayList2.contains(te1Var)) {
            c.m("this scrap item already exists");
        } else {
            te1Var.n();
            arrayList2.add(te1Var);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        pe1 pe1Var = recyclerView.n0;
        if (i >= 0 && i < pe1Var.b()) {
            return !pe1Var.g ? i : recyclerView.k.g(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + pe1Var.b() + recyclerView.C());
    }

    public final je1 c() {
        if (this.g == null) {
            je1 je1Var = new je1();
            je1Var.f478a = new SparseArray();
            je1Var.b = 0;
            je1Var.c = Collections.newSetFromMap(new IdentityHashMap());
            this.g = je1Var;
            e();
        }
        return this.g;
    }

    public final View d(int i) {
        return l(i, Long.MAX_VALUE).g;
    }

    public final void e() {
        RecyclerView recyclerView;
        td1 td1Var;
        je1 je1Var = this.g;
        if (je1Var == null || (td1Var = (recyclerView = this.h).s) == null || !recyclerView.y) {
            return;
        }
        je1Var.c.add(td1Var);
    }

    public final void f(td1 td1Var, boolean z) {
        je1 je1Var = this.g;
        if (je1Var != null) {
            SparseArray sparseArray = je1Var.f478a;
            Set set = je1Var.c;
            set.remove(td1Var);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((ie1) sparseArray.get(sparseArray.keyAt(i))).f425a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    bw0.c(((te1) arrayList.get(i2)).g);
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        if (RecyclerView.N0) {
            gd gdVar = this.h.m0;
            int[] iArr = (int[]) gdVar.d;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            gdVar.c = 0;
        }
    }

    public final void h(int i) {
        boolean z = RecyclerView.I0;
        ArrayList arrayList = this.c;
        te1 te1Var = (te1) arrayList.get(i);
        if (RecyclerView.J0) {
            Objects.toString(te1Var);
        }
        a(te1Var, true);
        arrayList.remove(i);
    }

    public final void i(View view) {
        te1 N = RecyclerView.N(view);
        boolean k = N.k();
        RecyclerView recyclerView = this.h;
        if (k) {
            recyclerView.removeDetachedView(view, false);
        }
        if (N.j()) {
            N.t.m(N);
        } else if (N.q()) {
            N.p &= -33;
        }
        j(N);
        if (recyclerView.S == null || N.h()) {
            return;
        }
        recyclerView.S.d(N);
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d0, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(defpackage.te1 r13) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke1.j(te1):void");
    }

    public final void k(View view) {
        zd1 zd1Var;
        te1 N = RecyclerView.N(view);
        int i = N.p & 12;
        RecyclerView recyclerView = this.h;
        if (i == 0 && N.l() && (zd1Var = recyclerView.S) != null) {
            x10 x10Var = (x10) zd1Var;
            if (N.d().isEmpty() && x10Var.g && !N.g()) {
                if (this.b == null) {
                    this.b = new ArrayList();
                }
                N.t = this;
                N.u = true;
                this.b.add(N);
                return;
            }
        }
        if (N.g() && !N.i() && !recyclerView.s.b) {
            c.m("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.C()));
            return;
        }
        N.t = this;
        N.u = false;
        this.f531a.add(N);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0556 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x024f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.te1 l(int r28, long r29) {
        /*
            Method dump skipped, instructions count: 1419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ke1.l(int, long):te1");
    }

    public final void m(te1 te1Var) {
        if (te1Var.u) {
            this.b.remove(te1Var);
        } else {
            this.f531a.remove(te1Var);
        }
        te1Var.t = null;
        te1Var.u = false;
        te1Var.p &= -33;
    }

    public final void n() {
        de1 de1Var = this.h.t;
        this.f = this.e + (de1Var != null ? de1Var.j : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            h(size);
        }
    }
}
