package defpackage;

import java.util.AbstractSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class w extends AbstractSet implements Set {
    public abstract int b();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return b();
    }
}
