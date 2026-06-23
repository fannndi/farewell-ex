package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.material.bottomappbar.HaCM.rQcwh;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import flar2.devcheck.BatteryMonitor.BatteryActivity;
import flar2.devcheck.MainApp;
import flar2.devcheck.MonitorActivity;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.ui.BenchmarkSuiteActivity;
import flar2.devcheck.circleprogress.CircleProgressView;
import flar2.devcheck.cputimes.CPUTimeActivity;
import flar2.devcheck.systemGraphs.SystemGraphsActivity;
import flar2.devcheck.temperature.TemperatureActivity;
import flar2.devcheck.tests.TestActivity;
import flar2.devcheck.tools.ToolsActivity;
import flar2.devcheck.ui.widgets.CpuLoadGraphView;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public class p00 extends ld0 {
    public static int H1;
    public static boolean I1;
    public static TelephonyManager J1;
    public static ConnectivityManager K1;
    public static o00 L1;
    public static boolean M1;
    public static tx0 O1;
    public static String Q1;
    public static String R1;
    public static String S1;
    public static int T1;
    public static boolean V1;
    public static boolean W1;
    public static BatteryManager a2;
    public TextView A0;
    public Handler A1;
    public CircleProgressView B0;
    public TextView C0;
    public HandlerThread C1;
    public TextView D0;
    public Handler D1;
    public TextView E0;
    public CircleProgressView F0;
    public Context F1;
    public TextView G0;
    public TextView H0;
    public TextView I0;
    public TextView J0;
    public TextView K0;
    public TextView L0;
    public TextView M0;
    public TextView N0;
    public ImageView O0;
    public TextView P0;
    public TextView Q0;
    public TextView R0;
    public ImageView S0;
    public TextView T0;
    public TextView U0;
    public TextView V0;
    public TextView W0;
    public ImageView X0;
    public SwipeRefreshLayout Y0;
    public boolean Z0;
    public View a1;
    public View b1;
    public View c1;
    public sj d0;
    public View d1;
    public boolean e0;
    public View e1;
    public TextView f0;
    public View f1;
    public TextView g0;
    public View g1;
    public ImageView h0;
    public View h1;
    public TextView i0;
    public View i1;
    public TextView j0;
    public View j1;
    public TextView k0;
    public View k1;
    public TextView l0;
    public MaterialCardView l1;
    public TextView m0;
    public TextView n0;
    public String n1;
    public TextView o0;
    public CpuLoadGraphView o1;
    public TextView p0;
    public TextView q0;
    public n3 q1;
    public TextView r0;
    public n3 r1;
    public TextView s0;
    public int s1;
    public TextView t0;
    public int t1;
    public TextView u0;
    public int u1;
    public TextView v0;
    public int v1;
    public TextView w0;
    public int w1;
    public TextView x0;
    public int x1;
    public TextView y0;
    public n00 y1;
    public ImageView z0;
    public go1 z1;
    public static final DecimalFormat N1 = new DecimalFormat("0.#");
    public static final ArrayList P1 = new ArrayList();
    public static Drawable U1 = null;
    public static final AtomicBoolean X1 = new AtomicBoolean(false);
    public static int Y1 = 0;
    public static int Z1 = 0;
    public boolean m1 = false;
    public int p1 = 0;
    public boolean B1 = false;
    public final i00 E1 = new i00(this, 0);
    public boolean G1 = false;

    /* JADX WARN: Can't wrap try/catch for region: R(9:63|(3:65|(1:67)(1:(1:96)(1:97))|(1:69)(1:(1:86)(1:(1:88)(1:(1:90)(2:91|(1:93)(1:94))))))(2:98|(3:100|(1:102)(1:(1:116)(1:117))|(1:104)(1:(1:106)(1:(1:108)(1:(1:110)(2:111|(1:113)(1:114))))))(2:118|(5:120|71|(2:81|82)|75|(2:77|78)(2:79|80))(4:121|(1:(1:124)(2:140|(1:142)(1:143)))(1:(1:145)(1:146))|125|(1:127)(2:128|(1:130)(2:131|(1:133)(2:134|(1:136)(1:(1:138)(1:139))))))))|70|71|(1:73)|81|82|75|(0)(0)) */
    /* JADX WARN: Removed duplicated region for block: B:77:0x030e A[Catch: NullPointerException -> 0x0391, TryCatch #0 {NullPointerException -> 0x0391, blocks: (B:3:0x0002, B:5:0x0024, B:7:0x002a, B:8:0x0034, B:11:0x003a, B:13:0x0048, B:16:0x0051, B:18:0x0055, B:21:0x005f, B:25:0x0079, B:30:0x0091, B:31:0x00bf, B:34:0x00c9, B:36:0x00d4, B:38:0x00e6, B:39:0x00ec, B:40:0x0149, B:43:0x0106, B:44:0x0126, B:47:0x009c, B:50:0x00a7, B:53:0x00b2, B:54:0x00b9, B:58:0x0089, B:59:0x0162, B:61:0x0173, B:63:0x0177, B:65:0x018e, B:69:0x01a1, B:71:0x02b3, B:73:0x02c3, B:75:0x02d1, B:77:0x030e, B:79:0x0312, B:86:0x01aa, B:88:0x01b3, B:90:0x01bc, B:93:0x01c7, B:94:0x01d1, B:97:0x0199, B:98:0x01dd, B:100:0x01e7, B:104:0x01fc, B:106:0x0205, B:108:0x020e, B:110:0x0217, B:113:0x0225, B:114:0x022f, B:117:0x01f4, B:118:0x0239, B:120:0x023d, B:121:0x0249, B:127:0x026c, B:130:0x027b, B:133:0x028a, B:136:0x0299, B:138:0x02a3, B:139:0x02ab, B:146:0x0261, B:149:0x0324, B:151:0x033f, B:153:0x0342, B:155:0x0350, B:157:0x0364, B:159:0x037f, B:163:0x0031), top: B:2:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0312 A[Catch: NullPointerException -> 0x0391, TryCatch #0 {NullPointerException -> 0x0391, blocks: (B:3:0x0002, B:5:0x0024, B:7:0x002a, B:8:0x0034, B:11:0x003a, B:13:0x0048, B:16:0x0051, B:18:0x0055, B:21:0x005f, B:25:0x0079, B:30:0x0091, B:31:0x00bf, B:34:0x00c9, B:36:0x00d4, B:38:0x00e6, B:39:0x00ec, B:40:0x0149, B:43:0x0106, B:44:0x0126, B:47:0x009c, B:50:0x00a7, B:53:0x00b2, B:54:0x00b9, B:58:0x0089, B:59:0x0162, B:61:0x0173, B:63:0x0177, B:65:0x018e, B:69:0x01a1, B:71:0x02b3, B:73:0x02c3, B:75:0x02d1, B:77:0x030e, B:79:0x0312, B:86:0x01aa, B:88:0x01b3, B:90:0x01bc, B:93:0x01c7, B:94:0x01d1, B:97:0x0199, B:98:0x01dd, B:100:0x01e7, B:104:0x01fc, B:106:0x0205, B:108:0x020e, B:110:0x0217, B:113:0x0225, B:114:0x022f, B:117:0x01f4, B:118:0x0239, B:120:0x023d, B:121:0x0249, B:127:0x026c, B:130:0x027b, B:133:0x028a, B:136:0x0299, B:138:0x02a3, B:139:0x02ab, B:146:0x0261, B:149:0x0324, B:151:0x033f, B:153:0x0342, B:155:0x0350, B:157:0x0364, B:159:0x037f, B:163:0x0031), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0(android.content.Context r19) {
        /*
            Method dump skipped, instructions count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p00.A0(android.content.Context):void");
    }

    public static void B0(View view, m00 m00Var) {
        try {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup == null) {
                return;
            }
            m00Var.setId(view.getId());
            m00Var.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom());
            int indexOfChild = viewGroup.indexOfChild(view);
            viewGroup.removeViewAt(indexOfChild);
            viewGroup.addView(m00Var, indexOfChild, view.getLayoutParams());
        } catch (Exception unused) {
        }
    }

    public static void u0(p00 p00Var) {
        p00Var.getClass();
        try {
            p00Var.r1.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            int i = (p00Var.z().getDisplayMetrics().widthPixels * 90) / 100;
            if (p00Var.z().getConfiguration().orientation == 2 || p00Var.z().getBoolean(R.bool.isTablet)) {
                i = (p00Var.z().getDisplayMetrics().widthPixels * 60) / 100;
            }
            p00Var.r1.getWindow().setLayout(i, -2);
            p00Var.Y0.setRefreshing(false);
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(29:2|3|(2:4|(2:6|(4:8|9|10|(4:12|13|(1:15)(1:113)|16)(19:114|115|(1:117)(1:144)|118|119|(1:121)(1:143)|122|123|(1:125)(1:142)|126|(1:128)|129|130|(1:132)(1:141)|133|(1:135)|136|137|(1:139)(1:140)))(1:145))(2:146|147))|17|(6:22|23|(2:25|(1:27)(2:97|(1:99)(1:100)))(3:101|102|(2:104|(1:106)(2:107|(1:109)(1:110)))(1:111))|28|(18:35|36|37|(1:39)(1:(1:94)(1:95))|40|(1:42)(1:(1:79)(1:(1:81)(2:82|(2:84|85)(2:86|(1:88)(2:89|(1:91)(1:92))))))|(1:44)(1:77)|45|46|(1:48)(2:70|(1:72)(2:73|(1:75)(1:76)))|49|(1:51)(1:69)|52|(1:56)|58|(1:65)|66|(1:68))|32)|112|23|(0)(0)|28|(1:30)|35|36|37|(0)(0)|40|(0)(0)|(0)(0)|45|46|(0)(0)|49|(0)(0)|52|(2:54|56)|58|(4:60|62|65|32)|66|(0)|32) */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0278 A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0001, B:6:0x0014, B:9:0x0022, B:12:0x0035, B:15:0x0055, B:16:0x007d, B:17:0x01fa, B:19:0x0206, B:22:0x0213, B:23:0x0222, B:27:0x0262, B:28:0x029d, B:30:0x02a1, B:36:0x02a4, B:39:0x02b4, B:42:0x02ec, B:44:0x0336, B:45:0x0354, B:48:0x0362, B:49:0x0381, B:51:0x038b, B:52:0x03b9, B:54:0x03c6, B:56:0x03cc, B:69:0x03a8, B:72:0x036c, B:75:0x0376, B:76:0x037c, B:77:0x034d, B:79:0x02f7, B:81:0x0302, B:85:0x0314, B:88:0x031c, B:91:0x0327, B:92:0x032e, B:94:0x02c7, B:95:0x02d8, B:58:0x03d1, B:60:0x03e9, B:62:0x03f1, B:65:0x0400, B:66:0x042b, B:68:0x0438, B:99:0x026c, B:100:0x0272, B:101:0x0278, B:106:0x0282, B:109:0x028c, B:110:0x0292, B:111:0x0298, B:112:0x021d, B:113:0x0075, B:114:0x00cf, B:117:0x00ef, B:118:0x0114, B:121:0x011a, B:122:0x013f, B:125:0x0145, B:126:0x016a, B:128:0x0170, B:129:0x0184, B:132:0x018a, B:133:0x01af, B:135:0x01b5, B:136:0x01c9, B:139:0x01cf, B:140:0x01ec, B:141:0x01a7, B:142:0x0162, B:143:0x0137, B:144:0x010c, B:147:0x01f5), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02b4 A[Catch: all -> 0x0072, Exception -> 0x03d1, TRY_ENTER, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0001, B:6:0x0014, B:9:0x0022, B:12:0x0035, B:15:0x0055, B:16:0x007d, B:17:0x01fa, B:19:0x0206, B:22:0x0213, B:23:0x0222, B:27:0x0262, B:28:0x029d, B:30:0x02a1, B:36:0x02a4, B:39:0x02b4, B:42:0x02ec, B:44:0x0336, B:45:0x0354, B:48:0x0362, B:49:0x0381, B:51:0x038b, B:52:0x03b9, B:54:0x03c6, B:56:0x03cc, B:69:0x03a8, B:72:0x036c, B:75:0x0376, B:76:0x037c, B:77:0x034d, B:79:0x02f7, B:81:0x0302, B:85:0x0314, B:88:0x031c, B:91:0x0327, B:92:0x032e, B:94:0x02c7, B:95:0x02d8, B:58:0x03d1, B:60:0x03e9, B:62:0x03f1, B:65:0x0400, B:66:0x042b, B:68:0x0438, B:99:0x026c, B:100:0x0272, B:101:0x0278, B:106:0x0282, B:109:0x028c, B:110:0x0292, B:111:0x0298, B:112:0x021d, B:113:0x0075, B:114:0x00cf, B:117:0x00ef, B:118:0x0114, B:121:0x011a, B:122:0x013f, B:125:0x0145, B:126:0x016a, B:128:0x0170, B:129:0x0184, B:132:0x018a, B:133:0x01af, B:135:0x01b5, B:136:0x01c9, B:139:0x01cf, B:140:0x01ec, B:141:0x01a7, B:142:0x0162, B:143:0x0137, B:144:0x010c, B:147:0x01f5), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02ec A[Catch: all -> 0x0072, Exception -> 0x03d1, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0001, B:6:0x0014, B:9:0x0022, B:12:0x0035, B:15:0x0055, B:16:0x007d, B:17:0x01fa, B:19:0x0206, B:22:0x0213, B:23:0x0222, B:27:0x0262, B:28:0x029d, B:30:0x02a1, B:36:0x02a4, B:39:0x02b4, B:42:0x02ec, B:44:0x0336, B:45:0x0354, B:48:0x0362, B:49:0x0381, B:51:0x038b, B:52:0x03b9, B:54:0x03c6, B:56:0x03cc, B:69:0x03a8, B:72:0x036c, B:75:0x0376, B:76:0x037c, B:77:0x034d, B:79:0x02f7, B:81:0x0302, B:85:0x0314, B:88:0x031c, B:91:0x0327, B:92:0x032e, B:94:0x02c7, B:95:0x02d8, B:58:0x03d1, B:60:0x03e9, B:62:0x03f1, B:65:0x0400, B:66:0x042b, B:68:0x0438, B:99:0x026c, B:100:0x0272, B:101:0x0278, B:106:0x0282, B:109:0x028c, B:110:0x0292, B:111:0x0298, B:112:0x021d, B:113:0x0075, B:114:0x00cf, B:117:0x00ef, B:118:0x0114, B:121:0x011a, B:122:0x013f, B:125:0x0145, B:126:0x016a, B:128:0x0170, B:129:0x0184, B:132:0x018a, B:133:0x01af, B:135:0x01b5, B:136:0x01c9, B:139:0x01cf, B:140:0x01ec, B:141:0x01a7, B:142:0x0162, B:143:0x0137, B:144:0x010c, B:147:0x01f5), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0336 A[Catch: all -> 0x0072, Exception -> 0x03d1, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0001, B:6:0x0014, B:9:0x0022, B:12:0x0035, B:15:0x0055, B:16:0x007d, B:17:0x01fa, B:19:0x0206, B:22:0x0213, B:23:0x0222, B:27:0x0262, B:28:0x029d, B:30:0x02a1, B:36:0x02a4, B:39:0x02b4, B:42:0x02ec, B:44:0x0336, B:45:0x0354, B:48:0x0362, B:49:0x0381, B:51:0x038b, B:52:0x03b9, B:54:0x03c6, B:56:0x03cc, B:69:0x03a8, B:72:0x036c, B:75:0x0376, B:76:0x037c, B:77:0x034d, B:79:0x02f7, B:81:0x0302, B:85:0x0314, B:88:0x031c, B:91:0x0327, B:92:0x032e, B:94:0x02c7, B:95:0x02d8, B:58:0x03d1, B:60:0x03e9, B:62:0x03f1, B:65:0x0400, B:66:0x042b, B:68:0x0438, B:99:0x026c, B:100:0x0272, B:101:0x0278, B:106:0x0282, B:109:0x028c, B:110:0x0292, B:111:0x0298, B:112:0x021d, B:113:0x0075, B:114:0x00cf, B:117:0x00ef, B:118:0x0114, B:121:0x011a, B:122:0x013f, B:125:0x0145, B:126:0x016a, B:128:0x0170, B:129:0x0184, B:132:0x018a, B:133:0x01af, B:135:0x01b5, B:136:0x01c9, B:139:0x01cf, B:140:0x01ec, B:141:0x01a7, B:142:0x0162, B:143:0x0137, B:144:0x010c, B:147:0x01f5), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0362 A[Catch: all -> 0x0072, Exception -> 0x03d1, TRY_ENTER, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0001, B:6:0x0014, B:9:0x0022, B:12:0x0035, B:15:0x0055, B:16:0x007d, B:17:0x01fa, B:19:0x0206, B:22:0x0213, B:23:0x0222, B:27:0x0262, B:28:0x029d, B:30:0x02a1, B:36:0x02a4, B:39:0x02b4, B:42:0x02ec, B:44:0x0336, B:45:0x0354, B:48:0x0362, B:49:0x0381, B:51:0x038b, B:52:0x03b9, B:54:0x03c6, B:56:0x03cc, B:69:0x03a8, B:72:0x036c, B:75:0x0376, B:76:0x037c, B:77:0x034d, B:79:0x02f7, B:81:0x0302, B:85:0x0314, B:88:0x031c, B:91:0x0327, B:92:0x032e, B:94:0x02c7, B:95:0x02d8, B:58:0x03d1, B:60:0x03e9, B:62:0x03f1, B:65:0x0400, B:66:0x042b, B:68:0x0438, B:99:0x026c, B:100:0x0272, B:101:0x0278, B:106:0x0282, B:109:0x028c, B:110:0x0292, B:111:0x0298, B:112:0x021d, B:113:0x0075, B:114:0x00cf, B:117:0x00ef, B:118:0x0114, B:121:0x011a, B:122:0x013f, B:125:0x0145, B:126:0x016a, B:128:0x0170, B:129:0x0184, B:132:0x018a, B:133:0x01af, B:135:0x01b5, B:136:0x01c9, B:139:0x01cf, B:140:0x01ec, B:141:0x01a7, B:142:0x0162, B:143:0x0137, B:144:0x010c, B:147:0x01f5), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x038b A[Catch: all -> 0x0072, Exception -> 0x03d1, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0001, B:6:0x0014, B:9:0x0022, B:12:0x0035, B:15:0x0055, B:16:0x007d, B:17:0x01fa, B:19:0x0206, B:22:0x0213, B:23:0x0222, B:27:0x0262, B:28:0x029d, B:30:0x02a1, B:36:0x02a4, B:39:0x02b4, B:42:0x02ec, B:44:0x0336, B:45:0x0354, B:48:0x0362, B:49:0x0381, B:51:0x038b, B:52:0x03b9, B:54:0x03c6, B:56:0x03cc, B:69:0x03a8, B:72:0x036c, B:75:0x0376, B:76:0x037c, B:77:0x034d, B:79:0x02f7, B:81:0x0302, B:85:0x0314, B:88:0x031c, B:91:0x0327, B:92:0x032e, B:94:0x02c7, B:95:0x02d8, B:58:0x03d1, B:60:0x03e9, B:62:0x03f1, B:65:0x0400, B:66:0x042b, B:68:0x0438, B:99:0x026c, B:100:0x0272, B:101:0x0278, B:106:0x0282, B:109:0x028c, B:110:0x0292, B:111:0x0298, B:112:0x021d, B:113:0x0075, B:114:0x00cf, B:117:0x00ef, B:118:0x0114, B:121:0x011a, B:122:0x013f, B:125:0x0145, B:126:0x016a, B:128:0x0170, B:129:0x0184, B:132:0x018a, B:133:0x01af, B:135:0x01b5, B:136:0x01c9, B:139:0x01cf, B:140:0x01ec, B:141:0x01a7, B:142:0x0162, B:143:0x0137, B:144:0x010c, B:147:0x01f5), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0438 A[Catch: all -> 0x0072, TRY_LEAVE, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0001, B:6:0x0014, B:9:0x0022, B:12:0x0035, B:15:0x0055, B:16:0x007d, B:17:0x01fa, B:19:0x0206, B:22:0x0213, B:23:0x0222, B:27:0x0262, B:28:0x029d, B:30:0x02a1, B:36:0x02a4, B:39:0x02b4, B:42:0x02ec, B:44:0x0336, B:45:0x0354, B:48:0x0362, B:49:0x0381, B:51:0x038b, B:52:0x03b9, B:54:0x03c6, B:56:0x03cc, B:69:0x03a8, B:72:0x036c, B:75:0x0376, B:76:0x037c, B:77:0x034d, B:79:0x02f7, B:81:0x0302, B:85:0x0314, B:88:0x031c, B:91:0x0327, B:92:0x032e, B:94:0x02c7, B:95:0x02d8, B:58:0x03d1, B:60:0x03e9, B:62:0x03f1, B:65:0x0400, B:66:0x042b, B:68:0x0438, B:99:0x026c, B:100:0x0272, B:101:0x0278, B:106:0x0282, B:109:0x028c, B:110:0x0292, B:111:0x0298, B:112:0x021d, B:113:0x0075, B:114:0x00cf, B:117:0x00ef, B:118:0x0114, B:121:0x011a, B:122:0x013f, B:125:0x0145, B:126:0x016a, B:128:0x0170, B:129:0x0184, B:132:0x018a, B:133:0x01af, B:135:0x01b5, B:136:0x01c9, B:139:0x01cf, B:140:0x01ec, B:141:0x01a7, B:142:0x0162, B:143:0x0137, B:144:0x010c, B:147:0x01f5), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03a8 A[Catch: all -> 0x0072, Exception -> 0x03d1, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0001, B:6:0x0014, B:9:0x0022, B:12:0x0035, B:15:0x0055, B:16:0x007d, B:17:0x01fa, B:19:0x0206, B:22:0x0213, B:23:0x0222, B:27:0x0262, B:28:0x029d, B:30:0x02a1, B:36:0x02a4, B:39:0x02b4, B:42:0x02ec, B:44:0x0336, B:45:0x0354, B:48:0x0362, B:49:0x0381, B:51:0x038b, B:52:0x03b9, B:54:0x03c6, B:56:0x03cc, B:69:0x03a8, B:72:0x036c, B:75:0x0376, B:76:0x037c, B:77:0x034d, B:79:0x02f7, B:81:0x0302, B:85:0x0314, B:88:0x031c, B:91:0x0327, B:92:0x032e, B:94:0x02c7, B:95:0x02d8, B:58:0x03d1, B:60:0x03e9, B:62:0x03f1, B:65:0x0400, B:66:0x042b, B:68:0x0438, B:99:0x026c, B:100:0x0272, B:101:0x0278, B:106:0x0282, B:109:0x028c, B:110:0x0292, B:111:0x0298, B:112:0x021d, B:113:0x0075, B:114:0x00cf, B:117:0x00ef, B:118:0x0114, B:121:0x011a, B:122:0x013f, B:125:0x0145, B:126:0x016a, B:128:0x0170, B:129:0x0184, B:132:0x018a, B:133:0x01af, B:135:0x01b5, B:136:0x01c9, B:139:0x01cf, B:140:0x01ec, B:141:0x01a7, B:142:0x0162, B:143:0x0137, B:144:0x010c, B:147:0x01f5), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x034d A[Catch: all -> 0x0072, Exception -> 0x03d1, TryCatch #0 {all -> 0x0072, blocks: (B:3:0x0001, B:6:0x0014, B:9:0x0022, B:12:0x0035, B:15:0x0055, B:16:0x007d, B:17:0x01fa, B:19:0x0206, B:22:0x0213, B:23:0x0222, B:27:0x0262, B:28:0x029d, B:30:0x02a1, B:36:0x02a4, B:39:0x02b4, B:42:0x02ec, B:44:0x0336, B:45:0x0354, B:48:0x0362, B:49:0x0381, B:51:0x038b, B:52:0x03b9, B:54:0x03c6, B:56:0x03cc, B:69:0x03a8, B:72:0x036c, B:75:0x0376, B:76:0x037c, B:77:0x034d, B:79:0x02f7, B:81:0x0302, B:85:0x0314, B:88:0x031c, B:91:0x0327, B:92:0x032e, B:94:0x02c7, B:95:0x02d8, B:58:0x03d1, B:60:0x03e9, B:62:0x03f1, B:65:0x0400, B:66:0x042b, B:68:0x0438, B:99:0x026c, B:100:0x0272, B:101:0x0278, B:106:0x0282, B:109:0x028c, B:110:0x0292, B:111:0x0298, B:112:0x021d, B:113:0x0075, B:114:0x00cf, B:117:0x00ef, B:118:0x0114, B:121:0x011a, B:122:0x013f, B:125:0x0145, B:126:0x016a, B:128:0x0170, B:129:0x0184, B:132:0x018a, B:133:0x01af, B:135:0x01b5, B:136:0x01c9, B:139:0x01cf, B:140:0x01ec, B:141:0x01a7, B:142:0x0162, B:143:0x0137, B:144:0x010c, B:147:0x01f5), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void v0(defpackage.p00 r13, defpackage.yf r14) {
        /*
            Method dump skipped, instructions count: 1094
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p00.v0(p00, yf):void");
    }

    public static String w0() {
        NetworkCapabilities networkCapabilities;
        try {
            Network activeNetwork = K1.getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = K1.getNetworkCapabilities(activeNetwork)) == null) {
                return null;
            }
            int linkDownstreamBandwidthKbps = networkCapabilities.getLinkDownstreamBandwidthKbps();
            networkCapabilities.getLinkUpstreamBandwidthKbps();
            double d = linkDownstreamBandwidthKbps / 1000.0d;
            if (d <= 0.0d) {
                return null;
            }
            return N1.format(d) + " Mbps";
        } catch (Exception unused) {
            return null;
        }
    }

    public static m00 y0(Context context) {
        m00 m00Var = new m00(context, null);
        m00Var.setEmojiCompatEnabled(false);
        return m00Var;
    }

    public final void C0() {
        this.Y0.setRefreshing(true);
        View inflate = w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
        try {
            th2 th2Var = new th2(g0());
            ((j3) th2Var.h).s = inflate;
            th2Var.h(A(R.string.cancel), new c00(this, 12));
            th2Var.j(A(R.string.settings), new c00(this, 13));
            ImageView imageView = (ImageView) inflate.findViewById(R.id.info_icon);
            try {
                if (uz1.d(i0())) {
                    imageView.setImageResource(R.drawable.ic_memory_light);
                } else {
                    imageView.setImageResource(R.drawable.ic_memory_dark);
                }
            } catch (Exception unused) {
            }
            try {
                ((TextView) inflate.findViewById(R.id.info_title)).setText(A(R.string.memory));
            } catch (Exception unused2) {
            }
            RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.info_recyclerview);
            recyclerView.setHasFixedSize(true);
            i0();
            recyclerView.setLayoutManager(new LinearLayoutManager(1));
            new l00(this, recyclerView, th2Var, 0).executeOnExecutor(MainApp.h, new Void[0]);
        } catch (NullPointerException unused3) {
        }
    }

    public final synchronized void D0() {
        o00 o00Var;
        int i = 0;
        try {
            this.B1 = false;
            Handler handler = this.D1;
            if (handler != null) {
                handler.removeCallbacks(this.E1);
            }
            TelephonyManager telephonyManager = J1;
            if (telephonyManager != null && (o00Var = L1) != null && this.G1) {
                this.G1 = false;
                Handler handler2 = this.D1;
                if (handler2 != null) {
                    handler2.post(new yz(telephonyManager, o00Var, i));
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.ld0
    public final void L(Context context) {
        super.L(context);
        this.F1 = context.getApplicationContext();
    }

    @Override // defpackage.ld0
    public final View O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        boolean z;
        gr grVar;
        vq a3;
        String b;
        try {
            View inflate = layoutInflater.inflate(R.layout.dashboard_fragment2, viewGroup, false);
            inflate.setVisibility(4);
            O1 = (tx0) ((MainApp) i0().getApplicationContext()).g.h;
            H1 = uz1.k0();
            M1 = false;
            this.m1 = i51.b("prefReverseClusters").booleanValue();
            P1.addAll(r00.a(i0()));
            TypedValue typedValue = new TypedValue();
            g0().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
            int i = typedValue.data;
            this.s1 = i;
            int e = ts.e(i, 140);
            g0().getTheme().resolveAttribute(R.attr.textPrimary, typedValue, true);
            this.w1 = typedValue.data;
            g0().getTheme().resolveAttribute(R.attr.textTertiary, typedValue, true);
            this.x1 = typedValue.data;
            g0().getTheme().resolveAttribute(R.attr.dashboard_red, typedValue, true);
            this.t1 = typedValue.data;
            g0().getTheme().resolveAttribute(R.attr.dashboard_yellow, typedValue, true);
            this.v1 = typedValue.data;
            g0().getTheme().resolveAttribute(R.attr.dashboard_orange, typedValue, true);
            this.u1 = typedValue.data;
            try {
                String[] strArr = Build.SUPPORTED_ABIS;
                int length = strArr.length;
                StringBuilder sb = null;
                for (int i2 = 0; i2 < length; i2++) {
                    String str = strArr[i2];
                    if (sb == null) {
                        sb = str == null ? null : new StringBuilder(str);
                    } else {
                        sb.append(" ");
                        sb.append(str);
                    }
                }
                this.n1 = " (32-bit)";
                String property = System.getProperty("os.arch");
                if (property.contains("64")) {
                    this.n1 = " (64-bit)";
                }
                if (!property.contains("64") && sb.toString().contains("64")) {
                    this.n1 = YHJbtPFAANaPQ.gbmbWRjtSKCP;
                }
                if (!this.n1.contains("64-bit")) {
                    ((ImageView) inflate.findViewById(R.id.benchmark_icon)).setImageResource(R.drawable.ic_cpu_dark);
                    ((TextView) inflate.findViewById(R.id.benchmark_text)).setText(A(R.string.cpu_times));
                }
            } catch (Exception unused) {
                ((ImageView) inflate.findViewById(R.id.benchmark_icon)).setImageResource(R.drawable.ic_cpu_info);
                ((TextView) inflate.findViewById(R.id.benchmark_text)).setText(A(R.string.cpu_times));
            }
            final int i3 = 7;
            ((MaterialCardView) inflate.findViewById(R.id.monitor_button)).setOnClickListener(new View.OnClickListener(this) { // from class: a00
                public final /* synthetic */ p00 h;

                {
                    this.h = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i4 = i3;
                    int i5 = 1;
                    p00 p00Var = this.h;
                    switch (i4) {
                        case 0:
                            int i6 = p00.H1;
                            try {
                                if (p00Var.n1.contains("64-bit") && !p00Var.e0) {
                                    uz1.q0(p00Var.i0());
                                } else if (p00Var.n1.contains("64-bit")) {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) BenchmarkSuiteActivity.class));
                                } else {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) CPUTimeActivity.class));
                                }
                                break;
                            } catch (Exception unused2) {
                                return;
                            }
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            int i7 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent = new Intent(p00Var.i0(), (Class<?>) BatteryActivity.class);
                                    intent.putExtra("dynamic", i51.b("prefDC"));
                                    intent.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent.putExtra("color", i51.c(6, "prefColor"));
                                    intent.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused3) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            int i8 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) ToolsActivity.class));
                                break;
                            } catch (Exception unused4) {
                                return;
                            }
                        case 3:
                            int i9 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) TestActivity.class));
                                break;
                            } catch (Exception unused5) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                            int i10 = p00.H1;
                            if (!Build.MODEL.equals("A063")) {
                                try {
                                    if (!p00Var.G()) {
                                        break;
                                    } else {
                                        th2 th2Var = new th2(p00Var.g0());
                                        j3 j3Var = (j3) th2Var.h;
                                        View inflate2 = p00Var.w().inflate(R.layout.widget_dialog_view, (ViewGroup) null);
                                        TextView textView = (TextView) inflate2.findViewById(R.id.widget_msg);
                                        j3Var.e = p00Var.A(R.string.widgets) + " BETA";
                                        if (!i51.b("prefHardwareDB").booleanValue()) {
                                            textView.setText(p00Var.A(R.string.widgets_require_pro));
                                        }
                                        j3Var.s = inflate2;
                                        th2Var.j(p00Var.A(R.string.okay), null);
                                        n3 a4 = th2Var.a();
                                        p00Var.q1 = a4;
                                        a4.show();
                                        break;
                                    }
                                } catch (Throwable unused6) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            }
                            break;
                        case 5:
                            int i11 = p00.H1;
                            p00Var.i0();
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused7) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                            int i12 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) TemperatureActivity.class));
                                break;
                            } catch (Exception unused8) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                            int i13 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent2 = new Intent(p00Var.i0(), (Class<?>) MonitorActivity.class);
                                    intent2.putExtra("dynamic", i51.b("prefDC"));
                                    intent2.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent2.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent2.putExtra("color", i51.c(6, "prefColor"));
                                    intent2.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent2);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused9) {
                                return;
                            }
                        case 8:
                            int i14 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused10) {
                                return;
                            }
                        case rt0.o /* 9 */:
                            p00 p00Var2 = this.h;
                            p00Var2.Y0.setRefreshing(true);
                            View inflate3 = p00Var2.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var2 = new th2(p00Var2.g0());
                                ((j3) th2Var2.h).s = inflate3;
                                th2Var2.h(p00Var2.A(R.string.cancel), new c00(p00Var2, 0));
                                th2Var2.j(p00Var2.A(R.string.settings), new c00(p00Var2, 1));
                                Intent registerReceiver = p00Var2.i0().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                ImageView imageView = (ImageView) inflate3.findViewById(R.id.info_icon);
                                try {
                                    int intExtra = (int) ((registerReceiver.getIntExtra("level", -1) * 100.0f) / registerReceiver.getIntExtra("scale", -1));
                                    if (uz1.d(p00Var2.i0())) {
                                        if (intExtra < 20) {
                                            imageView.setImageResource(R.drawable.ic_batt_5_light);
                                        } else if (intExtra < 40) {
                                            imageView.setImageResource(R.drawable.ic_batt_33_light);
                                        } else if (intExtra < 55) {
                                            imageView.setImageResource(R.drawable.ic_batt_50_light);
                                        } else if (intExtra < 75) {
                                            imageView.setImageResource(R.drawable.ic_batt_66_light);
                                        } else if (intExtra < 90) {
                                            imageView.setImageResource(R.drawable.ic_batt_75_light);
                                        } else {
                                            imageView.setImageResource(R.drawable.ic_batt_100_light);
                                        }
                                    } else if (intExtra < 20) {
                                        imageView.setImageResource(R.drawable.ic_batt_5_dark);
                                    } else if (intExtra < 40) {
                                        imageView.setImageResource(R.drawable.ic_batt_33_dark);
                                    } else if (intExtra < 55) {
                                        imageView.setImageResource(R.drawable.ic_batt_50_dark);
                                    } else if (intExtra < 75) {
                                        imageView.setImageResource(R.drawable.ic_batt_66_dark);
                                    } else if (intExtra < 90) {
                                        imageView.setImageResource(R.drawable.ic_batt_75_dark);
                                    } else {
                                        imageView.setImageResource(R.drawable.ic_batt_100_dark);
                                    }
                                } catch (Exception unused11) {
                                }
                                try {
                                    ((TextView) inflate3.findViewById(R.id.info_title)).setText(p00Var2.A(R.string.battery));
                                } catch (Exception unused12) {
                                }
                                RecyclerView recyclerView = (RecyclerView) inflate3.findViewById(R.id.info_recyclerview);
                                recyclerView.setHasFixedSize(true);
                                p00Var2.i0();
                                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var2, registerReceiver, recyclerView, th2Var2, 0).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused13) {
                                return;
                            }
                        case 10:
                            int i15 = p00.H1;
                            try {
                                th2 th2Var3 = new th2(p00Var.g0());
                                ((j3) th2Var3.h).g = "\n" + p00Var.A(R.string.cpu_na_msg) + "\n";
                                th2Var3.j(p00Var.A(R.string.okay), null);
                                n3 a5 = th2Var3.a();
                                p00Var.q1 = a5;
                                try {
                                    a5.show();
                                    break;
                                } catch (Exception unused14) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            } catch (NullPointerException unused15) {
                                return;
                            }
                        case 11:
                            p00Var.Y0.setRefreshing(true);
                            View inflate4 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var4 = new th2(p00Var.g0());
                                ((j3) th2Var4.h).s = inflate4;
                                th2Var4.h(p00Var.A(R.string.cancel), new c00(p00Var, 8));
                                th2Var4.j(p00Var.A(R.string.settings), new c00(p00Var, 9));
                                NetworkInfo activeNetworkInfo = ((ConnectivityManager) p00Var.i0().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                                boolean z2 = activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
                                ImageView imageView2 = (ImageView) inflate4.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        if (z2) {
                                            imageView2.setImageResource(R.drawable.ic_signal0_light);
                                        } else {
                                            imageView2.setImageResource(R.drawable.ic_wifi_light);
                                        }
                                    } else if (z2) {
                                        imageView2.setImageResource(R.drawable.ic_signal0_dark);
                                    } else {
                                        imageView2.setImageResource(R.drawable.ic_wifi_dark);
                                    }
                                } catch (Exception unused16) {
                                }
                                try {
                                    ((TextView) inflate4.findViewById(R.id.info_title)).setText(p00Var.A(R.string.network));
                                } catch (Exception unused17) {
                                }
                                RecyclerView recyclerView2 = (RecyclerView) inflate4.findViewById(R.id.info_recyclerview);
                                recyclerView2.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                new k00(p00Var, z2, recyclerView2, th2Var4).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused18) {
                                return;
                            }
                            break;
                        case 12:
                            int i16 = p00.H1;
                            try {
                                p00Var.C0();
                                break;
                            } catch (Exception unused19) {
                                return;
                            }
                        case 13:
                            p00Var.Y0.setRefreshing(true);
                            View inflate5 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var5 = new th2(p00Var.g0());
                                ((j3) th2Var5.h).s = inflate5;
                                th2Var5.h(p00Var.A(R.string.cancel), new c00(p00Var, 10));
                                th2Var5.j(p00Var.A(R.string.settings), new c00(p00Var, 11));
                                ImageView imageView3 = (ImageView) inflate5.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView3.setImageResource(R.drawable.ic_storage_light);
                                    } else {
                                        imageView3.setImageResource(R.drawable.ic_storage_dark);
                                    }
                                } catch (Exception unused20) {
                                }
                                try {
                                    ((TextView) inflate5.findViewById(R.id.info_title)).setText(p00Var.A(R.string.storage));
                                } catch (Exception unused21) {
                                }
                                RecyclerView recyclerView3 = (RecyclerView) inflate5.findViewById(R.id.info_recyclerview);
                                recyclerView3.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView3.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView3, th2Var5, i5).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused22) {
                                return;
                            }
                        case 14:
                            p00Var.Y0.setRefreshing(true);
                            View inflate6 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var6 = new th2(p00Var.g0());
                                ((j3) th2Var6.h).s = inflate6;
                                th2Var6.h(p00Var.A(R.string.cancel), new c00(p00Var, 4));
                                th2Var6.j(p00Var.A(R.string.settings), new c00(p00Var, 5));
                                ImageView imageView4 = (ImageView) inflate6.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView4.setImageResource(R.drawable.ic_apps_dark);
                                    } else {
                                        imageView4.setImageResource(R.drawable.ic_apps);
                                    }
                                } catch (Exception unused23) {
                                }
                                try {
                                    ((TextView) inflate6.findViewById(R.id.info_title)).setText(p00Var.A(R.string.installed_apps));
                                } catch (Exception unused24) {
                                }
                                RecyclerView recyclerView4 = (RecyclerView) inflate6.findViewById(R.id.info_recyclerview);
                                recyclerView4.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView4.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView4, th2Var6, 2).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused25) {
                                return;
                            }
                        case 15:
                            p00Var.Y0.setRefreshing(true);
                            View inflate7 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var7 = new th2(p00Var.g0());
                                ((j3) th2Var7.h).s = inflate7;
                                th2Var7.h(p00Var.A(R.string.cancel), new c00(p00Var, 2));
                                int i17 = 3;
                                th2Var7.j(p00Var.A(R.string.settings), new c00(p00Var, 3));
                                ImageView imageView5 = (ImageView) inflate7.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView5.setImageResource(R.drawable.ic_phone_light);
                                    } else {
                                        imageView5.setImageResource(R.drawable.ic_phone);
                                    }
                                } catch (Exception unused26) {
                                }
                                try {
                                    ((TextView) inflate7.findViewById(R.id.info_title)).setText(p00Var.A(R.string.display));
                                } catch (Exception unused27) {
                                }
                                RecyclerView recyclerView5 = (RecyclerView) inflate7.findViewById(R.id.info_recyclerview);
                                recyclerView5.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView5.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView5, th2Var7, i17).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused28) {
                                return;
                            }
                        default:
                            p00 p00Var3 = this.h;
                            p00Var3.Y0.setRefreshing(true);
                            View inflate8 = p00Var3.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var8 = new th2(p00Var3.g0());
                                ((j3) th2Var8.h).s = inflate8;
                                th2Var8.h(p00Var3.A(R.string.cancel), new c00(p00Var3, 6));
                                th2Var8.j(p00Var3.A(R.string.settings), new c00(p00Var3, 7));
                                a61 s = uz1.s(p00Var3.i0(), Build.VERSION.SDK_INT);
                                ImageView imageView6 = (ImageView) inflate8.findViewById(R.id.info_icon);
                                imageView6.setImageTintList(null);
                                imageView6.setImageDrawable((Drawable) s.f11a);
                                try {
                                    ((TextView) inflate8.findViewById(R.id.info_title)).setText(p00Var3.A(R.string.operating_system));
                                } catch (Exception unused29) {
                                }
                                RecyclerView recyclerView6 = (RecyclerView) inflate8.findViewById(R.id.info_recyclerview);
                                recyclerView6.setHasFixedSize(true);
                                p00Var3.i0();
                                recyclerView6.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var3, s, recyclerView6, th2Var8, 1).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused30) {
                                return;
                            }
                    }
                }
            });
            final int i4 = 0;
            ((MaterialCardView) inflate.findViewById(R.id.benchmarks_button)).setOnClickListener(new View.OnClickListener(this) { // from class: a00
                public final /* synthetic */ p00 h;

                {
                    this.h = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i4;
                    int i5 = 1;
                    p00 p00Var = this.h;
                    switch (i42) {
                        case 0:
                            int i6 = p00.H1;
                            try {
                                if (p00Var.n1.contains("64-bit") && !p00Var.e0) {
                                    uz1.q0(p00Var.i0());
                                } else if (p00Var.n1.contains("64-bit")) {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) BenchmarkSuiteActivity.class));
                                } else {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) CPUTimeActivity.class));
                                }
                                break;
                            } catch (Exception unused2) {
                                return;
                            }
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            int i7 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent = new Intent(p00Var.i0(), (Class<?>) BatteryActivity.class);
                                    intent.putExtra("dynamic", i51.b("prefDC"));
                                    intent.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent.putExtra("color", i51.c(6, "prefColor"));
                                    intent.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused3) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            int i8 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) ToolsActivity.class));
                                break;
                            } catch (Exception unused4) {
                                return;
                            }
                        case 3:
                            int i9 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) TestActivity.class));
                                break;
                            } catch (Exception unused5) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                            int i10 = p00.H1;
                            if (!Build.MODEL.equals("A063")) {
                                try {
                                    if (!p00Var.G()) {
                                        break;
                                    } else {
                                        th2 th2Var = new th2(p00Var.g0());
                                        j3 j3Var = (j3) th2Var.h;
                                        View inflate2 = p00Var.w().inflate(R.layout.widget_dialog_view, (ViewGroup) null);
                                        TextView textView = (TextView) inflate2.findViewById(R.id.widget_msg);
                                        j3Var.e = p00Var.A(R.string.widgets) + " BETA";
                                        if (!i51.b("prefHardwareDB").booleanValue()) {
                                            textView.setText(p00Var.A(R.string.widgets_require_pro));
                                        }
                                        j3Var.s = inflate2;
                                        th2Var.j(p00Var.A(R.string.okay), null);
                                        n3 a4 = th2Var.a();
                                        p00Var.q1 = a4;
                                        a4.show();
                                        break;
                                    }
                                } catch (Throwable unused6) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            }
                            break;
                        case 5:
                            int i11 = p00.H1;
                            p00Var.i0();
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused7) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                            int i12 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) TemperatureActivity.class));
                                break;
                            } catch (Exception unused8) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                            int i13 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent2 = new Intent(p00Var.i0(), (Class<?>) MonitorActivity.class);
                                    intent2.putExtra("dynamic", i51.b("prefDC"));
                                    intent2.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent2.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent2.putExtra("color", i51.c(6, "prefColor"));
                                    intent2.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent2);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused9) {
                                return;
                            }
                        case 8:
                            int i14 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused10) {
                                return;
                            }
                        case rt0.o /* 9 */:
                            p00 p00Var2 = this.h;
                            p00Var2.Y0.setRefreshing(true);
                            View inflate3 = p00Var2.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var2 = new th2(p00Var2.g0());
                                ((j3) th2Var2.h).s = inflate3;
                                th2Var2.h(p00Var2.A(R.string.cancel), new c00(p00Var2, 0));
                                th2Var2.j(p00Var2.A(R.string.settings), new c00(p00Var2, 1));
                                Intent registerReceiver = p00Var2.i0().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                ImageView imageView = (ImageView) inflate3.findViewById(R.id.info_icon);
                                try {
                                    int intExtra = (int) ((registerReceiver.getIntExtra("level", -1) * 100.0f) / registerReceiver.getIntExtra("scale", -1));
                                    if (uz1.d(p00Var2.i0())) {
                                        if (intExtra < 20) {
                                            imageView.setImageResource(R.drawable.ic_batt_5_light);
                                        } else if (intExtra < 40) {
                                            imageView.setImageResource(R.drawable.ic_batt_33_light);
                                        } else if (intExtra < 55) {
                                            imageView.setImageResource(R.drawable.ic_batt_50_light);
                                        } else if (intExtra < 75) {
                                            imageView.setImageResource(R.drawable.ic_batt_66_light);
                                        } else if (intExtra < 90) {
                                            imageView.setImageResource(R.drawable.ic_batt_75_light);
                                        } else {
                                            imageView.setImageResource(R.drawable.ic_batt_100_light);
                                        }
                                    } else if (intExtra < 20) {
                                        imageView.setImageResource(R.drawable.ic_batt_5_dark);
                                    } else if (intExtra < 40) {
                                        imageView.setImageResource(R.drawable.ic_batt_33_dark);
                                    } else if (intExtra < 55) {
                                        imageView.setImageResource(R.drawable.ic_batt_50_dark);
                                    } else if (intExtra < 75) {
                                        imageView.setImageResource(R.drawable.ic_batt_66_dark);
                                    } else if (intExtra < 90) {
                                        imageView.setImageResource(R.drawable.ic_batt_75_dark);
                                    } else {
                                        imageView.setImageResource(R.drawable.ic_batt_100_dark);
                                    }
                                } catch (Exception unused11) {
                                }
                                try {
                                    ((TextView) inflate3.findViewById(R.id.info_title)).setText(p00Var2.A(R.string.battery));
                                } catch (Exception unused12) {
                                }
                                RecyclerView recyclerView = (RecyclerView) inflate3.findViewById(R.id.info_recyclerview);
                                recyclerView.setHasFixedSize(true);
                                p00Var2.i0();
                                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var2, registerReceiver, recyclerView, th2Var2, 0).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused13) {
                                return;
                            }
                        case 10:
                            int i15 = p00.H1;
                            try {
                                th2 th2Var3 = new th2(p00Var.g0());
                                ((j3) th2Var3.h).g = "\n" + p00Var.A(R.string.cpu_na_msg) + "\n";
                                th2Var3.j(p00Var.A(R.string.okay), null);
                                n3 a5 = th2Var3.a();
                                p00Var.q1 = a5;
                                try {
                                    a5.show();
                                    break;
                                } catch (Exception unused14) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            } catch (NullPointerException unused15) {
                                return;
                            }
                        case 11:
                            p00Var.Y0.setRefreshing(true);
                            View inflate4 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var4 = new th2(p00Var.g0());
                                ((j3) th2Var4.h).s = inflate4;
                                th2Var4.h(p00Var.A(R.string.cancel), new c00(p00Var, 8));
                                th2Var4.j(p00Var.A(R.string.settings), new c00(p00Var, 9));
                                NetworkInfo activeNetworkInfo = ((ConnectivityManager) p00Var.i0().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                                boolean z2 = activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
                                ImageView imageView2 = (ImageView) inflate4.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        if (z2) {
                                            imageView2.setImageResource(R.drawable.ic_signal0_light);
                                        } else {
                                            imageView2.setImageResource(R.drawable.ic_wifi_light);
                                        }
                                    } else if (z2) {
                                        imageView2.setImageResource(R.drawable.ic_signal0_dark);
                                    } else {
                                        imageView2.setImageResource(R.drawable.ic_wifi_dark);
                                    }
                                } catch (Exception unused16) {
                                }
                                try {
                                    ((TextView) inflate4.findViewById(R.id.info_title)).setText(p00Var.A(R.string.network));
                                } catch (Exception unused17) {
                                }
                                RecyclerView recyclerView2 = (RecyclerView) inflate4.findViewById(R.id.info_recyclerview);
                                recyclerView2.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                new k00(p00Var, z2, recyclerView2, th2Var4).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused18) {
                                return;
                            }
                            break;
                        case 12:
                            int i16 = p00.H1;
                            try {
                                p00Var.C0();
                                break;
                            } catch (Exception unused19) {
                                return;
                            }
                        case 13:
                            p00Var.Y0.setRefreshing(true);
                            View inflate5 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var5 = new th2(p00Var.g0());
                                ((j3) th2Var5.h).s = inflate5;
                                th2Var5.h(p00Var.A(R.string.cancel), new c00(p00Var, 10));
                                th2Var5.j(p00Var.A(R.string.settings), new c00(p00Var, 11));
                                ImageView imageView3 = (ImageView) inflate5.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView3.setImageResource(R.drawable.ic_storage_light);
                                    } else {
                                        imageView3.setImageResource(R.drawable.ic_storage_dark);
                                    }
                                } catch (Exception unused20) {
                                }
                                try {
                                    ((TextView) inflate5.findViewById(R.id.info_title)).setText(p00Var.A(R.string.storage));
                                } catch (Exception unused21) {
                                }
                                RecyclerView recyclerView3 = (RecyclerView) inflate5.findViewById(R.id.info_recyclerview);
                                recyclerView3.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView3.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView3, th2Var5, i5).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused22) {
                                return;
                            }
                        case 14:
                            p00Var.Y0.setRefreshing(true);
                            View inflate6 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var6 = new th2(p00Var.g0());
                                ((j3) th2Var6.h).s = inflate6;
                                th2Var6.h(p00Var.A(R.string.cancel), new c00(p00Var, 4));
                                th2Var6.j(p00Var.A(R.string.settings), new c00(p00Var, 5));
                                ImageView imageView4 = (ImageView) inflate6.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView4.setImageResource(R.drawable.ic_apps_dark);
                                    } else {
                                        imageView4.setImageResource(R.drawable.ic_apps);
                                    }
                                } catch (Exception unused23) {
                                }
                                try {
                                    ((TextView) inflate6.findViewById(R.id.info_title)).setText(p00Var.A(R.string.installed_apps));
                                } catch (Exception unused24) {
                                }
                                RecyclerView recyclerView4 = (RecyclerView) inflate6.findViewById(R.id.info_recyclerview);
                                recyclerView4.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView4.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView4, th2Var6, 2).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused25) {
                                return;
                            }
                        case 15:
                            p00Var.Y0.setRefreshing(true);
                            View inflate7 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var7 = new th2(p00Var.g0());
                                ((j3) th2Var7.h).s = inflate7;
                                th2Var7.h(p00Var.A(R.string.cancel), new c00(p00Var, 2));
                                int i17 = 3;
                                th2Var7.j(p00Var.A(R.string.settings), new c00(p00Var, 3));
                                ImageView imageView5 = (ImageView) inflate7.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView5.setImageResource(R.drawable.ic_phone_light);
                                    } else {
                                        imageView5.setImageResource(R.drawable.ic_phone);
                                    }
                                } catch (Exception unused26) {
                                }
                                try {
                                    ((TextView) inflate7.findViewById(R.id.info_title)).setText(p00Var.A(R.string.display));
                                } catch (Exception unused27) {
                                }
                                RecyclerView recyclerView5 = (RecyclerView) inflate7.findViewById(R.id.info_recyclerview);
                                recyclerView5.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView5.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView5, th2Var7, i17).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused28) {
                                return;
                            }
                        default:
                            p00 p00Var3 = this.h;
                            p00Var3.Y0.setRefreshing(true);
                            View inflate8 = p00Var3.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var8 = new th2(p00Var3.g0());
                                ((j3) th2Var8.h).s = inflate8;
                                th2Var8.h(p00Var3.A(R.string.cancel), new c00(p00Var3, 6));
                                th2Var8.j(p00Var3.A(R.string.settings), new c00(p00Var3, 7));
                                a61 s = uz1.s(p00Var3.i0(), Build.VERSION.SDK_INT);
                                ImageView imageView6 = (ImageView) inflate8.findViewById(R.id.info_icon);
                                imageView6.setImageTintList(null);
                                imageView6.setImageDrawable((Drawable) s.f11a);
                                try {
                                    ((TextView) inflate8.findViewById(R.id.info_title)).setText(p00Var3.A(R.string.operating_system));
                                } catch (Exception unused29) {
                                }
                                RecyclerView recyclerView6 = (RecyclerView) inflate8.findViewById(R.id.info_recyclerview);
                                recyclerView6.setHasFixedSize(true);
                                p00Var3.i0();
                                recyclerView6.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var3, s, recyclerView6, th2Var8, 1).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused30) {
                                return;
                            }
                    }
                }
            });
            final int i5 = 1;
            ((MaterialCardView) inflate.findViewById(R.id.batmon_button)).setOnClickListener(new View.OnClickListener(this) { // from class: a00
                public final /* synthetic */ p00 h;

                {
                    this.h = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i5;
                    int i52 = 1;
                    p00 p00Var = this.h;
                    switch (i42) {
                        case 0:
                            int i6 = p00.H1;
                            try {
                                if (p00Var.n1.contains("64-bit") && !p00Var.e0) {
                                    uz1.q0(p00Var.i0());
                                } else if (p00Var.n1.contains("64-bit")) {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) BenchmarkSuiteActivity.class));
                                } else {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) CPUTimeActivity.class));
                                }
                                break;
                            } catch (Exception unused2) {
                                return;
                            }
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            int i7 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent = new Intent(p00Var.i0(), (Class<?>) BatteryActivity.class);
                                    intent.putExtra("dynamic", i51.b("prefDC"));
                                    intent.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent.putExtra("color", i51.c(6, "prefColor"));
                                    intent.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused3) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            int i8 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) ToolsActivity.class));
                                break;
                            } catch (Exception unused4) {
                                return;
                            }
                        case 3:
                            int i9 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) TestActivity.class));
                                break;
                            } catch (Exception unused5) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                            int i10 = p00.H1;
                            if (!Build.MODEL.equals("A063")) {
                                try {
                                    if (!p00Var.G()) {
                                        break;
                                    } else {
                                        th2 th2Var = new th2(p00Var.g0());
                                        j3 j3Var = (j3) th2Var.h;
                                        View inflate2 = p00Var.w().inflate(R.layout.widget_dialog_view, (ViewGroup) null);
                                        TextView textView = (TextView) inflate2.findViewById(R.id.widget_msg);
                                        j3Var.e = p00Var.A(R.string.widgets) + " BETA";
                                        if (!i51.b("prefHardwareDB").booleanValue()) {
                                            textView.setText(p00Var.A(R.string.widgets_require_pro));
                                        }
                                        j3Var.s = inflate2;
                                        th2Var.j(p00Var.A(R.string.okay), null);
                                        n3 a4 = th2Var.a();
                                        p00Var.q1 = a4;
                                        a4.show();
                                        break;
                                    }
                                } catch (Throwable unused6) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            }
                            break;
                        case 5:
                            int i11 = p00.H1;
                            p00Var.i0();
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused7) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                            int i12 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) TemperatureActivity.class));
                                break;
                            } catch (Exception unused8) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                            int i13 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent2 = new Intent(p00Var.i0(), (Class<?>) MonitorActivity.class);
                                    intent2.putExtra("dynamic", i51.b("prefDC"));
                                    intent2.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent2.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent2.putExtra("color", i51.c(6, "prefColor"));
                                    intent2.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent2);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused9) {
                                return;
                            }
                        case 8:
                            int i14 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused10) {
                                return;
                            }
                        case rt0.o /* 9 */:
                            p00 p00Var2 = this.h;
                            p00Var2.Y0.setRefreshing(true);
                            View inflate3 = p00Var2.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var2 = new th2(p00Var2.g0());
                                ((j3) th2Var2.h).s = inflate3;
                                th2Var2.h(p00Var2.A(R.string.cancel), new c00(p00Var2, 0));
                                th2Var2.j(p00Var2.A(R.string.settings), new c00(p00Var2, 1));
                                Intent registerReceiver = p00Var2.i0().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                ImageView imageView = (ImageView) inflate3.findViewById(R.id.info_icon);
                                try {
                                    int intExtra = (int) ((registerReceiver.getIntExtra("level", -1) * 100.0f) / registerReceiver.getIntExtra("scale", -1));
                                    if (uz1.d(p00Var2.i0())) {
                                        if (intExtra < 20) {
                                            imageView.setImageResource(R.drawable.ic_batt_5_light);
                                        } else if (intExtra < 40) {
                                            imageView.setImageResource(R.drawable.ic_batt_33_light);
                                        } else if (intExtra < 55) {
                                            imageView.setImageResource(R.drawable.ic_batt_50_light);
                                        } else if (intExtra < 75) {
                                            imageView.setImageResource(R.drawable.ic_batt_66_light);
                                        } else if (intExtra < 90) {
                                            imageView.setImageResource(R.drawable.ic_batt_75_light);
                                        } else {
                                            imageView.setImageResource(R.drawable.ic_batt_100_light);
                                        }
                                    } else if (intExtra < 20) {
                                        imageView.setImageResource(R.drawable.ic_batt_5_dark);
                                    } else if (intExtra < 40) {
                                        imageView.setImageResource(R.drawable.ic_batt_33_dark);
                                    } else if (intExtra < 55) {
                                        imageView.setImageResource(R.drawable.ic_batt_50_dark);
                                    } else if (intExtra < 75) {
                                        imageView.setImageResource(R.drawable.ic_batt_66_dark);
                                    } else if (intExtra < 90) {
                                        imageView.setImageResource(R.drawable.ic_batt_75_dark);
                                    } else {
                                        imageView.setImageResource(R.drawable.ic_batt_100_dark);
                                    }
                                } catch (Exception unused11) {
                                }
                                try {
                                    ((TextView) inflate3.findViewById(R.id.info_title)).setText(p00Var2.A(R.string.battery));
                                } catch (Exception unused12) {
                                }
                                RecyclerView recyclerView = (RecyclerView) inflate3.findViewById(R.id.info_recyclerview);
                                recyclerView.setHasFixedSize(true);
                                p00Var2.i0();
                                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var2, registerReceiver, recyclerView, th2Var2, 0).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused13) {
                                return;
                            }
                        case 10:
                            int i15 = p00.H1;
                            try {
                                th2 th2Var3 = new th2(p00Var.g0());
                                ((j3) th2Var3.h).g = "\n" + p00Var.A(R.string.cpu_na_msg) + "\n";
                                th2Var3.j(p00Var.A(R.string.okay), null);
                                n3 a5 = th2Var3.a();
                                p00Var.q1 = a5;
                                try {
                                    a5.show();
                                    break;
                                } catch (Exception unused14) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            } catch (NullPointerException unused15) {
                                return;
                            }
                        case 11:
                            p00Var.Y0.setRefreshing(true);
                            View inflate4 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var4 = new th2(p00Var.g0());
                                ((j3) th2Var4.h).s = inflate4;
                                th2Var4.h(p00Var.A(R.string.cancel), new c00(p00Var, 8));
                                th2Var4.j(p00Var.A(R.string.settings), new c00(p00Var, 9));
                                NetworkInfo activeNetworkInfo = ((ConnectivityManager) p00Var.i0().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                                boolean z2 = activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
                                ImageView imageView2 = (ImageView) inflate4.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        if (z2) {
                                            imageView2.setImageResource(R.drawable.ic_signal0_light);
                                        } else {
                                            imageView2.setImageResource(R.drawable.ic_wifi_light);
                                        }
                                    } else if (z2) {
                                        imageView2.setImageResource(R.drawable.ic_signal0_dark);
                                    } else {
                                        imageView2.setImageResource(R.drawable.ic_wifi_dark);
                                    }
                                } catch (Exception unused16) {
                                }
                                try {
                                    ((TextView) inflate4.findViewById(R.id.info_title)).setText(p00Var.A(R.string.network));
                                } catch (Exception unused17) {
                                }
                                RecyclerView recyclerView2 = (RecyclerView) inflate4.findViewById(R.id.info_recyclerview);
                                recyclerView2.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                new k00(p00Var, z2, recyclerView2, th2Var4).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused18) {
                                return;
                            }
                            break;
                        case 12:
                            int i16 = p00.H1;
                            try {
                                p00Var.C0();
                                break;
                            } catch (Exception unused19) {
                                return;
                            }
                        case 13:
                            p00Var.Y0.setRefreshing(true);
                            View inflate5 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var5 = new th2(p00Var.g0());
                                ((j3) th2Var5.h).s = inflate5;
                                th2Var5.h(p00Var.A(R.string.cancel), new c00(p00Var, 10));
                                th2Var5.j(p00Var.A(R.string.settings), new c00(p00Var, 11));
                                ImageView imageView3 = (ImageView) inflate5.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView3.setImageResource(R.drawable.ic_storage_light);
                                    } else {
                                        imageView3.setImageResource(R.drawable.ic_storage_dark);
                                    }
                                } catch (Exception unused20) {
                                }
                                try {
                                    ((TextView) inflate5.findViewById(R.id.info_title)).setText(p00Var.A(R.string.storage));
                                } catch (Exception unused21) {
                                }
                                RecyclerView recyclerView3 = (RecyclerView) inflate5.findViewById(R.id.info_recyclerview);
                                recyclerView3.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView3.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView3, th2Var5, i52).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused22) {
                                return;
                            }
                        case 14:
                            p00Var.Y0.setRefreshing(true);
                            View inflate6 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var6 = new th2(p00Var.g0());
                                ((j3) th2Var6.h).s = inflate6;
                                th2Var6.h(p00Var.A(R.string.cancel), new c00(p00Var, 4));
                                th2Var6.j(p00Var.A(R.string.settings), new c00(p00Var, 5));
                                ImageView imageView4 = (ImageView) inflate6.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView4.setImageResource(R.drawable.ic_apps_dark);
                                    } else {
                                        imageView4.setImageResource(R.drawable.ic_apps);
                                    }
                                } catch (Exception unused23) {
                                }
                                try {
                                    ((TextView) inflate6.findViewById(R.id.info_title)).setText(p00Var.A(R.string.installed_apps));
                                } catch (Exception unused24) {
                                }
                                RecyclerView recyclerView4 = (RecyclerView) inflate6.findViewById(R.id.info_recyclerview);
                                recyclerView4.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView4.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView4, th2Var6, 2).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused25) {
                                return;
                            }
                        case 15:
                            p00Var.Y0.setRefreshing(true);
                            View inflate7 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var7 = new th2(p00Var.g0());
                                ((j3) th2Var7.h).s = inflate7;
                                th2Var7.h(p00Var.A(R.string.cancel), new c00(p00Var, 2));
                                int i17 = 3;
                                th2Var7.j(p00Var.A(R.string.settings), new c00(p00Var, 3));
                                ImageView imageView5 = (ImageView) inflate7.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView5.setImageResource(R.drawable.ic_phone_light);
                                    } else {
                                        imageView5.setImageResource(R.drawable.ic_phone);
                                    }
                                } catch (Exception unused26) {
                                }
                                try {
                                    ((TextView) inflate7.findViewById(R.id.info_title)).setText(p00Var.A(R.string.display));
                                } catch (Exception unused27) {
                                }
                                RecyclerView recyclerView5 = (RecyclerView) inflate7.findViewById(R.id.info_recyclerview);
                                recyclerView5.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView5.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView5, th2Var7, i17).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused28) {
                                return;
                            }
                        default:
                            p00 p00Var3 = this.h;
                            p00Var3.Y0.setRefreshing(true);
                            View inflate8 = p00Var3.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var8 = new th2(p00Var3.g0());
                                ((j3) th2Var8.h).s = inflate8;
                                th2Var8.h(p00Var3.A(R.string.cancel), new c00(p00Var3, 6));
                                th2Var8.j(p00Var3.A(R.string.settings), new c00(p00Var3, 7));
                                a61 s = uz1.s(p00Var3.i0(), Build.VERSION.SDK_INT);
                                ImageView imageView6 = (ImageView) inflate8.findViewById(R.id.info_icon);
                                imageView6.setImageTintList(null);
                                imageView6.setImageDrawable((Drawable) s.f11a);
                                try {
                                    ((TextView) inflate8.findViewById(R.id.info_title)).setText(p00Var3.A(R.string.operating_system));
                                } catch (Exception unused29) {
                                }
                                RecyclerView recyclerView6 = (RecyclerView) inflate8.findViewById(R.id.info_recyclerview);
                                recyclerView6.setHasFixedSize(true);
                                p00Var3.i0();
                                recyclerView6.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var3, s, recyclerView6, th2Var8, 1).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused30) {
                                return;
                            }
                    }
                }
            });
            final int i6 = 2;
            ((MaterialCardView) inflate.findViewById(R.id.tools_button)).setOnClickListener(new View.OnClickListener(this) { // from class: a00
                public final /* synthetic */ p00 h;

                {
                    this.h = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i6;
                    int i52 = 1;
                    p00 p00Var = this.h;
                    switch (i42) {
                        case 0:
                            int i62 = p00.H1;
                            try {
                                if (p00Var.n1.contains("64-bit") && !p00Var.e0) {
                                    uz1.q0(p00Var.i0());
                                } else if (p00Var.n1.contains("64-bit")) {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) BenchmarkSuiteActivity.class));
                                } else {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) CPUTimeActivity.class));
                                }
                                break;
                            } catch (Exception unused2) {
                                return;
                            }
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            int i7 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent = new Intent(p00Var.i0(), (Class<?>) BatteryActivity.class);
                                    intent.putExtra("dynamic", i51.b("prefDC"));
                                    intent.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent.putExtra("color", i51.c(6, "prefColor"));
                                    intent.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused3) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            int i8 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) ToolsActivity.class));
                                break;
                            } catch (Exception unused4) {
                                return;
                            }
                        case 3:
                            int i9 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) TestActivity.class));
                                break;
                            } catch (Exception unused5) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                            int i10 = p00.H1;
                            if (!Build.MODEL.equals("A063")) {
                                try {
                                    if (!p00Var.G()) {
                                        break;
                                    } else {
                                        th2 th2Var = new th2(p00Var.g0());
                                        j3 j3Var = (j3) th2Var.h;
                                        View inflate2 = p00Var.w().inflate(R.layout.widget_dialog_view, (ViewGroup) null);
                                        TextView textView = (TextView) inflate2.findViewById(R.id.widget_msg);
                                        j3Var.e = p00Var.A(R.string.widgets) + " BETA";
                                        if (!i51.b("prefHardwareDB").booleanValue()) {
                                            textView.setText(p00Var.A(R.string.widgets_require_pro));
                                        }
                                        j3Var.s = inflate2;
                                        th2Var.j(p00Var.A(R.string.okay), null);
                                        n3 a4 = th2Var.a();
                                        p00Var.q1 = a4;
                                        a4.show();
                                        break;
                                    }
                                } catch (Throwable unused6) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            }
                            break;
                        case 5:
                            int i11 = p00.H1;
                            p00Var.i0();
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused7) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                            int i12 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) TemperatureActivity.class));
                                break;
                            } catch (Exception unused8) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                            int i13 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent2 = new Intent(p00Var.i0(), (Class<?>) MonitorActivity.class);
                                    intent2.putExtra("dynamic", i51.b("prefDC"));
                                    intent2.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent2.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent2.putExtra("color", i51.c(6, "prefColor"));
                                    intent2.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent2);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused9) {
                                return;
                            }
                        case 8:
                            int i14 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused10) {
                                return;
                            }
                        case rt0.o /* 9 */:
                            p00 p00Var2 = this.h;
                            p00Var2.Y0.setRefreshing(true);
                            View inflate3 = p00Var2.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var2 = new th2(p00Var2.g0());
                                ((j3) th2Var2.h).s = inflate3;
                                th2Var2.h(p00Var2.A(R.string.cancel), new c00(p00Var2, 0));
                                th2Var2.j(p00Var2.A(R.string.settings), new c00(p00Var2, 1));
                                Intent registerReceiver = p00Var2.i0().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                ImageView imageView = (ImageView) inflate3.findViewById(R.id.info_icon);
                                try {
                                    int intExtra = (int) ((registerReceiver.getIntExtra("level", -1) * 100.0f) / registerReceiver.getIntExtra("scale", -1));
                                    if (uz1.d(p00Var2.i0())) {
                                        if (intExtra < 20) {
                                            imageView.setImageResource(R.drawable.ic_batt_5_light);
                                        } else if (intExtra < 40) {
                                            imageView.setImageResource(R.drawable.ic_batt_33_light);
                                        } else if (intExtra < 55) {
                                            imageView.setImageResource(R.drawable.ic_batt_50_light);
                                        } else if (intExtra < 75) {
                                            imageView.setImageResource(R.drawable.ic_batt_66_light);
                                        } else if (intExtra < 90) {
                                            imageView.setImageResource(R.drawable.ic_batt_75_light);
                                        } else {
                                            imageView.setImageResource(R.drawable.ic_batt_100_light);
                                        }
                                    } else if (intExtra < 20) {
                                        imageView.setImageResource(R.drawable.ic_batt_5_dark);
                                    } else if (intExtra < 40) {
                                        imageView.setImageResource(R.drawable.ic_batt_33_dark);
                                    } else if (intExtra < 55) {
                                        imageView.setImageResource(R.drawable.ic_batt_50_dark);
                                    } else if (intExtra < 75) {
                                        imageView.setImageResource(R.drawable.ic_batt_66_dark);
                                    } else if (intExtra < 90) {
                                        imageView.setImageResource(R.drawable.ic_batt_75_dark);
                                    } else {
                                        imageView.setImageResource(R.drawable.ic_batt_100_dark);
                                    }
                                } catch (Exception unused11) {
                                }
                                try {
                                    ((TextView) inflate3.findViewById(R.id.info_title)).setText(p00Var2.A(R.string.battery));
                                } catch (Exception unused12) {
                                }
                                RecyclerView recyclerView = (RecyclerView) inflate3.findViewById(R.id.info_recyclerview);
                                recyclerView.setHasFixedSize(true);
                                p00Var2.i0();
                                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var2, registerReceiver, recyclerView, th2Var2, 0).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused13) {
                                return;
                            }
                        case 10:
                            int i15 = p00.H1;
                            try {
                                th2 th2Var3 = new th2(p00Var.g0());
                                ((j3) th2Var3.h).g = "\n" + p00Var.A(R.string.cpu_na_msg) + "\n";
                                th2Var3.j(p00Var.A(R.string.okay), null);
                                n3 a5 = th2Var3.a();
                                p00Var.q1 = a5;
                                try {
                                    a5.show();
                                    break;
                                } catch (Exception unused14) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            } catch (NullPointerException unused15) {
                                return;
                            }
                        case 11:
                            p00Var.Y0.setRefreshing(true);
                            View inflate4 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var4 = new th2(p00Var.g0());
                                ((j3) th2Var4.h).s = inflate4;
                                th2Var4.h(p00Var.A(R.string.cancel), new c00(p00Var, 8));
                                th2Var4.j(p00Var.A(R.string.settings), new c00(p00Var, 9));
                                NetworkInfo activeNetworkInfo = ((ConnectivityManager) p00Var.i0().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                                boolean z2 = activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
                                ImageView imageView2 = (ImageView) inflate4.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        if (z2) {
                                            imageView2.setImageResource(R.drawable.ic_signal0_light);
                                        } else {
                                            imageView2.setImageResource(R.drawable.ic_wifi_light);
                                        }
                                    } else if (z2) {
                                        imageView2.setImageResource(R.drawable.ic_signal0_dark);
                                    } else {
                                        imageView2.setImageResource(R.drawable.ic_wifi_dark);
                                    }
                                } catch (Exception unused16) {
                                }
                                try {
                                    ((TextView) inflate4.findViewById(R.id.info_title)).setText(p00Var.A(R.string.network));
                                } catch (Exception unused17) {
                                }
                                RecyclerView recyclerView2 = (RecyclerView) inflate4.findViewById(R.id.info_recyclerview);
                                recyclerView2.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                new k00(p00Var, z2, recyclerView2, th2Var4).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused18) {
                                return;
                            }
                            break;
                        case 12:
                            int i16 = p00.H1;
                            try {
                                p00Var.C0();
                                break;
                            } catch (Exception unused19) {
                                return;
                            }
                        case 13:
                            p00Var.Y0.setRefreshing(true);
                            View inflate5 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var5 = new th2(p00Var.g0());
                                ((j3) th2Var5.h).s = inflate5;
                                th2Var5.h(p00Var.A(R.string.cancel), new c00(p00Var, 10));
                                th2Var5.j(p00Var.A(R.string.settings), new c00(p00Var, 11));
                                ImageView imageView3 = (ImageView) inflate5.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView3.setImageResource(R.drawable.ic_storage_light);
                                    } else {
                                        imageView3.setImageResource(R.drawable.ic_storage_dark);
                                    }
                                } catch (Exception unused20) {
                                }
                                try {
                                    ((TextView) inflate5.findViewById(R.id.info_title)).setText(p00Var.A(R.string.storage));
                                } catch (Exception unused21) {
                                }
                                RecyclerView recyclerView3 = (RecyclerView) inflate5.findViewById(R.id.info_recyclerview);
                                recyclerView3.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView3.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView3, th2Var5, i52).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused22) {
                                return;
                            }
                        case 14:
                            p00Var.Y0.setRefreshing(true);
                            View inflate6 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var6 = new th2(p00Var.g0());
                                ((j3) th2Var6.h).s = inflate6;
                                th2Var6.h(p00Var.A(R.string.cancel), new c00(p00Var, 4));
                                th2Var6.j(p00Var.A(R.string.settings), new c00(p00Var, 5));
                                ImageView imageView4 = (ImageView) inflate6.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView4.setImageResource(R.drawable.ic_apps_dark);
                                    } else {
                                        imageView4.setImageResource(R.drawable.ic_apps);
                                    }
                                } catch (Exception unused23) {
                                }
                                try {
                                    ((TextView) inflate6.findViewById(R.id.info_title)).setText(p00Var.A(R.string.installed_apps));
                                } catch (Exception unused24) {
                                }
                                RecyclerView recyclerView4 = (RecyclerView) inflate6.findViewById(R.id.info_recyclerview);
                                recyclerView4.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView4.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView4, th2Var6, 2).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused25) {
                                return;
                            }
                        case 15:
                            p00Var.Y0.setRefreshing(true);
                            View inflate7 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var7 = new th2(p00Var.g0());
                                ((j3) th2Var7.h).s = inflate7;
                                th2Var7.h(p00Var.A(R.string.cancel), new c00(p00Var, 2));
                                int i17 = 3;
                                th2Var7.j(p00Var.A(R.string.settings), new c00(p00Var, 3));
                                ImageView imageView5 = (ImageView) inflate7.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView5.setImageResource(R.drawable.ic_phone_light);
                                    } else {
                                        imageView5.setImageResource(R.drawable.ic_phone);
                                    }
                                } catch (Exception unused26) {
                                }
                                try {
                                    ((TextView) inflate7.findViewById(R.id.info_title)).setText(p00Var.A(R.string.display));
                                } catch (Exception unused27) {
                                }
                                RecyclerView recyclerView5 = (RecyclerView) inflate7.findViewById(R.id.info_recyclerview);
                                recyclerView5.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView5.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView5, th2Var7, i17).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused28) {
                                return;
                            }
                        default:
                            p00 p00Var3 = this.h;
                            p00Var3.Y0.setRefreshing(true);
                            View inflate8 = p00Var3.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var8 = new th2(p00Var3.g0());
                                ((j3) th2Var8.h).s = inflate8;
                                th2Var8.h(p00Var3.A(R.string.cancel), new c00(p00Var3, 6));
                                th2Var8.j(p00Var3.A(R.string.settings), new c00(p00Var3, 7));
                                a61 s = uz1.s(p00Var3.i0(), Build.VERSION.SDK_INT);
                                ImageView imageView6 = (ImageView) inflate8.findViewById(R.id.info_icon);
                                imageView6.setImageTintList(null);
                                imageView6.setImageDrawable((Drawable) s.f11a);
                                try {
                                    ((TextView) inflate8.findViewById(R.id.info_title)).setText(p00Var3.A(R.string.operating_system));
                                } catch (Exception unused29) {
                                }
                                RecyclerView recyclerView6 = (RecyclerView) inflate8.findViewById(R.id.info_recyclerview);
                                recyclerView6.setHasFixedSize(true);
                                p00Var3.i0();
                                recyclerView6.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var3, s, recyclerView6, th2Var8, 1).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused30) {
                                return;
                            }
                    }
                }
            });
            final int i7 = 3;
            ((MaterialCardView) inflate.findViewById(R.id.tests_button)).setOnClickListener(new View.OnClickListener(this) { // from class: a00
                public final /* synthetic */ p00 h;

                {
                    this.h = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i7;
                    int i52 = 1;
                    p00 p00Var = this.h;
                    switch (i42) {
                        case 0:
                            int i62 = p00.H1;
                            try {
                                if (p00Var.n1.contains("64-bit") && !p00Var.e0) {
                                    uz1.q0(p00Var.i0());
                                } else if (p00Var.n1.contains("64-bit")) {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) BenchmarkSuiteActivity.class));
                                } else {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) CPUTimeActivity.class));
                                }
                                break;
                            } catch (Exception unused2) {
                                return;
                            }
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            int i72 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent = new Intent(p00Var.i0(), (Class<?>) BatteryActivity.class);
                                    intent.putExtra("dynamic", i51.b("prefDC"));
                                    intent.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent.putExtra("color", i51.c(6, "prefColor"));
                                    intent.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused3) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            int i8 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) ToolsActivity.class));
                                break;
                            } catch (Exception unused4) {
                                return;
                            }
                        case 3:
                            int i9 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) TestActivity.class));
                                break;
                            } catch (Exception unused5) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                            int i10 = p00.H1;
                            if (!Build.MODEL.equals("A063")) {
                                try {
                                    if (!p00Var.G()) {
                                        break;
                                    } else {
                                        th2 th2Var = new th2(p00Var.g0());
                                        j3 j3Var = (j3) th2Var.h;
                                        View inflate2 = p00Var.w().inflate(R.layout.widget_dialog_view, (ViewGroup) null);
                                        TextView textView = (TextView) inflate2.findViewById(R.id.widget_msg);
                                        j3Var.e = p00Var.A(R.string.widgets) + " BETA";
                                        if (!i51.b("prefHardwareDB").booleanValue()) {
                                            textView.setText(p00Var.A(R.string.widgets_require_pro));
                                        }
                                        j3Var.s = inflate2;
                                        th2Var.j(p00Var.A(R.string.okay), null);
                                        n3 a4 = th2Var.a();
                                        p00Var.q1 = a4;
                                        a4.show();
                                        break;
                                    }
                                } catch (Throwable unused6) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            }
                            break;
                        case 5:
                            int i11 = p00.H1;
                            p00Var.i0();
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused7) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                            int i12 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) TemperatureActivity.class));
                                break;
                            } catch (Exception unused8) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                            int i13 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent2 = new Intent(p00Var.i0(), (Class<?>) MonitorActivity.class);
                                    intent2.putExtra("dynamic", i51.b("prefDC"));
                                    intent2.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent2.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent2.putExtra("color", i51.c(6, "prefColor"));
                                    intent2.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent2);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused9) {
                                return;
                            }
                        case 8:
                            int i14 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused10) {
                                return;
                            }
                        case rt0.o /* 9 */:
                            p00 p00Var2 = this.h;
                            p00Var2.Y0.setRefreshing(true);
                            View inflate3 = p00Var2.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var2 = new th2(p00Var2.g0());
                                ((j3) th2Var2.h).s = inflate3;
                                th2Var2.h(p00Var2.A(R.string.cancel), new c00(p00Var2, 0));
                                th2Var2.j(p00Var2.A(R.string.settings), new c00(p00Var2, 1));
                                Intent registerReceiver = p00Var2.i0().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                ImageView imageView = (ImageView) inflate3.findViewById(R.id.info_icon);
                                try {
                                    int intExtra = (int) ((registerReceiver.getIntExtra("level", -1) * 100.0f) / registerReceiver.getIntExtra("scale", -1));
                                    if (uz1.d(p00Var2.i0())) {
                                        if (intExtra < 20) {
                                            imageView.setImageResource(R.drawable.ic_batt_5_light);
                                        } else if (intExtra < 40) {
                                            imageView.setImageResource(R.drawable.ic_batt_33_light);
                                        } else if (intExtra < 55) {
                                            imageView.setImageResource(R.drawable.ic_batt_50_light);
                                        } else if (intExtra < 75) {
                                            imageView.setImageResource(R.drawable.ic_batt_66_light);
                                        } else if (intExtra < 90) {
                                            imageView.setImageResource(R.drawable.ic_batt_75_light);
                                        } else {
                                            imageView.setImageResource(R.drawable.ic_batt_100_light);
                                        }
                                    } else if (intExtra < 20) {
                                        imageView.setImageResource(R.drawable.ic_batt_5_dark);
                                    } else if (intExtra < 40) {
                                        imageView.setImageResource(R.drawable.ic_batt_33_dark);
                                    } else if (intExtra < 55) {
                                        imageView.setImageResource(R.drawable.ic_batt_50_dark);
                                    } else if (intExtra < 75) {
                                        imageView.setImageResource(R.drawable.ic_batt_66_dark);
                                    } else if (intExtra < 90) {
                                        imageView.setImageResource(R.drawable.ic_batt_75_dark);
                                    } else {
                                        imageView.setImageResource(R.drawable.ic_batt_100_dark);
                                    }
                                } catch (Exception unused11) {
                                }
                                try {
                                    ((TextView) inflate3.findViewById(R.id.info_title)).setText(p00Var2.A(R.string.battery));
                                } catch (Exception unused12) {
                                }
                                RecyclerView recyclerView = (RecyclerView) inflate3.findViewById(R.id.info_recyclerview);
                                recyclerView.setHasFixedSize(true);
                                p00Var2.i0();
                                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var2, registerReceiver, recyclerView, th2Var2, 0).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused13) {
                                return;
                            }
                        case 10:
                            int i15 = p00.H1;
                            try {
                                th2 th2Var3 = new th2(p00Var.g0());
                                ((j3) th2Var3.h).g = "\n" + p00Var.A(R.string.cpu_na_msg) + "\n";
                                th2Var3.j(p00Var.A(R.string.okay), null);
                                n3 a5 = th2Var3.a();
                                p00Var.q1 = a5;
                                try {
                                    a5.show();
                                    break;
                                } catch (Exception unused14) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            } catch (NullPointerException unused15) {
                                return;
                            }
                        case 11:
                            p00Var.Y0.setRefreshing(true);
                            View inflate4 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var4 = new th2(p00Var.g0());
                                ((j3) th2Var4.h).s = inflate4;
                                th2Var4.h(p00Var.A(R.string.cancel), new c00(p00Var, 8));
                                th2Var4.j(p00Var.A(R.string.settings), new c00(p00Var, 9));
                                NetworkInfo activeNetworkInfo = ((ConnectivityManager) p00Var.i0().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                                boolean z2 = activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
                                ImageView imageView2 = (ImageView) inflate4.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        if (z2) {
                                            imageView2.setImageResource(R.drawable.ic_signal0_light);
                                        } else {
                                            imageView2.setImageResource(R.drawable.ic_wifi_light);
                                        }
                                    } else if (z2) {
                                        imageView2.setImageResource(R.drawable.ic_signal0_dark);
                                    } else {
                                        imageView2.setImageResource(R.drawable.ic_wifi_dark);
                                    }
                                } catch (Exception unused16) {
                                }
                                try {
                                    ((TextView) inflate4.findViewById(R.id.info_title)).setText(p00Var.A(R.string.network));
                                } catch (Exception unused17) {
                                }
                                RecyclerView recyclerView2 = (RecyclerView) inflate4.findViewById(R.id.info_recyclerview);
                                recyclerView2.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                new k00(p00Var, z2, recyclerView2, th2Var4).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused18) {
                                return;
                            }
                            break;
                        case 12:
                            int i16 = p00.H1;
                            try {
                                p00Var.C0();
                                break;
                            } catch (Exception unused19) {
                                return;
                            }
                        case 13:
                            p00Var.Y0.setRefreshing(true);
                            View inflate5 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var5 = new th2(p00Var.g0());
                                ((j3) th2Var5.h).s = inflate5;
                                th2Var5.h(p00Var.A(R.string.cancel), new c00(p00Var, 10));
                                th2Var5.j(p00Var.A(R.string.settings), new c00(p00Var, 11));
                                ImageView imageView3 = (ImageView) inflate5.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView3.setImageResource(R.drawable.ic_storage_light);
                                    } else {
                                        imageView3.setImageResource(R.drawable.ic_storage_dark);
                                    }
                                } catch (Exception unused20) {
                                }
                                try {
                                    ((TextView) inflate5.findViewById(R.id.info_title)).setText(p00Var.A(R.string.storage));
                                } catch (Exception unused21) {
                                }
                                RecyclerView recyclerView3 = (RecyclerView) inflate5.findViewById(R.id.info_recyclerview);
                                recyclerView3.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView3.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView3, th2Var5, i52).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused22) {
                                return;
                            }
                        case 14:
                            p00Var.Y0.setRefreshing(true);
                            View inflate6 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var6 = new th2(p00Var.g0());
                                ((j3) th2Var6.h).s = inflate6;
                                th2Var6.h(p00Var.A(R.string.cancel), new c00(p00Var, 4));
                                th2Var6.j(p00Var.A(R.string.settings), new c00(p00Var, 5));
                                ImageView imageView4 = (ImageView) inflate6.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView4.setImageResource(R.drawable.ic_apps_dark);
                                    } else {
                                        imageView4.setImageResource(R.drawable.ic_apps);
                                    }
                                } catch (Exception unused23) {
                                }
                                try {
                                    ((TextView) inflate6.findViewById(R.id.info_title)).setText(p00Var.A(R.string.installed_apps));
                                } catch (Exception unused24) {
                                }
                                RecyclerView recyclerView4 = (RecyclerView) inflate6.findViewById(R.id.info_recyclerview);
                                recyclerView4.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView4.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView4, th2Var6, 2).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused25) {
                                return;
                            }
                        case 15:
                            p00Var.Y0.setRefreshing(true);
                            View inflate7 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var7 = new th2(p00Var.g0());
                                ((j3) th2Var7.h).s = inflate7;
                                th2Var7.h(p00Var.A(R.string.cancel), new c00(p00Var, 2));
                                int i17 = 3;
                                th2Var7.j(p00Var.A(R.string.settings), new c00(p00Var, 3));
                                ImageView imageView5 = (ImageView) inflate7.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView5.setImageResource(R.drawable.ic_phone_light);
                                    } else {
                                        imageView5.setImageResource(R.drawable.ic_phone);
                                    }
                                } catch (Exception unused26) {
                                }
                                try {
                                    ((TextView) inflate7.findViewById(R.id.info_title)).setText(p00Var.A(R.string.display));
                                } catch (Exception unused27) {
                                }
                                RecyclerView recyclerView5 = (RecyclerView) inflate7.findViewById(R.id.info_recyclerview);
                                recyclerView5.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView5.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView5, th2Var7, i17).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused28) {
                                return;
                            }
                        default:
                            p00 p00Var3 = this.h;
                            p00Var3.Y0.setRefreshing(true);
                            View inflate8 = p00Var3.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var8 = new th2(p00Var3.g0());
                                ((j3) th2Var8.h).s = inflate8;
                                th2Var8.h(p00Var3.A(R.string.cancel), new c00(p00Var3, 6));
                                th2Var8.j(p00Var3.A(R.string.settings), new c00(p00Var3, 7));
                                a61 s = uz1.s(p00Var3.i0(), Build.VERSION.SDK_INT);
                                ImageView imageView6 = (ImageView) inflate8.findViewById(R.id.info_icon);
                                imageView6.setImageTintList(null);
                                imageView6.setImageDrawable((Drawable) s.f11a);
                                try {
                                    ((TextView) inflate8.findViewById(R.id.info_title)).setText(p00Var3.A(R.string.operating_system));
                                } catch (Exception unused29) {
                                }
                                RecyclerView recyclerView6 = (RecyclerView) inflate8.findViewById(R.id.info_recyclerview);
                                recyclerView6.setHasFixedSize(true);
                                p00Var3.i0();
                                recyclerView6.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var3, s, recyclerView6, th2Var8, 1).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused30) {
                                return;
                            }
                    }
                }
            });
            final int i8 = 4;
            ((MaterialCardView) inflate.findViewById(R.id.widgets_button)).setOnClickListener(new View.OnClickListener(this) { // from class: a00
                public final /* synthetic */ p00 h;

                {
                    this.h = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i8;
                    int i52 = 1;
                    p00 p00Var = this.h;
                    switch (i42) {
                        case 0:
                            int i62 = p00.H1;
                            try {
                                if (p00Var.n1.contains("64-bit") && !p00Var.e0) {
                                    uz1.q0(p00Var.i0());
                                } else if (p00Var.n1.contains("64-bit")) {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) BenchmarkSuiteActivity.class));
                                } else {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) CPUTimeActivity.class));
                                }
                                break;
                            } catch (Exception unused2) {
                                return;
                            }
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            int i72 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent = new Intent(p00Var.i0(), (Class<?>) BatteryActivity.class);
                                    intent.putExtra("dynamic", i51.b("prefDC"));
                                    intent.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent.putExtra("color", i51.c(6, "prefColor"));
                                    intent.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused3) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            int i82 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) ToolsActivity.class));
                                break;
                            } catch (Exception unused4) {
                                return;
                            }
                        case 3:
                            int i9 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) TestActivity.class));
                                break;
                            } catch (Exception unused5) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                            int i10 = p00.H1;
                            if (!Build.MODEL.equals("A063")) {
                                try {
                                    if (!p00Var.G()) {
                                        break;
                                    } else {
                                        th2 th2Var = new th2(p00Var.g0());
                                        j3 j3Var = (j3) th2Var.h;
                                        View inflate2 = p00Var.w().inflate(R.layout.widget_dialog_view, (ViewGroup) null);
                                        TextView textView = (TextView) inflate2.findViewById(R.id.widget_msg);
                                        j3Var.e = p00Var.A(R.string.widgets) + " BETA";
                                        if (!i51.b("prefHardwareDB").booleanValue()) {
                                            textView.setText(p00Var.A(R.string.widgets_require_pro));
                                        }
                                        j3Var.s = inflate2;
                                        th2Var.j(p00Var.A(R.string.okay), null);
                                        n3 a4 = th2Var.a();
                                        p00Var.q1 = a4;
                                        a4.show();
                                        break;
                                    }
                                } catch (Throwable unused6) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            }
                            break;
                        case 5:
                            int i11 = p00.H1;
                            p00Var.i0();
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused7) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                            int i12 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) TemperatureActivity.class));
                                break;
                            } catch (Exception unused8) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                            int i13 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent2 = new Intent(p00Var.i0(), (Class<?>) MonitorActivity.class);
                                    intent2.putExtra("dynamic", i51.b("prefDC"));
                                    intent2.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent2.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent2.putExtra("color", i51.c(6, "prefColor"));
                                    intent2.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent2);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused9) {
                                return;
                            }
                        case 8:
                            int i14 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused10) {
                                return;
                            }
                        case rt0.o /* 9 */:
                            p00 p00Var2 = this.h;
                            p00Var2.Y0.setRefreshing(true);
                            View inflate3 = p00Var2.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var2 = new th2(p00Var2.g0());
                                ((j3) th2Var2.h).s = inflate3;
                                th2Var2.h(p00Var2.A(R.string.cancel), new c00(p00Var2, 0));
                                th2Var2.j(p00Var2.A(R.string.settings), new c00(p00Var2, 1));
                                Intent registerReceiver = p00Var2.i0().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                ImageView imageView = (ImageView) inflate3.findViewById(R.id.info_icon);
                                try {
                                    int intExtra = (int) ((registerReceiver.getIntExtra("level", -1) * 100.0f) / registerReceiver.getIntExtra("scale", -1));
                                    if (uz1.d(p00Var2.i0())) {
                                        if (intExtra < 20) {
                                            imageView.setImageResource(R.drawable.ic_batt_5_light);
                                        } else if (intExtra < 40) {
                                            imageView.setImageResource(R.drawable.ic_batt_33_light);
                                        } else if (intExtra < 55) {
                                            imageView.setImageResource(R.drawable.ic_batt_50_light);
                                        } else if (intExtra < 75) {
                                            imageView.setImageResource(R.drawable.ic_batt_66_light);
                                        } else if (intExtra < 90) {
                                            imageView.setImageResource(R.drawable.ic_batt_75_light);
                                        } else {
                                            imageView.setImageResource(R.drawable.ic_batt_100_light);
                                        }
                                    } else if (intExtra < 20) {
                                        imageView.setImageResource(R.drawable.ic_batt_5_dark);
                                    } else if (intExtra < 40) {
                                        imageView.setImageResource(R.drawable.ic_batt_33_dark);
                                    } else if (intExtra < 55) {
                                        imageView.setImageResource(R.drawable.ic_batt_50_dark);
                                    } else if (intExtra < 75) {
                                        imageView.setImageResource(R.drawable.ic_batt_66_dark);
                                    } else if (intExtra < 90) {
                                        imageView.setImageResource(R.drawable.ic_batt_75_dark);
                                    } else {
                                        imageView.setImageResource(R.drawable.ic_batt_100_dark);
                                    }
                                } catch (Exception unused11) {
                                }
                                try {
                                    ((TextView) inflate3.findViewById(R.id.info_title)).setText(p00Var2.A(R.string.battery));
                                } catch (Exception unused12) {
                                }
                                RecyclerView recyclerView = (RecyclerView) inflate3.findViewById(R.id.info_recyclerview);
                                recyclerView.setHasFixedSize(true);
                                p00Var2.i0();
                                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var2, registerReceiver, recyclerView, th2Var2, 0).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused13) {
                                return;
                            }
                        case 10:
                            int i15 = p00.H1;
                            try {
                                th2 th2Var3 = new th2(p00Var.g0());
                                ((j3) th2Var3.h).g = "\n" + p00Var.A(R.string.cpu_na_msg) + "\n";
                                th2Var3.j(p00Var.A(R.string.okay), null);
                                n3 a5 = th2Var3.a();
                                p00Var.q1 = a5;
                                try {
                                    a5.show();
                                    break;
                                } catch (Exception unused14) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            } catch (NullPointerException unused15) {
                                return;
                            }
                        case 11:
                            p00Var.Y0.setRefreshing(true);
                            View inflate4 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var4 = new th2(p00Var.g0());
                                ((j3) th2Var4.h).s = inflate4;
                                th2Var4.h(p00Var.A(R.string.cancel), new c00(p00Var, 8));
                                th2Var4.j(p00Var.A(R.string.settings), new c00(p00Var, 9));
                                NetworkInfo activeNetworkInfo = ((ConnectivityManager) p00Var.i0().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                                boolean z2 = activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
                                ImageView imageView2 = (ImageView) inflate4.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        if (z2) {
                                            imageView2.setImageResource(R.drawable.ic_signal0_light);
                                        } else {
                                            imageView2.setImageResource(R.drawable.ic_wifi_light);
                                        }
                                    } else if (z2) {
                                        imageView2.setImageResource(R.drawable.ic_signal0_dark);
                                    } else {
                                        imageView2.setImageResource(R.drawable.ic_wifi_dark);
                                    }
                                } catch (Exception unused16) {
                                }
                                try {
                                    ((TextView) inflate4.findViewById(R.id.info_title)).setText(p00Var.A(R.string.network));
                                } catch (Exception unused17) {
                                }
                                RecyclerView recyclerView2 = (RecyclerView) inflate4.findViewById(R.id.info_recyclerview);
                                recyclerView2.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                new k00(p00Var, z2, recyclerView2, th2Var4).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused18) {
                                return;
                            }
                            break;
                        case 12:
                            int i16 = p00.H1;
                            try {
                                p00Var.C0();
                                break;
                            } catch (Exception unused19) {
                                return;
                            }
                        case 13:
                            p00Var.Y0.setRefreshing(true);
                            View inflate5 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var5 = new th2(p00Var.g0());
                                ((j3) th2Var5.h).s = inflate5;
                                th2Var5.h(p00Var.A(R.string.cancel), new c00(p00Var, 10));
                                th2Var5.j(p00Var.A(R.string.settings), new c00(p00Var, 11));
                                ImageView imageView3 = (ImageView) inflate5.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView3.setImageResource(R.drawable.ic_storage_light);
                                    } else {
                                        imageView3.setImageResource(R.drawable.ic_storage_dark);
                                    }
                                } catch (Exception unused20) {
                                }
                                try {
                                    ((TextView) inflate5.findViewById(R.id.info_title)).setText(p00Var.A(R.string.storage));
                                } catch (Exception unused21) {
                                }
                                RecyclerView recyclerView3 = (RecyclerView) inflate5.findViewById(R.id.info_recyclerview);
                                recyclerView3.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView3.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView3, th2Var5, i52).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused22) {
                                return;
                            }
                        case 14:
                            p00Var.Y0.setRefreshing(true);
                            View inflate6 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var6 = new th2(p00Var.g0());
                                ((j3) th2Var6.h).s = inflate6;
                                th2Var6.h(p00Var.A(R.string.cancel), new c00(p00Var, 4));
                                th2Var6.j(p00Var.A(R.string.settings), new c00(p00Var, 5));
                                ImageView imageView4 = (ImageView) inflate6.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView4.setImageResource(R.drawable.ic_apps_dark);
                                    } else {
                                        imageView4.setImageResource(R.drawable.ic_apps);
                                    }
                                } catch (Exception unused23) {
                                }
                                try {
                                    ((TextView) inflate6.findViewById(R.id.info_title)).setText(p00Var.A(R.string.installed_apps));
                                } catch (Exception unused24) {
                                }
                                RecyclerView recyclerView4 = (RecyclerView) inflate6.findViewById(R.id.info_recyclerview);
                                recyclerView4.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView4.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView4, th2Var6, 2).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused25) {
                                return;
                            }
                        case 15:
                            p00Var.Y0.setRefreshing(true);
                            View inflate7 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var7 = new th2(p00Var.g0());
                                ((j3) th2Var7.h).s = inflate7;
                                th2Var7.h(p00Var.A(R.string.cancel), new c00(p00Var, 2));
                                int i17 = 3;
                                th2Var7.j(p00Var.A(R.string.settings), new c00(p00Var, 3));
                                ImageView imageView5 = (ImageView) inflate7.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView5.setImageResource(R.drawable.ic_phone_light);
                                    } else {
                                        imageView5.setImageResource(R.drawable.ic_phone);
                                    }
                                } catch (Exception unused26) {
                                }
                                try {
                                    ((TextView) inflate7.findViewById(R.id.info_title)).setText(p00Var.A(R.string.display));
                                } catch (Exception unused27) {
                                }
                                RecyclerView recyclerView5 = (RecyclerView) inflate7.findViewById(R.id.info_recyclerview);
                                recyclerView5.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView5.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView5, th2Var7, i17).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused28) {
                                return;
                            }
                        default:
                            p00 p00Var3 = this.h;
                            p00Var3.Y0.setRefreshing(true);
                            View inflate8 = p00Var3.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var8 = new th2(p00Var3.g0());
                                ((j3) th2Var8.h).s = inflate8;
                                th2Var8.h(p00Var3.A(R.string.cancel), new c00(p00Var3, 6));
                                th2Var8.j(p00Var3.A(R.string.settings), new c00(p00Var3, 7));
                                a61 s = uz1.s(p00Var3.i0(), Build.VERSION.SDK_INT);
                                ImageView imageView6 = (ImageView) inflate8.findViewById(R.id.info_icon);
                                imageView6.setImageTintList(null);
                                imageView6.setImageDrawable((Drawable) s.f11a);
                                try {
                                    ((TextView) inflate8.findViewById(R.id.info_title)).setText(p00Var3.A(R.string.operating_system));
                                } catch (Exception unused29) {
                                }
                                RecyclerView recyclerView6 = (RecyclerView) inflate8.findViewById(R.id.info_recyclerview);
                                recyclerView6.setHasFixedSize(true);
                                p00Var3.i0();
                                recyclerView6.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var3, s, recyclerView6, th2Var8, 1).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused30) {
                                return;
                            }
                    }
                }
            });
            try {
                grVar = new gr(l(), new rj((pj) ((MainApp) g0().getApplication()).g.g, 0), h());
                a3 = af1.a(sj.class);
                b = a3.b();
            } catch (NullPointerException unused2) {
            }
            if (b == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.d0 = (sj) grVar.t(a3, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
            sj sjVar = this.d0;
            if (sjVar != null) {
                final int i9 = 0;
                sjVar.c().e(D(), new v31(this) { // from class: b00
                    public final /* synthetic */ p00 b;

                    {
                        this.b = this;
                    }

                    @Override // defpackage.v31
                    public final void a(Object obj) {
                        int i10 = i9;
                        p00 p00Var = this.b;
                        switch (i10) {
                            case 0:
                                int i11 = p00.H1;
                                p00Var.e0 = ((Boolean) obj).booleanValue();
                                break;
                            default:
                                int i12 = p00.H1;
                                try {
                                    String A = uz1.A(true);
                                    if (A != null && !A.isEmpty()) {
                                        p00Var.y0.setText(A, TextView.BufferType.NORMAL);
                                    }
                                    String e2 = i51.e("prefProcessor");
                                    if (e2 != null && !e2.isEmpty()) {
                                        p00Var.A0.setText(e2, TextView.BufferType.NORMAL);
                                        break;
                                    }
                                } catch (Exception unused3) {
                                    return;
                                }
                                break;
                        }
                    }
                });
            }
            this.f0 = (TextView) inflate.findViewById(R.id.sys_temp);
            this.g0 = (TextView) inflate.findViewById(R.id.cpu_temp);
            this.i0 = (TextView) inflate.findViewById(R.id.cpu0_freq);
            this.j0 = (TextView) inflate.findViewById(R.id.cpu1_freq);
            this.k0 = (TextView) inflate.findViewById(R.id.cpu2_freq);
            this.l0 = (TextView) inflate.findViewById(R.id.cpu3_freq);
            this.m0 = (TextView) inflate.findViewById(R.id.cpu4_freq);
            this.n0 = (TextView) inflate.findViewById(R.id.cpu5_freq);
            this.o0 = (TextView) inflate.findViewById(R.id.cpu6_freq);
            this.p0 = (TextView) inflate.findViewById(R.id.cpu7_freq);
            this.q0 = (TextView) inflate.findViewById(R.id.cpu8_freq);
            this.r0 = (TextView) inflate.findViewById(R.id.cpu9_freq);
            this.s0 = (TextView) inflate.findViewById(R.id.cpu10_freq);
            this.t0 = (TextView) inflate.findViewById(R.id.cpu11_freq);
            this.u0 = (TextView) inflate.findViewById(R.id.gpu_freq);
            this.v0 = (TextView) inflate.findViewById(R.id.cpu_load);
            this.w0 = (TextView) inflate.findViewById(R.id.uptime);
            this.x0 = (TextView) inflate.findViewById(R.id.deepsleep);
            CircleProgressView circleProgressView = (CircleProgressView) inflate.findViewById(R.id.memCircleView);
            this.B0 = circleProgressView;
            circleProgressView.setRimColor(e);
            this.C0 = (TextView) inflate.findViewById(R.id.mem_used);
            this.D0 = (TextView) inflate.findViewById(R.id.mem_total);
            this.E0 = (TextView) inflate.findViewById(R.id.mem_percent);
            m00 y0 = y0(i0());
            y0.setTextColor(this.E0.getTextColors().getDefaultColor());
            y0.setTypeface(this.E0.getTypeface(), 1);
            y0.setSingleLine(true);
            y0.setTextSize(0, this.E0.getTextSize());
            B0(this.E0, y0);
            this.E0 = y0;
            m00 y02 = y0(i0());
            y02.setTextColor(this.D0.getTextColors().getDefaultColor());
            y02.setTextSize(0, z().getDimension(R.dimen.dashboard_small_font_size));
            y02.setTypeface(this.D0.getTypeface());
            y02.setSingleLine(true);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            y02.setEllipsize(truncateAt);
            B0(this.D0, y02);
            this.D0 = y02;
            m00 y03 = y0(i0());
            y03.setTextColor(this.C0.getTextColors().getDefaultColor());
            y03.setTextSize(0, z().getDimension(R.dimen.dashboard_small_font_size));
            y03.setTypeface(this.C0.getTypeface());
            y03.setSingleLine(true);
            y03.setEllipsize(truncateAt);
            B0(this.C0, y03);
            this.C0 = y03;
            CircleProgressView circleProgressView2 = (CircleProgressView) inflate.findViewById(R.id.storageCircleView);
            this.F0 = circleProgressView2;
            circleProgressView2.setRimColor(e);
            this.G0 = (TextView) inflate.findViewById(R.id.storage_total);
            this.H0 = (TextView) inflate.findViewById(R.id.storage_used);
            this.I0 = (TextView) inflate.findViewById(R.id.storage_percent);
            m00 y04 = y0(i0());
            y04.setTextColor(this.I0.getTextColors().getDefaultColor());
            y04.setTypeface(this.I0.getTypeface(), 1);
            y04.setSingleLine(true);
            y04.setPadding(this.I0.getPaddingLeft(), this.I0.getPaddingTop(), this.I0.getPaddingRight(), this.I0.getPaddingBottom());
            y04.setTextSize(0, this.I0.getTextSize());
            B0(this.I0, y04);
            this.I0 = y04;
            m00 y05 = y0(i0());
            y05.setTextColor(this.G0.getTextColors().getDefaultColor());
            y05.setTextSize(0, z().getDimension(R.dimen.dashboard_small_font_size));
            y05.setTypeface(this.G0.getTypeface());
            y05.setSingleLine(true);
            y05.setEllipsize(truncateAt);
            B0(this.G0, y05);
            this.G0 = y05;
            m00 y06 = y0(i0());
            y06.setTextColor(this.H0.getTextColors().getDefaultColor());
            y06.setTextSize(0, z().getDimension(R.dimen.dashboard_small_font_size));
            y06.setTypeface(this.H0.getTypeface());
            y06.setSingleLine(true);
            y06.setEllipsize(truncateAt);
            B0(this.H0, y06);
            this.H0 = y06;
            this.J0 = (TextView) inflate.findViewById(R.id.apps_count);
            this.K0 = (TextView) inflate.findViewById(R.id.apps_user);
            this.L0 = (TextView) inflate.findViewById(R.id.apps_system);
            this.M0 = (TextView) inflate.findViewById(R.id.display_gpu);
            this.N0 = (TextView) inflate.findViewById(R.id.display_resolution);
            m00 y07 = y0(i0());
            try {
                y07.setLayoutParams(this.N0.getLayoutParams());
            } catch (Exception unused3) {
            }
            y07.setTextColor(this.N0.getTextColors().getDefaultColor());
            y07.setTextSize(0, z().getDimension(R.dimen.dashboard_small_font_size));
            y07.setTypeface(this.N0.getTypeface());
            y07.setSingleLine(true);
            TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
            y07.setEllipsize(truncateAt2);
            B0(this.N0, y07);
            this.N0 = y07;
            this.O0 = (ImageView) inflate.findViewById(R.id.net_image);
            this.P0 = (TextView) inflate.findViewById(R.id.net_up);
            this.Q0 = (TextView) inflate.findViewById(R.id.net_new);
            this.R0 = (TextView) inflate.findViewById(R.id.net_down);
            this.S0 = (ImageView) inflate.findViewById(R.id.bat_image);
            this.T0 = (TextView) inflate.findViewById(R.id.bat_temp);
            this.U0 = (TextView) inflate.findViewById(R.id.bat_level);
            this.V0 = (TextView) inflate.findViewById(R.id.bat_status);
            this.W0 = (TextView) inflate.findViewById(R.id.bat_new);
            this.X0 = (ImageView) inflate.findViewById(R.id.cpu_info);
            Drawable drawable = i0().getDrawable(R.drawable.ic_cpu_info);
            if (uz1.d(i0())) {
                drawable.setTintList(null);
            } else {
                drawable.setTint(i0().getColor(android.R.color.white));
            }
            this.A1 = new Handler();
            View findViewById = inflate.findViewById(R.id.dashboard_cpufreqs);
            this.a1 = findViewById;
            final int i10 = 5;
            findViewById.setOnClickListener(new View.OnClickListener(this) { // from class: a00
                public final /* synthetic */ p00 h;

                {
                    this.h = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i10;
                    int i52 = 1;
                    p00 p00Var = this.h;
                    switch (i42) {
                        case 0:
                            int i62 = p00.H1;
                            try {
                                if (p00Var.n1.contains("64-bit") && !p00Var.e0) {
                                    uz1.q0(p00Var.i0());
                                } else if (p00Var.n1.contains("64-bit")) {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) BenchmarkSuiteActivity.class));
                                } else {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) CPUTimeActivity.class));
                                }
                                break;
                            } catch (Exception unused22) {
                                return;
                            }
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            int i72 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent = new Intent(p00Var.i0(), (Class<?>) BatteryActivity.class);
                                    intent.putExtra("dynamic", i51.b("prefDC"));
                                    intent.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent.putExtra("color", i51.c(6, "prefColor"));
                                    intent.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused32) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            int i82 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) ToolsActivity.class));
                                break;
                            } catch (Exception unused4) {
                                return;
                            }
                        case 3:
                            int i92 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) TestActivity.class));
                                break;
                            } catch (Exception unused5) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                            int i102 = p00.H1;
                            if (!Build.MODEL.equals("A063")) {
                                try {
                                    if (!p00Var.G()) {
                                        break;
                                    } else {
                                        th2 th2Var = new th2(p00Var.g0());
                                        j3 j3Var = (j3) th2Var.h;
                                        View inflate2 = p00Var.w().inflate(R.layout.widget_dialog_view, (ViewGroup) null);
                                        TextView textView = (TextView) inflate2.findViewById(R.id.widget_msg);
                                        j3Var.e = p00Var.A(R.string.widgets) + " BETA";
                                        if (!i51.b("prefHardwareDB").booleanValue()) {
                                            textView.setText(p00Var.A(R.string.widgets_require_pro));
                                        }
                                        j3Var.s = inflate2;
                                        th2Var.j(p00Var.A(R.string.okay), null);
                                        n3 a4 = th2Var.a();
                                        p00Var.q1 = a4;
                                        a4.show();
                                        break;
                                    }
                                } catch (Throwable unused6) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            }
                            break;
                        case 5:
                            int i11 = p00.H1;
                            p00Var.i0();
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused7) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                            int i12 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) TemperatureActivity.class));
                                break;
                            } catch (Exception unused8) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                            int i13 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent2 = new Intent(p00Var.i0(), (Class<?>) MonitorActivity.class);
                                    intent2.putExtra("dynamic", i51.b("prefDC"));
                                    intent2.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent2.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent2.putExtra("color", i51.c(6, "prefColor"));
                                    intent2.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent2);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused9) {
                                return;
                            }
                        case 8:
                            int i14 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused10) {
                                return;
                            }
                        case rt0.o /* 9 */:
                            p00 p00Var2 = this.h;
                            p00Var2.Y0.setRefreshing(true);
                            View inflate3 = p00Var2.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var2 = new th2(p00Var2.g0());
                                ((j3) th2Var2.h).s = inflate3;
                                th2Var2.h(p00Var2.A(R.string.cancel), new c00(p00Var2, 0));
                                th2Var2.j(p00Var2.A(R.string.settings), new c00(p00Var2, 1));
                                Intent registerReceiver = p00Var2.i0().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                ImageView imageView = (ImageView) inflate3.findViewById(R.id.info_icon);
                                try {
                                    int intExtra = (int) ((registerReceiver.getIntExtra("level", -1) * 100.0f) / registerReceiver.getIntExtra("scale", -1));
                                    if (uz1.d(p00Var2.i0())) {
                                        if (intExtra < 20) {
                                            imageView.setImageResource(R.drawable.ic_batt_5_light);
                                        } else if (intExtra < 40) {
                                            imageView.setImageResource(R.drawable.ic_batt_33_light);
                                        } else if (intExtra < 55) {
                                            imageView.setImageResource(R.drawable.ic_batt_50_light);
                                        } else if (intExtra < 75) {
                                            imageView.setImageResource(R.drawable.ic_batt_66_light);
                                        } else if (intExtra < 90) {
                                            imageView.setImageResource(R.drawable.ic_batt_75_light);
                                        } else {
                                            imageView.setImageResource(R.drawable.ic_batt_100_light);
                                        }
                                    } else if (intExtra < 20) {
                                        imageView.setImageResource(R.drawable.ic_batt_5_dark);
                                    } else if (intExtra < 40) {
                                        imageView.setImageResource(R.drawable.ic_batt_33_dark);
                                    } else if (intExtra < 55) {
                                        imageView.setImageResource(R.drawable.ic_batt_50_dark);
                                    } else if (intExtra < 75) {
                                        imageView.setImageResource(R.drawable.ic_batt_66_dark);
                                    } else if (intExtra < 90) {
                                        imageView.setImageResource(R.drawable.ic_batt_75_dark);
                                    } else {
                                        imageView.setImageResource(R.drawable.ic_batt_100_dark);
                                    }
                                } catch (Exception unused11) {
                                }
                                try {
                                    ((TextView) inflate3.findViewById(R.id.info_title)).setText(p00Var2.A(R.string.battery));
                                } catch (Exception unused12) {
                                }
                                RecyclerView recyclerView = (RecyclerView) inflate3.findViewById(R.id.info_recyclerview);
                                recyclerView.setHasFixedSize(true);
                                p00Var2.i0();
                                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var2, registerReceiver, recyclerView, th2Var2, 0).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused13) {
                                return;
                            }
                        case 10:
                            int i15 = p00.H1;
                            try {
                                th2 th2Var3 = new th2(p00Var.g0());
                                ((j3) th2Var3.h).g = "\n" + p00Var.A(R.string.cpu_na_msg) + "\n";
                                th2Var3.j(p00Var.A(R.string.okay), null);
                                n3 a5 = th2Var3.a();
                                p00Var.q1 = a5;
                                try {
                                    a5.show();
                                    break;
                                } catch (Exception unused14) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            } catch (NullPointerException unused15) {
                                return;
                            }
                        case 11:
                            p00Var.Y0.setRefreshing(true);
                            View inflate4 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var4 = new th2(p00Var.g0());
                                ((j3) th2Var4.h).s = inflate4;
                                th2Var4.h(p00Var.A(R.string.cancel), new c00(p00Var, 8));
                                th2Var4.j(p00Var.A(R.string.settings), new c00(p00Var, 9));
                                NetworkInfo activeNetworkInfo = ((ConnectivityManager) p00Var.i0().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                                boolean z2 = activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
                                ImageView imageView2 = (ImageView) inflate4.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        if (z2) {
                                            imageView2.setImageResource(R.drawable.ic_signal0_light);
                                        } else {
                                            imageView2.setImageResource(R.drawable.ic_wifi_light);
                                        }
                                    } else if (z2) {
                                        imageView2.setImageResource(R.drawable.ic_signal0_dark);
                                    } else {
                                        imageView2.setImageResource(R.drawable.ic_wifi_dark);
                                    }
                                } catch (Exception unused16) {
                                }
                                try {
                                    ((TextView) inflate4.findViewById(R.id.info_title)).setText(p00Var.A(R.string.network));
                                } catch (Exception unused17) {
                                }
                                RecyclerView recyclerView2 = (RecyclerView) inflate4.findViewById(R.id.info_recyclerview);
                                recyclerView2.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                new k00(p00Var, z2, recyclerView2, th2Var4).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused18) {
                                return;
                            }
                            break;
                        case 12:
                            int i16 = p00.H1;
                            try {
                                p00Var.C0();
                                break;
                            } catch (Exception unused19) {
                                return;
                            }
                        case 13:
                            p00Var.Y0.setRefreshing(true);
                            View inflate5 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var5 = new th2(p00Var.g0());
                                ((j3) th2Var5.h).s = inflate5;
                                th2Var5.h(p00Var.A(R.string.cancel), new c00(p00Var, 10));
                                th2Var5.j(p00Var.A(R.string.settings), new c00(p00Var, 11));
                                ImageView imageView3 = (ImageView) inflate5.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView3.setImageResource(R.drawable.ic_storage_light);
                                    } else {
                                        imageView3.setImageResource(R.drawable.ic_storage_dark);
                                    }
                                } catch (Exception unused20) {
                                }
                                try {
                                    ((TextView) inflate5.findViewById(R.id.info_title)).setText(p00Var.A(R.string.storage));
                                } catch (Exception unused21) {
                                }
                                RecyclerView recyclerView3 = (RecyclerView) inflate5.findViewById(R.id.info_recyclerview);
                                recyclerView3.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView3.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView3, th2Var5, i52).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused222) {
                                return;
                            }
                        case 14:
                            p00Var.Y0.setRefreshing(true);
                            View inflate6 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var6 = new th2(p00Var.g0());
                                ((j3) th2Var6.h).s = inflate6;
                                th2Var6.h(p00Var.A(R.string.cancel), new c00(p00Var, 4));
                                th2Var6.j(p00Var.A(R.string.settings), new c00(p00Var, 5));
                                ImageView imageView4 = (ImageView) inflate6.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView4.setImageResource(R.drawable.ic_apps_dark);
                                    } else {
                                        imageView4.setImageResource(R.drawable.ic_apps);
                                    }
                                } catch (Exception unused23) {
                                }
                                try {
                                    ((TextView) inflate6.findViewById(R.id.info_title)).setText(p00Var.A(R.string.installed_apps));
                                } catch (Exception unused24) {
                                }
                                RecyclerView recyclerView4 = (RecyclerView) inflate6.findViewById(R.id.info_recyclerview);
                                recyclerView4.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView4.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView4, th2Var6, 2).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused25) {
                                return;
                            }
                        case 15:
                            p00Var.Y0.setRefreshing(true);
                            View inflate7 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var7 = new th2(p00Var.g0());
                                ((j3) th2Var7.h).s = inflate7;
                                th2Var7.h(p00Var.A(R.string.cancel), new c00(p00Var, 2));
                                int i17 = 3;
                                th2Var7.j(p00Var.A(R.string.settings), new c00(p00Var, 3));
                                ImageView imageView5 = (ImageView) inflate7.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView5.setImageResource(R.drawable.ic_phone_light);
                                    } else {
                                        imageView5.setImageResource(R.drawable.ic_phone);
                                    }
                                } catch (Exception unused26) {
                                }
                                try {
                                    ((TextView) inflate7.findViewById(R.id.info_title)).setText(p00Var.A(R.string.display));
                                } catch (Exception unused27) {
                                }
                                RecyclerView recyclerView5 = (RecyclerView) inflate7.findViewById(R.id.info_recyclerview);
                                recyclerView5.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView5.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView5, th2Var7, i17).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused28) {
                                return;
                            }
                        default:
                            p00 p00Var3 = this.h;
                            p00Var3.Y0.setRefreshing(true);
                            View inflate8 = p00Var3.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var8 = new th2(p00Var3.g0());
                                ((j3) th2Var8.h).s = inflate8;
                                th2Var8.h(p00Var3.A(R.string.cancel), new c00(p00Var3, 6));
                                th2Var8.j(p00Var3.A(R.string.settings), new c00(p00Var3, 7));
                                a61 s = uz1.s(p00Var3.i0(), Build.VERSION.SDK_INT);
                                ImageView imageView6 = (ImageView) inflate8.findViewById(R.id.info_icon);
                                imageView6.setImageTintList(null);
                                imageView6.setImageDrawable((Drawable) s.f11a);
                                try {
                                    ((TextView) inflate8.findViewById(R.id.info_title)).setText(p00Var3.A(R.string.operating_system));
                                } catch (Exception unused29) {
                                }
                                RecyclerView recyclerView6 = (RecyclerView) inflate8.findViewById(R.id.info_recyclerview);
                                recyclerView6.setHasFixedSize(true);
                                p00Var3.i0();
                                recyclerView6.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var3, s, recyclerView6, th2Var8, 1).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused30) {
                                return;
                            }
                    }
                }
            });
            this.l1 = (MaterialCardView) inflate.findViewById(R.id.dashboard_hw_submit);
            a5 g0 = g0();
            n72 l = g0.l();
            l72 g = g0.g();
            gr grVar2 = new gr(l, g, d51.i(g0, l, g));
            vq a4 = af1.a(vt0.class);
            String b2 = a4.b();
            if (b2 == null) {
                c.m("Local and anonymous classes can not be ViewModels");
                return null;
            }
            final int i11 = 1;
            ((vt0) grVar2.t(a4, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b2))).d.e(g0(), new v31(this) { // from class: b00
                public final /* synthetic */ p00 b;

                {
                    this.b = this;
                }

                @Override // defpackage.v31
                public final void a(Object obj) {
                    int i102 = i11;
                    p00 p00Var = this.b;
                    switch (i102) {
                        case 0:
                            int i112 = p00.H1;
                            p00Var.e0 = ((Boolean) obj).booleanValue();
                            break;
                        default:
                            int i12 = p00.H1;
                            try {
                                String A = uz1.A(true);
                                if (A != null && !A.isEmpty()) {
                                    p00Var.y0.setText(A, TextView.BufferType.NORMAL);
                                }
                                String e2 = i51.e("prefProcessor");
                                if (e2 != null && !e2.isEmpty()) {
                                    p00Var.A0.setText(e2, TextView.BufferType.NORMAL);
                                    break;
                                }
                            } catch (Exception unused32) {
                                return;
                            }
                            break;
                    }
                }
            });
            this.c1 = inflate.findViewById(R.id.dashboard_temp_card);
            this.d1 = inflate.findViewById(R.id.temperature_header);
            this.h0 = (ImageView) inflate.findViewById(R.id.temperature_button);
            this.b1 = inflate.findViewById(R.id.dashboard_temperature);
            final int i12 = 6;
            this.c1.setOnClickListener(new View.OnClickListener(this) { // from class: a00
                public final /* synthetic */ p00 h;

                {
                    this.h = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i12;
                    int i52 = 1;
                    p00 p00Var = this.h;
                    switch (i42) {
                        case 0:
                            int i62 = p00.H1;
                            try {
                                if (p00Var.n1.contains("64-bit") && !p00Var.e0) {
                                    uz1.q0(p00Var.i0());
                                } else if (p00Var.n1.contains("64-bit")) {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) BenchmarkSuiteActivity.class));
                                } else {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) CPUTimeActivity.class));
                                }
                                break;
                            } catch (Exception unused22) {
                                return;
                            }
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            int i72 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent = new Intent(p00Var.i0(), (Class<?>) BatteryActivity.class);
                                    intent.putExtra("dynamic", i51.b("prefDC"));
                                    intent.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent.putExtra("color", i51.c(6, "prefColor"));
                                    intent.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused32) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            int i82 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) ToolsActivity.class));
                                break;
                            } catch (Exception unused4) {
                                return;
                            }
                        case 3:
                            int i92 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) TestActivity.class));
                                break;
                            } catch (Exception unused5) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                            int i102 = p00.H1;
                            if (!Build.MODEL.equals("A063")) {
                                try {
                                    if (!p00Var.G()) {
                                        break;
                                    } else {
                                        th2 th2Var = new th2(p00Var.g0());
                                        j3 j3Var = (j3) th2Var.h;
                                        View inflate2 = p00Var.w().inflate(R.layout.widget_dialog_view, (ViewGroup) null);
                                        TextView textView = (TextView) inflate2.findViewById(R.id.widget_msg);
                                        j3Var.e = p00Var.A(R.string.widgets) + " BETA";
                                        if (!i51.b("prefHardwareDB").booleanValue()) {
                                            textView.setText(p00Var.A(R.string.widgets_require_pro));
                                        }
                                        j3Var.s = inflate2;
                                        th2Var.j(p00Var.A(R.string.okay), null);
                                        n3 a42 = th2Var.a();
                                        p00Var.q1 = a42;
                                        a42.show();
                                        break;
                                    }
                                } catch (Throwable unused6) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            }
                            break;
                        case 5:
                            int i112 = p00.H1;
                            p00Var.i0();
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused7) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                            int i122 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) TemperatureActivity.class));
                                break;
                            } catch (Exception unused8) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                            int i13 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent2 = new Intent(p00Var.i0(), (Class<?>) MonitorActivity.class);
                                    intent2.putExtra("dynamic", i51.b("prefDC"));
                                    intent2.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent2.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent2.putExtra("color", i51.c(6, "prefColor"));
                                    intent2.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent2);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused9) {
                                return;
                            }
                        case 8:
                            int i14 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused10) {
                                return;
                            }
                        case rt0.o /* 9 */:
                            p00 p00Var2 = this.h;
                            p00Var2.Y0.setRefreshing(true);
                            View inflate3 = p00Var2.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var2 = new th2(p00Var2.g0());
                                ((j3) th2Var2.h).s = inflate3;
                                th2Var2.h(p00Var2.A(R.string.cancel), new c00(p00Var2, 0));
                                th2Var2.j(p00Var2.A(R.string.settings), new c00(p00Var2, 1));
                                Intent registerReceiver = p00Var2.i0().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                ImageView imageView = (ImageView) inflate3.findViewById(R.id.info_icon);
                                try {
                                    int intExtra = (int) ((registerReceiver.getIntExtra("level", -1) * 100.0f) / registerReceiver.getIntExtra("scale", -1));
                                    if (uz1.d(p00Var2.i0())) {
                                        if (intExtra < 20) {
                                            imageView.setImageResource(R.drawable.ic_batt_5_light);
                                        } else if (intExtra < 40) {
                                            imageView.setImageResource(R.drawable.ic_batt_33_light);
                                        } else if (intExtra < 55) {
                                            imageView.setImageResource(R.drawable.ic_batt_50_light);
                                        } else if (intExtra < 75) {
                                            imageView.setImageResource(R.drawable.ic_batt_66_light);
                                        } else if (intExtra < 90) {
                                            imageView.setImageResource(R.drawable.ic_batt_75_light);
                                        } else {
                                            imageView.setImageResource(R.drawable.ic_batt_100_light);
                                        }
                                    } else if (intExtra < 20) {
                                        imageView.setImageResource(R.drawable.ic_batt_5_dark);
                                    } else if (intExtra < 40) {
                                        imageView.setImageResource(R.drawable.ic_batt_33_dark);
                                    } else if (intExtra < 55) {
                                        imageView.setImageResource(R.drawable.ic_batt_50_dark);
                                    } else if (intExtra < 75) {
                                        imageView.setImageResource(R.drawable.ic_batt_66_dark);
                                    } else if (intExtra < 90) {
                                        imageView.setImageResource(R.drawable.ic_batt_75_dark);
                                    } else {
                                        imageView.setImageResource(R.drawable.ic_batt_100_dark);
                                    }
                                } catch (Exception unused11) {
                                }
                                try {
                                    ((TextView) inflate3.findViewById(R.id.info_title)).setText(p00Var2.A(R.string.battery));
                                } catch (Exception unused12) {
                                }
                                RecyclerView recyclerView = (RecyclerView) inflate3.findViewById(R.id.info_recyclerview);
                                recyclerView.setHasFixedSize(true);
                                p00Var2.i0();
                                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var2, registerReceiver, recyclerView, th2Var2, 0).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused13) {
                                return;
                            }
                        case 10:
                            int i15 = p00.H1;
                            try {
                                th2 th2Var3 = new th2(p00Var.g0());
                                ((j3) th2Var3.h).g = "\n" + p00Var.A(R.string.cpu_na_msg) + "\n";
                                th2Var3.j(p00Var.A(R.string.okay), null);
                                n3 a5 = th2Var3.a();
                                p00Var.q1 = a5;
                                try {
                                    a5.show();
                                    break;
                                } catch (Exception unused14) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            } catch (NullPointerException unused15) {
                                return;
                            }
                        case 11:
                            p00Var.Y0.setRefreshing(true);
                            View inflate4 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var4 = new th2(p00Var.g0());
                                ((j3) th2Var4.h).s = inflate4;
                                th2Var4.h(p00Var.A(R.string.cancel), new c00(p00Var, 8));
                                th2Var4.j(p00Var.A(R.string.settings), new c00(p00Var, 9));
                                NetworkInfo activeNetworkInfo = ((ConnectivityManager) p00Var.i0().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                                boolean z2 = activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
                                ImageView imageView2 = (ImageView) inflate4.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        if (z2) {
                                            imageView2.setImageResource(R.drawable.ic_signal0_light);
                                        } else {
                                            imageView2.setImageResource(R.drawable.ic_wifi_light);
                                        }
                                    } else if (z2) {
                                        imageView2.setImageResource(R.drawable.ic_signal0_dark);
                                    } else {
                                        imageView2.setImageResource(R.drawable.ic_wifi_dark);
                                    }
                                } catch (Exception unused16) {
                                }
                                try {
                                    ((TextView) inflate4.findViewById(R.id.info_title)).setText(p00Var.A(R.string.network));
                                } catch (Exception unused17) {
                                }
                                RecyclerView recyclerView2 = (RecyclerView) inflate4.findViewById(R.id.info_recyclerview);
                                recyclerView2.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                new k00(p00Var, z2, recyclerView2, th2Var4).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused18) {
                                return;
                            }
                            break;
                        case 12:
                            int i16 = p00.H1;
                            try {
                                p00Var.C0();
                                break;
                            } catch (Exception unused19) {
                                return;
                            }
                        case 13:
                            p00Var.Y0.setRefreshing(true);
                            View inflate5 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var5 = new th2(p00Var.g0());
                                ((j3) th2Var5.h).s = inflate5;
                                th2Var5.h(p00Var.A(R.string.cancel), new c00(p00Var, 10));
                                th2Var5.j(p00Var.A(R.string.settings), new c00(p00Var, 11));
                                ImageView imageView3 = (ImageView) inflate5.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView3.setImageResource(R.drawable.ic_storage_light);
                                    } else {
                                        imageView3.setImageResource(R.drawable.ic_storage_dark);
                                    }
                                } catch (Exception unused20) {
                                }
                                try {
                                    ((TextView) inflate5.findViewById(R.id.info_title)).setText(p00Var.A(R.string.storage));
                                } catch (Exception unused21) {
                                }
                                RecyclerView recyclerView3 = (RecyclerView) inflate5.findViewById(R.id.info_recyclerview);
                                recyclerView3.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView3.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView3, th2Var5, i52).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused222) {
                                return;
                            }
                        case 14:
                            p00Var.Y0.setRefreshing(true);
                            View inflate6 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var6 = new th2(p00Var.g0());
                                ((j3) th2Var6.h).s = inflate6;
                                th2Var6.h(p00Var.A(R.string.cancel), new c00(p00Var, 4));
                                th2Var6.j(p00Var.A(R.string.settings), new c00(p00Var, 5));
                                ImageView imageView4 = (ImageView) inflate6.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView4.setImageResource(R.drawable.ic_apps_dark);
                                    } else {
                                        imageView4.setImageResource(R.drawable.ic_apps);
                                    }
                                } catch (Exception unused23) {
                                }
                                try {
                                    ((TextView) inflate6.findViewById(R.id.info_title)).setText(p00Var.A(R.string.installed_apps));
                                } catch (Exception unused24) {
                                }
                                RecyclerView recyclerView4 = (RecyclerView) inflate6.findViewById(R.id.info_recyclerview);
                                recyclerView4.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView4.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView4, th2Var6, 2).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused25) {
                                return;
                            }
                        case 15:
                            p00Var.Y0.setRefreshing(true);
                            View inflate7 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var7 = new th2(p00Var.g0());
                                ((j3) th2Var7.h).s = inflate7;
                                th2Var7.h(p00Var.A(R.string.cancel), new c00(p00Var, 2));
                                int i17 = 3;
                                th2Var7.j(p00Var.A(R.string.settings), new c00(p00Var, 3));
                                ImageView imageView5 = (ImageView) inflate7.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView5.setImageResource(R.drawable.ic_phone_light);
                                    } else {
                                        imageView5.setImageResource(R.drawable.ic_phone);
                                    }
                                } catch (Exception unused26) {
                                }
                                try {
                                    ((TextView) inflate7.findViewById(R.id.info_title)).setText(p00Var.A(R.string.display));
                                } catch (Exception unused27) {
                                }
                                RecyclerView recyclerView5 = (RecyclerView) inflate7.findViewById(R.id.info_recyclerview);
                                recyclerView5.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView5.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView5, th2Var7, i17).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused28) {
                                return;
                            }
                        default:
                            p00 p00Var3 = this.h;
                            p00Var3.Y0.setRefreshing(true);
                            View inflate8 = p00Var3.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var8 = new th2(p00Var3.g0());
                                ((j3) th2Var8.h).s = inflate8;
                                th2Var8.h(p00Var3.A(R.string.cancel), new c00(p00Var3, 6));
                                th2Var8.j(p00Var3.A(R.string.settings), new c00(p00Var3, 7));
                                a61 s = uz1.s(p00Var3.i0(), Build.VERSION.SDK_INT);
                                ImageView imageView6 = (ImageView) inflate8.findViewById(R.id.info_icon);
                                imageView6.setImageTintList(null);
                                imageView6.setImageDrawable((Drawable) s.f11a);
                                try {
                                    ((TextView) inflate8.findViewById(R.id.info_title)).setText(p00Var3.A(R.string.operating_system));
                                } catch (Exception unused29) {
                                }
                                RecyclerView recyclerView6 = (RecyclerView) inflate8.findViewById(R.id.info_recyclerview);
                                recyclerView6.setHasFixedSize(true);
                                p00Var3.i0();
                                recyclerView6.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var3, s, recyclerView6, th2Var8, 1).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused30) {
                                return;
                            }
                    }
                }
            });
            this.e1 = inflate.findViewById(R.id.dashboard_loadgpu);
            final int i13 = 9;
            inflate.findViewById(R.id.dashboard_battery).setOnClickListener(new View.OnClickListener(this) { // from class: a00
                public final /* synthetic */ p00 h;

                {
                    this.h = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i13;
                    int i52 = 1;
                    p00 p00Var = this.h;
                    switch (i42) {
                        case 0:
                            int i62 = p00.H1;
                            try {
                                if (p00Var.n1.contains("64-bit") && !p00Var.e0) {
                                    uz1.q0(p00Var.i0());
                                } else if (p00Var.n1.contains("64-bit")) {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) BenchmarkSuiteActivity.class));
                                } else {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) CPUTimeActivity.class));
                                }
                                break;
                            } catch (Exception unused22) {
                                return;
                            }
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            int i72 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent = new Intent(p00Var.i0(), (Class<?>) BatteryActivity.class);
                                    intent.putExtra("dynamic", i51.b("prefDC"));
                                    intent.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent.putExtra("color", i51.c(6, "prefColor"));
                                    intent.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused32) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            int i82 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) ToolsActivity.class));
                                break;
                            } catch (Exception unused4) {
                                return;
                            }
                        case 3:
                            int i92 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) TestActivity.class));
                                break;
                            } catch (Exception unused5) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                            int i102 = p00.H1;
                            if (!Build.MODEL.equals("A063")) {
                                try {
                                    if (!p00Var.G()) {
                                        break;
                                    } else {
                                        th2 th2Var = new th2(p00Var.g0());
                                        j3 j3Var = (j3) th2Var.h;
                                        View inflate2 = p00Var.w().inflate(R.layout.widget_dialog_view, (ViewGroup) null);
                                        TextView textView = (TextView) inflate2.findViewById(R.id.widget_msg);
                                        j3Var.e = p00Var.A(R.string.widgets) + " BETA";
                                        if (!i51.b("prefHardwareDB").booleanValue()) {
                                            textView.setText(p00Var.A(R.string.widgets_require_pro));
                                        }
                                        j3Var.s = inflate2;
                                        th2Var.j(p00Var.A(R.string.okay), null);
                                        n3 a42 = th2Var.a();
                                        p00Var.q1 = a42;
                                        a42.show();
                                        break;
                                    }
                                } catch (Throwable unused6) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            }
                            break;
                        case 5:
                            int i112 = p00.H1;
                            p00Var.i0();
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused7) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                            int i122 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) TemperatureActivity.class));
                                break;
                            } catch (Exception unused8) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                            int i132 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent2 = new Intent(p00Var.i0(), (Class<?>) MonitorActivity.class);
                                    intent2.putExtra("dynamic", i51.b("prefDC"));
                                    intent2.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent2.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent2.putExtra("color", i51.c(6, "prefColor"));
                                    intent2.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent2);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused9) {
                                return;
                            }
                        case 8:
                            int i14 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused10) {
                                return;
                            }
                        case rt0.o /* 9 */:
                            p00 p00Var2 = this.h;
                            p00Var2.Y0.setRefreshing(true);
                            View inflate3 = p00Var2.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var2 = new th2(p00Var2.g0());
                                ((j3) th2Var2.h).s = inflate3;
                                th2Var2.h(p00Var2.A(R.string.cancel), new c00(p00Var2, 0));
                                th2Var2.j(p00Var2.A(R.string.settings), new c00(p00Var2, 1));
                                Intent registerReceiver = p00Var2.i0().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                ImageView imageView = (ImageView) inflate3.findViewById(R.id.info_icon);
                                try {
                                    int intExtra = (int) ((registerReceiver.getIntExtra("level", -1) * 100.0f) / registerReceiver.getIntExtra("scale", -1));
                                    if (uz1.d(p00Var2.i0())) {
                                        if (intExtra < 20) {
                                            imageView.setImageResource(R.drawable.ic_batt_5_light);
                                        } else if (intExtra < 40) {
                                            imageView.setImageResource(R.drawable.ic_batt_33_light);
                                        } else if (intExtra < 55) {
                                            imageView.setImageResource(R.drawable.ic_batt_50_light);
                                        } else if (intExtra < 75) {
                                            imageView.setImageResource(R.drawable.ic_batt_66_light);
                                        } else if (intExtra < 90) {
                                            imageView.setImageResource(R.drawable.ic_batt_75_light);
                                        } else {
                                            imageView.setImageResource(R.drawable.ic_batt_100_light);
                                        }
                                    } else if (intExtra < 20) {
                                        imageView.setImageResource(R.drawable.ic_batt_5_dark);
                                    } else if (intExtra < 40) {
                                        imageView.setImageResource(R.drawable.ic_batt_33_dark);
                                    } else if (intExtra < 55) {
                                        imageView.setImageResource(R.drawable.ic_batt_50_dark);
                                    } else if (intExtra < 75) {
                                        imageView.setImageResource(R.drawable.ic_batt_66_dark);
                                    } else if (intExtra < 90) {
                                        imageView.setImageResource(R.drawable.ic_batt_75_dark);
                                    } else {
                                        imageView.setImageResource(R.drawable.ic_batt_100_dark);
                                    }
                                } catch (Exception unused11) {
                                }
                                try {
                                    ((TextView) inflate3.findViewById(R.id.info_title)).setText(p00Var2.A(R.string.battery));
                                } catch (Exception unused12) {
                                }
                                RecyclerView recyclerView = (RecyclerView) inflate3.findViewById(R.id.info_recyclerview);
                                recyclerView.setHasFixedSize(true);
                                p00Var2.i0();
                                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var2, registerReceiver, recyclerView, th2Var2, 0).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused13) {
                                return;
                            }
                        case 10:
                            int i15 = p00.H1;
                            try {
                                th2 th2Var3 = new th2(p00Var.g0());
                                ((j3) th2Var3.h).g = "\n" + p00Var.A(R.string.cpu_na_msg) + "\n";
                                th2Var3.j(p00Var.A(R.string.okay), null);
                                n3 a5 = th2Var3.a();
                                p00Var.q1 = a5;
                                try {
                                    a5.show();
                                    break;
                                } catch (Exception unused14) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            } catch (NullPointerException unused15) {
                                return;
                            }
                        case 11:
                            p00Var.Y0.setRefreshing(true);
                            View inflate4 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var4 = new th2(p00Var.g0());
                                ((j3) th2Var4.h).s = inflate4;
                                th2Var4.h(p00Var.A(R.string.cancel), new c00(p00Var, 8));
                                th2Var4.j(p00Var.A(R.string.settings), new c00(p00Var, 9));
                                NetworkInfo activeNetworkInfo = ((ConnectivityManager) p00Var.i0().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                                boolean z2 = activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
                                ImageView imageView2 = (ImageView) inflate4.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        if (z2) {
                                            imageView2.setImageResource(R.drawable.ic_signal0_light);
                                        } else {
                                            imageView2.setImageResource(R.drawable.ic_wifi_light);
                                        }
                                    } else if (z2) {
                                        imageView2.setImageResource(R.drawable.ic_signal0_dark);
                                    } else {
                                        imageView2.setImageResource(R.drawable.ic_wifi_dark);
                                    }
                                } catch (Exception unused16) {
                                }
                                try {
                                    ((TextView) inflate4.findViewById(R.id.info_title)).setText(p00Var.A(R.string.network));
                                } catch (Exception unused17) {
                                }
                                RecyclerView recyclerView2 = (RecyclerView) inflate4.findViewById(R.id.info_recyclerview);
                                recyclerView2.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                new k00(p00Var, z2, recyclerView2, th2Var4).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused18) {
                                return;
                            }
                            break;
                        case 12:
                            int i16 = p00.H1;
                            try {
                                p00Var.C0();
                                break;
                            } catch (Exception unused19) {
                                return;
                            }
                        case 13:
                            p00Var.Y0.setRefreshing(true);
                            View inflate5 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var5 = new th2(p00Var.g0());
                                ((j3) th2Var5.h).s = inflate5;
                                th2Var5.h(p00Var.A(R.string.cancel), new c00(p00Var, 10));
                                th2Var5.j(p00Var.A(R.string.settings), new c00(p00Var, 11));
                                ImageView imageView3 = (ImageView) inflate5.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView3.setImageResource(R.drawable.ic_storage_light);
                                    } else {
                                        imageView3.setImageResource(R.drawable.ic_storage_dark);
                                    }
                                } catch (Exception unused20) {
                                }
                                try {
                                    ((TextView) inflate5.findViewById(R.id.info_title)).setText(p00Var.A(R.string.storage));
                                } catch (Exception unused21) {
                                }
                                RecyclerView recyclerView3 = (RecyclerView) inflate5.findViewById(R.id.info_recyclerview);
                                recyclerView3.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView3.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView3, th2Var5, i52).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused222) {
                                return;
                            }
                        case 14:
                            p00Var.Y0.setRefreshing(true);
                            View inflate6 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var6 = new th2(p00Var.g0());
                                ((j3) th2Var6.h).s = inflate6;
                                th2Var6.h(p00Var.A(R.string.cancel), new c00(p00Var, 4));
                                th2Var6.j(p00Var.A(R.string.settings), new c00(p00Var, 5));
                                ImageView imageView4 = (ImageView) inflate6.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView4.setImageResource(R.drawable.ic_apps_dark);
                                    } else {
                                        imageView4.setImageResource(R.drawable.ic_apps);
                                    }
                                } catch (Exception unused23) {
                                }
                                try {
                                    ((TextView) inflate6.findViewById(R.id.info_title)).setText(p00Var.A(R.string.installed_apps));
                                } catch (Exception unused24) {
                                }
                                RecyclerView recyclerView4 = (RecyclerView) inflate6.findViewById(R.id.info_recyclerview);
                                recyclerView4.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView4.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView4, th2Var6, 2).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused25) {
                                return;
                            }
                        case 15:
                            p00Var.Y0.setRefreshing(true);
                            View inflate7 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var7 = new th2(p00Var.g0());
                                ((j3) th2Var7.h).s = inflate7;
                                th2Var7.h(p00Var.A(R.string.cancel), new c00(p00Var, 2));
                                int i17 = 3;
                                th2Var7.j(p00Var.A(R.string.settings), new c00(p00Var, 3));
                                ImageView imageView5 = (ImageView) inflate7.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView5.setImageResource(R.drawable.ic_phone_light);
                                    } else {
                                        imageView5.setImageResource(R.drawable.ic_phone);
                                    }
                                } catch (Exception unused26) {
                                }
                                try {
                                    ((TextView) inflate7.findViewById(R.id.info_title)).setText(p00Var.A(R.string.display));
                                } catch (Exception unused27) {
                                }
                                RecyclerView recyclerView5 = (RecyclerView) inflate7.findViewById(R.id.info_recyclerview);
                                recyclerView5.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView5.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView5, th2Var7, i17).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused28) {
                                return;
                            }
                        default:
                            p00 p00Var3 = this.h;
                            p00Var3.Y0.setRefreshing(true);
                            View inflate8 = p00Var3.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var8 = new th2(p00Var3.g0());
                                ((j3) th2Var8.h).s = inflate8;
                                th2Var8.h(p00Var3.A(R.string.cancel), new c00(p00Var3, 6));
                                th2Var8.j(p00Var3.A(R.string.settings), new c00(p00Var3, 7));
                                a61 s = uz1.s(p00Var3.i0(), Build.VERSION.SDK_INT);
                                ImageView imageView6 = (ImageView) inflate8.findViewById(R.id.info_icon);
                                imageView6.setImageTintList(null);
                                imageView6.setImageDrawable((Drawable) s.f11a);
                                try {
                                    ((TextView) inflate8.findViewById(R.id.info_title)).setText(p00Var3.A(R.string.operating_system));
                                } catch (Exception unused29) {
                                }
                                RecyclerView recyclerView6 = (RecyclerView) inflate8.findViewById(R.id.info_recyclerview);
                                recyclerView6.setHasFixedSize(true);
                                p00Var3.i0();
                                recyclerView6.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var3, s, recyclerView6, th2Var8, 1).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused30) {
                                return;
                            }
                    }
                }
            });
            final int i14 = 11;
            inflate.findViewById(R.id.dashboard_network).setOnClickListener(new View.OnClickListener(this) { // from class: a00
                public final /* synthetic */ p00 h;

                {
                    this.h = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i14;
                    int i52 = 1;
                    p00 p00Var = this.h;
                    switch (i42) {
                        case 0:
                            int i62 = p00.H1;
                            try {
                                if (p00Var.n1.contains("64-bit") && !p00Var.e0) {
                                    uz1.q0(p00Var.i0());
                                } else if (p00Var.n1.contains("64-bit")) {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) BenchmarkSuiteActivity.class));
                                } else {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) CPUTimeActivity.class));
                                }
                                break;
                            } catch (Exception unused22) {
                                return;
                            }
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            int i72 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent = new Intent(p00Var.i0(), (Class<?>) BatteryActivity.class);
                                    intent.putExtra("dynamic", i51.b("prefDC"));
                                    intent.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent.putExtra("color", i51.c(6, "prefColor"));
                                    intent.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused32) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            int i82 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) ToolsActivity.class));
                                break;
                            } catch (Exception unused4) {
                                return;
                            }
                        case 3:
                            int i92 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) TestActivity.class));
                                break;
                            } catch (Exception unused5) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                            int i102 = p00.H1;
                            if (!Build.MODEL.equals("A063")) {
                                try {
                                    if (!p00Var.G()) {
                                        break;
                                    } else {
                                        th2 th2Var = new th2(p00Var.g0());
                                        j3 j3Var = (j3) th2Var.h;
                                        View inflate2 = p00Var.w().inflate(R.layout.widget_dialog_view, (ViewGroup) null);
                                        TextView textView = (TextView) inflate2.findViewById(R.id.widget_msg);
                                        j3Var.e = p00Var.A(R.string.widgets) + " BETA";
                                        if (!i51.b("prefHardwareDB").booleanValue()) {
                                            textView.setText(p00Var.A(R.string.widgets_require_pro));
                                        }
                                        j3Var.s = inflate2;
                                        th2Var.j(p00Var.A(R.string.okay), null);
                                        n3 a42 = th2Var.a();
                                        p00Var.q1 = a42;
                                        a42.show();
                                        break;
                                    }
                                } catch (Throwable unused6) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            }
                            break;
                        case 5:
                            int i112 = p00.H1;
                            p00Var.i0();
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused7) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                            int i122 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) TemperatureActivity.class));
                                break;
                            } catch (Exception unused8) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                            int i132 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent2 = new Intent(p00Var.i0(), (Class<?>) MonitorActivity.class);
                                    intent2.putExtra("dynamic", i51.b("prefDC"));
                                    intent2.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent2.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent2.putExtra("color", i51.c(6, "prefColor"));
                                    intent2.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent2);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused9) {
                                return;
                            }
                        case 8:
                            int i142 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused10) {
                                return;
                            }
                        case rt0.o /* 9 */:
                            p00 p00Var2 = this.h;
                            p00Var2.Y0.setRefreshing(true);
                            View inflate3 = p00Var2.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var2 = new th2(p00Var2.g0());
                                ((j3) th2Var2.h).s = inflate3;
                                th2Var2.h(p00Var2.A(R.string.cancel), new c00(p00Var2, 0));
                                th2Var2.j(p00Var2.A(R.string.settings), new c00(p00Var2, 1));
                                Intent registerReceiver = p00Var2.i0().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                ImageView imageView = (ImageView) inflate3.findViewById(R.id.info_icon);
                                try {
                                    int intExtra = (int) ((registerReceiver.getIntExtra("level", -1) * 100.0f) / registerReceiver.getIntExtra("scale", -1));
                                    if (uz1.d(p00Var2.i0())) {
                                        if (intExtra < 20) {
                                            imageView.setImageResource(R.drawable.ic_batt_5_light);
                                        } else if (intExtra < 40) {
                                            imageView.setImageResource(R.drawable.ic_batt_33_light);
                                        } else if (intExtra < 55) {
                                            imageView.setImageResource(R.drawable.ic_batt_50_light);
                                        } else if (intExtra < 75) {
                                            imageView.setImageResource(R.drawable.ic_batt_66_light);
                                        } else if (intExtra < 90) {
                                            imageView.setImageResource(R.drawable.ic_batt_75_light);
                                        } else {
                                            imageView.setImageResource(R.drawable.ic_batt_100_light);
                                        }
                                    } else if (intExtra < 20) {
                                        imageView.setImageResource(R.drawable.ic_batt_5_dark);
                                    } else if (intExtra < 40) {
                                        imageView.setImageResource(R.drawable.ic_batt_33_dark);
                                    } else if (intExtra < 55) {
                                        imageView.setImageResource(R.drawable.ic_batt_50_dark);
                                    } else if (intExtra < 75) {
                                        imageView.setImageResource(R.drawable.ic_batt_66_dark);
                                    } else if (intExtra < 90) {
                                        imageView.setImageResource(R.drawable.ic_batt_75_dark);
                                    } else {
                                        imageView.setImageResource(R.drawable.ic_batt_100_dark);
                                    }
                                } catch (Exception unused11) {
                                }
                                try {
                                    ((TextView) inflate3.findViewById(R.id.info_title)).setText(p00Var2.A(R.string.battery));
                                } catch (Exception unused12) {
                                }
                                RecyclerView recyclerView = (RecyclerView) inflate3.findViewById(R.id.info_recyclerview);
                                recyclerView.setHasFixedSize(true);
                                p00Var2.i0();
                                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var2, registerReceiver, recyclerView, th2Var2, 0).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused13) {
                                return;
                            }
                        case 10:
                            int i15 = p00.H1;
                            try {
                                th2 th2Var3 = new th2(p00Var.g0());
                                ((j3) th2Var3.h).g = "\n" + p00Var.A(R.string.cpu_na_msg) + "\n";
                                th2Var3.j(p00Var.A(R.string.okay), null);
                                n3 a5 = th2Var3.a();
                                p00Var.q1 = a5;
                                try {
                                    a5.show();
                                    break;
                                } catch (Exception unused14) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            } catch (NullPointerException unused15) {
                                return;
                            }
                        case 11:
                            p00Var.Y0.setRefreshing(true);
                            View inflate4 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var4 = new th2(p00Var.g0());
                                ((j3) th2Var4.h).s = inflate4;
                                th2Var4.h(p00Var.A(R.string.cancel), new c00(p00Var, 8));
                                th2Var4.j(p00Var.A(R.string.settings), new c00(p00Var, 9));
                                NetworkInfo activeNetworkInfo = ((ConnectivityManager) p00Var.i0().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                                boolean z2 = activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
                                ImageView imageView2 = (ImageView) inflate4.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        if (z2) {
                                            imageView2.setImageResource(R.drawable.ic_signal0_light);
                                        } else {
                                            imageView2.setImageResource(R.drawable.ic_wifi_light);
                                        }
                                    } else if (z2) {
                                        imageView2.setImageResource(R.drawable.ic_signal0_dark);
                                    } else {
                                        imageView2.setImageResource(R.drawable.ic_wifi_dark);
                                    }
                                } catch (Exception unused16) {
                                }
                                try {
                                    ((TextView) inflate4.findViewById(R.id.info_title)).setText(p00Var.A(R.string.network));
                                } catch (Exception unused17) {
                                }
                                RecyclerView recyclerView2 = (RecyclerView) inflate4.findViewById(R.id.info_recyclerview);
                                recyclerView2.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                new k00(p00Var, z2, recyclerView2, th2Var4).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused18) {
                                return;
                            }
                            break;
                        case 12:
                            int i16 = p00.H1;
                            try {
                                p00Var.C0();
                                break;
                            } catch (Exception unused19) {
                                return;
                            }
                        case 13:
                            p00Var.Y0.setRefreshing(true);
                            View inflate5 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var5 = new th2(p00Var.g0());
                                ((j3) th2Var5.h).s = inflate5;
                                th2Var5.h(p00Var.A(R.string.cancel), new c00(p00Var, 10));
                                th2Var5.j(p00Var.A(R.string.settings), new c00(p00Var, 11));
                                ImageView imageView3 = (ImageView) inflate5.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView3.setImageResource(R.drawable.ic_storage_light);
                                    } else {
                                        imageView3.setImageResource(R.drawable.ic_storage_dark);
                                    }
                                } catch (Exception unused20) {
                                }
                                try {
                                    ((TextView) inflate5.findViewById(R.id.info_title)).setText(p00Var.A(R.string.storage));
                                } catch (Exception unused21) {
                                }
                                RecyclerView recyclerView3 = (RecyclerView) inflate5.findViewById(R.id.info_recyclerview);
                                recyclerView3.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView3.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView3, th2Var5, i52).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused222) {
                                return;
                            }
                        case 14:
                            p00Var.Y0.setRefreshing(true);
                            View inflate6 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var6 = new th2(p00Var.g0());
                                ((j3) th2Var6.h).s = inflate6;
                                th2Var6.h(p00Var.A(R.string.cancel), new c00(p00Var, 4));
                                th2Var6.j(p00Var.A(R.string.settings), new c00(p00Var, 5));
                                ImageView imageView4 = (ImageView) inflate6.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView4.setImageResource(R.drawable.ic_apps_dark);
                                    } else {
                                        imageView4.setImageResource(R.drawable.ic_apps);
                                    }
                                } catch (Exception unused23) {
                                }
                                try {
                                    ((TextView) inflate6.findViewById(R.id.info_title)).setText(p00Var.A(R.string.installed_apps));
                                } catch (Exception unused24) {
                                }
                                RecyclerView recyclerView4 = (RecyclerView) inflate6.findViewById(R.id.info_recyclerview);
                                recyclerView4.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView4.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView4, th2Var6, 2).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused25) {
                                return;
                            }
                        case 15:
                            p00Var.Y0.setRefreshing(true);
                            View inflate7 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var7 = new th2(p00Var.g0());
                                ((j3) th2Var7.h).s = inflate7;
                                th2Var7.h(p00Var.A(R.string.cancel), new c00(p00Var, 2));
                                int i17 = 3;
                                th2Var7.j(p00Var.A(R.string.settings), new c00(p00Var, 3));
                                ImageView imageView5 = (ImageView) inflate7.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView5.setImageResource(R.drawable.ic_phone_light);
                                    } else {
                                        imageView5.setImageResource(R.drawable.ic_phone);
                                    }
                                } catch (Exception unused26) {
                                }
                                try {
                                    ((TextView) inflate7.findViewById(R.id.info_title)).setText(p00Var.A(R.string.display));
                                } catch (Exception unused27) {
                                }
                                RecyclerView recyclerView5 = (RecyclerView) inflate7.findViewById(R.id.info_recyclerview);
                                recyclerView5.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView5.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView5, th2Var7, i17).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused28) {
                                return;
                            }
                        default:
                            p00 p00Var3 = this.h;
                            p00Var3.Y0.setRefreshing(true);
                            View inflate8 = p00Var3.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var8 = new th2(p00Var3.g0());
                                ((j3) th2Var8.h).s = inflate8;
                                th2Var8.h(p00Var3.A(R.string.cancel), new c00(p00Var3, 6));
                                th2Var8.j(p00Var3.A(R.string.settings), new c00(p00Var3, 7));
                                a61 s = uz1.s(p00Var3.i0(), Build.VERSION.SDK_INT);
                                ImageView imageView6 = (ImageView) inflate8.findViewById(R.id.info_icon);
                                imageView6.setImageTintList(null);
                                imageView6.setImageDrawable((Drawable) s.f11a);
                                try {
                                    ((TextView) inflate8.findViewById(R.id.info_title)).setText(p00Var3.A(R.string.operating_system));
                                } catch (Exception unused29) {
                                }
                                RecyclerView recyclerView6 = (RecyclerView) inflate8.findViewById(R.id.info_recyclerview);
                                recyclerView6.setHasFixedSize(true);
                                p00Var3.i0();
                                recyclerView6.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var3, s, recyclerView6, th2Var8, 1).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused30) {
                                return;
                            }
                    }
                }
            });
            final int i15 = 12;
            inflate.findViewById(R.id.dashboard_memory).setOnClickListener(new View.OnClickListener(this) { // from class: a00
                public final /* synthetic */ p00 h;

                {
                    this.h = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i15;
                    int i52 = 1;
                    p00 p00Var = this.h;
                    switch (i42) {
                        case 0:
                            int i62 = p00.H1;
                            try {
                                if (p00Var.n1.contains("64-bit") && !p00Var.e0) {
                                    uz1.q0(p00Var.i0());
                                } else if (p00Var.n1.contains("64-bit")) {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) BenchmarkSuiteActivity.class));
                                } else {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) CPUTimeActivity.class));
                                }
                                break;
                            } catch (Exception unused22) {
                                return;
                            }
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            int i72 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent = new Intent(p00Var.i0(), (Class<?>) BatteryActivity.class);
                                    intent.putExtra("dynamic", i51.b("prefDC"));
                                    intent.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent.putExtra("color", i51.c(6, "prefColor"));
                                    intent.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused32) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            int i82 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) ToolsActivity.class));
                                break;
                            } catch (Exception unused4) {
                                return;
                            }
                        case 3:
                            int i92 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) TestActivity.class));
                                break;
                            } catch (Exception unused5) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                            int i102 = p00.H1;
                            if (!Build.MODEL.equals("A063")) {
                                try {
                                    if (!p00Var.G()) {
                                        break;
                                    } else {
                                        th2 th2Var = new th2(p00Var.g0());
                                        j3 j3Var = (j3) th2Var.h;
                                        View inflate2 = p00Var.w().inflate(R.layout.widget_dialog_view, (ViewGroup) null);
                                        TextView textView = (TextView) inflate2.findViewById(R.id.widget_msg);
                                        j3Var.e = p00Var.A(R.string.widgets) + " BETA";
                                        if (!i51.b("prefHardwareDB").booleanValue()) {
                                            textView.setText(p00Var.A(R.string.widgets_require_pro));
                                        }
                                        j3Var.s = inflate2;
                                        th2Var.j(p00Var.A(R.string.okay), null);
                                        n3 a42 = th2Var.a();
                                        p00Var.q1 = a42;
                                        a42.show();
                                        break;
                                    }
                                } catch (Throwable unused6) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            }
                            break;
                        case 5:
                            int i112 = p00.H1;
                            p00Var.i0();
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused7) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                            int i122 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) TemperatureActivity.class));
                                break;
                            } catch (Exception unused8) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                            int i132 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent2 = new Intent(p00Var.i0(), (Class<?>) MonitorActivity.class);
                                    intent2.putExtra("dynamic", i51.b("prefDC"));
                                    intent2.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent2.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent2.putExtra("color", i51.c(6, "prefColor"));
                                    intent2.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent2);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused9) {
                                return;
                            }
                        case 8:
                            int i142 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused10) {
                                return;
                            }
                        case rt0.o /* 9 */:
                            p00 p00Var2 = this.h;
                            p00Var2.Y0.setRefreshing(true);
                            View inflate3 = p00Var2.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var2 = new th2(p00Var2.g0());
                                ((j3) th2Var2.h).s = inflate3;
                                th2Var2.h(p00Var2.A(R.string.cancel), new c00(p00Var2, 0));
                                th2Var2.j(p00Var2.A(R.string.settings), new c00(p00Var2, 1));
                                Intent registerReceiver = p00Var2.i0().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                ImageView imageView = (ImageView) inflate3.findViewById(R.id.info_icon);
                                try {
                                    int intExtra = (int) ((registerReceiver.getIntExtra("level", -1) * 100.0f) / registerReceiver.getIntExtra("scale", -1));
                                    if (uz1.d(p00Var2.i0())) {
                                        if (intExtra < 20) {
                                            imageView.setImageResource(R.drawable.ic_batt_5_light);
                                        } else if (intExtra < 40) {
                                            imageView.setImageResource(R.drawable.ic_batt_33_light);
                                        } else if (intExtra < 55) {
                                            imageView.setImageResource(R.drawable.ic_batt_50_light);
                                        } else if (intExtra < 75) {
                                            imageView.setImageResource(R.drawable.ic_batt_66_light);
                                        } else if (intExtra < 90) {
                                            imageView.setImageResource(R.drawable.ic_batt_75_light);
                                        } else {
                                            imageView.setImageResource(R.drawable.ic_batt_100_light);
                                        }
                                    } else if (intExtra < 20) {
                                        imageView.setImageResource(R.drawable.ic_batt_5_dark);
                                    } else if (intExtra < 40) {
                                        imageView.setImageResource(R.drawable.ic_batt_33_dark);
                                    } else if (intExtra < 55) {
                                        imageView.setImageResource(R.drawable.ic_batt_50_dark);
                                    } else if (intExtra < 75) {
                                        imageView.setImageResource(R.drawable.ic_batt_66_dark);
                                    } else if (intExtra < 90) {
                                        imageView.setImageResource(R.drawable.ic_batt_75_dark);
                                    } else {
                                        imageView.setImageResource(R.drawable.ic_batt_100_dark);
                                    }
                                } catch (Exception unused11) {
                                }
                                try {
                                    ((TextView) inflate3.findViewById(R.id.info_title)).setText(p00Var2.A(R.string.battery));
                                } catch (Exception unused12) {
                                }
                                RecyclerView recyclerView = (RecyclerView) inflate3.findViewById(R.id.info_recyclerview);
                                recyclerView.setHasFixedSize(true);
                                p00Var2.i0();
                                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var2, registerReceiver, recyclerView, th2Var2, 0).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused13) {
                                return;
                            }
                        case 10:
                            int i152 = p00.H1;
                            try {
                                th2 th2Var3 = new th2(p00Var.g0());
                                ((j3) th2Var3.h).g = "\n" + p00Var.A(R.string.cpu_na_msg) + "\n";
                                th2Var3.j(p00Var.A(R.string.okay), null);
                                n3 a5 = th2Var3.a();
                                p00Var.q1 = a5;
                                try {
                                    a5.show();
                                    break;
                                } catch (Exception unused14) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            } catch (NullPointerException unused15) {
                                return;
                            }
                        case 11:
                            p00Var.Y0.setRefreshing(true);
                            View inflate4 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var4 = new th2(p00Var.g0());
                                ((j3) th2Var4.h).s = inflate4;
                                th2Var4.h(p00Var.A(R.string.cancel), new c00(p00Var, 8));
                                th2Var4.j(p00Var.A(R.string.settings), new c00(p00Var, 9));
                                NetworkInfo activeNetworkInfo = ((ConnectivityManager) p00Var.i0().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                                boolean z2 = activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
                                ImageView imageView2 = (ImageView) inflate4.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        if (z2) {
                                            imageView2.setImageResource(R.drawable.ic_signal0_light);
                                        } else {
                                            imageView2.setImageResource(R.drawable.ic_wifi_light);
                                        }
                                    } else if (z2) {
                                        imageView2.setImageResource(R.drawable.ic_signal0_dark);
                                    } else {
                                        imageView2.setImageResource(R.drawable.ic_wifi_dark);
                                    }
                                } catch (Exception unused16) {
                                }
                                try {
                                    ((TextView) inflate4.findViewById(R.id.info_title)).setText(p00Var.A(R.string.network));
                                } catch (Exception unused17) {
                                }
                                RecyclerView recyclerView2 = (RecyclerView) inflate4.findViewById(R.id.info_recyclerview);
                                recyclerView2.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                new k00(p00Var, z2, recyclerView2, th2Var4).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused18) {
                                return;
                            }
                            break;
                        case 12:
                            int i16 = p00.H1;
                            try {
                                p00Var.C0();
                                break;
                            } catch (Exception unused19) {
                                return;
                            }
                        case 13:
                            p00Var.Y0.setRefreshing(true);
                            View inflate5 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var5 = new th2(p00Var.g0());
                                ((j3) th2Var5.h).s = inflate5;
                                th2Var5.h(p00Var.A(R.string.cancel), new c00(p00Var, 10));
                                th2Var5.j(p00Var.A(R.string.settings), new c00(p00Var, 11));
                                ImageView imageView3 = (ImageView) inflate5.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView3.setImageResource(R.drawable.ic_storage_light);
                                    } else {
                                        imageView3.setImageResource(R.drawable.ic_storage_dark);
                                    }
                                } catch (Exception unused20) {
                                }
                                try {
                                    ((TextView) inflate5.findViewById(R.id.info_title)).setText(p00Var.A(R.string.storage));
                                } catch (Exception unused21) {
                                }
                                RecyclerView recyclerView3 = (RecyclerView) inflate5.findViewById(R.id.info_recyclerview);
                                recyclerView3.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView3.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView3, th2Var5, i52).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused222) {
                                return;
                            }
                        case 14:
                            p00Var.Y0.setRefreshing(true);
                            View inflate6 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var6 = new th2(p00Var.g0());
                                ((j3) th2Var6.h).s = inflate6;
                                th2Var6.h(p00Var.A(R.string.cancel), new c00(p00Var, 4));
                                th2Var6.j(p00Var.A(R.string.settings), new c00(p00Var, 5));
                                ImageView imageView4 = (ImageView) inflate6.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView4.setImageResource(R.drawable.ic_apps_dark);
                                    } else {
                                        imageView4.setImageResource(R.drawable.ic_apps);
                                    }
                                } catch (Exception unused23) {
                                }
                                try {
                                    ((TextView) inflate6.findViewById(R.id.info_title)).setText(p00Var.A(R.string.installed_apps));
                                } catch (Exception unused24) {
                                }
                                RecyclerView recyclerView4 = (RecyclerView) inflate6.findViewById(R.id.info_recyclerview);
                                recyclerView4.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView4.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView4, th2Var6, 2).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused25) {
                                return;
                            }
                        case 15:
                            p00Var.Y0.setRefreshing(true);
                            View inflate7 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var7 = new th2(p00Var.g0());
                                ((j3) th2Var7.h).s = inflate7;
                                th2Var7.h(p00Var.A(R.string.cancel), new c00(p00Var, 2));
                                int i17 = 3;
                                th2Var7.j(p00Var.A(R.string.settings), new c00(p00Var, 3));
                                ImageView imageView5 = (ImageView) inflate7.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView5.setImageResource(R.drawable.ic_phone_light);
                                    } else {
                                        imageView5.setImageResource(R.drawable.ic_phone);
                                    }
                                } catch (Exception unused26) {
                                }
                                try {
                                    ((TextView) inflate7.findViewById(R.id.info_title)).setText(p00Var.A(R.string.display));
                                } catch (Exception unused27) {
                                }
                                RecyclerView recyclerView5 = (RecyclerView) inflate7.findViewById(R.id.info_recyclerview);
                                recyclerView5.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView5.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView5, th2Var7, i17).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused28) {
                                return;
                            }
                        default:
                            p00 p00Var3 = this.h;
                            p00Var3.Y0.setRefreshing(true);
                            View inflate8 = p00Var3.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var8 = new th2(p00Var3.g0());
                                ((j3) th2Var8.h).s = inflate8;
                                th2Var8.h(p00Var3.A(R.string.cancel), new c00(p00Var3, 6));
                                th2Var8.j(p00Var3.A(R.string.settings), new c00(p00Var3, 7));
                                a61 s = uz1.s(p00Var3.i0(), Build.VERSION.SDK_INT);
                                ImageView imageView6 = (ImageView) inflate8.findViewById(R.id.info_icon);
                                imageView6.setImageTintList(null);
                                imageView6.setImageDrawable((Drawable) s.f11a);
                                try {
                                    ((TextView) inflate8.findViewById(R.id.info_title)).setText(p00Var3.A(R.string.operating_system));
                                } catch (Exception unused29) {
                                }
                                RecyclerView recyclerView6 = (RecyclerView) inflate8.findViewById(R.id.info_recyclerview);
                                recyclerView6.setHasFixedSize(true);
                                p00Var3.i0();
                                recyclerView6.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var3, s, recyclerView6, th2Var8, 1).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused30) {
                                return;
                            }
                    }
                }
            });
            final int i16 = 13;
            inflate.findViewById(R.id.dashboard_storage).setOnClickListener(new View.OnClickListener(this) { // from class: a00
                public final /* synthetic */ p00 h;

                {
                    this.h = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i16;
                    int i52 = 1;
                    p00 p00Var = this.h;
                    switch (i42) {
                        case 0:
                            int i62 = p00.H1;
                            try {
                                if (p00Var.n1.contains("64-bit") && !p00Var.e0) {
                                    uz1.q0(p00Var.i0());
                                } else if (p00Var.n1.contains("64-bit")) {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) BenchmarkSuiteActivity.class));
                                } else {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) CPUTimeActivity.class));
                                }
                                break;
                            } catch (Exception unused22) {
                                return;
                            }
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            int i72 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent = new Intent(p00Var.i0(), (Class<?>) BatteryActivity.class);
                                    intent.putExtra("dynamic", i51.b("prefDC"));
                                    intent.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent.putExtra("color", i51.c(6, "prefColor"));
                                    intent.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused32) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            int i82 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) ToolsActivity.class));
                                break;
                            } catch (Exception unused4) {
                                return;
                            }
                        case 3:
                            int i92 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) TestActivity.class));
                                break;
                            } catch (Exception unused5) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                            int i102 = p00.H1;
                            if (!Build.MODEL.equals("A063")) {
                                try {
                                    if (!p00Var.G()) {
                                        break;
                                    } else {
                                        th2 th2Var = new th2(p00Var.g0());
                                        j3 j3Var = (j3) th2Var.h;
                                        View inflate2 = p00Var.w().inflate(R.layout.widget_dialog_view, (ViewGroup) null);
                                        TextView textView = (TextView) inflate2.findViewById(R.id.widget_msg);
                                        j3Var.e = p00Var.A(R.string.widgets) + " BETA";
                                        if (!i51.b("prefHardwareDB").booleanValue()) {
                                            textView.setText(p00Var.A(R.string.widgets_require_pro));
                                        }
                                        j3Var.s = inflate2;
                                        th2Var.j(p00Var.A(R.string.okay), null);
                                        n3 a42 = th2Var.a();
                                        p00Var.q1 = a42;
                                        a42.show();
                                        break;
                                    }
                                } catch (Throwable unused6) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            }
                            break;
                        case 5:
                            int i112 = p00.H1;
                            p00Var.i0();
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused7) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                            int i122 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) TemperatureActivity.class));
                                break;
                            } catch (Exception unused8) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                            int i132 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent2 = new Intent(p00Var.i0(), (Class<?>) MonitorActivity.class);
                                    intent2.putExtra("dynamic", i51.b("prefDC"));
                                    intent2.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent2.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent2.putExtra("color", i51.c(6, "prefColor"));
                                    intent2.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent2);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused9) {
                                return;
                            }
                        case 8:
                            int i142 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused10) {
                                return;
                            }
                        case rt0.o /* 9 */:
                            p00 p00Var2 = this.h;
                            p00Var2.Y0.setRefreshing(true);
                            View inflate3 = p00Var2.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var2 = new th2(p00Var2.g0());
                                ((j3) th2Var2.h).s = inflate3;
                                th2Var2.h(p00Var2.A(R.string.cancel), new c00(p00Var2, 0));
                                th2Var2.j(p00Var2.A(R.string.settings), new c00(p00Var2, 1));
                                Intent registerReceiver = p00Var2.i0().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                ImageView imageView = (ImageView) inflate3.findViewById(R.id.info_icon);
                                try {
                                    int intExtra = (int) ((registerReceiver.getIntExtra("level", -1) * 100.0f) / registerReceiver.getIntExtra("scale", -1));
                                    if (uz1.d(p00Var2.i0())) {
                                        if (intExtra < 20) {
                                            imageView.setImageResource(R.drawable.ic_batt_5_light);
                                        } else if (intExtra < 40) {
                                            imageView.setImageResource(R.drawable.ic_batt_33_light);
                                        } else if (intExtra < 55) {
                                            imageView.setImageResource(R.drawable.ic_batt_50_light);
                                        } else if (intExtra < 75) {
                                            imageView.setImageResource(R.drawable.ic_batt_66_light);
                                        } else if (intExtra < 90) {
                                            imageView.setImageResource(R.drawable.ic_batt_75_light);
                                        } else {
                                            imageView.setImageResource(R.drawable.ic_batt_100_light);
                                        }
                                    } else if (intExtra < 20) {
                                        imageView.setImageResource(R.drawable.ic_batt_5_dark);
                                    } else if (intExtra < 40) {
                                        imageView.setImageResource(R.drawable.ic_batt_33_dark);
                                    } else if (intExtra < 55) {
                                        imageView.setImageResource(R.drawable.ic_batt_50_dark);
                                    } else if (intExtra < 75) {
                                        imageView.setImageResource(R.drawable.ic_batt_66_dark);
                                    } else if (intExtra < 90) {
                                        imageView.setImageResource(R.drawable.ic_batt_75_dark);
                                    } else {
                                        imageView.setImageResource(R.drawable.ic_batt_100_dark);
                                    }
                                } catch (Exception unused11) {
                                }
                                try {
                                    ((TextView) inflate3.findViewById(R.id.info_title)).setText(p00Var2.A(R.string.battery));
                                } catch (Exception unused12) {
                                }
                                RecyclerView recyclerView = (RecyclerView) inflate3.findViewById(R.id.info_recyclerview);
                                recyclerView.setHasFixedSize(true);
                                p00Var2.i0();
                                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var2, registerReceiver, recyclerView, th2Var2, 0).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused13) {
                                return;
                            }
                        case 10:
                            int i152 = p00.H1;
                            try {
                                th2 th2Var3 = new th2(p00Var.g0());
                                ((j3) th2Var3.h).g = "\n" + p00Var.A(R.string.cpu_na_msg) + "\n";
                                th2Var3.j(p00Var.A(R.string.okay), null);
                                n3 a5 = th2Var3.a();
                                p00Var.q1 = a5;
                                try {
                                    a5.show();
                                    break;
                                } catch (Exception unused14) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            } catch (NullPointerException unused15) {
                                return;
                            }
                        case 11:
                            p00Var.Y0.setRefreshing(true);
                            View inflate4 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var4 = new th2(p00Var.g0());
                                ((j3) th2Var4.h).s = inflate4;
                                th2Var4.h(p00Var.A(R.string.cancel), new c00(p00Var, 8));
                                th2Var4.j(p00Var.A(R.string.settings), new c00(p00Var, 9));
                                NetworkInfo activeNetworkInfo = ((ConnectivityManager) p00Var.i0().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                                boolean z2 = activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
                                ImageView imageView2 = (ImageView) inflate4.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        if (z2) {
                                            imageView2.setImageResource(R.drawable.ic_signal0_light);
                                        } else {
                                            imageView2.setImageResource(R.drawable.ic_wifi_light);
                                        }
                                    } else if (z2) {
                                        imageView2.setImageResource(R.drawable.ic_signal0_dark);
                                    } else {
                                        imageView2.setImageResource(R.drawable.ic_wifi_dark);
                                    }
                                } catch (Exception unused16) {
                                }
                                try {
                                    ((TextView) inflate4.findViewById(R.id.info_title)).setText(p00Var.A(R.string.network));
                                } catch (Exception unused17) {
                                }
                                RecyclerView recyclerView2 = (RecyclerView) inflate4.findViewById(R.id.info_recyclerview);
                                recyclerView2.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                new k00(p00Var, z2, recyclerView2, th2Var4).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused18) {
                                return;
                            }
                            break;
                        case 12:
                            int i162 = p00.H1;
                            try {
                                p00Var.C0();
                                break;
                            } catch (Exception unused19) {
                                return;
                            }
                        case 13:
                            p00Var.Y0.setRefreshing(true);
                            View inflate5 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var5 = new th2(p00Var.g0());
                                ((j3) th2Var5.h).s = inflate5;
                                th2Var5.h(p00Var.A(R.string.cancel), new c00(p00Var, 10));
                                th2Var5.j(p00Var.A(R.string.settings), new c00(p00Var, 11));
                                ImageView imageView3 = (ImageView) inflate5.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView3.setImageResource(R.drawable.ic_storage_light);
                                    } else {
                                        imageView3.setImageResource(R.drawable.ic_storage_dark);
                                    }
                                } catch (Exception unused20) {
                                }
                                try {
                                    ((TextView) inflate5.findViewById(R.id.info_title)).setText(p00Var.A(R.string.storage));
                                } catch (Exception unused21) {
                                }
                                RecyclerView recyclerView3 = (RecyclerView) inflate5.findViewById(R.id.info_recyclerview);
                                recyclerView3.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView3.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView3, th2Var5, i52).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused222) {
                                return;
                            }
                        case 14:
                            p00Var.Y0.setRefreshing(true);
                            View inflate6 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var6 = new th2(p00Var.g0());
                                ((j3) th2Var6.h).s = inflate6;
                                th2Var6.h(p00Var.A(R.string.cancel), new c00(p00Var, 4));
                                th2Var6.j(p00Var.A(R.string.settings), new c00(p00Var, 5));
                                ImageView imageView4 = (ImageView) inflate6.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView4.setImageResource(R.drawable.ic_apps_dark);
                                    } else {
                                        imageView4.setImageResource(R.drawable.ic_apps);
                                    }
                                } catch (Exception unused23) {
                                }
                                try {
                                    ((TextView) inflate6.findViewById(R.id.info_title)).setText(p00Var.A(R.string.installed_apps));
                                } catch (Exception unused24) {
                                }
                                RecyclerView recyclerView4 = (RecyclerView) inflate6.findViewById(R.id.info_recyclerview);
                                recyclerView4.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView4.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView4, th2Var6, 2).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused25) {
                                return;
                            }
                        case 15:
                            p00Var.Y0.setRefreshing(true);
                            View inflate7 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var7 = new th2(p00Var.g0());
                                ((j3) th2Var7.h).s = inflate7;
                                th2Var7.h(p00Var.A(R.string.cancel), new c00(p00Var, 2));
                                int i17 = 3;
                                th2Var7.j(p00Var.A(R.string.settings), new c00(p00Var, 3));
                                ImageView imageView5 = (ImageView) inflate7.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView5.setImageResource(R.drawable.ic_phone_light);
                                    } else {
                                        imageView5.setImageResource(R.drawable.ic_phone);
                                    }
                                } catch (Exception unused26) {
                                }
                                try {
                                    ((TextView) inflate7.findViewById(R.id.info_title)).setText(p00Var.A(R.string.display));
                                } catch (Exception unused27) {
                                }
                                RecyclerView recyclerView5 = (RecyclerView) inflate7.findViewById(R.id.info_recyclerview);
                                recyclerView5.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView5.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView5, th2Var7, i17).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused28) {
                                return;
                            }
                        default:
                            p00 p00Var3 = this.h;
                            p00Var3.Y0.setRefreshing(true);
                            View inflate8 = p00Var3.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var8 = new th2(p00Var3.g0());
                                ((j3) th2Var8.h).s = inflate8;
                                th2Var8.h(p00Var3.A(R.string.cancel), new c00(p00Var3, 6));
                                th2Var8.j(p00Var3.A(R.string.settings), new c00(p00Var3, 7));
                                a61 s = uz1.s(p00Var3.i0(), Build.VERSION.SDK_INT);
                                ImageView imageView6 = (ImageView) inflate8.findViewById(R.id.info_icon);
                                imageView6.setImageTintList(null);
                                imageView6.setImageDrawable((Drawable) s.f11a);
                                try {
                                    ((TextView) inflate8.findViewById(R.id.info_title)).setText(p00Var3.A(R.string.operating_system));
                                } catch (Exception unused29) {
                                }
                                RecyclerView recyclerView6 = (RecyclerView) inflate8.findViewById(R.id.info_recyclerview);
                                recyclerView6.setHasFixedSize(true);
                                p00Var3.i0();
                                recyclerView6.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var3, s, recyclerView6, th2Var8, 1).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused30) {
                                return;
                            }
                    }
                }
            });
            final int i17 = 14;
            inflate.findViewById(R.id.dashboard_apps).setOnClickListener(new View.OnClickListener(this) { // from class: a00
                public final /* synthetic */ p00 h;

                {
                    this.h = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i17;
                    int i52 = 1;
                    p00 p00Var = this.h;
                    switch (i42) {
                        case 0:
                            int i62 = p00.H1;
                            try {
                                if (p00Var.n1.contains("64-bit") && !p00Var.e0) {
                                    uz1.q0(p00Var.i0());
                                } else if (p00Var.n1.contains("64-bit")) {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) BenchmarkSuiteActivity.class));
                                } else {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) CPUTimeActivity.class));
                                }
                                break;
                            } catch (Exception unused22) {
                                return;
                            }
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            int i72 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent = new Intent(p00Var.i0(), (Class<?>) BatteryActivity.class);
                                    intent.putExtra("dynamic", i51.b("prefDC"));
                                    intent.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent.putExtra("color", i51.c(6, "prefColor"));
                                    intent.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused32) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            int i82 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) ToolsActivity.class));
                                break;
                            } catch (Exception unused4) {
                                return;
                            }
                        case 3:
                            int i92 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) TestActivity.class));
                                break;
                            } catch (Exception unused5) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                            int i102 = p00.H1;
                            if (!Build.MODEL.equals("A063")) {
                                try {
                                    if (!p00Var.G()) {
                                        break;
                                    } else {
                                        th2 th2Var = new th2(p00Var.g0());
                                        j3 j3Var = (j3) th2Var.h;
                                        View inflate2 = p00Var.w().inflate(R.layout.widget_dialog_view, (ViewGroup) null);
                                        TextView textView = (TextView) inflate2.findViewById(R.id.widget_msg);
                                        j3Var.e = p00Var.A(R.string.widgets) + " BETA";
                                        if (!i51.b("prefHardwareDB").booleanValue()) {
                                            textView.setText(p00Var.A(R.string.widgets_require_pro));
                                        }
                                        j3Var.s = inflate2;
                                        th2Var.j(p00Var.A(R.string.okay), null);
                                        n3 a42 = th2Var.a();
                                        p00Var.q1 = a42;
                                        a42.show();
                                        break;
                                    }
                                } catch (Throwable unused6) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            }
                            break;
                        case 5:
                            int i112 = p00.H1;
                            p00Var.i0();
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused7) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                            int i122 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) TemperatureActivity.class));
                                break;
                            } catch (Exception unused8) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                            int i132 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent2 = new Intent(p00Var.i0(), (Class<?>) MonitorActivity.class);
                                    intent2.putExtra("dynamic", i51.b("prefDC"));
                                    intent2.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent2.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent2.putExtra("color", i51.c(6, "prefColor"));
                                    intent2.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent2);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused9) {
                                return;
                            }
                        case 8:
                            int i142 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused10) {
                                return;
                            }
                        case rt0.o /* 9 */:
                            p00 p00Var2 = this.h;
                            p00Var2.Y0.setRefreshing(true);
                            View inflate3 = p00Var2.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var2 = new th2(p00Var2.g0());
                                ((j3) th2Var2.h).s = inflate3;
                                th2Var2.h(p00Var2.A(R.string.cancel), new c00(p00Var2, 0));
                                th2Var2.j(p00Var2.A(R.string.settings), new c00(p00Var2, 1));
                                Intent registerReceiver = p00Var2.i0().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                ImageView imageView = (ImageView) inflate3.findViewById(R.id.info_icon);
                                try {
                                    int intExtra = (int) ((registerReceiver.getIntExtra("level", -1) * 100.0f) / registerReceiver.getIntExtra("scale", -1));
                                    if (uz1.d(p00Var2.i0())) {
                                        if (intExtra < 20) {
                                            imageView.setImageResource(R.drawable.ic_batt_5_light);
                                        } else if (intExtra < 40) {
                                            imageView.setImageResource(R.drawable.ic_batt_33_light);
                                        } else if (intExtra < 55) {
                                            imageView.setImageResource(R.drawable.ic_batt_50_light);
                                        } else if (intExtra < 75) {
                                            imageView.setImageResource(R.drawable.ic_batt_66_light);
                                        } else if (intExtra < 90) {
                                            imageView.setImageResource(R.drawable.ic_batt_75_light);
                                        } else {
                                            imageView.setImageResource(R.drawable.ic_batt_100_light);
                                        }
                                    } else if (intExtra < 20) {
                                        imageView.setImageResource(R.drawable.ic_batt_5_dark);
                                    } else if (intExtra < 40) {
                                        imageView.setImageResource(R.drawable.ic_batt_33_dark);
                                    } else if (intExtra < 55) {
                                        imageView.setImageResource(R.drawable.ic_batt_50_dark);
                                    } else if (intExtra < 75) {
                                        imageView.setImageResource(R.drawable.ic_batt_66_dark);
                                    } else if (intExtra < 90) {
                                        imageView.setImageResource(R.drawable.ic_batt_75_dark);
                                    } else {
                                        imageView.setImageResource(R.drawable.ic_batt_100_dark);
                                    }
                                } catch (Exception unused11) {
                                }
                                try {
                                    ((TextView) inflate3.findViewById(R.id.info_title)).setText(p00Var2.A(R.string.battery));
                                } catch (Exception unused12) {
                                }
                                RecyclerView recyclerView = (RecyclerView) inflate3.findViewById(R.id.info_recyclerview);
                                recyclerView.setHasFixedSize(true);
                                p00Var2.i0();
                                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var2, registerReceiver, recyclerView, th2Var2, 0).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused13) {
                                return;
                            }
                        case 10:
                            int i152 = p00.H1;
                            try {
                                th2 th2Var3 = new th2(p00Var.g0());
                                ((j3) th2Var3.h).g = "\n" + p00Var.A(R.string.cpu_na_msg) + "\n";
                                th2Var3.j(p00Var.A(R.string.okay), null);
                                n3 a5 = th2Var3.a();
                                p00Var.q1 = a5;
                                try {
                                    a5.show();
                                    break;
                                } catch (Exception unused14) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            } catch (NullPointerException unused15) {
                                return;
                            }
                        case 11:
                            p00Var.Y0.setRefreshing(true);
                            View inflate4 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var4 = new th2(p00Var.g0());
                                ((j3) th2Var4.h).s = inflate4;
                                th2Var4.h(p00Var.A(R.string.cancel), new c00(p00Var, 8));
                                th2Var4.j(p00Var.A(R.string.settings), new c00(p00Var, 9));
                                NetworkInfo activeNetworkInfo = ((ConnectivityManager) p00Var.i0().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                                boolean z2 = activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
                                ImageView imageView2 = (ImageView) inflate4.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        if (z2) {
                                            imageView2.setImageResource(R.drawable.ic_signal0_light);
                                        } else {
                                            imageView2.setImageResource(R.drawable.ic_wifi_light);
                                        }
                                    } else if (z2) {
                                        imageView2.setImageResource(R.drawable.ic_signal0_dark);
                                    } else {
                                        imageView2.setImageResource(R.drawable.ic_wifi_dark);
                                    }
                                } catch (Exception unused16) {
                                }
                                try {
                                    ((TextView) inflate4.findViewById(R.id.info_title)).setText(p00Var.A(R.string.network));
                                } catch (Exception unused17) {
                                }
                                RecyclerView recyclerView2 = (RecyclerView) inflate4.findViewById(R.id.info_recyclerview);
                                recyclerView2.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                new k00(p00Var, z2, recyclerView2, th2Var4).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused18) {
                                return;
                            }
                            break;
                        case 12:
                            int i162 = p00.H1;
                            try {
                                p00Var.C0();
                                break;
                            } catch (Exception unused19) {
                                return;
                            }
                        case 13:
                            p00Var.Y0.setRefreshing(true);
                            View inflate5 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var5 = new th2(p00Var.g0());
                                ((j3) th2Var5.h).s = inflate5;
                                th2Var5.h(p00Var.A(R.string.cancel), new c00(p00Var, 10));
                                th2Var5.j(p00Var.A(R.string.settings), new c00(p00Var, 11));
                                ImageView imageView3 = (ImageView) inflate5.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView3.setImageResource(R.drawable.ic_storage_light);
                                    } else {
                                        imageView3.setImageResource(R.drawable.ic_storage_dark);
                                    }
                                } catch (Exception unused20) {
                                }
                                try {
                                    ((TextView) inflate5.findViewById(R.id.info_title)).setText(p00Var.A(R.string.storage));
                                } catch (Exception unused21) {
                                }
                                RecyclerView recyclerView3 = (RecyclerView) inflate5.findViewById(R.id.info_recyclerview);
                                recyclerView3.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView3.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView3, th2Var5, i52).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused222) {
                                return;
                            }
                        case 14:
                            p00Var.Y0.setRefreshing(true);
                            View inflate6 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var6 = new th2(p00Var.g0());
                                ((j3) th2Var6.h).s = inflate6;
                                th2Var6.h(p00Var.A(R.string.cancel), new c00(p00Var, 4));
                                th2Var6.j(p00Var.A(R.string.settings), new c00(p00Var, 5));
                                ImageView imageView4 = (ImageView) inflate6.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView4.setImageResource(R.drawable.ic_apps_dark);
                                    } else {
                                        imageView4.setImageResource(R.drawable.ic_apps);
                                    }
                                } catch (Exception unused23) {
                                }
                                try {
                                    ((TextView) inflate6.findViewById(R.id.info_title)).setText(p00Var.A(R.string.installed_apps));
                                } catch (Exception unused24) {
                                }
                                RecyclerView recyclerView4 = (RecyclerView) inflate6.findViewById(R.id.info_recyclerview);
                                recyclerView4.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView4.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView4, th2Var6, 2).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused25) {
                                return;
                            }
                        case 15:
                            p00Var.Y0.setRefreshing(true);
                            View inflate7 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var7 = new th2(p00Var.g0());
                                ((j3) th2Var7.h).s = inflate7;
                                th2Var7.h(p00Var.A(R.string.cancel), new c00(p00Var, 2));
                                int i172 = 3;
                                th2Var7.j(p00Var.A(R.string.settings), new c00(p00Var, 3));
                                ImageView imageView5 = (ImageView) inflate7.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView5.setImageResource(R.drawable.ic_phone_light);
                                    } else {
                                        imageView5.setImageResource(R.drawable.ic_phone);
                                    }
                                } catch (Exception unused26) {
                                }
                                try {
                                    ((TextView) inflate7.findViewById(R.id.info_title)).setText(p00Var.A(R.string.display));
                                } catch (Exception unused27) {
                                }
                                RecyclerView recyclerView5 = (RecyclerView) inflate7.findViewById(R.id.info_recyclerview);
                                recyclerView5.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView5.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView5, th2Var7, i172).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused28) {
                                return;
                            }
                        default:
                            p00 p00Var3 = this.h;
                            p00Var3.Y0.setRefreshing(true);
                            View inflate8 = p00Var3.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var8 = new th2(p00Var3.g0());
                                ((j3) th2Var8.h).s = inflate8;
                                th2Var8.h(p00Var3.A(R.string.cancel), new c00(p00Var3, 6));
                                th2Var8.j(p00Var3.A(R.string.settings), new c00(p00Var3, 7));
                                a61 s = uz1.s(p00Var3.i0(), Build.VERSION.SDK_INT);
                                ImageView imageView6 = (ImageView) inflate8.findViewById(R.id.info_icon);
                                imageView6.setImageTintList(null);
                                imageView6.setImageDrawable((Drawable) s.f11a);
                                try {
                                    ((TextView) inflate8.findViewById(R.id.info_title)).setText(p00Var3.A(R.string.operating_system));
                                } catch (Exception unused29) {
                                }
                                RecyclerView recyclerView6 = (RecyclerView) inflate8.findViewById(R.id.info_recyclerview);
                                recyclerView6.setHasFixedSize(true);
                                p00Var3.i0();
                                recyclerView6.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var3, s, recyclerView6, th2Var8, 1).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused30) {
                                return;
                            }
                    }
                }
            });
            final int i18 = 15;
            inflate.findViewById(R.id.dashboard_display).setOnClickListener(new View.OnClickListener(this) { // from class: a00
                public final /* synthetic */ p00 h;

                {
                    this.h = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i18;
                    int i52 = 1;
                    p00 p00Var = this.h;
                    switch (i42) {
                        case 0:
                            int i62 = p00.H1;
                            try {
                                if (p00Var.n1.contains("64-bit") && !p00Var.e0) {
                                    uz1.q0(p00Var.i0());
                                } else if (p00Var.n1.contains("64-bit")) {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) BenchmarkSuiteActivity.class));
                                } else {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) CPUTimeActivity.class));
                                }
                                break;
                            } catch (Exception unused22) {
                                return;
                            }
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            int i72 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent = new Intent(p00Var.i0(), (Class<?>) BatteryActivity.class);
                                    intent.putExtra("dynamic", i51.b("prefDC"));
                                    intent.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent.putExtra("color", i51.c(6, "prefColor"));
                                    intent.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused32) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            int i82 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) ToolsActivity.class));
                                break;
                            } catch (Exception unused4) {
                                return;
                            }
                        case 3:
                            int i92 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) TestActivity.class));
                                break;
                            } catch (Exception unused5) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                            int i102 = p00.H1;
                            if (!Build.MODEL.equals("A063")) {
                                try {
                                    if (!p00Var.G()) {
                                        break;
                                    } else {
                                        th2 th2Var = new th2(p00Var.g0());
                                        j3 j3Var = (j3) th2Var.h;
                                        View inflate2 = p00Var.w().inflate(R.layout.widget_dialog_view, (ViewGroup) null);
                                        TextView textView = (TextView) inflate2.findViewById(R.id.widget_msg);
                                        j3Var.e = p00Var.A(R.string.widgets) + " BETA";
                                        if (!i51.b("prefHardwareDB").booleanValue()) {
                                            textView.setText(p00Var.A(R.string.widgets_require_pro));
                                        }
                                        j3Var.s = inflate2;
                                        th2Var.j(p00Var.A(R.string.okay), null);
                                        n3 a42 = th2Var.a();
                                        p00Var.q1 = a42;
                                        a42.show();
                                        break;
                                    }
                                } catch (Throwable unused6) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            }
                            break;
                        case 5:
                            int i112 = p00.H1;
                            p00Var.i0();
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused7) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                            int i122 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) TemperatureActivity.class));
                                break;
                            } catch (Exception unused8) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                            int i132 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent2 = new Intent(p00Var.i0(), (Class<?>) MonitorActivity.class);
                                    intent2.putExtra("dynamic", i51.b("prefDC"));
                                    intent2.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent2.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent2.putExtra("color", i51.c(6, "prefColor"));
                                    intent2.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent2);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused9) {
                                return;
                            }
                        case 8:
                            int i142 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused10) {
                                return;
                            }
                        case rt0.o /* 9 */:
                            p00 p00Var2 = this.h;
                            p00Var2.Y0.setRefreshing(true);
                            View inflate3 = p00Var2.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var2 = new th2(p00Var2.g0());
                                ((j3) th2Var2.h).s = inflate3;
                                th2Var2.h(p00Var2.A(R.string.cancel), new c00(p00Var2, 0));
                                th2Var2.j(p00Var2.A(R.string.settings), new c00(p00Var2, 1));
                                Intent registerReceiver = p00Var2.i0().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                ImageView imageView = (ImageView) inflate3.findViewById(R.id.info_icon);
                                try {
                                    int intExtra = (int) ((registerReceiver.getIntExtra("level", -1) * 100.0f) / registerReceiver.getIntExtra("scale", -1));
                                    if (uz1.d(p00Var2.i0())) {
                                        if (intExtra < 20) {
                                            imageView.setImageResource(R.drawable.ic_batt_5_light);
                                        } else if (intExtra < 40) {
                                            imageView.setImageResource(R.drawable.ic_batt_33_light);
                                        } else if (intExtra < 55) {
                                            imageView.setImageResource(R.drawable.ic_batt_50_light);
                                        } else if (intExtra < 75) {
                                            imageView.setImageResource(R.drawable.ic_batt_66_light);
                                        } else if (intExtra < 90) {
                                            imageView.setImageResource(R.drawable.ic_batt_75_light);
                                        } else {
                                            imageView.setImageResource(R.drawable.ic_batt_100_light);
                                        }
                                    } else if (intExtra < 20) {
                                        imageView.setImageResource(R.drawable.ic_batt_5_dark);
                                    } else if (intExtra < 40) {
                                        imageView.setImageResource(R.drawable.ic_batt_33_dark);
                                    } else if (intExtra < 55) {
                                        imageView.setImageResource(R.drawable.ic_batt_50_dark);
                                    } else if (intExtra < 75) {
                                        imageView.setImageResource(R.drawable.ic_batt_66_dark);
                                    } else if (intExtra < 90) {
                                        imageView.setImageResource(R.drawable.ic_batt_75_dark);
                                    } else {
                                        imageView.setImageResource(R.drawable.ic_batt_100_dark);
                                    }
                                } catch (Exception unused11) {
                                }
                                try {
                                    ((TextView) inflate3.findViewById(R.id.info_title)).setText(p00Var2.A(R.string.battery));
                                } catch (Exception unused12) {
                                }
                                RecyclerView recyclerView = (RecyclerView) inflate3.findViewById(R.id.info_recyclerview);
                                recyclerView.setHasFixedSize(true);
                                p00Var2.i0();
                                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var2, registerReceiver, recyclerView, th2Var2, 0).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused13) {
                                return;
                            }
                        case 10:
                            int i152 = p00.H1;
                            try {
                                th2 th2Var3 = new th2(p00Var.g0());
                                ((j3) th2Var3.h).g = "\n" + p00Var.A(R.string.cpu_na_msg) + "\n";
                                th2Var3.j(p00Var.A(R.string.okay), null);
                                n3 a5 = th2Var3.a();
                                p00Var.q1 = a5;
                                try {
                                    a5.show();
                                    break;
                                } catch (Exception unused14) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            } catch (NullPointerException unused15) {
                                return;
                            }
                        case 11:
                            p00Var.Y0.setRefreshing(true);
                            View inflate4 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var4 = new th2(p00Var.g0());
                                ((j3) th2Var4.h).s = inflate4;
                                th2Var4.h(p00Var.A(R.string.cancel), new c00(p00Var, 8));
                                th2Var4.j(p00Var.A(R.string.settings), new c00(p00Var, 9));
                                NetworkInfo activeNetworkInfo = ((ConnectivityManager) p00Var.i0().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                                boolean z2 = activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
                                ImageView imageView2 = (ImageView) inflate4.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        if (z2) {
                                            imageView2.setImageResource(R.drawable.ic_signal0_light);
                                        } else {
                                            imageView2.setImageResource(R.drawable.ic_wifi_light);
                                        }
                                    } else if (z2) {
                                        imageView2.setImageResource(R.drawable.ic_signal0_dark);
                                    } else {
                                        imageView2.setImageResource(R.drawable.ic_wifi_dark);
                                    }
                                } catch (Exception unused16) {
                                }
                                try {
                                    ((TextView) inflate4.findViewById(R.id.info_title)).setText(p00Var.A(R.string.network));
                                } catch (Exception unused17) {
                                }
                                RecyclerView recyclerView2 = (RecyclerView) inflate4.findViewById(R.id.info_recyclerview);
                                recyclerView2.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                new k00(p00Var, z2, recyclerView2, th2Var4).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused18) {
                                return;
                            }
                            break;
                        case 12:
                            int i162 = p00.H1;
                            try {
                                p00Var.C0();
                                break;
                            } catch (Exception unused19) {
                                return;
                            }
                        case 13:
                            p00Var.Y0.setRefreshing(true);
                            View inflate5 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var5 = new th2(p00Var.g0());
                                ((j3) th2Var5.h).s = inflate5;
                                th2Var5.h(p00Var.A(R.string.cancel), new c00(p00Var, 10));
                                th2Var5.j(p00Var.A(R.string.settings), new c00(p00Var, 11));
                                ImageView imageView3 = (ImageView) inflate5.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView3.setImageResource(R.drawable.ic_storage_light);
                                    } else {
                                        imageView3.setImageResource(R.drawable.ic_storage_dark);
                                    }
                                } catch (Exception unused20) {
                                }
                                try {
                                    ((TextView) inflate5.findViewById(R.id.info_title)).setText(p00Var.A(R.string.storage));
                                } catch (Exception unused21) {
                                }
                                RecyclerView recyclerView3 = (RecyclerView) inflate5.findViewById(R.id.info_recyclerview);
                                recyclerView3.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView3.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView3, th2Var5, i52).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused222) {
                                return;
                            }
                        case 14:
                            p00Var.Y0.setRefreshing(true);
                            View inflate6 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var6 = new th2(p00Var.g0());
                                ((j3) th2Var6.h).s = inflate6;
                                th2Var6.h(p00Var.A(R.string.cancel), new c00(p00Var, 4));
                                th2Var6.j(p00Var.A(R.string.settings), new c00(p00Var, 5));
                                ImageView imageView4 = (ImageView) inflate6.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView4.setImageResource(R.drawable.ic_apps_dark);
                                    } else {
                                        imageView4.setImageResource(R.drawable.ic_apps);
                                    }
                                } catch (Exception unused23) {
                                }
                                try {
                                    ((TextView) inflate6.findViewById(R.id.info_title)).setText(p00Var.A(R.string.installed_apps));
                                } catch (Exception unused24) {
                                }
                                RecyclerView recyclerView4 = (RecyclerView) inflate6.findViewById(R.id.info_recyclerview);
                                recyclerView4.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView4.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView4, th2Var6, 2).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused25) {
                                return;
                            }
                        case 15:
                            p00Var.Y0.setRefreshing(true);
                            View inflate7 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var7 = new th2(p00Var.g0());
                                ((j3) th2Var7.h).s = inflate7;
                                th2Var7.h(p00Var.A(R.string.cancel), new c00(p00Var, 2));
                                int i172 = 3;
                                th2Var7.j(p00Var.A(R.string.settings), new c00(p00Var, 3));
                                ImageView imageView5 = (ImageView) inflate7.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView5.setImageResource(R.drawable.ic_phone_light);
                                    } else {
                                        imageView5.setImageResource(R.drawable.ic_phone);
                                    }
                                } catch (Exception unused26) {
                                }
                                try {
                                    ((TextView) inflate7.findViewById(R.id.info_title)).setText(p00Var.A(R.string.display));
                                } catch (Exception unused27) {
                                }
                                RecyclerView recyclerView5 = (RecyclerView) inflate7.findViewById(R.id.info_recyclerview);
                                recyclerView5.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView5.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView5, th2Var7, i172).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused28) {
                                return;
                            }
                        default:
                            p00 p00Var3 = this.h;
                            p00Var3.Y0.setRefreshing(true);
                            View inflate8 = p00Var3.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var8 = new th2(p00Var3.g0());
                                ((j3) th2Var8.h).s = inflate8;
                                th2Var8.h(p00Var3.A(R.string.cancel), new c00(p00Var3, 6));
                                th2Var8.j(p00Var3.A(R.string.settings), new c00(p00Var3, 7));
                                a61 s = uz1.s(p00Var3.i0(), Build.VERSION.SDK_INT);
                                ImageView imageView6 = (ImageView) inflate8.findViewById(R.id.info_icon);
                                imageView6.setImageTintList(null);
                                imageView6.setImageDrawable((Drawable) s.f11a);
                                try {
                                    ((TextView) inflate8.findViewById(R.id.info_title)).setText(p00Var3.A(R.string.operating_system));
                                } catch (Exception unused29) {
                                }
                                RecyclerView recyclerView6 = (RecyclerView) inflate8.findViewById(R.id.info_recyclerview);
                                recyclerView6.setHasFixedSize(true);
                                p00Var3.i0();
                                recyclerView6.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var3, s, recyclerView6, th2Var8, 1).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused30) {
                                return;
                            }
                    }
                }
            });
            this.g1 = inflate.findViewById(R.id.batnetcard);
            this.h1 = inflate.findViewById(R.id.ramstoragecard);
            this.i1 = inflate.findViewById(R.id.appsdisplaycard);
            this.j1 = inflate.findViewById(R.id.button_card);
            this.k1 = inflate.findViewById(R.id.button2_card);
            View findViewById2 = inflate.findViewById(R.id.dashboard_system);
            this.f1 = findViewById2;
            final int i19 = 16;
            findViewById2.setOnClickListener(new View.OnClickListener(this) { // from class: a00
                public final /* synthetic */ p00 h;

                {
                    this.h = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i19;
                    int i52 = 1;
                    p00 p00Var = this.h;
                    switch (i42) {
                        case 0:
                            int i62 = p00.H1;
                            try {
                                if (p00Var.n1.contains("64-bit") && !p00Var.e0) {
                                    uz1.q0(p00Var.i0());
                                } else if (p00Var.n1.contains("64-bit")) {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) BenchmarkSuiteActivity.class));
                                } else {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) CPUTimeActivity.class));
                                }
                                break;
                            } catch (Exception unused22) {
                                return;
                            }
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            int i72 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent = new Intent(p00Var.i0(), (Class<?>) BatteryActivity.class);
                                    intent.putExtra("dynamic", i51.b("prefDC"));
                                    intent.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent.putExtra("color", i51.c(6, "prefColor"));
                                    intent.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused32) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            int i82 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) ToolsActivity.class));
                                break;
                            } catch (Exception unused4) {
                                return;
                            }
                        case 3:
                            int i92 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) TestActivity.class));
                                break;
                            } catch (Exception unused5) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                            int i102 = p00.H1;
                            if (!Build.MODEL.equals("A063")) {
                                try {
                                    if (!p00Var.G()) {
                                        break;
                                    } else {
                                        th2 th2Var = new th2(p00Var.g0());
                                        j3 j3Var = (j3) th2Var.h;
                                        View inflate2 = p00Var.w().inflate(R.layout.widget_dialog_view, (ViewGroup) null);
                                        TextView textView = (TextView) inflate2.findViewById(R.id.widget_msg);
                                        j3Var.e = p00Var.A(R.string.widgets) + " BETA";
                                        if (!i51.b("prefHardwareDB").booleanValue()) {
                                            textView.setText(p00Var.A(R.string.widgets_require_pro));
                                        }
                                        j3Var.s = inflate2;
                                        th2Var.j(p00Var.A(R.string.okay), null);
                                        n3 a42 = th2Var.a();
                                        p00Var.q1 = a42;
                                        a42.show();
                                        break;
                                    }
                                } catch (Throwable unused6) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            }
                            break;
                        case 5:
                            int i112 = p00.H1;
                            p00Var.i0();
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused7) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                            int i122 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) TemperatureActivity.class));
                                break;
                            } catch (Exception unused8) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                            int i132 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent2 = new Intent(p00Var.i0(), (Class<?>) MonitorActivity.class);
                                    intent2.putExtra("dynamic", i51.b("prefDC"));
                                    intent2.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent2.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent2.putExtra("color", i51.c(6, "prefColor"));
                                    intent2.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent2);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused9) {
                                return;
                            }
                        case 8:
                            int i142 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused10) {
                                return;
                            }
                        case rt0.o /* 9 */:
                            p00 p00Var2 = this.h;
                            p00Var2.Y0.setRefreshing(true);
                            View inflate3 = p00Var2.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var2 = new th2(p00Var2.g0());
                                ((j3) th2Var2.h).s = inflate3;
                                th2Var2.h(p00Var2.A(R.string.cancel), new c00(p00Var2, 0));
                                th2Var2.j(p00Var2.A(R.string.settings), new c00(p00Var2, 1));
                                Intent registerReceiver = p00Var2.i0().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                ImageView imageView = (ImageView) inflate3.findViewById(R.id.info_icon);
                                try {
                                    int intExtra = (int) ((registerReceiver.getIntExtra("level", -1) * 100.0f) / registerReceiver.getIntExtra("scale", -1));
                                    if (uz1.d(p00Var2.i0())) {
                                        if (intExtra < 20) {
                                            imageView.setImageResource(R.drawable.ic_batt_5_light);
                                        } else if (intExtra < 40) {
                                            imageView.setImageResource(R.drawable.ic_batt_33_light);
                                        } else if (intExtra < 55) {
                                            imageView.setImageResource(R.drawable.ic_batt_50_light);
                                        } else if (intExtra < 75) {
                                            imageView.setImageResource(R.drawable.ic_batt_66_light);
                                        } else if (intExtra < 90) {
                                            imageView.setImageResource(R.drawable.ic_batt_75_light);
                                        } else {
                                            imageView.setImageResource(R.drawable.ic_batt_100_light);
                                        }
                                    } else if (intExtra < 20) {
                                        imageView.setImageResource(R.drawable.ic_batt_5_dark);
                                    } else if (intExtra < 40) {
                                        imageView.setImageResource(R.drawable.ic_batt_33_dark);
                                    } else if (intExtra < 55) {
                                        imageView.setImageResource(R.drawable.ic_batt_50_dark);
                                    } else if (intExtra < 75) {
                                        imageView.setImageResource(R.drawable.ic_batt_66_dark);
                                    } else if (intExtra < 90) {
                                        imageView.setImageResource(R.drawable.ic_batt_75_dark);
                                    } else {
                                        imageView.setImageResource(R.drawable.ic_batt_100_dark);
                                    }
                                } catch (Exception unused11) {
                                }
                                try {
                                    ((TextView) inflate3.findViewById(R.id.info_title)).setText(p00Var2.A(R.string.battery));
                                } catch (Exception unused12) {
                                }
                                RecyclerView recyclerView = (RecyclerView) inflate3.findViewById(R.id.info_recyclerview);
                                recyclerView.setHasFixedSize(true);
                                p00Var2.i0();
                                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var2, registerReceiver, recyclerView, th2Var2, 0).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused13) {
                                return;
                            }
                        case 10:
                            int i152 = p00.H1;
                            try {
                                th2 th2Var3 = new th2(p00Var.g0());
                                ((j3) th2Var3.h).g = "\n" + p00Var.A(R.string.cpu_na_msg) + "\n";
                                th2Var3.j(p00Var.A(R.string.okay), null);
                                n3 a5 = th2Var3.a();
                                p00Var.q1 = a5;
                                try {
                                    a5.show();
                                    break;
                                } catch (Exception unused14) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            } catch (NullPointerException unused15) {
                                return;
                            }
                        case 11:
                            p00Var.Y0.setRefreshing(true);
                            View inflate4 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var4 = new th2(p00Var.g0());
                                ((j3) th2Var4.h).s = inflate4;
                                th2Var4.h(p00Var.A(R.string.cancel), new c00(p00Var, 8));
                                th2Var4.j(p00Var.A(R.string.settings), new c00(p00Var, 9));
                                NetworkInfo activeNetworkInfo = ((ConnectivityManager) p00Var.i0().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                                boolean z2 = activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
                                ImageView imageView2 = (ImageView) inflate4.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        if (z2) {
                                            imageView2.setImageResource(R.drawable.ic_signal0_light);
                                        } else {
                                            imageView2.setImageResource(R.drawable.ic_wifi_light);
                                        }
                                    } else if (z2) {
                                        imageView2.setImageResource(R.drawable.ic_signal0_dark);
                                    } else {
                                        imageView2.setImageResource(R.drawable.ic_wifi_dark);
                                    }
                                } catch (Exception unused16) {
                                }
                                try {
                                    ((TextView) inflate4.findViewById(R.id.info_title)).setText(p00Var.A(R.string.network));
                                } catch (Exception unused17) {
                                }
                                RecyclerView recyclerView2 = (RecyclerView) inflate4.findViewById(R.id.info_recyclerview);
                                recyclerView2.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                new k00(p00Var, z2, recyclerView2, th2Var4).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused18) {
                                return;
                            }
                            break;
                        case 12:
                            int i162 = p00.H1;
                            try {
                                p00Var.C0();
                                break;
                            } catch (Exception unused19) {
                                return;
                            }
                        case 13:
                            p00Var.Y0.setRefreshing(true);
                            View inflate5 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var5 = new th2(p00Var.g0());
                                ((j3) th2Var5.h).s = inflate5;
                                th2Var5.h(p00Var.A(R.string.cancel), new c00(p00Var, 10));
                                th2Var5.j(p00Var.A(R.string.settings), new c00(p00Var, 11));
                                ImageView imageView3 = (ImageView) inflate5.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView3.setImageResource(R.drawable.ic_storage_light);
                                    } else {
                                        imageView3.setImageResource(R.drawable.ic_storage_dark);
                                    }
                                } catch (Exception unused20) {
                                }
                                try {
                                    ((TextView) inflate5.findViewById(R.id.info_title)).setText(p00Var.A(R.string.storage));
                                } catch (Exception unused21) {
                                }
                                RecyclerView recyclerView3 = (RecyclerView) inflate5.findViewById(R.id.info_recyclerview);
                                recyclerView3.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView3.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView3, th2Var5, i52).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused222) {
                                return;
                            }
                        case 14:
                            p00Var.Y0.setRefreshing(true);
                            View inflate6 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var6 = new th2(p00Var.g0());
                                ((j3) th2Var6.h).s = inflate6;
                                th2Var6.h(p00Var.A(R.string.cancel), new c00(p00Var, 4));
                                th2Var6.j(p00Var.A(R.string.settings), new c00(p00Var, 5));
                                ImageView imageView4 = (ImageView) inflate6.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView4.setImageResource(R.drawable.ic_apps_dark);
                                    } else {
                                        imageView4.setImageResource(R.drawable.ic_apps);
                                    }
                                } catch (Exception unused23) {
                                }
                                try {
                                    ((TextView) inflate6.findViewById(R.id.info_title)).setText(p00Var.A(R.string.installed_apps));
                                } catch (Exception unused24) {
                                }
                                RecyclerView recyclerView4 = (RecyclerView) inflate6.findViewById(R.id.info_recyclerview);
                                recyclerView4.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView4.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView4, th2Var6, 2).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused25) {
                                return;
                            }
                        case 15:
                            p00Var.Y0.setRefreshing(true);
                            View inflate7 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var7 = new th2(p00Var.g0());
                                ((j3) th2Var7.h).s = inflate7;
                                th2Var7.h(p00Var.A(R.string.cancel), new c00(p00Var, 2));
                                int i172 = 3;
                                th2Var7.j(p00Var.A(R.string.settings), new c00(p00Var, 3));
                                ImageView imageView5 = (ImageView) inflate7.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView5.setImageResource(R.drawable.ic_phone_light);
                                    } else {
                                        imageView5.setImageResource(R.drawable.ic_phone);
                                    }
                                } catch (Exception unused26) {
                                }
                                try {
                                    ((TextView) inflate7.findViewById(R.id.info_title)).setText(p00Var.A(R.string.display));
                                } catch (Exception unused27) {
                                }
                                RecyclerView recyclerView5 = (RecyclerView) inflate7.findViewById(R.id.info_recyclerview);
                                recyclerView5.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView5.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView5, th2Var7, i172).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused28) {
                                return;
                            }
                        default:
                            p00 p00Var3 = this.h;
                            p00Var3.Y0.setRefreshing(true);
                            View inflate8 = p00Var3.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var8 = new th2(p00Var3.g0());
                                ((j3) th2Var8.h).s = inflate8;
                                th2Var8.h(p00Var3.A(R.string.cancel), new c00(p00Var3, 6));
                                th2Var8.j(p00Var3.A(R.string.settings), new c00(p00Var3, 7));
                                a61 s = uz1.s(p00Var3.i0(), Build.VERSION.SDK_INT);
                                ImageView imageView6 = (ImageView) inflate8.findViewById(R.id.info_icon);
                                imageView6.setImageTintList(null);
                                imageView6.setImageDrawable((Drawable) s.f11a);
                                try {
                                    ((TextView) inflate8.findViewById(R.id.info_title)).setText(p00Var3.A(R.string.operating_system));
                                } catch (Exception unused29) {
                                }
                                RecyclerView recyclerView6 = (RecyclerView) inflate8.findViewById(R.id.info_recyclerview);
                                recyclerView6.setHasFixedSize(true);
                                p00Var3.i0();
                                recyclerView6.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var3, s, recyclerView6, th2Var8, 1).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused30) {
                                return;
                            }
                    }
                }
            });
            this.y0 = (TextView) inflate.findViewById(R.id.model);
            this.A0 = (TextView) inflate.findViewById(R.id.soc);
            m00 y08 = y0(i0());
            y08.setTextColor(this.A0.getTextColors().getDefaultColor());
            y08.setTypeface(this.A0.getTypeface());
            y08.setSingleLine();
            y08.setEllipsize(truncateAt2);
            y08.setTextSize(0, z().getDimension(R.dimen.dashboard_small_font_size));
            B0(this.A0, y08);
            this.A0 = y08;
            this.z0 = (ImageView) inflate.findViewById(R.id.logo);
            TextView textView = (TextView) inflate.findViewById(R.id.android_version);
            CharSequence charSequence = (CharSequence) uz1.s(i0(), Build.VERSION.SDK_INT).b;
            TextView.BufferType bufferType = TextView.BufferType.NORMAL;
            textView.setText(charSequence, bufferType);
            final int i20 = 8;
            if (i51.g("prefProcessor")) {
                String e2 = i51.e("prefProcessor");
                if (e2 == null || e2.isEmpty()) {
                    this.A0.setVisibility(8);
                } else {
                    this.A0.setVisibility(0);
                    this.A0.setText(i51.e("prefProcessor"), bufferType);
                }
            } else {
                this.A0.setVisibility(8);
            }
            CpuLoadGraphView cpuLoadGraphView = (CpuLoadGraphView) inflate.findViewById(R.id.cpumon_graph);
            this.o1 = cpuLoadGraphView;
            cpuLoadGraphView.setLineColor(this.s1);
            this.o1.setMaxValue(100.0f);
            this.o1.a(0.0f);
            this.o1.setVisibility(0);
            this.o1.setOnClickListener(new View.OnClickListener(this) { // from class: a00
                public final /* synthetic */ p00 h;

                {
                    this.h = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i42 = i20;
                    int i52 = 1;
                    p00 p00Var = this.h;
                    switch (i42) {
                        case 0:
                            int i62 = p00.H1;
                            try {
                                if (p00Var.n1.contains("64-bit") && !p00Var.e0) {
                                    uz1.q0(p00Var.i0());
                                } else if (p00Var.n1.contains("64-bit")) {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) BenchmarkSuiteActivity.class));
                                } else {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) CPUTimeActivity.class));
                                }
                                break;
                            } catch (Exception unused22) {
                                return;
                            }
                            break;
                        case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                            int i72 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent = new Intent(p00Var.i0(), (Class<?>) BatteryActivity.class);
                                    intent.putExtra("dynamic", i51.b("prefDC"));
                                    intent.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent.putExtra("color", i51.c(6, "prefColor"));
                                    intent.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused32) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                            int i82 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) ToolsActivity.class));
                                break;
                            } catch (Exception unused4) {
                                return;
                            }
                        case 3:
                            int i92 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.g0(), (Class<?>) TestActivity.class));
                                break;
                            } catch (Exception unused5) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                            int i102 = p00.H1;
                            if (!Build.MODEL.equals("A063")) {
                                try {
                                    if (!p00Var.G()) {
                                        break;
                                    } else {
                                        th2 th2Var = new th2(p00Var.g0());
                                        j3 j3Var = (j3) th2Var.h;
                                        View inflate2 = p00Var.w().inflate(R.layout.widget_dialog_view, (ViewGroup) null);
                                        TextView textView2 = (TextView) inflate2.findViewById(R.id.widget_msg);
                                        j3Var.e = p00Var.A(R.string.widgets) + " BETA";
                                        if (!i51.b("prefHardwareDB").booleanValue()) {
                                            textView2.setText(p00Var.A(R.string.widgets_require_pro));
                                        }
                                        j3Var.s = inflate2;
                                        th2Var.j(p00Var.A(R.string.okay), null);
                                        n3 a42 = th2Var.a();
                                        p00Var.q1 = a42;
                                        a42.show();
                                        break;
                                    }
                                } catch (Throwable unused6) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            }
                            break;
                        case 5:
                            int i112 = p00.H1;
                            p00Var.i0();
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused7) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                            int i122 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) TemperatureActivity.class));
                                break;
                            } catch (Exception unused8) {
                                return;
                            }
                        case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                            int i132 = p00.H1;
                            try {
                                if (p00Var.e0) {
                                    Intent intent2 = new Intent(p00Var.i0(), (Class<?>) MonitorActivity.class);
                                    intent2.putExtra("dynamic", i51.b("prefDC"));
                                    intent2.putExtra("darktheme", i51.b("prefDarkTheme"));
                                    intent2.putExtra("systheme", i51.b("prefSysTheme"));
                                    intent2.putExtra("color", i51.c(6, "prefColor"));
                                    intent2.putExtra("language", i51.e("prefLanguage"));
                                    p00Var.s0(intent2);
                                } else {
                                    uz1.q0(p00Var.i0());
                                }
                                break;
                            } catch (Exception unused9) {
                                return;
                            }
                        case 8:
                            int i142 = p00.H1;
                            try {
                                p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                break;
                            } catch (Exception unused10) {
                                return;
                            }
                        case rt0.o /* 9 */:
                            p00 p00Var2 = this.h;
                            p00Var2.Y0.setRefreshing(true);
                            View inflate3 = p00Var2.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var2 = new th2(p00Var2.g0());
                                ((j3) th2Var2.h).s = inflate3;
                                th2Var2.h(p00Var2.A(R.string.cancel), new c00(p00Var2, 0));
                                th2Var2.j(p00Var2.A(R.string.settings), new c00(p00Var2, 1));
                                Intent registerReceiver = p00Var2.i0().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                ImageView imageView = (ImageView) inflate3.findViewById(R.id.info_icon);
                                try {
                                    int intExtra = (int) ((registerReceiver.getIntExtra("level", -1) * 100.0f) / registerReceiver.getIntExtra("scale", -1));
                                    if (uz1.d(p00Var2.i0())) {
                                        if (intExtra < 20) {
                                            imageView.setImageResource(R.drawable.ic_batt_5_light);
                                        } else if (intExtra < 40) {
                                            imageView.setImageResource(R.drawable.ic_batt_33_light);
                                        } else if (intExtra < 55) {
                                            imageView.setImageResource(R.drawable.ic_batt_50_light);
                                        } else if (intExtra < 75) {
                                            imageView.setImageResource(R.drawable.ic_batt_66_light);
                                        } else if (intExtra < 90) {
                                            imageView.setImageResource(R.drawable.ic_batt_75_light);
                                        } else {
                                            imageView.setImageResource(R.drawable.ic_batt_100_light);
                                        }
                                    } else if (intExtra < 20) {
                                        imageView.setImageResource(R.drawable.ic_batt_5_dark);
                                    } else if (intExtra < 40) {
                                        imageView.setImageResource(R.drawable.ic_batt_33_dark);
                                    } else if (intExtra < 55) {
                                        imageView.setImageResource(R.drawable.ic_batt_50_dark);
                                    } else if (intExtra < 75) {
                                        imageView.setImageResource(R.drawable.ic_batt_66_dark);
                                    } else if (intExtra < 90) {
                                        imageView.setImageResource(R.drawable.ic_batt_75_dark);
                                    } else {
                                        imageView.setImageResource(R.drawable.ic_batt_100_dark);
                                    }
                                } catch (Exception unused11) {
                                }
                                try {
                                    ((TextView) inflate3.findViewById(R.id.info_title)).setText(p00Var2.A(R.string.battery));
                                } catch (Exception unused12) {
                                }
                                RecyclerView recyclerView = (RecyclerView) inflate3.findViewById(R.id.info_recyclerview);
                                recyclerView.setHasFixedSize(true);
                                p00Var2.i0();
                                recyclerView.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var2, registerReceiver, recyclerView, th2Var2, 0).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused13) {
                                return;
                            }
                        case 10:
                            int i152 = p00.H1;
                            try {
                                th2 th2Var3 = new th2(p00Var.g0());
                                ((j3) th2Var3.h).g = "\n" + p00Var.A(R.string.cpu_na_msg) + "\n";
                                th2Var3.j(p00Var.A(R.string.okay), null);
                                n3 a5 = th2Var3.a();
                                p00Var.q1 = a5;
                                try {
                                    a5.show();
                                    break;
                                } catch (Exception unused14) {
                                    p00Var.q1 = null;
                                    return;
                                }
                            } catch (NullPointerException unused15) {
                                return;
                            }
                        case 11:
                            p00Var.Y0.setRefreshing(true);
                            View inflate4 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var4 = new th2(p00Var.g0());
                                ((j3) th2Var4.h).s = inflate4;
                                th2Var4.h(p00Var.A(R.string.cancel), new c00(p00Var, 8));
                                th2Var4.j(p00Var.A(R.string.settings), new c00(p00Var, 9));
                                NetworkInfo activeNetworkInfo = ((ConnectivityManager) p00Var.i0().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                                boolean z2 = activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
                                ImageView imageView2 = (ImageView) inflate4.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        if (z2) {
                                            imageView2.setImageResource(R.drawable.ic_signal0_light);
                                        } else {
                                            imageView2.setImageResource(R.drawable.ic_wifi_light);
                                        }
                                    } else if (z2) {
                                        imageView2.setImageResource(R.drawable.ic_signal0_dark);
                                    } else {
                                        imageView2.setImageResource(R.drawable.ic_wifi_dark);
                                    }
                                } catch (Exception unused16) {
                                }
                                try {
                                    ((TextView) inflate4.findViewById(R.id.info_title)).setText(p00Var.A(R.string.network));
                                } catch (Exception unused17) {
                                }
                                RecyclerView recyclerView2 = (RecyclerView) inflate4.findViewById(R.id.info_recyclerview);
                                recyclerView2.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                new k00(p00Var, z2, recyclerView2, th2Var4).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused18) {
                                return;
                            }
                            break;
                        case 12:
                            int i162 = p00.H1;
                            try {
                                p00Var.C0();
                                break;
                            } catch (Exception unused19) {
                                return;
                            }
                        case 13:
                            p00Var.Y0.setRefreshing(true);
                            View inflate5 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var5 = new th2(p00Var.g0());
                                ((j3) th2Var5.h).s = inflate5;
                                th2Var5.h(p00Var.A(R.string.cancel), new c00(p00Var, 10));
                                th2Var5.j(p00Var.A(R.string.settings), new c00(p00Var, 11));
                                ImageView imageView3 = (ImageView) inflate5.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView3.setImageResource(R.drawable.ic_storage_light);
                                    } else {
                                        imageView3.setImageResource(R.drawable.ic_storage_dark);
                                    }
                                } catch (Exception unused20) {
                                }
                                try {
                                    ((TextView) inflate5.findViewById(R.id.info_title)).setText(p00Var.A(R.string.storage));
                                } catch (Exception unused21) {
                                }
                                RecyclerView recyclerView3 = (RecyclerView) inflate5.findViewById(R.id.info_recyclerview);
                                recyclerView3.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView3.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView3, th2Var5, i52).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused222) {
                                return;
                            }
                        case 14:
                            p00Var.Y0.setRefreshing(true);
                            View inflate6 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var6 = new th2(p00Var.g0());
                                ((j3) th2Var6.h).s = inflate6;
                                th2Var6.h(p00Var.A(R.string.cancel), new c00(p00Var, 4));
                                th2Var6.j(p00Var.A(R.string.settings), new c00(p00Var, 5));
                                ImageView imageView4 = (ImageView) inflate6.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView4.setImageResource(R.drawable.ic_apps_dark);
                                    } else {
                                        imageView4.setImageResource(R.drawable.ic_apps);
                                    }
                                } catch (Exception unused23) {
                                }
                                try {
                                    ((TextView) inflate6.findViewById(R.id.info_title)).setText(p00Var.A(R.string.installed_apps));
                                } catch (Exception unused24) {
                                }
                                RecyclerView recyclerView4 = (RecyclerView) inflate6.findViewById(R.id.info_recyclerview);
                                recyclerView4.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView4.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView4, th2Var6, 2).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused25) {
                                return;
                            }
                        case 15:
                            p00Var.Y0.setRefreshing(true);
                            View inflate7 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var7 = new th2(p00Var.g0());
                                ((j3) th2Var7.h).s = inflate7;
                                th2Var7.h(p00Var.A(R.string.cancel), new c00(p00Var, 2));
                                int i172 = 3;
                                th2Var7.j(p00Var.A(R.string.settings), new c00(p00Var, 3));
                                ImageView imageView5 = (ImageView) inflate7.findViewById(R.id.info_icon);
                                try {
                                    if (uz1.d(p00Var.i0())) {
                                        imageView5.setImageResource(R.drawable.ic_phone_light);
                                    } else {
                                        imageView5.setImageResource(R.drawable.ic_phone);
                                    }
                                } catch (Exception unused26) {
                                }
                                try {
                                    ((TextView) inflate7.findViewById(R.id.info_title)).setText(p00Var.A(R.string.display));
                                } catch (Exception unused27) {
                                }
                                RecyclerView recyclerView5 = (RecyclerView) inflate7.findViewById(R.id.info_recyclerview);
                                recyclerView5.setHasFixedSize(true);
                                p00Var.i0();
                                recyclerView5.setLayoutManager(new LinearLayoutManager(1));
                                new l00(p00Var, recyclerView5, th2Var7, i172).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused28) {
                                return;
                            }
                        default:
                            p00 p00Var3 = this.h;
                            p00Var3.Y0.setRefreshing(true);
                            View inflate8 = p00Var3.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                            try {
                                th2 th2Var8 = new th2(p00Var3.g0());
                                ((j3) th2Var8.h).s = inflate8;
                                th2Var8.h(p00Var3.A(R.string.cancel), new c00(p00Var3, 6));
                                th2Var8.j(p00Var3.A(R.string.settings), new c00(p00Var3, 7));
                                a61 s = uz1.s(p00Var3.i0(), Build.VERSION.SDK_INT);
                                ImageView imageView6 = (ImageView) inflate8.findViewById(R.id.info_icon);
                                imageView6.setImageTintList(null);
                                imageView6.setImageDrawable((Drawable) s.f11a);
                                try {
                                    ((TextView) inflate8.findViewById(R.id.info_title)).setText(p00Var3.A(R.string.operating_system));
                                } catch (Exception unused29) {
                                }
                                RecyclerView recyclerView6 = (RecyclerView) inflate8.findViewById(R.id.info_recyclerview);
                                recyclerView6.setHasFixedSize(true);
                                p00Var3.i0();
                                recyclerView6.setLayoutManager(new LinearLayoutManager(1));
                                new j00(p00Var3, s, recyclerView6, th2Var8, 1).executeOnExecutor(MainApp.h, new Void[0]);
                                break;
                            } catch (NullPointerException unused30) {
                                return;
                            }
                    }
                }
            });
            try {
                Integer.parseInt(uz1.A0(uz1.K("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq")));
            } catch (Exception unused4) {
            }
            if (H1 > 2) {
                uz1.z0(uz1.K("/sys/devices/system/cpu/cpu2/cpufreq/scaling_cur_freq")).equals("NA");
                z = uz1.z0(uz1.K("/sys/devices/system/cpu/cpu3/cpufreq/scaling_cur_freq")).equals("NA");
            } else {
                z = false;
            }
            if (H1 > 4) {
                uz1.z0(uz1.K("/sys/devices/system/cpu/cpu4/cpufreq/scaling_cur_freq")).equals("NA");
                z = uz1.z0(uz1.K("/sys/devices/system/cpu/cpu5/cpufreq/scaling_cur_freq")).equals("NA");
            }
            if (H1 > 6) {
                uz1.z0(uz1.K("/sys/devices/system/cpu/cpu6/cpufreq/scaling_cur_freq")).equals("NA");
                z = uz1.z0(uz1.K("/sys/devices/system/cpu/cpu7/cpufreq/scaling_cur_freq")).equals("NA");
            }
            if (H1 > 8) {
                uz1.z0(uz1.K(rQcwh.omkRRvUEqfS)).equals("NA");
                z = uz1.z0(uz1.K("/sys/devices/system/cpu/cpu9/cpufreq/scaling_cur_freq")).equals("NA");
            }
            ImageView imageView = this.X0;
            final int i21 = 10;
            if (z) {
                imageView.setVisibility(0);
                this.X0.setOnClickListener(new View.OnClickListener(this) { // from class: a00
                    public final /* synthetic */ p00 h;

                    {
                        this.h = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i42 = i21;
                        int i52 = 1;
                        p00 p00Var = this.h;
                        switch (i42) {
                            case 0:
                                int i62 = p00.H1;
                                try {
                                    if (p00Var.n1.contains("64-bit") && !p00Var.e0) {
                                        uz1.q0(p00Var.i0());
                                    } else if (p00Var.n1.contains("64-bit")) {
                                        p00Var.s0(new Intent(p00Var.i0(), (Class<?>) BenchmarkSuiteActivity.class));
                                    } else {
                                        p00Var.s0(new Intent(p00Var.i0(), (Class<?>) CPUTimeActivity.class));
                                    }
                                    break;
                                } catch (Exception unused22) {
                                    return;
                                }
                                break;
                            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                                int i72 = p00.H1;
                                try {
                                    if (p00Var.e0) {
                                        Intent intent = new Intent(p00Var.i0(), (Class<?>) BatteryActivity.class);
                                        intent.putExtra("dynamic", i51.b("prefDC"));
                                        intent.putExtra("systheme", i51.b("prefSysTheme"));
                                        intent.putExtra("darktheme", i51.b("prefDarkTheme"));
                                        intent.putExtra("color", i51.c(6, "prefColor"));
                                        intent.putExtra("language", i51.e("prefLanguage"));
                                        p00Var.s0(intent);
                                    } else {
                                        uz1.q0(p00Var.i0());
                                    }
                                    break;
                                } catch (Exception unused32) {
                                    return;
                                }
                            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                                int i82 = p00.H1;
                                try {
                                    p00Var.s0(new Intent(p00Var.g0(), (Class<?>) ToolsActivity.class));
                                    break;
                                } catch (Exception unused42) {
                                    return;
                                }
                            case 3:
                                int i92 = p00.H1;
                                try {
                                    p00Var.s0(new Intent(p00Var.g0(), (Class<?>) TestActivity.class));
                                    break;
                                } catch (Exception unused5) {
                                    return;
                                }
                            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                                int i102 = p00.H1;
                                if (!Build.MODEL.equals("A063")) {
                                    try {
                                        if (!p00Var.G()) {
                                            break;
                                        } else {
                                            th2 th2Var = new th2(p00Var.g0());
                                            j3 j3Var = (j3) th2Var.h;
                                            View inflate2 = p00Var.w().inflate(R.layout.widget_dialog_view, (ViewGroup) null);
                                            TextView textView2 = (TextView) inflate2.findViewById(R.id.widget_msg);
                                            j3Var.e = p00Var.A(R.string.widgets) + " BETA";
                                            if (!i51.b("prefHardwareDB").booleanValue()) {
                                                textView2.setText(p00Var.A(R.string.widgets_require_pro));
                                            }
                                            j3Var.s = inflate2;
                                            th2Var.j(p00Var.A(R.string.okay), null);
                                            n3 a42 = th2Var.a();
                                            p00Var.q1 = a42;
                                            a42.show();
                                            break;
                                        }
                                    } catch (Throwable unused6) {
                                        p00Var.q1 = null;
                                        return;
                                    }
                                }
                                break;
                            case 5:
                                int i112 = p00.H1;
                                p00Var.i0();
                                try {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                    break;
                                } catch (Exception unused7) {
                                    return;
                                }
                            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                                int i122 = p00.H1;
                                try {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) TemperatureActivity.class));
                                    break;
                                } catch (Exception unused8) {
                                    return;
                                }
                            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                                int i132 = p00.H1;
                                try {
                                    if (p00Var.e0) {
                                        Intent intent2 = new Intent(p00Var.i0(), (Class<?>) MonitorActivity.class);
                                        intent2.putExtra("dynamic", i51.b("prefDC"));
                                        intent2.putExtra("darktheme", i51.b("prefDarkTheme"));
                                        intent2.putExtra("systheme", i51.b("prefSysTheme"));
                                        intent2.putExtra("color", i51.c(6, "prefColor"));
                                        intent2.putExtra("language", i51.e("prefLanguage"));
                                        p00Var.s0(intent2);
                                    } else {
                                        uz1.q0(p00Var.i0());
                                    }
                                    break;
                                } catch (Exception unused9) {
                                    return;
                                }
                            case 8:
                                int i142 = p00.H1;
                                try {
                                    p00Var.s0(new Intent(p00Var.i0(), (Class<?>) SystemGraphsActivity.class));
                                    break;
                                } catch (Exception unused10) {
                                    return;
                                }
                            case rt0.o /* 9 */:
                                p00 p00Var2 = this.h;
                                p00Var2.Y0.setRefreshing(true);
                                View inflate3 = p00Var2.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                                try {
                                    th2 th2Var2 = new th2(p00Var2.g0());
                                    ((j3) th2Var2.h).s = inflate3;
                                    th2Var2.h(p00Var2.A(R.string.cancel), new c00(p00Var2, 0));
                                    th2Var2.j(p00Var2.A(R.string.settings), new c00(p00Var2, 1));
                                    Intent registerReceiver = p00Var2.i0().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                                    ImageView imageView2 = (ImageView) inflate3.findViewById(R.id.info_icon);
                                    try {
                                        int intExtra = (int) ((registerReceiver.getIntExtra("level", -1) * 100.0f) / registerReceiver.getIntExtra("scale", -1));
                                        if (uz1.d(p00Var2.i0())) {
                                            if (intExtra < 20) {
                                                imageView2.setImageResource(R.drawable.ic_batt_5_light);
                                            } else if (intExtra < 40) {
                                                imageView2.setImageResource(R.drawable.ic_batt_33_light);
                                            } else if (intExtra < 55) {
                                                imageView2.setImageResource(R.drawable.ic_batt_50_light);
                                            } else if (intExtra < 75) {
                                                imageView2.setImageResource(R.drawable.ic_batt_66_light);
                                            } else if (intExtra < 90) {
                                                imageView2.setImageResource(R.drawable.ic_batt_75_light);
                                            } else {
                                                imageView2.setImageResource(R.drawable.ic_batt_100_light);
                                            }
                                        } else if (intExtra < 20) {
                                            imageView2.setImageResource(R.drawable.ic_batt_5_dark);
                                        } else if (intExtra < 40) {
                                            imageView2.setImageResource(R.drawable.ic_batt_33_dark);
                                        } else if (intExtra < 55) {
                                            imageView2.setImageResource(R.drawable.ic_batt_50_dark);
                                        } else if (intExtra < 75) {
                                            imageView2.setImageResource(R.drawable.ic_batt_66_dark);
                                        } else if (intExtra < 90) {
                                            imageView2.setImageResource(R.drawable.ic_batt_75_dark);
                                        } else {
                                            imageView2.setImageResource(R.drawable.ic_batt_100_dark);
                                        }
                                    } catch (Exception unused11) {
                                    }
                                    try {
                                        ((TextView) inflate3.findViewById(R.id.info_title)).setText(p00Var2.A(R.string.battery));
                                    } catch (Exception unused12) {
                                    }
                                    RecyclerView recyclerView = (RecyclerView) inflate3.findViewById(R.id.info_recyclerview);
                                    recyclerView.setHasFixedSize(true);
                                    p00Var2.i0();
                                    recyclerView.setLayoutManager(new LinearLayoutManager(1));
                                    new j00(p00Var2, registerReceiver, recyclerView, th2Var2, 0).executeOnExecutor(MainApp.h, new Void[0]);
                                    break;
                                } catch (NullPointerException unused13) {
                                    return;
                                }
                            case 10:
                                int i152 = p00.H1;
                                try {
                                    th2 th2Var3 = new th2(p00Var.g0());
                                    ((j3) th2Var3.h).g = "\n" + p00Var.A(R.string.cpu_na_msg) + "\n";
                                    th2Var3.j(p00Var.A(R.string.okay), null);
                                    n3 a5 = th2Var3.a();
                                    p00Var.q1 = a5;
                                    try {
                                        a5.show();
                                        break;
                                    } catch (Exception unused14) {
                                        p00Var.q1 = null;
                                        return;
                                    }
                                } catch (NullPointerException unused15) {
                                    return;
                                }
                            case 11:
                                p00Var.Y0.setRefreshing(true);
                                View inflate4 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                                try {
                                    th2 th2Var4 = new th2(p00Var.g0());
                                    ((j3) th2Var4.h).s = inflate4;
                                    th2Var4.h(p00Var.A(R.string.cancel), new c00(p00Var, 8));
                                    th2Var4.j(p00Var.A(R.string.settings), new c00(p00Var, 9));
                                    NetworkInfo activeNetworkInfo = ((ConnectivityManager) p00Var.i0().getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
                                    boolean z2 = activeNetworkInfo != null && activeNetworkInfo.getType() == 0;
                                    ImageView imageView22 = (ImageView) inflate4.findViewById(R.id.info_icon);
                                    try {
                                        if (uz1.d(p00Var.i0())) {
                                            if (z2) {
                                                imageView22.setImageResource(R.drawable.ic_signal0_light);
                                            } else {
                                                imageView22.setImageResource(R.drawable.ic_wifi_light);
                                            }
                                        } else if (z2) {
                                            imageView22.setImageResource(R.drawable.ic_signal0_dark);
                                        } else {
                                            imageView22.setImageResource(R.drawable.ic_wifi_dark);
                                        }
                                    } catch (Exception unused16) {
                                    }
                                    try {
                                        ((TextView) inflate4.findViewById(R.id.info_title)).setText(p00Var.A(R.string.network));
                                    } catch (Exception unused17) {
                                    }
                                    RecyclerView recyclerView2 = (RecyclerView) inflate4.findViewById(R.id.info_recyclerview);
                                    recyclerView2.setHasFixedSize(true);
                                    p00Var.i0();
                                    recyclerView2.setLayoutManager(new LinearLayoutManager(1));
                                    new k00(p00Var, z2, recyclerView2, th2Var4).executeOnExecutor(MainApp.h, new Void[0]);
                                    break;
                                } catch (NullPointerException unused18) {
                                    return;
                                }
                                break;
                            case 12:
                                int i162 = p00.H1;
                                try {
                                    p00Var.C0();
                                    break;
                                } catch (Exception unused19) {
                                    return;
                                }
                            case 13:
                                p00Var.Y0.setRefreshing(true);
                                View inflate5 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                                try {
                                    th2 th2Var5 = new th2(p00Var.g0());
                                    ((j3) th2Var5.h).s = inflate5;
                                    th2Var5.h(p00Var.A(R.string.cancel), new c00(p00Var, 10));
                                    th2Var5.j(p00Var.A(R.string.settings), new c00(p00Var, 11));
                                    ImageView imageView3 = (ImageView) inflate5.findViewById(R.id.info_icon);
                                    try {
                                        if (uz1.d(p00Var.i0())) {
                                            imageView3.setImageResource(R.drawable.ic_storage_light);
                                        } else {
                                            imageView3.setImageResource(R.drawable.ic_storage_dark);
                                        }
                                    } catch (Exception unused20) {
                                    }
                                    try {
                                        ((TextView) inflate5.findViewById(R.id.info_title)).setText(p00Var.A(R.string.storage));
                                    } catch (Exception unused21) {
                                    }
                                    RecyclerView recyclerView3 = (RecyclerView) inflate5.findViewById(R.id.info_recyclerview);
                                    recyclerView3.setHasFixedSize(true);
                                    p00Var.i0();
                                    recyclerView3.setLayoutManager(new LinearLayoutManager(1));
                                    new l00(p00Var, recyclerView3, th2Var5, i52).executeOnExecutor(MainApp.h, new Void[0]);
                                    break;
                                } catch (NullPointerException unused222) {
                                    return;
                                }
                            case 14:
                                p00Var.Y0.setRefreshing(true);
                                View inflate6 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                                try {
                                    th2 th2Var6 = new th2(p00Var.g0());
                                    ((j3) th2Var6.h).s = inflate6;
                                    th2Var6.h(p00Var.A(R.string.cancel), new c00(p00Var, 4));
                                    th2Var6.j(p00Var.A(R.string.settings), new c00(p00Var, 5));
                                    ImageView imageView4 = (ImageView) inflate6.findViewById(R.id.info_icon);
                                    try {
                                        if (uz1.d(p00Var.i0())) {
                                            imageView4.setImageResource(R.drawable.ic_apps_dark);
                                        } else {
                                            imageView4.setImageResource(R.drawable.ic_apps);
                                        }
                                    } catch (Exception unused23) {
                                    }
                                    try {
                                        ((TextView) inflate6.findViewById(R.id.info_title)).setText(p00Var.A(R.string.installed_apps));
                                    } catch (Exception unused24) {
                                    }
                                    RecyclerView recyclerView4 = (RecyclerView) inflate6.findViewById(R.id.info_recyclerview);
                                    recyclerView4.setHasFixedSize(true);
                                    p00Var.i0();
                                    recyclerView4.setLayoutManager(new LinearLayoutManager(1));
                                    new l00(p00Var, recyclerView4, th2Var6, 2).executeOnExecutor(MainApp.h, new Void[0]);
                                    break;
                                } catch (NullPointerException unused25) {
                                    return;
                                }
                            case 15:
                                p00Var.Y0.setRefreshing(true);
                                View inflate7 = p00Var.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                                try {
                                    th2 th2Var7 = new th2(p00Var.g0());
                                    ((j3) th2Var7.h).s = inflate7;
                                    th2Var7.h(p00Var.A(R.string.cancel), new c00(p00Var, 2));
                                    int i172 = 3;
                                    th2Var7.j(p00Var.A(R.string.settings), new c00(p00Var, 3));
                                    ImageView imageView5 = (ImageView) inflate7.findViewById(R.id.info_icon);
                                    try {
                                        if (uz1.d(p00Var.i0())) {
                                            imageView5.setImageResource(R.drawable.ic_phone_light);
                                        } else {
                                            imageView5.setImageResource(R.drawable.ic_phone);
                                        }
                                    } catch (Exception unused26) {
                                    }
                                    try {
                                        ((TextView) inflate7.findViewById(R.id.info_title)).setText(p00Var.A(R.string.display));
                                    } catch (Exception unused27) {
                                    }
                                    RecyclerView recyclerView5 = (RecyclerView) inflate7.findViewById(R.id.info_recyclerview);
                                    recyclerView5.setHasFixedSize(true);
                                    p00Var.i0();
                                    recyclerView5.setLayoutManager(new LinearLayoutManager(1));
                                    new l00(p00Var, recyclerView5, th2Var7, i172).executeOnExecutor(MainApp.h, new Void[0]);
                                    break;
                                } catch (NullPointerException unused28) {
                                    return;
                                }
                            default:
                                p00 p00Var3 = this.h;
                                p00Var3.Y0.setRefreshing(true);
                                View inflate8 = p00Var3.w().inflate(R.layout.dashboard_info_dialog, (ViewGroup) null);
                                try {
                                    th2 th2Var8 = new th2(p00Var3.g0());
                                    ((j3) th2Var8.h).s = inflate8;
                                    th2Var8.h(p00Var3.A(R.string.cancel), new c00(p00Var3, 6));
                                    th2Var8.j(p00Var3.A(R.string.settings), new c00(p00Var3, 7));
                                    a61 s = uz1.s(p00Var3.i0(), Build.VERSION.SDK_INT);
                                    ImageView imageView6 = (ImageView) inflate8.findViewById(R.id.info_icon);
                                    imageView6.setImageTintList(null);
                                    imageView6.setImageDrawable((Drawable) s.f11a);
                                    try {
                                        ((TextView) inflate8.findViewById(R.id.info_title)).setText(p00Var3.A(R.string.operating_system));
                                    } catch (Exception unused29) {
                                    }
                                    RecyclerView recyclerView6 = (RecyclerView) inflate8.findViewById(R.id.info_recyclerview);
                                    recyclerView6.setHasFixedSize(true);
                                    p00Var3.i0();
                                    recyclerView6.setLayoutManager(new LinearLayoutManager(1));
                                    new j00(p00Var3, s, recyclerView6, th2Var8, 1).executeOnExecutor(MainApp.h, new Void[0]);
                                    break;
                                } catch (NullPointerException unused30) {
                                    return;
                                }
                        }
                    }
                });
            } else {
                imageView.setVisibility(8);
            }
            int i22 = H1;
            int i23 = 350;
            if (i22 > 6) {
                try {
                    this.o1.setLayoutParams(this.o1.getLayoutParams());
                } catch (Exception unused5) {
                }
                if (i0().getResources().getBoolean(R.bool.isPhone)) {
                    this.i0.setTextSize(18.0f);
                    this.j0.setTextSize(18.0f);
                    this.k0.setTextSize(18.0f);
                    this.l0.setTextSize(18.0f);
                    this.m0.setTextSize(18.0f);
                    this.n0.setTextSize(18.0f);
                    this.o0.setTextSize(18.0f);
                    this.p0.setTextSize(18.0f);
                    this.q0.setTextSize(18.0f);
                    this.r0.setTextSize(18.0f);
                    this.s0.setTextSize(18.0f);
                    this.t0.setTextSize(18.0f);
                }
            } else if (i22 <= 2) {
                try {
                    ViewGroup.LayoutParams layoutParams = this.o1.getLayoutParams();
                    layoutParams.height = 350;
                    this.o1.setLayoutParams(layoutParams);
                } catch (Exception unused6) {
                }
            }
            if (z().getBoolean(R.bool.isTablet) || z().getBoolean(R.bool.isTablet10)) {
                i23 = 320;
            } else if (z().getBoolean(R.bool.isNexus6) && z().getBoolean(R.bool.isLandscape)) {
                i23 = 420;
            } else if (!z().getBoolean(R.bool.isLandscape)) {
                i23 = z().getBoolean(R.bool.isNexus6) ? 530 : 450;
            }
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) inflate.findViewById(R.id.dashboard_swipe_container);
            this.Y0 = swipeRefreshLayout;
            swipeRefreshLayout.g(i23);
            this.Y0.setOnRefreshListener(new p8(18, this));
            go1 m = op0.m(g0().getApplicationContext());
            this.z1 = m;
            je2.d(m, new zz(this, 0));
            this.y1 = new n00(this);
            HandlerThread handlerThread = new HandlerThread("dashboard_refresh_thread", 10);
            this.C1 = handlerThread;
            handlerThread.start();
            this.D1 = new Handler(this.C1.getLooper());
            if (uz1.q("/sys/kernel/debug/ged/hal/current_freqency")) {
                I1 = true;
            }
            this.Z0 = true;
            return inflate;
        } catch (Resources.NotFoundException unused7) {
            return null;
        }
    }

    @Override // defpackage.ld0
    public final void P() {
        this.K = true;
        n00 n00Var = this.y1;
        if (n00Var != null) {
            int i = n00.n;
            n00Var.getClass();
            try {
                RandomAccessFile randomAccessFile = n00Var.g;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.ld0
    public final void R() {
        D0();
        this.K = true;
        Handler handler = this.D1;
        if (handler != null) {
            handler.removeCallbacks(this.E1);
        }
        HandlerThread handlerThread = this.C1;
        if (handlerThread != null) {
            handlerThread.quitSafely();
            this.C1 = null;
        }
        this.D1 = null;
    }

    @Override // defpackage.ld0
    public final void V() {
        this.K = true;
        n3 n3Var = this.q1;
        if (n3Var != null) {
            n3Var.cancel();
        }
        n3 n3Var2 = this.r1;
        if (n3Var2 != null) {
            n3Var2.cancel();
        }
        D0();
    }

    @Override // defpackage.ld0
    public final void Y() {
        Handler handler;
        int i = 1;
        this.K = true;
        this.p1 = 0;
        int i2 = 4;
        if (this.Z0) {
            this.Y0.setVisibility(4);
            Animation loadAnimation = AnimationUtils.loadAnimation(g0(), android.R.anim.fade_in);
            loadAnimation.setDuration(200L);
            new Handler().postDelayed(new k5(this, 13, loadAnimation), 500L);
            this.Z0 = false;
        }
        try {
            g0().findViewById(R.id.appbar).animate().setInterpolator(new DecelerateInterpolator()).translationY(0.0f).start();
        } catch (Exception unused) {
        }
        try {
            this.y0.setText(uz1.A(true));
        } catch (Exception unused2) {
        }
        this.z0.setImageDrawable(uz1.z(i0()));
        synchronized (this) {
            if (G() && this.F1 != null) {
                if (!this.B1) {
                    this.B1 = true;
                    Handler handler2 = this.D1;
                    if (handler2 != null) {
                        handler2.post(this.E1);
                    }
                    try {
                        if (J1 == null) {
                            J1 = (TelephonyManager) this.F1.getSystemService("phone");
                        }
                        if (L1 == null) {
                            L1 = new o00();
                        }
                        TelephonyManager telephonyManager = J1;
                        if (telephonyManager != null && !this.G1 && (handler = this.D1) != null) {
                            o00 o00Var = L1;
                            this.G1 = true;
                            handler.post(new yz(telephonyManager, o00Var, i));
                        }
                    } catch (Exception unused3) {
                    }
                }
            }
        }
        z0();
        ExecutorService executorService = MainApp.h;
        executorService.execute(new zz(this, 2));
        x0();
        executorService.execute(new zz(this, i));
        executorService.execute(new zz(this, i2));
        try {
            if (this.A0.getText().toString().isEmpty()) {
                if (i51.g("prefProcessor")) {
                    String e = i51.e("prefProcessor");
                    if (e == null || e.isEmpty()) {
                        this.A0.setVisibility(8);
                    } else {
                        this.A0.setVisibility(0);
                        this.A0.setText(i51.e("prefProcessor"), TextView.BufferType.NORMAL);
                    }
                } else {
                    this.A0.setVisibility(8);
                }
            }
        } catch (Exception unused4) {
        }
    }

    public final void x0() {
        int i = 3;
        if (Build.VERSION.SDK_INT >= 26) {
            new Thread(new zz(this, i)).start();
            return;
        }
        try {
            if (uz1.q(i0().getFilesDir().getPath())) {
                String[] G = sl.G(i0(), new File(Environment.getDataDirectory().getPath()));
                this.F0.refreshDrawableState();
                this.F0.setValue(Float.parseFloat(G[3]));
                TextView textView = this.G0;
                String str = G[0];
                TextView.BufferType bufferType = TextView.BufferType.NORMAL;
                textView.setText(str, bufferType);
                this.H0.setText(G[1] + " /", bufferType);
                this.I0.setText(G[3] + "%", bufferType);
            }
        } catch (Exception unused) {
            this.F0.setVisibility(8);
        }
    }

    public final void z0() {
        final long elapsedRealtime = SystemClock.elapsedRealtime() - SystemClock.uptimeMillis();
        final long elapsedRealtime2 = SystemClock.elapsedRealtime();
        final float f = (elapsedRealtime / elapsedRealtime2) * 100.0f;
        final Context v = v();
        if (v == null) {
            return;
        }
        MainApp.h.execute(new Runnable() { // from class: d00
            @Override // java.lang.Runnable
            public final void run() {
                int i = p00.H1;
                Context context = v;
                final String B = uz1.B(context, elapsedRealtime);
                final String B2 = uz1.B(context, elapsedRealtime2);
                final p00 p00Var = p00.this;
                View view = p00Var.M;
                if (view == null) {
                    return;
                }
                final float f2 = f;
                view.post(new Runnable() { // from class: e00
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = p00.H1;
                        p00 p00Var2 = p00.this;
                        if (!p00Var2.G() || p00Var2.x0 == null || p00Var2.w0 == null) {
                            return;
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append(p00Var2.A(R.string.deep_sleep));
                        sb.append(": ");
                        sb.append(B);
                        sb.append(" (");
                        String t = d51.t(sb, (int) f2, "%)");
                        String str = p00Var2.A(R.string.uptime) + ": " + B2;
                        try {
                            p00Var2.x0.setText(t);
                            p00Var2.w0.setText(str);
                        } catch (Exception unused) {
                        }
                    }
                });
            }
        });
    }
}
