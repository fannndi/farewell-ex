package defpackage;

import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class m50 implements n50 {
    public final ScheduledFuture g;

    public m50(ScheduledFuture scheduledFuture) {
        this.g = scheduledFuture;
    }

    @Override // defpackage.n50
    public final void b() {
        this.g.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.g + ']';
    }
}
