package defpackage;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import dalvik.system.VMRuntime;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandleInfo;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes6.dex */
public class TryRoom extends Application {
    public static final String URL = "https://github.com/L-JINBIN/ApkSignatureKillerEx";

    public class a {
        private boolean override;
    }

    public final class b {
        private transient int accessFlags;
        private transient int classFlags;
        private transient ClassLoader classLoader;
        private transient int classSize;
        private transient int clinitThreadId;
        private transient Class componentType;
        private transient short copiedMethodsOffset;
        private transient Object dexCache;
        private transient int dexClassDefIndex;
        private volatile transient int dexTypeIndex;
        private transient Object extData;
        private transient long iFields;
        private transient Object[] ifTable;
        private transient long methods;
        private transient String name;
        private transient int numReferenceInstanceFields;
        private transient int numReferenceStaticFields;
        private transient int objectSize;
        private transient int objectSizeAllocFastPath;
        private transient int primitiveType;
        private transient int referenceInstanceOffsets;
        private transient long sFields;
        private transient int status;
        private transient Class superClass;
        private transient short virtualMethodsOffset;
        private transient Object vtable;
    }

    public final class c extends a {
        private int accessFlags;
        private long artMethod;
        private b declaringClass;
        private b declaringClassOfOverriddenMethod;
        private Object[] parameters;
    }

    public final class d {
        private final Member member = null;
        private final f handle = null;
    }

    public final class e {
        private e(Object... objArr) {
            throw new IllegalStateException("Failed to new a instance");
        }

        private static Object invoke(Object... objArr) {
            throw new IllegalStateException("Failed to invoke the method");
        }
    }

    public class f {
        private f cachedSpreadInvoker;
        private MethodType nominalType;
        private final MethodType type = null;
        protected final int handleKind = 0;
        protected final long artFieldOrMethod = 0;
    }

    public final class g extends f {
        private final MethodHandleInfo info = null;
    }

    public final class h {
        private static int s;
        private static int t;
        private int i;
        private int j;

        private static void a() {
        }

        private static void b() {
        }
    }

    public final /* synthetic */ class i {
    }

    public final class j {

        /* renamed from: a, reason: collision with root package name */
        public static final Unsafe f0a;
        public static final long b;
        public static final long c;
        public static final long d;
        public static final long e;
        public static final HashSet f = new HashSet();

        static {
            try {
                Unsafe unsafe = (Unsafe) Unsafe.class.getDeclaredMethod("getUnsafe", null).invoke(null, null);
                f0a = unsafe;
                b = unsafe.objectFieldOffset(c.class.getDeclaredField("artMethod"));
                unsafe.objectFieldOffset(c.class.getDeclaredField("declaringClass"));
                long objectFieldOffset = unsafe.objectFieldOffset(f.class.getDeclaredField("artFieldOrMethod"));
                unsafe.objectFieldOffset(g.class.getDeclaredField("info"));
                long objectFieldOffset2 = unsafe.objectFieldOffset(b.class.getDeclaredField("methods"));
                c = objectFieldOffset2;
                long objectFieldOffset3 = unsafe.objectFieldOffset(b.class.getDeclaredField("iFields"));
                unsafe.objectFieldOffset(b.class.getDeclaredField("sFields"));
                unsafe.objectFieldOffset(d.class.getDeclaredField("member"));
                Method declaredMethod = h.class.getDeclaredMethod("a", null);
                Method declaredMethod2 = h.class.getDeclaredMethod("b", null);
                declaredMethod.setAccessible(true);
                declaredMethod2.setAccessible(true);
                MethodHandle unreflect = MethodHandles.lookup().unreflect(declaredMethod);
                MethodHandle unreflect2 = MethodHandles.lookup().unreflect(declaredMethod2);
                long j = unsafe.getLong(unreflect, objectFieldOffset);
                long j2 = unsafe.getLong(unreflect2, objectFieldOffset);
                long j3 = unsafe.getLong(h.class, objectFieldOffset2);
                long j4 = j2 - j;
                d = j4;
                e = (j - j3) - j4;
                Field declaredField = h.class.getDeclaredField("i");
                Field declaredField2 = h.class.getDeclaredField("j");
                declaredField.setAccessible(true);
                declaredField2.setAccessible(true);
                MethodHandle unreflectGetter = MethodHandles.lookup().unreflectGetter(declaredField);
                MethodHandle unreflectGetter2 = MethodHandles.lookup().unreflectGetter(declaredField2);
                unsafe.getLong(unreflectGetter, objectFieldOffset);
                unsafe.getLong(unreflectGetter2, objectFieldOffset);
                unsafe.getLong(h.class, objectFieldOffset3);
            } catch (ReflectiveOperationException e2) {
                Log.e("HiddenApiBypass", "Initialize error", e2);
                throw new ExceptionInInitializerError(e2);
            }
        }

