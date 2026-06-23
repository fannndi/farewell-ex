package defpackage;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class bn2 extends dn2 {
    @Override // defpackage.dn2
    public final double e(long j, Object obj) {
        return Double.longBitsToDouble(((Unsafe) this.f202a).getLong(obj, j));
    }

    @Override // defpackage.dn2
    public final float f(long j, Object obj) {
        return Float.intBitsToFloat(((Unsafe) this.f202a).getInt(obj, j));
    }

    @Override // defpackage.dn2
    public final void g(Object obj, long j, boolean z) {
        if (en2.g) {
            en2.c(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            en2.d(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.dn2
    public final void h(Object obj, long j, byte b) {
        if (en2.g) {
            en2.c(obj, j, b);
        } else {
            en2.d(obj, j, b);
        }
    }

    @Override // defpackage.dn2
    public final void i(Object obj, long j, double d) {
        ((Unsafe) this.f202a).putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.dn2
    public final void j(Object obj, long j, float f) {
        ((Unsafe) this.f202a).putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.dn2
    public final boolean k(long j, Object obj) {
        return en2.g ? en2.m(j, obj) : en2.n(j, obj);
    }
}
