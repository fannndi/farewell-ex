package defpackage;

import androidx.work.OverwritingInputMerger;

/* loaded from: classes.dex */
public final class gc2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f332a;
    public yb2 b;
    public final String c;
    public final String d;
    public final t00 e;
    public final t00 f;
    public final long g;
    public final long h;
    public final long i;
    public final lw j;
    public final int k;
    public final cc l;
    public final long m;
    public long n;
    public final long o;
    public final long p;
    public boolean q;
    public final l51 r;
    public final int s;
    public final int t;
    public final long u;
    public final int v;
    public final int w;
    public String x;
    public final Boolean y;

    static {
        ai1.k("WorkSpec");
    }

    public gc2(String str, yb2 yb2Var, String str2, String str3, t00 t00Var, t00 t00Var2, long j, long j2, long j3, lw lwVar, int i, cc ccVar, long j4, long j5, long j6, long j7, boolean z, l51 l51Var, int i2, int i3, long j8, int i4, int i5, String str4, Boolean bool) {
        str.getClass();
        yb2Var.getClass();
        str2.getClass();
        str3.getClass();
        t00Var.getClass();
        t00Var2.getClass();
        lwVar.getClass();
        ccVar.getClass();
        l51Var.getClass();
        this.f332a = str;
        this.b = yb2Var;
        this.c = str2;
        this.d = str3;
        this.e = t00Var;
        this.f = t00Var2;
        this.g = j;
        this.h = j2;
        this.i = j3;
        this.j = lwVar;
        this.k = i;
        this.l = ccVar;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.p = j7;
        this.q = z;
        this.r = l51Var;
        this.s = i2;
        this.t = i3;
        this.u = j8;
        this.v = i4;
        this.w = i5;
        this.x = str4;
        this.y = bool;
    }

    public /* synthetic */ gc2(String str, yb2 yb2Var, String str2, String str3, t00 t00Var, t00 t00Var2, long j, long j2, long j3, lw lwVar, int i, cc ccVar, long j4, long j5, long j6, long j7, boolean z, l51 l51Var, int i2, long j8, int i3, int i4, String str4, Boolean bool, int i5) {
        this(str, (i5 & 2) != 0 ? yb2.g : yb2Var, str2, (i5 & 8) != 0 ? OverwritingInputMerger.class.getName() : str3, (i5 & 16) != 0 ? t00.b : t00Var, (i5 & 32) != 0 ? t00.b : t00Var2, (i5 & 64) != 0 ? 0L : j, (i5 & rt0.s) != 0 ? 0L : j2, (i5 & rt0.t) != 0 ? 0L : j3, (i5 & rt0.u) != 0 ? lw.j : lwVar, (i5 & rt0.v) != 0 ? 0 : i, (i5 & rt0.w) != 0 ? cc.g : ccVar, (i5 & rt0.x) != 0 ? 30000L : j4, (i5 & rt0.y) != 0 ? -1L : j5, (i5 & rt0.z) == 0 ? j6 : 0L, (32768 & i5) != 0 ? -1L : j7, (65536 & i5) != 0 ? false : z, (131072 & i5) != 0 ? l51.g : l51Var, (262144 & i5) != 0 ? 0 : i2, 0, (1048576 & i5) != 0 ? Long.MAX_VALUE : j8, (2097152 & i5) != 0 ? 0 : i3, (4194304 & i5) != 0 ? -256 : i4, (8388608 & i5) != 0 ? null : str4, (i5 & 16777216) != 0 ? Boolean.FALSE : bool);
    }

    public static gc2 b(gc2 gc2Var, String str, t00 t00Var) {
        String str2 = gc2Var.f332a;
        yb2 yb2Var = gc2Var.b;
        String str3 = gc2Var.d;
        t00 t00Var2 = gc2Var.f;
        long j = gc2Var.g;
        long j2 = gc2Var.h;
        long j3 = gc2Var.i;
        lw lwVar = gc2Var.j;
        int i = gc2Var.k;
        cc ccVar = gc2Var.l;
        long j4 = gc2Var.m;
        long j5 = gc2Var.n;
        long j6 = gc2Var.o;
        long j7 = gc2Var.p;
        boolean z = gc2Var.q;
        l51 l51Var = gc2Var.r;
        int i2 = gc2Var.s;
        int i3 = gc2Var.t;
        long j8 = gc2Var.u;
        int i4 = gc2Var.v;
        int i5 = gc2Var.w;
        String str4 = gc2Var.x;
        Boolean bool = gc2Var.y;
        str2.getClass();
        yb2Var.getClass();
        str3.getClass();
        t00Var2.getClass();
        lwVar.getClass();
        ccVar.getClass();
        l51Var.getClass();
        return new gc2(str2, yb2Var, str, str3, t00Var, t00Var2, j, j2, j3, lwVar, i, ccVar, j4, j5, j6, j7, z, l51Var, i2, i3, j8, i4, i5, str4, bool);
    }

    public final long a() {
        yb2 yb2Var = this.b;
        yb2 yb2Var2 = yb2.g;
        int i = this.k;
        boolean z = yb2Var == yb2Var2 && i > 0;
        long j = this.n;
        boolean c = c();
        cc ccVar = this.l;
        ccVar.getClass();
        long j2 = this.u;
        int i2 = this.s;
        if (j2 != Long.MAX_VALUE && c) {
            if (i2 != 0) {
                long j3 = j + 900000;
                if (j2 < j3) {
                    return j3;
                }
            }
            return j2;
        }
        if (z) {
            cc ccVar2 = cc.h;
            long j4 = this.m;
            long scalb = ccVar == ccVar2 ? j4 * i : (long) Math.scalb(j4, i - 1);
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j + scalb;
        }
        long j5 = this.g;
        if (!c) {
            if (j == -1) {
                return Long.MAX_VALUE;
            }
            return j + j5;
        }
        long j6 = this.h;
        long j7 = i2 == 0 ? j + j5 : j + j6;
        long j8 = this.i;
        return (j8 == j6 || i2 != 0) ? j7 : (j6 - j8) + j7;
    }

    public final boolean c() {
        return this.h != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc2)) {
            return false;
        }
        gc2 gc2Var = (gc2) obj;
        return ym0.b(this.f332a, gc2Var.f332a) && this.b == gc2Var.b && ym0.b(this.c, gc2Var.c) && ym0.b(this.d, gc2Var.d) && ym0.b(this.e, gc2Var.e) && ym0.b(this.f, gc2Var.f) && this.g == gc2Var.g && this.h == gc2Var.h && this.i == gc2Var.i && ym0.b(this.j, gc2Var.j) && this.k == gc2Var.k && this.l == gc2Var.l && this.m == gc2Var.m && this.n == gc2Var.n && this.o == gc2Var.o && this.p == gc2Var.p && this.q == gc2Var.q && this.r == gc2Var.r && this.s == gc2Var.s && this.t == gc2Var.t && this.u == gc2Var.u && this.v == gc2Var.v && this.w == gc2Var.w && ym0.b(this.x, gc2Var.x) && ym0.b(this.y, gc2Var.y);
    }

    public final int hashCode() {
        int hashCode = (Integer.hashCode(this.w) + ((Integer.hashCode(this.v) + ((Long.hashCode(this.u) + ((Integer.hashCode(this.t) + ((Integer.hashCode(this.s) + ((this.r.hashCode() + ((Boolean.hashCode(this.q) + ((Long.hashCode(this.p) + ((Long.hashCode(this.o) + ((Long.hashCode(this.n) + ((Long.hashCode(this.m) + ((this.l.hashCode() + ((Integer.hashCode(this.k) + ((this.j.hashCode() + ((Long.hashCode(this.i) + ((Long.hashCode(this.h) + ((Long.hashCode(this.g) + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f332a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.x;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.y;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        return "{WorkSpec: " + this.f332a + '}';
    }
}
