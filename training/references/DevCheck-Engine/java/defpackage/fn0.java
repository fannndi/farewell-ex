package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class fn0 extends vn0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater o = AtomicIntegerFieldUpdater.newUpdater(fn0.class, "_invoked$volatile");
    public volatile /* synthetic */ int _invoked$volatile = 0;
    public final dn0 n;

    public fn0(dn0 dn0Var) {
        this.n = dn0Var;
    }

    @Override // defpackage.vn0
    public final boolean r() {
        return true;
    }

    @Override // defpackage.vn0
    public final void s(Throwable th) {
        if (o.compareAndSet(this, 0, 1)) {
            this.n.j(th);
        }
    }
}
