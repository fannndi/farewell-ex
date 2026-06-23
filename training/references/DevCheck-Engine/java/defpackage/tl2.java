package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.RemoteViews;
import androidx.core.widget.rsm.gXdyRQCGVlHW;
import com.google.android.material.bottomappbar.HaCM.rQcwh;
import com.google.android.material.slider.KtNX.UQdsoaJMID;
import flar2.devcheck.R;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import moe.shizuku.api.hYGD.yttXLrAeLjN;

/* loaded from: classes.dex */
public abstract class tl2 {
    public static final f70 g = new f70(0);
    public static final f70 h = new f70(3);
    public static final Object i = new Object();
    public static Method j = null;
    public static boolean k = false;
    public static InputStream l = null;
    public static String m = "";

    public static final Object E(dh1 dh1Var, boolean z, boolean z2, lf0 lf0Var) {
        dh1Var.getClass();
        dh1Var.a();
        dh1Var.b();
        return bw0.y(new mz(null, lf0Var, dh1Var, z, z2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        if (r10 == r6) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(defpackage.dh1 r7, boolean r8, defpackage.ub r9, defpackage.ex r10) {
        /*
            boolean r0 = r10 instanceof defpackage.oz
            if (r0 == 0) goto L13
            r0 = r10
            oz r0 = (defpackage.oz) r0
            int r1 = r0.n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.n = r1
            goto L18
        L13:
            oz r0 = new oz
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.m
            int r1 = r0.n
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            zx r6 = defpackage.zx.g
            if (r1 == 0) goto L42
            if (r1 == r5) goto L3e
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2e
            defpackage.om0.O(r10)
            return r10
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.n(r7)
            return r2
        L34:
            boolean r8 = r0.l
            ub r9 = r0.k
            dh1 r7 = r0.j
            defpackage.om0.O(r10)
            goto L75
        L3e:
            defpackage.om0.O(r10)
            return r10
        L42:
            defpackage.om0.O(r10)
            boolean r10 = r7.p()
            if (r10 == 0) goto L66
            boolean r10 = r7.t()
            if (r10 == 0) goto L66
            boolean r10 = r7.q()
            if (r10 == 0) goto L66
            pz r10 = new pz
            r10.<init>(r2, r9, r7, r8)
            r0.n = r5
            java.lang.Object r7 = r7.w(r8, r10, r0)
            if (r7 != r6) goto L65
            goto L88
        L65:
            return r7
        L66:
            r0.j = r7
            r0.k = r9
            r0.l = r8
            r0.n = r4
            qx r10 = p(r7, r0)
            if (r10 != r6) goto L75
            goto L88
        L75:
            qx r10 = (defpackage.qx) r10
            nz r1 = new nz
            r1.<init>(r2, r9, r7, r8)
            r0.j = r2
            r0.k = r2
            r0.n = r3
            java.lang.Object r7 = defpackage.ju0.y0(r10, r1, r0)
            if (r7 != r6) goto L89
        L88:
            return r6
        L89:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl2.F(dh1, boolean, ub, ex):java.lang.Object");
    }

    public static final Cursor G(dh1 dh1Var, jt1 jt1Var, boolean z) {
        dh1Var.getClass();
        dh1Var.a();
        dh1Var.b();
        Cursor v = dh1Var.k().z().v(jt1Var);
        if (z && (v instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) v;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(v.getColumnNames(), v.getCount());
                    while (v.moveToNext()) {
                        Object[] objArr = new Object[v.getColumnCount()];
                        int columnCount = v.getColumnCount();
                        for (int i2 = 0; i2 < columnCount; i2++) {
                            int type = v.getType(i2);
                            if (type == 0) {
                                objArr[i2] = null;
                            } else if (type == 1) {
                                objArr[i2] = Long.valueOf(v.getLong(i2));
                            } else if (type == 2) {
                                objArr[i2] = Double.valueOf(v.getDouble(i2));
                            } else if (type == 3) {
                                objArr[i2] = v.getString(i2);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i2] = v.getBlob(i2);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    v.close();
                    return matrixCursor;
                } finally {
                }
            }
        }
        return v;
    }

    public static void H(Context context, int i2, int i3) {
        context.getApplicationContext().getSharedPreferences("widget_background_prefs", 0).edit().putInt("color_" + i2, i3).apply();
    }

    public static pm0 I(rm0 rm0Var, int i2) {
        rm0Var.getClass();
        boolean z = i2 > 0;
        Integer valueOf = Integer.valueOf(i2);
        if (!z) {
            throw new IllegalArgumentException(rQcwh.idGorUDnRU + valueOf + '.');
        }
        int i3 = rm0Var.g;
        int i4 = rm0Var.h;
        if (rm0Var.i <= 0) {
            i2 = -i2;
        }
        return new pm0(i3, i4, i2);
    }

    public static final lg1 J(lg1 lg1Var) {
        lg1Var.getClass();
        kg1 a2 = lg1Var.a();
        ng1 ng1Var = lg1Var.m;
        a2.g = new l42(ng1Var.e(), ng1Var.a());
        return a2.a();
    }

    public static rm0 K(int i2, int i3) {
        if (i3 > Integer.MIN_VALUE) {
            return new rm0(i2, i3 - 1, 1);
        }
        rm0 rm0Var = rm0.j;
        return rm0.j;
    }

    public static String L(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(N(objArr[i2]));
            i3 = indexOf + 2;
            i2++;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i2 < length) {
            String str2 = " [";
            while (i2 < objArr.length) {
                sb.append(str2);
                sb.append(N(objArr[i2]));
                i2++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void M(int i2, int i3) {
        String O;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                O = rt0.O("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    c.m(d51.q("negative size: ", i3));
                    return;
                }
                O = rt0.O("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(O);
        }
    }

    public static String N(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
            sb.append(name);
            sb.append(gXdyRQCGVlHW.RvyXcztXStKLDA);
            sb.append(hexString);
            String sb2 = sb.toString();
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(sb2), (Throwable) e);
            String name2 = e.getClass().getName();
            StringBuilder sb3 = new StringBuilder(sb2.length() + 8 + name2.length() + 1);
            sb3.append("<");
            sb3.append(sb2);
            sb3.append(" threw ");
            sb3.append(name2);
            sb3.append(">");
            return sb3.toString();
        }
    }

    public static ol2 O() {
        String str;
        ClassLoader classLoader = tl2.class.getClassLoader();
        if (ol2.class.equals(ol2.class)) {
            str = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";
        } else {
            if (!ol2.class.getPackage().equals(tl2.class.getPackage())) {
                c.m(ol2.class.getName());
                return null;
            }
            str = ol2.class.getPackage().getName() + ".BlazeGenerated" + ol2.class.getSimpleName() + "Loader";
        }
        try {
            try {
                try {
                    try {
                        iy1.g(Class.forName(str, true, classLoader).getConstructor(null).newInstance(null));
                        throw null;
                    } catch (InvocationTargetException e) {
                        throw new IllegalStateException(e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (IllegalAccessException e3) {
                throw new IllegalStateException(e3);
            } catch (InstantiationException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            try {
                Iterator it = Arrays.asList(new tl2[0]).iterator();
                ArrayList arrayList = new ArrayList();
                while (it.hasNext()) {
                    try {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    } catch (ServiceConfigurationError e5) {
                        Logger.getLogger(ml2.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(ol2.class.getSimpleName()), (Throwable) e5);
                    }
                }
                if (arrayList.size() == 1) {
                    return (ol2) arrayList.get(0);
                }
                if (arrayList.size() == 0) {
                    return null;
                }
                try {
                    return (ol2) ol2.class.getMethod("combine", Collection.class).invoke(null, arrayList);
                } catch (IllegalAccessException e6) {
                    throw new IllegalStateException(e6);
                } catch (NoSuchMethodException e7) {
                    throw new IllegalStateException(e7);
                } catch (InvocationTargetException e8) {
                    throw new IllegalStateException(e8);
                }
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static void P(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            c.g(R(i2, "index", i3));
        }
    }

    public static void Q(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException((i2 < 0 || i2 > i4) ? R(i2, "start index", i4) : (i3 < 0 || i3 > i4) ? R(i3, "end index", i4) : rt0.O("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2)));
        }
    }

    public static String R(int i2, String str, int i3) {
        if (i2 < 0) {
            return rt0.O("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return rt0.O("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        c.m(d51.q("negative size: ", i3));
        return null;
    }

    public static void c(RemoteViews remoteViews, int i2) {
        if (i2 == 0) {
            return;
        }
        remoteViews.setInt(R.id.image, "setColorFilter", i2);
    }

    public static void d(it1 it1Var, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            Object obj = objArr[i2];
            i2++;
            if (obj == null) {
                it1Var.b(i2);
            } else if (obj instanceof byte[]) {
                it1Var.f(i2, (byte[]) obj);
            } else if (obj instanceof Float) {
                it1Var.n(i2, ((Number) obj).floatValue());
            } else if (obj instanceof Double) {
                it1Var.n(i2, ((Number) obj).doubleValue());
            } else if (obj instanceof Long) {
                it1Var.d(i2, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                it1Var.d(i2, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                it1Var.d(i2, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                it1Var.d(i2, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                it1Var.k(i2, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i2 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                it1Var.d(i2, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
    }

    public static nr0 e(nr0 nr0Var) {
        nr0Var.g();
        nr0Var.i = true;
        return nr0Var.h > 0 ? nr0Var : nr0.j;
    }

    public static void f(int i2, int i3, int i4) {
        if (i2 >= 0 && i3 <= i4) {
            if (i2 <= i3) {
                return;
            }
            c.m(d51.n(i2, i3, "fromIndex: ", " > toIndex: "));
        } else {
            throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
        }
    }

    public static long g(long j2) {
        if (j2 < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j2 > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j2;
    }

    public static oj1 h(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            oj1 oj1Var = new oj1();
            new LinkedHashMap();
            oj1Var.f741a = new yh(q80.g);
            return oj1Var;
        }
        ClassLoader classLoader = oj1.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        gu0 gu0Var = new gu0(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            gu0Var.put(str, bundle.get(str));
        }
        gu0 b = gu0Var.b();
        oj1 oj1Var2 = new oj1();
        new LinkedHashMap();
        oj1Var2.f741a = new yh(b);
        return oj1Var2;
    }

    public static nr0 i() {
        return new nr0(10);
    }

    public static void j(Context context, int i2) {
        context.getApplicationContext().getSharedPreferences("widget_background_prefs", 0).edit().remove("color_" + i2).apply();
    }

    public static final void k(ti1 ti1Var) {
        ti1Var.getClass();
        nr0 i2 = i();
        aj1 C = ti1Var.C("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (C.w()) {
            try {
                i2.add(C.h(0));
            } finally {
            }
        }
        rt0.e(C, null);
        ListIterator listIterator = e(i2).listIterator(0);
        while (true) {
            lr0 lr0Var = (lr0) listIterator;
            if (!lr0Var.hasNext()) {
                return;
            }
            String str = (String) lr0Var.next();
            if (is1.b0(str, "room_fts_content_sync_", false)) {
                kk1.s(ti1Var, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    public static int m(Context context, int i2) {
        int i3 = context.getApplicationContext().getSharedPreferences("widget_background_prefs", 0).getInt("color_" + i2, 0);
        if (i3 == -15262942) {
            return 0;
        }
        return i3;
    }

    public static ColorStateList n(Context context, fh fhVar, int i2) {
        int resourceId;
        ColorStateList q;
        TypedArray typedArray = (TypedArray) fhVar.i;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (q = pr.q(context, resourceId)) == null) ? fhVar.v(i2) : q;
    }

    public static ColorStateList o(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        ColorStateList q;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (q = pr.q(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : q;
    }

    public static final qx p(dh1 dh1Var, ex exVar) {
        if (!dh1Var.p()) {
            return ((bx) dh1Var.i()).g;
        }
        if (exVar.d().r(s02.g) != null) {
            rw.b();
            return null;
        }
        bx bxVar = dh1Var.f191a;
        if (bxVar != null) {
            return bxVar.g;
        }
        ym0.A("coroutineScope");
        throw null;
    }

    public static int r(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return context.getResources().getColor((context.getResources().getConfiguration().uiMode & 48) == 32 ? android.R.color.system_accent2_800 : android.R.color.system_accent2_50, context.getTheme()) | (-16777216);
        }
        return -15262942;
    }

    public static int s(Context context, TypedArray typedArray, int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i2, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i2, i3);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i3);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static Drawable t(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        Drawable x;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (x = k32.x(context, resourceId)) == null) ? typedArray.getDrawable(i2) : x;
    }

    public static final Class u(vq vqVar) {
        vqVar.getClass();
        Class a2 = vqVar.a();
        if (!a2.isPrimitive()) {
            return a2;
        }
        String name = a2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals(UQdsoaJMID.ZxO)) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return a2;
    }

    public static int v(Context context, int i2) {
        if (i2 == 0) {
            return 0;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, yb1.H);
        TypedValue typedValue = new TypedValue();
        boolean value = obtainStyledAttributes.getValue(4, typedValue);
        if (!value) {
            value = obtainStyledAttributes.getValue(2, typedValue);
        }
        obtainStyledAttributes.recycle();
        if (!value) {
            return 0;
        }
        int complexUnit = typedValue.getComplexUnit();
        int i3 = typedValue.data;
        return complexUnit == 2 ? Math.round(TypedValue.complexToFloat(i3) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(i3, context.getResources().getDisplayMetrics());
    }

    public static boolean w(int i2) {
        return (i2 & rt0.A) != 0;
    }

    public static boolean x(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || yttXLrAeLjN.QUVymRk.equalsIgnoreCase(str)) ? false : true;
    }

    public static boolean y(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static List z(Object obj) {
        List singletonList = Collections.singletonList(obj);
        singletonList.getClass();
        return singletonList;
    }

    public abstract void A(Throwable th);

    public abstract View B(int i2);

    public abstract boolean C();

    public abstract void D(gr grVar);
}
