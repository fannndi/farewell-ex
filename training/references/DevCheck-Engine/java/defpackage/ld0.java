package defpackage;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import flar2.devcheck.R;
import flar2.devcheck.cputimes.Sd.tEegR;
import flar2.devcheck.dpreference.Eg.aEQQDLUUMo;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class ld0 implements View.OnCreateContextMenuListener, ComponentCallbacks, o72, ni0, eq0, yj1 {
    public static final Object c0 = new Object();
    public ld0 B;
    public int C;
    public int D;
    public String E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean K;
    public ViewGroup L;
    public View M;
    public boolean N;
    public jd0 P;
    public boolean Q;
    public LayoutInflater R;
    public boolean S;
    public String T;
    public gq0 V;
    public oe0 W;
    public zj1 Y;
    public kp Z;
    public final ArrayList a0;
    public final hd0 b0;
    public Bundle h;
    public SparseArray i;
    public Bundle j;
    public Boolean k;
    public Bundle m;
    public ld0 n;
    public int p;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public ae0 y;
    public nd0 z;
    public int g = -1;
    public String l = UUID.randomUUID().toString();
    public String o = null;
    public Boolean q = null;
    public ae0 A = new ae0();
    public boolean J = true;
    public boolean O = true;
    public yp0 U = yp0.k;
    public final qy0 X = new qy0();

    public ld0() {
        new AtomicInteger();
        this.a0 = new ArrayList();
        this.b0 = new hd0(this);
        E();
    }

    public final String A(int i) {
        return z().getString(i);
    }

    public final String B(int i, Object... objArr) {
        return z().getString(i, objArr);
    }

    public final ld0 C(boolean z) {
        String str;
        if (z) {
            ke0 ke0Var = le0.f584a;
            le0.b(new eg0(this, "Attempting to get target fragment from fragment " + this));
            le0.a(this).getClass();
        }
        ld0 ld0Var = this.n;
        if (ld0Var != null) {
            return ld0Var;
        }
        ae0 ae0Var = this.y;
        if (ae0Var == null || (str = this.o) == null) {
            return null;
        }
        return ae0Var.c.j(str);
    }

    public final oe0 D() {
        oe0 oe0Var = this.W;
        if (oe0Var != null) {
            return oe0Var;
        }
        c.n("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
        return null;
    }

    public final void E() {
        this.V = new gq0(this);
        this.Z = new kp(new xj1(this, new qt(7, this)));
        this.Y = null;
        ArrayList arrayList = this.a0;
        hd0 hd0Var = this.b0;
        if (arrayList.contains(hd0Var)) {
            return;
        }
        if (this.g < 0) {
            arrayList.add(hd0Var);
            return;
        }
        ld0 ld0Var = hd0Var.f376a;
        ld0Var.Z.g();
        rj1.b(ld0Var);
    }

    public final void F() {
        E();
        this.T = this.l;
        this.l = UUID.randomUUID().toString();
        this.r = false;
        this.s = false;
        this.t = false;
        this.u = false;
        this.v = false;
        this.x = 0;
        this.y = null;
        this.A = new ae0();
        this.z = null;
        this.C = 0;
        this.D = 0;
        this.E = null;
        this.F = false;
        this.G = false;
    }

    public final boolean G() {
        return this.z != null && this.r;
    }

    public final boolean H() {
        if (this.F) {
            return true;
        }
        ae0 ae0Var = this.y;
        if (ae0Var != null) {
            ld0 ld0Var = this.B;
            ae0Var.getClass();
            if (ld0Var == null ? false : ld0Var.H()) {
                return true;
            }
        }
        return false;
    }

    public final boolean I() {
        return this.x > 0;
    }

    public void J() {
        this.K = true;
    }

    public void K(int i, int i2, Intent intent) {
        if (ae0.H(2)) {
            toString();
            Objects.toString(intent);
        }
    }

    public void L(Context context) {
        this.K = true;
        nd0 nd0Var = this.z;
        if ((nd0Var == null ? null : nd0Var.n) != null) {
            this.K = true;
        }
    }

    public void M(Bundle bundle) {
        this.K = true;
        k0(bundle);
        ae0 ae0Var = this.A;
        if (ae0Var.s >= 1) {
            return;
        }
        ae0Var.E = false;
        ae0Var.F = false;
        ae0Var.L.g = false;
        ae0Var.t(1);
    }

    public void N(Menu menu, MenuInflater menuInflater) {
    }

    public View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void P() {
        this.K = true;
    }

    public void Q() {
        this.K = true;
    }

    public void R() {
        this.K = true;
    }

    public LayoutInflater S(Bundle bundle) {
        nd0 nd0Var = this.z;
        if (nd0Var == null) {
            c.n("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
            return null;
        }
        a5 a5Var = nd0Var.r;
        LayoutInflater cloneInContext = a5Var.getLayoutInflater().cloneInContext(a5Var);
        cloneInContext.setFactory2(this.A.f);
        return cloneInContext;
    }

    public void T(boolean z) {
    }

    public boolean U(MenuItem menuItem) {
        return false;
    }

    public void V() {
        this.K = true;
    }

    public void W(Menu menu) {
    }

    public void X(int i, String[] strArr, int[] iArr) {
    }

    public void Y() {
        this.K = true;
    }

    public void Z(Bundle bundle) {
    }

    @Override // defpackage.yj1
    public final zf a() {
        return (zf) this.Z.i;
    }

    public void a0() {
        this.K = true;
    }

    public void b0() {
        this.K = true;
    }

    public void c0(View view, Bundle bundle) {
    }

    public void d0(Bundle bundle) {
        this.K = true;
    }

    public void e0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.A.O();
        this.w = true;
        this.W = new oe0(this, l());
        View O = O(layoutInflater, viewGroup);
        this.M = O;
        oe0 oe0Var = this.W;
        if (O == null) {
            if (oe0Var.j == null) {
                this.W = null;
                return;
            } else {
                c.n("Called getViewLifecycleOwner() but onCreateView() returned null");
                return;
            }
        }
        oe0Var.c();
        View view = this.M;
        oe0 oe0Var2 = this.W;
        view.getClass();
        view.setTag(R.id.view_tree_lifecycle_owner, oe0Var2);
        View view2 = this.M;
        oe0 oe0Var3 = this.W;
        view2.getClass();
        view2.setTag(R.id.view_tree_view_model_store_owner, oe0Var3);
        View view3 = this.M;
        oe0 oe0Var4 = this.W;
        view3.getClass();
        view3.setTag(R.id.view_tree_saved_state_registry_owner, oe0Var4);
        this.X.k(this.W);
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final void f0(String[] strArr, int i) {
        if (this.z == null) {
            c.n(d51.r("Fragment ", this, " not attached to Activity"));
            return;
        }
        ae0 y = y();
        if (y.B == null) {
            y.t.getClass();
            return;
        }
        y.C.addLast(new xd0(i, this.l));
        y.B.T(strArr);
    }

    @Override // defpackage.ni0
    public final l72 g() {
        Application application = null;
        if (this.y == null) {
            c.n("Can't access ViewModels from detached fragment");
            return null;
        }
        if (this.Y == null) {
            Context applicationContext = i0().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && ae0.H(3)) {
                Objects.toString(i0().getApplicationContext());
            }
            this.Y = new zj1(application, this, this.m);
        }
        return this.Y;
    }

    public final a5 g0() {
        a5 t = t();
        if (t != null) {
            return t;
        }
        c.n(d51.r("Fragment ", this, " not attached to an activity."));
        return null;
    }

    @Override // defpackage.ni0
    public final py0 h() {
        Application application;
        Context applicationContext = i0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && ae0.H(3)) {
            Objects.toString(i0().getApplicationContext());
        }
        py0 py0Var = new py0();
        LinkedHashMap linkedHashMap = py0Var.f1057a;
        if (application != null) {
            linkedHashMap.put(k72.j, application);
        }
        linkedHashMap.put(rj1.f898a, this);
        linkedHashMap.put(rj1.b, this);
        Bundle bundle = this.m;
        if (bundle != null) {
            linkedHashMap.put(rj1.c, bundle);
        }
        return py0Var;
    }

    public final Bundle h0() {
        Bundle bundle = this.m;
        if (bundle != null) {
            return bundle;
        }
        c.n(d51.r(YHJbtPFAANaPQ.PTsCsxsoqahNP, this, " does not have any arguments."));
        return null;
    }

    public final Context i0() {
        Context v = v();
        if (v != null) {
            return v;
        }
        c.n(d51.r("Fragment ", this, " not attached to a context."));
        return null;
    }

    public final View j0() {
        View view = this.M;
        if (view != null) {
            return view;
        }
        c.n(d51.r("Fragment ", this, " did not return a View from onCreateView() or this was called before onCreateView()."));
        return null;
    }

    public final void k0(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.A.U(parcelable);
        ae0 ae0Var = this.A;
        ae0Var.E = false;
        ae0Var.F = false;
        ae0Var.L.g = false;
        ae0Var.t(1);
    }

    @Override // defpackage.o72
    public final n72 l() {
        if (this.y == null) {
            c.n("Can't access ViewModels from detached fragment");
            return null;
        }
        if (x() == 1) {
            c.n("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
            return null;
        }
        HashMap hashMap = this.y.L.d;
        n72 n72Var = (n72) hashMap.get(this.l);
        if (n72Var != null) {
            return n72Var;
        }
        n72 n72Var2 = new n72();
        hashMap.put(this.l, n72Var2);
        return n72Var2;
    }

    public final void l0(int i, int i2, int i3, int i4) {
        if (this.P == null && i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return;
        }
        s().b = i;
        s().c = i2;
        s().d = i3;
        s().e = i4;
    }

    public final void m0(Bundle bundle) {
        ae0 ae0Var = this.y;
        if (ae0Var != null) {
            if (ae0Var == null ? false : ae0Var.M()) {
                c.n("Fragment already added and state has been saved");
                return;
            }
        }
        this.m = bundle;
    }

    public final void n0(boolean z) {
        if (this.I != z) {
            this.I = z;
            if (!G() || H()) {
                return;
            }
            this.z.r.invalidateOptionsMenu();
        }
    }

    public final void o0(boolean z) {
        if (this.J != z) {
            this.J = z;
            if (this.I && G() && !H()) {
                this.z.r.invalidateOptionsMenu();
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.K = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        g0().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.K = true;
    }

    public final void p0(ld0 ld0Var) {
        if (ld0Var != null) {
            ke0 ke0Var = le0.f584a;
            le0.b(new eg0(this, "Attempting to set target fragment " + ld0Var + " with request code 0 for fragment " + this));
            le0.a(this).getClass();
        }
        ae0 ae0Var = this.y;
        ae0 ae0Var2 = ld0Var != null ? ld0Var.y : null;
        if (ae0Var != null && ae0Var2 != null && ae0Var != ae0Var2) {
            c.m(d51.r("Fragment ", ld0Var, " must share the same FragmentManager to be set as a target fragment"));
            return;
        }
        for (ld0 ld0Var2 = ld0Var; ld0Var2 != null; ld0Var2 = ld0Var2.C(false)) {
            if (ld0Var2 == this) {
                throw new IllegalArgumentException("Setting " + ld0Var + " as the target of " + this + " would create a target cycle");
            }
        }
        if (ld0Var == null) {
            this.o = null;
            this.n = null;
        } else if (this.y == null || ld0Var.y == null) {
            this.o = null;
            this.n = ld0Var;
        } else {
            this.o = ld0Var.l;
            this.n = null;
        }
        this.p = 0;
    }

    @Override // defpackage.eq0
    public final gq0 q() {
        return this.V;
    }

    public final void q0(boolean z) {
        ke0 ke0Var = le0.f584a;
        le0.b(new fe0(this, "Attempting to set user visible hint to " + z + " for fragment " + this));
        le0.a(this).getClass();
        boolean z2 = false;
        if (!this.O && z && this.g < 5 && this.y != null && G() && this.S) {
            ae0 ae0Var = this.y;
            je0 f = ae0Var.f(this);
            ld0 ld0Var = f.c;
            if (ld0Var.N) {
                if (ae0Var.b) {
                    ae0Var.H = true;
                } else {
                    ld0Var.N = false;
                    f.k();
                }
            }
        }
        this.O = z;
        if (this.g < 5 && !z) {
            z2 = true;
        }
        this.N = z2;
        if (this.h != null) {
            this.k = Boolean.valueOf(z);
        }
    }

    public tl2 r() {
        return new id0(this);
    }

    public final boolean r0(String str) {
        nd0 nd0Var = this.z;
        if (nd0Var == null) {
            return false;
        }
        a5 a5Var = nd0Var.r;
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
            return false;
        }
        if (i < 32 && i == 31) {
            try {
                return ((Boolean) PackageManager.class.getMethod(tEegR.AfUF, String.class).invoke(a5Var.getApplication().getPackageManager(), str)).booleanValue();
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return a5Var.shouldShowRequestPermissionRationale(str);
            }
        }
        return a5Var.shouldShowRequestPermissionRationale(str);
    }

    public final jd0 s() {
        if (this.P == null) {
            jd0 jd0Var = new jd0();
            Object obj = c0;
            jd0Var.g = obj;
            jd0Var.h = obj;
            jd0Var.i = obj;
            jd0Var.j = 1.0f;
            jd0Var.k = null;
            this.P = jd0Var;
        }
        return this.P;
    }

    public final void s0(Intent intent) {
        nd0 nd0Var = this.z;
        if (nd0Var != null) {
            nd0Var.o.startActivity(intent, null);
        } else {
            c.n(d51.r("Fragment ", this, " not attached to Activity"));
        }
    }

    public final a5 t() {
        nd0 nd0Var = this.z;
        if (nd0Var == null) {
            return null;
        }
        return nd0Var.n;
    }

    public final void t0(Intent intent, int i) {
        if (this.z == null) {
            c.n(d51.r("Fragment ", this, aEQQDLUUMo.IQriPdpRixBnlgp));
            return;
        }
        ae0 y = y();
        if (y.z != null) {
            y.C.addLast(new xd0(i, this.l));
            y.z.T(intent);
        } else {
            nd0 nd0Var = y.t;
            if (i == -1) {
                nd0Var.o.startActivity(intent, null);
            } else {
                nd0Var.getClass();
                c.n("Starting activity with a requestCode requires a FragmentActivity host");
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(rt0.s);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.l);
        if (this.C != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.C));
        }
        if (this.E != null) {
            sb.append(" tag=");
            sb.append(this.E);
        }
        sb.append(")");
        return sb.toString();
    }

    public final ae0 u() {
        if (this.z != null) {
            return this.A;
        }
        c.n(d51.r("Fragment ", this, " has not been attached yet."));
        return null;
    }

    public final Context v() {
        nd0 nd0Var = this.z;
        if (nd0Var == null) {
            return null;
        }
        return nd0Var.o;
    }

    public final LayoutInflater w() {
        LayoutInflater layoutInflater = this.R;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        LayoutInflater S = S(null);
        this.R = S;
        return S;
    }

    public final int x() {
        yp0 yp0Var = this.U;
        return (yp0Var == yp0.h || this.B == null) ? yp0Var.ordinal() : Math.min(yp0Var.ordinal(), this.B.x());
    }

    public final ae0 y() {
        ae0 ae0Var = this.y;
        if (ae0Var != null) {
            return ae0Var;
        }
        c.n(d51.r("Fragment ", this, " not associated with a fragment manager."));
        return null;
    }

    public final Resources z() {
        return i0().getResources();
    }
}
