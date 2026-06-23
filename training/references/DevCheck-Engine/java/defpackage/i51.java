package defpackage;

import android.content.SharedPreferences;
import android.provider.Settings;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public abstract class i51 {

    /* renamed from: a, reason: collision with root package name */
    public static il1 f412a;
    public static final String b = d10.n().getString(R.string.devcheck_pro);
    public static final String c = d10.n().getString(R.string.devcheck_pro2);
    public static final String d = d10.n().getString(R.string.devcheck_pro3);
    public static final String e = d10.n().getString(R.string.devcheck_pro_trans);
    public static final String f = d10.n().getString(R.string.devcheck_pro2_trans);
    public static final String g = d10.n().getString(R.string.devcheck_pro3_trans);
    public static final String h = d10.n().getString(R.string.devcheck_pro_legacy);
    public static final String i = d10.n().getString(R.string.devcheck_pro2_legacy);
    public static final String j = d10.n().getString(R.string.devcheck_pro3_legacy);
    public static final String k = d10.n().getString(R.string.devcheck_pro_discount_legacy);

    public static void a(String str) {
        il1 il1Var = (il1) f();
        il1Var.getClass();
        SharedPreferences.Editor edit = il1Var.f438a.edit();
        edit.remove(il1.f(str));
        edit.commit();
    }

    public static Boolean b(String str) {
        return Boolean.valueOf(((il1) f()).getBoolean(str, false));
    }

    public static int c(int i2, String str) {
        try {
            return ((il1) f()).getInt(str, i2);
        } catch (Exception unused) {
            return i2;
        }
    }

    public static long d(String str) {
        return ((il1) f()).getLong(str, 0L);
    }

    public static String e(String str) {
        return ((il1) f()).getString(str, null);
    }

    public static SharedPreferences f() {
        if (f412a == null) {
            f412a = new il1(d10.n(), Settings.Secure.getString(d10.n().getContentResolver(), "android_id") + "prefCPUInfo");
        }
        return f412a;
    }

    public static boolean g(String str) {
        try {
            return ((il1) f()).contains(str);
        } catch (Error | Exception unused) {
            return false;
        }
    }

    public static void h(String str, boolean z) {
        il1 il1Var = (il1) f();
        il1Var.getClass();
        SharedPreferences.Editor edit = il1Var.f438a.edit();
        String d2 = il1Var.d(Boolean.toString(z));
        if (d2 != null) {
            edit.putString(il1.f(str), d2);
        }
        edit.apply();
    }

    public static void i(String str, boolean z) {
        il1 il1Var = (il1) f();
        il1Var.getClass();
        SharedPreferences.Editor edit = il1Var.f438a.edit();
        String d2 = il1Var.d(Boolean.toString(z));
        if (d2 != null) {
            edit.putString(il1.f(str), d2);
        }
        edit.commit();
    }

    public static void j(int i2, String str) {
        il1 il1Var = (il1) f();
        il1Var.getClass();
        SharedPreferences.Editor edit = il1Var.f438a.edit();
        String d2 = il1Var.d(Integer.toString(i2));
        if (d2 != null) {
            edit.putString(il1.f(str), d2);
        }
        edit.apply();
    }

    public static void k(String str, long j2) {
        il1 il1Var = (il1) f();
        il1Var.getClass();
        SharedPreferences.Editor edit = il1Var.f438a.edit();
        String d2 = il1Var.d(Long.toString(j2));
        if (d2 != null) {
            edit.putString(il1.f(str), d2);
        }
        edit.apply();
    }

    public static void l(String str, String str2) {
        il1 il1Var = (il1) f();
        il1Var.getClass();
        SharedPreferences.Editor edit = il1Var.f438a.edit();
        String d2 = il1Var.d(str2);
        String f2 = il1.f(str);
        if (d2 == null) {
            edit.remove(f2);
        } else {
            edit.putString(f2, d2);
        }
        edit.apply();
    }

    public static void m(String str, String str2) {
        il1 il1Var = (il1) f();
        il1Var.getClass();
        SharedPreferences.Editor edit = il1Var.f438a.edit();
        String d2 = il1Var.d(str2);
        String f2 = il1.f(str);
        if (d2 == null) {
            edit.remove(f2);
        } else {
            edit.putString(f2, d2);
        }
        edit.commit();
    }
}
