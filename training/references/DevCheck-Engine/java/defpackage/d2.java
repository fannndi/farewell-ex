package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionMenuView;
import flar2.devcheck.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d2 implements fx0 {
    public z1 A;
    public hk2 B;
    public a2 C;
    public int E;
    public final Context g;
    public Context h;
    public MenuBuilder i;
    public final LayoutInflater j;
    public ex0 k;
    public hx0 n;
    public int o;
    public b2 p;
    public Drawable q;
    public boolean r;
    public boolean s;
    public boolean t;
    public int u;
    public int v;
    public int w;
    public boolean x;
    public z1 z;
    public final int l = R.layout.abc_action_menu_layout;
    public final int m = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray y = new SparseBooleanArray();
    public final gm2 D = new gm2(2, this);

    public d2(Context context) {
        this.g = context;
        this.j = LayoutInflater.from(context);
    }

    @Override // defpackage.fx0
    public final void a(MenuBuilder menuBuilder, boolean z) {
        d();
        z1 z1Var = this.A;
        if (z1Var != null && z1Var.b()) {
            z1Var.j.dismiss();
        }
        ex0 ex0Var = this.k;
        if (ex0Var != null) {
            ex0Var.a(menuBuilder, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [gx0] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final View b(sw0 sw0Var, View view, ViewGroup viewGroup) {
        View actionView = sw0Var.getActionView();
        if (actionView == null || sw0Var.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof gx0 ? (gx0) view : (gx0) this.j.inflate(this.m, viewGroup, false);
            actionMenuItemView.c(sw0Var);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.n);
            if (this.C == null) {
                this.C = new a2(this);
            }
            actionMenuItemView2.setPopupCallback(this.C);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(sw0Var.C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof f2)) {
            actionView.setLayoutParams(ActionMenuView.k(layoutParams));
        }
        return actionView;
    }

    @Override // defpackage.fx0
    public final boolean c(sw0 sw0Var) {
        return false;
    }

    public final boolean d() {
        Object obj;
        hk2 hk2Var = this.B;
        if (hk2Var != null && (obj = this.n) != null) {
            ((View) obj).removeCallbacks(hk2Var);
            this.B = null;
            return true;
        }
        z1 z1Var = this.z;
        if (z1Var == null) {
            return false;
        }
        if (z1Var.b()) {
            z1Var.j.dismiss();
        }
        return true;
    }

    @Override // defpackage.fx0
    public final void e(Context context, MenuBuilder menuBuilder) {
        this.h = context;
        LayoutInflater.from(context);
        this.i = menuBuilder;
        Resources resources = context.getResources();
        if (!this.t) {
            this.s = true;
        }
        int i = 2;
        this.u = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        int i3 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i2 > 600 || ((i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960))) {
            i = 5;
        } else if (i2 >= 500 || ((i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640))) {
            i = 4;
        } else if (i2 >= 360) {
            i = 3;
        }
        this.w = i;
        int i4 = this.u;
        if (this.s) {
            if (this.p == null) {
                b2 b2Var = new b2(this, this.g);
                this.p = b2Var;
                if (this.r) {
                    b2Var.setImageDrawable(this.q);
                    this.q = null;
                    this.r = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.p.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i4 -= this.p.getMeasuredWidth();
        } else {
            this.p = null;
        }
        this.v = i4;
        float f = resources.getDisplayMetrics().density;
    }

    @Override // defpackage.fx0
    public final void f(Parcelable parcelable) {
        int i;
        MenuItem findItem;
        if ((parcelable instanceof c2) && (i = ((c2) parcelable).g) > 0 && (findItem = this.i.findItem(i)) != null) {
            k((ls1) findItem.getSubMenu());
        }
    }

    @Override // defpackage.fx0
    public final void g(ex0 ex0Var) {
        throw null;
    }

    @Override // defpackage.fx0
    public final int getId() {
        return this.o;
    }

    @Override // defpackage.fx0
    public final boolean h(sw0 sw0Var) {
        return false;
    }

    public final boolean i() {
        z1 z1Var = this.z;
        return z1Var != null && z1Var.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fx0
    public final void j(boolean z) {
        int i;
        ViewGroup viewGroup = (ViewGroup) this.n;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            MenuBuilder menuBuilder = this.i;
            if (menuBuilder != null) {
                menuBuilder.i();
                ArrayList l = this.i.l();
                int size = l.size();
                i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    sw0 sw0Var = (sw0) l.get(i2);
                    if ((sw0Var.x & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i);
                        sw0 itemData = childAt instanceof gx0 ? ((gx0) childAt).getItemData() : null;
                        View b = b(sw0Var, childAt, viewGroup);
                        if (sw0Var != itemData) {
                            b.setPressed(false);
                            b.jumpDrawablesToCurrentState();
                        }
                        if (b != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b);
                            }
                            ((ViewGroup) this.n).addView(b, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.p) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.n).requestLayout();
        MenuBuilder menuBuilder2 = this.i;
        if (menuBuilder2 != null) {
            menuBuilder2.i();
            ArrayList arrayList2 = menuBuilder2.i;
            int size2 = arrayList2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                tw0 tw0Var = ((sw0) arrayList2.get(i3)).A;
            }
        }
        MenuBuilder menuBuilder3 = this.i;
        if (menuBuilder3 != null) {
            menuBuilder3.i();
            arrayList = menuBuilder3.j;
        }
        if (this.s && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((sw0) arrayList.get(0)).C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        b2 b2Var = this.p;
        if (z2) {
            if (b2Var == null) {
                this.p = new b2(this, this.g);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.p.getParent();
            if (viewGroup3 != this.n) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.p);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.n;
                b2 b2Var2 = this.p;
                actionMenuView.getClass();
                f2 j = ActionMenuView.j();
                j.f259a = true;
                actionMenuView.addView(b2Var2, j);
            }
        } else if (b2Var != null) {
            Object parent = b2Var.getParent();
            Object obj = this.n;
            if (parent == obj) {
                ((ViewGroup) obj).removeView(this.p);
            }
        }
        ((ActionMenuView) this.n).setOverflowReserved(this.s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.fx0
    public final boolean k(ls1 ls1Var) {
        boolean z;
        if (ls1Var.hasVisibleItems()) {
            ls1 ls1Var2 = ls1Var;
            while (true) {
                MenuBuilder menuBuilder = ls1Var2.A;
                if (menuBuilder == this.i) {
                    break;
                }
                ls1Var2 = (ls1) menuBuilder;
            }
            sw0 sw0Var = ls1Var2.B;
            ViewGroup viewGroup = (ViewGroup) this.n;
            View view = null;
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                int i = 0;
                while (true) {
                    if (i >= childCount) {
                        break;
                    }
                    View childAt = viewGroup.getChildAt(i);
                    if ((childAt instanceof gx0) && ((gx0) childAt).getItemData() == sw0Var) {
                        view = childAt;
                        break;
                    }
                    i++;
                }
            }
            if (view != null) {
                this.E = ls1Var.B.f958a;
                int size = ls1Var.f.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        z = false;
                        break;
                    }
                    MenuItem item = ls1Var.getItem(i2);
                    if (item.isVisible() && item.getIcon() != null) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                z1 z1Var = new z1(this, this.h, ls1Var, view);
                this.A = z1Var;
                z1Var.h = z;
                xw0 xw0Var = z1Var.j;
                if (xw0Var != null) {
                    xw0Var.q(z);
                }
                z1 z1Var2 = this.A;
                if (!z1Var2.b()) {
                    if (z1Var2.f == null) {
                        c.n("MenuPopupHelper cannot be used without an anchor");
                        return false;
                    }
                    z1Var2.d(0, 0, false, false);
                }
                ex0 ex0Var = this.k;
                if (ex0Var != null) {
                    ex0Var.G(ls1Var);
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.fx0
    public final boolean l() {
        int i;
        ArrayList arrayList;
        int i2;
        boolean z;
        d2 d2Var = this;
        MenuBuilder menuBuilder = d2Var.i;
        if (menuBuilder != null) {
            arrayList = menuBuilder.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i3 = d2Var.w;
        int i4 = d2Var.v;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) d2Var.n;
        int i5 = 0;
        boolean z2 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z = true;
            if (i5 >= i) {
                break;
            }
            sw0 sw0Var = (sw0) arrayList.get(i5);
            int i8 = sw0Var.y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z2 = true;
            }
            if (d2Var.x && sw0Var.C) {
                i3 = 0;
            }
            i5++;
        }
        if (d2Var.s && (z2 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = d2Var.y;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i) {
            sw0 sw0Var2 = (sw0) arrayList.get(i10);
            int i12 = sw0Var2.y;
            boolean z3 = (i12 & 2) == i2 ? z : false;
            int i13 = sw0Var2.b;
            if (z3) {
                View b = d2Var.b(sw0Var2, null, viewGroup);
                b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z);
                }
                sw0Var2.f(z);
            } else if ((i12 & 1) == z) {
                boolean z4 = sparseBooleanArray.get(i13);
                boolean z5 = ((i9 > 0 || z4) && i4 > 0) ? z : false;
                if (z5) {
                    View b2 = d2Var.b(sw0Var2, null, viewGroup);
                    b2.measure(makeMeasureSpec, makeMeasureSpec);
                    int measuredWidth2 = b2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z5 &= i4 + i11 > 0;
                }
                if (z5 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z4) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        sw0 sw0Var3 = (sw0) arrayList.get(i14);
                        if (sw0Var3.b == i13) {
                            if ((sw0Var3.x & 32) == 32) {
                                i9++;
                            }
                            sw0Var3.f(false);
                        }
                    }
                }
                if (z5) {
                    i9--;
                }
                sw0Var2.f(z5);
            } else {
                sw0Var2.f(false);
                i10++;
                i2 = 2;
                d2Var = this;
                z = true;
            }
            i10++;
            i2 = 2;
            d2Var = this;
            z = true;
        }
        return z;
    }

    @Override // defpackage.fx0
    public final Parcelable m() {
        c2 c2Var = new c2();
        c2Var.g = this.E;
        return c2Var;
    }

    public final boolean n() {
        MenuBuilder menuBuilder;
        boolean z = false;
        if (this.s && !i() && (menuBuilder = this.i) != null && this.n != null && this.B == null) {
            menuBuilder.i();
            if (!menuBuilder.j.isEmpty()) {
                hk2 hk2Var = new hk2(this, new z1(this, this.h, this.i, this.p), 1, z);
                this.B = hk2Var;
                ((View) this.n).post(hk2Var);
                return true;
            }
        }
        return false;
    }
}
