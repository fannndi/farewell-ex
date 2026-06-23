package defpackage;

import flar2.devcheck.BatteryMonitor.BatteryActivity;
import flar2.devcheck.tests.ChargingActivity;
import java.util.TimerTask;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class af extends TimerTask {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ af(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                ((BatteryActivity) obj).runOnUiThread(new l2(7, this));
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                fg fgVar = (fg) obj;
                fgVar.d.execute(new l2(9, fgVar));
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                ((ChargingActivity) obj).runOnUiThread(new l2(23, this));
                break;
            default:
                ((v21) obj).k();
                break;
        }
    }
}
