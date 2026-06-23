package defpackage;

import android.R;
import android.app.ActivityManager;
import android.app.Application;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.text.format.Formatter;
import android.view.KeyEvent;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import com.google.android.material.card.ZyJo.nTAZxGMqQtZZAQ;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import flar2.devcheck.usage.NetworkUsageActivity;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

/* loaded from: classes.dex */
public abstract class sl {
    public static volatile long o;
    public static volatile long p;
    public static volatile long q;
    public static volatile boolean r;
    public static boolean t;
    public final /* synthetic */ int g;
    public static final int[] h = {R.attr.name, R.attr.tint, R.attr.height, R.attr.width, R.attr.alpha, R.attr.autoMirrored, R.attr.tintMode, R.attr.viewportWidth, R.attr.viewportHeight};
    public static final int[] i = {R.attr.name, R.attr.pivotX, R.attr.pivotY, R.attr.scaleX, R.attr.scaleY, R.attr.rotation, R.attr.translateX, R.attr.translateY};
    public static final int[] j = {R.attr.name, R.attr.fillColor, R.attr.pathData, R.attr.strokeColor, R.attr.strokeWidth, R.attr.trimPathStart, R.attr.trimPathEnd, R.attr.trimPathOffset, R.attr.strokeLineCap, R.attr.strokeLineJoin, R.attr.strokeMiterLimit, R.attr.strokeAlpha, R.attr.fillAlpha, R.attr.fillType};
    public static final int[] k = {R.attr.name, R.attr.pathData, R.attr.fillType};
    public static final int[] l = {R.attr.drawable};
    public static final int[] m = {R.attr.name, R.attr.animation};
    public static final Type[] n = new Type[0];
    public static final Object s = new Object();

    public /* synthetic */ sl(int i2) {
        this.g = i2;
    }

