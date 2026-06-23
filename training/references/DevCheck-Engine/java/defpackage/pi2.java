package defpackage;

/* loaded from: classes.dex */
public final class pi2 extends qi2 {
    public final transient int i;
    public final transient int j;
    public final /* synthetic */ qi2 k;

    public pi2(qi2 qi2Var, int i, int i2) {
        this.k = qi2Var;
        this.i = i;
        this.j = i2;
    }

    @Override // defpackage.ki2
    public final int c() {
        return this.k.d() + this.i + this.j;
    }

    @Override // defpackage.ki2
    public final int d() {
        return this.k.d() + this.i;
    }

    @Override // defpackage.ki2
    public final boolean f() {
        return true;
    }

    @Override // defpackage.ki2
    public final Object[] g() {
        return this.k.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        tl2.M(i, this.j);
        return this.k.get(i + this.i);
    }

    @Override // defpackage.qi2, java.util.List
    /* renamed from: i */
    public final qi2 subList(int i, int i2) {
        tl2.Q(i, i2, this.j);
        int i3 = this.i;
        return this.k.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.j;
    }
}
