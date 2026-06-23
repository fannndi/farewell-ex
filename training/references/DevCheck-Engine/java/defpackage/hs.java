package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.BitmapDrawable;

/* loaded from: classes.dex */
public final class hs extends BitmapDrawable {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f397a;
    public final Paint b;

    public hs(Resources resources, Bitmap bitmap) {
        super(resources, bitmap);
        this.f397a = new Paint(1);
        this.b = new Paint(1);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int width = getBounds().width();
        float f = width * 0.5f;
        float height = getBounds().height() * 0.5f;
        float min = Math.min(width, r1) * 0.5f;
        SweepGradient sweepGradient = new SweepGradient(f, height, new int[]{-65536, -65281, -16776961, -16711681, -16711936, -256, -65536}, new float[]{0.0f, 0.166f, 0.333f, 0.499f, 0.666f, 0.833f, 0.999f});
        Paint paint = this.f397a;
        paint.setShader(sweepGradient);
        RadialGradient radialGradient = new RadialGradient(f, height, min, -1, 16777215, Shader.TileMode.CLAMP);
        Paint paint2 = this.b;
        paint2.setShader(radialGradient);
        canvas.drawCircle(f, height, min, paint);
        canvas.drawCircle(f, height, min, paint2);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f397a.setAlpha(i);
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f397a.setColorFilter(colorFilter);
    }
}
