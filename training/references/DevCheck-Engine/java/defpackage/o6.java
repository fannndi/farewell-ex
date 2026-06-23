package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class o6 extends SeekBar {
    public final p6 g;

    public o6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        by1.a(this, getContext());
        p6 p6Var = new p6(this);
        this.g = p6Var;
        p6Var.j(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        p6 p6Var = this.g;
        o6 o6Var = p6Var.j;
        Drawable drawable = p6Var.k;
        if (drawable != null && drawable.isStateful() && drawable.setState(o6Var.getDrawableState())) {
            o6Var.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.g.k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.g.w(canvas);
    }
}
