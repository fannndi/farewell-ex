package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class gj2 extends qi2 {
    public static final gj2 k = new gj2(0, new Object[0]);
    public final transient Object[] i;
    public final transient int j;

    public gj2(int i, Object[] objArr) {
        this.i = objArr;
        this.j = i;
    }

    @Override // defpackage.qi2, defpackage.ki2
    public final int b(Object[] objArr) {
        Object[] objArr2 = this.i;
        int i = this.j;
        System.arraycopy(objArr2, 0, objArr, 0, i);
        return i;
    }

    @Override // defpackage.ki2
    public final int c() {
        return this.j;
    }

    @Override // defpackage.ki2
    public final int d() {
        return 0;
    }

    @Override // defpackage.ki2
    public final boolean f() {
        return false;
    }

    @Override // defpackage.ki2
    public final Object[] g() {
        return this.i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        tl2.M(i, this.j);
        Object obj = this.i[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.j;
    }
}
