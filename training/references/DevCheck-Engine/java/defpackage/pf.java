package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.preference.Preference;
import flar2.devcheck.R;
import flar2.devcheck.batteryMonitor2.ui.settings.BatteryMonitor2SettingsFragment;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class pf implements m81 {
    public final /* synthetic */ int g;
    public final /* synthetic */ BatteryMonitor2SettingsFragment h;

    public /* synthetic */ pf(BatteryMonitor2SettingsFragment batteryMonitor2SettingsFragment, int i) {
        this.g = i;
        this.h = batteryMonitor2SettingsFragment;
    }

    @Override // defpackage.m81
    public void a(Preference preference) {
        int i = this.g;
        BatteryMonitor2SettingsFragment batteryMonitor2SettingsFragment = this.h;
        switch (i) {
            case 0:
                Context i0 = batteryMonitor2SettingsFragment.i0();
                pf pfVar = new pf(batteryMonitor2SettingsFragment, 2);
                yf e = yf.e(i0);
                ((ExecutorService) e.g).execute(new b9(5, i0, e, pfVar));
                break;
            default:
                th2 th2Var = new th2(batteryMonitor2SettingsFragment.i0());
                th2Var.k(R.string.bm2_clear_dialog_title);
                th2Var.f(R.string.bm2_clear_dialog_message);
                th2Var.g(android.R.string.cancel, null);
                th2Var.i(R.string.bm2_clear_dialog_confirm, new qf(0, batteryMonitor2SettingsFragment));
                th2Var.l();
                break;
        }
    }

    public void b(Uri uri) {
        BatteryMonitor2SettingsFragment batteryMonitor2SettingsFragment = this.h;
        if (batteryMonitor2SettingsFragment.G()) {
            if (uri == null) {
                Toast.makeText(batteryMonitor2SettingsFragment.i0(), R.string.bm2_csv_export_failed, 0).show();
                return;
            }
            Context i0 = batteryMonitor2SettingsFragment.i0();
            String A = batteryMonitor2SettingsFragment.A(R.string.bm2_csv_share_title);
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("text/csv");
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.addFlags(1);
            Intent createChooser = Intent.createChooser(intent, A);
            createChooser.addFlags(268435456);
            i0.startActivity(createChooser);
        }
    }
}
