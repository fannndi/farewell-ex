package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class sb implements hb1 {
    public final /* synthetic */ int g;
    public final /* synthetic */ wb h;

    public /* synthetic */ sb(wb wbVar, int i) {
        this.g = i;
        this.h = wbVar;
    }

    public void a(qj qjVar, List list) {
        int i = this.g;
        wb wbVar = this.h;
        switch (i) {
            case 0:
                if (qjVar.f847a == 0) {
                    wbVar.j(list, wbVar.k);
                    break;
                }
                break;
            default:
                if (qjVar.f847a == 0) {
                    wbVar.j(list, wbVar.l);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.hb1
    public void c(qj qjVar, List list) {
        int i = qjVar.f847a;
        int i2 = 1;
        wb wbVar = this.h;
        if (i != 0) {
            wbVar.l();
            i51.i("pbc", true);
            return;
        }
        mj mjVar = wbVar.j;
        tb tbVar = new tb(wbVar, i2, list);
        mjVar.getClass();
        int i3 = 2;
        if (!mjVar.c()) {
            qj qjVar2 = li2.k;
            mjVar.v(2, 11, qjVar2);
            tbVar.c(qjVar2, null);
        } else if (mj.h(new bh2(mjVar, "inapp", tbVar, i3), 30000L, new hk2(mjVar, 20, tbVar), mjVar.t(), mjVar.k()) == null) {
            qj i4 = mjVar.i();
            mjVar.v(25, 11, i4);
            tbVar.c(i4, null);
        }
    }
}
