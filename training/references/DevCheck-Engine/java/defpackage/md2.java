package defpackage;

import Cwd.YSHrxiHkAFcciU;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.fHMN.BFtDZYxPcpGN;
import android.text.format.DateFormat;
import android.util.Base64;
import android.util.Size;
import android.util.SizeF;
import android.util.TypedValue;
import android.view.View;
import androidx.core.widget.rsm.gXdyRQCGVlHW;
import androidx.media.RfwE.BIxeFreLLop;
import com.google.android.datatransport.runtime.backends.XUas.yFbVsaLCWAtQC;
import com.google.android.material.behavior.YqV.Gvyagftz;
import com.google.android.material.bottomappbar.HaCM.QCeVODiUkb;
import com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB;
import com.google.android.material.card.ZyJo.nTAZxGMqQtZZAQ;
import com.google.android.material.snackbar.qXlx.IGQCApxXGMWo;
import com.imn.iivisu.ltkT.CDsMEtnUjndKau;
import com.jjoe64.graphview.XZMC.MiGPiFgcCQCVh;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.history.Hq.CGvJMCDBOmCdj;
import flar2.devcheck.benchmarkSuite.nativebridge.vGm.RIhTGWkqQvGL;
import flar2.devcheck.nativebridge.xm.oWuW;
import flar2.devcheck.sensors.JCZI.nyGJ;
import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import moe.shizuku.api.hYGD.yttXLrAeLjN;
import org.apache.commons.logging.impl.SimpleLog;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class md2 {

    /* renamed from: a, reason: collision with root package name */
    public static final c4 f627a = new c4(7);
    public static final byte[] b = {48, 49, 53, 0};
    public static final byte[] c = {48, 49, 48, 0};
    public static final byte[] d = {48, 48, 57, 0};
    public static final byte[] e = {48, 48, 53, 0};
    public static final byte[] f = {48, 48, 49, 0};
    public static final byte[] g = {48, 48, 49, 0};
    public static final byte[] h = {48, 48, 50, 0};
    public static n3 i = null;
    public static boolean j = true;
    public static Field k;
    public static boolean l;

    public static final long A(int i2) {
        w60 w60Var = w60.SECONDS;
        if (w60Var.compareTo(w60Var) > 0) {
            return B(i2, w60Var);
        }
        long convert = TimeUnit.NANOSECONDS.convert(i2, TimeUnit.SECONDS);
        j70 j70Var = u60.g;
        long j2 = convert << 1;
        int i3 = v60.f1072a;
        return j2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        if (r8 > 4611686018427387903L) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009f, code lost:
    
        if (r8 > 4611686018427387903L) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long B(long r8, defpackage.w60 r10) {
        /*
            java.util.concurrent.TimeUnit r0 = r10.g
            r1 = 4611686018426999999(0x3ffffffffffa14bf, double:1.9999999999138678)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = r0.convert(r1, r3)
            long r4 = -r1
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 > 0) goto L21
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 > 0) goto L21
            long r8 = r3.convert(r8, r0)
            j70 r10 = defpackage.u60.g
            r10 = 1
            long r8 = r8 << r10
            int r10 = defpackage.v60.f1072a
            return r8
        L21:
            w60 r1 = defpackage.w60.MILLISECONDS
            int r1 = r10.compareTo(r1)
            if (r1 < 0) goto La8
            int r0 = java.lang.Long.signum(r8)
            long r0 = (long) r0
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 >= 0) goto L38
            r8 = r2
        L38:
            long r8 = java.lang.Math.abs(r8)
            int r2 = r10.ordinal()
            r3 = 2
            r4 = 0
            r6 = 1
            if (r2 == r3) goto L68
            r3 = 3
            if (r2 == r3) goto L65
            r3 = 4
            if (r2 == r3) goto L61
            r3 = 5
            if (r2 == r3) goto L5d
            r3 = 6
            if (r2 != r3) goto L57
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            goto L69
        L57:
            java.lang.String r8 = "Wrong unit for millisMultiplier: "
            defpackage.rw.m(r8, r10)
            return r4
        L5d:
            r2 = 3600000(0x36ee80, double:1.7786363E-317)
            goto L69
        L61:
            r2 = 60000(0xea60, double:2.9644E-319)
            goto L69
        L65:
            r2 = 1000(0x3e8, double:4.94E-321)
            goto L69
        L68:
            r2 = r6
        L69:
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 != 0) goto L6f
        L6d:
            r8 = r4
            goto La2
        L6f:
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            r4 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            if (r10 != 0) goto L7f
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 <= 0) goto L7d
            goto La1
        L7d:
            r8 = r2
            goto La2
        L7f:
            int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r10 != 0) goto L88
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto La2
            goto La1
        L88:
            int r10 = java.lang.Long.numberOfLeadingZeros(r8)
            int r10 = 128 - r10
            int r6 = java.lang.Long.numberOfLeadingZeros(r2)
            int r10 = r10 - r6
            r6 = 63
            if (r10 >= r6) goto L99
            long r8 = r8 * r2
            goto La2
        L99:
            if (r10 <= r6) goto L9c
            goto La1
        L9c:
            long r8 = r8 * r2
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 <= 0) goto La2
        La1:
            goto L6d
        La2:
            long r0 = r0 * r8
            long r8 = h(r0)
            return r8
        La8:
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r8 = r10.convert(r8, r0)
            long r8 = defpackage.tl2.g(r8)
            long r8 = h(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md2.B(long, w60):long");
    }

    public static File C(Context context, yf yfVar) {
        gh1 gh1Var;
        File file = new File(context.getCacheDir(), "bm2_share");
        if (!file.exists() && !file.mkdirs()) {
            file.toString();
            return null;
        }
        File file2 = new File(file, "bm2_samples_" + ((Object) DateFormat.format("yyyyMMdd_HHmmss", new Date())) + ".csv");
        long max = Math.max(0L, System.currentTimeMillis() - 157680000000L);
        long currentTimeMillis = System.currentTimeMillis();
        zf zfVar = (zf) yfVar.b;
        zfVar.getClass();
        gh1 a2 = gh1.a(2, "SELECT * FROM battery_sample WHERE captured_at BETWEEN ? AND ? ORDER BY captured_at ASC");
        a2.d(1, max);
        a2.d(2, currentTimeMillis);
        dh1 dh1Var = (dh1) zfVar.h;
        dh1Var.b();
        Cursor G = tl2.G(dh1Var, a2, false);
        try {
            int v = je2.v(G, "id");
            int v2 = je2.v(G, "captured_at");
            int v3 = je2.v(G, "level_pct");
            int v4 = je2.v(G, "voltage_mv");
            int v5 = je2.v(G, "current_ua");
            int v6 = je2.v(G, "temperature_deci_c");
            int v7 = je2.v(G, "charge_counter_uah");
            int v8 = je2.v(G, "status");
            int v9 = je2.v(G, "plugged");
            int v10 = je2.v(G, BIxeFreLLop.UwP);
            int v11 = je2.v(G, Gvyagftz.UAd);
            int v12 = je2.v(G, "thermal_status");
            int v13 = je2.v(G, "resolution");
            gh1Var = a2;
            try {
                ArrayList arrayList = new ArrayList(G.getCount());
                while (G.moveToNext()) {
                    ag agVar = new ag();
                    G.getLong(v);
                    ArrayList arrayList2 = arrayList;
                    int i2 = v13;
                    agVar.f26a = G.getLong(v2);
                    agVar.b = G.getInt(v3);
                    agVar.c = G.getInt(v4);
                    agVar.d = G.getLong(v5);
                    agVar.e = G.getInt(v6);
                    agVar.f = G.getLong(v7);
                    agVar.g = G.getInt(v8);
                    agVar.h = G.getInt(v9);
                    agVar.i = G.getInt(v10) != 0;
                    agVar.j = G.getInt(v11) != 0;
                    agVar.k = G.getInt(v12);
                    agVar.l = G.getInt(i2);
                    arrayList2.add(agVar);
                    v13 = i2;
                    arrayList = arrayList2;
                }
                ArrayList arrayList3 = arrayList;
                G.close();
                gh1Var.e();
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
                try {
                    bufferedWriter.write("timestamp_ms,iso_utc,level_pct,voltage_mv,current_ua,temp_deci_c,charge_counter_uah,status,plugged,charging,screen_on,thermal_status,resolution");
                    bufferedWriter.newLine();
                    int size = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList3.get(i3);
                        i3++;
                        ag agVar2 = (ag) obj;
                        bufferedWriter.write(Long.toString(agVar2.f26a));
                        bufferedWriter.write(44);
                        bufferedWriter.write(DateFormat.format("yyyy-MM-dd'T'HH:mm:ssZ", agVar2.f26a).toString());
                        bufferedWriter.write(44);
                        bufferedWriter.write(Integer.toString(agVar2.b));
                        bufferedWriter.write(44);
                        bufferedWriter.write(Integer.toString(agVar2.c));
                        bufferedWriter.write(44);
                        bufferedWriter.write(Long.toString(agVar2.d));
                        bufferedWriter.write(44);
                        bufferedWriter.write(Integer.toString(agVar2.e));
                        bufferedWriter.write(44);
                        bufferedWriter.write(Long.toString(agVar2.f));
                        bufferedWriter.write(44);
                        bufferedWriter.write(Integer.toString(agVar2.g));
                        bufferedWriter.write(44);
                        bufferedWriter.write(Integer.toString(agVar2.h));
                        bufferedWriter.write(44);
                        boolean z = agVar2.i;
                        String str = jYVJoqfHJs.dgnNf;
                        bufferedWriter.write(z ? "1" : str);
                        bufferedWriter.write(44);
                        if (agVar2.j) {
                            str = "1";
                        }
                        bufferedWriter.write(str);
                        bufferedWriter.write(44);
                        bufferedWriter.write(Integer.toString(agVar2.k));
                        bufferedWriter.write(44);
                        bufferedWriter.write(Integer.toString(agVar2.l));
                        bufferedWriter.newLine();
                    }
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    return file2;
                } finally {
                }
            } catch (Throwable th) {
                th = th;
                G.close();
                gh1Var.e();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            gh1Var = a2;
        }
    }

    public static void D(Parcel parcel, int i2, Parcelable parcelable, int i3) {
        if (parcelable == null) {
            return;
        }
        int J = J(parcel, i2);
        parcelable.writeToParcel(parcel, i3);
        K(parcel, J);
    }

    public static void E(Parcel parcel, int i2, String str) {
        if (str == null) {
            return;
        }
        int J = J(parcel, i2);
        parcel.writeString(str);
        K(parcel, J);
    }

    public static void F(Parcel parcel, int i2, Parcelable[] parcelableArr, int i3) {
        if (parcelableArr == null) {
            return;
        }
        int J = J(parcel, i2);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, i3);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        K(parcel, J);
    }

    public static void G(Parcel parcel, int i2, List list) {
        if (list == null) {
            return;
        }
        int J = J(parcel, i2);
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            Parcelable parcelable = (Parcelable) list.get(i3);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                int dataPosition = parcel.dataPosition();
                parcel.writeInt(1);
                int dataPosition2 = parcel.dataPosition();
                parcelable.writeToParcel(parcel, 0);
                int dataPosition3 = parcel.dataPosition();
                parcel.setDataPosition(dataPosition);
                parcel.writeInt(dataPosition3 - dataPosition2);
                parcel.setDataPosition(dataPosition3);
            }
        }
        K(parcel, J);
    }

    public static int H(int i2) {
        if (i2 == 90) {
            return 91;
        }
        if (i2 == 91) {
            return 92;
        }
        if (i2 == 93) {
            return 94;
        }
        if (i2 == 94) {
            return 95;
        }
        switch (i2) {
            case 0:
                return 1;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return 2;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return 3;
            case 3:
                return 4;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return 5;
            case 5:
                return 6;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return 7;
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                return 8;
            case 8:
                return 9;
            case rt0.o /* 9 */:
                return 10;
            case 10:
                return 11;
            case 11:
                return 12;
            case 12:
                return 13;
            case 13:
                return 14;
            case 14:
                return 15;
            case 15:
                return 16;
            case 16:
                return 17;
            case rt0.p /* 17 */:
                return 18;
            case 18:
                return 19;
            case 19:
                return 20;
            case 20:
                return 21;
            case 21:
                return 22;
            case 22:
                return 23;
            case 23:
                return 24;
            case 24:
                return 25;
            case 25:
                return 26;
            case 26:
                return 27;
            case 27:
                return 28;
            case 28:
                return 29;
            case 29:
                return 30;
            case 30:
                return 31;
            case 31:
                return 32;
            case rt0.q /* 32 */:
                return 33;
            case 33:
                return 34;
            case 34:
                return 35;
            case 35:
                return 36;
            case 36:
                return 37;
            case 37:
                return 38;
            case 38:
                return 39;
            case 39:
                return 40;
            case 40:
                return 41;
            case 41:
                return 42;
            case 42:
                return 43;
            case 43:
                return 44;
            case 44:
                return 45;
            case 45:
                return 46;
            case 46:
                return 47;
            case 47:
                return 48;
            case 48:
                return 49;
            case 49:
                return 50;
            case 50:
                return 51;
            case 51:
                return 52;
            case 52:
                return 53;
            case 53:
                return 54;
            case 54:
                return 55;
            case 55:
                return 56;
            case 56:
                return 57;
            case 57:
                return 58;
            case 58:
                return 59;
            case 59:
                return 60;
            case 60:
                return 61;
            case 61:
                return 62;
            case 62:
                return 63;
            case 63:
                return 64;
            case rt0.r /* 64 */:
                return 65;
            case 65:
                return 66;
            case 66:
                return 67;
            case 67:
                return 68;
            case 68:
                return 69;
            case 69:
                return 70;
            case 70:
                return 71;
            case 71:
                return 72;
            case 72:
                return 73;
            case 73:
                return 74;
            case 74:
                return 75;
            case 75:
                return 76;
            case 76:
                return 77;
            case 77:
                return 78;
            case 78:
                return 79;
            case 79:
                return 80;
            default:
                switch (i2) {
                    case 96:
                        return 97;
                    case 97:
                        return 98;
                    case 98:
                        return 99;
                    case 99:
                        return 100;
                    case 100:
                        return 101;
                    case 101:
                        return 102;
                    case 102:
                        return 103;
                    case 103:
                        return 104;
                    case 104:
                        return 105;
                    case 105:
                        return 106;
                    case 106:
                        return 107;
                    case 107:
                        return 108;
                    case 108:
                        return 109;
                    case 109:
                        return 110;
                    case 110:
                        return 111;
                    case 111:
                        return 112;
                    case 112:
                        return 113;
                    case 113:
                        return 114;
                    case 114:
                        return 115;
                    case 115:
                        return 116;
                    case 116:
                        return 117;
                    case 117:
                        return 118;
                    case 118:
                        return 119;
                    case 119:
                        return 120;
                    case 120:
                        return 121;
                    case 121:
                        return 122;
                    default:
                        return 0;
                }
        }
    }

    public static void I(Parcel parcel, int i2, int i3) {
        parcel.writeInt(i2 | (i3 << 16));
    }

    public static int J(Parcel parcel, int i2) {
        parcel.writeInt(i2 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void K(Parcel parcel, int i2) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i2 - 4);
        parcel.writeInt(dataPosition - i2);
        parcel.setDataPosition(dataPosition);
    }

    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            xe2 xe2Var = (xe2) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", xe2Var.f1181a);
            bundle.putLong("event_timestamp", xe2Var.b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }

    public static final long b(long j2, long j3) {
        if (j2 != 4611686018427387903L && j2 != -4611686018427387903L) {
            return (j3 == 4611686018427387903L || j3 == -4611686018427387903L) ? j3 : tl2.g(j2 + j3);
        }
        if ((-4611686018427387903L >= j3 || j3 >= 4611686018427387903L) && (j3 ^ j2) < 0) {
            return 9223372036854759646L;
        }
        return j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.na1 r4, defpackage.af0 r5, defpackage.ex r6) {
        /*
            boolean r0 = r6 instanceof defpackage.ma1
            if (r0 == 0) goto L13
            r0 = r6
            ma1 r0 = (defpackage.ma1) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            ma1 r0 = new ma1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.k
            int r1 = r0.l
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            af0 r5 = r0.j
            defpackage.om0.O(r6)     // Catch: java.lang.Throwable -> L28
            goto L63
        L28:
            r4 = move-exception
            goto L69
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.n(r4)
            return r2
        L30:
            defpackage.om0.O(r6)
            qx r6 = r0.h
            r6.getClass()
            pg0 r1 = defpackage.pg0.k
            ox r6 = r6.r(r1)
            if (r6 != r4) goto L6d
            r0.j = r5     // Catch: java.lang.Throwable -> L28
            r0.l = r3     // Catch: java.lang.Throwable -> L28
            ao r6 = new ao     // Catch: java.lang.Throwable -> L28
            dx r0 = defpackage.ju0.T(r0)     // Catch: java.lang.Throwable -> L28
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L28
            r6.x()     // Catch: java.lang.Throwable -> L28
            ds0 r0 = new ds0     // Catch: java.lang.Throwable -> L28
            r0.<init>(r3, r6)     // Catch: java.lang.Throwable -> L28
            bm r4 = r4.l     // Catch: java.lang.Throwable -> L28
            r4.x(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.Object r4 = r6.v()     // Catch: java.lang.Throwable -> L28
            zx r6 = defpackage.zx.g
            if (r4 != r6) goto L63
            return r6
        L63:
            r5.a()
            e42 r4 = defpackage.e42.f219a
            return r4
        L69:
            r5.a()
            throw r4
        L6d:
            java.lang.String r4 = "awaitClose() can only be invoked from the producer context"
            defpackage.c.n(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md2.c(na1, af0, ex):java.lang.Object");
    }

    public static final Bundle d(z51... z51VarArr) {
        Bundle bundle = new Bundle(z51VarArr.length);
        for (z51 z51Var : z51VarArr) {
            String str = (String) z51Var.g;
            Object obj = z51Var.h;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        c.k("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, 34);
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    c.k("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, 34);
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static k40 e(xc1 xc1Var) {
        int i2;
        n40 n40Var;
        int i3;
        m40 m40Var;
        int i4;
        int i5;
        n40 n40Var2;
        n40 n40Var3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int t = xc1Var.t();
        int s = xc1Var.s();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        m40 m40Var2 = new m40();
        int i15 = 0;
        m40Var2.f618a = 0;
        m40Var2.b = t;
        m40Var2.c = 0;
        m40Var2.d = s;
        arrayList2.add(m40Var2);
        int i16 = t + s;
        int i17 = 1;
        int i18 = (((i16 + 1) / 2) * 2) + 1;
        int[] iArr = new int[i18];
        int i19 = i18 / 2;
        int[] iArr2 = new int[i18];
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            m40 m40Var3 = (m40) arrayList2.remove(arrayList2.size() - i17);
            if (m40Var3.b() >= i17 && m40Var3.a() >= i17) {
                int a2 = ((m40Var3.a() + m40Var3.b()) + i17) / 2;
                int i20 = i17 + i19;
                iArr[i20] = m40Var3.f618a;
                iArr2[i20] = m40Var3.b;
                int i21 = i15;
                while (i21 < a2) {
                    int i22 = Math.abs(m40Var3.b() - m40Var3.a()) % 2 == i17 ? i17 : i15;
                    int b2 = m40Var3.b() - m40Var3.a();
                    int i23 = -i21;
                    int i24 = i23;
                    while (true) {
                        if (i24 > i21) {
                            i4 = i15;
                            i2 = i19;
                            i5 = a2;
                            n40Var2 = null;
                            break;
                        }
                        if (i24 == i23 || (i24 != i21 && iArr[i24 + 1 + i19] > iArr[(i24 - 1) + i19])) {
                            i10 = iArr[i24 + 1 + i19];
                            i11 = i10;
                        } else {
                            i10 = iArr[(i24 - 1) + i19];
                            i11 = i10 + 1;
                        }
                        i2 = i19;
                        int i25 = ((i11 - m40Var3.f618a) + m40Var3.c) - i24;
                        if (i21 == 0 || i11 != i10) {
                            i12 = i11;
                            i13 = i25;
                        } else {
                            i12 = i11;
                            i13 = i25 - 1;
                        }
                        int i26 = i24;
                        int i27 = i25;
                        int i28 = i12;
                        i5 = a2;
                        while (i28 < m40Var3.b && i27 < m40Var3.d && xc1Var.c(i28, i27)) {
                            i28++;
                            i27++;
                        }
                        iArr[i26 + i2] = i28;
                        if (i22 != 0) {
                            int i29 = b2 - i26;
                            i14 = i22;
                            if (i29 >= i23 + 1 && i29 <= i21 - 1 && iArr2[i29 + i2] <= i28) {
                                n40Var2 = new n40();
                                n40Var2.f664a = i10;
                                n40Var2.b = i13;
                                n40Var2.c = i28;
                                n40Var2.d = i27;
                                i4 = 0;
                                n40Var2.e = false;
                                break;
                            }
                        } else {
                            i14 = i22;
                        }
                        i24 = i26 + 2;
                        i15 = 0;
                        i19 = i2;
                        a2 = i5;
                        i22 = i14;
                    }
                    if (n40Var2 != null) {
                        n40Var = n40Var2;
                        break;
                    }
                    int i30 = (m40Var3.b() - m40Var3.a()) % 2 == 0 ? 1 : i4;
                    int b3 = m40Var3.b() - m40Var3.a();
                    int i31 = i23;
                    while (true) {
                        if (i31 > i21) {
                            n40Var3 = null;
                            break;
                        }
                        if (i31 == i23 || (i31 != i21 && iArr2[i31 + 1 + i2] < iArr2[(i31 - 1) + i2])) {
                            i6 = iArr2[i31 + 1 + i2];
                            i7 = i6;
                        } else {
                            i6 = iArr2[(i31 - 1) + i2];
                            i7 = i6 - 1;
                        }
                        int i32 = m40Var3.d - ((m40Var3.b - i7) - i31);
                        int i33 = (i21 == 0 || i7 != i6) ? i32 : i32 + 1;
                        int i34 = i30;
                        while (i7 > m40Var3.f618a && i32 > m40Var3.c) {
                            i8 = b3;
                            if (!xc1Var.c(i7 - 1, i32 - 1)) {
                                break;
                            }
                            i7--;
                            i32--;
                            b3 = i8;
                        }
                        i8 = b3;
                        iArr2[i31 + i2] = i7;
                        if (i34 != 0 && (i9 = i8 - i31) >= i23 && i9 <= i21 && iArr[i9 + i2] >= i7) {
                            n40Var3 = new n40();
                            n40Var3.f664a = i7;
                            n40Var3.b = i32;
                            n40Var3.c = i6;
                            n40Var3.d = i33;
                            n40Var3.e = true;
                            break;
                        }
                        i31 += 2;
                        i30 = i34;
                        b3 = i8;
                    }
                    if (n40Var3 != null) {
                        n40Var = n40Var3;
                        break;
                    }
                    i21++;
                    i19 = i2;
                    a2 = i5;
                    i17 = 1;
                    i15 = 0;
                }
            }
            i2 = i19;
            n40Var = null;
            if (n40Var != null) {
                if (n40Var.a() > 0) {
                    int i35 = n40Var.d;
                    int i36 = n40Var.b;
                    int i37 = i35 - i36;
                    int i38 = n40Var.c;
                    int i39 = n40Var.f664a;
                    int i40 = i38 - i39;
                    arrayList.add(i37 != i40 ? n40Var.e ? new j40(i39, i36, n40Var.a()) : i37 > i40 ? new j40(i39, i36 + 1, n40Var.a()) : new j40(i39 + 1, i36, n40Var.a()) : new j40(i39, i36, i40));
                }
                if (arrayList3.isEmpty()) {
                    m40Var = new m40();
                    i3 = 1;
                } else {
                    i3 = 1;
                    m40Var = (m40) arrayList3.remove(arrayList3.size() - 1);
                }
                m40Var.f618a = m40Var3.f618a;
                m40Var.c = m40Var3.c;
                m40Var.b = n40Var.f664a;
                m40Var.d = n40Var.b;
                arrayList2.add(m40Var);
                m40Var3.b = m40Var3.b;
                m40Var3.d = m40Var3.d;
                m40Var3.f618a = n40Var.c;
                m40Var3.c = n40Var.d;
                arrayList2.add(m40Var3);
            } else {
                i3 = 1;
                arrayList3.add(m40Var3);
            }
            i19 = i2;
            i17 = i3;
            i15 = 0;
        }
        Collections.sort(arrayList, f627a);
        return new k40(xc1Var, arrayList, iArr, iArr2);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static String f(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "kotlin.Double.Companion";
                }
                return null;
            case -2056817302:
                if (!str.equals("java.lang.Integer")) {
                    return null;
                }
                return nyGJ.lwrFumpYvYYoVv;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals(CDsMEtnUjndKau.Cgi)) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return CDsMEtnUjndKau.GalJRUhIRidQzz;
                }
                return null;
            case -527879800:
                if (!str.equals("java.lang.Float")) {
                    return null;
                }
                return oWuW.mxgWDbUr;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return nTAZxGMqQtZZAQ.yBhaVY;
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return RIhTGWkqQvGL.WSBOXNNIbx;
                }
                return null;
            case 104431:
                if (!str.equals(gXdyRQCGVlHW.oKGBO)) {
                    return null;
                }
                return nyGJ.lwrFumpYvYYoVv;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (!str.equals("boolean")) {
                    return null;
                }
                return yttXLrAeLjN.mslHyksjpaJ;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (!str.equals("float")) {
                    return null;
                }
                return oWuW.mxgWDbUr;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (!str.equals("java.lang.Boolean")) {
                    return null;
                }
                return yttXLrAeLjN.mslHyksjpaJ;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals(nTAZxGMqQtZZAQ.rYXq)) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals(RIhTGWkqQvGL.IeONl)) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals(CGvJMCDBOmCdj.FUVcdl)) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals(BFtDZYxPcpGN.ISEvXwP)) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return yFbVsaLCWAtQC.ayJoBaWx;
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals(MiGPiFgcCQCVh.IokLvsAyreolxy)) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return XmJDY.QlK;
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return QCeVODiUkb.MBJEQRzcrxEMG;
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return YSHrxiHkAFcciU.WojKuyQDWmBKONA;
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return qJTtDWNCVUDjB.gtkNF;
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static int g(Context context, float f2, float f3, float f4, int i2) {
        if (!Float.isNaN(f4) && f4 > 0.0f && f2 >= f4) {
            try {
                return context.obtainStyledAttributes(new int[]{R.attr.dashboard_red}).getColor(0, i2);
            } finally {
            }
        }
        if (Float.isNaN(f3) || f3 <= 0.0f || f2 < f3) {
            return i2;
        }
        try {
            return context.obtainStyledAttributes(new int[]{R.attr.dashboard_yellow}).getColor(0, i2);
        } finally {
        }
    }

    public static final long h(long j2) {
        long j3 = (j2 << 1) + 1;
        u60.g.getClass();
        int i2 = v60.f1072a;
        return j3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0055, code lost:
    
        if (defpackage.do1.i() != false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i(final defpackage.a5 r6) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md2.i(a5):void");
    }

    public static boolean j(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static String k() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new URL("https://api.ipify.org").openConnection().getInputStream()));
            try {
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                return readLine;
            } finally {
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public static final int m(r9 r9Var, Object obj, int i2) {
        int i3 = r9Var.i;
        if (i3 == 0) {
            return -1;
        }
        try {
            int h2 = k32.h(i3, i2, r9Var.g);
            if (h2 < 0 || ym0.b(obj, r9Var.h[h2])) {
                return h2;
            }
            int i4 = h2 + 1;
            while (i4 < i3 && r9Var.g[i4] == i2) {
                if (ym0.b(obj, r9Var.h[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = h2 - 1; i5 >= 0 && r9Var.g[i5] == i2; i5--) {
                if (ym0.b(obj, r9Var.h[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static Typeface n(Configuration configuration, Typeface typeface) {
        int i2;
        int i3;
        int weight;
        int i4;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i2 = configuration.fontWeightAdjustment;
        if (i2 == Integer.MAX_VALUE) {
            return null;
        }
        i3 = configuration.fontWeightAdjustment;
        if (i3 == 0 || typeface == null) {
            return null;
        }
        weight = typeface.getWeight();
        i4 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, pr.k(i4 + weight, 1, 1000), typeface.isItalic());
        return create;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0118 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27, types: [android.content.res.TypedArray] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.uc0 o(android.content.res.XmlResourceParser r26, android.content.res.Resources r27) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.md2.o(android.content.res.XmlResourceParser, android.content.res.Resources):uc0");
    }

    public static List p(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static TypedValue q(Resources.Theme theme, int i2) {
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean r(Context context, int i2, boolean z) {
        return s(context.getTheme(), i2, z);
    }

    public static boolean s(Resources.Theme theme, int i2, boolean z) {
        TypedValue q = q(theme, i2);
        return (q == null || q.type != 18) ? z : q.data != 0;
    }

    public static int t(Context context) {
        Resources.Theme theme = context.getTheme();
        TypedValue q = q(theme, R.attr.minTouchTargetSize);
        float dimension = (q == null || q.type != 5) ? Float.NaN : q.getDimension(theme.getResources().getDisplayMetrics());
        return Float.isNaN(dimension) ? (int) context.getResources().getDimension(R.dimen.mtrl_min_touch_target_size) : (int) dimension;
    }

    public static TypedValue u(int i2, Context context, String str) {
        TypedValue q = q(context.getTheme(), i2);
        if (q != null) {
            return q;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static TypedValue v(View view, int i2) {
        return u(i2, view.getContext(), view.getClass().getCanonicalName());
    }

    public static final int w(pl1 pl1Var, int i2) {
        int i3;
        int[] iArr = pl1Var.l;
        int i4 = i2 + 1;
        int length = pl1Var.k.length;
        iArr.getClass();
        int i5 = length - 1;
        int i6 = 0;
        while (true) {
            if (i6 <= i5) {
                i3 = (i6 + i5) >>> 1;
                int i7 = iArr[i3];
                if (i7 >= i4) {
                    if (i7 <= i4) {
                        break;
                    }
                    i5 = i3 - 1;
                } else {
                    i6 = i3 + 1;
                }
            } else {
                i3 = (-i6) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static String y(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals(nTAZxGMqQtZZAQ.exXwYxgToD)) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals(Gvyagftz.VJMX)) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals(IGQCApxXGMWo.KKBe)) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (!str.equals("long")) {
                    return null;
                }
                break;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (!str.equals("java.lang.Long")) {
                    return null;
                }
                break;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return CGvJMCDBOmCdj.HmLNWpgs;
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals(BIxeFreLLop.BhuXARtOKx)) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals(gXdyRQCGVlHW.yMgHGkBrmc)) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return BIxeFreLLop.oSJjXncS;
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
        return RIhTGWkqQvGL.zVLvsqk;
    }

    public static void z(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i2++;
            } else if (next == 3) {
                i2--;
            }
        }
    }

    public float l(View view) {
        float transitionAlpha;
        if (j) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
        return view.getAlpha();
    }

    public void x(View view, float f2) {
        if (j) {
            try {
                view.setTransitionAlpha(f2);
                return;
            } catch (NoSuchMethodError unused) {
                j = false;
            }
        }
        view.setAlpha(f2);
    }
}
