package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class kc1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f527a;
    public final String b;
    public final boolean c;
    public final mc1 d;

    public kc1(String str, String str2, boolean z, mc1 mc1Var) {
        this.f527a = str;
        this.b = str2;
        this.c = z;
        this.d = mc1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof kc1)) {
            return false;
        }
        kc1 kc1Var = (kc1) obj;
        return this.c == kc1Var.c && this.f527a.equals(kc1Var.f527a) && this.b.equals(kc1Var.b) && Objects.equals(this.d, kc1Var.d);
    }

    public final int hashCode() {
        return Objects.hash(this.f527a, this.b, Boolean.valueOf(this.c), this.d);
    }
}
