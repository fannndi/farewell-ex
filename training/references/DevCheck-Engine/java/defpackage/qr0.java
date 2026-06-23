package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.telephony.fHMN.BFtDZYxPcpGN;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.view.menu.MenuBuilder;

/* loaded from: classes.dex */
public final class qr0 implements fx0, AdapterView.OnItemClickListener {
    public Context g;
    public LayoutInflater h;
    public MenuBuilder i;
    public ExpandedMenuView j;
    public ex0 k;
    public pr0 l;

    public qr0(ContextWrapper contextWrapper) {
        this.g = contextWrapper;
        this.h = LayoutInflater.from(contextWrapper);
    }

    @Override // defpackage.fx0
    public final void a(MenuBuilder menuBuilder, boolean z) {
        ex0 ex0Var = this.k;
        if (ex0Var != null) {
            ex0Var.a(menuBuilder, z);
        }
    }

    @Override // defpackage.fx0
    public final boolean c(sw0 sw0Var) {
        return false;
    }

    @Override // defpackage.fx0
    public final void e(Context context, MenuBuilder menuBuilder) {
        if (this.g != null) {
            this.g = context;
            if (this.h == null) {
                this.h = LayoutInflater.from(context);
            }
        }
        this.i = menuBuilder;
        pr0 pr0Var = this.l;
        if (pr0Var != null) {
            pr0Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.fx0
    public final void f(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.j.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // defpackage.fx0
    public final void g(ex0 ex0Var) {
        throw null;
    }

    @Override // defpackage.fx0
    public final int getId() {
        return 0;
    }

    @Override // defpackage.fx0
    public final boolean h(sw0 sw0Var) {
        return false;
    }

    @Override // defpackage.fx0
    public final void j(boolean z) {
        pr0 pr0Var = this.l;
        if (pr0Var != null) {
            pr0Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.fx0
    public final boolean k(ls1 ls1Var) {
        boolean hasVisibleItems = ls1Var.hasVisibleItems();
        Context context = ls1Var.f39a;
        if (!hasVisibleItems) {
            return false;
        }
        qw0 qw0Var = new qw0();
        qw0Var.g = ls1Var;
        th2 th2Var = new th2(context);
        j3 j3Var = (j3) th2Var.h;
        qr0 qr0Var = new qr0(j3Var.f459a);
        qw0Var.i = qr0Var;
        qr0Var.k = qw0Var;
        ls1Var.b(qr0Var, context);
        qr0 qr0Var2 = qw0Var.i;
        if (qr0Var2.l == null) {
            qr0Var2.l = new pr0(qr0Var2);
        }
        j3Var.q = qr0Var2.l;
        j3Var.r = qw0Var;
        View view = ls1Var.o;
        if (view != null) {
            j3Var.f = view;
        } else {
            j3Var.d = ls1Var.n;
            j3Var.e = ls1Var.m;
        }
        j3Var.o = qw0Var;
        n3 a2 = th2Var.a();
        qw0Var.h = a2;
        a2.setOnDismissListener(qw0Var);
        WindowManager.LayoutParams attributes = qw0Var.h.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= rt0.C;
        qw0Var.h.show();
        ex0 ex0Var = this.k;
        if (ex0Var == null) {
            return true;
        }
        ex0Var.G(ls1Var);
        return true;
    }

    @Override // defpackage.fx0
    public final boolean l() {
        return false;
    }

    @Override // defpackage.fx0
    public final Parcelable m() {
        if (this.j == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.j;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray(BFtDZYxPcpGN.CVTDwJcGIsjq, sparseArray);
        return bundle;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.i.q(this.l.getItem(i), this, 0);
    }
}
