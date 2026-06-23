package defpackage;

import android.os.Looper;

/* loaded from: classes.dex */
public final class h9 extends k32 {
    public static volatile h9 k;
    public static final g9 l = new g9(0);
    public final m20 j = new m20();

    public static h9 E() {
        if (k != null) {
            return k;
        }
        synchronized (h9.class) {
            try {
                if (k == null) {
                    k = new h9();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return k;
    }

    public final void F(Runnable runnable) {
        m20 m20Var = this.j;
        if (m20Var.l == null) {
            synchronized (m20Var.j) {
                try {
                    if (m20Var.l == null) {
                        m20Var.l = m20.E(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        m20Var.l.post(runnable);
    }
}
