package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class tp0 extends dn2 {
    public Paint b;
    public Paint c;
    public qp0 d;
    public ArrayList e;
    public Paint.FontMetrics f;
    public Path g;

    public final void l(op opVar) {
        ArrayList arrayList;
        String str;
        float f;
        float f2;
        Paint paint = this.b;
        qp0 qp0Var = this.d;
        qp0Var.getClass();
        ArrayList arrayList2 = this.e;
        arrayList2.clear();
        for (int i = 0; i < opVar.f(); i++) {
            rk0 e = opVar.e(i);
            ArrayList arrayList3 = ((w00) e).f1104a;
            w00 w00Var = (w00) e;
            String str2 = w00Var.c;
            int size = w00Var.j.size();
            if (e instanceof jc) {
                jc jcVar = (jc) e;
                if (jcVar.n()) {
                    String[] strArr = jcVar.t;
                    for (int i2 = 0; i2 < arrayList3.size() && i2 < jcVar.p; i2++) {
                        arrayList2.add(new rp0(3, strArr[i2 % strArr.length], ((Integer) arrayList3.get(i2)).intValue()));
                    }
                    if (jcVar.c != null) {
                        arrayList2.add(new rp0(1, str2, 1122867));
                    }
                }
            }
            if (e instanceof k71) {
                k71 k71Var = (k71) e;
                for (int i3 = 0; i3 < arrayList3.size() && i3 < size; i3++) {
                    arrayList2.add(new rp0(3, ((l71) k71Var.g(i3)).j, ((Integer) arrayList3.get(i3)).intValue()));
                }
                if (k71Var.c != null) {
                    arrayList2.add(new rp0(1, str2, 1122867));
                }
            } else {
                int i4 = 0;
                while (i4 < arrayList3.size() && i4 < size) {
                    arrayList2.add(new rp0(3, (i4 >= arrayList3.size() - 1 || i4 >= size + (-1)) ? ((w00) opVar.e(i)).c : null, ((Integer) arrayList3.get(i4)).intValue()));
                    i4++;
                }
            }
        }
        qp0Var.f = (rp0[]) arrayList2.toArray(new rp0[arrayList2.size()]);
        paint.setTextSize(qp0Var.d);
        paint.setColor(qp0Var.e);
        i82 i82Var = (i82) this.f202a;
        ArrayList arrayList4 = qp0Var.w;
        ArrayList arrayList5 = qp0Var.v;
        ArrayList arrayList6 = qp0Var.x;
        float f3 = qp0Var.m;
        float c = n52.c(f3);
        float c2 = n52.c(qp0Var.q);
        float f4 = qp0Var.p;
        float c3 = n52.c(f4);
        float c4 = n52.c(qp0Var.o);
        float c5 = n52.c(0.0f);
        rp0[] rp0VarArr = qp0Var.f;
        int length = rp0VarArr.length;
        n52.c(f4);
        rp0[] rp0VarArr2 = qp0Var.f;
        int length2 = rp0VarArr2.length;
        int i5 = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        while (true) {
            if (i5 >= length2) {
                break;
            }
            int i6 = i5;
            rp0 rp0Var = rp0VarArr2[i6];
            rp0Var.getClass();
            float c6 = n52.c(Float.isNaN(Float.NaN) ? f3 : Float.NaN);
            if (c6 > f6) {
                f6 = c6;
            }
            String str3 = rp0Var.f902a;
            if (str3 != null) {
                float measureText = (int) paint.measureText(str3);
                if (measureText > f5) {
                    f5 = measureText;
                }
            }
            i5 = i6 + 1;
        }
        rp0[] rp0VarArr3 = qp0Var.f;
        int length3 = rp0VarArr3.length;
        int i7 = 0;
        float f7 = 0.0f;
        while (i7 < length3) {
            int i8 = i7;
            String str4 = rp0VarArr3[i8].f902a;
            if (str4 != null) {
                float a2 = n52.a(paint, str4);
                if (a2 > f7) {
                    f7 = a2;
                }
            }
            i7 = i8 + 1;
        }
        qp0Var.u = f7;
        int A = d51.A(qp0Var.i);
        if (A != 0) {
            int i9 = 1;
            if (A == 1) {
                Paint.FontMetrics fontMetrics = n52.f;
                paint.getFontMetrics(fontMetrics);
                float f8 = fontMetrics.descent - fontMetrics.ascent;
                float f9 = 0.0f;
                float f10 = 0.0f;
                float f11 = 0.0f;
                int i10 = 0;
                boolean z = false;
                while (i10 < length) {
                    rp0 rp0Var2 = rp0VarArr[i10];
                    float f12 = f8;
                    boolean z2 = rp0Var2.b != i9;
                    float c7 = Float.isNaN(Float.NaN) ? c : n52.c(Float.NaN);
                    String str5 = rp0Var2.f902a;
                    if (!z) {
                        f11 = 0.0f;
                    }
                    if (z2) {
                        if (z) {
                            f11 += c2;
                        }
                        f11 += c7;
                    }
                    if (str5 != null) {
                        if (z2 && !z) {
                            f2 = f11 + c3;
                        } else if (z) {
                            f9 = Math.max(f9, f11);
                            f10 += f12 + c5;
                            f2 = 0.0f;
                            z = false;
                        } else {
                            f2 = f11;
                        }
                        float measureText2 = f2 + ((int) paint.measureText(str5));
                        if (i10 < length - 1) {
                            f10 = f12 + c5 + f10;
                        }
                        f11 = measureText2;
                    } else {
                        f11 += c7;
                        if (i10 < length - 1) {
                            f11 += c2;
                        }
                        z = true;
                    }
                    f9 = Math.max(f9, f11);
                    i10++;
                    f8 = f12;
                    i9 = 1;
                }
                qp0Var.s = f9;
                qp0Var.t = f10;
            }
        } else {
            Paint.FontMetrics fontMetrics2 = n52.f;
            paint.getFontMetrics(fontMetrics2);
            float f13 = fontMetrics2.descent - fontMetrics2.ascent;
            paint.getFontMetrics(fontMetrics2);
            float f14 = (fontMetrics2.ascent - fontMetrics2.top) + fontMetrics2.bottom + c5;
            i82Var.b.width();
            arrayList4.clear();
            arrayList5.clear();
            arrayList6.clear();
            int i11 = -1;
            int i12 = 0;
            float f15 = 0.0f;
            float f16 = 0.0f;
            float f17 = 0.0f;
            while (i12 < length) {
                rp0 rp0Var3 = rp0VarArr[i12];
                float f18 = c2;
                float f19 = c3;
                boolean z3 = rp0Var3.b != 1;
                float c8 = Float.isNaN(Float.NaN) ? c : n52.c(Float.NaN);
                String str6 = rp0Var3.f902a;
                boolean z4 = z3;
                arrayList4.add(Boolean.FALSE);
                float f20 = i11 == -1 ? 0.0f : f16 + f18;
                if (str6 != null) {
                    arrayList = arrayList4;
                    arrayList5.add(n52.b(paint, str6));
                    f = f20 + (z4 ? f19 + c8 : 0.0f) + ((ra0) arrayList5.get(i12)).h;
                    str = str6;
                } else {
                    arrayList = arrayList4;
                    ra0 ra0Var = (ra0) ra0.j.b();
                    str = str6;
                    ra0Var.h = 0.0f;
                    ra0Var.i = 0.0f;
                    arrayList5.add(ra0Var);
                    if (!z4) {
                        c8 = 0.0f;
                    }
                    f = f20 + c8;
                    if (i11 == -1) {
                        i11 = i12;
                    }
                }
                if (str != null || i12 == length - 1) {
                    float f21 = (f17 == 0.0f ? 0.0f : c4) + f + f17;
                    if (i12 == length - 1) {
                        ra0 ra0Var2 = (ra0) ra0.j.b();
                        ra0Var2.h = f21;
                        ra0Var2.i = f13;
                        arrayList6.add(ra0Var2);
                        f15 = Math.max(f15, f21);
                    }
                    f17 = f21;
                }
                if (str != null) {
                    i11 = -1;
                }
                i12++;
                arrayList4 = arrayList;
                c3 = f19;
                f16 = f;
                c2 = f18;
            }
            qp0Var.s = f15;
            qp0Var.t = (f14 * (arrayList6.size() == 0 ? 0 : arrayList6.size() - 1)) + (f13 * arrayList6.size());
        }
        qp0Var.t += qp0Var.c;
        qp0Var.s += qp0Var.b;
    }

    public final void m(Canvas canvas, float f, float f2, rp0 rp0Var, qp0 qp0Var) {
        Canvas canvas2;
        Path path = this.g;
        Paint paint = this.c;
        int i = rp0Var.c;
        if (i == 1122868 || i == 1122867 || i == 0) {
            return;
        }
        int save = canvas.save();
        int i2 = rp0Var.b;
        if (i2 == 3) {
            i2 = qp0Var.l;
        }
        paint.setColor(i);
        float c = n52.c(Float.isNaN(Float.NaN) ? qp0Var.m : Float.NaN);
        float f3 = c / 2.0f;
        int A = d51.A(i2);
        if (A != 2) {
            if (A == 3) {
                paint.setStyle(Paint.Style.FILL);
                canvas2 = canvas;
                canvas2.drawRect(f, f2 - f3, f + c, f2 + f3, paint);
            } else if (A != 4) {
                if (A == 5) {
                    float c2 = n52.c(Float.isNaN(Float.NaN) ? qp0Var.n : Float.NaN);
                    qp0Var.getClass();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(c2);
                    paint.setPathEffect(null);
                    path.reset();
                    path.moveTo(f, f2);
                    path.lineTo(f + c, f2);
                    canvas.drawPath(path, paint);
                }
                canvas2 = canvas;
            }
            canvas2.restoreToCount(save);
        }
        canvas2 = canvas;
        paint.setStyle(Paint.Style.FILL);
        canvas2.drawCircle(f + f3, f2, f3, paint);
        canvas2.restoreToCount(save);
    }

    public final void n(Canvas canvas) {
        float f;
        float f2;
        int i;
        Canvas canvas2;
        ArrayList arrayList;
        int i2;
        int i3;
        ArrayList arrayList2;
        float f3;
        float f4;
        int i4;
        int i5;
        float f5;
        Canvas canvas3;
        String str;
        float f6;
        float width;
        tp0 tp0Var = this;
        Paint.FontMetrics fontMetrics = tp0Var.f;
        Paint paint = tp0Var.b;
        i82 i82Var = (i82) tp0Var.f202a;
        qp0 qp0Var = tp0Var.d;
        if (qp0Var.f53a) {
            paint.setTextSize(qp0Var.d);
            paint.setColor(qp0Var.e);
            DisplayMetrics displayMetrics = n52.f665a;
            paint.getFontMetrics(fontMetrics);
            float f7 = fontMetrics.descent - fontMetrics.ascent;
            paint.getFontMetrics(fontMetrics);
            float c = n52.c(0.0f) + (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
            float a2 = f7 - (n52.a(paint, "ABC") / 2.0f);
            rp0[] rp0VarArr = qp0Var.f;
            float c2 = n52.c(qp0Var.p);
            float c3 = n52.c(qp0Var.o);
            int i6 = qp0Var.i;
            int i7 = qp0Var.g;
            int i8 = qp0Var.h;
            int i9 = qp0Var.k;
            float c4 = n52.c(qp0Var.m);
            float c5 = n52.c(qp0Var.q);
            float f8 = qp0Var.c;
            float f9 = qp0Var.b;
            int A = d51.A(i7);
            if (A == 0) {
                if (i6 != 2) {
                    f9 += i82Var.b.left;
                }
                f = i9 == 2 ? qp0Var.s + f9 : f9;
            } else if (A == 1) {
                if (i6 == 2) {
                    width = i82Var.c / 2.0f;
                } else {
                    RectF rectF = i82Var.b;
                    width = (rectF.width() / 2.0f) + rectF.left;
                }
                f = width + (i9 == 1 ? f9 : -f9);
                if (i6 == 2) {
                    f = (float) (f + (i9 == 1 ? ((-r7) / 2.0d) + f9 : (qp0Var.s / 2.0d) - f9));
                }
            } else if (A != 2) {
                f = 0.0f;
            } else {
                f = (i6 == 2 ? i82Var.c : i82Var.b.right) - f9;
                if (i9 == 1) {
                    f -= qp0Var.s;
                }
            }
            int A2 = d51.A(i6);
            if (A2 != 0) {
                if (A2 != 1) {
                    return;
                }
                int A3 = d51.A(i8);
                if (A3 == 0) {
                    f4 = (i7 == 2 ? 0.0f : i82Var.b.top) + f8;
                } else if (A3 == 1) {
                    f4 = ((i82Var.d / 2.0f) - (qp0Var.t / 2.0f)) + qp0Var.c;
                } else if (A3 != 2) {
                    f4 = 0.0f;
                } else {
                    f4 = (i7 == 2 ? i82Var.d : i82Var.b.bottom) - (qp0Var.t + f8);
                }
                float f10 = f4;
                int i10 = 0;
                boolean z = false;
                float f11 = 0.0f;
                while (i10 < rp0VarArr.length) {
                    rp0 rp0Var = rp0VarArr[i10];
                    int i11 = rp0Var.b;
                    String str2 = rp0Var.f902a;
                    boolean z2 = i11 != 1;
                    float c6 = Float.isNaN(Float.NaN) ? c4 : n52.c(Float.NaN);
                    if (z2) {
                        f6 = i9 == 1 ? f + f11 : f - (c6 - f11);
                        i5 = i9;
                        f5 = f;
                        str = str2;
                        i4 = i10;
                        canvas3 = canvas;
                        tp0Var.m(canvas3, f6, f10 + a2, rp0Var, tp0Var.d);
                        if (i5 == 1) {
                            f6 += c6;
                        }
                    } else {
                        i4 = i10;
                        i5 = i9;
                        f5 = f;
                        canvas3 = canvas;
                        str = str2;
                        f6 = f5;
                    }
                    if (str != null) {
                        if (z2 && !z) {
                            f6 += i5 == 1 ? c2 : -c2;
                        } else if (z) {
                            f6 = f5;
                        }
                        if (i5 == 2) {
                            f6 -= (int) paint.measureText(str);
                        }
                        if (z) {
                            f10 += f7 + c;
                            canvas3.drawText(str, f6, f10 + f7, paint);
                        } else {
                            canvas3.drawText(str, f6, f10 + f7, paint);
                        }
                        f10 = f7 + c + f10;
                        f11 = 0.0f;
                    } else {
                        f11 = c6 + c5 + f11;
                        z = true;
                    }
                    i10 = i4 + 1;
                    i9 = i5;
                    f = f5;
                }
                return;
            }
            float f12 = f;
            ArrayList arrayList3 = qp0Var.x;
            ArrayList arrayList4 = qp0Var.v;
            ArrayList arrayList5 = qp0Var.w;
            int A4 = d51.A(i8);
            float f13 = A4 != 0 ? A4 != 1 ? A4 != 2 ? 0.0f : (i82Var.d - f8) - qp0Var.t : ((i82Var.d - qp0Var.t) / 2.0f) + f8 : f8;
            int length = rp0VarArr.length;
            float f14 = f13;
            float f15 = f12;
            int i12 = 0;
            int i13 = 0;
            while (i13 < length) {
                int i14 = length;
                rp0 rp0Var2 = rp0VarArr[i13];
                float f16 = f15;
                int i15 = rp0Var2.b;
                float f17 = a2;
                String str3 = rp0Var2.f902a;
                boolean z3 = i15 != 1;
                float c7 = Float.isNaN(Float.NaN) ? c4 : n52.c(Float.NaN);
                if (i13 >= arrayList5.size() || !((Boolean) arrayList5.get(i13)).booleanValue()) {
                    f2 = f16;
                } else {
                    f14 = f7 + c + f14;
                    f2 = f12;
                }
                if (f2 == f12 && i7 == 2) {
                    i = i13;
                    if (i12 < arrayList3.size()) {
                        f2 += (i9 == 2 ? ((ra0) arrayList3.get(i12)).h : -((ra0) arrayList3.get(i12)).h) / 2.0f;
                        i12++;
                    }
                } else {
                    i = i13;
                }
                int i16 = i12;
                boolean z4 = str3 == null;
                if (z3) {
                    if (i9 == 2) {
                        f2 -= c7;
                    }
                    float f18 = f2;
                    arrayList2 = arrayList5;
                    arrayList = arrayList3;
                    i2 = i;
                    i3 = i14;
                    canvas2 = canvas;
                    tp0Var.m(canvas2, f18, f14 + f17, rp0Var2, tp0Var.d);
                    f2 = i9 == 1 ? f18 + c7 : f18;
                } else {
                    canvas2 = canvas;
                    arrayList = arrayList3;
                    i2 = i;
                    i3 = i14;
                    arrayList2 = arrayList5;
                }
                if (z4) {
                    f3 = i9 == 2 ? -c5 : c5;
                } else {
                    if (z3) {
                        f2 += i9 == 2 ? -c2 : c2;
                    }
                    if (i9 == 2) {
                        f2 -= ((ra0) arrayList4.get(i2)).h;
                    }
                    canvas2.drawText(str3, f2, f14 + f7, paint);
                    if (i9 == 1) {
                        f2 += ((ra0) arrayList4.get(i2)).h;
                    }
                    f3 = i9 == 2 ? -c3 : c3;
                }
                f15 = f2 + f3;
                i13 = i2 + 1;
                tp0Var = this;
                arrayList5 = arrayList2;
                length = i3;
                a2 = f17;
                arrayList3 = arrayList;
                i12 = i16;
            }
        }
    }
}
