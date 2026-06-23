package defpackage;

import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class b50 extends hk1 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater m = AtomicIntegerFieldUpdater.newUpdater(b50.class, "_decision$volatile");
    public volatile /* synthetic */ int _decision$volatile;

    @Override // defpackage.hk1, defpackage.bo0
    public final void p(Object obj) {
        q(obj);
    }

    @Override // defpackage.hk1, defpackage.bo0
    public final void q(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = m;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    a50.a(ju0.T(this.l), sl.e0(obj));
                    return;
                } else {
                    c.n(jYVJoqfHJs.JoTBTufZJAVI);
                    return;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
