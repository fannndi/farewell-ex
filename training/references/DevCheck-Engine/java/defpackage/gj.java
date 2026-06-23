package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class gj implements xm0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f341a;

    public /* synthetic */ gj(int i) {
        this.f341a = i;
    }

    @Override // defpackage.xm0
    public final lg1 a(hd1 hd1Var) {
        switch (this.f341a) {
            case 0:
                yf yfVar = hd1Var.e;
                ok0 ok0Var = (ok0) yfVar.b;
                xf1 xf1Var = (xf1) yfVar.e;
                if (!ok0Var.h.endsWith("/reportBenchmark/full") || xf1Var == null) {
                    return hd1Var.b(yfVar);
                }
                yh i = yfVar.i();
                i.a("Content-Encoding", "gzip");
                i.b((String) yfVar.c, new ij(xf1Var));
                return hd1Var.b(new yf(i));
            default:
                yf yfVar2 = hd1Var.e;
                ok0 ok0Var2 = (ok0) yfVar2.b;
                xf1 xf1Var2 = (xf1) yfVar2.e;
                String str = ok0Var2.h;
                if ((!str.endsWith("/reportHardware/full") && !str.endsWith("/reportHardware/full-unverified")) || xf1Var2 == null) {
                    return hd1Var.b(yfVar2);
                }
                yh i2 = yfVar2.i();
                i2.a("Content-Encoding", "gzip");
                i2.b((String) yfVar2.c, new v30(xf1Var2));
                return hd1Var.b(new yf(i2));
        }
    }
}
