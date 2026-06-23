package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.AbsSeekBar;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class p6 extends i8 {
    public final o6 j;
    public Drawable k;
    public ColorStateList l;
    public PorterDuff.Mode m;
    public boolean n;
    public boolean o;

    public p6(o6 o6Var) {
        super((AbsSeekBar) o6Var);
        this.l = null;
        this.m = null;
        this.n = false;
        this.o = false;
        this.j = o6Var;
    }

    @Override // defpackage.i8
    public final void j(AttributeSet attributeSet, int i) {
        super.j(attributeSet, R.attr.seekBarStyle);
        o6 o6Var = this.j;
        Context context = o6Var.getContext();
        int[] iArr = zb1.g;
        fh G = fh.G(R.attr.seekBarStyle, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) G.i;
        y62.n(o6Var, o6Var.getContext(), iArr, attributeSet, (TypedArray) G.i, R.attr.seekBarStyle);
        Drawable x = G.x(0);
        if (x != null) {
            o6Var.setThumb(x);
        }
        Drawable w = G.w(1);
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.k = w;
        if (w != null) {
            w.setCallback(o6Var);
            w.setLayoutDirection(o6Var.getLayoutDirection());
            if (w.isStateful()) {
                w.setState(o6Var.getDrawableState());
            }
            q();
        }
        o6Var.invalidate();
        if (typedArray.hasValue(3)) {
            this.m = z50.c(typedArray.getInt(3, -1), this.m);
            this.o = true;
        }
        if (typedArray.hasValue(2)) {
            this.l = G.v(2);
            this.n = true;
        }
        G.L();
        q();
    }

    public final void q() {
        Drawable drawable = this.k;
        if (drawable != null) {
            if (this.n || this.o) {
                Drawable mutate = drawable.mutate();
                this.k = mutate;
                if (this.n) {
                    mutate.setTintList(this.l);
                }
                if (this.o) {
                    this.k.setTintMode(this.m);
                }
                if (this.k.isStateful()) {
                    this.k.setState(this.j.getDrawableState());
                }
            }
        }
    }

    public final void w(Canvas canvas) {
        if (this.k != null) {
            int max = this.j.getMax();
            if (max > 1) {
                int intrinsicWidth = this.k.getIntrinsicWidth();
                int intrinsicHeight = this.k.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.k.setBounds(-i, -i2, i, i2);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    this.k.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
