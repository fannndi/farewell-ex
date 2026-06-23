package defpackage;

import Cwd.YSHrxiHkAFcciU;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class t42 implements vt1 {
    public final /* synthetic */ int g;
    public final /* synthetic */ zi1 h;

    public /* synthetic */ t42(zi1 zi1Var, int i) {
        this.g = i;
        this.h = zi1Var;
    }

    @Override // defpackage.vt1
    public final Object e() {
        int i = this.g;
        zi1 zi1Var = this.h;
        switch (i) {
            case 0:
                zi1Var.getClass();
                int i2 = hr.e;
                gr grVar = new gr(0);
                grVar.h = null;
                grVar.i = new ArrayList();
                grVar.j = null;
                grVar.k = "";
                HashMap hashMap = new HashMap();
                String str = YSHrxiHkAFcciU.FPzYIdQtP;
                SQLiteDatabase a2 = zi1Var.a();
                a2.beginTransaction();
                try {
                    hr hrVar = (hr) zi1.v(a2.rawQuery(str, new String[0]), new b20(5, zi1Var, hashMap, grVar));
                    a2.setTransactionSuccessful();
                    return hrVar;
                } finally {
                    a2.endTransaction();
                }
            default:
                Integer num = (Integer) zi1Var.j(new vi1(zi1Var, zi1Var.h.c() - zi1Var.j.d));
                num.getClass();
                return num;
        }
    }
}
