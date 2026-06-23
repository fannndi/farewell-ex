package defpackage;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class if1 extends hf1 {
    public final l31 b;

    public if1(l31 l31Var, jf1 jf1Var) {
        super(jf1Var);
        this.b = l31Var;
    }

    @Override // defpackage.hf1
    public final Object d() {
        return this.b.e();
    }

    @Override // defpackage.hf1
    public final Object e(Object obj) {
        return obj;
    }

    @Override // defpackage.hf1
    public final void f(Object obj, ro0 ro0Var, gf1 gf1Var) {
        Field field = gf1Var.b;
        Object b = gf1Var.f.b(ro0Var);
        if (b == null && gf1Var.g) {
            return;
        }
        if (gf1Var.h) {
            throw new no0("Cannot set value of 'static final' ".concat(ef1.d(field, false)));
        }
        field.set(obj, b);
    }
}
