package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class uy {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1057a = new LinkedHashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof uy) {
            return ym0.b(this.f1057a, ((uy) obj).f1057a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1057a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.f1057a + ')';
    }
}
