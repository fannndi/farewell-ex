package defpackage;

import java.io.Serializable;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public final class g90 extends u implements f90, RandomAccess, Serializable {
    public final Enum[] g;

    public g90(Enum[] enumArr) {
        this.g = enumArr;
    }

    @Override // defpackage.n
    public final int b() {
        return this.g.length;
    }

    @Override // defpackage.n, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r2 = (Enum) obj;
        return ((Enum) u9.o0(r2.ordinal(), this.g)) == r2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.g;
        int length = enumArr.length;
        if (i >= 0 && i < length) {
            return enumArr[i];
        }
        c.g(d51.n(i, length, "index: ", ", size: "));
        return null;
    }

    @Override // defpackage.u, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) u9.o0(ordinal, this.g)) == r3) {
            return ordinal;
        }
        return -1;
    }

    @Override // defpackage.u, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int ordinal = r3.ordinal();
        if (((Enum) u9.o0(ordinal, this.g)) == r3) {
            return ordinal;
        }
        return -1;
    }
}
