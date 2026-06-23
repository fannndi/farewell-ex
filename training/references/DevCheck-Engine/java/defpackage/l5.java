package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class l5 implements Executor {
    public final /* synthetic */ int g;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.g) {
            case 0:
                new Thread(runnable).start();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
