package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class pe2 extends ef2 {
    public final /* synthetic */ qe2 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe2(qe2 qe2Var, nv1 nv1Var) {
        super(nv1Var);
        Objects.requireNonNull(qe2Var);
        this.h = qe2Var;
    }

    @Override // defpackage.ef2
    public final void a(Exception exc) {
        if (!(exc instanceof wd2)) {
            super.a(exc);
        } else if (qe2.d(this.h)) {
            super.a(new sq1(-2, exc));
        } else {
            super.a(new sq1(-9, exc));
        }
    }
}
