package defpackage;

/* loaded from: classes.dex */
public final class ow extends pw {

    /* renamed from: a, reason: collision with root package name */
    public final int f762a;

    public ow(int i) {
        this.f762a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ow) && this.f762a == ((ow) obj).f762a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f762a);
    }

    public final String toString() {
        return "ConstraintsNotMet(reason=" + this.f762a + ')';
    }
}
