package defpackage;

import java.util.concurrent.Executor;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class g9 implements Executor {
    public final /* synthetic */ int g;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.g) {
            case 0:
                h9.E().j.k.execute(runnable);
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                runnable.run();
                break;
            default:
                x32.a(runnable);
                break;
        }
    }
}
