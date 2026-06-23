package defpackage;

import java.nio.channels.WritableByteChannel;

/* loaded from: classes.dex */
public interface em extends ap1, WritableByteChannel {
    em A(km kmVar);

    @Override // defpackage.ap1, java.io.Flushable
    void flush();

    em write(byte[] bArr);

    em writeByte(int i);

    em writeInt(int i);

    em writeShort(int i);

    em y(String str);
}
