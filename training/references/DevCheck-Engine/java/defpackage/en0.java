package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class en0 {

    /* renamed from: a, reason: collision with root package name */
    public final dh1 f239a;
    public final v12 b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final re0 e;
    public final re0 f;
    public final xi0 g;
    public final Object h;

    public en0(dh1 dh1Var, HashMap hashMap, HashMap hashMap2, String... strArr) {
        this.f239a = dh1Var;
        v12 v12Var = new v12(dh1Var, hashMap, hashMap2, strArr, dh1Var.k, new dn0(1, this, en0.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0, 0, 0));
        this.b = v12Var;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new re0(2, this);
        this.f = new re0(3, this);
        xi0 xi0Var = new xi0();
        xi0Var.g = dh1Var;
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        newSetFromMap.getClass();
        xi0Var.h = newSetFromMap;
        this.g = xi0Var;
        this.h = new Object();
        v12Var.k = new qt(5, this);
    }

    public final Object a(nt1 nt1Var) {
        Object f;
        dh1 dh1Var = this.f239a;
        return ((!dh1Var.p() || dh1Var.t()) && (f = this.b.f(nt1Var)) == zx.g) ? f : e42.f219a;
    }
}
