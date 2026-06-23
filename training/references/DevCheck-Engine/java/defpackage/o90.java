package defpackage;

/* loaded from: classes.dex */
public final class o90 extends q90 {
    public final ao i;
    public final /* synthetic */ s90 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o90(s90 s90Var, long j, ao aoVar) {
        super(j);
        this.j = s90Var;
        this.i = aoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.H(this.j);
    }

    @Override // defpackage.q90
    public final String toString() {
        return super.toString() + this.i;
    }
}
