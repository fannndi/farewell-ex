package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class ab0 extends jj1 {
    public final HashMap k = new HashMap();

    @Override // defpackage.jj1
    public final gj1 b(Object obj) {
        return (gj1) this.k.get(obj);
    }

    @Override // defpackage.jj1
    public final Object c(Object obj) {
        Object c = super.c(obj);
        this.k.remove(obj);
        return c;
    }
}
