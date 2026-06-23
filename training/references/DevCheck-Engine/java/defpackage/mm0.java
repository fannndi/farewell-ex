package defpackage;

import android.graphics.Insets;

/* loaded from: classes.dex */
public final class mm0 {
    public static final mm0 e = new mm0(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f643a;
    public final int b;
    public final int c;
    public final int d;

    public mm0(int i, int i2, int i3, int i4) {
        this.f643a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static mm0 a(mm0 mm0Var, mm0 mm0Var2) {
        return c(Math.max(mm0Var.f643a, mm0Var2.f643a), Math.max(mm0Var.b, mm0Var2.b), Math.max(mm0Var.c, mm0Var2.c), Math.max(mm0Var.d, mm0Var2.d));
    }

    public static mm0 b(mm0 mm0Var, mm0 mm0Var2) {
        return c(Math.min(mm0Var.f643a, mm0Var2.f643a), Math.min(mm0Var.b, mm0Var2.b), Math.min(mm0Var.c, mm0Var2.c), Math.min(mm0Var.d, mm0Var2.d));
    }

    public static mm0 c(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? e : new mm0(i, i2, i3, i4);
    }

    public static mm0 d(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return c(i, i2, i3, i4);
    }

    public final Insets e() {
        return b8.c(this.f643a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mm0.class != obj.getClass()) {
            return false;
        }
        mm0 mm0Var = (mm0) obj;
        return this.d == mm0Var.d && this.f643a == mm0Var.f643a && this.c == mm0Var.c && this.b == mm0Var.b;
    }

    public final int hashCode() {
        return (((((this.f643a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.f643a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
