package defpackage;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.wifi.WifiManager;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.material.bottomappbar.HaCM.rQcwh;
import flar2.devcheck.MainApp;
import flar2.devcheck.R;
import flar2.devcheck.benchmarkSuite.nativebridge.vGm.RIhTGWkqQvGL;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.SocketFactory;

/* loaded from: classes.dex */
public class e21 extends a4 {
    public static final int[] v = {80, 443};
    public final tx0 c;
    public final a21 d;
    public volatile int e;
    public volatile ArrayList f;
    public final EnumSet g;
    public final Object h;
    public long i;
    public final qy0 j;
    public final qy0 k;
    public final qy0 l;
    public final qy0 m;
    public final ExecutorService n;
    public final ArrayList o;
    public final go1 p;
    public a61 q;
    public String r;
    public final ConnectivityManager s;
    public final WifiManager t;
    public final cm0 u;

    public e21(Application application) {
        super(application);
        a21 a21Var = new a21(this);
        this.d = a21Var;
        int i = 1;
        this.e = 1;
        this.g = EnumSet.allOf(bp0.class);
        this.h = new Object();
        this.i = 0L;
        this.j = new qy0();
        this.k = new qy0(Collections.EMPTY_LIST);
        this.l = new qy0(c21.g);
        this.n = Executors.newFixedThreadPool(32);
        this.o = new ArrayList();
        this.r = null;
        Application application2 = this.b;
        application2.getClass();
        this.p = op0.m(application2);
        Application application3 = this.b;
        application3.getClass();
        this.m = new qy0(ts0.b(application3, R.string.network_scan_msg));
        ConnectivityManager connectivityManager = (ConnectivityManager) application.getSystemService("connectivity");
        this.s = connectivityManager;
        this.t = (WifiManager) application.getSystemService("wifi");
        tx0 tx0Var = (tx0) ((MainApp) application).g.h;
        this.c = tx0Var;
        tx0Var.c.add(a21Var);
        if (!TextUtils.isEmpty(tx0Var.f)) {
            u();
        }
        if (connectivityManager != null) {
            cm0 cm0Var = new cm0(i, this);
            this.u = cm0Var;
            try {
                try {
                    connectivityManager.registerDefaultNetworkCallback(cm0Var);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(1).build(), this.u);
            }
        }
        u();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:64|65|(2:68|66)|69|70|(11:73|74|75|77|78|80|81|(1:(2:83|(2:86|87)(1:85))(2:118|119))|(3:115|116|117)(4:89|90|91|(4:101|(1:103)|104|(3:106|107|108)(1:110)))|109|71)|289|122|123|(2:1fe|129)|134|(2:135|136)|(23:240|178|2c4|187|188|189|190|191|192|193|194|195|(1:197)|199|200|201|(7:203|(1:205)|206|(1:208)|209|(1:213)|214)|215|(1:217)(1:229)|218|3f1|223|224)|150|151|26b) */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0360 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:247:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0355 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(defpackage.e21 r22, java.util.concurrent.atomic.AtomicInteger r23, int r24, java.util.List r25, java.lang.String r26, java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e21.d(e21, java.util.concurrent.atomic.AtomicInteger, int, java.util.List, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static boolean e(e21 e21Var, String str) {
        ConnectivityManager connectivityManager = e21Var.s;
        Network network = null;
        if (connectivityManager != null) {
            for (Network network2 : connectivityManager.getAllNetworks()) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network2);
                if (networkCapabilities != null && networkCapabilities.hasCapability(12) && (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3))) {
                    network = network2;
                    break;
                }
            }
        }
        SocketFactory socketFactory = network != null ? network.getSocketFactory() : SocketFactory.getDefault();
        for (int i = 0; i < 2; i++) {
            int i2 = v[i];
            if (Thread.currentThread().isInterrupted()) {
                return false;
            }
            try {
                Socket createSocket = socketFactory.createSocket();
                try {
                    continue;
                    createSocket.connect(new InetSocketAddress(str, i2), 300);
                    createSocket.close();
                    return true;
                } finally {
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public static void f(e21 e21Var, List list) {
        boolean z;
        e21Var.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (e21Var.h) {
            try {
                if (uptimeMillis - e21Var.i >= 350) {
                    e21Var.i = uptimeMillis;
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            e21Var.s(list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(defpackage.cp0 r39) {
        /*
            Method dump skipped, instructions count: 1795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e21.h(cp0):void");
    }

    public static int i(String str, String str2) {
        String str3 = rQcwh.jaIdmm;
        if (str == null && str2 == null) {
            return 0;
        }
        if (str == null) {
            return 1;
        }
        if (str2 == null) {
            return -1;
        }
        try {
            String[] split = str.split(str3);
            String[] split2 = str2.split(str3);
            for (int i = 0; i < 4; i++) {
                int parseInt = Integer.parseInt(split[i]);
                int parseInt2 = Integer.parseInt(split2[i]);
                if (parseInt != parseInt2) {
                    return parseInt - parseInt2;
                }
            }
            return 0;
        } catch (Exception unused) {
            return str.compareTo(str2);
        }
    }

    public static int j(d21 d21Var) {
        int i = !TextUtils.isEmpty(d21Var.f167a) ? 1 : 0;
        if (!TextUtils.isEmpty(d21Var.b)) {
            i++;
        }
        if (!TextUtils.isEmpty(d21Var.c)) {
            i++;
        }
        return !TextUtils.isEmpty(d21Var.e) ? i + 1 : i;
    }

    public static void k(Map map, List list) {
        String trim;
        if (map.isEmpty() || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cp0 cp0Var = (cp0) it.next();
            String str = cp0Var.f147a;
            if (str != null) {
                String trim2 = str.trim();
                List<uk> list2 = (List) map.get(trim2);
                if (list2 == null || list2.isEmpty()) {
                    Iterator it2 = map.entrySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) it2.next();
                        String str2 = (String) entry.getKey();
                        if (str2 != null) {
                            String trim3 = str2.trim();
                            int indexOf = trim3.indexOf(37);
                            if (indexOf != -1) {
                                trim3 = trim3.substring(0, indexOf);
                            }
                            if (trim3.equals(trim2)) {
                                list2 = (List) entry.getValue();
                                break;
                            }
                        }
                    }
                }
                if (list2 != null && !list2.isEmpty()) {
                    cp0Var.u = true;
                    String str3 = "";
                    if (!list2.isEmpty()) {
                        StringBuilder sb = new StringBuilder();
                        HashSet hashSet = new HashSet();
                        for (uk ukVar : list2) {
                            String str4 = ukVar.b;
                            int i = ukVar.d;
                            if (str4 == null) {
                                trim = "";
                            } else {
                                trim = str4.trim();
                                if (trim.startsWith("_")) {
                                    trim = trim.substring(1);
                                }
                                int indexOf2 = trim.indexOf("._tcp.");
                                if (indexOf2 == -1) {
                                    indexOf2 = trim.indexOf("._udp.");
                                }
                                if (indexOf2 != -1) {
                                    trim = trim.substring(0, indexOf2);
                                }
                            }
                            if (!trim.isEmpty()) {
                                if (hashSet.add(trim + ":" + i)) {
                                    if (sb.length() > 0) {
                                        sb.append('\n');
                                    }
                                    sb.append(trim);
                                    if (i > 0) {
                                        sb.append(" (");
                                        sb.append(i);
                                        sb.append(')');
                                    }
                                }
                            }
                        }
                        str3 = sb.toString();
                    }
                    if (!str3.isEmpty()) {
                        cp0Var.w = str3;
                    }
                    String str5 = ((uk) list2.get(0)).f1047a;
                    if (str5 != null && !str5.isEmpty()) {
                        cp0Var.v = str5;
                    }
                }
            }
        }
    }

    public static void m(List list) {
        String str;
        int v2;
        int i;
        int i2;
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cp0 cp0Var = (cp0) it.next();
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            String str2 = cp0Var.f147a;
            if (!TextUtils.isEmpty(str2)) {
                try {
                    DatagramSocket datagramSocket = new DatagramSocket();
                    try {
                        datagramSocket.setSoTimeout(500);
                        datagramSocket.connect(new InetSocketAddress(str2, 137));
                        byte[] bArr = new byte[50];
                        bArr[0] = 0;
                        bArr[1] = 0;
                        bArr[2] = 0;
                        bArr[3] = 0;
                        bArr[4] = 0;
                        bArr[5] = 1;
                        bArr[6] = 0;
                        bArr[7] = 0;
                        bArr[8] = 0;
                        bArr[9] = 0;
                        bArr[10] = 0;
                        bArr[11] = 0;
                        int i3 = 12;
                        bArr[12] = 32;
                        byte[] bytes = "CKAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA".getBytes(StandardCharsets.US_ASCII);
                        System.arraycopy(bytes, 0, bArr, 13, bytes.length);
                        int length = bytes.length;
                        bArr[length + 13] = 0;
                        bArr[length + 14] = 0;
                        bArr[length + 15] = 33;
                        bArr[length + 16] = 0;
                        bArr[length + 17] = 1;
                        datagramSocket.send(new DatagramPacket(bArr, length + 18));
                        byte[] bArr2 = new byte[576];
                        DatagramPacket datagramPacket = new DatagramPacket(bArr2, 576);
                        datagramSocket.receive(datagramPacket);
                        int length2 = datagramPacket.getLength();
                        if (length2 >= 57) {
                            int i4 = ((bArr2[4] & 255) << 8) | (bArr2[5] & 255);
                            if ((((bArr2[6] & 255) << 8) | (bArr2[7] & 255)) > 0) {
                                int i5 = 0;
                                while (true) {
                                    if (i5 < i4) {
                                        int v3 = v(bArr2, i3, length2);
                                        if (v3 < 0 || (i3 = v3 + 4) > length2) {
                                            break;
                                        } else {
                                            i5++;
                                        }
                                    } else if (i3 < length2 && (v2 = v(bArr2, i3, length2)) >= 0 && (i = v2 + 10) <= length2) {
                                        int i6 = ((bArr2[v2] & 255) << 8) | (bArr2[v2 + 1] & 255);
                                        int i7 = ((bArr2[v2 + 2] & 255) << 8) | (bArr2[v2 + 3] & 255);
                                        int i8 = ((bArr2[v2 + 8] & 255) << 8) | (bArr2[v2 + 9] & 255);
                                        if (i6 == 33 && i7 == 1 && i8 > 0 && (i2 = i8 + i) <= length2) {
                                            int i9 = bArr2[i] & 255;
                                            int i10 = v2 + 11;
                                            int i11 = 0;
                                            String str3 = null;
                                            while (i11 < i9) {
                                                int i12 = i10 + 18;
                                                if (i12 > i2) {
                                                    break;
                                                }
                                                String str4 = new String(bArr2, i10, 15, StandardCharsets.US_ASCII);
                                                int i13 = bArr2[i10 + 15] & 255;
                                                String trim = str4.trim();
                                                if (!trim.isEmpty() && !"*".equals(trim)) {
                                                    if (i13 == 32 || i13 == 0) {
                                                        datagramSocket.close();
                                                        str = trim;
                                                        break;
                                                    } else if (str3 == null) {
                                                        str3 = trim;
                                                    }
                                                }
                                                i11++;
                                                i10 = i12;
                                            }
                                            datagramSocket.close();
                                            str = str3;
                                        }
                                    }
                                }
                            }
                        }
                        datagramSocket.close();
                    } catch (Throwable th) {
                        try {
                            datagramSocket.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception unused) {
                }
                str = null;
                if (!TextUtils.isEmpty(str)) {
                    cp0Var.x = true;
                    cp0Var.y = str;
                }
            }
        }
    }

    public static String p(String str) {
        int indexOf;
        int indexOf2;
        String lowerCase = str.toLowerCase(Locale.US);
        int indexOf3 = lowerCase.indexOf("<title");
        if (indexOf3 >= 0 && (indexOf = lowerCase.indexOf(">", indexOf3)) >= 0 && (indexOf2 = lowerCase.indexOf("</title>", indexOf)) >= 0) {
            String replaceAll = str.substring(indexOf + 1, indexOf2).trim().replaceAll("\\s+", " ");
            if (!replaceAll.isEmpty()) {
                return replaceAll;
            }
        }
        return null;
    }

    public static int v(byte[] bArr, int i, int i2) {
        if (i >= i2) {
            return -1;
        }
        if ((bArr[i] & 192) == 192) {
            if (i + 1 >= i2) {
                return -1;
            }
            return i + 2;
        }
        while (i < i2) {
            int i3 = bArr[i] & 255;
            int i4 = i + 1;
            if (i3 == 0) {
                return i4;
            }
            i = i4 + i3;
            if (i > i2) {
                return -1;
            }
        }
        return i;
    }

    @Override // defpackage.i72
    public final void b() {
        ConnectivityManager connectivityManager;
        g();
        this.n.shutdownNow();
        cm0 cm0Var = this.u;
        if (cm0Var != null && (connectivityManager = this.s) != null) {
            try {
                connectivityManager.unregisterNetworkCallback(cm0Var);
            } catch (Exception unused) {
            }
        }
        this.c.c.remove(this.d);
    }

    public final void g() {
        synchronized (this.o) {
            try {
                ArrayList arrayList = this.o;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Future future = (Future) obj;
                    if (future != null && !future.isDone()) {
                        future.cancel(true);
                    }
                }
                this.o.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(List list, String str, String str2, String str3) {
        boolean contains;
        HashMap t = t();
        if (t.isEmpty()) {
            return;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cp0 cp0Var = (cp0) it.next();
            String str4 = cp0Var.c;
            if (!TextUtils.isEmpty(str4)) {
                hashMap.put(str4.toLowerCase(), cp0Var);
            }
            String str5 = cp0Var.f147a;
            if (!TextUtils.isEmpty(str5)) {
                hashMap2.put(str5, cp0Var);
            }
            String str6 = cp0Var.j;
            if (!TextUtils.isEmpty(str6)) {
                hashMap2.put(str6, cp0Var);
            }
        }
        for (Map.Entry entry : t.entrySet()) {
            String str7 = (String) entry.getKey();
            String str8 = (String) entry.getValue();
            if (!TextUtils.isEmpty(str7) && (!(contains = str7.contains(":")) || !str7.startsWith("fe80:"))) {
                cp0 cp0Var2 = (cp0) hashMap2.get(str7);
                if (cp0Var2 != null) {
                    if (contains && TextUtils.isEmpty(cp0Var2.j)) {
                        cp0Var2.j = str7;
                    }
                    if (!TextUtils.isEmpty(str8) && TextUtils.isEmpty(cp0Var2.c)) {
                        cp0Var2.c = str8;
                    }
                } else {
                    cp0 cp0Var3 = !TextUtils.isEmpty(str8) ? (cp0) hashMap.get(str8.toLowerCase()) : null;
                    if (cp0Var3 != null) {
                        if (contains && TextUtils.isEmpty(cp0Var3.j)) {
                            cp0Var3.j = str7;
                        }
                        hashMap2.put(str7, cp0Var3);
                    } else if (!contains && (str == null || str7.startsWith(str))) {
                        cp0 cp0Var4 = new cp0(str7, null);
                        if (!TextUtils.isEmpty(str8)) {
                            cp0Var4.c = str8;
                        }
                        if (str7.equals(str2)) {
                            cp0Var4.e = true;
                        }
                        if (str7.equals(str3)) {
                            cp0Var4.f = true;
                        }
                        list.add(cp0Var4);
                        if (!TextUtils.isEmpty(str8)) {
                            hashMap.put(str8.toLowerCase(), cp0Var4);
                        }
                        hashMap2.put(str7, cp0Var4);
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0464 A[Catch: Exception -> 0x046d, TRY_ENTER, TryCatch #0 {Exception -> 0x046d, blocks: (B:131:0x0464, B:140:0x046a), top: B:129:0x0462 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0475 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0497  */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(java.util.HashMap r40, java.util.List r41) {
        /*
            Method dump skipped, instructions count: 1499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e21.n(java.util.HashMap, java.util.List):void");
    }

    public final void o(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cp0 cp0Var = (cp0) it.next();
            String str = cp0Var.c;
            if (!TextUtils.isEmpty(str) && TextUtils.isEmpty(cp0Var.d)) {
                String substring = str.toUpperCase().replace(RIhTGWkqQvGL.GpTJkozIFdX, "").substring(0, 6);
                Application application = this.b;
                application.getClass();
                String S = uz1.S(application, substring);
                if (!TextUtils.isEmpty(S)) {
                    cp0Var.d = S;
                }
            }
        }
    }

    public final void q(List list) {
        a61 a61Var;
        if (list.isEmpty() || (a61Var = this.q) == null) {
            return;
        }
        String str = (String) a61Var.b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cp0 cp0Var = (cp0) it.next();
            String str2 = cp0Var.c;
            if (!TextUtils.isEmpty(str2) && lowerCase.equals(str2.toLowerCase(Locale.US))) {
                cp0Var.h = true;
                String str3 = cp0Var.b;
                if (str3 == null || str3.isEmpty()) {
                    if (!TextUtils.isEmpty(this.r)) {
                        cp0Var.b = this.r;
                    }
                }
            }
        }
    }

    public final void r(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            this.k.i(Collections.EMPTY_LIST);
            return;
        }
        this.f = new ArrayList(arrayList);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gp0 gp0Var = (gp0) obj;
            cp0 cp0Var = gp0Var.k;
            if (cp0Var.i == 1) {
                arrayList2.add(gp0Var);
            } else {
                bp0 bp0Var = cp0Var.A;
                if (bp0Var == null || this.g.contains(bp0Var)) {
                    arrayList3.add(gp0Var);
                }
            }
        }
        int A = d51.A(this.e);
        Collections.sort(arrayList3, A != 1 ? A != 2 ? A != 3 ? new a9(12) : new a9(11) : Comparator.comparingInt(new t8(this)).thenComparing(new s8(5)) : new a9(10));
        ArrayList arrayList4 = new ArrayList(arrayList3.size() + arrayList2.size());
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        this.k.i(arrayList4);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(java.util.List r19) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e21.s(java.util.List):void");
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0088 A[Catch: all -> 0x00ba, TryCatch #3 {all -> 0x00ba, blocks: (B:20:0x0082, B:22:0x0088, B:25:0x0093, B:28:0x009e, B:31:0x00a8, B:33:0x00ac, B:35:0x00b7, B:41:0x00bc, B:43:0x00c1, B:47:0x00cb, B:48:0x00d4, B:51:0x00db, B:54:0x00e4, B:45:0x00d0), top: B:19:0x0082, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e8 A[EDGE_INSN: B:73:0x00e8->B:74:0x00e8 BREAK  A[LOOP:1: B:19:0x0082->B:39:0x0082], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap t() {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e21.t():java.util.HashMap");
    }

    /* JADX WARN: Code restructure failed: missing block: B:334:0x0577, code lost:
    
        if (r6.isEmpty() != false) goto L237;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x054f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x06e5  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0741  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            Method dump skipped, instructions count: 1902
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e21.u():void");
    }

    public final void w() {
        Network activeNetwork;
        LinkProperties linkProperties;
        x11 x11Var = (x11) this.j.d();
        if (x11Var == null || x11Var.i == null) {
            this.l.i(c21.k);
            qy0 qy0Var = this.m;
            Application application = this.b;
            application.getClass();
            qy0Var.i(ts0.b(application, R.string.no_network_info_available));
            return;
        }
        if (TextUtils.isEmpty(x11Var.g) || TextUtils.isEmpty(x11Var.h)) {
            this.l.i(c21.j);
            qy0 qy0Var2 = this.m;
            Application application2 = this.b;
            application2.getClass();
            qy0Var2.i(ts0.b(application2, R.string.not_connected));
            return;
        }
        g();
        synchronized (this.h) {
            this.i = 0L;
        }
        this.l.i(c21.h);
        qy0 qy0Var3 = this.m;
        Application application3 = this.b;
        application3.getClass();
        qy0Var3.i(ts0.b(application3, R.string.scanning));
        this.k.i(Collections.EMPTY_LIST);
        String str = x11Var.i;
        if (str == null) {
            this.l.i(c21.k);
            qy0 qy0Var4 = this.m;
            Application application4 = this.b;
            application4.getClass();
            qy0Var4.i(ts0.b(application4, R.string.no_subnet_information));
            return;
        }
        String str2 = x11Var.g;
        String str3 = x11Var.h;
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        Set synchronizedSet = Collections.synchronizedSet(new HashSet());
        Application application5 = this.b;
        application5.getClass();
        ConnectivityManager connectivityManager = (ConnectivityManager) application5.getSystemService("connectivity");
        String str4 = null;
        if (connectivityManager != null && (activeNetwork = connectivityManager.getActiveNetwork()) != null && (linkProperties = connectivityManager.getLinkProperties(activeNetwork)) != null) {
            Iterator<LinkAddress> it = linkProperties.getLinkAddresses().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InetAddress address = it.next().getAddress();
                if ((address instanceof Inet6Address) && !address.isLinkLocalAddress() && !address.isLoopbackAddress()) {
                    str4 = address.getHostAddress();
                    break;
                }
            }
        }
        String str5 = str4;
        String str6 = this.r;
        cp0 cp0Var = new cp0();
        cp0Var.A = bp0.g;
        cp0Var.B = -1L;
        cp0Var.b = str6;
        cp0Var.i = 1;
        synchronizedList.add(cp0Var);
        ArrayList arrayList = new ArrayList();
        for (int i = 1; i <= 254; i++) {
            String str7 = str + i;
            if (!synchronizedSet.contains(str7)) {
                arrayList.add(str7);
            }
        }
        int size = arrayList.size();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        synchronized (this.o) {
            try {
                this.o.clear();
                int size2 = arrayList.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    this.o.add(this.n.submit(new b21(this, atomicInteger, size, synchronizedList, str, str2, str3, (String) arrayList.get(i2), str5, synchronizedSet)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
