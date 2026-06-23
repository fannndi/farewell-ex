package defpackage;

import java.util.concurrent.ScheduledFuture;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class vn implements b31 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1093a;
    public final Object b;

    public /* synthetic */ vn(int i, Object obj) {
        this.f1093a = i;
        this.b = obj;
    }

    public final String toString() {
        int i = this.f1093a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return "CancelFutureOnCancel[" + ((ScheduledFuture) obj) + ']';
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return "CancelHandler.UserSupplied[" + ((lf0) obj).getClass().getSimpleName() + '@' + d10.r(this) + ']';
            default:
                return "DisposeOnCancel[" + ((n50) obj) + ']';
        }
    }
}
