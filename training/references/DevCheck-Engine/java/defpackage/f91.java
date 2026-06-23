package defpackage;

import android.util.SparseArray;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class f91 {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f271a = new SparseArray();
    public static final HashMap b;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        hashMap.put(d91.g, 0);
        hashMap.put(d91.h, 1);
        hashMap.put(d91.i, 2);
        for (d91 d91Var : hashMap.keySet()) {
            f271a.append(((Integer) b.get(d91Var)).intValue(), d91Var);
        }
    }

    public static int a(d91 d91Var) {
        Integer num = (Integer) b.get(d91Var);
        if (num != null) {
            return num.intValue();
        }
        rw.n("PriorityMapping is missing known Priority value ", d91Var);
        return 0;
    }

    public static d91 b(int i) {
        d91 d91Var = (d91) f271a.get(i);
        if (d91Var != null) {
            return d91Var;
        }
        c.m(d51.q("Unknown Priority for value ", i));
        return null;
    }
}
