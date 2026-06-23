package defpackage;

import android.os.Handler;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class og implements ph {
    public final int g;
    public final Object h;
    public final Object i;
    public final Object j;

    public /* synthetic */ og(int i, Object obj, Object obj2, Object obj3) {
        this.j = obj;
        this.g = i;
        this.h = obj2;
        this.i = obj3;
    }

    public og(List list) {
        this.g = ((ms) list.get(list.size() - 1)).c + 1;
        HashSet hashSet = new HashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            hashSet.add(Short.valueOf(((ms) it.next()).c));
        }
        this.i = new int[this.g];
        short s = 0;
        while (true) {
            int i = this.g;
            if (s >= i) {
                this.h = new ps((short) 514, (short) 16, (i * 4) + 16);
                this.j = new ry1(list, hashSet, i);
                return;
            } else {
                if (hashSet.contains(Short.valueOf(s))) {
                    ((int[]) this.i)[s] = 1073741824;
                }
                s = (short) (s + 1);
            }
        }
    }

    public void a(Throwable th) {
        boolean z = th instanceof TimeoutException;
        fi2 fi2Var = (fi2) this.j;
        if (z) {
            fi2Var.C(114, 28, li2.t);
            bk2.g("BillingClientTesting");
        } else {
            fi2Var.C(107, 28, li2.t);
            bk2.g("BillingClientTesting");
        }
        ((Runnable) this.i).run();
    }

    @Override // defpackage.ph
    public void l() {
        ((qg) this.j).e0.post(new l2(this, this.g));
    }

    @Override // defpackage.ph
    public void onResult(Object obj) {
        final qh qhVar = (qh) obj;
        Handler handler = ((qg) this.j).e0;
        final String[] strArr = (String[]) this.h;
        final String[] strArr2 = (String[]) this.i;
        final int i = this.g;
        handler.post(new Runnable() { // from class: ng
            @Override // java.lang.Runnable
            public final void run() {
                qg qgVar = (qg) og.this.j;
                String[] strArr3 = strArr;
                int i2 = i;
                qgVar.v0(i2, qhVar, strArr3[i2], strArr2[i2]);
            }
        });
    }
}
