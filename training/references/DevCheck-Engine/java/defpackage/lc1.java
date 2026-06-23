package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class lc1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f582a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final boolean g;
    public final int h;
    public final mc1 i;
    public final String j;
    public final String k;
    public final String l;
    public final nc1 m;

    public lc1(String str, int i, String str2, String str3, String str4, int i2, boolean z, int i3, mc1 mc1Var, String str5, String str6, String str7, nc1 nc1Var) {
        this.f582a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = z;
        this.h = i3;
        this.i = mc1Var;
        this.j = str5;
        this.k = str6;
        this.l = str7;
        this.m = nc1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lc1)) {
            return false;
        }
        lc1 lc1Var = (lc1) obj;
        return this.b == lc1Var.b && this.f == lc1Var.f && this.g == lc1Var.g && this.h == lc1Var.h && this.f582a.equals(lc1Var.f582a) && this.c.equals(lc1Var.c) && this.d.equals(lc1Var.d) && this.e.equals(lc1Var.e) && Objects.equals(this.i, lc1Var.i) && Objects.equals(this.j, lc1Var.j) && this.k.equals(lc1Var.k) && this.l.equals(lc1Var.l) && Objects.equals(this.m, lc1Var.m);
    }

    public final int hashCode() {
        return Objects.hash(this.f582a, Integer.valueOf(this.b), this.c, this.d, this.e, Integer.valueOf(this.f), Boolean.valueOf(this.g), Integer.valueOf(this.h), this.i, this.j, this.k, this.l, this.m);
    }
}
