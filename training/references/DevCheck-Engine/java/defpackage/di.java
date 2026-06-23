package defpackage;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/* loaded from: classes.dex */
public final /* synthetic */ class di implements Predicate {
    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return ((List) ((Map.Entry) obj).getValue()).isEmpty();
    }
}
