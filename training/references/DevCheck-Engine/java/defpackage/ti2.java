package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class ti2 extends nh2 implements Serializable {
    public static final ti2 h;
    public static final ti2 i;
    public final transient qi2 g;

    static {
        ni2 ni2Var = qi2.h;
        h = new ti2(gj2.k);
        Object[] objArr = {fj2.i};
        for (int i2 = 0; i2 < 1; i2++) {
            if (objArr[i2] == null) {
                jw0.f(d51.q("at index ", i2));
                return;
            }
        }
        i = new ti2(qi2.j(1, objArr));
    }

    public ti2(qi2 qi2Var) {
        this.g = qi2Var;
    }

    @Override // defpackage.nh2
    public final /* bridge */ /* synthetic */ wi2 a() {
        qi2 qi2Var = this.g;
        return qi2Var.isEmpty() ? mj2.o : new nj2(qi2Var, dj2.i);
    }
}
