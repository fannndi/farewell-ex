package defpackage;

import java.net.URI;
import java.net.URISyntaxException;

/* loaded from: classes.dex */
public class t22 extends c22 {
    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        if (ro0Var.Q() == 9) {
            ro0Var.M();
            return null;
        }
        try {
            String O = ro0Var.O();
            if (O.equals("null")) {
                return null;
            }
            return new URI(O);
        } catch (URISyntaxException e) {
            throw new no0(e);
        }
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        URI uri = (URI) obj;
        to0Var.K(uri == null ? null : uri.toASCIIString());
    }
}
