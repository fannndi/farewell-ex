package defpackage;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class dp1 implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dp1(int i, Object obj) {
        this.f204a = i;
        this.b = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.f204a) {
            case 0:
                if (message.what != 0) {
                    return false;
                }
                gr grVar = (gr) this.b;
                ep1 ep1Var = (ep1) message.obj;
                synchronized (grVar.h) {
                    if (((ep1) grVar.j) == ep1Var || ((ep1) grVar.k) == ep1Var) {
                        grVar.f(ep1Var, 2);
                    }
                }
                return true;
            default:
                int i = message.what;
                if (i == 0) {
                    qo2 qo2Var = (qo2) this.b;
                    synchronized (qo2Var.f856a) {
                        try {
                            ko2 ko2Var = (ko2) message.obj;
                            no2 no2Var = (no2) qo2Var.f856a.get(ko2Var);
                            if (no2Var != null && no2Var.f694a.isEmpty()) {
                                if (no2Var.c) {
                                    ko2 ko2Var2 = no2Var.e;
                                    qo2 qo2Var2 = no2Var.g;
                                    qo2Var2.c.removeMessages(1, ko2Var2);
                                    qo2Var2.d.l(qo2Var2.b, no2Var);
                                    no2Var.c = false;
                                    no2Var.b = 2;
                                }
                                qo2Var.f856a.remove(ko2Var);
                            }
                        } finally {
                        }
                    }
                    return true;
                }
                if (i != 1) {
                    return false;
                }
                qo2 qo2Var3 = (qo2) this.b;
                synchronized (qo2Var3.f856a) {
                    try {
                        ko2 ko2Var3 = (ko2) message.obj;
                        no2 no2Var2 = (no2) qo2Var3.f856a.get(ko2Var3);
                        if (no2Var2 != null && no2Var2.b == 3) {
                            new StringBuilder(String.valueOf(ko2Var3).length() + 47);
                            new Exception();
                            ComponentName componentName = no2Var2.f;
                            if (componentName == null) {
                                ko2Var3.getClass();
                                componentName = null;
                            }
                            if (componentName == null) {
                                String str = ko2Var3.b;
                                xc1.j(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            no2Var2.onServiceDisconnected(componentName);
                        }
                    } finally {
                    }
                }
                return true;
        }
    }
}
