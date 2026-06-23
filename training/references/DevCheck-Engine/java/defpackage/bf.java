package defpackage;

import android.os.AsyncTask;
import com.pairip.VMRunner;
import flar2.devcheck.BatteryMonitor.BatteryActivity;
import java.util.Timer;

/* loaded from: classes.dex */
public final class bf extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f80a;
    public final /* synthetic */ BatteryActivity b;

    public /* synthetic */ bf(BatteryActivity batteryActivity, int i) {
        this.f80a = i;
        this.b = batteryActivity;
    }

    private final void a() {
    }

    private final void b() {
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        return VMRunner.invoke("bkdbXjTTW0snfiqU", new Object[]{this, objArr});
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        int i = this.f80a;
        BatteryActivity batteryActivity = this.b;
        switch (i) {
            case 0:
                try {
                    batteryActivity.L.setSelection(0);
                } catch (Exception unused) {
                }
                int i2 = BatteryActivity.b0;
                batteryActivity.G();
                break;
            default:
                int i3 = BatteryActivity.b0;
                batteryActivity.G();
                Timer timer = new Timer();
                batteryActivity.Y = timer;
                timer.schedule(new af(0, batteryActivity), 0L, 1000L);
                break;
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        int i = this.f80a;
    }
}
