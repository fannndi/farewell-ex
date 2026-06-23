package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class pg1 implements Serializable {
    public final Throwable g;

    public pg1(Throwable th) {
        th.getClass();
        this.g = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pg1) {
            return ym0.b(this.g, ((pg1) obj).g);
        }
        return false;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.g + ')';
    }
}
