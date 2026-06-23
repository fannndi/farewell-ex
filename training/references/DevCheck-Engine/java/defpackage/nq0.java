package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import com.github.mikephil.charting.charts.LineChart;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class nq0 extends hd {
    public Path g;
    public LineChart h;
    public Paint i;
    public WeakReference j;
    public Canvas k;
    public Bitmap.Config l;
    public Path m;
    public float[] n;
    public HashMap o;
    public float[] p;

    @Override // defpackage.v00
    public final void m(Canvas canvas) {
        LineChart lineChart;
        i82 i82Var;
        int i;
        ArrayList arrayList;
        PathEffect pathEffect;
        int i2;
        i82 i82Var2;
        LineChart lineChart2 = this.h;
        i82 i82Var3 = (i82) this.f202a;
        int i3 = (int) i82Var3.c;
        int i4 = (int) i82Var3.d;
        WeakReference weakReference = this.j;
        PathEffect pathEffect2 = null;
        Bitmap bitmap = weakReference == null ? null : (Bitmap) weakReference.get();
        if (bitmap == null || bitmap.getWidth() != i3 || bitmap.getHeight() != i4) {
            if (i3 <= 0 || i4 <= 0) {
                return;
            }
            bitmap = Bitmap.createBitmap(i3, i4, this.l);
            this.j = new WeakReference(bitmap);
            this.k = new Canvas(bitmap);
        }
        int i5 = 0;
        bitmap.eraseColor(0);
        ArrayList arrayList2 = lineChart2.getLineData().i;
        int size = arrayList2.size();
        int i6 = 0;
        while (true) {
            Paint paint = this.c;
            if (i6 >= size) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                return;
            }
            Object obj = arrayList2.get(i6);
            i6++;
            pq0 pq0Var = (pq0) obj;
            if (pq0Var.i) {
                Path path = this.m;
                List list = pq0Var.j;
                if (list.size() >= 1) {
                    paint.setStrokeWidth(pq0Var.s);
                    paint.setPathEffect(pathEffect2);
                    int A = d51.A(pq0Var.t);
                    int i7 = i5;
                    np npVar = this.b;
                    gd gdVar = this.f;
                    if (A != 2) {
                        if (A != 3) {
                            int size2 = list.size();
                            int i8 = pq0Var.t == 2 ? 1 : i7;
                            int i9 = i8 != 0 ? 4 : 2;
                            h02 h02Var = lineChart2.f0;
                            npVar.getClass();
                            paint.setStyle(Paint.Style.STROKE);
                            gdVar.d(lineChart2, pq0Var);
                            int size3 = pq0Var.f1104a.size();
                            arrayList = arrayList2;
                            float[] fArr = this.n;
                            i2 = size;
                            if (size3 > 1) {
                                int length = fArr.length;
                                int i10 = i9 * 2;
                                if (length <= i10) {
                                    this.n = new float[i9 * 4];
                                }
                                int i11 = gdVar.f333a;
                                while (i11 <= gdVar.c + gdVar.f333a) {
                                    e90 g = pq0Var.g(i11);
                                    if (g != null) {
                                        this.n[i7] = g.a();
                                        this.n[1] = g.b() * 1.0f;
                                        if (i11 < gdVar.b) {
                                            e90 g2 = pq0Var.g(i11 + 1);
                                            if (g2 == null) {
                                                break;
                                            }
                                            float[] fArr2 = this.n;
                                            if (i8 != 0) {
                                                fArr2[2] = g2.a();
                                                float[] fArr3 = this.n;
                                                float f = fArr3[1];
                                                fArr3[3] = f;
                                                fArr3[4] = fArr3[2];
                                                fArr3[5] = f;
                                                fArr3[6] = g2.a();
                                                this.n[7] = g2.b() * 1.0f;
                                            } else {
                                                fArr2[2] = g2.a();
                                                this.n[3] = g2.b() * 1.0f;
                                            }
                                        } else {
                                            float[] fArr4 = this.n;
                                            fArr4[2] = fArr4[i7];
                                            fArr4[3] = fArr4[1];
                                        }
                                        h02Var.f(this.n);
                                        if (!i82Var3.f(this.n[i7])) {
                                            break;
                                        }
                                        if (i82Var3.e(this.n[2]) && (i82Var3.g(this.n[1]) || i82Var3.d(this.n[3]))) {
                                            paint.setColor(pq0Var.e(i11));
                                            canvas.drawLines(this.n, i7, i10, paint);
                                        }
                                    }
                                    i11++;
                                    i7 = 0;
                                }
                            } else {
                                int i12 = size2 * i9;
                                if (fArr.length < Math.max(i12, i9) * 2) {
                                    this.n = new float[Math.max(i12, i9) * 4];
                                }
                                if (pq0Var.g(gdVar.f333a) != null) {
                                    int i13 = gdVar.f333a;
                                    int i14 = 0;
                                    while (i13 <= gdVar.c + gdVar.f333a) {
                                        e90 g3 = pq0Var.g(i13 == 0 ? 0 : i13 - 1);
                                        e90 g4 = pq0Var.g(i13);
                                        if (g3 == null || g4 == null) {
                                            i82Var2 = i82Var3;
                                        } else {
                                            i82Var2 = i82Var3;
                                            this.n[i14] = g3.a();
                                            int i15 = i14 + 2;
                                            this.n[i14 + 1] = g3.b() * 1.0f;
                                            if (i8 != 0) {
                                                this.n[i15] = g4.a();
                                                this.n[i14 + 3] = g3.b() * 1.0f;
                                                this.n[i14 + 4] = g4.a();
                                                i15 = i14 + 6;
                                                this.n[i14 + 5] = g3.b() * 1.0f;
                                            }
                                            this.n[i15] = g4.a();
                                            this.n[i15 + 1] = g4.b() * 1.0f;
                                            i14 = i15 + 2;
                                        }
                                        i13++;
                                        i82Var3 = i82Var2;
                                    }
                                    i82Var = i82Var3;
                                    if (i14 > 0) {
                                        h02Var.f(this.n);
                                        int max = Math.max((gdVar.c + 1) * i9, i9) * 2;
                                        paint.setColor(pq0Var.d());
                                        canvas.drawLines(this.n, 0, max, paint);
                                    }
                                    pathEffect = null;
                                    paint.setPathEffect(null);
                                }
                            }
                            i82Var = i82Var3;
                            pathEffect = null;
                            paint.setPathEffect(null);
                        } else {
                            i82Var = i82Var3;
                            arrayList = arrayList2;
                            i2 = size;
                            npVar.getClass();
                            h02 h02Var2 = lineChart2.f0;
                            gdVar.d(lineChart2, pq0Var);
                            path.reset();
                            if (gdVar.c >= 1) {
                                e90 g5 = pq0Var.g(gdVar.f333a);
                                path.moveTo(g5.a(), g5.b() * 1.0f);
                                int i16 = gdVar.f333a + 1;
                                while (i16 <= gdVar.c + gdVar.f333a) {
                                    e90 g6 = pq0Var.g(i16);
                                    float a2 = ((g6.a() - g5.a()) / 2.0f) + g5.a();
                                    path.cubicTo(a2, g5.b() * 1.0f, a2, g6.b() * 1.0f, g6.a(), g6.b() * 1.0f);
                                    i16++;
                                    g5 = g6;
                                    gdVar = gdVar;
                                }
                            }
                            paint.setColor(pq0Var.d());
                            paint.setStyle(Paint.Style.STROKE);
                            h02Var2.d(path);
                            this.k.drawPath(path, paint);
                            pathEffect = null;
                            paint.setPathEffect(null);
                        }
                        lineChart = lineChart2;
                        i = 0;
                    } else {
                        i82Var = i82Var3;
                        arrayList = arrayList2;
                        i2 = size;
                        npVar.getClass();
                        h02 h02Var3 = lineChart2.f0;
                        gdVar.d(lineChart2, pq0Var);
                        float f2 = pq0Var.y;
                        path.reset();
                        if (gdVar.c >= 1) {
                            int i17 = gdVar.f333a;
                            e90 g7 = pq0Var.g(Math.max(i17 - 1, 0));
                            e90 g8 = pq0Var.g(Math.max(i17, 0));
                            if (g8 == null) {
                                lineChart = lineChart2;
                                i = 0;
                                pathEffect = null;
                            } else {
                                path.moveTo(g8.a(), g8.b() * 1.0f);
                                int i18 = gdVar.f333a + 1;
                                int i19 = -1;
                                lineChart = lineChart2;
                                e90 e90Var = g8;
                                while (i18 <= gdVar.c + gdVar.f333a) {
                                    if (i19 != i18) {
                                        g8 = pq0Var.g(i18);
                                    }
                                    int i20 = i18 + 1;
                                    if (i20 < list.size()) {
                                        i18 = i20;
                                    }
                                    e90 g9 = pq0Var.g(i18);
                                    int i21 = i18;
                                    path.cubicTo(e90Var.a() + ((g8.a() - g7.a()) * f2), (e90Var.b() + ((g8.b() - g7.b()) * f2)) * 1.0f, g8.a() - ((g9.a() - e90Var.a()) * f2), (g8.b() - ((g9.b() - e90Var.b()) * f2)) * 1.0f, g8.a(), g8.b() * 1.0f);
                                    i18 = i20;
                                    i19 = i21;
                                    g7 = e90Var;
                                    e90Var = g8;
                                    g8 = g9;
                                }
                            }
                        } else {
                            lineChart = lineChart2;
                        }
                        i = 0;
                        paint.setColor(pq0Var.d());
                        paint.setStyle(Paint.Style.STROKE);
                        h02Var3.d(path);
                        this.k.drawPath(path, paint);
                        pathEffect = null;
                        paint.setPathEffect(null);
                    }
                    paint.setPathEffect(pathEffect);
                    pathEffect2 = pathEffect;
                    i5 = i;
                    arrayList2 = arrayList;
                    size = i2;
                    i82Var3 = i82Var;
                    lineChart2 = lineChart;
                }
            }
            lineChart = lineChart2;
            i82Var = i82Var3;
            i = i5;
            arrayList = arrayList2;
            pathEffect = pathEffect2;
            i2 = size;
            pathEffect2 = pathEffect;
            i5 = i;
            arrayList2 = arrayList;
            size = i2;
            i82Var3 = i82Var;
            lineChart2 = lineChart;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0124  */
    @Override // defpackage.v00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(android.graphics.Canvas r28) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq0.n(android.graphics.Canvas):void");
    }

    @Override // defpackage.v00
    public final void o(Canvas canvas, fj0[] fj0VarArr) {
        LineChart lineChart = this.h;
        oq0 lineData = lineChart.getLineData();
        for (fj0 fj0Var : fj0VarArr) {
            pq0 pq0Var = (pq0) lineData.e(fj0Var.e);
            if (pq0Var != null) {
                e90 h = pq0Var.h(fj0Var.f283a, fj0Var.b, 3);
                if (s(h, pq0Var)) {
                    h02 h02Var = lineChart.f0;
                    float a2 = h.a();
                    float b = h.b();
                    this.b.getClass();
                    ht0 a3 = h02Var.a(a2, b * 1.0f);
                    float f = (float) a3.h;
                    float f2 = (float) a3.i;
                    i82 i82Var = (i82) this.f202a;
                    Path path = this.g;
                    this.d.setColor(pq0Var.o);
                    this.d.setStrokeWidth(pq0Var.r);
                    this.d.setPathEffect(null);
                    if (pq0Var.p) {
                        path.reset();
                        path.moveTo(f, i82Var.b.top);
                        path.lineTo(f, i82Var.b.bottom);
                        canvas.drawPath(path, this.d);
                    }
                    if (pq0Var.q) {
                        path.reset();
                        path.moveTo(i82Var.b.left, f2);
                        path.lineTo(i82Var.b.right, f2);
                        canvas.drawPath(path, this.d);
                    }
                }
            }
        }
    }

    @Override // defpackage.v00
    public final void p(Canvas canvas) {
        i82 i82Var;
        LineChart lineChart;
        i82 i82Var2;
        LineChart lineChart2;
        i82 i82Var3 = (i82) this.f202a;
        LineChart lineChart3 = this.h;
        if (r(lineChart3)) {
            ArrayList arrayList = lineChart3.getLineData().i;
            int i = 0;
            while (i < arrayList.size()) {
                pq0 pq0Var = (pq0) arrayList.get(i);
                if (!hd.t(pq0Var) || pq0Var.j.size() < 1) {
                    i82Var = i82Var3;
                    lineChart = lineChart3;
                } else {
                    l(pq0Var);
                    h02 h02Var = lineChart3.f0;
                    int i2 = (int) (pq0Var.w * 1.75f);
                    if (!pq0Var.z) {
                        i2 /= 2;
                    }
                    gd gdVar = this.f;
                    gdVar.d(lineChart3, pq0Var);
                    this.b.getClass();
                    int i3 = gdVar.f333a;
                    int i4 = (((int) ((gdVar.b - i3) * 1.0f)) + 1) * 2;
                    if (((float[]) h02Var.d).length != i4) {
                        h02Var.d = new float[i4];
                    }
                    float[] fArr = (float[]) h02Var.d;
                    for (int i5 = 0; i5 < i4; i5 += 2) {
                        e90 g = pq0Var.g((i5 / 2) + i3);
                        if (g != null) {
                            fArr[i5] = g.a();
                            fArr[i5 + 1] = g.b() * 1.0f;
                        } else {
                            fArr[i5] = 0.0f;
                            fArr[i5 + 1] = 0.0f;
                        }
                    }
                    Matrix matrix = (Matrix) h02Var.g;
                    matrix.set((Matrix) h02Var.f358a);
                    matrix.postConcat(((i82) h02Var.c).f417a);
                    matrix.postConcat((Matrix) h02Var.b);
                    matrix.mapPoints(fArr);
                    q52 j = pq0Var.j();
                    it0 c = it0.c(pq0Var.g);
                    c.h = n52.c(c.h);
                    c.i = n52.c(c.i);
                    int i6 = 0;
                    while (i6 < fArr.length) {
                        float f = fArr[i6];
                        float f2 = fArr[i6 + 1];
                        if (!i82Var3.f(f)) {
                            break;
                        }
                        if (i82Var3.e(f) && i82Var3.h(f2)) {
                            int i7 = i6 / 2;
                            e90 g2 = pq0Var.g(gdVar.f333a + i7);
                            i82Var2 = i82Var3;
                            if (pq0Var.e) {
                                j.getClass();
                                lineChart2 = lineChart3;
                                int k = pq0Var.k(i7);
                                Paint paint = this.e;
                                paint.setColor(k);
                                canvas.drawText(j.a(g2.b()), f, f2 - i2, paint);
                            } else {
                                lineChart2 = lineChart3;
                            }
                            g2.getClass();
                        } else {
                            i82Var2 = i82Var3;
                            lineChart2 = lineChart3;
                        }
                        i6 += 2;
                        i82Var3 = i82Var2;
                        lineChart3 = lineChart2;
                    }
                    i82Var = i82Var3;
                    lineChart = lineChart3;
                    it0.d(c);
                }
                i++;
                i82Var3 = i82Var;
                lineChart3 = lineChart;
            }
        }
    }

    @Override // defpackage.v00
    public final void q() {
    }
}
