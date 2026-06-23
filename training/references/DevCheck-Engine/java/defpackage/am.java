package defpackage;

/* loaded from: classes.dex */
public final class am extends ex {
    public /* synthetic */ Object j;
    public final /* synthetic */ bm k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(bm bmVar, ex exVar) {
        super(exVar);
        this.k = bmVar;
    }

    @Override // defpackage.qd
    public final Object o(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        Object F = this.k.F(null, 0, 0L, this);
        return F == zx.g ? F : new gp(F);
    }
}
