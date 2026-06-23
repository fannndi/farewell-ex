package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class hd2 extends pb {
    public final gd2 h;
    public final Path i;
    public final RectF j;
    public float[] k;
    public final Path l;
    public final float[] m;
    public final RectF n;

    public hd2(i82 i82Var, gd2 gd2Var, h02 h02Var) {
        super(i82Var, h02Var, gd2Var);
        this.i = new Path();
        this.j = new RectF();
        this.k = new float[2];
        new Path();
        new RectF();
        this.l = new Path();
        this.m = new float[2];
        this.n = new RectF();
        this.h = gd2Var;
        if (i82Var != null) {
            this.e.setColor(-16777216);
            this.e.setTextSize(n52.c(10.0f));
            Paint paint = new Paint(1);
            paint.setColor(-7829368);
            paint.setStrokeWidth(1.0f);
            paint.setStyle(Paint.Style.STROKE);
        }
    }

    public void n(Canvas canvas, float f, float[] fArr, float f2) {
        gd2 gd2Var = this.h;
        boolean z = gd2Var.B;
        int i = gd2Var.l;
        if (!z) {
            i--;
        }
        for (int i2 = !gd2Var.A ? 1 : 0; i2 < i; i2++) {
            canvas.drawText(gd2Var.c(i2), f, fArr[(i2 * 2) + 1] + f2, this.e);
        }
    }

    public RectF o() {
        RectF rectF = ((i82) this.f202a).b;
        RectF rectF2 = this.j;
        rectF2.set(rectF);
        rectF2.inset(0.0f, -this.b.h);
        return rectF2;
    }

    public float[] p() {
        int length = this.k.length;
        gd2 gd2Var = this.h;
        int i = gd2Var.l;
        if (length != i * 2) {
            this.k = new float[i * 2];
        }
        float[] fArr = this.k;
        for (int i2 = 0; i2 < fArr.length; i2 += 2) {
            fArr[i2 + 1] = gd2Var.k[i2 / 2];
        }
        this.c.f(fArr);
        return fArr;
    }

    public Path q(Path path, int i, float[] fArr) {
        i82 i82Var = (i82) this.f202a;
        int i2 = i + 1;
        path.moveTo(i82Var.b.left, fArr[i2]);
        path.lineTo(i82Var.b.right, fArr[i2]);
        return path;
    }

    public void r(Canvas canvas) {
        float f;
        float f2;
        float f3;
        i82 i82Var = (i82) this.f202a;
        gd2 gd2Var = this.h;
        if (gd2Var.f53a && gd2Var.q) {
            float[] p = p();
            Paint paint = this.e;
            paint.setTypeface(null);
            paint.setTextSize(gd2Var.d);
            paint.setColor(gd2Var.e);
            float f4 = gd2Var.b;
            float a2 = (n52.a(paint, "A") / 2.5f) + gd2Var.c;
            int i = gd2Var.F;
            int i2 = gd2Var.E;
            if (i == 1) {
                if (i2 == 1) {
                    paint.setTextAlign(Paint.Align.RIGHT);
                    f = i82Var.b.left;
                    f3 = f - f4;
                } else {
                    paint.setTextAlign(Paint.Align.LEFT);
                    f2 = i82Var.b.left;
                    f3 = f2 + f4;
                }
            } else if (i2 == 1) {
                paint.setTextAlign(Paint.Align.LEFT);
                f2 = i82Var.b.right;
                f3 = f2 + f4;
            } else {
                paint.setTextAlign(Paint.Align.RIGHT);
                f = i82Var.b.right;
                f3 = f - f4;
            }
            n(canvas, f3, p, a2);
        }
    }

    public void s(Canvas canvas) {
        gd2 gd2Var = this.h;
        if (gd2Var.f53a && gd2Var.p) {
            int i = gd2Var.i;
            Paint paint = this.f;
            paint.setColor(i);
            paint.setStrokeWidth(gd2Var.j);
            int i2 = gd2Var.F;
            i82 i82Var = (i82) this.f202a;
            if (i2 == 1) {
                RectF rectF = i82Var.b;
                float f = rectF.left;
                canvas.drawLine(f, rectF.top, f, rectF.bottom, paint);
            } else {
                RectF rectF2 = i82Var.b;
                float f2 = rectF2.right;
                canvas.drawLine(f2, rectF2.top, f2, rectF2.bottom, paint);
            }
        }
    }

    public final void t(Canvas canvas) {
        gd2 gd2Var = this.h;
        if (gd2Var.f53a && gd2Var.o) {
            int save = canvas.save();
            canvas.clipRect(o());
            float[] p = p();
            int i = gd2Var.g;
            Paint paint = this.d;
            paint.setColor(i);
            paint.setStrokeWidth(gd2Var.h);
            paint.setPathEffect(null);
            Path path = this.i;
            path.reset();
            for (int i2 = 0; i2 < p.length; i2 += 2) {
                canvas.drawPath(q(path, i2, p), paint);
                path.reset();
            }
            canvas.restoreToCount(save);
        }
    }

    public void u(Canvas canvas) {
        int i;
        i82 i82Var = (i82) this.f202a;
        ArrayList arrayList = this.h.r;
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        float[] fArr = this.m;
        int i2 = 0;
        float f = 0.0f;
        fArr[0] = 0.0f;
        int i3 = 1;
        fArr[1] = 0.0f;
        Path path = this.l;
        path.reset();
        while (i2 < arrayList.size()) {
            kq0 kq0Var = (kq0) arrayList.get(i2);
            if (kq0Var.f53a) {
                int save = canvas.save();
                RectF rectF = i82Var.b;
                RectF rectF2 = i82Var.b;
                RectF rectF3 = this.n;
                rectF3.set(rectF);
                rectF3.inset(f, -kq0Var.g);
                canvas.clipRect(rectF3);
                Paint.Style style = Paint.Style.STROKE;
                Paint paint = this.g;
                paint.setStyle(style);
                paint.setColor(kq0Var.h);
                paint.setStrokeWidth(kq0Var.g);
                paint.setPathEffect(kq0Var.k);
                fArr[i3] = kq0Var.f;
                this.c.f(fArr);
                path.moveTo(rectF2.left, fArr[i3]);
                path.lineTo(rectF2.right, fArr[i3]);
                canvas.drawPath(path, paint);
                path.reset();
                String str = kq0Var.j;
                if (str == null || str.equals("")) {
                    i = i3;
                } else {
                    paint.setStyle(kq0Var.i);
                    paint.setPathEffect(null);
                    paint.setColor(kq0Var.e);
                    paint.setTypeface(null);
                    paint.setStrokeWidth(0.5f);
                    paint.setTextSize(kq0Var.d);
                    float a2 = n52.a(paint, str);
                    float c = n52.c(4.0f) + kq0Var.b;
                    int i4 = i3;
                    float f2 = kq0Var.g + a2 + kq0Var.c;
                    int i5 = kq0Var.l;
                    if (i5 == 3) {
                        paint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(str, rectF2.right - c, (fArr[i4] - f2) + a2, paint);
                    } else if (i5 == 4) {
                        paint.setTextAlign(Paint.Align.RIGHT);
                        canvas.drawText(str, rectF2.right - c, fArr[i4] + f2, paint);
                    } else {
                        i = i4;
                        if (i5 == i) {
                            paint.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(str, rectF2.left + c, (fArr[i] - f2) + a2, paint);
                        } else {
                            paint.setTextAlign(Paint.Align.LEFT);
                            canvas.drawText(str, rectF2.left + c, fArr[i] + f2, paint);
                        }
                    }
                    i = i4;
                }
                canvas.restoreToCount(save);
            } else {
                i = i3;
            }
            i2++;
            i3 = i;
            f = 0.0f;
        }
    }
}
