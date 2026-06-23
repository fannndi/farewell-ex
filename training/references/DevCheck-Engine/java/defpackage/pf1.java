package defpackage;

/* loaded from: classes.dex */
public final class pf1 implements ph {
    public final /* synthetic */ int g;
    public final /* synthetic */ qf1 h;

    public /* synthetic */ pf1(qf1 qf1Var, int i) {
        this.g = i;
        this.h = qf1Var;
    }

    private final void a() {
    }

    private final void b() {
    }

    @Override // defpackage.ph
    public final void l() {
        int i = this.g;
    }

    @Override // defpackage.ph
    public final void onResult(Object obj) {
        switch (this.g) {
            case 0:
                this.h.e = (rh) obj;
                this.h.a();
                break;
            default:
                this.h.f = (ai) obj;
                this.h.a();
                break;
        }
    }
}
