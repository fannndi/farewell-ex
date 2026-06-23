package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class us0 extends in implements af0, vo0 {
    public final boolean m;

    public us0(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.m = false;
    }

    @Override // defpackage.af0
    public final Object a() {
        return this.h.getClass().getSimpleName();
    }

    @Override // defpackage.in
    public final uo0 c() {
        af1.f25a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof us0) {
            us0 us0Var = (us0) obj;
            return d().equals(us0Var.d()) && this.j.equals(us0Var.j) && this.k.equals(us0Var.k) && ym0.b(this.h, us0Var.h);
        }
        if (obj instanceof vo0) {
            return obj.equals(g());
        }
        return false;
    }

    public final uo0 g() {
        if (this.m) {
            return this;
        }
        uo0 uo0Var = this.g;
        if (uo0Var != null) {
            return uo0Var;
        }
        c();
        this.g = this;
        return this;
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + (d().hashCode() * 31)) * 31);
    }

    public final String toString() {
        uo0 g = g();
        return g != this ? g.toString() : d51.u(new StringBuilder("property "), this.j, " (Kotlin reflection is not available)");
    }
}
