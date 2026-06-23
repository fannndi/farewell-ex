package defpackage;

/* loaded from: classes.dex */
public abstract class o92 implements w20 {

    /* renamed from: a, reason: collision with root package name */
    public int f721a;
    public iw b;
    public ni1 c;
    public int d;
    public final q40 e = new q40(this);
    public int f = 0;
    public boolean g = false;
    public final c30 h = new c30(this);
    public final c30 i = new c30(this);
    public int j = 1;

    public o92(iw iwVar) {
        this.b = iwVar;
    }

    public static void b(c30 c30Var, c30 c30Var2, int i) {
        c30Var.l.add(c30Var2);
        c30Var.f = i;
        c30Var2.k.add(c30Var);
    }

    public static c30 h(ev evVar) {
        ev evVar2 = evVar.f;
        if (evVar2 == null) {
            return null;
        }
        iw iwVar = evVar2.d;
        int A = d51.A(evVar2.e);
        if (A == 1) {
            return iwVar.d.h;
        }
        if (A == 2) {
            return iwVar.e.h;
        }
        if (A == 3) {
            return iwVar.d.i;
        }
        if (A == 4) {
            return iwVar.e.i;
        }
        if (A != 5) {
            return null;
        }
        return iwVar.e.k;
    }

    public static c30 i(ev evVar, int i) {
        ev evVar2 = evVar.f;
        if (evVar2 == null) {
            return null;
        }
        iw iwVar = evVar2.d;
        o92 o92Var = i == 0 ? iwVar.d : iwVar.e;
        int A = d51.A(evVar2.e);
        if (A == 1 || A == 2) {
            return o92Var.h;
        }
        if (A == 3 || A == 4) {
            return o92Var.i;
        }
        return null;
    }

    public final void c(c30 c30Var, c30 c30Var2, int i, q40 q40Var) {
        c30Var.l.add(c30Var2);
        c30Var.l.add(this.e);
        c30Var.h = i;
        c30Var.i = q40Var;
        c30Var2.k.add(c30Var);
        q40Var.k.add(c30Var);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i2) {
        iw iwVar = this.b;
        if (i2 == 0) {
            int i3 = iwVar.v;
            int max = Math.max(iwVar.u, i);
            if (i3 > 0) {
                max = Math.min(i3, i);
            }
            if (max != i) {
                return max;
            }
        } else {
            int i4 = iwVar.y;
            int max2 = Math.max(iwVar.x, i);
            if (i4 > 0) {
                max2 = Math.min(i4, i);
            }
            if (max2 != i) {
                return max2;
            }
        }
        return i;
    }

    public long j() {
        if (this.e.j) {
            return r2.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r9.f721a == 3) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(defpackage.ev r12, defpackage.ev r13, int r14) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o92.l(ev, ev, int):void");
    }
}
