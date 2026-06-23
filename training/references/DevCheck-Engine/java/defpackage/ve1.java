package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class ve1 extends o0 {
    public final RecyclerView d;
    public final ue1 e;

    public ve1(RecyclerView recyclerView) {
        this.d = recyclerView;
        o0 j = j();
        if (j == null || !(j instanceof ue1)) {
            this.e = new ue1(this);
        } else {
            this.e = (ue1) j;
        }
    }

    @Override // defpackage.o0
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.Q()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().U(accessibilityEvent);
        }
    }

    @Override // defpackage.o0
    public final void d(View view, c1 c1Var) {
        this.f709a.onInitializeAccessibilityNodeInfo(view, c1Var.f104a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.Q() || recyclerView.getLayoutManager() == null) {
            return;
        }
        de1 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.V(recyclerView2.i, recyclerView2.n0, c1Var);
    }

    @Override // defpackage.o0
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.Q() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        return recyclerView.getLayoutManager().i0(i, bundle);
    }

    public o0 j() {
        return this.e;
    }
}
