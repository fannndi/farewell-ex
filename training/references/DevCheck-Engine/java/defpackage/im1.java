package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class im1 extends jm1 {
    public static String D(gm1 gm1Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : gm1Var) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            om0.a(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static List E(gm1 gm1Var) {
        Iterator it = gm1Var.iterator();
        if (!it.hasNext()) {
            return p80.g;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return tl2.z(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
