package defpackage;

import flar2.devcheck.BatteryMonitor.BatteryMonitorService;

/* loaded from: classes.dex */
public final /* synthetic */ class rf implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ BatteryMonitorService h;

    public /* synthetic */ rf(BatteryMonitorService batteryMonitorService, int i) {
        this.g = i;
        this.h = batteryMonitorService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        BatteryMonitorService batteryMonitorService = this.h;
        switch (i) {
            case 0:
                gm2.P(batteryMonitorService.s, true);
                break;
            default:
                gm2.P(batteryMonitorService.s, false);
                break;
        }
    }
}
