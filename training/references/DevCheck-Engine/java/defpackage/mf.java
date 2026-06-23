package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomappbar.HaCM.rQcwh;
import flar2.devcheck.systemGraphs.widgets.RealtimeLineChartView;
import java.util.List;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class mf implements v31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f630a;
    public final /* synthetic */ int b;
    public final /* synthetic */ ld0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ mf(ld0 ld0Var, Object obj, Object obj2, int i, int i2) {
        this.f630a = i2;
        this.c = ld0Var;
        this.d = obj;
        this.e = obj2;
        this.b = i;
    }

    @Override // defpackage.v31
    public final void a(Object obj) {
        boolean z;
        String replace;
        int C0;
        int i = this.f630a;
        int i2 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        ld0 ld0Var = this.c;
        switch (i) {
            case 0:
                nf nfVar = (nf) ld0Var;
                boolean[] zArr = (boolean[]) obj3;
                TextView textView = (TextView) obj2;
                sw1 sw1Var = (sw1) obj;
                if (sw1Var != null) {
                    float f = sw1Var.d;
                    float f2 = sw1Var.c;
                    float f3 = sw1Var.f959a;
                    float f4 = sw1Var.b;
                    if (!Float.isNaN(f3) && nfVar.i0 != null) {
                        zArr[0] = true;
                        if (nfVar.z0.getVisibility() != 0) {
                            nfVar.z0.setVisibility(0);
                        }
                        boolean z2 = !Float.isNaN(f2) && ((!Float.isNaN(f4) && (f3 > f4 ? 1 : (f3 == f4 ? 0 : -1)) >= 0) || Float.isNaN(f4));
                        z = (Float.isNaN(f4) || z2) ? false : true;
                        nfVar.i0.setWarningLine(z ? f4 : Float.NaN);
                        nfVar.i0.setCriticalLine(z2 ? f2 : Float.NaN);
                        RealtimeLineChartView realtimeLineChartView = nfVar.i0;
                        float f5 = sw1Var.e;
                        if (Float.isNaN(f)) {
                            f = 20.0f;
                        }
                        if (z2) {
                            f5 = f2;
                        } else if (z) {
                            f5 = f4;
                        } else if (Float.isNaN(f5)) {
                            f5 = 50.0f;
                        }
                        if (f5 - f < 20.0f) {
                            f5 = f + 20.0f;
                        }
                        realtimeLineChartView.g(f, f5);
                        textView.setTextColor(md2.g(nfVar.i0(), f3, f4, f2, i2));
                        nfVar.i0.c(0, f3);
                        break;
                    }
                }
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                qg qgVar = (qg) ld0Var;
                String str = (String) obj3;
                String str2 = (String) obj2;
                List list = (List) obj;
                if (!qgVar.n0) {
                    qgVar.n0 = true;
                    qh qhVar = new qh();
                    qhVar.f842a = "__mine__";
                    String str3 = "";
                    if (qg.A0(str)) {
                        replace = str;
                    } else {
                        String e = i51.e("prefdevicename2");
                        if (e == null) {
                            e = "";
                        }
                        replace = e.replace("\n", " ");
                    }
                    qhVar.b = replace;
                    if (qg.A0(str2)) {
                        str3 = str2;
                    } else {
                        String e2 = i51.e("prefProcessor");
                        if (e2 != null) {
                            str3 = e2;
                        }
                    }
                    qhVar.c = str3;
                    k52 c = k52.c(list);
                    double d = c.f516a;
                    if (d > 0.0d) {
                        qhVar.i = qg.z0(d);
                    }
                    double d2 = c.b;
                    if (d2 > 0.0d) {
                        qhVar.j = qg.z0(d2);
                    }
                    double d3 = c.c;
                    if (d3 > 0.0d) {
                        qhVar.k = qg.z0(d3);
                    }
                    double d4 = c.d;
                    if (d4 > 0.0d) {
                        qhVar.l = qg.z0(d4);
                    }
                    double d5 = c.e;
                    if (d5 > 0.0d) {
                        qhVar.m = qg.z0(d5);
                    }
                    Context i0 = qgVar.i0();
                    yh yhVar = new yh();
                    th thVar = new th();
                    thVar.c = qg.F0(i51.e("prefCPU"));
                    thVar.d = qg.F0(i51.e(rQcwh.OseUzj));
                    yhVar.g = thVar;
                    vh vhVar = new vh();
                    String e3 = i51.e("RENDERER");
                    if (qg.A0(e3)) {
                        vhVar.b = e3;
                    }
                    String e4 = i51.e("VENDOR");
                    if (qg.A0(e4)) {
                        vhVar.f1086a = e4;
                    }
                    String e5 = i51.e("prefGPUMax");
                    if (qg.A0(e5)) {
                        int indexOf = e5.indexOf(58);
                        if (indexOf >= 0) {
                            e5 = e5.substring(indexOf + 1);
                        }
                        String trim = e5.trim();
                        if (!trim.isEmpty()) {
                            vhVar.c = trim;
                        }
                    }
                    yhVar.h = vhVar;
                    xh xhVar = new xh();
                    try {
                        ActivityManager activityManager = (ActivityManager) i0.getSystemService("activity");
                        if (activityManager != null) {
                            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                            activityManager.getMemoryInfo(memoryInfo);
                            int C02 = qg.C0(memoryInfo.totalMem);
                            if (C02 > 0) {
                                xhVar.g = C02;
                                xhVar.h = C02;
                            }
                        }
                    } catch (Throwable unused) {
                    }
                    long d6 = i51.d("prefDISKSizeDb");
                    if (d6 <= 0) {
                        String e6 = i51.e("prefDISKSizeDb");
                        if (qg.A0(e6)) {
                            try {
                                d6 = Long.parseLong(e6);
                            } catch (NumberFormatException unused2) {
                            }
                        }
                    }
                    if (d6 > 0 && (C0 = qg.C0(d6)) > 0) {
                        xhVar.i = C0;
                        xhVar.j = C0;
                    }
                    yhVar.k = xhVar;
                    qhVar.x = yhVar;
                    qgVar.v0(i2, qhVar, str, str2);
                    break;
                }
                break;
            default:
                zg0 zg0Var = (zg0) ld0Var;
                View view = (View) obj3;
                TextView textView2 = (TextView) obj2;
                sw1 sw1Var2 = (sw1) obj;
                if (sw1Var2 != null) {
                    float f6 = sw1Var2.d;
                    float f7 = sw1Var2.c;
                    float f8 = sw1Var2.f959a;
                    float f9 = sw1Var2.b;
                    if (!Float.isNaN(f8) && zg0Var.g0 != null) {
                        if (view.getVisibility() != 0) {
                            view.setVisibility(0);
                        }
                        boolean z3 = !Float.isNaN(f7) && ((!Float.isNaN(f9) && (f8 > f9 ? 1 : (f8 == f9 ? 0 : -1)) >= 0) || Float.isNaN(f9));
                        z = (Float.isNaN(f9) || z3) ? false : true;
                        zg0Var.g0.setWarningLine(z ? f9 : Float.NaN);
                        zg0Var.g0.setCriticalLine(z3 ? f7 : Float.NaN);
                        RealtimeLineChartView realtimeLineChartView2 = zg0Var.g0;
                        float f10 = sw1Var2.e;
                        if (Float.isNaN(f6)) {
                            f6 = 20.0f;
                        }
                        if (z3) {
                            f10 = f7;
                        } else if (z) {
                            f10 = f9;
                        } else if (Float.isNaN(f10)) {
                            f10 = 60.0f;
                        }
                        if (f10 - f6 < 20.0f) {
                            f10 = f6 + 20.0f;
                        }
                        realtimeLineChartView2.g(f6, f10);
                        textView2.setTextColor(md2.g(zg0Var.i0(), f8, f9, f7, i2));
                        zg0Var.g0.c(0, f8);
                        break;
                    }
                }
                break;
        }
    }
}
