package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.graphics.Path;
import android.os.Build;
import android.view.View;
import androidx.appcompat.view.menu.MenuBuilder;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public class pg0 implements ex0, px, xt1, sa1, et1, sa0 {
    public static pg0 g;
    public static final pg0 h = new pg0();
    public static final pg0 i = new pg0();
    public static final pg0 j = new pg0();
    public static final /* synthetic */ pg0 k = new pg0();
    public static final pg0 l = new pg0();
    public static final pg0 m = new pg0();
    public static volatile pg0 n;

    public pg0(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            new jp1(view);
        } else {
            new j70(view);
        }
    }

    public static final lq c(pg0 pg0Var, String str) {
        lq lqVar = new lq(str);
        lq.d.put(str, lqVar);
        return lqVar;
    }

    public static km f(String str) {
        if (str.length() % 2 != 0) {
            c.d("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (ju0.b(str.charAt(i3 + 1)) + (ju0.b(str.charAt(i3)) << 4));
        }
        return new km(bArr);
    }

    public static km h(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(lp.f601a);
        bytes.getClass();
        km kmVar = new km(bytes);
        kmVar.i = str;
        return kmVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static hz1 j(String str) {
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return hz1.k;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return hz1.j;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return hz1.i;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return hz1.l;
            }
        } else if (str.equals("SSLv3")) {
            return hz1.m;
        }
        c.m("Unexpected TLS version: ".concat(str));
        return null;
    }

    public static Path k(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f7, code lost:
    
        r6 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean l(android.content.pm.PackageInfo r13) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg0.l(android.content.pm.PackageInfo):boolean");
    }

    public static xm2 m(PackageInfo packageInfo, xm2... xm2VarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        jn2 jn2Var = new jn2(packageInfo.signatures[0].toByteArray());
        for (int i2 = 0; i2 < xm2VarArr.length; i2++) {
            if (xm2VarArr[i2].equals(jn2Var)) {
                return xm2VarArr[i2];
            }
        }
        return null;
    }

    @Override // defpackage.ex0
    public boolean G(MenuBuilder menuBuilder) {
        return false;
    }

    @Override // defpackage.ex0
    public void a(MenuBuilder menuBuilder, boolean z) {
    }

    @Override // defpackage.et1
    public ft1 b(tp tpVar) {
        return new xe0((Context) tpVar.c, (String) tpVar.d, (ko) tpVar.e, tpVar.f999a, tpVar.b);
    }

    @Override // defpackage.xt1
    public void d() {
    }

    public float e(float f) {
        return 1.0f;
    }

    @Override // defpackage.sa1
    public void g(int i2, Object obj) {
    }

    @Override // defpackage.db1
    public Object get() {
        i42 i42Var = new i42();
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set == null) {
            jw0.f("Null flags");
            return null;
        }
        hashMap.put(d91.g, new mb(30000L, 86400000L, set));
        if (set == null) {
            jw0.f("Null flags");
            return null;
        }
        hashMap.put(d91.i, new mb(1000L, 86400000L, set));
        if (set == null) {
            jw0.f("Null flags");
            return null;
        }
        Set unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(ck1.h)));
        if (unmodifiableSet == null) {
            jw0.f("Null flags");
            return null;
        }
        hashMap.put(d91.h, new mb(86400000L, 86400000L, unmodifiableSet));
        if (hashMap.keySet().size() >= d91.values().length) {
            new HashMap();
            return new lb(i42Var, hashMap);
        }
        c.n("Not all priorities have been configured");
        return null;
    }

    public synchronized lq i(String str) {
        lq lqVar;
        try {
            str.getClass();
            LinkedHashMap linkedHashMap = lq.d;
            lqVar = (lq) linkedHashMap.get(str);
            if (lqVar == null) {
                lqVar = (lq) linkedHashMap.get(is1.b0(str, "TLS_", false) ? "SSL_".concat(str.substring(4)) : is1.b0(str, "SSL_", false) ? "TLS_".concat(str.substring(4)) : str);
                if (lqVar == null) {
                    lqVar = new lq(str);
                }
                linkedHashMap.put(str, lqVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return lqVar;
    }
}
