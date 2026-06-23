package defpackage;

/* loaded from: classes.dex */
public final class rm0 extends pm0 {
    public static final rm0 j = new rm0(1, 0, 1);

    @Override // defpackage.pm0
    public final boolean equals(Object obj) {
        if (!(obj instanceof rm0)) {
            return false;
        }
        if (isEmpty() && ((rm0) obj).isEmpty()) {
            return true;
        }
        rm0 rm0Var = (rm0) obj;
        return this.g == rm0Var.g && this.h == rm0Var.h;
    }

    @Override // defpackage.pm0
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.g * 31) + this.h;
    }

    @Override // defpackage.pm0
    public final boolean isEmpty() {
        return this.g > this.h;
    }

    @Override // defpackage.pm0
    public final String toString() {
        return this.g + ".." + this.h;
    }
}
