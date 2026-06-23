package defpackage;

import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class sk2 extends TimeoutException {
    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
