package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class u4 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1020a;
    public final u40 b;
    public final String c;

    public u4(u40 u40Var, String str) {
        this.b = u40Var;
        this.c = str;
        this.f1020a = Arrays.hashCode(new Object[]{u40Var, mw1.f658a, str});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u4)) {
            return false;
        }
        u4 u4Var = (u4) obj;
        if (!md2.j(this.b, u4Var.b)) {
            return false;
        }
        mw1 mw1Var = mw1.f658a;
        return md2.j(mw1Var, mw1Var) && md2.j(this.c, u4Var.c);
    }

    public final int hashCode() {
        return this.f1020a;
    }
}
