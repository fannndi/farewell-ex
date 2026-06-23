package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import com.google.android.material.bottomappbar.HaCM.QCeVODiUkb;
import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import com.imn.iivisu.ltkT.CDsMEtnUjndKau;
import flar2.devcheck.benchmarkSuite.history.Hq.CGvJMCDBOmCdj;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class h30 extends SQLiteOpenHelper {
    public final Context g;
    public final String h;
    public final int i;
    public SQLiteDatabase j;
    public boolean k;
    public final String l;
    public final String m;
    public int n;

    public h30(Context context) {
        super(context, "devices.db", (SQLiteDatabase.CursorFactory) null, 6);
        this.j = null;
        this.k = false;
        this.n = 0;
        this.g = context;
        this.h = "devices.db";
        this.i = 6;
        this.m = "databases/".concat("devices.db");
        this.l = d51.u(new StringBuilder(), context.getApplicationInfo().dataDir, "/databases");
    }

    public final void a() {
        String str = this.m;
        StringBuilder sb = new StringBuilder();
        String str2 = this.l;
        sb.append(str2);
        sb.append("/");
        sb.append(this.h);
        String sb2 = sb.toString();
        try {
            InputStream open = this.g.getAssets().open(str);
            try {
                File file = new File(str2 + "/");
                if (!file.exists()) {
                    file.mkdir();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(sb2);
                byte[] bArr = new byte[rt0.v];
                while (true) {
                    int read = open.read(bArr);
                    if (read <= 0) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        open.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } catch (IOException e) {
                si1 si1Var = new si1(d51.y("Unable to write ", sb2, " to data directory"));
                si1Var.setStackTrace(e.getStackTrace());
                throw si1Var;
            }
        } catch (Exception e2) {
            si1 si1Var2 = new si1(d51.y("Missing ", str, " file (or .zip, .gz archive) in assets, or target folder not writable"));
            si1Var2.setStackTrace(e2.getStackTrace());
            throw si1Var2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.k) {
                throw new IllegalStateException("Closed during initialization");
            }
            SQLiteDatabase sQLiteDatabase = this.j;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                this.j.close();
                this.j = null;
            }
            super.close();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final SQLiteDatabase e(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.l);
        sb.append("/");
        sb.append(this.h);
        SQLiteDatabase l = new File(sb.toString()).exists() ? l() : null;
        if (l == null) {
            a();
            return l();
        }
        if (!z) {
            return l;
        }
        l.close();
        a();
        return l();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        SQLiteDatabase sQLiteDatabase2 = this.j;
        if (sQLiteDatabase2 != null && sQLiteDatabase2.isOpen()) {
            return this.j;
        }
        if (this.k) {
            throw new IllegalStateException(CGvJMCDBOmCdj.gWaDjBp);
        }
        try {
            return getWritableDatabase();
        } catch (SQLiteException e) {
            if (this.h == null) {
                throw e;
            }
            SQLiteDatabase sQLiteDatabase3 = null;
            try {
                try {
                    this.k = true;
                    String path = this.g.getDatabasePath(this.h).getPath();
                    sQLiteDatabase = SQLiteDatabase.openDatabase(path, null, 1);
                    try {
                        if (sQLiteDatabase.getVersion() == this.i) {
                            onOpen(sQLiteDatabase);
                            this.j = sQLiteDatabase;
                            this.k = false;
                            return sQLiteDatabase;
                        }
                        throw new SQLiteException("Can't upgrade read-only database from version " + sQLiteDatabase.getVersion() + " to " + this.i + ": " + path);
                    } catch (Exception unused) {
                        this.k = false;
                        if (sQLiteDatabase != null && sQLiteDatabase != this.j) {
                            sQLiteDatabase.close();
                        }
                        this.k = false;
                        if (sQLiteDatabase != null && sQLiteDatabase != this.j) {
                            sQLiteDatabase.close();
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    sQLiteDatabase3 = 1;
                    this.k = false;
                    if (sQLiteDatabase3 != null && sQLiteDatabase3 != this.j) {
                        sQLiteDatabase3.close();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                sQLiteDatabase = null;
            } catch (Throwable th2) {
                th = th2;
                this.k = false;
                if (sQLiteDatabase3 != null) {
                    sQLiteDatabase3.close();
                }
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized SQLiteDatabase getWritableDatabase() {
        SQLiteDatabase sQLiteDatabase;
        Throwable th;
        SQLiteDatabase sQLiteDatabase2 = this.j;
        if (sQLiteDatabase2 != null && sQLiteDatabase2.isOpen() && !this.j.isReadOnly()) {
            return this.j;
        }
        if (this.k) {
            throw new IllegalStateException("getWritableDatabase called recursively");
        }
        SQLiteDatabase sQLiteDatabase3 = null;
        try {
            this.k = true;
            sQLiteDatabase = e(false);
            if (sQLiteDatabase == null) {
                this.k = false;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                return null;
            }
            try {
                int version = sQLiteDatabase.getVersion();
                if (version == 0 || version >= this.n) {
                    sQLiteDatabase3 = sQLiteDatabase;
                } else {
                    sQLiteDatabase.close();
                    SQLiteDatabase e = e(true);
                    if (e == null) {
                        this.k = false;
                        if (e != null) {
                            e.close();
                        }
                        return null;
                    }
                    try {
                        e.setVersion(this.i);
                        version = e.getVersion();
                        sQLiteDatabase3 = e;
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteDatabase = e;
                        this.k = false;
                        if (sQLiteDatabase != null) {
                            sQLiteDatabase.close();
                        }
                        throw th;
                    }
                }
                if (version != this.i) {
                    sQLiteDatabase3.beginTransaction();
                    try {
                        sQLiteDatabase3.setVersion(this.i);
                        sQLiteDatabase3.setTransactionSuccessful();
                        sQLiteDatabase3.endTransaction();
                    } catch (Throwable th3) {
                        sQLiteDatabase3.endTransaction();
                        throw th3;
                    }
                }
                onOpen(sQLiteDatabase3);
                this.k = false;
                SQLiteDatabase sQLiteDatabase4 = this.j;
                if (sQLiteDatabase4 != null && sQLiteDatabase4 != sQLiteDatabase3) {
                    try {
                        sQLiteDatabase4.close();
                    } catch (Exception unused) {
                    }
                }
                this.j = sQLiteDatabase3;
                return sQLiteDatabase3;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            sQLiteDatabase = sQLiteDatabase3;
            th = th5;
        }
    }

    public final String j() {
        String str = Build.DEVICE;
        String str2 = Build.MODEL;
        SQLiteDatabase readableDatabase = getReadableDatabase();
        String str3 = CDsMEtnUjndKau.MiyyiiflyXeRvOL;
        String str4 = QCeVODiUkb.yGsMbFqeS;
        String[] strArr = {str4, "device", str3};
        Cursor query = readableDatabase.query("devices", strArr, "device LIKE ? AND model LIKE ?", new String[]{str, str2}, null, null, null);
        String string = query.moveToFirst() ? query.getString(query.getColumnIndexOrThrow(str4)) : null;
        if (string == null) {
            query = readableDatabase.query("devices", strArr, YHJbtPFAANaPQ.CBYkF, new String[]{str2}, null, null, null);
            if (query.moveToFirst()) {
                string = query.getString(query.getColumnIndexOrThrow(str4));
            }
            if (string == null) {
                query = readableDatabase.query("devices", strArr, "device LIKE ?", new String[]{str}, null, null, null);
                if (query.moveToFirst()) {
                    string = query.getString(query.getColumnIndexOrThrow(str4));
                }
            }
        }
        try {
            query.close();
        } catch (IOException unused) {
        }
        try {
            readableDatabase.close();
        } catch (IOException unused2) {
        }
        return string;
    }

    public final SQLiteDatabase l() {
        try {
            return SQLiteDatabase.openDatabase(this.l + "/" + this.h, null, 0);
        } catch (SQLiteException unused) {
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
