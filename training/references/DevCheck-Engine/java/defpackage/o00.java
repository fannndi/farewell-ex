package defpackage;

import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;

/* loaded from: classes.dex */
public final class o00 extends PhoneStateListener {
    @Override // android.telephony.PhoneStateListener
    public final void onServiceStateChanged(ServiceState serviceState) {
        try {
            super.onServiceStateChanged(serviceState);
            serviceState.toString().contains("nrState=CONNECTED");
            int i = p00.H1;
        } catch (Exception unused) {
        }
    }

    @Override // android.telephony.PhoneStateListener
    public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
        try {
            super.onSignalStrengthsChanged(signalStrength);
            new Thread(new l2(29, signalStrength)).start();
        } catch (Exception unused) {
        }
    }
}
