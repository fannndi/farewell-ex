package defpackage;

/* loaded from: classes.dex */
public final class vg1 implements ji1 {

    /* renamed from: a, reason: collision with root package name */
    public final ed1 f1085a;

    public vg1(ed1 ed1Var) {
        ed1Var.getClass();
        this.f1085a = ed1Var;
    }

    @Override // defpackage.ji1
    public final ji1 a() {
        throw new IllegalStateException("unexpected retry");
    }

    @Override // defpackage.ji1
    public final ii1 c() {
        throw new IllegalStateException("already connected");
    }

    @Override // defpackage.ji1, defpackage.x90
    public final void cancel() {
        throw new IllegalStateException("unexpected cancel");
    }

    @Override // defpackage.ji1
    public final ed1 d() {
        return this.f1085a;
    }

    @Override // defpackage.ji1
    public final boolean e() {
        return true;
    }

    @Override // defpackage.ji1
    public final ii1 g() {
        throw new IllegalStateException("already connected");
    }
}
