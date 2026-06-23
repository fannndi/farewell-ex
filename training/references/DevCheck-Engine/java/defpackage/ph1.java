package defpackage;

import android.content.ServiceConnection;
import android.util.Pair;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class ph1 extends tj {
    public final gl0 b;
    public final /* synthetic */ th1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph1(th1 th1Var, gl0 gl0Var) {
        super(gl0Var.asBinder());
        this.c = th1Var;
        this.b = gl0Var;
    }

    @Override // defpackage.tj
    public final void a() {
        th1 th1Var = this.c;
        if (th1Var.f988a == this) {
            th1Var.f988a = null;
        }
        if (th1Var.b == this) {
            th1Var.b = null;
        }
        Iterator it = th1Var.e.values().iterator();
        while (it.hasNext()) {
            if (((qh1) it.next()).c == this) {
                it.remove();
            }
        }
        Iterator it2 = th1Var.f.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            oh1 oh1Var = (oh1) entry.getValue();
            if (((qh1) ((Pair) oh1Var).first).c == this) {
                oh1Var.a((ServiceConnection) entry.getKey());
                it2.remove();
            }
        }
    }
}
