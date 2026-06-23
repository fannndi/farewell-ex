package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class m52 implements fe2 {
    public static m52 g;

    public m52() {
        List list = Collections.EMPTY_LIST;
    }

    public static final hm2 a(Object obj, Object obj2) {
        hm2 hm2Var = (hm2) obj;
        hm2 hm2Var2 = (hm2) obj2;
        if (!hm2Var2.isEmpty()) {
            if (!hm2Var.g) {
                if (hm2Var.isEmpty()) {
                    hm2Var = new hm2();
                } else {
                    hm2 hm2Var3 = new hm2(hm2Var);
                    hm2Var3.g = true;
                    hm2Var = hm2Var3;
                }
            }
            hm2Var.b();
            if (!hm2Var2.isEmpty()) {
                hm2Var.putAll(hm2Var2);
            }
        }
        return hm2Var;
    }

    @Override // defpackage.ge2
    public Object b() {
        return new x42();
    }
}
