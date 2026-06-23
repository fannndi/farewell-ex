package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class h91 {

    /* renamed from: a, reason: collision with root package name */
    public volatile boolean f370a;
    public volatile boolean b;
    public final go1 c;

    public h91(Context context) {
        this.c = op0.m(context);
        a();
    }

    public final void a() {
        this.f370a = i51.b("prefRoot").booleanValue();
        go1 go1Var = this.c;
        this.b = go1Var != null && go1Var.d() && fo1.b();
    }
}
