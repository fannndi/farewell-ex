package defpackage;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class j92 extends bn0 {
    public final en0 b;
    public final WeakReference c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j92(en0 en0Var, ih1 ih1Var) {
        super(ih1Var.f91a);
        ih1Var.getClass();
        this.b = en0Var;
        this.c = new WeakReference(ih1Var);
    }

    @Override // defpackage.bn0
    public final void a(Set set) {
        set.getClass();
        bn0 bn0Var = (bn0) this.c.get();
        if (bn0Var != null) {
            bn0Var.a(set);
            return;
        }
        en0 en0Var = this.b;
        en0Var.getClass();
        ReentrantLock reentrantLock = en0Var.d;
        reentrantLock.lock();
        try {
            w31 w31Var = (w31) en0Var.c.remove(this);
            if (w31Var != null) {
                v12 v12Var = en0Var.b;
                int[] iArr = w31Var.b;
                v12Var.getClass();
                iArr.getClass();
                if (v12Var.h.d(iArr)) {
                    bw0.y(new cn0(en0Var, null, 1));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
