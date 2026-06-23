package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;
import java.util.Objects;

/* loaded from: classes.dex */
public final class rr1 extends Writer {
    public final StringBuilder g;
    public final qr1 h = new qr1();

    public rr1(StringBuilder sb) {
        this.g = sb;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence) {
        this.g.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Writer append(CharSequence charSequence, int i, int i2) {
        this.g.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        this.g.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        this.g.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        CharSequence charSequence = this.g;
        if (charSequence instanceof Closeable) {
            ((Closeable) charSequence).close();
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        CharSequence charSequence = this.g;
        if (charSequence instanceof Flushable) {
            ((Flushable) charSequence).flush();
        }
    }

    @Override // java.io.Writer
    public final void write(int i) {
        this.g.append((char) i);
    }

    @Override // java.io.Writer
    public final void write(String str, int i, int i2) {
        Objects.requireNonNull(str);
        this.g.append((CharSequence) str, i, i2 + i);
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        qr1 qr1Var = this.h;
        qr1Var.g = cArr;
        qr1Var.h = null;
        this.g.append((CharSequence) qr1Var, i, i2 + i);
    }
}
