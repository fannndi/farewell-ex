package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class me2 extends pe2 {
    public final /* synthetic */ long i;
    public final /* synthetic */ nv1 j;
    public final /* synthetic */ qe2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me2(qe2 qe2Var, nv1 nv1Var, long j, nv1 nv1Var2) {
        super(qe2Var, nv1Var);
        this.i = j;
        this.j = nv1Var2;
        Objects.requireNonNull(qe2Var);
        this.k = qe2Var;
    }

    @Override // defpackage.ef2
    public final void b() {
        nv1 nv1Var = this.j;
        long j = this.i;
        qe2 qe2Var = this.k;
        if (qe2.d(qe2Var)) {
            a(new sq1(-2, null));
            return;
        }
        if (qe2.c(qe2Var)) {
            a(new sq1(-14, null));
            return;
        }
        try {
            af2 af2Var = qe2Var.e.n;
            Bundle b = qe2.b(qe2Var, j);
            oe2 oe2Var = new oe2(qe2Var, nv1Var, 1);
            ye2 ye2Var = (ye2) af2Var;
            ye2Var.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            int i = ve2.f1083a;
            obtain.writeInt(1);
            b.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(oe2Var);
            try {
                ye2Var.g.transact(2, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e) {
            qe2Var.f838a.a(e, "warmUpIntegrityToken(%s)", Long.valueOf(j));
            nv1Var.a(new sq1(-100, e));
        }
    }
}
