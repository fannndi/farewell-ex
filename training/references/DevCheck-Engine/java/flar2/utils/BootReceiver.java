package flar2.devcheck.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Build;
import com.pairip.VMRunner;
import defpackage.d10;
import defpackage.i51;
import defpackage.oq1;
import flar2.devcheck.BatteryMonitor.BatteryMonitorService;
import flar2.devcheck.dpreference.PreferenceProvider;
import flar2.devcheck.monitors.BatteryMonitorWindow;
import flar2.devcheck.monitors.CPUMonitorWindow;
import flar2.devcheck.monitors.CurrentMonitorWindow;
import flar2.devcheck.monitors.FPSMonitorWindow;
import flar2.devcheck.monitors.GPUMonitorWindow;
import flar2.devcheck.monitors.LoadMonitorWindow;
import flar2.devcheck.monitors.NetworkMonitorWindow;
import flar2.devcheck.monitors.RamMonitorWindow;
import flar2.devcheck.monitors.SignalMonitorWindow;
import flar2.devcheck.monitors.TempMonitorWindow;

/* loaded from: classes.dex */
public class BootReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f291a;

    public static void b(Context context, Class cls) {
        try {
            oq1.v(context, cls);
        } catch (Exception unused) {
            oq1.v(context, cls);
        }
    }

    public static void c(Context context) {
        if (i51.b("prefBMEnable").booleanValue()) {
            i51.k("prefBMStartMarker", -1L);
            Intent intent = new Intent(context.getApplicationContext(), (Class<?>) BatteryMonitorService.class);
            if (Build.VERSION.SDK_INT < 26) {
                context.startService(intent);
            } else {
                try {
                    context.startForegroundService(intent);
                } catch (Exception unused) {
                }
            }
        }
    }

    public final Boolean a(String str) {
        return Boolean.valueOf(this.f291a.getBoolean(str, false));
    }

    public final void d(Context context) {
        int i;
        this.f291a = d10.n().getSharedPreferences("monitors", 0);
        try {
            Cursor query = context.getContentResolver().query(PreferenceProvider.a(1, "prefMonitorBoot"), null, null, null, null);
            i = (query == null || !query.moveToFirst()) ? 0 : query.getInt(query.getColumnIndex("value"));
            if (query != null) {
                try {
                    if (!query.isClosed()) {
                        query.close();
                    }
                } catch (NullPointerException unused) {
                }
            }
        } catch (NullPointerException unused2) {
            i = 0;
        }
        if (i == 1) {
            if (a("prefBattMonEnable").booleanValue()) {
                b(context, BatteryMonitorWindow.class);
            }
            if (a("prefCPUMonEnable").booleanValue()) {
                b(context, CPUMonitorWindow.class);
            }
            if (a("prefGPUMonEnable").booleanValue()) {
                b(context, GPUMonitorWindow.class);
            }
            if (a("prefTempMonEnable").booleanValue()) {
                b(context, TempMonitorWindow.class);
            }
            if (a("prefLoadMonEnable").booleanValue()) {
                b(context, LoadMonitorWindow.class);
            }
            if (a("prefRamMonEnable").booleanValue()) {
                b(context, RamMonitorWindow.class);
            }
            if (a("prefCurMonEnable").booleanValue()) {
                b(context, CurrentMonitorWindow.class);
            }
            if (a("prefNetMonEnable").booleanValue()) {
                b(context, NetworkMonitorWindow.class);
            }
            if (a("prefSignalMonEnable").booleanValue()) {
                b(context, SignalMonitorWindow.class);
            }
            if (a("prefFPSMonEnable").booleanValue()) {
                b(context, FPSMonitorWindow.class);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("tYQldITieGBRygMz", new Object[]{this, context, intent});
    }
}
