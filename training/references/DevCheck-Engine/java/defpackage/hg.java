package defpackage;

import android.content.DialogInterface;
import android.widget.Button;
import flar2.devcheck.widgets.batteryWidget.BatteryWidgetConfigureActivity;
import flar2.devcheck.widgets.dashWidget.DashWidgetConfigureActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class hg implements DialogInterface.OnShowListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f381a;
    public final /* synthetic */ a5 b;

    public /* synthetic */ hg(a5 a5Var, int i) {
        this.f381a = i;
        this.b = a5Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        int i = this.f381a;
        int i2 = 0;
        a5 a5Var = this.b;
        switch (i) {
            case 0:
                BatteryWidgetConfigureActivity batteryWidgetConfigureActivity = (BatteryWidgetConfigureActivity) a5Var;
                Button f = batteryWidgetConfigureActivity.F.f(-3);
                i51.a("batWidgetTitle");
                f.setOnClickListener(new jg(batteryWidgetConfigureActivity, i2));
                break;
            default:
                DashWidgetConfigureActivity dashWidgetConfigureActivity = (DashWidgetConfigureActivity) a5Var;
                Button f2 = dashWidgetConfigureActivity.F.f(-3);
                i51.a("dashWidgetTitle");
                f2.setOnClickListener(new uz(dashWidgetConfigureActivity, i2));
                break;
        }
    }
}
