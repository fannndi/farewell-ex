package defpackage;

import android.view.WindowManager;
import flar2.devcheck.tests.BrightnessActivity;
import flar2.devcheck.widgets.barDetailWidget.BarDetailWidgetConfigureActivity;
import flar2.devcheck.widgets.batteryWidget.BatteryWidgetConfigureActivity;
import flar2.devcheck.widgets.dashWidget.DashWidgetConfigureActivity;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class qc implements bp1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f834a;
    public final /* synthetic */ a5 b;

    public /* synthetic */ qc(a5 a5Var, int i) {
        this.f834a = i;
        this.b = a5Var;
    }

    @Override // defpackage.bp1
    public final void a(float f) {
        int i = this.f834a;
        a5 a5Var = this.b;
        switch (i) {
            case 0:
                BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity = (BarDetailWidgetConfigureActivity) a5Var;
                barDetailWidgetConfigureActivity.L = (int) f;
                barDetailWidgetConfigureActivity.F.setText(barDetailWidgetConfigureActivity.L + "%");
                barDetailWidgetConfigureActivity.B();
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                BatteryWidgetConfigureActivity batteryWidgetConfigureActivity = (BatteryWidgetConfigureActivity) a5Var;
                batteryWidgetConfigureActivity.L = (int) f;
                batteryWidgetConfigureActivity.H.setText(batteryWidgetConfigureActivity.L + "%");
                batteryWidgetConfigureActivity.B();
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                BrightnessActivity brightnessActivity = (BrightnessActivity) a5Var;
                int i2 = BrightnessActivity.F;
                WindowManager.LayoutParams attributes = brightnessActivity.getWindow().getAttributes();
                if (f < 0.0f) {
                    attributes.screenBrightness = -1.0f;
                } else {
                    attributes.screenBrightness = f;
                }
                brightnessActivity.getWindow().setAttributes(attributes);
                break;
            default:
                DashWidgetConfigureActivity dashWidgetConfigureActivity = (DashWidgetConfigureActivity) a5Var;
                dashWidgetConfigureActivity.L = (int) f;
                dashWidgetConfigureActivity.G.setText(dashWidgetConfigureActivity.L + "%");
                dashWidgetConfigureActivity.B();
                break;
        }
    }
}
