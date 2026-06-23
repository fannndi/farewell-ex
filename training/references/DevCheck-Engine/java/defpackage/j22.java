package defpackage;

/* loaded from: classes.dex */
public class j22 extends c22 {
    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        if (ro0Var.Q() == 9) {
            ro0Var.M();
            return null;
        }
        String O = ro0Var.O();
        if (O.length() == 1) {
            return Character.valueOf(O.charAt(0));
        }
        StringBuilder w = d51.w("Expecting character, got: ", O, "; at ");
        w.append(ro0Var.v(true));
        throw new no0(w.toString());
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        Character ch = (Character) obj;
        to0Var.K(ch == null ? null : String.valueOf(ch));
    }
}
