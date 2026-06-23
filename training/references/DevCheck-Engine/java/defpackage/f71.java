package defpackage;

import android.app.Application;
import flar2.devcheck.MainApp;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class f71 extends a4 {
    public ew0 c;
    public final l61 d;
    public final ExecutorService e;
    public final y7 f;
    public ew0 g;
    public final ArrayList h;

    public f71(Application application) {
        super(application);
        this.h = new ArrayList();
        Application application2 = this.b;
        application2.getClass();
        if (l61.s == null) {
            l61.s = new l61(application2);
        }
        this.d = l61.s;
        this.e = MainApp.h;
        Application application3 = this.b;
        application3.getClass();
        this.f = y7.l(application3);
    }
}
