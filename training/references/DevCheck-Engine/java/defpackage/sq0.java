package defpackage;

import android.animation.ObjectAnimator;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class sq0 extends x5 {
    public static final sd i = new sd(Float.class, "animationFraction", 11);
    public ObjectAnimator c;
    public final za0 d;
    public final br0 e;
    public int f;
    public boolean g;
    public float h;

    public sq0(br0 br0Var) {
        super(3);
        this.f = 1;
        this.e = br0Var;
        this.d = new za0(1);
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
        this.c.setDuration((long) (this.e.n * 333.0f));
        u();
    }

    @Override // defpackage.x5
    public final void o(wd wdVar) {
    }

    @Override // defpackage.x5
    public final void p() {
    }

    @Override // defpackage.x5
    public final void r() {
        t();
        u();
        this.c.start();
    }

    @Override // defpackage.x5
    public final void s() {
    }

    public final void t() {
        if (this.c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, i, 0.0f, 1.0f);
            this.c = ofFloat;
            ofFloat.setDuration((long) (this.e.n * 333.0f));
            this.c.setInterpolator(null);
            this.c.setRepeatCount(-1);
            this.c.addListener(new r1(7, this));
        }
    }

    public final void u() {
        this.g = true;
        this.f = 1;
        ArrayList arrayList = (ArrayList) this.b;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            d60 d60Var = (d60) obj;
            br0 br0Var = this.e;
            d60Var.c = br0Var.e[0];
            d60Var.d = br0Var.i / 2;
        }
    }
}
