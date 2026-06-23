package defpackage;

/* loaded from: classes.dex */
public final class db {

    /* renamed from: a, reason: collision with root package name */
    public final ao2 f183a;

    public db(ao2 ao2Var) {
        this.f183a = ao2Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof db) || !this.f183a.equals(((db) obj).f183a)) {
            return false;
        }
        Object obj2 = d91.g;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        return ((this.f183a.hashCode() ^ (1000003 * 1000003)) * 1000003) ^ d91.g.hashCode();
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f183a + ", priority=" + d91.g + "}";
    }
}
