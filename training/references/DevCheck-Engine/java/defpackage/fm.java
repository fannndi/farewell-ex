package defpackage;

import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public interface fm extends lp1, ReadableByteChannel {
    String B(Charset charset);

    km i(long j);

    byte readByte();

    int readInt();

    short readShort();

    void skip(long j);

    String t(long j);

    int u(e51 e51Var);

    void x(long j);
}
