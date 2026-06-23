package defpackage;

import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public final /* synthetic */ class n61 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ p61 h;

    public /* synthetic */ n61(p61 p61Var, int i) {
        this.g = i;
        this.h = p61Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        p61 p61Var = this.h;
        switch (i) {
            case 0:
                ((InputMethodManager) p61Var.i0().getSystemService("input_method")).showSoftInput(p61Var.f0, 1);
                break;
            default:
                p61Var.g0.setVisibility(8);
                break;
        }
    }
}
