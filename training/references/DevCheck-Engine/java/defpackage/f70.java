package defpackage;

import android.animation.TimeInterpolator;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class f70 implements TimeInterpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f267a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        switch (this.f267a) {
            case 0:
                return f;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                float f8 = 1.0f - f;
                if (f8 < 0.36363637f) {
                    f4 = 7.5625f * f8 * f8;
                } else {
                    if (f8 < 0.72727275f) {
                        float f9 = f8 - 0.54545456f;
                        f2 = 7.5625f * f9 * f9;
                        f3 = 0.75f;
                    } else if (f8 < 0.90909094f) {
                        float f10 = f8 - 0.8181818f;
                        f2 = 7.5625f * f10 * f10;
                        f3 = 0.9375f;
                    } else {
                        float f11 = f8 - 0.95454544f;
                        f2 = 7.5625f * f11 * f11;
                        f3 = 0.984375f;
                    }
                    f4 = f2 + f3;
                }
                return 1.0f - f4;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                if (f < 0.36363637f) {
                    return 7.5625f * f * f;
                }
                if (f < 0.72727275f) {
                    float f12 = f - 0.54545456f;
                    f5 = 7.5625f * f12 * f12;
                    f6 = 0.75f;
                } else if (f < 0.90909094f) {
                    float f13 = f - 0.8181818f;
                    f5 = 7.5625f * f13 * f13;
                    f6 = 0.9375f;
                } else {
                    float f14 = f - 0.95454544f;
                    f5 = 7.5625f * f14 * f14;
                    f6 = 0.984375f;
                }
                return f5 + f6;
            default:
                float f15 = f * 2.0f;
                if (f15 < 1.0f) {
                    f7 = 0.5f * f15;
                } else {
                    float f16 = f15 - 1.0f;
                    f7 = ((f16 - 2.0f) * f16) - 1.0f;
                    f15 = -0.5f;
                }
                return f7 * f15;
        }
    }
}
