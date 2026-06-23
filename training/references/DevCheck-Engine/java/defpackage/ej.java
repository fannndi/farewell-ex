package defpackage;

import android.content.Context;
import android.os.Trace;
import flar2.devcheck.hwData.DeviceInfo;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class ej implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ ej(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.g = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
        this.k = obj4;
        this.l = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        Object obj = this.l;
        Object obj2 = this.k;
        Object obj3 = this.j;
        Object obj4 = this.i;
        Object obj5 = this.h;
        switch (i) {
            case 0:
                fh fhVar = (fh) obj5;
                fhVar.D(((li) obj4).f590a);
                xc1.L((Context) obj3, fhVar, (Deque) obj2, (DeviceInfo) obj);
                return;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                String str = (String) obj4;
                af0 af0Var = (af0) obj3;
                qy0 qy0Var = (qy0) obj2;
                mn mnVar = (mn) obj;
                ((ai1) obj5).getClass();
                boolean o = bw0.o();
                if (o) {
                    try {
                        Trace.beginSection(bw0.A(str));
                    } finally {
                        if (o) {
                            Trace.endSection();
                        }
                    }
                }
                try {
                    af0Var.a();
                    c51 c51Var = ai1.m;
                    qy0Var.i(c51Var);
                    mnVar.a(c51Var);
                } catch (Throwable th) {
                    qy0Var.i(new b51(th));
                    mnVar.b(th);
                }
                if (o) {
                    return;
                } else {
                    return;
                }
            default:
                ((l61) obj5).o((HashMap) obj4, (List) obj3, (ArrayList) obj2, (HashMap) obj);
                return;
        }
    }
}
