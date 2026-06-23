package defpackage;

/* loaded from: classes.dex */
public final class fw1 extends hw1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f306a;
    public final s91 b;

    public fw1(int i, s91 s91Var) {
        this.f306a = i;
        this.b = s91Var;
    }

    @Override // defpackage.hw1
    public final long a() {
        return ((this.f306a & 4294967295L) << 32) | (4294967295L & this.b.f923a);
    }
}
