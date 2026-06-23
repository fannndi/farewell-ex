package defpackage;

import android.view.View;
import flar2.devcheck.monitors.BatteryMonitorWindow;
import flar2.devcheck.monitors.CPUMonitorWindow;
import flar2.devcheck.monitors.CurrentMonitorWindow;
import flar2.devcheck.monitors.FPSMonitorWindow;
import flar2.devcheck.monitors.GPUMonitorWindow;
import flar2.devcheck.monitors.NetworkMonitorWindow;
import flar2.devcheck.monitors.RamMonitorWindow;
import flar2.devcheck.monitors.SignalMonitorWindow;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class uf implements View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1039a;
    public final /* synthetic */ oq1 b;

    public /* synthetic */ uf(oq1 oq1Var, int i) {
        this.f1039a = i;
        this.b = oq1Var;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i) {
        int i2 = this.f1039a;
        oq1 oq1Var = this.b;
        switch (i2) {
            case 0:
                BatteryMonitorWindow batteryMonitorWindow = (BatteryMonitorWindow) oq1Var;
                if (i > 0 && zx0.b("prefMonitorFullscreen").booleanValue()) {
                    batteryMonitorWindow.u.setTranslationY(-8000.0f);
                    break;
                } else {
                    zx0.a(batteryMonitorWindow.u);
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                CPUMonitorWindow cPUMonitorWindow = (CPUMonitorWindow) oq1Var;
                if (i > 0 && zx0.b("prefMonitorFullscreen").booleanValue()) {
                    cPUMonitorWindow.t.setTranslationY(-8000.0f);
                    break;
                } else {
                    zx0.a(cPUMonitorWindow.t);
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                CurrentMonitorWindow currentMonitorWindow = (CurrentMonitorWindow) oq1Var;
                if (i > 0 && zx0.b("prefMonitorFullscreen").booleanValue()) {
                    currentMonitorWindow.v.setTranslationY(-8000.0f);
                    break;
                } else {
                    zx0.a(currentMonitorWindow.v);
                    break;
                }
            case 3:
                FPSMonitorWindow fPSMonitorWindow = (FPSMonitorWindow) oq1Var;
                if (i > 0 && zx0.b("prefMonitorFullscreen").booleanValue()) {
                    fPSMonitorWindow.t.setTranslationY(-8000.0f);
                    break;
                } else {
                    zx0.a(fPSMonitorWindow.t);
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                GPUMonitorWindow gPUMonitorWindow = (GPUMonitorWindow) oq1Var;
                if (i > 0 && zx0.b("prefMonitorFullscreen").booleanValue()) {
                    gPUMonitorWindow.u.setTranslationY(-8000.0f);
                    break;
                } else {
                    zx0.a(gPUMonitorWindow.u);
                    break;
                }
                break;
            case 5:
                NetworkMonitorWindow networkMonitorWindow = (NetworkMonitorWindow) oq1Var;
                if (i > 0 && zx0.b("prefMonitorFullscreen").booleanValue()) {
                    networkMonitorWindow.x.setTranslationY(-8000.0f);
                    break;
                } else {
                    zx0.a(networkMonitorWindow.x);
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                RamMonitorWindow ramMonitorWindow = (RamMonitorWindow) oq1Var;
                if (i > 0 && zx0.b("prefMonitorFullscreen").booleanValue()) {
                    ramMonitorWindow.u.setTranslationY(-8000.0f);
                    break;
                } else {
                    zx0.a(ramMonitorWindow.u);
                    break;
                }
                break;
            default:
                SignalMonitorWindow signalMonitorWindow = (SignalMonitorWindow) oq1Var;
                if (i > 0 && zx0.b("prefMonitorFullscreen").booleanValue()) {
                    signalMonitorWindow.w.setTranslationY(-8000.0f);
                    break;
                } else {
                    zx0.a(signalMonitorWindow.w);
                    break;
                }
                break;
        }
    }
}
