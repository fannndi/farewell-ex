package defpackage;

/* loaded from: classes.dex */
public final class po0 extends lo0 {
    public final ir0 g;

    public po0() {
        c4 c4Var = ir0.o;
        this.g = new ir0(false);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof po0) && ((po0) obj).g.equals(this.g);
        }
        return true;
    }

    public final int hashCode() {
        return this.g.hashCode();
    }
}
