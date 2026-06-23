package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class oc1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f727a;
    public final String b;

    public oc1(String str, String str2) {
        this.f727a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof oc1)) {
            return false;
        }
        oc1 oc1Var = (oc1) obj;
        return this.f727a.equals(oc1Var.f727a) && this.b.equals(oc1Var.b);
    }

    public final int hashCode() {
        return Objects.hash(this.f727a, this.b);
    }
}
