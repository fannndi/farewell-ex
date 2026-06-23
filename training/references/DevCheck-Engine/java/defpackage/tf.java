package defpackage;

import android.content.SharedPreferences;
import flar2.devcheck.monitors.BatteryMonitorWindow;
import flar2.devcheck.monitors.CPUMonitorWindow;
import flar2.devcheck.monitors.CurrentMonitorWindow;
import flar2.devcheck.monitors.FPSMonitorWindow;
import flar2.devcheck.monitors.GPUMonitorWindow;
import flar2.devcheck.monitors.LoadMonitorWindow;
import flar2.devcheck.monitors.NetworkMonitorWindow;
import flar2.devcheck.monitors.RamMonitorWindow;
import flar2.devcheck.monitors.SignalMonitorWindow;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class tf implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f986a;
    public final /* synthetic */ oq1 b;

    public /* synthetic */ tf(oq1 oq1Var, int i) {
        this.f986a = i;
        this.b = oq1Var;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        int i = this.f986a;
        oq1 oq1Var = this.b;
        switch (i) {
            case 0:
                int i2 = BatteryMonitorWindow.D;
                ((BatteryMonitorWindow) oq1Var).y();
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                int i3 = CPUMonitorWindow.U;
                ((CPUMonitorWindow) oq1Var).y();
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                int i4 = CurrentMonitorWindow.I;
                ((CurrentMonitorWindow) oq1Var).y();
                break;
            case 3:
                int i5 = FPSMonitorWindow.C;
                ((FPSMonitorWindow) oq1Var).y();
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                int i6 = GPUMonitorWindow.E;
                ((GPUMonitorWindow) oq1Var).y();
                break;
            case 5:
                String[] strArr = LoadMonitorWindow.O;
                ((LoadMonitorWindow) oq1Var).y();
                break;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                int i7 = NetworkMonitorWindow.G;
                ((NetworkMonitorWindow) oq1Var).y();
                break;
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                int i8 = RamMonitorWindow.G;
                ((RamMonitorWindow) oq1Var).y();
                break;
            default:
                int i9 = SignalMonitorWindow.D;
                ((SignalMonitorWindow) oq1Var).z();
                break;
        }
    }
}
