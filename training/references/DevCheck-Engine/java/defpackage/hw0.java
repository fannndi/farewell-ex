package defpackage;

/* loaded from: classes.dex */
public final class hw0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f404a;
    public final long b;
    public final long c;
    public final long d;

    public hw0(long j, long j2, long j3, long j4) {
        this.f404a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw0)) {
            return false;
        }
        hw0 hw0Var = (hw0) obj;
        return this.f404a == hw0Var.f404a && this.b == hw0Var.b && this.c == hw0Var.c && this.d == hw0Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + ((Boolean.hashCode(false) + ((Long.hashCode(this.c) + ((Long.hashCode(this.b) + (Long.hashCode(this.f404a) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "MemoryData(total=" + this.f404a + ", free=" + this.b + ", used=" + this.c + ", fake=false, fakeTotal=" + this.d + ")";
    }
}
