package defpackage;

/* loaded from: classes.dex */
public final class cw extends ex {
    public /* synthetic */ Object j;
    public int k;
    public final /* synthetic */ dw l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(dw dwVar, dx dxVar) {
        super(dxVar);
        this.l = dwVar;
    }

    @Override // defpackage.qd
    public final Object o(Object obj) {
        this.j = obj;
        this.k |= Integer.MIN_VALUE;
        return this.l.k(null, this);
    }
}
