package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class of1 implements nx {

    /* renamed from: a, reason: collision with root package name */
    public final float f730a;

    public of1(float f) {
        this.f730a = f;
    }

    @Override // defpackage.nx
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f730a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof of1) && this.f730a == ((of1) obj).f730a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f730a)});
    }

    public final String toString() {
        return d51.t(new StringBuilder(), (int) (this.f730a * 100.0f), "%");
    }
}
