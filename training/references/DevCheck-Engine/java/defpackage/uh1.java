package defpackage;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final /* synthetic */ class uh1 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ zh1 h;
    public final /* synthetic */ ComponentName i;
    public final /* synthetic */ int j;

    public /* synthetic */ uh1(zh1 zh1Var, ComponentName componentName, int i, int i2) {
        this.g = i2;
        this.h = zh1Var;
        this.i = componentName;
        this.j = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        int i2 = this.j;
        ComponentName componentName = this.i;
        zh1 zh1Var = this.h;
        switch (i) {
            case 0:
                componentName.getClassName();
                zh1Var.i(i2, componentName);
                break;
            default:
                componentName.getClassName();
                zh1Var.i(-1, componentName);
                zh1Var.b(i2);
                break;
        }
    }
}
