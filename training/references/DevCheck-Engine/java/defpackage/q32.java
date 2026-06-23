package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class q32 extends o32 {
    public final Class o;
    public final Constructor p;
    public final Method q;
    public final Method r;
    public final Method s;
    public final Method t;
    public final Method u;

    public q32() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = J(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = K(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.o = cls;
        this.p = constructor;
        this.q = method2;
        this.r = method3;
        this.s = method4;
        this.t = method5;
        this.u = method;
    }

    public static Method J(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod(ILBLnlCHDVqsSN.YTgPHVqpj, AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public final boolean G(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.q.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface H(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.o, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.u.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean I(Object obj) {
        try {
            return ((Boolean) this.s.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Method K(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // defpackage.o32, defpackage.k32
    public final Typeface m(Context context, vc0 vc0Var, Resources resources, int i) {
        Object obj;
        if (this.q == null) {
            return super.m(context, vc0Var, resources, i);
        }
        try {
            obj = this.p.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            wc0[] wc0VarArr = vc0Var.f1080a;
            int length = wc0VarArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    wc0 wc0Var = wc0VarArr[i2];
                    String str = wc0Var.f1126a;
                    int i3 = wc0Var.e;
                    int i4 = wc0Var.b;
                    boolean z = wc0Var.c;
                    FontVariationAxis[] fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(wc0Var.d);
                    q32 q32Var = this;
                    Context context2 = context;
                    if (q32Var.G(context2, obj, str, i3, i4, z ? 1 : 0, fromFontVariationSettings)) {
                        i2++;
                        this = q32Var;
                        context = context2;
                    } else {
                        try {
                            q32Var.t.invoke(obj, null);
                            break;
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                } else {
                    q32 q32Var2 = this;
                    if (q32Var2.I(obj)) {
                        return q32Var2.H(obj);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.o32, defpackage.k32
    public final Typeface n(Context context, yc0[] yc0VarArr, int i) {
        Object obj;
        Typeface H;
        boolean z;
        if (yc0VarArr.length >= 1) {
            try {
                if (this.q != null) {
                    HashMap hashMap = new HashMap();
                    for (yc0 yc0Var : yc0VarArr) {
                        if (yc0Var.f == 0) {
                            Uri uri = yc0Var.f1225a;
                            if (!hashMap.containsKey(uri)) {
                                hashMap.put(uri, ju0.d0(context, uri));
                            }
                        }
                    }
                    Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                    try {
                        obj = this.p.newInstance(null);
                    } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                        obj = null;
                    }
                    if (obj != null) {
                        int length = yc0VarArr.length;
                        int i2 = 0;
                        boolean z2 = false;
                        while (true) {
                            Method method = this.t;
                            if (i2 < length) {
                                yc0 yc0Var2 = yc0VarArr[i2];
                                ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(yc0Var2.f1225a);
                                if (byteBuffer != null) {
                                    try {
                                        z = ((Boolean) this.r.invoke(obj, byteBuffer, Integer.valueOf(yc0Var2.b), null, Integer.valueOf(yc0Var2.c), Integer.valueOf(yc0Var2.d ? 1 : 0))).booleanValue();
                                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                                        z = false;
                                    }
                                    if (!z) {
                                        method.invoke(obj, null);
                                        break;
                                    }
                                    z2 = true;
                                }
                                i2++;
                                z2 = z2;
                            } else if (!z2) {
                                method.invoke(obj, null);
                            } else if (I(obj) && (H = H(obj)) != null) {
                                return Typeface.create(H, i);
                            }
                        }
                    }
                } else {
                    yc0 u = k32.u(yc0VarArr, i);
                    ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(u.f1225a, "r", null);
                    if (openFileDescriptor != null) {
                        try {
                            Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(u.c).setItalic(u.d).build();
                            openFileDescriptor.close();
                            return build;
                        } finally {
                        }
                    }
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                        return null;
                    }
                }
            } catch (IOException | IllegalAccessException | InvocationTargetException unused3) {
            }
        }
        return null;
    }

    @Override // defpackage.k32
    public final Typeface p(Context context, Resources resources, int i, String str, int i2) {
        Object obj;
        if (this.q == null) {
            return super.p(context, resources, i, str, i2);
        }
        try {
            obj = this.p.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj != null) {
            if (!G(context, obj, str, 0, -1, -1, null)) {
                try {
                    this.t.invoke(obj, null);
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                }
            } else if (I(obj)) {
                return H(obj);
            }
        }
        return null;
    }
}
