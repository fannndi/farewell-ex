package defpackage;

/* loaded from: classes.dex */
public final class kb {

    /* renamed from: a, reason: collision with root package name */
    public final long f524a;
    public final nb b;
    public final eb c;

    public kb(long j, nb nbVar, eb ebVar) {
        this.f524a = j;
        this.b = nbVar;
        this.c = ebVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kb)) {
            return false;
        }
        kb kbVar = (kb) obj;
        return this.f524a == kbVar.f524a && this.b.equals(kbVar.b) && this.c.equals(kbVar.c);
    }

    public final int hashCode() {
        long j = this.f524a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f524a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
