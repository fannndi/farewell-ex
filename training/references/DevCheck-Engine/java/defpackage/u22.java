package defpackage;

import java.net.InetAddress;

/* loaded from: classes.dex */
public class u22 extends c22 {
    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        if (ro0Var.Q() != 9) {
            return InetAddress.getByName(ro0Var.O());
        }
        ro0Var.M();
        return null;
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        InetAddress inetAddress = (InetAddress) obj;
        to0Var.K(inetAddress == null ? null : inetAddress.getHostAddress());
    }
}
