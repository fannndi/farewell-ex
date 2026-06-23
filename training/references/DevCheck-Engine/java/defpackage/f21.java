package defpackage;

import android.os.Build;

/* loaded from: classes.dex */
public final class f21 extends pd {
    public final int b;

    static {
        ai1.k("NetworkMeteredCtrlr");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f21(q21 q21Var) {
        super(q21Var);
        q21Var.getClass();
        this.b = 7;
    }

    @Override // defpackage.gv
    public final boolean b(gc2 gc2Var) {
        gc2Var.getClass();
        return gc2Var.j.f609a == r21.k;
    }

    @Override // defpackage.pd
    public final int d() {
        return this.b;
    }

    @Override // defpackage.pd
    public final boolean e(Object obj) {
        o21 o21Var = (o21) obj;
        o21Var.getClass();
        boolean z = o21Var.e;
        boolean z2 = o21Var.f714a;
        if (Build.VERSION.SDK_INT >= 26) {
            return (z2 && o21Var.c && !z) ? false : true;
        }
        ai1.h().getClass();
        return !z2 || z;
    }
}
