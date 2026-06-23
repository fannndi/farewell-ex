package defpackage;

import com.imn.iivisu.ltkT.CDsMEtnUjndKau;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes.dex */
public final class vx extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater o = AtomicIntegerFieldUpdater.newUpdater(vx.class, CDsMEtnUjndKau.tSCESCZQDMltFcF);
    public final fc2 g;
    public final ze1 h;
    public wx i;
    public volatile int indexInArray;
    public long j;
    public long k;
    public int l;
    public boolean m;
    public final /* synthetic */ xx n;
    public volatile Object nextParkedWorker;
    public volatile /* synthetic */ int workerCtl$volatile;

    public vx(xx xxVar, int i) {
        this.n = xxVar;
        setDaemon(true);
        setContextClassLoader(xx.class.getClassLoader());
        this.g = new fc2();
        this.h = new ze1();
        this.i = wx.j;
        this.nextParkedWorker = xx.q;
        int nanoTime = (int) System.nanoTime();
        this.l = nanoTime == 0 ? 42 : nanoTime;
        f(i);
    }

    public final mv1 a(boolean z) {
        mv1 e;
        mv1 e2;
        long j;
        wx wxVar = this.i;
        xx xxVar = this.n;
        fc2 fc2Var = this.g;
        wx wxVar2 = wx.g;
        if (wxVar != wxVar2) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = xx.o;
            do {
                j = atomicLongFieldUpdater.get(xxVar);
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    mv1 g = fc2Var.g();
                    return (g == null && (g = (mv1) xxVar.l.d()) == null) ? i(1) : g;
                }
            } while (!xx.o.compareAndSet(xxVar, j, j - 4398046511104L));
            this.i = wxVar2;
        }
        if (z) {
            boolean z2 = d(xxVar.g * 2) == 0;
            if (z2 && (e2 = e()) != null) {
                return e2;
            }
            mv1 e3 = fc2Var.e();
            if (e3 != null) {
                return e3;
            }
            if (!z2 && (e = e()) != null) {
                return e;
            }
        } else {
            mv1 e4 = e();
            if (e4 != null) {
                return e4;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i2 = this.l;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.l = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i6 & i5 : (Integer.MAX_VALUE & i5) % i;
    }

    public final mv1 e() {
        int d = d(2);
        xx xxVar = this.n;
        gg0 gg0Var = xxVar.l;
        gg0 gg0Var2 = xxVar.k;
        if (d == 0) {
            mv1 mv1Var = (mv1) gg0Var2.d();
            return mv1Var != null ? mv1Var : (mv1) gg0Var.d();
        }
        mv1 mv1Var2 = (mv1) gg0Var.d();
        return mv1Var2 != null ? mv1Var2 : (mv1) gg0Var2.d();
    }

    public final void f(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.n.j);
        sb.append("-worker-");
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(wx wxVar) {
        wx wxVar2 = this.i;
        boolean z = wxVar2 == wx.g;
        if (z) {
            xx.o.addAndGet(this.n, 4398046511104L);
        }
        if (wxVar2 != wxVar) {
            this.i = wxVar;
        }
        return z;
    }

    public final mv1 i(int i) {
        mv1 mv1Var;
        long i2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = xx.o;
        xx xxVar = this.n;
        int i3 = (int) (atomicLongFieldUpdater.get(xxVar) & 2097151);
        if (i3 < 2) {
            return null;
        }
        int d = d(i3);
        long j = Long.MAX_VALUE;
        for (int i4 = 0; i4 < i3; i4++) {
            d++;
            if (d > i3) {
                d = 1;
            }
            vx vxVar = (vx) xxVar.m.b(d);
            if (vxVar != null && vxVar != this) {
                fc2 fc2Var = vxVar.g;
                if (i == 3) {
                    mv1Var = fc2Var.f();
                } else {
                    fc2Var.getClass();
                    int i5 = fc2.d.get(fc2Var);
                    int i6 = fc2.c.get(fc2Var);
                    boolean z = i == 1;
                    while (i5 != i6 && (!z || fc2.e.get(fc2Var) != 0)) {
                        int i7 = i5 + 1;
                        mv1Var = fc2Var.h(i5, z);
                        if (mv1Var != null) {
                            break;
                        }
                        i5 = i7;
                    }
                    mv1Var = null;
                }
                ze1 ze1Var = this.h;
                if (mv1Var != null) {
                    ze1Var.g = mv1Var;
                    i2 = -1;
                } else {
                    i2 = fc2Var.i(i, ze1Var);
                }
                if (i2 == -1) {
                    mv1 mv1Var2 = (mv1) ze1Var.g;
                    ze1Var.g = null;
                    return mv1Var2;
                }
                if (i2 > 0) {
                    j = Math.min(j, i2);
                }
            }
        }
        if (j == Long.MAX_VALUE) {
            j = 0;
        }
        this.k = j;
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx.run():void");
    }
}
