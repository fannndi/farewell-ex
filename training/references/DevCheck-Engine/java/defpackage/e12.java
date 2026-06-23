package defpackage;

import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class e12 extends a12 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f216a = 1;
    public z02 b;

    public /* synthetic */ e12() {
    }

    public e12(z02 z02Var) {
        this.b = z02Var;
    }

    @Override // defpackage.a12, defpackage.y02
    public void a(z02 z02Var) {
        switch (this.f216a) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                xa xaVar = (xa) this.b;
                if (!xaVar.K) {
                    xaVar.H();
                    xaVar.K = true;
                    break;
                }
                break;
        }
    }

    @Override // defpackage.y02
    public final void d(z02 z02Var) {
        switch (this.f216a) {
            case 0:
                this.b.A();
                z02Var.y(this);
                break;
            default:
                xa xaVar = (xa) this.b;
                int i = xaVar.J - 1;
                xaVar.J = i;
                if (i == 0) {
                    xaVar.K = false;
                    xaVar.m();
                }
                z02Var.y(this);
                break;
        }
    }
}
