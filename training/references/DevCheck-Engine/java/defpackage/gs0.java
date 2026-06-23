package defpackage;

/* loaded from: classes.dex */
public final class gs0 extends hs0 {

    /* renamed from: a, reason: collision with root package name */
    public final t00 f351a = t00.b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gs0.class != obj.getClass()) {
            return false;
        }
        return this.f351a.equals(((gs0) obj).f351a);
    }

    public final int hashCode() {
        return this.f351a.hashCode() + (gs0.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f351a + '}';
    }
}
