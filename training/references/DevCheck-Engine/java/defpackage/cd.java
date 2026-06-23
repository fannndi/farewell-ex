package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class cd extends mp implements qp {
    public int I;
    public boolean J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public Paint R;
    public Paint S;
    public boolean T;
    public boolean U;
    public boolean V;
    public float W;
    public boolean a0;
    public gd2 b0;
    public gd2 c0;
    public hd2 d0;
    public hd2 e0;
    public h02 f0;
    public h02 g0;
    public ed2 h0;
    public final RectF i0;
    public final Matrix j0;
    public final ht0 k0;
    public final ht0 l0;
    public final float[] m0;

    public cd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.I = 100;
        this.J = false;
        this.K = false;
        this.L = true;
        this.M = true;
        this.N = true;
        this.O = true;
        this.P = true;
        this.Q = true;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = 15.0f;
        this.a0 = false;
        this.i0 = new RectF();
        this.j0 = new Matrix();
        new Matrix();
        p31 p31Var = ht0.j;
        ht0 ht0Var = (ht0) p31Var.b();
        ht0Var.h = 0.0d;
        ht0Var.i = 0.0d;
        this.k0 = ht0Var;
        ht0 ht0Var2 = (ht0) p31Var.b();
        ht0Var2.h = 0.0d;
        ht0Var2.i = 0.0d;
        this.l0 = ht0Var2;
        this.m0 = new float[2];
    }

    @Override // defpackage.mp
    public void a() {
        RectF rectF = this.i0;
        i(rectF);
        float f = rectF.left + 0.0f;
        float f2 = rectF.top + 0.0f;
        float f3 = rectF.right + 0.0f;
        float f4 = rectF.bottom + 0.0f;
        if (this.b0.g()) {
            f += this.b0.f(this.d0.e);
        }
        if (this.c0.g()) {
            f3 += this.c0.f(this.e0.e);
        }
        dd2 dd2Var = this.o;
        if (dd2Var.f53a && dd2Var.q) {
            float f5 = dd2Var.B + dd2Var.c;
            int i = dd2Var.C;
            if (i == 2) {
                f4 += f5;
            } else {
                if (i != 1) {
                    if (i == 3) {
                        f4 += f5;
                    }
                }
                f2 += f5;
            }
        }
        float extraTopOffset = getExtraTopOffset() + f2;
        float extraRightOffset = getExtraRightOffset() + f3;
        float extraBottomOffset = getExtraBottomOffset() + f4;
        float extraLeftOffset = getExtraLeftOffset() + f;
        float c = n52.c(this.W);
        this.x.l(Math.max(c, extraLeftOffset), Math.max(c, extraTopOffset), Math.max(c, extraRightOffset), Math.max(c, extraBottomOffset));
        if (this.g) {
            this.x.b.toString();
        }
        h02 h02Var = this.g0;
        this.c0.getClass();
        h02Var.g();
        h02 h02Var2 = this.f0;
        this.b0.getClass();
        h02Var2.g();
        l();
    }

    @Override // android.view.View
    public final void computeScroll() {
        rp rpVar = this.s;
        if (rpVar instanceof dd) {
            dd ddVar = (dd) rpVar;
            it0 it0Var = ddVar.v;
            mp mpVar = ddVar.j;
            it0 it0Var2 = ddVar.m;
            it0 it0Var3 = ddVar.u;
            if (it0Var.h == 0.0f && it0Var.i == 0.0f) {
                return;
            }
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            cd cdVar = (cd) mpVar;
            it0Var.h = cdVar.getDragDecelerationFrictionCoef() * it0Var.h;
            float dragDecelerationFrictionCoef = cdVar.getDragDecelerationFrictionCoef() * it0Var.i;
            it0Var.i = dragDecelerationFrictionCoef;
            float f = (currentAnimationTimeMillis - ddVar.t) / 1000.0f;
            float f2 = it0Var3.h + (it0Var.h * f);
            it0Var3.h = f2;
            float f3 = it0Var3.i + (dragDecelerationFrictionCoef * f);
            it0Var3.i = f3;
            MotionEvent obtain = MotionEvent.obtain(currentAnimationTimeMillis, currentAnimationTimeMillis, 2, f2, f3, 0);
            float f4 = cdVar.N ? it0Var3.h - it0Var2.h : 0.0f;
            float f5 = cdVar.O ? it0Var3.i - it0Var2.i : 0.0f;
            ddVar.k.set(ddVar.l);
            ((cd) mpVar).getOnChartGestureListener();
            ddVar.b();
            ddVar.k.postTranslate(f4, f5);
            obtain.recycle();
            i82 viewPortHandler = cdVar.getViewPortHandler();
            Matrix matrix = ddVar.k;
            viewPortHandler.k(matrix, mpVar, false);
            ddVar.k = matrix;
            ddVar.t = currentAnimationTimeMillis;
            if (Math.abs(it0Var.h) >= 0.01d || Math.abs(it0Var.i) >= 0.01d) {
                DisplayMetrics displayMetrics = n52.f665a;
                mpVar.postInvalidateOnAnimation();
            } else {
                cdVar.a();
                cdVar.postInvalidate();
                it0Var.h = 0.0f;
                it0Var.i = 0.0f;
            }
        }
    }

    @Override // defpackage.mp
    public void e() {
        super.e();
        this.b0 = new gd2(1);
        this.c0 = new gd2(2);
        this.f0 = new h02(this.x);
        this.g0 = new h02(this.x);
        this.d0 = new hd2(this.x, this.b0, this.f0);
        this.e0 = new hd2(this.x, this.c0, this.g0);
        this.h0 = new ed2(this.x, this.o, this.f0);
        setHighlighter(new pp(this));
        Matrix matrix = this.x.f417a;
        dd ddVar = new dd(this);
        ddVar.k = new Matrix();
        ddVar.l = new Matrix();
        ddVar.m = it0.b(0.0f, 0.0f);
        ddVar.n = it0.b(0.0f, 0.0f);
        ddVar.o = 1.0f;
        ddVar.p = 1.0f;
        ddVar.q = 1.0f;
        ddVar.t = 0L;
        ddVar.u = it0.b(0.0f, 0.0f);
        ddVar.v = it0.b(0.0f, 0.0f);
        ddVar.k = matrix;
        ddVar.w = n52.c(3.0f);
        ddVar.x = n52.c(3.5f);
        this.s = ddVar;
        Paint paint = new Paint();
        this.R = paint;
        paint.setStyle(Paint.Style.FILL);
        this.R.setColor(Color.rgb(240, 240, 240));
        Paint paint2 = new Paint();
        this.S = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.S.setColor(-16777216);
        this.S.setStrokeWidth(n52.c(1.0f));
    }

    @Override // defpackage.mp
    public final void f() {
        if (this.h == null) {
            return;
        }
        v00 v00Var = this.v;
        if (v00Var != null) {
            v00Var.q();
        }
        h();
        hd2 hd2Var = this.d0;
        gd2 gd2Var = this.b0;
        hd2Var.l(gd2Var.y, gd2Var.x);
        hd2 hd2Var2 = this.e0;
        gd2 gd2Var2 = this.c0;
        hd2Var2.l(gd2Var2.y, gd2Var2.x);
        ed2 ed2Var = this.h0;
        dd2 dd2Var = this.o;
        ed2Var.l(dd2Var.y, dd2Var.x);
        if (this.r != null) {
            this.u.l(this.h);
        }
        a();
    }

    public gd2 getAxisLeft() {
        return this.b0;
    }

    public gd2 getAxisRight() {
        return this.c0;
    }

    @Override // defpackage.mp, defpackage.qp
    public /* bridge */ ed getData() {
        return (ed) super.getData();
    }

    public r41 getDrawListener() {
        return null;
    }

    public float getHighestVisibleX() {
        h02 h02Var = this.f0;
        RectF rectF = this.x.b;
        float f = rectF.right;
        float f2 = rectF.bottom;
        ht0 ht0Var = this.l0;
        h02Var.c(f, f2, ht0Var);
        return (float) Math.min(this.o.x, ht0Var.h);
    }

    public float getLowestVisibleX() {
        h02 h02Var = this.f0;
        RectF rectF = this.x.b;
        float f = rectF.left;
        float f2 = rectF.bottom;
        ht0 ht0Var = this.k0;
        h02Var.c(f, f2, ht0Var);
        return (float) Math.max(this.o.y, ht0Var.h);
    }

    @Override // defpackage.mp, defpackage.qp
    public int getMaxVisibleCount() {
        return this.I;
    }

    public float getMinOffset() {
        return this.W;
    }

    public hd2 getRendererLeftYAxis() {
        return this.d0;
    }

    public hd2 getRendererRightYAxis() {
        return this.e0;
    }

    public ed2 getRendererXAxis() {
        return this.h0;
    }

    @Override // android.view.View
    public float getScaleX() {
        i82 i82Var = this.x;
        if (i82Var == null) {
            return 1.0f;
        }
        return i82Var.i;
    }

    @Override // android.view.View
    public float getScaleY() {
        i82 i82Var = this.x;
        if (i82Var == null) {
            return 1.0f;
        }
        return i82Var.j;
    }

    public float getVisibleXRange() {
        return Math.abs(getHighestVisibleX() - getLowestVisibleX());
    }

    @Override // defpackage.mp
    public float getYChartMax() {
        return Math.max(this.b0.x, this.c0.x);
    }

    @Override // defpackage.mp
    public float getYChartMin() {
        return Math.min(this.b0.y, this.c0.y);
    }

    public void h() {
        dd2 dd2Var = this.o;
        ed edVar = (ed) this.h;
        dd2Var.b(edVar.d, edVar.c);
        this.b0.b(((ed) this.h).j(1), ((ed) this.h).i(1));
        this.c0.b(((ed) this.h).j(2), ((ed) this.h).i(2));
    }

    public final void i(RectF rectF) {
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        qp0 qp0Var = this.r;
        if (qp0Var == null || !qp0Var.f53a || qp0Var.j) {
            return;
        }
        int A = d51.A(qp0Var.i);
        if (A == 0) {
            int A2 = d51.A(this.r.h);
            if (A2 == 0) {
                float f = rectF.top;
                qp0 qp0Var2 = this.r;
                rectF.top = Math.min(qp0Var2.t, this.x.d * qp0Var2.r) + this.r.c + f;
                return;
            } else {
                if (A2 != 2) {
                    return;
                }
                float f2 = rectF.bottom;
                qp0 qp0Var3 = this.r;
                rectF.bottom = Math.min(qp0Var3.t, this.x.d * qp0Var3.r) + this.r.c + f2;
                return;
            }
        }
        if (A != 1) {
            return;
        }
        int A3 = d51.A(this.r.g);
        if (A3 == 0) {
            float f3 = rectF.left;
            qp0 qp0Var4 = this.r;
            rectF.left = Math.min(qp0Var4.s, this.x.c * qp0Var4.r) + this.r.b + f3;
            return;
        }
        if (A3 != 1) {
            if (A3 != 2) {
                return;
            }
            float f4 = rectF.right;
            qp0 qp0Var5 = this.r;
            rectF.right = Math.min(qp0Var5.s, this.x.c * qp0Var5.r) + this.r.b + f4;
            return;
        }
        int A4 = d51.A(this.r.h);
        if (A4 == 0) {
            float f5 = rectF.top;
            qp0 qp0Var6 = this.r;
            rectF.top = Math.min(qp0Var6.t, this.x.d * qp0Var6.r) + this.r.c + f5;
        } else {
            if (A4 != 2) {
                return;
            }
            float f6 = rectF.bottom;
            qp0 qp0Var7 = this.r;
            rectF.bottom = Math.min(qp0Var7.t, this.x.d * qp0Var7.r) + this.r.c + f6;
        }
    }

    public final void j() {
        this.b0.getClass();
    }

    public final void k(float f) {
        i82 i82Var = this.x;
        h02 h02Var = this.f0;
        gy0 gy0Var = (gy0) gy0.m.b();
        gy0Var.i = i82Var;
        gy0Var.j = f;
        gy0Var.k = h02Var;
        gy0Var.l = this;
        i82 i82Var2 = this.x;
        if (i82Var2.d <= 0.0f || i82Var2.c <= 0.0f) {
            this.G.add(gy0Var);
        } else {
            post(gy0Var);
        }
    }

    public void l() {
        if (this.g) {
            dd2 dd2Var = this.o;
            float f = dd2Var.y;
            float f2 = dd2Var.x;
            float f3 = dd2Var.z;
        }
        h02 h02Var = this.g0;
        dd2 dd2Var2 = this.o;
        float f4 = dd2Var2.y;
        float f5 = dd2Var2.z;
        gd2 gd2Var = this.c0;
        h02Var.h(f4, f5, gd2Var.z, gd2Var.y);
        h02 h02Var2 = this.f0;
        dd2 dd2Var3 = this.o;
        float f6 = dd2Var3.y;
        float f7 = dd2Var3.z;
        gd2 gd2Var2 = this.b0;
        h02Var2.h(f6, f7, gd2Var2.z, gd2Var2.y);
    }

    @Override // defpackage.mp, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.h == null) {
            return;
        }
        System.currentTimeMillis();
        if (this.T) {
            canvas.drawRect(this.x.b, this.R);
        }
        if (this.U) {
            canvas.drawRect(this.x.b, this.S);
        }
        if (this.J) {
            float lowestVisibleX = getLowestVisibleX();
            float highestVisibleX = getHighestVisibleX();
            ed edVar = (ed) this.h;
            ArrayList arrayList = edVar.i;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                w00 w00Var = (w00) ((rk0) obj);
                List list = w00Var.j;
                if (list != null && !list.isEmpty()) {
                    w00Var.k = -3.4028235E38f;
                    w00Var.l = Float.MAX_VALUE;
                    int i2 = w00Var.i(highestVisibleX, Float.NaN, 1);
                    for (int i3 = w00Var.i(lowestVisibleX, Float.NaN, 2); i3 <= i2; i3++) {
                        w00Var.c((e90) list.get(i3));
                    }
                }
            }
            edVar.c();
            dd2 dd2Var = this.o;
            ed edVar2 = (ed) this.h;
            dd2Var.b(edVar2.d, edVar2.c);
            gd2 gd2Var = this.b0;
            if (gd2Var.f53a) {
                gd2Var.b(((ed) this.h).j(1), ((ed) this.h).i(1));
            }
            gd2 gd2Var2 = this.c0;
            if (gd2Var2.f53a) {
                gd2Var2.b(((ed) this.h).j(2), ((ed) this.h).i(2));
            }
            a();
        }
        gd2 gd2Var3 = this.b0;
        if (gd2Var3.f53a) {
            this.d0.l(gd2Var3.y, gd2Var3.x);
        }
        gd2 gd2Var4 = this.c0;
        if (gd2Var4.f53a) {
            this.e0.l(gd2Var4.y, gd2Var4.x);
        }
        dd2 dd2Var2 = this.o;
        if (dd2Var2.f53a) {
            this.h0.l(dd2Var2.y, dd2Var2.x);
        }
        this.h0.s(canvas);
        this.d0.s(canvas);
        this.e0.s(canvas);
        if (this.o.s) {
            this.h0.t(canvas);
        }
        if (this.b0.s) {
            this.d0.t(canvas);
        }
        if (this.c0.s) {
            this.e0.t(canvas);
        }
        boolean z = this.o.f53a;
        boolean z2 = this.b0.f53a;
        boolean z3 = this.c0.f53a;
        int save = canvas.save();
        canvas.clipRect(this.x.b);
        this.v.m(canvas);
        if (!this.o.s) {
            this.h0.t(canvas);
        }
        if (!this.b0.s) {
            this.d0.t(canvas);
        }
        if (!this.c0.s) {
            this.e0.t(canvas);
        }
        fj0[] fj0VarArr = this.E;
        if (fj0VarArr != null && fj0VarArr.length > 0 && fj0VarArr[0] != null) {
            this.v.o(canvas, fj0VarArr);
        }
        canvas.restoreToCount(save);
        this.v.n(canvas);
        if (this.o.f53a) {
            this.h0.u(canvas);
        }
        if (this.b0.f53a) {
            this.d0.u(canvas);
        }
        if (this.c0.f53a) {
            this.e0.u(canvas);
        }
        this.h0.r(canvas);
        this.d0.r(canvas);
        this.e0.r(canvas);
        if (this.V) {
            int save2 = canvas.save();
            canvas.clipRect(this.x.b);
            this.v.p(canvas);
            canvas.restoreToCount(save2);
        } else {
            this.v.p(canvas);
        }
        this.u.n(canvas);
        b(canvas);
        if (this.g) {
            System.currentTimeMillis();
        }
    }

    @Override // defpackage.mp, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float[] fArr = this.m0;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        if (this.a0) {
            RectF rectF = this.x.b;
            fArr[0] = rectF.left;
            fArr[1] = rectF.top;
            this.f0.e(fArr);
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.a0) {
            this.f0.f(fArr);
            this.x.a(fArr, this);
        } else {
            i82 i82Var = this.x;
            i82Var.k(i82Var.f417a, this, true);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        rp rpVar = this.s;
        if (rpVar == null || this.h == null || !this.p) {
            return false;
        }
        return rpVar.onTouch(this, motionEvent);
    }

    public void setAutoScaleMinMaxEnabled(boolean z) {
        this.J = z;
    }

    public void setBorderColor(int i) {
        this.S.setColor(i);
    }

    public void setBorderWidth(float f) {
        this.S.setStrokeWidth(n52.c(f));
    }

    public void setClipValuesToContent(boolean z) {
        this.V = z;
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.L = z;
    }

    public void setDragEnabled(boolean z) {
        this.N = z;
        this.O = z;
    }

    public void setDragOffsetX(float f) {
        i82 i82Var = this.x;
        i82Var.getClass();
        i82Var.l = n52.c(f);
    }

    public void setDragOffsetY(float f) {
        i82 i82Var = this.x;
        i82Var.getClass();
        i82Var.m = n52.c(f);
    }

    public void setDragXEnabled(boolean z) {
        this.N = z;
    }

    public void setDragYEnabled(boolean z) {
        this.O = z;
    }

    public void setDrawBorders(boolean z) {
        this.U = z;
    }

    public void setDrawGridBackground(boolean z) {
        this.T = z;
    }

    public void setGridBackgroundColor(int i) {
        this.R.setColor(i);
    }

    public void setHighlightPerDragEnabled(boolean z) {
        this.M = z;
    }

    public void setKeepPositionOnRotation(boolean z) {
        this.a0 = z;
    }

    public void setMaxVisibleValueCount(int i) {
        this.I = i;
    }

    public void setMinOffset(float f) {
        this.W = f;
    }

    public void setOnDrawListener(r41 r41Var) {
    }

    public void setPinchZoom(boolean z) {
        this.K = z;
    }

    public void setRendererLeftYAxis(hd2 hd2Var) {
        this.d0 = hd2Var;
    }

    public void setRendererRightYAxis(hd2 hd2Var) {
        this.e0 = hd2Var;
    }

    public void setScaleEnabled(boolean z) {
        this.P = z;
        this.Q = z;
    }

    public void setScaleXEnabled(boolean z) {
        this.P = z;
    }

    public void setScaleYEnabled(boolean z) {
        this.Q = z;
    }

    public void setVisibleXRangeMaximum(float f) {
        float f2 = this.o.z / f;
        i82 i82Var = this.x;
        i82Var.getClass();
        if (f2 < 1.0f) {
            f2 = 1.0f;
        }
        i82Var.g = f2;
        i82Var.i(i82Var.f417a, i82Var.b);
    }

    public void setVisibleXRangeMinimum(float f) {
        float f2 = this.o.z / f;
        i82 i82Var = this.x;
        i82Var.getClass();
        if (f2 == 0.0f) {
            f2 = Float.MAX_VALUE;
        }
        i82Var.h = f2;
        i82Var.i(i82Var.f417a, i82Var.b);
    }

    public void setXAxisRenderer(ed2 ed2Var) {
        this.h0 = ed2Var;
    }
}
