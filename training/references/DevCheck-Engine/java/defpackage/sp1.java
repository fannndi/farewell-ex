package defpackage;

import android.app.Application;
import android.content.pm.PackageManager;
import flar2.devcheck.MainApp;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class sp1 extends a4 {
    public ew0 c;
    public final ExecutorService d;
    public final y7 e;
    public final PackageManager f;

    public sp1(Application application) {
        super(application);
        this.d = MainApp.h;
        Application application2 = this.b;
        application2.getClass();
        this.e = y7.l(application2);
        Application application3 = this.b;
        application3.getClass();
        this.f = application3.getPackageManager();
    }
}
