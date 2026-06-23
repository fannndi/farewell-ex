package defpackage;

/* loaded from: classes.dex */
public final class p81 {

    /* renamed from: a, reason: collision with root package name */
    public final String f776a;
    public final Long b;

    public p81(String str, Long l) {
        this.f776a = str;
        this.b = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p81)) {
            return false;
        }
        p81 p81Var = (p81) obj;
        return this.f776a.equals(p81Var.f776a) && this.b.equals(p81Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f776a.hashCode() * 31);
    }

    public final String toString() {
        return "Preference(key=" + this.f776a + ", value=" + this.b + ')';
    }
}