        public static Object a(Class cls, Object obj, String str, Object... objArr) {
            if (obj != null && !cls.isInstance(obj)) {
                throw new IllegalArgumentException("this object is not an instance of the given class");
            }
            Method declaredMethod = e.class.getDeclaredMethod("invoke", Object[].class);
            declaredMethod.setAccessible(true);
            Unsafe unsafe = f0a;
            long j = unsafe.getLong(cls, c);
            if (j == 0) {
                throw new NoSuchMethodException("Cannot find matching method");
            }
            int i = unsafe.getInt(j);
            for (int i2 = 0; i2 < i; i2++) {
                f0a.putLong(declaredMethod, b, (i2 * d) + j + e);
                if (str.equals(declaredMethod.getName())) {
                    Class<?>[] parameterTypes = declaredMethod.getParameterTypes();
                    if (parameterTypes.length == objArr.length) {
                        for (int i3 = 0; i3 < parameterTypes.length; i3++) {
                            if (parameterTypes[i3].isPrimitive()) {
                                Class<?> cls2 = parameterTypes[i3];
                                if (cls2 == Integer.TYPE) {
                                    if (!(objArr[i3] instanceof Integer)) {
                                        break;
                                    }
                                }
                                if (cls2 == Byte.TYPE) {
                                    if (!(objArr[i3] instanceof Byte)) {
                                        break;
                                    }
                                }
                                if (cls2 == Character.TYPE) {
                                    if (!(objArr[i3] instanceof Character)) {
                                        break;
                                    }
                                }
                                if (cls2 == Boolean.TYPE) {
                                    if (!(objArr[i3] instanceof Boolean)) {
                                        break;
                                    }
                                }
                                if (cls2 == Double.TYPE) {
                                    if (!(objArr[i3] instanceof Double)) {
                                        break;
                                    }
                                }
                                if (cls2 == Float.TYPE) {
                                    if (!(objArr[i3] instanceof Float)) {
                                        break;
                                    }
                                }
                                if (cls2 == Long.TYPE) {
                                    if (!(objArr[i3] instanceof Long)) {
                                        break;
                                    }
                                }
                                if (cls2 == Short.TYPE && !(objArr[i3] instanceof Short)) {
                                    break;
                                }
                            } else {
                                Object obj2 = objArr[i3];
                                if (obj2 != null && !parameterTypes[i3].isInstance(obj2)) {
                                    break;
                                }
                            }
                        }
                        return declaredMethod.invoke(obj, objArr);
                    }
                    continue;
                }
            }
            throw new NoSuchMethodException("Cannot find matching method");
        }

        public static boolean b(String... strArr) {
            try {
                a(VMRuntime.class, a(VMRuntime.class, null, "getRuntime", new Object[0]), "setHiddenApiExemptions", strArr);
                return true;
            } catch (Throwable th) {
                Log.w("HiddenApiBypass", "setHiddenApiExemptions", th);
                return false;
            }
        }
    }

    public final /* synthetic */ class k {
    }

    public final class l implements Parcelable.Creator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Parcelable.Creator f1a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Signature c;

