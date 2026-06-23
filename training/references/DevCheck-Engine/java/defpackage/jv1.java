package defpackage;

import com.google.android.material.snackbar.qXlx.IGQCApxXGMWo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class jv1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f499a;
    public final boolean b;
    public final List c;
    public final List d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
    public jv1(String str, boolean z, List list, List list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.f499a = str;
        this.b = z;
        this.c = list;
        this.d = list2;
        if (list2.isEmpty()) {
            int size = list.size();
            list2 = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                list2.add("ASC");
            }
        }
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jv1) {
            jv1 jv1Var = (jv1) obj;
            String str = jv1Var.f499a;
            if (this.b == jv1Var.b && ym0.b(this.c, jv1Var.c) && ym0.b(this.d, jv1Var.d)) {
                String str2 = this.f499a;
                return is1.b0(str2, "index_", false) ? is1.b0(str, "index_", false) : str2.equals(str);
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f499a;
        return this.d.hashCode() + ((this.c.hashCode() + ((((is1.b0(str, "index_", false) ? -1184239155 : str.hashCode()) * 31) + (this.b ? 1 : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |Index {\n            |   name = '");
        sb.append(this.f499a);
        sb.append("',\n            |   unique = '");
        sb.append(this.b);
        sb.append(IGQCApxXGMWo.vpdpjN);
        bs1.T(yr.Z(this.c, ",", null, null, null, 62));
        bs1.T("},");
        e42 e42Var = e42.f219a;
        sb.append(e42Var);
        sb.append("\n            |   orders = {");
        bs1.T(yr.Z(this.d, ",", null, null, null, 62));
        bs1.T(" }");
        sb.append(e42Var);
        sb.append("\n            |}\n        ");
        return bs1.T(bs1.V(sb.toString()));
    }
}
