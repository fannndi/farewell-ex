package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class bo1 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f94a;

    public bo1(Object obj) {
        this.f94a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && bo1.class == obj.getClass() && this.f94a.equals(((bo1) obj).f94a);
    }

    public final int hashCode() {
        return Objects.hash(this.f94a, null);
    }
}
