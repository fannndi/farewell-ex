package defpackage;

import android.os.RemoteException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public final class td2 extends ef2 {
    public final /* synthetic */ int h = 0;
    public final /* synthetic */ Object i;

    public td2(d9 d9Var) {
        this.i = d9Var;
    }

    public td2(vd2 vd2Var) {
        Objects.requireNonNull(vd2Var);
        this.i = vd2Var;
    }

    @Override // defpackage.ef2
    public final void b() {
        switch (this.h) {
            case 0:
                vd2 vd2Var = (vd2) ((d9) this.i).b;
                vd2Var.b.b("unlinkToDeath", new Object[0]);
                ((ye2) vd2Var.n).g.unlinkToDeath(vd2Var.k, 0);
                vd2Var.n = null;
                vd2Var.g = false;
                return;
            default:
                vd2 vd2Var2 = (vd2) this.i;
                synchronized (vd2Var2.f) {
                    try {
                        if (vd2Var2.l.get() > 0 && vd2Var2.l.decrementAndGet() > 0) {
                            vd2Var2.b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        if (vd2Var2.n != null) {
                            vd2Var2.b.b("Unbind from service.", new Object[0]);
                            vd2Var2.f1082a.unbindService(vd2Var2.m);
                            vd2Var2.g = false;
                            vd2Var2.n = null;
                            vd2Var2.m = null;
                        }
                        HashSet hashSet = vd2Var2.e;
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            ((nv1) it.next()).a(new RemoteException(String.valueOf(vd2Var2.c).concat(" : Binder has died.")));
                        }
                        hashSet.clear();
                        return;
                    } finally {
                    }
                }
        }
    }
}
