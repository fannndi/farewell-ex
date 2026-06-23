package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class jn2 extends xm2 {
    public final byte[] i;

    public jn2(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.i = bArr;
    }

    @Override // defpackage.xm2
    public final byte[] j() {
        return this.i;
    }
}
