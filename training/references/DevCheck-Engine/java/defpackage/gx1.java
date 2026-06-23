package defpackage;

import flar2.devcheck.tests.TestActivity;

/* loaded from: classes.dex */
public final class gx1 extends kk1 {
    public final /* synthetic */ TestActivity i;

    public gx1(TestActivity testActivity) {
        this.i = testActivity;
    }

    @Override // defpackage.kk1
    public final void C(int i) {
        this.i.runOnUiThread(new Thread(new xj(i, 10, this)));
    }

    @Override // defpackage.kk1
    public final void D() {
        this.i.runOnUiThread(new Thread(new fx1(this, 1)));
    }

    @Override // defpackage.kk1
    public final void E() {
        this.i.runOnUiThread(new Thread(new fx1(this, 0)));
    }
}
