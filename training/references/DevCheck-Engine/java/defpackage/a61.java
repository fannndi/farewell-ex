package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class a61 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11a;
    public final Object b;

    public a61(Object obj, Object obj2) {
        this.f11a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a61)) {
            return false;
        }
        a61 a61Var = (a61) obj;
        return Objects.equals(a61Var.f11a, this.f11a) && Objects.equals(a61Var.b, this.b);
    }

    public final int hashCode() {
        Object obj = this.f11a;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "Pair{" + this.f11a + " " + this.b + "}";
    }
}
