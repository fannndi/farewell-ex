package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public abstract class dh1 {

    /* renamed from: a, reason: collision with root package name */
    public bx f191a;
    public qx b;
    public Executor c;
    public lm1 d;
    public ah1 e;
    public en0 f;
    public final xi0 g;
    public boolean h;
    public final ThreadLocal i;
    public final LinkedHashMap j;
    public boolean k;

    public dh1() {
        new k41(0, this, dh1.class, "onClosed", "onClosed()V", 0, 0, 2);
        xi0 xi0Var = new xi0();
        xi0Var.g = new AtomicInteger(0);
        xi0Var.h = new AtomicBoolean(false);
        this.g = xi0Var;
        this.i = new ThreadLocal();
        this.j = new LinkedHashMap();
        this.k = true;
    }

    public final void a() {
        if (this.h) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c.n("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!p() || q() || this.i.get() == null) {
            return;
        }
        c.n("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    public final void c() {
        a();
        a();
        se0 z = k().z();
        if (!z.r()) {
            bw0.y(new cn0(j(), null, 2));
        }
        if (z.g.isWriteAheadLoggingEnabled()) {
            z.e();
        } else {
            z.a();
        }
    }

    public List d(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(ju0.Z(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            vq vqVar = (vq) entry.getKey();
            vqVar.getClass();
            Class a2 = vqVar.a();
            a2.getClass();
            linkedHashMap2.put(a2, entry.getValue());
        }
        return h(linkedHashMap2);
    }

    public abstract en0 e();

    public r70 f() {
        throw new c31(0);
    }

    public ft1 g(y00 y00Var) {
        y00Var.getClass();
        throw new c31(0);
    }

    public List h(LinkedHashMap linkedHashMap) {
        return p80.g;
    }

    public final yx i() {
        bx bxVar = this.f191a;
        if (bxVar != null) {
            return bxVar;
        }
        ym0.A("coroutineScope");
        throw null;
    }

    public final en0 j() {
        en0 en0Var = this.f;
        if (en0Var != null) {
            return en0Var;
        }
        ym0.A("internalTracker");
        throw null;
    }

    public final ft1 k() {
        ah1 ah1Var = this.e;
        if (ah1Var == null) {
            ym0.A("connectionManager");
            throw null;
        }
        ft1 c = ah1Var.c();
        if (c != null) {
            return c;
        }
        c.n("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public Set l() {
        Set<Class> m = m();
        ArrayList arrayList = new ArrayList(as.U(m));
        for (Class cls : m) {
            cls.getClass();
            arrayList.add(af1.a(cls));
        }
        return yr.i0(arrayList);
    }

    public Set m() {
        return r80.g;
    }

    public LinkedHashMap n() {
        Set<Map.Entry> entrySet = o().entrySet();
        int Z = ju0.Z(as.U(entrySet));
        if (Z < 16) {
            Z = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(Z);
        for (Map.Entry entry : entrySet) {
            Class cls = (Class) entry.getKey();
            List<Class> list = (List) entry.getValue();
            cls.getClass();
            vq a2 = af1.a(cls);
            ArrayList arrayList = new ArrayList(as.U(list));
            for (Class cls2 : list) {
                cls2.getClass();
                arrayList.add(af1.a(cls2));
            }
            linkedHashMap.put(a2, arrayList);
        }
        return linkedHashMap;
    }

    public Map o() {
        return q80.g;
    }

    public final boolean p() {
        ah1 ah1Var = this.e;
        if (ah1Var != null) {
            return ah1Var.c() != null;
        }
        ym0.A("connectionManager");
        throw null;
    }

    public final boolean q() {
        return t() && k().z().r();
    }

    public final void r() {
        k().z().l();
        if (q()) {
            return;
        }
        en0 j = j();
        j.b.e(j.e, j.f);
    }

    public final void s(ti1 ti1Var) {
        ti1Var.getClass();
        en0 j = j();
        v12 v12Var = j.b;
        v12Var.getClass();
        aj1 C = ti1Var.C("PRAGMA query_only");
        try {
            C.w();
            boolean z = C.getLong(0) != 0;
            rt0.e(C, null);
            if (!z) {
                kk1.s(ti1Var, "PRAGMA temp_store = MEMORY");
                kk1.s(ti1Var, "PRAGMA recursive_triggers = 1");
                kk1.s(ti1Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (v12Var.d) {
                    kk1.s(ti1Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    kk1.s(ti1Var, is1.Z("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                oj ojVar = v12Var.h;
                ReentrantLock reentrantLock = (ReentrantLock) ojVar.b;
                reentrantLock.lock();
                try {
                    ojVar.f739a = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (j.h) {
            }
        } finally {
        }
    }

    public final boolean t() {
        ah1 ah1Var = this.e;
        if (ah1Var == null) {
            ym0.A("connectionManager");
            throw null;
        }
        se0 se0Var = ah1Var.g;
        if (se0Var != null) {
            return se0Var.g.isOpen();
        }
        return false;
    }

    public final Object u(Callable callable) {
        c();
        try {
            Object call = callable.call();
            v();
            return call;
        } finally {
            r();
        }
    }

    public final void v() {
        k().z().D();
    }

    public final Object w(boolean z, pf0 pf0Var, ex exVar) {
        ah1 ah1Var = this.e;
        if (ah1Var != null) {
            return ah1Var.f.p(z, pf0Var, exVar);
        }
        ym0.A("connectionManager");
        throw null;
    }
}
