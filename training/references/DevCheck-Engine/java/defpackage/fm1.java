package defpackage;

import android.app.Application;
import android.hardware.SensorManager;
import flar2.devcheck.MainApp;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class fm1 extends a4 {
    public qy0 c;
    public final ExecutorService d;
    public final List e;

    static {
        new l0(14);
    }

    public fm1(Application application) {
        super(application);
        this.d = MainApp.h;
        Application application2 = this.b;
        application2.getClass();
        this.e = ((SensorManager) application2.getApplicationContext().getSystemService("sensor")).getSensorList(-1);
    }
}
