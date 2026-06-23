package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import flar2.devcheck.bottomDrawer.BottomDrawer;

/* loaded from: classes.dex */
public abstract class dl extends i40 implements ViewTreeObserver.OnGlobalLayoutListener {
    public bl t0;

    public bl A0() {
        Context v = v();
        v.getClass();
        return new bl(v);
    }

    @Override // defpackage.i40, defpackage.ld0
    public final void a0() {
        ViewTreeObserver viewTreeObserver;
        super.a0();
        bl blVar = this.t0;
        if (blVar != null && (viewTreeObserver = blVar.l.a().getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        try {
            Dialog dialog2 = this.o0;
            dialog2.getClass();
            dialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: cl
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    dl dlVar = dl.this;
                    if (dlVar.G()) {
                        dlVar.u0();
                    }
                }
            });
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.ld0
    public void c0(View view, Bundle bundle) {
        int identifier;
        view.getClass();
        if (Build.VERSION.SDK_INT < 35 || (identifier = z().getIdentifier("navigation_bar_height", "dimen", "android")) <= 0) {
            return;
        }
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom() + z().getDimensionPixelSize(identifier));
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        bl blVar = this.t0;
        if (blVar != null) {
            BottomDrawer a2 = blVar.l.a();
            FrameLayout frameLayout = a2.i;
            if (a2.p && a2.getTop() < a2.r - a2.s) {
                a2.c();
                return;
            }
            if (frameLayout.getPaddingBottom() != 0) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (a2.getTop() == a2.r - a2.s || !a2.j.isEmpty()) {
                a2.k.u(1.0f);
                a2.b(a2.n, 0.0f);
            }
            if (a2.p) {
                a2.c();
            }
        }
    }

    @Override // defpackage.i40
    public final Dialog x0() {
        bl A0 = A0();
        this.t0 = A0;
        return A0;
    }
}
