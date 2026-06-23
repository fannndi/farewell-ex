package defpackage;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class a72 implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b72 f14a;

    public a72(b72 b72Var) {
        this.f14a = b72Var;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.f14a.u.getInterpolation(f);
    }
}
