package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pairip.VMRunner;
import flar2.devcheck.monitors.TempMonitorWindow;

/* loaded from: classes.dex */
public final class ow1 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f763a;
    public final /* synthetic */ TempMonitorWindow b;

    public /* synthetic */ ow1(TempMonitorWindow tempMonitorWindow, int i) {
        this.f763a = i;
        this.b = tempMonitorWindow;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("f9uqSNJQP6PlbXUm", new Object[]{this, context, intent});
    }
}
