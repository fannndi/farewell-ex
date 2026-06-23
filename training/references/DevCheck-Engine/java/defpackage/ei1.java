package defpackage;

import android.graphics.Point;
import flar2.devcheck.benchmarkSuite.history.Hq.CGvJMCDBOmCdj;

/* loaded from: classes.dex */
public final class ei1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f235a;
    public final int b;
    public final Point c;

    public ei1(int i, int i2, Point point) {
        int i3 = point.x;
        int i4 = point.y;
        this.f235a = i;
        this.b = i2;
        this.c = new Point(i3, i4);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ei1) {
            ei1 ei1Var = (ei1) obj;
            if (this.f235a == ei1Var.f235a && this.b == ei1Var.b && this.c.equals(ei1Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f235a * 31) + this.b) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RoundedCornerCompat{position=");
        int i = this.f235a;
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "Invalid" : "BottomLeft" : "BottomRight" : "TopRight" : "TopLeft");
        sb.append(", radius=");
        sb.append(this.b);
        sb.append(CGvJMCDBOmCdj.cqbWh);
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
