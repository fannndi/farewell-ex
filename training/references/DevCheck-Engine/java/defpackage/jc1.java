package defpackage;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes.dex */
public final class jc1 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f474a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public jc1(ArrayList arrayList, String str, String str2, String str3, String str4) {
        this.f474a = arrayList;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jc1)) {
            return false;
        }
        jc1 jc1Var = (jc1) obj;
        return this.f474a.equals(jc1Var.f474a) && this.b.equals(jc1Var.b) && this.c.equals(jc1Var.c) && Objects.equals(this.d, jc1Var.d) && Objects.equals(this.e, jc1Var.e);
    }

    public final int hashCode() {
        return Objects.hash(this.f474a, this.b, this.c, this.d, this.e);
    }
}
