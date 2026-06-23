package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class hn1 extends ln1 {
    public final jn1 c;
    public final float d;
    public final float e;

    public hn1(jn1 jn1Var, float f, float f2) {
        this.c = jn1Var;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.ln1
    public final void a(Matrix matrix, zm1 zm1Var, int i, Canvas canvas) {
        jn1 jn1Var = this.c;
        float f = jn1Var.c;
        float f2 = this.e;
        float f3 = jn1Var.b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.f599a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        zm1Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i2 = zm1Var.f;
        int[] iArr = zm1.i;
        iArr[0] = i2;
        iArr[1] = zm1Var.e;
        iArr[2] = zm1Var.d;
        Paint paint = zm1Var.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, zm1.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        jn1 jn1Var = this.c;
        return (float) Math.toDegrees(Math.atan((jn1Var.c - this.e) / (jn1Var.b - this.d)));
    }
}
