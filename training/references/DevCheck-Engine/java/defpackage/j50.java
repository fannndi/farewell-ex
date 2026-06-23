package defpackage;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final class j50 implements mj1 {

    /* renamed from: a, reason: collision with root package name */
    public final ku1 f464a;
    public final i50 b;
    public final Handler c;

    public j50(ku1 ku1Var) {
        i50 i50Var = new i50();
        this.b = i50Var;
        Handler handler = new Handler(Looper.getMainLooper());
        this.c = handler;
        this.f464a = ku1Var;
        handler.post(new g50(i50Var, 0));
    }

    @Override // defpackage.mj1
    public final void a() {
        ku1 ku1Var = this.f464a;
        ku1Var.f550a.i(new h50(this.b.e));
    }

    @Override // defpackage.mj1
    public final void close() {
        this.c.post(new g50(this.b, 1));
    }
}
