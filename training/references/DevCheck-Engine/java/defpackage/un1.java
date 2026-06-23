package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class un1 extends FilterInputStream {
    public un1(InputStream inputStream) {
        super(inputStream);
    }

    public final void a() {
        ((FilterInputStream) this).in.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
