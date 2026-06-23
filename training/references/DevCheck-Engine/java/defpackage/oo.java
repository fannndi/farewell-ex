package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.MenuBuilder;
import flar2.devcheck.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class oo extends xw0 implements View.OnKeyListener, PopupWindow.OnDismissListener {
    public int A;
    public boolean C;
    public ex0 D;
    public ViewTreeObserver E;
    public PopupWindow.OnDismissListener F;
    public boolean G;
    public final Context h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final Handler m;
    public View u;
    public View v;
    public int w;
    public boolean x;
    public boolean y;
    public int z;
    public final ArrayList n = new ArrayList();
    public final ArrayList o = new ArrayList();
    public final i0 p = new i0(3, this);
    public final lo q = new lo(0, this);
    public final gm2 r = new gm2(18, this);
    public int s = 0;
    public int t = 0;
    public boolean B = false;

    public oo(Context context, View view, int i, int i2, boolean z) {
        this.h = context;
        this.u = view;
        this.j = i;
        this.k = i2;
        this.l = z;
        this.w = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.m = new Handler();
    }

    @Override // defpackage.fx0
    public final void a(MenuBuilder menuBuilder, boolean z) {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuBuilder == ((no) arrayList.get(i)).b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((no) arrayList.get(i2)).b.c(false);
        }
        no noVar = (no) arrayList.remove(i);
        MenuBuilder menuBuilder2 = noVar.b;
        dx0 dx0Var = noVar.f693a;
        k6 k6Var = dx0Var.F;
        menuBuilder2.r(this);
        if (this.G) {
            ax0.b(k6Var, null);
            k6Var.setAnimationStyle(0);
        }
        dx0Var.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.w = ((no) arrayList.get(size2 - 1)).c;
        } else {
            this.w = this.u.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z) {
                ((no) arrayList.get(0)).b.c(false);
                return;
            }
            return;
        }
        dismiss();
        ex0 ex0Var = this.D;
        if (ex0Var != null) {
            ex0Var.a(menuBuilder, true);
        }
        ViewTreeObserver viewTreeObserver = this.E;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.E.removeGlobalOnLayoutListener(this.p);
            }
            this.E = null;
        }
        this.v.removeOnAttachStateChangeListener(this.q);
        this.F.onDismiss();
    }

    @Override // defpackage.ro1
    public final boolean b() {
        ArrayList arrayList = this.o;
        return arrayList.size() > 0 && ((no) arrayList.get(0)).f693a.F.isShowing();
    }

    @Override // defpackage.ro1
    public final void d() {
        if (b()) {
            return;
        }
        ArrayList arrayList = this.n;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            w((MenuBuilder) obj);
        }
        arrayList.clear();
        View view = this.u;
        this.v = view;
        if (view != null) {
            boolean z = this.E == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.E = viewTreeObserver;
            if (z) {
                viewTreeObserver.addOnGlobalLayoutListener(this.p);
            }
            this.v.addOnAttachStateChangeListener(this.q);
        }
    }

    @Override // defpackage.ro1
    public final void dismiss() {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        if (size > 0) {
            no[] noVarArr = (no[]) arrayList.toArray(new no[size]);
            for (int i = size - 1; i >= 0; i--) {
                no noVar = noVarArr[i];
                if (noVar.f693a.F.isShowing()) {
                    noVar.f693a.dismiss();
                }
            }
        }
    }

    @Override // defpackage.fx0
    public final void f(Parcelable parcelable) {
    }

    @Override // defpackage.fx0
    public final void g(ex0 ex0Var) {
        this.D = ex0Var;
    }

    @Override // defpackage.ro1
    public final l60 i() {
        ArrayList arrayList = this.o;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((no) d51.m(arrayList, 1)).f693a.i;
    }

    @Override // defpackage.fx0
    public final void j(boolean z) {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ListAdapter adapter = ((no) obj).f693a.i.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((nw0) adapter).notifyDataSetChanged();
        }
    }

    @Override // defpackage.fx0
    public final boolean k(ls1 ls1Var) {
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            no noVar = (no) obj;
            if (ls1Var == noVar.b) {
                noVar.f693a.i.requestFocus();
                return true;
            }
        }
        if (!ls1Var.hasVisibleItems()) {
            return false;
        }
        n(ls1Var);
        ex0 ex0Var = this.D;
        if (ex0Var != null) {
            ex0Var.G(ls1Var);
        }
        return true;
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
        menuBuilder.b(this, this.h);
        if (b()) {
            w(menuBuilder);
        } else {
            this.n.add(menuBuilder);
        }
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        no noVar;
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                noVar = null;
                break;
            }
            noVar = (no) arrayList.get(i);
            if (!noVar.f693a.F.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (noVar != null) {
            noVar.b.c(false);
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
        if (this.u != view) {
            this.u = view;
            this.t = Gravity.getAbsoluteGravity(this.s, view.getLayoutDirection());
        }
    }

    @Override // defpackage.xw0
    public final void q(boolean z) {
        this.B = z;
    }

    @Override // defpackage.xw0
    public final void r(int i) {
        if (this.s != i) {
            this.s = i;
            this.t = Gravity.getAbsoluteGravity(i, this.u.getLayoutDirection());
        }
    }

    @Override // defpackage.xw0
    public final void s(int i) {
        this.x = true;
        this.z = i;
    }

    @Override // defpackage.xw0
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.F = onDismissListener;
    }

    @Override // defpackage.xw0
    public final void u(boolean z) {
        this.C = z;
    }

    @Override // defpackage.xw0
    public final void v(int i) {
        this.y = true;
        this.A = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016c  */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.view.LayoutInflater] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w(androidx.appcompat.view.menu.MenuBuilder r20) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oo.w(androidx.appcompat.view.menu.MenuBuilder):void");
    }
}
