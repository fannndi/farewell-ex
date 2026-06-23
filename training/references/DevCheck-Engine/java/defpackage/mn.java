package defpackage;

/* loaded from: classes.dex */
public final class mn {

    /* renamed from: a, reason: collision with root package name */
    public Object f645a;
    public pn b;
    public dg1 c;
    public boolean d;

    public final void a(Object obj) {
        this.d = true;
        pn pnVar = this.b;
        if (pnVar != null) {
            on onVar = pnVar.h;
            onVar.getClass();
            if (obj == null) {
                obj = f0.m;
            }
            if (f0.l.c(onVar, null, obj)) {
                f0.d(onVar);
                this.f645a = null;
                this.b = null;
                this.c = null;
            }
        }
    }

    public final void b(Throwable th) {
        this.d = true;
        pn pnVar = this.b;
        if (pnVar == null || !pnVar.h.j(th)) {
            return;
        }
        this.f645a = null;
        this.b = null;
        this.c = null;
    }

    public final void finalize() {
        dg1 dg1Var;
        pn pnVar = this.b;
        if (pnVar != null) {
            on onVar = pnVar.h;
            if (!onVar.isDone()) {
                onVar.j(new z(1, "The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f645a));
            }
        }
        if (this.d || (dg1Var = this.c) == null) {
            return;
        }
        dg1Var.k(null);
    }
}
