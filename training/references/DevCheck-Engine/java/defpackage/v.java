package defpackage;

import java.util.AbstractList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class v extends AbstractList implements List {
    public abstract int b();

    public abstract Object c(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return c(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return b();
    }
}
