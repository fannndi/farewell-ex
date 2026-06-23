package defpackage;

import Cwd.YSHrxiHkAFcciU;
import android.util.Base64;
import androidx.emoji2.text.Fk.Iyrs;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f63a;
    public final byte[] b;
    public final byte[] c;

    public b3(String str) {
        String[] split = str.split(Iyrs.aVYPqXGuzqwd);
        if (split.length != 3) {
            c.m("Cannot parse iv:mac:ciphertext");
            throw null;
        }
        byte[] decode = Base64.decode(split[0], 2);
        this.b = decode;
        byte[] decode2 = Base64.decode(split[1], 2);
        this.c = decode2;
        byte[] decode3 = Base64.decode(split[2], 2);
        this.f63a = decode3;
        if (decode == null || decode.length != 16) {
            c.m("Invalid IV length");
            throw null;
        }
        if (decode2 == null || decode2.length == 0) {
            c.m("Invalid MAC");
            throw null;
        }
        if (decode3 != null) {
            return;
        }
        c.m(YSHrxiHkAFcciU.uxMahGJjKBJ);
        throw null;
    }

    public b3(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr2.length != 16) {
            c.m("IV must be 16 bytes");
            throw null;
        }
        byte[] bArr4 = new byte[bArr.length];
        this.f63a = bArr4;
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        byte[] bArr5 = new byte[bArr2.length];
        this.b = bArr5;
        System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        byte[] bArr6 = new byte[bArr3.length];
        this.c = bArr6;
        System.arraycopy(bArr3, 0, bArr6, 0, bArr3.length);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj;
        return Arrays.equals(this.f63a, b3Var.f63a) && Arrays.equals(this.b, b3Var.b) && Arrays.equals(this.c, b3Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((Arrays.hashCode(this.b) + ((Arrays.hashCode(this.f63a) + 527) * 17)) * 17);
    }

    public final String toString() {
        return Base64.encodeToString(this.b, 2) + ":" + Base64.encodeToString(this.c, 2) + ":" + Base64.encodeToString(this.f63a, 2);
    }
}
