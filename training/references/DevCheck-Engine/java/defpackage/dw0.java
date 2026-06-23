package defpackage;

/* loaded from: classes.dex */
public final class dw0 implements v31 {

    /* renamed from: a, reason: collision with root package name */
    public final ns0 f211a;
    public final v31 b;
    public int c = -1;

    public dw0(ns0 ns0Var, v31 v31Var) {
        this.f211a = ns0Var;
        this.b = v31Var;
    }

    @Override // defpackage.v31
    public final void a(Object obj) {
        int i = this.c;
        int i2 = this.f211a.g;
        if (i != i2) {
            this.c = i2;
            this.b.a(obj);
        }
    }
}
