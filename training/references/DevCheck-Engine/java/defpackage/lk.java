package defpackage;

import android.os.Looper;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public class lk extends i72 {
    public ExecutorService b;
    public kk1 c;
    public fh d;
    public xi0 e;
    public kp f;
    public kk g;
    public String h;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public qy0 p;
    public qy0 q;
    public qy0 r;
    public qy0 s;
    public qy0 t;
    public qy0 v;
    public qy0 w;
    public qy0 x;
    public int i = 0;
    public boolean u = true;

    public static void f(qy0 qy0Var, Object obj) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            qy0Var.k(obj);
        } else {
            qy0Var.i(obj);
        }
    }

    public final int c() {
        return this.d != null ? 255 : 0;
    }

    public final void d(uj ujVar) {
        if (this.q == null) {
            this.q = new qy0();
        }
        f(this.q, ujVar);
    }

    public final void e(boolean z) {
        if (this.t == null) {
            this.t = new qy0();
        }
        f(this.t, Boolean.valueOf(z));
    }
}
