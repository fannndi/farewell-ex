package defpackage;

import android.R;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public class c6 extends bu implements d5 {
    public a6 j;
    public final b6 k;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [b6] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c6(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130969092(0x7f040204, float:1.7546856E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            b6 r2 = new b6
            r2.<init>()
            r4.k = r2
            m5 r4 = r4.d()
            if (r6 != 0) goto L34
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L34:
            r5 = r4
            a6 r5 = (defpackage.a6) r5
            r5.Z = r6
            r4.f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c6.<init>(android.content.Context, int):void");
    }

    @Override // defpackage.bu, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        a6 a6Var = (a6) d();
        a6Var.z();
        ((ViewGroup) a6Var.G.findViewById(R.id.content)).addView(view, layoutParams);
        a6Var.s.a(a6Var.r.getCallback());
    }

    public final m5 d() {
        if (this.j == null) {
            lm1 lm1Var = m5.g;
            this.j = new a6(getContext(), getWindow(), this, this);
        }
        return this.j;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        d().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return c3.i(this.k, getWindow().getDecorView(), this, keyEvent);
    }

    public final boolean e(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        a6 a6Var = (a6) d();
        a6Var.z();
        return a6Var.r.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        d().d();
    }

    @Override // defpackage.bu, android.app.Dialog
    public void onCreate(Bundle bundle) {
        a6 a6Var = (a6) d();
        LayoutInflater from = LayoutInflater.from(a6Var.q);
        if (from.getFactory() == null) {
            from.setFactory2(a6Var);
        } else {
            from.getFactory2();
        }
        super.onCreate(bundle);
        d().f();
    }

    @Override // defpackage.bu, android.app.Dialog
    public final void onStop() {
        super.onStop();
        a6 a6Var = (a6) d();
        a6Var.D();
        sl slVar = a6Var.t;
        if (slVar != null) {
            slVar.k0(false);
        }
    }

    @Override // defpackage.bu, android.app.Dialog
    public void setContentView(int i) {
        c();
        d().j(i);
    }

    @Override // defpackage.bu, android.app.Dialog
    public void setContentView(View view) {
        c();
        d().k(view);
    }

    @Override // defpackage.bu, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        d().l(view, layoutParams);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        d().m(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        d().m(charSequence);
    }
}
