package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.os.BatteryManager;
import android.os.Build;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB;
import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import com.google.android.material.slider.KtNX.UQdsoaJMID;
import com.google.android.material.snackbar.qXlx.IGQCApxXGMWo;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.nativebridge.vGm.RIhTGWkqQvGL;
import flar2.devcheck.permissionsSummary.xEua.bPnJ;
import flar2.devcheck.sensors.JCZI.nyGJ;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import flar2.devcheck.utils.Utils;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class om0 {

    /* renamed from: a, reason: collision with root package name */
    public static Context f747a = null;
    public static Boolean b = null;
    public static volatile long c = 0;
    public static volatile boolean d = false;
    public static volatile boolean e = false;
    public static volatile long f = -1;
    public static volatile long g;
    public static boolean i;
    public static final Object h = new Object();
    public static final Object j = new Object();
    public static final c4 k = new c4(17);

    public static String A(String str) {
        String X = uz1.X("ro.product.marketname");
        if (X == null || X.isEmpty()) {
            String X2 = uz1.X("ro.product.vendor.marketname");
            if (X2 != null && !X2.isEmpty() && X2.length() > str.length()) {
                return X2;
            }
        } else if (X.length() > str.length()) {
            return X;
        }
        return (str == null || str.isEmpty()) ? uz1.c(Build.MODEL) : str;
    }

    public static boolean B() {
        try {
            if (uz1.o(qJTtDWNCVUDjB.xvRaRPYsuabc).contains("Swap")) {
                return !r0.split("Swap:")[1].split("\\s+")[1].equals("0");
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean C() {
        try {
            String[][] strArr = {new String[]{"/sys/class/power_supply/bms/voltage_cell_1", "/sys/class/power_supply/bms/voltage_cell_2"}, new String[]{"/sys/class/power_supply/bms/cell_1_voltage", UQdsoaJMID.AEmN}, new String[]{"/sys/class/power_supply/bms/voltage_cell1", "/sys/class/power_supply/bms/voltage_cell2"}};
            for (int i2 = 0; i2 < 3; i2++) {
                String[] strArr2 = strArr[i2];
                if (uz1.q(strArr2[0]) && uz1.q(strArr2[1])) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public static boolean D() {
        if (uz1.q("/sys/class/power_supply/battery/fg_fullcap_cell1") && uz1.q("/sys/class/power_supply/battery/fg_fullcap_cell2")) {
            return true;
        }
        String[][] strArr = {new String[]{"/sys/class/power_supply/battery/cell1_voltage", "/sys/class/power_supply/battery/cell2_voltage"}, new String[]{"/sys/class/power_supply/battery/voltage_now_cell1", "/sys/class/power_supply/battery/voltage_now_cell2"}, new String[]{YHJbtPFAANaPQ.BMPEbnsHNAUKqH, "/sys/class/power_supply/battery/cell2_volt"}};
        for (int i2 = 0; i2 < 3; i2++) {
            String[] strArr2 = strArr[i2];
            if (uz1.q(strArr2[0]) && uz1.q(strArr2[1])) {
                return true;
            }
        }
        return false;
    }

    public static boolean F() {
        return Build.VERSION.SDK_INT >= 26;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        if (C() != false) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean G(android.content.Context r9, android.content.Intent r10) {
        /*
            r0 = 0
            java.lang.String r1 = "dual_cell_mode"
            int r1 = defpackage.i51.c(r0, r1)
            r2 = 1
            if (r1 != r2) goto Lb
            goto L40
        Lb:
            r3 = 2
            if (r1 != r3) goto Lf
            goto L43
        Lf:
            r1 = -1
            java.lang.String r4 = "bat_max_voltage_mv"
            if (r10 != 0) goto L15
            goto L27
        L15:
            java.lang.String r5 = "voltage"
            int r5 = r10.getIntExtra(r5, r1)     // Catch: java.lang.Throwable -> L27
            if (r5 > 0) goto L1e
            goto L27
        L1e:
            int r6 = defpackage.i51.c(r0, r4)     // Catch: java.lang.Throwable -> L27
            if (r5 <= r6) goto L27
            defpackage.i51.j(r5, r4)     // Catch: java.lang.Throwable -> L27
        L27:
            int r4 = defpackage.i51.c(r0, r4)
            r5 = 7000(0x1b58, float:9.809E-42)
            if (r4 < r5) goto L30
            goto L40
        L30:
            int r4 = g()
            if (r4 != r2) goto L37
            goto L43
        L37:
            if (r4 != r3) goto L3a
            goto L40
        L3a:
            int r3 = k()
            if (r3 != r2) goto L41
        L40:
            return r2
        L41:
            if (r3 != r1) goto L44
        L43:
            return r0
        L44:
            long r3 = java.lang.System.currentTimeMillis()
            boolean r1 = defpackage.om0.e
            if (r1 == 0) goto L5a
            long r5 = defpackage.om0.c
            long r5 = r3 - r5
            r7 = 600000(0x927c0, double:2.964394E-318)
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 >= 0) goto L5a
            boolean r9 = defpackage.om0.d
            return r9
        L5a:
            boolean r9 = d(r9, r10)     // Catch: java.lang.Throwable -> L73
            int r10 = c()     // Catch: java.lang.Throwable -> L74
            r1 = 3
            if (r10 >= r1) goto L71
            boolean r10 = D()     // Catch: java.lang.Throwable -> L74
            if (r10 != 0) goto L71
            boolean r10 = C()     // Catch: java.lang.Throwable -> L74
            if (r10 == 0) goto L74
        L71:
            r0 = r2
            goto L74
        L73:
            r9 = r0
        L74:
            boolean r10 = defpackage.om0.e
            if (r10 == 0) goto L85
            boolean r10 = defpackage.om0.d
            if (r10 == 0) goto L85
            if (r0 != 0) goto L84
            int r10 = k()
            if (r10 != r2) goto L85
        L84:
            r9 = r2
        L85:
            defpackage.om0.d = r9
            defpackage.om0.e = r2
            defpackage.om0.c = r3
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om0.G(android.content.Context, android.content.Intent):boolean");
    }

    public static double H(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return 0.0d;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        Collections.sort(arrayList2);
        int size = arrayList2.size();
        if ((size & 1) == 1) {
            return ((Double) arrayList2.get(size / 2)).doubleValue();
        }
        int i2 = size / 2;
        return (((Double) arrayList2.get(i2)).doubleValue() + ((Double) arrayList2.get(i2 - 1)).doubleValue()) / 2.0d;
    }

    public static long I(int i2, String str) {
        int f2 = f(str, 0, i2, false);
        Matcher matcher = fx.n.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        while (f2 < i2) {
            int f3 = f(str, f2 + 1, i2, true);
            matcher.region(f2, f3);
            if (i4 == -1 && matcher.usePattern(fx.n).matches()) {
                String group = matcher.group(1);
                group.getClass();
                i4 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                group2.getClass();
                i7 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                group3.getClass();
                i8 = Integer.parseInt(group3);
            } else if (i5 == -1 && matcher.usePattern(fx.m).matches()) {
                String group4 = matcher.group(1);
                group4.getClass();
                i5 = Integer.parseInt(group4);
            } else {
                if (i6 == -1) {
                    Pattern pattern = fx.l;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        group5.getClass();
                        Locale locale = Locale.US;
                        locale.getClass();
                        String lowerCase = group5.toLowerCase(locale);
                        lowerCase.getClass();
                        String pattern2 = pattern.pattern();
                        pattern2.getClass();
                        i6 = as1.g0(pattern2, lowerCase, 0, 6) / 4;
                    }
                }
                if (i3 == -1 && matcher.usePattern(fx.k).matches()) {
                    String group6 = matcher.group(1);
                    group6.getClass();
                    i3 = Integer.parseInt(group6);
                }
            }
            f2 = f(str, f3 + 1, i2, false);
        }
        if (70 <= i3 && i3 < 100) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 < 70) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            c.m("Failed requirement.");
            return 0L;
        }
        if (i6 == -1) {
            c.m("Failed requirement.");
            return 0L;
        }
        if (1 > i5 || i5 >= 32) {
            c.m("Failed requirement.");
            return 0L;
        }
        if (i4 < 0 || i4 >= 24) {
            c.m("Failed requirement.");
            return 0L;
        }
        if (i7 < 0 || i7 >= 60) {
            c.m("Failed requirement.");
            return 0L;
        }
        if (i8 < 0 || i8 >= 60) {
            c.m("Failed requirement.");
            return 0L;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(rd2.f888a);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i3);
        gregorianCalendar.set(2, i6 - 1);
        gregorianCalendar.set(5, i5);
        gregorianCalendar.set(11, i4);
        gregorianCalendar.set(12, i7);
        gregorianCalendar.set(13, i8);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static double J(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            double optDouble = jSONObject.optDouble(str, 0.0d);
            if (!Double.isNaN(optDouble)) {
                return optDouble;
            }
        }
        return 0.0d;
    }

    public static void M(u40 u40Var, float f2) {
        ci1 ci1Var = (ci1) u40Var.h;
        CardView cardView = (CardView) u40Var.i;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f2 != ci1Var.e || ci1Var.f != useCompatPadding || ci1Var.g != preventCornerOverlap) {
            ci1Var.e = f2;
            ci1Var.f = useCompatPadding;
            ci1Var.g = preventCornerOverlap;
            ci1Var.b(null);
            ci1Var.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            u40Var.n(0, 0, 0, 0);
            return;
        }
        ci1 ci1Var2 = (ci1) u40Var.h;
        float f3 = ci1Var2.e;
        float f4 = ci1Var2.f126a;
        int ceil = (int) Math.ceil(di1.a(f3, f4, cardView.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(di1.b(f3, f4, cardView.getPreventCornerOverlap()));
        u40Var.n(ceil, ceil2, ceil, ceil2);
    }

    public static String[] N(Context context) {
        try {
            String o = uz1.o("free");
            try {
                if (!o.contains("Swap")) {
                    return new String[]{""};
                }
                String[] split = o.split("Swap:")[1].split("\\s+");
                if (split[1].equals(nyGJ.MOzZJfgrkp)) {
                    return new String[]{context.getString(R.string.disabled)};
                }
                String formatFileSize = Formatter.formatFileSize(context, Long.parseLong(split[1]));
                String formatFileSize2 = Formatter.formatFileSize(context, Long.parseLong(split[2]));
                String formatFileSize3 = Formatter.formatFileSize(context, Long.parseLong(split[3]));
                return new String[]{formatFileSize, formatFileSize2 + " " + context.getString(R.string.used), formatFileSize3 + " " + context.getString(R.string.free), String.valueOf((int) (((Long.parseLong(split[2]) * 100.0d) / Long.parseLong(split[1])) + 0.5d))};
            } catch (Exception unused) {
                return new String[]{""};
            }
        } catch (Exception unused2) {
            return new String[]{""};
        }
    }

    public static final void O(Object obj) {
        if (obj instanceof pg1) {
            throw ((pg1) obj).g;
        }
    }

    public static Enum P(Class cls, String str, Enum r3) {
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                try {
                    try {
                        return Enum.valueOf(cls, trim);
                    } catch (IllegalArgumentException unused) {
                        return Enum.valueOf(cls, trim.toUpperCase(Locale.US));
                    }
                } catch (IllegalArgumentException unused2) {
                }
            }
        }
        return r3;
    }

    public static boolean Q(String str, String str2) {
        Boolean bool;
        boolean a2 = o01.a();
        String str3 = bPnJ.yebLXekZZYEdV;
        if (a2) {
            try {
                String str4 = new Utils().gethguyttkslapifass("flar2.devcheck");
                if (str4 != null) {
                    str3 = str4;
                }
            } catch (Throwable unused) {
            }
        }
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str3)) {
            try {
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str3, 0)));
                        try {
                            byte[] decode = Base64.decode(str2, 0);
                            try {
                                Signature signature = Signature.getInstance("SHA1withRSA");
                                signature.initVerify(generatePublic);
                                signature.update(str.getBytes());
                                bool = Boolean.valueOf(signature.verify(decode));
                            } catch (InvalidKeyException | SignatureException unused2) {
                                bool = Boolean.FALSE;
                            } catch (NoSuchAlgorithmException e2) {
                                throw new RuntimeException(e2);
                            }
                        } catch (IllegalArgumentException unused3) {
                            bool = Boolean.FALSE;
                        }
                        return bool.booleanValue();
                    } catch (NoSuchAlgorithmException e3) {
                        throw new RuntimeException(e3);
                    } catch (InvalidKeySpecException unused4) {
                        throw new IOException("AF");
                    }
                }
            } catch (IOException unused5) {
            }
        }
        return false;
    }

    public static final Object R(long j2, bp bpVar, su suVar) {
        long j3;
        Object otVar;
        Object P;
        long a2;
        j70 j70Var = u60.g;
        boolean z = j2 > 0;
        if (z) {
            long B = md2.B(999999L, w60.NANOSECONDS);
            int i2 = ((int) j2) & 1;
            if (i2 != (((int) B) & 1)) {
                a2 = i2 == 1 ? u60.a(j2 >> 1, B >> 1) : u60.a(B >> 1, j2 >> 1);
            } else if (i2 == 0) {
                long j4 = (j2 >> 1) + (B >> 1);
                if (-4611686018426999999L > j4 || j4 >= 4611686018427000000L) {
                    a2 = md2.h(j4 / 1000000);
                } else {
                    a2 = j4 << 1;
                    int i3 = v60.f1072a;
                }
            } else {
                long b2 = md2.b(j2 >> 1, B >> 1);
                if (b2 == 9223372036854759646L) {
                    c.m("Summing infinite durations of different signs yields an undefined result.");
                    return null;
                }
                if (b2 == 4611686018427387903L || b2 == -4611686018427387903L) {
                    a2 = md2.h(b2);
                } else if (-4611686018426L > b2 || b2 >= 4611686018427L) {
                    a2 = md2.h(tl2.g(b2));
                } else {
                    a2 = (b2 * 1000000) << 1;
                    int i4 = v60.f1072a;
                }
            }
            j3 = ((((int) a2) & 1) != 1 || a2 == u60.h || a2 == u60.i) ? u60.b(a2, w60.MILLISECONDS) : a2 >> 1;
        } else {
            if (z) {
                throw new pt();
            }
            j3 = 0;
        }
        if (j3 <= 0) {
            throw new cz1("Timed out immediately", null);
        }
        dz1 dz1Var = new dz1(j3, suVar);
        je2.F(dz1Var, true, new o50(pr.r(dz1Var.l.d()).j(dz1Var.m, dz1Var, dz1Var.k)));
        try {
            k32.g(2, bpVar);
            otVar = bpVar.f(dz1Var, dz1Var);
        } catch (Throwable th) {
            otVar = new ot(th, false);
        }
        Object obj = zx.g;
        if (otVar == obj || (P = dz1Var.P(otVar)) == co0.b) {
            return obj;
        }
        if (P instanceof ot) {
            Throwable th2 = ((ot) P).f756a;
            if (!(th2 instanceof cz1)) {
                throw th2;
            }
            if (((cz1) th2).g != dz1Var) {
                throw th2;
            }
            if (otVar instanceof ot) {
                throw ((ot) otVar).f756a;
            }
        } else {
            otVar = co0.a(P);
        }
        return otVar;
    }

    public static boolean S(Comparator comparator, Collection collection) {
        Object obj;
        comparator.getClass();
        collection.getClass();
        if (collection instanceof SortedSet) {
            obj = ((SortedSet) collection).comparator();
            if (obj == null) {
                obj = dj2.h;
            }
        } else {
            if (!(collection instanceof nj2)) {
                return false;
            }
            obj = ((nj2) collection).i;
        }
        return comparator.equals(obj);
    }

    public static void a(StringBuilder sb, Object obj, lf0 lf0Var) {
        if (lf0Var != null) {
            sb.append((CharSequence) lf0Var.j(obj));
            return;
        }
        if (obj == null ? true : obj instanceof CharSequence) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static final void b(i72 i72Var, zf zfVar, gq0 gq0Var) {
        AutoCloseable autoCloseable;
        zfVar.getClass();
        gq0Var.getClass();
        j72 j72Var = i72Var.f414a;
        if (j72Var != null) {
            synchronized (j72Var.f466a) {
                autoCloseable = (AutoCloseable) j72Var.b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        pj1 pj1Var = (pj1) autoCloseable;
        if (pj1Var == null || pj1Var.i) {
            return;
        }
        pj1Var.j(zfVar, gq0Var);
        yp0 yp0Var = gq0Var.c;
        if (yp0Var == yp0.h || yp0Var.compareTo(yp0.j) >= 0) {
            zfVar.M();
        } else {
            gq0Var.a(new a20(gq0Var, 3, zfVar));
        }
    }

    public static int c() {
        String K;
        try {
            String[] strArr = {"/sys/class/power_supply/battery/battery_cell_count", "/sys/class/power_supply/bms/battery_cell_count", "/sys/class/power_supply/battery/cell_count", "/sys/class/power_supply/bms/cell_count"};
            for (int i2 = 0; i2 < 4; i2++) {
                String str = strArr[i2];
                if (uz1.q(str) && (K = uz1.K(str)) != null && "2".equals(K.trim())) {
                    return 3;
                }
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        if (r5 > 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008b, code lost:
    
        if (g() == 2) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ae A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0029 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean d(android.content.Context r9, android.content.Intent r10) {
        /*
            r0 = 2
            r1 = 0
            if (r10 == 0) goto Le
            java.lang.String r2 = "battery_charge_balance_type"
            boolean r2 = r10.hasExtra(r2)     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto Le
            r2 = r0
            goto Lf
        Le:
            r2 = r1
        Lf:
            int r3 = c()
            int r3 = r3 + r2
            boolean r2 = D()
            if (r2 == 0) goto L1c
            int r3 = r3 + 3
        L1c:
            boolean r2 = C()
            if (r2 == 0) goto L24
            int r3 = r3 + 3
        L24:
            java.lang.String r2 = "voltage"
            r4 = -1
            if (r10 == 0) goto L30
            java.lang.String r5 = "level"
            int r5 = r10.getIntExtra(r5, r4)     // Catch: java.lang.Throwable -> L8f
            goto L31
        L30:
            r5 = r1
        L31:
            r6 = 15
            if (r5 <= r6) goto L8f
            java.lang.String r5 = "userBatCapacity"
            boolean r6 = defpackage.i51.g(r5)     // Catch: java.lang.Throwable -> L44
            if (r6 == 0) goto L44
            int r5 = defpackage.i51.c(r4, r5)     // Catch: java.lang.Throwable -> L44
            if (r5 <= 0) goto L44
            goto L53
        L44:
            int r5 = t(r9)     // Catch: java.lang.Throwable -> L8f
            if (r5 <= 0) goto L4b
            goto L53
        L4b:
            int r5 = h(r9)     // Catch: java.lang.Throwable -> L8f
            if (r5 <= 0) goto L52
            goto L53
        L52:
            r5 = r4
        L53:
            int r9 = j(r9, r10)     // Catch: java.lang.Throwable -> L8f
            if (r5 <= 0) goto L8f
            if (r9 <= 0) goto L8f
            double r5 = (double) r5     // Catch: java.lang.Throwable -> L8f
            double r7 = (double) r9     // Catch: java.lang.Throwable -> L8f
            double r5 = r5 / r7
            r7 = 4611010478483282330(0x3ffd99999999999a, double:1.85)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L8f
            r7 = 4612023788399440691(0x4001333333333333, double:2.15)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L8f
            if (r10 == 0) goto L7b
            int r9 = r10.getIntExtra(r2, r4)     // Catch: java.lang.Throwable -> L8f
            r5 = 5500(0x157c, float:7.707E-42)
            if (r9 < r5) goto L7b
            goto L8d
        L7b:
            boolean r9 = D()     // Catch: java.lang.Throwable -> L8f
            if (r9 != 0) goto L8d
            boolean r9 = C()     // Catch: java.lang.Throwable -> L8f
            if (r9 != 0) goto L8d
            int r9 = g()     // Catch: java.lang.Throwable -> L8f
            if (r9 != r0) goto L8f
        L8d:
            int r3 = r3 + 2
        L8f:
            if (r10 == 0) goto Lab
            int r9 = r10.getIntExtra(r2, r4)     // Catch: java.lang.Throwable -> Lab
            if (r9 <= 0) goto Lab
            float r9 = (float) r9
            r10 = 1148846080(0x447a0000, float:1000.0)
            float r9 = r9 / r10
            r10 = 1086324736(0x40c00000, float:6.0)
            int r10 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r10 < 0) goto La3
            int r3 = r3 + 1
        La3:
            r10 = 1088421888(0x40e00000, float:7.0)
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 < 0) goto Lab
            int r3 = r3 + 1
        Lab:
            r9 = 3
            if (r3 < r9) goto Laf
            r1 = 1
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om0.d(android.content.Context, android.content.Intent):boolean");
    }

    public static void e(ArrayList arrayList, JSONObject jSONObject, String str) {
        double optDouble = jSONObject == null ? 0.0d : jSONObject.optDouble(str, 0.0d);
        if (optDouble <= 0.0d || Double.isNaN(optDouble)) {
            return;
        }
        arrayList.add(Double.valueOf(optDouble));
    }

    public static int f(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int g() {
        String K;
        try {
            String[] strArr = {"/sys/class/power_supply/battery/battery_cell_count", "/sys/class/power_supply/bms/battery_cell_count", "/sys/class/power_supply/battery/cell_count", "/sys/class/power_supply/bms/cell_count"};
            for (int i2 = 0; i2 < 4; i2++) {
                String str = strArr[i2];
                if (uz1.q(str) && (K = uz1.K(str)) != null) {
                    String trim = K.trim();
                    if ("1".equals(trim)) {
                        return 1;
                    }
                    if ("2".equals(trim)) {
                        return 2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return 0;
    }

    public static int h(Context context) {
        int i2;
        if (i51.g("userBatCapacity")) {
            return i51.c(-1, "userBatCapacity");
        }
        try {
            Class<?> cls = Class.forName("com.android.internal.os.PowerProfile");
            i2 = Math.round((long) ((Double) cls.getMethod("getBatteryCapacity", null).invoke(cls.getDeclaredConstructor(Context.class).newInstance(context), null)).doubleValue());
        } catch (Exception unused) {
            i2 = 0;
        }
        if (i2 < 10) {
            i2 *= 1000;
        }
        if (i2 == 0 || i2 > 7000) {
            BatteryManager batteryManager = (BatteryManager) context.getSystemService(qJTtDWNCVUDjB.GbmnwtZwfttoeL);
            int intProperty = batteryManager.getIntProperty(1);
            i2 = (int) (Math.round((batteryManager.getIntProperty(4) > 0 ? (intProperty / r6) / 10 : 0) / 5.0d) * 5);
        }
        i51.j(i2, "userBatCapacity");
        return i2;
    }

    public static int i(Context context) {
        BatteryManager batteryManager;
        int intProperty;
        int intExtra;
        try {
            batteryManager = (BatteryManager) context.getSystemService("batterymanager");
            intProperty = batteryManager.getIntProperty(1);
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            intExtra = (int) ((registerReceiver.getIntExtra("level", -1) * 100.0f) / registerReceiver.getIntExtra("scale", -1));
        } catch (Exception unused) {
        }
        if (intProperty < 10) {
            return 0;
        }
        int i2 = ((((intProperty / intExtra) / 10) + 50) / 100) * 100;
        if ((Build.VERSION.SDK_INT >= 26 ? batteryManager.getIntProperty(6) : -1) == 5) {
            i51.j((intProperty / intExtra) / 10, "pref_bat_cap_est");
        } else if (intExtra == 100 && !i51.g("pref_bat_cap_est")) {
            i51.j(i2, "pref_bat_cap_est");
        }
        int c2 = i51.c(-1, "pref_bat_cap_est");
        if (c2 > 0) {
            return c2;
        }
        if (intExtra >= 90) {
            return i2;
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #0 {all -> 0x006f, blocks: (B:3:0x0001, B:9:0x001a, B:12:0x0026, B:14:0x0032, B:16:0x0040, B:19:0x004c, B:22:0x0057), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int j(android.content.Context r7, android.content.Intent r8) {
        /*
            r0 = -1
            r1 = 0
            java.lang.String r1 = flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs.BuLNsMpwYkiCPav     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r1 = r7.getSystemService(r1)     // Catch: java.lang.Throwable -> L6f
            android.os.BatteryManager r1 = (android.os.BatteryManager) r1     // Catch: java.lang.Throwable -> L6f
            r2 = 1
            int r1 = r1.getIntProperty(r2)     // Catch: java.lang.Throwable -> L6f
            if (r1 > 0) goto L12
            return r0
        L12:
            r2 = 1120403456(0x42c80000, float:100.0)
            java.lang.String r3 = "scale"
            java.lang.String r4 = "level"
            if (r8 == 0) goto L2f
            int r5 = r8.getIntExtra(r4, r0)     // Catch: java.lang.Throwable -> L6f
            int r8 = r8.getIntExtra(r3, r0)     // Catch: java.lang.Throwable -> L6f
            if (r5 < 0) goto L2f
            if (r8 <= 0) goto L2f
            float r5 = (float) r5     // Catch: java.lang.Throwable -> L6f
            float r5 = r5 * r2
            float r8 = (float) r8     // Catch: java.lang.Throwable -> L6f
            float r5 = r5 / r8
            int r8 = java.lang.Math.round(r5)     // Catch: java.lang.Throwable -> L6f
            goto L30
        L2f:
            r8 = r0
        L30:
            if (r8 > 0) goto L54
            android.content.IntentFilter r5 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L6f
            java.lang.String r6 = "android.intent.action.BATTERY_CHANGED"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L6f
            r6 = 0
            android.content.Intent r7 = r7.registerReceiver(r6, r5)     // Catch: java.lang.Throwable -> L6f
            if (r7 == 0) goto L54
            int r4 = r7.getIntExtra(r4, r0)     // Catch: java.lang.Throwable -> L6f
            int r7 = r7.getIntExtra(r3, r0)     // Catch: java.lang.Throwable -> L6f
            if (r4 < 0) goto L54
            if (r7 <= 0) goto L54
            float r8 = (float) r4     // Catch: java.lang.Throwable -> L6f
            float r8 = r8 * r2
            float r7 = (float) r7     // Catch: java.lang.Throwable -> L6f
            float r8 = r8 / r7
            int r8 = java.lang.Math.round(r8)     // Catch: java.lang.Throwable -> L6f
        L54:
            if (r8 > 0) goto L57
            return r0
        L57:
            long r1 = (long) r1     // Catch: java.lang.Throwable -> L6f
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            r3 = 100
            long r1 = r1 * r3
            long r7 = (long) r8     // Catch: java.lang.Throwable -> L6f
            long r1 = r1 / r7
            r7 = 0
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 <= 0) goto L6f
            r7 = 20000(0x4e20, double:9.8813E-320)
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 <= 0) goto L6d
            goto L6f
        L6d:
            int r7 = (int) r1
            return r7
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om0.j(android.content.Context, android.content.Intent):int");
    }

    public static int k() {
        String str = Build.MODEL;
        String trim = str != null ? str.trim() : "";
        String str2 = Build.DEVICE;
        if (str2 != null) {
            str2.getClass();
        }
        if (trim.equals("OP5D2BL1")) {
            return -1;
        }
        return (trim.equals("OP595DL1") || trim.equals("OP5D55L1") || trim.equals("OP611FL1") || trim.equals(UQdsoaJMID.BooFlXEPHKDqg)) ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:
    
        r4 = java.lang.Long.parseLong(r5.group(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00aa, code lost:
    
        if (r0 == null) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long l() {
        /*
            Method dump skipped, instructions count: 202
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om0.l():long");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
    
        r3 = java.lang.Long.parseLong(r6.group(1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long m() {
        /*
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = defpackage.om0.g
            long r2 = r0 - r2
            r4 = 300000(0x493e0, double:1.482197E-318)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r3 = -1
            if (r2 >= 0) goto L1a
            long r5 = defpackage.om0.f
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 == 0) goto L1a
            long r0 = defpackage.om0.f
            return r0
        L1a:
            java.lang.String r2 = "dumpsys batterystats | grep \"Last learned battery capacity\""
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Exception -> L60
            i61 r2 = defpackage.wn1.a(r2)     // Catch: java.lang.Exception -> L60
            rg1 r2 = r2.o()     // Catch: java.lang.Exception -> L60
            boolean r5 = r2.e()     // Catch: java.lang.Exception -> L60
            if (r5 != 0) goto L2f
            goto L35
        L2f:
            java.util.List r2 = r2.c()     // Catch: java.lang.Exception -> L60
            if (r2 != 0) goto L36
        L35:
            return r3
        L36:
            r5 = 0
            java.lang.String r5 = com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ.xplV     // Catch: java.lang.Exception -> L60
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)     // Catch: java.lang.Exception -> L60
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L60
        L41:
            boolean r6 = r2.hasNext()     // Catch: java.lang.Exception -> L60
            if (r6 == 0) goto L60
            java.lang.Object r6 = r2.next()     // Catch: java.lang.Exception -> L60
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L60
            java.util.regex.Matcher r6 = r5.matcher(r6)     // Catch: java.lang.Exception -> L60
            boolean r7 = r6.find()     // Catch: java.lang.Exception -> L60
            if (r7 == 0) goto L41
            r2 = 1
            java.lang.String r2 = r6.group(r2)     // Catch: java.lang.Exception -> L60
            long r3 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Exception -> L60
        L60:
            defpackage.om0.f = r3
            defpackage.om0.g = r0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.om0.m():long");
    }

    public static long n() {
        String u;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = -1;
        if (currentTimeMillis - g < 300000 && f != -1) {
            return f;
        }
        try {
            u = ju0.u("dumpsys batterystats | grep \"Last learned battery capacity\"");
        } catch (Exception unused) {
        }
        if (u != null && !u.isEmpty()) {
            Matcher matcher = Pattern.compile("Last learned battery capacity:\\s*(\\d+)").matcher(u);
            if (matcher.find()) {
                j2 = Long.parseLong(matcher.group(1));
            }
            f = j2;
            g = currentTimeMillis;
            return j2;
        }
        return -1L;
    }

    public static String o(int i2) {
        if (i2 <= 1000000) {
            if (i2 <= 100000) {
                return String.valueOf(i2);
            }
            return d51.t(new StringBuilder(), (int) (i2 / 1000.0d), " mA");
        }
        return (i2 / 1000000.0d) + " A";
    }

    public static String p(int i2) {
        if (i2 <= 1000000) {
            return String.valueOf(i2);
        }
        return (i2 / 1000000.0d) + " V";
    }

    public static hw0 q(Context context) {
        long j2;
        long j3;
        long j4;
        hw0 hw0Var;
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getApplicationContext().getSystemService("activity")).getMemoryInfo(memoryInfo);
            String[] strArr = null;
            try {
                String o = uz1.o("free | grep Mem");
                if (o.isEmpty()) {
                    j2 = memoryInfo.totalMem;
                } else {
                    strArr = o.trim().split("\\s+");
                    j2 = Long.parseLong(strArr[1]);
                }
            } catch (Exception unused) {
                j2 = memoryInfo.totalMem;
            }
            long j5 = j2;
            try {
                String[] split = uz1.o("cat /proc/meminfo").trim().split("\\s+");
                j3 = Long.parseLong(split[1]) * 1024;
                j4 = Long.parseLong(split[7]) * 1024;
            } catch (Exception unused2) {
                j3 = memoryInfo.totalMem;
                j4 = memoryInfo.availMem;
            }
            long j6 = j3;
            long j7 = memoryInfo.totalMem;
            if (j7 == j5 && j7 == j6) {
                long j8 = memoryInfo.availMem;
                long j9 = j7 - j8;
                hw0 hw0Var2 = new hw0(j7, j8, j9, j7);
                if (j7 > 3800000000L && j9 < 700000000) {
                    hw0Var2 = new hw0(1000000000L, j8, j9, j7);
                }
                hw0 hw0Var3 = hw0Var2;
                return ((double) hw0Var3.c) / ((double) hw0Var3.f404a) < 0.1d ? new hw0(200L, j8, j9, j7) : hw0Var3;
            }
            TreeMap treeMap = new TreeMap();
            treeMap.put("mi", Long.valueOf(memoryInfo.totalMem));
            treeMap.put("free", Long.valueOf(j5 > 0 ? j5 : memoryInfo.totalMem));
            treeMap.put("meminfo", Long.valueOf(j6));
            Map.Entry entry = (Map.Entry) treeMap.entrySet().toArray()[0];
            Map.Entry entry2 = (Map.Entry) treeMap.entrySet().toArray()[treeMap.size() - 1];
            try {
                if (((Long) entry2.getValue()).longValue() - ((Long) entry.getValue()).longValue() > 1000000000) {
                    String str = (String) entry.getKey();
                    int hashCode = str.hashCode();
                    if (hashCode == 3484) {
                        str.equals("mi");
                    } else if (hashCode != 3151468) {
                        if (hashCode == 949098499 && str.equals("meminfo")) {
                            return new hw0(j6, j4, j6 - j4, ((Long) entry2.getValue()).longValue());
                        }
                    } else if (str.equals("free")) {
                        if (strArr != null && j5 > 0) {
                            return new hw0(j5, Long.parseLong(strArr[3]), Long.parseLong(strArr[2]), ((Long) entry2.getValue()).longValue());
                        }
                        long j10 = memoryInfo.totalMem;
                        long j11 = memoryInfo.availMem;
                        return new hw0(j10, j11, j10 - j11, ((Long) entry2.getValue()).longValue());
                    }
                    long j12 = memoryInfo.totalMem;
                    long j13 = memoryInfo.availMem;
                    hw0Var = new hw0(j12, j13, j12 - j13, ((Long) entry2.getValue()).longValue());
                } else {
                    long j14 = memoryInfo.totalMem;
                    long j15 = memoryInfo.availMem;
                    hw0Var = new hw0(j14, j15, j14 - j15, j14);
                }
                return hw0Var;
            } catch (Exception unused3) {
                long j16 = memoryInfo.totalMem;
                long j17 = memoryInfo.availMem;
                return new hw0(j16, j17, j16 - j17, j16);
            }
        } catch (Exception unused4) {
            ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getApplicationContext().getSystemService("activity")).getMemoryInfo(memoryInfo2);
            long j18 = memoryInfo2.availMem;
            long j19 = memoryInfo2.totalMem;
            return new hw0(200L, j18, j19 - j18, j19);
        }
    }

    public static String r(long j2) {
        float f2 = (((j2 / 1048576) + 249) / 250) * 250;
        if (f2 <= 750.0f) {
            return f2 > 512.0f ? "768 MB" : f2 > 256.0f ? "512 MB" : f2 > 128.0f ? "256 MB" : f2 > 100.0f ? hTYJVDOvZnZlYL.vko : f2 + " MB";
        }
        float f3 = f2 / 1000.0f;
        return f3 > 32.0f ? (Math.ceil(f3 * 2.0f) / 2.0d) + " GB" : f3 > 30.0f ? "32 GB" : f3 > 28.0f ? "30 GB" : f3 > 26.0f ? "28 GB" : f3 > 24.0f ? "26 GB" : f3 > 22.0f ? "24 GB" : f3 > 20.0f ? "22 GB" : f3 > 18.0f ? "20 GB" : f3 > 16.0f ? "18 GB" : f3 > 14.0f ? IGQCApxXGMWo.zJDWO : f3 > 12.0f ? "14 GB" : f3 > 10.0f ? "12 GB" : f3 > 8.0f ? "10 GB" : f3 > 6.0f ? "8 GB" : f3 > 4.0f ? "6 GB" : f3 > 3.0f ? "4 GB" : f3 > 2.0f ? "3 GB" : ((double) f3) > 1.6d ? "2 GB" : f3 > 1.0f ? "1.5 GB" : "1 GB";
    }

    public static String s(Context context) {
        try {
            Class<?> cls = Class.forName("com.android.internal.os.PowerProfile");
            int round = Math.round((long) ((Double) cls.getMethod("getBatteryCapacity", null).invoke(cls.getDeclaredConstructor(Context.class).newInstance(context), null)).doubleValue());
            if (round < 10) {
                round *= 1000;
            }
            String str = Build.DEVICE;
            return (str.equals("g2") || str.equals("OnePlus3")) ? "3000 mAh" : str.equals("OnePlus3T") ? "3400 mAh" : round > 1000 ? d51.o(round, " mAh") : context.getString(R.string.not_avail);
        } catch (Exception unused) {
            return context.getString(R.string.not_avail);
        }
    }

    public static int t(Context context) {
        if (f > 0) {
            return Math.toIntExact(f);
        }
        if (Build.MODEL.equalsIgnoreCase("Pixel 8 Pro")) {
            return 5020;
        }
        try {
            Class<?> cls = Class.forName("com.android.internal.os.PowerProfile");
            int round = Math.round((long) ((Double) cls.getMethod("getBatteryCapacity", null).invoke(cls.getDeclaredConstructor(Context.class).newInstance(context), null)).doubleValue());
            if (round < 10) {
                round *= 1000;
            }
            return round > 1000 ? round : ((i(context) + 50) / 100) * 100;
        } catch (Exception unused) {
            return ((i(context) + 50) / 100) * 100;
        }
    }

    public static ArrayList v(MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < materialToolbar.getChildCount(); i2++) {
            View childAt = materialToolbar.getChildAt(i2);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static String w(AudioDeviceInfo[] audioDeviceInfoArr) {
        AudioDeviceInfo audioDeviceInfo;
        if (audioDeviceInfoArr == null || audioDeviceInfoArr.length == 0) {
            return "";
        }
        int length = audioDeviceInfoArr.length;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                audioDeviceInfo = null;
                break;
            }
            audioDeviceInfo = audioDeviceInfoArr[i3];
            int type = audioDeviceInfo.getType();
            if (type == 11 || type == 22) {
                break;
            }
            i3++;
        }
        if (audioDeviceInfo == null) {
            return "";
        }
        int[] sampleRates = audioDeviceInfo.getSampleRates();
        int[] encodings = audioDeviceInfo.getEncodings();
        boolean z = sampleRates != null && sampleRates.length > 0;
        boolean z2 = encodings != null && encodings.length > 0;
        if (!z && !z2) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            Arrays.sort(sampleRates);
            StringBuilder sb2 = new StringBuilder();
            int i4 = -1;
            for (int i5 : sampleRates) {
                if (i5 > 0 && i5 != i4) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    if (i5 % 1000 == 0) {
                        sb2.append(i5 / 1000);
                        sb2.append(" kHz");
                    } else {
                        sb2.append(String.format(Locale.US, "%.1f kHz", Double.valueOf(i5 / 1000.0d)));
                    }
                    i4 = i5;
                }
            }
            if (sb2.length() > 0) {
                sb.append("Rates: ");
                sb.append((CharSequence) sb2);
            }
        }
        if (z2) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (int i6 : encodings) {
                if (i6 == 2) {
                    linkedHashSet.add("16-bit");
                } else if (i6 == 3) {
                    linkedHashSet.add("8-bit");
                } else if (i6 == 4) {
                    linkedHashSet.add(RIhTGWkqQvGL.RdsqdKIGaLmelMe);
                } else if (i6 == 21) {
                    linkedHashSet.add("24-bit");
                } else if (i6 == 22) {
                    linkedHashSet.add("32-bit");
                }
            }
            if (!linkedHashSet.isEmpty()) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append("Depth: ");
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    int i7 = i2 + 1;
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(str);
                    i2 = i7;
                }
            }
        }
        return sb.toString();
    }

    public static float z(Context context, Intent intent) {
        if (intent == null) {
            return -1.0f;
        }
        try {
            int intExtra = intent.getIntExtra("voltage", -1);
            if (intExtra <= 0) {
                return -1.0f;
            }
            float f2 = intExtra / 1000.0f;
            return (!G(context, intent) || f2 < 6.0f) ? f2 : f2 * 0.5f;
        } catch (Throwable unused) {
            return -1.0f;
        }
    }

    public abstract boolean E();

    public void K(boolean z) {
    }

    public abstract void L(boolean z);

    public abstract int u(View view, ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int x();

    public abstract ViewPropertyAnimator y(View view, int i2);
}
