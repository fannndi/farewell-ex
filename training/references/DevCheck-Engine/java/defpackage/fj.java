package defpackage;

import android.content.Context;
import android.view.View;
import flar2.devcheck.benchmarkSuite.history.BenchmarkHistoryDb;
import flar2.devcheck.hwData.DeviceInfo;
import java.util.Deque;

/* loaded from: classes.dex */
public final /* synthetic */ class fj implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    public /* synthetic */ fj(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.g = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
        this.k = obj4;
        this.l = obj5;
        this.m = obj6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        boolean z = true;
        Object obj = this.m;
        Object obj2 = this.l;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        Object obj6 = this.h;
        switch (i) {
            case 0:
                fh fhVar = (fh) obj6;
                String str = (String) obj4;
                Context context = (Context) obj3;
                Deque deque = (Deque) obj2;
                DeviceInfo deviceInfo = (DeviceInfo) obj;
                long j = ((li) obj5).f590a;
                zg x = ((BenchmarkHistoryDb) fhVar.i).x();
                dh1 dh1Var = (dh1) x.g;
                dh1Var.b();
                h8 h8Var = (h8) x.l;
                ze0 a2 = h8Var.a();
                if (str == null) {
                    a2.b(1);
                } else {
                    a2.k(1, str);
                }
                a2.d(2, j);
                try {
                    dh1Var.c();
                    try {
                        a2.e();
                        dh1Var.v();
                        h8Var.c(a2);
                        xc1.L(context, fhVar, deque, deviceInfo);
                        return;
                    } finally {
                        dh1Var.r();
                    }
                } catch (Throwable th) {
                    h8Var.c(a2);
                    throw th;
                }
            default:
                boolean[] zArr = (boolean[]) obj5;
                View view = (View) obj4;
                View view2 = (View) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                View view3 = (View) obj;
                int i2 = 0;
                if (!((boolean[]) obj6)[0] && !zArr[0]) {
                    z = false;
                }
                view.setVisibility(z ? 0 : 8);
                view2.setVisibility(zArr2[0] ? 0 : 8);
                if (!z && !zArr2[0]) {
                    i2 = 8;
                }
                view3.setVisibility(i2);
                return;
        }
    }
}
