package defpackage;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/* loaded from: classes.dex */
public final class rs extends LayerDrawable {
    public final int g;

    public rs(Drawable[] drawableArr, int i) {
        super(drawableArr);
        this.g = i;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int i;
        int length = iArr.length;
        int i2 = 0;
        while (true) {
            i = this.g;
            if (i2 >= length) {
                setColorFilter(i, PorterDuff.Mode.SRC_ATOP);
                break;
            }
            int i3 = iArr[i2];
            if (i3 == 16842919 || i3 == 16842908) {
                break;
            }
            i2++;
        }
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * 0.7f;
        setColorFilter(Color.HSVToColor(fArr), PorterDuff.Mode.SRC_ATOP);
        return super.onStateChange(iArr);
    }
}
