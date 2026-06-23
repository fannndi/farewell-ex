package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class e22 extends c22 {
    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        return new AtomicBoolean(ro0Var.G());
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        to0Var.L(((AtomicBoolean) obj).get());
    }
}
