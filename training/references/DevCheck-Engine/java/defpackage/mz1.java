package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class mz1 implements fx0 {
    public MenuBuilder g;
    public sw0 h;
    public final /* synthetic */ Toolbar i;

    public mz1(Toolbar toolbar) {
        this.i = toolbar;
    }

    @Override // defpackage.fx0
    public final void a(MenuBuilder menuBuilder, boolean z) {
    }

    @Override // defpackage.fx0
    public final boolean c(sw0 sw0Var) {
        Toolbar toolbar = this.i;
        KeyEvent.Callback callback = toolbar.o;
        if (callback instanceof qr) {
            ((qr) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.o);
        toolbar.removeView(toolbar.n);
        toolbar.o = null;
        ArrayList arrayList = toolbar.K;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.h = null;
        toolbar.requestLayout();
        sw0Var.C = false;
        sw0Var.n.p(false);
        toolbar.v();
        return true;
    }

    @Override // defpackage.fx0
    public final void e(Context context, MenuBuilder menuBuilder) {
        sw0 sw0Var;
        MenuBuilder menuBuilder2 = this.g;
        if (menuBuilder2 != null && (sw0Var = this.h) != null) {
            menuBuilder2.d(sw0Var);
        }
        this.g = menuBuilder;
    }

    @Override // defpackage.fx0
    public final void f(Parcelable parcelable) {
    }

    @Override // defpackage.fx0
    public final int getId() {
        return 0;
    }

    @Override // defpackage.fx0
    public final boolean h(sw0 sw0Var) {
        Toolbar toolbar = this.i;
        toolbar.c();
        ViewParent parent = toolbar.n.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.n);
            }
            toolbar.addView(toolbar.n);
        }
        View actionView = sw0Var.getActionView();
        toolbar.o = actionView;
        this.h = sw0Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.o);
            }
            nz1 h = Toolbar.h();
            h.f708a = (toolbar.t & 112) | 8388611;
            h.b = 2;
            toolbar.o.setLayoutParams(h);
            toolbar.addView(toolbar.o);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((nz1) childAt.getLayoutParams()).b != 2 && childAt != toolbar.g) {
                toolbar.removeViewAt(childCount);
                toolbar.K.add(childAt);
            }
        }
        toolbar.requestLayout();
        sw0Var.C = true;
        sw0Var.n.p(false);
        KeyEvent.Callback callback = toolbar.o;
        if (callback instanceof qr) {
            ((qr) callback).onActionViewExpanded();
        }
        toolbar.v();
        return true;
    }

    @Override // defpackage.fx0
    public final void j(boolean z) {
        if (this.h != null) {
            MenuBuilder menuBuilder = this.g;
            if (menuBuilder != null) {
                int size = menuBuilder.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.g.getItem(i) == this.h) {
                        return;
                    }
                }
            }
            c(this.h);
        }
    }

    @Override // defpackage.fx0
    public final boolean k(ls1 ls1Var) {
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
}
