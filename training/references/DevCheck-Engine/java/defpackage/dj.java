package defpackage;

import android.content.Context;
import flar2.devcheck.hwData.DeviceInfo;
import java.util.Deque;

/* loaded from: classes.dex */
public final /* synthetic */ class dj implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ Context h;
    public final /* synthetic */ fh i;
    public final /* synthetic */ Deque j;
    public final /* synthetic */ DeviceInfo k;

    public /* synthetic */ dj(Context context, fh fhVar, Deque deque, DeviceInfo deviceInfo, int i) {
        this.g = i;
        this.h = context;
        this.i = fhVar;
        this.j = deque;
        this.k = deviceInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.g) {
            case 0:
                xc1.L(this.h, this.i, this.j, this.k);
                break;
            default:
                xc1.L(this.h, this.i, this.j, this.k);
                break;
        }
    }
}
