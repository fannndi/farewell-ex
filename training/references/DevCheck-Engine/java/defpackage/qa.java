package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class qa implements m31 {

    /* renamed from: a, reason: collision with root package name */
    public static final qa f828a = new qa();
    public static final kb0 b;
    public static final kb0 c;

    static {
        ba baVar = new ba(1);
        HashMap hashMap = new HashMap();
        hashMap.put(za1.class, baVar);
        b = new kb0("eventsDroppedCount", Collections.unmodifiableMap(new HashMap(hashMap)));
        ba baVar2 = new ba(3);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(za1.class, baVar2);
        c = new kb0("reason", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // defpackage.t80
    public final void a(Object obj, Object obj2) {
        bt0 bt0Var = (bt0) obj;
        n31 n31Var = (n31) obj2;
        n31Var.d(b, bt0Var.f99a);
        n31Var.a(c, bt0Var.b);
    }
}
