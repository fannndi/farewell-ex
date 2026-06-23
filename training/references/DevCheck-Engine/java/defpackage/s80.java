package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class s80 {

    /* renamed from: a, reason: collision with root package name */
    public final v80 f922a;
    public final byte[] b;

    public s80(v80 v80Var, byte[] bArr) {
        if (v80Var == null) {
            jw0.f("encoding is null");
            throw null;
        }
        if (bArr == null) {
            jw0.f("bytes is null");
            throw null;
        }
        this.f922a = v80Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s80)) {
            return false;
        }
        s80 s80Var = (s80) obj;
        if (this.f922a.equals(s80Var.f922a)) {
            return Arrays.equals(this.b, s80Var.b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((this.f922a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.f922a + ", bytes=[...]}";
    }
}
