package defpackage;

/* loaded from: classes.dex */
public abstract class ms0 {
    public final v31 g;
    public boolean h;
    public int i = -1;
    public final /* synthetic */ ns0 j;

    public ms0(ns0 ns0Var, v31 v31Var) {
        this.j = ns0Var;
        this.g = v31Var;
    }

    public final void b(boolean z) {
        if (z == this.h) {
            return;
        }
        this.h = z;
        int i = z ? 1 : -1;
        ns0 ns0Var = this.j;
        int i2 = ns0Var.c;
        ns0Var.c = i + i2;
        if (!ns0Var.d) {
            ns0Var.d = true;
            while (true) {
                try {
                    int i3 = ns0Var.c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        ns0Var.g();
                    } else if (z3) {
                        ns0Var.h();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    ns0Var.d = false;
                    throw th;
                }
            }
            ns0Var.d = false;
        }
        if (this.h) {
            ns0Var.c(this);
        }
    }

    public void c() {
    }

    public boolean d(eq0 eq0Var) {
        return false;
    }

    public abstract boolean f();
}
