package defpackage;

import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class e51 extends u implements RandomAccess {
    public final km[] g;
    public final int[] h;

    public e51(km[] kmVarArr, int[] iArr) {
        this.g = kmVarArr;
        this.h = iArr;
    }

    @Override // defpackage.n
    public final int b() {
        return this.g.length;
    }

    @Override // defpackage.n, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof km) {
            return super.contains((km) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.g[i];
    }

    @Override // defpackage.u, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof km) {
            return super.indexOf((km) obj);
        }
        return -1;
    }

    @Override // defpackage.u, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof km) {
            return super.lastIndexOf((km) obj);
        }
        return -1;
    }
}
