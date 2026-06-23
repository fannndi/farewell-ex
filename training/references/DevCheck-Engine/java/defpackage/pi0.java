package defpackage;

/* loaded from: classes.dex */
public final class pi0 {
    public static final km d;
    public static final km e;
    public static final km f;
    public static final km g;
    public static final km h;
    public static final km i;

    /* renamed from: a, reason: collision with root package name */
    public final km f791a;
    public final km b;
    public final int c;

    static {
        km kmVar = km.j;
        d = pg0.h(":");
        e = pg0.h(":status");
        f = pg0.h(":method");
        g = pg0.h(":path");
        h = pg0.h(":scheme");
        i = pg0.h(":authority");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pi0(String str, String str2) {
        this(pg0.h(str), pg0.h(str2));
        km kmVar = km.j;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public pi0(km kmVar, String str) {
        this(kmVar, pg0.h(str));
        kmVar.getClass();
        str.getClass();
        km kmVar2 = km.j;
    }

    public pi0(km kmVar, km kmVar2) {
        kmVar.getClass();
        kmVar2.getClass();
        this.f791a = kmVar;
        this.b = kmVar2;
        this.c = kmVar2.a() + kmVar.a() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pi0)) {
            return false;
        }
        pi0 pi0Var = (pi0) obj;
        return ym0.b(this.f791a, pi0Var.f791a) && ym0.b(this.b, pi0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f791a.hashCode() * 31);
    }

    public final String toString() {
        return this.f791a.j() + ": " + this.b.j();
    }
}
