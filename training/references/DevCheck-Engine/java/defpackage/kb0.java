package defpackage;

import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class kb0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f525a;
    public final Map b;

    public kb0(String str, Map map) {
        this.f525a = str;
        this.b = map;
    }

    public static kb0 a(String str) {
        return new kb0(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kb0)) {
            return false;
        }
        kb0 kb0Var = (kb0) obj;
        return this.f525a.equals(kb0Var.f525a) && this.b.equals(kb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f525a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f525a + ", properties=" + this.b.values() + "}";
    }
}
