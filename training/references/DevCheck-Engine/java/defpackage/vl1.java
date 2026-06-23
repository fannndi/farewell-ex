package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class vl1 extends nl1 {
    public final /* synthetic */ AtomicReferenceArray g;

    public vl1(long j, vl1 vl1Var, int i) {
        super(j, vl1Var, i);
        this.g = new AtomicReferenceArray(ul1.f);
    }

    @Override // defpackage.nl1
    public final int k() {
        return ul1.f;
    }

    @Override // defpackage.nl1
    public final void l(int i, qx qxVar) {
        this.g.set(i, ul1.e);
        m();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.e + ", hashCode=" + hashCode() + ']';
    }
}
