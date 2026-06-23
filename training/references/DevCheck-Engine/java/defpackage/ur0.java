package defpackage;

import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class ur0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ wr0 f1053a;

    public ur0(wr0 wr0Var) {
        this.f1053a = wr0Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        wr0 wr0Var = this.f1053a;
        tr0 tr0Var = wr0Var.x;
        k6 k6Var = wr0Var.F;
        if (i != 1 || k6Var.getInputMethodMode() == 2 || k6Var.getContentView() == null) {
            return;
        }
        wr0Var.B.removeCallbacks(tr0Var);
        tr0Var.run();
    }
}
