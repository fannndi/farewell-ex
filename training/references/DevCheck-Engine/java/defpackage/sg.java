package defpackage;

import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class sg implements wg, ur1 {
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;

    public /* synthetic */ sg(int i, int i2, int i3) {
        this.g = i3;
        this.h = i;
        this.i = i2;
    }

    @Override // defpackage.ur1
    public void a(yr1 yr1Var) {
        int i = this.g;
        int i2 = this.i;
        int i3 = this.h;
        switch (i) {
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                yr1Var.f1244a = 2;
                yr1Var.b = i3;
                yr1Var.c = i2;
                yr1Var.f = null;
                yr1Var.g = null;
                yr1Var.h = 0;
                yr1Var.i = 0;
                yr1Var.e = 0;
                break;
            default:
                yr1Var.h = i3;
                yr1Var.i = i2;
                break;
        }
    }

    @Override // defpackage.wg
    public void h(mi miVar) {
        int i = this.g;
        int i2 = this.i;
        int i3 = this.h;
        switch (i) {
            case 0:
                miVar.m = i3;
                miVar.n = i2;
                break;
            default:
                miVar.k = i3;
                miVar.l = i2;
                break;
        }
    }
}
