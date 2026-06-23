package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final /* synthetic */ class at implements lf0 {
    public final /* synthetic */ ct g;
    public final /* synthetic */ int h;
    public final /* synthetic */ ns0[] i;

    public /* synthetic */ at(ct ctVar, int i, ns0[] ns0VarArr) {
        this.g = ctVar;
        this.h = i;
        this.i = ns0VarArr;
    }

    @Override // defpackage.lf0
    public final Object j(Object obj) {
        ib1 ib1Var = (ib1) obj;
        ct ctVar = this.g;
        ArrayList arrayList = ctVar.o;
        ub ubVar = ctVar.n;
        int i = this.h;
        boolean booleanValue = ((Boolean) arrayList.get(i)).booleanValue();
        ib1 ib1Var2 = ib1.g;
        if (booleanValue != (ib1Var == ib1Var2)) {
            arrayList.set(i, Boolean.valueOf(ib1Var == ib1Var2));
            ctVar.k(ubVar.j(arrayList));
        }
        if (i == this.i.length - 1) {
            Boolean bool = (Boolean) ubVar.j(arrayList);
            if (!bool.booleanValue()) {
                ctVar.k(bool);
            }
        }
        return e42.f219a;
    }
}
