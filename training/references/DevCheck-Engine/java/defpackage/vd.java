package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class vd implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ xd h;

    public /* synthetic */ vd(xd xdVar, int i) {
        this.g = i;
        this.h = xdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        xd xdVar = this.h;
        switch (i) {
            case 0:
                if (xdVar.j > 0) {
                    xdVar.k = SystemClock.uptimeMillis();
                }
                xdVar.setVisibility(0);
                break;
            default:
                ((b60) xdVar.getCurrentDrawable()).d(false, false, true);
                if ((xdVar.getProgressDrawable() == null || !xdVar.getProgressDrawable().isVisible()) && (xdVar.getIndeterminateDrawable() == null || !xdVar.getIndeterminateDrawable().isVisible())) {
                    xdVar.setVisibility(4);
                }
                xdVar.k = -1L;
                break;
        }
    }
}
