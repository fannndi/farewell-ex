package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class gt {

    /* renamed from: a, reason: collision with root package name */
    public final jc1 f352a;
    public final List b;

    public gt(jc1 jc1Var, List list) {
        this.f352a = jc1Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gt)) {
            return false;
        }
        gt gtVar = (gt) obj;
        return this.f352a.equals(gtVar.f352a) && this.b.equals(gtVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.f352a, this.b);
    }
}
