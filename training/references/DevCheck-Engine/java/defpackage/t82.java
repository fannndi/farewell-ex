package defpackage;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class t82 extends s82 {
    @Override // defpackage.s82
    public final void L(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // defpackage.s82
    public final void M(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // defpackage.s82
    public final void N(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // defpackage.s82
    public final void O(ViewGroup viewGroup, Matrix matrix) {
        viewGroup.transformMatrixToLocal(matrix);
    }

    @Override // defpackage.md2
    public final float l(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }

    @Override // defpackage.md2
    public final void x(View view, float f) {
        view.setTransitionAlpha(f);
    }
}
