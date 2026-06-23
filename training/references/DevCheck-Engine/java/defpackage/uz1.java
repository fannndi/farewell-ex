package defpackage;

import Cwd.ynLVXgis;
import android.app.ActivityManager;
import android.app.Application;
import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.Uri;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.format.Formatter;
import android.text.style.BackgroundColorSpan;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.LruCache;
import android.util.TypedValue;
import android.widget.Toast;
import androidx.core.widget.rsm.gXdyRQCGVlHW;
import androidx.emoji2.text.Fk.Iyrs;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import com.google.android.material.behavior.YqV.Gvyagftz;
import com.google.android.material.bottomappbar.HaCM.QCeVODiUkb;
import com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB;
import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import com.imn.iivisu.ltkT.CDsMEtnUjndKau;
import com.jjoe64.graphview.XZMC.MiGPiFgcCQCVh;
import flar2.devcheck.BatteryMonitor.BatteryMonitorService;
import flar2.devcheck.MainActivity;
import flar2.devcheck.PaywallActivity;
import flar2.devcheck.ProActivity;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.history.Hq.CGvJMCDBOmCdj;
import flar2.devcheck.benchmarkSuite.nativebridge.vGm.RIhTGWkqQvGL;
import flar2.devcheck.cputimes.Sd.tEegR;
import flar2.devcheck.nativebridge.xm.oWuW;
import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public abstract class uz1 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile String f1060a;
    public static volatile long b;
    public static volatile Boolean c;
    public static final AtomicBoolean d = new AtomicBoolean(false);
    public static final String[] e = {"QgtGAAkQBlUOFRIJFkIDXEIUVEgDGg5VUQgDCgsDC1FEAxQ=", "SQcQVUtMFl1PSBxdFRc4XVMjCEAXQA==", "RAMSdxda", QCeVODiUkb.QWwohZ};
    public static final Spannable.Factory f = Spannable.Factory.getInstance();

    public static String A(boolean z) {
        String str = z ? " " : "\n";
        try {
            try {
                if (i51.g("prefdevicename2")) {
                    return i51.e("prefdevicename2").replace("\n", str);
                }
                return M() + str + c(Build.MODEL);
            } catch (Exception unused) {
                return M() + str + a(Build.MODEL);
            }
        } catch (Exception unused2) {
            return Build.MANUFACTURER + str + Build.MODEL;
        }
    }

    public static String A0(String str) {
        if (str == null || str.equals("Unavailable") || str.equals("EE")) {
            return d10.n().getString(R.string.not_avail);
        }
        try {
            return str.length() < 4 ? str : str.length() < 8 ? String.valueOf(Integer.parseInt(str) / 1000) : String.valueOf(Integer.parseInt(str) / 1000000);
        } catch (NumberFormatException unused) {
            return "Unavailable";
        }
    }

    public static String B(Context context, long j) {
        if (j < 0) {
            return "0";
        }
        long j2 = (j / 1000) % 60;
        long j3 = (j / 60000) % 60;
        long j4 = (j / 3600000) % 24;
        long j5 = j / 86400000;
        StringBuilder sb = new StringBuilder();
        if (j5 > 0) {
            sb.append(j5);
            sb.append(context.getString(R.string.day_short));
            sb.append(" ");
        }
        if (j4 > 0) {
            sb.append(j4);
            sb.append(context.getString(R.string.hour_short));
            sb.append(" ");
        }
        if (j3 > 0) {
            sb.append(j3);
            sb.append(context.getString(R.string.minutes_short));
            sb.append(" ");
        }
        if (j2 > 0) {
            sb.append(j2);
            sb.append(context.getString(R.string.seconds_short));
        }
        return sb.toString();
    }

    public static String B0(String str, String str2) {
        byte[] decode = Base64.decode(str, 0);
        int length = decode.length;
        byte[] bytes = str2.getBytes();
        int length2 = bytes.length - 1;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (decode[i] ^ bytes[i % length2]);
        }
        return new String(bArr);
    }

    public static String C(Context context, long j) {
        if (j < 0) {
            return "0";
        }
        long j2 = (j / 60000) % 60;
        long j3 = (j / 3600000) % 24;
        long j4 = j / 86400000;
        StringBuilder sb = new StringBuilder();
        if (j4 == 1) {
            sb.append(j4);
            sb.append(" ");
            sb.append(context.getString(R.string.day));
            sb.append(" ");
        } else if (j4 > 0) {
            sb.append(j4);
            sb.append(" ");
            sb.append(context.getString(R.string.days));
            sb.append(" ");
        }
        if (j3 > 3) {
            sb.append(j3);
            sb.append(" ");
            sb.append(context.getString(R.string.hours));
            sb.append(" ");
        } else if (j3 == 1) {
            sb.append(j3);
            sb.append(" ");
            sb.append(context.getString(R.string.hour));
            sb.append(" ");
            if (j2 > 1 && j4 == 0) {
                sb.append(j2);
                sb.append(" ");
                sb.append(context.getString(R.string.minutes));
                sb.append(" ");
            } else if (j2 > 0 && j4 == 0) {
                sb.append(j2);
                sb.append(" ");
                sb.append(context.getString(R.string.minute));
                sb.append(" ");
            }
        } else if (j3 > 0) {
            sb.append(j3);
            sb.append(" ");
            sb.append(context.getString(R.string.hours));
            sb.append(" ");
            if (j2 > 1 && j4 == 0) {
                sb.append(j2);
                sb.append(" ");
                sb.append(context.getString(R.string.minutes));
                sb.append(" ");
            } else if (j2 > 0 && j4 == 0) {
                sb.append(j2);
                sb.append(" ");
                sb.append(context.getString(R.string.minute));
                sb.append(" ");
            }
        } else if (j2 > 1) {
            sb.append(j2);
            sb.append(" ");
            sb.append(context.getString(R.string.minutes));
            sb.append(" ");
        } else if (j2 > 0) {
            sb.append(j2);
            sb.append(" ");
            sb.append(context.getString(R.string.minute));
            sb.append(" ");
        }
        return sb.toString();
    }

    public static String D(Context context, long j) {
        if (j < 0) {
            return "0";
        }
        long j2 = (j / 60000) % 60;
        long j3 = (j / 3600000) % 24;
        long j4 = j / 86400000;
        StringBuilder sb = new StringBuilder();
        if (j4 > 0) {
            sb.append(j4);
            sb.append(context.getString(R.string.day_short));
            sb.append(" ");
        }
        if (j3 > 0) {
            sb.append(j3);
            sb.append(context.getString(R.string.hour_short));
            sb.append(" ");
        }
        if (j2 > 0) {
            sb.append(j2);
            sb.append(context.getString(R.string.minutes_short));
        }
        return sb.toString();
    }

    public static String E() {
        try {
            ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
            int size = list.size();
            int i = 0;
            while (i < size) {
                Object obj = list.get(i);
                i++;
                NetworkInterface networkInterface = (NetworkInterface) obj;
                if (networkInterface.getName().equalsIgnoreCase("eth0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b2 : hardwareAddress) {
                        sb.append(String.format(Iyrs.WIEXTXZwcR, Byte.valueOf(b2)));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
            return "NA";
        } catch (Exception unused) {
            return "NA";
        }
    }

    public static String F() {
        try {
            String h = h(new String[]{"/system/bin/sh", "-c", "mount | grep \"/data type\""});
            if (h.length() > 2) {
                return h.substring(h.indexOf("type")).split(" ")[1];
            }
            String h2 = h(new String[]{"/system/bin/sh", "-c", "mount | grep \"/data\""});
            String substring = h2.substring(h2.indexOf(" /data"));
            String str = substring.split(" ")[3];
            if (str.length() > 10) {
                str = substring.split(" ")[2];
            }
            return (str.length() < 3 || str.length() > 10) ? "NA" : str;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String G(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            if (i == 1) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append("Dolby Vision");
            } else if (i == 2) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append("HDR10");
            } else if (i == 4) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append("HDR10+");
            } else if (i == 3) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append("Hybrid Log-Gamma");
            }
        }
        return sb.toString();
    }

    public static Spannable H(int i, String str, String str2) {
        int indexOf;
        int length;
        Spannable newSpannable = f.newSpannable(str);
        if (TextUtils.isEmpty(str2) || (indexOf = str.toLowerCase(Locale.ROOT).indexOf(str2)) == -1 || (length = str2.length() + indexOf) > str.length()) {
            return newSpannable;
        }
        newSpannable.setSpan(new BackgroundColorSpan(i), indexOf, length, 17);
        return newSpannable;
    }

    public static String I() {
        try {
            ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
            int size = list.size();
            int i = 0;
            while (i < size) {
                Object obj = list.get(i);
                i++;
                ArrayList list2 = Collections.list(((NetworkInterface) obj).getInetAddresses());
                int size2 = list2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = list2.get(i2);
                    i2++;
                    InetAddress inetAddress = (InetAddress) obj2;
                    if (!inetAddress.isLoopbackAddress()) {
                        String hostAddress = inetAddress.getHostAddress();
                        if (inetAddress instanceof Inet4Address) {
                            return hostAddress;
                        }
                    }
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public static String J(Application application) {
        try {
            HashSet hashSet = new HashSet();
            ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
            int size = list.size();
            int i = 0;
            while (i < size) {
                Object obj = list.get(i);
                i++;
                ArrayList list2 = Collections.list(((NetworkInterface) obj).getInetAddresses());
                int size2 = list2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = list2.get(i2);
                    i2++;
                    InetAddress inetAddress = (InetAddress) obj2;
                    if (!inetAddress.isLoopbackAddress()) {
                        String hostAddress = inetAddress.getHostAddress();
                        if ((inetAddress instanceof Inet6Address) && (hostAddress.contains("wlan") || hostAddress.contains("rmnet_data1"))) {
                            int indexOf = hostAddress.indexOf(37);
                            if (indexOf >= 0) {
                                hostAddress = hostAddress.substring(0, indexOf);
                            }
                            hashSet.add(hostAddress);
                        }
                    }
                }
            }
            ConnectivityManager connectivityManager = (ConnectivityManager) application.getApplicationContext().getSystemService("connectivity");
            for (LinkAddress linkAddress : connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork()).getLinkAddresses()) {
                if (!linkAddress.getAddress().isLoopbackAddress() && (linkAddress.getAddress() instanceof Inet6Address)) {
                    hashSet.add(linkAddress.getAddress().getHostAddress());
                }
            }
            ArrayList arrayList = new ArrayList(hashSet);
            Collections.sort(arrayList);
            Collections.reverse(arrayList);
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (true) {
                    sb.append((CharSequence) next);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append((CharSequence) "\n");
                    next = it.next();
                }
            }
            return sb.toString();
        } catch (Exception unused) {
            return "NA";
        }
    }

    public static String K(String str) {
        try {
            if (str == null) {
                return "NA";
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(str), rt0.u);
                try {
                    String readLine = bufferedReader.readLine();
                    bufferedReader.close();
                    return readLine.trim();
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                if (!i51.b("prefRoot").booleanValue()) {
                    return (str.contains("cpufreq") && q(str.substring(0, 28)) && K(str.substring(0, 28).concat("/online")).contains("1")) ? "EE" : "NA";
                }
                try {
                    String m = m("cat ".concat(str));
                    if (m.length() > 0) {
                        if (!m.contains("stdin")) {
                            return m;
                        }
                    }
                    return "NA";
                } catch (Exception unused2) {
                    return "EE";
                }
            }
        } catch (NullPointerException unused3) {
        }
    }

    public static String L() {
        try {
            ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
            int size = list.size();
            int i = 0;
            while (i < size) {
                Object obj = list.get(i);
                i++;
                NetworkInterface networkInterface = (NetworkInterface) obj;
                if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b2 : hardwareAddress) {
                        sb.append(String.format("%02X:", Byte.valueOf(b2)));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
            return "NA";
        } catch (Exception unused) {
            return "NA";
        }
    }

    public static String M() {
        String str = "vivo";
        String str2 = Build.BRAND;
        String str3 = Build.MANUFACTURER;
        if (str3.equalsIgnoreCase("xiaomi") || str3.equalsIgnoreCase("sony") || str3.equalsIgnoreCase("samsung") || str3.equalsIgnoreCase("sharp") || str3.equalsIgnoreCase("oblue") || str3.equalsIgnoreCase("blu") || str2.equalsIgnoreCase("unknown")) {
            str2 = str3;
        }
        try {
            if (str2.length() > 3) {
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < str2.length(); i3++) {
                    char charAt = str2.charAt(i3);
                    if (charAt >= 'A' && charAt <= 'Z') {
                        i++;
                    } else if (charAt == ' ') {
                        i2++;
                    }
                }
                if (i == str2.length() - i2) {
                    str2 = c(str2.toLowerCase(Locale.ROOT));
                } else if (i == 0) {
                    str2 = c(str2);
                }
            }
            if (str2.equalsIgnoreCase("realme")) {
                str = "realme";
            } else if (!str2.equalsIgnoreCase("vivo")) {
                str = str2.equalsIgnoreCase("htc") ? "HTC" : str2.equalsIgnoreCase("LGE") ? "LG" : str2.equalsIgnoreCase("HMD Global") ? "Nokia" : str2.equalsIgnoreCase("INFINIX MOBILITY LIMITED") ? str2.replace("INFINIX MOBILITY LIMITED", "Infinix") : str2;
            }
            return str.trim();
        } catch (Exception unused) {
            return Build.MANUFACTURER;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:2794:0x2367, code lost:
    
        if (r5.equals("1906_20") == false) goto L96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String N(android.content.Context r61) {
        /*
            Method dump skipped, instructions count: 14774
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uz1.N(android.content.Context):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062 A[Catch: Exception -> 0x00ba, TRY_ENTER, TRY_LEAVE, TryCatch #3 {Exception -> 0x00ba, blocks: (B:9:0x001b, B:11:0x0022, B:44:0x0048, B:23:0x0062, B:35:0x0079, B:31:0x008e, B:36:0x0093, B:38:0x00b0, B:42:0x00ab, B:48:0x00b5, B:26:0x007e, B:40:0x0097, B:33:0x0066), top: B:8:0x001b, inners: #1, #2, #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093 A[Catch: Exception -> 0x00ba, TRY_LEAVE, TryCatch #3 {Exception -> 0x00ba, blocks: (B:9:0x001b, B:11:0x0022, B:44:0x0048, B:23:0x0062, B:35:0x0079, B:31:0x008e, B:36:0x0093, B:38:0x00b0, B:42:0x00ab, B:48:0x00b5, B:26:0x007e, B:40:0x0097, B:33:0x0066), top: B:8:0x001b, inners: #1, #2, #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String O(android.content.Context r9) {
        /*
            long r0 = android.os.SystemClock.uptimeMillis()
            java.lang.String r2 = defpackage.uz1.f1060a
            if (r2 == 0) goto L13
            long r3 = defpackage.uz1.b
            long r3 = r0 - r3
            r5 = 5000(0x1388, double:2.4703E-320)
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L13
            return r2
        L13:
            java.lang.String r2 = "phone"
            java.lang.Object r3 = r9.getSystemService(r2)
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            int r4 = r3.getPhoneCount()     // Catch: java.lang.Exception -> Lba
            r5 = 1
            if (r4 <= r5) goto Lb5
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> Lba
            r6 = 0
            r7 = 29
            if (r4 >= r7) goto L48
            t60 r4 = new t60     // Catch: java.lang.Exception -> L60
            r4.<init>(r9)     // Catch: java.lang.Exception -> L60
            xo1 r4 = r4.b(r6)     // Catch: java.lang.Exception -> L60
            int r4 = r4.c     // Catch: java.lang.Exception -> L60
            r8 = 5
            if (r4 != r8) goto L38
            r6 = r5
        L38:
            t60 r4 = new t60     // Catch: java.lang.Exception -> L60
            r4.<init>(r9)     // Catch: java.lang.Exception -> L60
            xo1 r4 = r4.b(r5)     // Catch: java.lang.Exception -> L60
            int r4 = r4.c     // Catch: java.lang.Exception -> L60
            if (r4 != r8) goto L60
            int r6 = r6 + 1
            goto L60
        L48:
            java.lang.String r4 = "android.permission.READ_PHONE_STATE"
            int r4 = defpackage.pr.g(r9, r4)     // Catch: java.lang.Exception -> Lba
            if (r4 != 0) goto L60
            android.content.Context r4 = r9.getApplicationContext()     // Catch: java.lang.Exception -> L60
            java.lang.String r8 = "telephony_subscription_service"
            java.lang.Object r4 = r4.getSystemService(r8)     // Catch: java.lang.Exception -> L60
            android.telephony.SubscriptionManager r4 = (android.telephony.SubscriptionManager) r4     // Catch: java.lang.Exception -> L60
            int r6 = r4.getActiveSubscriptionInfoCount()     // Catch: java.lang.Exception -> L60
        L60:
            if (r6 <= r5) goto L93
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> Lba
            if (r4 < r7) goto L7e
            java.lang.Object r9 = r9.getSystemService(r2)     // Catch: java.lang.Exception -> L79
            android.telephony.TelephonyManager r9 = (android.telephony.TelephonyManager) r9     // Catch: java.lang.Exception -> L79
            int r2 = android.telephony.SubscriptionManager.getDefaultDataSubscriptionId()     // Catch: java.lang.Exception -> L79
            android.telephony.TelephonyManager r9 = r9.createForSubscriptionId(r2)     // Catch: java.lang.Exception -> L79
            java.lang.String r9 = r9.getSimOperatorName()     // Catch: java.lang.Exception -> L79
            goto Lbe
        L79:
            java.lang.String r9 = r3.getNetworkOperatorName()     // Catch: java.lang.Exception -> Lba
            goto Lbe
        L7e:
            t60 r2 = new t60     // Catch: java.lang.Exception -> L8e
            r2.<init>(r9)     // Catch: java.lang.Exception -> L8e
            int r9 = android.telephony.SubscriptionManager.getDefaultDataSubscriptionId()     // Catch: java.lang.Exception -> L8e
            xo1 r9 = r2.b(r9)     // Catch: java.lang.Exception -> L8e
            java.lang.String r9 = r9.h     // Catch: java.lang.Exception -> L8e
            goto Lbe
        L8e:
            java.lang.String r9 = r3.getNetworkOperatorName()     // Catch: java.lang.Exception -> Lba
            goto Lbe
        L93:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> Lba
            if (r2 < r7) goto Lb0
            int r2 = android.telephony.SubscriptionManager.getDefaultDataSubscriptionId()     // Catch: java.lang.Exception -> Lab
            t60 r4 = new t60     // Catch: java.lang.Exception -> Lab
            r4.<init>(r9)     // Catch: java.lang.Exception -> Lab
            int r9 = defpackage.fi0.a(r2)     // Catch: java.lang.Exception -> Lab
            xo1 r9 = r4.b(r9)     // Catch: java.lang.Exception -> Lab
            java.lang.String r9 = r9.e     // Catch: java.lang.Exception -> Lab
            goto Lbe
        Lab:
            java.lang.String r9 = r3.getNetworkOperatorName()     // Catch: java.lang.Exception -> Lba
            goto Lbe
        Lb0:
            java.lang.String r9 = r3.getNetworkOperatorName()     // Catch: java.lang.Exception -> Lba
            goto Lbe
        Lb5:
            java.lang.String r9 = r3.getNetworkOperatorName()     // Catch: java.lang.Exception -> Lba
            goto Lbe
        Lba:
            java.lang.String r9 = r3.getNetworkOperatorName()
        Lbe:
            if (r9 == 0) goto Lc4
            defpackage.uz1.f1060a = r9
            defpackage.uz1.b = r0
        Lc4:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uz1.O(android.content.Context):java.lang.String");
    }

    public static int P(String[] strArr) {
        if (i51.b("prefRoot").booleanValue()) {
            for (int i = 0; i < strArr.length; i++) {
                if (m("[ -e " + strArr[i] + " ] && echo 1").equals("1")) {
                    return i;
                }
            }
        } else {
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (new File(strArr[i2]).canRead()) {
                    return i2;
                }
            }
        }
        return 0;
    }

    public static String Q(Context context, TelephonyManager telephonyManager) {
        int phoneType = telephonyManager.getPhoneType();
        return phoneType != 0 ? phoneType != 1 ? phoneType != 2 ? context.getString(R.string.none) : context.getString(R.string.cdma) : context.getString(R.string.gsm) : context.getString(R.string.none);
    }

    public static int R(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        return typedValue.data;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[Catch: all -> 0x005a, TRY_ENTER, TryCatch #4 {all -> 0x005a, blocks: (B:8:0x000f, B:19:0x0041, B:30:0x004c, B:31:0x004f, B:27:0x0052), top: B:7:0x000f, outer: #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String S(android.content.Context r10, java.lang.String r11) {
        /*
            r1 = 0
            if (r11 == 0) goto L66
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto Lb
            goto L66
        Lb:
            k51 r10 = defpackage.k51.e(r10)     // Catch: java.lang.Exception -> L66
            boolean r0 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L5a
            if (r0 == 0) goto L17
        L15:
            r0 = r1
            goto L56
        L17:
            java.lang.String r0 = "vendor"
            java.lang.String[] r4 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            java.lang.String r5 = "mac LIKE ?"
            java.lang.String[] r6 = new java.lang.String[]{r11}     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            android.database.sqlite.SQLiteDatabase r2 = r10.g     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            java.lang.String r3 = "macvendors"
            r8 = 0
            r9 = 0
            r7 = 0
            android.database.Cursor r11 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L48
            if (r11 == 0) goto L3e
            boolean r0 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L50
            if (r0 == 0) goto L3e
            r0 = 0
            java.lang.String r0 = r11.getString(r0)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L50
            goto L3f
        L3c:
            r0 = move-exception
            goto L4a
        L3e:
            r0 = r1
        L3f:
            if (r11 == 0) goto L56
            r11.close()     // Catch: java.lang.Throwable -> L5a
            goto L56
        L45:
            r0 = move-exception
            r11 = r1
            goto L4a
        L48:
            r11 = r1
            goto L50
        L4a:
            if (r11 == 0) goto L4f
            r11.close()     // Catch: java.lang.Throwable -> L5a
        L4f:
            throw r0     // Catch: java.lang.Throwable -> L5a
        L50:
            if (r11 == 0) goto L15
            r11.close()     // Catch: java.lang.Throwable -> L5a
            goto L15
        L56:
            r10.close()     // Catch: java.lang.Exception -> L66
            return r0
        L5a:
            r0 = move-exception
            r11 = r0
            r10.close()     // Catch: java.lang.Throwable -> L60
            goto L65
        L60:
            r0 = move-exception
            r10 = r0
            r11.addSuppressed(r10)     // Catch: java.lang.Exception -> L66
        L65:
            throw r11     // Catch: java.lang.Exception -> L66
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uz1.S(android.content.Context, java.lang.String):java.lang.String");
    }

    public static String T(Context context, int i) {
        switch (i) {
            case 0:
                return context.getString(R.string.no_sim);
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return context.getString(R.string.no_sim);
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return context.getString(R.string.pin_required);
            case 3:
                return context.getString(R.string.puk_required);
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return context.getString(R.string.locked);
            case 5:
                return context.getString(R.string.ready);
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return context.getString(R.string.not_ready);
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                return context.getString(R.string.disabled);
            case 8:
                return context.getString(R.string.error);
            case rt0.o /* 9 */:
                return context.getString(R.string.restricted);
            default:
                return context.getString(R.string.unknown);
        }
    }

    public static int U() {
        try {
            return (int) ((Resources.getSystem().getIdentifier("status_bar_height", "dimen", "android") > 0 ? Resources.getSystem().getDimensionPixelSize(r1) : 24) / Resources.getSystem().getDisplayMetrics().density);
        } catch (Exception unused) {
            return 24;
        }
    }

    public static String V(String str) {
        int parseInt;
        String[] split = o("stat -f " + str + " | grep Block").split(" ");
        if (split.length <= 2 || (parseInt = Integer.parseInt(split[2]) / rt0.v) <= 0) {
            return null;
        }
        return d51.o(parseInt, CGvJMCDBOmCdj.KylknKVEkzLoLLm);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x003b, code lost:
    
        if (r0.startsWith("/sys/") != false) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.th W(android.app.Application r6) {
        /*
            r0 = 0
            java.lang.String r0 = com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ.ZoQEs
            java.lang.Boolean r0 = defpackage.i51.b(r0)
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L10
            goto Lb0
        L10:
            java.lang.String r0 = "find /sys/devices/platform -maxdepth 4 -type d -name health_descriptor 2>/dev/null | head -n 1"
            java.lang.String r0 = m(r0)
            if (r0 != 0) goto L1a
        L18:
            r0 = r1
            goto L3e
        L1a:
            java.lang.String r0 = r0.trim()
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L18
            java.lang.String r2 = "NA"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L18
            java.lang.String r2 = "EE"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L35
            goto L18
        L35:
            java.lang.String r2 = "/sys/"
            boolean r2 = r0.startsWith(r2)
            if (r2 != 0) goto L3e
            goto L18
        L3e:
            if (r0 != 0) goto L42
            goto Lb0
        L42:
            java.lang.String r2 = "/life_time_estimation_a"
            java.lang.String r2 = r0.concat(r2)
            java.lang.String r2 = K(r2)
            java.lang.String r2 = r(r6, r2)
            java.lang.String r3 = "/life_time_estimation_b"
            java.lang.String r3 = r0.concat(r3)
            java.lang.String r3 = K(r3)
            java.lang.String r3 = r(r6, r3)
            java.lang.String r4 = "/life_time_estimation_c"
            java.lang.String r4 = r0.concat(r4)
            java.lang.String r4 = K(r4)
            java.lang.String r4 = r(r6, r4)
            java.lang.String r5 = "/eol_info"
            java.lang.String r0 = r0.concat(r5)
            java.lang.String r0 = K(r0)
            java.lang.Integer r0 = n0(r0)
            if (r0 != 0) goto L7e
        L7c:
            r6 = r1
            goto La3
        L7e:
            int r0 = r0.intValue()
            r5 = 1
            if (r0 == r5) goto L9c
            r5 = 2
            if (r0 == r5) goto L94
            r5 = 3
            if (r0 == r5) goto L8c
            goto L7c
        L8c:
            r0 = 2131953132(0x7f1305ec, float:1.9542726E38)
            java.lang.String r6 = r6.getString(r0)
            goto La3
        L94:
            r0 = 2131953134(0x7f1305ee, float:1.954273E38)
            java.lang.String r6 = r6.getString(r0)
            goto La3
        L9c:
            r0 = 2131953133(0x7f1305ed, float:1.9542728E38)
            java.lang.String r6 = r6.getString(r0)
        La3:
            th r0 = new th
            r0.<init>(r2, r3, r4, r6)
            if (r2 != 0) goto Lb1
            if (r3 != 0) goto Lb1
            if (r4 != 0) goto Lb1
            if (r6 != 0) goto Lb1
        Lb0:
            return r1
        Lb1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uz1.W(android.app.Application):th");
    }

    public static String X(String str) {
        String str2 = "";
        String str3 = null;
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getMethod(RIhTGWkqQvGL.qYLdqRxL, String.class, String.class).invoke(null, str, "");
            if (invoke != null) {
                str2 = invoke.toString();
            }
            str3 = str2;
        } catch (Throwable unused) {
        }
        if (str3 != null) {
            return str3;
        }
        try {
            return o("getprop " + str);
        } catch (Exception unused2) {
            return str3;
        }
    }

    public static String Y(String str) {
        if (str == null) {
            return "NA";
        }
        if (str.equals("") && str.length() == 0) {
            return "NA";
        }
        if (!et.f248a.d("prefFahrenheit")) {
            return str.concat("°C");
        }
        try {
            return String.valueOf(((int) (Double.parseDouble(str) * 1.8d)) + 32) + "°F";
        } catch (NumberFormatException unused) {
            return "NA";
        }
    }

    public static String Z(String str) {
        String str2;
        String o;
        BufferedReader bufferedReader;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(str), rt0.u);
            } catch (Throwable unused) {
                if (i51.b("prefRoot").booleanValue()) {
                    o = m("cat " + str);
                } else {
                    o = o("cat " + str);
                }
                str2 = o;
            }
        } catch (Throwable unused2) {
            str2 = "NA";
        }
        try {
            str2 = bufferedReader.readLine();
            bufferedReader.close();
            try {
                return (str2.equals("") || str2.contains(hTYJVDOvZnZlYL.KZVBzDkWvPrVK) || str2.length() == 0 || str2.length() >= 6) ? "NA" : str2.substring(0, 2);
            } catch (Exception unused3) {
                return "NA";
            }
        } finally {
        }
    }

    public static String a(String str) {
        try {
            return str.substring(0, 1).toUpperCase() + str.substring(1);
        } catch (Exception unused) {
            return str;
        }
    }

    public static String a0(Context context, int i) {
        return i != 1 ? i != 4 ? i != 5 ? i != 6 ? "" : context.getString(R.string.wifi_ax) : context.getString(R.string.wifi_ac) : context.getString(R.string.wifi_n) : context.getString(R.string.wifi_legacy);
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String lowerCase = str.toLowerCase();
        return lowerCase.substring(0, 1).toUpperCase() + lowerCase.substring(1);
    }

    public static boolean b0(Context context) {
        try {
            String X = X("init.svc.faced");
            if (X == null || !X.equals("running")) {
                return context.getPackageManager().hasSystemFeature("android.hardware.biometrics.face");
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (char c2 : charArray) {
            if (z && Character.isLetter(c2)) {
                sb.append(Character.toUpperCase(c2));
                z = false;
            } else {
                if (Character.isWhitespace(c2)) {
                    z = true;
                }
                sb.append(c2);
            }
        }
        return sb.toString();
    }

    public static boolean c0(Context context) {
        try {
            String X = X("init.svc.irisd");
            if (X == null || !X.equals(MiGPiFgcCQCVh.rKDvym)) {
                return context.getPackageManager().hasSystemFeature("android.hardware.biometrics.iris");
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean d(Context context) {
        if (i51.b("prefSysTheme").booleanValue() || !i51.b("prefDarkTheme").booleanValue()) {
            return i51.b("prefSysTheme").booleanValue() && h0(context);
        }
        return true;
    }

    public static String d0(Context context, long j, boolean z) {
        long j2;
        long j3;
        if (z) {
            return Formatter.formatFileSize(context, j);
        }
        if (j >= 1024) {
            if (j < 1048576) {
                j2 = j / 1024;
                j3 = 1000;
            } else if (j < 1073741824) {
                j2 = j / 1048576;
                j3 = 1000000;
            } else if (j < 1099511627776L) {
                j2 = j / 1073741824;
                j3 = 1000000000;
            } else {
                j = 0;
            }
            j = j2 * j3;
        }
        return Formatter.formatFileSize(context, j);
    }

    public static boolean e() {
        Boolean bool = c;
        if (bool != null) {
            return bool.booleanValue();
        }
        final int i = 1;
        if (d.compareAndSet(false, true)) {
            Thread thread = new Thread(new Runnable() { // from class: f3
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i) {
                        case 0:
                            int i2 = AlarmManagerSchedulerBroadcastReceiver.f136a;
                            return;
                        default:
                            Process process = null;
                            try {
                                try {
                                    process = Runtime.getRuntime().exec(new String[]{"which", "su"});
                                    uz1.c = Boolean.valueOf(new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null);
                                } catch (Throwable unused) {
                                    uz1.c = Boolean.FALSE;
                                    if (process == null) {
                                        return;
                                    }
                                }
                                try {
                                    process.destroy();
                                    return;
                                } catch (Throwable unused2) {
                                    return;
                                }
                            } catch (Throwable th) {
                                if (process != null) {
                                    try {
                                        process.destroy();
                                    } catch (Throwable unused3) {
                                    }
                                }
                                throw th;
                            }
                    }
                }
            }, "checkRoot1-probe");
            thread.setDaemon(true);
            thread.start();
        }
        return false;
    }

    public static int e0(int i) {
        if (i == 2484) {
            return 14;
        }
        return i < 2484 ? (i - 2407) / 5 : (i / 5) - 1000;
    }

    public static boolean f() {
        String[] strArr = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/system/app/Superuser.apk"};
        for (int i = 0; i < 9; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        return false;
    }

    public static boolean f0(BluetoothAdapter bluetoothAdapter) {
        int isLeAudioSupported;
        isLeAudioSupported = bluetoothAdapter.isLeAudioSupported();
        return isLeAudioSupported == 10;
    }

    public static boolean g() {
        int i;
        int i2;
        int i3;
        String str = Build.VERSION.RELEASE;
        if (str.contains("4.4") || str.contains("5.") || str.contains("6.")) {
            return true;
        }
        if (str.contains("7.") && (i3 = Build.VERSION.SDK_INT) != 24 && i3 != 25) {
            return true;
        }
        if (str.contains("8.") && (i2 = Build.VERSION.SDK_INT) != 26 && i2 != 27) {
            return true;
        }
        if (str.contains("9") && Build.VERSION.SDK_INT != 28) {
            return true;
        }
        if (str.contains("10") && Build.VERSION.SDK_INT != 29) {
            return true;
        }
        if (str.contains("11") && Build.VERSION.SDK_INT != 30) {
            return true;
        }
        if (str.contains("12") && (i = Build.VERSION.SDK_INT) != 31 && i != 32) {
            return true;
        }
        if (!str.contains("13") || Build.VERSION.SDK_INT == 33) {
            return str.contains("14") && Build.VERSION.SDK_INT != 34;
        }
        return true;
    }

    public static boolean g0(Context context) {
        Iterator<ActivityManager.RunningServiceInfo> it = ((ActivityManager) context.getSystemService("activity")).getRunningServices(Integer.MAX_VALUE).iterator();
        while (it.hasNext()) {
            if (BatteryMonitorService.class.getName().equals(it.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    public static String h(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        try {
            Process exec = Runtime.getRuntime().exec(strArr);
            exec.waitFor();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append('\n');
            }
            bufferedReader.close();
        } catch (IOException unused) {
            sb = new StringBuilder("NA");
        } catch (InterruptedException unused2) {
        }
        return sb.toString();
    }

    public static boolean h0(Context context) {
        try {
            return (context.getResources().getConfiguration().uiMode & 48) == 32;
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public static boolean i(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        boolean z = false;
        for (char c2 : str.toCharArray()) {
            z = Character.isDigit(c2);
            if (z) {
                return z;
            }
        }
        return z;
    }

    public static boolean i0(Context context) {
        if (context != null) {
            try {
                if (context.getPackageManager().hasSystemFeature("com.samsung.feature.samsung_experience_mobile")) {
                    return true;
                }
                if (context.getPackageManager().hasSystemFeature(YHJbtPFAANaPQ.psyZFIDZdxAIzk)) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String j(double d2) {
        double d3;
        double d4;
        double d5 = d2 / 1.0E9d;
        if (d5 >= 1.0d) {
            return String.valueOf((int) d5);
        }
        if (d5 < 0.0d) {
            return "-" + j(-d5);
        }
        double d6 = d5;
        double d7 = 1.0d;
        double d8 = 0.0d;
        double d9 = 0.0d;
        double d10 = 1.0d;
        while (true) {
            double floor = Math.floor(d6);
            d3 = (floor * d10) + d8;
            d4 = (floor * d9) + d7;
            d6 = 1.0d / (d6 - floor);
            if (Math.abs(d5 - (d3 / d4)) <= 1.0E-6d * d5) {
                break;
            }
            d7 = d9;
            d9 = d4;
            d8 = d10;
            d10 = d3;
        }
        double d11 = d4 / d3;
        int i = (int) d11;
        if (i >= 5) {
            return d51.q("1/", i);
        }
        return "1/" + new DecimalFormat("0.0").format(d11);
    }

    public static boolean j0(long j) {
        boolean z = true;
        if (j <= 0) {
            return true;
        }
        double d2 = j;
        double d3 = d2 / 1.0E9d;
        double d4 = d2 / 1.073741824E9d;
        int[] iArr = {4, 8, 16, 32, 64, rt0.s, rt0.t, rt0.u, rt0.v, rt0.w, rt0.x};
        double d5 = Double.MAX_VALUE;
        double d6 = Double.MAX_VALUE;
        int i = 0;
        for (int i2 = 11; i < i2; i2 = 11) {
            boolean z2 = z;
            double d7 = iArr[i];
            double abs = Math.abs(d3 - d7) / d7;
            if (abs < d5) {
                d5 = abs;
            }
            double abs2 = Math.abs(d4 - d7) / d7;
            if (abs2 < d6) {
                d6 = abs2;
            }
            i++;
            z = z2;
        }
        boolean z3 = z;
        if (d5 == d6) {
            boolean z4 = j % 1000000 == 0 ? z3 : false;
            boolean z5 = j % 1048576 == 0 ? z3 : false;
            if (z4 && !z5) {
                return z3;
            }
            if (z5 && !z4) {
                return false;
            }
        }
        if (d5 <= d6) {
            return z3;
        }
        return false;
    }

    public static boolean k(Long l) {
        Instant now;
        long epochSecond;
        if (l.longValue() <= 1606780800 || l.longValue() >= 2147472000) {
            return false;
        }
        now = Instant.now();
        epochSecond = now.getEpochSecond();
        return l.longValue() < epochSecond;
    }

    public static int k0() {
        try {
            return Integer.parseInt(K("/sys/devices/system/cpu/possible").substring(r0.length() - 1)) + 1;
        } catch (Exception unused) {
            return 4;
        }
    }

    public static int l(Context context, float f2) {
        return (int) ((context.getResources().getDisplayMetrics().densityDpi / 160.0f) * f2);
    }

    public static String l0() {
        String str = Build.DEVICE;
        if (str.equals(ynLVXgis.gdJjAgrWVUat)) {
            return "Bacon";
        }
        if (str.equals("OnePlusX")) {
            return "Onyx";
        }
        if (str.equals("OnePlus5T")) {
            return "Dumpling";
        }
        if (str.equals("OnePlus5")) {
            return "Cheeseburger";
        }
        if (str.equals("OnePlus6T")) {
            return "Fajita";
        }
        if (str.equals("OnePlus6")) {
            return "Enchilada";
        }
        if (str.equalsIgnoreCase("OnePlus7Pro")) {
            return jYVJoqfHJs.AbcnkvoYCmMQwa;
        }
        if (str.equalsIgnoreCase("OnePlus7TPro")) {
            return "Hotdog";
        }
        if (str.equalsIgnoreCase("OnePlus7")) {
            return "Guacamoleb";
        }
        if (str.equalsIgnoreCase("OnePlus7T")) {
            return "Hotdog";
        }
        String str2 = Build.PRODUCT;
        return str2.contains("OnePlus8T") ? "Kebab" : str2.contains("OnePlus8Pro") ? "Instantnoodlep" : str2.contains("OnePlus8") ? "Instantnoodle" : (str2.equals("Nord") || str2.equals(gXdyRQCGVlHW.upNxesgSdXiJyQ) || str2.equals("Nord_IND")) ? "Avicii" : str2.contains("OnePlus9") ? "Lemonade" : "";
    }

    public static String m(String str) {
        if (!i51.b("prefRoot").booleanValue()) {
            return "EE";
        }
        List c2 = wn1.a(str).o().c();
        return c2.size() > 0 ? (String) c2.get(0) : "NA";
    }

    public static void m0(a5 a5Var) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/account/subscriptions?package=" + a5Var.getPackageName()));
        intent.addFlags(268435456);
        a5Var.startActivity(intent);
    }

    public static ArrayList n(String str) {
        ArrayList arrayList = new ArrayList();
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(new String[]{"sh", "-c", str});
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        process.destroy();
                        return arrayList;
                    }
                    arrayList.add(readLine);
                } finally {
                }
            }
        } catch (Exception unused) {
            if (process != null) {
                process.destroy();
            }
            return arrayList;
        } catch (Throwable th) {
            if (process != null) {
                process.destroy();
            }
            throw th;
        }
    }

    public static Integer n0(String str) {
        if (str == null) {
            return null;
        }
        String lowerCase = str.trim().toLowerCase();
        if (!lowerCase.isEmpty() && !lowerCase.equals("na") && !lowerCase.equals("ee")) {
            try {
                return lowerCase.startsWith("0x") ? Integer.valueOf(Integer.parseInt(lowerCase.substring(2), 16)) : Integer.valueOf(Integer.parseInt(lowerCase));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public static String o(String str) {
        StringBuilder sb = new StringBuilder();
        Process process = null;
        try {
            try {
                Process exec = Runtime.getRuntime().exec(new String[]{"sh", "-c", str});
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            bufferedReader.close();
                            exec.destroy();
                            return sb.toString().trim();
                        }
                        sb.append(readLine);
                        sb.append("\r\n");
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            } catch (Exception unused) {
                String str2 = qJTtDWNCVUDjB.YWDjGrHCobASte;
                if (0 != 0) {
                    process.destroy();
                }
                return str2;
            }
        } catch (Throwable th3) {
            if (0 != 0) {
                process.destroy();
            }
            throw th3;
        }
    }

    public static int o0(Context context, float f2) {
        return (int) (f2 / (context.getResources().getDisplayMetrics().densityDpi / 160.0f));
    }

    public static String p() {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("top -n 1 -m 1 -d 0").getInputStream()));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                if (readLine.contains("Nice")) {
                    sb.append(readLine);
                    sb.append('\n');
                }
            }
            bufferedReader.close();
        } catch (Exception unused) {
        }
        return sb.toString();
    }

    public static String p0(ContentResolver contentResolver, Uri uri) {
        Cursor query = contentResolver.query(uri, null, null, null, null);
        int columnIndex = query.getColumnIndex("_display_name");
        query.moveToFirst();
        String string = query.getString(columnIndex);
        query.close();
        return string;
    }

    public static boolean q(String str) {
        if (str == null) {
            return false;
        }
        boolean exists = new File(str).exists();
        if (!i51.b("prefRoot").booleanValue() || exists || Build.MODEL.contains("Z00")) {
            return exists;
        }
        return m(RIhTGWkqQvGL.XBb + str + CGvJMCDBOmCdj.bmIHbkLEnqYtb).equals("1");
    }

    public static void q0(Context context) {
        Intent intent = ((il1) i51.f()).getBoolean("pref_is_new_user", false) ? new Intent(context, (Class<?>) PaywallActivity.class) : new Intent(context, (Class<?>) ProActivity.class);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public static String r(Application application, String str) {
        Integer n0 = n0(str);
        if (n0 == null || n0.intValue() == 0) {
            return null;
        }
        if (n0.intValue() == 11) {
            return application.getString(R.string.storage_health_life_exceeded);
        }
        if (n0.intValue() < 1 || n0.intValue() > 10) {
            return null;
        }
        return application.getString(R.string.storage_health_life_bucket, Integer.valueOf((n0.intValue() - 1) * 10), Integer.valueOf(n0.intValue() * 10));
    }

    public static void r0(Context context) {
        try {
            Intent intent = new Intent("android.intent.action.POWER_USAGE_SUMMARY");
            intent.addFlags(1350565888);
            if (context.getApplicationContext().getPackageManager().resolveActivity(intent, 0) != null) {
                context.getApplicationContext().startActivity(intent);
            } else if (Build.MANUFACTURER.equalsIgnoreCase("huawei")) {
                Intent intent2 = new Intent();
                intent2.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.systemmanager.power.ui.HwPowerManagerActivity"));
                intent2.addFlags(1350565888);
                context.startActivity(intent2);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.a61 s(android.content.Context r7, int r8) {
        /*
            Method dump skipped, instructions count: 817
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uz1.s(android.content.Context, int):a61");
    }

    public static void s0(Context context) {
        try {
            Intent intent = new Intent("android.settings.DISPLAY_SETTINGS");
            intent.addFlags(1350565888);
            if (context.getApplicationContext().getPackageManager().resolveActivity(intent, 0) != null) {
                context.getApplicationContext().startActivity(intent);
            }
        } catch (Exception unused) {
        }
    }

    public static String t(Context context) {
        switch (Build.VERSION.SDK_INT) {
            case 24:
                return "7";
            case 25:
                return Gvyagftz.EuHc;
            case 26:
                return "8";
            case 27:
                return ILBLnlCHDVqsSN.oQtaadceQ;
            case 28:
                return "9";
            case 29:
                return "10";
            case 30:
                return "11";
            case 31:
            case rt0.q /* 32 */:
                return "12";
            case 33:
                return "13";
            case 34:
                return Build.DISPLAY.startsWith("AP31.24") ? "15" : "14";
            case 35:
                return "15";
            case 36:
                return "16";
            case 37:
                return "17";
            default:
                return context.getString(R.string.unknown);
        }
    }

    public static void t0(Context context) {
        try {
            if (Build.VERSION.SDK_INT == 24 && Build.MANUFACTURER.equals("LGE")) {
                return;
            }
            Intent intent = new Intent("android.settings.APP_MEMORY_USAGE");
            intent.addFlags(1350565888);
            if (context.getApplicationContext().getPackageManager().resolveActivity(intent, 0) != null) {
                context.getApplicationContext().startActivity(intent);
            }
        } catch (Exception unused) {
        }
    }

    public static String u(double d2) {
        try {
            String format = new DecimalFormat("0.000").format(d2);
            switch (format.hashCode()) {
                case 46670579:
                    if (format.equals("1.000")) {
                    }
                    break;
                case 46673558:
                    if (format.equals("1.333")) {
                    }
                    break;
                case 46675384:
                    if (format.equals("1.500")) {
                    }
                    break;
                case 46676345:
                    if (format.equals("1.600")) {
                    }
                    break;
                case 46676538:
                    if (format.equals(oWuW.tpHIFMEceJcwPh)) {
                    }
                    break;
                case 46677313:
                    if (format.equals("1.707")) {
                    }
                    break;
                case 46677531:
                    if (format.equals("1.778")) {
                    }
                    break;
                case 46678267:
                    if (format.equals(qJTtDWNCVUDjB.cPMHcLqpWAo)) {
                    }
                    break;
                case 46679228:
                    if (format.equals("1.900")) {
                        break;
                    }
                    break;
                case 47594100:
                    if (format.equals("2.000")) {
                    }
                    break;
                case 47594261:
                    if (format.equals("2.056")) {
                    }
                    break;
                case 47594321:
                    if (format.equals("2.074")) {
                    }
                    break;
                case 47595093:
                    if (format.equals("2.111")) {
                    }
                    break;
                case 47595189:
                    if (format.equals("2.144")) {
                    }
                    break;
                case 47595254:
                    if (format.equals("2.167")) {
                    }
                    break;
                case 47596086:
                    if (format.equals("2.222")) {
                    }
                    break;
                case 47596090:
                    if (format.equals("2.226")) {
                    }
                    break;
            }
            return "20:9";
        } catch (Exception unused) {
            return "NA";
        }
    }

    public static void u0(Context context) {
        try {
            try {
                Intent intent = new Intent(Gvyagftz.ePc, (Uri) null);
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$WirelessSettingsActivity"));
                intent.addFlags(1350565888);
                context.getApplicationContext().startActivity(intent);
            } catch (Exception unused) {
                Intent intent2 = new Intent("android.settings.WIRELESS_SETTINGS");
                intent2.addFlags(1350565888);
                context.startActivity(intent2);
            }
        } catch (Exception unused2) {
        }
    }

    public static String v(int i, int i2) {
        int i3;
        if (i <= 0 || i2 <= 0) {
            return "NA";
        }
        int max = Math.max(i, i2);
        int min = Math.min(i, i2);
        int abs = Math.abs(max);
        int abs2 = Math.abs(min);
        while (true) {
            int i4 = abs2;
            i3 = abs;
            abs = i4;
            if (abs == 0) {
                break;
            }
            abs2 = i3 % abs;
        }
        if (i3 == 0) {
            i3 = 1;
        }
        int i5 = max / i3;
        int i6 = min / i3;
        double d2 = i5 / i6;
        double[] dArr = {2.2222222222222223d, 2.1666666666666665d, 2.1444444444444444d, 2.111111111111111d, 2.0777777777777775d, 2.0555555555555554d, 2.0d, 2.3333333333333335d, 2.4444444444444446d, 1.9d, 1.7777777777777777d, 1.7d, 1.6d, 1.6666666666666667d, 1.5d, 1.25d, 1.3333333333333333d, 1.0d};
        String[] strArr = {"20:9", "19.5:9", "19.3:9", "19:9", "18.7:9", "18.5:9", "18:9", CDsMEtnUjndKau.hnkG, "22:9", QCeVODiUkb.QEzEVd, "16:9", "17:10", tEegR.hmHHxCKLdV, "15:9", "3:2", "5:4", "4:3", "1:1"};
        double d3 = Double.MAX_VALUE;
        int i7 = -1;
        for (int i8 = 0; i8 < 18; i8++) {
            double abs3 = Math.abs(d2 - dArr[i8]);
            if (abs3 < d3) {
                i7 = i8;
                d3 = abs3;
            }
        }
        if (i7 != -1 && d3 < 0.015d) {
            return strArr[i7];
        }
        return i5 + ":" + i6;
    }

    public static void v0(Context context) {
        try {
            if (!TextUtils.isEmpty(X("ro.miui.ui.version.name")) && Build.VERSION.SDK_INT >= 31) {
                try {
                    Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
                    intent.addCategory("android.intent.category.LAUNCHER");
                    intent.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.optimizecenter.storage.StorageActivity"));
                    intent.addFlags(1350565888);
                    context.getApplicationContext().startActivity(intent);
                    return;
                } catch (Exception unused) {
                    Intent intent2 = new Intent("android.settings.INTERNAL_STORAGE_SETTINGS");
                    intent2.addFlags(1350565888);
                    context.startActivity(intent2);
                    return;
                }
            }
            try {
                try {
                    Intent intent3 = new Intent("android.intent.action.MAIN", (Uri) null);
                    intent3.addCategory("android.intent.category.LAUNCHER");
                    intent3.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$StorageSettingsActivity"));
                    intent3.addFlags(1350565888);
                    context.getApplicationContext().startActivity(intent3);
                } catch (Exception unused2) {
                    Toast.makeText(context, context.getString(R.string.not_found), 0).show();
                }
            } catch (Exception unused3) {
                Intent intent4 = new Intent("android.settings.INTERNAL_STORAGE_SETTINGS");
                intent4.addFlags(1350565888);
                context.startActivity(intent4);
            }
        } catch (Exception unused4) {
        }
    }

    public static String[] w(String str) {
        String[] strArr = new String[0];
        ArrayList arrayList = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str), rt0.u);
            try {
                for (String readLine = bufferedReader.readLine(); readLine != null; readLine = bufferedReader.readLine()) {
                    arrayList.add(readLine);
                }
                bufferedReader.close();
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            } finally {
            }
        } catch (Exception unused) {
            return strArr;
        }
    }

    public static void w0(Context context) {
        try {
            try {
                Intent intent = new Intent();
                if (TextUtils.isEmpty(X("ro.miui.ui.version.name"))) {
                    String str = Build.MANUFACTURER;
                    if (str.equalsIgnoreCase("oneplus")) {
                        intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$OPAboutPhoneActivity"));
                    } else {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 28) {
                            intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.SubSettings")).putExtra(":android:show_fragment", "com.android.settings.deviceinfo.aboutphone.MyDeviceInfoFragment");
                        } else if (str.equalsIgnoreCase(QCeVODiUkb.DcvlFgddIL)) {
                            intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings$DeviceInfoSettingsActivity"));
                        } else if (i >= 26) {
                            intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.SubSettings")).putExtra(":android:show_fragment", "com.android.settings.DeviceInfoSettings");
                        } else {
                            intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.deviceinfo.aboutphone.MyDeviceInfoFragment"));
                        }
                    }
                } else {
                    intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.SubSettings")).putExtra(":android:show_fragment", "com.android.settings.device.MiuiDeviceInfoSettings");
                }
                intent.addFlags(1350565888);
                context.startActivity(intent);
            } catch (Exception unused) {
                Intent intent2 = new Intent("android.settings.DEVICE_INFO_SETTINGS");
                intent2.addFlags(1350565888);
                context.startActivity(intent2);
            }
        } catch (Exception unused2) {
            Intent intent3 = new Intent("android.settings.SETTINGS");
            intent3.addFlags(1350565888);
            try {
                context.startActivity(intent3);
            } catch (ActivityNotFoundException unused3) {
            }
        }
    }

    public static Drawable x(Context context, String str) {
        Bitmap createBitmap;
        BitmapDrawable bitmapDrawable;
        Drawable drawable = null;
        try {
            if (h70.h == null) {
                h70.h = new h70(8, false);
            }
            Drawable drawable2 = (Drawable) ((LruCache) h70.h.g).get(str);
            if (drawable2 != null) {
                return drawable2;
            }
            try {
                drawable = context.createPackageContext(str, 0).getResources().getDrawableForDensity(context.getPackageManager().getApplicationInfo(str, 0).icon, DisplayMetrics.DENSITY_DEVICE_STABLE, null);
                if (drawable instanceof BitmapDrawable) {
                    createBitmap = ((BitmapDrawable) drawable).getBitmap();
                } else {
                    createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawable.draw(canvas);
                }
                bitmapDrawable = new BitmapDrawable(context.getResources(), Bitmap.createScaledBitmap(createBitmap, 64, 64, true));
            } catch (Exception unused) {
                drawable = drawable2;
            }
            try {
                if (h70.h == null) {
                    h70.h = new h70(8, false);
                }
                ((LruCache) h70.h.g).put(str, bitmapDrawable);
                return bitmapDrawable;
            } catch (Exception unused2) {
                drawable = bitmapDrawable;
                try {
                    return context.getDrawable(R.drawable.ic_empty_app);
                } catch (NullPointerException unused3) {
                    return drawable;
                }
            }
        } catch (Exception unused4) {
        }
    }

    public static int x0(int i) {
        switch (i) {
            case 50:
                return 8716;
            case 51:
                return 8765;
            case 52:
                return 4574;
            case 53:
                return 4512;
            case 54:
                return 6493;
            case 55:
                return 2544;
            case 56:
                return 5822;
            case 57:
                return 4877;
            case 58:
                return 4855;
            case 59:
                return 6511;
            case 60:
                return 2036;
            default:
                return 9844;
        }
    }

    public static String y(MainActivity mainActivity) {
        String str = "";
        try {
            for (Signature signature : mainActivity.getPackageManager().getPackageInfo(mainActivity.getPackageName(), 64).signatures) {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA");
                messageDigest.update(signature.toByteArray());
                str = Base64.encodeToString(messageDigest.digest(), 0);
            }
        } catch (Exception unused) {
        }
        return str.trim();
    }

    public static String y0(Long l) {
        Date date = new Date(l.longValue() * 1000);
        Calendar.getInstance().setTime(date);
        return new SimpleDateFormat("MMMM d, y", Locale.getDefault()).format(date);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0929, code lost:
    
        if (r8.equals(r20) != false) goto L424;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x023c, code lost:
    
        if (r8.equals("nokia") != false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x02bf, code lost:
    
        if (r8.equals("along") != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x046f, code lost:
    
        if (r8.equals("gm") != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x05b8, code lost:
    
        if (r8.equals("vgotel") != false) goto L243;
     */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0936 A[Catch: Exception -> 0x00c5, TryCatch #2 {Exception -> 0x00c5, blocks: (B:18:0x0049, B:22:0x00b8, B:25:0x07e5, B:27:0x07eb, B:28:0x07f3, B:32:0x07f8, B:35:0x092b, B:36:0x0800, B:39:0x0808, B:42:0x0810, B:45:0x0818, B:48:0x0820, B:51:0x082a, B:54:0x0832, B:57:0x083a, B:60:0x0842, B:63:0x084a, B:66:0x0852, B:68:0x0858, B:70:0x0860, B:73:0x0868, B:76:0x0870, B:79:0x087a, B:82:0x0884, B:85:0x088e, B:88:0x0898, B:91:0x08a2, B:94:0x08ac, B:97:0x08b6, B:100:0x08c0, B:103:0x08ca, B:106:0x08d3, B:109:0x08dc, B:111:0x08e4, B:113:0x08ef, B:116:0x08f8, B:119:0x0901, B:121:0x0909, B:123:0x0911, B:126:0x091a, B:129:0x0923, B:131:0x0936, B:133:0x0940, B:135:0x094b, B:137:0x00ca, B:139:0x00da, B:141:0x00e4, B:143:0x00f0, B:144:0x00f8, B:146:0x0104, B:147:0x010c, B:149:0x0119, B:150:0x011e, B:151:0x0129, B:155:0x07ac, B:157:0x07b9, B:159:0x07c6, B:160:0x07ce, B:162:0x07d4, B:174:0x0134, B:176:0x013a, B:177:0x0142, B:179:0x0148, B:180:0x0150, B:182:0x0156, B:183:0x015e, B:185:0x0164, B:186:0x016d, B:188:0x0173, B:189:0x017c, B:192:0x023e, B:193:0x0186, B:195:0x018c, B:196:0x0195, B:198:0x019d, B:199:0x01a6, B:201:0x01ae, B:202:0x01b7, B:205:0x0471, B:207:0x01c7, B:210:0x05ba, B:211:0x01d7, B:213:0x01dd, B:214:0x01e6, B:216:0x01ec, B:217:0x01f5, B:219:0x01fd, B:220:0x0206, B:222:0x020c, B:223:0x0215, B:226:0x043f, B:228:0x0225, B:230:0x022d, B:231:0x0236, B:233:0x0247, B:235:0x024d, B:236:0x0256, B:238:0x025f, B:239:0x0268, B:241:0x0270, B:242:0x0279, B:244:0x027f, B:245:0x0288, B:247:0x0290, B:248:0x0299, B:250:0x02a3, B:251:0x02ac, B:254:0x02c1, B:255:0x02b7, B:257:0x02ca, B:259:0x02d4, B:260:0x02dd, B:262:0x02e7, B:265:0x02f9, B:267:0x0305, B:268:0x030d, B:270:0x0319, B:274:0x032b, B:276:0x0337, B:278:0x0348, B:280:0x0354, B:283:0x0363, B:285:0x036f, B:288:0x037d, B:290:0x0389, B:291:0x0391, B:293:0x039d, B:295:0x03aa, B:297:0x03b6, B:299:0x03ca, B:301:0x03d6, B:305:0x03ea, B:307:0x03f6, B:308:0x03fe, B:310:0x040c, B:312:0x041b, B:314:0x0429, B:315:0x0431, B:318:0x044d, B:320:0x045b, B:321:0x0463, B:323:0x0479, B:325:0x0487, B:327:0x0494, B:329:0x04a2, B:330:0x04ab, B:332:0x04b9, B:334:0x04c7, B:336:0x04d5, B:338:0x04e9, B:340:0x04f7, B:344:0x050b, B:346:0x0519, B:347:0x0521, B:349:0x052f, B:350:0x0537, B:352:0x0545, B:353:0x054d, B:355:0x055b, B:356:0x0563, B:358:0x056f, B:359:0x0578, B:361:0x0586, B:362:0x058f, B:364:0x059d, B:366:0x05ac, B:368:0x05c3, B:370:0x05d2, B:371:0x05db, B:373:0x05e9, B:374:0x05f2, B:376:0x0600, B:378:0x060f, B:380:0x061d, B:381:0x0626, B:383:0x0634, B:384:0x063d, B:386:0x064b, B:387:0x0654, B:389:0x0662, B:390:0x066b, B:392:0x0679, B:394:0x0688, B:396:0x0696, B:397:0x069f, B:399:0x06ad, B:400:0x06b6, B:402:0x06c4, B:403:0x06cd, B:405:0x06db, B:407:0x06ea, B:409:0x06f8, B:410:0x0701, B:412:0x070f, B:413:0x0718, B:415:0x0726, B:416:0x072f, B:418:0x073d, B:419:0x0746, B:421:0x0754, B:423:0x0762, B:425:0x0770, B:426:0x0779, B:428:0x0787, B:430:0x0795, B:432:0x07a4), top: B:17:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x07b9 A[Catch: Exception -> 0x00c5, TryCatch #2 {Exception -> 0x00c5, blocks: (B:18:0x0049, B:22:0x00b8, B:25:0x07e5, B:27:0x07eb, B:28:0x07f3, B:32:0x07f8, B:35:0x092b, B:36:0x0800, B:39:0x0808, B:42:0x0810, B:45:0x0818, B:48:0x0820, B:51:0x082a, B:54:0x0832, B:57:0x083a, B:60:0x0842, B:63:0x084a, B:66:0x0852, B:68:0x0858, B:70:0x0860, B:73:0x0868, B:76:0x0870, B:79:0x087a, B:82:0x0884, B:85:0x088e, B:88:0x0898, B:91:0x08a2, B:94:0x08ac, B:97:0x08b6, B:100:0x08c0, B:103:0x08ca, B:106:0x08d3, B:109:0x08dc, B:111:0x08e4, B:113:0x08ef, B:116:0x08f8, B:119:0x0901, B:121:0x0909, B:123:0x0911, B:126:0x091a, B:129:0x0923, B:131:0x0936, B:133:0x0940, B:135:0x094b, B:137:0x00ca, B:139:0x00da, B:141:0x00e4, B:143:0x00f0, B:144:0x00f8, B:146:0x0104, B:147:0x010c, B:149:0x0119, B:150:0x011e, B:151:0x0129, B:155:0x07ac, B:157:0x07b9, B:159:0x07c6, B:160:0x07ce, B:162:0x07d4, B:174:0x0134, B:176:0x013a, B:177:0x0142, B:179:0x0148, B:180:0x0150, B:182:0x0156, B:183:0x015e, B:185:0x0164, B:186:0x016d, B:188:0x0173, B:189:0x017c, B:192:0x023e, B:193:0x0186, B:195:0x018c, B:196:0x0195, B:198:0x019d, B:199:0x01a6, B:201:0x01ae, B:202:0x01b7, B:205:0x0471, B:207:0x01c7, B:210:0x05ba, B:211:0x01d7, B:213:0x01dd, B:214:0x01e6, B:216:0x01ec, B:217:0x01f5, B:219:0x01fd, B:220:0x0206, B:222:0x020c, B:223:0x0215, B:226:0x043f, B:228:0x0225, B:230:0x022d, B:231:0x0236, B:233:0x0247, B:235:0x024d, B:236:0x0256, B:238:0x025f, B:239:0x0268, B:241:0x0270, B:242:0x0279, B:244:0x027f, B:245:0x0288, B:247:0x0290, B:248:0x0299, B:250:0x02a3, B:251:0x02ac, B:254:0x02c1, B:255:0x02b7, B:257:0x02ca, B:259:0x02d4, B:260:0x02dd, B:262:0x02e7, B:265:0x02f9, B:267:0x0305, B:268:0x030d, B:270:0x0319, B:274:0x032b, B:276:0x0337, B:278:0x0348, B:280:0x0354, B:283:0x0363, B:285:0x036f, B:288:0x037d, B:290:0x0389, B:291:0x0391, B:293:0x039d, B:295:0x03aa, B:297:0x03b6, B:299:0x03ca, B:301:0x03d6, B:305:0x03ea, B:307:0x03f6, B:308:0x03fe, B:310:0x040c, B:312:0x041b, B:314:0x0429, B:315:0x0431, B:318:0x044d, B:320:0x045b, B:321:0x0463, B:323:0x0479, B:325:0x0487, B:327:0x0494, B:329:0x04a2, B:330:0x04ab, B:332:0x04b9, B:334:0x04c7, B:336:0x04d5, B:338:0x04e9, B:340:0x04f7, B:344:0x050b, B:346:0x0519, B:347:0x0521, B:349:0x052f, B:350:0x0537, B:352:0x0545, B:353:0x054d, B:355:0x055b, B:356:0x0563, B:358:0x056f, B:359:0x0578, B:361:0x0586, B:362:0x058f, B:364:0x059d, B:366:0x05ac, B:368:0x05c3, B:370:0x05d2, B:371:0x05db, B:373:0x05e9, B:374:0x05f2, B:376:0x0600, B:378:0x060f, B:380:0x061d, B:381:0x0626, B:383:0x0634, B:384:0x063d, B:386:0x064b, B:387:0x0654, B:389:0x0662, B:390:0x066b, B:392:0x0679, B:394:0x0688, B:396:0x0696, B:397:0x069f, B:399:0x06ad, B:400:0x06b6, B:402:0x06c4, B:403:0x06cd, B:405:0x06db, B:407:0x06ea, B:409:0x06f8, B:410:0x0701, B:412:0x070f, B:413:0x0718, B:415:0x0726, B:416:0x072f, B:418:0x073d, B:419:0x0746, B:421:0x0754, B:423:0x0762, B:425:0x0770, B:426:0x0779, B:428:0x0787, B:430:0x0795, B:432:0x07a4), top: B:17:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x07ce A[Catch: Exception -> 0x00c5, TryCatch #2 {Exception -> 0x00c5, blocks: (B:18:0x0049, B:22:0x00b8, B:25:0x07e5, B:27:0x07eb, B:28:0x07f3, B:32:0x07f8, B:35:0x092b, B:36:0x0800, B:39:0x0808, B:42:0x0810, B:45:0x0818, B:48:0x0820, B:51:0x082a, B:54:0x0832, B:57:0x083a, B:60:0x0842, B:63:0x084a, B:66:0x0852, B:68:0x0858, B:70:0x0860, B:73:0x0868, B:76:0x0870, B:79:0x087a, B:82:0x0884, B:85:0x088e, B:88:0x0898, B:91:0x08a2, B:94:0x08ac, B:97:0x08b6, B:100:0x08c0, B:103:0x08ca, B:106:0x08d3, B:109:0x08dc, B:111:0x08e4, B:113:0x08ef, B:116:0x08f8, B:119:0x0901, B:121:0x0909, B:123:0x0911, B:126:0x091a, B:129:0x0923, B:131:0x0936, B:133:0x0940, B:135:0x094b, B:137:0x00ca, B:139:0x00da, B:141:0x00e4, B:143:0x00f0, B:144:0x00f8, B:146:0x0104, B:147:0x010c, B:149:0x0119, B:150:0x011e, B:151:0x0129, B:155:0x07ac, B:157:0x07b9, B:159:0x07c6, B:160:0x07ce, B:162:0x07d4, B:174:0x0134, B:176:0x013a, B:177:0x0142, B:179:0x0148, B:180:0x0150, B:182:0x0156, B:183:0x015e, B:185:0x0164, B:186:0x016d, B:188:0x0173, B:189:0x017c, B:192:0x023e, B:193:0x0186, B:195:0x018c, B:196:0x0195, B:198:0x019d, B:199:0x01a6, B:201:0x01ae, B:202:0x01b7, B:205:0x0471, B:207:0x01c7, B:210:0x05ba, B:211:0x01d7, B:213:0x01dd, B:214:0x01e6, B:216:0x01ec, B:217:0x01f5, B:219:0x01fd, B:220:0x0206, B:222:0x020c, B:223:0x0215, B:226:0x043f, B:228:0x0225, B:230:0x022d, B:231:0x0236, B:233:0x0247, B:235:0x024d, B:236:0x0256, B:238:0x025f, B:239:0x0268, B:241:0x0270, B:242:0x0279, B:244:0x027f, B:245:0x0288, B:247:0x0290, B:248:0x0299, B:250:0x02a3, B:251:0x02ac, B:254:0x02c1, B:255:0x02b7, B:257:0x02ca, B:259:0x02d4, B:260:0x02dd, B:262:0x02e7, B:265:0x02f9, B:267:0x0305, B:268:0x030d, B:270:0x0319, B:274:0x032b, B:276:0x0337, B:278:0x0348, B:280:0x0354, B:283:0x0363, B:285:0x036f, B:288:0x037d, B:290:0x0389, B:291:0x0391, B:293:0x039d, B:295:0x03aa, B:297:0x03b6, B:299:0x03ca, B:301:0x03d6, B:305:0x03ea, B:307:0x03f6, B:308:0x03fe, B:310:0x040c, B:312:0x041b, B:314:0x0429, B:315:0x0431, B:318:0x044d, B:320:0x045b, B:321:0x0463, B:323:0x0479, B:325:0x0487, B:327:0x0494, B:329:0x04a2, B:330:0x04ab, B:332:0x04b9, B:334:0x04c7, B:336:0x04d5, B:338:0x04e9, B:340:0x04f7, B:344:0x050b, B:346:0x0519, B:347:0x0521, B:349:0x052f, B:350:0x0537, B:352:0x0545, B:353:0x054d, B:355:0x055b, B:356:0x0563, B:358:0x056f, B:359:0x0578, B:361:0x0586, B:362:0x058f, B:364:0x059d, B:366:0x05ac, B:368:0x05c3, B:370:0x05d2, B:371:0x05db, B:373:0x05e9, B:374:0x05f2, B:376:0x0600, B:378:0x060f, B:380:0x061d, B:381:0x0626, B:383:0x0634, B:384:0x063d, B:386:0x064b, B:387:0x0654, B:389:0x0662, B:390:0x066b, B:392:0x0679, B:394:0x0688, B:396:0x0696, B:397:0x069f, B:399:0x06ad, B:400:0x06b6, B:402:0x06c4, B:403:0x06cd, B:405:0x06db, B:407:0x06ea, B:409:0x06f8, B:410:0x0701, B:412:0x070f, B:413:0x0718, B:415:0x0726, B:416:0x072f, B:418:0x073d, B:419:0x0746, B:421:0x0754, B:423:0x0762, B:425:0x0770, B:426:0x0779, B:428:0x0787, B:430:0x0795, B:432:0x07a4), top: B:17:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x07eb A[Catch: Exception -> 0x00c5, TryCatch #2 {Exception -> 0x00c5, blocks: (B:18:0x0049, B:22:0x00b8, B:25:0x07e5, B:27:0x07eb, B:28:0x07f3, B:32:0x07f8, B:35:0x092b, B:36:0x0800, B:39:0x0808, B:42:0x0810, B:45:0x0818, B:48:0x0820, B:51:0x082a, B:54:0x0832, B:57:0x083a, B:60:0x0842, B:63:0x084a, B:66:0x0852, B:68:0x0858, B:70:0x0860, B:73:0x0868, B:76:0x0870, B:79:0x087a, B:82:0x0884, B:85:0x088e, B:88:0x0898, B:91:0x08a2, B:94:0x08ac, B:97:0x08b6, B:100:0x08c0, B:103:0x08ca, B:106:0x08d3, B:109:0x08dc, B:111:0x08e4, B:113:0x08ef, B:116:0x08f8, B:119:0x0901, B:121:0x0909, B:123:0x0911, B:126:0x091a, B:129:0x0923, B:131:0x0936, B:133:0x0940, B:135:0x094b, B:137:0x00ca, B:139:0x00da, B:141:0x00e4, B:143:0x00f0, B:144:0x00f8, B:146:0x0104, B:147:0x010c, B:149:0x0119, B:150:0x011e, B:151:0x0129, B:155:0x07ac, B:157:0x07b9, B:159:0x07c6, B:160:0x07ce, B:162:0x07d4, B:174:0x0134, B:176:0x013a, B:177:0x0142, B:179:0x0148, B:180:0x0150, B:182:0x0156, B:183:0x015e, B:185:0x0164, B:186:0x016d, B:188:0x0173, B:189:0x017c, B:192:0x023e, B:193:0x0186, B:195:0x018c, B:196:0x0195, B:198:0x019d, B:199:0x01a6, B:201:0x01ae, B:202:0x01b7, B:205:0x0471, B:207:0x01c7, B:210:0x05ba, B:211:0x01d7, B:213:0x01dd, B:214:0x01e6, B:216:0x01ec, B:217:0x01f5, B:219:0x01fd, B:220:0x0206, B:222:0x020c, B:223:0x0215, B:226:0x043f, B:228:0x0225, B:230:0x022d, B:231:0x0236, B:233:0x0247, B:235:0x024d, B:236:0x0256, B:238:0x025f, B:239:0x0268, B:241:0x0270, B:242:0x0279, B:244:0x027f, B:245:0x0288, B:247:0x0290, B:248:0x0299, B:250:0x02a3, B:251:0x02ac, B:254:0x02c1, B:255:0x02b7, B:257:0x02ca, B:259:0x02d4, B:260:0x02dd, B:262:0x02e7, B:265:0x02f9, B:267:0x0305, B:268:0x030d, B:270:0x0319, B:274:0x032b, B:276:0x0337, B:278:0x0348, B:280:0x0354, B:283:0x0363, B:285:0x036f, B:288:0x037d, B:290:0x0389, B:291:0x0391, B:293:0x039d, B:295:0x03aa, B:297:0x03b6, B:299:0x03ca, B:301:0x03d6, B:305:0x03ea, B:307:0x03f6, B:308:0x03fe, B:310:0x040c, B:312:0x041b, B:314:0x0429, B:315:0x0431, B:318:0x044d, B:320:0x045b, B:321:0x0463, B:323:0x0479, B:325:0x0487, B:327:0x0494, B:329:0x04a2, B:330:0x04ab, B:332:0x04b9, B:334:0x04c7, B:336:0x04d5, B:338:0x04e9, B:340:0x04f7, B:344:0x050b, B:346:0x0519, B:347:0x0521, B:349:0x052f, B:350:0x0537, B:352:0x0545, B:353:0x054d, B:355:0x055b, B:356:0x0563, B:358:0x056f, B:359:0x0578, B:361:0x0586, B:362:0x058f, B:364:0x059d, B:366:0x05ac, B:368:0x05c3, B:370:0x05d2, B:371:0x05db, B:373:0x05e9, B:374:0x05f2, B:376:0x0600, B:378:0x060f, B:380:0x061d, B:381:0x0626, B:383:0x0634, B:384:0x063d, B:386:0x064b, B:387:0x0654, B:389:0x0662, B:390:0x066b, B:392:0x0679, B:394:0x0688, B:396:0x0696, B:397:0x069f, B:399:0x06ad, B:400:0x06b6, B:402:0x06c4, B:403:0x06cd, B:405:0x06db, B:407:0x06ea, B:409:0x06f8, B:410:0x0701, B:412:0x070f, B:413:0x0718, B:415:0x0726, B:416:0x072f, B:418:0x073d, B:419:0x0746, B:421:0x0754, B:423:0x0762, B:425:0x0770, B:426:0x0779, B:428:0x0787, B:430:0x0795, B:432:0x07a4), top: B:17:0x0049 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.drawable.Drawable z(android.content.Context r39) {
        /*
            Method dump skipped, instructions count: 2852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uz1.z(android.content.Context):android.graphics.drawable.Drawable");
    }

    public static String z0(String str) {
        if (str == null || str.equals("Unavailable") || str.equals("EE")) {
            return d10.n().getString(R.string.not_avail);
        }
        try {
            if (str.length() < 4) {
                return str.concat(" MHz");
            }
            if (str.length() < 8) {
                return (Integer.parseInt(str) / 1000) + " MHz";
            }
            return (Integer.parseInt(str) / 1000000) + " MHz";
        } catch (NumberFormatException unused) {
            return "NA";
        }
    }
}
