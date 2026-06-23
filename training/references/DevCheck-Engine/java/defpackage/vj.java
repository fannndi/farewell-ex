package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class vj implements Runnable {
    public final /* synthetic */ int g = 1;
    public final /* synthetic */ dk h;

    public /* synthetic */ vj(dk dkVar) {
        this.h = dkVar;
    }

    public /* synthetic */ vj(dk dkVar, gk gkVar) {
        this.h = dkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        dk dkVar = this.h;
        switch (i) {
            case 0:
                lk lkVar = dkVar.d0;
                if (lkVar.c == null) {
                    lkVar.c = new ik();
                }
                lkVar.c.E();
                break;
            default:
                lk lkVar2 = dkVar.d0;
                if (lkVar2.c == null) {
                    lkVar2.c = new ik();
                }
                lkVar2.c.D();
                break;
        }
    }
}
