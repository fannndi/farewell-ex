package defpackage;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class p01 implements Comparator {
    public static final p01 h = new p01(0);
    public static final p01 i = new p01(1);
    public final /* synthetic */ int g;

    public /* synthetic */ p01(int i2) {
        this.g = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.g) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                comparable4.getClass();
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.g) {
            case 0:
                return i;
            default:
                return h;
        }
    }
}
