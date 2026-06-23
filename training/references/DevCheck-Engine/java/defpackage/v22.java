package defpackage;

import java.util.UUID;

/* loaded from: classes.dex */
public class v22 extends c22 {
    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        if (ro0Var.Q() == 9) {
            ro0Var.M();
            return null;
        }
        String O = ro0Var.O();
        try {
            return UUID.fromString(O);
        } catch (IllegalArgumentException e) {
            StringBuilder w = d51.w("Failed parsing '", O, "' as UUID; at path ");
            w.append(ro0Var.v(true));
            throw new no0(w.toString(), e);
        }
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        UUID uuid = (UUID) obj;
        to0Var.K(uuid == null ? null : uuid.toString());
    }
}
