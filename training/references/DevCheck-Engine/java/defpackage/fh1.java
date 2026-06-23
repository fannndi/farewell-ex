package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class fh1 extends ko {
    public y00 b;
    public final List c;
    public final ko d;
    public final String e;
    public final String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh1(y00 y00Var, ko koVar, String str, String str2) {
        super(koVar.f543a);
        y00Var.getClass();
        this.c = y00Var.e;
        this.b = y00Var;
        this.d = koVar;
        this.e = str;
        this.f = str2;
    }

    @Override // defpackage.ko
    public final void i(se0 se0Var) {
    }

    @Override // defpackage.ko
    public final void k(se0 se0Var) {
        Cursor v = se0Var.v(new o1(5, "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"));
        try {
            boolean z = false;
            if (v.moveToFirst()) {
                if (v.getInt(0) == 0) {
                    z = true;
                }
            }
            v.close();
            ko koVar = this.d;
            koVar.a(se0Var);
            if (!z) {
                eh1 p = koVar.p(se0Var);
                if (!p.f233a) {
                    jw0.n("Pre-packaged database has an invalid schema: ", p.b);
                    return;
                }
            }
            SQLiteDatabase sQLiteDatabase = se0Var.g;
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sQLiteDatabase.execSQL(hTYJVDOvZnZlYL.qLe + this.e + ILBLnlCHDVqsSN.BZMglZRH);
            koVar.j();
            List list = this.c;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((zq) it.next()).getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                je2.h(v, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.ko
    public final void l(se0 se0Var, int i, int i2) {
        o(se0Var, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0062  */
    @Override // defpackage.ko
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(defpackage.se0 r8) {
        /*
            r7 = this;
            o1 r0 = new o1
            r1 = 5
            java.lang.String r2 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            r0.<init>(r1, r2)
            android.database.Cursor r0 = r8.v(r0)
            boolean r2 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L1b
            r3 = 0
            if (r2 == 0) goto L1e
            int r2 = r0.getInt(r3)     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1e
            r2 = 1
            goto L1f
        L1b:
            r7 = move-exception
            goto Lae
        L1e:
            r2 = r3
        L1f:
            r0.close()
            ko r0 = r7.d
            java.lang.String r4 = r7.e
            r5 = 0
            if (r2 == 0) goto L62
            o1 r2 = new o1
            java.lang.String r6 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r2.<init>(r1, r6)
            android.database.Cursor r1 = r8.v(r2)
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L3f
            if (r2 == 0) goto L41
            java.lang.String r2 = r1.getString(r3)     // Catch: java.lang.Throwable -> L3f
            goto L42
        L3f:
            r7 = move-exception
            goto L5c
        L41:
            r2 = r5
        L42:
            r1.close()
            boolean r1 = r4.equals(r2)
            if (r1 != 0) goto L88
            java.lang.String r1 = r7.f
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L54
            goto L88
        L54:
            java.lang.String r7 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            java.lang.String r8 = ", found: "
            defpackage.jw0.i(r7, r4, r8, r2)
            return
        L5c:
            throw r7     // Catch: java.lang.Throwable -> L5d
        L5d:
            r8 = move-exception
            defpackage.je2.h(r1, r7)
            throw r8
        L62:
            eh1 r1 = r0.p(r8)
            boolean r2 = r1.f233a
            if (r2 == 0) goto La6
            android.database.sqlite.SQLiteDatabase r1 = r8.g
            java.lang.String r2 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            r1.execSQL(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '"
            r2.<init>(r3)
            r2.append(r4)
            r3 = 0
            java.lang.String r3 = flar2.devcheck.benchmarkSuite.nativebridge.vGm.RIhTGWkqQvGL.KkI
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.execSQL(r2)
        L88:
            r0.m(r8)
            java.util.List r0 = r7.c
            if (r0 == 0) goto La3
            java.util.Iterator r0 = r0.iterator()
        L93:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto La3
            java.lang.Object r1 = r0.next()
            zq r1 = (defpackage.zq) r1
            r1.a(r8)
            goto L93
        La3:
            r7.b = r5
            return
        La6:
            java.lang.String r7 = "Pre-packaged database has an invalid schema: "
            java.lang.String r8 = r1.b
            defpackage.jw0.n(r7, r8)
            return
        Lae:
            throw r7     // Catch: java.lang.Throwable -> Laf
        Laf:
            r8 = move-exception
            defpackage.je2.h(r0, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fh1.m(se0):void");
    }

    @Override // defpackage.ko
    public final void o(se0 se0Var, int i, int i2) {
        SQLiteDatabase sQLiteDatabase = se0Var.g;
        y00 y00Var = this.b;
        ko koVar = this.d;
        if (y00Var != null) {
            s00 s00Var = y00Var.d;
            s00Var.getClass();
            List g = bw0.g(s00Var, i, i2);
            if (g != null) {
                koVar.n(se0Var);
                Iterator it = g.iterator();
                while (it.hasNext()) {
                    ((qx0) it.next()).b(new ct1(se0Var));
                }
                eh1 p = koVar.p(se0Var);
                if (!p.f233a) {
                    jw0.n("Migration didn't properly handle: ", p.b);
                    return;
                }
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + this.e + "')");
                return;
            }
        }
        y00 y00Var2 = this.b;
        if (y00Var2 == null || bw0.p(y00Var2, i, i2)) {
            throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        if (y00Var2.s) {
            Cursor v = se0Var.v(new o1(5, "SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'"));
            try {
                nr0 i3 = tl2.i();
                while (v.moveToNext()) {
                    String string = v.getString(0);
                    string.getClass();
                    if (!is1.b0(string, "sqlite_", false) && !string.equals("android_metadata")) {
                        i3.add(new z51(string, Boolean.valueOf(ym0.b(v.getString(1), "view"))));
                    }
                }
                nr0 e = tl2.e(i3);
                v.close();
                ListIterator listIterator = e.listIterator(0);
                while (true) {
                    lr0 lr0Var = (lr0) listIterator;
                    if (!lr0Var.hasNext()) {
                        break;
                    }
                    z51 z51Var = (z51) lr0Var.next();
                    String str = (String) z51Var.g;
                    if (((Boolean) z51Var.h).booleanValue()) {
                        sQLiteDatabase.execSQL("DROP VIEW IF EXISTS " + str);
                    } else {
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            koVar.c(se0Var);
        }
        List list = this.c;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((zq) it2.next()).getClass();
            }
        }
        koVar.a(se0Var);
    }
}
