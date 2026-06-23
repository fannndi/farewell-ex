package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class fj2 implements Serializable {
    public static final fj2 i = new fj2(ei2.i, ei2.h);
    public final ei2 g;
    public final ei2 h;

    public fj2(ei2 ei2Var, ei2 ei2Var2) {
        this.g = ei2Var;
        this.h = ei2Var2;
        if (ei2Var.a(ei2Var2) > 0 || ei2Var == ei2.h || ei2Var2 == ei2.i) {
            StringBuilder sb = new StringBuilder(16);
            ei2Var.b(sb);
            sb.append("..");
            ei2Var2.c(sb);
            c.m("Invalid range: ".concat(sb.toString()));
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fj2)) {
            return false;
        }
        fj2 fj2Var = (fj2) obj;
        return this.g.equals(fj2Var.g) && this.h.equals(fj2Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + (this.g.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.g.b(sb);
        sb.append("..");
        this.h.c(sb);
        return sb.toString();
    }
}
