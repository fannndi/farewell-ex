package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public abstract class be2 extends pl0 implements Set {
    public static final /* synthetic */ int l = 0;
    public transient ce2 k;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (set.size() == 0) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
