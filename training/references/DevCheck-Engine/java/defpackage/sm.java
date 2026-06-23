package defpackage;

import android.widget.AbsListView;
import android.widget.Button;
import flar2.devcheck.cputimes.CPUTimeActivity;

/* loaded from: classes.dex */
public final class sm implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Button f943a;
    public final /* synthetic */ Button b;
    public final /* synthetic */ CPUTimeActivity c;

    public sm(CPUTimeActivity cPUTimeActivity, Button button, Button button2) {
        this.c = cPUTimeActivity;
        this.f943a = button;
        this.b = button2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003e  */
    @Override // android.widget.AbsListView.OnScrollListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onScroll(android.widget.AbsListView r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            flar2.devcheck.cputimes.CPUTimeActivity r3 = r2.c
            android.widget.ListView r4 = r3.F
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L2e
            int r4 = r4.getChildCount()
            if (r4 <= 0) goto L2e
            android.widget.ListView r4 = r3.F
            int r4 = r4.getFirstVisiblePosition()
            if (r4 != 0) goto L18
            r4 = r5
            goto L19
        L18:
            r4 = r6
        L19:
            android.widget.ListView r0 = r3.F
            android.view.View r0 = r0.getChildAt(r6)
            int r0 = r0.getTop()
            if (r0 != 0) goto L27
            r0 = r5
            goto L28
        L27:
            r0 = r6
        L28:
            if (r4 == 0) goto L2e
            if (r0 == 0) goto L2e
            r4 = r5
            goto L2f
        L2e:
            r4 = r6
        L2f:
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout r0 = r3.H
            r0.setEnabled(r4)
            android.widget.ListView r4 = r3.F
            android.view.View r4 = r4.getChildAt(r6)
            if (r4 != 0) goto L3e
            r4 = r6
            goto L56
        L3e:
            android.widget.ListView r0 = r3.F
            int r0 = r0.getFirstVisiblePosition()
            int r1 = r4.getTop()
            if (r0 < r5) goto L4d
            int r5 = r3.S
            goto L4e
        L4d:
            r5 = r6
        L4e:
            int r1 = -r1
            int r4 = r4.getHeight()
            int r4 = r4 * r0
            int r4 = r4 + r1
            int r4 = r4 + r5
        L56:
            android.view.View r5 = r3.Q
            int r4 = -r4
            int r0 = r3.T
            int r0 = java.lang.Math.max(r4, r0)
            float r0 = (float) r0
            r5.setTranslationY(r0)
            android.view.View r5 = r3.R
            int r0 = r3.T
            int r0 = java.lang.Math.max(r4, r0)
            float r0 = (float) r0
            r5.setTranslationY(r0)
            com.google.android.material.appbar.MaterialToolbar r5 = r3.P
            int r4 = r4 / 2
            int r0 = r3.T
            int r4 = java.lang.Math.max(r4, r0)
            float r4 = (float) r4
            r5.setTranslationY(r4)
            android.view.View r4 = r3.Q
            float r4 = r4.getTranslationY()
            int r5 = r3.T
            float r5 = (float) r5
            float r4 = r4 / r5
            r5 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = java.lang.Math.min(r4, r0)
            float r4 = java.lang.Math.max(r5, r4)
            r5 = 1077936128(0x40400000, float:3.0)
            float r4 = r4 * r5
            float r0 = r0 - r4
            android.widget.Button r4 = r2.f943a
            r4.setAlpha(r0)
            android.widget.Button r2 = r2.b
            r2.setAlpha(r0)
            android.widget.Spinner r2 = r3.O     // Catch: java.lang.Exception -> Lb9
            r2.setAlpha(r0)     // Catch: java.lang.Exception -> Lb9
            r2 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 * r2
            int r2 = java.lang.Math.round(r0)     // Catch: java.lang.Exception -> Lb9
            android.widget.Spinner r3 = r3.O     // Catch: java.lang.Exception -> Lb9
            android.graphics.drawable.Drawable r3 = r3.getBackground()     // Catch: java.lang.Exception -> Lb9
            int r2 = java.lang.Math.max(r2, r6)     // Catch: java.lang.Exception -> Lb9
            r3.setAlpha(r2)     // Catch: java.lang.Exception -> Lb9
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sm.onScroll(android.widget.AbsListView, int, int, int):void");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
