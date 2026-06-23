package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class hg2 {
    public static final u40 i = new u40(new hf2(2), new j70(8));

    /* renamed from: a, reason: collision with root package name */
    public final Context f384a;
    public final String b;
    public final u40 c;
    public final mw1 d;
    public final u4 e;
    public final int f;
    public final pg0 g;
    public final ng0 h;

    public hg2(Context context) {
        hg0 hg0Var = hg0.b;
        xc1.k("Null context is not permitted.", context);
        u40 u40Var = i;
        xc1.k("Api must not be null.", u40Var);
        xc1.k("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.", hg0Var);
        Context applicationContext = context.getApplicationContext();
        xc1.k("The provided context did not have an application context.", applicationContext);
        this.f384a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.b = attributionTag;
        this.c = u40Var;
        this.d = mw1.f658a;
        this.e = new u4(u40Var, attributionTag);
        ng0 d = ng0.d(applicationContext);
        this.h = d;
        this.f = d.h.getAndIncrement();
        this.g = hg0Var.f382a;
        lg2 lg2Var = d.m;
        lg2Var.sendMessage(lg2Var.obtainMessage(7, this));
    }

    public final fh a() {
        fh fhVar = new fh(12);
        Set set = Collections.EMPTY_SET;
        if (((r9) fhVar.h) == null) {
            fhVar.h = new r9(0);
        }
        ((r9) fhVar.h).addAll(set);
        Context context = this.f384a;
        fhVar.j = context.getClass().getName();
        fhVar.i = context.getPackageName();
        return fhVar;
    }

    public final void b(lw1 lw1Var) {
        h70 h70Var = new h70();
        jb0[] jb0VarArr = {op0.n};
        h70Var.g = new my1(lw1Var);
        y30 y30Var = new y30(h70Var, jb0VarArr, false);
        nv1 nv1Var = new nv1();
        ng0 ng0Var = this.h;
        ng0Var.getClass();
        uf2 uf2Var = new uf2(new dg2(y30Var, nv1Var, this.g), ng0Var.i.get(), this);
        lg2 lg2Var = ng0Var.m;
        lg2Var.sendMessage(lg2Var.obtainMessage(4, uf2Var));
    }
}
