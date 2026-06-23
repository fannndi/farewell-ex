package flar2.devcheck.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pairip.VMRunner;

/* loaded from: classes.dex */
public class MonitorReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("Apcwp9jLIuIAsELD", new Object[]{this, context, intent});
    }
}
