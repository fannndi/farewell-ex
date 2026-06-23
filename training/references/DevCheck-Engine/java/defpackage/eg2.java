package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class eg2 extends sf2 {
    public final nv1 b;

    public eg2(nv1 nv1Var) {
        super(4);
        this.b = nv1Var;
    }

    @Override // defpackage.sf2
    public final boolean a(mf2 mf2Var) {
        if (mf2Var.l.get(null) == null) {
            return false;
        }
        rw.b();
        return false;
    }

    @Override // defpackage.sf2
    public final jb0[] b(mf2 mf2Var) {
        if (mf2Var.l.get(null) == null) {
            return null;
        }
        rw.b();
        return null;
    }

    @Override // defpackage.sf2
    public final void c(Status status) {
        this.b.a(new t4(status));
    }

    @Override // defpackage.sf2
    public final void d(Exception exc) {
        this.b.a(exc);
    }

    @Override // defpackage.sf2
    public final void e(mf2 mf2Var) {
        try {
            h(mf2Var);
        } catch (DeadObjectException e) {
            c(sf2.g(e));
            throw e;
        } catch (RemoteException e2) {
            c(sf2.g(e2));
        } catch (RuntimeException e3) {
            this.b.a(e3);
        }
    }

    @Override // defpackage.sf2
    public final /* bridge */ /* synthetic */ void f(xi0 xi0Var, boolean z) {
    }

    public final void h(mf2 mf2Var) {
        if (mf2Var.l.remove(null) == null) {
            this.b.b(Boolean.FALSE);
        } else {
            rw.b();
        }
    }
}