    public static Type A(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                Class<?> cls3 = interfaces[i2];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return A(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return A(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static int B(Context context) {
        hw0 hw0Var;
        try {
            hw0Var = om0.q(context);
        } catch (Exception unused) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getApplicationContext().getSystemService("activity")).getMemoryInfo(memoryInfo);
            hw0Var = new hw0(memoryInfo.totalMem, memoryInfo.availMem, memoryInfo.totalMem - memoryInfo.availMem, memoryInfo.totalMem);
        }
        try {
            return (int) (((hw0Var.c * 100.0d) / hw0Var.f404a) + 0.5d);
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static Class C(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance((Class<?>) C(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return C(((WildcardType) type).getUpperBounds()[0]);
        }
        rw.h("Expected a Class, ParameterizedType, or GenericArrayType, but <", type, "> is of type ", type == null ? "null" : type.getClass().getName());
        return null;
    }

    public static int D(Context context) {
        try {
            ArrayList arrayList = new ArrayList();
            File[] externalFilesDirs = context.getExternalFilesDirs(null);
            if (externalFilesDirs.length > 1) {
                arrayList.add(externalFilesDirs[1].toString());
            }
            if (externalFilesDirs.length > 2) {
                arrayList.add(externalFilesDirs[2].toString());
            }
            Collections.addAll(arrayList, "/sdcard2", "/mnt/external_sd", "/mnt/external_sd", "/storage/extSdCard", "/storage/sdcard1/", "/storage/usbcard1/", nTAZxGMqQtZZAQ.YkCKDaXZGxRugu, "/mnt/extsdcard/", ILBLnlCHDVqsSN.bwkhjpk, "/storage/extsdcard/");
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                String str = (String) obj;
                if (uz1.q(str)) {
                    String[] G = G(context, new File(str));
                    if (!G[0].equals("0.00B")) {
                        return Integer.parseInt(G[3]);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    public static String E() {
        String str;
        if (i51.g("prefdevicenameshort")) {
            return i51.e("prefdevicenameshort");
        }
        try {
            String replace = i51.e("prefdevicename2").replace("\n", " ");
            if (replace.length() <= 12) {
                return replace;
            }
            try {
                String str2 = Build.MANUFACTURER;
                replace = replace.replace(str2, "").replace(uz1.a(str2), "");
                str = replace.replace(uz1.a(str2.toLowerCase()), "");
            } catch (Exception unused) {
                str = replace;
            }
            return str.trim();
        } catch (Exception unused2) {
            return uz1.A(true);
        }
    }

    public static String[] F(Application application, File file) {
        String[] strArr = new String[5];
        try {
            if (!g(application)) {
                File file2 = new File(file.getAbsoluteFile().toString());
                boolean j0 = uz1.j0(file2.getTotalSpace());
                strArr[0] = uz1.d0(application, file2.getTotalSpace(), j0);
                strArr[1] = uz1.d0(application, file2.getTotalSpace() - file2.getUsableSpace(), j0);
                strArr[2] = uz1.d0(application, file2.getUsableSpace(), j0);
                strArr[3] = String.valueOf((int) ((((file2.getTotalSpace() - file2.getUsableSpace()) * 100.0d) / file2.getTotalSpace()) + 0.5d));
                return strArr;
            }
            StatFs statFs = new StatFs(file.getPath());
            long totalBytes = statFs.getTotalBytes();
            String str = uz1.f1060a;
            strArr[0] = Formatter.formatFileSize(application, totalBytes);
            strArr[1] = Formatter.formatFileSize(application, statFs.getTotalBytes() - statFs.getAvailableBytes());
            strArr[2] = Formatter.formatFileSize(application, statFs.getAvailableBytes());
            strArr[3] = String.valueOf((int) ((((statFs.getTotalBytes() - statFs.getAvailableBytes()) * 100.0d) / statFs.getTotalBytes()) + 0.5d));
            strArr[4] = String.valueOf(statFs.getTotalBytes());
            return strArr;
        } catch (Exception unused) {
            strArr[0] = "NA";
            strArr[1] = "NA";
            strArr[2] = "NA";
            strArr[3] = "NA";
            return strArr;
        }
    }

    public static String[] G(Context context, File file) {
        StatFs statFs;
        String[] strArr = new String[4];
        try {
            if (!g(context)) {
                File file2 = new File(file.getAbsoluteFile().toString());
                boolean j0 = uz1.j0(file2.getTotalSpace());
                strArr[0] = uz1.d0(context, file2.getTotalSpace(), j0);
                strArr[1] = uz1.d0(context, file2.getTotalSpace() - file2.getUsableSpace(), j0);
                strArr[2] = uz1.d0(context, file2.getUsableSpace(), j0);
                strArr[3] = String.valueOf((int) ((((file2.getTotalSpace() - file2.getUsableSpace()) * 100.0d) / file2.getTotalSpace()) + 0.5d));
                return strArr;
            }
            try {
                statFs = new StatFs(file.getAbsolutePath());
            } catch (Exception unused) {
                statFs = new StatFs(context.getCacheDir().getPath());
            }
            long totalBytes = statFs.getTotalBytes();
            String str = uz1.f1060a;
            strArr[0] = Formatter.formatFileSize(context, totalBytes);
            strArr[1] = Formatter.formatFileSize(context, statFs.getTotalBytes() - statFs.getAvailableBytes());
            strArr[2] = Formatter.formatFileSize(context, statFs.getAvailableBytes());
            strArr[3] = String.valueOf((int) ((((statFs.getTotalBytes() - statFs.getAvailableBytes()) * 100.0d) / statFs.getTotalBytes()) + 0.5d));
            return strArr;
        } catch (Exception unused2) {
            strArr[0] = "NA";
            strArr[1] = "NA";
            strArr[2] = "NA";
            strArr[3] = "NA";
            return strArr;
        }
    }

    public static int H(Context context) {
        long totalBytes;
        double totalBytes2;
        long j2;
        UUID unused;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                StorageStatsManager g = ig0.g(context.getApplicationContext().getSystemService("storagestats"));
                StorageManager storageManager = (StorageManager) context.getApplicationContext().getSystemService("storage");
                totalBytes = 0;
                if (storageManager == null && g == null) {
                    j2 = 0;
                    totalBytes2 = totalBytes - j2;
                }
                j2 = 0;
                for (StorageVolume storageVolume : storageManager.getStorageVolumes()) {
                    try {
                        unused = StorageManager.UUID_DEFAULT;
                        totalBytes = g.getTotalBytes(StorageManager.UUID_DEFAULT);
                        j2 = g.getFreeBytes(StorageManager.UUID_DEFAULT);
                    } catch (Exception unused2) {
                    }
                }
                totalBytes2 = totalBytes - j2;
            } else {
                StatFs statFs = new StatFs(new File(Environment.getExternalStorageDirectory().getPath()).getAbsolutePath());
                totalBytes = statFs.getTotalBytes();
                totalBytes2 = statFs.getTotalBytes() - statFs.getAvailableBytes();
            }
            return (int) ((totalBytes2 / totalBytes) * 100.0d);
        } catch (Exception unused3) {
            return 0;
        }
    }

    public static Type I(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        if (cls2.isAssignableFrom(cls)) {
            return f0(type, cls, A(type, cls, cls2), new HashMap());
        }
        throw new IllegalArgumentException(cls + " is not the same as or a subtype of " + cls2);
    }

    public static float L(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static boolean M(int i2) {
        return i51.b("dash_clock_" + i2).booleanValue();
    }

    public static int N(int i2, String str) {
        return i51.c(100, str + i2);
    }

    public static String O(int i2, String str) {
        return i51.e(str + i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void P(d61[] d61VarArr, Path path) {
        int i2;
        float[] fArr;
        int i3;
        d61 d61Var;
        int i4;
        char c;
        float f;
        float f2;
        d61 d61Var2;
        boolean z;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        d61[] d61VarArr2 = d61VarArr;
        Path path2 = path;
        float[] fArr2 = new float[6];
        int length = d61VarArr2.length;
        int i5 = 0;
        int i6 = 0;
        char c2 = 'm';
        while (i6 < length) {
            d61 d61Var3 = d61VarArr2[i6];
            char c3 = d61Var3.f176a;
            float[] fArr3 = d61Var3.b;
            float f11 = fArr2[i5];
            float f12 = fArr2[1];
            float f13 = fArr2[2];
            float f14 = fArr2[3];
            float f15 = fArr2[4];
            int i7 = i5;
            float f16 = fArr2[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i2 = 7;
                    break;
                case 'C':
                case 'c':
                    i2 = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f15, f16);
                    f11 = f15;
                    f13 = f11;
                    f12 = f16;
                    f14 = f12;
                default:
                    i2 = 2;
                    break;
            }
            float f17 = f15;
            float f18 = f16;
            float f19 = f11;
            float f20 = f12;
            int i8 = i7;
            while (i8 < fArr3.length) {
                if (c3 == 'A') {
                    fArr = fArr3;
                    i3 = i8;
                    d61Var = d61Var3;
                    float f21 = f19;
                    float f22 = f20;
                    i4 = i6;
                    c = c3;
                    int i9 = i3 + 5;
                    int i10 = i3 + 6;
                    d61.a(path, f21, f22, fArr[i9], fArr[i10], fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3] != 0.0f ? 1 : i7, fArr[i3 + 4] != 0.0f ? 1 : i7);
                    f13 = fArr[i9];
                    f = fArr[i10];
                    f14 = f;
                    f2 = f13;
                } else if (c3 == 'C') {
                    fArr = fArr3;
                    i3 = i8;
                    i4 = i6;
                    d61Var = d61Var3;
                    c = c3;
                    int i11 = i3 + 2;
                    int i12 = i3 + 3;
                    int i13 = i3 + 4;
                    int i14 = i3 + 5;
                    path2.cubicTo(fArr[i3], fArr[i3 + 1], fArr[i11], fArr[i12], fArr[i13], fArr[i14]);
                    float f23 = fArr[i13];
                    float f24 = fArr[i14];
                    f13 = fArr[i11];
                    f14 = fArr[i12];
                    f = f24;
                    f2 = f23;
                } else if (c3 == 'H') {
                    fArr = fArr3;
                    i3 = i8;
                    d61Var = d61Var3;
                    c = c3;
                    f = f20;
                    i4 = i6;
                    path2.lineTo(fArr[i3], f);
                    f2 = fArr[i3];
                } else if (c3 == 'Q') {
                    fArr = fArr3;
                    i3 = i8;
                    i4 = i6;
                    d61Var = d61Var3;
                    c = c3;
                    int i15 = i3 + 1;
                    int i16 = i3 + 2;
                    int i17 = i3 + 3;
                    path2.quadTo(fArr[i3], fArr[i15], fArr[i16], fArr[i17]);
                    float f25 = fArr[i3];
                    float f26 = fArr[i15];
                    float f27 = fArr[i16];
                    float f28 = fArr[i17];
                    f13 = f25;
                    f14 = f26;
                    f2 = f27;
                    f = f28;
                } else if (c3 == 'V') {
                    fArr = fArr3;
                    i3 = i8;
                    i4 = i6;
                    d61Var = d61Var3;
                    f2 = f19;
                    c = c3;
                    path2.lineTo(f2, fArr[i3]);
                    f = fArr[i3];
                } else if (c3 != 'a') {
                    if (c3 == 'c') {
                        fArr = fArr3;
                        i3 = i8;
                        int i18 = i3 + 2;
                        int i19 = i3 + 3;
                        int i20 = i3 + 4;
                        int i21 = i3 + 5;
                        path2.rCubicTo(fArr[i3], fArr[i3 + 1], fArr[i18], fArr[i19], fArr[i20], fArr[i21]);
                        float f29 = fArr[i18] + f19;
                        float f30 = fArr[i19] + f20;
                        f19 += fArr[i20];
                        f20 += fArr[i21];
                        f13 = f29;
                        f14 = f30;
                    } else if (c3 != 'h') {
                        if (c3 != 'q') {
                            if (c3 != 'v') {
                                if (c3 == 'L') {
                                    fArr = fArr3;
                                    i3 = i8;
                                    int i22 = i3 + 1;
                                    path2.lineTo(fArr[i3], fArr[i22]);
                                    f2 = fArr[i3];
                                    f = fArr[i22];
                                } else if (c3 == 'M') {
                                    fArr = fArr3;
                                    i3 = i8;
                                    f2 = fArr[i3];
                                    f = fArr[i3 + 1];
                                    if (i3 > 0) {
                                        path2.lineTo(f2, f);
                                    } else {
                                        path2.moveTo(f2, f);
                                        f17 = f2;
                                        f18 = f;
                                    }
                                } else if (c3 != 'S') {
                                    if (c3 == 'T') {
                                        fArr = fArr3;
                                        i3 = i8;
                                        if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                            f19 = (f19 * 2.0f) - f13;
                                            f20 = (f20 * 2.0f) - f14;
                                        }
                                        int i23 = i3 + 1;
                                        path2.quadTo(f19, f20, fArr[i3], fArr[i23]);
                                        f2 = fArr[i3];
                                        f = fArr[i23];
                                        d61Var = d61Var3;
                                        f13 = f19;
                                        f14 = f20;
                                    } else if (c3 == 'l') {
                                        fArr = fArr3;
                                        i3 = i8;
                                        int i24 = i3 + 1;
                                        path2.rLineTo(fArr[i3], fArr[i24]);
                                        f19 += fArr[i3];
                                        f6 = fArr[i24];
                                    } else if (c3 == 'm') {
                                        fArr = fArr3;
                                        i3 = i8;
                                        float f31 = fArr[i3];
                                        f19 += f31;
                                        float f32 = fArr[i3 + 1];
                                        f20 += f32;
                                        if (i3 > 0) {
                                            path2.rLineTo(f31, f32);
                                        } else {
                                            path2.rMoveTo(f31, f32);
                                            d61Var = d61Var3;
                                            f2 = f19;
                                            f17 = f2;
                                            f = f20;
                                            f18 = f;
                                        }
                                    } else if (c3 != 's') {
                                        if (c3 != 't') {
                                            fArr = fArr3;
                                            i3 = i8;
                                            d61Var = d61Var3;
                                            f2 = f19;
                                        } else {
                                            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                f9 = f19 - f13;
                                                f10 = f20 - f14;
                                            } else {
                                                f10 = 0.0f;
                                                f9 = 0.0f;
                                            }
                                            int i25 = i8 + 1;
                                            path2.rQuadTo(f9, f10, fArr3[i8], fArr3[i25]);
                                            float f33 = f9 + f19;
                                            float f34 = f10 + f20;
                                            float f35 = f19 + fArr3[i8];
                                            f20 += fArr3[i25];
                                            f14 = f34;
                                            fArr = fArr3;
                                            i3 = i8;
                                            d61Var = d61Var3;
                                            f2 = f35;
                                            f13 = f33;
                                        }
                                        f = f20;
                                    } else {
                                        if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                            f7 = f20 - f14;
                                            f8 = f19 - f13;
                                        } else {
                                            f8 = 0.0f;
                                            f7 = 0.0f;
                                        }
                                        int i26 = i8;
                                        int i27 = i26 + 1;
                                        int i28 = i26 + 2;
                                        int i29 = i26 + 3;
                                        fArr = fArr3;
                                        i3 = i26;
                                        path2.rCubicTo(f8, f7, fArr3[i26], fArr3[i27], fArr3[i28], fArr3[i29]);
                                        f3 = fArr[i3] + f19;
                                        f4 = fArr[i27] + f20;
                                        f19 += fArr[i28];
                                        f5 = fArr[i29];
                                    }
                                    i4 = i6;
                                    c = c3;
                                } else {
                                    fArr = fArr3;
                                    i3 = i8;
                                    if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                        f19 = (f19 * 2.0f) - f13;
                                        f20 = (f20 * 2.0f) - f14;
                                    }
                                    float f36 = f19;
                                    float f37 = f20;
                                    int i30 = i3 + 1;
                                    int i31 = i3 + 2;
                                    int i32 = i3 + 3;
                                    path2.cubicTo(f36, f37, fArr[i3], fArr[i30], fArr[i31], fArr[i32]);
                                    f13 = fArr[i3];
                                    f14 = fArr[i30];
                                    f2 = fArr[i31];
                                    f = fArr[i32];
                                }
                                i4 = i6;
                                d61Var = d61Var3;
                                c = c3;
                            } else {
                                fArr = fArr3;
                                i3 = i8;
                                path2.rLineTo(0.0f, fArr[i3]);
                                f6 = fArr[i3];
                            }
                            f20 += f6;
                        } else {
                            fArr = fArr3;
                            i3 = i8;
                            int i33 = i3 + 1;
                            int i34 = i3 + 2;
                            int i35 = i3 + 3;
                            path2.rQuadTo(fArr[i3], fArr[i33], fArr[i34], fArr[i35]);
                            f3 = fArr[i3] + f19;
                            f4 = fArr[i33] + f20;
                            f19 += fArr[i34];
                            f5 = fArr[i35];
                        }
                        f20 += f5;
                        f13 = f3;
                        f14 = f4;
                    } else {
                        fArr = fArr3;
                        i3 = i8;
                        path2.rLineTo(fArr[i3], 0.0f);
                        f19 += fArr[i3];
                    }
                    d61Var = d61Var3;
                    f2 = f19;
                    f = f20;
                    i4 = i6;
                    c = c3;
                } else {
                    fArr = fArr3;
                    i3 = i8;
                    int i36 = i3 + 5;
                    float f38 = fArr[i36] + f19;
                    int i37 = i3 + 6;
                    float f39 = fArr[i37] + f20;
                    float f40 = fArr[i3];
                    float f41 = fArr[i3 + 1];
                    float f42 = fArr[i3 + 2];
                    if (fArr[i3 + 3] != 0.0f) {
                        d61Var2 = d61Var3;
                        z = 1;
                    } else {
                        d61Var2 = d61Var3;
                        z = i7;
                    }
                    d61Var = d61Var2;
                    float f43 = f19;
                    c = c3;
                    float f44 = f20;
                    i4 = i6;
                    d61.a(path, f43, f44, f38, f39, f40, f41, f42, z, fArr[i3 + 4] != 0.0f ? 1 : i7);
                    f2 = f43 + fArr[i36];
                    f = f44 + fArr[i37];
                    f13 = f2;
                    f14 = f;
                }
                i8 = i3 + i2;
                path2 = path;
                d61Var3 = d61Var;
                c3 = c;
                i6 = i4;
                f19 = f2;
                f20 = f;
                c2 = c3;
                fArr3 = fArr;
            }
            fArr2[i7] = f19;
            fArr2[1] = f20;
            fArr2[2] = f13;
            fArr2[3] = f14;
            fArr2[4] = f17;
            fArr2[5] = f18;
            c2 = d61Var3.f176a;
            i6++;
            d61VarArr2 = d61VarArr;
            path2 = path;
            i5 = i7;
        }
    }

    public static double Q(double d, double d2, boolean z) {
        if (!Double.isFinite(d) || !Double.isFinite(d2) || d2 <= 0.0d || d <= 0.0d) {
            return 0.0d;
        }
        return (z ? d / d2 : d2 / d) * 1000.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList Y(java.lang.String r16) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "\n"
            r2 = r16
            java.lang.String[] r1 = r2.split(r1)
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L10:
            if (r3 >= r2) goto Lae
            r5 = r1[r3]
            java.lang.String r5 = r5.trim()
            java.lang.String r6 = "Current temperatures from HAL:"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto L23
            r4 = 1
            goto Laa
        L23:
            if (r4 != 0) goto L27
            goto Laa
        L27:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L2f
            goto Lae
        L2f:
            java.lang.String r6 = "Temperature{"
            boolean r6 = r5.startsWith(r6)
            if (r6 != 0) goto L3f
            java.lang.String r6 = "Temperature {"
            boolean r6 = r5.startsWith(r6)
            if (r6 == 0) goto Laa
        L3f:
            java.lang.String r6 = "mStatus="
            java.lang.String r7 = "mName="
            java.lang.String r8 = "mType="
            java.lang.String r9 = "mValue="
            java.lang.String r10 = ","
            jy1 r12 = new jy1     // Catch: java.lang.Exception -> La4
            r12.<init>()     // Catch: java.lang.Exception -> La4
            int r13 = r5.indexOf(r9)     // Catch: java.lang.Exception -> La4
            int r14 = r5.indexOf(r8)     // Catch: java.lang.Exception -> La4
            int r15 = r5.indexOf(r7)     // Catch: java.lang.Exception -> La4
            int r11 = r5.indexOf(r6)     // Catch: java.lang.Exception -> La4
            if (r13 < 0) goto La4
            if (r14 < 0) goto La4
            if (r15 >= 0) goto L65
            goto La4
        L65:
            java.lang.String r9 = p0(r5, r9, r10, r13)     // Catch: java.lang.Exception -> La4
            java.lang.String r8 = p0(r5, r8, r10, r14)     // Catch: java.lang.Exception -> La4
            java.lang.String r7 = p0(r5, r7, r10, r15)     // Catch: java.lang.Exception -> La4
            if (r11 < 0) goto L7a
            java.lang.String r10 = "}"
            java.lang.String r5 = p0(r5, r6, r10, r11)     // Catch: java.lang.Exception -> La4
            goto L7c
        L7a:
            java.lang.String r5 = "0"
        L7c:
            java.lang.String r6 = r9.trim()     // Catch: java.lang.Exception -> La4
            float r6 = java.lang.Float.parseFloat(r6)     // Catch: java.lang.Exception -> La4
            r12.f503a = r6     // Catch: java.lang.Exception -> La4
            java.lang.String r6 = r8.trim()     // Catch: java.lang.Exception -> La4
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> L8f java.lang.Exception -> La4
            goto L93
        L8f:
            int r6 = a0(r6)     // Catch: java.lang.Exception -> La4
        L93:
            r12.b = r6     // Catch: java.lang.Exception -> La4
            java.lang.String r6 = r7.trim()     // Catch: java.lang.Exception -> La4
            r12.c = r6     // Catch: java.lang.Exception -> La4
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Exception -> La4
            java.lang.Integer.parseInt(r5)     // Catch: java.lang.Exception -> La4
            r11 = r12
            goto La5
        La4:
            r11 = 0
        La5:
            if (r11 == 0) goto Laa
            r0.add(r11)
        Laa:
            int r3 = r3 + 1
            goto L10
        Lae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl.Y(java.lang.String):java.util.ArrayList");
    }

    public static float[] Z(String str) {
        String[] split = str.split(",");
        float[] fArr = new float[7];
        for (int i2 = 0; i2 < 7; i2++) {
            fArr[i2] = Float.NaN;
        }
        for (int i3 = 0; i3 < split.length && i3 < 7; i3++) {
            String trim = split[i3].trim();
            if (trim.equalsIgnoreCase("NaN")) {
                fArr[i3] = Float.NaN;
            } else {
                try {
                    fArr[i3] = Float.parseFloat(trim);
                } catch (NumberFormatException unused) {
                    fArr[i3] = Float.NaN;
                }
            }
        }
        return fArr;
    }

    public static int a0(String str) {
        String upperCase = str.trim().toUpperCase();
        if ("CPU".equals(upperCase)) {
            return 0;
        }
        if ("GPU".equals(upperCase)) {
            return 1;
        }
        if ("BATTERY".equals(upperCase)) {
            return 2;
        }
        if ("SKIN".equals(upperCase)) {
            return 3;
        }
        if ("USB".equals(upperCase)) {
            return 4;
        }
        if ("POWER_AMPLIFIER".equals(upperCase) || "POWERAMPS".equals(upperCase)) {
            return 5;
        }
        if ("BCL_VOLTAGE".equals(upperCase)) {
            return 6;
        }
        if ("BCL_CURRENT".equals(upperCase)) {
            return 7;
        }
        if ("BCL_PERCENTAGE".equals(upperCase)) {
            return 8;
        }
        if ("NPU".equals(upperCase)) {
            return 9;
        }
        return "TPU".equals(upperCase) ? 10 : -1;
    }

    public static byte[] b0(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i3 = 0;
        while (i3 < i2) {
            int read = inputStream.read(bArr, i3, i2 - i3);
            if (read < 0) {
                c.n(d51.q("Not enough bytes to read: ", i2));
                return null;
            }
            i3 += read;
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] c0(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl.c0(java.io.FileInputStream, int, int):byte[]");
    }

    public static Type d(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new ph0(d(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new qh0(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new ph0(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new rh0(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static long d0(InputStream inputStream, int i2) {
        byte[] b0 = b0(inputStream, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 += (b0[i3] & 255) << (i3 * 8);
        }
        return j2;
    }

    public static void e(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            c.m("Primitive type is not allowed");
        }
    }

    public static final Object e0(Object obj) {
        if (!(obj instanceof ot)) {
            return obj;
        }
        Throwable th = ((ot) obj).f756a;
        th.getClass();
        return new pg1(th);
    }

    public static boolean f(int i2, String str) {
        return i51.g(str + i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013f, code lost:
    
        if (r1 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0141, code lost:
    
        r13.put(r1, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0144, code lost:
    
        return r12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x013f A[EDGE_INSN: B:24:0x013f->B:25:0x013f BREAK  A[LOOP:0: B:2:0x0002->B:29:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:2:0x0002->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.reflect.Type[]] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v3, types: [rh0] */
    /* JADX WARN: Type inference failed for: r12v4, types: [rh0] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.HashMap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.reflect.Type f0(java.lang.reflect.Type r10, java.lang.Class r11, java.lang.reflect.Type r12, java.util.HashMap r13) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl.f0(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.HashMap):java.lang.reflect.Type");
    }

    public static boolean g(Context context) {
        return new File(context.getFilesDir().getAbsoluteFile().toString()).getTotalSpace() == new StatFs(new File(Environment.getDataDirectory().getPath()).getAbsolutePath()).getTotalBytes();
    }

    public static void g0(int i2, String str, int i3) {
        String str2 = str + i2;
        il1 il1Var = (il1) i51.f();
        il1Var.getClass();
        SharedPreferences.Editor edit = il1Var.f438a.edit();
        String d = il1Var.d(Integer.toString(i3));
        if (d != null) {
            edit.putString(il1.f(str2), d);
        }
        edit.commit();
    }

    public static void h0(int i2, String str, String str2) {
        i51.m(str + i2, str2);
    }

    public static byte[] j(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static float[] k(float[] fArr, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i2, length);
        float[] fArr2 = new float[i2];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.pc0 l(android.content.Context r13) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            m10 r0 = new m10
            r0.<init>()
            goto L11
        Lc:
            ai1 r0 = new ai1
            r0.<init>()
        L11:
            android.content.pm.PackageManager r1 = r13.getPackageManager()
            r2 = 0
            java.lang.String r2 = androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN.rUeTU
            defpackage.op0.e(r2, r1)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2b:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L47
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L2b
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L2b
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L2b
            goto L48
        L47:
            r4 = r5
        L48:
            if (r4 != 0) goto L4c
        L4a:
            r6 = r5
            goto L76
        L4c:
            java.lang.String r7 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
            java.lang.String r8 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
            android.content.pm.Signature[] r0 = r0.i(r1, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
            int r2 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
        L5a:
            if (r3 >= r2) goto L68
            r4 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
            byte[] r4 = r4.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
            r1.add(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
            int r3 = r3 + 1
            goto L5a
        L68:
            java.util.List r10 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
            nc0 r6 = new nc0     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
            r9 = 0
            java.lang.String r9 = com.google.android.material.behavior.YqV.Gvyagftz.TeGIKl     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
            r11 = 0
            r12 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L4a
        L76:
            if (r6 != 0) goto L79
            goto L83
        L79:
            pc0 r5 = new pc0
            oc0 r0 = new oc0
            r0.<init>(r13, r6)
            r5.<init>(r0)
        L83:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl.l(android.content.Context):pc0");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.d61[] m(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl.m(java.lang.String):d61[]");
    }

    public static void n(int i2, String str) {
        i51.a(str + i2);
    }

    public static boolean p(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return Objects.equals(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return p(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName());
    }

    public static String p0(String str, String str2, String str3, int i2) {
        int length = str2.length() + i2;
        int indexOf = str.indexOf(str3, length);
        if (indexOf < 0) {
            indexOf = str.length();
        }
        return str.substring(length, indexOf);
    }

    public static n92 q(iw iwVar, int i2, ArrayList arrayList, n92 n92Var) {
        int i3;
        int i4 = i2 == 0 ? iwVar.n0 : iwVar.o0;
        if (i4 != -1 && (n92Var == null || i4 != n92Var.b)) {
            int i5 = 0;
            while (true) {
                if (i5 >= arrayList.size()) {
                    break;
                }
                n92 n92Var2 = (n92) arrayList.get(i5);
                if (n92Var2.b == i4) {
                    if (n92Var != null) {
                        n92Var.c(i2, n92Var2);
                        arrayList.remove(n92Var);
                    }
                    n92Var = n92Var2;
                } else {
                    i5++;
                }
            }
        } else if (i4 != -1) {
            return n92Var;
        }
        if (n92Var == null) {
            if (iwVar instanceof zi0) {
                zi0 zi0Var = (zi0) iwVar;
                int i6 = 0;
                while (true) {
                    if (i6 >= zi0Var.r0) {
                        i3 = -1;
                        break;
                    }
                    iw iwVar2 = zi0Var.q0[i6];
                    if ((i2 == 0 && (i3 = iwVar2.n0) != -1) || (i2 == 1 && (i3 = iwVar2.o0) != -1)) {
                        break;
                    }
                    i6++;
                }
                if (i3 != -1) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= arrayList.size()) {
                            break;
                        }
                        n92 n92Var3 = (n92) arrayList.get(i7);
                        if (n92Var3.b == i3) {
                            n92Var = n92Var3;
                            break;
                        }
                        i7++;
                    }
                }
            }
            if (n92Var == null) {
                n92Var = new n92();
                n92Var.f669a = new ArrayList();
                n92Var.d = null;
                n92Var.e = -1;
                int i8 = n92.f;
                n92.f = i8 + 1;
                n92Var.b = i8;
                n92Var.c = i2;
            }
            arrayList.add(n92Var);
        }
        ArrayList arrayList2 = n92Var.f669a;
        if (arrayList2.contains(iwVar)) {
            return n92Var;
        }
        arrayList2.add(iwVar);
        if (iwVar instanceof sh0) {
            sh0 sh0Var = (sh0) iwVar;
            sh0Var.t0.c(sh0Var.u0 == 0 ? 1 : 0, n92Var, arrayList);
        }
        int i9 = n92Var.b;
        if (i2 == 0) {
            iwVar.n0 = i9;
            iwVar.I.c(i2, n92Var, arrayList);
            iwVar.K.c(i2, n92Var, arrayList);
        } else {
            iwVar.o0 = i9;
            iwVar.J.c(i2, n92Var, arrayList);
            iwVar.M.c(i2, n92Var, arrayList);
            iwVar.L.c(i2, n92Var, arrayList);
        }
        iwVar.P.c(i2, n92Var, arrayList);
        return n92Var;
    }

    public static String q0(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static String r(NetworkUsageActivity networkUsageActivity, long j2) {
        return Formatter.formatShortFileSize(networkUsageActivity, Math.max(0L, j2));
    }

    public static boolean r0(int i2, int i3, int i4, int i5) {
        return (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2)) || (i5 == 1 || i5 == 2 || (i5 == 4 && i3 != 2));
    }

    public static String s(long j2) {
        if (j2 <= 0) {
            return "0m";
        }
        long j3 = j2 / 60000;
        long j4 = j3 / 60;
        long j5 = j3 % 60;
        if (j4 <= 0) {
            Locale locale = Locale.US;
            return j5 + "m";
        }
        Locale locale2 = Locale.US;
        return j4 + "h " + j5 + "m";
    }

    public static void s0(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            bArr[i3] = (byte) ((j2 >> (i3 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static String t(String str) {
        int lastIndexOf;
        if (str == null) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        String[] strArr = {".home.local", ".localdomain", ".local", ".lan", ".home"};
        for (int i2 = 0; i2 < 5; i2++) {
            String str2 = strArr[i2];
            if (lowerCase.endsWith(str2) && (lastIndexOf = lowerCase.lastIndexOf(str2)) > 0 && lastIndexOf <= str.length()) {
                return str.substring(0, lastIndexOf);
            }
        }
        return str;
    }

    public static void t0(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        s0(byteArrayOutputStream, i2, 2);
    }

    public static double u(double[] dArr) {
        if (dArr.length != 0) {
            double d = 0.0d;
            int i2 = 0;
            for (double d2 : dArr) {
                if (d2 > 0.0d && Double.isFinite(d2)) {
                    d += Math.log(d2);
                    i2++;
                }
            }
            if (i2 != 0) {
                return Math.exp(d / i2);
            }
        }
        return 0.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long[] v(android.content.Context r13) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sl.v(android.content.Context):long[]");
    }

    public static int w(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return -1;
        }
        return (registerReceiver.getIntExtra("level", -1) * 100) / registerReceiver.getIntExtra("scale", -1);
    }

    public static a61 x(Context context) {
        String str = "°C";
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return new a61(-1, "");
        }
        int intExtra = registerReceiver.getIntExtra("temperature", 0) / 10;
        try {
            if (et.f248a.d(XmJDY.RfqsCKQfXROb)) {
                str = ((int) ((intExtra * 1.8d) + 32.0d)) + "°F";
            } else {
                str = intExtra + "°C";
            }
        } catch (NullPointerException unused) {
            str = d51.o(intExtra, str);
        }
        return new a61(Integer.valueOf(intExtra), str);
    }

    public static pn z(nn nnVar) {
        mn mnVar = new mn();
        mnVar.c = new dg1();
        pn pnVar = new pn(mnVar);
        mnVar.b = pnVar;
        mnVar.f645a = nnVar.getClass();
        try {
            Object a2 = nnVar.a(mnVar);
            if (a2 == null) {
                return pnVar;
            }
            mnVar.f645a = a2;
            return pnVar;
        } catch (Exception e) {
            pnVar.h.j(e);
            return pnVar;
        }
    }

    public abstract Context J();

    public boolean K() {
        return false;
    }

    public abstract void R();

    public void S() {
    }

    public abstract void T(int i2);

    public abstract void U(Typeface typeface);

    public abstract boolean V(int i2, KeyEvent keyEvent);

    public boolean W(KeyEvent keyEvent) {
        return false;
    }

    public boolean X() {
        return false;
    }

    public void c(int i2) {
        new Handler(Looper.getMainLooper()).post(new xj(i2, 6, this));
    }

    public boolean h() {
        return false;
    }

    public abstract boolean i();

    public abstract void i0(boolean z);

    public abstract void j0(boolean z);

    public abstract void k0(boolean z);

    public abstract void l0(int i2);

    public abstract void m0(String str);

    public abstract void n0(CharSequence charSequence);

    public abstract void o(boolean z);

    public j2 o0(i8 i8Var) {
        return null;
    }

    public String toString() {
        switch (this.g) {
            case 20:
                return ((mk2) this).u.toString();
            default:
                return super.toString();
        }
    }

    public abstract int y();
}
