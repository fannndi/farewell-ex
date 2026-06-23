package defpackage;

/* loaded from: classes.dex */
public final class lt1 extends mt1 {
    public final ze0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt1(se0 se0Var, String str) {
        super(se0Var, str);
        se0Var.getClass();
        str.getClass();
        this.j = se0Var.j(str);
    }

    @Override // defpackage.aj1
    public final void b(int i) {
        a();
        this.j.b(i);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.j.close();
        this.i = true;
    }

    @Override // defpackage.aj1
    public final void d(int i, long j) {
        a();
        this.j.d(i, j);
    }

    @Override // defpackage.aj1
    public final void f(int i, byte[] bArr) {
        a();
        this.j.f(i, bArr);
    }

    @Override // defpackage.aj1
    public final byte[] getBlob(int i) {
        a();
        kk1.S(21, "no row");
        throw null;
    }

    @Override // defpackage.aj1
    public final int getColumnCount() {
        a();
        return 0;
    }

    @Override // defpackage.aj1
    public final String getColumnName(int i) {
        a();
        kk1.S(21, "no row");
        throw null;
    }

    @Override // defpackage.aj1
    public final long getLong(int i) {
        a();
        kk1.S(21, "no row");
        throw null;
    }

    @Override // defpackage.aj1
    public final String h(int i) {
        a();
        kk1.S(21, "no row");
        throw null;
    }

    @Override // defpackage.aj1
    public final boolean isNull(int i) {
        a();
        kk1.S(21, "no row");
        throw null;
    }

    @Override // defpackage.aj1
    public final void reset() {
    }

    @Override // defpackage.aj1
    public final void s(int i, String str) {
        str.getClass();
        a();
        this.j.k(i, str);
    }

    @Override // defpackage.aj1
    public final boolean w() {
        a();
        this.j.h.execute();
        return false;
    }
}
