package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class ao0 implements vl0 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater h = AtomicIntegerFieldUpdater.newUpdater(ao0.class, "_isCompleting$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(ao0.class, Object.class, "_rootCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater j;
    public static final /* synthetic */ long k;
    public static final /* synthetic */ long l;
    public volatile /* synthetic */ Object _exceptionsHolder$volatile;
    public volatile /* synthetic */ int _isCompleting$volatile = 0;
    public volatile /* synthetic */ Object _rootCause$volatile;
    public final x21 g;

    static {
        Unsafe unsafe = lj1.f595a;
        l = unsafe.objectFieldOffset(ao0.class.getDeclaredField("_rootCause$volatile"));
        j = AtomicReferenceFieldUpdater.newUpdater(ao0.class, Object.class, "_exceptionsHolder$volatile");
        k = unsafe.objectFieldOffset(ao0.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public ao0(x21 x21Var, Throwable th) {
        this.g = x21Var;
        this._rootCause$volatile = th;
    }

    @Override // defpackage.vl0
    public final boolean a() {
        return e() == null;
    }

    public final void b(Throwable th) {
        Throwable e = e();
        if (e == null) {
            i(th);
            return;
        }
        if (th == e) {
            return;
        }
        Object c = c();
        if (c == null) {
            h(th);
            return;
        }
        if (!(c instanceof Throwable)) {
            if (c instanceof ArrayList) {
                ((ArrayList) c).add(th);
                return;
            } else {
                rw.m("State is ", c);
                return;
            }
        }
        if (th == c) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(c);
        arrayList.add(th);
        h(arrayList);
    }

    public final Object c() {
        j.getClass();
        return lj1.f595a.getObjectVolatile(this, k);
    }

    @Override // defpackage.vl0
    public final x21 d() {
        return this.g;
    }

    public final Throwable e() {
        i.getClass();
        return (Throwable) lj1.f595a.getObjectVolatile(this, l);
    }

    public final boolean f() {
        return e() != null;
    }

    public final ArrayList g(Throwable th) {
        ArrayList arrayList;
        Object c = c();
        if (c == null) {
            arrayList = new ArrayList(4);
        } else if (c instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(c);
            arrayList = arrayList2;
        } else {
            if (!(c instanceof ArrayList)) {
                rw.m("State is ", c);
                return null;
            }
            arrayList = (ArrayList) c;
        }
        Throwable e = e();
        if (e != null) {
            arrayList.add(0, e);
        }
        if (th != null && !th.equals(e)) {
            arrayList.add(th);
        }
        h(co0.e);
        return arrayList;
    }

    public final void h(Object obj) {
        j.getClass();
        lj1.f595a.putObjectVolatile(this, k, obj);
    }

    public final void i(Throwable th) {
        i.getClass();
        lj1.f595a.putObjectVolatile(this, l, th);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(f());
        sb.append(", completing=");
        sb.append(h.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(e());
        sb.append(", exceptions=");
        sb.append(c());
        sb.append(", list=");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}
