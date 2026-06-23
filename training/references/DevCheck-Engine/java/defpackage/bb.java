package defpackage;

/* loaded from: classes.dex */
public final class bb extends fr {

    /* renamed from: a, reason: collision with root package name */
    public final ya f75a;

    public bb(ya yaVar) {
        this.f75a = yaVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fr)) {
            return false;
        }
        fr frVar = (fr) obj;
        Object obj2 = er.g;
        if (obj2.equals(obj2)) {
            return this.f75a.equals(((bb) frVar).f75a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f75a.hashCode() ^ ((er.g.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ClientInfo{clientType=" + er.g + ", androidClientInfo=" + this.f75a + "}";
    }
}
