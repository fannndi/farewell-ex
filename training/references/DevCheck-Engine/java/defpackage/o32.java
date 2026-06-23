package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class o32 extends k32 {
    public static Class j;
    public static Constructor k;
    public static Method l;
    public static Method m;
    public static boolean n;

    public static boolean E(Object obj, String str, int i, boolean z) {
        F();
        try {
            return ((Boolean) l.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            rw.j(e);
            return false;
        }
    }

    public static void F() {
        Method method;
        Class<?> cls;
        Method method2;
        if (n) {
            return;
        }
        n = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            cls = null;
            method2 = null;
        }
        k = constructor;
        j = cls;
        l = method2;
        m = method;
    }

    @Override // defpackage.k32
    public Typeface m(Context context, vc0 vc0Var, Resources resources, int i) {
        F();
        try {
            Object newInstance = k.newInstance(null);
            for (wc0 wc0Var : vc0Var.f1080a) {
                File O = ju0.O(context);
                if (O == null) {
                    return null;
                }
                try {
                    if (!ju0.j(O, resources, wc0Var.f)) {
                        return null;
                    }
                    if (!E(newInstance, O.getPath(), wc0Var.b, wc0Var.c)) {
                        return null;
                    }
                    O.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    O.delete();
                }
            }
            F();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) j, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) m.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e) {
                rw.j(e);
                return null;
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            rw.j(e2);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.k32
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.graphics.Typeface n(android.content.Context r3, defpackage.yc0[] r4, int r5) {
        /*
            r2 = this;
            int r2 = r4.length
            r0 = 1
            r1 = 0
            if (r2 >= r0) goto L7
            goto La2
        L7:
            yc0 r2 = defpackage.k32.u(r4, r5)
            android.content.ContentResolver r4 = r3.getContentResolver()
            android.net.Uri r2 = r2.f1225a     // Catch: java.io.IOException -> La2
            r5 = 0
            java.lang.String r5 = flar2.devcheck.benchmarkSuite.history.Hq.CGvJMCDBOmCdj.UnGwDOB     // Catch: java.io.IOException -> La2
            android.os.ParcelFileDescriptor r2 = r4.openFileDescriptor(r2, r5, r1)     // Catch: java.io.IOException -> La2
            if (r2 != 0) goto L20
            if (r2 == 0) goto La2
            r2.close()     // Catch: java.io.IOException -> La2
            return r1
        L20:
            java.lang.String r4 = "/proc/self/fd/"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.system.ErrnoException -> L48 java.lang.Throwable -> L5a
            r5.<init>(r4)     // Catch: android.system.ErrnoException -> L48 java.lang.Throwable -> L5a
            int r4 = r2.getFd()     // Catch: android.system.ErrnoException -> L48 java.lang.Throwable -> L5a
            r5.append(r4)     // Catch: android.system.ErrnoException -> L48 java.lang.Throwable -> L5a
            java.lang.String r4 = r5.toString()     // Catch: android.system.ErrnoException -> L48 java.lang.Throwable -> L5a
            java.lang.String r4 = android.system.Os.readlink(r4)     // Catch: android.system.ErrnoException -> L48 java.lang.Throwable -> L5a
            android.system.StructStat r5 = android.system.Os.stat(r4)     // Catch: android.system.ErrnoException -> L48 java.lang.Throwable -> L5a
            int r5 = r5.st_mode     // Catch: android.system.ErrnoException -> L48 java.lang.Throwable -> L5a
            boolean r5 = android.system.OsConstants.S_ISREG(r5)     // Catch: android.system.ErrnoException -> L48 java.lang.Throwable -> L5a
            if (r5 == 0) goto L48
            java.io.File r5 = new java.io.File     // Catch: android.system.ErrnoException -> L48 java.lang.Throwable -> L5a
            r5.<init>(r4)     // Catch: android.system.ErrnoException -> L48 java.lang.Throwable -> L5a
            goto L49
        L48:
            r5 = r1
        L49:
            if (r5 == 0) goto L5c
            boolean r4 = r5.canRead()     // Catch: java.lang.Throwable -> L5a
            if (r4 != 0) goto L52
            goto L5c
        L52:
            android.graphics.Typeface r3 = android.graphics.Typeface.createFromFile(r5)     // Catch: java.lang.Throwable -> L5a
            r2.close()     // Catch: java.io.IOException -> La2
            return r3
        L5a:
            r3 = move-exception
            goto L99
        L5c:
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L5a
            java.io.FileDescriptor r5 = r2.getFileDescriptor()     // Catch: java.lang.Throwable -> L5a
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L5a
            java.io.File r3 = defpackage.ju0.O(r3)     // Catch: java.lang.Throwable -> L8f
            if (r3 != 0) goto L6d
        L6b:
            r5 = r1
            goto L88
        L6d:
            boolean r5 = defpackage.ju0.k(r3, r4)     // Catch: java.lang.RuntimeException -> L73 java.lang.Throwable -> L83
            if (r5 != 0) goto L77
        L73:
            r3.delete()     // Catch: java.lang.Throwable -> L8f
            goto L6b
        L77:
            java.lang.String r5 = r3.getPath()     // Catch: java.lang.RuntimeException -> L73 java.lang.Throwable -> L83
            android.graphics.Typeface r5 = android.graphics.Typeface.createFromFile(r5)     // Catch: java.lang.RuntimeException -> L73 java.lang.Throwable -> L83
            r3.delete()     // Catch: java.lang.Throwable -> L8f
            goto L88
        L83:
            r5 = move-exception
            r3.delete()     // Catch: java.lang.Throwable -> L8f
            throw r5     // Catch: java.lang.Throwable -> L8f
        L88:
            r4.close()     // Catch: java.lang.Throwable -> L5a
            r2.close()     // Catch: java.io.IOException -> La2
            return r5
        L8f:
            r3 = move-exception
            r4.close()     // Catch: java.lang.Throwable -> L94
            goto L98
        L94:
            r4 = move-exception
            r3.addSuppressed(r4)     // Catch: java.lang.Throwable -> L5a
        L98:
            throw r3     // Catch: java.lang.Throwable -> L5a
        L99:
            r2.close()     // Catch: java.lang.Throwable -> L9d
            goto La1
        L9d:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch: java.io.IOException -> La2
        La1:
            throw r3     // Catch: java.io.IOException -> La2
        La2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o32.n(android.content.Context, yc0[], int):android.graphics.Typeface");
    }
}
