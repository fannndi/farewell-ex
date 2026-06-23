package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* loaded from: classes.dex */
public final class s1 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ ActionBarOverlayLayout h;

    public /* synthetic */ s1(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.g = i;
        this.h = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        ActionBarOverlayLayout actionBarOverlayLayout = this.h;
        switch (i) {
            case 0:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.C = actionBarOverlayLayout.j.animate().translationY(0.0f).setListener(actionBarOverlayLayout.D);
                break;
            default:
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.C = actionBarOverlayLayout.j.animate().translationY(-actionBarOverlayLayout.j.getHeight()).setListener(actionBarOverlayLayout.D);
                break;
        }
    }
}
