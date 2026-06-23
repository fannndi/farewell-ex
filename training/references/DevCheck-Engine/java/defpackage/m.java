package defpackage;

import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements lf0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ m(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    public /* synthetic */ m(ty0 ty0Var, sy0 sy0Var) {
        this.g = 2;
        this.h = ty0Var;
    }

    @Override // defpackage.lf0
    public final Object j(Object obj) {
        int i = this.g;
        e42 e42Var = e42.f219a;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                return obj == ((n) obj2) ? "(this Collection)" : String.valueOf(obj);
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return ((nu0) obj2).c(((Integer) obj).intValue());
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                ((ty0) obj2).a(null);
                return e42Var;
            case 3:
                se0 se0Var = (se0) obj;
                se0Var.getClass();
                ((ah1) obj2).g = se0Var;
                return e42Var;
            default:
                y00 y00Var = (y00) obj;
                y00Var.getClass();
                return ((dh1) obj2).g(y00Var);
        }
    }
}
