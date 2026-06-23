package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class pn1 {

    /* renamed from: a, reason: collision with root package name */
    public final dh1 f799a;
    public final AtomicBoolean b;
    public final wt1 c;

    public pn1(dh1 dh1Var) {
        dh1Var.getClass();
        this.f799a = dh1Var;
        this.b = new AtomicBoolean(false);
        this.c = new wt1(new qt(8, this));
    }

    public final ze0 a() {
        dh1 dh1Var = this.f799a;
        dh1Var.a();
        if (this.b.compareAndSet(false, true)) {
            return (ze0) this.c.getValue();
        }
        String b = b();
        dh1Var.getClass();
        dh1Var.a();
        dh1Var.b();
        return dh1Var.k().z().j(b);
    }

    public abstract String b();

    public final void c(ze0 ze0Var) {
        ze0Var.getClass();
        if (ze0Var == ((ze0) this.c.getValue())) {
            this.b.set(false);
        }
    }
}
