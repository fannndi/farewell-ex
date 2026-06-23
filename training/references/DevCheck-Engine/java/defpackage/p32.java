package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes.dex */
public final class p32 extends k32 {
    public static final Class j;
    public static final Constructor k;
    public static final Method l;
    public static final Method m;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            Class cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod(hTYJVDOvZnZlYL.mMZrUHIYpke, Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            method = null;
            method2 = null;
        }
        k = constructor;
        j = cls;
        l = method2;
        m = method;
    }

    public static boolean E(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) l.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface F(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) j, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) m.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.k32
    public final Typeface m(Context context, vc0 vc0Var, Resources resources, int i) {
        Object obj;
        int i2;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = k.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            for (wc0 wc0Var : vc0Var.f1080a) {
                int i3 = wc0Var.f;
                File O = ju0.O(context);
                if (O != null) {
                    try {
                        if (ju0.j(O, resources, i3)) {
                            try {
                                fileInputStream = new FileInputStream(O);
                            } catch (IOException unused2) {
                                mappedByteBuffer = null;
                            }
                            try {
                                FileChannel channel = fileInputStream.getChannel();
                                mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                                fileInputStream.close();
                                i2 = (mappedByteBuffer != null && E(obj, mappedByteBuffer, wc0Var.e, wc0Var.b, wc0Var.c)) ? i2 + 1 : 0;
                            } finally {
                            }
                        }
                    } finally {
                        O.delete();
                    }
                }
                mappedByteBuffer = null;
                if (mappedByteBuffer != null) {
                }
            }
            return F(obj);
        }
        return null;
    }

    @Override // defpackage.k32
    public final Typeface n(Context context, yc0[] yc0VarArr, int i) {
        Object obj;
        try {
            obj = k.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            int i2 = 0;
            yo1 yo1Var = new yo1(0);
            int length = yc0VarArr.length;
            while (true) {
                if (i2 < length) {
                    yc0 yc0Var = yc0VarArr[i2];
                    Uri uri = yc0Var.f1225a;
                    ByteBuffer byteBuffer = (ByteBuffer) yo1Var.get(uri);
                    if (byteBuffer == null) {
                        byteBuffer = ju0.d0(context, uri);
                        yo1Var.put(uri, byteBuffer);
                    }
                    if (byteBuffer == null || !E(obj, byteBuffer, yc0Var.b, yc0Var.c, yc0Var.d)) {
                        break;
                    }
                    i2++;
                } else {
                    Typeface F = F(obj);
                    if (F != null) {
                        return Typeface.create(F, i);
                    }
                }
            }
        }
        return null;
    }
}
