package defpackage;

import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final /* synthetic */ class dn0 extends yf0 implements lf0 {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dn0(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.n = i4;
    }

    @Override // defpackage.lf0
    public final Object j(Object obj) {
        int i = this.n;
        e42 e42Var = e42.f219a;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                Set set = (Set) obj;
                set.getClass();
                en0 en0Var = (en0) obj2;
                ReentrantLock reentrantLock = en0Var.d;
                reentrantLock.lock();
                try {
                    List<w31> g0 = yr.g0(en0Var.c.values());
                    reentrantLock.unlock();
                    for (w31 w31Var : g0) {
                        w31Var.getClass();
                        int[] iArr = w31Var.b;
                        int length = iArr.length;
                        Set set2 = r80.g;
                        if (length != 0) {
                            int i2 = 0;
                            if (length != 1) {
                                xm1 xm1Var = new xm1();
                                int length2 = iArr.length;
                                int i3 = 0;
                                while (i2 < length2) {
                                    int i4 = i3 + 1;
                                    if (set.contains(Integer.valueOf(iArr[i2]))) {
                                        xm1Var.add(w31Var.c[i3]);
                                    }
                                    i2++;
                                    i3 = i4;
                                }
                                set2 = xc1.d(xm1Var);
                            } else if (set.contains(Integer.valueOf(iArr[0]))) {
                                set2 = w31Var.d;
                            }
                        }
                        if (!set2.isEmpty()) {
                            w31Var.f1109a.a(set2);
                        }
                    }
                    return e42Var;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            default:
                ((vn0) obj2).s((Throwable) obj);
                return e42Var;
        }
    }
}
