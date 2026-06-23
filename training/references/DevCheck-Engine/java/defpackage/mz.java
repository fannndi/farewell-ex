package defpackage;

import com.jjoe64.graphview.XZMC.MiGPiFgcCQCVh;

/* loaded from: classes.dex */
public final class mz extends nt1 implements pf0 {
    public int k;
    public final /* synthetic */ dh1 l;
    public final /* synthetic */ boolean m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ lf0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz(dx dxVar, lf0 lf0Var, dh1 dh1Var, boolean z, boolean z2) {
        super(2, dxVar);
        this.l = dh1Var;
        this.m = z;
        this.n = z2;
        this.o = lf0Var;
    }

    @Override // defpackage.pf0
    public final Object f(Object obj, Object obj2) {
        return ((mz) l((dx) obj2, (yx) obj)).o(e42.f219a);
    }

    @Override // defpackage.qd
    public final dx l(dx dxVar, Object obj) {
        return new mz(dxVar, this.o, this.l, this.m, this.n);
    }

    @Override // defpackage.qd
    public final Object o(Object obj) {
        int i = this.k;
        if (i != 0) {
            if (i == 1) {
                om0.O(obj);
                return obj;
            }
            c.n(MiGPiFgcCQCVh.AKscE);
            return null;
        }
        om0.O(obj);
        lf0 lf0Var = this.o;
        dh1 dh1Var = this.l;
        boolean z = this.n;
        boolean z2 = this.m;
        lz lzVar = new lz(null, lf0Var, dh1Var, z, z2);
        this.k = 1;
        Object w = dh1Var.w(z2, lzVar, this);
        zx zxVar = zx.g;
        return w == zxVar ? zxVar : w;
    }
}
