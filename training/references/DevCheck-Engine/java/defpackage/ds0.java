package defpackage;

/* loaded from: classes.dex */
public final class ds0 implements lf0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ ds0(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    @Override // defpackage.lf0
    public final Object j(Object obj) {
        int i = this.g;
        e42 e42Var = e42.f219a;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                ((bs0) obj2).cancel(false);
                break;
            default:
                ((ao) obj2).g(e42Var);
                break;
        }
        return e42Var;
    }
}
