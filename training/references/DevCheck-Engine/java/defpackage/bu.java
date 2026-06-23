package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public class bu extends Dialog implements eq0, yj1 {
    public gq0 g;
    public final kp h;
    public final l41 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bu(Context context, int i) {
        super(context, i);
        context.getClass();
        this.h = new kp(new xj1(this, new qt(7, this)));
        this.i = new l41(new l2(28, this));
    }

    public static void b(bu buVar) {
        super.onBackPressed();
    }

    @Override // defpackage.yj1
    public final zf a() {
        return (zf) this.h.i;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        c();
        super.addContentView(view, layoutParams);
    }

    public final void c() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.i.b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            l41 l41Var = this.i;
            l41Var.getClass();
            l41Var.e = onBackInvokedDispatcher;
            l41Var.c(l41Var.g);
        }
        this.h.i(bundle);
        gq0 gq0Var = this.g;
        if (gq0Var == null) {
            gq0Var = new gq0(this);
            this.g = gq0Var;
        }
        gq0Var.d(xp0.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        onSaveInstanceState.getClass();
        this.h.j(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        gq0 gq0Var = this.g;
        if (gq0Var == null) {
            gq0Var = new gq0(this);
            this.g = gq0Var;
        }
        gq0Var.d(xp0.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        gq0 gq0Var = this.g;
        if (gq0Var == null) {
            gq0Var = new gq0(this);
            this.g = gq0Var;
        }
        gq0Var.d(xp0.ON_DESTROY);
        this.g = null;
        super.onStop();
    }

    @Override // defpackage.eq0
    public final gq0 q() {
        gq0 gq0Var = this.g;
        if (gq0Var != null) {
            return gq0Var;
        }
        gq0 gq0Var2 = new gq0(this);
        this.g = gq0Var2;
        return gq0Var2;
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        c();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        view.getClass();
        c();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        view.getClass();
        c();
        super.setContentView(view, layoutParams);
    }
}
