package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class gb extends zs0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f326a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final q11 g;

    public gb(long j, Integer num, long j2, byte[] bArr, String str, long j3, q11 q11Var) {
        this.f326a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = q11Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zs0) {
            zs0 zs0Var = (zs0) obj;
            gb gbVar = (gb) zs0Var;
            if (this.f326a == gbVar.f326a) {
                Integer num = gbVar.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.c == gbVar.c) {
                        if (Arrays.equals(this.d, zs0Var instanceof gb ? ((gb) zs0Var).d : gbVar.d)) {
                            String str = gbVar.e;
                            String str2 = this.e;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                if (this.f == gbVar.f) {
                                    q11 q11Var = gbVar.g;
                                    q11 q11Var2 = this.g;
                                    if (q11Var2 != null ? q11Var2.equals(q11Var) : q11Var == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f326a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.c;
        int hashCode2 = (((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f;
        int i2 = (hashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        q11 q11Var = this.g;
        return i2 ^ (q11Var != null ? q11Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f326a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }
}
