package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class dj2 extends ej2 implements Serializable {
    public static final dj2 h = new dj2(0);
    public static final dj2 i = new dj2(1);
    public final /* synthetic */ int g;

    public /* synthetic */ dj2(int i2) {
        this.g = i2;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.g) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                fj2 fj2Var = (fj2) obj;
                fj2 fj2Var2 = (fj2) obj2;
                return di2.f194a.b(fj2Var.g, fj2Var2.g).b(fj2Var.h, fj2Var2.h).a();
        }
    }

    public String toString() {
        switch (this.g) {
            case 0:
                return "Ordering.natural()";
            default:
                return super.toString();
        }
    }
}
