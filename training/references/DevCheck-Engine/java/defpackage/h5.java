package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class h5 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ Context h;

    public /* synthetic */ h5(Context context, int i) {
        this.g = i;
        this.h = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        Context context = this.h;
        switch (i) {
            case 0:
                if (Build.VERSION.SDK_INT >= 33) {
                    ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (m5.b().b()) {
                            String Q = pr.Q(context);
                            Object systemService = context.getSystemService("locale");
                            if (systemService != null) {
                                j5.b(systemService, i5.a(Q));
                            }
                        }
                        context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                    }
                }
                m5.l = true;
                return;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                m5.o(context);
                return;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                AtomicBoolean atomicBoolean = df.f188a;
                try {
                    c3.I(context);
                } catch (Throwable unused) {
                }
                atomicBoolean.set(false);
                return;
            case 3:
                AtomicBoolean atomicBoolean2 = p00.X1;
                try {
                    p00.A0(context);
                    return;
                } finally {
                    atomicBoolean2.set(false);
                }
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new h5(context, 5));
                return;
            default:
                ta1.b(context, new g9(1), ta1.f977a, false);
                return;
        }
    }
}
