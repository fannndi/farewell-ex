package defpackage;

import flar2.devcheck.benchmarkSuite.history.Hq.CGvJMCDBOmCdj;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class eb {

    /* renamed from: a, reason: collision with root package name */
    public final String f228a;
    public final Integer b;
    public final s80 c;
    public final long d;
    public final long e;
    public final Map f;

    public eb(String str, Integer num, s80 s80Var, long j, long j2, HashMap hashMap) {
        this.f228a = str;
        this.b = num;
        this.c = s80Var;
        this.d = j;
        this.e = j2;
        this.f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final yf c() {
        yf yfVar = new yf(3, false);
        String str = this.f228a;
        if (str == null) {
            jw0.f("Null transportName");
            return null;
        }
        yfVar.b = str;
        yfVar.c = this.b;
        s80 s80Var = this.c;
        if (s80Var == null) {
            jw0.f("Null encodedPayload");
            return null;
        }
        yfVar.d = s80Var;
        yfVar.e = Long.valueOf(this.d);
        yfVar.f = Long.valueOf(this.e);
        yfVar.g = new HashMap(this.f);
        return yfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eb) {
            eb ebVar = (eb) obj;
            if (this.f228a.equals(ebVar.f228a)) {
                Integer num = ebVar.b;
                Integer num2 = this.b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.c.equals(ebVar.c) && this.d == ebVar.d && this.e == ebVar.e && this.f.equals(ebVar.f)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f228a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (hashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return this.f.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f228a + ", code=" + this.b + ", encodedPayload=" + this.c + CGvJMCDBOmCdj.yWJtUy + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }
}
