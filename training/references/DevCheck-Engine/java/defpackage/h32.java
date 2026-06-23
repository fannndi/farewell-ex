package defpackage;

import flar2.devcheck.nativebridge.xm.oWuW;

/* loaded from: classes.dex */
public final class h32 extends c22 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f363a;
    public final boolean b;

    public /* synthetic */ h32(int i, boolean z) {
        this.f363a = i;
        this.b = z;
    }

    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        switch (this.f363a) {
            case 0:
                if (ro0Var.Q() != 9) {
                    return Double.valueOf(ro0Var.H());
                }
                ro0Var.M();
                return null;
            default:
                if (ro0Var.Q() != 9) {
                    return Float.valueOf((float) ro0Var.H());
                }
                ro0Var.M();
                return null;
        }
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        int i = this.f363a;
        boolean z = this.b;
        switch (i) {
            case 0:
                Number number = (Number) obj;
                if (number == null) {
                    to0Var.D();
                    return;
                }
                double doubleValue = number.doubleValue();
                if (z) {
                    j32.a(doubleValue);
                }
                to0Var.M();
                if (to0Var.n == 1 || !(Double.isNaN(doubleValue) || Double.isInfinite(doubleValue))) {
                    to0Var.a();
                    to0Var.g.append((CharSequence) Double.toString(doubleValue));
                    return;
                } else {
                    throw new IllegalArgumentException(oWuW.PSPdZCSuwRcgEiZ + doubleValue);
                }
            default:
                Number number2 = (Number) obj;
                if (number2 == null) {
                    to0Var.D();
                    return;
                }
                float floatValue = number2.floatValue();
                if (z) {
                    j32.a(floatValue);
                }
                if (!(number2 instanceof Float)) {
                    number2 = Float.valueOf(floatValue);
                }
                to0Var.J(number2);
                return;
        }
    }
}
