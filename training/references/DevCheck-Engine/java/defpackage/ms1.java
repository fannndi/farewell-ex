package defpackage;

import android.view.LayoutInflater;

/* loaded from: classes.dex */
public final /* synthetic */ class ms1 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ ns1 h;
    public final /* synthetic */ LayoutInflater i;

    public /* synthetic */ ms1(ns1 ns1Var, LayoutInflater layoutInflater, int i) {
        this.g = i;
        this.h = ns1Var;
        this.i = layoutInflater;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        LayoutInflater layoutInflater = this.i;
        ns1 ns1Var = this.h;
        switch (i) {
            case 0:
                ns1Var.u0(layoutInflater);
                break;
            default:
                ns1Var.u0(layoutInflater);
                break;
        }
    }
}
