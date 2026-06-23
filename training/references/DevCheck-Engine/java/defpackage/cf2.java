package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class cf2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f123a;
    public final Set b;

    public cf2(String str, Set set) {
        this.f123a = str;
        this.b = set;
    }

    public static zf a() {
        zf zfVar = new zf(13);
        int i = be2.l;
        de2 de2Var = de2.p;
        if (de2Var != null) {
            zfVar.i = de2Var;
            return zfVar;
        }
        jw0.f("Null verdictOptOut");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cf2) {
            cf2 cf2Var = (cf2) obj;
            String str = cf2Var.f123a;
            String str2 = this.f123a;
            if (str2 != null ? str2.equals(str) : str == null) {
                if (this.b.equals(cf2Var.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f123a;
        return this.b.hashCode() ^ (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "StandardIntegrityTokenRequest{requestHash=" + this.f123a + ", verdictOptOut=" + this.b.toString() + "}";
    }
}
