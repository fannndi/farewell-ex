package defpackage;

import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class k41 extends yf0 implements af0 {
    public final /* synthetic */ int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k41(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.n = i4;
    }

    @Override // defpackage.af0
    public final Object a() {
        int i = this.n;
        e42 e42Var = e42.f219a;
        Object obj = this.h;
        switch (i) {
            case 0:
                ((l41) obj).d();
                return e42Var;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ((l41) obj).d();
                return e42Var;
            default:
                dh1 dh1Var = (dh1) obj;
                bx bxVar = dh1Var.f191a;
                if (bxVar == null) {
                    ym0.A("coroutineScope");
                    throw null;
                }
                rn0 rn0Var = (rn0) bxVar.g.r(pg0.k);
                if (rn0Var == null) {
                    rw.m("Scope cannot be cancelled because it does not have a job: ", bxVar);
                    return null;
                }
                rn0Var.e(null);
                dh1Var.j();
                ah1 ah1Var = dh1Var.e;
                if (ah1Var != null) {
                    ah1Var.f.close();
                    return e42Var;
                }
                ym0.A("connectionManager");
                throw null;
        }
    }
}
