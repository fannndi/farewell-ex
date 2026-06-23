package defpackage;

import android.content.Context;
import android.telephony.fHMN.BFtDZYxPcpGN;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class df {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f188a = new AtomicBoolean(false);

    public static void a(Context context) {
        cf cfVar;
        int c = i51.c(0, "bat_cal_v1_version");
        cf cfVar2 = cf.c;
        if (c <= 0) {
            cfVar = cfVar2;
        } else {
            int c2 = i51.c(0, "bat_cal_v1_phase");
            int c3 = i51.c(0, BFtDZYxPcpGN.rPT);
            int c4 = i51.c(0, "bat_cal_v1_current_polarity");
            int c5 = i51.c(1, "bat_cal_v1_charge_ctr_scale");
            int c6 = i51.c(0, "bat_cal_v1_signal_bits");
            int c7 = i51.c(0, "bat_cal_v1_confidence");
            long d = i51.d("bat_cal_v1_calibrated_at");
            String e = i51.e("bat_cal_v1_fingerprint");
            if (e == null) {
                e = "";
            }
            cfVar = new cf(c2, c3, c4, c5, c6, c7, d, c, e);
        }
        if (!((cfVar != cfVar2 && cfVar.f122a == 1) ? c3.e().equals(cfVar.b) : false) && f188a.compareAndSet(false, true)) {
            Thread thread = new Thread(new h5(context.getApplicationContext(), 2), "BatCalibrator-P1");
            thread.setPriority(4);
            thread.start();
        }
    }
}
