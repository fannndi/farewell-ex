package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* loaded from: classes.dex */
public final class dg2 extends sf2 {
    public final y30 b;
    public final nv1 c;
    public final pg0 d;

    public dg2(y30 y30Var, nv1 nv1Var, pg0 pg0Var) {
        super(2);
        this.c = nv1Var;
        this.b = y30Var;
        this.d = pg0Var;
        if (y30Var.g) {
            c.m("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
            throw null;
        }
    }

    @Override // defpackage.sf2
    public final boolean a(mf2 mf2Var) {
        return this.b.g;
    }

    @Override // defpackage.sf2
    public final jb0[] b(mf2 mf2Var) {
        return (jb0[]) this.b.h;
    }

    @Override // defpackage.sf2
    public final void c(Status status) {
        this.d.getClass();
        this.c.a(status.i != null ? new cg1(status) : new t4(status));
    }

    @Override // defpackage.sf2
    public final void d(Exception exc) {
        this.c.a(exc);
    }

    @Override // defpackage.sf2
    public final void e(mf2 mf2Var) {
        nv1 nv1Var = this.c;
        try {
            this.b.c(mf2Var.h, nv1Var);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            c(sf2.g(e2));
        } catch (RuntimeException e3) {
            nv1Var.a(e3);
        }
    }

    @Override // defpackage.sf2
    public final void f(xi0 xi0Var, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = (Map) xi0Var.h;
        nv1 nv1Var = this.c;
        map.put(nv1Var, valueOf);
        nv1Var.f703a.a(new u40(xi0Var, nv1Var, 13, false));
    }
}
