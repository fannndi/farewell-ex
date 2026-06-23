package defpackage;

import com.google.android.material.behavior.YqV.Gvyagftz;

/* loaded from: classes.dex */
public final class fb {
    public static final fb f = new fb(10485760, 200, 10000, 604800000, 81920);

    /* renamed from: a, reason: collision with root package name */
    public final long f272a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public fb(long j, int i, int i2, long j2, int i3) {
        this.f272a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fb) {
            fb fbVar = (fb) obj;
            if (this.f272a == fbVar.f272a && this.b == fbVar.b && this.c == fbVar.c && this.d == fbVar.d && this.e == fbVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f272a;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003;
        long j2 = this.d;
        return this.e ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f272a);
        sb.append(Gvyagftz.WIJCbrwo);
        sb.append(this.b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.d);
        sb.append(", maxBlobByteSizePerRow=");
        return d51.t(sb, this.e, "}");
    }
}
