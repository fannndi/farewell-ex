package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class fp1 extends he1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f299a = false;
    public final /* synthetic */ y51 b;

    public fp1(y51 y51Var) {
        this.b = y51Var;
    }

    @Override // defpackage.he1
    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0 && this.f299a) {
            this.f299a = false;
            this.b.h();
        }
    }

    @Override // defpackage.he1
    public final void b(RecyclerView recyclerView, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return;
        }
        this.f299a = true;
    }
}
