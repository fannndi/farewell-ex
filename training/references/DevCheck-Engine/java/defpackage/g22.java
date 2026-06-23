package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class g22 extends c22 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f314a;
    public final /* synthetic */ c22 b;

    public /* synthetic */ g22(c22 c22Var, int i) {
        this.f314a = i;
        this.b = c22Var;
    }

    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        int i = this.f314a;
        c22 c22Var = this.b;
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                ro0Var.a();
                while (ro0Var.D()) {
                    arrayList.add(Long.valueOf(((Number) c22Var.b(ro0Var)).longValue()));
                }
                ro0Var.m();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            default:
                return new AtomicLong(((Number) c22Var.b(ro0Var)).longValue());
        }
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        int i = this.f314a;
        c22 c22Var = this.b;
        switch (i) {
            case 0:
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                to0Var.e();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    c22Var.c(to0Var, Long.valueOf(atomicLongArray.get(i2)));
                }
                to0Var.m();
                break;
            default:
                c22Var.c(to0Var, Long.valueOf(((AtomicLong) obj).get()));
                break;
        }
    }
}
