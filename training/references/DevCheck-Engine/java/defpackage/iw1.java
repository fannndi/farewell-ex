package defpackage;

import com.jjoe64.graphview.XZMC.MiGPiFgcCQCVh;
import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class iw1 {

    /* renamed from: a, reason: collision with root package name */
    public final jw1 f453a;
    public final String b;
    public boolean c;
    public lv1 d;
    public final ArrayList e = new ArrayList();
    public boolean f;

    public iw1(jw1 jw1Var, String str) {
        this.f453a = jw1Var;
        this.b = str;
    }

    public static void b(iw1 iw1Var, String str, af0 af0Var) {
        iw1Var.getClass();
        str.getClass();
        af0Var.getClass();
        iw1Var.c(new fd1(str, af0Var), 0L);
    }

    public final boolean a() {
        lv1 lv1Var = this.d;
        if (lv1Var != null && lv1Var.b) {
            this.f = true;
        }
        ArrayList arrayList = this.e;
        boolean z = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((lv1) arrayList.get(size)).b) {
                Logger logger = this.f453a.b;
                lv1 lv1Var2 = (lv1) arrayList.get(size);
                if (logger.isLoggable(Level.FINE)) {
                    ju0.c(logger, lv1Var2, this, "canceled");
                }
                arrayList.remove(size);
                z = true;
            }
        }
        return z;
    }

    public final void c(lv1 lv1Var, long j) {
        lv1Var.getClass();
        synchronized (this.f453a) {
            if (!this.c) {
                if (d(lv1Var, j, false)) {
                    this.f453a.c(this);
                }
                return;
            }
            boolean z = lv1Var.b;
            Logger logger = this.f453a.b;
            if (z) {
                if (logger.isLoggable(Level.FINE)) {
                    ju0.c(logger, lv1Var, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (logger.isLoggable(Level.FINE)) {
                    ju0.c(logger, lv1Var, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(lv1 lv1Var, long j, boolean z) {
        Logger logger = this.f453a.b;
        lv1Var.getClass();
        iw1 iw1Var = lv1Var.c;
        if (iw1Var != this) {
            if (iw1Var != null) {
                c.n("task is in multiple queues");
                return false;
            }
            lv1Var.c = this;
        }
        long nanoTime = System.nanoTime();
        long j2 = nanoTime + j;
        ArrayList arrayList = this.e;
        int indexOf = arrayList.indexOf(lv1Var);
        if (indexOf != -1) {
            if (lv1Var.d <= j2) {
                if (logger.isLoggable(Level.FINE)) {
                    ju0.c(logger, lv1Var, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        lv1Var.d = j2;
        if (logger.isLoggable(Level.FINE)) {
            ju0.c(logger, lv1Var, this, z ? MiGPiFgcCQCVh.jeRGIhXoNj.concat(ju0.w(j2 - nanoTime)) : "scheduled after ".concat(ju0.w(j2 - nanoTime)));
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i2);
            i2++;
            if (((lv1) obj).d - nanoTime > j) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, lv1Var);
        return i == 0;
    }

    public final void e() {
        jw1 jw1Var = this.f453a;
        TimeZone timeZone = rd2.f888a;
        synchronized (jw1Var) {
            this.c = true;
            if (a()) {
                this.f453a.c(this);
            }
        }
    }

    public final String toString() {
        return this.b;
    }
}
