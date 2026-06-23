package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class sn0 extends CancellationException {
    public final transient bo0 g;

    public sn0(String str, Throwable th, bo0 bo0Var) {
        super(str);
        this.g = bo0Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof sn0)) {
            return false;
        }
        sn0 sn0Var = (sn0) obj;
        return ym0.b(sn0Var.getMessage(), getMessage()) && ym0.b(sn0Var.g, this.g) && ym0.b(sn0Var.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        message.getClass();
        int hashCode = (this.g.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.g;
    }
}
