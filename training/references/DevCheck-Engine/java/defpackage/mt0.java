package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import flar2.devcheck.MainActivity;

/* loaded from: classes.dex */
public final class mt0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View g;
    public final /* synthetic */ MainActivity h;

    public mt0(MainActivity mainActivity, View view) {
        this.h = mainActivity;
        this.g = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        MainActivity mainActivity = this.h;
        if (!mainActivity.F) {
            return false;
        }
        mainActivity.S = true;
        mainActivity.R.removeCallbacks(mainActivity.T);
        this.g.getViewTreeObserver().removeOnPreDrawListener(this);
        try {
            mainActivity.reportFullyDrawn();
        } catch (Exception unused) {
        }
        return true;
    }
}
