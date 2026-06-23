package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class na1 extends o implements ap, wl1 {
    public final bm l;

    public na1(qx qxVar, bm bmVar) {
        super(qxVar, true);
        this.l = bmVar;
    }

    @Override // defpackage.wl1
    public final Object b(dx dxVar, Object obj) {
        return this.l.b(dxVar, obj);
    }

    @Override // defpackage.bo0, defpackage.rn0
    public final void e(CancellationException cancellationException) {
        if (N()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new sn0(x(), null, this);
        }
        u(cancellationException);
    }

    @Override // defpackage.o
    public final void f0(Throwable th, boolean z) {
        if (this.l.h(th, false) || z) {
            return;
        }
        op0.y(this.k, th);
    }

    @Override // defpackage.o
    public final void g0(Object obj) {
        this.l.f(null);
    }

    @Override // defpackage.ap
    public final yl iterator() {
        bm bmVar = this.l;
        bmVar.getClass();
        return new yl(bmVar);
    }

    @Override // defpackage.ap
    public final Object j() {
        return this.l.j();
    }

    @Override // defpackage.wl1
    public final Object k(Object obj) {
        return this.l.k(obj);
    }

    @Override // defpackage.ap
    public final Object l(xs xsVar) {
        bm bmVar = this.l;
        bmVar.getClass();
        return bm.E(bmVar, xsVar);
    }

    @Override // defpackage.bo0
    public final void u(CancellationException cancellationException) {
        this.l.h(cancellationException, true);
        t(cancellationException);
    }
}
