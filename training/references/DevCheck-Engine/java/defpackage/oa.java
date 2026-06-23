package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class oa implements m31 {

    /* renamed from: a, reason: collision with root package name */
    public static final oa f722a = new oa();
    public static final kb0 b;
    public static final kb0 c;
    public static final kb0 d;
    public static final kb0 e;

    static {
        ba baVar = new ba(1);
        HashMap hashMap = new HashMap();
        hashMap.put(za1.class, baVar);
        b = new kb0("window", Collections.unmodifiableMap(new HashMap(hashMap)));
        ba baVar2 = new ba(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(za1.class, baVar2);
        c = new kb0("logSourceMetrics", Collections.unmodifiableMap(new HashMap(hashMap2)));
        ba baVar3 = new ba(3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(za1.class, baVar3);
        d = new kb0("globalMetrics", Collections.unmodifiableMap(new HashMap(hashMap3)));
        ba baVar4 = new ba(4);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(za1.class, baVar4);
        e = new kb0("appNamespace", Collections.unmodifiableMap(new HashMap(hashMap4)));
    }

    @Override // defpackage.t80
    public final void a(Object obj, Object obj2) {
        hr hrVar = (hr) obj;
        n31 n31Var = (n31) obj2;
        n31Var.a(b, hrVar.f396a);
        n31Var.a(c, hrVar.b);
        n31Var.a(d, hrVar.c);
        n31Var.a(e, hrVar.d);
    }
}
