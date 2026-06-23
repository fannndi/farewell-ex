package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.telephony.fHMN.BFtDZYxPcpGN;
import com.google.android.datatransport.runtime.backends.XUas.yFbVsaLCWAtQC;
import org.apache.commons.logging.LogFactory;

/* loaded from: classes.dex */
public final /* synthetic */ class vi1 implements xi1 {
    public final /* synthetic */ int g = 1;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object i;

    public /* synthetic */ vi1(long j, nb nbVar) {
        this.h = j;
        this.i = nbVar;
    }

    public /* synthetic */ vi1(zi1 zi1Var, long j) {
        this.i = zi1Var;
        this.h = j;
    }

    @Override // defpackage.xi1
    public final Object apply(Object obj) {
        int i = this.g;
        Object obj2 = this.i;
        long j = this.h;
        switch (i) {
            case 0:
                zi1 zi1Var = (zi1) obj2;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                zi1Var.getClass();
                String[] strArr = {String.valueOf(j)};
                Cursor rawQuery = sQLiteDatabase.rawQuery(BFtDZYxPcpGN.nCmmOfzqRqdUKk, strArr);
                while (rawQuery.moveToNext()) {
                    try {
                        zi1Var.m(rawQuery.getInt(0), at0.i, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
            default:
                nb nbVar = (nb) obj2;
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) obj;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j));
                String str = nbVar.f670a;
                d91 d91Var = nbVar.c;
                if (sQLiteDatabase2.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(f91.a(d91Var))}) < 1) {
                    contentValues.put(yFbVsaLCWAtQC.qXIkJN, str);
                    contentValues.put(LogFactory.PRIORITY_KEY, Integer.valueOf(f91.a(d91Var)));
                    sQLiteDatabase2.insert("transport_contexts", null, contentValues);
                }
                return null;
        }
    }
}
