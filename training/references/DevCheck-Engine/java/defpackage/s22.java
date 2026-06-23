package defpackage;

import java.net.URL;

/* loaded from: classes.dex */
public class s22 extends c22 {
    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        if (ro0Var.Q() == 9) {
            ro0Var.M();
            return null;
        }
        String O = ro0Var.O();
        if (O.equals("null")) {
            return null;
        }
        return new URL(O);
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        URL url = (URL) obj;
        to0Var.K(url == null ? null : url.toExternalForm());
    }
}
