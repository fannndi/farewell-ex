package defpackage;

import android.animation.TimeInterpolator;

/* loaded from: classes.dex */
public final class ey0 {

    /* renamed from: a, reason: collision with root package name */
    public long f253a;
    public long b;
    public TimeInterpolator c;
    public int d;
    public int e;

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : o4.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ey0)) {
            return false;
        }
        ey0 ey0Var = (ey0) obj;
        if (this.f253a == ey0Var.f253a && this.b == ey0Var.b && this.d == ey0Var.d && this.e == ey0Var.e) {
            return a().getClass().equals(ey0Var.a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f253a;
        long j2 = this.b;
        return ((((a().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(ey0.class.getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(this.f253a);
        sb.append(" duration: ");
        sb.append(this.b);
        sb.append(" interpolator: ");
        sb.append(a().getClass());
        sb.append(" repeatCount: ");
        sb.append(this.d);
        sb.append(" repeatMode: ");
        return d51.t(sb, this.e, "}\n");
    }
}
