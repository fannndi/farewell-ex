package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import flar2.devcheck.systemGraphs.SystemGraphsActivity;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class ju1 extends td1 {
    public final gq0 d;
    public final ae0 e;
    public final ft0 f;
    public final ft0 g;
    public final ft0 h;
    public ie0 i;
    public final h70 j;
    public boolean k;
    public boolean l;
    public final ArrayList m;

    public ju1(SystemGraphsActivity systemGraphsActivity, ArrayList arrayList) {
        ae0 s = systemGraphsActivity.s();
        gq0 gq0Var = systemGraphsActivity.j;
        this.f = new ft0();
        this.g = new ft0();
        this.h = new ft0();
        h70 h70Var = new h70();
        h70Var.g = new CopyOnWriteArrayList();
        this.j = h70Var;
        this.k = false;
        this.l = false;
        this.e = s;
        this.d = gq0Var;
        u(true);
        this.m = arrayList;
    }

    public static void v(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            c.n("Design assumption violated.");
            return;
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public final void A(long j) {
        Bundle o;
        ViewParent parent;
        ft0 ft0Var = this.f;
        ld0 ld0Var = (ld0) ft0Var.b(j);
        if (ld0Var == null) {
            return;
        }
        View view = ld0Var.M;
        if (view != null && (parent = view.getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean w = w(j);
        ft0 ft0Var2 = this.g;
        if (!w) {
            ft0Var2.f(j);
        }
        if (!ld0Var.G()) {
            ft0Var.f(j);
            return;
        }
        ae0 ae0Var = this.e;
        if (ae0Var.M()) {
            this.l = true;
            return;
        }
        boolean G = ld0Var.G();
        h70 h70Var = this.j;
        if (G && w(j)) {
            h70Var.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = ((CopyOnWriteArrayList) h70Var.g).iterator();
            if (it.hasNext()) {
                throw d51.l(it);
            }
            je0 je0Var = (je0) ((HashMap) ae0Var.c.h).get(ld0Var.l);
            kd0 kd0Var = null;
            if (je0Var != null) {
                ld0 ld0Var2 = je0Var.c;
                ld0Var2.getClass();
                if (ld0Var2 == ld0Var) {
                    if (ld0Var2.g > -1 && (o = je0Var.o()) != null) {
                        kd0Var = new kd0(o);
                    }
                    h70.m(arrayList);
                    ft0Var2.e(j, kd0Var);
                }
            }
            ae0Var.c0(new IllegalStateException(d51.r("Fragment ", ld0Var, " is not currently in the FragmentManager")));
            throw null;
        }
        h70Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = ((CopyOnWriteArrayList) h70Var.g).iterator();
        if (it2.hasNext()) {
            throw d51.l(it2);
        }
        try {
            yb ybVar = new yb(ae0Var);
            ybVar.j(ld0Var);
            ybVar.f();
            ft0Var.f(j);
        } finally {
            h70.m(arrayList2);
        }
    }

    @Override // defpackage.td1
    public final int c() {
        return this.m.size();
    }

    @Override // defpackage.td1
    public final long d(int i) {
        return i;
    }

    @Override // defpackage.td1
    public final void k(RecyclerView recyclerView) {
        if (this.i != null) {
            throw new IllegalArgumentException();
        }
        ie0 ie0Var = new ie0(this);
        this.i = ie0Var;
        ViewPager2 a2 = ie0.a(recyclerView);
        ie0Var.d = a2;
        cu cuVar = new cu(ie0Var);
        ie0Var.f424a = cuVar;
        ((ArrayList) a2.i.b).add(cuVar);
        he0 he0Var = new he0(0, ie0Var);
        ie0Var.b = he0Var;
        t(he0Var);
        pd1 pd1Var = new pd1(3, ie0Var);
        ie0Var.c = pd1Var;
        this.d.a(pd1Var);
    }

    @Override // defpackage.td1
    public final void l(te1 te1Var, int i) {
        Bundle bundle;
        ne0 ne0Var = (ne0) te1Var;
        long j = ne0Var.k;
        FrameLayout frameLayout = (FrameLayout) ne0Var.g;
        int id = frameLayout.getId();
        Long y = y(id);
        ft0 ft0Var = this.h;
        if (y != null && y.longValue() != j) {
            A(y.longValue());
            ft0Var.f(y.longValue());
        }
        ft0Var.e(j, Integer.valueOf(id));
        long j2 = i;
        ft0 ft0Var2 = this.f;
        if (ft0Var2.c(j2) < 0) {
            ld0 ld0Var = (ld0) ((iu1) this.m.get(i)).b.get();
            kd0 kd0Var = (kd0) this.g.b(j2);
            if (ld0Var.y != null) {
                c.n("Fragment already added");
                return;
            }
            if (kd0Var == null || (bundle = kd0Var.g) == null) {
                bundle = null;
            }
            ld0Var.h = bundle;
            ft0Var2.e(j2, ld0Var);
        }
        WeakHashMap weakHashMap = y62.f1215a;
        if (frameLayout.isAttachedToWindow()) {
            z(ne0Var);
        }
        x();
    }

    @Override // defpackage.td1
    public final te1 n(ViewGroup viewGroup, int i) {
        int i2 = ne0.A;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap weakHashMap = y62.f1215a;
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new ne0(frameLayout);
    }

    @Override // defpackage.td1
    public final void o(RecyclerView recyclerView) {
        ie0 ie0Var = this.i;
        ie0Var.getClass();
        ViewPager2 a2 = ie0.a(recyclerView);
        ((ArrayList) a2.i.b).remove(ie0Var.f424a);
        ju1 ju1Var = ie0Var.f;
        ju1Var.f983a.unregisterObserver(ie0Var.b);
        ju1Var.d.f(ie0Var.c);
        ie0Var.d = null;
        this.i = null;
    }

    @Override // defpackage.td1
    public final /* bridge */ /* synthetic */ boolean p(te1 te1Var) {
        return true;
    }

    @Override // defpackage.td1
    public final void q(te1 te1Var) {
        z((ne0) te1Var);
        x();
    }

    @Override // defpackage.td1
    public final void s(te1 te1Var) {
        Long y = y(((FrameLayout) ((ne0) te1Var).g).getId());
        if (y != null) {
            A(y.longValue());
            this.h.f(y.longValue());
        }
    }

    public final boolean w(long j) {
        return j >= 0 && j < ((long) this.m.size());
    }

    public final void x() {
        ft0 ft0Var;
        ft0 ft0Var2;
        ld0 ld0Var;
        View view;
        if (!this.l || this.e.M()) {
            return;
        }
        r9 r9Var = new r9(0);
        int i = 0;
        while (true) {
            ft0Var = this.f;
            int g = ft0Var.g();
            ft0Var2 = this.h;
            if (i >= g) {
                break;
            }
            long d = ft0Var.d(i);
            if (!w(d)) {
                r9Var.add(Long.valueOf(d));
                ft0Var2.f(d);
            }
            i++;
        }
        if (!this.k) {
            this.l = false;
            for (int i2 = 0; i2 < ft0Var.g(); i2++) {
                long d2 = ft0Var.d(i2);
                if (ft0Var2.c(d2) < 0 && ((ld0Var = (ld0) ft0Var.b(d2)) == null || (view = ld0Var.M) == null || view.getParent() == null)) {
                    r9Var.add(Long.valueOf(d2));
                }
            }
        }
        l9 l9Var = new l9(r9Var);
        while (l9Var.hasNext()) {
            A(((Long) l9Var.next()).longValue());
        }
    }

    public final Long y(int i) {
        int i2 = 0;
        Long l = null;
        while (true) {
            ft0 ft0Var = this.h;
            if (i2 >= ft0Var.g()) {
                return l;
            }
            if (((Integer) ft0Var.h(i2)).intValue() == i) {
                if (l != null) {
                    c.n(XmJDY.srSSFAXuNYjtfu);
                    return null;
                }
                l = Long.valueOf(ft0Var.d(i2));
            }
            i2++;
        }
    }

    public final void z(ne0 ne0Var) {
        ld0 ld0Var = (ld0) this.f.b(ne0Var.k);
        if (ld0Var == null) {
            c.n("Design assumption violated.");
            return;
        }
        FrameLayout frameLayout = (FrameLayout) ne0Var.g;
        View view = ld0Var.M;
        if (!ld0Var.G() && view != null) {
            c.n("Design assumption violated.");
            return;
        }
        boolean G = ld0Var.G();
        ae0 ae0Var = this.e;
        if (G && view == null) {
            ((CopyOnWriteArrayList) ae0Var.l.h).add(new rd0(new kp(this, ld0Var, frameLayout)));
            return;
        }
        if (ld0Var.G() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                v(view, frameLayout);
                return;
            }
            return;
        }
        if (ld0Var.G()) {
            v(view, frameLayout);
            return;
        }
        if (ae0Var.M()) {
            if (ae0Var.G) {
                return;
            }
            this.d.a(new a20(this, ne0Var));
            return;
        }
        ((CopyOnWriteArrayList) ae0Var.l.h).add(new rd0(new kp(this, ld0Var, frameLayout)));
        h70 h70Var = this.j;
        h70Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((CopyOnWriteArrayList) h70Var.g).iterator();
        if (it.hasNext()) {
            throw d51.l(it);
        }
        try {
            ld0Var.o0(false);
            yb ybVar = new yb(ae0Var);
            ybVar.g(0, ld0Var, "f" + ne0Var.k, 1);
            ybVar.l(ld0Var, yp0.j);
            ybVar.f();
            this.i.b(false);
        } finally {
            h70.m(arrayList);
        }
    }
}
