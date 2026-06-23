package defpackage;

import java.util.Collection;

/* loaded from: classes.dex */
public abstract class as extends zr {
    public static int U(Iterable iterable) {
        iterable.getClass();
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
