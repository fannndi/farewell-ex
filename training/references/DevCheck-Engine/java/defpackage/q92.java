package defpackage;

import android.os.Handler;
import flar2.devcheck.R;
import flar2.devcheck.tools.WifiActivity;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class q92 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ WifiActivity h;

    public /* synthetic */ q92(WifiActivity wifiActivity, int i) {
        this.g = i;
        this.h = wifiActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        WifiActivity wifiActivity = this.h;
        switch (i) {
            case 0:
                Handler handler = wifiActivity.O;
                if (handler != null) {
                    handler.removeCallbacks(wifiActivity.P);
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                int i2 = WifiActivity.R;
                wifiActivity.D();
                break;
            default:
                wifiActivity.H.setVisibility(0);
                wifiActivity.I.setText(wifiActivity.getString(R.string.wifi) + " " + wifiActivity.getString(R.string.disabled));
                break;
        }
    }
}
