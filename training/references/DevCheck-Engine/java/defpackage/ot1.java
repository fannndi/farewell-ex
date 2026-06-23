package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* loaded from: classes.dex */
public final class ot1 extends xc1 {
    public int d;
    public int e = -1;
    public final /* synthetic */ SwipeDismissBehavior f;

    public ot1(SwipeDismissBehavior swipeDismissBehavior) {
        this.f = swipeDismissBehavior;
    }

    @Override // defpackage.xc1
    public final void A(int i) {
        ke keVar = this.f.b;
        if (keVar != null) {
            me meVar = keVar.g.t;
            if (i == 0) {
                gr.s().A(meVar);
            } else if (i == 1 || i == 2) {
                gr.s().y(meVar);
            }
        }
    }

    @Override // defpackage.xc1
    public final void B(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.f;
        float f = width * swipeDismissBehavior.f;
        float width2 = view.getWidth() * swipeDismissBehavior.g;
        float abs = Math.abs(i - this.d);
        if (abs <= f) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x004e, code lost:
    
        if (java.lang.Math.abs(r9.getLeft() - r8.d) >= java.lang.Math.round(r9.getWidth() * 0.5f)) goto L27;
     */
    @Override // defpackage.xc1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.e = r11
            int r11 = r9.getWidth()
            r0 = 0
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            r2 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r3 = r8.f
            r4 = 1
            if (r1 == 0) goto L37
            int r5 = r9.getLayoutDirection()
            if (r5 != r4) goto L18
            r5 = r4
            goto L19
        L18:
            r5 = r2
        L19:
            int r6 = r3.e
            r7 = 2
            if (r6 != r7) goto L1f
            goto L50
        L1f:
            if (r6 != 0) goto L2b
            if (r5 == 0) goto L28
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L28:
            if (r1 <= 0) goto L65
            goto L50
        L2b:
            if (r6 != r4) goto L65
            if (r5 == 0) goto L32
            if (r1 <= 0) goto L65
            goto L50
        L32:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L65
            goto L50
        L37:
            int r1 = r9.getLeft()
            int r5 = r8.d
            int r1 = r1 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            r6 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r5) goto L65
        L50:
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 < 0) goto L5f
            int r10 = r9.getLeft()
            int r0 = r8.d
            if (r10 >= r0) goto L5d
            goto L5f
        L5d:
            int r0 = r0 + r11
            goto L63
        L5f:
            int r8 = r8.d
            int r0 = r8 - r11
        L63:
            r2 = r4
            goto L67
        L65:
            int r0 = r8.d
        L67:
            b72 r8 = r3.f141a
            int r10 = r9.getTop()
            boolean r8 = r8.n(r0, r10)
            if (r8 == 0) goto L7c
            qm1 r8 = new qm1
            r8.<init>(r3, r9, r2)
            r9.postOnAnimation(r8)
            return
        L7c:
            if (r2 == 0) goto L85
            ke r8 = r3.b
            if (r8 == 0) goto L85
            r8.a(r9)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ot1.C(android.view.View, float, float):void");
    }

    @Override // defpackage.xc1
    public final boolean J(View view, int i) {
        int i2 = this.e;
        return (i2 == -1 || i2 == i) && this.f.w(view);
    }

    @Override // defpackage.xc1
    public final int l(View view, int i) {
        int width;
        int width2;
        boolean z = view.getLayoutDirection() == 1;
        int i2 = this.f.e;
        if (i2 == 0) {
            width = this.d;
            if (z) {
                width -= view.getWidth();
                width2 = this.d;
            } else {
                width2 = view.getWidth() + width;
            }
        } else {
            int i3 = this.d;
            if (i2 != 1) {
                width = i3 - view.getWidth();
                width2 = this.d + view.getWidth();
            } else if (z) {
                width2 = view.getWidth() + i3;
                width = i3;
            } else {
                width = i3 - view.getWidth();
                width2 = this.d;
            }
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.xc1
    public final int m(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.xc1
    public final int u(View view) {
        return view.getWidth();
    }

    @Override // defpackage.xc1
    public final void z(View view, int i) {
        this.e = i;
        this.d = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.f;
            swipeDismissBehavior.d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.d = false;
        }
    }
}
