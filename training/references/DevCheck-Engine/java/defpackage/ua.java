package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ua implements m31 {

    /* renamed from: a, reason: collision with root package name */
    public static final ua f1028a = new ua();
    public static final kb0 b;
    public static final kb0 c;

    static {
        ba baVar = new ba(1);
        HashMap hashMap = new HashMap();
        hashMap.put(za1.class, baVar);
        b = new kb0("startMs", Collections.unmodifiableMap(new HashMap(hashMap)));
        ba baVar2 = new ba(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(za1.class, baVar2);
        c = new kb0("endMs", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // defpackage.t80
    public final void a(Object obj, Object obj2) {
        zy1 zy1Var = (zy1) obj;
        n31 n31Var = (n31) obj2;
        n31Var.d(b, zy1Var.f1294a);
        n31Var.d(c, zy1Var.b);
    }
}
