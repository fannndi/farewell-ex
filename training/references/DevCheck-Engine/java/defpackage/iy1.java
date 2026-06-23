package defpackage;

import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import flar2.devcheck.sensors.JCZI.nyGJ;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract /* synthetic */ class iy1 {
    public static Number a(int i, ro0 ro0Var) {
        if (i == 1) {
            return Double.valueOf(ro0Var.H());
        }
        if (i == 2) {
            return new ip0(ro0Var.O());
        }
        if (i == 3) {
            String O = ro0Var.O();
            if (O.indexOf(46) >= 0) {
                return b(O, ro0Var);
            }
            try {
                return Long.valueOf(Long.parseLong(O));
            } catch (NumberFormatException unused) {
                return b(O, ro0Var);
            }
        }
        String O2 = ro0Var.O();
        try {
            return ju0.e0(O2);
        } catch (NumberFormatException e) {
            StringBuilder w = d51.w("Cannot parse ", O2, "; at path ");
            w.append(ro0Var.v(true));
            throw new pt(w.toString(), e);
        }
    }

    public static Double b(String str, ro0 ro0Var) {
        try {
            Double valueOf = Double.valueOf(str);
            if (!valueOf.isInfinite()) {
                if (valueOf.isNaN()) {
                }
                return valueOf;
            }
            if (ro0Var.u != 1) {
                throw new xt0("JSON forbids NaN and infinities: " + valueOf + "; at path " + ro0Var.v(true));
            }
            return valueOf;
        } catch (NumberFormatException e) {
            StringBuilder w = d51.w("Cannot parse ", str, "; at path ");
            w.append(ro0Var.v(true));
            throw new pt(w.toString(), e);
        }
    }

    public static int c(int i, int i2, int i3) {
        return ml2.q(i) + i2 + i3;
    }

    public static int d(int i, int i2, int i3, int i4) {
        return ml2.q(i) + i2 + i3 + i4;
    }

    public static ClassCastException e(ArrayList arrayList, int i) {
        arrayList.get(i).getClass();
        return new ClassCastException();
    }

    public static /* synthetic */ void f(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            } else if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else {
                if (!(autoCloseable instanceof MediaDrm)) {
                    throw new IllegalArgumentException();
                }
                ((MediaDrm) autoCloseable).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void g(Object obj) {
        if (obj == null) {
            return;
        }
        rw.b();
    }

    public static /* synthetic */ String h(int i) {
        if (i == 1) {
            return "DIE";
        }
        if (i == 2) {
            return nyGJ.rxamcTdSssd;
        }
        if (i == 3) {
            return "UNKNOWN";
        }
        throw null;
    }

    public static /* synthetic */ int i(String str) {
        if (str == null) {
            jw0.f("Name is null");
            return 0;
        }
        if (str.equals("DIE")) {
            return 1;
        }
        if (str.equals("SKIN")) {
            return 2;
        }
        if (str.equals("UNKNOWN")) {
            return 3;
        }
        c.m("No enum constant flar2.devcheck.temperature.schema.ThermalSchemaManager.DieOrSkin.".concat(str));
        return 0;
    }
}
