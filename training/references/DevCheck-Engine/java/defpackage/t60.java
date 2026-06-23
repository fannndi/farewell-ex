package defpackage;

import android.content.Context;
import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import com.google.android.datatransport.runtime.backends.XUas.yFbVsaLCWAtQC;
import com.google.android.material.bottomappbar.HaCM.rQcwh;
import flar2.devcheck.nativebridge.xm.oWuW;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class t60 {
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f967a;

    public t60(Context context) {
        this.f967a = context.getApplicationContext();
    }

    public static Method a(Class cls, String str, Class[] clsArr) {
        StringBuilder sb = new StringBuilder(cls.getName());
        sb.append('#');
        sb.append(str);
        sb.append('(');
        if (clsArr != null) {
            for (int i = 0; i < clsArr.length; i++) {
                if (i > 0) {
                    sb.append(',');
                }
                Class cls2 = clsArr[i];
                sb.append(cls2 == null ? "null" : cls2.getName());
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        ConcurrentHashMap concurrentHashMap = c;
        Optional optional = (Optional) concurrentHashMap.get(sb2);
        Method method = null;
        if (optional != null) {
            return (Method) optional.orElse(null);
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            declaredMethod.setAccessible(true);
            method = declaredMethod;
        } catch (Throwable unused) {
        }
        concurrentHashMap.put(sb2, Optional.ofNullable(method));
        return method;
    }

    public static Object c(Object obj, String str, String str2, Object[] objArr, String str3) {
        Class<?> cls;
        Class[] clsArr;
        Class<?> cls2;
        try {
            if (str != null) {
                ConcurrentHashMap concurrentHashMap = b;
                Optional optional = (Optional) concurrentHashMap.get(str);
                if (optional != null) {
                    cls = (Class) optional.orElse(null);
                } else {
                    try {
                        cls2 = Class.forName(str);
                    } catch (Throwable unused) {
                        cls2 = null;
                    }
                    concurrentHashMap.put(str, Optional.ofNullable(cls2));
                    cls = cls2;
                }
            } else {
                cls = obj != null ? obj.getClass() : null;
            }
            if (cls == null) {
                return null;
            }
            if (str3 != null) {
                Field field = cls.getField(str3);
                boolean isAccessible = field.isAccessible();
                field.setAccessible(true);
                String obj2 = field.get(null).toString();
                field.setAccessible(isAccessible);
                return obj2;
            }
            if (objArr != null) {
                clsArr = new Class[objArr.length];
                for (int i = 0; i < objArr.length; i++) {
                    Object obj3 = objArr[i];
                    if (obj3 instanceof String) {
                        clsArr[i] = String.class;
                    } else if (obj3 instanceof Integer) {
                        clsArr[i] = Integer.TYPE;
                    } else if (obj3 instanceof Long) {
                        clsArr[i] = Long.TYPE;
                    } else if (obj3 instanceof Boolean) {
                        clsArr[i] = Boolean.TYPE;
                    } else {
                        clsArr[i] = obj3.getClass();
                    }
                }
            } else {
                clsArr = null;
            }
            Method a2 = a(cls, str2, clsArr);
            if (a2 == null) {
                return null;
            }
            if (obj == null) {
                obj = cls;
            }
            return a2.invoke(obj, objArr);
        } catch (Error | Exception unused2) {
            return null;
        }
    }

    public final xo1 b(int i) {
        Context context;
        String str;
        Long l = 0L;
        xo1 xo1Var = new xo1();
        xo1Var.c = -1;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i2 = 0;
        while (true) {
            context = this.f967a;
            str = null;
            if (i2 >= 100) {
                break;
            }
            try {
                str = (String) c(context.getSystemService("phone"), "android.telephony.TelephonyManager", "getSubscriberId", new Object[]{Integer.valueOf(i2)}, null);
            } catch (Exception unused) {
            }
            if (str != null && !arrayList.contains(str)) {
                arrayList.add(str);
                arrayList2.add(Integer.valueOf(i2));
            }
            i2++;
        }
        Integer num = arrayList2.size() > i ? (Integer) arrayList2.get(i) : null;
        if (num == null) {
            try {
                num = Integer.valueOf(Integer.parseInt(String.valueOf(c(context.getSystemService("phone"), "android.telephony.TelephonyManager", "getSubId", new Object[]{Integer.valueOf(i)}, null))));
            } catch (Exception unused2) {
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        Long l2 = l;
        while (l2.longValue() < 100) {
            String str2 = (String) c(context.getSystemService("phone"), "android.telephony.TelephonyManager", "getSubscriberId", new Object[]{l2}, str);
            Long l3 = l;
            xo1 xo1Var2 = xo1Var;
            if (c(context.getSystemService("phone"), yFbVsaLCWAtQC.LHpPeYaIPQCgZ, "getSubInfoForSubscriber", new Object[]{l2}, null) != null && str2 != null && !arrayList3.contains(str2)) {
                arrayList3.add(str2);
                arrayList4.add(l2);
            }
            l2 = Long.valueOf(l2.longValue() + 1);
            l = l3;
            xo1Var = xo1Var2;
            str = null;
        }
        Long l4 = l;
        xo1 xo1Var3 = xo1Var;
        if (arrayList4.size() <= 0) {
            for (Long l5 = l4; l5.longValue() < 100; l5 = Long.valueOf(l5.longValue() + 1)) {
                String str3 = (String) c(context.getSystemService("phone"), "android.telephony.TelephonyManager", "getSubscriberId", new Object[]{l5}, null);
                if (str3 != null && !arrayList3.contains(str3)) {
                    arrayList3.add(str3);
                    arrayList4.add(l5);
                }
            }
        }
        Long l6 = arrayList4.size() > i ? (Long) arrayList4.get(i) : null;
        if (l6 == null) {
            try {
                l6 = (Long) c(context.getSystemService("phone"), "android.telephony.TelephonyManager", "getSubId", new Object[]{Integer.valueOf(i)}, null);
            } catch (ClassCastException unused3) {
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (num != null && !arrayList5.contains(num)) {
            arrayList5.add(num);
        }
        if (l6 != null && !arrayList5.contains(l6)) {
            arrayList5.add(l6);
        }
        if (!arrayList5.contains(Integer.valueOf(i))) {
            arrayList5.add(Integer.valueOf(i));
        }
        Object[] array = arrayList5.toArray();
        ArrayList arrayList6 = new ArrayList();
        if (!arrayList6.contains(Integer.valueOf(i))) {
            arrayList6.add(Integer.valueOf(i));
        }
        if (num != null && !arrayList6.contains(num)) {
            arrayList6.add(num);
        }
        if (l6 != null && !arrayList6.contains(l6)) {
            arrayList6.add(l6);
        }
        Object[] array2 = arrayList6.toArray();
        String str4 = oWuW.fPgNAIlUFUoAmXb;
        String str5 = (String) d(str4, array2);
        xo1Var3.f1191a = str5;
        if (str5 == null) {
            xo1Var3.f1191a = (String) c(null, "com.android.internal.telephony.Phone", null, null, "GEMINI_SIM_" + (i + 1));
        }
        if (xo1Var3.f1191a == null) {
            xo1Var3.f1191a = (String) c(context.getSystemService("phone" + (i + 1)), null, str4, null, null);
        }
        Integer num2 = (Integer) d("getSimState", array2);
        if (num2 == null) {
            xo1Var3.c = -1;
        } else {
            xo1Var3.c = num2.intValue();
        }
        xo1Var3.b = (String) d("getSubscriberId", array);
        xo1Var3.d = (String) d("getSimOperator", array);
        xo1Var3.e = (String) d("getSimOperatorName", array);
        xo1Var3.f = (String) d("getSimCountryIso", array);
        xo1Var3.g = (String) d("getNetworkOperator", array);
        xo1Var3.h = (String) d("getNetworkOperatorName", array);
        xo1Var3.i = (String) d(rQcwh.MkgPhlTLqFTXCl, array);
        Boolean bool = (Boolean) d(GFUHKHDfiFuPm.gXx, array);
        if (bool == null) {
            xo1Var3.j = false;
        } else {
            xo1Var3.j = bool.booleanValue();
        }
        return xo1Var3;
    }

    public final Object d(String str, Object[] objArr) {
        boolean z;
        Object[] objArr2;
        Object[] objArr3 = objArr;
        Context context = this.f967a;
        Object obj = null;
        if (str.length() > 0) {
            ArrayList arrayList = new ArrayList();
            int i = 1;
            try {
                z = context.getSystemService("phone").toString().startsWith("android.telephony.MultiSimTelephonyManager");
                for (Object obj2 : objArr3) {
                    try {
                        if (obj2 != null) {
                            Object c2 = z ? objArr3.length >= 1 ? c(null, "android.telephony.MultiSimTelephonyManager", "getDefault", new Object[]{obj2}, null) : c(null, "android.telephony.MultiSimTelephonyManager", "getDefault", null, null) : context.getSystemService("phone");
                            if (!arrayList.contains(c2)) {
                                arrayList.add(c2);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                z = false;
            }
            if (!arrayList.contains(context.getSystemService("phone"))) {
                arrayList.add(context.getSystemService("phone"));
            }
            if (!arrayList.contains(c(null, "com.mediatek.telephony.TelephonyManagerEx", "getDefault", null, null))) {
                arrayList.add(c(null, "com.mediatek.telephony.TelephonyManagerEx", "getDefault", null, null));
            }
            if (!arrayList.contains(context.getSystemService("phone_msim"))) {
                arrayList.add(context.getSystemService("phone_msim"));
            }
            if (!arrayList.contains(null)) {
                arrayList.add(null);
            }
            String[] strArr = {null, "android.telephony.TelephonyManager", "android.telephony.MSimTelephonyManager", hTYJVDOvZnZlYL.WTWSTvvgGfyva, "com.mediatek.telephony.TelephonyManagerEx", "com.android.internal.telephony.Phone", "com.android.internal.telephony.PhoneFactory"};
            String[] strArr2 = {"", "Gemini", "Ext", "Ds", "ForSubscription", "ForPhone"};
            int i2 = 0;
            while (i2 < 6) {
                String str2 = strArr2[i2];
                int i3 = 0;
                while (i3 < 7) {
                    String str3 = strArr[i3];
                    int size = arrayList.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj3 = arrayList.get(i4);
                        i4++;
                        int i5 = 0;
                        while (i5 < objArr3.length) {
                            if (objArr3[i5] != null) {
                                String str4 = str + str2;
                                if (z) {
                                    objArr2 = null;
                                } else {
                                    objArr2 = new Object[i];
                                    objArr2[0] = objArr[i5];
                                }
                                Object c3 = c(obj3, str3, str4, objArr2, null);
                                if (c3 != null) {
                                    return c3;
                                }
                            }
                            i5++;
                            objArr3 = objArr;
                            i = 1;
                        }
                        objArr3 = objArr;
                    }
                    i3++;
                    objArr3 = objArr;
                    i = 1;
                }
                i2++;
                objArr3 = objArr;
                obj = null;
                i = 1;
            }
        }
        return obj;
    }
}
