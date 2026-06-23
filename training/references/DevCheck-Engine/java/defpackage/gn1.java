package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class gn1 extends ln1 {
    public final in1 c;

    public gn1(in1 in1Var) {
        this.c = in1Var;
    }

    @Override // defpackage.ln1
    public final void a(Matrix matrix, zm1 zm1Var, int i, Canvas canvas) {
        in1 in1Var = this.c;
        float f = in1Var.f;
        float f2 = in1Var.g;
        RectF rectF = new RectF(in1Var.b, in1Var.c, in1Var.d, in1Var.e);
        Paint paint = zm1Var.b;
        boolean z = f2 < 0.0f;
        Path path = zm1Var.g;
        int[] iArr = zm1.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = zm1Var.f;
            iArr[2] = zm1Var.e;
            iArr[3] = zm1Var.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = zm1Var.d;
            iArr[2] = zm1Var.e;
            iArr[3] = zm1Var.f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f4 = 1.0f - (i / width);
        float[] fArr = zm1.l;
        fArr[1] = f4;
        fArr[2] = ((1.0f - f4) / 2.0f) + f4;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, zm1Var.h);
        }
        canvas.drawArc(rectF, f, f2, true, paint);
        canvas.restore();
    }
}
