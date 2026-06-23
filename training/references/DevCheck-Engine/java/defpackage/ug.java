package defpackage;

import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class ug implements wg, ur1 {
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public /* synthetic */ ug(int i, int i2) {
        this.g = i2;
        this.h = i;
    }

    @Override // defpackage.ur1
    public void a(yr1 yr1Var) {
        int i = this.g;
        int i2 = this.h;
        switch (i) {
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                yr1Var.f1244a = i2;
                yr1Var.e = 0;
                yr1Var.f = null;
                yr1Var.g = null;
                break;
            default:
                yr1Var.e = i2;
                break;
        }
    }

    @Override // defpackage.wg
    public void h(mi miVar) {
        int i = this.g;
        int i2 = this.h;
        switch (i) {
            case 0:
                miVar.o = i2;
                break;
            default:
                miVar.f634a = 3;
                miVar.o = i2;
                break;
        }
    }
}
