package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ah1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f29a;
    public boolean b;
    public final y00 c;
    public final r70 d;
    public final List e;
    public final qu f;
    public se0 g;

    public ah1(y00 y00Var, m mVar) {
        ch1 ch1Var = y00Var.g;
        this.c = y00Var;
        this.d = new yg1(-1, "", "");
        List list = y00Var.e;
        p80 p80Var = p80.g;
        this.e = list == null ? p80Var : list;
        m mVar2 = new m(3, this);
        list = list == null ? p80Var : list;
        zq zqVar = new zq(mVar2);
        ArrayList arrayList = new ArrayList(list.size() + 1);
        arrayList.addAll(list);
        arrayList.add(zqVar);
        Context context = y00Var.f1203a;
        String str = y00Var.b;
        et1 et1Var = y00Var.c;
        s00 s00Var = y00Var.d;
        boolean z = y00Var.f;
        Executor executor = y00Var.h;
        Executor executor2 = y00Var.i;
        Intent intent = y00Var.j;
        boolean z2 = y00Var.k;
        boolean z3 = y00Var.l;
        Set set = y00Var.m;
        String str2 = y00Var.n;
        File file = y00Var.o;
        Callable callable = y00Var.p;
        List list2 = y00Var.q;
        List list3 = y00Var.r;
        boolean z4 = y00Var.s;
        ui1 ui1Var = y00Var.t;
        qx qxVar = y00Var.u;
        context.getClass();
        s00Var.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
        this.f = new dt1(new h70((ft1) mVar.j(new y00(context, str, et1Var, s00Var, arrayList, z, ch1Var, executor, executor2, intent, z2, z3, set, str2, file, callable, list2, list3, z4, ui1Var, qxVar))));
        boolean z5 = ch1Var == ch1.i;
        ft1 c = c();
        if (c != null) {
            c.setWriteAheadLoggingEnabled(z5);
        }
    }

    public ah1(y00 y00Var, r70 r70Var) {
        int i;
        tu tuVar;
        ch1 ch1Var = y00Var.g;
        et1 et1Var = y00Var.c;
        String str = y00Var.b;
        this.c = y00Var;
        this.d = r70Var;
        List list = y00Var.e;
        this.e = list == null ? p80.g : list;
        ui1 ui1Var = y00Var.t;
        if (ui1Var != null) {
            if (str == null) {
                tuVar = new tu(new i8(this, ui1Var));
            } else {
                i8 i8Var = new i8(this, ui1Var);
                int ordinal = ch1Var.ordinal();
                if (ordinal == 1) {
                    i = 1;
                } else {
                    if (ordinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + ch1Var + '\'').toString());
                    }
                    i = 4;
                }
                int ordinal2 = ch1Var.ordinal();
                if (ordinal2 != 1 && ordinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + ch1Var + '\'').toString());
                }
                tuVar = new tu(i8Var, str, i);
            }
            this.f = tuVar;
        } else {
            if (et1Var == null) {
                c.m("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            Context context = y00Var.f1203a;
            context.getClass();
            this.f = new dt1(new h70(et1Var.b(new tp(context, str, new zg1(this, r70Var.f875a), false, false))));
        }
        boolean z = ch1Var == ch1.i;
        ft1 c = c();
        if (c != null) {
            c.setWriteAheadLoggingEnabled(z);
        }
    }

    public static final void a(ah1 ah1Var, ti1 ti1Var) {
        Object pg1Var;
        r70 r70Var = ah1Var.d;
        y00 y00Var = ah1Var.c;
        ch1 ch1Var = y00Var.g;
        ch1 ch1Var2 = ch1.i;
        if (ch1Var == ch1Var2) {
            kk1.s(ti1Var, "PRAGMA journal_mode = WAL");
        } else {
            kk1.s(ti1Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (y00Var.g == ch1Var2) {
            kk1.s(ti1Var, "PRAGMA synchronous = NORMAL");
        } else {
            kk1.s(ti1Var, "PRAGMA synchronous = FULL");
        }
        b(ti1Var);
        aj1 C = ti1Var.C("PRAGMA user_version");
        try {
            C.w();
            int i = (int) C.getLong(0);
            rt0.e(C, null);
            int i2 = r70Var.f875a;
            if (i != i2) {
                kk1.s(ti1Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        ah1Var.d(ti1Var);
                    } else {
                        ah1Var.e(ti1Var, i, i2);
                    }
                    kk1.s(ti1Var, "PRAGMA user_version = " + i2);
                    pg1Var = e42.f219a;
                } catch (Throwable th) {
                    pg1Var = new pg1(th);
                }
                if (!(pg1Var instanceof pg1)) {
                    kk1.s(ti1Var, "END TRANSACTION");
                }
                Throwable a2 = qg1.a(pg1Var);
                if (a2 != null) {
                    kk1.s(ti1Var, "ROLLBACK TRANSACTION");
                    throw a2;
                }
            }
            ah1Var.f(ti1Var);
        } finally {
        }
    }

    public static void b(ti1 ti1Var) {
        aj1 C = ti1Var.C("PRAGMA busy_timeout");
        try {
            C.w();
            long j = C.getLong(0);
            rt0.e(C, null);
            if (j < 3000) {
                kk1.s(ti1Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                rt0.e(C, th);
                throw th2;
            }
        }
    }

    public final ft1 c() {
        qu quVar = this.f;
        dt1 dt1Var = quVar instanceof dt1 ? (dt1) quVar : null;
        if (dt1Var != null) {
            return (ft1) dt1Var.g.g;
        }
        return null;
    }

    public final void d(ti1 ti1Var) {
        ti1Var.getClass();
        aj1 C = ti1Var.C("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (C.w()) {
                if (C.getLong(0) == 0) {
                    z = true;
                }
            }
            rt0.e(C, null);
            r70 r70Var = this.d;
            r70Var.a(ti1Var);
            if (!z) {
                eh1 v = r70Var.v(ti1Var);
                if (!v.f233a) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + v.b).toString());
                }
            }
            kk1.s(ti1Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            kk1.s(ti1Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) r70Var.b) + "')");
            r70Var.r(ti1Var);
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((zq) it.next()).getClass();
                if (ti1Var instanceof ct1) {
                    ((ct1) ti1Var).g.getClass();
                }
            }
        } finally {
        }
    }

    public final void e(ti1 ti1Var, int i, int i2) {
        ti1Var.getClass();
        y00 y00Var = this.c;
        List g = bw0.g(y00Var.d, i, i2);
        r70 r70Var = this.d;
        if (g != null) {
            r70Var.u(ti1Var);
            Iterator it = g.iterator();
            while (it.hasNext()) {
                ((qx0) it.next()).b(ti1Var);
            }
            eh1 v = r70Var.v(ti1Var);
            if (!v.f233a) {
                throw new IllegalStateException(("Migration didn't properly handle: " + v.b).toString());
            }
            r70Var.t(ti1Var);
            kk1.s(ti1Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            kk1.s(ti1Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) r70Var.b) + "')");
            return;
        }
        if (bw0.p(y00Var, i, i2)) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (y00Var.s) {
            aj1 C = ti1Var.C("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                nr0 i3 = tl2.i();
                while (C.w()) {
                    String h = C.h(0);
                    if (!is1.b0(h, "sqlite_", false) && !h.equals("android_metadata")) {
                        i3.add(new z51(h, Boolean.valueOf(ym0.b(C.h(1), ILBLnlCHDVqsSN.wyDEyDTIxreVYXg))));
                    }
                }
                nr0 e = tl2.e(i3);
                rt0.e(C, null);
                ListIterator listIterator = e.listIterator(0);
                while (true) {
                    lr0 lr0Var = (lr0) listIterator;
                    if (!lr0Var.hasNext()) {
                        break;
                    }
                    z51 z51Var = (z51) lr0Var.next();
                    String str = (String) z51Var.g;
                    if (((Boolean) z51Var.h).booleanValue()) {
                        kk1.s(ti1Var, "DROP VIEW IF EXISTS " + str);
                    } else {
                        kk1.s(ti1Var, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            r70Var.c(ti1Var);
        }
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            ((zq) it2.next()).getClass();
            if (ti1Var instanceof ct1) {
                ((ct1) ti1Var).g.getClass();
            }
        }
        r70Var.a(ti1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.ti1 r10) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ah1.f(ti1):void");
    }
}
