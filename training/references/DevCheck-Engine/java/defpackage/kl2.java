package defpackage;

/* loaded from: classes.dex */
public final class kl2 extends ll2 {
    public final int j;

    public kl2(int i, byte[] bArr) {
        super(bArr);
        ll2.e(0, i, bArr.length);
        this.j = i;
    }

    @Override // defpackage.ll2
    public final byte b(int i) {
        int i2 = this.j;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.h[i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(d51.q("Index < 0: ", i));
        }
        throw new ArrayIndexOutOfBoundsException(d51.n(i, i2, "Index > length: ", ", "));
    }

    @Override // defpackage.ll2
    public final byte c(int i) {
        return this.h[i];
    }

    @Override // defpackage.ll2
    public final int d() {
        return this.j;
    }
}
