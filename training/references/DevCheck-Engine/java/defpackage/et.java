package defpackage;

import Cwd.ynLVXgis;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import flar2.devcheck.dpreference.PreferenceProvider;

/* loaded from: classes.dex */
public abstract class et {

    /* renamed from: a, reason: collision with root package name */
    public static final qz f248a = new qz(d10.n(), false);

    public static boolean a(String str) {
        return f248a.d(str);
    }

    public static String b(String str) {
        Context context = f248a.g;
        Uri a2 = PreferenceProvider.a(2, str);
        String str2 = null;
        try {
            Cursor query = context.getContentResolver().query(a2, null, null, null, null);
            if (query != null && query.moveToFirst()) {
                str2 = query.getString(query.getColumnIndex("value"));
            }
            if (query != null && !query.isClosed()) {
                query.close();
            }
        } catch (NullPointerException unused) {
        }
        return str2;
    }

    public static void c(String str, boolean z) {
        Context context = f248a.g;
        Uri a2 = PreferenceProvider.a(1, str);
        ContentValues contentValues = new ContentValues();
        contentValues.put(ynLVXgis.nZRSnYLsHNHfAFZ, str);
        contentValues.put("value", Boolean.valueOf(z));
        context.getContentResolver().update(a2, contentValues, null, null);
    }
}
