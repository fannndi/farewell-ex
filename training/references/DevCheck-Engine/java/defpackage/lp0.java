package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class lp0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f602a;
    public final boolean b;

    public lp0(List list, boolean z) {
        this.f602a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lp0)) {
            return false;
        }
        lp0 lp0Var = (lp0) obj;
        return this.b == lp0Var.b && this.f602a.equals(lp0Var.f602a);
    }

    public final int hashCode() {
        return Objects.hash(this.f602a, Boolean.valueOf(this.b));
    }
}
