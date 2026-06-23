package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import flar2.devcheck.R;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocket;

/* loaded from: classes.dex */
public class ai1 implements n20, vk1, px, o81, r02, sa1 {
    public static ai1 g;
    public static volatile ai1 i;
    public static volatile ai1 l;
    public static ai1 p;
    public static final Object h = new Object();
    public static final /* synthetic */ ai1 j = new ai1();
    public static final Object k = new Object();
    public static final c51 m = new c51(1);
    public static final c51 n = new c51(0);
    public static final ai1 o = new ai1();

    public static final void d(aa aaVar) {
        th2 th2Var = aa.h;
        if (aa.i == null) {
            aa.i = new aa();
            z9 z9Var = new z9("Okio Watchdog");
            z9Var.setDaemon(true);
            z9Var.start();
        }
        long nanoTime = System.nanoTime();
        long j2 = aaVar.c;
        boolean z = aaVar.f102a;
        if (j2 != 0 && z) {
            aaVar.g = Math.min(j2, aaVar.c() - nanoTime) + nanoTime;
        } else if (j2 != 0) {
            aaVar.g = nanoTime + j2;
        } else {
            if (!z) {
                throw new AssertionError();
            }
            aaVar.g = aaVar.c();
        }
        th2 th2Var2 = aa.h;
        int i2 = th2Var2.g + 1;
        th2Var2.g = i2;
        aa[] aaVarArr = (aa[]) th2Var2.h;
        if (i2 == aaVarArr.length) {
            aa[] aaVarArr2 = new aa[i2 * 2];
            u9.i0(0, 0, 14, aaVarArr, aaVarArr2);
            th2Var2.h = aaVarArr2;
        }
        th2Var2.c(i2, aaVar);
        if (aaVar.f == 1) {
            aa.k.signal();
        }
    }

    public static aa e() {
        th2 th2Var = aa.h;
        aa aaVar = ((aa[]) th2Var.h)[1];
        if (aaVar == null) {
            long nanoTime = System.nanoTime();
            aa.k.await(aa.l, TimeUnit.MILLISECONDS);
            if (((aa[]) th2Var.h)[1] != null || System.nanoTime() - nanoTime < aa.m) {
                return null;
            }
            return aa.i;
        }
        long nanoTime2 = aaVar.g - System.nanoTime();
        if (nanoTime2 > 0) {
            aa.k.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        th2Var.d(aaVar);
        aaVar.e = 2;
        return aaVar;
    }

    public static cb1 f(String str) {
        if (str.equals("http/1.0")) {
            return cb1.i;
        }
        if (str.equals("http/1.1")) {
            return cb1.j;
        }
        if (str.equals("h2_prior_knowledge")) {
            return cb1.m;
        }
        if (str.equals("h2")) {
            return cb1.l;
        }
        if (str.equals("spdy/3.1")) {
            return cb1.k;
        }
        if (str.equals("quic")) {
            return cb1.n;
        }
        if (is1.b0(str, "h3", false)) {
            return cb1.o;
        }
        rw.f("Unexpected protocol: ".concat(str));
        return null;
    }

    public static ai1 h() {
        ai1 ai1Var;
        synchronized (k) {
            try {
                if (l == null) {
                    l = new ai1();
                }
                ai1Var = l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ai1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0045, code lost:
    
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0082, code lost:
    
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0075, code lost:
    
        if (r11 != false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00a2, code lost:
    
        if (r10 != (-1)) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean j(defpackage.a80 r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ai1.j(a80, android.text.Editable, int, int, boolean):boolean");
    }

    public static String k(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    @Override // defpackage.n20
    public boolean a(SSLSocket sSLSocket) {
        return is1.b0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.n20
    public hp1 b(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new z3(cls2);
    }

    @Override // defpackage.o81
    public CharSequence c(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        CharSequence[] charSequenceArr = listPreference.Y;
        int w = listPreference.w(listPreference.a0);
        if (TextUtils.isEmpty((w < 0 || charSequenceArr == null) ? null : charSequenceArr[w])) {
            return listPreference.g.getString(R.string.not_set);
        }
        int w2 = listPreference.w(listPreference.a0);
        if (w2 < 0 || charSequenceArr == null) {
            return null;
        }
        return charSequenceArr[w2];
    }

    @Override // defpackage.sa1
    public void g(int i2, Object obj) {
        if (i2 == 6 || i2 == 7 || i2 == 8) {
        }
    }

    public Signature[] i(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public void l(Context context, no2 no2Var) {
        try {
            context.unbindService(no2Var);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    @Override // defpackage.vk1
    public void onScrollLimit(int i2, int i3, int i4, boolean z) {
    }

    @Override // defpackage.vk1
    public void onScrollProgress(int i2, int i3, int i4, int i5) {
    }
}
