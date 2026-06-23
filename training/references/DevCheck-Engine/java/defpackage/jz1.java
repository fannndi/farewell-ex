package defpackage;

import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final /* synthetic */ class jz1 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ Toolbar h;

    public /* synthetic */ jz1(Toolbar toolbar, int i) {
        this.g = i;
        this.h = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        Toolbar toolbar = this.h;
        switch (i) {
            case 0:
                mz1 mz1Var = toolbar.S;
                sw0 sw0Var = mz1Var == null ? null : mz1Var.h;
                if (sw0Var != null) {
                    sw0Var.collapseActionView();
                    break;
                }
                break;
            default:
                toolbar.m();
                break;
        }
    }
}
