package defpackage;

/* loaded from: classes.dex */
public class b32 extends c22 {
    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        int Q = ro0Var.Q();
        if (Q != 9) {
            return Q == 6 ? Boolean.valueOf(Boolean.parseBoolean(ro0Var.O())) : Boolean.valueOf(ro0Var.G());
        }
        ro0Var.M();
        return null;
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            to0Var.D();
            return;
        }
        to0Var.M();
        to0Var.a();
        to0Var.g.write(bool.booleanValue() ? "true" : "false");
    }
}
