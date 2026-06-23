package defpackage;

/* loaded from: classes.dex */
public final class rj implements l72 {
    public final /* synthetic */ int g;
    public final pj h;

    public /* synthetic */ rj(pj pjVar, int i) {
        this.g = i;
        this.h = pjVar;
    }

    @Override // defpackage.l72
    public final i72 a(Class cls) {
        int i = this.g;
        pj pjVar = this.h;
        switch (i) {
            case 0:
                if (!cls.isAssignableFrom(sj.class)) {
                    c.m("Unknown ViewModel class");
                    break;
                } else {
                    break;
                }
            default:
                if (!cls.isAssignableFrom(wt0.class)) {
                    c.m("Unknown ViewModel class");
                    break;
                } else {
                    break;
                }
        }
        return null;
    }
}
