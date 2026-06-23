package defpackage;

import flar2.devcheck.R;
import flar2.devcheck.tools.BluetoothActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class pk implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ qk h;

    public /* synthetic */ pk(qk qkVar, int i) {
        this.g = i;
        this.h = qkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        qk qkVar = this.h;
        switch (i) {
            case 0:
                BluetoothActivity bluetoothActivity = qkVar.b;
                bluetoothActivity.L.setVisibility(0);
                bluetoothActivity.getString(R.string.permission_denied);
                bluetoothActivity.M.setText(bluetoothActivity.getString(R.string.permission_denied) + "\nandroid.permission.BLUETOOTH_SCAN");
                break;
            default:
                BluetoothActivity bluetoothActivity2 = qkVar.b;
                bluetoothActivity2.L.setVisibility(0);
                bluetoothActivity2.M.setText(bluetoothActivity2.getString(R.string.none));
                break;
        }
    }
}
