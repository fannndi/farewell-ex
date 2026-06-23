package defpackage;

import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class t extends u implements RandomAccess {
    public final u g;
    public final int h;
    public final int i;

    public t(u uVar, int i, int i2) {
        this.g = uVar;
        this.h = i;
        tl2.f(i, i2, uVar.b());
        this.i = i2 - i;
    }

    @Override // defpackage.n
    public final int b() {
        return this.i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.i;
        if (i < 0 || i >= i2) {
            c.g(d51.n(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.g.get(this.h + i);
    }

    @Override // defpackage.u, java.util.List
    public final List subList(int i, int i2) {
        tl2.f(i, i2, this.i);
        int i3 = this.h;
        return new t(this.g, i + i3, i3 + i2);
    }
}
