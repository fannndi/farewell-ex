package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.DialogInterface;
import android.os.Build;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class bi0 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int g;
    public final /* synthetic */ ei0 h;

    public /* synthetic */ bi0(ei0 ei0Var, int i) {
        this.g = i;
        this.h = ei0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.g;
        ei0 ei0Var = this.h;
        switch (i2) {
            case 0:
                try {
                    ei0Var.h0.dismiss();
                    break;
                } catch (IllegalStateException unused) {
                    return;
                }
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                try {
                    ei0.F0(ei0Var.i0());
                    break;
                } catch (IllegalStateException unused2) {
                    return;
                }
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                try {
                    ei0Var.h0.dismiss();
                    break;
                } catch (IllegalStateException unused3) {
                    return;
                }
            case 3:
                try {
                    ei0Var.i0().unregisterReceiver(ei0Var.j0);
                } catch (Exception unused4) {
                }
                try {
                    BluetoothAdapter bluetoothAdapter = ei0Var.i0;
                    if (bluetoothAdapter != null) {
                        if (Build.VERSION.SDK_INT < 31) {
                            bluetoothAdapter.cancelDiscovery();
                        } else if (pr.g(ei0Var.i0(), "android.permission.BLUETOOTH_SCAN") == 0) {
                            ei0Var.i0.cancelDiscovery();
                        } else {
                            ei0Var.f0(new String[]{"android.permission.BLUETOOTH_SCAN"}, 133);
                        }
                    }
                    ei0Var.h0.dismiss();
                    break;
                } catch (Exception unused5) {
                    return;
                }
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                ci0 ci0Var = ei0Var.j0;
                if (ci0Var != null) {
                    try {
                        ei0Var.i0().unregisterReceiver(ci0Var);
                    } catch (Exception unused6) {
                    }
                }
                try {
                    BluetoothAdapter bluetoothAdapter2 = ei0Var.i0;
                    if (bluetoothAdapter2 != null) {
                        bluetoothAdapter2.cancelDiscovery();
                    }
                    ei0.F0(ei0Var.i0());
                    break;
                } catch (Exception unused7) {
                    return;
                }
            case 5:
                try {
                    ei0Var.h0.dismiss();
                    break;
                } catch (IllegalStateException unused8) {
                    return;
                }
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                try {
                    ei0Var.h0.dismiss();
                    break;
                } catch (IllegalStateException unused9) {
                    return;
                }
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                try {
                    ei0Var.h0.dismiss();
                    break;
                } catch (IllegalStateException unused10) {
                    return;
                }
            case 8:
                try {
                    ei0Var.h0.dismiss();
                    break;
                } catch (IllegalStateException unused11) {
                    return;
                }
            default:
                mi0 mi0Var = ei0Var.g0;
                mi0Var.d.execute(new gi0(mi0Var, 1));
                break;
        }
    }
}
