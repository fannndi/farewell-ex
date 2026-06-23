package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.emoji2.text.Fk.Iyrs;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import flar2.devcheck.R;
import flar2.devcheck.sensors.JCZI.nyGJ;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class je0 {

    /* renamed from: a, reason: collision with root package name */
    public final zf f477a;
    public final gr b;
    public final ld0 c;
    public boolean d = false;
    public int e = -1;

    public je0(zf zfVar, gr grVar, ClassLoader classLoader, vd0 vd0Var, ge0 ge0Var) {
        this.f477a = zfVar;
        this.b = grVar;
        ld0 a2 = vd0Var.a(ge0Var.g);
        Bundle bundle = ge0Var.p;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.m0(bundle);
        a2.l = ge0Var.h;
        a2.t = ge0Var.i;
        a2.v = true;
        a2.C = ge0Var.j;
        a2.D = ge0Var.k;
        a2.E = ge0Var.l;
        a2.H = ge0Var.m;
        a2.s = ge0Var.n;
        a2.G = ge0Var.o;
        a2.F = ge0Var.q;
        a2.U = yp0.values()[ge0Var.r];
        Bundle bundle2 = ge0Var.s;
        if (bundle2 != null) {
            a2.h = bundle2;
        } else {
            a2.h = new Bundle();
        }
        this.c = a2;
        if (ae0.H(2)) {
            Objects.toString(a2);
        }
    }

    public je0(zf zfVar, gr grVar, ld0 ld0Var) {
        this.f477a = zfVar;
        this.b = grVar;
        this.c = ld0Var;
    }

    public je0(zf zfVar, gr grVar, ld0 ld0Var, ge0 ge0Var) {
        this.f477a = zfVar;
        this.b = grVar;
        this.c = ld0Var;
        ld0Var.i = null;
        ld0Var.j = null;
        ld0Var.x = 0;
        ld0Var.u = false;
        ld0Var.r = false;
        ld0 ld0Var2 = ld0Var.n;
        ld0Var.o = ld0Var2 != null ? ld0Var2.l : null;
        ld0Var.n = null;
        Bundle bundle = ge0Var.s;
        if (bundle != null) {
            ld0Var.h = bundle;
        } else {
            ld0Var.h = new Bundle();
        }
    }

    public final void a() {
        boolean H = ae0.H(3);
        ld0 ld0Var = this.c;
        if (H) {
            Objects.toString(ld0Var);
        }
        Bundle bundle = ld0Var.h;
        ld0Var.A.O();
        ld0Var.g = 3;
        ld0Var.K = false;
        ld0Var.J();
        if (!ld0Var.K) {
            throw new us1(d51.r("Fragment ", ld0Var, " did not call through to super.onActivityCreated()"));
        }
        if (ae0.H(3)) {
            ld0Var.toString();
        }
        View view = ld0Var.M;
        if (view != null) {
            Bundle bundle2 = ld0Var.h;
            SparseArray<Parcelable> sparseArray = ld0Var.i;
            if (sparseArray != null) {
                view.restoreHierarchyState(sparseArray);
                ld0Var.i = null;
            }
            if (ld0Var.M != null) {
                oe0 oe0Var = ld0Var.W;
                oe0Var.k.i(ld0Var.j);
                ld0Var.j = null;
            }
            ld0Var.K = false;
            ld0Var.d0(bundle2);
            if (!ld0Var.K) {
                throw new us1(d51.r("Fragment ", ld0Var, " did not call through to super.onViewStateRestored()"));
            }
            if (ld0Var.M != null) {
                ld0Var.W.b(xp0.ON_CREATE);
            }
        }
        ld0Var.h = null;
        ae0 ae0Var = ld0Var.A;
        ae0Var.E = false;
        ae0Var.F = false;
        ae0Var.L.g = false;
        ae0Var.t(4);
        this.f477a.h(false);
    }

    public final void b() {
        View view;
        View view2;
        ArrayList arrayList = (ArrayList) this.b.i;
        ld0 ld0Var = this.c;
        ViewGroup viewGroup = ld0Var.L;
        int i = -1;
        if (viewGroup != null) {
            int indexOf = arrayList.indexOf(ld0Var);
            int i2 = indexOf - 1;
            while (true) {
                if (i2 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= arrayList.size()) {
                            break;
                        }
                        ld0 ld0Var2 = (ld0) arrayList.get(indexOf);
                        if (ld0Var2.L == viewGroup && (view = ld0Var2.M) != null) {
                            i = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    ld0 ld0Var3 = (ld0) arrayList.get(i2);
                    if (ld0Var3.L == viewGroup && (view2 = ld0Var3.M) != null) {
                        i = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i2--;
                }
            }
        }
        ld0Var.L.addView(ld0Var.M, i);
    }

    public final void c() {
        boolean H = ae0.H(3);
        ld0 ld0Var = this.c;
        if (H) {
            Objects.toString(ld0Var);
        }
        ld0 ld0Var2 = ld0Var.n;
        je0 je0Var = null;
        String str = Iyrs.stXpqoOjEDLVZ;
        gr grVar = this.b;
        if (ld0Var2 != null) {
            je0 je0Var2 = (je0) ((HashMap) grVar.h).get(ld0Var2.l);
            if (je0Var2 == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(ld0Var);
                ld0 ld0Var3 = ld0Var.n;
                sb.append(str);
                sb.append(ld0Var3);
                sb.append(" that does not belong to this FragmentManager!");
                throw new IllegalStateException(sb.toString());
            }
            ld0Var.o = ld0Var.n.l;
            ld0Var.n = null;
            je0Var = je0Var2;
        } else {
            String str2 = ld0Var.o;
            if (str2 != null && (je0Var = (je0) ((HashMap) grVar.h).get(str2)) == null) {
                StringBuilder sb2 = new StringBuilder("Fragment ");
                sb2.append(ld0Var);
                sb2.append(str);
                c.n(d51.u(sb2, ld0Var.o, " that does not belong to this FragmentManager!"));
                return;
            }
        }
        if (je0Var != null) {
            je0Var.k();
        }
        ae0 ae0Var = ld0Var.y;
        ld0Var.z = ae0Var.t;
        ld0Var.B = ae0Var.v;
        zf zfVar = this.f477a;
        zfVar.p(false);
        ArrayList arrayList = ld0Var.a0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ld0 ld0Var4 = ((hd0) obj).f376a;
            ld0Var4.Z.g();
            rj1.b(ld0Var4);
        }
        arrayList.clear();
        ld0Var.A.b(ld0Var.z, ld0Var.r(), ld0Var);
        ld0Var.g = 0;
        ld0Var.K = false;
        ld0Var.L(ld0Var.z.o);
        if (!ld0Var.K) {
            throw new us1(d51.r("Fragment ", ld0Var, " did not call through to super.onAttach()"));
        }
        Iterator it = ld0Var.y.m.iterator();
        while (it.hasNext()) {
            ((ee0) it.next()).b();
        }
        ae0 ae0Var2 = ld0Var.A;
        ae0Var2.E = false;
        ae0Var2.F = false;
        ae0Var2.L.g = false;
        ae0Var2.t(0);
        zfVar.i(false);
    }

    public final int d() {
        up1 up1Var;
        ld0 ld0Var = this.c;
        if (ld0Var.y == null) {
            return ld0Var.g;
        }
        int i = this.e;
        int ordinal = ld0Var.U.ordinal();
        int i2 = 0;
        if (ordinal == 1) {
            i = Math.min(i, 0);
        } else if (ordinal == 2) {
            i = Math.min(i, 1);
        } else if (ordinal == 3) {
            i = Math.min(i, 5);
        } else if (ordinal != 4) {
            i = Math.min(i, -1);
        }
        if (ld0Var.t) {
            boolean z = ld0Var.u;
            int i3 = this.e;
            if (z) {
                i = Math.max(i3, 2);
                View view = ld0Var.M;
                if (view != null && view.getParent() == null) {
                    i = Math.min(i, 2);
                }
            } else {
                i = i3 < 4 ? Math.min(i, ld0Var.g) : Math.min(i, 1);
            }
        }
        if (!ld0Var.r) {
            i = Math.min(i, 1);
        }
        ViewGroup viewGroup = ld0Var.L;
        if (viewGroup != null) {
            k20 f = k20.f(viewGroup, ld0Var.y().G());
            up1 d = f.d(ld0Var);
            int i4 = d != null ? d.b : 0;
            ArrayList arrayList = f.c;
            int size = arrayList.size();
            while (true) {
                if (i2 >= size) {
                    up1Var = null;
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                up1Var = (up1) obj;
                ld0 ld0Var2 = up1Var.c;
                ld0Var2.getClass();
                if (ld0Var2 == ld0Var && !up1Var.f) {
                    break;
                }
            }
            i2 = (up1Var == null || !(i4 == 0 || i4 == 1)) ? i4 : up1Var.b;
        }
        if (i2 == 2) {
            i = Math.min(i, 6);
        } else if (i2 == 3) {
            i = Math.max(i, 3);
        } else if (ld0Var.s) {
            i = ld0Var.I() ? Math.min(i, 1) : Math.min(i, -1);
        }
        if (ld0Var.N && ld0Var.g < 5) {
            i = Math.min(i, 4);
        }
        if (ae0.H(2)) {
            Objects.toString(ld0Var);
        }
        return i;
    }

    public final void e() {
        boolean H = ae0.H(3);
        ld0 ld0Var = this.c;
        if (H) {
            Objects.toString(ld0Var);
        }
        boolean z = ld0Var.S;
        Bundle bundle = ld0Var.h;
        if (z) {
            ld0Var.k0(bundle);
            ld0Var.g = 1;
            return;
        }
        zf zfVar = this.f477a;
        zfVar.q(false);
        Bundle bundle2 = ld0Var.h;
        ld0Var.A.O();
        ld0Var.g = 1;
        ld0Var.K = false;
        ld0Var.V.a(new pd1(2, ld0Var));
        ld0Var.Z.i(bundle2);
        ld0Var.M(bundle2);
        ld0Var.S = true;
        if (!ld0Var.K) {
            throw new us1(d51.r("Fragment ", ld0Var, " did not call through to super.onCreate()"));
        }
        ld0Var.V.d(xp0.ON_CREATE);
        zfVar.j(false);
    }

    public final void f() {
        String str;
        ld0 ld0Var = this.c;
        if (ld0Var.t) {
            return;
        }
        if (ae0.H(3)) {
            Objects.toString(ld0Var);
        }
        LayoutInflater S = ld0Var.S(ld0Var.h);
        ld0Var.R = S;
        ViewGroup viewGroup = ld0Var.L;
        if (viewGroup == null) {
            int i = ld0Var.D;
            if (i == 0) {
                viewGroup = null;
            } else {
                if (i == -1) {
                    c.m(d51.r("Cannot create fragment ", ld0Var, " for a container view with no id"));
                    return;
                }
                viewGroup = (ViewGroup) ld0Var.y.u.B(i);
                if (viewGroup == null) {
                    if (!ld0Var.v) {
                        try {
                            str = ld0Var.z().getResourceName(ld0Var.D);
                        } catch (Resources.NotFoundException unused) {
                            str = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(ld0Var.D) + " (" + str + ") for fragment " + ld0Var);
                    }
                } else if (!(viewGroup instanceof FragmentContainerView)) {
                    ke0 ke0Var = le0.f584a;
                    le0.b(new fe0(ld0Var, "Attempting to add fragment " + ld0Var + " to container " + viewGroup + YHJbtPFAANaPQ.XrRqtAPVeFhhF));
                    le0.a(ld0Var).getClass();
                }
            }
        }
        ld0Var.L = viewGroup;
        ld0Var.e0(S, viewGroup, ld0Var.h);
        View view = ld0Var.M;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            ld0Var.M.setTag(R.id.fragment_container_view_tag, ld0Var);
            if (viewGroup != null) {
                b();
            }
            if (ld0Var.F) {
                ld0Var.M.setVisibility(8);
            }
            View view2 = ld0Var.M;
            WeakHashMap weakHashMap = y62.f1215a;
            boolean isAttachedToWindow = view2.isAttachedToWindow();
            View view3 = ld0Var.M;
            if (isAttachedToWindow) {
                view3.requestApplyInsets();
            } else {
                view3.addOnAttachStateChangeListener(new lo(2, view3));
            }
            ld0Var.c0(ld0Var.M, ld0Var.h);
            ld0Var.A.t(2);
            this.f477a.v(ld0Var, ld0Var.M, false);
            int visibility = ld0Var.M.getVisibility();
            ld0Var.s().j = ld0Var.M.getAlpha();
            if (ld0Var.L != null && visibility == 0) {
                View findFocus = ld0Var.M.findFocus();
                if (findFocus != null) {
                    ld0Var.s().k = findFocus;
                    if (ae0.H(2)) {
                        findFocus.toString();
                        Objects.toString(ld0Var);
                    }
                }
                ld0Var.M.setAlpha(0.0f);
            }
        }
        ld0Var.g = 2;
    }

    public final void g() {
        ld0 j;
        boolean H = ae0.H(3);
        ld0 ld0Var = this.c;
        if (H) {
            Objects.toString(ld0Var);
        }
        boolean z = true;
        int i = 0;
        boolean z2 = ld0Var.s && !ld0Var.I();
        gr grVar = this.b;
        if (z2) {
        }
        if (!z2) {
            de0 de0Var = (de0) grVar.k;
            if (!((de0Var.b.containsKey(ld0Var.l) && de0Var.e) ? de0Var.f : true)) {
                String str = ld0Var.o;
                if (str != null && (j = grVar.j(str)) != null && j.H) {
                    ld0Var.n = j;
                }
                ld0Var.g = 0;
                return;
            }
        }
        nd0 nd0Var = ld0Var.z;
        if (nd0Var != null) {
            z = ((de0) grVar.k).f;
        } else {
            a5 a5Var = nd0Var.o;
            if (a5Var != null) {
                z = true ^ a5Var.isChangingConfigurations();
            }
        }
        if (z2 || z) {
            de0 de0Var2 = (de0) grVar.k;
            de0Var2.getClass();
            if (ae0.H(3)) {
                Objects.toString(ld0Var);
            }
            de0Var2.c(ld0Var.l);
        }
        ld0Var.A.k();
        ld0Var.V.d(xp0.ON_DESTROY);
        ld0Var.g = 0;
        ld0Var.K = false;
        ld0Var.S = false;
        ld0Var.P();
        if (!ld0Var.K) {
            throw new us1(d51.r("Fragment ", ld0Var, " did not call through to super.onDestroy()"));
        }
        this.f477a.k(false);
        ArrayList o = grVar.o();
        int size = o.size();
        while (i < size) {
            Object obj = o.get(i);
            i++;
            je0 je0Var = (je0) obj;
            if (je0Var != null) {
                ld0 ld0Var2 = je0Var.c;
                if (ld0Var.l.equals(ld0Var2.o)) {
                    ld0Var2.n = ld0Var;
                    ld0Var2.o = null;
                }
            }
        }
        String str2 = ld0Var.o;
        if (str2 != null) {
            ld0Var.n = grVar.j(str2);
        }
        grVar.x(this);
    }

    public final void h() {
        View view;
        boolean H = ae0.H(3);
        ld0 ld0Var = this.c;
        if (H) {
            Objects.toString(ld0Var);
        }
        ViewGroup viewGroup = ld0Var.L;
        if (viewGroup != null && (view = ld0Var.M) != null) {
            viewGroup.removeView(view);
        }
        ld0Var.A.t(1);
        if (ld0Var.M != null) {
            oe0 oe0Var = ld0Var.W;
            oe0Var.c();
            if (oe0Var.j.c.compareTo(yp0.i) >= 0) {
                ld0Var.W.b(xp0.ON_DESTROY);
            }
        }
        ld0Var.g = 1;
        ld0Var.K = false;
        ld0Var.Q();
        if (!ld0Var.K) {
            throw new us1(d51.r("Fragment ", ld0Var, " did not call through to super.onDestroyView()"));
        }
        n72 l = ld0Var.l();
        l.getClass();
        ty tyVar = ty.b;
        tyVar.getClass();
        gr grVar = new gr(l, qs0.c, tyVar);
        vq a2 = af1.a(qs0.class);
        String b = a2.b();
        if (b == null) {
            c.m("Local and anonymous classes can not be ViewModels");
            return;
        }
        op1 op1Var = ((qs0) grVar.t(a2, nyGJ.QOV.concat(b))).b;
        if (op1Var.i > 0) {
            throw d51.k(op1Var.h[0]);
        }
        ld0Var.w = false;
        this.f477a.w(false);
        ld0Var.L = null;
        ld0Var.M = null;
        ld0Var.W = null;
        ld0Var.X.k(null);
        ld0Var.u = false;
    }

    public final void i() {
        boolean H = ae0.H(3);
        ld0 ld0Var = this.c;
        if (H) {
            Objects.toString(ld0Var);
        }
        ld0Var.g = -1;
        ld0Var.K = false;
        ld0Var.R();
        ld0Var.R = null;
        if (!ld0Var.K) {
            throw new us1(d51.r("Fragment ", ld0Var, " did not call through to super.onDetach()"));
        }
        ae0 ae0Var = ld0Var.A;
        if (!ae0Var.G) {
            ae0Var.k();
            ld0Var.A = new ae0();
        }
        this.f477a.m(false);
        ld0Var.g = -1;
        ld0Var.z = null;
        ld0Var.B = null;
        ld0Var.y = null;
        if (!ld0Var.s || ld0Var.I()) {
            de0 de0Var = (de0) this.b.k;
            if (!((de0Var.b.containsKey(ld0Var.l) && de0Var.e) ? de0Var.f : true)) {
                return;
            }
        }
        if (ae0.H(3)) {
            Objects.toString(ld0Var);
        }
        ld0Var.F();
    }

    public final void j() {
        ld0 ld0Var = this.c;
        if (ld0Var.t && ld0Var.u && !ld0Var.w) {
            if (ae0.H(3)) {
                Objects.toString(ld0Var);
            }
            LayoutInflater S = ld0Var.S(ld0Var.h);
            ld0Var.R = S;
            ld0Var.e0(S, null, ld0Var.h);
            View view = ld0Var.M;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                ld0Var.M.setTag(R.id.fragment_container_view_tag, ld0Var);
                if (ld0Var.F) {
                    ld0Var.M.setVisibility(8);
                }
                ld0Var.c0(ld0Var.M, ld0Var.h);
                ld0Var.A.t(2);
                this.f477a.v(ld0Var, ld0Var.M, false);
                ld0Var.g = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        gr grVar = this.b;
        boolean z = this.d;
        ld0 ld0Var = this.c;
        if (z) {
            if (ae0.H(2)) {
                Objects.toString(ld0Var);
                return;
            }
            return;
        }
        try {
            this.d = true;
            boolean z2 = false;
            while (true) {
                int d = d();
                int i = ld0Var.g;
                if (d == i) {
                    if (!z2 && i == -1 && ld0Var.s && !ld0Var.I()) {
                        if (ae0.H(3)) {
                            Objects.toString(ld0Var);
                        }
                        de0 de0Var = (de0) grVar.k;
                        de0Var.getClass();
                        if (ae0.H(3)) {
                            Objects.toString(ld0Var);
                        }
                        de0Var.c(ld0Var.l);
                        grVar.x(this);
                        if (ae0.H(3)) {
                            Objects.toString(ld0Var);
                        }
                        ld0Var.F();
                    }
                    if (ld0Var.Q) {
                        if (ld0Var.M != null && (viewGroup = ld0Var.L) != null) {
                            k20 f = k20.f(viewGroup, ld0Var.y().G());
                            if (ld0Var.F) {
                                if (ae0.H(2)) {
                                    Objects.toString(ld0Var);
                                }
                                f.a(3, 1, this);
                            } else {
                                if (ae0.H(2)) {
                                    Objects.toString(ld0Var);
                                }
                                f.a(2, 1, this);
                            }
                        }
                        ae0 ae0Var = ld0Var.y;
                        if (ae0Var != null && ld0Var.r && ae0.I(ld0Var)) {
                            ae0Var.D = true;
                        }
                        ld0Var.Q = false;
                        ld0Var.T(ld0Var.F);
                        ld0Var.A.n();
                    }
                    this.d = false;
                    return;
                }
                if (d <= i) {
                    switch (i - 1) {
                        case -1:
                            i();
                            break;
                        case 0:
                            g();
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            h();
                            ld0Var.g = 1;
                            break;
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            ld0Var.u = false;
                            ld0Var.g = 2;
                            break;
                        case 3:
                            if (ae0.H(3)) {
                                Objects.toString(ld0Var);
                            }
                            if (ld0Var.M != null && ld0Var.i == null) {
                                p();
                            }
                            if (ld0Var.M != null && (viewGroup2 = ld0Var.L) != null) {
                                k20 f2 = k20.f(viewGroup2, ld0Var.y().G());
                                if (ae0.H(2)) {
                                    Objects.toString(ld0Var);
                                }
                                f2.a(1, 3, this);
                            }
                            ld0Var.g = 3;
                            break;
                        case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                            r();
                            break;
                        case 5:
                            ld0Var.g = 5;
                            break;
                        case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                            l();
                            break;
                    }
                } else {
                    switch (i + 1) {
                        case 0:
                            c();
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            e();
                            break;
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            j();
                            f();
                            break;
                        case 3:
                            a();
                            break;
                        case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                            if (ld0Var.M != null && (viewGroup3 = ld0Var.L) != null) {
                                k20 f3 = k20.f(viewGroup3, ld0Var.y().G());
                                int c = d51.c(ld0Var.M.getVisibility());
                                if (ae0.H(2)) {
                                    Objects.toString(ld0Var);
                                }
                                f3.a(c, 2, this);
                            }
                            ld0Var.g = 4;
                            break;
                        case 5:
                            q();
                            break;
                        case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                            ld0Var.g = 6;
                            break;
                        case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                            n();
                            break;
                    }
                }
                z2 = true;
            }
        } catch (Throwable th) {
            this.d = false;
            throw th;
        }
    }

    public final void l() {
        boolean H = ae0.H(3);
        ld0 ld0Var = this.c;
        if (H) {
            Objects.toString(ld0Var);
        }
        ld0Var.A.t(5);
        if (ld0Var.M != null) {
            ld0Var.W.b(xp0.ON_PAUSE);
        }
        ld0Var.V.d(xp0.ON_PAUSE);
        ld0Var.g = 6;
        ld0Var.K = false;
        ld0Var.V();
        if (!ld0Var.K) {
            throw new us1(d51.r("Fragment ", ld0Var, " did not call through to super.onPause()"));
        }
        this.f477a.o(false);
    }

    public final void m(ClassLoader classLoader) {
        ld0 ld0Var = this.c;
        Bundle bundle = ld0Var.h;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        ld0Var.i = ld0Var.h.getSparseParcelableArray("android:view_state");
        ld0Var.j = ld0Var.h.getBundle("android:view_registry_state");
        ld0Var.o = ld0Var.h.getString("android:target_state");
        if (ld0Var.o != null) {
            ld0Var.p = ld0Var.h.getInt("android:target_req_state", 0);
        }
        Boolean bool = ld0Var.k;
        if (bool != null) {
            ld0Var.O = bool.booleanValue();
            ld0Var.k = null;
        } else {
            ld0Var.O = ld0Var.h.getBoolean("android:user_visible_hint", true);
        }
        if (ld0Var.O) {
            return;
        }
        ld0Var.N = true;
    }

    public final void n() {
        boolean H = ae0.H(3);
        ld0 ld0Var = this.c;
        if (H) {
            Objects.toString(ld0Var);
        }
        jd0 jd0Var = ld0Var.P;
        View view = jd0Var == null ? null : jd0Var.k;
        if (view != null) {
            if (view != ld0Var.M) {
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    if (parent != ld0Var.M) {
                    }
                }
            }
            view.requestFocus();
            if (ae0.H(2)) {
                view.toString();
                Objects.toString(ld0Var);
                Objects.toString(ld0Var.M.findFocus());
            }
        }
        ld0Var.s().k = null;
        ld0Var.A.O();
        ld0Var.A.y(true);
        ld0Var.g = 7;
        ld0Var.K = false;
        ld0Var.Y();
        if (!ld0Var.K) {
            throw new us1(d51.r("Fragment ", ld0Var, " did not call through to super.onResume()"));
        }
        gq0 gq0Var = ld0Var.V;
        xp0 xp0Var = xp0.ON_RESUME;
        gq0Var.d(xp0Var);
        if (ld0Var.M != null) {
            ld0Var.W.j.d(xp0Var);
        }
        ae0 ae0Var = ld0Var.A;
        ae0Var.E = false;
        ae0Var.F = false;
        ae0Var.L.g = false;
        ae0Var.t(7);
        this.f477a.r(false);
        ld0Var.h = null;
        ld0Var.i = null;
        ld0Var.j = null;
    }

    public final Bundle o() {
        Bundle bundle = new Bundle();
        ld0 ld0Var = this.c;
        ld0Var.Z(bundle);
        ld0Var.Z.j(bundle);
        bundle.putParcelable("android:support:fragments", ld0Var.A.V());
        this.f477a.s(false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (ld0Var.M != null) {
            p();
        }
        if (ld0Var.i != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", ld0Var.i);
        }
        if (ld0Var.j != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", ld0Var.j);
        }
        if (!ld0Var.O) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", ld0Var.O);
        }
        return bundle;
    }

    public final void p() {
        ld0 ld0Var = this.c;
        if (ld0Var.M == null) {
            return;
        }
        if (ae0.H(2)) {
            Objects.toString(ld0Var);
            Objects.toString(ld0Var.M);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ld0Var.M.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            ld0Var.i = sparseArray;
        }
        Bundle bundle = new Bundle();
        ld0Var.W.k.j(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        ld0Var.j = bundle;
    }

    public final void q() {
        boolean H = ae0.H(3);
        ld0 ld0Var = this.c;
        if (H) {
            Objects.toString(ld0Var);
        }
        ld0Var.A.O();
        ld0Var.A.y(true);
        ld0Var.g = 5;
        ld0Var.K = false;
        ld0Var.a0();
        if (!ld0Var.K) {
            throw new us1(d51.r("Fragment ", ld0Var, " did not call through to super.onStart()"));
        }
        gq0 gq0Var = ld0Var.V;
        xp0 xp0Var = xp0.ON_START;
        gq0Var.d(xp0Var);
        if (ld0Var.M != null) {
            ld0Var.W.j.d(xp0Var);
        }
        ae0 ae0Var = ld0Var.A;
        ae0Var.E = false;
        ae0Var.F = false;
        ae0Var.L.g = false;
        ae0Var.t(5);
        this.f477a.t(false);
    }

    public final void r() {
        boolean H = ae0.H(3);
        ld0 ld0Var = this.c;
        if (H) {
            Objects.toString(ld0Var);
        }
        ae0 ae0Var = ld0Var.A;
        ae0Var.F = true;
        ae0Var.L.g = true;
        ae0Var.t(4);
        if (ld0Var.M != null) {
            ld0Var.W.b(xp0.ON_STOP);
        }
        ld0Var.V.d(xp0.ON_STOP);
        ld0Var.g = 4;
        ld0Var.K = false;
        ld0Var.b0();
        if (!ld0Var.K) {
            throw new us1(d51.r("Fragment ", ld0Var, " did not call through to super.onStop()"));
        }
        this.f477a.u(false);
    }
}
