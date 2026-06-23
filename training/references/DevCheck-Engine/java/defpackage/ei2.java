package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class ei2 implements Serializable, Comparable {
    public static final ei2 h = new ei2(0);
    public static final ei2 i = new ei2(1);
    public final /* synthetic */ int g;

    public /* synthetic */ ei2(int i2) {
        this.g = i2;
    }

    public final int a(ei2 ei2Var) {
        switch (this.g) {
            case 0:
                return ei2Var == this ? 0 : 1;
            default:
                return ei2Var == this ? 0 : -1;
        }
    }

    public final void b(StringBuilder sb) {
        switch (this.g) {
            case 0:
                throw new AssertionError();
            default:
                sb.append("(-∞");
                return;
        }
    }

    public final void c(StringBuilder sb) {
        switch (this.g) {
            case 0:
                sb.append("+∞)");
                return;
            default:
                throw new AssertionError();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        switch (this.g) {
            case 0:
                return ((ei2) obj) == this ? 0 : 1;
            default:
                return ((ei2) obj) == this ? 0 : -1;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ei2) {
            try {
                if (a((ei2) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public final int hashCode() {
        switch (this.g) {
        }
        return System.identityHashCode(this);
    }

    public final String toString() {
        switch (this.g) {
            case 0:
                return "+∞";
            default:
                return "-∞";
        }
    }
}
