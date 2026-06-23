package defpackage;

/* loaded from: classes.dex */
public final class ip0 extends Number {
    public final String g;

    public ip0(String str) {
        this.g = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ip0) {
            return this.g.equals(((ip0) obj).g);
        }
        return false;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        String str = this.g;
        try {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(str);
            }
        } catch (NumberFormatException unused2) {
            return ju0.e0(str).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        String str = this.g;
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return ju0.e0(str).longValue();
        }
    }

    public final String toString() {
        return this.g;
    }
}
