package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class f extends CancellationException {
    public final transient dw g;

    public f(dw dwVar) {
        super("Flow was aborted, no more elements needed");
        this.g = dwVar;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
