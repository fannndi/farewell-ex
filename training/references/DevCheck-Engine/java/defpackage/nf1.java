package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class nf1 extends sl0 {
    public static final nf1 n = new nf1(0, new Object[0]);
    public final transient Object[] l;
    public final transient int m;

    public nf1(int i, Object[] objArr) {
        super(0);
        this.l = objArr;
        this.m = i;
    }

    @Override // defpackage.sl0, defpackage.pl0
    public final int e(Object[] objArr) {
        Object[] objArr2 = this.l;
        int i = this.m;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.pl0
    public final Object[] g() {
        return this.l;
    }

    @Override // java.util.List
    public final Object get(int i) {
        kk1.j(i, this.m);
        Object obj = this.l[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // defpackage.pl0
    public final int h() {
        return this.m;
    }

    @Override // defpackage.pl0
    public final int i() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.m;
    }
}
