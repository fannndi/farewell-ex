package defpackage;

import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class ca0 {
    public static final ai1 c = new ai1();
    public static final LinkedHashMap d = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f115a;
    public final xi0 b;

    public ca0(String str, boolean z) {
        ReentrantLock reentrantLock;
        xi0 xi0Var;
        synchronized (c) {
            try {
                LinkedHashMap linkedHashMap = d;
                Object obj = linkedHashMap.get(str);
                if (obj == null) {
                    obj = new ReentrantLock();
                    linkedHashMap.put(str, obj);
                }
                reentrantLock = (ReentrantLock) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f115a = reentrantLock;
        if (z) {
            xi0Var = new xi0();
            xi0Var.g = str.concat(".lck");
        } else {
            xi0Var = null;
        }
        this.b = xi0Var;
    }
}
