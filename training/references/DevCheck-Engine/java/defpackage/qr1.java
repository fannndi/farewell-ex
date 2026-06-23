package defpackage;

/* loaded from: classes.dex */
public final class qr1 implements CharSequence {
    public char[] g;
    public String h;

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.g[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.g.length;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new String(this.g, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        if (this.h == null) {
            this.h = new String(this.g);
        }
        return this.h;
    }
}
