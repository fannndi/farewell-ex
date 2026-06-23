package defpackage;

import android.content.DialogInterface;
import flar2.devcheck.R;
import flar2.devcheck.tools.BluetoothActivity;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class ok implements DialogInterface.OnClickListener {
    public final /* synthetic */ int g;
    public final /* synthetic */ BluetoothActivity h;

    public /* synthetic */ ok(BluetoothActivity bluetoothActivity, int i) {
        this.g = i;
        this.h = bluetoothActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.g;
        BluetoothActivity bluetoothActivity = this.h;
        switch (i2) {
            case 0:
                int i3 = BluetoothActivity.O;
                try {
                    bluetoothActivity.G.dismiss();
                    bluetoothActivity.finish();
                    break;
                } catch (IllegalStateException unused) {
                    return;
                }
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                int i4 = BluetoothActivity.O;
                bluetoothActivity.requestPermissions(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.BLUETOOTH_SCAN"}, 133);
                break;
            default:
                int i5 = BluetoothActivity.O;
                try {
                    bluetoothActivity.G.dismiss();
                    bluetoothActivity.L.setVisibility(0);
                    bluetoothActivity.M.setText(bluetoothActivity.getString(R.string.disabled));
                    break;
                } catch (IllegalStateException unused2) {
                    return;
                }
        }
    }
}
