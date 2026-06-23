package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class i52 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ j52 h;

    public /* synthetic */ i52(j52 j52Var, int i) {
        this.g = i;
        this.h = j52Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        j52 j52Var = this.h;
        switch (i) {
            case 0:
                Application application = j52Var.b;
                application.getClass();
                Context applicationContext = application.getApplicationContext();
                if (!pr.z(applicationContext)) {
                    j52Var.g.i(new y42());
                    j52Var.e.i(Collections.EMPTY_LIST);
                    break;
                } else {
                    y42 y42Var = new y42();
                    y42Var.f1211a = j52.d(applicationContext, g52.g);
                    y42Var.b = j52.d(applicationContext, g52.h);
                    y42Var.c = j52.d(applicationContext, g52.i);
                    j52Var.g.i(y42Var);
                    vm0 a2 = y42Var.a(j52Var.i);
                    j52Var.e.i(a2 != null ? (List) a2.c : Collections.EMPTY_LIST);
                    break;
                }
            default:
                Application application2 = j52Var.b;
                application2.getClass();
                Context applicationContext2 = application2.getApplicationContext();
                if (!pr.z(applicationContext2)) {
                    j52Var.f.i(new y42());
                    j52Var.d.i(Collections.EMPTY_LIST);
                    break;
                } else {
                    y42 y42Var2 = new y42();
                    y42Var2.f1211a = j52.e(applicationContext2, g52.g);
                    y42Var2.b = j52.e(applicationContext2, g52.h);
                    y42Var2.c = null;
                    j52Var.f.i(y42Var2);
                    vm0 a3 = y42Var2.a(j52Var.h);
                    j52Var.d.i(a3 != null ? (List) a3.c : Collections.EMPTY_LIST);
                    break;
                }
        }
    }
}
