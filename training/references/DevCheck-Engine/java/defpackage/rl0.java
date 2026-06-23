package defpackage;

import java.util.Iterator;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class rl0 extends sl0 {
    public final transient int l;
    public final transient int m;
    public final /* synthetic */ sl0 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl0(sl0 sl0Var, int i, int i2) {
        super(0);
        this.n = sl0Var;
        this.l = i;
        this.m = i2;
    }

    @Override // defpackage.pl0
    public final Object[] g() {
        return this.n.g();
    }

    @Override // java.util.List
    public final Object get(int i) {
        kk1.j(i, this.m);
        return this.n.get(i + this.l);
    }

    @Override // defpackage.pl0
    public final int h() {
        return this.n.i() + this.l + this.m;
    }

    @Override // defpackage.pl0
    public final int i() {
        return this.n.i() + this.l;
    }

    @Override // defpackage.sl0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // defpackage.sl0, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.sl0, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // defpackage.sl0, java.util.List
    /* renamed from: p */
    public final sl0 subList(int i, int i2) {
        kk1.l(i, i2, this.m);
        int i3 = this.l;
        return this.n.subList(i + i3, i2 + i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.m;
    }
}
