package defpackage;

import android.os.CancellationSignal;

/* loaded from: classes.dex */
public abstract class fo {
    public static void a(CancellationSignal cancellationSignal) {
        cancellationSignal.cancel();
    }

    public static CancellationSignal b() {
        return new CancellationSignal();
    }
}
