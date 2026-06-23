package defpackage;

import flar2.devcheck.permissionsSummary.xEua.bPnJ;

/* loaded from: classes.dex */
public final class s2 extends om0 {
    public final /* synthetic */ int l;
    public final /* synthetic */ String m;
    public final /* synthetic */ tt n;
    public final /* synthetic */ d10 o;

    public /* synthetic */ s2(tt ttVar, String str, d10 d10Var, int i) {
        this.l = i;
        this.n = ttVar;
        this.m = str;
        this.o = d10Var;
    }

    public final void T(Object obj) {
        int i = this.l;
        String str = bPnJ.etcXTkBYg;
        String str2 = this.m;
        tt ttVar = this.n;
        d10 d10Var = this.o;
        switch (i) {
            case 0:
                q2 q2Var = (q2) d10Var;
                Integer num = (Integer) ttVar.b.get(str2);
                if (num == null) {
                    rw.i(str, q2Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                ttVar.d.add(str2);
                try {
                    ttVar.b(num.intValue(), q2Var, obj);
                    return;
                } catch (Exception e) {
                    ttVar.d.remove(str2);
                    throw e;
                }
            default:
                Integer num2 = (Integer) ttVar.b.get(str2);
                if (num2 == null) {
                    rw.i(str, d10Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                ttVar.d.add(str2);
                try {
                    ttVar.b(num2.intValue(), d10Var, obj);
                    return;
                } catch (Exception e2) {
                    ttVar.d.remove(str2);
                    throw e2;
                }
        }
    }
}
