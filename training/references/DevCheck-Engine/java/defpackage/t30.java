package defpackage;

import flar2.devcheck.hwData.DeviceInfo;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class t30 implements v41, s41 {
    public final /* synthetic */ AtomicBoolean g;
    public final /* synthetic */ DeviceInfo h;
    public final /* synthetic */ Runnable i;

    public /* synthetic */ t30(AtomicBoolean atomicBoolean, DeviceInfo deviceInfo, Runnable runnable) {
        this.g = atomicBoolean;
        this.h = deviceInfo;
        this.i = runnable;
    }

    @Override // defpackage.v41
    public void i(Object obj) {
        se2 se2Var = (se2) obj;
        if (this.g.getAndSet(true)) {
            return;
        }
        String str = se2Var.f932a;
        wf1 c = xf1.c(new nh0().c(this.h), x30.f1160a);
        yh yhVar = new yh();
        yhVar.f("https://api.devcheck.app/api/reportHardware/full");
        yhVar.b("POST", c);
        String concat = "Bearer ".concat(str);
        ti0 ti0Var = (ti0) yhVar.i;
        ti0Var.getClass();
        op0.A("Authorization");
        op0.B(concat, "Authorization");
        op0.f(ti0Var, "Authorization", concat);
        yf yfVar = new yf(yhVar);
        a41 a41Var = x30.d;
        a41Var.getClass();
        new dd1(a41Var, yfVar).e(new w30(this.i, 0));
    }

    @Override // defpackage.s41
    public void j(Exception exc) {
        if (this.g.getAndSet(true)) {
            return;
        }
        x30.d(this.h, this.i);
    }
}
