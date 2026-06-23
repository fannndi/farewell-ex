package defpackage;

import android.util.SparseArray;
import android.view.WindowManager;
import android.view.animation.Animation;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class lq1 implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z92 f604a;
    public final /* synthetic */ int b;
    public final /* synthetic */ oq1 c;

    public lq1(int i, oq1 oq1Var, z92 z92Var) {
        this.c = oq1Var;
        this.f604a = z92Var;
        this.b = i;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        oq1 oq1Var = this.c;
        WindowManager windowManager = oq1Var.h;
        z92 z92Var = this.f604a;
        windowManager.removeView(z92Var);
        z92Var.h = 0;
        my1 my1Var = oq1.m;
        Class<?> cls = oq1Var.getClass();
        HashMap hashMap = (HashMap) my1Var.g;
        SparseArray sparseArray = (SparseArray) hashMap.get(cls);
        if (sparseArray != null) {
            sparseArray.remove(this.b);
            if (sparseArray.size() == 0) {
                hashMap.remove(cls);
            }
        }
        if (oq1Var.i().size() == 0 && oq1Var.k) {
            oq1Var.k = false;
            oq1Var.stopForeground(true);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
