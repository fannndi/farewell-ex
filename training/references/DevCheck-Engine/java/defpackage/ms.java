package defpackage;

/* loaded from: classes.dex */
public final class ms {

    /* renamed from: a, reason: collision with root package name */
    public final byte f652a;
    public final byte b;
    public final short c;
    public final String d;
    public final int e;

    public ms(int i, String str, int i2) {
        this.d = str;
        this.e = i2;
        this.c = (short) (65535 & i);
        this.b = (byte) ((i >> 16) & 255);
        this.f652a = (byte) ((i >> 24) & 255);
    }
}
