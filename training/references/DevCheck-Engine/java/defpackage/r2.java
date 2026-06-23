package defpackage;

import android.os.Bundle;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class r2 implements bq0 {
    public final /* synthetic */ String g;
    public final /* synthetic */ p2 h;
    public final /* synthetic */ q2 i;
    public final /* synthetic */ tt j;

    public r2(tt ttVar, String str, p2 p2Var, q2 q2Var) {
        this.j = ttVar;
        this.g = str;
        this.h = p2Var;
        this.i = q2Var;
    }

    @Override // defpackage.bq0
    public final void e(eq0 eq0Var, xp0 xp0Var) {
        boolean equals = xp0.ON_START.equals(xp0Var);
        String str = this.g;
        tt ttVar = this.j;
        if (!equals) {
            if (xp0.ON_STOP.equals(xp0Var)) {
                ttVar.e.remove(str);
                return;
            } else {
                if (xp0.ON_DESTROY.equals(xp0Var)) {
                    ttVar.e(str);
                    return;
                }
                return;
            }
        }
        HashMap hashMap = ttVar.e;
        Bundle bundle = ttVar.g;
        HashMap hashMap2 = ttVar.f;
        p2 p2Var = this.h;
        hashMap.put(str, new t2(p2Var, this.i));
        if (hashMap2.containsKey(str)) {
            Object obj = hashMap2.get(str);
            hashMap2.remove(str);
            p2Var.a(obj);
        }
        o2 o2Var = (o2) bundle.getParcelable(str);
        if (o2Var != null) {
            bundle.remove(str);
            p2Var.a(new o2(o2Var.h, o2Var.g));
        }
    }
}
