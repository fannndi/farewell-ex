package defpackage;

import android.content.Intent;
import java.util.List;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class vy0 implements oz0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ l01 h;

    public /* synthetic */ vy0(l01 l01Var, int i) {
        this.g = i;
        this.h = l01Var;
    }

    @Override // defpackage.oz0
    public final void k(int i) {
        int i2 = this.g;
        l01 l01Var = this.h;
        switch (i2) {
            case 0:
                try {
                    b01 b01Var = l01Var.g;
                    String str = ((hn0) l01Var.d.get(i)).b;
                    b01Var.e();
                    break;
                } catch (Exception unused) {
                    return;
                }
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                try {
                    u11 u11Var = l01Var.h;
                    String str2 = ((hn0) l01Var.d.get(i)).b;
                    u11Var.getClass();
                    u11Var.f0(new String[]{"android.permission.ACCESS_FINE_LOCATION"}, 134);
                    break;
                } catch (Exception unused2) {
                    return;
                }
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                List list = l01Var.d;
                try {
                    Intent intent = ((hn0) list.get(i)).C;
                    d01 d01Var = l01Var.j;
                    if (intent != null) {
                        d01Var.n(((hn0) list.get(i)).C, ((hn0) list.get(i)).b);
                    } else {
                        d01Var.d(((hn0) list.get(i)).b);
                    }
                    break;
                } catch (Exception unused3) {
                    return;
                }
            case 3:
                try {
                    l01Var.o.w0(((hn0) l01Var.d.get(i)).b);
                    break;
                } catch (Exception unused4) {
                    return;
                }
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                try {
                    l01Var.k.o();
                    break;
                } catch (Exception unused5) {
                    return;
                }
            case 5:
                try {
                    l01Var.i.f(((hn0) l01Var.d.get(i)).w);
                    break;
                } catch (Exception unused6) {
                    return;
                }
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                try {
                    l01Var.i.f(((hn0) l01Var.d.get(i)).w);
                    break;
                } catch (Exception unused7) {
                    return;
                }
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                try {
                    nz0 nz0Var = l01Var.m;
                    String str3 = ((hn0) l01Var.d.get(i)).b;
                    nz0Var.c();
                    break;
                } catch (Exception unused8) {
                    return;
                }
            case 8:
                try {
                    l01Var.l.c(((hn0) l01Var.d.get(i)).d);
                    break;
                } catch (Exception unused9) {
                    return;
                }
            case rt0.o /* 9 */:
                try {
                    l01Var.n.m(((hn0) l01Var.d.get(i)).x);
                    break;
                } catch (Exception unused10) {
                    return;
                }
            default:
                try {
                    l01Var.p.i(((hn0) l01Var.d.get(i)).b);
                    break;
                } catch (Exception unused11) {
                    return;
                }
        }
    }
}
