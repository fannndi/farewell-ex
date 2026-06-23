package defpackage;

import androidx.core.widget.rsm.gXdyRQCGVlHW;
import com.google.android.material.behavior.YqV.Gvyagftz;
import com.google.android.material.card.ZyJo.nTAZxGMqQtZZAQ;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class dd1 implements Cloneable {
    public final a41 g;
    public final yf h;
    public final gd1 i;
    public volatile m90 j;
    public final cd1 k;
    public final AtomicBoolean l;
    public Object m;
    public z90 n;
    public ed1 o;
    public boolean p;
    public oj q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public volatile boolean w;
    public volatile oj x;
    public final CopyOnWriteArrayList y;

    static {
        AtomicReferenceFieldUpdater.newUpdater(dd1.class, m90.class, "j");
    }

    public dd1(a41 a41Var, yf yfVar) {
        a41Var.getClass();
        this.g = a41Var;
        this.h = yfVar;
        this.i = (gd1) a41Var.A.h;
        a41Var.d.getClass();
        this.j = m90.f620a;
        cd1 cd1Var = new cd1(this);
        cd1Var.g(0L);
        this.k = cd1Var;
        this.l = new AtomicBoolean();
        this.v = true;
        this.y = new CopyOnWriteArrayList();
        new AtomicReference((j70) yfVar.f);
    }

    public static final String a(dd1 dd1Var) {
        StringBuilder sb = new StringBuilder();
        sb.append(dd1Var.w ? "canceled " : Gvyagftz.WJyQChr);
        sb.append("call");
        sb.append(" to ");
        sb.append(((ok0) dd1Var.h.b).g());
        return sb.toString();
    }

    public final void b(ed1 ed1Var) {
        ed1Var.getClass();
        TimeZone timeZone = rd2.f888a;
        if (this.o != null) {
            c.n("Check failed.");
        } else {
            this.o = ed1Var;
            ed1Var.p.add(new bd1(this, this.m));
        }
    }

    public final IOException c(IOException iOException) {
        IOException iOException2;
        Socket j;
        TimeZone timeZone = rd2.f888a;
        ed1 ed1Var = this.o;
        if (ed1Var != null) {
            synchronized (ed1Var) {
                j = j();
            }
            if (this.o == null) {
                if (j != null) {
                    rd2.b(j);
                }
                this.j.getClass();
            } else if (j != null) {
                c.n("Check failed.");
                return null;
            }
        }
        if (!this.p && this.k.i()) {
            iOException2 = new InterruptedIOException(gXdyRQCGVlHW.oEjEvTtY);
            if (iOException != null) {
                iOException2.initCause(iOException);
            }
        } else {
            iOException2 = iOException;
        }
        m90 m90Var = this.j;
        if (iOException == null) {
            m90Var.getClass();
            return iOException2;
        }
        iOException2.getClass();
        m90Var.getClass();
        return iOException2;
    }

    public final Object clone() {
        return new dd1(this.g, this.h);
    }

    public final void d() {
        if (this.w) {
            return;
        }
        this.w = true;
        oj ojVar = this.x;
        if (ojVar != null) {
            ((y90) ojVar.d).cancel();
        }
        Iterator it = this.y.iterator();
        it.getClass();
        while (it.hasNext()) {
            ((ji1) it.next()).cancel();
        }
        this.j.getClass();
    }

    public final void e(jn jnVar) {
        if (!this.l.compareAndSet(false, true)) {
            c.n(nTAZxGMqQtZZAQ.ZgdLaizPCSFqeWi);
            return;
        }
        q71 q71Var = q71.f821a;
        this.m = q71.f821a.g();
        this.j.getClass();
        gr grVar = this.g.f8a;
        ad1 ad1Var = new ad1(this, jnVar);
        grVar.getClass();
        gr.z(grVar, ad1Var, null, 6);
    }

    public final void f(boolean z) {
        oj ojVar;
        synchronized (this) {
            if (!this.v) {
                throw new IllegalStateException("released");
            }
        }
        if (z && (ojVar = this.x) != null) {
            ((y90) ojVar.d).cancel();
            ((dd1) ojVar.b).h(ojVar, true, true, true, true, null);
        }
        this.q = null;
    }

    public final lg1 g() {
        ArrayList arrayList = new ArrayList();
        es.V(arrayList, this.g.b);
        arrayList.add(new gn(4));
        arrayList.add(new gn(2));
        arrayList.add(new gn(3));
        arrayList.add(gn.c);
        es.V(arrayList, this.g.c);
        arrayList.add(gn.b);
        yf yfVar = this.h;
        a41 a41Var = this.g;
        a41Var.getClass();
        try {
            try {
                lg1 b = new hd1(this, arrayList, 0, null, yfVar, a41Var.v, a41Var.w, a41Var.x, a41Var.g, a41Var.t, a41Var.A, a41Var.j, a41Var.k, a41Var.s, a41Var.m, a41Var.l, a41Var.e, a41Var.n, a41Var.o, a41Var.p, a41Var.u).b(this.h);
                if (this.w) {
                    pd2.b(b);
                    throw new IOException("Canceled");
                }
                i(null);
                return b;
            } catch (IOException e) {
                IOException i = i(e);
                i.getClass();
                throw i;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                i(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0039 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0050 A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:59:0x0012, B:10:0x002d, B:12:0x0031, B:14:0x0035, B:16:0x0039, B:17:0x003b, B:19:0x003f, B:21:0x0043, B:23:0x0047, B:27:0x0050, B:7:0x001b, B:52:0x0021, B:55:0x0027), top: B:58:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.IOException h(defpackage.oj r4, boolean r5, boolean r6, boolean r7, boolean r8, java.io.IOException r9) {
        /*
            r3 = this;
            r4.getClass()
            oj r0 = r3.x
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto Ld
            goto L78
        Ld:
            monitor-enter(r3)
            r4 = 1
            r0 = 0
            if (r5 == 0) goto L19
            boolean r1 = r3.r     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2b
            goto L19
        L17:
            r4 = move-exception
            goto L59
        L19:
            if (r6 == 0) goto L1f
            boolean r1 = r3.s     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2b
        L1f:
            if (r8 == 0) goto L25
            boolean r1 = r3.t     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L2b
        L25:
            if (r7 == 0) goto L5b
            boolean r1 = r3.u     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L5b
        L2b:
            if (r5 == 0) goto L2f
            r3.r = r0     // Catch: java.lang.Throwable -> L17
        L2f:
            if (r6 == 0) goto L33
            r3.s = r0     // Catch: java.lang.Throwable -> L17
        L33:
            if (r8 == 0) goto L37
            r3.t = r0     // Catch: java.lang.Throwable -> L17
        L37:
            if (r7 == 0) goto L3b
            r3.u = r0     // Catch: java.lang.Throwable -> L17
        L3b:
            boolean r5 = r3.r     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            boolean r5 = r3.s     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            boolean r5 = r3.t     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            boolean r5 = r3.u     // Catch: java.lang.Throwable -> L17
            if (r5 != 0) goto L4d
            r5 = r4
            goto L4e
        L4d:
            r5 = r0
        L4e:
            if (r5 == 0) goto L55
            boolean r6 = r3.v     // Catch: java.lang.Throwable -> L17
            if (r6 != 0) goto L55
            r0 = r4
        L55:
            r2 = r0
            r0 = r5
            r5 = r2
            goto L5c
        L59:
            monitor-exit(r3)
            throw r4
        L5b:
            r5 = r0
        L5c:
            monitor-exit(r3)
            if (r0 == 0) goto L71
            r6 = 0
            r3.x = r6
            ed1 r6 = r3.o
            if (r6 == 0) goto L71
            monitor-enter(r6)
            int r7 = r6.m     // Catch: java.lang.Throwable -> L6e
            int r7 = r7 + r4
            r6.m = r7     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r6)
            goto L71
        L6e:
            r3 = move-exception
            monitor-exit(r6)
            throw r3
        L71:
            if (r5 == 0) goto L78
            java.io.IOException r3 = r3.c(r9)
            return r3
        L78:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dd1.h(oj, boolean, boolean, boolean, boolean, java.io.IOException):java.io.IOException");
    }

    public final IOException i(IOException iOException) {
        boolean z;
        synchronized (this) {
            z = false;
            if (this.v) {
                this.v = false;
                if (!this.r && !this.s && !this.t) {
                    if (!this.u) {
                        z = true;
                    }
                }
            }
        }
        return z ? c(iOException) : iOException;
    }

    public final Socket j() {
        ed1 ed1Var = this.o;
        ed1Var.getClass();
        TimeZone timeZone = rd2.f888a;
        ArrayList arrayList = ed1Var.p;
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
            if (ym0.b(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            c.n("Check failed.");
            return null;
        }
        arrayList.remove(i);
        this.o = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        ed1Var.q = System.nanoTime();
        gd1 gd1Var = this.i;
        ConcurrentLinkedQueue concurrentLinkedQueue = gd1Var.d;
        TimeZone timeZone2 = rd2.f888a;
        if (!ed1Var.j) {
            gd1Var.b.c(gd1Var.c, 0L);
            return null;
        }
        ed1Var.j = true;
        concurrentLinkedQueue.remove(ed1Var);
        if (concurrentLinkedQueue.isEmpty()) {
            iw1 iw1Var = gd1Var.b;
            synchronized (iw1Var.f453a) {
                if (iw1Var.a()) {
                    iw1Var.f453a.c(iw1Var);
                }
            }
        }
        return ed1Var.e;
    }
}
