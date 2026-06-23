package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class ea2 extends j2 implements ow0 {
    public final Context i;
    public final MenuBuilder j;
    public i8 k;
    public WeakReference l;
    public final /* synthetic */ fa2 m;

    public ea2(fa2 fa2Var, Context context, i8 i8Var) {
        this.m = fa2Var;
        this.i = context;
        this.k = i8Var;
        MenuBuilder menuBuilder = new MenuBuilder(context);
        menuBuilder.l = 1;
        this.j = menuBuilder;
        menuBuilder.e = this;
    }

    @Override // defpackage.ow0
    public final void H(MenuBuilder menuBuilder) {
        if (this.k == null) {
            return;
        }
        g();
        d2 d2Var = this.m.z.j;
        if (d2Var != null) {
            d2Var.n();
        }
    }

    @Override // defpackage.j2
    public final void a() {
        fa2 fa2Var = this.m;
        if (fa2Var.C != this) {
            return;
        }
        if (fa2Var.J) {
            fa2Var.D = this;
            fa2Var.E = this.k;
        } else {
            this.k.u(this);
        }
        this.k = null;
        fa2Var.u0(false);
        ActionBarContextView actionBarContextView = fa2Var.z;
        if (actionBarContextView.q == null) {
            actionBarContextView.e();
        }
        fa2Var.w.setHideOnContentScrollEnabled(fa2Var.O);
        fa2Var.C = null;
    }

    @Override // defpackage.j2
    public final View b() {
        WeakReference weakReference = this.l;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.j2
    public final MenuBuilder c() {
        return this.j;
    }

    @Override // defpackage.j2
    public final MenuInflater d() {
        return new at1(this.i);
    }

    @Override // defpackage.j2
    public final CharSequence e() {
        return this.m.z.getSubtitle();
    }

    @Override // defpackage.j2
    public final CharSequence f() {
        return this.m.z.getTitle();
    }

    @Override // defpackage.j2
    public final void g() {
        if (this.m.C != this) {
            return;
        }
        MenuBuilder menuBuilder = this.j;
        menuBuilder.w();
        try {
            this.k.p(this, menuBuilder);
        } finally {
            menuBuilder.v();
        }
    }

    @Override // defpackage.j2
    public final boolean h() {
        return this.m.z.y;
    }

    @Override // defpackage.j2
    public final void i(View view) {
        this.m.z.setCustomView(view);
        this.l = new WeakReference(view);
    }

    @Override // defpackage.j2
    public final void j(int i) {
        k(this.m.u.getResources().getString(i));
    }

    @Override // defpackage.j2
    public final void k(CharSequence charSequence) {
        this.m.z.setSubtitle(charSequence);
    }

    @Override // defpackage.j2
    public final void l(int i) {
        m(this.m.u.getResources().getString(i));
    }

    @Override // defpackage.j2
    public final void m(CharSequence charSequence) {
        this.m.z.setTitle(charSequence);
    }

    @Override // defpackage.j2
    public final void n(boolean z) {
        this.h = z;
        this.m.z.setTitleOptional(z);
    }

    @Override // defpackage.ow0
    public final boolean x(MenuBuilder menuBuilder, MenuItem menuItem) {
        i8 i8Var = this.k;
        if (i8Var != null) {
            return ((h2) i8Var.g).g(this, menuItem);
        }
        return false;
    }
}
