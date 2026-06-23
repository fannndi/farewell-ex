package defpackage;

/* loaded from: classes.dex */
public final class vy1 implements px {
    public final ThreadLocal g;

    public vy1(ThreadLocal threadLocal) {
        this.g = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vy1) && ym0.b(this.g, ((vy1) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.g + ')';
    }
}
