package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ct extends ew0 {
    public final ub n;
    public final ArrayList o;

    public ct(ns0[] ns0VarArr, ub ubVar) {
        super(0);
        this.n = ubVar;
        int length = ns0VarArr.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(Boolean.FALSE);
        }
        this.o = arrayList;
        int length2 = ns0VarArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            l(ns0VarArr[i2], new bt(new at(this, i2, ns0VarArr), 0));
        }
    }
}
