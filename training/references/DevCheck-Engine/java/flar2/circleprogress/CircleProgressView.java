package flar2.devcheck.circleprogress;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.Typeface;
import android.os.Message;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import defpackage.c;
import defpackage.f42;
import defpackage.id;
import defpackage.js1;
import defpackage.l4;
import defpackage.n4;
import defpackage.nq;
import defpackage.pb1;
import defpackage.t40;
import defpackage.wx1;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public class CircleProgressView extends View {
    public float A;
    public float A0;
    public boolean B;
    public boolean B0;
    public double C;
    public boolean C0;
    public int D;
    public boolean D0;
    public boolean E;
    public int E0;
    public final l4 F;
    public float F0;
    public int G;
    public float G0;
    public int H;
    public float H0;
    public int I;
    public boolean I0;
    public float J;
    public boolean J0;
    public float K;
    public int K0;
    public final int L;
    public DecimalFormat L0;
    public final id M;
    public final Typeface M0;
    public final int N;
    public final Typeface N0;
    public final float O;
    public int O0;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int a0;
    public int b0;
    public int c0;
    public boolean d0;
    public int[] e0;
    public Paint.Cap f0;
    public int g;
    public Paint.Cap g0;
    public int h;
    public final Paint h0;
    public RectF i;
    public Paint i0;
    public RectF j;
    public final Paint j0;
    public PointF k;
    public final Paint k0;
    public RectF l;
    public final Paint l0;
    public RectF m;
    public final Paint m0;
    public RectF n;
    public final Paint n0;
    public RectF o;
    public final Paint o0;
    public RectF p;
    public final Paint p0;
    public t40 q;
    public final Paint q0;
    public float r;
    public String r0;
    public float s;
    public int s0;
    public float t;
    public String t0;
    public float u;
    public f42 u0;
    public float v;
    public wx1 v0;
    public float w;
    public boolean w0;
    public float x;
    public boolean x0;
    public float y;
    public Bitmap y0;
    public float z;
    public final Paint z0;

    public CircleProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = 0;
        this.h = 0;
        this.i = new RectF();
        this.j = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new RectF();
        this.o = new RectF();
        this.p = new RectF();
        this.q = t40.g;
        this.r = 0.0f;
        this.s = 0.0f;
        this.t = 0.0f;
        this.u = 100.0f;
        this.v = 0.0f;
        this.w = -1.0f;
        this.x = 0.0f;
        this.y = 42.0f;
        this.z = 0.0f;
        this.A = 2.8f;
        this.B = false;
        this.C = 900.0d;
        this.D = 10;
        this.F = new l4(this);
        this.O0 = 1;
        this.G = 40;
        this.H = 40;
        this.I = 270;
        this.J = 1.0f;
        this.K = 1.0f;
        this.L = 0;
        this.M = id.g;
        this.N = -1442840576;
        this.O = 10.0f;
        this.P = 10;
        this.Q = 10;
        this.R = 1.0f;
        this.S = 1.0f;
        this.T = -1442840576;
        this.U = -1442840576;
        this.V = -16738680;
        this.W = 0;
        this.a0 = -1434201911;
        this.b0 = -16777216;
        this.c0 = -16777216;
        this.d0 = false;
        this.e0 = new int[]{-16738680};
        Paint.Cap cap = Paint.Cap.BUTT;
        this.f0 = cap;
        this.g0 = cap;
        this.h0 = new Paint();
        this.j0 = new Paint();
        this.k0 = new Paint();
        this.l0 = new Paint();
        this.m0 = new Paint();
        this.n0 = new Paint();
        this.o0 = new Paint();
        this.p0 = new Paint();
        this.q0 = new Paint();
        this.r0 = "";
        this.t0 = "";
        this.u0 = f42.g;
        this.v0 = wx1.g;
        this.x0 = false;
        this.A0 = 1.0f;
        this.B0 = false;
        this.C0 = false;
        this.D0 = false;
        this.E0 = 18;
        this.F0 = 0.9f;
        this.G0 = 20.0f;
        this.H0 = 18.0f;
        this.I0 = false;
        this.J0 = false;
        this.L0 = new DecimalFormat("0");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, pb1.b);
        setBarWidth((int) obtainStyledAttributes.getDimension(11, this.G));
        setRimWidth((int) obtainStyledAttributes.getDimension(25, this.H));
        setSpinSpeed((int) obtainStyledAttributes.getFloat(34, this.A));
        setSpin(obtainStyledAttributes.getBoolean(31, this.B));
        setDirection(t40.values()[obtainStyledAttributes.getInt(15, 0)]);
        float f = obtainStyledAttributes.getFloat(49, this.r);
        setValue(f);
        this.r = f;
        if (obtainStyledAttributes.hasValue(2) && obtainStyledAttributes.hasValue(3) && obtainStyledAttributes.hasValue(4) && obtainStyledAttributes.hasValue(5)) {
            this.e0 = new int[]{obtainStyledAttributes.getColor(2, -16738680), obtainStyledAttributes.getColor(3, -16738680), obtainStyledAttributes.getColor(4, -16738680), obtainStyledAttributes.getColor(5, -16738680)};
        } else if (obtainStyledAttributes.hasValue(2) && obtainStyledAttributes.hasValue(3) && obtainStyledAttributes.hasValue(4)) {
            this.e0 = new int[]{obtainStyledAttributes.getColor(2, -16738680), obtainStyledAttributes.getColor(3, -16738680), obtainStyledAttributes.getColor(4, -16738680)};
        } else if (obtainStyledAttributes.hasValue(2) && obtainStyledAttributes.hasValue(3)) {
            this.e0 = new int[]{obtainStyledAttributes.getColor(2, -16738680), obtainStyledAttributes.getColor(3, -16738680)};
        } else {
            this.e0 = new int[]{obtainStyledAttributes.getColor(2, -16738680), obtainStyledAttributes.getColor(2, -16738680)};
        }
        if (obtainStyledAttributes.hasValue(10)) {
            setBarStrokeCap(js1.values()[obtainStyledAttributes.getInt(10, 0)].g);
        }
        if (obtainStyledAttributes.hasValue(9) && obtainStyledAttributes.hasValue(6)) {
            int dimension = (int) obtainStyledAttributes.getDimension(9, 0.0f);
            id idVar = id.values()[obtainStyledAttributes.getInt(6, 3)];
            int color = obtainStyledAttributes.getColor(7, this.N);
            float f2 = obtainStyledAttributes.getFloat(8, this.O);
            this.L = dimension;
            this.M = idVar;
            this.N = color;
            this.O = f2;
        }
        setSpinBarColor(obtainStyledAttributes.getColor(33, this.V));
        setSpinningBarLength(obtainStyledAttributes.getFloat(32, this.y));
        if (obtainStyledAttributes.hasValue(40)) {
            setTextSize((int) obtainStyledAttributes.getDimension(40, this.Q));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setUnitSize((int) obtainStyledAttributes.getDimension(46, this.P));
        }
        if (obtainStyledAttributes.hasValue(37)) {
            setTextColor(obtainStyledAttributes.getColor(37, this.b0));
        }
        if (obtainStyledAttributes.hasValue(43)) {
            setUnitColor(obtainStyledAttributes.getColor(43, this.c0));
        }
        if (obtainStyledAttributes.hasValue(0)) {
            setTextColorAuto(obtainStyledAttributes.getBoolean(0, this.d0));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            setAutoTextSize(obtainStyledAttributes.getBoolean(1, this.w0));
        }
        if (obtainStyledAttributes.hasValue(38)) {
            setTextMode(wx1.values()[obtainStyledAttributes.getInt(38, 0)]);
        }
        if (obtainStyledAttributes.hasValue(44)) {
            setUnitPosition(f42.values()[obtainStyledAttributes.getInt(44, 3)]);
        }
        if (obtainStyledAttributes.hasValue(36)) {
            setText(obtainStyledAttributes.getString(36));
        }
        setUnitToTextScale(obtainStyledAttributes.getFloat(47, 1.0f));
        setRimColor(obtainStyledAttributes.getColor(24, this.a0));
        setFillCircleColor(obtainStyledAttributes.getColor(16, this.W));
        setOuterContourColor(obtainStyledAttributes.getColor(22, this.T));
        setOuterContourSize(obtainStyledAttributes.getDimension(23, this.J));
        setInnerContourColor(obtainStyledAttributes.getColor(17, this.U));
        setInnerContourSize(obtainStyledAttributes.getDimension(18, this.K));
        setMaxValue(obtainStyledAttributes.getFloat(19, this.u));
        setMinValueAllowed(obtainStyledAttributes.getFloat(21, this.v));
        setMaxValueAllowed(obtainStyledAttributes.getFloat(20, this.w));
        setRoundToBlock(obtainStyledAttributes.getBoolean(26, this.I0));
        setRoundToWholeNumber(obtainStyledAttributes.getBoolean(27, this.J0));
        setUnit(obtainStyledAttributes.getString(42));
        setUnitVisible(obtainStyledAttributes.getBoolean(30, this.x0));
        setTextScale(obtainStyledAttributes.getFloat(39, this.R));
        setUnitScale(obtainStyledAttributes.getFloat(45, this.S));
        setSeekModeEnabled(obtainStyledAttributes.getBoolean(28, this.B0));
        setStartAngle(obtainStyledAttributes.getInt(35, this.I));
        setShowTextWhileSpinning(obtainStyledAttributes.getBoolean(29, this.C0));
        if (obtainStyledAttributes.hasValue(12)) {
            setBlockCount(obtainStyledAttributes.getInt(12, 1));
            setBlockScale(obtainStyledAttributes.getFloat(13, 0.9f));
        }
        if (obtainStyledAttributes.hasValue(41)) {
            try {
                this.M0 = Typeface.createFromAsset(getContext().getAssets(), obtainStyledAttributes.getString(41));
            } catch (Exception unused) {
            }
        }
        if (obtainStyledAttributes.hasValue(48)) {
            try {
                this.N0 = Typeface.createFromAsset(getContext().getAssets(), obtainStyledAttributes.getString(48));
            } catch (Exception unused2) {
            }
        }
        if (obtainStyledAttributes.hasValue(14)) {
            try {
                String string = obtainStyledAttributes.getString(14);
                if (string != null) {
                    this.L0 = new DecimalFormat(string);
                }
            } catch (Exception e) {
                e.getMessage();
            }
        }
        obtainStyledAttributes.recycle();
        if (!isInEditMode()) {
            setLayerType(2, null);
        }
        Paint paint = new Paint(1);
        this.z0 = paint;
        paint.setFilterBitmap(false);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        j();
        Paint paint2 = this.j0;
        paint2.setAntiAlias(true);
        paint2.setStrokeCap(this.g0);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        paint2.setStrokeWidth(this.G);
        paint2.setColor(this.V);
        Paint paint3 = this.p0;
        paint3.setColor(this.T);
        paint3.setAntiAlias(true);
        paint3.setStyle(style);
        paint3.setStrokeWidth(this.J);
        Paint paint4 = this.q0;
        paint4.setColor(this.U);
        paint4.setAntiAlias(true);
        paint4.setStyle(style);
        paint4.setStrokeWidth(this.K);
        Paint paint5 = this.o0;
        Paint.Style style2 = Paint.Style.FILL;
        paint5.setStyle(style2);
        paint5.setAntiAlias(true);
        Typeface typeface = this.N0;
        if (typeface != null) {
            paint5.setTypeface(typeface);
        }
        Paint paint6 = this.n0;
        paint6.setSubpixelText(true);
        paint6.setLinearText(true);
        Typeface typeface2 = Typeface.MONOSPACE;
        paint6.setTypeface(typeface2);
        paint6.setColor(this.b0);
        paint6.setStyle(style2);
        paint6.setAntiAlias(true);
        paint6.setTextSize(this.Q);
        Typeface typeface3 = this.M0;
        if (typeface3 != null) {
            paint6.setTypeface(typeface3);
        } else {
            paint6.setTypeface(typeface2);
        }
        Paint paint7 = this.l0;
        paint7.setColor(this.W);
        paint7.setAntiAlias(true);
        paint7.setStyle(style2);
        Paint paint8 = this.m0;
        paint8.setColor(this.a0);
        paint8.setAntiAlias(true);
        paint8.setStyle(style);
        paint8.setStrokeWidth(this.H);
        Paint paint9 = this.k0;
        paint9.setColor(this.N);
        paint9.setAntiAlias(true);
        paint9.setStyle(style);
        paint9.setStrokeWidth(this.L);
        if (this.B) {
            setSpin(true);
            this.F.sendEmptyMessage(0);
        }
    }

    public static RectF a(String str, Paint paint, RectF rectF) {
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        float width = rect.width() + rect.left;
        float height = (rect.height() * 0.93f) + rect.bottom;
        RectF rectF2 = new RectF();
        rectF2.left = ((rectF.width() - width) / 2.0f) + rectF.left;
        float height2 = ((rectF.height() - height) / 2.0f) + rectF.top;
        rectF2.top = height2;
        rectF2.right = rectF2.left + width;
        rectF2.bottom = height2 + height;
        return rectF2;
    }

    public static float c(String str, Paint paint, RectF rectF) {
        Matrix matrix = new Matrix();
        Rect rect = new Rect();
        String replace = str.replace('1', '0');
        paint.getTextBounds(replace, 0, replace.length(), rect);
        matrix.setRectToRect(new RectF(rect), rectF, Matrix.ScaleToFit.CENTER);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        return paint.getTextSize() * fArr[0];
    }

    private void setSpin(boolean z) {
        this.B = z;
    }

    private void setTextSizeAndTextBoundsWithFixedTextSize(String str) {
        float f = this.Q;
        Paint paint = this.n0;
        paint.setTextSize(f);
        this.m = a(str, paint, this.i);
    }

    public final int b(double d) {
        int[] iArr = this.e0;
        if (iArr.length <= 1) {
            if (iArr.length == 1) {
                return iArr[0];
            }
            return -16777216;
        }
        double maxValue = (1.0f / getMaxValue()) * d;
        int floor = (int) Math.floor((this.e0.length - 1) * maxValue);
        int i = floor + 1;
        if (floor < 0) {
            floor = 0;
            i = 1;
        } else {
            int[] iArr2 = this.e0;
            if (i >= iArr2.length) {
                floor = iArr2.length - 2;
                i = iArr2.length - 1;
            }
        }
        int[] iArr3 = this.e0;
        int i2 = iArr3[floor];
        int i3 = iArr3[i];
        float length = (float) (1.0d - (((iArr3.length - 1) * maxValue) % 1.0d));
        float f = 1.0f - length;
        int[] iArr4 = {Math.round((Color.red(i3) * f) + (Color.red(i2) * length)), Math.round((Color.green(i3) * f) + (Color.green(i2) * length)), Math.round((f * Color.blue(i3)) + (Color.blue(i2) * length))};
        return Color.argb(255, iArr4[0], iArr4[1], iArr4[2]);
    }

    public final void d(Canvas canvas, float f) {
        t40 t40Var = this.q;
        int i = this.I;
        float f2 = t40Var == t40.g ? i : i - f;
        boolean z = this.D0;
        float f3 = 0.0f;
        Paint paint = this.h0;
        if (z) {
            RectF rectF = this.i;
            while (f3 < f) {
                Paint paint2 = paint;
                canvas.drawArc(rectF, f2 + f3, Math.min(this.H0, f - f3), false, paint2);
                paint = paint2;
                f3 += this.G0;
            }
            return;
        }
        if (this.f0 == Paint.Cap.BUTT || f <= 0.0f || this.e0.length <= 1) {
            canvas.drawArc(this.i, f2, f, false, paint);
            return;
        }
        RectF rectF2 = this.i;
        if (f <= 180.0f) {
            canvas.drawArc(rectF2, f2, f, false, paint);
            canvas.drawArc(this.i, f2, 1.0f, false, this.i0);
        } else {
            float f4 = f / 2.0f;
            canvas.drawArc(rectF2, f2, f4, false, paint);
            canvas.drawArc(this.i, f2, 1.0f, false, this.i0);
            canvas.drawArc(this.i, f2 + f4, f4, false, paint);
        }
    }

    public final void e(Canvas canvas) {
        float f;
        float f2;
        if (this.x < 0.0f) {
            this.x = 1.0f;
        }
        t40 t40Var = this.q;
        int i = this.I;
        if (t40Var == t40.g) {
            f = i + this.z;
            f2 = this.x;
        } else {
            f = i;
            f2 = this.z;
        }
        canvas.drawArc(this.i, f - f2, this.x, false, this.j0);
    }

    public final void f(Canvas canvas) {
        float f;
        float f2;
        float f3;
        String format;
        float f4;
        boolean z;
        int ordinal = this.u0.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            f = this.A0;
            f2 = 0.25f * f;
            f3 = 0.4f;
        } else {
            f = this.A0;
            f2 = 0.55f * f;
            f3 = 0.3f;
        }
        float f5 = f * f3;
        float width = (this.l.width() * 0.05f) / 2.0f;
        float width2 = this.l.width() * f5;
        float height = (this.l.height() * 0.025f) / 2.0f;
        float height2 = this.l.height() * f2;
        boolean z2 = this.d0;
        Paint paint = this.n0;
        if (z2) {
            paint.setColor(b(this.r));
        }
        int ordinal2 = this.v0.ordinal();
        if (ordinal2 == 1) {
            format = this.L0.format((100.0f / this.u) * this.r);
        } else if (ordinal2 != 2) {
            format = this.r0;
            if (format == null) {
                format = "";
            }
        } else {
            format = this.L0.format(this.r);
        }
        if (this.s0 != format.length()) {
            int length = format.length();
            this.s0 = length;
            RectF rectF = this.i;
            if (length == 1) {
                this.l = g(rectF);
                RectF rectF2 = this.l;
                float width3 = (rectF2.width() * 0.1f) + rectF2.left;
                RectF rectF3 = this.l;
                f4 = 2.0f;
                this.l = new RectF(width3, rectF3.top, rectF3.right - (rectF3.width() * 0.1f), this.l.bottom);
            } else {
                f4 = 2.0f;
                this.l = g(rectF);
            }
            if (this.w0) {
                RectF rectF4 = this.l;
                if (this.x0) {
                    int ordinal3 = this.u0.ordinal();
                    if (ordinal3 == 0) {
                        RectF rectF5 = this.l;
                        rectF4 = new RectF(rectF5.left, rectF5.top + height2 + height, rectF5.right, rectF5.bottom);
                    } else if (ordinal3 == 1) {
                        RectF rectF6 = this.l;
                        rectF4 = new RectF(rectF6.left, rectF6.top, rectF6.right, (rectF6.bottom - height2) - height);
                    } else if (ordinal3 == 2 || ordinal3 == 4) {
                        RectF rectF7 = this.l;
                        rectF4 = new RectF(rectF7.left + width2 + width, rectF7.top, rectF7.right, rectF7.bottom);
                    } else {
                        RectF rectF8 = this.l;
                        rectF4 = new RectF(rectF8.left, rectF8.top, (rectF8.right - width2) - width, rectF8.bottom);
                    }
                }
                paint.setTextSize(c(format, paint, rectF4) * this.R);
                this.m = a(format, paint, rectF4);
            } else {
                setTextSizeAndTextBoundsWithFixedTextSize(format);
            }
            z = true;
        } else {
            f4 = 2.0f;
            z = false;
        }
        canvas.drawText(format, this.m.left - (paint.getTextSize() * 0.02f), this.m.bottom, paint);
        if (this.x0) {
            boolean z3 = this.d0;
            Paint paint2 = this.o0;
            if (z3) {
                paint2.setColor(b(this.r));
            }
            if (z) {
                if (this.w0) {
                    int ordinal4 = this.u0.ordinal();
                    if (ordinal4 == 0) {
                        RectF rectF9 = this.l;
                        float f6 = rectF9.left;
                        float f7 = rectF9.top;
                        this.n = new RectF(f6, f7, rectF9.right, (height2 + f7) - height);
                    } else if (ordinal4 == 1) {
                        RectF rectF10 = this.l;
                        float f8 = rectF10.left;
                        float f9 = rectF10.bottom;
                        this.n = new RectF(f8, (f9 - height2) + height, rectF10.right, f9);
                    } else if (ordinal4 == 2 || ordinal4 == 4) {
                        RectF rectF11 = this.l;
                        float f10 = rectF11.left;
                        float f11 = rectF11.top;
                        this.n = new RectF(f10, f11, (width2 + f10) - width, height2 + f11);
                    } else {
                        RectF rectF12 = this.l;
                        float f12 = rectF12.right;
                        float f13 = rectF12.top;
                        this.n = new RectF((f12 - width2) + width, f13, f12, height2 + f13);
                    }
                    paint2.setTextSize(c(this.t0, paint2, this.n) * this.S);
                    this.n = a(this.t0, paint2, this.n);
                    int ordinal5 = this.u0.ordinal();
                    if (ordinal5 == 2 || ordinal5 == 3) {
                        float f14 = this.m.top;
                        RectF rectF13 = this.n;
                        rectF13.offset(0.0f, f14 - rectF13.top);
                    } else if (ordinal5 == 4 || ordinal5 == 5) {
                        float f15 = this.m.bottom;
                        RectF rectF14 = this.n;
                        rectF14.offset(0.0f, f15 - rectF14.bottom);
                    }
                } else {
                    float f16 = width * f4;
                    float f17 = height * f4;
                    paint2.setTextSize(this.P);
                    this.n = a(this.t0, paint2, this.l);
                    int ordinal6 = this.u0.ordinal();
                    if (ordinal6 == 0) {
                        RectF rectF15 = this.n;
                        rectF15.offsetTo(rectF15.left, (this.m.top - f17) - rectF15.height());
                    } else if (ordinal6 == 1) {
                        RectF rectF16 = this.n;
                        rectF16.offsetTo(rectF16.left, this.m.bottom + f17);
                    } else if (ordinal6 == 2 || ordinal6 == 4) {
                        RectF rectF17 = this.n;
                        rectF17.offsetTo((this.m.left - f16) - rectF17.width(), this.n.top);
                    } else {
                        RectF rectF18 = this.n;
                        rectF18.offsetTo(this.m.right + f16, rectF18.top);
                    }
                    int ordinal7 = this.u0.ordinal();
                    if (ordinal7 == 2 || ordinal7 == 3) {
                        float f18 = this.m.top;
                        RectF rectF19 = this.n;
                        rectF19.offset(0.0f, f18 - rectF19.top);
                    } else if (ordinal7 == 4 || ordinal7 == 5) {
                        float f19 = this.m.bottom;
                        RectF rectF20 = this.n;
                        rectF20.offset(0.0f, f19 - rectF20.bottom);
                    }
                }
            }
            canvas.drawText(this.t0, this.n.left - (paint2.getTextSize() * 0.02f), this.n.bottom, paint2);
        }
    }

    public final RectF g(RectF rectF) {
        float f;
        float f2;
        float width = (rectF.width() - ((float) (Math.sqrt(2.0d) * ((((rectF.width() - Math.max(this.G, this.H)) - this.J) - this.K) / 2.0d)))) / 2.0f;
        if (this.x0) {
            int ordinal = this.u0.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                f = 1.1f;
                f2 = 0.88f;
            } else if (ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 5) {
                f = 0.77f;
                f2 = 1.33f;
            }
            float f3 = f * width;
            float f4 = width * f2;
            return new RectF(rectF.left + f3, rectF.top + f4, rectF.right - f3, rectF.bottom - f4);
        }
        f = 1.0f;
        f2 = 1.0f;
        float f32 = f * width;
        float f42 = width * f2;
        return new RectF(rectF.left + f32, rectF.top + f42, rectF.right - f32, rectF.bottom - f42);
    }

    public int[] getBarColors() {
        return this.e0;
    }

    public id getBarStartEndLine() {
        return this.M;
    }

    public Paint.Cap getBarStrokeCap() {
        return this.f0;
    }

    public int getBarWidth() {
        return this.G;
    }

    public int getBlockCount() {
        return this.E0;
    }

    public float getBlockScale() {
        return this.F0;
    }

    public float getCurrentValue() {
        return this.r;
    }

    public DecimalFormat getDecimalFormat() {
        return this.L0;
    }

    public int getDelayMillis() {
        return this.D;
    }

    public int getFillColor() {
        return this.l0.getColor();
    }

    public int getInnerContourColor() {
        return this.U;
    }

    public float getInnerContourSize() {
        return this.K;
    }

    public float getMaxValue() {
        return this.u;
    }

    public float getMaxValueAllowed() {
        return this.w;
    }

    public float getMinValueAllowed() {
        return this.v;
    }

    public int getOuterContourColor() {
        return this.T;
    }

    public float getOuterContourSize() {
        return this.J;
    }

    public float getRelativeUniteSize() {
        return this.A0;
    }

    public int getRimColor() {
        return this.a0;
    }

    public Shader getRimShader() {
        return this.m0.getShader();
    }

    public int getRimWidth() {
        return this.H;
    }

    public boolean getRoundToBlock() {
        return this.I0;
    }

    public boolean getRoundToWholeNumber() {
        return this.J0;
    }

    public float getSpinSpeed() {
        return this.A;
    }

    public Paint.Cap getSpinnerStrokeCap() {
        return this.g0;
    }

    public int getStartAngle() {
        return this.I;
    }

    public float getTextScale() {
        return this.R;
    }

    public int getTextSize() {
        return this.Q;
    }

    public String getUnit() {
        return this.t0;
    }

    public float getUnitScale() {
        return this.S;
    }

    public int getUnitSize() {
        return this.P;
    }

    public final float h(PointF pointF) {
        PointF pointF2 = this.k;
        double degrees = Math.toDegrees(Math.atan2(pointF.y - pointF2.y, pointF.x - pointF2.x));
        if (degrees < 0.0d) {
            degrees += 360.0d;
        }
        long round = Math.round(degrees);
        t40 t40Var = this.q;
        int i = this.I;
        return (((t40Var == t40.g ? round - i : i - round) % 360.0f) + 360.0f) % 360.0f;
    }

    public final void i(float f, long j) {
        float f2 = this.r;
        if (this.D0 && this.I0) {
            f = Math.round(f / r1) * (this.u / this.E0);
        } else if (this.J0) {
            f = Math.round(f);
        }
        float max = Math.max(this.v, f);
        float f3 = this.w;
        if (f3 >= 0.0f) {
            max = Math.min(f3, max);
        }
        this.C = j;
        Message message = new Message();
        message.what = 3;
        message.obj = new float[]{f2, max};
        this.F.sendMessage(message);
    }

    public final void j() {
        int[] iArr = this.e0;
        int length = iArr.length;
        Paint paint = this.h0;
        if (length > 1) {
            paint.setShader(new SweepGradient(this.i.centerX(), this.i.centerY(), this.e0, (float[]) null));
            Matrix matrix = new Matrix();
            paint.getShader().getLocalMatrix(matrix);
            matrix.postTranslate(-this.i.centerX(), -this.i.centerY());
            matrix.postRotate(this.I);
            matrix.postTranslate(this.i.centerX(), this.i.centerY());
            paint.getShader().setLocalMatrix(matrix);
            paint.setColor(this.e0[0]);
        } else if (iArr.length == 1) {
            paint.setColor(iArr[0]);
            paint.setShader(null);
        } else {
            paint.setColor(-16738680);
            paint.setShader(null);
        }
        paint.setAntiAlias(true);
        paint.setStrokeCap(this.f0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.G);
        if (this.f0 != Paint.Cap.BUTT) {
            Paint paint2 = new Paint(paint);
            this.i0 = paint2;
            paint2.setShader(null);
            this.i0.setColor(this.e0[0]);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        super.onDraw(canvas);
        float f = (360.0f / this.u) * this.r;
        if (this.W != 0) {
            canvas.drawArc(this.j, 360.0f, 360.0f, false, this.l0);
        }
        if (this.H > 0) {
            boolean z = this.D0;
            RectF rectF = this.i;
            Paint paint2 = this.m0;
            if (z) {
                float f2 = this.I;
                float f3 = 0.0f;
                while (f3 < 360.0f) {
                    canvas.drawArc(rectF, f2 + f3, Math.min(this.H0, 360.0f - f3), false, paint2);
                    f3 += this.G0;
                }
            } else {
                canvas.drawArc(rectF, 360.0f, 360.0f, false, paint2);
            }
        }
        if (this.J > 0.0f) {
            canvas.drawArc(this.o, 360.0f, 360.0f, false, this.p0);
        }
        if (this.K > 0.0f) {
            canvas.drawArc(this.p, 360.0f, 360.0f, false, this.q0);
        }
        int i = this.O0;
        if (i == 2 || i == 3) {
            e(canvas);
            if (this.C0) {
                f(canvas);
            }
        } else if (i == 4) {
            e(canvas);
            if (this.E) {
                d(canvas, f);
                f(canvas);
            } else if (this.C0) {
                f(canvas);
            }
        } else {
            d(canvas, f);
            f(canvas);
        }
        Bitmap bitmap = this.y0;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.z0);
        }
        if (this.L > 0) {
            id idVar = id.g;
            id idVar2 = this.M;
            if (idVar2 == idVar || f == 0.0f) {
                return;
            }
            t40 t40Var = this.q;
            int i2 = this.I;
            float f4 = t40Var == t40.g ? i2 : i2 - f;
            float f5 = this.O;
            float f6 = f4 - (f5 / 2.0f);
            id idVar3 = id.h;
            Paint paint3 = this.k0;
            id idVar4 = id.j;
            if (idVar2 == idVar3 || idVar2 == idVar4) {
                paint = paint3;
                canvas.drawArc(this.i, f6, f5, false, paint);
            } else {
                paint = paint3;
            }
            if (idVar2 == id.i || idVar2 == idVar4) {
                canvas.drawArc(this.i, f6 + f, this.O, false, paint);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (measuredHeight - getPaddingTop()) - getPaddingBottom();
        if (paddingLeft > paddingTop) {
            paddingLeft = paddingTop;
        }
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + paddingLeft, getPaddingBottom() + getPaddingTop() + paddingLeft);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.h = i;
        this.g = i2;
        int min = Math.min(i, i2);
        int i5 = this.h - min;
        int i6 = (this.g - min) / 2;
        float paddingTop = getPaddingTop() + i6;
        float paddingBottom = getPaddingBottom() + i6;
        int i7 = i5 / 2;
        float paddingLeft = getPaddingLeft() + i7;
        float paddingRight = getPaddingRight() + i7;
        int width = getWidth();
        int height = getHeight();
        float f = this.G / 2.0f;
        float f2 = (this.H / 2.0f) + this.J;
        if (f <= f2) {
            f = f2;
        }
        float f3 = width - paddingRight;
        float f4 = height - paddingBottom;
        this.i = new RectF(paddingLeft + f, paddingTop + f, f3 - f, f4 - f);
        float f5 = this.G;
        this.j = new RectF(paddingLeft + f5, paddingTop + f5, f3 - f5, f4 - f5);
        this.l = g(this.i);
        RectF rectF = this.i;
        float f6 = rectF.left;
        float f7 = this.H / 2.0f;
        float f8 = this.K / 2.0f;
        this.p = new RectF(f6 + f7 + f8, rectF.top + f7 + f8, (rectF.right - f7) - f8, (rectF.bottom - f7) - f8);
        RectF rectF2 = this.i;
        float f9 = rectF2.left;
        float f10 = this.H / 2.0f;
        float f11 = this.J / 2.0f;
        this.o = new RectF((f9 - f10) - f11, (rectF2.top - f10) - f11, rectF2.right + f10 + f11, f10 + rectF2.bottom + f11);
        this.k = new PointF(this.i.centerX(), this.i.centerY());
        j();
        Bitmap bitmap = this.y0;
        if (bitmap != null) {
            this.y0 = Bitmap.createScaledBitmap(bitmap, getWidth(), getHeight(), false);
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.B0) {
            return super.onTouchEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 || actionMasked == 1) {
            this.K0 = 0;
            i((this.u / 360.0f) * h(new PointF(motionEvent.getX(), motionEvent.getY())), 800L);
            return true;
        }
        if (actionMasked != 2) {
            if (actionMasked != 3) {
                return super.onTouchEvent(motionEvent);
            }
            this.K0 = 0;
            return false;
        }
        int i = this.K0 + 1;
        this.K0 = i;
        if (i <= 5) {
            return false;
        }
        setValue((this.u / 360.0f) * h(new PointF(motionEvent.getX(), motionEvent.getY())));
        return true;
    }

    public void setAutoTextSize(boolean z) {
        this.w0 = z;
    }

    public void setBarColor(int... iArr) {
        this.e0 = iArr;
        j();
    }

    public void setBarStrokeCap(Paint.Cap cap) {
        this.f0 = cap;
        Paint paint = this.h0;
        paint.setStrokeCap(cap);
        if (this.f0 != Paint.Cap.BUTT) {
            Paint paint2 = new Paint(paint);
            this.i0 = paint2;
            paint2.setShader(null);
            this.i0.setColor(this.e0[0]);
        }
    }

    public void setBarWidth(int i) {
        this.G = i;
        float f = i;
        this.h0.setStrokeWidth(f);
        this.j0.setStrokeWidth(f);
    }

    public void setBlockCount(int i) {
        if (i <= 1) {
            this.D0 = false;
            return;
        }
        this.D0 = true;
        this.E0 = i;
        float f = 360.0f / i;
        this.G0 = f;
        this.H0 = f * this.F0;
    }

    public void setBlockScale(float f) {
        if (f < 0.0f || f > 1.0f) {
            return;
        }
        this.F0 = f;
        this.H0 = this.G0 * f;
    }

    public void setClippingBitmap(Bitmap bitmap) {
        if (getWidth() <= 0 || getHeight() <= 0) {
            this.y0 = bitmap;
        } else {
            this.y0 = Bitmap.createScaledBitmap(bitmap, getWidth(), getHeight(), false);
        }
        if (this.y0 == null) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void setDecimalFormat(DecimalFormat decimalFormat) {
        if (decimalFormat != null) {
            this.L0 = decimalFormat;
        } else {
            c.m("decimalFormat must not be null!");
        }
    }

    public void setDelayMillis(int i) {
        this.D = i;
    }

    public void setDirection(t40 t40Var) {
        this.q = t40Var;
    }

    public void setFillCircleColor(int i) {
        this.W = i;
        this.l0.setColor(i);
    }

    public void setInnerContourColor(int i) {
        this.U = i;
        this.q0.setColor(i);
    }

    public void setInnerContourSize(float f) {
        this.K = f;
        this.q0.setStrokeWidth(f);
    }

    public void setLengthChangeInterpolator(TimeInterpolator timeInterpolator) {
        this.F.e = timeInterpolator;
    }

    public void setMaxValue(float f) {
        this.u = f;
    }

    public void setMaxValueAllowed(float f) {
        this.w = f;
    }

    public void setMinValueAllowed(float f) {
        this.v = f;
    }

    public void setOnAnimationStateChangedListener(n4 n4Var) {
    }

    public void setOnProgressChangedListener(nq nqVar) {
    }

    public void setOuterContourColor(int i) {
        this.T = i;
        this.p0.setColor(i);
    }

    public void setOuterContourSize(float f) {
        this.J = f;
        this.p0.setStrokeWidth(f);
    }

    public void setRimColor(int i) {
        this.a0 = i;
        this.m0.setColor(i);
    }

    public void setRimShader(Shader shader) {
        this.m0.setShader(shader);
    }

    public void setRimWidth(int i) {
        this.H = i;
        this.m0.setStrokeWidth(i);
    }

    public void setRoundToBlock(boolean z) {
        this.I0 = z;
    }

    public void setRoundToWholeNumber(boolean z) {
        this.J0 = z;
    }

    public void setSeekModeEnabled(boolean z) {
        this.B0 = z;
    }

    public void setShowBlock(boolean z) {
        this.D0 = z;
    }

    public void setShowTextWhileSpinning(boolean z) {
        this.C0 = z;
    }

    public void setSpinBarColor(int i) {
        this.V = i;
        this.j0.setColor(i);
    }

    public void setSpinSpeed(float f) {
        this.A = f;
    }

    public void setSpinnerStrokeCap(Paint.Cap cap) {
        this.g0 = cap;
        this.j0.setStrokeCap(cap);
    }

    public void setSpinningBarLength(float f) {
        this.y = f;
        this.x = f;
    }

    public void setStartAngle(int i) {
        this.I = (int) (((i % 360.0f) + 360.0f) % 360.0f);
    }

    public void setText(String str) {
        if (str == null) {
            str = "";
        }
        this.r0 = str;
        invalidate();
    }

    public void setTextColor(int i) {
        this.b0 = i;
        this.n0.setColor(i);
    }

    public void setTextColorAuto(boolean z) {
        this.d0 = z;
    }

    public void setTextMode(wx1 wx1Var) {
        this.v0 = wx1Var;
    }

    public void setTextScale(float f) {
        this.R = f;
    }

    public void setTextSize(int i) {
        this.n0.setTextSize(i);
        this.Q = i;
        this.w0 = false;
    }

    public void setTextTypeface(Typeface typeface) {
        this.n0.setTypeface(typeface);
    }

    public void setUnit(String str) {
        if (str == null) {
            this.t0 = "";
        } else {
            this.t0 = str;
        }
        invalidate();
    }

    public void setUnitColor(int i) {
        this.c0 = i;
        this.o0.setColor(i);
        this.d0 = false;
    }

    public void setUnitPosition(f42 f42Var) {
        this.u0 = f42Var;
        this.s0 = -1;
        this.l = g(this.i);
        invalidate();
    }

    public void setUnitScale(float f) {
        this.S = f;
    }

    public void setUnitSize(int i) {
        this.P = i;
        this.o0.setTextSize(i);
    }

    public void setUnitTextTypeface(Typeface typeface) {
        this.o0.setTypeface(typeface);
    }

    public void setUnitToTextScale(float f) {
        this.A0 = f;
        this.s0 = -1;
        this.l = g(this.i);
        invalidate();
    }

    public void setUnitVisible(boolean z) {
        if (z != this.x0) {
            this.x0 = z;
            this.s0 = -1;
            this.l = g(this.i);
            invalidate();
        }
    }

    public void setValue(float f) {
        if (this.D0 && this.I0) {
            f = Math.round(f / r0) * (this.u / this.E0);
        } else if (this.J0) {
            f = Math.round(f);
        }
        float max = Math.max(this.v, f);
        float f2 = this.w;
        if (f2 >= 0.0f) {
            max = Math.min(f2, max);
        }
        Message message = new Message();
        message.what = 2;
        message.obj = new float[]{max, max};
        this.F.sendMessage(message);
    }

    public void setValueAnimated(float f) {
        i(f, 1200L);
    }

    public void setValueInterpolator(TimeInterpolator timeInterpolator) {
        this.F.f = timeInterpolator;
    }
}
