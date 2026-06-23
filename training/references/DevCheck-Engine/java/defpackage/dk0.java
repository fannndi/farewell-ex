package defpackage;

import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import java.io.IOException;

/* loaded from: classes.dex */
public final class dk0 implements af0 {
    public final hk0 g;
    public final /* synthetic */ ek0 h;

    public dk0(ek0 ek0Var, hk0 hk0Var) {
        this.h = ek0Var;
        this.g = hk0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // defpackage.af0
    public final Object a() {
        Throwable th;
        ek0 ek0Var = this.h;
        hk0 hk0Var = this.g;
        j90 j90Var = j90.k;
        IOException iOException = null;
        try {
            try {
                try {
                } catch (Throwable th2) {
                    th = th2;
                    ek0Var.a(this, j90Var, iOException);
                    pd2.b(hk0Var);
                    throw th;
                }
            } catch (IOException e) {
                iOException = e;
            }
            if (!hk0Var.a(true, this)) {
                throw new IOException(ILBLnlCHDVqsSN.sSvkkdPYnjZ);
            }
            do {
                try {
                } catch (Throwable th3) {
                    th = th3;
                    this = j90Var;
                    ek0Var.a(this, j90Var, iOException);
                    pd2.b(hk0Var);
                    throw th;
                }
            } while (hk0Var.a(false, this));
            j90 j90Var2 = j90.i;
            try {
                j90Var = j90.n;
                ek0Var.a(j90Var2, j90Var, null);
                this = j90Var2;
            } catch (IOException e2) {
                iOException = e2;
                j90 j90Var3 = j90.j;
                ek0Var.a(j90Var3, j90Var3, iOException);
                this = j90Var3;
                pd2.b(hk0Var);
                return e42.f219a;
            }
            pd2.b(hk0Var);
            return e42.f219a;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
