package defpackage;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public final class ps {

    /* renamed from: a, reason: collision with root package name */
    public final short f805a;
    public final short b;
    public final int c;

    public ps(short s, short s2, int i) {
        this.f805a = s;
        this.b = s2;
        this.c = i;
    }

    public final void a(ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.write(kk1.P(this.f805a));
        byteArrayOutputStream.write(kk1.P(this.b));
        byteArrayOutputStream.write(kk1.a(this.c));
    }
}
