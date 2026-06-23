package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class qb implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ wb h;

    public /* synthetic */ qb(wb wbVar, int i) {
        this.g = i;
        this.h = wbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        wb wbVar = this.h;
        switch (i) {
            case 0:
                wbVar.l();
                break;
            default:
                int i2 = wb.w;
                if (i2 >= 20) {
                    wbVar.j.b();
                    break;
                } else {
                    wb.w = i2 + 1;
                    try {
                        wbVar.j.g(wbVar);
                        break;
                    } catch (IllegalStateException unused) {
                        wbVar.j.b();
                        wbVar.j = null;
                        return;
                    }
                }
        }
    }
}
