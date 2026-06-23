package defpackage;

import Cwd.ynLVXgis;
import android.os.Build;
import com.google.android.material.snackbar.qXlx.IGQCApxXGMWo;
import flar2.devcheck.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class d70 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f178a = {R.attr.dynamicColorThemeOverlay};
    public static final Map b;
    public static final Map c;

    static {
        z60 z60Var = new z60();
        a70 a70Var = new a70();
        HashMap hashMap = new HashMap();
        hashMap.put("fcnt", z60Var);
        hashMap.put("google", z60Var);
        hashMap.put("hmd global", z60Var);
        hashMap.put("infinix", z60Var);
        hashMap.put("infinix mobility limited", z60Var);
        hashMap.put("itel", z60Var);
        hashMap.put("kyocera", z60Var);
        hashMap.put("lenovo", z60Var);
        hashMap.put("lge", z60Var);
        hashMap.put("meizu", z60Var);
        hashMap.put("motorola", z60Var);
        hashMap.put("nothing", z60Var);
        hashMap.put("oneplus", z60Var);
        hashMap.put("oppo", z60Var);
        hashMap.put("realme", z60Var);
        hashMap.put("robolectric", z60Var);
        hashMap.put("samsung", a70Var);
        hashMap.put("sharp", z60Var);
        hashMap.put("shift", z60Var);
        hashMap.put("sony", z60Var);
        hashMap.put(IGQCApxXGMWo.iJlZVQgVnWHAsmx, z60Var);
        hashMap.put("tecno", z60Var);
        hashMap.put("tecno mobile limited", z60Var);
        hashMap.put("vivo", z60Var);
        hashMap.put("wingtech", z60Var);
        hashMap.put("xiaomi", z60Var);
        b = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("asus", z60Var);
        hashMap2.put("jio", z60Var);
        c = Collections.unmodifiableMap(hashMap2);
    }

    public static boolean a() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            int i2 = hm.f390a;
            if (i >= 33) {
                return true;
            }
            if (i >= 32) {
                String str = Build.VERSION.CODENAME;
                str.getClass();
                if (!ynLVXgis.Uns.equals(str)) {
                    Locale locale = Locale.ROOT;
                    String upperCase = str.toUpperCase(locale);
                    upperCase.getClass();
                    Integer num = upperCase.equals("BAKLAVA") ? r1 : null;
                    String upperCase2 = "Tiramisu".toUpperCase(locale);
                    upperCase2.getClass();
                    r1 = upperCase2.equals("BAKLAVA") ? 0 : null;
                    if (num == null || r1 == null) {
                        if (num == null && r1 == null) {
                            String upperCase3 = str.toUpperCase(locale);
                            upperCase3.getClass();
                            String upperCase4 = "Tiramisu".toUpperCase(locale);
                            upperCase4.getClass();
                            if (upperCase3.compareTo(upperCase4) >= 0) {
                                return true;
                            }
                        } else if (num != null) {
                            return true;
                        }
                    } else if (num.intValue() >= r1.intValue()) {
                        return true;
                    }
                }
            }
            String str2 = Build.MANUFACTURER;
            Locale locale2 = Locale.ROOT;
            b70 b70Var = (b70) b.get(str2.toLowerCase(locale2));
            if (b70Var == null) {
                b70Var = (b70) c.get(Build.BRAND.toLowerCase(locale2));
            }
            if (b70Var != null && b70Var.b()) {
                return true;
            }
        }
        return false;
    }
}
