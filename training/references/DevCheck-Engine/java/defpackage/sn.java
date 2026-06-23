package defpackage;

import Cwd.ynLVXgis;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.rsm.gXdyRQCGVlHW;
import androidx.emoji2.text.Fk.Iyrs;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.datatransport.runtime.backends.XUas.yFbVsaLCWAtQC;
import com.google.android.material.card.ZyJo.nTAZxGMqQtZZAQ;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import flar2.devcheck.usage.GgP.rlfWzcx;
import java.text.DecimalFormat;
import moe.shizuku.api.hYGD.yttXLrAeLjN;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public class sn extends ld0 implements a01 {
    public RecyclerView d0;
    public SwipeRefreshLayout e0;
    public n3 f0;
    public boolean g0 = false;
    public un h0;

    public static String A0(Context context, int[] iArr) {
        String str;
        if (iArr == null) {
            return context.getString(R.string.not_avail);
        }
        String str2 = "";
        for (int i : iArr) {
            switch (i) {
                case 0:
                    str = "Off";
                    break;
                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                    str = ynLVXgis.kCThI;
                    break;
                case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                    str = "Incandescent";
                    break;
                case 3:
                    str = "Fluorescent";
                    break;
                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                    str = "Warm Fluorescent";
                    break;
                case 5:
                    str = "Daylight";
                    break;
                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                    str = "Cloudy";
                    break;
                case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                    str = yFbVsaLCWAtQC.UQoTNUwXntPo;
                    break;
                case 8:
                    str = "Shade";
                    break;
                default:
                    str = null;
                    break;
            }
            if (str != null) {
                str2 = d51.s(str2, str, ", ");
            }
        }
        return str2.substring(0, str2.lastIndexOf(","));
    }

    public static String u0(sn snVar, Context context, int[] iArr) {
        String A;
        snVar.getClass();
        if (iArr == null) {
            return context.getString(R.string.not_avail);
        }
        String str = "";
        for (int i : iArr) {
            if (i == 1) {
                A = snVar.A(R.string.camer_manual_sensor);
            } else if (i == 3) {
                A = snVar.A(R.string.raw_capable);
            } else if (i == 6) {
                A = snVar.A(R.string.camera_burst);
            } else if (i == 16) {
                A = snVar.A(R.string.camera_ultra_high_resolution);
            } else if (i == 18) {
                A = "HDR10";
            } else if (i == 12) {
                A = snVar.A(R.string.camera_monochrome);
            } else if (i != 13) {
                switch (i) {
                    case 8:
                        A = snVar.A(R.string.camera_depth_output);
                        break;
                    case rt0.o /* 9 */:
                        A = snVar.A(R.string.high_speed_video);
                        break;
                    case 10:
                        A = snVar.A(R.string.camera_motion_tracking);
                        break;
                    default:
                        A = null;
                        break;
                }
            } else {
                A = snVar.A(R.string.camera_secure_image_data);
            }
            if (A != null) {
                str = d51.s(str, A, ", ");
            }
        }
        return str.substring(0, str.lastIndexOf(","));
    }

    public static String v0(sn snVar, float f, float f2) {
        snVar.getClass();
        return d51.v(new DecimalFormat("#.0"), Math.atan(f / (f2 * 2.0f)) * 2.0d * 57.29577951308232d, new StringBuilder(), "°");
    }

    public static String w0(Context context, int[] iArr) {
        if (iArr == null) {
            return context.getString(R.string.not_avail);
        }
        String str = "";
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            String str2 = i2 != 0 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : "External flash" : "Redeye" : "Flash" : "Auto" : "Manual";
            if (str2 != null) {
                str = d51.s(str, str2, ", ");
            }
        }
        return str.substring(0, str.lastIndexOf(gXdyRQCGVlHW.VvvIKwgBWyHpBL));
    }

    public static String x0(Context context, int[] iArr) {
        if (iArr == null) {
            return context.getString(R.string.not_avail);
        }
        String str = hTYJVDOvZnZlYL.BCNsorf;
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            String str2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? null : "Extended DOF" : "Continuous picture" : "Continuous video" : "Macro" : "Auto" : nTAZxGMqQtZZAQ.tSKk;
            if (str2 != null) {
                str = d51.s(str, str2, ", ");
            }
        }
        return str.substring(0, str.lastIndexOf(","));
    }

    public static String y0(Context context, int[] iArr) {
        String str;
        if (iArr == null) {
            return context.getString(R.string.not_avail);
        }
        String str2 = "";
        for (int i : iArr) {
            switch (i) {
                case 0:
                    str = "Off";
                    break;
                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                    str = "Mono";
                    break;
                case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                    str = "Negative";
                    break;
                case 3:
                    str = "Solarize";
                    break;
                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                    str = "Sepia";
                    break;
                case 5:
                    str = "Posterize";
                    break;
                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                    str = "Whiteboard";
                    break;
                case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                    str = "Blackboard";
                    break;
                case 8:
                    str = "Aqua";
                    break;
                default:
                    str = null;
                    break;
            }
            if (str != null) {
                str2 = d51.s(str2, str, ", ");
            }
        }
        return str2.substring(0, str2.lastIndexOf(","));
    }

    public static String z0(Context context, int[] iArr) {
        String str;
        if (iArr == null) {
            return context.getString(R.string.not_avail);
        }
        String str2 = Iyrs.OCdOQhdY;
        for (int i : iArr) {
            switch (i) {
                case 0:
                    str = "Off";
                    break;
                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                    str = "Face priority";
                    break;
                case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                    str = "Action";
                    break;
                case 3:
                    str = "Portrait";
                    break;
                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                    str = "Landscape";
                    break;
                case 5:
                    str = "Night";
                    break;
                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                    str = "Night portrait";
                    break;
                case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                    str = "Theatre";
                    break;
                case 8:
                    str = rlfWzcx.VehJUHcgCr;
                    break;
                case rt0.o /* 9 */:
                    str = "Snow";
                    break;
                case 10:
                    str = "Sunset";
                    break;
                case 11:
                    str = "Steady";
                    break;
                case 12:
                    str = "Fireworks";
                    break;
                case 13:
                    str = "Sports";
                    break;
                case 14:
                    str = "Party";
                    break;
                case 15:
                    str = "Candlelight";
                    break;
                case 16:
                    str = "Barcode";
                    break;
                case rt0.p /* 17 */:
                    str = yttXLrAeLjN.fZLhouStHKZIdck;
                    break;
                case 18:
                    str = "HDR";
                    break;
                default:
                    str = null;
                    break;
            }
            if (str != null) {
                str2 = d51.s(str2, str, ", ");
            }
        }
        return str2.substring(0, str2.lastIndexOf(","));
    }

    public final void B0(String str, String str2) {
        View inflate = w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
        th2 th2Var = new th2(i0());
        j3 j3Var = (j3) th2Var.h;
        j3Var.s = inflate;
        j3Var.n = false;
        th2Var.j(i0().getString(R.string.okay), new qf(5, this));
        ImageView imageView = (ImageView) inflate.findViewById(R.id.info_icon);
        try {
            if (uz1.d(i0())) {
                imageView.setImageResource(R.drawable.ic_camera_new);
            } else {
                imageView.setImageResource(R.drawable.ic_camera_new);
            }
        } catch (Exception unused) {
        }
        try {
            ((TextView) inflate.findViewById(R.id.info_title)).setText(str);
        } catch (Exception unused2) {
        }
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.info_recyclerview);
        recyclerView.setHasFixedSize(true);
        i0();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        new l00(this, str2, recyclerView).executeOnExecutor(MainApp.h, new Void[0]);
        n3 n3Var = this.f0;
        if (n3Var != null && n3Var.isShowing()) {
            this.f0.dismiss();
        }
        n3 a2 = th2Var.a();
        this.f0 = a2;
        a2.show();
        this.f0.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        try {
            int i = (z().getDisplayMetrics().widthPixels * 90) / 100;
            if (z().getConfiguration().orientation == 2 || z().getBoolean(R.bool.isTablet)) {
                i = (z().getDisplayMetrics().widthPixels * 60) / 100;
            }
            this.f0.getWindow().setLayout(i, -2);
        } catch (Exception unused3) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010a  */
    @Override // defpackage.ld0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View O(android.view.LayoutInflater r7, android.view.ViewGroup r8) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn.O(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    @Override // defpackage.ld0
    public final void V() {
        this.K = true;
        n3 n3Var = this.f0;
        if (n3Var != null) {
            n3Var.dismiss();
        }
    }

    @Override // defpackage.ld0
    public final void Y() {
        this.K = true;
    }

    @Override // defpackage.a01
    public final void f(ApplicationInfo applicationInfo) {
        i51.h("prefNoShowCamWarning", true);
        un unVar = this.h0;
        unVar.d.execute(new l2(21, unVar));
    }
}
