package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class um0 implements s41, vt1 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public /* synthetic */ um0(vm0 vm0Var, int i, Context context) {
        this.h = vm0Var;
        this.g = i;
        this.i = context;
    }

    public /* synthetic */ um0(w42 w42Var, nb nbVar, int i) {
        this.h = w42Var;
        this.i = nbVar;
        this.g = i;
    }

    @Override // defpackage.vt1
    public Object e() {
        w42 w42Var = (w42) this.h;
        w42Var.d.N((nb) this.i, this.g + 1, false);
        return null;
    }

    @Override // defpackage.s41
    public void j(Exception exc) {
        vm0 vm0Var = (vm0) this.h;
        Context context = (Context) this.i;
        int i = this.g;
        if (i < 2) {
            ((Handler) vm0Var.c).postDelayed(new hh(vm0Var, context, i, 4), 2500L);
        } else {
            ((AtomicBoolean) vm0Var.b).set(false);
        }
    }
}
