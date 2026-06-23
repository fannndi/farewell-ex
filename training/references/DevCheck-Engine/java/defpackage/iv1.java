package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class iv1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f451a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public iv1(String str, String str2, String str3, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        this.f451a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iv1)) {
            return false;
        }
        iv1 iv1Var = (iv1) obj;
        if (ym0.b(this.f451a, iv1Var.f451a) && ym0.b(this.b, iv1Var.b) && ym0.b(this.c, iv1Var.c) && ym0.b(this.d, iv1Var.d)) {
            return ym0.b(this.e, iv1Var.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f451a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |ForeignKey {\n            |   referenceTable = '");
        sb.append(this.f451a);
        sb.append("',\n            |   onDelete = '");
        sb.append(this.b);
        sb.append("',\n            |   onUpdate = '");
        sb.append(this.c);
        sb.append("',\n            |   columnNames = {");
        bs1.T(yr.Z(yr.c0(this.d), ",", null, null, null, 62));
        bs1.T("},");
        e42 e42Var = e42.f219a;
        sb.append(e42Var);
        sb.append("\n            |   referenceColumnNames = {");
        bs1.T(yr.Z(yr.c0(this.e), ",", null, null, null, 62));
        bs1.T(" }");
        sb.append(e42Var);
        sb.append("\n            |}\n        ");
        return bs1.T(bs1.V(sb.toString()));
    }
}
