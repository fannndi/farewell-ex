package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes.dex */
public final class gz extends fd2 {
    @Override // defpackage.fd2, defpackage.ed2
    public final void p(Canvas canvas, float f, it0 it0Var) {
        dd2 dd2Var = this.h;
        dd2Var.getClass();
        int i = dd2Var.l * 2;
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2 += 2) {
            fArr[i2 + 1] = dd2Var.k[i2 / 2];
        }
        this.c.f(fArr);
        for (int i3 = 0; i3 < i; i3 += 2) {
            float f2 = fArr[i3 + 1];
            if (((i82) this.f202a).h(f2)) {
                String a2 = dd2Var.e().a(dd2Var.k[i3 / 2]);
                boolean contains = a2.contains("\n");
                Paint paint = this.e;
                if (contains) {
                    String[] split = a2.split("\n");
                    float f3 = f - 10.0f;
                    n52.d(canvas, split[0], f3, f2 - 20.0f, paint, it0Var);
                    n52.d(canvas, split[1], f3, (paint.getTextSize() + f2) - 20.0f, paint, it0Var);
                } else {
                    n52.d(canvas, a2, f - 10.0f, f2, paint, it0Var);
                }
            }
        }
    }
}
