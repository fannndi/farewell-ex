package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l implements nx {

    /* renamed from: a, reason: collision with root package name */
    public final float f559a;

    public l(float f) {
        this.f559a = f;
    }

    @Override // defpackage.nx
    public final float a(RectF rectF) {
        return this.f559a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f559a == ((l) obj).f559a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f559a)});
    }

    public final String toString() {
        return this.f559a + "px";
    }
}
