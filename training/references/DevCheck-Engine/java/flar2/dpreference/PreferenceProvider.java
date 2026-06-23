package flar2.devcheck.dpreference;

import Cwd.YSHrxiHkAFcciU;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media.RfwE.BIxeFreLLop;
import com.imn.iivisu.ltkT.CDsMEtnUjndKau;
import defpackage.c;
import defpackage.d51;
import defpackage.i8;
import defpackage.rw;
import defpackage.y81;
import flar2.devcheck.sensors.JCZI.nyGJ;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class PreferenceProvider extends ContentProvider {
    public static final UriMatcher g;
    public static final String[] h;
    public static final ConcurrentHashMap i;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        g = uriMatcher;
        uriMatcher.addURI("flar2.devcheck.dpreference.PreferenceProvider", YSHrxiHkAFcciU.FSLqT, 1);
        uriMatcher.addURI("flar2.devcheck.dpreference.PreferenceProvider", "string/*/*", 2);
        uriMatcher.addURI("flar2.devcheck.dpreference.PreferenceProvider", BIxeFreLLop.VKQUHsesnQB, 3);
        uriMatcher.addURI("flar2.devcheck.dpreference.PreferenceProvider", "long/*/*", 4);
        h = new String[]{"value"};
        i = new ConcurrentHashMap();
    }

    public static Uri a(int i2, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i2 == 1) {
            str2 = "content://flar2.devcheck.dpreference.PreferenceProvider/boolean/";
        } else if (i2 == 2) {
            str2 = "content://flar2.devcheck.dpreference.PreferenceProvider/string/";
        } else if (i2 == 3) {
            str2 = nyGJ.kkNksSwaHXzgXEn;
        } else {
            if (i2 != 4) {
                c.n(d51.q("unsupport preftype : ", i2));
                return null;
            }
            str2 = "content://flar2.devcheck.dpreference.PreferenceProvider/long/";
        }
        sb.append(str2);
        sb.append("common/");
        sb.append(str);
        return Uri.parse(sb.toString());
    }

    public static i8 c(Uri uri) {
        if (uri == null || uri.getPathSegments().size() != 3) {
            rw.o("getPrefModelByUri uri is wrong : ", uri);
            return null;
        }
        String str = uri.getPathSegments().get(1);
        String str2 = uri.getPathSegments().get(2);
        i8 i8Var = new i8();
        i8Var.g = str;
        i8Var.h = str2;
        return i8Var;
    }

    public static MatrixCursor d(Object obj) {
        MatrixCursor matrixCursor = new MatrixCursor(h, 1);
        matrixCursor.newRow().add(obj);
        return matrixCursor;
    }

    public final y81 b(String str) {
        if (TextUtils.isEmpty(str)) {
            c.m("getDPreference name is null!!!");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = i;
        y81 y81Var = (y81) concurrentHashMap.get(str);
        if (y81Var != null) {
            return y81Var;
        }
        y81 y81Var2 = new y81(getContext(), str);
        y81 y81Var3 = (y81) concurrentHashMap.putIfAbsent(str, y81Var2);
        return y81Var3 != null ? y81Var3 : y81Var2;
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        int match = g.match(uri);
        if (match != 1 && match != 2 && match != 3 && match != 4) {
            rw.n(" unsupported uri : ", uri);
            return 0;
        }
        i8 c = c(uri);
        y81 b = b((String) c.g);
        b.f1218a.getSharedPreferences(b.b, 0).edit().remove((String) c.h).apply();
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("insert unsupport!!!");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        i8 c = c(uri);
        String str3 = (String) c.h;
        String str4 = (String) c.g;
        int match = g.match(uri);
        if (match == 1) {
            y81 b = b(str4);
            if (!b.f1218a.getSharedPreferences(b.b, 0).contains(str3)) {
                return null;
            }
            y81 b2 = b(str4);
            return d(Integer.valueOf(b2.f1218a.getSharedPreferences(b2.b, 0).getBoolean(str3, false) ? 1 : 0));
        }
        if (match == 2) {
            y81 b3 = b(str4);
            if (!b3.f1218a.getSharedPreferences(b3.b, 0).contains(str3)) {
                return null;
            }
            y81 b4 = b(str4);
            return d(b4.f1218a.getSharedPreferences(b4.b, 0).getString(str3, ""));
        }
        if (match == 3) {
            y81 b5 = b(str4);
            if (!b5.f1218a.getSharedPreferences(b5.b, 0).contains(str3)) {
                return null;
            }
            y81 b6 = b(str4);
            return d(Integer.valueOf(b6.f1218a.getSharedPreferences(b6.b, 0).getInt(str3, -1)));
        }
        if (match != 4) {
            return null;
        }
        y81 b7 = b(str4);
        if (!b7.f1218a.getSharedPreferences(b7.b, 0).contains(str3)) {
            return null;
        }
        y81 b8 = b(str4);
        return d(Long.valueOf(b8.f1218a.getSharedPreferences(b8.b, 0).getLong(str3, -1L)));
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        String str2 = (String) c(uri).g;
        int match = g.match(uri);
        String str3 = CDsMEtnUjndKau.YdjpSHlm;
        if (match == 1) {
            if (contentValues == null) {
                c.m(" values is null!!!");
                return 0;
            }
            try {
                String asString = contentValues.getAsString("key");
                boolean booleanValue = contentValues.getAsBoolean(str3).booleanValue();
                y81 b = b(str2);
                b.f1218a.getSharedPreferences(b.b, 0).edit().putBoolean(asString, booleanValue).apply();
            } catch (Exception unused) {
            }
            return 0;
        }
        if (match == 2) {
            if (contentValues == null) {
                c.m(" values is null!!!");
                return 0;
            }
            String asString2 = contentValues.getAsString("key");
            String asString3 = contentValues.getAsString(str3);
            y81 b2 = b(str2);
            b2.f1218a.getSharedPreferences(b2.b, 0).edit().putString(asString2, asString3).apply();
            return 0;
        }
        if (match == 3) {
            if (contentValues == null) {
                c.m(" values is null!!!");
                return 0;
            }
            String asString4 = contentValues.getAsString("key");
            int intValue = contentValues.getAsInteger(str3).intValue();
            y81 b3 = b(str2);
            b3.f1218a.getSharedPreferences(b3.b, 0).edit().putInt(asString4, intValue).apply();
            return 0;
        }
        if (match != 4) {
            rw.n("update unsupported uri : ", uri);
            return 0;
        }
        if (contentValues == null) {
            c.m(" values is null!!!");
            return 0;
        }
        String asString5 = contentValues.getAsString("key");
        long longValue = contentValues.getAsLong(str3).longValue();
        y81 b4 = b(str2);
        b4.f1218a.getSharedPreferences(b4.b, 0).edit().putLong(asString5, longValue).apply();
        return 0;
    }
}
