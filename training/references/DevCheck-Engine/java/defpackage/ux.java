package defpackage;

/* loaded from: classes.dex */
public final class ux extends p {
    public static final pg0 i = new pg0();
    public final String h;

    public ux() {
        super(i);
        this.h = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ux) && ym0.b(this.h, ((ux) obj).h);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return "CoroutineName(" + this.h + ')';
    }
}
