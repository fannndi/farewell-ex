package defpackage;

/* loaded from: classes.dex */
public final class it0 extends o31 {
    public static final p31 j;
    public float h = 0.0f;
    public float i = 0.0f;

    static {
        p31 a2 = p31.a(32, new it0());
        j = a2;
        a2.f = 0.5f;
    }

    public static it0 b(float f, float f2) {
        it0 it0Var = (it0) j.b();
        it0Var.h = f;
        it0Var.i = f2;
        return it0Var;
    }

    public static it0 c(it0 it0Var) {
        it0 it0Var2 = (it0) j.b();
        it0Var2.h = it0Var.h;
        it0Var2.i = it0Var.i;
        return it0Var2;
    }

    public static void d(it0 it0Var) {
        j.c(it0Var);
    }

    @Override // defpackage.o31
    public final o31 a() {
        return new it0();
    }
}
