package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.NetworkRequest;
import android.os.Build;
import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import flar2.devcheck.dpreference.Eg.aEQQDLUUMo;
import flar2.devcheck.gpu.mali.MaliInfo;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class k32 implements l82 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f512a = new int[0];
    public static final long[] b = new long[0];
    public static final Object[] c = new Object[0];
    public static final pt0 d = new pt0(1);
    public static final pt0 e = new pt0(2);
    public static final Object f = new Object();
    public static boolean g;
    public static int h;
    public static MaliInfo i;

    public k32() {
        new ConcurrentHashMap();
    }

    public static boolean A(int i2, Object obj) {
        if (obj instanceof wf0) {
            if ((obj instanceof xf0 ? ((xf0) obj).b() : obj instanceof af0 ? 0 : obj instanceof lf0 ? 1 : obj instanceof pf0 ? 2 : obj instanceof qf0 ? 3 : obj instanceof rf0 ? 4 : obj instanceof ac2 ? 6 : -1) == i2) {
                return true;
            }
        }
        return false;
    }

    public static final Object B(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static Class C(Class cls) {
        return cls == Integer.TYPE ? Integer.class : cls == Float.TYPE ? Float.class : cls == Byte.TYPE ? Byte.class : cls == Double.TYPE ? Double.class : cls == Long.TYPE ? Long.class : cls == Character.TYPE ? Character.class : cls == Boolean.TYPE ? Boolean.class : cls == Short.TYPE ? Short.class : cls == Void.TYPE ? Void.class : cls;
    }

    public static boolean D(byte b2) {
        return b2 > -65;
    }

    public static bm d(int i2, xl xlVar, int i3) {
        int i4 = i3 & 2;
        xl xlVar2 = xl.g;
        if (i4 != 0) {
            xlVar = xlVar2;
        }
        if (i2 == -2) {
            if (xlVar != xlVar2) {
                return new lu(1, xlVar);
            }
            ap.f46a.getClass();
            return new bm(zo.b);
        }
        if (i2 != -1) {
            return i2 != 0 ? i2 != Integer.MAX_VALUE ? xlVar == xlVar2 ? new bm(i2) : new lu(i2, xlVar) : new bm(Integer.MAX_VALUE) : xlVar == xlVar2 ? new bm(0) : new lu(1, xlVar);
        }
        if (xlVar == xlVar2) {
            return new lu(1, xl.h);
        }
        c.m("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    public static final bx e(qx qxVar) {
        if (qxVar.r(pg0.k) == null) {
            qxVar = qxVar.o(je2.a());
        }
        return new bx(qxVar);
    }

    public static void f(int i2, int i3) {
        String a2;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                a2 = ju0.a("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    c.m(d51.q("negative size: ", i3));
                    return;
                }
                a2 = ju0.a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(a2);
        }
    }

    public static void g(int i2, Object obj) {
        if (obj == null || A(i2, obj)) {
            return;
        }
        ClassCastException classCastException = new ClassCastException(d51.s(obj.getClass().getName(), " cannot be cast to ", d51.q("kotlin.jvm.functions.Function", i2)));
        ym0.y(classCastException, k32.class.getName());
        throw classCastException;
    }

    public static final int h(int i2, int i3, int[] iArr) {
        iArr.getClass();
        int i4 = i2 - 1;
        int i5 = 0;
        while (i5 <= i4) {
            int i6 = (i5 + i4) >>> 1;
            int i7 = iArr[i6];
            if (i7 < i3) {
                i5 = i6 + 1;
            } else {
                if (i7 <= i3) {
                    return i6;
                }
                i4 = i6 - 1;
            }
        }
        return ~i5;
    }

    public static final int i(long[] jArr, int i2, long j) {
        jArr.getClass();
        int i3 = i2 - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            long j2 = jArr[i5];
            if (j2 < j) {
                i4 = i5 + 1;
            } else {
                if (j2 <= j) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static void j(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? r(i2, "start index", i4) : (i3 < 0 || i3 > i4) ? r(i3, "end index", i4) : ju0.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public static void k(InputStream inputStream) {
        while (inputStream.available() != 0) {
            try {
                inputStream.skip(inputStream.available());
            } catch (IOException unused) {
                return;
            }
        }
    }

    public static final int l(aj1 aj1Var, String str) {
        aj1Var.getClass();
        int columnCount = aj1Var.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount) {
                i2 = -1;
                break;
            }
            if (str.equals(aj1Var.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        String str2 = GFUHKHDfiFuPm.NYBdjnpKl + str + '`';
        int columnCount2 = aj1Var.getColumnCount();
        int i3 = 0;
        while (true) {
            if (i3 >= columnCount2) {
                i3 = -1;
                break;
            }
            if (str2.equals(aj1Var.getColumnName(i3))) {
                break;
            }
            i3++;
        }
        if (i3 >= 0) {
            return i3;
        }
        if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = aj1Var.getColumnCount();
            String concat = ".".concat(str);
            String str3 = "." + str + '`';
            for (int i4 = 0; i4 < columnCount3; i4++) {
                String columnName = aj1Var.getColumnName(i4);
                if (columnName.length() >= str.length() + 2 && (columnName.endsWith(concat) || (columnName.charAt(0) == '`' && columnName.endsWith(str3)))) {
                    return i4;
                }
            }
        }
        return -1;
    }

    public static h21 q(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i2 : iArr) {
            try {
                builder.addCapability(i2);
            } catch (IllegalArgumentException unused) {
                ai1 h2 = ai1.h();
                int i3 = h21.b;
                int i4 = h21.b;
                h2.getClass();
            }
        }
        int[] iArr3 = xc1.b;
        for (int i5 = 0; i5 < 3; i5++) {
            int i6 = iArr3[i5];
            int length = iArr.length;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    i7 = -1;
                    break;
                }
                if (i6 == iArr[i7]) {
                    break;
                }
                i7++;
            }
            if (i7 < 0) {
                try {
                    builder.removeCapability(i6);
                } catch (IllegalArgumentException unused2) {
                    ai1 h3 = ai1.h();
                    int i8 = h21.b;
                    int i9 = h21.b;
                    h3.getClass();
                }
            }
        }
        for (int i10 : iArr2) {
            builder.addTransportType(i10);
        }
        NetworkRequest build = builder.build();
        build.getClass();
        return new h21(build);
    }

    public static String r(int i2, String str, int i3) {
        if (i2 < 0) {
            return ju0.a("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return ju0.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        c.m(d51.q("negative size: ", i3));
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r1.k(r11, r0) == r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0051, B:20:0x0066, B:22:0x006e, B:24:0x0074, B:26:0x007a, B:28:0x008b, B:30:0x0093, B:31:0x009a, B:32:0x009c, B:33:0x009d, B:34:0x00a4, B:42:0x0046, B:44:0x004d), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0088 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(defpackage.tb0 r8, defpackage.ap r9, boolean r10, defpackage.ex r11) {
        /*
            Method dump skipped, instructions count: 200
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k32.s(tb0, ap, boolean, ex):java.lang.Object");
    }

    public static String t(String str) {
        StringBuilder sb = new StringBuilder("'");
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '\'') {
                sb.append("'\\''");
            } else {
                sb.append(charAt);
            }
        }
        sb.append('\'');
        return sb.toString();
    }

    public static yc0 u(yc0[] yc0VarArr, int i2) {
        int i3 = (i2 & 1) == 0 ? 400 : 700;
        boolean z = (i2 & 2) != 0;
        yc0 yc0Var = null;
        int i4 = Integer.MAX_VALUE;
        for (yc0 yc0Var2 : yc0VarArr) {
            int abs = (Math.abs(yc0Var2.c - i3) * 2) + (yc0Var2.d == z ? 0 : 1);
            if (yc0Var == null || i4 > abs) {
                yc0Var = yc0Var2;
                i4 = abs;
            }
        }
        return yc0Var;
    }

    public static int v(boolean z) {
        String z2 = z("ro.boot.vbmeta.device_state");
        if (!z2.isEmpty() && "unlocked".equals(z2.trim().toLowerCase(Locale.US))) {
            return 2;
        }
        String z3 = z("ro.boot.flash.locked");
        if (!z3.isEmpty() && "0".equals(z3.trim())) {
            return 2;
        }
        String z4 = z("ro.boot.verifiedbootstate");
        if (z4.isEmpty()) {
            return 3;
        }
        String lowerCase = z4.trim().toLowerCase(Locale.US);
        if ("orange".equals(lowerCase) || "yellow".equals(lowerCase) || "red".equals(lowerCase)) {
            return 2;
        }
        return (!"green".equals(lowerCase) || z) ? 3 : 1;
    }

    public static final int w(aj1 aj1Var, String str) {
        aj1Var.getClass();
        int l = l(aj1Var, str);
        if (l >= 0) {
            return l;
        }
        int columnCount = aj1Var.getColumnCount();
        ArrayList arrayList = new ArrayList(columnCount);
        for (int i2 = 0; i2 < columnCount; i2++) {
            arrayList.add(aj1Var.getColumnName(i2));
        }
        c.k("Column '", str, "' does not exist. Available columns: [", yr.Z(arrayList, null, null, null, null, 63), 93);
        return 0;
    }

    public static Drawable x(Context context, int i2) {
        return fg1.b().c(context, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r3 = r3.getRoundedCorner(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ei1 y(android.view.Display r3, int r4) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            r2 = 0
            if (r0 < r1) goto L36
            android.view.RoundedCorner r3 = defpackage.hf.i(r3, r4)
            if (r3 == 0) goto L36
            ei1 r4 = new ei1
            int r0 = defpackage.hf.y(r3)
            if (r0 == 0) goto L29
            r1 = 1
            if (r0 == r1) goto L2a
            r1 = 2
            if (r0 == r1) goto L2a
            r1 = 3
            if (r0 != r1) goto L1f
            goto L2a
        L1f:
            java.lang.String r3 = "Invalid position: "
            java.lang.String r3 = defpackage.d51.q(r3, r0)
            defpackage.c.m(r3)
            return r2
        L29:
            r1 = 0
        L2a:
            int r0 = defpackage.hf.D(r3)
            android.graphics.Point r3 = defpackage.hf.d(r3)
            r4.<init>(r1, r0, r3)
            return r4
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k32.y(android.view.Display, int):ei1");
    }

    public static String z(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod(aEQQDLUUMo.NUZqm, String.class, String.class).invoke(null, str, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // defpackage.l82
    public void b() {
    }

    @Override // defpackage.l82
    public void c() {
    }

    public abstract Typeface m(Context context, vc0 vc0Var, Resources resources, int i2);

    public abstract Typeface n(Context context, yc0[] yc0VarArr, int i2);

    public Typeface o(Context context, List list, int i2) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface p(Context context, Resources resources, int i2, String str, int i3) {
        File O = ju0.O(context);
        if (O == null) {
            return null;
        }
        try {
            if (ju0.j(O, resources, i2)) {
                return Typeface.createFromFile(O.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            O.delete();
        }
    }
}
