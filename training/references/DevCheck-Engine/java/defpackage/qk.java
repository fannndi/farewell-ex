package defpackage;

import android.os.AsyncTask;
import android.view.View;
import com.pairip.VMRunner;
import flar2.devcheck.R;
import flar2.devcheck.tools.BluetoothActivity;
import java.util.List;

/* loaded from: classes.dex */
public final class qk extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f849a;
    public final /* synthetic */ BluetoothActivity b;

    public qk(BluetoothActivity bluetoothActivity, int i) {
        this.b = bluetoothActivity;
        this.f849a = i;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        return VMRunner.invoke("dLr713g8tmWnjbma", new Object[]{this, objArr});
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        List list = (List) obj;
        try {
            int size = list.size();
            BluetoothActivity bluetoothActivity = this.b;
            View view = bluetoothActivity.L;
            if (size <= 0) {
                view.setVisibility(0);
                bluetoothActivity.M.setText(bluetoothActivity.getString(R.string.none));
            } else {
                view.setVisibility(8);
                bluetoothActivity.I.setAdapter(new l01(bluetoothActivity, list));
            }
        } catch (Exception unused) {
        }
    }
}
