package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import flar2.devcheck.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class uq0 extends x5 {
    public static final int[] k = {533, 567, 850, 750};
    public static final int[] l = {1267, 1000, 333, 0};
    public static final sd m = new sd(Float.class, "animationFraction", 12);
    public ObjectAnimator c;
    public ObjectAnimator d;
    public final Interpolator[] e;
    public final br0 f;
    public int g;
    public boolean h;
    public float i;
    public wd j;

    public uq0(Context context, br0 br0Var) {
        super(2);
        this.g = 0;
        this.j = null;
        this.f = br0Var;
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator);
        if (loadInterpolator == null) {
            jw0.f("Failed to parse interpolator, no start tag found");
            throw null;
        }
        Interpolator loadInterpolator2 = AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator);
        if (loadInterpolator2 == null) {
            jw0.f("Failed to parse interpolator, no start tag found");
            throw null;
        }
        Interpolator loadInterpolator3 = AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator);
        if (loadInterpolator3 == null) {
            jw0.f("Failed to parse interpolator, no start tag found");
            throw null;
        }
        Interpolator loadInterpolator4 = AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator);
        if (loadInterpolator4 != null) {
            this.e = new Interpolator[]{loadInterpolator, loadInterpolator2, loadInterpolator3, loadInterpolator4};
        } else {
            jw0.f("Failed to parse interpolator, no start tag found");
            throw null;
        }
    }

    @Override // defpackage.x5
    public final void c() {
        ObjectAnimator objectAnimator = this.c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // defpackage.x5
    public final void m() {
        t();
        ObjectAnimator objectAnimator = this.c;
        br0 br0Var = this.f;
        objectAnimator.setDuration((long) (br0Var.n * 1800.0f));
        this.d.setDuration((long) (br0Var.n * 1800.0f));
        u();
    }

    @Override // defpackage.x5
    public final void o(wd wdVar) {
        this.j = wdVar;
    }

    @Override // defpackage.x5
    public final void p() {
        ObjectAnimator objectAnimator = this.d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        c();
        if (((xl0) this.f1165a).isVisible()) {
            this.d.setFloatValues(this.i, 1.0f);
            this.d.setDuration((long) ((1.0f - this.i) * 1800.0f));
            this.d.start();
        }
    }

    @Override // defpackage.x5
    public final void r() {
        t();
        u();
        this.c.start();
    }

    @Override // defpackage.x5
    public final void s() {
        this.j = null;
    }

    public final void t() {
        ObjectAnimator objectAnimator = this.c;
        br0 br0Var = this.f;
        sd sdVar = m;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, sdVar, 0.0f, 1.0f);
            this.c = ofFloat;
            ofFloat.setDuration((long) (br0Var.n * 1800.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new tq0(this, 0));
        }
        if (this.d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, sdVar, 1.0f);
            this.d = ofFloat2;
            ofFloat2.setDuration((long) (br0Var.n * 1800.0f));
            this.d.setInterpolator(null);
            this.d.addListener(new tq0(this, 1));
        }
    }

    public final void u() {
        this.g = 0;
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((d60) obj).c = this.f.e[0];
        }
    }
}
