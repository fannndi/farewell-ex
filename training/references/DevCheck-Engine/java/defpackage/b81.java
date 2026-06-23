package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class b81 extends ex {
    public Object j;
    public Serializable k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ d81 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b81(d81 d81Var, ex exVar) {
        super(exVar);
        this.n = d81Var;
    }

    @Override // defpackage.qd
    public final Object o(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.g(null, null, this);
    }
}
