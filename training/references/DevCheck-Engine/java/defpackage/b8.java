package defpackage;

import android.app.Activity;
import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Insets;
import android.os.Trace;
import android.view.ViewGroup;
import androidx.work.impl.foreground.SystemForegroundService;
import defpackage.m91;
import flar2.devcheck.BatteryMonitor.BatteryMonitorService;

/* loaded from: classes.dex */
public abstract class b8 {
    public static String a(Context context) {
        return context.getOpPackageName();
    }

    public static boolean b() {
        return Trace.isEnabled();
    }

    public static Insets c(int i, int i2, int i3, int i4) {
        return Insets.of(i, i2, i3, i4);
    }

    public static void d(Resources.Theme theme) {
        theme.rebase();
    }

    public static final void e(Activity activity, m91.a aVar) {
        activity.registerActivityLifecycleCallbacks(aVar);
    }

    public static void f(Notification.Builder builder, boolean z) {
        builder.setAllowSystemGeneratedContextualActions(z);
    }

    public static void g(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void h(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }

    public static void i(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        systemForegroundService.startForeground(i, notification, i2);
    }

    public static void j(BatteryMonitorService batteryMonitorService, Notification notification) {
        batteryMonitorService.startForeground(48, notification, 0);
    }

    public static void k(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        try {
            systemForegroundService.startForeground(i, notification, i2);
        } catch (ForegroundServiceStartNotAllowedException unused) {
            ai1 h = ai1.h();
            int i3 = SystemForegroundService.k;
            h.getClass();
        } catch (SecurityException unused2) {
            ai1 h2 = ai1.h();
            int i4 = SystemForegroundService.k;
            h2.getClass();
        }
    }

    public static void l(BatteryMonitorService batteryMonitorService, Notification notification) {
        batteryMonitorService.startForeground(48, notification, 1073741824);
    }

    public static void m(ViewGroup viewGroup, boolean z) {
        viewGroup.suppressLayout(z);
    }
}
