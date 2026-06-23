package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class k51 implements Closeable {
    public static final Object h = new Object();
    public static boolean i;
    public final SQLiteDatabase g;

    public k51(SQLiteDatabase sQLiteDatabase) {
        this.g = sQLiteDatabase;
    }

    public static void a(Context context) {
        InputStream inputStream;
        if (i) {
            return;
        }
        File databasePath = context.getDatabasePath("oui.db");
        File parentFile = databasePath.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences("oui_db_prefs", 0);
        int i2 = sharedPreferences.getInt("oui_db_version", 0);
        if (!databasePath.exists() || i2 != 11) {
            File parentFile2 = databasePath.getParentFile();
            if (parentFile2 != null && !parentFile2.exists()) {
                parentFile2.mkdirs();
            }
            File file = new File(parentFile2, databasePath.getName() + ".tmp");
            FileOutputStream fileOutputStream = null;
            try {
                inputStream = context.getAssets().open("databases/oui.db");
                try {
                    if (file.exists() && !file.delete()) {
                        throw new IOException("Unable to delete temp OUI DB " + file.getAbsolutePath());
                    }
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    try {
                        byte[] bArr = new byte[rt0.y];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            } else {
                                fileOutputStream2.write(bArr, 0, read);
                            }
                        }
                        fileOutputStream2.getFD().sync();
                        fileOutputStream2.flush();
                        if (databasePath.exists() && !databasePath.delete()) {
                            throw new IOException("Unable to delete old OUI DB " + databasePath.getAbsolutePath());
                        }
                        if (!file.renameTo(databasePath)) {
                            throw new IOException(jYVJoqfHJs.IQVTvzSdkjPr + databasePath.getAbsolutePath());
                        }
                        try {
                            fileOutputStream2.close();
                        } catch (IOException unused) {
                        }
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                        if (file.exists() && !databasePath.exists()) {
                            file.delete();
                        }
                        sharedPreferences.edit().putInt("oui_db_version", 11).apply();
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream = fileOutputStream2;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException unused4) {
                            }
                        }
                        if (!file.exists()) {
                            throw th;
                        }
                        if (databasePath.exists()) {
                            throw th;
                        }
                        file.delete();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                inputStream = null;
            }
        }
        i = true;
    }

    public static k51 e(Context context) {
        Context applicationContext = context.getApplicationContext();
        synchronized (h) {
            a(applicationContext);
        }
        File databasePath = applicationContext.getDatabasePath("oui.db");
        if (databasePath.exists()) {
            return new k51(SQLiteDatabase.openDatabase(databasePath.getAbsolutePath(), null, 17));
        }
        throw new SQLiteException("OUI database file not found at " + databasePath.getAbsolutePath());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        SQLiteDatabase sQLiteDatabase = this.g;
        if (sQLiteDatabase == null || !sQLiteDatabase.isOpen()) {
            return;
        }
        sQLiteDatabase.close();
    }
}
