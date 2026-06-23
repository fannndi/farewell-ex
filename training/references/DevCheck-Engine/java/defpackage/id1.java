package defpackage;

/* loaded from: classes.dex */
public final class id1 extends ng1 {
    public final String h;
    public final long i;
    public final zc1 j;

    public id1(String str, long j, zc1 zc1Var) {
        this.h = str;
        this.i = j;
        this.j = zc1Var;
    }

    @Override // defpackage.ng1
    public final long a() {
        return this.i;
    }

    @Override // defpackage.ng1
    public final cw0 e() {
        String str = this.h;
        if (str != null) {
            mf1 mf1Var = cw0.c;
            try {
                return d10.m(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.ng1
    public final fm j() {
        return this.j;
    }
}
