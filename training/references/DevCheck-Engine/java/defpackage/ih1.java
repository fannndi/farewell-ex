package defpackage;

import android.os.Looper;
import java.util.Set;

/* loaded from: classes.dex */
public final class ih1 extends bn0 {
    public final /* synthetic */ xg1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ih1(String[] strArr, xg1 xg1Var) {
        super(strArr);
        this.b = xg1Var;
    }

    @Override // defpackage.bn0
    public final void a(Set set) {
        set.getClass();
        h9 E = h9.E();
        r60 r60Var = new r60(17, this.b);
        E.j.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            r60Var.run();
        } else {
            E.F(r60Var);
        }
    }
}
