package defpackage;

import android.app.Application;
import android.content.pm.PackageManager;
import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;
import flar2.devcheck.MainApp;
import flar2.devcheck.sensors.JCZI.nyGJ;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class q51 extends a4 {
    public final PackageManager c;
    public qy0 d;

    public q51(Application application) {
        super(application);
        this.c = application.getPackageManager();
        ExecutorService executorService = MainApp.h;
    }

    public static String d(int i) {
        switch (i) {
            case 11:
                return "11 (Android 3.0)";
            case 12:
                return "12 (Android 3.1)";
            case 13:
                return "13 (Android 3.2)";
            case 14:
                return "14 (Android 4)";
            case 15:
                return "15 (Android 4)";
            case 16:
                return "16 (Android 4.1)";
            case rt0.p /* 17 */:
                return "17 (Android 4.2)";
            case 18:
                return "18 (Android 4.3)";
            case 19:
                return "19 (Android 4.4)";
            case 20:
                return "20 (Android 4.4W)";
            case 21:
                return nyGJ.lyNRKfiARACg;
            case 22:
                return "22 (Android 5.1)";
            case 23:
                return "23 (Android 6)";
            case 24:
                return "24 (Android 7.0)";
            case 25:
                return "25 (Android 7.1)";
            case 26:
                return "26 (Android 8.0)";
            case 27:
                return "27 (Android 8.1)";
            case 28:
                return "28 (Android 9)";
            case 29:
                return "29 (Android 10)";
            case 30:
                return "30 (Android 11)";
            case 31:
                return "31 (Android 12)";
            case rt0.q /* 32 */:
                return "32 (Android 12L)";
            case 33:
                return "33 (Android 13)";
            case 34:
                return "34 (Android 14)";
            case 35:
                return bOxzFZXgEkjph.GrrHkHgU;
            default:
                return String.valueOf(i);
        }
    }

    public static String e(String str) {
        if (str == null || str.isEmpty()) {
            return "''";
        }
        if (str.indexOf(39) < 0) {
            return d51.y("'", str, "'");
        }
        return "'" + str.replace("'", "'\\''") + "'";
    }
}
