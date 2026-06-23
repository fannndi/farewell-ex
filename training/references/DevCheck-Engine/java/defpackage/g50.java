package defpackage;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final /* synthetic */ class g50 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ i50 h;

    public /* synthetic */ g50(i50 i50Var, int i) {
        this.g = i;
        this.h = i50Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        i50 i50Var = this.h;
        switch (i) {
            case 0:
                if (!i50Var.d) {
                    i50Var.d = true;
                    i50Var.c = 0L;
                    i50Var.b = 0;
                    i50Var.e = Float.NaN;
                    Choreographer.getInstance().postFrameCallback(i50Var);
                    break;
                }
                break;
            default:
                i50Var.d = false;
                break;
        }
    }
}
