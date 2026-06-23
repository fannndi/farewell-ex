package defpackage;

/* loaded from: classes.dex */
public final class jb extends q11 {

    /* renamed from: a, reason: collision with root package name */
    public final p11 f472a;
    public final o11 b;

    public jb(p11 p11Var, o11 o11Var) {
        this.f472a = p11Var;
        this.b = o11Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q11) {
            q11 q11Var = (q11) obj;
            p11 p11Var = this.f472a;
            if (p11Var != null ? p11Var.equals(((jb) q11Var).f472a) : ((jb) q11Var).f472a == null) {
                o11 o11Var = this.b;
                if (o11Var != null ? o11Var.equals(((jb) q11Var).b) : ((jb) q11Var).b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        p11 p11Var = this.f472a;
        int hashCode = ((p11Var == null ? 0 : p11Var.hashCode()) ^ 1000003) * 1000003;
        o11 o11Var = this.b;
        return hashCode ^ (o11Var != null ? o11Var.hashCode() : 0);
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f472a + ", mobileSubtype=" + this.b + "}";
    }
}
