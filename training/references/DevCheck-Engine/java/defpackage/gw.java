package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class gw extends nt1 implements pf0 {
    public final /* synthetic */ gc2 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw(gc2 gc2Var, dx dxVar) {
        super(2, dxVar);
        this.k = gc2Var;
    }

    @Override // defpackage.pf0
    public final Object f(Object obj, Object obj2) {
        gw gwVar = (gw) l((dx) obj2, (pw) obj);
        e42 e42Var = e42.f219a;
        gwVar.o(e42Var);
        return e42Var;
    }

    @Override // defpackage.qd
    public final dx l(dx dxVar, Object obj) {
        return new gw(this.k, dxVar);
    }

    @Override // defpackage.qd
    public final Object o(Object obj) {
        om0.O(obj);
        int i = hw.f403a;
        ai1 h = ai1.h();
        Objects.toString(this.k);
        h.getClass();
        return e42.f219a;
    }
}
