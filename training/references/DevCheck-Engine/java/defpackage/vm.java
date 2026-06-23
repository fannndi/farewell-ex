package defpackage;

import android.app.Application;

/* loaded from: classes.dex */
public final /* synthetic */ class vm implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ wm h;

    public /* synthetic */ vm(wm wmVar, int i) {
        this.g = i;
        this.h = wmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        wm wmVar = this.h;
        switch (i) {
            case 0:
                wmVar.getClass();
                i51.h("phwu", true);
                Application application = wmVar.b;
                application.getClass();
                ym0.B(application);
                wmVar.g.i(Boolean.TRUE);
                break;
            default:
                Application application2 = wmVar.b;
                application2.getClass();
                wmVar.f.i(ym0.k(application2));
                break;
        }
    }
}
