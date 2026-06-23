package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import android.telephony.CellIdentity;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.fHMN.BFtDZYxPcpGN;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.RemoteViews;
import com.google.android.datatransport.runtime.backends.XUas.yFbVsaLCWAtQC;
import com.google.android.material.behavior.YqV.Gvyagftz;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.nativebridge.vGm.RIhTGWkqQvGL;
import flar2.devcheck.sensors.JCZI.nyGJ;
import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public abstract class c3 {

    /* renamed from: a, reason: collision with root package name */
    public static final dx[] f105a = new dx[0];
    public static final String[] b = new String[0];
    public static final Object c = new Object();
    public static boolean d;
    public static Method e;
    public static boolean f;
    public static Field g;
    public static int h;
    public static boolean i;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.rg1 A(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c3.A(java.lang.String):rg1");
    }

    public static Integer B(String str) {
        Integer K;
        String H = H(str);
        if (H != null && !H.trim().isEmpty()) {
            long j = -1;
            for (String str2 : H.trim().split("\\s+")) {
                try {
                    long parseLong = Long.parseLong(str2);
                    if (parseLong > j) {
                        j = parseLong;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            if (j > 0 && (K = K(j)) != null && K.intValue() >= 1) {
                return K;
            }
        }
        return null;
    }

    public static Integer C(String str) {
        Integer K;
        String H = H(str);
        if (H != null && !H.trim().isEmpty()) {
            long j = -1;
            for (String str2 : H.split("\\r?\\n")) {
                String trim = str2.trim();
                if (!trim.isEmpty()) {
                    String[] split = trim.split("\\s+");
                    if (split.length != 0) {
                        try {
                            long parseLong = Long.parseLong(split[0]);
                            if (parseLong > j) {
                                j = parseLong;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
            }
            if (j > 0 && (K = K(j)) != null && K.intValue() >= 1) {
                return K;
            }
        }
        return null;
    }

    public static Integer D(String str) {
        Integer K;
        String H = H(str);
        if (H != null && !H.trim().isEmpty()) {
            long j = -1;
            for (String str2 : H.trim().split("\\s+")) {
                try {
                    long parseLong = Long.parseLong(str2);
                    if (parseLong > j) {
                        j = parseLong;
                    }
                } catch (NumberFormatException unused) {
                }
            }
            if (j > 0 && (K = K(j)) != null && K.intValue() >= 1) {
                return K;
            }
        }
        return null;
    }

    public static final List E(aj1 aj1Var) {
        int l = k32.l(aj1Var, "id");
        int l2 = k32.l(aj1Var, "seq");
        int l3 = k32.l(aj1Var, "from");
        int l4 = k32.l(aj1Var, "to");
        nr0 i2 = tl2.i();
        while (aj1Var.w()) {
            i2.add(new cd0((int) aj1Var.getLong(l), (int) aj1Var.getLong(l2), aj1Var.h(l3), aj1Var.h(l4)));
        }
        return yr.c0(tl2.e(i2));
    }

    public static final jv1 F(ti1 ti1Var, String str, boolean z) {
        aj1 C = ti1Var.C("PRAGMA index_xinfo(`" + str + BFtDZYxPcpGN.gijmasodKC);
        try {
            int l = k32.l(C, "seqno");
            int l2 = k32.l(C, BFtDZYxPcpGN.FbIQlcEXTjYOKIP);
            int l3 = k32.l(C, "name");
            int l4 = k32.l(C, "desc");
            if (l != -1 && l2 != -1 && l3 != -1 && l4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (C.w()) {
                    if (((int) C.getLong(l2)) >= 0) {
                        int i2 = (int) C.getLong(l);
                        String h2 = C.h(l3);
                        String str2 = C.getLong(l4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i2), h2);
                        linkedHashMap2.put(Integer.valueOf(i2), str2);
                    }
                }
                List d0 = yr.d0(linkedHashMap.entrySet(), new c4(11));
                ArrayList arrayList = new ArrayList(as.U(d0));
                Iterator it = d0.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List g0 = yr.g0(arrayList);
                List d02 = yr.d0(linkedHashMap2.entrySet(), new c4(12));
                ArrayList arrayList2 = new ArrayList(as.U(d02));
                Iterator it2 = d02.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                jv1 jv1Var = new jv1(str, z, g0, yr.g0(arrayList2));
                rt0.e(C, null);
                return jv1Var;
            }
            rt0.e(C, null);
            return null;
        } finally {
        }
    }

    public static Integer G(String str) {
        String H = H(str);
        if (H != null && !H.trim().isEmpty()) {
            try {
                long parseLong = Long.parseLong(H.trim());
                if (parseLong <= 0) {
                    return null;
                }
                return K(parseLong);
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static String H(String str) {
        String K = uz1.K(str);
        if (K == null) {
            return null;
        }
        String trim = K.trim();
        if (trim.isEmpty() || "Unavailable".equalsIgnoreCase(trim) || nyGJ.gwuXNZiUAIfDow.equalsIgnoreCase(trim) || "EE".equalsIgnoreCase(trim)) {
            return null;
        }
        return trim;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void I(android.content.Context r11) {
        /*
            long r0 = java.lang.System.nanoTime()
            r2 = 0
            android.content.IntentFilter r3 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L10
            java.lang.String r4 = "android.intent.action.BATTERY_CHANGED"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L10
            android.content.Intent r2 = r11.registerReceiver(r2, r3)     // Catch: java.lang.Throwable -> L10
        L10:
            java.lang.String r3 = "batterymanager"
            java.lang.Object r4 = r11.getSystemService(r3)
            android.os.BatteryManager r4 = (android.os.BatteryManager) r4
            r5 = 4
            r6 = 2
            r7 = 0
            r8 = 1
            if (r4 != 0) goto L20
        L1e:
            r4 = r7
            goto L43
        L20:
            long r9 = r4.getLongProperty(r6)     // Catch: java.lang.Throwable -> L1e
            java.lang.String r4 = java.lang.String.valueOf(r9)
            java.lang.String r9 = "-"
            java.lang.String r10 = ""
            java.lang.String r4 = r4.replace(r9, r10)
            java.lang.String r4 = r4.trim()
            int r9 = r4.length()
            if (r9 <= r5) goto L3c
            r4 = r6
            goto L43
        L3c:
            int r4 = r4.length()
            if (r4 <= 0) goto L1e
            r4 = r8
        L43:
            if (r2 != 0) goto L47
        L45:
            r2 = r7
            goto L82
        L47:
            java.lang.String r9 = "status"
            int r2 = r2.getIntExtra(r9, r8)
            if (r2 != r6) goto L51
            r9 = r8
            goto L52
        L51:
            r9 = r7
        L52:
            r10 = 3
            if (r2 == r10) goto L5a
            if (r2 != r5) goto L58
            goto L5a
        L58:
            r2 = r7
            goto L5b
        L5a:
            r2 = r8
        L5b:
            if (r9 != 0) goto L60
            if (r2 != 0) goto L60
            goto L45
        L60:
            java.lang.Object r11 = r11.getSystemService(r3)
            android.os.BatteryManager r11 = (android.os.BatteryManager) r11
            if (r11 != 0) goto L69
            goto L45
        L69:
            long r2 = r11.getLongProperty(r6)     // Catch: java.lang.Throwable -> L45
            r5 = 0
            int r11 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r11 != 0) goto L74
            goto L45
        L74:
            if (r11 <= 0) goto L78
            r11 = r8
            goto L79
        L78:
            r11 = r7
        L79:
            r2 = -1
            if (r9 == 0) goto L80
            if (r11 == 0) goto L82
        L7e:
            r2 = r8
            goto L82
        L80:
            if (r11 == 0) goto L7e
        L82:
            long r5 = java.lang.System.currentTimeMillis()
            java.lang.String r11 = e()
            java.lang.String r3 = "bat_cal_v1_version"
            defpackage.i51.j(r8, r3)
            r3 = 0
            java.lang.String r3 = com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ.Ftud
            defpackage.i51.l(r3, r11)
            java.lang.String r11 = "bat_cal_v1_calibrated_at"
            defpackage.i51.k(r11, r5)
            java.lang.String r11 = "bat_cal_v1_phase"
            defpackage.i51.j(r8, r11)
            java.lang.String r11 = "bat_cal_v1_current_units"
            defpackage.i51.j(r4, r11)
            java.lang.String r11 = "bat_cal_v1_current_polarity"
            defpackage.i51.j(r2, r11)
            java.lang.String r11 = "bat_cal_v1_charge_ctr_scale"
            defpackage.i51.j(r8, r11)
            java.lang.String r11 = "bat_cal_v1_signal_bits"
            defpackage.i51.j(r7, r11)
            java.lang.String r11 = "bat_cal_v1_confidence"
            defpackage.i51.j(r7, r11)
            long r5 = java.lang.System.nanoTime()
            long r5 = r5 - r0
            double r0 = (double) r5
            r5 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 / r5
            java.lang.Double r11 = java.lang.Double.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r0, r1}
            java.lang.String r0 = "Phase 1 done in %.1f ms — units=%d polarity=%d"
            java.lang.String.format(r0, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c3.I(android.content.Context):void");
    }

    public static double J(double d2) {
        double d3 = d2 % 360.0d;
        return d3 < 0.0d ? d3 + 360.0d : d3;
    }

    public static Integer K(long j) {
        Integer valueOf;
        Integer num = null;
        if (j <= 0) {
            return null;
        }
        int[] iArr = {(int) j, (int) (j / 1000), (int) (j / 1000000)};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            if (i3 >= 150 && i3 <= 4000) {
                if (num == null) {
                    valueOf = Integer.valueOf(i3);
                } else if (i3 != num.intValue()) {
                    valueOf = Integer.valueOf(Math.max(num.intValue(), i3));
                }
                num = valueOf;
            }
        }
        return num;
    }

    public static void M(Context context, int i2, int i3) {
        context.getApplicationContext().getSharedPreferences("widget_label_prefs", 0).edit().putInt("label_" + i2, i3).apply();
    }

    public static void O(EditorInfo editorInfo, CharSequence charSequence, int i2, int i3) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i2);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i3);
    }

    public static byte[] P(t00 t00Var) {
        t00Var.getClass();
        HashMap hashMap = t00Var.f963a;
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
            try {
                dataOutputStream.writeShort(-21521);
                dataOutputStream.writeShort(1);
                dataOutputStream.writeInt(hashMap.size());
                for (Map.Entry entry : hashMap.entrySet()) {
                    Q(dataOutputStream, (String) entry.getKey(), entry.getValue());
                }
                dataOutputStream.flush();
                if (dataOutputStream.size() > 10240) {
                    throw new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                }
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                dataOutputStream.close();
                byteArray.getClass();
                return byteArray;
            } finally {
            }
        } catch (IOException unused) {
            int i2 = x00.f1154a;
            ai1.h().getClass();
            return new byte[0];
        }
    }

    public static final void Q(DataOutputStream dataOutputStream, String str, Object obj) {
        int i2;
        if (obj == null) {
            dataOutputStream.writeByte(0);
        } else if (obj instanceof Boolean) {
            dataOutputStream.writeByte(1);
            dataOutputStream.writeBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Byte) {
            dataOutputStream.writeByte(2);
            dataOutputStream.writeByte(((Number) obj).byteValue());
        } else if (obj instanceof Integer) {
            dataOutputStream.writeByte(3);
            dataOutputStream.writeInt(((Number) obj).intValue());
        } else if (obj instanceof Long) {
            dataOutputStream.writeByte(4);
            dataOutputStream.writeLong(((Number) obj).longValue());
        } else if (obj instanceof Float) {
            dataOutputStream.writeByte(5);
            dataOutputStream.writeFloat(((Number) obj).floatValue());
        } else if (obj instanceof Double) {
            dataOutputStream.writeByte(6);
            dataOutputStream.writeDouble(((Number) obj).doubleValue());
        } else if (obj instanceof String) {
            dataOutputStream.writeByte(7);
            dataOutputStream.writeUTF((String) obj);
        } else {
            if (!(obj instanceof Object[])) {
                rw.g("Unsupported value type ", af1.a(obj.getClass()).c());
                return;
            }
            Object[] objArr = (Object[]) obj;
            vq a2 = af1.a(objArr.getClass());
            if (a2.equals(af1.a(Boolean[].class))) {
                i2 = 8;
            } else if (a2.equals(af1.a(Byte[].class))) {
                i2 = 9;
            } else if (a2.equals(af1.a(Integer[].class))) {
                i2 = 10;
            } else if (a2.equals(af1.a(Long[].class))) {
                i2 = 11;
            } else if (a2.equals(af1.a(Float[].class))) {
                i2 = 12;
            } else if (a2.equals(af1.a(Double[].class))) {
                i2 = 13;
            } else {
                if (!a2.equals(af1.a(String[].class))) {
                    rw.g("Unsupported value type ", af1.a(objArr.getClass()).b());
                    return;
                }
                i2 = 14;
            }
            dataOutputStream.writeByte(i2);
            dataOutputStream.writeInt(objArr.length);
            for (Object obj2 : objArr) {
                if (i2 == 8) {
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    dataOutputStream.writeBoolean(bool != null ? bool.booleanValue() : false);
                } else if (i2 == 9) {
                    Byte b2 = obj2 instanceof Byte ? (Byte) obj2 : null;
                    dataOutputStream.writeByte(b2 != null ? b2.byteValue() : (byte) 0);
                } else if (i2 == 10) {
                    Integer num = obj2 instanceof Integer ? (Integer) obj2 : null;
                    dataOutputStream.writeInt(num != null ? num.intValue() : 0);
                } else if (i2 == 11) {
                    Long l = obj2 instanceof Long ? (Long) obj2 : null;
                    dataOutputStream.writeLong(l != null ? l.longValue() : 0L);
                } else if (i2 == 12) {
                    Float f2 = obj2 instanceof Float ? (Float) obj2 : null;
                    dataOutputStream.writeFloat(f2 != null ? f2.floatValue() : 0.0f);
                } else if (i2 == 13) {
                    Double d2 = obj2 instanceof Double ? (Double) obj2 : null;
                    dataOutputStream.writeDouble(d2 != null ? d2.doubleValue() : 0.0d);
                } else if (i2 == 14) {
                    String str2 = obj2 instanceof String ? (String) obj2 : null;
                    if (str2 == null) {
                        str2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                    }
                    dataOutputStream.writeUTF(str2);
                }
            }
        }
        dataOutputStream.writeUTF(str);
    }

    public static void S(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i2);
    }

    public static void a(RemoteViews remoteViews, int i2, int... iArr) {
        if (i2 == 0) {
            return;
        }
        for (int i3 : iArr) {
            remoteViews.setTextColor(i3, i2);
        }
    }

    public static void b(long j, wl wlVar, int i2, ArrayList arrayList, int i3, int i4, ArrayList arrayList2) {
        int i5;
        int i6;
        ArrayList arrayList3;
        long j2;
        int i7;
        int i8 = i2;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i3 >= i4) {
            c.m("Failed requirement.");
            return;
        }
        for (int i9 = i3; i9 < i4; i9++) {
            if (((km) arrayList4.get(i9)).a() < i8) {
                c.m("Failed requirement.");
                return;
            }
        }
        km kmVar = (km) arrayList.get(i3);
        km kmVar2 = (km) arrayList4.get(i4 - 1);
        if (i8 == kmVar.a()) {
            int intValue = ((Number) arrayList5.get(i3)).intValue();
            int i10 = i3 + 1;
            km kmVar3 = (km) arrayList4.get(i10);
            i5 = i10;
            i6 = intValue;
            kmVar = kmVar3;
        } else {
            i5 = i3;
            i6 = -1;
        }
        if (kmVar.d(i8) == kmVar2.d(i8)) {
            int min = Math.min(kmVar.a(), kmVar2.a());
            int i11 = 0;
            for (int i12 = i8; i12 < min && kmVar.d(i12) == kmVar2.d(i12); i12++) {
                i11++;
            }
            long j3 = (wlVar.h / 4) + j + 2 + i11 + 1;
            wlVar.L(-i11);
            wlVar.L(i6);
            int i13 = i8 + i11;
            while (i8 < i13) {
                wlVar.L(kmVar.d(i8) & 255);
                i8++;
            }
            if (i5 + 1 == i4) {
                if (i13 == ((km) arrayList4.get(i5)).a()) {
                    wlVar.L(((Number) arrayList5.get(i5)).intValue());
                    return;
                } else {
                    c.n("Check failed.");
                    return;
                }
            }
            wl wlVar2 = new wl();
            wlVar.L(((int) ((wlVar2.h / 4) + j3)) * (-1));
            b(j3, wlVar2, i13, arrayList4, i5, i4, arrayList5);
            wlVar.H(wlVar2);
            return;
        }
        int i14 = 1;
        for (int i15 = i5 + 1; i15 < i4; i15++) {
            if (((km) arrayList4.get(i15 - 1)).d(i8) != ((km) arrayList4.get(i15)).d(i8)) {
                i14++;
            }
        }
        long j4 = (wlVar.h / 4) + j + 2 + (i14 * 2);
        wlVar.L(i14);
        wlVar.L(i6);
        for (int i16 = i5; i16 < i4; i16++) {
            int d2 = ((km) arrayList4.get(i16)).d(i8);
            if (i16 == i5 || d2 != ((km) arrayList4.get(i16 - 1)).d(i8)) {
                wlVar.L(d2 & 255);
            }
        }
        wl wlVar3 = new wl();
        int i17 = i5;
        while (i17 < i4) {
            byte d3 = ((km) arrayList4.get(i17)).d(i8);
            int i18 = i17 + 1;
            int i19 = i18;
            while (true) {
                if (i19 >= i4) {
                    i19 = i4;
                    break;
                } else if (d3 != ((km) arrayList4.get(i19)).d(i8)) {
                    break;
                } else {
                    i19++;
                }
            }
            if (i18 == i19 && i8 + 1 == ((km) arrayList4.get(i17)).a()) {
                wlVar.L(((Number) arrayList5.get(i17)).intValue());
                arrayList3 = arrayList5;
                j2 = j4;
                i7 = i19;
            } else {
                wlVar.L(((int) ((wlVar3.h / 4) + j4)) * (-1));
                arrayList3 = arrayList5;
                j2 = j4;
                i7 = i19;
                b(j2, wlVar3, i8 + 1, arrayList, i17, i7, arrayList3);
                arrayList4 = arrayList;
            }
            j4 = j2;
            i17 = i7;
            arrayList5 = arrayList3;
        }
        wlVar.H(wlVar3);
    }

    public static void c(Activity activity, int i2) {
        h = i2;
        i = true;
        activity.finish();
        activity.startActivity(new Intent(activity, activity.getClass()));
    }

    public static int d(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static String e() {
        return Build.MODEL + "|" + Build.DEVICE + "|" + Build.FINGERPRINT;
    }

    public static void f(Context context, int i2) {
        context.getApplicationContext().getSharedPreferences("widget_label_prefs", 0).edit().remove("label_" + i2).apply();
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01d5 A[Catch: NumberFormatException -> 0x01da, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x01da, blocks: (B:68:0x01cb, B:70:0x01d5), top: B:67:0x01cb }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01fa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Integer g() {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c3.g():java.lang.Integer");
    }

    public static boolean h(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int indexOfKey;
        WeakHashMap weakHashMap = y62.f1215a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = x62.d;
        x62 x62Var = (x62) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (x62Var == null) {
            x62Var = new x62();
            x62Var.f1167a = null;
            x62Var.b = null;
            x62Var.c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, x62Var);
        }
        WeakReference weakReference2 = x62Var.c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        x62Var.c = new WeakReference(keyEvent);
        if (x62Var.b == null) {
            x62Var.b = new SparseArray();
        }
        SparseArray sparseArray = x62Var.b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        throw iy1.e(arrayList, size);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean i(defpackage.wo0 r6, android.view.View r7, android.view.Window.Callback r8, android.view.KeyEvent r9) {
        /*
            r0 = 0
            if (r6 != 0) goto L5
            goto Le4
        L5:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L10
            boolean r6 = r6.b(r9)
            return r6
        L10:
            boolean r1 = r8 instanceof android.app.Activity
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L82
            android.app.Activity r8 = (android.app.Activity) r8
            r8.onUserInteraction()
            android.view.Window r6 = r8.getWindow()
            r7 = 8
            boolean r7 = r6.hasFeature(r7)
            if (r7 == 0) goto L65
            android.app.ActionBar r7 = r8.getActionBar()
            int r1 = r9.getKeyCode()
            r4 = 82
            if (r1 != r4) goto L65
            if (r7 == 0) goto L65
            boolean r1 = defpackage.c3.d
            if (r1 != 0) goto L4d
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.String r4 = "onMenuKeyEvent"
            java.lang.Class<android.view.KeyEvent> r5 = android.view.KeyEvent.class
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.NoSuchMethodException -> L4b
            java.lang.reflect.Method r1 = r1.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L4b
            defpackage.c3.e = r1     // Catch: java.lang.NoSuchMethodException -> L4b
        L4b:
            defpackage.c3.d = r3
        L4d:
            java.lang.reflect.Method r1 = defpackage.c3.e
            if (r1 == 0) goto L62
            java.lang.Object[] r4 = new java.lang.Object[]{r9}     // Catch: java.lang.Throwable -> L62
            java.lang.Object r7 = r1.invoke(r7, r4)     // Catch: java.lang.Throwable -> L62
            if (r7 != 0) goto L5c
            goto L62
        L5c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L62
            boolean r0 = r7.booleanValue()     // Catch: java.lang.Throwable -> L62
        L62:
            if (r0 == 0) goto L65
            goto L81
        L65:
            boolean r7 = r6.superDispatchKeyEvent(r9)
            if (r7 == 0) goto L6c
            goto L81
        L6c:
            android.view.View r6 = r6.getDecorView()
            boolean r7 = defpackage.y62.d(r6, r9)
            if (r7 == 0) goto L77
            goto L81
        L77:
            if (r6 == 0) goto L7d
            android.view.KeyEvent$DispatcherState r2 = r6.getKeyDispatcherState()
        L7d:
            boolean r3 = r9.dispatch(r8, r2, r8)
        L81:
            return r3
        L82:
            boolean r1 = r8 instanceof android.app.Dialog
            if (r1 == 0) goto Ld5
            android.app.Dialog r8 = (android.app.Dialog) r8
            boolean r6 = defpackage.c3.f
            if (r6 != 0) goto L9b
            java.lang.Class<android.app.Dialog> r6 = android.app.Dialog.class
            java.lang.String r7 = "mOnKeyListener"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r7)     // Catch: java.lang.NoSuchFieldException -> L99
            defpackage.c3.g = r6     // Catch: java.lang.NoSuchFieldException -> L99
            r6.setAccessible(r3)     // Catch: java.lang.NoSuchFieldException -> L99
        L99:
            defpackage.c3.f = r3
        L9b:
            java.lang.reflect.Field r6 = defpackage.c3.g
            if (r6 == 0) goto La6
            java.lang.Object r6 = r6.get(r8)     // Catch: java.lang.IllegalAccessException -> La6
            android.content.DialogInterface$OnKeyListener r6 = (android.content.DialogInterface.OnKeyListener) r6     // Catch: java.lang.IllegalAccessException -> La6
            goto La7
        La6:
            r6 = r2
        La7:
            if (r6 == 0) goto Lb4
            int r7 = r9.getKeyCode()
            boolean r6 = r6.onKey(r8, r7, r9)
            if (r6 == 0) goto Lb4
            goto Ld4
        Lb4:
            android.view.Window r6 = r8.getWindow()
            boolean r7 = r6.superDispatchKeyEvent(r9)
            if (r7 == 0) goto Lbf
            goto Ld4
        Lbf:
            android.view.View r6 = r6.getDecorView()
            boolean r7 = defpackage.y62.d(r6, r9)
            if (r7 == 0) goto Lca
            goto Ld4
        Lca:
            if (r6 == 0) goto Ld0
            android.view.KeyEvent$DispatcherState r2 = r6.getKeyDispatcherState()
        Ld0:
            boolean r3 = r9.dispatch(r8, r2, r8)
        Ld4:
            return r3
        Ld5:
            if (r7 == 0) goto Ldd
            boolean r7 = defpackage.y62.d(r7, r9)
            if (r7 != 0) goto Le3
        Ldd:
            boolean r6 = r6.b(r9)
            if (r6 == 0) goto Le4
        Le3:
            return r3
        Le4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c3.i(wo0, android.view.View, android.view.Window$Callback, android.view.KeyEvent):boolean");
    }

    public static ArrayList j(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        File[] listFiles = new File(str).listFiles();
        if (listFiles != null) {
            String lowerCase = str2.toLowerCase(Locale.US);
            for (File file : listFiles) {
                if (file.isDirectory() && file.getName().toLowerCase(Locale.US).contains(lowerCase)) {
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    public static t00 k(byte[] bArr) {
        bArr.getClass();
        if (bArr.length > 10240) {
            c.n("Data cannot occupy more than 10240 bytes when serialized");
            return null;
        }
        if (bArr.length == 0) {
            return t00.b;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            byte[] bArr2 = new byte[2];
            byteArrayInputStream.read(bArr2);
            int i2 = 0;
            boolean z = bArr2[0] == -84 && bArr2[1] == -19;
            byteArrayInputStream.reset();
            if (z) {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    while (i2 < readInt) {
                        linkedHashMap.put(objectInputStream.readUTF(), objectInputStream.readObject());
                        i2++;
                    }
                    objectInputStream.close();
                } finally {
                }
            } else {
                DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
                try {
                    short readShort = dataInputStream.readShort();
                    if (readShort != -21521) {
                        throw new IllegalStateException(d51.q("Magic number doesn't match: ", readShort).toString());
                    }
                    short readShort2 = dataInputStream.readShort();
                    if (readShort2 != 1) {
                        throw new IllegalStateException(d51.q("Unsupported version number: ", readShort2).toString());
                    }
                    int readInt2 = dataInputStream.readInt();
                    while (i2 < readInt2) {
                        linkedHashMap.put(dataInputStream.readUTF(), l(dataInputStream, dataInputStream.readByte()));
                        i2++;
                    }
                    dataInputStream.close();
                } finally {
                }
            }
        } catch (IOException unused) {
            int i3 = x00.f1154a;
            ai1.h().getClass();
        } catch (ClassNotFoundException unused2) {
            int i4 = x00.f1154a;
            ai1.h().getClass();
        }
        return new t00(linkedHashMap);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Serializable, java.lang.Double[]] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.Serializable, java.lang.Float[]] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Serializable, java.lang.Long[]] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.io.Serializable, java.lang.Integer[]] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Serializable, java.lang.Byte[]] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.io.Serializable, java.lang.Boolean[]] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.io.Serializable, java.lang.String[]] */
    public static final Serializable l(DataInputStream dataInputStream, byte b2) {
        if (b2 == 0) {
            return null;
        }
        if (b2 == 1) {
            return Boolean.valueOf(dataInputStream.readBoolean());
        }
        if (b2 == 2) {
            return Byte.valueOf(dataInputStream.readByte());
        }
        if (b2 == 3) {
            return Integer.valueOf(dataInputStream.readInt());
        }
        if (b2 == 4) {
            return Long.valueOf(dataInputStream.readLong());
        }
        if (b2 == 5) {
            return Float.valueOf(dataInputStream.readFloat());
        }
        if (b2 == 6) {
            return Double.valueOf(dataInputStream.readDouble());
        }
        if (b2 == 7) {
            return dataInputStream.readUTF();
        }
        int i2 = 0;
        if (b2 == 8) {
            int readInt = dataInputStream.readInt();
            ?? r0 = new Boolean[readInt];
            while (i2 < readInt) {
                r0[i2] = Boolean.valueOf(dataInputStream.readBoolean());
                i2++;
            }
            return r0;
        }
        if (b2 == 9) {
            int readInt2 = dataInputStream.readInt();
            ?? r02 = new Byte[readInt2];
            while (i2 < readInt2) {
                r02[i2] = Byte.valueOf(dataInputStream.readByte());
                i2++;
            }
            return r02;
        }
        if (b2 == 10) {
            int readInt3 = dataInputStream.readInt();
            ?? r03 = new Integer[readInt3];
            while (i2 < readInt3) {
                r03[i2] = Integer.valueOf(dataInputStream.readInt());
                i2++;
            }
            return r03;
        }
        if (b2 == 11) {
            int readInt4 = dataInputStream.readInt();
            ?? r04 = new Long[readInt4];
            while (i2 < readInt4) {
                r04[i2] = Long.valueOf(dataInputStream.readLong());
                i2++;
            }
            return r04;
        }
        if (b2 == 12) {
            int readInt5 = dataInputStream.readInt();
            ?? r05 = new Float[readInt5];
            while (i2 < readInt5) {
                r05[i2] = Float.valueOf(dataInputStream.readFloat());
                i2++;
            }
            return r05;
        }
        if (b2 == 13) {
            int readInt6 = dataInputStream.readInt();
            ?? r06 = new Double[readInt6];
            while (i2 < readInt6) {
                r06[i2] = Double.valueOf(dataInputStream.readDouble());
                i2++;
            }
            return r06;
        }
        if (b2 != 14) {
            c.n(d51.q("Unsupported type ", b2));
            return null;
        }
        int readInt7 = dataInputStream.readInt();
        ?? r1 = new String[readInt7];
        while (i2 < readInt7) {
            String readUTF = dataInputStream.readUTF();
            if (ym0.b(readUTF, "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d")) {
                readUTF = null;
            }
            r1[i2] = readUTF;
            i2++;
        }
        return r1;
    }

    public static ArrayList n(List list) {
        CellIdentity cellIdentity;
        int nrarfcn;
        HashSet hashSet = new HashSet();
        if (list == null) {
            return new ArrayList();
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CellInfo cellInfo = (CellInfo) it.next();
            String str = "Band 8";
            if (cellInfo instanceof CellInfoLte) {
                int earfcn = ((CellInfoLte) cellInfo).getCellIdentity().getEarfcn();
                if (earfcn < 0 || earfcn == Integer.MAX_VALUE) {
                    str = "Unknown LTE Band";
                } else if (earfcn <= 599) {
                    str = "Band 1";
                } else if (earfcn <= 1199) {
                    str = "Band 2";
                } else if (earfcn <= 1949) {
                    str = "Band 3";
                } else if (earfcn <= 2399) {
                    str = "Band 4";
                } else if (earfcn <= 2649) {
                    str = "Band 5";
                } else if (earfcn <= 2749) {
                    str = "Band 6";
                } else if (earfcn <= 3449) {
                    str = "Band 7";
                } else if (earfcn > 3799) {
                    str = earfcn <= 4049 ? "Band 9" : earfcn <= 4149 ? "Band 10" : earfcn <= 4749 ? "Band 12/13/14" : earfcn <= 4949 ? "Band 17" : earfcn <= 5149 ? Gvyagftz.CtsqitUJRrPOe : earfcn <= 5249 ? "Band 20" : earfcn <= 5449 ? "Band 21" : earfcn <= 5739 ? "Band 25" : earfcn <= 5849 ? "Band 26" : earfcn <= 5999 ? "Band 27" : earfcn <= 6149 ? "Band 28" : earfcn <= 6449 ? "Band 29" : earfcn <= 6599 ? "Band 30" : earfcn <= 7399 ? "Band 38" : earfcn <= 7699 ? "Band 39" : earfcn <= 8039 ? "Band 40" : earfcn <= 8689 ? BFtDZYxPcpGN.AvRPkdLCMmx : earfcn <= 9159 ? "Band 42" : earfcn <= 9659 ? "Band 43" : earfcn <= 9919 ? "Band 66" : d51.p(earfcn, "Unknown LTE Band (", ")");
                }
                hashSet.add(str);
            } else if (Build.VERSION.SDK_INT >= 29 && fi0.C(cellInfo)) {
                cellIdentity = r0.h(cellInfo).getCellIdentity();
                nrarfcn = fi0.l(cellIdentity).getNrarfcn();
                hashSet.add((nrarfcn < 0 || nrarfcn == Integer.MAX_VALUE) ? "Unknown NR Band" : (nrarfcn < 620000 || nrarfcn > 653333) ? (nrarfcn < 2054166 || nrarfcn > 2104156) ? (nrarfcn < 151600 || nrarfcn > 160600) ? (nrarfcn < 158200 || nrarfcn > 164180) ? (nrarfcn < 295000 || nrarfcn > 340000) ? (nrarfcn < 173800 || nrarfcn > 178800) ? d51.p(nrarfcn, RIhTGWkqQvGL.sRSiQzJArNu, ")") : "n66" : jYVJoqfHJs.BmWifLwuX : "n41" : "n38" : yFbVsaLCWAtQC.mGMvWtJLxHYi : "n78");
            } else if (cellInfo instanceof CellInfoWcdma) {
                int uarfcn = ((CellInfoWcdma) cellInfo).getCellIdentity().getUarfcn();
                if (uarfcn < 0 || uarfcn == Integer.MAX_VALUE) {
                    str = "Unknown WCDMA Band";
                } else if (uarfcn >= 10562 && uarfcn <= 10838) {
                    str = "Band 1";
                } else if (uarfcn < 9662 || uarfcn > 9938) {
                    str = (uarfcn < 412 || uarfcn > 686) ? (uarfcn < 1537 || uarfcn > 1738) ? d51.p(uarfcn, "Unknown WCDMA Band (", ")") : "Band 2" : "Band 5";
                }
                hashSet.add(str);
            } else if (cellInfo instanceof CellInfoGsm) {
                int arfcn = ((CellInfoGsm) cellInfo).getCellIdentity().getArfcn();
                hashSet.add((arfcn < 0 || arfcn == Integer.MAX_VALUE) ? "Unknown GSM Band" : (arfcn < 1 || arfcn > 124) ? (arfcn < 128 || arfcn > 251) ? (arfcn < 512 || arfcn > 885) ? (arfcn < 975 || arfcn > 1023) ? d51.p(arfcn, "Unknown GSM Band (", ")") : "GSM 1900" : "GSM 1800" : "GSM 850" : "GSM 900");
            }
        }
        return new ArrayList(hashSet);
    }

    public static int p(Context context, int i2) {
        return context.getApplicationContext().getSharedPreferences(nyGJ.zxUEsvwlf, 0).getInt("label_" + i2, 0);
    }

    public static int q(Context context) {
        return context.getResources().getColor((context.getResources().getConfiguration().uiMode & 48) == 32 ? android.R.color.system_neutral1_50 : android.R.color.system_neutral1_900, context.getTheme()) | (-16777216);
    }

    public static boolean u(Context context) {
        NetworkCapabilities networkCapabilities;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())) != null) {
                if (!networkCapabilities.hasTransport(1) && !networkCapabilities.hasTransport(0)) {
                    if (networkCapabilities.hasTransport(3)) {
                    }
                }
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static double w(double d2, double d3, double d4) {
        return (d4 * d3) + ((1.0d - d4) * d2);
    }

    public static double[] x(double[] dArr, double[][] dArr2) {
        double d2 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d3 = dArr3[0] * d2;
        double d4 = dArr[1];
        double d5 = (dArr3[1] * d4) + d3;
        double d6 = dArr[2];
        double d7 = (dArr3[2] * d6) + d5;
        double[] dArr4 = dArr2[1];
        double d8 = (dArr4[2] * d6) + (dArr4[1] * d4) + (dArr4[0] * d2);
        double[] dArr5 = dArr2[2];
        return new double[]{d7, d8, (d6 * dArr5[2]) + (d4 * dArr5[1]) + (d2 * dArr5[0])};
    }

    public static Integer y(Integer num, Integer num2) {
        return num == null ? num2 : (num2 != null && num.intValue() < num2.intValue()) ? num2 : num;
    }

    public static void z(Activity activity) {
        int c2 = i51.c(6, "prefColor");
        if (((il1) i51.f()).getBoolean("prefSysTheme", true)) {
            if (uz1.h0(activity)) {
                i51.h("prefDarkTheme", true);
                h = 2;
            } else {
                i51.h("prefDarkTheme", false);
                h = 1;
            }
        } else if (i51.b("prefDarkTheme").booleanValue()) {
            h = 2;
        } else {
            h = 1;
        }
        if (Build.VERSION.SDK_INT >= 31 && i51.b("prefDC").booleanValue()) {
            if (h == 2) {
                activity.setTheme(R.style.AppThemeMaterial3Dark);
            } else {
                activity.setTheme(R.style.AppThemeMaterial3Light);
                return;
            }
        }
        int i2 = h;
        if (i2 == 1) {
            i51.h("prefDarkTheme", false);
            switch (c2) {
                case 3:
                    activity.setTheme(R.style.AppThemeLightYellow);
                    break;
                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                    activity.setTheme(R.style.AppThemeLightBlue);
                    break;
                case 5:
                    activity.setTheme(R.style.AppThemeLightGrey);
                    break;
                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                    activity.setTheme(R.style.AppThemeLightGreen);
                    break;
                case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                    activity.setTheme(R.style.AppThemeLightRed);
                    break;
                case 8:
                    activity.setTheme(R.style.AppThemeLightAqua);
                    break;
                case rt0.o /* 9 */:
                    activity.setTheme(R.style.AppThemeLightOrange);
                    break;
                case 10:
                    activity.setTheme(R.style.AppThemeLightPink);
                    break;
                case 11:
                    activity.setTheme(R.style.AppThemeLightIndigo);
                    break;
                default:
                    activity.setTheme(R.style.AppThemeLightGreen);
                    break;
            }
        }
        if (i2 == 2) {
            i51.h("prefDarkTheme", true);
            switch (c2) {
                case 3:
                    activity.setTheme(R.style.AppThemeDarkYellow);
                    break;
                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                    activity.setTheme(R.style.AppThemeDarkBlue);
                    break;
                case 5:
                    activity.setTheme(R.style.AppThemeDarkGrey);
                    break;
                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                    activity.setTheme(R.style.AppThemeDarkGreen);
                    break;
                case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                    activity.setTheme(R.style.AppThemeDarkRed);
                    break;
                case 8:
                    activity.setTheme(R.style.AppThemeDarkAqua);
                    break;
                case rt0.o /* 9 */:
                    activity.setTheme(R.style.AppThemeDarkOrange);
                    break;
                case 10:
                    activity.setTheme(R.style.AppThemeDarkPink);
                    break;
                case 11:
                    activity.setTheme(R.style.AppThemeDarkIndigo);
                    break;
                default:
                    activity.setTheme(R.style.AppThemeDarkGreen);
                    break;
            }
        }
        if (i51.b("prefDarkTheme").booleanValue()) {
            switch (c2) {
                case 3:
                    activity.setTheme(R.style.AppThemeDarkYellow);
                    break;
                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                    activity.setTheme(R.style.AppThemeDarkBlue);
                    break;
                case 5:
                    activity.setTheme(R.style.AppThemeDarkGrey);
                    break;
                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                    activity.setTheme(R.style.AppThemeDarkGreen);
                    break;
                case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                    activity.setTheme(R.style.AppThemeDarkRed);
                    break;
                case 8:
                    activity.setTheme(R.style.AppThemeDarkAqua);
                    break;
                case rt0.o /* 9 */:
                    activity.setTheme(R.style.AppThemeDarkOrange);
                    break;
                case 10:
                    activity.setTheme(R.style.AppThemeDarkPink);
                    break;
                case 11:
                    activity.setTheme(R.style.AppThemeDarkIndigo);
                    break;
                default:
                    activity.setTheme(R.style.AppThemeDarkGreen);
                    break;
            }
        }
        switch (c2) {
            case 3:
                activity.setTheme(R.style.AppThemeLightYellow);
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                activity.setTheme(R.style.AppThemeLightBlue);
                break;
            case 5:
                activity.setTheme(R.style.AppThemeLightGrey);
                break;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                activity.setTheme(R.style.AppThemeLightGreen);
                break;
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                activity.setTheme(R.style.AppThemeLightRed);
                break;
            case 8:
                activity.setTheme(R.style.AppThemeLightAqua);
                break;
            case rt0.o /* 9 */:
                activity.setTheme(R.style.AppThemeLightOrange);
                break;
            case 10:
                activity.setTheme(R.style.AppThemeLightPink);
                break;
            case 11:
                activity.setTheme(R.style.AppThemeLightIndigo);
                break;
            default:
                activity.setTheme(R.style.AppThemeLightGreen);
                break;
        }
    }

    public abstract void L(boolean z);

    public abstract void N(boolean z);

    public abstract TransformationMethod R(TransformationMethod transformationMethod);

    public abstract Method m(Class cls, Field field);

    public abstract Constructor o(Class cls);

    public abstract InputFilter[] r(InputFilter[] inputFilterArr);

    public abstract String[] s(Class cls);

    public abstract boolean t();

    public abstract boolean v(Class cls);
}
