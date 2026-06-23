package defpackage;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class sx0 extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tx0 f960a;

    public sx0(tx0 tx0Var) {
        this.f960a = tx0Var;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType;
        int networkType;
        tx0 tx0Var = this.f960a;
        overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        networkType = telephonyDisplayInfo.getNetworkType();
        tx0Var.f = (overrideNetworkType == 1 || overrideNetworkType == 2) ? "LTE+" : (overrideNetworkType == 3 || overrideNetworkType == 4) ? "5G" : overrideNetworkType != 5 ? tx0.b(networkType) : "5G+";
        Iterator it = this.f960a.c.iterator();
        while (it.hasNext()) {
            ((a21) it.next()).f5a.u();
        }
    }
}