        public l(Parcelable.Creator creator, String str, Signature signature) {
            this.f1a = creator;
            this.b = str;
            this.c = signature;
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Signature[] apkContentsSigners;
            PackageInfo packageInfo = (PackageInfo) this.f1a.createFromParcel(parcel);
            if (packageInfo.packageName.equals(this.b)) {
                Signature[] signatureArr = packageInfo.signatures;
                Signature signature = this.c;
                if (signatureArr != null && signatureArr.length > 0) {
                    signatureArr[0] = signature;
                }
                if (Build.VERSION.SDK_INT >= 28 && packageInfo.signingInfo != null && (apkContentsSigners = packageInfo.signingInfo.getApkContentsSigners()) != null && apkContentsSigners.length > 0) {
                    apkContentsSigners[0] = signature;
                }
            }
            return packageInfo;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return (PackageInfo[]) this.f1a.newArray(i);
        }
    }

    static {
        killPM("flar2.devcheck", "MIIDZDCCAkygAwIBAgIEU7y+qjANBgkqhkiG9w0BAQUFADB0MQswCQYDVQQGEwJDQTEQMA4GA1UE\nCBMHT250YXJpbzEPMA0GA1UEBxMGT3R0YXdhMRMwEQYDVQQKEwplbGVtZW50YWx4MRQwEgYDVQQL\nEwtEZXZlbG9wbWVudDEXMBUGA1UEAxMOZWxlbWVudGFseC5vcmcwHhcNMTQwNzA5MDQwMTQ2WhcN\nNDExMTI0MDQwMTQ2WjB0MQswCQYDVQQGEwJDQTEQMA4GA1UECBMHT250YXJpbzEPMA0GA1UEBxMG\nT3R0YXdhMRMwEQYDVQQKEwplbGVtZW50YWx4MRQwEgYDVQQLEwtEZXZlbG9wbWVudDEXMBUGA1UE\nAxMOZWxlbWVudGFseC5vcmcwggEiMA0GCSqGSIb3DQEBAQUAA4IBDwAwggEKAoIBAQCWNJ233dFZ\na5O5rwbg+BZ5gfdYptImbUFC2AwmnEQuU9/P06HBgllt6ZubW7zdsTv3FGaWGhrdclfqJqFCm2eL\nUM2rAURHVlLSjlBZr9qFsI3JXTvxqs5UABX64NPF8R+4Lrwdr+OjxZTf4TejBEUDpZfpLNP7vGg9\nBbd7YLwJra72f0FMNCjWbZlyI04w6sxEYpkG47uaXYWc90bbAiap3d01LRnyj5yr/ASOvEd20A05\nNJCifPHWBSVWK8soulXgCbiDYPOd3YPOX37nbsC1tVQbJ7ZtbIplvFgiyQO0rDOsQE8IMIkIFuJ5\nmIS8K8DjwDuSxLfclDdYnY16d5xZAgMBAAEwDQYJKoZIhvcNAQEFBQADggEBAAZqx1PHcAW7w7dz\nvwgDiVc8bHZmXI5AVrtHY6Miyi/FdRg3fHwbGyX/bBBdyVOVDSiPO4vhteF65kFpb6caJRk3BSCU\nypDr68yqUsFanhcO6u4uhfJpyWFS65XxV9+Zw6eUPgm6WKDKzXm67E112wCsFyiZ7xWvQ8v2JYkc\n9C9ENYu2AcyyrIJgFa0MZ08dBuV0CCWU93YPPYGIaINGXdSejAIU6liNw9YKF05VYvMnazM69FtF\nothyScVFH56kzYDAxZOjoK3OUe5qZHEGdEhEOHwQbr6OjGeS8tFOgf1XV6Sm1pkuS7N6hNXlhtLe\ncJbR5CSQWAY9jZ10EeSLc/g=\n");
        killOpen("flar2.devcheck", "", "", "");
    }

    public static Field a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (NoSuchFieldException e2) {
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls.equals(Object.class)) {
                    break;
                }
                try {
                    Field declaredField2 = cls.getDeclaredField(str);
                    declaredField2.setAccessible(true);
                    return declaredField2;
                } catch (NoSuchFieldException unused) {
                }
            }
            throw e2;
        }
    }

    public static boolean b(String str, String str2) {
        if (str2.startsWith("/") && str2.endsWith(".apk")) {
            String[] split = str2.substring(1).split("/", 6);
            int length = split.length;
            if (length == 4 || length == 5) {
                if (split[0].equals("data") && split[1].equals("app") && split[length - 1].equals("base.apk")) {
                    return split[length - 2].startsWith(str);
                }
                if (split[0].equals("mnt") && split[1].equals("asec") && split[length - 1].equals("pkg.apk")) {
                    return split[length - 2].startsWith(str);
                }
            } else if (length == 3) {
                if (split[0].equals("data") && split[1].equals("app")) {
                    return split[2].startsWith(str);
                }
            } else if (length == 6 && split[0].equals("mnt") && split[1].equals("expand") && split[3].equals("app") && split[5].equals("base.apk")) {
                return split[4].endsWith(str);
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r5.canWrite() != false) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static void killOpen(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.TryRoom.killOpen(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    private static void killPM(String str, String str2) {
        try {
            a(PackageInfo.class, "CREATOR").set(null, new l(PackageInfo.CREATOR, str, new Signature(Base64.decode(str2, 0))));
            if (Build.VERSION.SDK_INT >= 28) {
                HashSet hashSet = j.f;
                hashSet.addAll(Arrays.asList("Landroid/os/Parcel;", "Landroid/content/pm", "Landroid/app"));
                String[] strArr = new String[hashSet.size()];
                hashSet.toArray(strArr);
                j.b(strArr);
            }
            try {
                Object obj = a(PackageManager.class, "sPackageInfoCache").get(null);
                obj.getClass().getMethod("clear", null).invoke(obj, null);
            } catch (Throwable unused) {
            }
            try {
                ((Map) a(Parcel.class, "mCreators").get(null)).clear();
            } catch (Throwable unused2) {
            }
            try {
                ((Map) a(Parcel.class, "sPairedCreators").get(null)).clear();
            } catch (Throwable unused3) {
            }
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
