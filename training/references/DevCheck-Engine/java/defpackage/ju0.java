package defpackage;

import Cwd.YSHrxiHkAFcciU;
import Cwd.ynLVXgis;
import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.biometrics.BiometricPrompt;
import android.net.Uri;
import android.os.Build;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.telephony.fHMN.BFtDZYxPcpGN;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.Fk.Iyrs;
import androidx.media.RfwE.BIxeFreLLop;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import com.google.android.material.bottomappbar.HaCM.QCeVODiUkb;
import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import com.google.android.material.slider.KtNX.UQdsoaJMID;
import com.imn.iivisu.ltkT.CDsMEtnUjndKau;
import flar2.devcheck.nativebridge.xm.oWuW;
import flar2.devcheck.permissionsSummary.xEua.bPnJ;
import flar2.devcheck.sensors.JCZI.nyGJ;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import flar2.devcheck.ui.root.IShizukuAidlInterface;
import flar2.devcheck.usage.GgP.rlfWzcx;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import moe.shizuku.api.hYGD.yttXLrAeLjN;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public abstract class ju0 {

    /* renamed from: a, reason: collision with root package name */
    public static Class f497a = null;
    public static int b = -1;
    public static Context c;
    public static final String[] d = {"/sys/devices/system/cpu/cpufreq/stats/cpu0/time_in_state", "/sys/devices/system/cpu/cpu0/cpufreq/stats/time_in_state", "/sys/devices/system/cpu/cpufreq/all_time_in_state"};
    public static final String[] e = {"/sys/devices/system/cpu/cpufreq/stats/cpu1/time_in_state", "/sys/devices/system/cpu/cpu1/cpufreq/stats/time_in_state", "/sys/devices/system/cpu/cpufreq/all_time_in_state"};
    public static final String[] f = {"/sys/devices/system/cpu/cpufreq/stats/cpu2/time_in_state", "/sys/devices/system/cpu/cpu2/cpufreq/stats/time_in_state", "/sys/devices/system/cpu/cpufreq/all_time_in_state"};
    public static final String[] g = {"/sys/devices/system/cpu/cpufreq/stats/cpu3/time_in_state", "/sys/devices/system/cpu/cpu3/cpufreq/stats/time_in_state", "/sys/devices/system/cpu/cpufreq/all_time_in_state"};
    public static final String[] h = {"/sys/devices/system/cpu/cpufreq/stats/cpu4/time_in_state", "/sys/devices/system/cpu/cpu4/cpufreq/stats/time_in_state", "/sys/devices/system/cpu/cpufreq/all_time_in_state"};
    public static final String[] i = {"/sys/devices/system/cpu/cpufreq/stats/cpu5/time_in_state", "/sys/devices/system/cpu/cpu5/cpufreq/stats/time_in_state", "/sys/devices/system/cpu/cpufreq/all_time_in_state"};
    public static final String[] j = {"/sys/devices/system/cpu/cpufreq/stats/cpu6/time_in_state", "/sys/devices/system/cpu/cpu6/cpufreq/stats/time_in_state", "/sys/devices/system/cpu/cpufreq/all_time_in_state"};
    public static final String[] k = {"/sys/devices/system/cpu/cpufreq/stats/cpu7/time_in_state", "/sys/devices/system/cpu/cpu7/cpufreq/stats/time_in_state", "/sys/devices/system/cpu/cpufreq/all_time_in_state"};
    public static final String[] l = {"/sys/devices/system/cpu/cpufreq/stats/cpu8/time_in_state", "/sys/devices/system/cpu/cpu8/cpufreq/stats/time_in_state", "/sys/devices/system/cpu/cpufreq/all_time_in_state"};
    public static final String[] m = {"/sys/devices/system/cpu/cpufreq/stats/cpu9/time_in_state", "/sys/devices/system/cpu/cpu9/cpufreq/stats/time_in_state", "/sys/devices/system/cpu/cpufreq/all_time_in_state"};
    public static final String[] n = {"/sys/devices/system/cpu/cpufreq/stats/cpu10/time_in_state", "/sys/devices/system/cpu/cpu10/cpufreq/stats/time_in_state", "/sys/devices/system/cpu/cpufreq/all_time_in_state"};
    public static final String[] o = {"/sys/devices/system/cpu/cpufreq/stats/cpu11/time_in_state", "/sys/devices/system/cpu/cpu11/cpufreq/stats/time_in_state", "/sys/devices/system/cpu/cpufreq/all_time_in_state"};
    public static final byte[] p = {112, 114, 111, 0};
    public static final byte[] q = {112, 114, 109, 0};
    public static Boolean r;

    public static String A(int i2, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (((or) entry.getValue()).f754a.contains(Integer.valueOf(i2))) {
                return ((or) entry.getValue()).f754a.get(0) + BFtDZYxPcpGN.MZweGfvAnX + ((or) entry.getValue()).f754a.get(((or) entry.getValue()).f754a.size() - 1);
            }
        }
        return uz1.K("/sys/devices/system/cpu/cpu" + i2 + "/topology/core_siblings_list");
    }

    public static Object A0(pf0 pf0Var, Object obj, dx dxVar) {
        pf0Var.getClass();
        qx d2 = dxVar.d();
        Object zm0Var = d2 == n80.g ? new zm0(dxVar) : new an0(dxVar, d2);
        k32.g(2, pf0Var);
        return pf0Var.f(obj, zm0Var);
    }

    public static String B(Map map) {
        boolean z;
        if (map == null || map.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            or orVar = (or) ((Map.Entry) it.next()).getValue();
            if (orVar != null) {
                HashMap hashMap = orVar.f;
                String z0 = uz1.z0(orVar.d);
                String z02 = uz1.z0(orVar.e);
                boolean z2 = false;
                boolean z3 = true;
                boolean z4 = (z0 == null || z0.contains("NA") || z0.length() <= 0) ? false : true;
                boolean z5 = (z02 == null || z02.contains("NA") || z02.length() <= 0) ? false : true;
                if (hashMap == null || hashMap.isEmpty()) {
                    if (z4) {
                        sb.append(z0);
                        if (z5) {
                            sb.append(" - ");
                        }
                        z2 = true;
                    }
                    if (z5) {
                        sb.append(z02);
                    } else {
                        z3 = z2;
                    }
                    if (z3) {
                        sb.append("\n");
                    }
                } else {
                    ArrayList arrayList = new ArrayList(hashMap.keySet());
                    Collections.sort(arrayList);
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if (z4) {
                            sb.append(z0);
                            if (z5) {
                                sb.append(" - ");
                            }
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z5) {
                            sb.append(z02);
                            z = true;
                        }
                        if (z) {
                            sb.append("\n");
                        }
                    }
                }
            }
        }
        return sb.toString().trim();
    }

    public static void B0(ByteArrayOutputStream byteArrayOutputStream, b40 b40Var) {
        E0(byteArrayOutputStream, b40Var);
        int i2 = b40Var.g;
        int[] iArr = b40Var.h;
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = iArr[i3];
            sl.t0(byteArrayOutputStream, i5 - i4);
            i3++;
            i4 = i5;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : b40Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i6 = intValue / 8;
                bArr[i6] = (byte) (bArr[i6] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i7 = intValue + i2;
                int i8 = i7 / 8;
                bArr[i8] = (byte) ((1 << (i7 % 8)) | bArr[i8]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
    
        r6 = r1.c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String C(java.util.Map r10) {
        /*
            if (r10 == 0) goto Laa
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto La
            goto Laa
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L17:
            boolean r1 = r10.hasNext()
            java.lang.String r2 = "NA"
            if (r1 == 0) goto L9a
            java.lang.Object r1 = r10.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            or r1 = (defpackage.or) r1
            java.lang.String r3 = "\n"
            r4 = 0
            java.lang.String r4 = flar2.devcheck.permissionsSummary.xEua.bPnJ.GGjXgDDu
            r5 = 0
            if (r1 == 0) goto L72
            java.util.HashMap r6 = r1.f
            if (r6 == 0) goto L72
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L72
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Set r2 = r6.keySet()
            r1.<init>(r2)
            java.util.Collections.sort(r1)
            int r2 = r1.size()
        L4d:
            if (r5 >= r2) goto L17
            java.lang.Object r7 = r1.get(r5)
            int r5 = r5 + 1
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r8 = r6.get(r7)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto L4d
            int r9 = r8.intValue()
            if (r9 <= 0) goto L4d
            r0.append(r8)
            r0.append(r4)
            r0.append(r7)
            r0.append(r3)
            goto L4d
        L72:
            if (r1 == 0) goto L77
            java.lang.String r6 = r1.c
            goto L78
        L77:
            r6 = 0
        L78:
            if (r6 == 0) goto L82
            boolean r7 = r6.isEmpty()
            if (r7 == 0) goto L81
            goto L82
        L81:
            r2 = r6
        L82:
            if (r1 == 0) goto L8c
            java.util.List r1 = r1.f754a
            if (r1 == 0) goto L8c
            int r5 = r1.size()
        L8c:
            r0.append(r5)
            r0.append(r4)
            r0.append(r2)
            r0.append(r3)
            goto L17
        L9a:
            java.lang.String r10 = r0.toString()
            java.lang.String r10 = r10.trim()
            boolean r0 = r10.contains(r2)
            if (r0 == 0) goto La9
            goto Laa
        La9:
            return r10
        Laa:
            r10 = 0
            java.lang.String r10 = flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs.RBFRrUgbZKuO
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju0.C(java.util.Map):java.lang.String");
    }

    public static void C0(ByteArrayOutputStream byteArrayOutputStream, b40 b40Var, String str) {
        Charset charset = StandardCharsets.UTF_8;
        sl.t0(byteArrayOutputStream, str.getBytes(charset).length);
        sl.t0(byteArrayOutputStream, b40Var.e);
        sl.s0(byteArrayOutputStream, b40Var.f, 4);
        sl.s0(byteArrayOutputStream, b40Var.c, 4);
        sl.s0(byteArrayOutputStream, b40Var.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static ColorStateList D(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !r0.r(drawable)) {
            return null;
        }
        colorStateList = r0.g(drawable).getColorStateList();
        return colorStateList;
    }

    public static void D0(ByteArrayOutputStream byteArrayOutputStream, int i2, b40 b40Var) {
        int i3 = b40Var.g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i3) + 7) & (-8)) / 8];
        for (Map.Entry entry : b40Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i4 = 0;
            for (int i5 = 1; i5 <= 4; i5 <<= 1) {
                if (i5 != 1 && (i5 & i2) != 0) {
                    if ((i5 & intValue2) == i5) {
                        int i6 = (i4 * i3) + intValue;
                        int i7 = i6 / 8;
                        bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
                    }
                    i4++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static ViewGroup E(fe feVar) {
        View rootView = feVar.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == feVar || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static void E0(ByteArrayOutputStream byteArrayOutputStream, b40 b40Var) {
        int i2 = 0;
        for (Map.Entry entry : b40Var.i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                sl.t0(byteArrayOutputStream, intValue - i2);
                sl.t0(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    public static Context F() {
        if (c == null) {
            try {
                Context context = (Context) Class.forName("android.app.ActivityThread").getMethod(hTYJVDOvZnZlYL.wadrYPinCMCxrJ, null).invoke(null, null);
                while (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
                c = context;
            } catch (Exception unused) {
            }
        }
        return c;
    }

    public static void F0(Parcel parcel, int i2, int i3) {
        int n0 = n0(parcel, i2);
        if (n0 == i3) {
            return;
        }
        String hexString = Integer.toHexString(n0);
        int length = String.valueOf(i3).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(n0).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i3);
        sb.append(BIxeFreLLop.lvQKKnHK);
        sb.append(n0);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new pt(sb.toString(), parcel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r7 = java.lang.Integer.parseInt(r3.split(":")[1].trim());
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:101:0x00b0. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:102:0x00b3. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:103:0x00b6. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010f A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String G() {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju0.G():java.lang.String");
    }

    public static /* synthetic */ boolean G0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, ro2 ro2Var, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(ro2Var, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(ro2Var) != obj && atomicReferenceFieldUpdater.get(ro2Var) != obj) {
                return false;
            }
        }
        return true;
    }

    public static String H(String str) {
        String lowerCase = str.toLowerCase();
        String trim = lowerCase.contains("exynos") ? lowerCase.replace("exynos", "").trim() : lowerCase.contains("universal") ? lowerCase.replace("universal", "").trim() : null;
        if (trim != null && trim.contains("samsung")) {
            trim = trim.replace("samsung", "").trim();
        }
        if (trim.contains("_go")) {
            trim = trim.replace("_go", " Go");
        }
        return (trim == null || trim.isEmpty()) ? str : "Exynos ".concat(trim);
    }

    public static a61 I(int i2) {
        String K;
        String K2 = uz1.K("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_min_freq");
        if (K2.equals("NA")) {
            ArrayList n2 = uz1.n("cat " + i(i2));
            if (n2.size() <= 2) {
                return new a61("NA", "NA");
            }
            ArrayList arrayList = new ArrayList();
            int size = n2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = n2.get(i3);
                i3++;
                String str = (String) obj;
                try {
                    try {
                        arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, str.indexOf(" ")))));
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                    arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, str.indexOf(Iyrs.pKpvhYD)))));
                }
            }
            if (arrayList.size() <= 2) {
                return new a61("NA", "NA");
            }
            Collections.sort(arrayList);
            String num = ((Integer) arrayList.get(0)).toString();
            String num2 = ((Integer) d51.m(arrayList, 1)).toString();
            K2 = num;
            K = num2;
        } else {
            K = uz1.K("/sys/devices/system/cpu/cpu" + i2 + "/cpufreq/cpuinfo_max_freq");
        }
        return new a61(K2, K);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x010a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String J() {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju0.J():java.lang.String");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:36:0x008e
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    public static java.lang.String K() {
        /*
            java.lang.String r0 = "Atom(TM)"
            java.lang.String r1 = "Hardware"
            java.lang.String r2 = "NA"
            java.lang.String r3 = "hardware2"
            boolean r4 = defpackage.i51.g(r3)
            if (r4 == 0) goto L13
            java.lang.String r0 = defpackage.i51.e(r3)
            return r0
        L13:
            java.io.File r4 = new java.io.File
            java.lang.String r5 = "/proc/cpuinfo"
            r4.<init>(r5)
            java.util.Scanner r5 = new java.util.Scanner     // Catch: java.io.FileNotFoundException -> L3a
            r5.<init>(r4)     // Catch: java.io.FileNotFoundException -> L3a
            r4 = r2
        L20:
            boolean r6 = r5.hasNextLine()     // Catch: java.io.FileNotFoundException -> L3a
            if (r6 == 0) goto L36
            java.lang.String r4 = r5.nextLine()     // Catch: java.io.FileNotFoundException -> L3a
            boolean r6 = r4.contains(r1)     // Catch: java.io.FileNotFoundException -> L3a
            if (r6 != 0) goto L36
            boolean r6 = r4.contains(r0)     // Catch: java.io.FileNotFoundException -> L3a
            if (r6 == 0) goto L20
        L36:
            r5.close()     // Catch: java.io.FileNotFoundException -> L3a
            r2 = r4
        L3a:
            boolean r1 = r2.contains(r1)
            if (r1 != 0) goto L46
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L5a
        L46:
            java.lang.String r0 = ":"
            boolean r1 = r2.contains(r0)
            if (r1 == 0) goto L5a
            java.lang.String[] r0 = r2.split(r0)
            r1 = 1
            r0 = r0[r1]
            java.lang.String r0 = r0.trim()
            goto L90
        L5a:
            java.lang.String r0 = "ro.soc.model"
            java.lang.String r0 = defpackage.uz1.X(r0)     // Catch: java.lang.Exception -> L8e
            java.lang.String r1 = "xynos"
            r2 = 3
            if (r0 == 0) goto L74
            int r4 = r0.length()     // Catch: java.lang.Exception -> L8e
            if (r4 <= r2) goto L74
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Exception -> L8e
            if (r1 == 0) goto L90
            java.lang.String r0 = android.os.Build.BOARD     // Catch: java.lang.Exception -> L8e
            goto L90
        L74:
            java.lang.String r0 = "ro.board.platform"
            java.lang.String r0 = defpackage.uz1.X(r0)     // Catch: java.lang.Exception -> L8e
            if (r0 == 0) goto L8b
            int r4 = r0.length()     // Catch: java.lang.Exception -> L8e
            if (r4 <= r2) goto L8b
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Exception -> L8e
            if (r1 == 0) goto L90
            java.lang.String r0 = android.os.Build.BOARD     // Catch: java.lang.Exception -> L8e
            goto L90
        L8b:
            java.lang.String r0 = android.os.Build.BOARD     // Catch: java.lang.Exception -> L8e
            goto L90
        L8e:
            java.lang.String r0 = android.os.Build.BOARD
        L90:
            defpackage.i51.l(r3, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju0.K():java.lang.String");
    }

    public static String L(int i2) {
        int a0 = a0(i2);
        if (a0 == 65) {
            int b0 = b0(i2);
            if (b0 == 3077) {
                return QCeVODiUkb.MrpIiHQtq;
            }
            if (b0 == 3396) {
                return "Cortex-X1";
            }
            if (b0 == 3463) {
                return "Cortex-A725";
            }
            if (b0 == 3472) {
                return "Cortex-C1-Ultra";
            }
            if (b0 == 3341) {
                return "Cortex-A77";
            }
            if (b0 == 3342) {
                return "Cortex-A76";
            }
            if (b0 == 3392) {
                return "Neoverse V1";
            }
            if (b0 == 3393) {
                return "Cortex-A78";
            }
            if (b0 == 3460) {
                return CDsMEtnUjndKau.oUVsIY;
            }
            if (b0 == 3461) {
                return "Cortex-X925";
            }
            switch (b0) {
                case 3079:
                    return "Cortex-A7";
                case 3080:
                    return "Cortex-A8";
                case 3081:
                    return "Cortex-A9";
                default:
                    switch (b0) {
                        case 3084:
                        case 3085:
                            return "Cortex-A12";
                        case 3086:
                            return "Cortex-A17";
                        case 3087:
                            return "Cortex-A15";
                        default:
                            switch (b0) {
                                case 3329:
                                    return "Cortex-A32";
                                case 3330:
                                    return "Cortex-A34";
                                case 3331:
                                    return "Cortex-A53";
                                case 3332:
                                    return "Cortex-A35";
                                case 3333:
                                    return (i2 & 15728640) == 0 ? "Cortex-A55r0" : "Cortex-A55";
                                case 3334:
                                    return "Cortex-A65";
                                case 3335:
                                    return "Cortex-A57";
                                case 3336:
                                    return "Cortex-A72";
                                case 3337:
                                    return "Cortex-A73";
                                case 3338:
                                    return "Cortex-A75";
                                case 3339:
                                    return "Cortex-A76";
                                default:
                                    switch (b0) {
                                        case 3398:
                                            return "Cortex-A510";
                                        case 3399:
                                            return "Cortex-A710";
                                        case 3400:
                                            return "Cortex-X2";
                                        case 3401:
                                            return "Neoverse N2";
                                        case 3402:
                                            return "Neoverse E1";
                                        case 3403:
                                            return "Cortex-A78C";
                                        case 3404:
                                            return "Cortex-X1C";
                                        case 3405:
                                            return "Cortex-A715";
                                        case 3406:
                                            return "Cortex-X3";
                                        case 3407:
                                            return hTYJVDOvZnZlYL.dTcYq;
                                        default:
                                            switch (b0) {
                                                case 3456:
                                                    return "Cortex-A520";
                                                case 3457:
                                                    return "Cortex-A720";
                                                case 3458:
                                                    return "Cortex-X4";
                                                default:
                                                    switch (b0) {
                                                        case 3467:
                                                            return "Cortex-C1-Premium";
                                                        case 3468:
                                                            return "Cortex-C1-Pro";
                                                        case 3469:
                                                            return "Cortex-C1-Nano";
                                                        default:
                                                            int b02 = b0(i2) >> 8;
                                                            return b02 != 7 ? b02 != 9 ? b02 != 11 ? "ARMv8" : "ARM11" : "ARMv9" : "ARMv7";
                                                    }
                                            }
                                    }
                            }
                    }
            }
        }
        if (a0 == 66) {
            int b03 = b0(i2);
            if (b03 == 15) {
                return "Brahma B15";
            }
            if (b03 != 256) {
                return null;
            }
            return "Brahma B53";
        }
        if (a0 == 72) {
            int b04 = b0(i2);
            if (b04 == 1041 || b04 == 1042) {
                return "Cortex-A510";
            }
            if (b04 == 3398) {
                return "TaiSHan V130 (mid)";
            }
            if (b04 == 3408) {
                return "TaiSHan V140 (mid)";
            }
            switch (b04) {
                case 3329:
                    return "TaiSHan V110 / Cortex-A32";
                case 3330:
                    return "TaiSHan V120 (prime)";
                case 3331:
                    return "Cortex-A53";
                case 3332:
                    return "TaiSHan V121 (prime)";
                case 3333:
                    return "TaiSHan V130 (prime)";
                default:
                    switch (b04) {
                        case 3362:
                            return BIxeFreLLop.hLBarsnzFoY;
                        case 3363:
                            return "TaiSHan V130 (small)";
                        case 3364:
                            return "TaiSHan V121 (mid)";
                        default:
                            switch (b04) {
                                case 3392:
                                    return ((i2 >> 20) & 15) >= 2 ? "TaiSHan V140 (prime/small)" : "Cortex-A76";
                                case 3393:
                                    return "Cortex-A77";
                                case 3394:
                                    return "TaiSHan V200 (mid)";
                                default:
                                    return null;
                            }
                    }
            }
        }
        if (a0 == 78) {
            int b05 = b0(i2);
            if (b05 == 0) {
                return "Denver";
            }
            if (b05 == 3) {
                return "Denver2";
            }
            if (b05 != 4) {
                return null;
            }
            return "Carmel";
        }
        if (a0 != 81) {
            if (a0 == 83) {
                switch (i2 & 15794160) {
                    case 1048592:
                        return "Exynos M1";
                    case 1048608:
                        return "Exynos M3";
                    case 1048624:
                        return "Exynos M4";
                    case 1048640:
                        return "Exynos M5";
                    case 4194320:
                        return "Exynos M2";
                    default:
                        return null;
                }
            }
            if (a0 == 86) {
                int b06 = b0(i2);
                if (b06 == 1409 || b06 == 1412) {
                    return "pj4";
                }
                return null;
            }
            if (a0 != 105) {
                return null;
            }
            int b07 = b0(i2) >> 8;
            if (b07 == 2 || b07 == 4 || b07 == 6) {
                return "XScale";
            }
            return null;
        }
        int b08 = b0(i2);
        if (b08 == 1) {
            int i3 = (i2 & 15728640) >> 20;
            return i3 != 3 ? i3 != 4 ? "Oryon" : "Oryon Phoenix M" : "Oryon Phoenix L";
        }
        if (b08 == 2) {
            int i4 = (i2 & 15728640) >> 20;
            return i4 != 4 ? i4 != 5 ? "Oryon (Gen 3)" : "Oryon Performance (Gen 3)" : "Oryon Prime (Gen 3)";
        }
        if (b08 == 15 || b08 == 45) {
            return "Scorpion";
        }
        if (b08 == 77) {
            int i5 = i2 & 15728655;
            return (i5 == 1048576 || i5 == 1048580) ? "Krait 200" : i5 != 2097152 ? "Krait" : "Krait 300";
        }
        if (b08 == 111) {
            int i6 = i2 & 15728655;
            return (i6 == 1 || i6 == 2) ? "Krait 200" : i6 != 1048576 ? i6 != 3145729 ? (i6 == 2097152 || i6 == 2097153) ? "Krait 400" : "Krait" : "Krait 450" : "Krait 300";
        }
        if (b08 == 513) {
            return "Kryo Silver";
        }
        if (b08 == 517) {
            return "Kryo Gold";
        }
        if (b08 == 529) {
            return "Kryo Silver";
        }
        if (b08 == 3072) {
            return QCeVODiUkb.eyqexLO;
        }
        if (b08 == 3073) {
            return "Saphira";
        }
        switch (b08) {
            case rt0.w /* 2048 */:
                return "Kryo Gold (A73)";
            case 2049:
                return UQdsoaJMID.bkCclIzTJmagwc;
            case 2050:
                return "Kryo Gold (A75)";
            case 2051:
                return "Kryo Silver (A55r0)";
            case 2052:
                return oWuW.pcjPl;
            case 2053:
                return "Kryo Silver (A55)";
            default:
                return null;
        }
    }

    public static List M(int[] iArr) {
        try {
            if (!fo1.b()) {
                return null;
            }
            try {
                IShizukuAidlInterface iShizukuAidlInterface = fo1.f298a;
                if (iShizukuAidlInterface == null) {
                    throw new IllegalStateException("ShizukuExec not bound");
                }
                List<p91> processMemInfo = iShizukuAidlInterface.getProcessMemInfo(iArr);
                return processMemInfo != null ? processMemInfo : new ArrayList();
            } catch (Throwable unused) {
                return new ArrayList();
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public static Drawable N(Context context, String str) {
        if (str.isEmpty()) {
            return uz1.d(context) ? context.getDrawable(flar2.devcheck.R.drawable.ic_cpu_light) : context.getDrawable(flar2.devcheck.R.drawable.ic_cpu_dark);
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.contains(ILBLnlCHDVqsSN.gMDBlbQfV) || lowerCase.contains("ualcomm")) {
            return context.getDrawable(flar2.devcheck.R.drawable.ic_snapdragon);
        }
        if (lowerCase.contains(yttXLrAeLjN.bsjBgJXanMQKGBh) || lowerCase.contains("amsung")) {
            if (uz1.d(context)) {
                Drawable drawable = context.getDrawable(flar2.devcheck.R.drawable.ic_exynos);
                drawable.setTint(context.getColor(R.color.secondary_text_dark));
                return drawable;
            }
            Drawable drawable2 = context.getDrawable(flar2.devcheck.R.drawable.ic_exynos);
            drawable2.setTintList(null);
            return drawable2;
        }
        if (lowerCase.contains(UQdsoaJMID.eFjkGWzinSXok) || lowerCase.toLowerCase().contains("hisilicon")) {
            return uz1.d(context) ? context.getDrawable(flar2.devcheck.R.drawable.ic_kirin_dark) : context.getDrawable(flar2.devcheck.R.drawable.ic_kirin);
        }
        if (lowerCase.contains("ensor") || lowerCase.contains("oogle")) {
            return context.getDrawable(flar2.devcheck.R.drawable.ic_g_logo);
        }
        if (lowerCase.contains("ediatek")) {
            return context.getDrawable(flar2.devcheck.R.drawable.ic_mediatek);
        }
        if (lowerCase.contains("iaomi")) {
            return context.getDrawable(flar2.devcheck.R.drawable.ic_xring);
        }
        if (lowerCase.contains("nisoc")) {
            Drawable drawable3 = context.getDrawable(flar2.devcheck.R.drawable.ic_unisoc);
            if (uz1.d(context)) {
                drawable3.setTint(context.getColor(R.color.secondary_text_dark));
                return drawable3;
            }
            drawable3.setTintList(null);
            return drawable3;
        }
        if (lowerCase.contains("llwinner")) {
            Drawable drawable4 = context.getDrawable(flar2.devcheck.R.drawable.ic_allwinner);
            if (uz1.d(context)) {
                drawable4.setTint(context.getColor(R.color.secondary_text_dark));
                return drawable4;
            }
            drawable4.setTintList(null);
            return drawable4;
        }
        if (lowerCase.contains("realtek") || lowerCase.contains("rtk") || lowerCase.contains("rtd")) {
            return context.getDrawable(flar2.devcheck.R.drawable.ic_realtek);
        }
        if (lowerCase.contains(bPnJ.lmizvlxitziKMI)) {
            Drawable drawable5 = context.getDrawable(flar2.devcheck.R.drawable.ic_amlogic);
            if (uz1.d(context)) {
                drawable5.setTint(context.getColor(R.color.secondary_text_dark));
                return drawable5;
            }
            drawable5.setTintList(null);
            return drawable5;
        }
        if (lowerCase.contains("jlq")) {
            Drawable drawable6 = context.getDrawable(flar2.devcheck.R.drawable.ic_jlq);
            if (uz1.d(context)) {
                drawable6.setTint(context.getColor(R.color.secondary_text_dark));
                return drawable6;
            }
            drawable6.setTintList(null);
            return drawable6;
        }
        if (lowerCase.contains("egra") || lowerCase.contains("vidia")) {
            return context.getDrawable(flar2.devcheck.R.drawable.ic_tegra);
        }
        if (lowerCase.contains("ntel")) {
            return context.getDrawable(flar2.devcheck.R.drawable.ic_intel);
        }
        if (lowerCase.contains("amd") || lowerCase.contains("AMD")) {
            Drawable drawable7 = context.getDrawable(flar2.devcheck.R.drawable.ic_amd);
            if (uz1.d(context)) {
                drawable7.setTint(context.getColor(R.color.secondary_text_dark));
                return drawable7;
            }
            drawable7.setTintList(null);
            return drawable7;
        }
        if (lowerCase.contains("atom")) {
            return context.getDrawable(flar2.devcheck.R.drawable.ic_atom);
        }
        if (lowerCase.contains("ockchip")) {
            Drawable drawable8 = context.getDrawable(flar2.devcheck.R.drawable.ic_rockchip);
            if (uz1.d(context)) {
                drawable8.setTint(context.getColor(R.color.secondary_text_dark));
                return drawable8;
            }
            drawable8.setTintList(null);
            return drawable8;
        }
        if (!lowerCase.contains("arvell")) {
            return uz1.d(context) ? context.getDrawable(flar2.devcheck.R.drawable.ic_cpu_light) : context.getDrawable(flar2.devcheck.R.drawable.ic_cpu_dark);
        }
        Drawable drawable9 = context.getDrawable(flar2.devcheck.R.drawable.ic_marvell);
        if (uz1.d(context)) {
            drawable9.setTint(context.getColor(R.color.secondary_text_dark));
            return drawable9;
        }
        drawable9.setTintList(null);
        return drawable9;
    }

    public static File O(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(".font");
        sb.append(Process.myPid());
        String str = bPnJ.CIp;
        sb.append(str);
        sb.append(Process.myTid());
        sb.append(str);
        String sb2 = sb.toString();
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, sb2 + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static List P() {
        try {
            if (!fo1.b()) {
                return null;
            }
            try {
                IShizukuAidlInterface iShizukuAidlInterface = fo1.f298a;
                if (iShizukuAidlInterface == null) {
                    throw new IllegalStateException("ShizukuExec not bound");
                }
                List<ia1> topSnapshot = iShizukuAidlInterface.getTopSnapshot(200);
                return topSnapshot != null ? topSnapshot : new ArrayList();
            } catch (Throwable unused) {
                return new ArrayList();
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public static String Q() {
        String str;
        String str2;
        String J = J();
        String K = K();
        if (J.toLowerCase().contains("exynos") || J.toLowerCase().contains("universal")) {
            return H(H(J));
        }
        String str3 = J + " " + K + " ";
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                str = Build.SOC_MODEL;
                sb.append(str);
                str3 = sb.toString();
            } catch (Error unused) {
            }
        }
        String[] strArr = {"msm", "sdm", "sm", "mt", "exynos", "universal", "s5e", "kirin", rlfWzcx.SBblll, "tensor", "gs", "aml", "rtk", "realtek", "rtd", "rk", yttXLrAeLjN.FdaPYxpThJjUneI};
        for (int i2 = 0; i2 < 17; i2++) {
            String str4 = strArr[i2];
            String str5 = hTYJVDOvZnZlYL.ZDOamfHh;
            if (str3.toLowerCase().contains(str4)) {
                int indexOf = str3.toLowerCase().indexOf(str4);
                str2 = "";
                if (indexOf >= 0) {
                    String substring = str3.substring(indexOf);
                    if (substring.contains(" ")) {
                        substring = substring.substring(0, substring.indexOf(" "));
                    }
                    if (!uz1.i(substring)) {
                        substring = "";
                    }
                    try {
                        if (str3.contains(str5)) {
                            substring = substring.replace(str5, "Kirin ");
                        }
                        if (str3.contains("universal")) {
                            substring = substring.replace("universal", "Exynos ");
                        }
                        if (str3.contains("Unisoc")) {
                            substring = str3.replace("Unisoc ", "");
                        }
                        if (str3.contains("s5e")) {
                            substring = "Exynos " + substring.replace("s5e", "");
                        }
                        if (str3.contains("JLQ")) {
                            str2 = str3.replace("JLQ ", "").trim();
                        }
                    } catch (Exception unused2) {
                    }
                    str2 = substring;
                }
            } else {
                str2 = null;
            }
            if (str2 != null && !str2.isEmpty()) {
                return str2;
            }
        }
        return z();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String R() {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju0.R():java.lang.String");
    }

    public static Object S(LinkedHashMap linkedHashMap, Object obj) {
        linkedHashMap.getClass();
        Object obj2 = linkedHashMap.get(obj);
        if (obj2 != null || linkedHashMap.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static dx T(dx dxVar) {
        dxVar.getClass();
        ex exVar = dxVar instanceof ex ? (ex) dxVar : null;
        if (exVar == null || (dxVar = exVar.i) != null) {
            return dxVar;
        }
        sx sxVar = (sx) exVar.d().r(j70.i);
        dx z40Var = sxVar != null ? new z40(sxVar, exVar) : exVar;
        exVar.i = z40Var;
        return z40Var;
    }

    public static synchronized Boolean U() {
        synchronized (ju0.class) {
            int i2 = b;
            if (i2 >= 0) {
                if (i2 == 0) {
                    return Boolean.FALSE;
                }
                if (i2 != 2) {
                    return null;
                }
                return Boolean.TRUE;
            }
            if (Process.myUid() == 0) {
                b = 2;
                return Boolean.TRUE;
            }
            for (String str : System.getenv("PATH").split(":")) {
                if (new File(str, "su").canExecute()) {
                    b = 1;
                    return null;
                }
            }
            b = 0;
            return Boolean.FALSE;
        }
    }

    public static boolean V(int i2, Rect rect, Rect rect2) {
        if (i2 == 17) {
            int i3 = rect.right;
            int i4 = rect2.right;
            if ((i3 > i4 || rect.left >= i4) && rect.left > rect2.left) {
                return true;
            }
        } else if (i2 == 33) {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if ((i5 > i6 || rect.top >= i6) && rect.top > rect2.top) {
                return true;
            }
        } else if (i2 == 66) {
            int i7 = rect.left;
            int i8 = rect2.left;
            if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
                return true;
            }
        } else {
            if (i2 != 130) {
                c.m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            int i9 = rect.top;
            int i10 = rect2.top;
            if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
                return true;
            }
        }
        return false;
    }

    public static final boolean W(char c2) {
        return Character.isWhitespace(c2) || Character.isSpaceChar(c2);
    }

    public static qq1 X(yx yxVar, qx qxVar, cy cyVar, pf0 pf0Var, int i2) {
        if ((i2 & 1) != 0) {
            qxVar = n80.g;
        }
        if ((i2 & 2) != 0) {
            cyVar = cy.g;
        }
        qx o2 = xc1.o(yxVar.f(), qxVar, true);
        c20 c20Var = e50.f220a;
        if (o2 != c20Var && o2.r(j70.i) == null) {
            o2 = o2.o(c20Var);
        }
        qq1 kp0Var = cyVar == cy.h ? new kp0(o2, pf0Var) : new qq1(o2, true);
        kp0Var.h0(cyVar, kp0Var, pf0Var);
        return kp0Var;
    }

    public static int Y(int i2, Rect rect, Rect rect2) {
        int i3;
        int i4;
        if (i2 == 17) {
            i3 = rect.left;
            i4 = rect2.right;
        } else if (i2 == 33) {
            i3 = rect.top;
            i4 = rect2.bottom;
        } else if (i2 == 66) {
            i3 = rect2.left;
            i4 = rect.right;
        } else {
            if (i2 != 130) {
                c.m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i3 = rect2.top;
            i4 = rect.bottom;
        }
        return Math.max(0, i3 - i4);
    }

    public static int Z(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static String a(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(d(objArr[i2]));
            i3 = indexOf + 2;
            i2++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i2 < length) {
            String str2 = " [";
            while (i2 < objArr.length) {
                sb.append(str2);
                sb.append(d(objArr[i2]));
                i2++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static int a0(int i2) {
        return (i2 & (-16777216)) >> 24;
    }

    public static final int b(char c2) {
        if ('0' <= c2 && c2 < ':') {
            return c2 - '0';
        }
        if ('a' <= c2 && c2 < 'g') {
            return c2 - 'W';
        }
        if ('A' <= c2 && c2 < 'G') {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static int b0(int i2) {
        return (i2 & 65520) >> 4;
    }

    public static final void c(Logger logger, lv1 lv1Var, iw1 iw1Var, String str) {
        logger.fine(iw1Var.b + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + lv1Var.f608a);
    }

    public static int c0(int i2, Rect rect, Rect rect2) {
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 != 130) {
                        c.m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static String d(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e2) {
            String s = d51.s(obj.getClass().getName(), ynLVXgis.tKlUfS, Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(s), (Throwable) e2);
            return "<" + s + " threw " + e2.getClass().getName() + ">";
        }
    }

    public static MappedByteBuffer d0(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                openFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0071, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r9 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r9 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        r11 = Y(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r9 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004c, code lost:
    
        if (r9 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
    
        if (r9 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        if (r9 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        defpackage.c.m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0031, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0038, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003f, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean e(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = f(r9, r10, r11)
            boolean r1 = f(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L72
            if (r0 != 0) goto Lf
            goto L72
        Lf:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L3b
            if (r9 == r3) goto L34
            if (r9 == r4) goto L2d
            if (r9 != r1) goto L29
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L71
            goto L41
        L29:
            defpackage.c.m(r0)
            return r2
        L2d:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L71
            goto L41
        L34:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L71
            goto L41
        L3b:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L71
        L41:
            if (r9 == r5) goto L71
            if (r9 != r4) goto L46
            goto L71
        L46:
            int r11 = Y(r9, r10, r11)
            if (r9 == r5) goto L66
            if (r9 == r3) goto L61
            if (r9 == r4) goto L5c
            if (r9 != r1) goto L58
            int r9 = r12.bottom
            int r10 = r10.bottom
        L56:
            int r9 = r9 - r10
            goto L6b
        L58:
            defpackage.c.m(r0)
            return r2
        L5c:
            int r9 = r12.right
            int r10 = r10.right
            goto L56
        L61:
            int r9 = r10.top
            int r10 = r12.top
            goto L56
        L66:
            int r9 = r10.left
            int r10 = r12.left
            goto L56
        L6b:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L72
        L71:
            return r6
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju0.e(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static BigDecimal e0(String str) {
        g(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f(int r2, android.graphics.Rect r3, android.graphics.Rect r4) {
        /*
            r0 = 17
            r1 = 0
            if (r2 == r0) goto L25
            r0 = 33
            if (r2 == r0) goto L18
            r0 = 66
            if (r2 == r0) goto L25
            r0 = 130(0x82, float:1.82E-43)
            if (r2 != r0) goto L12
            goto L18
        L12:
            java.lang.String r2 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            defpackage.c.m(r2)
            return r1
        L18:
            int r2 = r4.right
            int r0 = r3.left
            if (r2 < r0) goto L33
            int r2 = r4.left
            int r3 = r3.right
            if (r2 > r3) goto L33
            goto L31
        L25:
            int r2 = r4.bottom
            int r0 = r3.top
            if (r2 < r0) goto L33
            int r2 = r4.top
            int r3 = r3.bottom
            if (r2 > r3) goto L33
        L31:
            r2 = 1
            return r2
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju0.f(int, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static PorterDuff.Mode f0(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void g(String str) {
        if (str.length() <= 10000) {
            return;
        }
        throw new NumberFormatException("Number string too large: " + str.substring(0, 30) + "...");
    }

    public static boolean g0(Parcel parcel, int i2) {
        F0(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static void h(int i2) {
        if (2 > i2 || i2 >= 37) {
            throw new IllegalArgumentException("radix " + i2 + " was not in valid range " + new rm0(2, 36, 1));
        }
    }

    public static int[] h0(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += (int) sl.d0(byteArrayInputStream, 2);
            iArr[i4] = i3;
        }
        return iArr;
    }

    public static String i(int i2) {
        switch (i2) {
            case 0:
                String[] strArr = d;
                return strArr[uz1.P(strArr)];
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                String[] strArr2 = e;
                return strArr2[uz1.P(strArr2)];
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                String[] strArr3 = f;
                return strArr3[uz1.P(strArr3)];
            case 3:
                String[] strArr4 = g;
                return strArr4[uz1.P(strArr4)];
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                String[] strArr5 = h;
                return strArr5[uz1.P(strArr5)];
            case 5:
                String[] strArr6 = i;
                return strArr6[uz1.P(strArr6)];
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                String[] strArr7 = j;
                return strArr7[uz1.P(strArr7)];
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                String[] strArr8 = k;
                return strArr8[uz1.P(strArr8)];
            case 8:
                String[] strArr9 = l;
                return strArr9[uz1.P(strArr9)];
            case rt0.o /* 9 */:
                String[] strArr10 = m;
                return strArr10[uz1.P(strArr10)];
            case 10:
                String[] strArr11 = n;
                return strArr11[uz1.P(strArr11)];
            case 11:
                String[] strArr12 = o;
                return strArr12[uz1.P(strArr12)];
            default:
                return "NA";
        }
    }

    public static int i0(Parcel parcel, int i2) {
        F0(parcel, i2, 4);
        return parcel.readInt();
    }

    public static boolean j(File file, Resources resources, int i2) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i2);
        } catch (Throwable th) {
            th = th;
            inputStream = null;
        }
        try {
            boolean k2 = k(file, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return k2;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static b40[] j0(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b40[] b40VarArr) {
        byte[] bArr3 = md2.g;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, md2.h)) {
                c.n("Unsupported meta version");
                return null;
            }
            int d0 = (int) sl.d0(fileInputStream, 2);
            byte[] c0 = sl.c0(fileInputStream, (int) sl.d0(fileInputStream, 4), (int) sl.d0(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                c.n("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c0);
            try {
                b40[] l0 = l0(byteArrayInputStream, bArr2, d0, b40VarArr);
                byteArrayInputStream.close();
                return l0;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(md2.b, bArr2)) {
            c.n("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            c.n("Unsupported meta version");
            return null;
        }
        int d02 = (int) sl.d0(fileInputStream, 1);
        byte[] c02 = sl.c0(fileInputStream, (int) sl.d0(fileInputStream, 4), (int) sl.d0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            c.n("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(c02);
        try {
            b40[] k0 = k0(byteArrayInputStream2, d02, b40VarArr);
            byteArrayInputStream2.close();
            return k0;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static boolean k(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[rt0.v];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            e.getMessage();
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static b40[] k0(ByteArrayInputStream byteArrayInputStream, int i2, b40[] b40VarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new b40[0];
        }
        if (i2 != b40VarArr.length) {
            c.n(nyGJ.OmGQRZvxcJCw);
            return null;
        }
        String[] strArr = new String[i2];
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int d0 = (int) sl.d0(byteArrayInputStream, 2);
            iArr[i3] = (int) sl.d0(byteArrayInputStream, 2);
            strArr[i3] = new String(sl.b0(byteArrayInputStream, d0), StandardCharsets.UTF_8);
        }
        for (int i4 = 0; i4 < i2; i4++) {
            b40 b40Var = b40VarArr[i4];
            if (!b40Var.b.equals(strArr[i4])) {
                c.n("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i5 = iArr[i4];
            b40Var.e = i5;
            b40Var.h = h0(byteArrayInputStream, i5);
        }
        return b40VarArr;
    }

    public static byte[] l(b40[] b40VarArr, byte[] bArr) {
        int i2 = 0;
        int i3 = 0;
        for (b40 b40Var : b40VarArr) {
            i3 += ((((b40Var.g * 2) + 7) & (-8)) / 8) + (b40Var.e * 2) + x(b40Var.f66a, b40Var.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + b40Var.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i3);
        if (Arrays.equals(bArr, md2.d)) {
            int length = b40VarArr.length;
            while (i2 < length) {
                b40 b40Var2 = b40VarArr[i2];
                C0(byteArrayOutputStream, b40Var2, x(b40Var2.f66a, b40Var2.b, bArr));
                B0(byteArrayOutputStream, b40Var2);
                i2++;
            }
        } else {
            for (b40 b40Var3 : b40VarArr) {
                C0(byteArrayOutputStream, b40Var3, x(b40Var3.f66a, b40Var3.b, bArr));
            }
            int length2 = b40VarArr.length;
            while (i2 < length2) {
                B0(byteArrayOutputStream, b40VarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i3) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i3);
    }

    public static b40[] l0(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, b40[] b40VarArr) {
        b40 b40Var;
        if (byteArrayInputStream.available() == 0) {
            return new b40[0];
        }
        if (i2 != b40VarArr.length) {
            c.n("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            sl.d0(byteArrayInputStream, 2);
            String str = new String(sl.b0(byteArrayInputStream, (int) sl.d0(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long d0 = sl.d0(byteArrayInputStream, 4);
            int d02 = (int) sl.d0(byteArrayInputStream, 2);
            if (b40VarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i4 = 0; i4 < b40VarArr.length; i4++) {
                    if (b40VarArr[i4].b.equals(substring)) {
                        b40Var = b40VarArr[i4];
                        break;
                    }
                }
            }
            b40Var = null;
            if (b40Var == null) {
                c.n(YSHrxiHkAFcciU.KLzjNoYdreT.concat(str));
                return null;
            }
            b40Var.d = d0;
            int[] h0 = h0(byteArrayInputStream, d02);
            if (Arrays.equals(bArr, md2.f)) {
                b40Var.e = d02;
                b40Var.h = h0;
            }
        }
        return b40VarArr;
    }

    public static Parcelable m(Parcel parcel, int i2, Parcelable.Creator creator) {
        int n0 = n0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (n0 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + n0);
        return parcelable;
    }

    public static b40[] m0(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, md2.c)) {
            c.n("Unsupported version");
            return null;
        }
        int d0 = (int) sl.d0(fileInputStream, 1);
        byte[] c0 = sl.c0(fileInputStream, (int) sl.d0(fileInputStream, 4), (int) sl.d0(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            c.n("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(c0);
        try {
            b40[] o0 = o0(byteArrayInputStream, str, d0);
            byteArrayInputStream.close();
            return o0;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String n(Parcel parcel, int i2) {
        int n0 = n0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (n0 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + n0);
        return readString;
    }

    public static int n0(Parcel parcel, int i2) {
        return (i2 & (-65536)) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    public static Object[] o(Parcel parcel, int i2, Parcelable.Creator creator) {
        int n0 = n0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (n0 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + n0);
        return createTypedArray;
    }

    public static b40[] o0(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i3 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new b40[0];
        }
        b40[] b40VarArr = new b40[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            int d0 = (int) sl.d0(byteArrayInputStream, 2);
            int d02 = (int) sl.d0(byteArrayInputStream, 2);
            b40VarArr[i4] = new b40(str, new String(sl.b0(byteArrayInputStream, d0), StandardCharsets.UTF_8), sl.d0(byteArrayInputStream, 4), d02, (int) sl.d0(byteArrayInputStream, 4), (int) sl.d0(byteArrayInputStream, 4), new int[d02], new TreeMap());
        }
        int i5 = 0;
        while (i5 < i2) {
            b40 b40Var = b40VarArr[i5];
            int available = byteArrayInputStream.available();
            int i6 = b40Var.f;
            int i7 = b40Var.g;
            TreeMap treeMap = b40Var.i;
            int i8 = available - i6;
            int i9 = i3;
            while (byteArrayInputStream.available() > i8) {
                i9 += (int) sl.d0(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i9), 1);
                int d03 = (int) sl.d0(byteArrayInputStream, 2);
                while (d03 > 0) {
                    sl.d0(byteArrayInputStream, 2);
                    int d04 = (int) sl.d0(byteArrayInputStream, 1);
                    if (d04 != 6 && d04 != 7) {
                        while (d04 > 0) {
                            sl.d0(byteArrayInputStream, 1);
                            int i10 = i3;
                            int i11 = i5;
                            for (int d05 = (int) sl.d0(byteArrayInputStream, 1); d05 > 0; d05--) {
                                sl.d0(byteArrayInputStream, 2);
                            }
                            d04--;
                            i3 = i10;
                            i5 = i11;
                        }
                    }
                    d03--;
                    i3 = i3;
                    i5 = i5;
                }
            }
            int i12 = i3;
            int i13 = i5;
            if (byteArrayInputStream.available() != i8) {
                c.n("Read too much data during profile line parse");
                return null;
            }
            b40Var.h = h0(byteArrayInputStream, b40Var.e);
            BitSet valueOf = BitSet.valueOf(sl.b0(byteArrayInputStream, (((i7 * 2) + 7) & (-8)) / 8));
            for (int i14 = i12; i14 < i7; i14++) {
                int i15 = valueOf.get(i14) ? 2 : i12;
                if (valueOf.get(i14 + i7)) {
                    i15 |= 4;
                }
                if (i15 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i14));
                    if (num == null) {
                        num = Integer.valueOf(i12);
                    }
                    treeMap.put(Integer.valueOf(i14), Integer.valueOf(i15 | num.intValue()));
                }
            }
            i5 = i13 + 1;
            i3 = i12;
        }
        return b40VarArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0048, code lost:
    
        if (r3.toLowerCase().contains(r0.toLowerCase()) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001f, code lost:
    
        if (r3.equals("Qualcomm®") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (r3.equals("Samsung") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        if (r3.equals("MediaTek") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0016, code lost:
    
        if (r3.equals("HiSilicon") != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean p(java.lang.String r3) {
        /*
            java.lang.String r0 = R()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = r3.hashCode()
            switch(r2) {
                case -1949690533: goto L4f;
                case -1756660041: goto L4c;
                case -836140618: goto L34;
                case -765372454: goto L2b;
                case -453624495: goto L28;
                case 70808758: goto L22;
                case 750758675: goto L19;
                case 781178350: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L52
        L10:
            java.lang.String r2 = "HiSilicon"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L52
            goto L3c
        L19:
            java.lang.String r2 = "Qualcomm®"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L52
            goto L3c
        L22:
            java.lang.String r0 = "Intel"
        L24:
            r3.equals(r0)
            goto L52
        L28:
            java.lang.String r0 = "Rockchip"
            goto L24
        L2b:
            java.lang.String r2 = "Samsung"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L52
            goto L3c
        L34:
            java.lang.String r2 = "MediaTek"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L52
        L3c:
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r0 = r0.toLowerCase()
            boolean r3 = r3.contains(r0)
            if (r3 != 0) goto L52
            r3 = 1
            return r3
        L4c:
            java.lang.String r0 = "Unisoc"
            goto L24
        L4f:
            java.lang.String r0 = "Nvidia"
            goto L24
        L52:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju0.p(java.lang.String):boolean");
    }

    public static final Object p0(qx qxVar, pf0 pf0Var) {
        n90 n90Var;
        qx o2;
        Thread currentThread = Thread.currentThread();
        px pxVar = j70.i;
        sx sxVar = (sx) qxVar.r(pxVar);
        n80 n80Var = n80.g;
        if (sxVar == null) {
            n90Var = uy1.a();
            o2 = xc1.o(n80Var, qxVar.o(n90Var), true);
            c20 c20Var = e50.f220a;
            if (o2 != c20Var && o2.r(pxVar) == null) {
                o2 = o2.o(c20Var);
            }
        } else {
            n90Var = (n90) uy1.f1059a.get();
            o2 = xc1.o(n80Var, qxVar, true);
            c20 c20Var2 = e50.f220a;
            if (o2 != c20Var2 && o2.r(pxVar) == null) {
                o2 = o2.o(c20Var2);
            }
        }
        mk mkVar = new mk(o2, currentThread, n90Var);
        mkVar.h0(cy.g, mkVar, pf0Var);
        n90 n90Var2 = mkVar.m;
        if (n90Var2 != null) {
            int i2 = n90.l;
            n90Var2.J(false);
        }
        while (!Thread.interrupted()) {
            try {
                long K = n90Var2 != null ? n90Var2.K() : Long.MAX_VALUE;
                if (!(mkVar.I() instanceof vl0)) {
                    if (n90Var2 != null) {
                        int i3 = n90.l;
                        n90Var2.H(false);
                    }
                    Object a2 = co0.a(mkVar.I());
                    ot otVar = a2 instanceof ot ? (ot) a2 : null;
                    if (otVar == null) {
                        return a2;
                    }
                    throw otVar.f756a;
                }
                LockSupport.parkNanos(mkVar, K);
            } catch (Throwable th) {
                if (n90Var2 != null) {
                    int i4 = n90.l;
                    n90Var2.H(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        mkVar.t(interruptedException);
        throw interruptedException;
    }

    public static void q(View view, o82 o82Var) {
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        p82 p82Var = new p82();
        p82Var.f777a = paddingStart;
        p82Var.b = paddingTop;
        p82Var.c = paddingEnd;
        p82Var.d = paddingBottom;
        i8 i8Var = new i8(o82Var, p82Var, false);
        WeakHashMap weakHashMap = y62.f1215a;
        p62.c(view, i8Var);
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new f72(1));
        }
    }

    public static String q0(String str) {
        try {
            if (fo1.b()) {
                IShizukuAidlInterface iShizukuAidlInterface = fo1.f298a;
                if (iShizukuAidlInterface == null) {
                    throw new IllegalStateException("ShizukuExec not bound");
                }
                String execute = iShizukuAidlInterface.execute(str, 5000L);
                if (execute == null) {
                    execute = "";
                }
                if (!execute.isEmpty()) {
                    return execute;
                }
            }
        } catch (Exception unused) {
        }
        try {
            if (!do1.e && do1.i()) {
                Method declaredMethod = do1.class.getDeclaredMethod("g", String[].class, String[].class, String.class);
                declaredMethod.setAccessible(true);
                mo1 mo1Var = (mo1) declaredMethod.invoke(null, new String[]{"/system/bin/sh", "-c", str}, null, null);
                String t0 = t0(mo1Var.getInputStream(), 262144);
                t0(mo1Var.getErrorStream(), rt0.C);
                try {
                    mo1Var.waitFor();
                } catch (Exception unused2) {
                }
                mo1Var.destroy();
                if (!t0.isEmpty()) {
                    return t0;
                }
            }
        } catch (Exception unused3) {
        }
        try {
            Process start = new ProcessBuilder("/system/bin/sh", "-c", str).redirectErrorStream(true).start();
            String t02 = t0(start.getInputStream(), 262144);
            try {
                start.waitFor();
            } catch (Exception unused4) {
            }
            start.destroy();
            return t02;
        } catch (Exception unused5) {
            return "";
        }
    }

    public static float r(Context context, int i2) {
        return TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    public static String r0(String str) {
        if (str == null || str.isEmpty()) {
            return "''";
        }
        if (str.indexOf(39) < 0) {
            return d51.y("'", str, "'");
        }
        return "'" + str.replace("'", "'\\''") + "'";
    }

    public static void s(Parcel parcel, int i2) {
        if (parcel.dataPosition() == i2) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 26);
        sb.append("Overread allowed size end=");
        sb.append(i2);
        throw new pt(sb.toString(), parcel);
    }

    public static void s0(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + n0(parcel, i2));
    }

    public static final boolean t(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        return upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2);
    }

    public static String t0(InputStream inputStream, int i2) {
        if (inputStream == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(Math.min(i2, rt0.y));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        try {
            int max = Math.max(rt0.v, i2);
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null || (max = max - (readLine.length() + 1)) < 0) {
                    break;
                }
                sb.append(readLine);
                sb.append('\n');
            }
            bufferedReader.close();
            return sb.toString();
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String u(String str) {
        try {
            if (!fo1.b()) {
                return null;
            }
            IShizukuAidlInterface iShizukuAidlInterface = fo1.f298a;
            if (iShizukuAidlInterface == null) {
                throw new IllegalStateException(ILBLnlCHDVqsSN.izxkrLYu);
            }
            String execute = iShizukuAidlInterface.execute(str, 5000L);
            if (execute != null) {
                return execute;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Map u0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return q80.g;
        }
        int i2 = 0;
        if (size == 1) {
            z51 z51Var = (z51) arrayList.get(0);
            z51Var.getClass();
            Map singletonMap = Collections.singletonMap(z51Var.g, z51Var.h);
            singletonMap.getClass();
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Z(arrayList.size()));
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj = arrayList.get(i2);
            i2++;
            z51 z51Var2 = (z51) obj;
            linkedHashMap.put(z51Var2.g, z51Var2.h);
        }
        return linkedHashMap;
    }

    public static File v(Context context, String str, ArrayList arrayList) {
        File file = new File(context.getCacheDir() + "/" + str + ".apks");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ZipOutputStream zipOutputStream = new ZipOutputStream(fileOutputStream);
                try {
                    byte[] bArr = new byte[rt0.v];
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        File file2 = new File((String) obj);
                        FileInputStream fileInputStream = new FileInputStream(file2);
                        try {
                            zipOutputStream.putNextEntry(new ZipEntry(file2.getName()));
                            while (true) {
                                int read = fileInputStream.read(bArr);
                                if (read <= 0) {
                                    break;
                                }
                                zipOutputStream.write(bArr, 0, read);
                            }
                            zipOutputStream.closeEntry();
                            fileInputStream.close();
                        } finally {
                        }
                    }
                    zipOutputStream.close();
                    fileOutputStream.close();
                    return file;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return file;
        }
    }

    public static Map v0(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        int size = linkedHashMap.size();
        if (size == 0) {
            return q80.g;
        }
        if (size != 1) {
            return new LinkedHashMap(linkedHashMap);
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }

    public static final String w(long j2) {
        String str;
        if (j2 <= -999500000) {
            str = ((j2 - 500000000) / 1000000000) + " s ";
        } else if (j2 <= -999500) {
            str = ((j2 - 500000) / 1000000) + " ms";
        } else if (j2 <= 0) {
            str = ((j2 - 500) / 1000) + " µs";
        } else if (j2 < 999500) {
            str = ((j2 + 500) / 1000) + " µs";
        } else if (j2 < 999500000) {
            str = ((j2 + 500000) / 1000000) + " ms";
        } else {
            str = ((j2 + 500000000) / 1000000000) + " s ";
        }
        return String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
    }

    /* JADX WARN: Finally extract failed */
    public static boolean w0(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b40[] b40VarArr) {
        int i2;
        long j2;
        int length;
        byte[] bArr2 = md2.f;
        byte[] bArr3 = md2.e;
        byte[] bArr4 = md2.b;
        int i3 = 0;
        if (!Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = md2.c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] l2 = l(b40VarArr, bArr5);
                sl.s0(byteArrayOutputStream, b40VarArr.length, 1);
                sl.s0(byteArrayOutputStream, l2.length, 4);
                byte[] j3 = sl.j(l2);
                sl.s0(byteArrayOutputStream, j3.length, 4);
                byteArrayOutputStream.write(j3);
                return true;
            }
            if (Arrays.equals(bArr, bArr3)) {
                sl.s0(byteArrayOutputStream, b40VarArr.length, 1);
                for (b40 b40Var : b40VarArr) {
                    int size = b40Var.i.size() * 4;
                    String x = x(b40Var.f66a, b40Var.b, bArr3);
                    Charset charset = StandardCharsets.UTF_8;
                    sl.t0(byteArrayOutputStream, x.getBytes(charset).length);
                    sl.t0(byteArrayOutputStream, b40Var.h.length);
                    sl.s0(byteArrayOutputStream, size, 4);
                    sl.s0(byteArrayOutputStream, b40Var.c, 4);
                    byteArrayOutputStream.write(x.getBytes(charset));
                    Iterator it = b40Var.i.keySet().iterator();
                    while (it.hasNext()) {
                        sl.t0(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        sl.t0(byteArrayOutputStream, 0);
                    }
                    for (int i4 : b40Var.h) {
                        sl.t0(byteArrayOutputStream, i4);
                    }
                }
                return true;
            }
            byte[] bArr6 = md2.d;
            if (Arrays.equals(bArr, bArr6)) {
                byte[] l3 = l(b40VarArr, bArr6);
                sl.s0(byteArrayOutputStream, b40VarArr.length, 1);
                sl.s0(byteArrayOutputStream, l3.length, 4);
                byte[] j4 = sl.j(l3);
                sl.s0(byteArrayOutputStream, j4.length, 4);
                byteArrayOutputStream.write(j4);
                return true;
            }
            if (!Arrays.equals(bArr, bArr2)) {
                return false;
            }
            sl.t0(byteArrayOutputStream, b40VarArr.length);
            for (b40 b40Var2 : b40VarArr) {
                String str = b40Var2.f66a;
                TreeMap treeMap = b40Var2.i;
                String x2 = x(str, b40Var2.b, bArr2);
                Charset charset2 = StandardCharsets.UTF_8;
                sl.t0(byteArrayOutputStream, x2.getBytes(charset2).length);
                sl.t0(byteArrayOutputStream, treeMap.size());
                sl.t0(byteArrayOutputStream, b40Var2.h.length);
                sl.s0(byteArrayOutputStream, b40Var2.c, 4);
                byteArrayOutputStream.write(x2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    sl.t0(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i5 : b40Var2.h) {
                    sl.t0(byteArrayOutputStream, i5);
                }
            }
            return true;
        }
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            sl.t0(byteArrayOutputStream2, b40VarArr.length);
            int i6 = 2;
            int i7 = 2;
            for (b40 b40Var3 : b40VarArr) {
                sl.s0(byteArrayOutputStream2, b40Var3.c, 4);
                sl.s0(byteArrayOutputStream2, b40Var3.d, 4);
                sl.s0(byteArrayOutputStream2, b40Var3.g, 4);
                String x3 = x(b40Var3.f66a, b40Var3.b, bArr4);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = x3.getBytes(charset3).length;
                sl.t0(byteArrayOutputStream2, length2);
                i7 = i7 + 14 + length2;
                byteArrayOutputStream2.write(x3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i7 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray.length);
            }
            cd2 cd2Var = new cd2(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(cd2Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i8 = 0;
            int i9 = 0;
            while (i8 < b40VarArr.length) {
                try {
                    b40 b40Var4 = b40VarArr[i8];
                    sl.t0(byteArrayOutputStream3, i8);
                    sl.t0(byteArrayOutputStream3, b40Var4.e);
                    i9 = i9 + 4 + (b40Var4.e * i6);
                    int[] iArr = b40Var4.h;
                    int length3 = iArr.length;
                    int i10 = i3;
                    while (i3 < length3) {
                        int i11 = iArr[i3];
                        sl.t0(byteArrayOutputStream3, i11 - i10);
                        i3++;
                        i6 = i6;
                        i10 = i11;
                    }
                    i8++;
                    i3 = 0;
                } catch (Throwable th) {
                }
            }
            int i12 = i6;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i9 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i9 + ", does not match actual size " + byteArray2.length);
            }
            cd2 cd2Var2 = new cd2(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(cd2Var2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i13 = 0;
            for (int i14 = 0; i14 < b40VarArr.length; i14++) {
                try {
                    b40 b40Var5 = b40VarArr[i14];
                    Iterator it3 = b40Var5.i.entrySet().iterator();
                    int i15 = 0;
                    while (it3.hasNext()) {
                        i15 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        D0(byteArrayOutputStream4, i15, b40Var5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            E0(byteArrayOutputStream4, b40Var5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            sl.t0(byteArrayOutputStream3, i14);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i16 = i13 + 6;
                            sl.s0(byteArrayOutputStream3, length4, 4);
                            sl.t0(byteArrayOutputStream3, i15);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i13 = i16 + length4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            cd2 cd2Var3 = new cd2(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(cd2Var3);
            long size2 = 12 + (arrayList.size() * 16);
            sl.s0(byteArrayOutputStream, arrayList.size(), 4);
            int i17 = 0;
            while (i17 < arrayList.size()) {
                cd2 cd2Var4 = (cd2) arrayList.get(i17);
                int i18 = cd2Var4.f120a;
                byte[] bArr7 = cd2Var4.b;
                if (i18 != 1) {
                    i2 = i12;
                    if (i18 == i2) {
                        j2 = 1;
                    } else if (i18 == 3) {
                        j2 = 2;
                    } else if (i18 == 4) {
                        j2 = 3;
                    } else {
                        if (i18 != 5) {
                            throw null;
                        }
                        j2 = 4;
                    }
                } else {
                    i2 = i12;
                    j2 = 0;
                }
                sl.s0(byteArrayOutputStream, j2, 4);
                sl.s0(byteArrayOutputStream, size2, 4);
                if (cd2Var4.c) {
                    long length5 = bArr7.length;
                    byte[] j5 = sl.j(bArr7);
                    arrayList2.add(j5);
                    sl.s0(byteArrayOutputStream, j5.length, 4);
                    sl.s0(byteArrayOutputStream, length5, 4);
                    length = j5.length;
                } else {
                    arrayList2.add(bArr7);
                    sl.s0(byteArrayOutputStream, bArr7.length, 4);
                    sl.s0(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i17++;
                i12 = i2;
            }
            for (int i19 = 0; i19 < arrayList2.size(); i19++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i19));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static String x(String str, String str2, byte[] bArr) {
        byte[] bArr2 = md2.e;
        byte[] bArr3 = md2.f;
        String str3 = (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return d51.u(sb, (Arrays.equals(bArr, bArr3) || Arrays.equals(bArr, bArr2)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static int x0(Parcel parcel) {
        int readInt = parcel.readInt();
        int n0 = n0(parcel, readInt);
        char c2 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c2 != 20293) {
            throw new pt("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i2 = n0 + dataPosition;
        if (i2 >= dataPosition && i2 <= parcel.dataSize()) {
            return i2;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i2).length());
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(i2);
        throw new pt(sb.toString(), parcel);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap y() {
        /*
            Method dump skipped, instructions count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ju0.y():java.util.HashMap");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object y0(qx qxVar, pf0 pf0Var, ex exVar) {
        qx d2 = exVar.d();
        qx o2 = !((Boolean) qxVar.m(Boolean.FALSE, new ys(2))).booleanValue() ? d2.o(qxVar) : xc1.o(d2, qxVar, false);
        rn0 rn0Var = (rn0) o2.r(pg0.k);
        if (rn0Var != null && !rn0Var.a()) {
            throw ((bo0) rn0Var).C();
        }
        if (o2 == d2) {
            hk1 hk1Var = new hk1(exVar, o2);
            return je2.W(hk1Var, hk1Var, pf0Var);
        }
        j70 j70Var = j70.i;
        if (ym0.b(o2.r(j70Var), d2.r(j70Var))) {
            z32 z32Var = new z32(o2, exVar);
            qx qxVar2 = z32Var.k;
            Object c2 = sy1.c(qxVar2, null);
            try {
                return je2.W(z32Var, z32Var, pf0Var);
            } finally {
                sy1.a(qxVar2, c2);
            }
        }
        b50 b50Var = new b50(exVar, o2);
        try {
            a50.a(T(((qd) pf0Var).l(b50Var, b50Var)), e42.f219a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = b50.m;
            do {
                int i2 = atomicIntegerFieldUpdater.get(b50Var);
                if (i2 != 0) {
                    if (i2 != 2) {
                        c.n("Already suspended");
                        return null;
                    }
                    Object a2 = co0.a(b50Var.I());
                    if (a2 instanceof ot) {
                        throw ((ot) a2).f756a;
                    }
                    return a2;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(b50Var, 0, 1));
            return zx.g;
        } catch (Throwable th) {
            b50Var.g(new pg1(th));
            throw th;
        }
    }

    public static String z() {
        String str;
        try {
            Scanner scanner = new Scanner(new File("/proc/cpuinfo"));
            while (true) {
                if (!scanner.hasNextLine()) {
                    str = "Unknown";
                    break;
                }
                String nextLine = scanner.nextLine();
                if (nextLine.startsWith(YHJbtPFAANaPQ.zsiQKVVuuNUkZ)) {
                    str = nextLine.split(":")[1].trim();
                    break;
                }
                if (nextLine.startsWith("Model name")) {
                    str = nextLine.split(":")[1].trim();
                    break;
                }
                if (nextLine.startsWith("Hardware")) {
                    str = nextLine.split(":")[1].trim();
                    break;
                }
                if (nextLine.startsWith("Processor")) {
                    str = nextLine.split(":")[1].trim();
                    break;
                }
            }
            try {
                scanner.close();
                return (str.contains(XmJDY.LzAx) || str.equals("Unknown")) ? J() : str;
            } catch (Exception unused) {
                return str;
            }
        } catch (Exception unused2) {
            return "Unknown";
        }
    }

    public static BiometricPrompt.CryptoObject z0(op0 op0Var) {
        return null;
    }
}
