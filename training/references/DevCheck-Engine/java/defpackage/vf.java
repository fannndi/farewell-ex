package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pairip.VMRunner;
import flar2.devcheck.monitors.BatteryMonitorWindow;

/* loaded from: classes.dex */
public final class vf extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1084a;
    public final /* synthetic */ BatteryMonitorWindow b;

    public /* synthetic */ vf(BatteryMonitorWindow batteryMonitorWindow, int i) {
        this.f1084a = i;
        this.b = batteryMonitorWindow;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("VHHNRk8boKnYwmK0", new Object[]{this, context, intent});
    }
}
