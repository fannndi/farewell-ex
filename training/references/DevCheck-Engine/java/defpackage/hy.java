package defpackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class hy {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f405a = Pattern.compile("cpu\\d+");
    public static volatile int[] b;

    public static int[] a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        if (availableProcessors <= 0) {
            availableProcessors = 1;
        }
        int[] iArr = new int[availableProcessors];
        for (int i = 0; i < availableProcessors; i++) {
            iArr[i] = i;
        }
        return iArr;
    }

    public static int[] b() {
        int[] e = e();
        if (e == null || e.length == 0) {
            return new int[]{-1};
        }
        int i = -1;
        int i2 = 0;
        for (int i3 = 0; i3 < e.length; i3++) {
            int i4 = e[i3];
            if (i4 > i2) {
                i = i3;
                i2 = i4;
            }
        }
        int[] iArr = new int[1];
        if (i >= 0) {
            iArr[0] = i;
            return iArr;
        }
        iArr[0] = -1;
        return iArr;
    }

    public static int c(String str) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return 0;
                }
                int parseInt = Integer.parseInt(readLine.trim());
                bufferedReader.close();
                return parseInt;
            } finally {
            }
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] d() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hy.d():int[]");
    }

    public static int[] e() {
        int[] iArr = b;
        if (iArr != null) {
            return iArr;
        }
        synchronized (hy.class) {
            try {
                if (b != null) {
                    return b;
                }
                int[] d = d();
                if (d == null) {
                    d = new int[0];
                }
                b = d;
                return b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
