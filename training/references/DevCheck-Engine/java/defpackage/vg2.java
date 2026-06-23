package defpackage;

/* loaded from: classes.dex */
public final class vg2 extends wg2 {
    public final transient int l;
    public final transient int m;
    public final /* synthetic */ wg2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg2(wg2 wg2Var, int i, int i2) {
        super(2);
        this.n = wg2Var;
        this.l = i;
        this.m = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        je2.b0(i, this.m);
        return this.n.get(i + this.l);
    }

    @Override // defpackage.pl0
    public final Object[] j() {
        return this.n.j();
    }

    @Override // defpackage.pl0
    public final int k() {
        return this.n.k() + this.l;
    }

    @Override // defpackage.pl0
    public final int l() {
        return this.n.k() + this.l + this.m;
    }

    @Override // defpackage.wg2, java.util.List
    /* renamed from: o */
    public final wg2 subList(int i, int i2) {
        je2.c0(i, i2, this.m);
        int i3 = this.l;
        return this.n.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.m;
    }
}
