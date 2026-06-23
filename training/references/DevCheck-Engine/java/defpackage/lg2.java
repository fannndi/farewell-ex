package defpackage;

import android.os.Handler;
import android.os.Looper;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public class lg2 extends Handler {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lg2(Looper looper, int i) {
        super(looper);
        switch (i) {
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                super(looper);
                Looper.getMainLooper();
                break;
            default:
                Looper.getMainLooper();
                break;
        }
    }
}
