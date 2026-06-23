package defpackage;

import java.util.ListIterator;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class e41 extends ap0 implements af0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ l41 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e41(l41 l41Var, int i) {
        super(0);
        this.h = i;
        this.i = l41Var;
    }

    @Override // defpackage.af0
    public final Object a() {
        Object obj;
        int i = this.h;
        e42 e42Var = e42.f219a;
        l41 l41Var = this.i;
        switch (i) {
            case 0:
                l41Var.b();
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                j9 j9Var = l41Var.b;
                ListIterator listIterator = j9Var.listIterator(j9Var.b());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        if (((c41) obj).f107a) {
                        }
                    } else {
                        obj = null;
                    }
                }
                l41Var.c = null;
                break;
            default:
                l41Var.b();
                break;
        }
        return e42Var;
    }
}
