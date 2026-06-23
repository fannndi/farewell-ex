package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class u20 implements gm1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1018a = 1;
    public final Object b;
    public final wf0 c;

    public u20(gm1 gm1Var, lf0 lf0Var) {
        this.b = gm1Var;
        this.c = lf0Var;
    }

    public u20(CharSequence charSequence, pf0 pf0Var) {
        charSequence.getClass();
        this.b = charSequence;
        this.c = pf0Var;
    }

    @Override // defpackage.gm1
    public final Iterator iterator() {
        switch (this.f1018a) {
            case 0:
                return new t20(this);
            default:
                return new w02(this);
        }
    }
}
