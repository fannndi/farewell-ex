package defpackage;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class rd1 implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f887a;

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        switch (this.f887a) {
        }
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
