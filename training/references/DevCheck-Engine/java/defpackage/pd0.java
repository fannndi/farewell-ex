package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class pd0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int g = 1;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    public pd0(ViewGroup viewGroup, bu1 bu1Var) {
        this.h = viewGroup;
        this.i = bu1Var;
    }

    public pd0(qd0 qd0Var, je0 je0Var) {
        this.i = qd0Var;
        this.h = je0Var;
    }

    private final void a(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.g;
        Object obj = this.i;
        Object obj2 = this.h;
        switch (i) {
            case 0:
                je0 je0Var = (je0) obj2;
                ld0 ld0Var = je0Var.c;
                je0Var.k();
                k20.f((ViewGroup) ld0Var.M.getParent(), ((qd0) obj).g.G()).e();
                break;
            default:
                ((ViewGroup) obj2).addView((bu1) obj, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.g) {
            case 0:
                break;
            default:
                ((ViewGroup) this.h).addView((bu1) this.i, 0);
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
