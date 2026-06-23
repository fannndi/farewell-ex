package defpackage;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;
import com.google.android.material.bottomappbar.HaCM.rQcwh;
import flar2.devcheck.MainApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class n02 extends a4 {
    public final zf c;
    public final Handler d;
    public final qy0 e;
    public final ArrayList f;
    public String g;
    public boolean h;
    public boolean i;
    public bi j;
    public boolean k;
    public final LinkedHashMap l;
    public final qy0 m;
    public final qf1 n;
    public ic1 o;
    public final m02 p;
    public final xg1 q;
    public final m02 r;

    public n02(Application application) {
        super(application);
        this.c = new zf(3);
        this.d = new Handler(Looper.getMainLooper());
        this.e = new qy0(new l02(Collections.EMPTY_LIST, false, new bi(new bi()), null));
        this.f = new ArrayList();
        this.j = new bi(new bi());
        this.l = new LinkedHashMap();
        this.m = new qy0(Collections.EMPTY_SET);
        m02 m02Var = new m02(this, 0);
        this.p = m02Var;
        m02 m02Var2 = new m02(this, 1);
        this.r = m02Var2;
        qf1 qf1Var = (qf1) ((MainApp) application).g.k;
        this.n = qf1Var;
        xg1 F = fh.u(application).F(1);
        this.q = F;
        qf1Var.c.f(m02Var);
        F.f(m02Var2);
    }

    @Override // defpackage.i72
    public final void b() {
        this.n.c.j(this.p);
        this.q.j(this.r);
    }

    public final void d() {
        if (this.h || this.i) {
            return;
        }
        this.h = true;
        e();
        String str = this.g;
        bi biVar = this.j;
        this.c.y(50, str, biVar, new zf(this, biVar, 11, false));
    }

    public final void e() {
        ArrayList arrayList = this.f;
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(arrayList));
        boolean z = this.h;
        bi biVar = this.j;
        ic1 ic1Var = this.o;
        gc1 gc1Var = null;
        if (ic1Var != null && ic1Var.f423a > 0.0d) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    String e = i51.e("prefdevicename2");
                    String replace = (e == null || e.isEmpty()) ? "This device" : e.replace("\n", rQcwh.JjdnxbEpimumDE);
                    String e2 = i51.e("prefProcessor");
                    if (e2 == null) {
                        e2 = "";
                    }
                    gc1Var = new gc1(0, replace, e2, "__mine__", null, null, ic1Var.f423a, true, ic1Var.b);
                } else {
                    Object obj = arrayList.get(i);
                    i++;
                    if (((gc1) obj).h) {
                        break;
                    }
                }
            }
        }
        this.e.k(new l02(unmodifiableList, z, biVar, gc1Var));
    }

    public final void f(bi biVar) {
        if (this.j.a().equals(biVar.a())) {
            return;
        }
        this.j = biVar;
        this.g = null;
        this.i = false;
        this.h = false;
        this.f.clear();
        e();
        d();
    }
}
