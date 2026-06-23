package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import android.widget.CheckBox;
import flar2.devcheck.MainActivity;
import flar2.devcheck.R;
import flar2.devcheck.tools.BluetoothActivity;
import flar2.devcheck.tools.USBActivity;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class gi implements DialogInterface.OnClickListener {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ gi(Object obj, int i, Object obj2) {
        this.g = i;
        this.h = obj;
        this.i = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.g;
        int i3 = 1000;
        String str = GFUHKHDfiFuPm.WiUQ;
        switch (i2) {
            case 0:
                ki kiVar = (ki) this.h;
                if (((CheckBox) this.i).isChecked()) {
                    i51.h("bench_submit_dont_ask", true);
                }
                kiVar.x0();
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                BluetoothActivity bluetoothActivity = (BluetoothActivity) this.h;
                String str2 = (String) this.i;
                if (!bluetoothActivity.F.isEnabled()) {
                    if (Build.VERSION.SDK_INT < 31) {
                        bluetoothActivity.F.enable();
                    } else if (pr.g(bluetoothActivity, "android.permission.BLUETOOTH_CONNECT") == 0) {
                        bluetoothActivity.F.enable();
                    } else {
                        bluetoothActivity.requestPermissions(new String[]{"android.permission.BLUETOOTH_CONNECT"}, 134);
                    }
                    i3 = 3000;
                }
                if (!str2.equals(bluetoothActivity.getString(R.string.paired_devices))) {
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 < 31) {
                        if (i4 < 26) {
                            bluetoothActivity.E(i3);
                            break;
                        } else if (pr.g(bluetoothActivity, str) != 0) {
                            bluetoothActivity.requestPermissions(new String[]{str}, 132);
                            break;
                        } else {
                            bluetoothActivity.E(i3);
                            break;
                        }
                    } else if (pr.g(bluetoothActivity, "android.permission.BLUETOOTH_SCAN") != 0 || pr.g(bluetoothActivity, str) != 0) {
                        bluetoothActivity.requestPermissions(new String[]{"android.permission.BLUETOOTH_SCAN", str}, 132);
                        break;
                    } else {
                        bluetoothActivity.E(i3);
                        break;
                    }
                } else {
                    bluetoothActivity.C(i3);
                    break;
                }
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                ei0 ei0Var = (ei0) this.h;
                String str3 = (String) this.i;
                if (!ei0Var.i0.isEnabled()) {
                    if (Build.VERSION.SDK_INT < 31) {
                        ei0Var.i0.enable();
                        if (str3.equals(ei0Var.A(R.string.bluetooth_support))) {
                            new Handler().postDelayed(new r60(3, ei0Var), 1500L);
                            break;
                        }
                    } else if (pr.g(ei0Var.i0(), "android.permission.BLUETOOTH_CONNECT") != 0) {
                        ei0Var.f0(new String[]{"android.permission.BLUETOOTH_CONNECT"}, 134);
                        break;
                    } else {
                        ei0Var.i0.enable();
                        if (str3.equals(ei0Var.A(R.string.bluetooth_support))) {
                            ei0Var.g0.l();
                            break;
                        }
                    }
                    i3 = 3000;
                }
                if (str3.equals(ei0Var.A(R.string.paired_devices)) || str3.equals("Paired devices")) {
                    if (Build.VERSION.SDK_INT < 31) {
                        ei0Var.v0(0);
                    } else if (pr.g(ei0Var.i0(), "android.permission.BLUETOOTH_SCAN") == 0) {
                        ei0Var.v0(0);
                    } else {
                        ei0Var.f0(new String[]{"android.permission.BLUETOOTH_SCAN"}, 133);
                    }
                }
                if (str3.equals(ei0Var.A(R.string.nearby_devices)) || str3.equals("Nearby devices")) {
                    int i5 = Build.VERSION.SDK_INT;
                    if (i5 < 31) {
                        if (i5 < 26) {
                            ei0Var.B0(i3);
                            break;
                        } else if (pr.g(ei0Var.i0(), str) != 0) {
                            ei0Var.f0(new String[]{str}, 132);
                            break;
                        } else {
                            ei0Var.B0(i3);
                            break;
                        }
                    } else if (pr.g(ei0Var.i0(), "android.permission.BLUETOOTH_SCAN") != 0 || pr.g(ei0Var.i0(), str) != 0) {
                        ei0Var.f0(new String[]{"android.permission.BLUETOOTH_SCAN", str}, 132);
                        break;
                    } else {
                        ei0Var.B0(i3);
                        break;
                    }
                }
                break;
            case 3:
                try {
                    ((ei0) this.h).t0((Intent) this.i, 213);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                MainActivity mainActivity = (MainActivity) this.h;
                String[] strArr = (String[]) this.i;
                String str4 = MainActivity.U;
                String str5 = strArr[i];
                String F = pr.F(str5);
                i51.m("prefLanguage", str5);
                mainActivity.getApplicationContext();
                pr.T(F);
                dialogInterface.dismiss();
                Context applicationContext = mainActivity.getApplicationContext();
                Intent launchIntentForPackage = applicationContext.getPackageManager().getLaunchIntentForPackage(applicationContext.getPackageName());
                if (launchIntentForPackage != null) {
                    applicationContext.startActivity(Intent.makeRestartActivityTask(launchIntentForPackage.getComponent()));
                    Runtime.getRuntime().exit(0);
                    break;
                }
                break;
            case 5:
                USBActivity uSBActivity = (USBActivity) this.h;
                Intent intent = (Intent) this.i;
                int i6 = USBActivity.S;
                try {
                    uSBActivity.startActivityForResult(intent, 215);
                    break;
                } catch (Exception unused2) {
                    return;
                }
            default:
                ((m92) this.h).a(((int[]) this.i)[0]);
                break;
        }
    }
}
