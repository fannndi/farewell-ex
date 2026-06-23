package defpackage;

import android.view.View;
import flar2.devcheck.PaywallActivity;
import flar2.devcheck.cputimes.CPUTimeActivity;
import flar2.devcheck.widgets.barDetailWidget.BarDetailWidgetConfigureActivity;
import flar2.devcheck.widgets.batteryWidget.BatteryWidgetConfigureActivity;
import flar2.devcheck.widgets.dashWidget.DashWidgetConfigureActivity;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class u8 implements b41 {
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int j;
    public final /* synthetic */ int k;

    public /* synthetic */ u8(int i, int i2, int i3, int i4, int i5) {
        this.g = i5;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = i4;
    }

    @Override // defpackage.b41
    public final gb2 v(View view, gb2 gb2Var) {
        int i = this.g;
        int i2 = this.k;
        int i3 = this.j;
        int i4 = this.i;
        int i5 = this.h;
        switch (i) {
            case 0:
                view.setPadding(i5, i4, i3, i2 + gb2Var.f329a.h(647).d);
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                int i6 = BarDetailWidgetConfigureActivity.T;
                mm0 h = gb2Var.f329a.h(647);
                view.setPadding(i5, i4 + h.b, i3, i2 + h.d);
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                int i7 = BatteryWidgetConfigureActivity.T;
                mm0 h2 = gb2Var.f329a.h(647);
                view.setPadding(i5, i4 + h2.b, i3, i2 + h2.d);
                break;
            case 3:
                int i8 = CPUTimeActivity.U;
                view.setPadding(i5, i4, i3, i2 + gb2Var.f329a.h(647).d);
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                int i9 = DashWidgetConfigureActivity.V;
                mm0 h3 = gb2Var.f329a.h(647);
                view.setPadding(i5, i4 + h3.b, i3, i2 + h3.d);
                break;
            case 5:
                int i10 = PaywallActivity.R;
                mm0 h4 = gb2Var.f329a.h(647);
                view.setPadding(i5 + h4.f643a, i4 + h4.b, i3 + h4.c, i2);
                break;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                int i11 = PaywallActivity.R;
                view.setPadding(i5, i4, i3, i2 + gb2Var.f329a.h(647).d);
                break;
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                view.setPadding(i5, i4, i3, i2 + gb2Var.f329a.h(647).d);
                break;
            case 8:
                view.setPadding(i5, i4, i3, i2 + gb2Var.f329a.h(647).d);
                break;
            default:
                view.setPadding(i5, i4, i3, i2 + gb2Var.f329a.h(647).d);
                break;
        }
        return gb2Var;
    }
}
