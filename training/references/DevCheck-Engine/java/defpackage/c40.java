package defpackage;

/* loaded from: classes.dex */
public final class c40 extends RuntimeException {
    public final transient qx g;

    public c40(qx qxVar) {
        this.g = qxVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.g.toString();
    }
}
