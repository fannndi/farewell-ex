package defpackage;

import java.util.ArrayList;
import java.util.TimeZone;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class jw1 {
    public static final Logger k;
    public static final jw1 l;

    /* renamed from: a, reason: collision with root package name */
    public final h70 f500a;
    public final Logger b;
    public int c;
    public boolean d;
    public long e;
    public int f;
    public int g;
    public final ArrayList h;
    public final ArrayList i;
    public final wa j;

    static {
        Logger logger = Logger.getLogger(jw1.class.getName());
        logger.getClass();
        k = logger;
        qd2 qd2Var = new qd2(d51.u(new StringBuilder(), rd2.b, " TaskRunner"), true);
        h70 h70Var = new h70();
        h70Var.g = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), qd2Var);
        l = new jw1(h70Var);
    }

    public jw1(h70 h70Var) {
        Logger logger = k;
        logger.getClass();
        this.f500a = h70Var;
        this.b = logger;
        this.c = 10000;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = new wa(25, this);
    }

    public static final void a(jw1 jw1Var, lv1 lv1Var, long j, boolean z) {
        TimeZone timeZone = rd2.f888a;
        iw1 iw1Var = lv1Var.c;
        iw1Var.getClass();
        if (iw1Var.d != lv1Var) {
            c.n("Check failed.");
            return;
        }
        boolean z2 = iw1Var.f;
        iw1Var.f = false;
        iw1Var.d = null;
        jw1Var.h.remove(iw1Var);
        if (j != -1 && !z2 && !iw1Var.c) {
            iw1Var.d(lv1Var, j, true);
        }
        if (iw1Var.e.isEmpty()) {
            return;
        }
        jw1Var.i.add(iw1Var);
        if (z) {
            return;
        }
        jw1Var.e();
    }

    public final lv1 b() {
        long j;
        lv1 lv1Var;
        boolean z;
        TimeZone timeZone = rd2.f888a;
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            int size = arrayList.size();
            long j2 = Long.MAX_VALUE;
            int i = 0;
            lv1 lv1Var2 = null;
            while (true) {
                if (i >= size) {
                    j = nanoTime;
                    lv1Var = null;
                    z = false;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                lv1 lv1Var3 = (lv1) ((iw1) obj).e.get(0);
                j = nanoTime;
                lv1Var = null;
                long max = Math.max(0L, lv1Var3.d - j);
                if (max > 0) {
                    j2 = Math.min(max, j2);
                } else {
                    if (lv1Var2 != null) {
                        z = true;
                        break;
                    }
                    lv1Var2 = lv1Var3;
                }
                nanoTime = j;
            }
            ArrayList arrayList2 = this.h;
            if (lv1Var2 != null) {
                TimeZone timeZone2 = rd2.f888a;
                lv1Var2.d = -1L;
                iw1 iw1Var = lv1Var2.c;
                iw1Var.getClass();
                iw1Var.e.remove(lv1Var2);
                arrayList.remove(iw1Var);
                iw1Var.d = lv1Var2;
                arrayList2.add(iw1Var);
                if (z || (!this.d && !arrayList.isEmpty())) {
                    e();
                }
                return lv1Var2;
            }
            if (this.d) {
                if (j2 >= this.e - j) {
                    return lv1Var;
                }
                notify();
                return lv1Var;
            }
            this.d = true;
            this.e = j + j2;
            try {
                try {
                    TimeZone timeZone3 = rd2.f888a;
                    if (j2 > 0) {
                        long j3 = j2 / 1000000;
                        long j4 = j2 - (1000000 * j3);
                        if (j3 > 0 || j2 > 0) {
                            wait(j3, (int) j4);
                        }
                    }
                } catch (InterruptedException unused) {
                    TimeZone timeZone4 = rd2.f888a;
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((iw1) arrayList2.get(size2)).a();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        iw1 iw1Var2 = (iw1) arrayList.get(size3);
                        iw1Var2.a();
                        if (iw1Var2.e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.d = false;
            }
        }
    }

    public final void c(iw1 iw1Var) {
        iw1Var.getClass();
        TimeZone timeZone = rd2.f888a;
        if (iw1Var.d == null) {
            boolean isEmpty = iw1Var.e.isEmpty();
            ArrayList arrayList = this.i;
            if (isEmpty) {
                arrayList.remove(iw1Var);
            } else {
                byte[] bArr = pd2.f785a;
                arrayList.getClass();
                if (!arrayList.contains(iw1Var)) {
                    arrayList.add(iw1Var);
                }
            }
        }
        if (this.d) {
            notify();
        } else {
            e();
        }
    }

    public final iw1 d() {
        int i;
        synchronized (this) {
            i = this.c;
            this.c = i + 1;
        }
        return new iw1(this, d51.q("Q", i));
    }

    public final void e() {
        TimeZone timeZone = rd2.f888a;
        int i = this.f;
        if (i > this.g) {
            return;
        }
        this.f = i + 1;
        wa waVar = this.j;
        waVar.getClass();
        ((ThreadPoolExecutor) this.f500a.g).execute(waVar);
    }
}
