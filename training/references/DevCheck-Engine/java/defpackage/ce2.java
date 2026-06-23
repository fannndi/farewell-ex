package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class ce2 extends ae2 {
    public static final ce2 m = new ce2(new Object[0]);
    public final transient Object[] l;

    public ce2(Object[] objArr) {
        super(1);
        this.l = objArr;
    }

    @Override // defpackage.ae2, defpackage.pl0
    public final int b(Object[] objArr) {
        System.arraycopy(this.l, 0, objArr, 0, 0);
        return 0;
    }

    @Override // defpackage.pl0
    public final int c() {
        return 0;
    }

    @Override // defpackage.pl0
    public final int d() {
        return 0;
    }

    @Override // defpackage.pl0
    public final Object[] f() {
        return this.l;
    }

    @Override // java.util.List
    public final Object get(int i) {
        k32.f(i, 0);
        Object obj = this.l[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
