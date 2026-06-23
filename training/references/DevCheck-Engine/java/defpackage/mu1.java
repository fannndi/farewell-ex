package defpackage;

/* loaded from: classes.dex */
public final class mu1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f654a;
    public final int b;
    public final int c;

    public mu1(int i, String str, int i2) {
        str.getClass();
        this.f654a = str;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu1)) {
            return false;
        }
        mu1 mu1Var = (mu1) obj;
        return ym0.b(this.f654a, mu1Var.f654a) && this.b == mu1Var.b && this.c == mu1Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((Integer.hashCode(this.b) + (this.f654a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SystemIdInfo(workSpecId=" + this.f654a + ", generation=" + this.b + ", systemId=" + this.c + ')';
    }
}
