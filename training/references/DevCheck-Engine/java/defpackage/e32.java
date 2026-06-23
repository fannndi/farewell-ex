package defpackage;

/* loaded from: classes.dex */
public class e32 extends c22 {
    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        if (ro0Var.Q() == 9) {
            ro0Var.M();
            return null;
        }
        try {
            int I = ro0Var.I();
            if (I <= 65535 && I >= -32768) {
                return Short.valueOf((short) I);
            }
            p22.b("Lossy conversion from ", I, " to short; at path ", ro0Var.v(true));
            return null;
        } catch (NumberFormatException e) {
            throw new no0(e);
        }
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        if (((Number) obj) == null) {
            to0Var.D();
        } else {
            to0Var.I(r4.shortValue());
        }
    }
}
