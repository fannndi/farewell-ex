package defpackage;

/* loaded from: classes.dex */
public class h22 extends c22 {
    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        if (ro0Var.Q() == 9) {
            ro0Var.M();
            return null;
        }
        try {
            return Long.valueOf(ro0Var.J());
        } catch (NumberFormatException e) {
            throw new no0(e);
        }
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            to0Var.D();
        } else {
            to0Var.I(number.longValue());
        }
    }
}
