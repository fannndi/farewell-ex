package flar2.devcheck.ui.shizuku;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Debug;
import android.os.IBinder;
import android.os.Parcel;
import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import android.util.SparseIntArray;
import com.google.android.material.behavior.YqV.Gvyagftz;
import defpackage.a9;
import defpackage.ia1;
import defpackage.p91;
import defpackage.pm1;
import defpackage.rt0;
import defpackage.tn1;
import defpackage.xc1;
import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import flar2.devcheck.ui.root.IShizukuAidlInterface;
import flar2.devcheck.ui.root.ProcessData;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import moe.shizuku.api.hYGD.yttXLrAeLjN;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public class ShizukuProcessService extends Binder implements IShizukuAidlInterface {
    public static final /* synthetic */ int h = 0;
    public final Context g;

    public ShizukuProcessService() {
        this(0);
        throw new IllegalStateException("Shizuku v13 context constructor not used");
    }

    public ShizukuProcessService(int i) {
        attachInterface(this, IShizukuAidlInterface.DESCRIPTOR);
    }

    public ShizukuProcessService(Context context) {
        this(0);
        this.g = context;
    }

    public static boolean a(int i) {
        String readLine;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/cgroup"), rt0.u);
            do {
                try {
                    readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        return false;
                    }
                } finally {
                }
            } while (!readLine.endsWith("/top-app"));
            bufferedReader.close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static long b(String[] strArr, int i) {
        if (i < 0 || i >= strArr.length) {
            return 0L;
        }
        try {
            return Long.parseLong(strArr[i]);
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static int d(int i) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/" + i + jYVJoqfHJs.mNHNo), rt0.v);
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        return 0;
                    }
                    if (readLine.startsWith("VmHWM:")) {
                        String[] split = readLine.split("\\s+");
                        if (split.length >= 2) {
                            int parseInt = Integer.parseInt(split[1]);
                            bufferedReader.close();
                            return parseInt;
                        }
                    }
                } finally {
                }
            }
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int i(int i) {
        String readLine;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/smaps_rollup"), rt0.x);
            do {
                try {
                    readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        return 0;
                    }
                } finally {
                }
            } while (!readLine.startsWith("Pss:"));
            int parseInt = Integer.parseInt(readLine.split("\\s+")[1]);
            bufferedReader.close();
            return parseInt;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int j(int i) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/stat"), rt0.v);
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return 0;
                }
                long b = b(readLine.substring(readLine.lastIndexOf(41) + 2).split("\\s+"), 21);
                if (b < 0) {
                    b = 0;
                }
                int min = (int) Math.min(2147483647L, b * 4);
                bufferedReader.close();
                return min;
            } finally {
            }
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int k(Debug.MemoryInfo memoryInfo, String str) {
        try {
            String memoryStat = memoryInfo.getMemoryStat(str);
            if (memoryStat != null && !memoryStat.isEmpty()) {
                return Integer.parseInt(memoryStat);
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static long[] l(int i) {
        long[] jArr;
        int i2;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/stat"), rt0.v);
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    jArr = new long[]{0, 0, 0};
                } else {
                    int lastIndexOf = readLine.lastIndexOf(41);
                    if (lastIndexOf >= 0 && (i2 = lastIndexOf + 2) < readLine.length()) {
                        String[] split = readLine.substring(i2).split("\\s+");
                        jArr = new long[]{b(split, 19), b(split, 9), b(split, 11) + b(split, 12)};
                    }
                    jArr = new long[]{0, 0, 0};
                }
                bufferedReader.close();
                return jArr;
            } finally {
            }
        } catch (Exception unused) {
            return new long[]{0, 0, 0};
        }
    }

    public static int m(int i) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/status"), rt0.v);
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        return 0;
                    }
                    if (readLine.startsWith("VmSwap:")) {
                        String[] split = readLine.split("\\s+");
                        if (split.length >= 2) {
                            int parseInt = Integer.parseInt(split[1]);
                            bufferedReader.close();
                            return parseInt;
                        }
                    }
                } finally {
                }
            }
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int n(int i) {
        String readLine;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/status"), rt0.u);
            do {
                try {
                    readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        return -1;
                    }
                } finally {
                }
            } while (!readLine.startsWith(GFUHKHDfiFuPm.FxWQKTJxqmAx));
            int parseInt = Integer.parseInt(readLine.split("\\s+")[1]);
            bufferedReader.close();
            return parseInt;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static String o(int i) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/cmdline"), rt0.t);
        } catch (Exception unused) {
        }
        try {
            String readLine = bufferedReader.readLine();
            if (readLine != null && !readLine.isEmpty()) {
                String trim = readLine.replace((char) 0, ' ').trim();
                bufferedReader.close();
                return trim;
            }
            bufferedReader.close();
            try {
                bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/stat"), rt0.t);
                try {
                    String readLine2 = bufferedReader.readLine();
                    if (readLine2 != null) {
                        int indexOf = readLine2.indexOf(40);
                        int lastIndexOf = readLine2.lastIndexOf(41);
                        if (indexOf >= 0 && lastIndexOf > indexOf) {
                            String substring = readLine2.substring(indexOf + 1, lastIndexOf);
                            bufferedReader.close();
                            return substring;
                        }
                    }
                    bufferedReader.close();
                    return null;
                } finally {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            } catch (Exception unused2) {
                return null;
            }
        } finally {
        }
    }

    public static long[] p() {
        long[] jArr;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/stat"), rt0.x);
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null && readLine.startsWith("cpu")) {
                    String[] split = readLine.trim().split("\\s+");
                    long j = 0;
                    for (int i = 1; i < split.length; i++) {
                        j += Long.parseLong(split[i]);
                    }
                    jArr = new long[]{j};
                    bufferedReader.close();
                    return jArr;
                }
                jArr = new long[]{0};
                bufferedReader.close();
                return jArr;
            } finally {
            }
        } catch (Exception unused) {
            return new long[]{0};
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0038, code lost:
    
        r7 = java.lang.Integer.parseInt(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
    
        r10 = new java.io.BufferedReader(new java.io.FileReader("/proc/" + r7 + "/stat"), defpackage.rt0.v);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        r0 = r10.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005f, code lost:
    
        if (r0 != null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0068, code lost:
    
        r0 = r0.substring(r0.lastIndexOf(41) + 2).split("\\s+");
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        r11 = ((b(r0, 11) + b(r0, 12)) + b(r0, 13)) + b(r0, 14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a2, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.HashMap q() {
        /*
            java.util.HashMap r1 = new java.util.HashMap
            r0 = 256(0x100, float:3.59E-43)
            r1.<init>(r0)
            java.io.File r0 = new java.io.File
            java.lang.String r2 = "/proc/"
            r0.<init>(r2)
            java.io.File[] r3 = r0.listFiles()
            if (r3 != 0) goto L16
            goto Lb6
        L16:
            int r4 = r3.length
            r6 = 0
        L18:
            if (r6 >= r4) goto Lb6
            r0 = r3[r6]
            java.lang.String r0 = r0.getName()
            r7 = 0
        L21:
            int r8 = r0.length()
            if (r7 >= r8) goto L38
            char r8 = r0.charAt(r7)
            r9 = 48
            if (r8 < r9) goto Lb2
            r9 = 57
            if (r8 <= r9) goto L35
            goto Lb2
        L35:
            int r7 = r7 + 1
            goto L21
        L38:
            int r7 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> Lb2
            r8 = 0
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L64
            java.io.FileReader r0 = new java.io.FileReader     // Catch: java.lang.Exception -> L64
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L64
            r11.<init>(r2)     // Catch: java.lang.Exception -> L64
            r11.append(r7)     // Catch: java.lang.Exception -> L64
            java.lang.String r12 = "/stat"
            r11.append(r12)     // Catch: java.lang.Exception -> L64
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Exception -> L64
            r0.<init>(r11)     // Catch: java.lang.Exception -> L64
            r11 = 1024(0x400, float:1.435E-42)
            r10.<init>(r0, r11)     // Catch: java.lang.Exception -> L64
            java.lang.String r0 = r10.readLine()     // Catch: java.lang.Throwable -> L98
            if (r0 != 0) goto L66
            r10.close()     // Catch: java.lang.Exception -> L64
        L64:
            r11 = r8
            goto La3
        L66:
            r11 = 41
            int r11 = r0.lastIndexOf(r11)     // Catch: java.lang.Throwable -> L98
            int r11 = r11 + 2
            java.lang.String r0 = r0.substring(r11)     // Catch: java.lang.Throwable -> L98
            java.lang.String r11 = "\\s+"
            java.lang.String[] r0 = r0.split(r11)     // Catch: java.lang.Throwable -> L98
            r11 = 11
            long r11 = b(r0, r11)     // Catch: java.lang.Throwable -> L98
            r13 = 12
            long r13 = b(r0, r13)     // Catch: java.lang.Throwable -> L98
            r15 = 13
            long r15 = b(r0, r15)     // Catch: java.lang.Throwable -> L98
            r5 = 14
            long r17 = b(r0, r5)     // Catch: java.lang.Throwable -> L98
            long r11 = r11 + r13
            long r11 = r11 + r15
            long r11 = r11 + r17
            r10.close()     // Catch: java.lang.Exception -> L64
            goto La3
        L98:
            r0 = move-exception
            r5 = r0
            r10.close()     // Catch: java.lang.Throwable -> L9e
            goto La2
        L9e:
            r0 = move-exception
            r5.addSuppressed(r0)     // Catch: java.lang.Exception -> L64
        La2:
            throw r5     // Catch: java.lang.Exception -> L64
        La3:
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 <= 0) goto Lb2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            java.lang.Long r5 = java.lang.Long.valueOf(r11)
            r1.put(r0, r5)
        Lb2:
            int r6 = r6 + 1
            goto L18
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: flar2.devcheck.ui.shizuku.ShizukuProcessService.q():java.util.HashMap");
    }

    public static int r(int i) {
        BufferedReader bufferedReader;
        String readLine;
        int i2;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/" + i + Gvyagftz.SmFkkWJu), rt0.t);
            try {
                readLine = bufferedReader.readLine();
            } finally {
            }
        } catch (Exception unused) {
        }
        if (readLine == null) {
            bufferedReader.close();
            return 83;
        }
        int lastIndexOf = readLine.lastIndexOf(41);
        if (lastIndexOf >= 0 && (i2 = lastIndexOf + 2) < readLine.length()) {
            char charAt = readLine.charAt(i2);
            if (charAt != 'D' && charAt != 'I' && charAt != 'Z') {
                switch (charAt) {
                }
            }
            bufferedReader.close();
            return charAt;
        }
        bufferedReader.close();
        return 83;
    }

    public static int s(int i) {
        String readLine;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/status"), rt0.u);
            do {
                try {
                    readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        bufferedReader.close();
                        return 0;
                    }
                } finally {
                }
            } while (!readLine.startsWith("Threads:"));
            int parseInt = Integer.parseInt(readLine.split("\\s+")[1]);
            bufferedReader.close();
            return parseInt;
        } catch (Exception unused) {
            return 0;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // flar2.devcheck.ui.root.IShizukuAidlInterface
    public final void destroy() {
        System.exit(0);
    }

    @Override // flar2.devcheck.ui.root.IShizukuAidlInterface
    public final String execute(String str, long j) {
        String str2;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Future submit = newSingleThreadExecutor.submit(new tn1(2, str));
        try {
            try {
                return (String) submit.get(j, TimeUnit.SECONDS);
            } finally {
                submit.cancel(true);
                newSingleThreadExecutor.shutdownNow();
            }
        } catch (InterruptedException e) {
            e = e;
            str2 = "Error: " + e.getMessage();
            return str2;
        } catch (ExecutionException e2) {
            e = e2;
            str2 = "Error: " + e.getMessage();
            return str2;
        } catch (TimeoutException unused) {
            str2 = "Error: Command timed out";
            return str2;
        }
    }

    @Override // flar2.devcheck.ui.root.IShizukuAidlInterface
    public final void exit() {
        System.exit(0);
    }

    @Override // flar2.devcheck.ui.root.IShizukuAidlInterface
    public final List getAllServices() {
        ActivityManager activityManager;
        ComponentName componentName;
        int i;
        Context context = this.g;
        if (context != null && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
            try {
                List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(Integer.MAX_VALUE);
                if (runningServices != null && !runningServices.isEmpty()) {
                    HashSet hashSet = new HashSet();
                    for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                        if (runningServiceInfo != null && (i = runningServiceInfo.pid) > 0) {
                            hashSet.add(Integer.valueOf(i));
                        }
                    }
                    int size = hashSet.size();
                    int[] iArr = new int[size];
                    Iterator it = hashSet.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        iArr[i2] = ((Integer) it.next()).intValue();
                        i2++;
                    }
                    HashMap hashMap = new HashMap();
                    if (size > 0) {
                        try {
                            Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(iArr);
                            if (processMemoryInfo != null) {
                                for (int i3 = 0; i3 < processMemoryInfo.length && i3 < size; i3++) {
                                    Integer valueOf = Integer.valueOf(iArr[i3]);
                                    Debug.MemoryInfo memoryInfo = processMemoryInfo[i3];
                                    hashMap.put(valueOf, Integer.valueOf(memoryInfo != null ? memoryInfo.getTotalPss() : 0));
                                }
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    ArrayList arrayList = new ArrayList(runningServices.size());
                    for (ActivityManager.RunningServiceInfo runningServiceInfo2 : runningServices) {
                        if (runningServiceInfo2 != null && (componentName = runningServiceInfo2.service) != null) {
                            pm1 pm1Var = new pm1();
                            pm1Var.g = runningServiceInfo2.uid;
                            pm1Var.h = runningServiceInfo2.pid;
                            pm1Var.i = componentName.getPackageName();
                            pm1Var.j = runningServiceInfo2.service.getClassName();
                            pm1Var.k = runningServiceInfo2.process;
                            pm1Var.l = runningServiceInfo2.foreground;
                            pm1Var.m = runningServiceInfo2.started;
                            pm1Var.n = runningServiceInfo2.clientCount;
                            pm1Var.o = runningServiceInfo2.activeSince;
                            pm1Var.p = runningServiceInfo2.lastActivityTime;
                            pm1Var.q = runningServiceInfo2.flags;
                            pm1Var.r = runningServiceInfo2.crashCount;
                            Integer num = (Integer) hashMap.get(Integer.valueOf(runningServiceInfo2.pid));
                            pm1Var.s = num != null ? num.intValue() : 0;
                            arrayList.add(pm1Var);
                        }
                    }
                    return arrayList;
                }
                return Collections.EMPTY_LIST;
            } catch (Throwable unused2) {
                return Collections.EMPTY_LIST;
            }
        }
        return Collections.EMPTY_LIST;
    }

    @Override // flar2.devcheck.ui.root.IShizukuAidlInterface
    public final List getProcessData() {
        ActivityManager activityManager;
        Context context = this.g;
        if (context != null && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null || runningAppProcesses.isEmpty()) {
                return Collections.EMPTY_LIST;
            }
            int[] iArr = new int[runningAppProcesses.size()];
            for (int i = 0; i < runningAppProcesses.size(); i++) {
                iArr[i] = runningAppProcesses.get(i).pid;
            }
            Debug.MemoryInfo[] processMemoryInfo = activityManager.getProcessMemoryInfo(iArr);
            ArrayList arrayList = new ArrayList(processMemoryInfo.length);
            int i2 = 0;
            while (i2 < processMemoryInfo.length) {
                String str = (i2 >= runningAppProcesses.size() || runningAppProcesses.get(i2) == null) ? "" : runningAppProcesses.get(i2).processName;
                Debug.MemoryInfo memoryInfo = processMemoryInfo[i2];
                arrayList.add(new ProcessData(iArr[i2], str, memoryInfo != null ? memoryInfo.getTotalPss() / rt0.v : 0));
                i2++;
            }
            arrayList.sort(new a9(19));
            return arrayList;
        }
        return Collections.EMPTY_LIST;
    }

    @Override // flar2.devcheck.ui.root.IShizukuAidlInterface
    public final List getProcessMemInfo(int[] iArr) {
        Debug.MemoryInfo[] memoryInfoArr;
        if (iArr == null || iArr.length == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        int i = 0;
        Context context = this.g;
        if (context == null) {
            int length = iArr.length;
            while (i < length) {
                int i2 = iArr[i];
                p91 p91Var = new p91();
                p91Var.g = i2;
                arrayList.add(p91Var);
                i++;
            }
        } else {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null) {
                int length2 = iArr.length;
                while (i < length2) {
                    int i3 = iArr[i];
                    p91 p91Var2 = new p91();
                    p91Var2.g = i3;
                    arrayList.add(p91Var2);
                    i++;
                }
            } else {
                try {
                    memoryInfoArr = activityManager.getProcessMemoryInfo(iArr);
                } catch (Throwable unused) {
                    memoryInfoArr = null;
                }
                while (i < iArr.length) {
                    p91 p91Var3 = new p91();
                    p91Var3.g = iArr[i];
                    Debug.MemoryInfo memoryInfo = (memoryInfoArr == null || i >= memoryInfoArr.length) ? null : memoryInfoArr[i];
                    if (memoryInfo != null) {
                        p91Var3.h = memoryInfo.getTotalPss();
                        p91Var3.p = k(memoryInfo, "summary.total-swap");
                        p91Var3.i = k(memoryInfo, "summary.java-heap");
                        p91Var3.j = k(memoryInfo, "summary.native-heap");
                        p91Var3.k = k(memoryInfo, "summary.code");
                        p91Var3.l = k(memoryInfo, "summary.stack");
                        p91Var3.m = k(memoryInfo, "summary.graphics");
                        p91Var3.n = k(memoryInfo, "summary.private-other");
                        p91Var3.o = k(memoryInfo, "summary.system");
                    }
                    arrayList.add(p91Var3);
                    i++;
                }
            }
        }
        return arrayList;
    }

    @Override // flar2.devcheck.ui.root.IShizukuAidlInterface
    public final List getServicesForUid(int i) {
        ActivityManager activityManager;
        ComponentName componentName;
        Context context = this.g;
        if (context != null && (activityManager = (ActivityManager) context.getSystemService("activity")) != null) {
            try {
                List<ActivityManager.RunningServiceInfo> runningServices = activityManager.getRunningServices(Integer.MAX_VALUE);
                if (runningServices != null && !runningServices.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (ActivityManager.RunningServiceInfo runningServiceInfo : runningServices) {
                        if (runningServiceInfo != null && (componentName = runningServiceInfo.service) != null && runningServiceInfo.uid == i) {
                            String packageName = componentName.getPackageName();
                            String className = runningServiceInfo.service.getClassName();
                            if (className != null) {
                                if (packageName != null) {
                                    if (className.startsWith(packageName + ".")) {
                                        className = className.substring(packageName.length() + 1);
                                    }
                                }
                                if (!arrayList.contains(className)) {
                                    arrayList.add(className);
                                }
                            }
                        }
                    }
                    return arrayList;
                }
                return Collections.EMPTY_LIST;
            } catch (Throwable unused) {
                return Collections.EMPTY_LIST;
            }
        }
        return Collections.EMPTY_LIST;
    }

    @Override // flar2.devcheck.ui.root.IShizukuAidlInterface
    public final List getTopSnapshot(int i) {
        int max = Math.max(80, Math.min(i, 500));
        try {
            long[] p = p();
            HashMap q = q();
            try {
                Thread.sleep(max);
            } catch (InterruptedException unused) {
            }
            long[] p2 = p();
            HashMap q2 = q();
            long j = p2[0] - p[0];
            if (j <= 0) {
                return new ArrayList();
            }
            PackageManager packageManager = this.g.getPackageManager();
            ArrayList arrayList = new ArrayList(rt0.t);
            for (Map.Entry entry : q2.entrySet()) {
                Integer num = (Integer) entry.getKey();
                int intValue = num.intValue();
                long longValue = ((Long) entry.getValue()).longValue() - (q.get(num) == null ? 0L : ((Long) q.get(num)).longValue());
                if (longValue >= 0) {
                    ia1 ia1Var = new ia1();
                    ia1Var.g = intValue;
                    ia1Var.h = n(intValue);
                    ia1Var.i = o(intValue);
                    try {
                        String[] packagesForUid = packageManager.getPackagesForUid(ia1Var.h);
                        ia1Var.j = (packagesForUid == null || packagesForUid.length <= 0) ? null : packagesForUid[0];
                    } catch (Throwable unused2) {
                    }
                    ia1Var.k = (float) ((longValue / j) * 100.0d);
                    ia1Var.l = j(intValue);
                    ia1Var.m = i(intValue);
                    int i2 = Integer.MIN_VALUE;
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/" + intValue + "/oom_score_adj"), rt0.s);
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                bufferedReader.close();
                            } else {
                                int parseInt = Integer.parseInt(readLine.trim());
                                bufferedReader.close();
                                i2 = parseInt;
                            }
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Exception unused3) {
                    }
                    ia1Var.n = i2;
                    ia1Var.p = r(intValue);
                    ia1Var.q = Math.max(1, s(intValue));
                    ia1Var.o = a(intValue);
                    long[] l = l(intValue);
                    ia1Var.r = l[0];
                    ia1Var.t = l[1];
                    ia1Var.s = l[2];
                    ia1Var.u = m(intValue);
                    ia1Var.v = d(intValue);
                    arrayList.add(ia1Var);
                }
            }
            Collections.sort(arrayList, new a9(20));
            return arrayList;
        } catch (Throwable unused4) {
            return new ArrayList();
        }
    }

    @Override // flar2.devcheck.ui.root.IShizukuAidlInterface
    public final int[] getUidImportance() {
        Context context = this.g;
        if (context == null) {
            return new int[0];
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager == null) {
            return new int[0];
        }
        try {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses != null && !runningAppProcesses.isEmpty()) {
                SparseIntArray sparseIntArray = new SparseIntArray();
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo != null) {
                        int i = sparseIntArray.get(runningAppProcessInfo.uid, Integer.MAX_VALUE);
                        int i2 = runningAppProcessInfo.importance;
                        if (i2 < i) {
                            sparseIntArray.put(runningAppProcessInfo.uid, i2);
                        }
                    }
                }
                int[] iArr = new int[sparseIntArray.size() * 2];
                int i3 = 0;
                int i4 = 0;
                while (i3 < sparseIntArray.size()) {
                    iArr[i4] = sparseIntArray.keyAt(i3);
                    iArr[i4 + 1] = sparseIntArray.valueAt(i3);
                    i3++;
                    i4 += 2;
                }
                return iArr;
            }
            return new int[0];
        } catch (Throwable unused) {
            return new int[0];
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(IShizukuAidlInterface.DESCRIPTOR);
        }
        if (i == 1598968902) {
            parcel2.writeString(IShizukuAidlInterface.DESCRIPTOR);
            return true;
        }
        switch (i) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                destroy();
                parcel2.writeNoException();
                return true;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                exit();
                parcel2.writeNoException();
                return true;
            case 3:
                List<ProcessData> processData = getProcessData();
                parcel2.writeNoException();
                xc1.a(parcel2, processData);
                return true;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                String execute = execute(parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                parcel2.writeString(execute);
                return true;
            case 5:
                String readTextFile = readTextFile(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeString(readTextFile);
                return true;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                List<ia1> topSnapshot = getTopSnapshot(parcel.readInt());
                parcel2.writeNoException();
                xc1.a(parcel2, topSnapshot);
                return true;
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                List<String> servicesForUid = getServicesForUid(parcel.readInt());
                parcel2.writeNoException();
                parcel2.writeStringList(servicesForUid);
                return true;
            case 8:
                List<pm1> allServices = getAllServices();
                parcel2.writeNoException();
                xc1.a(parcel2, allServices);
                return true;
            case rt0.o /* 9 */:
                List<p91> processMemInfo = getProcessMemInfo(parcel.createIntArray());
                parcel2.writeNoException();
                xc1.a(parcel2, processMemInfo);
                return true;
            case 10:
                int[] uidImportance = getUidImportance();
                parcel2.writeNoException();
                parcel2.writeIntArray(uidImportance);
                return true;
            default:
                return super.onTransact(i, parcel, parcel2, i2);
        }
    }

    @Override // flar2.devcheck.ui.root.IShizukuAidlInterface
    public final String readTextFile(String str, int i) {
        String str2 = yttXLrAeLjN.ebNL;
        if (str != null && str.startsWith("/proc/")) {
            if (i <= 0 || i >= 262144) {
                i = 262144;
            }
            StringBuilder sb = new StringBuilder(Math.min(i, rt0.y));
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(str));
                try {
                    byte[] bArr = new byte[rt0.x];
                    while (i > 0) {
                        int read = bufferedInputStream.read(bArr, 0, Math.min(rt0.x, i));
                        if (read <= 0) {
                            break;
                        }
                        sb.append(new String(bArr, 0, read));
                        i -= read;
                    }
                    bufferedInputStream.close();
                    return sb.toString();
                } finally {
                }
            } catch (Throwable unused) {
            }
        }
        return str2;
    }
}
