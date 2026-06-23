package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class di1 extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    public static final double f193a = Math.cos(Math.toRadians(45.0d));

    public static float a(float f, float f2, boolean z) {
        if (!z) {
            return f;
        }
        return (float) (((1.0d - f193a) * f2) + f);
    }

    public static float b(float f, float f2, boolean z) {
        if (!z) {
            return f * 1.5f;
        }
        return (float) (((1.0d - f193a) * f2) + (f * 1.5f));
    }
}
