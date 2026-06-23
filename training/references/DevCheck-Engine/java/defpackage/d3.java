package defpackage;

import android.util.Base64;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    public final SecretKey f168a;
    public final SecretKeySpec b;

    public d3(SecretKey secretKey, SecretKeySpec secretKeySpec) {
        this.f168a = secretKey;
        this.b = secretKeySpec;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj;
        return this.b.equals(d3Var.b) && this.f168a.equals(d3Var.f168a);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((this.f168a.hashCode() + 527) * 17);
    }

    public final String toString() {
        return Base64.encodeToString(this.f168a.getEncoded(), 2) + ":" + Base64.encodeToString(this.b.getEncoded(), 2);
    }
}
