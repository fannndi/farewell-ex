package defpackage;

import android.content.ServiceConnection;
import android.util.Pair;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class oh1 extends Pair {
    public final void a(ServiceConnection serviceConnection) {
        ((Executor) ((Pair) this).second).execute(new n51(this, 12, serviceConnection));
    }
}
