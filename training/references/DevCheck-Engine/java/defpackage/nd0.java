package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class nd0 extends tl2 implements o72, eq0, yj1, ee0 {
    public final a5 n;
    public final a5 o;
    public final Handler p;
    public final ae0 q;
    public final /* synthetic */ a5 r;

    public nd0(a5 a5Var) {
        this.r = a5Var;
        Handler handler = new Handler();
        this.q = new ae0();
        this.n = a5Var;
        this.o = a5Var;
        this.p = handler;
    }

    @Override // defpackage.tl2
    public final View B(int i) {
        return this.r.findViewById(i);
    }

    @Override // defpackage.tl2
    public final boolean C() {
        Window window = this.r.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.yj1
    public final zf a() {
        return (zf) this.r.k.i;
    }

    @Override // defpackage.ee0
    public final void b() {
    }

    @Override // defpackage.o72
    public final n72 l() {
        return this.r.l();
    }

    @Override // defpackage.eq0
    public final gq0 q() {
        return this.r.A;
    }
}
