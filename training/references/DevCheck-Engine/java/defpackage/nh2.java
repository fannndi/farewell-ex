package defpackage;

/* loaded from: classes.dex */
public abstract class nh2 {
    public abstract wi2 a();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nh2) {
            return a().equals(((nh2) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }
}
