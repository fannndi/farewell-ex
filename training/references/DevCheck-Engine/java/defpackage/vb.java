package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class vb extends qy0 {
    public final /* synthetic */ int l;
    public final /* synthetic */ wb m;

    public /* synthetic */ vb(wb wbVar, int i) {
        this.l = i;
        this.m = wbVar;
    }

    @Override // defpackage.ns0
    public final void g() {
        int i = this.l;
        wb wbVar = this.m;
        switch (i) {
            case 0:
                if (SystemClock.elapsedRealtime() - wbVar.u > 14400000) {
                    wbVar.u = SystemClock.elapsedRealtime();
                    wbVar.k();
                    break;
                }
                break;
            default:
                if (SystemClock.elapsedRealtime() - wbVar.u > 14400000) {
                    wbVar.u = SystemClock.elapsedRealtime();
                    wbVar.k();
                    break;
                }
                break;
        }
    }
}
