package defpackage;

import android.net.NetworkRequest;
import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class lw {
    public static final lw j = new lw();

    /* renamed from: a, reason: collision with root package name */
    public final r21 f609a;
    public final h21 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final long g;
    public final long h;
    public final Set i;

    public lw() {
        this.b = new h21(null);
        this.f609a = r21.g;
        this.c = false;
        this.d = false;
        this.e = false;
        this.f = false;
        this.g = -1L;
        this.h = -1L;
        this.i = r80.g;
    }

    public lw(h21 h21Var, r21 r21Var, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, LinkedHashSet linkedHashSet) {
        this.b = h21Var;
        this.f609a = r21Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = j2;
        this.h = j3;
        this.i = linkedHashSet;
    }

    public lw(lw lwVar) {
        lwVar.getClass();
        this.c = lwVar.c;
        this.d = lwVar.d;
        this.b = lwVar.b;
        this.f609a = lwVar.f609a;
        this.e = lwVar.e;
        this.f = lwVar.f;
        this.i = lwVar.i;
        this.g = lwVar.g;
        this.h = lwVar.h;
    }

    public final NetworkRequest a() {
        return (NetworkRequest) this.b.f361a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !lw.class.equals(obj.getClass())) {
            return false;
        }
        lw lwVar = (lw) obj;
        if (this.c == lwVar.c && this.d == lwVar.d && this.e == lwVar.e && this.f == lwVar.f && this.g == lwVar.g && this.h == lwVar.h && ym0.b(a(), lwVar.a()) && this.f609a == lwVar.f609a) {
            return ym0.b(this.i, lwVar.i);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.f609a.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long j2 = this.g;
        int i = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.h;
        int hashCode2 = (this.i.hashCode() + ((i + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31;
        NetworkRequest a2 = a();
        return hashCode2 + (a2 != null ? a2.hashCode() : 0);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + this.f609a + ", requiresCharging=" + this.c + ", requiresDeviceIdle=" + this.d + ", requiresBatteryNotLow=" + this.e + ", requiresStorageNotLow=" + this.f + ", contentTriggerUpdateDelayMillis=" + this.g + ", contentTriggerMaxDelayMillis=" + this.h + ", contentUriTriggers=" + this.i + ", }";
    }
}
