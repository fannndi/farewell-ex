package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.MenuBuilder;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class tq1 extends xw0 implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public boolean A;
    public final Context h;
    public final MenuBuilder i;
    public final nw0 j;
    public final boolean k;
    public final int l;
    public final int m;
    public final int n;
    public final dx0 o;
    public final i0 p;
    public final lo q;
    public PopupWindow.OnDismissListener r;
    public View s;
    public View t;
    public ex0 u;
    public ViewTreeObserver v;
    public boolean w;
    public boolean x;
    public int y;
    public int z = 0;

    public tq1(int i, int i2, Context context, View view, MenuBuilder menuBuilder, boolean z) {
        int i3 = 5;
        this.p = new i0(i3, this);
        this.q = new lo(i3, this);
        this.h = context;
        this.i = menuBuilder;
        this.k = z;
        this.j = new nw0(menuBuilder, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.m = i;
        this.n = i2;
        Resources resources = context.getResources();
        this.l = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.s = view;
        this.o = new dx0(context, null, i, i2);
        menuBuilder.b(this, context);
    }

    @Override // defpackage.fx0
    public final void a(MenuBuilder menuBuilder, boolean z) {
        if (menuBuilder != this.i) {
            return;
        }
        dismiss();
        ex0 ex0Var = this.u;
        if (ex0Var != null) {
            ex0Var.a(menuBuilder, z);
        }
    }

    @Override // defpackage.ro1
    public final boolean b() {
        return !this.w && this.o.F.isShowing();
    }

    @Override // defpackage.ro1
    public final void d() {
        View view;
        if (b()) {
            return;
        }
        if (this.w || (view = this.s) == null) {
            c.n("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.t = view;
        dx0 dx0Var = this.o;
        k6 k6Var = dx0Var.F;
        k6 k6Var2 = dx0Var.F;
        k6Var.setOnDismissListener(this);
        dx0Var.v = this;
        dx0Var.E = true;
        k6Var2.setFocusable(true);
        View view2 = this.t;
        boolean z = this.v == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.v = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.p);
        }
        view2.addOnAttachStateChangeListener(this.q);
        dx0Var.u = view2;
        dx0Var.r = this.z;
        boolean z2 = this.x;
        Context context = this.h;
        nw0 nw0Var = this.j;
        if (!z2) {
            this.y = xw0.o(nw0Var, context, this.l);
            this.x = true;
        }
        dx0Var.r(this.y);
        k6Var2.setInputMethodMode(2);
        Rect rect = this.g;
        dx0Var.D = rect != null ? new Rect(rect) : null;
        dx0Var.d();
        l60 l60Var = dx0Var.i;
        l60Var.setOnKeyListener(this);
        if (this.A) {
            MenuBuilder menuBuilder = this.i;
            if (menuBuilder.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) l60Var, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuBuilder.m);
                }
                frameLayout.setEnabled(false);
                l60Var.addHeaderView(frameLayout, null, false);
            }
        }
        dx0Var.q(nw0Var);
        dx0Var.d();
    }

    @Override // defpackage.ro1
    public final void dismiss() {
        if (b()) {
            this.o.dismiss();
        }
    }

    @Override // defpackage.fx0
    public final void f(Parcelable parcelable) {
    }

    @Override // defpackage.fx0
    public final void g(ex0 ex0Var) {
        this.u = ex0Var;
    }

    @Override // defpackage.ro1
    public final l60 i() {
        return this.o.i;
    }

    @Override // defpackage.fx0
    public final void j(boolean z) {
        this.x = false;
        nw0 nw0Var = this.j;
        if (nw0Var != null) {
            nw0Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.fx0
    public final boolean k(ls1 ls1Var) {
        boolean z;
        if (ls1Var.hasVisibleItems()) {
            zw0 zw0Var = new zw0(this.m, this.n, this.h, this.t, ls1Var, this.k);
            ex0 ex0Var = this.u;
            zw0Var.i = ex0Var;
            xw0 xw0Var = zw0Var.j;
            if (xw0Var != null) {
                xw0Var.g(ex0Var);
            }
            int size = ls1Var.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = ls1Var.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            zw0Var.h = z;
            xw0 xw0Var2 = zw0Var.j;
            if (xw0Var2 != null) {
                xw0Var2.q(z);
            }
            zw0Var.k = this.r;
            this.r = null;
            this.i.c(false);
            dx0 dx0Var = this.o;
            int i2 = dx0Var.l;
            int n = dx0Var.n();
            if ((Gravity.getAbsoluteGravity(this.z, this.s.getLayoutDirection()) & 7) == 5) {
                i2 += this.s.getWidth();
            }
            if (!zw0Var.b()) {
                if (zw0Var.f != null) {
                    zw0Var.d(i2, n, true, true);
                }
            }
            ex0 ex0Var2 = this.u;
            if (ex0Var2 != null) {
                ex0Var2.G(ls1Var);
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.fx0
    public final boolean l() {
        return false;
    }

    @Override // defpackage.fx0
    public final Parcelable m() {
        return null;
    }

    @Override // defpackage.xw0
    public final void n(MenuBuilder menuBuilder) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.w = true;
        this.i.c(true);
        ViewTreeObserver viewTreeObserver = this.v;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.v = this.t.getViewTreeObserver();
            }
            this.v.removeGlobalOnLayoutListener(this.p);
            this.v = null;
        }
        this.t.removeOnAttachStateChangeListener(this.q);
        PopupWindow.OnDismissListener onDismissListener = this.r;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.xw0
    public final void p(View view) {
        this.s = view;
    }

    @Override // defpackage.xw0
    public final void q(boolean z) {
        this.j.i = z;
    }

    @Override // defpackage.xw0
    public final void r(int i) {
        this.z = i;
    }

    @Override // defpackage.xw0
    public final void s(int i) {
        this.o.l = i;
    }

    @Override // defpackage.xw0
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.r = onDismissListener;
    }

    @Override // defpackage.xw0
    public final void u(boolean z) {
        this.A = z;
    }

    @Override // defpackage.xw0
    public final void v(int i) {
        this.o.j(i);
    }
}
