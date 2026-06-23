package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import com.github.mikephil.charting.charts.PieChart;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class i71 extends v00 {
    public PieChart f;
    public Paint g;
    public Paint h;
    public Paint i;
    public TextPaint j;
    public Paint k;
    public StaticLayout l;
    public CharSequence m;
    public RectF n;
    public RectF[] o;
    public WeakReference p;
    public Canvas q;
    public Path r;
    public RectF s;
    public Path t;
    public Path u;
    public RectF v;

    public static float s(it0 it0Var, float f, float f2, float f3, float f4, float f5, float f6) {
        double d = (f5 + f6) * 0.017453292f;
        float cos = (((float) Math.cos(d)) * f) + it0Var.h;
        float sin = (((float) Math.sin(d)) * f) + it0Var.i;
        double d2 = ((f6 / 2.0f) + f5) * 0.017453292f;
        float cos2 = (((float) Math.cos(d2)) * f) + it0Var.h;
        float sin2 = (((float) Math.sin(d2)) * f) + it0Var.i;
        return (float) ((f - ((float) (Math.tan(((180.0d - f2) / 2.0d) * 0.017453292519943295d) * (Math.sqrt(Math.pow(sin - f4, 2.0d) + Math.pow(cos - f3, 2.0d)) / 2.0d)))) - Math.sqrt(Math.pow(sin2 - ((sin + f4) / 2.0f), 2.0d) + Math.pow(cos2 - ((cos + f3) / 2.0f), 2.0d)));
    }

    @Override // defpackage.v00
    public final void m(Canvas canvas) {
        PieChart pieChart;
        int i;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        PieChart pieChart2;
        int i5;
        int i6;
        int i7;
        k71 k71Var;
        int i8;
        float f;
        float f2;
        RectF rectF;
        float f3;
        float f4;
        float f5;
        PieChart pieChart3 = this.f;
        i82 i82Var = (i82) this.f202a;
        int i9 = (int) i82Var.c;
        int i10 = (int) i82Var.d;
        WeakReference weakReference = this.p;
        Bitmap bitmap = weakReference == null ? null : (Bitmap) weakReference.get();
        if (bitmap == null || bitmap.getWidth() != i9 || bitmap.getHeight() != i10) {
            if (i9 <= 0 || i10 <= 0) {
                return;
            }
            bitmap = Bitmap.createBitmap(i9, i10, Bitmap.Config.ARGB_4444);
            this.p = new WeakReference(bitmap);
            this.q = new Canvas(bitmap);
        }
        int i11 = 0;
        bitmap.eraseColor(0);
        ArrayList arrayList2 = ((j71) pieChart3.getData()).i;
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            int i13 = i12 + 1;
            k71 k71Var2 = (k71) obj;
            boolean z = k71Var2.i;
            List list = k71Var2.j;
            if (!z || list.size() <= 0) {
                pieChart = pieChart3;
                i = i11;
                arrayList = arrayList2;
                i2 = size;
                i3 = i13;
            } else {
                RectF rectF2 = this.s;
                Path path = this.r;
                float rotationAngle = pieChart3.getRotationAngle();
                this.b.getClass();
                RectF circleBox = pieChart3.getCircleBox();
                int size2 = list.size();
                float[] drawAngles = pieChart3.getDrawAngles();
                it0 centerCircleBox = pieChart3.getCenterCircleBox();
                float radius = pieChart3.getRadius();
                i = i11;
                int i14 = (!pieChart3.Q || pieChart3.R) ? i : 1;
                float holeRadius = i14 != 0 ? (pieChart3.getHoleRadius() / 100.0f) * radius : 0.0f;
                float holeRadius2 = (radius - ((pieChart3.getHoleRadius() * radius) / 100.0f)) / 2.0f;
                RectF rectF3 = new RectF();
                int i15 = (i14 == 0 || !pieChart3.T) ? i : 1;
                arrayList = arrayList2;
                int i16 = i;
                int i17 = i16;
                while (i16 < size2) {
                    int i18 = i16;
                    if (Math.abs(((l71) k71Var2.g(i16)).g) > n52.d) {
                        i17++;
                    }
                    i16 = i18 + 1;
                }
                float f6 = i17 <= 1 ? 0.0f : k71Var2.o;
                float f7 = 0.0f;
                int i19 = i;
                while (i19 < size2) {
                    float f8 = drawAngles[i19];
                    if (Math.abs(k71Var2.g(i19).b()) <= n52.d) {
                        f3 = (f8 * 1.0f) + f7;
                        pieChart2 = pieChart3;
                        i6 = i19;
                        i7 = i17;
                        i4 = size;
                        i5 = i13;
                    } else {
                        i4 = size;
                        fj0[] fj0VarArr = pieChart3.E;
                        if (fj0VarArr != null) {
                            i5 = i13;
                            if (fj0VarArr.length <= 0 || fj0VarArr[i] == null) {
                                pieChart2 = pieChart3;
                            } else {
                                int i20 = i;
                                while (true) {
                                    fj0[] fj0VarArr2 = pieChart3.E;
                                    pieChart2 = pieChart3;
                                    if (i20 >= fj0VarArr2.length) {
                                        break;
                                    }
                                    if (((int) fj0VarArr2[i20].f283a) != i19) {
                                        i20++;
                                        pieChart3 = pieChart2;
                                    } else if (i15 == 0) {
                                        f3 = (f8 * 1.0f) + f7;
                                        i6 = i19;
                                        i7 = i17;
                                    }
                                }
                            }
                        } else {
                            pieChart2 = pieChart3;
                            i5 = i13;
                        }
                        int i21 = (f6 <= 0.0f || f8 > 180.0f) ? i : 1;
                        int e = k71Var2.e(i19);
                        Paint paint = this.c;
                        paint.setColor(e);
                        float f9 = i17 == 1 ? 0.0f : f6 / (radius * 0.017453292f);
                        int i22 = i21;
                        float f10 = (((f9 / 2.0f) + f7) * 1.0f) + rotationAngle;
                        float f11 = (f8 - f9) * 1.0f;
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        path.reset();
                        i6 = i19;
                        if (i15 != 0) {
                            float f12 = radius - holeRadius2;
                            i7 = i17;
                            double d = f10 * 0.017453292f;
                            float cos = (((float) Math.cos(d)) * f12) + centerCircleBox.h;
                            float sin = (f12 * ((float) Math.sin(d))) + centerCircleBox.i;
                            k71Var = k71Var2;
                            i8 = size2;
                            rectF3.set(cos - holeRadius2, sin - holeRadius2, cos + holeRadius2, sin + holeRadius2);
                        } else {
                            i7 = i17;
                            k71Var = k71Var2;
                            i8 = size2;
                        }
                        double d2 = f10 * 0.017453292f;
                        float cos2 = (((float) Math.cos(d2)) * radius) + centerCircleBox.h;
                        float sin2 = (((float) Math.sin(d2)) * radius) + centerCircleBox.i;
                        if (f11 < 360.0f || f11 % 360.0f > n52.d) {
                            f = sin2;
                            f2 = 360.0f;
                            if (i15 != 0) {
                                path.arcTo(rectF3, f10 + 180.0f, -180.0f);
                            }
                            path.arcTo(circleBox, f10, f11);
                        } else {
                            f2 = 360.0f;
                            f = sin2;
                            path.addCircle(centerCircleBox.h, centerCircleBox.i, radius, Path.Direction.CW);
                        }
                        float f13 = centerCircleBox.h;
                        float f14 = holeRadius;
                        float f15 = centerCircleBox.i;
                        float f16 = f11;
                        rectF2.set(f13 - f14, f15 - f14, f13 + f14, f15 + f14);
                        if (i14 == 0 || (f14 <= 0.0f && i22 == 0)) {
                            holeRadius = f14;
                            rectF = rectF3;
                            float f17 = f;
                            if (f16 % f2 > n52.d) {
                                if (i22 != 0) {
                                    float f18 = (f16 / 2.0f) + f10;
                                    float s = s(centerCircleBox, radius, f8 * 1.0f, cos2, f17, f10, f16);
                                    double d3 = f18 * 0.017453292f;
                                    path.lineTo((((float) Math.cos(d3)) * s) + centerCircleBox.h, (((float) Math.sin(d3)) * s) + centerCircleBox.i);
                                } else {
                                    path.lineTo(centerCircleBox.h, centerCircleBox.i);
                                }
                            }
                        } else {
                            RectF rectF4 = rectF3;
                            if (i22 != 0) {
                                f4 = f16;
                                float s2 = s(centerCircleBox, radius, f8 * 1.0f, cos2, f, f10, f4);
                                if (s2 < 0.0f) {
                                    s2 = -s2;
                                }
                                f5 = Math.max(f14, s2);
                            } else {
                                f4 = f16;
                                f5 = f14;
                            }
                            int i23 = i7;
                            float f19 = (i23 == 1 || f5 == 0.0f) ? 0.0f : f6 / (f5 * 0.017453292f);
                            float f20 = (((f19 / 2.0f) + f7) * 1.0f) + rotationAngle;
                            float f21 = (f8 - f19) * 1.0f;
                            if (f21 < 0.0f) {
                                f21 = 0.0f;
                            }
                            float f22 = f20 + f21;
                            if (f11 < 360.0f || f4 % f2 > n52.d) {
                                float f23 = centerCircleBox.h;
                                if (i15 != 0) {
                                    float f24 = radius - holeRadius2;
                                    holeRadius = f14;
                                    double d4 = f22 * 0.017453292f;
                                    float cos3 = (((float) Math.cos(d4)) * f24) + f23;
                                    float sin3 = (((float) Math.sin(d4)) * f24) + centerCircleBox.i;
                                    i7 = i23;
                                    rectF4.set(cos3 - holeRadius2, sin3 - holeRadius2, cos3 + holeRadius2, sin3 + holeRadius2);
                                    path.arcTo(rectF4, f22, 180.0f);
                                    rectF = rectF4;
                                } else {
                                    holeRadius = f14;
                                    i7 = i23;
                                    rectF = rectF4;
                                    float f25 = f5;
                                    double d5 = f22 * 0.017453292f;
                                    path.lineTo((f25 * ((float) Math.cos(d5))) + f23, (((float) Math.sin(d5)) * f25) + centerCircleBox.i);
                                }
                                path.arcTo(rectF2, f22, -f21);
                            } else {
                                path.addCircle(centerCircleBox.h, centerCircleBox.i, f5, Path.Direction.CCW);
                                holeRadius = f14;
                                i7 = i23;
                                rectF = rectF4;
                            }
                        }
                        path.close();
                        this.q.drawPath(path, paint);
                        f3 = (f8 * 1.0f) + f7;
                        f7 = f3;
                        i19 = i6 + 1;
                        rectF3 = rectF;
                        size = i4;
                        i13 = i5;
                        pieChart3 = pieChart2;
                        i17 = i7;
                        k71Var2 = k71Var;
                        size2 = i8;
                    }
                    k71Var = k71Var2;
                    i8 = size2;
                    rectF = rectF3;
                    f7 = f3;
                    i19 = i6 + 1;
                    rectF3 = rectF;
                    size = i4;
                    i13 = i5;
                    pieChart3 = pieChart2;
                    i17 = i7;
                    k71Var2 = k71Var;
                    size2 = i8;
                }
                pieChart = pieChart3;
                i2 = size;
                i3 = i13;
                it0.d(centerCircleBox);
            }
            i11 = i;
            arrayList2 = arrayList;
            size = i2;
            i12 = i3;
            pieChart3 = pieChart;
        }
    }

    @Override // defpackage.v00
    public final void n(Canvas canvas) {
        float radius;
        RectF rectF;
        it0 it0Var;
        Paint paint = this.g;
        Path path = this.t;
        Paint paint2 = this.h;
        PieChart pieChart = this.f;
        if (pieChart.Q && this.q != null) {
            float radius2 = pieChart.getRadius();
            float holeRadius = (pieChart.getHoleRadius() / 100.0f) * radius2;
            it0 centerCircleBox = pieChart.getCenterCircleBox();
            if (Color.alpha(paint.getColor()) > 0) {
                this.q.drawCircle(centerCircleBox.h, centerCircleBox.i, holeRadius, paint);
            }
            if (Color.alpha(paint2.getColor()) > 0 && pieChart.getTransparentCircleRadius() > pieChart.getHoleRadius()) {
                int alpha = paint2.getAlpha();
                float transparentCircleRadius = (pieChart.getTransparentCircleRadius() / 100.0f) * radius2;
                this.b.getClass();
                paint2.setAlpha((int) (alpha * 1.0f * 1.0f));
                path.reset();
                path.addCircle(centerCircleBox.h, centerCircleBox.i, transparentCircleRadius, Path.Direction.CW);
                path.addCircle(centerCircleBox.h, centerCircleBox.i, holeRadius, Path.Direction.CCW);
                this.q.drawPath(path, paint2);
                paint2.setAlpha(alpha);
            }
            it0.d(centerCircleBox);
        }
        canvas.drawBitmap((Bitmap) this.p.get(), 0.0f, 0.0f, (Paint) null);
        RectF rectF2 = this.n;
        CharSequence centerText = pieChart.getCenterText();
        if (!pieChart.b0 || centerText == null) {
            return;
        }
        it0 centerCircleBox2 = pieChart.getCenterCircleBox();
        it0 centerTextOffset = pieChart.getCenterTextOffset();
        float f = centerCircleBox2.h + centerTextOffset.h;
        float f2 = centerCircleBox2.i + centerTextOffset.i;
        if (!pieChart.Q || pieChart.R) {
            radius = pieChart.getRadius();
        } else {
            radius = (pieChart.getHoleRadius() / 100.0f) * pieChart.getRadius();
        }
        RectF[] rectFArr = this.o;
        RectF rectF3 = rectFArr[0];
        rectF3.left = f - radius;
        rectF3.top = f2 - radius;
        rectF3.right = f + radius;
        rectF3.bottom = f2 + radius;
        RectF rectF4 = rectFArr[1];
        rectF4.set(rectF3);
        float centerTextRadiusPercent = pieChart.getCenterTextRadiusPercent() / 100.0f;
        if (centerTextRadiusPercent > 0.0d) {
            rectF4.inset((rectF4.width() - (rectF4.width() * centerTextRadiusPercent)) / 2.0f, (rectF4.height() - (rectF4.height() * centerTextRadiusPercent)) / 2.0f);
        }
        if (centerText.equals(this.m) && rectF4.equals(rectF2)) {
            it0Var = centerCircleBox2;
            rectF = rectF3;
        } else {
            rectF2.set(rectF4);
            this.m = centerText;
            rectF = rectF3;
            it0Var = centerCircleBox2;
            this.l = new StaticLayout(centerText, 0, centerText.length(), this.j, (int) Math.max(Math.ceil(rectF2.width()), 1.0d), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        }
        float height = this.l.getHeight();
        canvas.save();
        Path path2 = this.u;
        path2.reset();
        path2.addOval(rectF, Path.Direction.CW);
        canvas.clipPath(path2);
        canvas.translate(rectF4.left, ((rectF4.height() - height) / 2.0f) + rectF4.top);
        this.l.draw(canvas);
        canvas.restore();
        it0.d(it0Var);
        it0.d(centerTextOffset);
    }

    @Override // defpackage.v00
    public final void o(Canvas canvas, fj0[] fj0VarArr) {
        k71 k71Var;
        PieChart pieChart;
        boolean z;
        int i;
        boolean z2;
        float f;
        float[] fArr;
        float f2;
        RectF rectF;
        float f3;
        float f4;
        float f5;
        RectF rectF2;
        float f6;
        float f7;
        fj0[] fj0VarArr2 = fj0VarArr;
        RectF rectF3 = this.s;
        Path path = this.r;
        PieChart pieChart2 = this.f;
        boolean z3 = pieChart2.Q && !pieChart2.R;
        if (z3 && pieChart2.T) {
            return;
        }
        this.b.getClass();
        float rotationAngle = pieChart2.getRotationAngle();
        float[] drawAngles = pieChart2.getDrawAngles();
        float[] absoluteAngles = pieChart2.getAbsoluteAngles();
        it0 centerCircleBox = pieChart2.getCenterCircleBox();
        float radius = pieChart2.getRadius();
        float holeRadius = z3 ? (pieChart2.getHoleRadius() / 100.0f) * radius : 0.0f;
        RectF rectF4 = this.v;
        rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
        float f8 = 0.0f;
        int i2 = 0;
        while (i2 < fj0VarArr2.length) {
            int i3 = (int) fj0VarArr2[i2].f283a;
            if (i3 < drawAngles.length) {
                j71 j71Var = (j71) pieChart2.getData();
                if (fj0VarArr[i2].e == 0) {
                    k71Var = j71Var.l();
                } else {
                    j71Var.getClass();
                    k71Var = null;
                }
                if (k71Var != null) {
                    int size = k71Var.j.size();
                    pieChart = pieChart2;
                    z = z3;
                    int i4 = 0;
                    int i5 = 0;
                    while (i4 < size) {
                        int i6 = i4;
                        if (Math.abs(((l71) k71Var.g(i4)).g) > n52.d) {
                            i5++;
                        }
                        i4 = i6 + 1;
                    }
                    float f9 = i3 == 0 ? f8 : absoluteAngles[i3 - 1] * 1.0f;
                    float f10 = i5 <= 1 ? f8 : k71Var.o;
                    float f11 = drawAngles[i3];
                    float f12 = f10;
                    float f13 = k71Var.p;
                    i = i2;
                    float f14 = radius + f13;
                    float f15 = f9;
                    rectF4.set(pieChart.getCircleBox());
                    float f16 = -f13;
                    rectF4.inset(f16, f16);
                    boolean z4 = f12 > f8 && f11 <= 180.0f;
                    int e = k71Var.e(i3);
                    Paint paint = this.c;
                    paint.setColor(e);
                    float f17 = i5 == 1 ? f8 : f12 / (radius * 0.017453292f);
                    float f18 = i5 == 1 ? f8 : f12 / (f14 * 0.017453292f);
                    float f19 = (((f17 / 2.0f) + f15) * 1.0f) + rotationAngle;
                    float f20 = (f11 - f17) * 1.0f;
                    if (f20 < f8) {
                        f20 = f8;
                    }
                    float f21 = (((f18 / 2.0f) + f15) * 1.0f) + rotationAngle;
                    float f22 = (f11 - f18) * 1.0f;
                    if (f22 < f8) {
                        f22 = f8;
                    }
                    path.reset();
                    if (f20 < 360.0f || f20 % 360.0f > n52.d) {
                        z2 = z4;
                        f = rotationAngle;
                        fArr = drawAngles;
                        double d = f21 * 0.017453292f;
                        path.moveTo((((float) Math.cos(d)) * f14) + centerCircleBox.h, (f14 * ((float) Math.sin(d))) + centerCircleBox.i);
                        path.arcTo(rectF4, f21, f22);
                    } else {
                        z2 = z4;
                        path.addCircle(centerCircleBox.h, centerCircleBox.i, f14, Path.Direction.CW);
                        f = rotationAngle;
                        fArr = drawAngles;
                    }
                    if (z2) {
                        double d2 = f19 * 0.017453292f;
                        f2 = holeRadius;
                        rectF = rectF4;
                        f3 = f8;
                        f4 = f19;
                        f5 = s(centerCircleBox, radius, f11 * 1.0f, (((float) Math.cos(d2)) * radius) + centerCircleBox.h, (((float) Math.sin(d2)) * radius) + centerCircleBox.i, f4, f20);
                    } else {
                        f2 = holeRadius;
                        rectF = rectF4;
                        f3 = f8;
                        f4 = f19;
                        f5 = f3;
                    }
                    float f23 = centerCircleBox.h;
                    float f24 = centerCircleBox.i;
                    rectF3.set(f23 - f2, f24 - f2, f23 + f2, f24 + f2);
                    if (!z || (f2 <= f3 && !z2)) {
                        rectF2 = rectF3;
                        if (f20 % 360.0f > n52.d) {
                            float f25 = centerCircleBox.h;
                            if (z2) {
                                double d3 = ((f20 / 2.0f) + f4) * 0.017453292f;
                                f6 = f2;
                                path.lineTo((((float) Math.cos(d3)) * f5) + f25, (f5 * ((float) Math.sin(d3))) + centerCircleBox.i);
                            } else {
                                f6 = f2;
                                path.lineTo(f25, centerCircleBox.i);
                            }
                            path.close();
                            this.q.drawPath(path, paint);
                            holeRadius = f6;
                            rectF3 = rectF2;
                            pieChart2 = pieChart;
                            z3 = z;
                            rotationAngle = f;
                            drawAngles = fArr;
                            f8 = 0.0f;
                            rectF4 = rectF;
                            i2 = i + 1;
                            fj0VarArr2 = fj0VarArr;
                        }
                    } else {
                        if (z2) {
                            if (f5 < f3) {
                                f5 = -f5;
                            }
                            f7 = Math.max(f2, f5);
                        } else {
                            f7 = f2;
                        }
                        float f26 = (i5 == 1 || f7 == f3) ? f3 : f12 / (f7 * 0.017453292f);
                        float f27 = (((f26 / 2.0f) + f15) * 1.0f) + f;
                        float f28 = (f11 - f26) * 1.0f;
                        if (f28 < f3) {
                            f28 = f3;
                        }
                        float f29 = f27 + f28;
                        if (f20 < 360.0f || f20 % 360.0f > n52.d) {
                            double d4 = f29 * 0.017453292f;
                            rectF2 = rectF3;
                            path.lineTo((((float) Math.cos(d4)) * f7) + centerCircleBox.h, (f7 * ((float) Math.sin(d4))) + centerCircleBox.i);
                            path.arcTo(rectF2, f29, -f28);
                        } else {
                            path.addCircle(centerCircleBox.h, centerCircleBox.i, f7, Path.Direction.CCW);
                            rectF2 = rectF3;
                        }
                    }
                    f6 = f2;
                    path.close();
                    this.q.drawPath(path, paint);
                    holeRadius = f6;
                    rectF3 = rectF2;
                    pieChart2 = pieChart;
                    z3 = z;
                    rotationAngle = f;
                    drawAngles = fArr;
                    f8 = 0.0f;
                    rectF4 = rectF;
                    i2 = i + 1;
                    fj0VarArr2 = fj0VarArr;
                }
            }
            pieChart = pieChart2;
            z = z3;
            i = i2;
            f = rotationAngle;
            fArr = drawAngles;
            rectF = rectF4;
            rectF2 = rectF3;
            f6 = holeRadius;
            holeRadius = f6;
            rectF3 = rectF2;
            pieChart2 = pieChart;
            z3 = z;
            rotationAngle = f;
            drawAngles = fArr;
            f8 = 0.0f;
            rectF4 = rectF;
            i2 = i + 1;
            fj0VarArr2 = fj0VarArr;
        }
        it0.d(centerCircleBox);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    @Override // defpackage.v00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(android.graphics.Canvas r51) {
        /*
            Method dump skipped, instructions count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i71.p(android.graphics.Canvas):void");
    }

    @Override // defpackage.v00
    public final void q() {
    }
}
