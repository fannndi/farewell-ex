package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class mt {

    /* renamed from: a, reason: collision with root package name */
    public final Object f653a;
    public final vn b;
    public final qf0 c;
    public final Object d;
    public final Throwable e;

    public mt(Object obj, vn vnVar, qf0 qf0Var, Object obj2, Throwable th) {
        this.f653a = obj;
        this.b = vnVar;
        this.c = qf0Var;
        this.d = obj2;
        this.e = th;
    }

    public /* synthetic */ mt(Object obj, vn vnVar, qf0 qf0Var, CancellationException cancellationException, int i) {
        this(obj, (i & 2) != 0 ? null : vnVar, (i & 4) != 0 ? null : qf0Var, (Object) null, (i & 16) != 0 ? null : cancellationException);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static mt a(mt mtVar, vn vnVar, CancellationException cancellationException, int i) {
        Object obj = mtVar.f653a;
        if ((i & 2) != 0) {
            vnVar = mtVar.b;
        }
        vn vnVar2 = vnVar;
        qf0 qf0Var = mtVar.c;
        Object obj2 = mtVar.d;
        CancellationException cancellationException2 = cancellationException;
        if ((i & 16) != 0) {
            cancellationException2 = mtVar.e;
        }
        return new mt(obj, vnVar2, qf0Var, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mt)) {
            return false;
        }
        mt mtVar = (mt) obj;
        return ym0.b(this.f653a, mtVar.f653a) && ym0.b(this.b, mtVar.b) && ym0.b(this.c, mtVar.c) && ym0.b(this.d, mtVar.d) && ym0.b(this.e, mtVar.e);
    }

    public final int hashCode() {
        Object obj = this.f653a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        vn vnVar = this.b;
        int hashCode2 = (hashCode + (vnVar == null ? 0 : vnVar.hashCode())) * 31;
        qf0 qf0Var = this.c;
        int hashCode3 = (hashCode2 + (qf0Var == null ? 0 : qf0Var.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f653a + ", cancelHandler=" + this.b + ", onCancellation=" + this.c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }
}
