package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum aj2 {
    h(-999),
    /* JADX INFO: Fake field, exist only in values array */
    EF18(-3),
    /* JADX INFO: Fake field, exist only in values array */
    EF27(-2),
    /* JADX INFO: Fake field, exist only in values array */
    EF36(-1),
    /* JADX INFO: Fake field, exist only in values array */
    EF45(0),
    /* JADX INFO: Fake field, exist only in values array */
    EF53(1),
    /* JADX INFO: Fake field, exist only in values array */
    EF63(2),
    /* JADX INFO: Fake field, exist only in values array */
    EF71(3),
    /* JADX INFO: Fake field, exist only in values array */
    EF80(4),
    /* JADX INFO: Fake field, exist only in values array */
    EF92(5),
    /* JADX INFO: Fake field, exist only in values array */
    EF102(6),
    /* JADX INFO: Fake field, exist only in values array */
    EF111(7),
    /* JADX INFO: Fake field, exist only in values array */
    EF120(8),
    /* JADX INFO: Fake field, exist only in values array */
    EF134(11),
    /* JADX INFO: Fake field, exist only in values array */
    EF147(12);

    public static final lj2 i;
    public final int g;

    static {
        rg1 rg1Var = new rg1(5);
        rg1Var.c = new Object[8];
        rg1Var.b = 0;
        for (aj2 aj2Var : values()) {
            Integer valueOf = Integer.valueOf(aj2Var.g);
            int i2 = rg1Var.b + 1;
            Object[] objArr = (Object[]) rg1Var.c;
            int length = objArr.length;
            int i3 = i2 + i2;
            if (i3 > length) {
                rg1Var.c = Arrays.copyOf(objArr, ii2.b(length, i3));
            }
            Object[] objArr2 = (Object[]) rg1Var.c;
            int i4 = rg1Var.b;
            int i5 = i4 + i4;
            objArr2[i5] = valueOf;
            objArr2[i5 + 1] = aj2Var;
            rg1Var.b = i4 + 1;
        }
        ri2 ri2Var = (ri2) rg1Var.d;
        if (ri2Var != null) {
            throw ri2Var.a();
        }
        lj2 a2 = lj2.a(rg1Var.b, (Object[]) rg1Var.c, rg1Var);
        ri2 ri2Var2 = (ri2) rg1Var.d;
        if (ri2Var2 != null) {
            throw ri2Var2.a();
        }
        i = a2;
    }

    aj2(int i2) {
        this.g = i2;
    }
}
