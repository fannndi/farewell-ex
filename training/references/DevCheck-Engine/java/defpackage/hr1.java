package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class hr1 implements Runnable {
    public final la1 g;
    public final vq1 h;
    public final boolean i;
    public final int j;

    public hr1(la1 la1Var, vq1 vq1Var, boolean z, int i) {
        la1Var.getClass();
        vq1Var.getClass();
        this.g = la1Var;
        this.h = vq1Var;
        this.i = z;
        this.j = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yc2 b;
        boolean z = this.i;
        la1 la1Var = this.g;
        vq1 vq1Var = this.h;
        if (z) {
            int i = this.j;
            la1Var.getClass();
            String str = vq1Var.f1098a.f1176a;
            synchronized (la1Var.k) {
                b = la1Var.b(str);
            }
            la1.d(b, i);
        } else {
            int i2 = this.j;
            la1Var.getClass();
            String str2 = vq1Var.f1098a.f1176a;
            synchronized (la1Var.k) {
                try {
                    if (la1Var.f.get(str2) != null) {
                        ai1.h().getClass();
                    } else {
                        Set set = (Set) la1Var.h.get(str2);
                        if (set != null && set.contains(vq1Var)) {
                            la1.d(la1Var.b(str2), i2);
                        }
                    }
                } finally {
                }
            }
        }
        ai1 h = ai1.h();
        ai1.k("StopWorkRunnable");
        String str3 = this.h.f1098a.f1176a;
        h.getClass();
    }
}
