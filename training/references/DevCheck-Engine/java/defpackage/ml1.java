package defpackage;

/* loaded from: classes.dex */
public final class ml1 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f640a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public ml1 f;
    public ml1 g;

    public ml1() {
        this.f640a = new byte[rt0.y];
        this.e = true;
        this.d = false;
    }

    public ml1(byte[] bArr, int i, int i2, boolean z) {
        bArr.getClass();
        this.f640a = bArr;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = false;
    }

    public final ml1 a() {
        ml1 ml1Var = this.f;
        if (ml1Var == this) {
            ml1Var = null;
        }
        ml1 ml1Var2 = this.g;
        ml1Var2.getClass();
        ml1Var2.f = this.f;
        ml1 ml1Var3 = this.f;
        ml1Var3.getClass();
        ml1Var3.g = this.g;
        this.f = null;
        this.g = null;
        return ml1Var;
    }

    public final void b(ml1 ml1Var) {
        ml1Var.getClass();
        ml1Var.g = this;
        ml1Var.f = this.f;
        ml1 ml1Var2 = this.f;
        ml1Var2.getClass();
        ml1Var2.g = ml1Var;
        this.f = ml1Var;
    }

    public final ml1 c() {
        this.d = true;
        return new ml1(this.f640a, this.b, this.c, true);
    }

    public final void d(ml1 ml1Var, int i) {
        ml1Var.getClass();
        byte[] bArr = ml1Var.f640a;
        if (!ml1Var.e) {
            c.n("only owner can write");
            return;
        }
        int i2 = ml1Var.c;
        int i3 = i2 + i;
        if (i3 > 8192) {
            if (ml1Var.d) {
                throw new IllegalArgumentException();
            }
            int i4 = ml1Var.b;
            if (i3 - i4 > 8192) {
                throw new IllegalArgumentException();
            }
            u9.h0(bArr, bArr, 0, i4, i2);
            ml1Var.c -= ml1Var.b;
            ml1Var.b = 0;
        }
        int i5 = ml1Var.c;
        int i6 = this.b;
        u9.h0(this.f640a, bArr, i5, i6, i6 + i);
        ml1Var.c += i;
        this.b += i;
    }
}
