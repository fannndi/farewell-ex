package defpackage;

import sun.misc.Unsafe;

/* loaded from: classes.dex */
public abstract /* synthetic */ class ek2 {
    public static /* synthetic */ boolean a(Unsafe unsafe, zj2 zj2Var, long j, Object obj, Object obj2) {
        while (!dk2.a(unsafe, zj2Var, j, obj, obj2)) {
            if (unsafe.getObject(zj2Var, j) != obj) {
                return false;
            }
        }
        return true;
    }
}
