package flar2.devcheck.utils;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import defpackage.il;
import defpackage.pb1;
import defpackage.rs1;

/* loaded from: classes.dex */
public class SuccessLoadingView extends View {
    public static final int B = Color.parseColor("#C1904B");
    public final il A;
    public int g;
    public int h;
    public int i;
    public int j;
    public RectF k;
    public final float[] l;
    public float m;
    public final Paint n;
    public final Paint o;
    public final Path p;
    public final Path q;
    public final Path r;
    public PathMeasure s;
    public float t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public ValueAnimator y;
    public ValueAnimator z;

    public SuccessLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.j = 180;
        this.t = 0.0f;
        this.u = false;
        this.v = false;
        this.w = false;
        this.x = false;
        this.A = new il(4, this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, pb1.c);
        this.g = obtainStyledAttributes.getColor(1, B);
        this.i = obtainStyledAttributes.getDimensionPixelSize(2, a(5.0f));
        this.h = obtainStyledAttributes.getInt(0, 500);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.n = paint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.n.setStrokeCap(Paint.Cap.ROUND);
        this.n.setStrokeJoin(Paint.Join.ROUND);
        this.n.setColor(this.g);
        this.n.setStrokeWidth(this.i);
        Paint paint2 = new Paint(1);
        this.o = paint2;
        paint2.setStyle(style);
        this.o.setColor(this.g);
        this.o.setStrokeWidth(this.i);
        this.p = new Path();
        this.r = new Path();
        this.q = new Path();
        this.l = new float[2];
    }

    public final int a(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void b() {
        if (this.u || this.w) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        this.y = ofFloat;
        ofFloat.setDuration(this.h);
        this.y.addUpdateListener(this.A);
        this.y.addListener(new rs1(this, 0));
        this.y.start();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.y;
        if (valueAnimator != null) {
            if (valueAnimator.isRunning()) {
                this.y.cancel();
            }
            this.y = null;
        }
        ValueAnimator valueAnimator2 = this.z;
        if (valueAnimator2 != null) {
            if (valueAnimator2.isRunning()) {
                this.z.cancel();
            }
            this.z = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i = this.g;
        Paint paint = this.n;
        paint.setColor(i);
        paint.setStrokeWidth(this.i);
        int i2 = this.g;
        Paint paint2 = this.o;
        paint2.setColor(i2);
        paint2.setStrokeWidth(this.i);
        if (this.u) {
            Path path = this.p;
            path.reset();
            int i3 = (int) this.t;
            this.j = i3;
            path.addArc(this.k, 0.0f, i3);
            canvas.drawPath(path, paint);
            return;
        }
        if (this.v) {
            Path path2 = this.q;
            path2.reset();
            float[] fArr = this.l;
            path2.addCircle(fArr[0], fArr[1], this.m, Path.Direction.CCW);
            canvas.drawPath(path2, paint);
            if (!this.w) {
                if (this.x) {
                    canvas.drawPath(this.r, paint2);
                }
            } else {
                Path path3 = new Path();
                path3.lineTo(0.0f, 0.0f);
                this.s.getSegment(0.0f, this.s.getLength() * this.t, path3, true);
                canvas.drawPath(path3, paint2);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int a2 = a(30.0f);
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i3 = 0;
        if (mode == Integer.MIN_VALUE || mode == 0) {
            size = Math.min(a2, size);
        } else if (mode != 1073741824) {
            size = 0;
        }
        int a3 = a(30.0f);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            i3 = Math.min(a3, size2);
        } else if (mode2 == 1073741824) {
            i3 = size2;
        }
        setMeasuredDimension(size, i3);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int width = getWidth();
        int height = getHeight();
        float[] fArr = this.l;
        fArr[0] = ((width - paddingLeft) - paddingRight) >> 1;
        int i5 = (height - paddingTop) - paddingBottom;
        fArr[1] = i5 >> 1;
        int i6 = this.i;
        this.m = Math.min((((width - paddingRight) - paddingLeft) - (i6 * 2)) >> 1, (i5 - (i6 * 2)) >> 1);
        int i7 = this.i;
        RectF rectF = new RectF(paddingLeft + i7, paddingTop + i7, (width - i7) - paddingRight, (height - i7) - paddingBottom);
        this.k = rectF;
        this.p.arcTo(rectF, 0.0f, this.j, true);
        this.r.reset();
        float f = width;
        this.r.moveTo((int) (0.2f * f), (int) (0.5f * r11));
        this.r.lineTo((int) (0.4f * f), (int) (0.7f * r11));
        this.r.lineTo((int) (f * 0.8f), (int) (height * 0.3f));
        this.s = new PathMeasure(this.r, false);
    }

    public void setAnimDuration(int i) {
        this.h = i;
    }

    public void setStrokeColor(int i) {
        this.g = i;
    }

    public void setStrokeWidth(int i) {
        this.i = i;
    }
}
