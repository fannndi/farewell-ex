package defpackage;

/* loaded from: classes.dex */
public final class es0 extends hs0 {

    /* renamed from: a, reason: collision with root package name */
    public final t00 f247a = t00.b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || es0.class != obj.getClass()) {
            return false;
        }
        return this.f247a.equals(((es0) obj).f247a);
    }

    public final int hashCode() {
        return this.f247a.hashCode() + (es0.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f247a + '}';
    }
}
