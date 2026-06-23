package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import flar2.devcheck.R;
import flar2.devcheck.widgets.dashWidget.DashWidgetConfigureActivity;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class uz implements View.OnClickListener {
    public final /* synthetic */ int g;
    public final /* synthetic */ DashWidgetConfigureActivity h;

    public /* synthetic */ uz(DashWidgetConfigureActivity dashWidgetConfigureActivity, int i) {
        this.g = i;
        this.h = dashWidgetConfigureActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.g;
        DashWidgetConfigureActivity dashWidgetConfigureActivity = this.h;
        switch (i) {
            case 0:
                dashWidgetConfigureActivity.U.setText(rt0.q((Context) dashWidgetConfigureActivity.Q.get()));
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                int i2 = DashWidgetConfigureActivity.V;
                View inflate = dashWidgetConfigureActivity.getLayoutInflater().inflate(R.layout.edit_text_view, (ViewGroup) null);
                EditText editText = (EditText) inflate.findViewById(R.id.edit_text);
                dashWidgetConfigureActivity.U = editText;
                editText.setText(dashWidgetConfigureActivity.P);
                if (dashWidgetConfigureActivity.Q.get() != null) {
                    th2 th2Var = new th2((Context) dashWidgetConfigureActivity.Q.get());
                    j3 j3Var = (j3) th2Var.h;
                    j3Var.e = dashWidgetConfigureActivity.getString(R.string.title);
                    j3Var.s = inflate;
                    th2Var.j(dashWidgetConfigureActivity.getString(R.string.save), new qf(6, dashWidgetConfigureActivity));
                    j3Var.l = dashWidgetConfigureActivity.getString(R.string.reset);
                    j3Var.m = null;
                    th2Var.h(dashWidgetConfigureActivity.getString(R.string.cancel), null);
                    n3 a2 = th2Var.a();
                    dashWidgetConfigureActivity.F = a2;
                    a2.setOnShowListener(new hg(dashWidgetConfigureActivity, 1));
                    dashWidgetConfigureActivity.F.show();
                    try {
                        dashWidgetConfigureActivity.F.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                        int i3 = (((DashWidgetConfigureActivity) dashWidgetConfigureActivity.Q.get()).getResources().getDisplayMetrics().widthPixels * 80) / 100;
                        if (((DashWidgetConfigureActivity) dashWidgetConfigureActivity.Q.get()).getResources().getConfiguration().orientation == 2 || ((DashWidgetConfigureActivity) dashWidgetConfigureActivity.Q.get()).getResources().getBoolean(R.bool.isTablet)) {
                            i3 = (((DashWidgetConfigureActivity) dashWidgetConfigureActivity.Q.get()).getResources().getDisplayMetrics().widthPixels * 50) / 100;
                        }
                        dashWidgetConfigureActivity.F.getWindow().setLayout(i3, -2);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                int i4 = DashWidgetConfigureActivity.V;
                uz1.q0(dashWidgetConfigureActivity);
                break;
        }
    }
}
