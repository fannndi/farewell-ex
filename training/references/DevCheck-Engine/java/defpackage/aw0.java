package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class aw0 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f56a;
    public final int b;
    public final int c;
    public final Path d = new Path();
    public final Matrix e = new Matrix();

    public aw0(Context context) {
        Paint paint = new Paint();
        this.f56a = paint;
        paint.setAntiAlias(true);
        paint.setColor(bw0.j(context, R.attr.colorControlActivated));
        paint.setStyle(Paint.Style.FILL);
        Resources resources = context.getResources();
        this.b = resources.getDimensionPixelOffset(R.dimen.afs_md2_popup_padding_start);
        this.c = resources.getDimensionPixelOffset(R.dimen.afs_md2_popup_padding_end);
    }

    public static void a(Path path, float f, float f2, float f3, float f4, float f5) {
        path.arcTo(f - f3, f2 - f3, f + f3, f2 + f3, f4, f5, false);
    }

    public final void b() {
        Path path = this.d;
        path.reset();
        float width = getBounds().width();
        float height = r6.height() / 2.0f;
        float sqrt = (float) Math.sqrt(2.0d);
        float f = sqrt * height;
        float max = Math.max(height + f, width);
        a(path, height, height, height, 90.0f, 180.0f);
        float f2 = max - f;
        a(path, f2, height, height, -90.0f, 45.0f);
        float f3 = height / 5.0f;
        a(path, max - (sqrt * f3), height, f3, -45.0f, 90.0f);
        a(path, f2, height, height, 45.0f, 45.0f);
        path.close();
        boolean z = getLayoutDirection() == 1;
        Matrix matrix = this.e;
        if (z) {
            matrix.setScale(-1.0f, 1.0f, max / 2.0f, 0.0f);
        } else {
            matrix.reset();
        }
        matrix.postTranslate(r6.left, r6.top);
        path.transform(matrix);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.drawPath(this.d, this.f56a);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        int i = Build.VERSION.SDK_INT;
        Path path = this.d;
        if (i >= 29 || path.isConvex()) {
            outline.setConvexPath(path);
        } else {
            super.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int layoutDirection = getLayoutDirection();
        int i = this.b;
        int i2 = this.c;
        if (layoutDirection == 1) {
            rect.set(i2, 0, i, 0);
        } else {
            rect.set(i, 0, i2, 0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        b();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        b();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
