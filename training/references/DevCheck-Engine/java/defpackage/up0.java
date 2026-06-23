package defpackage;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class up0 extends OutputStream {
    public long g;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.g++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.g += bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.g += i2;
    }
}
