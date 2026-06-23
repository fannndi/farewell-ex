package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public class pm0 implements Iterable {
    public final int g;
    public final int h;
    public final int i;

    public pm0(int i, int i2, int i3) {
        if (i3 == 0) {
            c.m("Step must be non-zero.");
            throw null;
        }
        if (i3 == Integer.MIN_VALUE) {
            c.m("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            throw null;
        }
        this.g = i;
        this.h = je2.z(i, i2, i3);
        this.i = i3;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof pm0)) {
            return false;
        }
        if (isEmpty() && ((pm0) obj).isEmpty()) {
            return true;
        }
        pm0 pm0Var = (pm0) obj;
        return this.g == pm0Var.g && this.h == pm0Var.h && this.i == pm0Var.i;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.g * 31) + this.h) * 31) + this.i;
    }

    public boolean isEmpty() {
        int i = this.h;
        int i2 = this.i;
        int i3 = this.g;
        return i2 > 0 ? i3 > i : i3 < i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new qm0(this.g, this.h, this.i);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.h;
        int i2 = this.i;
        int i3 = this.g;
        if (i2 > 0) {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i3);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i2);
        }
        return sb.toString();
    }
}
