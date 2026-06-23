package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes.dex */
public final class so {
    public static final so c = new so(yr.i0(new ArrayList()), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f945a;
    public final bw0 b;

    public so(Set set, bw0 bw0Var) {
        this.f945a = set;
        this.b = bw0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof so)) {
            return false;
        }
        so soVar = (so) obj;
        return soVar.f945a.equals(this.f945a) && ym0.b(soVar.b, this.b);
    }

    public final int hashCode() {
        int hashCode = (this.f945a.hashCode() + 1517) * 41;
        bw0 bw0Var = this.b;
        return hashCode + (bw0Var != null ? bw0Var.hashCode() : 0);
    }
}
