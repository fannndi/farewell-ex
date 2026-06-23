package defpackage;

import android.content.ComponentName;

/* loaded from: classes.dex */
public final /* synthetic */ class vh1 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ zh1 h;
    public final /* synthetic */ ComponentName i;

    public /* synthetic */ vh1(zh1 zh1Var, ComponentName componentName, int i) {
        this.g = i;
        this.h = zh1Var;
        this.i = componentName;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        ComponentName componentName = this.i;
        zh1 zh1Var = this.h;
        switch (i) {
            case 0:
                componentName.getClassName();
                zh1Var.i(-1, componentName);
                break;
            default:
                zh1Var.h.remove(componentName);
                break;
        }
    }
}
