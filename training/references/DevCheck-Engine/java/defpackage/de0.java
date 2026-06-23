package defpackage;

import flar2.devcheck.benchmarkSuite.nativebridge.vGm.RIhTGWkqQvGL;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class de0 extends i72 {
    public static final ce0 h = new ce0(0);
    public final boolean e;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();
    public boolean f = false;
    public boolean g = false;

    public de0(boolean z) {
        this.e = z;
    }

    @Override // defpackage.i72
    public final void b() {
        if (ae0.H(3)) {
            toString();
        }
        this.f = true;
    }

    public final void c(String str) {
        HashMap hashMap = this.c;
        de0 de0Var = (de0) hashMap.get(str);
        if (de0Var != null) {
            de0Var.b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.d;
        n72 n72Var = (n72) hashMap2.get(str);
        if (n72Var != null) {
            n72Var.a();
            hashMap2.remove(str);
        }
    }

    public final void d(ld0 ld0Var) {
        if (this.g) {
            ae0.H(2);
        } else {
            if (this.b.remove(ld0Var.l) == null || !ae0.H(2)) {
                return;
            }
            ld0Var.toString();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && de0.class == obj.getClass()) {
            de0 de0Var = (de0) obj;
            if (this.b.equals(de0Var.b) && this.c.equals(de0Var.c) && this.d.equals(de0Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(RIhTGWkqQvGL.IaOfHGnhruJR);
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
