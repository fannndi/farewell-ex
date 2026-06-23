package defpackage;

import android.app.Application;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class gi0 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ mi0 h;

    public /* synthetic */ gi0(mi0 mi0Var, int i) {
        this.g = i;
        this.h = mi0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        mi0 mi0Var = this.h;
        switch (i) {
            case 0:
                mi0Var.k();
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                mi0Var.getClass();
                i51.h("phwu", true);
                Application application = mi0Var.b;
                application.getClass();
                ym0.B(application);
                mi0Var.l.i(Boolean.TRUE);
                break;
            default:
                Application application2 = mi0Var.b;
                application2.getClass();
                mi0Var.k.i(ym0.k(application2));
                break;
        }
    }
}
