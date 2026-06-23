package defpackage;

/* loaded from: classes.dex */
public final class mo2 extends wm2 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    public /* synthetic */ mo2(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    @Override // defpackage.wm2
    public final void a() {
        switch (this.h) {
            case 0:
                synchronized (((vo2) this.i).f) {
                    try {
                        if (((vo2) this.i).k.get() > 0 && ((vo2) this.i).k.decrementAndGet() > 0) {
                            ((vo2) this.i).b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        vo2 vo2Var = (vo2) this.i;
                        if (vo2Var.m != null) {
                            vo2Var.b.b("Unbind from service.", new Object[0]);
                            vo2 vo2Var2 = (vo2) this.i;
                            vo2Var2.f1095a.unbindService(vo2Var2.l);
                            vo2 vo2Var3 = (vo2) this.i;
                            vo2Var3.g = false;
                            vo2Var3.m = null;
                            vo2Var3.l = null;
                        }
                        ((vo2) this.i).c();
                        return;
                    } finally {
                    }
                }
            default:
                vo2 vo2Var4 = (vo2) ((d9) this.i).b;
                vo2Var4.b.b("unlinkToDeath", new Object[0]);
                ((bj2) vo2Var4.m).g.unlinkToDeath(vo2Var4.j, 0);
                vo2Var4.m = null;
                vo2Var4.g = false;
                return;
        }
    }
}
