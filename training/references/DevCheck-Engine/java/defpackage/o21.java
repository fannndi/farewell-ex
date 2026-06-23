package defpackage;

/* loaded from: classes.dex */
public final class o21 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f714a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public o21(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.f714a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o21)) {
            return false;
        }
        o21 o21Var = (o21) obj;
        return this.f714a == o21Var.f714a && this.b == o21Var.b && this.c == o21Var.c && this.d == o21Var.d && this.e == o21Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((Boolean.hashCode(this.d) + ((Boolean.hashCode(this.c) + ((Boolean.hashCode(this.b) + (Boolean.hashCode(this.f714a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.f714a + ", isValidated=" + this.b + ", isMetered=" + this.c + ", isNotRoaming=" + this.d + ", isBlocked=" + this.e + ')';
    }
}
