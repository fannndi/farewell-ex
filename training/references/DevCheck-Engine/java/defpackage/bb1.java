package defpackage;

/* loaded from: classes.dex */
public final class bb1 implements p52 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f76a = false;
    public boolean b = false;
    public kb0 c;
    public final ab1 d;

    public bb1(ab1 ab1Var) {
        this.d = ab1Var;
    }

    @Override // defpackage.p52
    public final p52 b(String str) {
        if (this.f76a) {
            throw new w80("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f76a = true;
        this.d.e(this.c, str, this.b);
        return this;
    }

    @Override // defpackage.p52
    public final p52 c(boolean z) {
        if (this.f76a) {
            throw new w80("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f76a = true;
        this.d.b(this.c, z ? 1 : 0, this.b);
        return this;
    }
}
