package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class hv1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f402a;
    public final String b;
    public final boolean c;
    public final int d;
    public final String e;
    public final int f;
    public final int g;

    public hv1(String str, String str2, boolean z, int i, String str3, int i2) {
        str.getClass();
        str2.getClass();
        this.f402a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
        this.e = str3;
        this.f = i2;
        String upperCase = str2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        this.g = as1.d0(upperCase, "INT") ? 3 : (as1.d0(upperCase, "CHAR") || as1.d0(upperCase, "CLOB") || as1.d0(upperCase, "TEXT")) ? 2 : as1.d0(upperCase, "BLOB") ? 5 : (as1.d0(upperCase, "REAL") || as1.d0(upperCase, "FLOA") || as1.d0(upperCase, "DOUB")) ? 4 : 1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hv1) {
                boolean z = this.d > 0;
                hv1 hv1Var = (hv1) obj;
                int i = hv1Var.f;
                if (z == (hv1Var.d > 0) && ym0.b(this.f402a, hv1Var.f402a) && this.c == hv1Var.c) {
                    String str = hv1Var.e;
                    int i2 = this.f;
                    String str2 = this.e;
                    if ((i2 != 1 || i != 2 || str2 == null || op0.h(str2, str)) && ((i2 != 2 || i != 1 || str == null || op0.h(str, str2)) && ((i2 == 0 || i2 != i || (str2 == null ? str == null : op0.h(str2, str))) && this.g == hv1Var.g))) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.f402a.hashCode() * 31) + this.g) * 31) + (this.c ? 1231 : 1237)) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Column {\n            |   name = '");
        sb.append(this.f402a);
        sb.append("',\n            |   type = '");
        sb.append(this.b);
        sb.append("',\n            |   affinity = '");
        sb.append(this.g);
        sb.append("',\n            |   notNull = '");
        sb.append(this.c);
        sb.append("',\n            |   primaryKeyPosition = '");
        sb.append(this.d);
        sb.append("',\n            |   defaultValue = '");
        String str = this.e;
        if (str == null) {
            str = "undefined";
        }
        sb.append(str);
        sb.append("'\n            |}\n        ");
        return bs1.T(bs1.V(sb.toString()));
    }
}
