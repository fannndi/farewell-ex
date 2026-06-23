package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class tq implements nx {

    /* renamed from: a, reason: collision with root package name */
    public final float f1000a;

    public tq(float f) {
        this.f1000a = f;
    }

    @Override // defpackage.nx
    public final float a(RectF rectF) {
        return pr.j(this.f1000a, 0.0f, Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tq) && this.f1000a == ((tq) obj).f1000a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1000a)});
    }
}
