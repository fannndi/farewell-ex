package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* loaded from: classes.dex */
public final class ai2 extends ResultReceiver {
    public final /* synthetic */ nv1 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai2(Handler handler, nv1 nv1Var) {
        super(handler);
        this.g = nv1Var;
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        this.g.b(null);
    }
}
