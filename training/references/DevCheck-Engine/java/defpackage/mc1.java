package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class mc1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f624a;
    public final int b;

    public mc1(int i, String str) {
        this.f624a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mc1)) {
            return false;
        }
        mc1 mc1Var = (mc1) obj;
        return this.b == mc1Var.b && this.f624a.equals(mc1Var.f624a);
    }

    public final int hashCode() {
        return Objects.hash(this.f624a, Integer.valueOf(this.b));
    }
}
