package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class gy0 extends o31 implements Runnable {
    public static final p31 m;
    public final float[] h = new float[2];
    public i82 i;
    public float j;
    public h02 k;
    public View l;

    static {
        p31 a2 = p31.a(2, new gy0(null, 0.0f, null, null));
        m = a2;
        a2.f = 0.5f;
    }

    public gy0(i82 i82Var, float f, h02 h02Var, View view) {
        this.i = i82Var;
        this.j = f;
        this.k = h02Var;
        this.l = view;
    }

    @Override // defpackage.o31
    public final o31 a() {
        return new gy0(this.i, this.j, this.k, this.l);
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f = this.j;
        float[] fArr = this.h;
        fArr[0] = f;
        fArr[1] = 0.0f;
        this.k.f(fArr);
        this.i.a(fArr, this.l);
        m.c(this);
    }
}
