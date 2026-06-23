package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class t00 {
    public static final t00 b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f963a;

    static {
        t00 t00Var = new t00(new LinkedHashMap());
        c3.P(t00Var);
        b = t00Var;
    }

    public t00(LinkedHashMap linkedHashMap) {
        linkedHashMap.getClass();
        this.f963a = new HashMap(linkedHashMap);
    }

    public t00(t00 t00Var) {
        t00Var.getClass();
        this.f963a = new HashMap(t00Var.f963a);
    }

    public final boolean a(String str) {
        Object obj = this.f963a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (obj != null && t00.class.equals(obj.getClass())) {
                HashMap hashMap = ((t00) obj).f963a;
                HashMap hashMap2 = this.f963a;
                Set<String> keySet = hashMap2.keySet();
                if (ym0.b(keySet, hashMap.keySet())) {
                    for (String str : keySet) {
                        Object obj2 = hashMap2.get(str);
                        Object obj3 = hashMap.get(str);
                        if (obj2 == null || obj3 == null) {
                            z = obj2 == obj3;
                        } else {
                            if (obj2 instanceof Object[]) {
                                Object[] objArr = (Object[]) obj2;
                                if (obj3 instanceof Object[]) {
                                    z = u9.e0(objArr, (Object[]) obj3);
                                }
                            }
                            z = obj2.equals(obj3);
                        }
                        if (!z) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : this.f963a.entrySet()) {
            Object value = entry.getValue();
            i += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return i * 31;
    }

    public final String toString() {
        return d51.u(new StringBuilder("Data {"), yr.Z(this.f963a.entrySet(), null, null, null, new ub(2), 31), "}");
    }
}
