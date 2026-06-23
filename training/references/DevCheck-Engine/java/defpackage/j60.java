package defpackage;

import android.graphics.Canvas;

/* loaded from: classes.dex */
public final class j60 extends c60 {
    public boolean h;

    @Override // defpackage.c60, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.h) {
            super.draw(canvas);
        }
    }

    @Override // defpackage.c60, android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        if (this.h) {
            super.setHotspot(f, f2);
        }
    }

    @Override // defpackage.c60, android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.h) {
            super.setHotspotBounds(i, i2, i3, i4);
        }
    }

    @Override // defpackage.c60, android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.h) {
            return this.g.setState(iArr);
        }
        return false;
    }

    @Override // defpackage.c60, android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (this.h) {
            return super.setVisible(z, z2);
        }
        return false;
    }
}
