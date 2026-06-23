package defpackage;

/* loaded from: classes.dex */
public final class ug2 extends wg2 {
    public final transient wg2 l;

    public ug2(wg2 wg2Var) {
        super(2);
        this.l = wg2Var;
    }

    @Override // defpackage.wg2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.l.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        wg2 wg2Var = this.l;
        je2.b0(i, wg2Var.size());
        return wg2Var.get((wg2Var.size() - 1) - i);
    }

    @Override // defpackage.wg2, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.l.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r1.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.wg2, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.l.indexOf(obj);
        if (indexOf >= 0) {
            return (r1.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // defpackage.wg2
    public final wg2 n() {
        return this.l;
    }

    @Override // defpackage.wg2, java.util.List
    /* renamed from: o */
    public final wg2 subList(int i, int i2) {
        wg2 wg2Var = this.l;
        je2.c0(i, i2, wg2Var.size());
        return wg2Var.subList(wg2Var.size() - i2, wg2Var.size() - i).n();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.l.size();
    }
}
