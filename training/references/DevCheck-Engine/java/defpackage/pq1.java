package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class pq1 extends j2 implements ow0 {
    public Context i;
    public ActionBarContextView j;
    public i8 k;
    public WeakReference l;
    public boolean m;
    public MenuBuilder n;

    @Override // defpackage.ow0
    public final void H(MenuBuilder menuBuilder) {
        g();
        d2 d2Var = this.j.j;
        if (d2Var != null) {
            d2Var.n();
        }
    }

    @Override // defpackage.j2
    public final void a() {
        if (this.m) {
            return;
        }
        this.m = true;
        this.k.u(this);
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
        return this.n;
    }

    @Override // defpackage.j2
    public final MenuInflater d() {
        return new at1(this.j.getContext());
    }

    @Override // defpackage.j2
    public final CharSequence e() {
        return this.j.getSubtitle();
    }

    @Override // defpackage.j2
    public final CharSequence f() {
        return this.j.getTitle();
    }

    @Override // defpackage.j2
    public final void g() {
        this.k.p(this, this.n);
    }

    @Override // defpackage.j2
    public final boolean h() {
        return this.j.y;
    }

    @Override // defpackage.j2
    public final void i(View view) {
        this.j.setCustomView(view);
        this.l = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.j2
    public final void j(int i) {
        k(this.i.getString(i));
    }

    @Override // defpackage.j2
    public final void k(CharSequence charSequence) {
        this.j.setSubtitle(charSequence);
    }

    @Override // defpackage.j2
    public final void l(int i) {
        m(this.i.getString(i));
    }

    @Override // defpackage.j2
    public final void m(CharSequence charSequence) {
        this.j.setTitle(charSequence);
    }

    @Override // defpackage.j2
    public final void n(boolean z) {
        this.h = z;
        this.j.setTitleOptional(z);
    }

    @Override // defpackage.ow0
    public final boolean x(MenuBuilder menuBuilder, MenuItem menuItem) {
        return ((h2) this.k.g).g(this, menuItem);
    }
}
