package defpackage;

/* loaded from: classes.dex */
public final class ra0 extends o31 {
    public static final p31 j;
    public float h = 0.0f;
    public float i = 0.0f;

    static {
        p31 a2 = p31.a(rt0.t, new ra0());
        j = a2;
        a2.f = 0.5f;
    }

    @Override // defpackage.o31
    public final o31 a() {
        return new ra0();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof ra0) {
            ra0 ra0Var = (ra0) obj;
            if (this.h == ra0Var.h && this.i == ra0Var.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.i) ^ Float.floatToIntBits(this.h);
    }

    public final String toString() {
        return this.h + "x" + this.i;
    }
}
