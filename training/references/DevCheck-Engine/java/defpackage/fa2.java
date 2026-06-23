package defpackage;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class fa2 extends sl implements t1 {
    public static final AccelerateInterpolator S = new AccelerateInterpolator();
    public static final DecelerateInterpolator T = new DecelerateInterpolator();
    public final View A;
    public boolean B;
    public ea2 C;
    public ea2 D;
    public i8 E;
    public boolean F;
    public final ArrayList G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public k82 M;
    public boolean N;
    public boolean O;
    public final da2 P;
    public final da2 Q;
    public final my1 R;
    public Context u;
    public Context v;
    public ActionBarOverlayLayout w;
    public ActionBarContainer x;
    public f10 y;
    public ActionBarContextView z;

    public fa2(Activity activity, boolean z) {
        super(4);
        new ArrayList();
        this.G = new ArrayList();
        this.H = 0;
        this.I = true;
        this.L = true;
        this.P = new da2(this, 0);
        this.Q = new da2(this, 1);
        this.R = new my1(this);
        View decorView = activity.getWindow().getDecorView();
        v0(decorView);
        if (z) {
            return;
        }
        this.A = decorView.findViewById(R.id.content);
    }

    public fa2(Dialog dialog2) {
        super(4);
        new ArrayList();
        this.G = new ArrayList();
        this.H = 0;
        this.I = true;
        this.L = true;
        this.P = new da2(this, 0);
        this.Q = new da2(this, 1);
        this.R = new my1(this);
        v0(dialog2.getWindow().getDecorView());
    }

    @Override // defpackage.sl
    public final Context J() {
        if (this.v == null) {
            TypedValue typedValue = new TypedValue();
            this.u.getTheme().resolveAttribute(flar2.devcheck.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.v = new ContextThemeWrapper(this.u, i);
            } else {
                this.v = this.u;
            }
        }
        return this.v;
    }

    @Override // defpackage.sl
    public final void R() {
        w0(this.u.getResources().getBoolean(flar2.devcheck.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // defpackage.sl
    public final boolean V(int i, KeyEvent keyEvent) {
        MenuBuilder menuBuilder;
        ea2 ea2Var = this.C;
        if (ea2Var == null || (menuBuilder = ea2Var.j) == null) {
            return false;
        }
        menuBuilder.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuBuilder.performShortcut(i, keyEvent, 0);
    }

    @Override // defpackage.sl
    public final boolean i() {
        mz1 mz1Var;
        f10 f10Var = this.y;
        if (f10Var == null || (mz1Var = ((tz1) f10Var).f1015a.S) == null || mz1Var.h == null) {
            return false;
        }
        mz1 mz1Var2 = ((tz1) f10Var).f1015a.S;
        sw0 sw0Var = mz1Var2 == null ? null : mz1Var2.h;
        if (sw0Var == null) {
            return true;
        }
        sw0Var.collapseActionView();
        return true;
    }

    @Override // defpackage.sl
    public final void i0(boolean z) {
        if (this.B) {
            return;
        }
        j0(z);
    }

    @Override // defpackage.sl
    public final void j0(boolean z) {
        int i = z ? 4 : 0;
        tz1 tz1Var = (tz1) this.y;
        int i2 = tz1Var.b;
        this.B = true;
        tz1Var.a((i & 4) | (i2 & (-5)));
    }

    @Override // defpackage.sl
    public final void k0(boolean z) {
        k82 k82Var;
        this.N = z;
        if (z || (k82Var = this.M) == null) {
            return;
        }
        k82Var.a();
    }

    @Override // defpackage.sl
    public final void l0(int i) {
        m0(this.u.getString(i));
    }

    @Override // defpackage.sl
    public final void m0(String str) {
        tz1 tz1Var = (tz1) this.y;
        tz1Var.g = true;
        Toolbar toolbar = tz1Var.f1015a;
        tz1Var.h = str;
        if ((tz1Var.b & 8) != 0) {
            toolbar.setTitle(str);
            if (tz1Var.g) {
                y62.p(toolbar.getRootView(), str);
            }
        }
    }

    @Override // defpackage.sl
    public final void n0(CharSequence charSequence) {
        tz1 tz1Var = (tz1) this.y;
        if (tz1Var.g) {
            return;
        }
        Toolbar toolbar = tz1Var.f1015a;
        tz1Var.h = charSequence;
        if ((tz1Var.b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (tz1Var.g) {
                y62.p(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.sl
    public final void o(boolean z) {
        if (z == this.F) {
            return;
        }
        this.F = z;
        ArrayList arrayList = this.G;
        if (arrayList.size() > 0) {
            throw iy1.e(arrayList, 0);
        }
    }

    @Override // defpackage.sl
    public final j2 o0(i8 i8Var) {
        ea2 ea2Var = this.C;
        if (ea2Var != null) {
            ea2Var.a();
        }
        this.w.setHideOnContentScrollEnabled(false);
        this.z.e();
        ea2 ea2Var2 = new ea2(this, this.z.getContext(), i8Var);
        MenuBuilder menuBuilder = ea2Var2.j;
        menuBuilder.w();
        try {
            if (!((h2) ea2Var2.k.g).c(ea2Var2, menuBuilder)) {
                return null;
            }
            this.C = ea2Var2;
            ea2Var2.g();
            this.z.c(ea2Var2);
            u0(true);
            return ea2Var2;
        } finally {
            menuBuilder.v();
        }
    }

    public final void u0(boolean z) {
        j82 i;
        j82 j82Var;
        boolean z2 = this.K;
        if (z) {
            if (!z2) {
                this.K = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.w;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                x0(false);
            }
        } else if (z2) {
            this.K = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.w;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            x0(false);
        }
        boolean isLaidOut = this.x.isLaidOut();
        f10 f10Var = this.y;
        if (!isLaidOut) {
            if (z) {
                ((tz1) f10Var).f1015a.setVisibility(4);
                this.z.setVisibility(0);
                return;
            } else {
                ((tz1) f10Var).f1015a.setVisibility(0);
                this.z.setVisibility(8);
                return;
            }
        }
        if (z) {
            tz1 tz1Var = (tz1) f10Var;
            i = y62.b(tz1Var.f1015a);
            i.a(0.0f);
            i.c(100L);
            i.d(new sz1(tz1Var, 4));
            j82Var = this.z.i(0, 200L);
        } else {
            tz1 tz1Var2 = (tz1) f10Var;
            j82 b = y62.b(tz1Var2.f1015a);
            b.a(1.0f);
            b.c(200L);
            b.d(new sz1(tz1Var2, 0));
            i = this.z.i(8, 100L);
            j82Var = b;
        }
        k82 k82Var = new k82();
        ArrayList arrayList = k82Var.f519a;
        arrayList.add(i);
        View view = (View) i.f468a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) j82Var.f468a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(j82Var);
        k82Var.b();
    }

    public final void v0(View view) {
        f10 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(flar2.devcheck.R.id.decor_content_parent);
        this.w = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(flar2.devcheck.R.id.action_bar);
        if (findViewById instanceof f10) {
            wrapper = (f10) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.y = wrapper;
        this.z = (ActionBarContextView) view.findViewById(flar2.devcheck.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(flar2.devcheck.R.id.action_bar_container);
        this.x = actionBarContainer;
        f10 f10Var = this.y;
        if (f10Var == null || this.z == null || actionBarContainer == null) {
            c.n(fa2.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        Context context = ((tz1) f10Var).f1015a.getContext();
        this.u = context;
        if ((((tz1) this.y).b & 4) != 0) {
            this.B = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.y.getClass();
        w0(context.getResources().getBoolean(flar2.devcheck.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.u.obtainStyledAttributes(null, zb1.f1269a, flar2.devcheck.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.w;
            if (!actionBarOverlayLayout2.m) {
                c.n("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.O = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.x;
            WeakHashMap weakHashMap = y62.f1215a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void w0(boolean z) {
        if (z) {
            this.x.setTabContainer(null);
            ((tz1) this.y).getClass();
        } else {
            ((tz1) this.y).getClass();
            this.x.setTabContainer(null);
        }
        this.y.getClass();
        ((tz1) this.y).f1015a.setCollapsible(false);
        this.w.setHasNonEmbeddedTabs(false);
    }

    public final void x0(boolean z) {
        boolean z2 = this.K || !this.J;
        boolean z3 = this.L;
        my1 my1Var = this.R;
        View view = this.A;
        if (!z2) {
            if (z3) {
                this.L = false;
                k82 k82Var = this.M;
                if (k82Var != null) {
                    k82Var.a();
                }
                int i = this.H;
                da2 da2Var = this.P;
                if (i != 0 || (!this.N && !z)) {
                    da2Var.a();
                    return;
                }
                this.x.setAlpha(1.0f);
                this.x.setTransitioning(true);
                k82 k82Var2 = new k82();
                float f = -this.x.getHeight();
                if (z) {
                    this.x.getLocationInWindow(new int[]{0, 0});
                    f -= r12[1];
                }
                j82 b = y62.b(this.x);
                b.e(f);
                View view2 = (View) b.f468a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(my1Var != null ? new zd(my1Var, view2) : null);
                }
                boolean z4 = k82Var2.e;
                ArrayList arrayList = k82Var2.f519a;
                if (!z4) {
                    arrayList.add(b);
                }
                if (this.I && view != null) {
                    j82 b2 = y62.b(view);
                    b2.e(f);
                    if (!k82Var2.e) {
                        arrayList.add(b2);
                    }
                }
                boolean z5 = k82Var2.e;
                if (!z5) {
                    k82Var2.c = S;
                }
                if (!z5) {
                    k82Var2.b = 250L;
                }
                if (!z5) {
                    k82Var2.d = da2Var;
                }
                this.M = k82Var2;
                k82Var2.b();
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        this.L = true;
        k82 k82Var3 = this.M;
        if (k82Var3 != null) {
            k82Var3.a();
        }
        this.x.setVisibility(0);
        int i2 = this.H;
        da2 da2Var2 = this.Q;
        if (i2 == 0 && (this.N || z)) {
            this.x.setTranslationY(0.0f);
            float f2 = -this.x.getHeight();
            if (z) {
                this.x.getLocationInWindow(new int[]{0, 0});
                f2 -= r12[1];
            }
            this.x.setTranslationY(f2);
            k82 k82Var4 = new k82();
            j82 b3 = y62.b(this.x);
            b3.e(0.0f);
            View view3 = (View) b3.f468a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(my1Var != null ? new zd(my1Var, view3) : null);
            }
            boolean z6 = k82Var4.e;
            ArrayList arrayList2 = k82Var4.f519a;
            if (!z6) {
                arrayList2.add(b3);
            }
            if (this.I && view != null) {
                view.setTranslationY(f2);
                j82 b4 = y62.b(view);
                b4.e(0.0f);
                if (!k82Var4.e) {
                    arrayList2.add(b4);
                }
            }
            boolean z7 = k82Var4.e;
            if (!z7) {
                k82Var4.c = T;
            }
            if (!z7) {
                k82Var4.b = 250L;
            }
            if (!z7) {
                k82Var4.d = da2Var2;
            }
            this.M = k82Var4;
            k82Var4.b();
        } else {
            this.x.setAlpha(1.0f);
            this.x.setTranslationY(0.0f);
            if (this.I && view != null) {
                view.setTranslationY(0.0f);
            }
            da2Var2.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.w;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = y62.f1215a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }

    @Override // defpackage.sl
    public final int y() {
        return ((tz1) this.y).b;
    }
}
