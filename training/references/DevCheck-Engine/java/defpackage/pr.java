package defpackage;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.work.impl.WorkDatabase;
import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import flar2.devcheck.cputimes.Sd.tEegR;
import flar2.devcheck.nativebridge.xm.oWuW;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import org.apache.commons.logging.impl.SimpleLog;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class pr {

    /* renamed from: a, reason: collision with root package name */
    public static volatile HashMap f804a;
    public static final Object b = new Object();
    public static final double[][] c = {new double[]{0.001200833568784504d, 0.002389694492170889d, 2.795742885861124E-4d}, new double[]{5.891086651375999E-4d, 0.0029785502573438758d, 3.270666104008398E-4d}, new double[]{1.0146692491640572E-4d, 5.364214359186694E-4d, 0.0032979401770712076d}};
    public static final double[][] d = {new double[]{1373.2198709594231d, -1100.4251190754821d, -7.278681089101213d}, new double[]{-271.815969077903d, 559.6580465940733d, -32.46047482791194d}, new double[]{1.9622899599665666d, -57.173814538844006d, 308.7233197812385d}};
    public static final double[] e = {0.2126d, 0.7152d, 0.0722d};
    public static final double[] f = {0.015176349177441876d, 0.045529047532325624d, 0.07588174588720938d, 0.10623444424209313d, 0.13658714259697685d, 0.16693984095186062d, 0.19729253930674434d, 0.2276452376616281d, 0.2579979360165119d, 0.28835063437139563d, 0.3188300904430532d, 0.350925934958123d, 0.3848314933096426d, 0.42057480301049466d, 0.458183274052838d, 0.4976837250274023d, 0.5391024159806381d, 0.5824650784040898d, 0.6277969426914107d, 0.6751227633498623d, 0.7244668422128921d, 0.775853049866786d, 0.829304845476233d, 0.8848452951698498d, 0.942497089126609d, 1.0022825574869039d, 1.0642236851973577d, 1.1283421258858297d, 1.1946592148522128d, 1.2631959812511864d, 1.3339731595349034d, 1.407011200216447d, 1.4823302800086415d, 1.5599503113873272d, 1.6398909516233677d, 1.7221716113234105d, 1.8068114625156377d, 1.8938294463134073d, 1.9832442801866852d, 2.075074464868551d, 2.1693382909216234d, 2.2660538449872063d, 2.36523901573795d, 2.4669114995532007d, 2.5710888059345764d, 2.6777882626779785d, 2.7870270208169257d, 2.898822059350997d, 3.0131901897720907d, 3.1301480604002863d, 3.2497121605402226d, 3.3718988244681087d, 3.4967242352587946d, 3.624204428461639d, 3.754355295633311d, 3.887192587735158d, 4.022731918402185d, 4.160988767090289d, 4.301978482107941d, 4.445716283538092d, 4.592217266055746d, 4.741496401646282d, 4.893568542229298d, 5.048448422192488d, 5.20615066083972d, 5.3666897647573375d, 5.5300801301023865d, 5.696336044816294d, 5.865471690767354d, 6.037501145825082d, 6.212438385869475d, 6.390297286737924d, 6.571091626112461d, 6.7548350853498045d, 6.941541251256611d, 7.131223617812143d, 7.323895587840543d, 7.5195704746346665d, 7.7182615035334345d, 7.919981813454504d, 8.124744458384042d, 8.332562408825165d, 8.543448553206703d, 8.757415699253682d, 8.974476575321063d, 9.194643831691977d, 9.417930041841839d, 9.644347703669503d, 9.873909240696694d, 10.106627003236781d, 10.342513269534024d, 10.58158024687427d, 10.8238400726681d, 11.069304815507364d, 11.317986476196008d, 11.569896988756009d, 11.825048221409341d, 12.083451977536606d, 12.345119996613247d, 12.610063955123938d, 12.878295467455942d, 13.149826086772048d, 13.42466730586372d, 13.702830557985108d, 13.984327217668513d, 14.269168601521828d, 14.55736596900856d, 14.848930523210871d, 15.143873411576273d, 15.44220572664832d, 15.743938506781891d, 16.04908273684337d, 16.35764934889634d, 16.66964922287304d, 16.985093187232053d, 17.30399201960269d, 17.62635644741625d, 17.95219714852476d, 18.281524751807332d, 18.614349837764564d, 18.95068293910138d, 19.290534541298456d, 19.633915083172692d, 19.98083495742689d, 20.331304511189067d, 20.685334046541502d, 21.042933821039977d, 21.404114048223256d, 21.76888489811322d, 22.137256497705877d, 22.50923893145328d, 22.884842241736916d, 23.264076429332462d, 23.6469514538663d, 24.033477234264016d, 24.42366364919083d, 24.817520537484558d, 25.21505769858089d, 25.61628489293138d, 26.021211842414342d, 26.429848230738664d, 26.842203703840827d, 27.258287870275353d, 27.678110301598522d, 28.10168053274597d, 28.529008062403893d, 28.96010235337422d, 29.39497283293396d, 29.83362889318845d, 30.276079891419332d, 30.722335150426627d, 31.172403958865512d, 31.62629557157785d, 32.08401920991837d, 32.54558406207592d, 33.010999283389665d, 33.4802739966603d, 33.953417292456834d, 34.430438229418264d, 34.911345834551085d, 35.39614910352207d, 35.88485700094671d, 36.37747846067349d, 36.87402238606382d, 37.37449765026789d, 37.87891309649659d, 38.38727753828926d, 38.89959975977785d, 39.41588851594697d, 39.93615253289054d, 40.460400508064545d, 40.98864111053629d, 41.520882981230194d, 42.05713473317016d, 42.597404951718396d, 43.141702194811224d, 43.6900349931913d, 44.24241185063697d, 44.798841244188324d, 45.35933162437017d, 45.92389141541209d, 46.49252901546552d, 47.065252796817916d, 47.64207110610409d, 48.22299226451468d, 48.808024568002054d, 49.3971762874833d, 49.9904556690408d, 50.587870934119984d, 51.189430279724725d, 51.79514187861014d, 52.40501387947288d, 53.0190544071392d, 53.637271562750364d, 54.259673423945976d, 54.88626804504493d, 55.517063457223934d, 56.15206766869424d, 56.79128866487574d, 57.43473440856916d, 58.08241284012621d, 58.734331877617365d, 59.39049941699807d, 60.05092333227251d, 60.715611475655585d, 61.38457167773311d, 62.057811747619894d, 62.7353394731159d, 63.417162620860914d, 64.10328893648692d, 64.79372614476921d, 65.48848194977529d, 66.18756403501224d, 66.89098006357258d, 67.59873767827808d, 68.31084450182222d, 69.02730813691093d, 69.74813616640164d, 70.47333615344107d, 71.20291564160104d, 71.93688215501312d, 72.67524319850172d, 73.41800625771542d, 74.16517879925733d, 74.9167682708136d, 75.67278210128072d, 76.43322770089146d, 77.1981124613393d, 77.96744375590167d, 78.74122893956174d, 79.51947534912904d, 80.30219030335869d, 81.08938110306934d, 81.88105503125999d, 82.67721935322541d, 83.4778813166706d, 84.28304815182372d, 85.09272707154808d, 85.90692527145302d, 86.72564993000343d, 87.54890820862819d, 88.3767072518277d, 89.2090541872801d, 90.04595612594655d, 90.88742016217518d, 91.73345337380438d, 92.58406282226491d, 93.43925555268066d, 94.29903859396902d, 95.16341895893969d, 96.03240364439274d, 96.9059996312159d, 97.78421388448044d, 98.6670533535366d, 99.55452497210776d};
    public static final ly1[] g = {ly1.g, ly1.h, ly1.i, ly1.l, ly1.m};
    public static Context h;
    public static Field i;
    public static boolean j;
    public static Class k;
    public static boolean l;
    public static Field m;
    public static boolean n;
    public static Field o;
    public static boolean p;

    public static double A(double[] dArr) {
        double[] x = c3.x(dArr, c);
        double i2 = i(x[0]);
        double i3 = i(x[1]);
        double i4 = i(x[2]);
        return Math.atan2(((i2 + i3) - (i4 * 2.0d)) / 9.0d, ((((-12.0d) * i3) + (i2 * 11.0d)) + i4) / 11.0d);
    }

    public static double B(double d2) {
        double abs = Math.abs(d2);
        return Math.pow(Math.max(0.0d, (27.13d * abs) / (400.0d - abs)), 2.380952380952381d) * (d2 < 0.0d ? -1 : d2 == 0.0d ? 0 : 1);
    }

    public static boolean C(double d2) {
        return 0.0d <= d2 && d2 <= 100.0d;
    }

    public static dg D(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("devcheck_battery_schema", 0);
        String str = tEegR.xxyAoQ;
        dg dgVar = null;
        String string = sharedPreferences.getString(str, null);
        if (string != null) {
            try {
                dgVar = dg.a(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        if (dgVar != null && dgVar.f190a == 1 && TextUtils.equals(dgVar.b, Build.FINGERPRINT) && dgVar.c == Build.VERSION.SDK_INT) {
            return dgVar;
        }
        dg dgVar2 = new dg();
        dgVar2.f190a = 1;
        dgVar2.b = Build.FINGERPRINT;
        dgVar2.c = Build.VERSION.SDK_INT;
        Float O = O(context);
        dgVar2.d = O != null && O.floatValue() >= 5.0f && O.floatValue() <= 60.0f;
        SharedPreferences.Editor edit = context.getSharedPreferences("devcheck_battery_schema", 0).edit();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("schemaVersion", dgVar2.f190a);
            jSONObject.put("deviceFingerprint", dgVar2.b);
            jSONObject.put("sdkInt", dgVar2.c);
            jSONObject.put("hasBatteryTemp", dgVar2.d);
        } catch (JSONException unused2) {
        }
        edit.putString(str, jSONObject.toString()).apply();
        return dgVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0064 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x057e  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:274:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x054e  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ny1 E(android.content.Context r27, defpackage.my1 r28) {
        /*
            Method dump skipped, instructions count: 1852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr.E(android.content.Context, my1):ny1");
    }

    public static String F(String str) {
        if (str == null || str.equals("default")) {
            return "";
        }
        switch (str) {
            case "pt_BR":
                return "pt-BR";
            case "sl_SI":
                return "sl-SI";
            case "zh_CN":
                return oWuW.oYwOBRiqpymMMTm;
            case "zh_TW":
                return "zh-TW";
            default:
                return str;
        }
    }

    public static int G(float f2, float f3, float f4) {
        if (f4 <= 0.0f || f2 < f4) {
            return (f3 <= 0.0f || f2 < f3) ? 1 : 2;
        }
        return 3;
    }

    public static String H(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            c.m("Invalid input received");
            return null;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(str.charAt(i2));
            if (str2.length() > i2) {
                sb.append(str2.charAt(i2));
            }
        }
        return sb.toString();
    }

    public static String I(Context context) {
        String opPackageName;
        String str = context.getApplicationContext().getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (h(context, str) == 0) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            StringBuilder sb = new StringBuilder();
            opPackageName = context.getOpPackageName();
            sb.append(opPackageName);
            sb.append(".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION");
            str = sb.toString();
            if (h(context, str) == 0) {
                return str;
            }
        }
        c.o(d51.y("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
        return null;
    }

    public static synchronized Map J(boolean z) {
        synchronized (pr.class) {
            if (!z) {
                if (f804a != null) {
                    return f804a;
                }
            }
            HashMap hashMap = new HashMap();
            try {
                int k0 = uz1.k0();
                HashMap y = ju0.y();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int i2 = 0;
                for (int i3 = 0; i3 < k0; i3++) {
                    if (uz1.q("/sys/devices/system/cpu/cpufreq/policy" + i3)) {
                        arrayList3.add(Integer.valueOf(i3));
                    }
                }
                if (!arrayList3.isEmpty()) {
                    for (int i4 = 0; i4 < arrayList3.size(); i4++) {
                        ArrayList arrayList4 = new ArrayList();
                        if (i4 == arrayList3.size() - 1) {
                            for (int intValue = ((Integer) arrayList3.get(i4)).intValue(); intValue < k0; intValue++) {
                                arrayList4.add(Integer.valueOf(intValue));
                            }
                        } else {
                            for (int intValue2 = ((Integer) arrayList3.get(i4)).intValue(); intValue2 < ((Integer) arrayList3.get(i4 + 1)).intValue(); intValue2++) {
                                arrayList4.add(Integer.valueOf(intValue2));
                            }
                        }
                        arrayList2.add(arrayList4);
                    }
                }
                int i5 = 0;
                while (i5 < k0) {
                    pm pmVar = new pm();
                    pmVar.f797a = i5;
                    a61 I = ju0.I(i5);
                    pmVar.e = (String) I.f11a;
                    pmVar.f = (String) I.b;
                    k91 k91Var = (k91) y.get(Integer.valueOf(i5));
                    if (k91Var != null) {
                        pmVar.b = k91Var.i;
                        pmVar.d = k91Var.h;
                    } else {
                        pmVar.b = "NA";
                    }
                    if (arrayList2.isEmpty()) {
                        String K = uz1.K("/sys/devices/system/cpu/cpu" + i5 + "/topology/core_siblings_list");
                        pmVar.c = K;
                        if (K.equals("NA")) {
                            String K2 = uz1.K("/sys/devices/system/cpu/cpu" + i5 + "/cpufreq/related_cpus");
                            pmVar.c = K2;
                            if (!K2.equals("NA")) {
                                try {
                                    String[] split = pmVar.c.split(" ");
                                    int length = split.length;
                                    for (int i6 = i2; i6 < length; i6++) {
                                        pmVar.g.add(Integer.valueOf(Integer.parseInt(split[i6])));
                                    }
                                } catch (Exception unused) {
                                    pmVar.c = "NA";
                                    pmVar.g = null;
                                }
                            }
                        } else {
                            try {
                                if (pmVar.c.length() == 1) {
                                    pmVar.g.add(Integer.valueOf(Integer.parseInt(pmVar.c)));
                                } else {
                                    String substring = pmVar.c.substring(i2, 1);
                                    String str = pmVar.c;
                                    String substring2 = str.substring(str.length() - 2, pmVar.c.length() - 1);
                                    for (int parseInt = Integer.parseInt(substring); parseInt <= Integer.parseInt(substring2); parseInt++) {
                                        pmVar.g.add(Integer.valueOf(parseInt));
                                    }
                                }
                            } catch (Exception unused2) {
                                pmVar.c = "NA";
                                pmVar.g = null;
                            }
                        }
                    } else {
                        int size = arrayList2.size();
                        int i7 = i2;
                        while (true) {
                            if (i7 < size) {
                                Object obj = arrayList2.get(i7);
                                i7++;
                                List list = (List) obj;
                                if (list.contains(Integer.valueOf(i5))) {
                                    pmVar.g = list;
                                    break;
                                }
                            }
                        }
                    }
                    arrayList.add(pmVar);
                    i5++;
                    i2 = 0;
                }
                if (arrayList2.isEmpty() || arrayList2.size() <= 1) {
                    TreeSet treeSet = new TreeSet(new c4(3));
                    treeSet.addAll(arrayList);
                    ArrayList arrayList5 = new ArrayList(treeSet);
                    for (int i8 = 0; i8 < arrayList5.size(); i8++) {
                        ArrayList arrayList6 = new ArrayList();
                        if (!((pm) arrayList5.get(i8)).f.equals("NA")) {
                            if (i8 == arrayList5.size() - 1) {
                                for (int i9 = ((pm) arrayList5.get(i8)).f797a; i9 < k0; i9++) {
                                    arrayList6.add(Integer.valueOf(i9));
                                }
                            } else {
                                for (int i10 = ((pm) arrayList5.get(i8)).f797a; i10 < ((pm) arrayList5.get(i8 + 1)).f797a; i10++) {
                                    arrayList6.add(Integer.valueOf(i10));
                                }
                            }
                            arrayList2.add(arrayList6);
                        }
                    }
                    int i11 = 0;
                    while (i11 < arrayList2.size()) {
                        or orVar = new or();
                        orVar.f754a = (List) arrayList2.get(i11);
                        HashSet hashSet = new HashSet();
                        Iterator it = orVar.f754a.iterator();
                        while (it.hasNext()) {
                            pm pmVar2 = (pm) arrayList.get(((Integer) it.next()).intValue());
                            String str2 = pmVar2.f;
                            if (str2 != null && !str2.equals("NA")) {
                                orVar.e = pmVar2.f;
                            }
                            String str3 = pmVar2.e;
                            if (str3 != null && !str3.equals("NA")) {
                                orVar.d = pmVar2.e;
                            }
                            String str4 = pmVar2.b;
                            if (str4 != null && !str4.equals("NA")) {
                                hashSet.add(pmVar2.b);
                                Integer num = (Integer) orVar.f.get(pmVar2.b);
                                orVar.f.put(pmVar2.b, Integer.valueOf(num == null ? 1 : num.intValue() + 1));
                            }
                            orVar.b.add(pmVar2);
                        }
                        orVar.c = hashSet.toString().replace("[", YHJbtPFAANaPQ.iJsM).replace("]", "");
                        i11++;
                        hashMap.put(Integer.valueOf(i11), orVar);
                    }
                } else {
                    int i12 = 0;
                    while (i12 < arrayList2.size()) {
                        or orVar2 = new or();
                        orVar2.f754a = (List) arrayList2.get(i12);
                        HashSet hashSet2 = new HashSet();
                        Iterator it2 = ((List) arrayList2.get(i12)).iterator();
                        while (it2.hasNext()) {
                            pm pmVar3 = (pm) arrayList.get(((Integer) it2.next()).intValue());
                            String str5 = pmVar3.f;
                            if (str5 != null && !str5.equals("NA")) {
                                orVar2.e = pmVar3.f;
                            }
                            String str6 = pmVar3.e;
                            if (str6 != null && !str6.equals("NA")) {
                                orVar2.d = pmVar3.e;
                            }
                            String str7 = pmVar3.b;
                            if (str7 != null && !str7.equals("NA")) {
                                hashSet2.add(pmVar3.b);
                                Integer num2 = (Integer) orVar2.f.get(pmVar3.b);
                                orVar2.f.put(pmVar3.b, Integer.valueOf(num2 == null ? 1 : num2.intValue() + 1));
                            }
                            orVar2.b.add(pmVar3);
                        }
                        orVar2.c = hashSet2.toString().replace("[", "").replace("]", "");
                        i12++;
                        hashMap.put(Integer.valueOf(i12), orVar2);
                    }
                }
                try {
                    if (hashMap.size() == 2 && Integer.parseInt(((or) hashMap.get(2)).e) < Integer.parseInt(((or) hashMap.get(1)).e)) {
                        ((or) hashMap.get(1)).g = true;
                    }
                } catch (Exception unused3) {
                }
                f804a = hashMap;
                return hashMap;
            } catch (Exception unused4) {
                return new HashMap();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r5 != null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void K(android.content.Context r5, java.lang.String r6) {
        /*
            java.lang.Object r0 = defpackage.pr.b
            monitor-enter(r0)
            java.lang.String r1 = ""
            boolean r1 = r6.equals(r1)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.lang.String r6 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r5.deleteFile(r6)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r5 = move-exception
            goto L52
        L14:
            r1 = 0
            java.lang.String r1 = com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB.bmDmyzzxPyj     // Catch: java.lang.Throwable -> L12 java.io.FileNotFoundException -> L50
            r2 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r1, r2)     // Catch: java.lang.Throwable -> L12 java.io.FileNotFoundException -> L50
            org.xmlpull.v1.XmlSerializer r1 = android.util.Xml.newSerializer()     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r1.setOutput(r5, r2)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L4b
            java.lang.String r3 = "UTF-8"
            java.lang.Boolean r4 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L4b
            r1.startDocument(r3, r4)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L4b
            java.lang.String r3 = "locales"
            r1.startTag(r2, r3)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L4b
            java.lang.String r3 = "application_locales"
            r1.attribute(r2, r3, r6)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L4b
            r6 = 0
            java.lang.String r6 = androidx.emoji2.text.Fk.Iyrs.WcvewD     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L4b
            r1.endTag(r2, r6)     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L4b
            r1.endDocument()     // Catch: java.lang.Throwable -> L44 java.lang.Exception -> L4b
            if (r5 == 0) goto L4e
        L40:
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L4e
            goto L4e
        L44:
            r6 = move-exception
            if (r5 == 0) goto L4a
            r5.close()     // Catch: java.lang.Throwable -> L12 java.io.IOException -> L4a
        L4a:
            throw r6     // Catch: java.lang.Throwable -> L12
        L4b:
            if (r5 == 0) goto L4e
            goto L40
        L4e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L51
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
        L51:
            return
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr.K(android.content.Context, java.lang.String):void");
    }

    public static String L(CameraManager cameraManager) {
        long j2;
        String str;
        long j3;
        try {
            long j4 = -1;
            String str2 = null;
            for (String str3 : cameraManager.getCameraIdList()) {
                CameraCharacteristics cameraCharacteristics = cameraManager.getCameraCharacteristics(str3);
                Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING);
                if (num != null) {
                    boolean z = true;
                    if (num.intValue() == 1) {
                        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
                        try {
                            if (iArr != null) {
                                for (int i2 : iArr) {
                                    str = null;
                                    if (i2 != 11) {
                                    }
                                    break;
                                }
                            }
                            break;
                            if (((Size) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE)) != null) {
                                j2 = j4;
                                j3 = r0.getWidth() * r0.getHeight();
                            } else {
                                j2 = j4;
                                j3 = 0;
                            }
                            long j5 = j3 + (z ? 0L : 10000000L);
                            if (j5 > j2) {
                                str2 = str3;
                                j4 = j5;
                            }
                            j4 = j2;
                        } catch (Exception unused) {
                            return str;
                        }
                        str = null;
                        z = false;
                    }
                }
                j2 = j4;
                j4 = j2;
            }
            return str2;
        } catch (Exception unused2) {
            return null;
        }
    }

    public static lk1 M(Context context, dn dnVar) {
        double d2;
        double Q;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        arrayList.add(new ry(0));
        arrayList.add(new ry(2));
        arrayList.add(new y40(context.getApplicationContext()));
        arrayList.add(new ry(1));
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            for (os1 os1Var : ((mg) obj).b()) {
                hashMap.put(os1Var.getId(), os1Var);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = dnVar.g;
        int size2 = arrayList4.size();
        while (i2 < size2) {
            Object obj2 = arrayList4.get(i2);
            i2++;
            cn cnVar = (cn) obj2;
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            for (ps1 ps1Var : cnVar.c) {
                os1 os1Var2 = (os1) hashMap.get(ps1Var.f807a);
                double c2 = os1Var2 != null ? os1Var2.c() : 0.0d;
                boolean a2 = ps1Var.a();
                if (a2) {
                    d2 = 0.0d;
                    Q = 0.0d;
                } else {
                    d2 = 0.0d;
                    Q = sl.Q(ps1Var.f, c2, ps1Var.d);
                }
                HashMap hashMap2 = hashMap;
                int i4 = i2;
                arrayList5.add(new nk1(ps1Var.f807a, ps1Var.b, ps1Var.c, ps1Var.f, a2, Q, ps1Var.j));
                if (!a2 && Q > d2) {
                    arrayList6.add(Double.valueOf(Q));
                    arrayList3.add(Double.valueOf(Q));
                }
                hashMap = hashMap2;
                i2 = i4;
            }
            arrayList2.add(new mk1(cnVar.f130a, cnVar.b, o(arrayList6), arrayList5));
        }
        return new lk1(o(arrayList3), arrayList2);
    }

    public static String N(String str) {
        if (str == null) {
            return "";
        }
        String upperCase = str.toUpperCase();
        return upperCase.startsWith("IMX") ? "Sony ".concat(upperCase) : upperCase.startsWith("S5K") ? "Samsung ".concat(upperCase) : upperCase.startsWith(XmJDY.TRmYZrAJOSxDAF) ? "OmniVision ".concat(upperCase) : upperCase.startsWith("GC") ? "GalaxyCore ".concat(upperCase) : upperCase.startsWith("HI") ? "Himax ".concat(upperCase) : upperCase;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0018, code lost:
    
        if (r4 != 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Float O(android.content.Context r4) {
        /*
            r0 = 0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            android.content.IntentFilter r2 = new android.content.IntentFilter     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = "android.intent.action.BATTERY_CHANGED"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1b
            android.content.Intent r4 = r4.registerReceiver(r0, r2)     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L1b
            java.lang.String r2 = "temperature"
            int r4 = r4.getIntExtra(r2, r1)     // Catch: java.lang.Throwable -> L1b
            if (r4 == r1) goto L1b
            if (r4 == 0) goto L1b
            goto L1c
        L1b:
            r4 = r1
        L1c:
            if (r4 != r1) goto L1f
            return r0
        L1f:
            float r4 = (float) r4
            r1 = 1092616192(0x41200000, float:10.0)
            float r4 = r4 / r1
            r1 = 1084227584(0x40a00000, float:5.0)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 < 0) goto L35
            r1 = 1114636288(0x42700000, float:60.0)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L30
            goto L35
        L30:
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            return r4
        L35:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr.O(android.content.Context):java.lang.Float");
    }

    public static List P(ny1 ny1Var, my1 my1Var) {
        ArrayList arrayList;
        if (ny1Var == null || (arrayList = ny1Var.g) == null || arrayList.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        String a2 = my1Var.a();
        if (TextUtils.isEmpty(a2)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList Y = sl.Y(a2);
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = ny1Var.g;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            hy1 hy1Var = (hy1) obj;
            hashMap.put(hy1Var.b + ":" + hy1Var.f406a, hy1Var);
        }
        ArrayList arrayList3 = new ArrayList();
        int size2 = Y.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = Y.get(i3);
            i3++;
            jy1 jy1Var = (jy1) obj2;
            hy1 hy1Var2 = (hy1) hashMap.get(jy1Var.b + ":" + jy1Var.c);
            if (hy1Var2 != null && hy1Var2.j) {
                float f2 = jy1Var.f503a;
                if (f2 >= 7.0f && f2 <= 120.0f) {
                    oy1 oy1Var = new oy1();
                    oy1Var.f768a = hy1Var2.c;
                    oy1Var.b = hy1Var2.f406a;
                    oy1Var.d = hy1Var2.d;
                    oy1Var.e = hy1Var2.e;
                    oy1Var.c = hy1Var2.b;
                    oy1Var.f = f2;
                    oy1Var.g = hy1Var2.f;
                    float f3 = hy1Var2.g;
                    oy1Var.h = f3;
                    float f4 = hy1Var2.h;
                    oy1Var.i = f4;
                    oy1Var.j = hy1Var2.i;
                    oy1Var.k = f3 <= f4 ? 0.0f : (Math.max(f4, Math.min(f3, f2)) - f4) / (f3 - f4);
                    float f5 = jy1Var.f503a;
                    oy1Var.l = f5 >= hy1Var2.g ? 2 : f5 >= hy1Var2.f ? 1 : 0;
                    arrayList3.add(oy1Var);
                }
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r2 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002e, code lost:
    
        if (r5 != 4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003b, code lost:
    
        if (r3.getName().equals("locales") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String Q(android.content.Context r8) {
        /*
            java.lang.Object r0 = defpackage.pr.b
            monitor-enter(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.io.FileInputStream r2 = r8.openFileInput(r2)     // Catch: java.lang.Throwable -> L4a java.io.FileNotFoundException -> L63
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
        L18:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            r6 = 1
            if (r5 == r6) goto L44
            r6 = 3
            if (r5 != r6) goto L2b
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            if (r7 <= r4) goto L44
            goto L2b
        L29:
            r8 = move-exception
            goto L4c
        L2b:
            if (r5 == r6) goto L18
            r6 = 4
            if (r5 != r6) goto L31
            goto L18
        L31:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
            if (r5 == 0) goto L18
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L29 java.lang.Throwable -> L52
        L44:
            if (r2 == 0) goto L55
        L46:
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L55
            goto L55
        L4a:
            r8 = move-exception
            goto L65
        L4c:
            if (r2 == 0) goto L51
            r2.close()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L51
        L51:
            throw r8     // Catch: java.lang.Throwable -> L4a
        L52:
            if (r2 == 0) goto L55
            goto L46
        L55:
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L4a
            if (r2 != 0) goto L5c
            goto L61
        L5c:
            java.lang.String r2 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            r8.deleteFile(r2)     // Catch: java.lang.Throwable -> L4a
        L61:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L63:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            return r1
        L65:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4a
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr.Q(android.content.Context):java.lang.String");
    }

    public static void R(Activity activity, String[] strArr, int i2) {
        HashSet hashSet = new HashSet();
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (TextUtils.isEmpty(strArr[i3])) {
                c.m(d51.u(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
                return;
            }
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i3], "android.permission.POST_NOTIFICATIONS")) {
                hashSet.add(Integer.valueOf(i3));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[strArr.length - size] : strArr;
        if (size > 0) {
            if (size == strArr.length) {
                return;
            }
            int i4 = 0;
            for (int i5 = 0; i5 < strArr.length; i5++) {
                if (!hashSet.contains(Integer.valueOf(i5))) {
                    strArr2[i4] = strArr[i5];
                    i4++;
                }
            }
        }
        activity.requestPermissions(strArr, i2);
    }

    public static String S(oy1 oy1Var) {
        String str = oy1Var.b;
        if (str == null) {
            str = "";
        }
        return "sensor:" + oy1Var.c + ":" + str;
    }

    public static void T(String str) {
        rs0 a2 = str.isEmpty() ? rs0.b : rs0.a(str);
        lm1 lm1Var = m5.g;
        Objects.requireNonNull(a2);
        if (Build.VERSION.SDK_INT >= 33) {
            Object c2 = m5.c();
            if (c2 != null) {
                j5.b(c2, i5.a(a2.f904a.f952a.toLanguageTags()));
            }
        } else if (!a2.equals(m5.i)) {
            synchronized (m5.n) {
                m5.i = a2;
                m5.a();
            }
        }
        AtomicReference atomicReference = ts0.f1004a;
        try {
            rs0 b2 = m5.b();
            if (b2 == null) {
                b2 = rs0.b;
            }
            atomicReference.set(b2);
        } catch (Throwable unused) {
            atomicReference.set(rs0.b);
        }
    }

    public static void U(Window window, boolean z) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            w0.e(window, z);
        } else {
            if (i2 >= 30) {
                w0.d(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public static double V(double d2) {
        double d3 = d2 / 100.0d;
        return (d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d;
    }

    public static int W(int i2) {
        return (int) (Integer.rotateLeft((int) (i2 * (-862048943)), 15) * 461845907);
    }

    public static int a(ly1 ly1Var) {
        switch (ly1Var.ordinal()) {
            case 0:
                return 0;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return 1;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return 2;
            case 3:
                return 4;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return 5;
            case 5:
                return 9;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return 10;
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                return 8;
            case 8:
                return 7;
            case rt0.o /* 9 */:
                return 6;
            case 10:
                return 11;
            case 11:
                return 3;
            default:
                return 20;
        }
    }

    public static final ExecutorService b(boolean z) {
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new ku(z));
        newFixedThreadPool.getClass();
        return newFixedThreadPool;
    }

    public static boolean c(double d2, double d3, double d4) {
        return ((d3 - d2) + 25.132741228718345d) % 6.283185307179586d < ((d4 - d2) + 25.132741228718345d) % 6.283185307179586d;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:11|(2:13|14)|15|(2:16|17)|(9:19|20|21|(5:23|24|(1:26)|27|28)|31|24|(0)|27|28)|34|20|21|(0)|31|24|(0)|27|28) */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f A[Catch: Exception -> 0x0044, TRY_LEAVE, TryCatch #4 {Exception -> 0x0044, blocks: (B:17:0x0035, B:19:0x003f), top: B:16:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[Catch: Exception -> 0x0054, TRY_LEAVE, TryCatch #3 {Exception -> 0x0054, blocks: (B:21:0x0045, B:23:0x004f), top: B:20:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String d(android.hardware.camera2.CameraCharacteristics r8) {
        /*
            java.lang.String r0 = "null"
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch: java.lang.Exception -> Lf
            java.lang.Object r1 = r8.get(r1)     // Catch: java.lang.Exception -> Lf
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> Lf
            int r1 = r1.intValue()     // Catch: java.lang.Exception -> Lf
            goto L10
        Lf:
            r1 = -1
        L10:
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE     // Catch: java.lang.Exception -> L19
            java.lang.Object r2 = r8.get(r2)     // Catch: java.lang.Exception -> L19
            android.util.Size r2 = (android.util.Size) r2     // Catch: java.lang.Exception -> L19
            goto L1a
        L19:
            r2 = 0
        L1a:
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE     // Catch: java.lang.Exception -> L2f
            java.lang.Object r4 = r8.get(r4)     // Catch: java.lang.Exception -> L2f
            android.util.SizeF r4 = (android.util.SizeF) r4     // Catch: java.lang.Exception -> L2f
            if (r4 == 0) goto L31
            float r5 = r4.getWidth()     // Catch: java.lang.Exception -> L2f
            float r3 = r4.getHeight()     // Catch: java.lang.Exception -> L33
            goto L33
        L2f:
            r5 = r3
            goto L33
        L31:
            r4 = r3
            goto L35
        L33:
            r4 = r3
            r3 = r5
        L35:
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS     // Catch: java.lang.Exception -> L44
            java.lang.Object r5 = r8.get(r5)     // Catch: java.lang.Exception -> L44
            float[] r5 = (float[]) r5     // Catch: java.lang.Exception -> L44
            if (r5 == 0) goto L44
            java.lang.String r5 = java.util.Arrays.toString(r5)     // Catch: java.lang.Exception -> L44
            goto L45
        L44:
            r5 = r0
        L45:
            android.hardware.camera2.CameraCharacteristics$Key r6 = android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES     // Catch: java.lang.Exception -> L54
            java.lang.Object r8 = r8.get(r6)     // Catch: java.lang.Exception -> L54
            float[] r8 = (float[]) r8     // Catch: java.lang.Exception -> L54
            if (r8 == 0) goto L54
            java.lang.String r8 = java.util.Arrays.toString(r8)     // Catch: java.lang.Exception -> L54
            goto L55
        L54:
            r8 = r0
        L55:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "facing="
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r1 = ";pixelArray="
            r6.append(r1)
            java.lang.String r1 = "x"
            if (r2 == 0) goto L82
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r7 = r2.getWidth()
            r0.append(r7)
            r0.append(r1)
            int r2 = r2.getHeight()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
        L82:
            r6.append(r0)
            r0 = 0
            java.lang.String r0 = flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL.crHJUioxndy
            r6.append(r0)
            r6.append(r3)
            r6.append(r1)
            r6.append(r4)
            java.lang.String r0 = ";focalLengths="
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = ";apertures="
            r6.append(r0)
            r6.append(r8)
            java.lang.String r8 = r6.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr.d(android.hardware.camera2.CameraCharacteristics):java.lang.String");
    }

    public static final void e(WorkDatabase workDatabase, ju juVar, pb2 pb2Var) {
        int i2;
        workDatabase.getClass();
        juVar.getClass();
        ArrayList T = zr.T(pb2Var);
        int i3 = 0;
        while (!T.isEmpty()) {
            List list = ((pb2) es.W(T)).b;
            list.getClass();
            if (list.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it = list.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (!((x41) it.next()).b.j.i.isEmpty() && (i2 = i2 + 1) < 0) {
                        throw new ArithmeticException("Count overflow has happened.");
                    }
                }
            }
            i3 += i2;
        }
        if (i3 == 0) {
            return;
        }
        int intValue = ((Number) tl2.E(workDatabase.C().f528a, true, false, new ub(10))).intValue();
        int i4 = juVar.j;
        if (intValue + i3 <= i4) {
            return;
        }
        StringBuilder sb = new StringBuilder("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ");
        sb.append(i4);
        sb.append(";\nalready enqueued count: ");
        sb.append(intValue);
        sb.append(";\ncurrent enqueue operation count: ");
        c.m(d51.t(sb, i3, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
    }

    public static void f(int i2, HashSet hashSet) {
        try {
            CamcorderProfile camcorderProfile = CamcorderProfile.get(i2);
            if (camcorderProfile.videoFrameRate != 0) {
                hashSet.add(camcorderProfile);
            }
        } catch (Exception unused) {
        }
    }

    public static int g(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : new g31(context).f315a.areNotificationsEnabled() ? 0 : -1;
        }
        jw0.f(tEegR.sjHk);
        return 0;
    }

    public static int h(Context context, String str) {
        int noteProxyOpNoThrow;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) != -1) {
            String permissionToOp = AppOpsManager.permissionToOp(str);
            if (permissionToOp != null) {
                if (packageName == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        packageName = packagesForUid[0];
                    }
                }
                int myUid2 = Process.myUid();
                String packageName2 = context.getPackageName();
                if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                } else if (Build.VERSION.SDK_INT >= 29) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    noteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(permissionToOp, Binder.getCallingUid(), packageName);
                    if (noteProxyOpNoThrow == 0) {
                        noteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(permissionToOp, myUid, b8.a(context)) : 1;
                    }
                } else {
                    noteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, packageName);
                }
                if (noteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    public static double i(double d2) {
        double pow = Math.pow(Math.abs(d2), 0.42d);
        return (((d2 < 0.0d ? -1 : d2 == 0.0d ? 0 : 1) * 400.0d) * pow) / (pow + 27.13d);
    }

    public static float j(float f2, float f3, float f4) {
        return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
    }

    public static int k(int i2, int i3, int i4) {
        return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
    }

    public static final Object l(long j2, nt1 nt1Var) {
        if (j2 > 0) {
            ao aoVar = new ao(1, ju0.T(nt1Var));
            aoVar.x();
            if (j2 < Long.MAX_VALUE) {
                r(aoVar.k).l(j2, aoVar);
            }
            Object v = aoVar.v();
            if (v == zx.g) {
                return v;
            }
        }
        return e42.f219a;
    }

    public static void m(Window window) {
        int i2;
        Objects.requireNonNull(window);
        window.getDecorView();
        U(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = i3 >= 30 ? 3 : 1;
            WindowManager.LayoutParams attributes = window.getAttributes();
            i2 = attributes.layoutInDisplayCutoutMode;
            if (i2 != i4) {
                attributes.layoutInDisplayCutoutMode = i4;
                window.setAttributes(attributes);
            }
        }
        if (i3 >= 29) {
            window.setStatusBarContrastEnforced(false);
            window.setNavigationBarContrastEnforced(false);
        }
    }

    public static String n(double d2) {
        if (!Double.isFinite(d2)) {
            return "—";
        }
        double abs = Math.abs(d2);
        return abs >= 100.0d ? String.format(Locale.getDefault(), "%,.0f", Double.valueOf(d2)) : abs >= 10.0d ? String.format(Locale.getDefault(), "%.1f", Double.valueOf(d2)) : String.format(Locale.getDefault(), "%.2f", Double.valueOf(d2));
    }

    public static double o(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return 0.0d;
        }
        int size = arrayList.size();
        double[] dArr = new double[size];
        for (int i2 = 0; i2 < size; i2++) {
            dArr[i2] = ((Double) arrayList.get(i2)).doubleValue();
        }
        return sl.u(dArr);
    }

    public static ai0 p(SSLSession sSLSession) {
        Object obj;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            c.n("cipherSuite == null");
            return null;
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            rw.f("cipherSuite == ".concat(cipherSuite));
            return null;
        }
        lq i2 = lq.b.i(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            c.n("tlsVersion == null");
            return null;
        }
        if ("NONE".equals(protocol)) {
            rw.f("tlsVersion == NONE");
            return null;
        }
        hz1.h.getClass();
        hz1 j2 = pg0.j(protocol);
        try {
            obj = rd2.j(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            obj = p80.g;
        }
        return new ai0(j2, i2, rd2.j(sSLSession.getLocalCertificates()), new qt(3, obj));
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0047, code lost:
    
        if (r5.c == r8.hashCode()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList q(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            hg1 r1 = new hg1
            r1.<init>(r0, r8)
            java.lang.Object r2 = defpackage.ig1.c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = defpackage.ig1.b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            gg1 r5 = (defpackage.gg1) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Laf
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.f338a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            return r3
        L55:
            java.lang.ThreadLocal r2 = defpackage.ig1.f428a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L7e
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = defpackage.ss.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7e
        L7e:
            if (r4 == 0) goto Laa
            java.lang.Object r2 = defpackage.ig1.c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = defpackage.ig1.b     // Catch: java.lang.Throwable -> L96
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L96
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L96
            if (r3 != 0) goto L98
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L96
            r3.<init>()     // Catch: java.lang.Throwable -> L96
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L96
            goto L98
        L96:
            r8 = move-exception
            goto La8
        L98:
            gg1 r0 = new gg1     // Catch: java.lang.Throwable -> L96
            android.content.res.Resources r1 = r1.f383a     // Catch: java.lang.Throwable -> L96
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L96
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L96
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L96
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L96
            goto Lae
        La8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L96
            throw r8
        Laa:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r9, r8)
        Lae:
            return r4
        Laf:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr.q(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static final q20 r(qx qxVar) {
        ox r = qxVar.r(j70.i);
        q20 q20Var = r instanceof q20 ? (q20) r : null;
        return q20Var == null ? o10.f712a : q20Var;
    }

    public static Drawable s(Context context, int i2) {
        return context.getDrawable(i2);
    }

    public static int t(CameraCharacteristics cameraCharacteristics) {
        Range<Integer>[] highSpeedVideoFpsRanges;
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap == null || (highSpeedVideoFpsRanges = streamConfigurationMap.getHighSpeedVideoFpsRanges()) == null) {
                return -1;
            }
            int i2 = -1;
            for (Range<Integer> range : highSpeedVideoFpsRanges) {
                if (range != null && range.getUpper() != null && range.getUpper().intValue() > i2) {
                    i2 = range.getUpper().intValue();
                }
            }
            return i2;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static int u(CameraCharacteristics cameraCharacteristics) {
        Size[] outputSizes;
        int round;
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap == null || (outputSizes = streamConfigurationMap.getOutputSizes(MediaRecorder.class)) == null) {
                return -1;
            }
            int i2 = -1;
            for (Size size : outputSizes) {
                if (size != null) {
                    long outputMinFrameDuration = streamConfigurationMap.getOutputMinFrameDuration(MediaRecorder.class, size);
                    if (outputMinFrameDuration > 0 && (round = (int) Math.round(1.0E9d / outputMinFrameDuration)) > i2) {
                        i2 = round;
                    }
                }
            }
            return i2;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static int v(CameraCharacteristics cameraCharacteristics) {
        int i2;
        int i3;
        CameraCharacteristics.Key key;
        int[] iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            int length = iArr.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    break;
                }
                if (iArr[i4] != 16) {
                    i4++;
                } else if (Build.VERSION.SDK_INT >= 31) {
                    key = CameraCharacteristics.SENSOR_INFO_BINNING_FACTOR;
                    Size size = (Size) cameraCharacteristics.get(key);
                    if (size != null) {
                        if (size.getWidth() == 3) {
                            i2 = 1;
                        } else if (size.getWidth() == 2) {
                            i2 = 2;
                        }
                    }
                }
            }
        }
        i2 = 5;
        Size size2 = (Size) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        CameraCharacteristics.Key key2 = CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE;
        float height = ((SizeF) cameraCharacteristics.get(key2)).getHeight();
        float width = ((SizeF) cameraCharacteristics.get(key2)).getWidth();
        if (i2 == 5) {
            double height2 = (height / size2.getHeight()) * 1000.0f;
            BigDecimal bigDecimal = new BigDecimal(height2 / 2.0d);
            RoundingMode roundingMode = RoundingMode.HALF_EVEN;
            BigDecimal scale = bigDecimal.setScale(2, roundingMode);
            BigDecimal scale2 = new BigDecimal(height2 / 3.0d).setScale(2, roundingMode);
            int i5 = (scale.floatValue() == 0.8f || scale.floatValue() == 1.2f || scale.floatValue() == 0.64f || scale.floatValue() == 0.7f) ? 2 : (scale2.floatValue() == 0.8f || scale2.floatValue() == 0.64f || scale2.floatValue() == 0.7f) ? 1 : i2;
            if (i5 == 5) {
                double width2 = (width / size2.getWidth()) * 1000.0f;
                BigDecimal scale3 = new BigDecimal(width2 / 2.0d).setScale(2, roundingMode);
                BigDecimal scale4 = new BigDecimal(width2 / 3.0d).setScale(2, roundingMode);
                if (scale3.floatValue() == 0.8f || scale3.floatValue() == 1.2f || scale3.floatValue() == 1.0f || scale3.floatValue() == 0.64f) {
                    i3 = 4;
                } else if (scale4.floatValue() == 0.8f || scale4.floatValue() == 0.64f || scale4.floatValue() == 0.7f) {
                    i3 = 3;
                }
            }
            i3 = i5;
        } else {
            i3 = i2;
        }
        int i6 = (i3 != 5 || (height / ((float) size2.getHeight())) * 1000.0f <= 2.0f || Build.MANUFACTURER.toLowerCase().contains("htc") || Build.MODEL.toLowerCase().startsWith("xq")) ? i3 : 2;
        if (!Build.MANUFACTURER.equalsIgnoreCase("infinix") || Build.VERSION.SDK_INT > 31) {
            return i6;
        }
        return 5;
    }

    public static ArrayList w() {
        HashSet hashSet = new HashSet();
        f(1, hashSet);
        f(5, hashSet);
        f(6, hashSet);
        f(2002, hashSet);
        f(2003, hashSet);
        f(2004, hashSet);
        f(2001, hashSet);
        f(2000, hashSet);
        if (Build.VERSION.SDK_INT >= 31) {
            f(13, hashSet);
            f(1013, hashSet);
        }
        f(1005, hashSet);
        f(1006, hashSet);
        f(1001, hashSet);
        return new ArrayList(hashSet);
    }

    public static String x(String str, CameraCharacteristics cameraCharacteristics) {
        String str2;
        int parseInt;
        int parseInt2;
        Range<Integer>[] highSpeedVideoFpsRanges;
        Integer upper;
        Size[] sizeArr;
        TreeMap treeMap = new TreeMap(new a9(6));
        try {
            Integer.parseInt(str);
            ArrayList w = w();
            int size = w.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = w.get(i2);
                i2++;
                CamcorderProfile camcorderProfile = (CamcorderProfile) obj;
                if (camcorderProfile != null) {
                    String str3 = camcorderProfile.videoFrameWidth + "x" + camcorderProfile.videoFrameHeight;
                    Set set = (Set) treeMap.get(str3);
                    if (set == null) {
                        set = new HashSet();
                        treeMap.put(str3, set);
                    }
                    set.add(Integer.valueOf(camcorderProfile.videoFrameRate));
                }
            }
        } catch (Exception unused) {
        }
        try {
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null && (highSpeedVideoFpsRanges = streamConfigurationMap.getHighSpeedVideoFpsRanges()) != null && highSpeedVideoFpsRanges.length != 0) {
                for (Range<Integer> range : highSpeedVideoFpsRanges) {
                    if (range != null && (upper = range.getUpper()) != null && upper.intValue() > 0) {
                        try {
                            sizeArr = streamConfigurationMap.getHighSpeedVideoSizesFor(range);
                        } catch (Throwable unused2) {
                            sizeArr = null;
                        }
                        if (sizeArr != null && sizeArr.length != 0) {
                            for (Size size2 : sizeArr) {
                                if (size2 != null) {
                                    String str4 = size2.getWidth() + "x" + size2.getHeight();
                                    Set set2 = (Set) treeMap.get(str4);
                                    if (set2 == null) {
                                        set2 = new HashSet();
                                        treeMap.put(str4, set2);
                                    }
                                    set2.add(upper);
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused3) {
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : treeMap.entrySet()) {
            ArrayList arrayList = new ArrayList((Collection) entry.getValue());
            Collections.sort(arrayList);
            ArrayList arrayList2 = new ArrayList();
            int size3 = arrayList.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj2 = arrayList.get(i3);
                i3++;
                arrayList2.add(String.valueOf(((Integer) obj2).intValue()));
            }
            try {
                String[] split = ((String) entry.getKey()).split("x");
                parseInt = Integer.parseInt(split[0]);
                parseInt2 = Integer.parseInt(split[1]);
            } catch (Exception unused4) {
            }
            if (parseInt == 7680 && parseInt2 == 4320) {
                str2 = "8K";
            } else if (parseInt == 3840 && parseInt2 == 2160) {
                str2 = "4K";
            } else if (parseInt == 1920 && parseInt2 == 1080) {
                str2 = "1080p";
            } else {
                if (parseInt == 1280 && parseInt2 == 720) {
                    str2 = "720p";
                }
                str2 = null;
            }
            if (str2 == null) {
                str2 = (String) entry.getKey();
            }
            sb.append(str2);
            sb.append(" @ ");
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it.next());
                    if (it.hasNext()) {
                        sb2.append((CharSequence) ", ");
                    }
                }
            }
            sb.append(sb2.toString());
            sb.append(" fps\n");
        }
        return sb.toString().trim();
    }

    public static boolean y(CameraCharacteristics cameraCharacteristics) {
        int[] iArr;
        try {
            iArr = (int[]) cameraCharacteristics.get(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        } catch (Exception unused) {
        }
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == 9) {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    return true;
                }
                Range<Integer>[] highSpeedVideoFpsRanges = streamConfigurationMap.getHighSpeedVideoFpsRanges();
                Size[] highSpeedVideoSizes = streamConfigurationMap.getHighSpeedVideoSizes();
                if (highSpeedVideoFpsRanges != null && highSpeedVideoFpsRanges.length > 0 && highSpeedVideoSizes != null) {
                    if (highSpeedVideoSizes.length > 0) {
                        return true;
                    }
                }
                return false;
            }
        }
        return false;
    }

    public static boolean z(Context context) {
        AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
        if (appOpsManager == null) {
            return false;
        }
        return (Build.VERSION.SDK_INT >= 29 ? appOpsManager.unsafeCheckOpNoThrow("android:get_usage_stats", Process.myUid(), context.getPackageName()) : appOpsManager.checkOpNoThrow("android:get_usage_stats", Process.myUid(), context.getPackageName())) == 0;
    }
}
