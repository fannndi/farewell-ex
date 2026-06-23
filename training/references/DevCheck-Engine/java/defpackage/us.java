package defpackage;

/* loaded from: classes.dex */
public final class us extends ex {
    public /* synthetic */ Object j;
    public final /* synthetic */ vs k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us(vs vsVar, dx dxVar) {
        super(dxVar);
        this.k = vsVar;
    }

    @Override // defpackage.qd
    public final Object o(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.k(null, this);
    }
}
