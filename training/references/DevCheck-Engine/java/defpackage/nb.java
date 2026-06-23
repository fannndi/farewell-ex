package defpackage;

import android.util.Base64;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class nb {

    /* renamed from: a, reason: collision with root package name */
    public final String f670a;
    public final byte[] b;
    public final d91 c;

    public nb(String str, byte[] bArr, d91 d91Var) {
        this.f670a = str;
        this.b = bArr;
        this.c = d91Var;
    }

    public static fh a() {
        fh fhVar = new fh(3);
        fhVar.j = d91.g;
        return fhVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nb) {
            nb nbVar = (nb) obj;
            if (this.f670a.equals(nbVar.f670a) && Arrays.equals(this.b, nbVar.b) && this.c.equals(nbVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.f670a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003);
    }

    public final String toString() {
        byte[] bArr = this.b;
        String encodeToString = bArr == null ? "" : Base64.encodeToString(bArr, 2);
        StringBuilder sb = new StringBuilder("TransportContext(");
        sb.append(this.f670a);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        return d51.u(sb, encodeToString, ")");
    }
}
