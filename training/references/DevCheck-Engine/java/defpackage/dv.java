package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class dv implements gm1 {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f209a;

    public dv(fs fsVar) {
        this.f209a = new AtomicReference(fsVar);
    }

    @Override // defpackage.gm1
    public final Iterator iterator() {
        gm1 gm1Var = (gm1) this.f209a.getAndSet(null);
        if (gm1Var != null) {
            return gm1Var.iterator();
        }
        c.n("This sequence can be consumed only once.");
        return null;
    }
}
