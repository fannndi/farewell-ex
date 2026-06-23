package defpackage;

import android.os.Build;
import android.telephony.CellSignalStrength;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import java.util.List;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class j21 extends PhoneStateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f458a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j21(int i, Object obj) {
        this.f458a = i;
        this.b = obj;
    }

    public static void a(j21 j21Var, SignalStrength signalStrength) {
        SignalStrength signalStrength2;
        List<CellSignalStrength> cellSignalStrengths;
        v21 v21Var = (v21) j21Var.b;
        try {
            super.onSignalStrengthsChanged(signalStrength);
        } catch (Exception unused) {
        }
        int i = Build.VERSION.SDK_INT;
        TelephonyManager telephonyManager = v21Var.e;
        try {
            if (i < 29) {
                int phoneType = telephonyManager.getPhoneType();
                if (phoneType == 1) {
                    switch (v21Var.e.getNetworkType()) {
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        case 3:
                        case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                        case 8:
                        case rt0.o /* 9 */:
                        case 10:
                        case 11:
                        case 14:
                        case 15:
                            try {
                                if (signalStrength.getGsmSignalStrength() <= 0) {
                                    v21.l = Integer.parseInt(signalStrength.toString().split(" ")[3]);
                                } else {
                                    v21.l = (r4 * 2) - 113;
                                }
                                break;
                            } catch (Exception unused2) {
                                v21.l = 0;
                                break;
                            }
                        case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                            try {
                                v21.l = signalStrength.getCdmaDbm();
                                break;
                            } catch (Exception unused3) {
                                v21.l = 0;
                                break;
                            }
                        case 5:
                        case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                        case 12:
                            try {
                                v21.l = signalStrength.getEvdoDbm();
                                break;
                            } catch (Exception unused4) {
                                v21.l = 0;
                                break;
                            }
                        case 13:
                            try {
                                v21.l = Integer.parseInt(SignalStrength.class.getMethod("getLteRsrp", null).invoke(signalStrength, null).toString());
                                break;
                            } catch (Exception unused5) {
                                v21.l = 0;
                                break;
                            }
                        default:
                            v21.l = 0;
                            break;
                    }
                } else if (phoneType != 2) {
                    v21.l = 0;
                } else {
                    v21.l = signalStrength.getCdmaDbm();
                }
            } else {
                signalStrength2 = telephonyManager.getSignalStrength();
                cellSignalStrengths = signalStrength2.getCellSignalStrengths();
                for (CellSignalStrength cellSignalStrength : cellSignalStrengths) {
                    v21.l = cellSignalStrength.getDbm();
                    v21.m = cellSignalStrength.getAsuLevel();
                }
            }
        } catch (Exception unused6) {
        }
        v21Var.k();
    }

    @Override // android.telephony.PhoneStateListener
    public void onServiceStateChanged(ServiceState serviceState) {
        switch (this.f458a) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                try {
                    super.onServiceStateChanged(serviceState);
                    serviceState.toString().contains("nrState=CONNECTED");
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                super.onServiceStateChanged(serviceState);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x012a A[Catch: all -> 0x0130, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0130, blocks: (B:39:0x00b2, B:41:0x00b6, B:42:0x00be, B:44:0x00c4, B:49:0x00d5, B:56:0x00dc, B:77:0x012a), top: B:38:0x00b2 }] */
    @Override // android.telephony.PhoneStateListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSignalStrengthsChanged(android.telephony.SignalStrength r7) {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j21.onSignalStrengthsChanged(android.telephony.SignalStrength):void");
    }
}
