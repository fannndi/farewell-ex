package defpackage;

import java.util.AbstractSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class kv1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f552a;
    public final Map b;
    public final Set c;
    public final Set d;

    public kv1(String str, Map map, AbstractSet abstractSet, AbstractSet abstractSet2) {
        abstractSet.getClass();
        this.f552a = str;
        this.b = map;
        this.c = abstractSet;
        this.d = abstractSet2;
    }

    public static final kv1 a(se0 se0Var, String str) {
        return kk1.G(new ct1(se0Var), str);
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv1)) {
            return false;
        }
        kv1 kv1Var = (kv1) obj;
        if (!this.f552a.equals(kv1Var.f552a) || !this.b.equals(kv1Var.b) || !ym0.b(this.c, kv1Var.c)) {
            return false;
        }
        Set set2 = this.d;
        if (set2 == null || (set = kv1Var.d) == null) {
            return true;
        }
        return set2.equals(set);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f552a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |TableInfo {\n            |    name = '");
        sb.append(this.f552a);
        sb.append("',\n            |    columns = {");
        sb.append(op0.l(yr.d0(this.b.values(), new c4(13))));
        sb.append("\n            |    foreignKeys = {");
        sb.append(op0.l(this.c));
        sb.append("\n            |    indices = {");
        Set set = this.d;
        sb.append(op0.l(set != null ? yr.d0(set, new c4(14)) : p80.g));
        sb.append("\n            |}\n        ");
        return bs1.V(sb.toString());
    }
}
