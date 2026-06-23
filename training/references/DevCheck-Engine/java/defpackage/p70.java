package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p70 extends tl2 {
    public final /* synthetic */ q70 n;

    public p70(q70 q70Var) {
        this.n = q70Var;
    }

    @Override // defpackage.tl2
    public final void A(Throwable th) {
        this.n.f820a.d(th);
    }

    @Override // defpackage.tl2
    public final void D(gr grVar) {
        q70 q70Var = this.n;
        q70Var.c = grVar;
        gr grVar2 = q70Var.c;
        u70 u70Var = q70Var.f820a;
        q70Var.b = new fh(grVar2, u70Var.g, u70Var.i, Build.VERSION.SDK_INT >= 34 ? z70.a() : rt0.r());
        u70 u70Var2 = q70Var.f820a;
        ArrayList arrayList = new ArrayList();
        u70Var2.f1023a.writeLock().lock();
        try {
            u70Var2.c = 1;
            arrayList.addAll(u70Var2.b);
            u70Var2.b.clear();
            u70Var2.f1023a.writeLock().unlock();
            u70Var2.d.post(new ce(arrayList, u70Var2.c, (Throwable) null));
        } catch (Throwable th) {
            u70Var2.f1023a.writeLock().unlock();
            throw th;
        }
    }
}
