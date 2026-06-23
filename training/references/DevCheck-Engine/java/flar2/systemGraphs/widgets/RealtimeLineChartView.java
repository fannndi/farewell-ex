package flar2.devcheck.systemGraphs.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB;
import defpackage.kd1;
import defpackage.ld1;
import defpackage.r60;
import flar2.devcheck.R;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public class RealtimeLineChartView extends View {
    public float A;
    public float A0;
    public boolean B;
    public final Handler B0;
    public boolean C;
    public final r60 C0;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public boolean I;
    public boolean J;
    public boolean K;
    public TextView L;
    public float M;
    public int N;
    public boolean O;
    public final float P;
    public final float Q;
    public boolean R;
    public ld1 S;
    public ld1 T;
    public final float U;
    public final float V;
    public final float W;
    public final float a0;
    public final float b0;
    public final float c0;
    public final float d0;
    public final int e0;
    public final int f0;
    public final Paint g;
    public final int g0;
    public final Paint h;
    public final int h0;
    public final Paint i;
    public final int i0;
    public final Paint j;
    public long j0;
    public final Paint k;
    public boolean k0;
    public final Paint l;
    public boolean l0;
    public final Paint m;
    public boolean m0;
    public final Paint n;
    public int n0;
    public final Paint o;
    public int o0;
    public final Paint p;
    public float p0;
    public final Paint q;
    public float q0;
    public final RectF r;
    public float r0;
    public final RectF s;
    public float s0;
    public final Paint.FontMetrics t;
    public float t0;
    public final Paint.FontMetrics u;
    public float u0;
    public final ArrayList v;
    public float v0;
    public int w;
    public String w0;
    public boolean x;
    public String x0;
    public float y;
    public float y0;
    public float z;
    public String z0;

    public RealtimeLineChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Paint paint = new Paint(1);
        this.g = paint;
        Paint paint2 = new Paint(1);
        this.h = paint2;
        Paint paint3 = new Paint(1);
        this.i = paint3;
        Paint paint4 = new Paint(1);
        this.j = paint4;
        Paint paint5 = new Paint(1);
        this.k = paint5;
        Paint paint6 = new Paint(1);
        this.l = paint6;
        this.m = new Paint(1);
        this.n = new Paint(1);
        this.o = new Paint(1);
        this.p = new Paint(1);
        Paint paint7 = new Paint(1);
        this.q = paint7;
        new Path();
        this.r = new RectF();
        this.s = new RectF();
        this.t = new Paint.FontMetrics();
        this.u = new Paint.FontMetrics();
        this.v = new ArrayList();
        this.w = 120;
        this.x = true;
        this.y = 0.0f;
        this.z = 100.0f;
        this.A = 0.0f;
        this.B = false;
        this.C = false;
        this.D = Float.NaN;
        this.E = Float.NaN;
        this.F = Float.NaN;
        this.G = Float.NaN;
        this.H = Float.NaN;
        this.I = false;
        this.J = true;
        this.K = false;
        this.M = Float.NaN;
        this.N = 6;
        this.O = true;
        this.R = true;
        this.l0 = true;
        this.m0 = true;
        this.n0 = -1;
        this.o0 = -1;
        String str = qJTtDWNCVUDjB.HynZDC;
        this.w0 = str;
        this.x0 = str;
        this.A0 = Float.NaN;
        this.B0 = new Handler(Looper.getMainLooper());
        this.C0 = new r60(16, this);
        float f = getResources().getDisplayMetrics().density;
        float f2 = 1.8f * f;
        this.U = f2;
        this.V = 1.0f;
        this.W = 9.0f * f;
        this.a0 = 11.0f * f;
        this.b0 = 8.0f * f;
        float f3 = 4.0f * f;
        this.c0 = f3;
        this.d0 = 12.0f * f;
        int d = d(R.attr.colorDivider, 579373192);
        int d2 = d(R.attr.textTertiary, -7829368);
        this.e0 = d2;
        int d3 = d(R.attr.textPrimary, -16777216);
        this.f0 = Color.argb(18, Color.red(d3), Color.green(d3), Color.blue(d3));
        this.g0 = d(R.attr.textPrimary, -14540254);
        this.h0 = d(R.attr.dashboard_yellow, -16121);
        this.i0 = d(R.attr.dashboard_red, -1754827);
        int d4 = d(R.attr.colorDarkBackground, -1052689);
        this.P = 10.0f * f;
        this.Q = f3;
        Paint.Style style = Paint.Style.FILL;
        paint7.setStyle(style);
        paint7.setColor(d4);
        Paint.Style style2 = Paint.Style.STROKE;
        paint.setStyle(style2);
        paint.setStrokeWidth(f2);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStyle(style);
        paint3.setStyle(style2);
        paint3.setStrokeWidth(1.0f);
        paint3.setColor(d);
        paint4.setStyle(style2);
        paint4.setStrokeWidth(1.6f);
        paint4.setColor(d2);
        Paint[] paintArr = {paint5, paint6};
        for (int i = 0; i < 2; i++) {
            Paint paint8 = paintArr[i];
            paint8.setStyle(Paint.Style.STROKE);
            paint8.setStrokeWidth(this.V * 1.4f);
            paint8.setPathEffect(new DashPathEffect(new float[]{f * 6.0f, f3}, 0.0f));
        }
        this.k.setColor(this.h0);
        this.l.setColor(this.i0);
        this.m.setStyle(Paint.Style.STROKE);
        this.m.setStrokeWidth(this.V * 1.4f);
        this.m.setColor(this.e0);
        this.m.setPathEffect(new DashPathEffect(new float[]{f * 6.0f, f3}, 0.0f));
        Paint paint9 = this.n;
        Paint.Style style3 = Paint.Style.FILL;
        paint9.setStyle(style3);
        this.n.setColor(this.e0);
        this.n.setTextSize(this.W);
        Paint paint10 = this.n;
        Paint.Align align = Paint.Align.LEFT;
        paint10.setTextAlign(align);
        this.o.setStyle(style3);
        this.o.setColor(this.f0);
        this.p.setStyle(style3);
        this.p.setColor(this.g0);
        this.p.setTextSize(this.a0);
        this.p.setTextAlign(align);
    }

    public final void a(int i) {
        kd1 kd1Var = new kd1(i, this.w);
        ArrayList arrayList = this.v;
        arrayList.add(kd1Var);
        this.m0 = true;
        arrayList.size();
    }

    public final String b(float f) {
        if (Math.abs(f) < (this.q0 - this.p0) * 1.0E-4f) {
            f = 0.0f;
        }
        ld1 ld1Var = this.T;
        if (ld1Var != null) {
            return ld1Var.c(f);
        }
        ld1 ld1Var2 = this.S;
        return ld1Var2 != null ? ld1Var2.c(f) : Math.abs(f) >= 100.0f ? String.format(Locale.getDefault(), "%.0f", Float.valueOf(f)) : Math.abs(f) >= 10.0f ? String.format(Locale.getDefault(), "%.1f", Float.valueOf(f)) : String.format(Locale.getDefault(), "%.2f", Float.valueOf(f));
    }

    public final void c(int i, float f) {
        if (i >= 0) {
            ArrayList arrayList = this.v;
            if (i >= arrayList.size()) {
                return;
            }
            kd1 kd1Var = (kd1) arrayList.get(i);
            float[] fArr = kd1Var.b;
            kd1Var.d = fArr[0];
            System.arraycopy(fArr, 1, fArr, 0, fArr.length - 1);
            float[] fArr2 = kd1Var.b;
            fArr2[fArr2.length - 1] = f;
            kd1Var.c = Math.min(kd1Var.c + 1, fArr2.length);
            if (i == 0) {
                this.j0 = System.nanoTime();
                j(f);
            }
            this.m0 = true;
            e();
        }
    }

    public final int d(int i, int i2) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{i});
        try {
            return obtainStyledAttributes.getColor(0, i2);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void e() {
        if (!this.k0) {
            invalidate();
            return;
        }
        Handler handler = this.B0;
        r60 r60Var = this.C0;
        handler.removeCallbacks(r60Var);
        handler.postDelayed(r60Var, 33L);
    }

    public final void f() {
        this.x = true;
        this.m0 = true;
        invalidate();
    }

    public final void g(float f, float f2) {
        if (f2 <= f) {
            f2 = 1.0f + f;
        }
        this.y = f;
        this.z = f2;
        this.x = false;
        this.m0 = true;
        invalidate();
    }

    public int getCapacity() {
        return this.w;
    }

    public final void h() {
        this.k0 = true;
        e();
    }

    public final void i() {
        this.k0 = false;
        this.B0.removeCallbacks(this.C0);
    }

    public final void j(float f) {
        if (this.L == null || this.S == null || Float.isNaN(f) || Float.compare(f, this.M) == 0) {
            return;
        }
        this.M = f;
        this.L.setText(this.S.c(f));
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        this.k0 = false;
        this.B0.removeCallbacks(this.C0);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float nanoTime;
        float f4;
        float f5;
        int i;
        int i2;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        int i3;
        float f11;
        float f12;
        boolean z;
        float f13;
        float f14;
        float f15;
        Canvas canvas2 = canvas;
        int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
        int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
        if (width <= 0 || height <= 0) {
            return;
        }
        ArrayList arrayList = this.v;
        if (arrayList.isEmpty()) {
            return;
        }
        if (this.n0 != width || this.o0 != height) {
            this.n0 = width;
            this.o0 = height;
            this.m0 = true;
        }
        boolean z2 = this.m0;
        Paint.FontMetrics fontMetrics = this.t;
        float f16 = this.U;
        Paint paint = this.n;
        float f17 = this.Q;
        if (z2) {
            if (this.x) {
                int size = arrayList.size();
                float f18 = Float.POSITIVE_INFINITY;
                float f19 = Float.NEGATIVE_INFINITY;
                int i4 = 0;
                f3 = 0.0f;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    for (float f20 : ((kd1) obj).b) {
                        if (!Float.isNaN(f20)) {
                            if (f20 < f18) {
                                f18 = f20;
                            }
                            if (f20 > f19) {
                                f19 = f20;
                            }
                        }
                    }
                }
                if (!Float.isFinite(f18) || !Float.isFinite(f19)) {
                    f19 = 1.0f;
                    f18 = 0.0f;
                }
                if (f19 - f18 < 1.0E-6f) {
                    f19 = f18 + 1.0f;
                }
                float f21 = (f19 - f18) * 0.08f;
                f6 = f18 - f21;
                float f22 = f19 + f21;
                float f23 = this.A;
                if (f23 > 0.0f && f22 - f6 < f23) {
                    float f24 = (f6 + f22) / 2.0f;
                    float f25 = f23 / 2.0f;
                    f22 = f25 + f24;
                    f6 = f24 - f25;
                }
                if (this.B && f6 < 0.0f) {
                    if (f22 <= 0.0f) {
                        f22 = 1.0f;
                    }
                    f6 = 0.0f;
                }
                f7 = f22;
                if (!this.C || f7 <= 0.0f) {
                    i = width;
                    i2 = height;
                } else if (f7 <= 0.0f) {
                    i = width;
                    i2 = height;
                    f7 = 1.0f;
                } else {
                    double d = f7;
                    i = width;
                    i2 = height;
                    double pow = Math.pow(10.0d, Math.floor(Math.log10(d)));
                    double d2 = d / pow;
                    f7 = (float) ((d2 <= 1.0d ? 1.0d : d2 <= 2.0d ? 2.0d : d2 <= 5.0d ? 5.0d : 10.0d) * pow);
                }
            } else {
                i = width;
                i2 = height;
                f3 = 0.0f;
                f6 = this.y;
                f7 = this.z;
            }
            this.p0 = f6;
            this.q0 = f7;
            paint.getFontMetrics(fontMetrics);
            if (this.J) {
                this.w0 = b(f7);
                this.x0 = b(f6);
                f8 = Math.max(paint.measureText(this.w0), paint.measureText(this.x0));
                f9 = getResources().getDisplayMetrics().density * 6.0f;
            } else {
                this.w0 = "";
                this.x0 = "";
                f8 = f3;
                f9 = f8;
            }
            this.y0 = (fontMetrics.descent - fontMetrics.ascent) / 2.0f;
            this.r0 = getPaddingLeft() + f8 + f9 + f17;
            this.s0 = (getPaddingLeft() + i) - f17;
            this.t0 = getPaddingTop() + f16 + this.y0;
            float paddingTop = ((getPaddingTop() + i2) - f16) - this.y0;
            this.u0 = paddingTop;
            float f26 = this.s0 - this.r0;
            float f27 = paddingTop - this.t0;
            this.v0 = this.w > 1 ? f26 / (r5 - 1) : f3;
            if (f26 > f3 && f27 > f3) {
                float f28 = f7 - f6;
                if (f28 <= f3) {
                    f28 = 1.0f;
                }
                int i5 = 0;
                while (i5 < arrayList.size()) {
                    kd1 kd1Var = (kd1) arrayList.get(i5);
                    float f29 = this.r0;
                    float f30 = this.t0;
                    float f31 = this.v0;
                    float f32 = this.u0;
                    float f33 = f27;
                    boolean z3 = i5 == 0 && this.l0;
                    Path path = kd1Var.e;
                    int i6 = i5;
                    Path path2 = kd1Var.f;
                    path.reset();
                    if (z3) {
                        path2.reset();
                    }
                    float f34 = f28;
                    int i7 = kd1Var.c;
                    if (i7 == 0) {
                        f10 = f16;
                    } else {
                        int i8 = this.w;
                        f10 = f16;
                        float f35 = (i8 - 1) * f31;
                        if (i7 == 1) {
                            float[] fArr = kd1Var.b;
                            float f36 = ((1.0f - ((fArr[fArr.length - 1] - f6) / f34)) * f33) + f30;
                            path.moveTo(f29, f36);
                            float f37 = f29 + f35;
                            path.lineTo(f37, f36);
                            if (z3) {
                                path2.moveTo(f29, f32);
                                path2.lineTo(f29, f36);
                                path2.lineTo(f37, f36);
                                path2.lineTo(f37, f32);
                                path2.close();
                            }
                        } else {
                            if (i7 < i8) {
                                i3 = kd1Var.b.length - i7;
                                f31 = f35 / (i7 - 1);
                            } else {
                                i3 = 0;
                            }
                            if (i7 < i8 || Float.isNaN(kd1Var.d)) {
                                f11 = f3;
                                f12 = f11;
                                z = false;
                                f13 = Float.NaN;
                            } else {
                                f11 = ((1.0f - ((kd1Var.d - f6) / f34)) * f33) + f30;
                                f12 = f29 - f31;
                                path.moveTo(f12, f11);
                                if (z3) {
                                    path2.moveTo(f12, f32);
                                    path2.lineTo(f12, f11);
                                    f15 = f12;
                                } else {
                                    f15 = Float.NaN;
                                }
                                f13 = f15;
                                z = true;
                            }
                            float f38 = f11;
                            f14 = f17;
                            boolean z4 = z;
                            float f39 = f13;
                            int i9 = 0;
                            float f40 = f12;
                            float f41 = Float.NaN;
                            while (true) {
                                float[] fArr2 = kd1Var.b;
                                kd1 kd1Var2 = kd1Var;
                                if (i3 >= fArr2.length) {
                                    break;
                                }
                                float f42 = fArr2[i3];
                                if (Float.isNaN(f42)) {
                                    if (z4 && z3) {
                                        path2.lineTo(f41, f32);
                                        path2.lineTo(f39, f32);
                                        path2.close();
                                    }
                                    i9++;
                                    z4 = false;
                                } else {
                                    f41 = (i9 * f31) + f29;
                                    float f43 = ((1.0f - ((f42 - f6) / f34)) * f33) + f30;
                                    if (!z4) {
                                        path.moveTo(f41, f43);
                                        if (z3) {
                                            path2.moveTo(f41, f32);
                                            path2.lineTo(f41, f43);
                                            f39 = f41;
                                        }
                                        z4 = true;
                                    } else if (this.R) {
                                        float f44 = (f40 + f41) / 2.0f;
                                        path.cubicTo(f44, f38, f44, f43, f41, f43);
                                        if (z3) {
                                            path2.cubicTo(f44, f38, f44, f43, f41, f43);
                                        }
                                        f43 = f43;
                                        f41 = f41;
                                    } else {
                                        path.lineTo(f41, f43);
                                        if (z3) {
                                            path2.lineTo(f41, f43);
                                        }
                                    }
                                    i9++;
                                    f38 = f43;
                                    f40 = f41;
                                }
                                i3++;
                                kd1Var = kd1Var2;
                            }
                            if (z4 && z3) {
                                path2.lineTo(f41, f32);
                                path2.lineTo(f39, f32);
                                path2.close();
                            }
                            i5 = i6 + 1;
                            f27 = f33;
                            f28 = f34;
                            f16 = f10;
                            f17 = f14;
                        }
                    }
                    f14 = f17;
                    i5 = i6 + 1;
                    f27 = f33;
                    f28 = f34;
                    f16 = f10;
                    f17 = f14;
                }
            }
            f = f16;
            f2 = f17;
            this.m0 = false;
        } else {
            f = f16;
            f2 = f17;
            f3 = 0.0f;
        }
        if (this.O) {
            float f45 = this.r0 - f2;
            float paddingTop2 = getPaddingTop();
            float f46 = this.s0 + f2;
            float height2 = getHeight() - getPaddingBottom();
            RectF rectF = this.s;
            rectF.set(f45, paddingTop2, f46, height2);
            float f47 = this.P;
            canvas2.drawRoundRect(rectF, f47, f47, this.q);
        }
        float f48 = this.q0 - this.p0;
        if (f48 > f3) {
            float f49 = this.u0 - this.t0;
            float f50 = (fontMetrics.ascent + fontMetrics.descent) / 2.0f;
            float paddingLeft = getPaddingLeft();
            boolean z5 = this.I;
            int i10 = this.N;
            Paint paint2 = this.i;
            if (z5) {
                int max = Math.max(2, i10);
                for (int i11 = 0; i11 < max; i11++) {
                    float f51 = i11 / (max - 1);
                    float f52 = (f51 * f48) + this.p0;
                    float f53 = this.u0 - (f51 * f49);
                    canvas2.drawLine(this.r0, f53, this.s0, f53, paint2);
                    if (this.J) {
                        canvas2.drawText(b(f52), paddingLeft, f53 - f50, paint);
                    }
                }
            } else {
                if (f48 <= f3 || i10 < 2) {
                    f5 = 1.0f;
                } else {
                    double d3 = f48 / i10;
                    double pow2 = Math.pow(10.0d, Math.floor(Math.log10(d3)));
                    double d4 = d3 / pow2;
                    f5 = (float) (pow2 * (d4 >= 1.5d ? d4 < 3.5d ? 2.0d : d4 < 7.5d ? 5.0d : 10.0d : 1.0d));
                }
                for (float ceil = (float) (Math.ceil(this.p0 / f5) * f5); ceil <= (0.001f * f5) + this.q0; ceil += f5) {
                    float f54 = this.u0 - (((ceil - this.p0) / f48) * f49);
                    canvas2.drawLine(this.r0, f54, this.s0, f54, paint2);
                    if (this.J) {
                        canvas2.drawText(b(ceil), paddingLeft, f54 - f50, paint);
                    }
                }
            }
        }
        float f55 = this.q0 - this.p0;
        if (f55 > f3) {
            if (!Float.isNaN(this.D)) {
                float f56 = this.D;
                float f57 = this.p0;
                if (f56 >= f57 && f56 <= this.q0) {
                    float f58 = this.u0;
                    float f59 = f58 - ((f58 - this.t0) * ((f56 - f57) / f55));
                    canvas2.drawLine(this.r0, f59, this.s0, f59, this.j);
                }
            }
            if (!Float.isNaN(this.E)) {
                float f60 = this.E;
                float f61 = this.p0;
                if (f60 >= f61 && f60 <= this.q0) {
                    float f62 = this.u0;
                    float f63 = f62 - ((f62 - this.t0) * ((f60 - f61) / f55));
                    canvas.drawLine(this.r0, f63, this.s0, f63, this.k);
                }
            }
            if (!Float.isNaN(this.F)) {
                float f64 = this.F;
                float f65 = this.p0;
                if (f64 >= f65 && f64 <= this.q0) {
                    float f66 = this.u0;
                    float f67 = f66 - ((f66 - this.t0) * ((f64 - f65) / f55));
                    canvas.drawLine(this.r0, f67, this.s0, f67, this.l);
                }
            }
            boolean isNaN = Float.isNaN(this.G);
            Paint paint3 = this.m;
            if (!isNaN) {
                float f68 = this.G;
                float f69 = this.p0;
                if (f68 >= f69 && f68 <= this.q0) {
                    float f70 = this.u0;
                    float f71 = f70 - ((f70 - this.t0) * ((f68 - f69) / f55));
                    canvas.drawLine(this.r0, f71, this.s0, f71, paint3);
                }
            }
            if (!Float.isNaN(this.H)) {
                float f72 = this.H;
                float f73 = this.p0;
                if (f72 >= f73 && f72 <= this.q0) {
                    float f74 = this.u0;
                    float f75 = f74 - ((f74 - this.t0) * ((f72 - f73) / f55));
                    canvas2 = canvas;
                    canvas2.drawLine(this.r0, f75, this.s0, f75, paint3);
                }
            }
            canvas2 = canvas;
        }
        if (arrayList.isEmpty() || ((kd1) arrayList.get(0)).c >= this.w) {
            nanoTime = (float) ((System.nanoTime() - this.j0) / 2.5E8d);
            if (nanoTime > 1.0f) {
                nanoTime = 1.0f;
            }
            if (nanoTime < f3) {
                nanoTime = f3;
            }
        } else {
            nanoTime = 1.0f;
        }
        float f76 = (1.0f - nanoTime) * this.v0;
        canvas2.save();
        float f77 = this.r0;
        float f78 = this.t0;
        float f79 = this.y0;
        canvas2.clipRect(f77, f78 - f79, this.s0, this.u0 + f79);
        canvas2.translate(f76, f3);
        if (this.l0 && !arrayList.isEmpty()) {
            kd1 kd1Var3 = (kd1) arrayList.get(0);
            LinearGradient linearGradient = kd1Var3.g;
            int i12 = kd1Var3.f529a;
            if (linearGradient == null || kd1Var3.h != this.u0 - this.t0) {
                kd1Var3.g = new LinearGradient(0.0f, this.t0, 0.0f, this.u0, Color.argb(90, Color.red(i12), Color.green(i12), Color.blue(i12)), Color.argb(35, Color.red(i12), Color.green(i12), Color.blue(i12)), Shader.TileMode.CLAMP);
                kd1Var3.h = this.u0 - this.t0;
            }
            LinearGradient linearGradient2 = kd1Var3.g;
            Paint paint4 = this.h;
            paint4.setShader(linearGradient2);
            canvas2.drawPath(kd1Var3.f, paint4);
            paint4.setShader(null);
        }
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            kd1 kd1Var4 = (kd1) arrayList.get(i13);
            int i14 = kd1Var4.f529a;
            Paint paint5 = this.g;
            paint5.setColor(i14);
            canvas2.drawPath(kd1Var4.e, paint5);
        }
        canvas2.restore();
        if (this.K && this.S != null && !arrayList.isEmpty()) {
            kd1 kd1Var5 = (kd1) arrayList.get(0);
            int length = kd1Var5.b.length - 1;
            while (true) {
                if (length < 0) {
                    f4 = Float.NaN;
                    break;
                } else {
                    if (!Float.isNaN(kd1Var5.b[length])) {
                        f4 = kd1Var5.b[length];
                        break;
                    }
                    length--;
                }
            }
            if (!Float.isNaN(f4)) {
                if (this.z0 == null || f4 != this.A0) {
                    this.z0 = this.S.c(f4);
                    this.A0 = f4;
                }
                Paint paint6 = this.p;
                Paint.FontMetrics fontMetrics2 = this.u;
                paint6.getFontMetrics(fontMetrics2);
                float measureText = paint6.measureText(this.z0);
                float f80 = fontMetrics2.descent - fontMetrics2.ascent;
                float f81 = this.b0;
                float f82 = (f81 * 2.0f) + measureText;
                float f83 = this.c0;
                float f84 = (f83 * 2.0f) + f80;
                float f85 = this.s0;
                float f86 = this.t0 + f;
                RectF rectF2 = this.r;
                rectF2.set((f85 - f82) - f, f86, f85 - f, f84 + f86);
                float f87 = this.d0;
                canvas2.drawRoundRect(rectF2, f87, f87, this.o);
                canvas2.drawText(this.z0, rectF2.left + f81, (rectF2.top + f83) - fontMetrics2.ascent, paint6);
            }
        }
        if (!this.k0 || nanoTime >= 1.0f) {
            return;
        }
        e();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.m0 = true;
        if ((i3 == 0 || i4 == 0) && i > 0 && i2 > 0) {
            invalidate();
        }
    }

    public void setAutoYNiceSnap(boolean z) {
        if (this.C == z) {
            return;
        }
        this.C = z;
        this.m0 = true;
        invalidate();
    }

    public void setAxisFormatter(ld1 ld1Var) {
        this.T = ld1Var;
        this.m0 = true;
        invalidate();
    }

    public void setCapacity(int i) {
        if (i < 2) {
            i = 2;
        }
        this.w = i;
        ArrayList arrayList = this.v;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            kd1 kd1Var = (kd1) obj;
            float[] fArr = kd1Var.b;
            float[] fArr2 = new float[i];
            for (int i3 = 0; i3 < i; i3++) {
                fArr2[i3] = Float.NaN;
            }
            if (fArr != null) {
                int min = Math.min(fArr.length, i);
                System.arraycopy(fArr, fArr.length - min, fArr2, i - min, min);
            }
            kd1Var.b = fArr2;
        }
        this.m0 = true;
    }

    public void setCriticalLine(float f) {
        if (Float.compare(this.F, f) == 0) {
            return;
        }
        this.F = f;
        invalidate();
    }

    public void setFillUnderPrimary(boolean z) {
        this.l0 = z;
        this.m0 = true;
        invalidate();
    }

    public void setGridLineCount(int i) {
        if (i < 2) {
            i = 2;
        }
        if (this.N == i) {
            return;
        }
        this.N = i;
        invalidate();
    }

    public void setMaxLine(float f) {
        if (Float.compare(this.G, f) == 0) {
            return;
        }
        this.G = f;
        invalidate();
    }

    public void setMinYRange(float f) {
        this.A = f;
        this.m0 = true;
        invalidate();
    }

    public void setReferenceLine(float f) {
        this.D = f;
        invalidate();
    }

    public void setSecondaryMaxLine(float f) {
        if (Float.compare(this.H, f) == 0) {
            return;
        }
        this.H = f;
        invalidate();
    }

    public void setShowAxisLabels(boolean z) {
        if (this.J == z) {
            return;
        }
        this.J = z;
        this.m0 = true;
        invalidate();
    }

    public void setShowChartBackground(boolean z) {
        if (this.O == z) {
            return;
        }
        this.O = z;
        invalidate();
    }

    public void setShowPill(boolean z) {
        if (this.K == z) {
            return;
        }
        this.K = z;
        invalidate();
    }

    public void setSmoothCurves(boolean z) {
        if (this.R == z) {
            return;
        }
        this.R = z;
        this.m0 = true;
        invalidate();
    }

    public void setUnitFormatter(ld1 ld1Var) {
        this.S = ld1Var;
        this.m0 = true;
        invalidate();
    }

    public void setUseExplicitYBoundsLabels(boolean z) {
        if (this.I == z) {
            return;
        }
        this.I = z;
        invalidate();
    }

    public void setValueLabel(TextView textView) {
        this.L = textView;
        this.M = Float.NaN;
        ArrayList arrayList = this.v;
        if (arrayList.isEmpty()) {
            return;
        }
        float[] fArr = ((kd1) arrayList.get(0)).b;
        for (int length = fArr.length - 1; length >= 0; length--) {
            if (!Float.isNaN(fArr[length])) {
                j(fArr[length]);
                return;
            }
        }
    }

    public void setWarningLine(float f) {
        if (Float.compare(this.E, f) == 0) {
            return;
        }
        this.E = f;
        invalidate();
    }

    public void setYNonNegative(boolean z) {
        if (this.B == z) {
            return;
        }
        this.B = z;
        this.m0 = true;
        invalidate();
    }
}
