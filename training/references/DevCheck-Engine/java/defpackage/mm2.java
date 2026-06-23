package defpackage;

/* loaded from: classes.dex */
public final class mm2 implements rm2 {

    /* renamed from: a, reason: collision with root package name */
    public final dl2 f644a;
    public final x42 b;

    public mm2(x42 x42Var, dl2 dl2Var) {
        m52 m52Var = pl2.f796a;
        this.b = x42Var;
        this.f644a = dl2Var;
    }

    @Override // defpackage.rm2
    public final void a(Object obj) {
        this.b.getClass();
        zm2 zm2Var = ((vl2) obj).zzc;
        if (zm2Var.e) {
            zm2Var.e = false;
        }
        m52 m52Var = pl2.f796a;
        throw d51.k(obj);
    }

    @Override // defpackage.rm2
    public final void b(Object obj, Object obj2) {
        sm2.o(obj, obj2);
    }

    @Override // defpackage.rm2
    public final vl2 c() {
        dl2 dl2Var = this.f644a;
        if (dl2Var instanceof vl2) {
            return (vl2) ((vl2) dl2Var).d(4);
        }
        ul2 ul2Var = (ul2) ((vl2) dl2Var).d(5);
        boolean c = ul2Var.h.c();
        vl2 vl2Var = ul2Var.h;
        if (!c) {
            return vl2Var;
        }
        vl2Var.getClass();
        om2.c.a(vl2Var.getClass()).a(vl2Var);
        vl2Var.j();
        return ul2Var.h;
    }

    @Override // defpackage.rm2
    public final boolean d(vl2 vl2Var, vl2 vl2Var2) {
        return vl2Var.zzc.equals(vl2Var2.zzc);
    }

    @Override // defpackage.rm2
    public final void e(Object obj, byte[] bArr, int i, int i2, gl2 gl2Var) {
        vl2 vl2Var = (vl2) obj;
        if (vl2Var.zzc == zm2.f) {
            vl2Var.zzc = zm2.b();
        }
        throw d51.k(obj);
    }

    @Override // defpackage.rm2
    public final int f(dl2 dl2Var) {
        zm2 zm2Var = ((vl2) dl2Var).zzc;
        int i = zm2Var.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < zm2Var.f1282a; i3++) {
            int i4 = zm2Var.b[i3] >>> 3;
            ll2 ll2Var = (ll2) zm2Var.c[i3];
            int q = ml2.q(8);
            int q2 = ml2.q(i4) + ml2.q(16);
            int q3 = ml2.q(24);
            int d = ll2Var.d();
            i2 += q + q + q2 + iy1.c(d, d, q3);
        }
        zm2Var.d = i2;
        return i2;
    }

    @Override // defpackage.rm2
    public final int g(vl2 vl2Var) {
        return vl2Var.zzc.hashCode();
    }

    @Override // defpackage.rm2
    public final void h(Object obj, my1 my1Var) {
        throw d51.k(obj);
    }

    @Override // defpackage.rm2
    public final boolean i(Object obj) {
        throw d51.k(obj);
    }
}
