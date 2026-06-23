package defpackage;

import java.net.Proxy;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class ki1 {

    /* renamed from: a, reason: collision with root package name */
    public final x2 f537a;
    public final h70 b;
    public final dd1 c;
    public final boolean d;
    public final List e;
    public int f;
    public List g;
    public final ArrayList h;

    public ki1(x2 x2Var, h70 h70Var, dd1 dd1Var, boolean z) {
        List j;
        h70Var.getClass();
        this.f537a = x2Var;
        this.b = h70Var;
        this.c = dd1Var;
        this.d = z;
        p80 p80Var = p80.g;
        this.e = p80Var;
        this.g = p80Var;
        this.h = new ArrayList();
        ok0 ok0Var = x2Var.h;
        dd1Var.j.getClass();
        ok0Var.getClass();
        URI h = ok0Var.h();
        if (h.getHost() == null) {
            j = rd2.j(new Proxy[]{Proxy.NO_PROXY});
        } else {
            List<Proxy> select = x2Var.g.select(h);
            j = (select == null || select.isEmpty()) ? rd2.j(new Proxy[]{Proxy.NO_PROXY}) : rd2.i(select);
        }
        this.e = j;
        this.f = 0;
        m90 m90Var = dd1Var.j;
        List list = this.e;
        m90Var.getClass();
        list.getClass();
    }

    public final boolean a() {
        return this.f < this.e.size() || !this.h.isEmpty();
    }
}
