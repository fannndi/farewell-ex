package defpackage;

import java.io.Closeable;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public abstract class ng1 implements Closeable {
    public static final mg1 g;

    static {
        km kmVar = km.j;
        kmVar.getClass();
        wl wlVar = new wl();
        wlVar.G(kmVar);
        g = new mg1(kmVar.g.length, wlVar);
    }

    public abstract long a();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        pd2.b(j());
    }

    public abstract cw0 e();

    public abstract fm j();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r3v8 */
    public final String l() {
        Charset charset;
        fm j = j();
        String th = null;
        try {
            cw0 e = e();
            if (e == null || (charset = cw0.a(e)) == null) {
                charset = lp.f601a;
            }
            String B = j.B(rd2.e(j, charset));
            try {
                j.close();
            } catch (Throwable th2) {
                th = th2;
            }
            String str = th;
            th = B;
            th = str;
        } catch (Throwable th3) {
            th = th3;
            if (j != null) {
                try {
                    j.close();
                } catch (Throwable th4) {
                    bw0.b(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }
}
