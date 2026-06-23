package defpackage;

import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class cl2 {
    public static final cl2 b = new cl2(0);
    public static final cl2 c = new cl2(1);
    public static final cl2 d = new cl2(2);
    public static final cl2 e = new cl2(3);
    public static final cl2 f = new cl2(4);
    public static final cl2 g = new cl2(5);
    public static final cl2 h = new cl2(6);
    public static final cl2 i = new cl2(7);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f128a;

    public /* synthetic */ cl2(int i2) {
        this.f128a = i2;
    }

    public final boolean a(int i2) {
        switch (this.f128a) {
            case 0:
                switch (i2) {
                }
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                switch (i2) {
                    case 0:
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                    case 3:
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                    case 5:
                    case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                    case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                    case 8:
                    case rt0.o /* 9 */:
                    case 10:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 15:
                        break;
                    default:
                        switch (i2) {
                        }
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                if (md2.H(i2) != 0) {
                    break;
                }
                break;
            case 3:
                if ((i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : qn2.k : qn2.j : qn2.i : qn2.h) != null) {
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) {
                    break;
                }
            case 5:
                if (i2 != 17 && i2 != 18) {
                    switch (i2) {
                    }
                }
                break;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                if (i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
                    break;
                }
            default:
                if (i2 == 0 || i2 == 1) {
                    break;
                }
        }
        return true;
    }
}
