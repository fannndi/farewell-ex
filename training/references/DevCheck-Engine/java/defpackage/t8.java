package defpackage;

import java.util.function.ToIntFunction;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class t8 implements ToIntFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f970a;

    public /* synthetic */ t8(e21 e21Var) {
        this.f970a = 2;
    }

    @Override // java.util.function.ToIntFunction
    public final int applyAsInt(Object obj) {
        switch (this.f970a) {
            case 0:
                return ((y61) obj).i.ordinal();
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return ((nj1) obj).f;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                bp0 bp0Var = ((gp0) obj).k.A;
                if (bp0Var == null) {
                    return 999;
                }
                switch (bp0Var.ordinal()) {
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        return 0;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        return 4;
                    case 3:
                        return 5;
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        return 3;
                    case 5:
                        return 1;
                    case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                        return 2;
                    default:
                        return 10;
                }
            case 3:
                return ((s91) obj).f923a;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return ((x91) obj).f1172a;
            default:
                return ((a71) obj).f;
        }
    }
}
