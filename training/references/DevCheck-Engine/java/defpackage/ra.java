package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ra implements m31 {

    /* renamed from: a, reason: collision with root package name */
    public static final ra f879a = new ra();
    public static final kb0 b;
    public static final kb0 c;

    static {
        ba baVar = new ba(1);
        HashMap hashMap = new HashMap();
        hashMap.put(za1.class, baVar);
        b = new kb0("logSource", Collections.unmodifiableMap(new HashMap(hashMap)));
        ba baVar2 = new ba(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(za1.class, baVar2);
        c = new kb0("logEventDropped", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // defpackage.t80
    public final void a(Object obj, Object obj2) {
        dt0 dt0Var = (dt0) obj;
        n31 n31Var = (n31) obj2;
        n31Var.a(b, dt0Var.f207a);
        n31Var.a(c, dt0Var.b);
    }
}
