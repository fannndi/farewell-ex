package defpackage;

/* loaded from: classes.dex */
public final class kg1 {

    /* renamed from: a, reason: collision with root package name */
    public yf f534a;
    public cb1 b;
    public String d;
    public ai0 e;
    public gp1 h;
    public lg1 i;
    public lg1 j;
    public lg1 k;
    public long l;
    public long m;
    public oj n;
    public int c = -1;
    public ng1 g = ng1.g;
    public r02 o = r02.e;
    public ti0 f = new ti0();

    public static void b(String str, lg1 lg1Var) {
        if (lg1Var != null) {
            if (lg1Var.o != null) {
                c.d(str.concat(".networkResponse != null"));
            } else if (lg1Var.p != null) {
                c.d(str.concat(".cacheResponse != null"));
            } else {
                if (lg1Var.q == null) {
                    return;
                }
                c.d(str.concat(".priorResponse != null"));
            }
        }
    }

    public final lg1 a() {
        int i = this.c;
        if (i < 0) {
            jw0.m(this.c, "code < 0: ");
            return null;
        }
        yf yfVar = this.f534a;
        if (yfVar == null) {
            c.n("request == null");
            return null;
        }
        cb1 cb1Var = this.b;
        if (cb1Var == null) {
            c.n("protocol == null");
            return null;
        }
        String str = this.d;
        if (str != null) {
            return new lg1(yfVar, cb1Var, str, i, this.e, this.f.a(), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
        }
        c.n("message == null");
        return null;
    }
}
