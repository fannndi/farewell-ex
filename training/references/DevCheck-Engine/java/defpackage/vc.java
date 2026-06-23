package defpackage;

import android.view.inputmethod.InputMethodManager;
import flar2.devcheck.MainActivity;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.ui.BenchmarkSuiteActivity;
import flar2.devcheck.networkMapper.NetworkMapperActivity;
import flar2.devcheck.widgets.barDetailWidget.BarDetailWidgetConfigureActivity;
import flar2.devcheck.widgets.batteryWidget.BatteryWidgetConfigureActivity;
import flar2.devcheck.widgets.dashWidget.DashWidgetConfigureActivity;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class vc extends c41 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vc(int i, Object obj) {
        super(true);
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(ae0 ae0Var) {
        super(false);
        this.d = 5;
        this.e = ae0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc(si siVar, boolean z) {
        super(z);
        this.d = 2;
        this.e = siVar;
    }

    @Override // defpackage.c41
    public final void a() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                BarDetailWidgetConfigureActivity barDetailWidgetConfigureActivity = (BarDetailWidgetConfigureActivity) obj;
                barDetailWidgetConfigureActivity.finish();
                barDetailWidgetConfigureActivity.moveTaskToBack(true);
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                BatteryWidgetConfigureActivity batteryWidgetConfigureActivity = (BatteryWidgetConfigureActivity) obj;
                batteryWidgetConfigureActivity.finish();
                batteryWidgetConfigureActivity.moveTaskToBack(true);
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                ((si) obj).u0();
                break;
            case 3:
                BenchmarkSuiteActivity benchmarkSuiteActivity = (BenchmarkSuiteActivity) obj;
                if (!benchmarkSuiteActivity.G()) {
                    if (benchmarkSuiteActivity.J == R.id.action_benchmarks) {
                        benchmarkSuiteActivity.finish();
                        break;
                    } else {
                        benchmarkSuiteActivity.I.setSelectedItemId(R.id.action_benchmarks);
                        break;
                    }
                }
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                DashWidgetConfigureActivity dashWidgetConfigureActivity = (DashWidgetConfigureActivity) obj;
                dashWidgetConfigureActivity.finish();
                dashWidgetConfigureActivity.moveTaskToBack(true);
                break;
            case 5:
                ae0 ae0Var = (ae0) obj;
                ae0Var.y(true);
                if (!ae0Var.h.f107a) {
                    ae0Var.g.b();
                    break;
                } else {
                    ae0Var.P();
                    break;
                }
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                MainActivity mainActivity = (MainActivity) obj;
                if (mainActivity.G.getCurrentItem() != 0) {
                    mainActivity.G.setCurrentItem(0);
                    break;
                } else {
                    mainActivity.finish();
                    break;
                }
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                ((NetworkMapperActivity) obj).finish();
                break;
            default:
                p61 p61Var = (p61) obj;
                if (p61Var.f0.getText().length() <= 0) {
                    this.f107a = false;
                    af0 af0Var = this.c;
                    if (af0Var != null) {
                        af0Var.a();
                    }
                    p61Var.g0().k().b();
                    break;
                } else {
                    p61Var.f0.setText("");
                    InputMethodManager inputMethodManager = (InputMethodManager) p61Var.i0().getApplicationContext().getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.hideSoftInputFromWindow(p61Var.f0.getWindowToken(), 0);
                        break;
                    }
                }
                break;
        }
    }
}
