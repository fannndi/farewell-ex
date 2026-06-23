package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;

/* loaded from: classes.dex */
public final class na extends c60 {
    @Override // defpackage.c60, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (getLayoutDirection() != 1) {
            super.draw(canvas);
            return;
        }
        float exactCenterX = getBounds().exactCenterX();
        canvas.scale(-1.0f, 1.0f, exactCenterX, 0.0f);
        super.draw(canvas);
        canvas.scale(-1.0f, 1.0f, exactCenterX, 0.0f);
    }

    @Override // defpackage.c60, android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        boolean padding = this.g.getPadding(rect);
        if (getLayoutDirection() == 1) {
            int i = rect.left;
            rect.left = rect.right;
            rect.right = i;
        }
        return padding;
    }

    @Override // defpackage.c60, android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        super.onLayoutDirectionChanged(i);
        return true;
    }
}
