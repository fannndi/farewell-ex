package defpackage;

import androidx.emoji2.text.Fk.Iyrs;

/* loaded from: classes.dex */
public final class lu0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f606a;
    public final rm0 b;

    public lu0(String str, rm0 rm0Var) {
        this.f606a = str;
        this.b = rm0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu0)) {
            return false;
        }
        lu0 lu0Var = (lu0) obj;
        return this.f606a.equals(lu0Var.f606a) && this.b.equals(lu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f606a.hashCode() * 31);
    }

    public final String toString() {
        return "MatchGroup(value=" + this.f606a + Iyrs.Wyl + this.b + ')';
    }
}
