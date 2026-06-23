package defpackage;

/* loaded from: classes.dex */
public final class ii1 {

    /* renamed from: a, reason: collision with root package name */
    public final ji1 f433a;
    public final ji1 b;
    public final Throwable c;

    public /* synthetic */ ii1(ji1 ji1Var, Throwable th, int i) {
        this(ji1Var, (ou) null, (i & 4) != 0 ? null : th);
    }

    public ii1(ji1 ji1Var, ou ouVar, Throwable th) {
        this.f433a = ji1Var;
        this.b = ouVar;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ii1)) {
            return false;
        }
        ii1 ii1Var = (ii1) obj;
        return ym0.b(this.f433a, ii1Var.f433a) && ym0.b(this.b, ii1Var.b) && ym0.b(this.c, ii1Var.c);
    }

    public final int hashCode() {
        int hashCode = this.f433a.hashCode() * 31;
        ji1 ji1Var = this.b;
        int hashCode2 = (hashCode + (ji1Var == null ? 0 : ji1Var.hashCode())) * 31;
        Throwable th = this.c;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "ConnectResult(plan=" + this.f433a + ", nextPlan=" + this.b + ", throwable=" + this.c + ')';
    }
}
