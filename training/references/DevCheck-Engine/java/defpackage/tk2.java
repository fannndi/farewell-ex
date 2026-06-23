package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class tk2 extends gk2 {
    public kk2 n;
    public ScheduledFuture o;

    @Override // defpackage.zj2
    public final String c() {
        kk2 kk2Var = this.n;
        ScheduledFuture scheduledFuture = this.o;
        if (kk2Var == null) {
            return null;
        }
        String y = d51.y("inputFuture=[", kk2Var.toString(), "]");
        if (scheduledFuture != null) {
            long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
            if (delay > 0) {
                return y + ", remaining delay=[" + delay + " ms]";
            }
        }
        return y;
    }

    @Override // defpackage.zj2
    public final void d() {
        kk2 kk2Var = this.n;
        if ((kk2Var != null) & (this.g instanceof pj2)) {
            Object obj = this.g;
            kk2Var.cancel((obj instanceof pj2) && ((pj2) obj).f793a);
        }
        ScheduledFuture scheduledFuture = this.o;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.n = null;
        this.o = null;
    }
}
