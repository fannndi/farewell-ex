package defpackage;

/* loaded from: classes.dex */
public abstract class vn0 extends vs0 implements n50, vl0 {
    public bo0 m;

    @Override // defpackage.vl0
    public final boolean a() {
        return true;
    }

    @Override // defpackage.n50
    public final void b() {
        q().X(this);
    }

    @Override // defpackage.vl0
    public final x21 d() {
        return null;
    }

    public rn0 getParent() {
        return q();
    }

    public final bo0 q() {
        bo0 bo0Var = this.m;
        if (bo0Var != null) {
            return bo0Var;
        }
        ym0.A("job");
        throw null;
    }

    public abstract boolean r();

    public abstract void s(Throwable th);

    @Override // defpackage.vs0
    public final String toString() {
        return getClass().getSimpleName() + '@' + d10.r(this) + "[job@" + d10.r(q()) + ']';
    }
}
