package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class i70 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final int f413a;
    public final float b;
    public final boolean c;
    public final Paint d;
    public final RectF e;

    public i70(float f, int i, boolean z) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new RectF();
        this.f413a = i;
        this.b = f;
        this.c = z;
        paint.setDither(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f = this.b;
        canvas.drawRoundRect(this.e, f, f, this.d);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.e.set(rect);
        float width = rect.width();
        float height = rect.height();
        int i = this.f413a;
        int e = ts.e(i, 0);
        int e2 = ts.e(i, 14);
        if (this.c) {
            e2 = ts.e(i, 7);
        }
        this.d.setShader(new LinearGradient(width, height, 0.0f, 0.0f, new int[]{e, e2, i}, new float[]{0.0f, 0.6f, 0.8f}, Shader.TileMode.CLAMP));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.d.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.d.setColorFilter(colorFilter);
    }
}
