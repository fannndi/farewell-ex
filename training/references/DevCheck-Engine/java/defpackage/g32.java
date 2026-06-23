package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class g32 extends c22 {
    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        try {
            return new AtomicInteger(ro0Var.I());
        } catch (NumberFormatException e) {
            throw new no0(e);
        }
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        to0Var.I(((AtomicInteger) obj).get());
    }
}
