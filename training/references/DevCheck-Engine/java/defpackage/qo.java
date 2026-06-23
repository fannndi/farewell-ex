package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes.dex */
public final class qo implements k12 {

    /* renamed from: a, reason: collision with root package name */
    public final h70 f854a;
    public final ConnectivityManager b;
    public final Context c;
    public final URL d;
    public final ir e;
    public final ir f;
    public final int g;

    public qo(Context context, ir irVar, ir irVar2) {
        ko0 ko0Var = new ko0();
        ha haVar = ha.f371a;
        ko0Var.a(xe.class, haVar);
        ko0Var.a(ab.class, haVar);
        ka kaVar = ka.f523a;
        ko0Var.a(ct0.class, kaVar);
        ko0Var.a(hb.class, kaVar);
        ia iaVar = ia.f420a;
        ko0Var.a(fr.class, iaVar);
        ko0Var.a(bb.class, iaVar);
        ga gaVar = ga.f324a;
        ko0Var.a(s3.class, gaVar);
        ko0Var.a(ya.class, gaVar);
        ja jaVar = ja.f470a;
        ko0Var.a(zs0.class, jaVar);
        ko0Var.a(gb.class, jaVar);
        la laVar = la.f575a;
        ko0Var.a(q11.class, laVar);
        ko0Var.a(jb.class, laVar);
        ko0Var.d = true;
        this.f854a = new h70(ko0Var);
        this.c = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        this.d = b(lm.c);
        this.e = irVar2;
        this.f = irVar;
        this.g = 130000;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Invalid url: " + str, e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a8, code lost:
    
        if (((defpackage.o11) defpackage.o11.g.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eb a(defpackage.eb r8) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qo.a(eb):eb");
    }
}
