package defpackage;

/* loaded from: classes.dex */
public final class oi2 extends qi2 {
    public final transient qi2 i;

    public oi2(qi2 qi2Var) {
        this.i = qi2Var;
    }

    @Override // defpackage.qi2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.i.contains(obj);
    }

    @Override // defpackage.ki2
    public final boolean f() {
        return this.i.f();
    }

    @Override // java.util.List
    public final Object get(int i) {
        qi2 qi2Var = this.i;
        tl2.M(i, qi2Var.size());
        return qi2Var.get((qi2Var.size() - 1) - i);
    }

    @Override // defpackage.qi2
    public final qi2 h() {
        return this.i;
    }

    @Override // defpackage.qi2, java.util.List
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final qi2 subList(int i, int i2) {
        qi2 qi2Var = this.i;
        tl2.Q(i, i2, qi2Var.size());
        return qi2Var.subList(qi2Var.size() - i2, qi2Var.size() - i).h();
    }

    @Override // defpackage.qi2, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.i.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r1.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.qi2, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.i.indexOf(obj);
        if (indexOf >= 0) {
            return (r1.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i.size();
    }
}
