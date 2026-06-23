package defpackage;

/* loaded from: classes.dex */
public class c32 extends c22 {
    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        if (ro0Var.Q() != 9) {
            return Boolean.valueOf(ro0Var.O());
        }
        ro0Var.M();
        return null;
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        Boolean bool = (Boolean) obj;
        to0Var.K(bool == null ? "null" : bool.toString());
    }
}
