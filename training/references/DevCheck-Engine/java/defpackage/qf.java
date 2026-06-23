package defpackage;

import android.content.DialogInterface;
import flar2.devcheck.MainActivity;
import flar2.devcheck.batteryMonitor2.ui.settings.BatteryMonitor2SettingsFragment;
import flar2.devcheck.benchmarkSuite.ui.BenchmarkSuiteActivity;
import flar2.devcheck.opengl.OpenGLInfoActivity;
import flar2.devcheck.tools.USBActivity;
import flar2.devcheck.vulkanInfo.VulkanInfoActivity;
import flar2.devcheck.widgets.batteryWidget.BatteryWidgetConfigureActivity;
import flar2.devcheck.widgets.dashWidget.DashWidgetConfigureActivity;
import java.util.concurrent.ExecutorService;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class qf implements DialogInterface.OnClickListener {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ qf(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        a5 t;
        int i2 = this.g;
        Object obj = this.h;
        switch (i2) {
            case 0:
                yf e = yf.e(((BatteryMonitor2SettingsFragment) obj).i0());
                ((ExecutorService) e.g).execute(new l2(8, e));
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                BatteryWidgetConfigureActivity batteryWidgetConfigureActivity = (BatteryWidgetConfigureActivity) obj;
                String obj2 = batteryWidgetConfigureActivity.S.getText().toString();
                if (!obj2.isEmpty()) {
                    batteryWidgetConfigureActivity.P = obj2;
                }
                batteryWidgetConfigureActivity.G.setText(batteryWidgetConfigureActivity.P);
                i51.l("batWidgetTitle", batteryWidgetConfigureActivity.P);
                batteryWidgetConfigureActivity.B();
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                fh fhVar = ((ch) obj).e0.e;
                ((ExecutorService) fhVar.j).execute(new l2(13, fhVar));
                break;
            case 3:
                ki kiVar = (ki) obj;
                if (kiVar.G() && kiVar.d0 != null && (t = kiVar.t()) != null) {
                    jj jjVar = kiVar.d0;
                    long j = kiVar.g0;
                    fh fhVar2 = jjVar.e;
                    ((ExecutorService) fhVar2.j).execute(new dh(fhVar2, j));
                    ((BenchmarkSuiteActivity) t).G();
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                ((si) obj).d0.e();
                break;
            case 5:
                sn snVar = (sn) obj;
                snVar.getClass();
                try {
                    snVar.f0.dismiss();
                    break;
                } catch (IllegalStateException unused) {
                    return;
                }
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                DashWidgetConfigureActivity dashWidgetConfigureActivity = (DashWidgetConfigureActivity) obj;
                String obj3 = dashWidgetConfigureActivity.U.getText().toString();
                if (!obj3.isEmpty()) {
                    dashWidgetConfigureActivity.P = obj3;
                }
                dashWidgetConfigureActivity.S.setText(dashWidgetConfigureActivity.P);
                i51.l("dashWidgetTitle", dashWidgetConfigureActivity.P);
                dashWidgetConfigureActivity.B();
                break;
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                MainActivity mainActivity = (MainActivity) obj;
                String str = MainActivity.U;
                if (i == 0) {
                    i51.h("prefSysTheme", true);
                    if (!uz1.h0(mainActivity)) {
                        c3.c(mainActivity, 1);
                        break;
                    } else {
                        c3.c(mainActivity, 2);
                        break;
                    }
                } else if (i == 1) {
                    i51.h("prefSysTheme", false);
                    i51.h("prefDarkTheme", false);
                    c3.c(mainActivity, 1);
                    break;
                } else if (i == 2) {
                    i51.h("prefSysTheme", false);
                    i51.h("prefDarkTheme", true);
                    c3.c(mainActivity, 2);
                    break;
                }
                break;
            case 8:
                m01 m01Var = (m01) obj;
                if (d70.a()) {
                    i51.h("prefDC", m01Var.C0.isChecked());
                    if (m01Var.C0.isChecked()) {
                        m01Var.z0 = -1;
                    }
                }
                lt0 lt0Var = m01Var.w0;
                if (lt0Var != null) {
                    lt0Var.k(m01Var.z0);
                }
                if (m01Var.C(true) instanceof is) {
                    ((is) m01Var.C(true)).k(m01Var.z0);
                }
                m01Var.v0(false, false);
                break;
            case rt0.o /* 9 */:
                ((t11) obj).e.i0.dismiss();
                break;
            case 10:
                OpenGLInfoActivity openGLInfoActivity = (OpenGLInfoActivity) obj;
                int i3 = OpenGLInfoActivity.J;
                try {
                    openGLInfoActivity.H.dismiss();
                    break;
                } catch (Exception unused2) {
                    return;
                }
            case 11:
                USBActivity uSBActivity = (USBActivity) obj;
                int i4 = USBActivity.S;
                try {
                    uSBActivity.K.dismiss();
                    break;
                } catch (IllegalStateException unused3) {
                    return;
                }
            case 12:
                VulkanInfoActivity vulkanInfoActivity = (VulkanInfoActivity) obj;
                int i5 = VulkanInfoActivity.J;
                try {
                    vulkanInfoActivity.H.dismiss();
                    break;
                } catch (IllegalStateException unused4) {
                    return;
                }
            default:
                ((Runnable) obj).run();
                break;
        }
    }
}
