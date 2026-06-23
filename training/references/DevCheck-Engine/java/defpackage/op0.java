package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.google.android.material.bottomappbar.HaCM.rQcwh;
import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.slider.KtNX.UQdsoaJMID;
import com.google.android.material.snackbar.qXlx.IGQCApxXGMWo;
import flar2.devcheck.nativebridge.xm.oWuW;
import flar2.devcheck.usage.GgP.rlfWzcx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.WeakHashMap;
import org.apache.commons.logging.impl.SimpleLog;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class op0 {
    public static volatile go1 c = null;
    public static volatile int d = -1;
    public static final double[][] e = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    public static final double[] f = {95.047d, 100.0d, 108.883d};
    public static final String[] g = {"/sys/class/power_supply/battery/current_now", "/sys/class/power_supply/battery/batt_current_now", "/sys/class/power_supply/battery/batt_current_ua_now", "/sys/devices/platform/htc_battery/power_supply/battery/batt_current_now", "/sys/class/power_supply/max77843-fuelgauge/current_now", "/sys/devices/platform/ds2784-battery/getcurrent", "/sys/devices/platform/i2c-adapter/i2c-0/0-0036/power_supply/ds2746-battery/current_now", "/sys/class/power_supply/bq27541_battery/current_now", "/sys/devices/platform/i2c-adapter/i2c-0/0-0036/power_supply/battery/current_now", "/sys/devices/platform/msm-charger/power_supply/battery_gauge/current_now", "/sys/devices/platform/tegra-i2c.4/i2c-4/4-0040/current1_input", "/sys/class/power_supply/bq27425_battery/charge_now", YHJbtPFAANaPQ.tRyCMoBmks, "/sys/class/power_supply/cw2015_battery/current_now", "/sys/class/power_supply/bq27541-bat/current_now", "/sys/class/power_supply/bq27x41/current_now", "/sys/class/power_supply/dollar_cove_battery/current_now", "/sys/class/power_supply/battery/charger_current", "/sys/class/power_supply/max17042-0/current_now", "/sys/class/power_supply/bq27520/current_now", "/sys/class/power_supply/ds2784-fuelgauge/current_now", "/sys/devices/platform/cpcap_battery/power_supply/usb/current_now", "/sys/EcControl/BatCurrent", "/sys/class/power_supply/android-battery/current_now", "/sys/class/power_supply/battery/batt_current_adc", "/sys/class/power_supply/ab8500_fg/current_now", "/sys/class/power_supply/max170xx_battery/current_now", rlfWzcx.vVEZ, "/sys/devices/platform/msm-battery/power_supply/battery/chg_current_adc", "/sys/class/power_supply/battery/batt_current", "/sys/class/power_supply/battery/batt_chg_current"};
    public static final String[] h = {"/sys/block/mmcblk0/queue/scheduler", "/sys/block/sda/queue/scheduler"};
    public static final String[] i = {"/sys/block/mmcblk0/queue/read_ahead_kb", "/sys/block/sda/queue/read_ahead_kb"};
    public static final String[] j = {"/sys/class/kgsl/kgsl-3d0/devfreq/cur_freq", "/sys/devices/platform/kgsl-3d0.0/kgsl/kgsl-3d0/gpuclk", "/sys/class/kgsl/kgsl-3d0/gpuclk", "/sys/bus/platform/devices/*.mali/cur_freq", "/sys/bus/platform/devices/1f000000.mali/cur_freq", "/sys/class/devfreq/34f00000.gpu0/cur_freq", "/sys/devices/platform/gpusysfs/gpu_clock", rQcwh.nNYWMpaDbfekqa, "/sys/devices/platform/*mali*/clock", "/sys/kernel/debug/ged/hal/current_freqency", "/sys/devices/fdb00000.qcom,kgsl-3d0/kgsl/kgsl-3d0/gpuclk", "/sys/devices/soc.0/1c00000.qcom,kgsl-3d0/kgsl/kgsl-3d0/gpuclk", "/sys/devices/platform/omap/pvrsrvkm.0/sgxfreq/frequency", "/sys/class/devfreq/dfrgx/cur_freq", "/sys/kernel/gpu/gpu_clock", "/sys/class/devfreq/gpufreq/cur_freq", "/sys/devices/platform/*mali/cur_freq"};
    public static final String[] k = {"/sys/kernel/gpu/gpu_max_clock", "/sys/class/kgsl/kgsl-3d0/max_gpuclk", "/sys/bus/platform/devices/*.mali/max_freq", "/sys/devices/platform/*mali/max_freq", "/sys/devices/*.mali/max_clock", "/sys/devices/platform/kgsl-3d0.0/kgsl/kgsl-3d0/max_gpuclk", "/sys/devices/platform/soc/*.qcom,kgsl-3d0/kgsl/kgsl-3d0/max_gpuclk", "/sys/devices/*.qcom,kgsl-3d0/kgsl/kgsl-3d0/max_gpuclk", "/sys/devices/soc.0/*.qcom,kgsl-3d0/kgsl/kgsl-3d0/max_gpuclk", "/sys/kernel/tegra_gpu/gpu_cap_rate", oWuW.ccaqpemXfAIqP, "/sys/class/devfreq/dfrgx/max_freq", "/sys/devices/platform/omap/pvrsrvkm.0/sgxfreq/frequency_limit", "/sys/class/devfreq/sgxfreq/max_freq", "/sys/class/kgsl/kgsl-3d0/devfreq/max_freq", "/sys/class/devfreq/gpufreq/max_freq", oWuW.sqeDWqTGijf};
    public static final String[] l = {"/sys/devices/platform/kgsl-3d0.0/kgsl/kgsl-3d0/pwrscale/trustzone/governor", "/sys/devices/platform/gpusysfs/gpu_governor", "/sys/class/kgsl/kgsl-3d0/pwrscale/trustzone/governor", "/sys/devices/fdb00000.qcom,kgsl-3d0/kgsl/kgsl-3d0/devfreq/governor", "/sys/devices/soc.0/1c00000.qcom,kgsl-3d0/devfreq/1c00000.qcom,kgsl-3d0/governor", "/sys/class/kgsl/kgsl-3d0/devfreq/governor", "/sys/devices/platform/omap/pvrsrvkm.0/sgxfreq/governor", "/sys/class/devfreq/dfrgx/governor", "/sys/devices/platform/*.mali/power_policy", "/sys/bus/platform/drivers/mali/*.mali/power_policy", "/sys/class/devfreq/gpufreq/governor"};
    public static final String[] m = {"/sys/devices/system/cpu/cpu0/cpufreq/scaling_governor", "/sys/devices/system/cpu/cpu1/cpufreq/scaling_governor", "/sys/devices/system/cpu/cpu4/cpufreq/scaling_governor", "/sys/devices/system/cpu/cpu6/cpufreq/scaling_governor", "/sys/devices/system/cpu/cpu7/cpufreq/scaling_governor", "/sys/devices/system/cpu/cpufreq/policy0/scaling_governor", "/sys/devices/system/cpu/cpufreq/policy4/scaling_governor", "/sys/devices/system/cpu/cpufreq/policy6/scaling_governor", "/sys/devices/system/cpu/cpufreq/policy7/scaling_governor"};
    public static final jb0 n;
    public static final jb0[] o;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f752a;
    public final SideSheetBehavior b;

    static {
        jb0 jb0Var = new jb0("CLIENT_TELEMETRY", -1, 1L, false);
        n = jb0Var;
        o = new jb0[]{jb0Var};
    }

    public /* synthetic */ op0(SideSheetBehavior sideSheetBehavior, int i2) {
        this.f752a = i2;
        this.b = sideSheetBehavior;
    }

    public static final void A(String str) {
        str.getClass();
        if (str.length() <= 0) {
            c.m("name is empty");
            return;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if ('!' > charAt || charAt >= 127) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                ju0.h(16);
                String num = Integer.toString(charAt, 16);
                num.getClass();
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                sb.append(num);
                sb.append(" at ");
                sb.append(i2);
                sb.append(" in header name: ");
                sb.append(str);
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static final void B(String str, String str2) {
        str.getClass();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt != '\t' && (' ' > charAt || charAt >= 127)) {
                StringBuilder sb = new StringBuilder("Unexpected char 0x");
                ju0.h(16);
                String num = Integer.toString(charAt, 16);
                num.getClass();
                if (num.length() < 2) {
                    num = "0".concat(num);
                }
                sb.append(num);
                sb.append(" at ");
                sb.append(i2);
                sb.append(" in ");
                sb.append(str2);
                sb.append(IGQCApxXGMWo.qGCvmnjdH);
                sb.append(pd2.j(str2) ? "" : ": ".concat(str));
                throw new IllegalArgumentException(sb.toString().toString());
            }
        }
    }

    public static double C(double d2) {
        return d2 > 0.008856451679035631d ? Math.pow(d2, 0.3333333333333333d) : ((d2 * 903.2962962962963d) + 16.0d) / 116.0d;
    }

    public static double D(int i2) {
        double d2 = i2 / 255.0d;
        return (d2 <= 0.040449936d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d)) * 100.0d;
    }

    public static void E(a5 a5Var) {
        Intent s = s(a5Var);
        if (s != null) {
            a5Var.navigateUpTo(s);
            return;
        }
        throw new IllegalArgumentException("Activity " + a5Var.getClass().getSimpleName() + " does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
    }

    public static TypedArray F(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static void G(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    public static final int H(int i2, String str) {
        char charAt = str.charAt(i2);
        return (charAt << 7) + str.charAt(i2 + 1);
    }

    public static final void I(ao aoVar, dx dxVar, boolean z) {
        Object w = aoVar.w();
        Throwable f2 = aoVar.f(w);
        Object pg1Var = f2 != null ? new pg1(f2) : aoVar.j(w);
        if (!z) {
            dxVar.g(pg1Var);
            return;
        }
        dxVar.getClass();
        z40 z40Var = (z40) dxVar;
        ex exVar = z40Var.k;
        Object obj = z40Var.m;
        qx d2 = exVar.d();
        Object c2 = sy1.c(d2, obj);
        z32 K = c2 != sy1.f961a ? xc1.K(exVar, d2, c2) : null;
        try {
            exVar.g(pg1Var);
            if (K == null || K.i0()) {
                sy1.a(d2, c2);
            }
        } catch (Throwable th) {
            if (K == null || K.i0()) {
                sy1.a(d2, c2);
            }
            throw th;
        }
    }

    public static final Object K(qx qxVar, Object obj, Object obj2, pf0 pf0Var, dx dxVar) {
        Object f2;
        Object c2 = sy1.c(qxVar, obj2);
        try {
            dq1 dq1Var = new dq1(dxVar, qxVar);
            if (pf0Var == null) {
                f2 = ju0.A0(pf0Var, obj, dq1Var);
            } else {
                k32.g(2, pf0Var);
                f2 = pf0Var.f(obj, dq1Var);
            }
            sy1.a(qxVar, c2);
            if (f2 == zx.g) {
                dxVar.getClass();
            }
            return f2;
        } catch (Throwable th) {
            sy1.a(qxVar, c2);
            throw th;
        }
    }

    public static double L(double d2) {
        double d3 = (d2 + 16.0d) / 116.0d;
        double d4 = d3 * d3 * d3;
        if (d4 <= 0.008856451679035631d) {
            d4 = ((d3 * 116.0d) - 16.0d) / 903.2962962962963d;
        }
        return d4 * 100.0d;
    }

    public static String M(ll2 ll2Var) {
        StringBuilder sb = new StringBuilder(ll2Var.d());
        for (int i2 = 0; i2 < ll2Var.d(); i2++) {
            byte b = ll2Var.b(i2);
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                        sb.append(UQdsoaJMID.txwcgUgjm);
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case rt0.o /* 9 */:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                            break;
                        } else {
                            sb.append((char) b);
                            break;
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }

    public static void a(View view, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6) {
        final int i2;
        final int i3;
        final int i4;
        final int i5;
        final int paddingLeft = view.getPaddingLeft();
        final int paddingTop = view.getPaddingTop();
        final int paddingRight = view.getPaddingRight();
        final int paddingBottom = view.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i6 = marginLayoutParams.leftMargin;
            int i7 = marginLayoutParams.topMargin;
            int i8 = marginLayoutParams.rightMargin;
            i5 = marginLayoutParams.bottomMargin;
            i2 = i6;
            i3 = i7;
            i4 = i8;
        } else {
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        b41 b41Var = new b41() { // from class: e72
            @Override // defpackage.b41
            public final gb2 v(View view2, gb2 gb2Var) {
                mm0 h2 = gb2Var.f329a.h(647);
                boolean z7 = z;
                int i9 = paddingLeft;
                if (z7) {
                    i9 += h2.f643a;
                }
                boolean z8 = z2;
                int i10 = paddingTop;
                if (z8) {
                    i10 += h2.b;
                }
                boolean z9 = z3;
                int i11 = paddingRight;
                if (z9) {
                    i11 += h2.c;
                }
                boolean z10 = z4;
                int i12 = paddingBottom;
                if (z10) {
                    i12 += h2.d;
                }
                view2.setPadding(i9, i10, i11, i12);
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    boolean z11 = z5;
                    int i13 = i2;
                    if (z11) {
                        i13 += h2.f643a;
                    }
                    marginLayoutParams2.leftMargin = i13;
                    marginLayoutParams2.topMargin = i3;
                    boolean z12 = z6;
                    int i14 = i4;
                    if (z12) {
                        i14 += h2.c;
                    }
                    marginLayoutParams2.rightMargin = i14;
                    marginLayoutParams2.bottomMargin = i5;
                    view2.setLayoutParams(marginLayoutParams2);
                }
                return gb2Var;
            }
        };
        WeakHashMap weakHashMap = y62.f1215a;
        p62.c(view, b41Var);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new f72(0));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (r6.C().equals(r5) == false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable b(defpackage.hc0 r4, defpackage.tb0 r5, defpackage.ex r6) {
        /*
            boolean r0 = r6 instanceof defpackage.xb0
            if (r0 == 0) goto L13
            r0 = r6
            xb0 r0 = (defpackage.xb0) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            xb0 r0 = new xb0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.k
            int r1 = r0.l
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            ze1 r4 = r0.j
            defpackage.om0.O(r6)     // Catch: java.lang.Throwable -> L28
            goto L4a
        L28:
            r5 = move-exception
            goto L4d
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.n(r4)
            return r2
        L30:
            defpackage.om0.O(r6)
            ze1 r6 = new ze1
            r6.<init>()
            q50 r1 = new q50     // Catch: java.lang.Throwable -> L4b
            r1.<init>(r5, r6)     // Catch: java.lang.Throwable -> L4b
            r0.j = r6     // Catch: java.lang.Throwable -> L4b
            r0.l = r3     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r4 = r4.a(r1, r0)     // Catch: java.lang.Throwable -> L4b
            zx r5 = defpackage.zx.g
            if (r4 != r5) goto L4a
            return r5
        L4a:
            return r2
        L4b:
            r5 = move-exception
            r4 = r6
        L4d:
            java.lang.Object r4 = r4.g
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == 0) goto L59
            boolean r6 = r4.equals(r5)
            if (r6 != 0) goto L7c
        L59:
            qx r6 = r0.h
            r6.getClass()
            pg0 r0 = defpackage.pg0.k
            ox r6 = r6.r(r0)
            rn0 r6 = (defpackage.rn0) r6
            if (r6 == 0) goto L7d
            bo0 r6 = (defpackage.bo0) r6
            boolean r0 = r6.N()
            if (r0 != 0) goto L71
            goto L7d
        L71:
            java.util.concurrent.CancellationException r6 = r6.C()
            boolean r6 = r6.equals(r5)
            if (r6 != 0) goto L7c
            goto L7d
        L7c:
            throw r5
        L7d:
            if (r4 != 0) goto L80
            return r5
        L80:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L88
            defpackage.bw0.b(r4, r5)
            throw r4
        L88:
            defpackage.bw0.b(r5, r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.op0.b(hc0, tb0, ex):java.io.Serializable");
    }

    public static void c(String str, boolean z) {
        if (z) {
            return;
        }
        c.m(str);
    }

    public static void d(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(String str, Object obj) {
        if (obj != null) {
            return;
        }
        jw0.f(str);
    }

    public static final void f(ti0 ti0Var, String str, String str2) {
        str2.getClass();
        ArrayList arrayList = ti0Var.f989a;
        arrayList.add(str);
        arrayList.add(as1.s0(str2).toString());
    }

    public static void g(String str, String str2, Object obj) {
        if (Log.isLoggable(w(str), 3)) {
            String.format(str2, obj);
        }
    }

    public static final boolean h(String str, String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i2 < str.length()) {
                    char charAt = str.charAt(i2);
                    int i5 = i4 + 1;
                    if (i4 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt == '(') {
                        i3++;
                    } else if (charAt == ')' && i3 - 1 == 0 && i4 != str.length() - 1) {
                        break;
                    }
                    i2++;
                    i4 = i5;
                } else if (i3 == 0) {
                    return ym0.b(as1.s0(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static int i(double d2) {
        double d3 = d2 / 100.0d;
        int round = (int) Math.round((d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (round < 0) {
            return 0;
        }
        if (round > 255) {
            return 255;
        }
        return round;
    }

    public static final rb0 j(rb0 rb0Var) {
        return ((rb0Var instanceof xq1) || (rb0Var instanceof r50)) ? rb0Var : new r50(rb0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(defpackage.ew r4, defpackage.ex r5) {
        /*
            boolean r0 = r5 instanceof defpackage.bc0
            if (r0 == 0) goto L13
            r0 = r5
            bc0 r0 = (defpackage.bc0) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            bc0 r0 = new bc0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.l
            int r1 = r0.m
            o1 r2 = defpackage.i31.f410a
            r3 = 1
            if (r1 == 0) goto L34
            if (r1 != r3) goto L2d
            dw r4 = r0.k
            ze1 r0 = r0.j
            defpackage.om0.O(r5)     // Catch: defpackage.f -> L2b
            goto L5c
        L2b:
            r5 = move-exception
            goto L58
        L2d:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.n(r4)
            r4 = 0
            return r4
        L34:
            defpackage.om0.O(r5)
            ze1 r5 = new ze1
            r5.<init>()
            r5.g = r2
            dw r1 = new dw
            r1.<init>(r3, r5)
            r0.j = r5     // Catch: defpackage.f -> L54
            r0.k = r1     // Catch: defpackage.f -> L54
            r0.m = r3     // Catch: defpackage.f -> L54
            java.lang.Object r4 = r4.a(r1, r0)     // Catch: defpackage.f -> L54
            zx r0 = defpackage.zx.g
            if (r4 != r0) goto L52
            return r0
        L52:
            r0 = r5
            goto L5c
        L54:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r1
        L58:
            dw r1 = r5.g
            if (r1 != r4) goto L69
        L5c:
            java.lang.Object r4 = r0.g
            if (r4 == r2) goto L61
            return r4
        L61:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        L69:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.op0.k(ew, ex):java.lang.Object");
    }

    public static final String l(Collection collection) {
        collection.getClass();
        return !collection.isEmpty() ? bs1.T(yr.Z(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:9|10|(4:12|(1:14)|15|16)|19|20|21|22|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0029, code lost:
    
        r2 = new defpackage.go1(r4, 0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.go1 m(android.content.Context r4) {
        /*
            int r0 = android.os.Process.myPid()
            go1 r1 = defpackage.op0.c
            if (r1 == 0) goto Le
            int r2 = defpackage.op0.d
            if (r2 == r0) goto Ld
            goto Le
        Ld:
            return r1
        Le:
            java.lang.Class<op0> r1 = defpackage.op0.class
            monitor-enter(r1)
            go1 r2 = defpackage.op0.c     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L1c
            int r2 = defpackage.op0.d     // Catch: java.lang.Throwable -> L1a
            if (r2 == r0) goto L33
            goto L1c
        L1a:
            r4 = move-exception
            goto L37
        L1c:
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L1a
            android.os.IBinder r2 = defpackage.do1.f203a     // Catch: java.lang.Throwable -> L29
            go1 r2 = new go1     // Catch: java.lang.Throwable -> L29
            r3 = 1
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L29
            goto L2f
        L29:
            go1 r2 = new go1     // Catch: java.lang.Throwable -> L1a
            r3 = 0
            r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L1a
        L2f:
            defpackage.op0.c = r2     // Catch: java.lang.Throwable -> L1a
            defpackage.op0.d = r0     // Catch: java.lang.Throwable -> L1a
        L33:
            go1 r4 = defpackage.op0.c     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            return r4
        L37:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1a
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.op0.m(android.content.Context):go1");
    }

    public static int n(Context context, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i2, typedValue, true);
        return typedValue.resourceId != 0 ? i2 : i3;
    }

    public static rg1 q(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i2) {
        rg1 rg1Var;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i2, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new rg1((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                rg1Var = rg1.b(typedArray.getResources(), typedArray.getResourceId(i2, 0), theme);
            } catch (Exception unused) {
                rg1Var = null;
            }
            if (rg1Var != null) {
                return rg1Var;
            }
        }
        return new rg1((Shader) null, (ColorStateList) null, 0);
    }

    public static Intent s(a5 a5Var) {
        Intent parentActivityIntent = a5Var.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String u = u(a5Var, a5Var.getComponentName());
            if (u == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(a5Var, u);
            try {
                return u(a5Var, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent t(a5 a5Var, ComponentName componentName) {
        String u = u(a5Var, componentName);
        if (u == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), u);
        return u(a5Var, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String u(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static String w(String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return "TRuntime.".concat(str);
        }
        String concat = "TRuntime.".concat(str);
        return concat.length() > 23 ? concat.substring(0, 23) : concat;
    }

    public static final int x(ti1 ti1Var) {
        ti1Var.getClass();
        aj1 C = ti1Var.C("SELECT changes()");
        try {
            C.w();
            int i2 = (int) C.getLong(0);
            rt0.e(C, null);
            return i2;
        } finally {
        }
    }

    public static final void y(qx qxVar, Throwable th) {
        try {
            u3 u3Var = (u3) qxVar.r(ai1.j);
            if (u3Var != null) {
                u3Var.D(th);
            } else {
                kk1.v(qxVar, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                bw0.b(runtimeException, th);
                th = runtimeException;
            }
            kk1.v(qxVar, th);
        }
    }

    public static boolean z(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public final void J(ViewGroup.MarginLayoutParams marginLayoutParams, int i2) {
        switch (this.f752a) {
            case 0:
                marginLayoutParams.leftMargin = i2;
                break;
            default:
                marginLayoutParams.rightMargin = i2;
                break;
        }
    }

    public final int o() {
        int i2 = this.f752a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (i2) {
            case 0:
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                return Math.max(0, (sideSheetBehavior.m - sideSheetBehavior.l) - sideSheetBehavior.o);
        }
    }

    public final int p() {
        int i2 = this.f752a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (i2) {
            case 0:
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    public final int r(View view) {
        int i2 = this.f752a;
        SideSheetBehavior sideSheetBehavior = this.b;
        switch (i2) {
            case 0:
                return view.getRight() + sideSheetBehavior.o;
            default:
                return view.getLeft() - sideSheetBehavior.o;
        }
    }

    public final int v() {
        switch (this.f752a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }
}
