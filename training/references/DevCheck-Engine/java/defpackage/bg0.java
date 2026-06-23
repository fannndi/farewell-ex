package defpackage;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import flar2.devcheck.sensors.JCZI.nyGJ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class bg0 implements Runnable {
    public static final ThreadLocal k = new ThreadLocal();
    public static final c4 l = new c4(8);
    public long h;
    public long i;
    public final ArrayList g = new ArrayList();
    public final ArrayList j = new ArrayList();

    public static te1 c(RecyclerView recyclerView, int i, long j) {
        int i2 = recyclerView.l.i();
        for (int i3 = 0; i3 < i2; i3++) {
            te1 N = RecyclerView.N(recyclerView.l.h(i3));
            if (N.i == i && !N.g()) {
                return null;
            }
        }
        ke1 ke1Var = recyclerView.i;
        if (j == Long.MAX_VALUE) {
            try {
                if (q02.a()) {
                    Trace.beginSection(nyGJ.jsynYDDBVndTmp);
                }
            } catch (Throwable th) {
                recyclerView.W(false);
                Trace.endSection();
                throw th;
            }
        }
        recyclerView.V();
        te1 l2 = ke1Var.l(i, j);
        if (l2 != null) {
            if (!l2.f() || l2.g()) {
                ke1Var.a(l2, false);
            } else {
                ke1Var.i(l2.g);
            }
        }
        recyclerView.W(false);
        Trace.endSection();
        return l2;
    }

    public final void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.y) {
            if (RecyclerView.I0 && !this.g.contains(recyclerView)) {
                c.n("attempting to post unregistered view!");
                return;
            } else if (this.h == 0) {
                this.h = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        gd gdVar = recyclerView.m0;
        gdVar.f333a = i;
        gdVar.b = i2;
    }

    public final void b(long j) {
        ag0 ag0Var;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ag0 ag0Var2;
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            int windowVisibility = recyclerView3.getWindowVisibility();
            gd gdVar = recyclerView3.m0;
            if (windowVisibility == 0) {
                gdVar.c(recyclerView3, false);
                i += gdVar.c;
            }
        }
        ArrayList arrayList2 = this.j;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        int i4 = 0;
        while (i3 < size) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i3);
            if (recyclerView4.getWindowVisibility() == 0) {
                gd gdVar2 = recyclerView4.m0;
                int abs = Math.abs(gdVar2.b) + Math.abs(gdVar2.f333a);
                int i5 = z ? 1 : 0;
                while (i5 < gdVar2.c * 2) {
                    if (i4 >= arrayList2.size()) {
                        ag0Var2 = new ag0();
                        arrayList2.add(ag0Var2);
                    } else {
                        ag0Var2 = (ag0) arrayList2.get(i4);
                    }
                    int[] iArr = (int[]) gdVar2.d;
                    int i6 = iArr[i5 + 1];
                    if (i6 <= abs) {
                        z = true;
                    }
                    ag0Var2.f27a = z;
                    ag0Var2.b = abs;
                    ag0Var2.c = i6;
                    ag0Var2.d = recyclerView4;
                    ag0Var2.e = iArr[i5];
                    i4++;
                    i5 += 2;
                    z = false;
                }
            }
            i3++;
            z = false;
        }
        Collections.sort(arrayList2, l);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (ag0Var = (ag0) arrayList2.get(i7)).d) != null; i7++) {
            te1 c = c(recyclerView, ag0Var.e, ag0Var.f27a ? Long.MAX_VALUE : j);
            if (c != null && c.h != null && c.f() && !c.g() && (recyclerView2 = (RecyclerView) c.h.get()) != null) {
                if (recyclerView2.J && recyclerView2.l.i() != 0) {
                    ke1 ke1Var = recyclerView2.i;
                    zd1 zd1Var = recyclerView2.S;
                    if (zd1Var != null) {
                        zd1Var.e();
                    }
                    de1 de1Var = recyclerView2.t;
                    if (de1Var != null) {
                        de1Var.k0(ke1Var);
                        recyclerView2.t.l0(ke1Var);
                    }
                    ke1Var.f531a.clear();
                    ke1Var.g();
                }
                gd gdVar3 = recyclerView2.m0;
                gdVar3.c(recyclerView2, true);
                if (gdVar3.c != 0) {
                    try {
                        Trace.beginSection(j == Long.MAX_VALUE ? "RV Nested Prefetch" : "RV Nested Prefetch forced - needed next frame");
                        pe1 pe1Var = recyclerView2.n0;
                        td1 td1Var = recyclerView2.s;
                        pe1Var.d = 1;
                        pe1Var.e = td1Var.c();
                        pe1Var.g = false;
                        pe1Var.h = false;
                        pe1Var.i = false;
                        for (int i8 = 0; i8 < gdVar3.c * 2; i8 += 2) {
                            c(recyclerView2, ((int[]) gdVar3.d)[i8], j);
                        }
                    } finally {
                        Trace.endSection();
                    }
                }
            }
            ag0Var.f27a = false;
            ag0Var.b = 0;
            ag0Var.c = 0;
            ag0Var.d = null;
            ag0Var.e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.g;
        try {
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(j) + this.i);
                }
            }
        } finally {
            this.h = 0L;
            Trace.endSection();
        }
    }
}
