package defpackage;

import androidx.appcompat.widget.ActionBarContextView;

/* loaded from: classes.dex */
public final class h implements l82 {

    /* renamed from: a, reason: collision with root package name */
    public int f357a;
    public boolean b;
    public Object c;

    @Override // defpackage.l82
    public void a() {
        if (this.b) {
            return;
        }
        ActionBarContextView actionBarContextView = (ActionBarContextView) this.c;
        actionBarContextView.l = null;
        super/*android.view.View*/.setVisibility(this.f357a);
    }

    @Override // defpackage.l82
    public void b() {
        this.b = true;
    }

    @Override // defpackage.l82
    public void c() {
        super/*android.view.View*/.setVisibility(0);
        this.b = false;
    }
}
