package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class lb {

    /* renamed from: a, reason: collision with root package name */
    public final ir f578a;
    public final HashMap b;

    public lb(ir irVar, HashMap hashMap) {
        this.f578a = irVar;
        this.b = hashMap;
    }

    public final long a(d91 d91Var, long j, int i) {
        long c = j - this.f578a.c();
        mb mbVar = (mb) this.b.get(d91Var);
        long j2 = mbVar.f622a;
        return Math.min(Math.max((long) (Math.pow(3.0d, i - 1) * j2 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j2 > 1 ? j2 : 2L) * r12))), c), mbVar.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lb)) {
            return false;
        }
        lb lbVar = (lb) obj;
        return this.f578a.equals(lbVar.f578a) && this.b.equals(lbVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.f578a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f578a + ", values=" + this.b + "}";
    }
}
