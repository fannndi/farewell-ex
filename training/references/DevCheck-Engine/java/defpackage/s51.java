package defpackage;

/* loaded from: classes.dex */
public final class s51 implements uq {

    /* renamed from: a, reason: collision with root package name */
    public final Class f919a;

    public s51(Class cls) {
        this.f919a = cls;
    }

    @Override // defpackage.uq
    public final Class a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof s51) {
            return this.f919a.equals(((s51) obj).f919a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f919a.hashCode();
    }

    public final String toString() {
        return this.f919a.toString() + " (Kotlin reflection is not available)";
    }
}
