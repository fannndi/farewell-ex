package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class nf2 {

    /* renamed from: a, reason: collision with root package name */
    public final u4 f679a;
    public final jb0 b;

    public /* synthetic */ nf2(u4 u4Var, jb0 jb0Var) {
        this.f679a = u4Var;
        this.b = jb0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof nf2)) {
            return false;
        }
        nf2 nf2Var = (nf2) obj;
        return md2.j(this.f679a, nf2Var.f679a) && md2.j(this.b, nf2Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f679a, this.b});
    }

    public final String toString() {
        u40 u40Var = new u40(this);
        u40Var.f("key", this.f679a);
        u40Var.f("feature", this.b);
        return u40Var.toString();
    }
}
