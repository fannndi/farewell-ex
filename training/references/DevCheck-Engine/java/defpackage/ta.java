package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ta implements m31 {

    /* renamed from: a, reason: collision with root package name */
    public static final ta f975a = new ta();
    public static final kb0 b;
    public static final kb0 c;

    static {
        ba baVar = new ba(1);
        HashMap hashMap = new HashMap();
        hashMap.put(za1.class, baVar);
        b = new kb0("currentCacheSizeBytes", Collections.unmodifiableMap(new HashMap(hashMap)));
        ba baVar2 = new ba(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(za1.class, baVar2);
        c = new kb0("maxCacheSizeBytes", Collections.unmodifiableMap(new HashMap(hashMap2)));
    }

    @Override // defpackage.t80
    public final void a(Object obj, Object obj2) {
        kr1 kr1Var = (kr1) obj;
        n31 n31Var = (n31) obj2;
        n31Var.d(b, kr1Var.f547a);
        n31Var.d(c, kr1Var.b);
    }
}
