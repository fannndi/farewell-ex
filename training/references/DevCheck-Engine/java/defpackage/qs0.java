package defpackage;

/* loaded from: classes.dex */
public class qs0 extends i72 {
    public static final ce0 c = new ce0(1);
    public final op1 b = new op1();

    @Override // defpackage.i72
    public final void b() {
        op1 op1Var = this.b;
        int i = op1Var.i;
        Object[] objArr = op1Var.h;
        if (i > 0) {
            throw d51.k(objArr[0]);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        op1Var.i = 0;
    }
}
