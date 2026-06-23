package defpackage;

import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import java.util.Set;

/* loaded from: classes.dex */
public final class mb {

    /* renamed from: a, reason: collision with root package name */
    public final long f622a;
    public final long b;
    public final Set c;

    public mb(long j, long j2, Set set) {
        this.f622a = j;
        this.b = j2;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mb) {
            mb mbVar = (mb) obj;
            if (this.f622a == mbVar.f622a && this.b == mbVar.b && this.c.equals(mbVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f622a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return this.c.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f622a + jYVJoqfHJs.DIcPfhnPjEmu + this.b + ", flags=" + this.c + "}";
    }
}
