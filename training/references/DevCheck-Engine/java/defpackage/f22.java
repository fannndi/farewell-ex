package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* loaded from: classes.dex */
public class f22 extends c22 {
    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        ArrayList arrayList = new ArrayList();
        ro0Var.a();
        while (ro0Var.D()) {
            try {
                arrayList.add(Integer.valueOf(ro0Var.I()));
            } catch (NumberFormatException e) {
                throw new no0(e);
            }
        }
        ro0Var.m();
        int size = arrayList.size();
        AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
        for (int i = 0; i < size; i++) {
            atomicIntegerArray.set(i, ((Integer) arrayList.get(i)).intValue());
        }
        return atomicIntegerArray;
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        to0Var.e();
        int length = ((AtomicIntegerArray) obj).length();
        for (int i = 0; i < length; i++) {
            to0Var.I(r5.get(i));
        }
        to0Var.m();
    }
}
