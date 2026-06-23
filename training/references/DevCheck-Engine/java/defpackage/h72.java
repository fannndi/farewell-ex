package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.Fk.Iyrs;

/* loaded from: classes.dex */
public final class h72 extends og1 implements pf0, xf0 {
    public final int h;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ View k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h72(View view, dx dxVar) {
        super(dxVar);
        this.k = view;
        this.h = 2;
    }

    @Override // defpackage.xf0
    public final int b() {
        return this.h;
    }

    @Override // defpackage.pf0
    public final Object f(Object obj, Object obj2) {
        return ((h72) l((dx) obj2, (hm1) obj)).o(e42.f219a);
    }

    @Override // defpackage.qd
    public final dx l(dx dxVar, Object obj) {
        h72 h72Var = new h72(this.k, dxVar);
        h72Var.j = obj;
        return h72Var;
    }

    @Override // defpackage.qd
    public final Object o(Object obj) {
        Object obj2;
        int i = this.i;
        View view = this.k;
        Object obj3 = zx.g;
        if (i == 0) {
            om0.O(obj);
            hm1 hm1Var = (hm1) this.j;
            this.j = hm1Var;
            this.i = 1;
            hm1Var.h = view;
            hm1Var.g = 3;
            hm1Var.j = this;
            return obj3;
        }
        Object obj4 = e42.f219a;
        if (i != 1) {
            if (i == 2) {
                om0.O(obj);
                return obj4;
            }
            c.n(Iyrs.JAFdkvDSndbDhNC);
            return null;
        }
        hm1 hm1Var2 = (hm1) this.j;
        om0.O(obj);
        if (view instanceof ViewGroup) {
            this.j = null;
            this.i = 2;
            hm1Var2.getClass();
            w02 w02Var = new w02(new r(3, (ViewGroup) view));
            if (w02Var.h.hasNext()) {
                hm1Var2.i = w02Var;
                hm1Var2.g = 2;
                hm1Var2.j = this;
                obj2 = obj3;
            } else {
                obj2 = obj4;
            }
            if (obj2 != obj3) {
                obj2 = obj4;
            }
            if (obj2 == obj3) {
                return obj3;
            }
        }
        return obj4;
    }

    @Override // defpackage.qd
    public final String toString() {
        if (this.g != null) {
            return super.toString();
        }
        af1.f25a.getClass();
        return bf1.a(this);
    }
}
