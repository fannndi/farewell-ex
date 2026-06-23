package defpackage;

import android.app.Application;
import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import com.google.android.material.snackbar.qXlx.IGQCApxXGMWo;
import flar2.devcheck.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class m30 implements mj1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f616a;
    public final Object b;
    public final Object c;
    public Object d;

    public m30(Application application, py1 py1Var, ly1 ly1Var, ku1 ku1Var) {
        this.f616a = 1;
        this.b = py1Var;
        this.c = ly1Var;
        int ordinal = ly1Var.ordinal();
        if (ordinal == 0) {
            application.getString(R.string.cpu);
        } else if (ordinal == 1) {
            application.getString(R.string.gpu);
        } else if (ordinal == 2) {
            application.getString(R.string.soc);
        } else if (ordinal == 5) {
            application.getString(R.string.battery);
        } else if (ordinal != 6) {
            application.getString(R.string.sensor);
        } else {
            application.getString(R.string.device_surface);
        }
        this.d = ku1Var;
    }

    public m30(kp kpVar, ku1 ku1Var) {
        this.f616a = 0;
        this.d = Collections.EMPTY_LIST;
        this.c = kpVar;
        this.b = ku1Var;
    }

    public static String b(String str) {
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1038741010:
                if (str.equals("npudsp")) {
                    c = 0;
                    break;
                }
                break;
            case 3399:
                if (str.equals("l3")) {
                    c = 1;
                    break;
                }
                break;
            case 98728:
                if (str.equals("cpu")) {
                    c = 2;
                    break;
                }
                break;
            case 99314:
                if (str.equals(IGQCApxXGMWo.wEfWUrITtislA)) {
                    c = 3;
                    break;
                }
                break;
            case 102572:
                if (str.equals("gpu")) {
                    c = 4;
                    break;
                }
                break;
            case 109299:
                if (str.equals("npu")) {
                    c = 5;
                    break;
                }
                break;
            case 2989504:
                if (str.equals("adsp")) {
                    c = 6;
                    break;
                }
                break;
            case 3049086:
                if (str.equals("cdsp")) {
                    c = 7;
                    break;
                }
                break;
            case 3060616:
                if (str.equals("cpu0")) {
                    c = '\b';
                    break;
                }
                break;
            case 3060617:
                if (str.equals("cpu1")) {
                    c = '\t';
                    break;
                }
                break;
            case 3060618:
                if (str.equals("cpu2")) {
                    c = '\n';
                    break;
                }
                break;
            case 3060619:
                if (str.equals("cpu3")) {
                    c = 11;
                    break;
                }
                break;
            case 3060620:
                if (str.equals("cpu4")) {
                    c = '\f';
                    break;
                }
                break;
            case 3060621:
                if (str.equals("cpu5")) {
                    c = '\r';
                    break;
                }
                break;
            case 3060622:
                if (str.equals("cpu6")) {
                    c = 14;
                    break;
                }
                break;
            case 3060623:
                if (str.equals("cpu7")) {
                    c = 15;
                    break;
                }
                break;
            case 3324384:
                if (str.equals("llcc")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "NPU DSP";
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return "L3";
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return "CPU";
            case 3:
                return "DRAM";
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return "GPU";
            case 5:
                return "NPU";
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return "Audio DSP";
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                return "Compute DSP";
            case '\b':
                return "CPU0";
            case rt0.o /* 9 */:
                return GFUHKHDfiFuPm.TblmWrzFLdyc;
            case '\n':
                return "CPU2";
            case 11:
                return "CPU3";
            case '\f':
                return "CPU4";
            case '\r':
                return "CPU5";
            case 14:
                return "CPU6";
            case 15:
                return "CPU7";
            case 16:
                return "System Cache";
            default:
                return str;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01be  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v24, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List c(defpackage.kp r37) {
        /*
            Method dump skipped, instructions count: 1968
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m30.c(kp):java.util.List");
    }

    public static boolean d(int i, String str) {
        for (int i2 = 0; i2 < i; i2++) {
            char charAt = str.charAt(i2);
            if ((charAt < '0' || charAt > '9') && (charAt < 'a' || charAt > 'f')) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.mj1
    public final void a() {
        float parseLong;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        switch (this.f616a) {
            case 0:
                synchronized (this) {
                    if (((List) this.d).isEmpty()) {
                        List c = c((kp) this.c);
                        if (!c.isEmpty()) {
                            this.d = c;
                        }
                    }
                }
                if (((List) this.d).isEmpty()) {
                    return;
                }
                ArrayList arrayList = new ArrayList(((List) this.d).size());
                for (i30 i30Var : (List) this.d) {
                    if (((kp) this.c).l(i30Var.b) != null) {
                        try {
                            parseLong = Long.parseLong(r4.trim()) / i30Var.d.f568a;
                        } catch (NumberFormatException unused) {
                        }
                        arrayList.add(new j30(i30Var.f409a, parseLong, i30Var.c, (String) i30Var.d.b));
                    }
                    parseLong = Float.NaN;
                    arrayList.add(new j30(i30Var.f409a, parseLong, i30Var.c, (String) i30Var.d.b));
                }
                ((ku1) this.b).f550a.i(new k30(arrayList));
                return;
            default:
                List a2 = ((py1) this.b).a();
                if (a2 != null) {
                    ArrayList arrayList2 = (ArrayList) a2;
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList2.get(i);
                        i++;
                        oy1 oy1Var = (oy1) obj;
                        if (oy1Var != null && oy1Var.d == ((ly1) this.c)) {
                            float f6 = oy1Var.f;
                            float f7 = oy1Var.g;
                            if (f7 <= 0.0f) {
                                f7 = Float.NaN;
                            }
                            float f8 = oy1Var.h;
                            if (f8 <= 0.0f) {
                                f8 = Float.NaN;
                            }
                            float f9 = oy1Var.i;
                            if (f9 <= 0.0f) {
                                f9 = Float.NaN;
                            }
                            float f10 = oy1Var.j;
                            f = f6;
                            if (f10 > 0.0f) {
                                f2 = f7;
                                f5 = f10;
                            } else {
                                f5 = Float.NaN;
                                f2 = f7;
                            }
                            f3 = f8;
                            f4 = f9;
                            ((ku1) this.d).f550a.i(new sw1(f, f2, f3, f4, f5));
                            return;
                        }
                    }
                }
                f = Float.NaN;
                f2 = Float.NaN;
                f3 = Float.NaN;
                f4 = Float.NaN;
                f5 = Float.NaN;
                ((ku1) this.d).f550a.i(new sw1(f, f2, f3, f4, f5));
                return;
        }
    }
}
