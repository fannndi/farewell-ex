package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import flar2.devcheck.R;
import flar2.devcheck.widgets.batteryWidget.BatteryWidgetConfigureActivity;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class jg implements View.OnClickListener {
    public final /* synthetic */ int g;
    public final /* synthetic */ BatteryWidgetConfigureActivity h;

    public /* synthetic */ jg(BatteryWidgetConfigureActivity batteryWidgetConfigureActivity, int i) {
        this.g = i;
        this.h = batteryWidgetConfigureActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.g;
        BatteryWidgetConfigureActivity batteryWidgetConfigureActivity = this.h;
        switch (i) {
            case 0:
                batteryWidgetConfigureActivity.S.setText(d10.o((Context) batteryWidgetConfigureActivity.K.get()));
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                int i2 = BatteryWidgetConfigureActivity.T;
                View inflate = batteryWidgetConfigureActivity.getLayoutInflater().inflate(R.layout.edit_text_view, (ViewGroup) null);
                EditText editText = (EditText) inflate.findViewById(R.id.edit_text);
                batteryWidgetConfigureActivity.S = editText;
                editText.setText(batteryWidgetConfigureActivity.P);
                if (batteryWidgetConfigureActivity.K.get() != null) {
                    th2 th2Var = new th2((Context) batteryWidgetConfigureActivity.K.get());
                    j3 j3Var = (j3) th2Var.h;
                    j3Var.e = batteryWidgetConfigureActivity.getString(R.string.title);
                    j3Var.s = inflate;
                    th2Var.j(batteryWidgetConfigureActivity.getString(R.string.save), new qf(1, batteryWidgetConfigureActivity));
                    j3Var.l = batteryWidgetConfigureActivity.getString(R.string.reset);
                    j3Var.m = null;
                    th2Var.h(batteryWidgetConfigureActivity.getString(R.string.cancel), null);
                    n3 a2 = th2Var.a();
                    batteryWidgetConfigureActivity.F = a2;
                    a2.setOnShowListener(new hg(batteryWidgetConfigureActivity, 0));
                    batteryWidgetConfigureActivity.F.show();
                    try {
                        batteryWidgetConfigureActivity.F.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                        int i3 = (((BatteryWidgetConfigureActivity) batteryWidgetConfigureActivity.K.get()).getResources().getDisplayMetrics().widthPixels * 80) / 100;
                        if (((BatteryWidgetConfigureActivity) batteryWidgetConfigureActivity.K.get()).getResources().getConfiguration().orientation == 2 || ((BatteryWidgetConfigureActivity) batteryWidgetConfigureActivity.K.get()).getResources().getBoolean(R.bool.isTablet)) {
                            i3 = (((BatteryWidgetConfigureActivity) batteryWidgetConfigureActivity.K.get()).getResources().getDisplayMetrics().widthPixels * 50) / 100;
                        }
                        batteryWidgetConfigureActivity.F.getWindow().setLayout(i3, -2);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                int i4 = BatteryWidgetConfigureActivity.T;
                uz1.q0(batteryWidgetConfigureActivity);
                break;
            default:
                int i5 = BatteryWidgetConfigureActivity.T;
                pr.R(batteryWidgetConfigureActivity, new String[]{"android.permission.POST_NOTIFICATIONS"}, 226);
                break;
        }
    }
}
