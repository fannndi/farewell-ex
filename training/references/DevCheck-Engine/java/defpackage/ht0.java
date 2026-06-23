package defpackage;

/* loaded from: classes.dex */
public final class ht0 extends o31 {
    public static final p31 j;
    public double h = 0.0d;
    public double i = 0.0d;

    static {
        p31 a2 = p31.a(64, new ht0());
        j = a2;
        a2.f = 0.5f;
    }

    public static void b(ht0 ht0Var) {
        j.c(ht0Var);
    }

    @Override // defpackage.o31
    public final o31 a() {
        return new ht0();
    }

    public final String toString() {
        return "MPPointD, x: " + this.h + ", y: " + this.i;
    }
}
