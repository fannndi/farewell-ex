package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class n60 implements gm1 {

    /* renamed from: a, reason: collision with root package name */
    public final gm1 f666a;
    public final int b;

    public n60(gm1 gm1Var, int i) {
        this.f666a = gm1Var;
        this.b = i;
        if (i >= 0) {
            return;
        }
        c.a(i, "count must be non-negative, but was ", 46);
        throw null;
    }

    @Override // defpackage.gm1
    public final Iterator iterator() {
        return new r(this);
    }
}
