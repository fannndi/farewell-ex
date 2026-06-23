package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import com.google.android.material.snackbar.qXlx.IGQCApxXGMWo;
import java.io.Closeable;

/* loaded from: classes.dex */
public final class se0 implements Closeable {
    public static final String[] h = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", IGQCApxXGMWo.eoetHXpUZgTo};
    public static final String[] i = new String[0];
    public static final jp0 j = d10.H(new re0(0));
    public static final jp0 k = d10.H(new re0(1));
    public final SQLiteDatabase g;

    public se0(SQLiteDatabase sQLiteDatabase) {
        this.g = sQLiteDatabase;
    }

    public final void D() {
        this.g.setTransactionSuccessful();
    }

    public final void a() {
        this.g.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g.close();
    }

    public final void e() {
        this.g.beginTransactionNonExclusive();
    }

    public final ze0 j(String str) {
        str.getClass();
        SQLiteStatement compileStatement = this.g.compileStatement(str);
        compileStatement.getClass();
        return new ze0(compileStatement);
    }

    public final void l() {
        this.g.endTransaction();
    }

    public final void m(String str) {
        this.g.execSQL(str);
    }

    public final void o(Object[] objArr) {
        this.g.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final boolean r() {
        return this.g.inTransaction();
    }

    public final Cursor v(jt1 jt1Var) {
        final pe0 pe0Var = new pe0(jt1Var);
        Cursor rawQueryWithFactory = this.g.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: qe0
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                jt1 jt1Var2 = pe0.this.g;
                sQLiteQuery.getClass();
                jt1Var2.l(new ye0(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, jt1Var.j(), i, null);
        rawQueryWithFactory.getClass();
        return rawQueryWithFactory;
    }
}
