package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import android.text.TextUtils;
import android.util.Base64;
import flar2.devcheck.dpreference.Eg.aEQQDLUUMo;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class il1 implements SharedPreferences {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f438a;
    public d3 b;
    public final String c;
    public final Context d;
    public final String e;
    public final byte[] f;

    public il1(Context context, String str) {
        String str2;
        String str3;
        this.e = null;
        this.f = null;
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.c = "flar2.devcheck_preferences";
        this.f438a = TextUtils.isEmpty("flar2.devcheck_preferences") ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.createDeviceProtectedStorageContext().getSharedPreferences("flar2.devcheck_preferences", 0);
        this.e = str;
        byte[] bytes = e(applicationContext).getBytes(StandardCharsets.UTF_8);
        this.f = bytes;
        if (!TextUtils.isEmpty(str)) {
            try {
                this.b = e3.e(str, bytes);
                return;
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        }
        try {
            String b = b(applicationContext);
            String[] strArr = {b, c(applicationContext, 10000), c(applicationContext, 100000)};
            int i = 0;
            while (true) {
                if (i >= 3) {
                    str2 = null;
                    str3 = null;
                    break;
                } else {
                    str2 = strArr[i];
                    if (!TextUtils.isEmpty(str2) && (str3 = this.f438a.getString(str2, null)) != null) {
                        break;
                    }
                    i++;
                }
            }
            if (str3 == null && !TextUtils.isEmpty("flar2.devcheck_preferences")) {
                SharedPreferences sharedPreferences = this.d.createDeviceProtectedStorageContext().getSharedPreferences("flar2.devcheck_preferences", 0);
                SharedPreferences sharedPreferences2 = this.d.getSharedPreferences("flar2.devcheck_preferences", 0);
                int i2 = 0;
                while (true) {
                    if (i2 >= 3) {
                        break;
                    }
                    String str4 = strArr[i2];
                    if (!TextUtils.isEmpty(str4)) {
                        String string = sharedPreferences.getString(str4, null);
                        string = string == null ? sharedPreferences2.getString(str4, null) : string;
                        if (string != null) {
                            str2 = str4;
                            str3 = string;
                            break;
                        }
                    }
                    i2++;
                }
                if (str3 != null && str2 != null) {
                    this.f438a.edit().putString(str2, str3).apply();
                }
            }
            if (str3 == null) {
                String j = j(this.f438a);
                if (j == null && !TextUtils.isEmpty("flar2.devcheck_preferences")) {
                    SharedPreferences sharedPreferences3 = this.d.createDeviceProtectedStorageContext().getSharedPreferences("flar2.devcheck_preferences", 0);
                    SharedPreferences sharedPreferences4 = this.d.getSharedPreferences("flar2.devcheck_preferences", 0);
                    j = j(sharedPreferences3);
                    if (j == null) {
                        j = j(sharedPreferences4);
                    }
                }
                if (j != null) {
                    str3 = j;
                }
            }
            if (str3 == null) {
                this.b = e3.d();
                if (!TextUtils.isEmpty(b)) {
                    this.f438a.edit().putString(b, this.b.toString()).commit();
                }
            } else {
                this.b = h(str3);
                if (!TextUtils.isEmpty(b)) {
                    this.f438a.edit().putString(b, this.b.toString()).apply();
                }
            }
            if (this.b == null) {
                throw new GeneralSecurityException("Problem generating or loading Key");
            }
            i();
        } catch (GeneralSecurityException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static String b(Context context) {
        try {
            byte[] encoded = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(context.getPackageName().toCharArray(), e(context).getBytes(StandardCharsets.UTF_8), 10000, 384)).getEncoded();
            byte[] copyOfRange = Arrays.copyOfRange(encoded, 0, 16);
            byte[] copyOfRange2 = Arrays.copyOfRange(encoded, 16, 48);
            return f(Base64.encodeToString(new SecretKeySpec(copyOfRange, aEQQDLUUMo.gUmDQdCBIYG).getEncoded(), 2) + GFUHKHDfiFuPm.TLeSNbf + Base64.encodeToString(new SecretKeySpec(copyOfRange2, "HmacSHA256").getEncoded(), 2));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c(Context context, int i) {
        try {
            byte[] encoded = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(context.getPackageName().toCharArray(), e(context).getBytes(StandardCharsets.UTF_8), i, rt0.t)).getEncoded();
            return f(Base64.encodeToString(encoded, 2) + ":" + Base64.encodeToString(encoded, 2));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String e(Context context) {
        try {
            String str = (String) Build.class.getField("SERIAL").get(null);
            return TextUtils.isEmpty(str) ? Settings.Secure.getString(context.getContentResolver(), "android_id") : str;
        } catch (Exception unused) {
            return Settings.Secure.getString(context.getContentResolver(), "android_id");
        }
    }

    public static String f(String str) {
        byte[] bytes;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            try {
                bytes = str.getBytes("UTF-8");
            } catch (UnsupportedEncodingException unused) {
                bytes = str.getBytes();
            }
            messageDigest.update(bytes, 0, bytes.length);
            return Base64.encodeToString(messageDigest.digest(), 2);
        } catch (NoSuchAlgorithmException unused2) {
            return "0";
        }
    }

    public static d3 h(String str) {
        try {
            return e3.f(str);
        } catch (InvalidKeyException e) {
            String[] split = str.split(":");
            if (split.length != 2) {
                throw e;
            }
            byte[] decode = Base64.decode(split[0], 2);
            byte[] decode2 = Base64.decode(split[1], 2);
            if (decode == null || decode2 == null || decode.length != 32 || decode2.length != 32) {
                throw e;
            }
            return new d3(new SecretKeySpec(decode, "AES"), new SecretKeySpec(decode2, "HmacSHA256"));
        }
    }

    public static String j(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return null;
        }
        Iterator<Map.Entry<String, ?>> it = sharedPreferences.getAll().entrySet().iterator();
        while (it.hasNext()) {
            Object value = it.next().getValue();
            if (value instanceof String) {
                String str = (String) value;
                if (str.indexOf(58) > 0 && str.indexOf(58) == str.lastIndexOf(58)) {
                    try {
                        h(str);
                        return str;
                    } catch (Exception unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public final String a(String str) {
        String a2;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return e3.a(new b3(str), this.b);
        } catch (Exception unused) {
            String str2 = this.e;
            if (TextUtils.isEmpty(str2)) {
                return null;
            }
            byte[] bArr = this.f;
            try {
                if (bArr == null) {
                    return null;
                }
                try {
                    a2 = e3.a(new b3(str), e3.e(str2, bArr));
                } catch (GeneralSecurityException unused2) {
                    try {
                        a2 = e3.a(new b3(str), ym0.f(str2, bArr, 100000));
                    } catch (GeneralSecurityException unused3) {
                        a2 = e3.a(new b3(str), ym0.f(str2, bArr, 10000));
                    }
                    return a2;
                }
                return a2;
            } catch (Exception unused4) {
                return null;
            }
        }
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.f438a.contains(f(str));
    }

    public final String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return e3.b(str, this.b).toString();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new hl1(this);
    }

    public final void g(String str, String str2, String str3) {
        try {
            String b3Var = e3.b(str3, this.b).toString();
            if (b3Var.equals(str2)) {
                return;
            }
            this.f438a.edit().putString(f(str), b3Var).apply();
        } catch (Exception unused) {
        }
    }

    @Override // android.content.SharedPreferences
    public final Map getAll() {
        Map<String, ?> all = this.f438a.getAll();
        HashMap hashMap = new HashMap(all.size());
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            Object value = entry.getValue();
            if (value != null) {
                if (value instanceof String) {
                    d3 d3Var = this.b;
                    if (value.equals(d3Var != null ? d3Var.toString() : "")) {
                    }
                }
                String a2 = a(value.toString());
                if (a2 != null) {
                    hashMap.put(entry.getKey(), a2);
                }
            }
        }
        return hashMap;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        String a2;
        String string = this.f438a.getString(f(str), null);
        if (string == null || (a2 = a(string)) == null) {
            return z;
        }
        boolean parseBoolean = Boolean.parseBoolean(a2);
        g(str, string, Boolean.toString(parseBoolean));
        return parseBoolean;
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        String a2;
        String string = this.f438a.getString(f(str), null);
        if (string != null && (a2 = a(string)) != null) {
            try {
                float parseFloat = Float.parseFloat(a2);
                g(str, string, Float.toString(parseFloat));
                return parseFloat;
            } catch (NumberFormatException unused) {
            }
        }
        return f;
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        String a2;
        String string = this.f438a.getString(f(str), null);
        if (string != null && (a2 = a(string)) != null) {
            try {
                int parseInt = Integer.parseInt(a2);
                g(str, string, Integer.toString(parseInt));
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        String a2;
        String string = this.f438a.getString(f(str), null);
        if (string != null && (a2 = a(string)) != null) {
            try {
                long parseLong = Long.parseLong(a2);
                g(str, string, Long.toString(parseLong));
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        return j;
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        String a2;
        String string = this.f438a.getString(f(str), null);
        if (string == null || (a2 = a(string)) == null) {
            return str2;
        }
        g(str, string, a2);
        return a2;
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        Set<String> stringSet = this.f438a.getStringSet(f(str), null);
        if (stringSet == null) {
            return set;
        }
        HashSet hashSet = new HashSet(stringSet.size());
        Iterator<String> it = stringSet.iterator();
        while (it.hasNext()) {
            String a2 = a(it.next());
            if (a2 != null) {
                hashSet.add(a2);
            }
        }
        return hashSet;
    }

    public final void i() {
        String a2;
        String str = this.c;
        SharedPreferences sharedPreferences = this.f438a;
        Context context = this.d;
        try {
            byte[] encoded = this.b.f168a.getEncoded();
            byte[] encoded2 = this.b.b.getEncoded();
            if (encoded == null || encoded.length != 32 || encoded2 == null || encoded2.length != 32) {
                return;
            }
            Map<String, ?> all = sharedPreferences.getAll();
            HashMap hashMap = new HashMap(all.size());
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof String) {
                    String str2 = (String) value;
                    if (!str2.equals(this.b.toString()) && (a2 = a(str2)) != null) {
                        hashMap.put(entry.getKey(), a2);
                    }
                }
            }
            d3 d = e3.d();
            String b = b(context);
            if (b != null) {
                sharedPreferences.edit().putString(b, d.toString()).commit();
            }
            this.b = d;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            for (Map.Entry entry2 : hashMap.entrySet()) {
                String d2 = d((String) entry2.getValue());
                if (d2 != null) {
                    edit.putString((String) entry2.getKey(), d2);
                }
            }
            edit.apply();
            String c = c(context, 10000);
            String c2 = c(context, 100000);
            SharedPreferences.Editor edit2 = sharedPreferences.edit();
            if (!TextUtils.isEmpty(c)) {
                edit2.remove(c);
            }
            if (!TextUtils.isEmpty(c2)) {
                edit2.remove(c2);
            }
            edit2.apply();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            SharedPreferences sharedPreferences2 = context.createDeviceProtectedStorageContext().getSharedPreferences(str, 0);
            SharedPreferences sharedPreferences3 = context.getSharedPreferences(str, 0);
            SharedPreferences.Editor edit3 = sharedPreferences2.edit();
            if (!TextUtils.isEmpty(c)) {
                edit3.remove(c);
            }
            if (!TextUtils.isEmpty(c2)) {
                edit3.remove(c2);
            }
            edit3.apply();
            SharedPreferences.Editor edit4 = sharedPreferences3.edit();
            if (!TextUtils.isEmpty(c)) {
                edit4.remove(c);
            }
            if (!TextUtils.isEmpty(c2)) {
                edit4.remove(c2);
            }
            edit4.apply();
        } catch (Throwable unused) {
        }
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f438a.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f438a.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
