package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class ma2 {

    /* renamed from: a, reason: collision with root package name */
    public la2 f621a;

    public ma2(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f621a = new ka2(u21.j(i, interpolator, j));
        } else {
            this.f621a = new ia2(i, interpolator, j);
        }
    }
}
