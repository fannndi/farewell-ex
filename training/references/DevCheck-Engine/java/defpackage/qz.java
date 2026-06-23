package defpackage;

import android.content.Context;
import android.database.Cursor;
import flar2.devcheck.dpreference.PreferenceProvider;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class qz implements t70, fe2 {
    public Context g;

    public /* synthetic */ qz(Context context, boolean z) {
        this.g = context;
    }

    @Override // defpackage.t70
    public void a(tl2 tl2Var) {
        fu fuVar = new fu("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), fuVar);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new b9(8, this, tl2Var, threadPoolExecutor));
    }

    @Override // defpackage.ge2
    public Object b() {
        return this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public rz c() {
        Context context = this.g;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        rz rzVar = new rz();
        rzVar.g = t50.a(ea0.f227a);
        b1 b1Var = new b1(context);
        rzVar.h = b1Var;
        rzVar.i = t50.a(new zf(b1Var, 8, new gm2(26, b1Var)));
        b1 b1Var2 = rzVar.h;
        rzVar.j = new u90(b1Var2, 1);
        db1 a2 = t50.a(new i8(rzVar.j, t50.a(new u90(b1Var2, 0)), 0 == true ? 1 : 0));
        rzVar.k = a2;
        pg0 pg0Var = new pg0();
        b1 b1Var3 = rzVar.h;
        fh fhVar = new fh(b1Var3, a2, pg0Var, 24, false);
        db1 db1Var = rzVar.g;
        db1 db1Var2 = rzVar.i;
        yh yhVar = new yh(db1Var, db1Var2, fhVar, a2, a2);
        zg zgVar = new zg();
        zgVar.g = b1Var3;
        zgVar.h = db1Var2;
        zgVar.i = a2;
        zgVar.j = fhVar;
        zgVar.k = db1Var;
        zgVar.l = a2;
        zgVar.m = a2;
        rzVar.l = t50.a(new fh(yhVar, zgVar, new gr(db1Var, a2, fhVar, a2, 16), 29, false));
        return rzVar;
    }

    public boolean d(String str) {
        int i;
        try {
            Cursor query = this.g.getContentResolver().query(PreferenceProvider.a(1, str), null, null, null, null);
            i = (query == null || !query.moveToFirst()) ? 0 : query.getInt(query.getColumnIndex("value"));
            if (query != null) {
                try {
                    if (!query.isClosed()) {
                        query.close();
                    }
                } catch (NullPointerException unused) {
                }
            }
        } catch (NullPointerException unused2) {
            i = 0;
        }
        return i == 1;
    }
}
