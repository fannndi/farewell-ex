package defpackage;

import java.util.ListIterator;

/* loaded from: classes.dex */
public final class d41 extends ap0 implements lf0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ l41 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d41(l41 l41Var, int i) {
        super(1);
        this.h = i;
        this.i = l41Var;
    }

    @Override // defpackage.lf0
    public final Object j(Object obj) {
        int i = this.h;
        e42 e42Var = e42.f219a;
        Object obj2 = null;
        l41 l41Var = this.i;
        switch (i) {
            case 0:
                ((xb) obj).getClass();
                j9 j9Var = l41Var.b;
                ListIterator listIterator = j9Var.listIterator(j9Var.b());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        Object previous = listIterator.previous();
                        if (((c41) previous).f107a) {
                            obj2 = previous;
                        }
                    }
                }
                l41Var.c = (c41) obj2;
                break;
            default:
                ((xb) obj).getClass();
                j9 j9Var2 = l41Var.b;
                ListIterator listIterator2 = j9Var2.listIterator(j9Var2.b());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        Object previous2 = listIterator2.previous();
                        if (((c41) previous2).f107a) {
                            obj2 = previous2;
                        }
                    }
                }
                break;
        }
        return e42Var;
    }
}
