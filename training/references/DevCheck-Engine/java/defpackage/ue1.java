package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class ue1 extends o0 {
    public final ve1 d;
    public final WeakHashMap e = new WeakHashMap();

    public ue1(ve1 ve1Var) {
        this.d = ve1Var;
    }

    @Override // defpackage.o0
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        o0 o0Var = (o0) this.e.get(view);
        return o0Var != null ? o0Var.a(view, accessibilityEvent) : this.f709a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.o0
    public final gm2 b(View view) {
        o0 o0Var = (o0) this.e.get(view);
        return o0Var != null ? o0Var.b(view) : super.b(view);
    }

    @Override // defpackage.o0
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        o0 o0Var = (o0) this.e.get(view);
        if (o0Var != null) {
            o0Var.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.o0
    public final void d(View view, c1 c1Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1Var.f104a;
        ve1 ve1Var = this.d;
        RecyclerView recyclerView = ve1Var.d;
        RecyclerView recyclerView2 = ve1Var.d;
        boolean Q = recyclerView.Q();
        View.AccessibilityDelegate accessibilityDelegate = this.f709a;
        if (Q || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().X(view, c1Var);
        o0 o0Var = (o0) this.e.get(view);
        if (o0Var != null) {
            o0Var.d(view, c1Var);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // defpackage.o0
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        o0 o0Var = (o0) this.e.get(view);
        if (o0Var != null) {
            o0Var.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.o0
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        o0 o0Var = (o0) this.e.get(viewGroup);
        return o0Var != null ? o0Var.f(viewGroup, view, accessibilityEvent) : this.f709a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.o0
    public final boolean g(View view, int i, Bundle bundle) {
        ve1 ve1Var = this.d;
        RecyclerView recyclerView = ve1Var.d;
        RecyclerView recyclerView2 = ve1Var.d;
        if (recyclerView.Q() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        o0 o0Var = (o0) this.e.get(view);
        if (o0Var != null) {
            if (o0Var.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        ke1 ke1Var = recyclerView2.getLayoutManager().b.i;
        return false;
    }

    @Override // defpackage.o0
    public final void h(View view, int i) {
        o0 o0Var = (o0) this.e.get(view);
        if (o0Var != null) {
            o0Var.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.o0
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        o0 o0Var = (o0) this.e.get(view);
        if (o0Var != null) {
            o0Var.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
