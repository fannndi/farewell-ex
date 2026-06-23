package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class pc1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f783a;
    public final boolean b;
    public final boolean c;
    public final double d;
    public final boolean e;

    public pc1(int i, boolean z, boolean z2, double d, boolean z3) {
        this.f783a = i;
        this.b = z;
        this.c = z2;
        this.d = d;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pc1)) {
            return false;
        }
        pc1 pc1Var = (pc1) obj;
        return this.f783a == pc1Var.f783a && this.b == pc1Var.b && this.c == pc1Var.c && this.e == pc1Var.e && Double.compare(pc1Var.d, this.d) == 0;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f783a), Boolean.valueOf(this.b), Boolean.valueOf(this.c), Double.valueOf(this.d), Boolean.valueOf(this.e));
    }
}
