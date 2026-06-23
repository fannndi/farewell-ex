package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class go0 extends lo0 implements Iterable {
    public final ArrayList g = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof go0) && ((go0) obj).g.equals(this.g);
        }
        return true;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.g.iterator();
    }
}
