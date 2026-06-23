package defpackage;

import java.io.Closeable;
import java.io.Flushable;

/* loaded from: classes.dex */
public interface ap1 extends Closeable, Flushable {
    bz1 c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    @Override // java.io.Flushable
    void flush();

    void q(long j, wl wlVar);
}
