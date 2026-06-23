package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b12 extends a12 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p9 f61a;
    public final /* synthetic */ c12 b;

    public b12(c12 c12Var, p9 p9Var) {
        this.b = c12Var;
        this.f61a = p9Var;
    }

    @Override // defpackage.y02
    public final void d(z02 z02Var) {
        ((ArrayList) this.f61a.get(this.b.h)).remove(z02Var);
        z02Var.y(this);
    }
}
