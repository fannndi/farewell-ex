package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes.dex */
public final class jz extends vv0 {
    public static final /* synthetic */ int O = 0;
    public iz N;

    public final void F(float f, float f2, float f3, float f4) {
        RectF rectF = this.N.s;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // defpackage.vv0
    public final void h(Canvas canvas) {
        if (this.N.s.isEmpty()) {
            super.h(canvas);
            return;
        }
        canvas.save();
        int i = Build.VERSION.SDK_INT;
        iz izVar = this.N;
        if (i >= 26) {
            canvas.clipOutRect(izVar.s);
        } else {
            canvas.clipRect(izVar.s, Region.Op.DIFFERENCE);
        }
        super.h(canvas);
        canvas.restore();
    }

    @Override // defpackage.vv0, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.N = new iz(this.N);
        return this;
    }
}
