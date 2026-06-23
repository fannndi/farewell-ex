package defpackage;

/* loaded from: classes.dex */
public final class ue0 extends RuntimeException {
    public final ve0 g;
    public final Throwable h;

    public ue0(ve0 ve0Var, Throwable th) {
        super(th);
        this.g = ve0Var;
        this.h = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.h;
    }
}
