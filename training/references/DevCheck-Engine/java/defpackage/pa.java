package defpackage;

import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class pa implements m31 {

    /* renamed from: a, reason: collision with root package name */
    public static final pa f779a = new pa();
    public static final kb0 b;

    static {
        ba baVar = new ba(1);
        HashMap hashMap = new HashMap();
        hashMap.put(za1.class, baVar);
        b = new kb0("storageMetrics", Collections.unmodifiableMap(new HashMap(hashMap)));
    }

    @Override // defpackage.t80
    public final void a(Object obj, Object obj2) {
        ((n31) obj2).a(b, ((fg0) obj).f279a);
    }
}
