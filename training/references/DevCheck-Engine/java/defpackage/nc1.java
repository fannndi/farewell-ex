package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class nc1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f674a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public nc1(int i, String str, String str2, String str3, String str4) {
        this.f674a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nc1)) {
            return false;
        }
        nc1 nc1Var = (nc1) obj;
        return this.f674a == nc1Var.f674a && this.b.equals(nc1Var.b) && this.c.equals(nc1Var.c) && this.d.equals(nc1Var.d) && this.e.equals(nc1Var.e);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f674a), this.b, this.c, this.d, this.e);
    }
}
