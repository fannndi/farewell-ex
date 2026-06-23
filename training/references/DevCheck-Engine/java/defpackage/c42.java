package defpackage;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* loaded from: classes.dex */
public final class c42 extends nt1 implements pf0 {
    public /* synthetic */ boolean k;
    public final /* synthetic */ Context l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c42(Context context, dx dxVar) {
        super(2, dxVar);
        this.l = context;
    }

    @Override // defpackage.pf0
    public final Object f(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        c42 c42Var = (c42) l((dx) obj2, bool);
        e42 e42Var = e42.f219a;
        c42Var.o(e42Var);
        return e42Var;
    }

    @Override // defpackage.qd
    public final dx l(dx dxVar, Object obj) {
        c42 c42Var = new c42(this.l, dxVar);
        c42Var.k = ((Boolean) obj).booleanValue();
        return c42Var;
    }

    @Override // defpackage.qd
    public final Object o(Object obj) {
        om0.O(obj);
        r51.a(this.l, RescheduleReceiver.class, this.k);
        return e42.f219a;
    }
}
