package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class kj1 implements Executor {
    public final /* synthetic */ int g;
    public final Object h;

    public kj1() {
        this.g = 2;
        lg2 lg2Var = new lg2(Looper.getMainLooper());
        Looper.getMainLooper();
        this.h = lg2Var;
    }

    public /* synthetic */ kj1(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                ((Executor) obj).execute(new wa(20, runnable));
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ((Handler) ((gr) obj).j).post(runnable);
                break;
            default:
                ((lg2) obj).post(runnable);
                break;
        }
    }
}
