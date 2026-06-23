package defpackage;

import java.math.BigInteger;

/* loaded from: classes.dex */
public class m22 extends c22 {
    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        if (ro0Var.Q() == 9) {
            ro0Var.M();
            return null;
        }
        String O = ro0Var.O();
        try {
            ju0.g(O);
            return new BigInteger(O);
        } catch (NumberFormatException e) {
            StringBuilder w = d51.w("Failed parsing '", O, "' as BigInteger; at path ");
            w.append(ro0Var.v(true));
            throw new no0(w.toString(), e);
        }
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        to0Var.J((BigInteger) obj);
    }
}
