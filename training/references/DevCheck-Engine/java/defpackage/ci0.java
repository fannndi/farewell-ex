package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.pairip.VMRunner;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.history.Hq.CGvJMCDBOmCdj;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ci0 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125a;
    public final /* synthetic */ ei0 b;

    /* loaded from: classes3.dex */
    public abstract class c2020060317 extends BroadcastReceiver {
        public static final void onReceive(ci0 ci0Var, Context context, Intent intent) {
            switch (ci0Var.f125a) {
                case 0:
                    ei0 ei0Var = ci0Var.b;
                    ArrayList arrayList = ei0Var.m0;
                    if (XmJDY.rmeAYxnKVUQtX.equals(intent.getAction())) {
                        int i = 0;
                        if (arrayList.size() == 1 && ((hn0) arrayList.get(0)).u == 1) {
                            arrayList.remove(0);
                        }
                        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                        float shortExtra = intent.getShortExtra("android.bluetooth.device.extra.RSSI", Short.MIN_VALUE);
                        float abs = 167.0f - (Math.abs(shortExtra) * 1.6666666f);
                        int size = arrayList.size();
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            if (((hn0) obj).e.equals(bluetoothDevice.getAddress())) {
                                break;
                            }
                        }
                        if (Build.VERSION.SDK_INT < 31) {
                            String name = bluetoothDevice.getName();
                            if (TextUtils.isEmpty(name)) {
                                name = "<" + ei0Var.A(R.string.unknown) + ">";
                            }
                            arrayList.add(new hn0(name, "", bluetoothDevice.getAddress(), shortExtra + "dBm", (int) abs, 19));
                        } else if (pr.g(ei0Var.i0(), "android.permission.BLUETOOTH_CONNECT") == 0) {
                            String name2 = bluetoothDevice.getName();
                            if (TextUtils.isEmpty(name2)) {
                                name2 = bluetoothDevice.getAlias();
                                if (TextUtils.isEmpty(name2)) {
                                    name2 = "<" + ei0Var.A(R.string.unknown) + ">";
                                }
                            }
                            arrayList.add(new hn0(name2, "", bluetoothDevice.getAddress(), shortExtra + "dBm", (int) abs, 19));
                        } else {
                            ei0Var.f0(new String[]{"android.permission.BLUETOOTH_CONNECT"}, 134);
                        }
                        ei0Var.l0.f();
                        break;
                    }
                    break;
                default:
                    String action = intent.getAction();
                    if (!"android.hardware.usb.action.USB_DEVICE_ATTACHED".equals(action)) {
                        CGvJMCDBOmCdj.dvmRZnKxnL.equals(action);
                        break;
                    } else {
                        new Handler().postDelayed(new r60(4, ci0Var), 1000L);
                        break;
                    }
            }
        }
    }

    public /* synthetic */ ci0(ei0 ei0Var, int i) {
        this.f125a = i;
        this.b = ei0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("3jhX3UqkfWvCcYLO", new Object[]{ci0.class, new Object[]{this, context, intent}});
    }
}
