package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class qc1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f835a;
    public final int b;
    public final int c;
    public final pc1 d;
    public final mc1 e;
    public final String f;

    public qc1(String str, int i, int i2, pc1 pc1Var, mc1 mc1Var, String str2) {
        this.f835a = str;
        this.b = i;
        this.c = i2;
        this.d = pc1Var;
        this.e = mc1Var;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qc1)) {
            return false;
        }
        qc1 qc1Var = (qc1) obj;
        return this.b == qc1Var.b && this.c == qc1Var.c && this.f835a.equals(qc1Var.f835a) && this.d.equals(qc1Var.d) && Objects.equals(this.e, qc1Var.e) && this.f.equals(qc1Var.f);
    }

    public final int hashCode() {
        return Objects.hash(this.f835a, Integer.valueOf(this.b), Integer.valueOf(this.c), this.d, this.e, this.f);
    }
}
