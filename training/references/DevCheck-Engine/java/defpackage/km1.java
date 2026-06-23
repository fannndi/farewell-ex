package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class km1 implements Iterable {
    public final /* synthetic */ u20 g;

    public km1(u20 u20Var) {
        this.g = u20Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new t20(this.g);
    }
}
