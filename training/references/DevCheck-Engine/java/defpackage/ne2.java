package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class ne2 extends pe2 {
    public final /* synthetic */ cf2 i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ nv1 l;
    public final /* synthetic */ qe2 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne2(qe2 qe2Var, nv1 nv1Var, cf2 cf2Var, long j, long j2, nv1 nv1Var2) {
        super(qe2Var, nv1Var);
        this.i = cf2Var;
        this.j = j;
        this.k = j2;
        this.l = nv1Var2;
        Objects.requireNonNull(qe2Var);
        this.m = qe2Var;
    }

    @Override // defpackage.ef2
    public final void b() {
        cf2 cf2Var = this.i;
        nv1 nv1Var = this.l;
        qe2 qe2Var = this.m;
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
            Bundle a2 = qe2.a(qe2Var, cf2Var, this.j, this.k);
            oe2 oe2Var = new oe2(qe2Var, nv1Var, 0);
            ye2 ye2Var = (ye2) af2Var;
            ye2Var.getClass();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
            int i = ve2.f1083a;
            obtain.writeInt(1);
            a2.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(oe2Var);
            try {
                ye2Var.g.transact(3, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        } catch (RemoteException e) {
            qe2Var.f838a.a(e, "requestExpressIntegrityToken(%s, %s, %s)", cf2Var.f123a, cf2Var.b, Long.valueOf(this.j));
            nv1Var.a(new sq1(-100, e));
        }
    }
}
