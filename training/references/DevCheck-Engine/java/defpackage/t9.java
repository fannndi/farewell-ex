package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class t9 extends c22 {
    public static final s9 c = new s9();

    /* renamed from: a, reason: collision with root package name */
    public final Class f972a;
    public final nn0 b;

    public t9(nh0 nh0Var, c22 c22Var, Class cls) {
        this.b = new nn0(nh0Var, c22Var, cls, 2);
        this.f972a = cls;
    }

    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        if (ro0Var.Q() == 9) {
            ro0Var.M();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ro0Var.a();
        while (ro0Var.D()) {
            arrayList.add(this.b.c.b(ro0Var));
        }
        ro0Var.m();
        int size = arrayList.size();
        Class cls = this.f972a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object newInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        if (obj == null) {
            to0Var.D();
            return;
        }
        to0Var.e();
        int length = Array.getLength(obj);
        for (int i = 0; i < length; i++) {
            this.b.c(to0Var, Array.get(obj, i));
        }
        to0Var.m();
    }
}
