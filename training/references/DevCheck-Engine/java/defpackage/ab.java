package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ab extends xe {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f19a;

    public ab(ArrayList arrayList) {
        this.f19a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xe)) {
            return false;
        }
        return this.f19a.equals(((ab) ((xe) obj)).f19a);
    }

    public final int hashCode() {
        return this.f19a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f19a + "}";
    }
}
