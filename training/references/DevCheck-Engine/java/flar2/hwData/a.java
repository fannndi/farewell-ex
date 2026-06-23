package flar2.devcheck.hwData;

import Cwd.ynLVXgis;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.hardware.fingerprint.FingerprintManager;
import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import com.google.android.material.bottomappbar.HaCM.rQcwh;
import com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB;
import defpackage.a61;
import defpackage.d51;
import defpackage.ju0;
import defpackage.k91;
import defpackage.pr;
import defpackage.rw;
import defpackage.uz1;
import flar2.devcheck.hwData.DeviceInfo;
import flar2.devcheck.nativebridge.xm.oWuW;
import flar2.devcheck.usage.GgP.rlfWzcx;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import moe.shizuku.api.hYGD.yttXLrAeLjN;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static CameraManager f290a;

    public static String a(Double d) {
        return (d == null || d.isNaN() || d.isInfinite()) ? "0.000" : BigDecimal.valueOf(d.doubleValue()).setScale(3, RoundingMode.HALF_UP).toPlainString();
    }

    public static String b(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return null;
        }
        CharSequence[] charSequenceArr = {j(deviceInfo.manufacturer), j(deviceInfo.model), j(deviceInfo.device), j(deviceInfo.product), a(deviceInfo.ramSizeEst), a(deviceInfo.diskSizeEst)};
        StringBuilder sb = new StringBuilder();
        sb.append(charSequenceArr[0]);
        for (int i = 1; i < 6; i++) {
            sb.append((CharSequence) "|");
            sb.append(charSequenceArr[i]);
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(sb.toString().getBytes("UTF-8"));
            StringBuilder sb2 = new StringBuilder(digest.length * 2);
            for (byte b : digest) {
                sb2.append(String.format(yttXLrAeLjN.nIdBoHdtorDQ, Byte.valueOf(b)));
            }
            return sb2.toString();
        } catch (Exception e) {
            rw.j(e);
            return null;
        }
    }

    public static ArrayList c(Map map) {
        String str;
        k91 k91Var;
        String str2 = ILBLnlCHDVqsSN.TBmSMLNoZHORZyf;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        try {
            hashMap = ju0.y();
        } catch (Exception unused) {
        }
        int k0 = uz1.k0();
        for (int i = 0; i < k0; i++) {
            try {
                DeviceInfo.CPUDBInfo cPUDBInfo = new DeviceInfo.CPUDBInfo();
                cPUDBInfo.id = i;
                cPUDBInfo.freqMin = i("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_min_freq");
                cPUDBInfo.freqMax = i("/sys/devices/system/cpu/cpu" + i + "/cpufreq/cpuinfo_max_freq");
                try {
                    str = ju0.A(i, map);
                } catch (Exception unused2) {
                    str = null;
                }
                String str3 = "cluster" + i;
                if (str == null || str.isEmpty()) {
                    str = str3;
                }
                cPUDBInfo.cluster = str;
                if (hashMap.isEmpty()) {
                    k91Var = null;
                } else {
                    k91Var = (k91) hashMap.get(Integer.valueOf(i));
                    if (k91Var == null) {
                        k91Var = (k91) hashMap.values().iterator().next();
                    }
                }
                String str4 = k91Var != null ? k91Var.i : null;
                if (str4 == null || str4.isEmpty()) {
                    str4 = "unknown";
                }
                cPUDBInfo.type = str4;
                String str5 = k91Var != null ? k91Var.h : null;
                if (str5 == null || str5.isEmpty()) {
                    str5 = str2;
                }
                cPUDBInfo.vendor = str5;
                cPUDBInfo.midr = k91Var != null ? k91Var.f : 0;
                arrayList.add(cPUDBInfo);
            } catch (Throwable unused3) {
                DeviceInfo.CPUDBInfo cPUDBInfo2 = new DeviceInfo.CPUDBInfo();
                cPUDBInfo2.id = i;
                cPUDBInfo2.freqMin = 0L;
                cPUDBInfo2.freqMax = 0L;
                cPUDBInfo2.cluster = d51.q("cluster", i);
                cPUDBInfo2.type = "unknown";
                cPUDBInfo2.vendor = str2;
                cPUDBInfo2.midr = 0;
                arrayList.add(cPUDBInfo2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(36:155|156|157|158|159|(1:301)(12:163|164|165|166|167|168|(1:170)(2:292|(1:294))|171|172|(1:174)|175|(24:283|(23:285|(21:289|(1:183)|184|185|186|187|(2:189|(19:193|194|195|196|197|(2:199|(2:201|(2:203|(2:205|(1:207))(1:263))(1:264))(1:265))(1:266)|208|209|(15:211|212|213|214|(4:216|217|218|219)(1:257)|220|221|222|(10:224|225|(4:227|228|229|(1:231)(7:248|233|234|235|(4:237|238|(2:241|242)|240)|245|240))(1:251)|232|233|234|235|(0)|245|240)|252|234|235|(0)|245|240)|260|221|222|(0)|252|234|235|(0)|245|240))|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240)|282|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240)|281|282|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240)(22:179|(1:181)(3:274|(1:276)(4:278|(1:280)|281|282)|277)|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240))|295|171|172|(0)|175|(1:177)|283|(0)|281|282|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240) */
    /* JADX WARN: Can't wrap try/catch for region: R(60:86|(3:87|88|(3:90|91|92))|(60:94|(1:(1:97))|359|360|361|362|363|101|102|103|104|105|106|(5:342|343|(2:345|346)(1:351)|347|348)(4:108|109|(4:326|327|(5:329|330|331|332|333)(1:337)|334)|111)|112|113|(1:323)(4:117|(7:119|120|121|122|123|(2:127|128)|129)|320|321)|322|135|136|137|(3:139|(3:143|140|141)|144)|308|(38:310|311|(2:314|315)(1:313)|148|(1:150)|151|152|153|(36:155|156|157|158|159|(1:301)(12:163|164|165|166|167|168|(1:170)(2:292|(1:294))|171|172|(1:174)|175|(24:283|(23:285|(21:289|(1:183)|184|185|186|187|(2:189|(19:193|194|195|196|197|(2:199|(2:201|(2:203|(2:205|(1:207))(1:263))(1:264))(1:265))(1:266)|208|209|(15:211|212|213|214|(4:216|217|218|219)(1:257)|220|221|222|(10:224|225|(4:227|228|229|(1:231)(7:248|233|234|235|(4:237|238|(2:241|242)|240)|245|240))(1:251)|232|233|234|235|(0)|245|240)|252|234|235|(0)|245|240)|260|221|222|(0)|252|234|235|(0)|245|240))|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240)|282|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240)|281|282|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240)(22:179|(1:181)(3:274|(1:276)(4:278|(1:280)|281|282)|277)|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240))|295|171|172|(0)|175|(1:177)|283|(0)|281|282|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240)|305|304|298|175|(0)|283|(0)|281|282|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240)|147|148|(0)|151|152|153|(0)|305|304|298|175|(0)|283|(0)|281|282|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240)|368|369|370|101|102|103|104|105|106|(0)(0)|112|113|(1:115)|323|322|135|136|137|(0)|308|(0)|147|148|(0)|151|152|153|(0)|305|304|298|175|(0)|283|(0)|281|282|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240) */
    /* JADX WARN: Can't wrap try/catch for region: R(62:86|87|88|(3:90|91|92)|(60:94|(1:(1:97))|359|360|361|362|363|101|102|103|104|105|106|(5:342|343|(2:345|346)(1:351)|347|348)(4:108|109|(4:326|327|(5:329|330|331|332|333)(1:337)|334)|111)|112|113|(1:323)(4:117|(7:119|120|121|122|123|(2:127|128)|129)|320|321)|322|135|136|137|(3:139|(3:143|140|141)|144)|308|(38:310|311|(2:314|315)(1:313)|148|(1:150)|151|152|153|(36:155|156|157|158|159|(1:301)(12:163|164|165|166|167|168|(1:170)(2:292|(1:294))|171|172|(1:174)|175|(24:283|(23:285|(21:289|(1:183)|184|185|186|187|(2:189|(19:193|194|195|196|197|(2:199|(2:201|(2:203|(2:205|(1:207))(1:263))(1:264))(1:265))(1:266)|208|209|(15:211|212|213|214|(4:216|217|218|219)(1:257)|220|221|222|(10:224|225|(4:227|228|229|(1:231)(7:248|233|234|235|(4:237|238|(2:241|242)|240)|245|240))(1:251)|232|233|234|235|(0)|245|240)|252|234|235|(0)|245|240)|260|221|222|(0)|252|234|235|(0)|245|240))|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240)|282|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240)|281|282|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240)(22:179|(1:181)(3:274|(1:276)(4:278|(1:280)|281|282)|277)|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240))|295|171|172|(0)|175|(1:177)|283|(0)|281|282|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240)|305|304|298|175|(0)|283|(0)|281|282|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240)|147|148|(0)|151|152|153|(0)|305|304|298|175|(0)|283|(0)|281|282|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240)|368|369|370|101|102|103|104|105|106|(0)(0)|112|113|(1:115)|323|322|135|136|137|(0)|308|(0)|147|148|(0)|151|152|153|(0)|305|304|298|175|(0)|283|(0)|281|282|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240) */
    /* JADX WARN: Can't wrap try/catch for region: R(64:86|87|88|90|91|92|(60:94|(1:(1:97))|359|360|361|362|363|101|102|103|104|105|106|(5:342|343|(2:345|346)(1:351)|347|348)(4:108|109|(4:326|327|(5:329|330|331|332|333)(1:337)|334)|111)|112|113|(1:323)(4:117|(7:119|120|121|122|123|(2:127|128)|129)|320|321)|322|135|136|137|(3:139|(3:143|140|141)|144)|308|(38:310|311|(2:314|315)(1:313)|148|(1:150)|151|152|153|(36:155|156|157|158|159|(1:301)(12:163|164|165|166|167|168|(1:170)(2:292|(1:294))|171|172|(1:174)|175|(24:283|(23:285|(21:289|(1:183)|184|185|186|187|(2:189|(19:193|194|195|196|197|(2:199|(2:201|(2:203|(2:205|(1:207))(1:263))(1:264))(1:265))(1:266)|208|209|(15:211|212|213|214|(4:216|217|218|219)(1:257)|220|221|222|(10:224|225|(4:227|228|229|(1:231)(7:248|233|234|235|(4:237|238|(2:241|242)|240)|245|240))(1:251)|232|233|234|235|(0)|245|240)|252|234|235|(0)|245|240)|260|221|222|(0)|252|234|235|(0)|245|240))|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240)|282|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240)|281|282|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240)(22:179|(1:181)(3:274|(1:276)(4:278|(1:280)|281|282)|277)|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240))|295|171|172|(0)|175|(1:177)|283|(0)|281|282|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240)|305|304|298|175|(0)|283|(0)|281|282|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240)|147|148|(0)|151|152|153|(0)|305|304|298|175|(0)|283|(0)|281|282|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240)|368|369|370|101|102|103|104|105|106|(0)(0)|112|113|(1:115)|323|322|135|136|137|(0)|308|(0)|147|148|(0)|151|152|153|(0)|305|304|298|175|(0)|283|(0)|281|282|(0)|184|185|186|187|(0)|269|208|209|(0)|260|221|222|(0)|252|234|235|(0)|245|240) */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x032d, code lost:
    
        r25 = r4;
        r24 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x0296, code lost:
    
        r43 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x023c, code lost:
    
        r38 = r12;
        r40 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0241, code lost:
    
        r39 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018e, code lost:
    
        if (r2 != 3) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0200 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0351 A[Catch: Exception -> 0x03ae, TRY_LEAVE, TryCatch #1 {Exception -> 0x03ae, blocks: (B:153:0x0349, B:155:0x0351), top: B:152:0x0349 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03a8 A[Catch: Exception -> 0x03b6, TRY_LEAVE, TryCatch #10 {Exception -> 0x03b6, blocks: (B:172:0x03a2, B:174:0x03a8), top: B:171:0x03a2 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x042a A[Catch: Exception -> 0x0533, TryCatch #13 {Exception -> 0x0533, blocks: (B:187:0x0422, B:189:0x042a, B:193:0x045d), top: B:186:0x0422 }] */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0545 A[Catch: Exception -> 0x057f, TRY_LEAVE, TryCatch #25 {Exception -> 0x057f, blocks: (B:209:0x0535, B:211:0x0545), top: B:208:0x0535 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x058b A[Catch: Exception -> 0x05a5, TRY_LEAVE, TryCatch #18 {Exception -> 0x05a5, blocks: (B:222:0x0583, B:224:0x058b), top: B:221:0x0583 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x05b1 A[Catch: Exception -> 0x05b8, TRY_LEAVE, TryCatch #8 {Exception -> 0x05b8, blocks: (B:235:0x05a7, B:237:0x05b1), top: B:234:0x05a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x02d2 A[Catch: Exception -> 0x032a, TRY_LEAVE, TryCatch #6 {Exception -> 0x032a, blocks: (B:141:0x02b5, B:143:0x02b8, B:308:0x02cc, B:310:0x02d2), top: B:140:0x02b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:342:0x01de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList d(android.content.Context r47) {
        /*
            Method dump skipped, instructions count: 1535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: flar2.devcheck.hwData.a.d(android.content.Context):java.util.ArrayList");
    }

    public static a61 e() {
        String str;
        String str2;
        ArrayList n = uz1.n(rlfWzcx.pZeVaO);
        if (n.isEmpty() || n.size() <= 1) {
            str = null;
            str2 = null;
        } else {
            int size = n.size();
            str = null;
            str2 = null;
            int i = 0;
            while (i < size) {
                Object obj = n.get(i);
                i++;
                String[] split = ((String) obj).split(":");
                boolean contains = split[0].contains("enname");
                String str3 = GFUHKHDfiFuPm.PHZXaSeAu;
                if (contains) {
                    str = split[0].replace("[", "").replace(str3, "");
                    str2 = uz1.X(str);
                    if (str2 != null && !str2.isEmpty()) {
                        break;
                    }
                } else {
                    str = split[0].replace("[", "").replace(str3, "");
                    str2 = uz1.X(str);
                    if (str2 != null && str2.isEmpty()) {
                        str = null;
                        str2 = null;
                    }
                }
            }
        }
        if (str == null || str2 == null) {
            return null;
        }
        return new a61(str, str2);
    }

    public static Boolean f(Context context) {
        FingerprintManager fingerprintManager = (FingerprintManager) context.getSystemService("fingerprint");
        return Boolean.valueOf(fingerprintManager != null && fingerprintManager.isHardwareDetected());
    }

    public static HashMap g(String str) {
        HashMap hashMap = new HashMap();
        for (String str2 : str.replace("[", "").replace(rQcwh.WJT, "").split(";")) {
            String trim = str2.trim();
            if (!trim.isEmpty()) {
                String[] split = trim.split("=");
                if (split.length == 2) {
                    String trim2 = split[0].trim();
                    String N = pr.N(split[1].trim());
                    if (trim2.equalsIgnoreCase("back_main")) {
                        trim2 = ynLVXgis.JSSyPEkhhE;
                    } else if (trim2.equalsIgnoreCase("front_main")) {
                        trim2 = oWuW.WTWKvg;
                    } else if (trim2.equalsIgnoreCase("back_tele")) {
                        trim2 = "Telephoto";
                    } else if (trim2.equalsIgnoreCase("back_ultra")) {
                        trim2 = "Ultrawide";
                    }
                    hashMap.put(trim2, N);
                }
            }
        }
        return hashMap;
    }

    public static double h(String str) {
        if (str == null) {
            return 0.0d;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            return 0.0d;
        }
        Matcher matcher = Pattern.compile("([0-9][0-9\\s.,]*)").matcher(trim.replace((char) 160, ' ').replace((char) 8239, ' ').replaceAll("\\s+", " "));
        if (!matcher.find()) {
            return 0.0d;
        }
        String replace = matcher.group(1).trim().replace(" ", "");
        int lastIndexOf = replace.lastIndexOf(46);
        int lastIndexOf2 = replace.lastIndexOf(44);
        String str2 = qJTtDWNCVUDjB.aSy;
        if (lastIndexOf >= 0 && lastIndexOf2 >= 0) {
            replace = lastIndexOf > lastIndexOf2 ? replace.replace(",", "") : replace.replace(str2, "").replace(',', '.');
        } else if (lastIndexOf2 >= 0) {
            replace = replace.matches(".*,[0-9]{3}(?:,[0-9]{3})*$") ? replace.replace(",", "") : replace.replace(',', '.');
        } else if (lastIndexOf >= 0 && replace.matches(".*\\.[0-9]{3}(?:\\.[0-9]{3})*$")) {
            replace = replace.replace(str2, "");
        }
        try {
            return Double.parseDouble(replace);
        } catch (NumberFormatException unused) {
            return 0.0d;
        }
    }

    public static long i(String str) {
        String K = uz1.K(str);
        if (K == null) {
            return 0L;
        }
        String trim = K.trim();
        if (trim.isEmpty() || trim.equalsIgnoreCase("na") || trim.equalsIgnoreCase("n/a") || trim.equalsIgnoreCase("none") || trim.equalsIgnoreCase("unavailable")) {
            return 0L;
        }
        int length = trim.length();
        int i = 0;
        int i2 = -1;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            char charAt = trim.charAt(i);
            if ((charAt != '-' && !Character.isDigit(charAt)) || i2 != -1) {
                if (i2 != -1 && !Character.isDigit(charAt)) {
                    break;
                }
            } else {
                i2 = i;
            }
            i++;
        }
        if (i2 != -1) {
            if (i != -1) {
                length = i;
            }
            trim = trim.substring(i2, length);
        }
        try {
            return Long.parseLong(trim);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static String j(String str) {
        return str == null ? "" : str.trim().toLowerCase(Locale.ROOT);
    }
}
