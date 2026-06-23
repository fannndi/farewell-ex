package defpackage;

/* loaded from: classes.dex */
public final class gp {
    public static final fp b = new fp();

    /* renamed from: a, reason: collision with root package name */
    public final Object f348a;

    public /* synthetic */ gp(Object obj) {
        this.f348a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gp) {
            return ym0.b(this.f348a, ((gp) obj).f348a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f348a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f348a;
        if (obj instanceof ep) {
            return ((ep) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
