package defpackage;

/* loaded from: classes.dex */
public final class b42 extends nt1 implements rf0 {
    public int k;
    public /* synthetic */ long l;

    @Override // defpackage.qd
    public final Object o(Object obj) {
        int i = this.k;
        if (i == 0) {
            om0.O(obj);
            long j = this.l;
            ai1 h = ai1.h();
            int i2 = d42.b;
            h.getClass();
            long min = Math.min(j * 30000, d42.f173a);
            this.k = 1;
            Object l = pr.l(min, this);
            zx zxVar = zx.g;
            if (l == zxVar) {
                return zxVar;
            }
        } else {
            if (i != 1) {
                c.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            om0.O(obj);
        }
        return Boolean.TRUE;
    }
}
