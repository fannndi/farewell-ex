package defpackage;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class lg1 implements Closeable {
    public final yf g;
    public final cb1 h;
    public final String i;
    public final int j;
    public final ai0 k;
    public final ui0 l;
    public final ng1 m;
    public final gp1 n;
    public final lg1 o;
    public final lg1 p;
    public final lg1 q;
    public final long r;
    public final long s;
    public final oj t;
    public final r02 u;
    public final boolean v;

    public lg1(yf yfVar, cb1 cb1Var, String str, int i, ai0 ai0Var, ui0 ui0Var, ng1 ng1Var, gp1 gp1Var, lg1 lg1Var, lg1 lg1Var2, lg1 lg1Var3, long j, long j2, oj ojVar, r02 r02Var) {
        yfVar.getClass();
        cb1Var.getClass();
        str.getClass();
        ng1Var.getClass();
        r02Var.getClass();
        this.g = yfVar;
        this.h = cb1Var;
        this.i = str;
        this.j = i;
        this.k = ai0Var;
        this.l = ui0Var;
        this.m = ng1Var;
        this.n = gp1Var;
        this.o = lg1Var;
        this.p = lg1Var2;
        this.q = lg1Var3;
        this.r = j;
        this.s = j2;
        this.t = ojVar;
        this.u = r02Var;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.v = z;
    }

    public final kg1 a() {
        kg1 kg1Var = new kg1();
        kg1Var.c = -1;
        kg1Var.g = ng1.g;
        kg1Var.o = r02.e;
        kg1Var.f534a = this.g;
        kg1Var.b = this.h;
        kg1Var.c = this.j;
        kg1Var.d = this.i;
        kg1Var.e = this.k;
        kg1Var.f = this.l.d();
        kg1Var.g = this.m;
        kg1Var.h = this.n;
        kg1Var.i = this.o;
        kg1Var.j = this.p;
        kg1Var.k = this.q;
        kg1Var.l = this.r;
        kg1Var.m = this.s;
        kg1Var.n = this.t;
        kg1Var.o = this.u;
        return kg1Var;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.h + ", code=" + this.j + ", message=" + this.i + ", url=" + ((ok0) this.g.b) + '}';
    }
}
