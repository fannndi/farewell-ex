package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class v92 implements View.OnTouchListener {
    public final /* synthetic */ oq1 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ z92 i;

    public v92(int i, oq1 oq1Var, z92 z92Var) {
        this.i = z92Var;
        this.g = oq1Var;
        this.h = i;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        oq1 oq1Var = this.g;
        int i = this.h;
        z92 z92Var = this.i;
        oq1Var.s(i, z92Var, motionEvent);
        oq1Var.r(z92Var, motionEvent);
        return true;
    }
}
