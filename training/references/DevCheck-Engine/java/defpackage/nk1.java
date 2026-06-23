package defpackage;

/* loaded from: classes.dex */
public final class nk1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f688a;
    public final String b;
    public final String c;
    public final double d;
    public final boolean e;
    public final double f;
    public final boolean g;

    public nk1(String str, String str2, String str3, double d, boolean z, double d2, boolean z2) {
        this.f688a = str;
        this.b = str2;
        this.c = str3;
        this.d = d;
        this.e = z;
        this.f = d2;
        this.g = z2;
    }

    public final String a() {
        if (this.e) {
            return "—";
        }
        return pr.n(this.d) + " " + this.c;
    }
}
