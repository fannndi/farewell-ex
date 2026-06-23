package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class g12 {
    public final View b;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f312a = new HashMap();
    public final ArrayList c = new ArrayList();

    public g12(View view) {
        this.b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g12)) {
            return false;
        }
        g12 g12Var = (g12) obj;
        return this.b == g12Var.b && this.f312a.equals(g12Var.f312a);
    }

    public final int hashCode() {
        return this.f312a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        String concat = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n").concat("    values:");
        HashMap hashMap = this.f312a;
        for (String str : hashMap.keySet()) {
            concat = concat + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return concat;
    }
}
