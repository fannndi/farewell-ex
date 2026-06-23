package defpackage;

/* loaded from: classes.dex */
public final class va0 implements ji1 {

    /* renamed from: a, reason: collision with root package name */
    public final ii1 f1077a;

    public va0(Throwable th) {
        this.f1077a = new ii1(this, th, 2);
    }

    @Override // defpackage.ji1
    public final ji1 a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.ji1
    public final ii1 c() {
        return this.f1077a;
    }

    @Override // defpackage.ji1, defpackage.x90
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.ji1
    public final ed1 d() {
        throw new IllegalStateException("unexpected call");
    }

    @Override // defpackage.ji1
    public final boolean e() {
        return false;
    }

    @Override // defpackage.ji1
    public final ii1 g() {
        return this.f1077a;
    }
}
