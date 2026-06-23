package defpackage;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public abstract class e3 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f217a = new AtomicBoolean(false);

    public static String a(b3 b3Var, d3 d3Var) {
        byte[] bArr = b3Var.f63a;
        byte[] bArr2 = b3Var.c;
        byte[] bArr3 = b3Var.b;
        if (d3Var == null) {
            c.m("secretKeys == null");
            return null;
        }
        if (bArr3 == null || bArr3.length != 16) {
            throw new GeneralSecurityException("Invalid IV length");
        }
        if (bArr2 == null || bArr2.length == 0) {
            throw new GeneralSecurityException("Missing MAC");
        }
        byte[] bArr4 = new byte[bArr3.length + bArr.length];
        System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
        System.arraycopy(bArr, 0, bArr4, bArr3.length, bArr.length);
        SecretKeySpec secretKeySpec = d3Var.b;
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(secretKeySpec);
        byte[] doFinal = mac.doFinal(bArr4);
        if (doFinal != null && doFinal.length == bArr2.length) {
            int i = 0;
            for (int i2 = 0; i2 < doFinal.length; i2++) {
                i |= doFinal[i2] ^ bArr2[i2];
            }
            if (i == 0) {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, d3Var.f168a, new IvParameterSpec(bArr3));
                return new String(cipher.doFinal(bArr), StandardCharsets.UTF_8);
            }
        }
        throw new GeneralSecurityException("MAC check failed");
    }

    public static b3 b(String str, d3 d3Var) {
        if (str == null) {
            c.m("plaintext == null");
            return null;
        }
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (d3Var == null) {
            c.m("secretKeys == null");
            return null;
        }
        if (bytes == null) {
            c.m("plaintext == null");
            return null;
        }
        c();
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(1, d3Var.f168a, new IvParameterSpec(bArr));
        byte[] iv = cipher.getIV();
        byte[] doFinal = cipher.doFinal(bytes);
        byte[] bArr2 = new byte[iv.length + doFinal.length];
        System.arraycopy(iv, 0, bArr2, 0, iv.length);
        System.arraycopy(doFinal, 0, bArr2, iv.length, doFinal.length);
        SecretKeySpec secretKeySpec = d3Var.b;
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(secretKeySpec);
        return new b3(doFinal, iv, mac.doFinal(bArr2));
    }

    public static void c() {
        AtomicBoolean atomicBoolean = f217a;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (c3.class) {
            try {
                if (atomicBoolean.get()) {
                    return;
                }
                atomicBoolean.set(true);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static d3 d() {
        c();
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(rt0.s);
        SecretKey generateKey = keyGenerator.generateKey();
        c();
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        return new d3(generateKey, new SecretKeySpec(bArr, "HmacSHA256"));
    }

    public static d3 e(String str, byte[] bArr) {
        if (str == null) {
            c.m("password == null");
            return null;
        }
        if (bArr == null) {
            c.m("salt == null");
            return null;
        }
        c();
        byte[] encoded = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec(str.toCharArray(), bArr, 10000, 384)).getEncoded();
        byte[] bArr2 = new byte[16];
        System.arraycopy(encoded, 0, bArr2, 0, 16);
        byte[] bArr3 = new byte[32];
        System.arraycopy(encoded, 16, bArr3, 0, 32);
        return new d3(new SecretKeySpec(bArr2, "AES"), new SecretKeySpec(bArr3, "HmacSHA256"));
    }

    public static d3 f(String str) {
        String[] split = str.split(":");
        if (split.length != 2) {
            c.m("Cannot parse aesKey:hmacKey");
            return null;
        }
        byte[] decode = Base64.decode(split[0], 2);
        if (decode == null || decode.length != 16) {
            throw new InvalidKeyException("AES key must be 16 bytes");
        }
        byte[] decode2 = Base64.decode(split[1], 2);
        if (decode2 == null || decode2.length != 32) {
            throw new InvalidKeyException("HMAC key must be 32 bytes");
        }
        return new d3(new SecretKeySpec(decode, "AES"), new SecretKeySpec(decode2, "HmacSHA256"));
    }
}
