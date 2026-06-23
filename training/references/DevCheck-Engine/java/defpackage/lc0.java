package defpackage;

import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class lc0 {

    /* renamed from: a, reason: collision with root package name */
    public String f581a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc0)) {
            return false;
        }
        lc0 lc0Var = (lc0) obj;
        return Objects.equals(this.f581a, lc0Var.f581a) && Objects.equals(this.b, lc0Var.b) && Objects.equals(this.c, lc0Var.c);
    }

    public final int hashCode() {
        return Objects.hash(this.f581a, this.b, this.c);
    }
}
