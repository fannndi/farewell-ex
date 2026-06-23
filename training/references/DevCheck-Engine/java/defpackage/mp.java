package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.slider.KtNX.UQdsoaJMID;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class mp extends ViewGroup implements qp {
    public float A;
    public float B;
    public float C;
    public boolean D;
    public fj0[] E;
    public float F;
    public final ArrayList G;
    public boolean H;
    public boolean g;
    public op h;
    public boolean i;
    public boolean j;
    public float k;
    public final e10 l;
    public Paint m;
    public Paint n;
    public dd2 o;
    public boolean p;
    public e30 q;
    public qp0 r;
    public rp s;
    public String t;
    public tp0 u;
    public v00 v;
    public sk0 w;
    public i82 x;
    public np y;
    public float z;

    public mp(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = false;
        this.h = null;
        this.i = true;
        this.j = true;
        this.k = 0.9f;
        this.l = new e10(0);
        this.p = true;
        this.t = UQdsoaJMID.JMgDL;
        this.x = new i82();
        this.z = 0.0f;
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = 0.0f;
        this.D = false;
        this.F = 0.0f;
        this.G = new ArrayList();
        this.H = false;
        e();
    }

    public static void g(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                viewGroup.removeAllViews();
                return;
            } else {
                g(viewGroup.getChildAt(i));
                i++;
            }
        }
    }

    public abstract void a();

    public final void b(Canvas canvas) {
        e30 e30Var = this.q;
        if (e30Var == null || !e30Var.f53a) {
            return;
        }
        Paint paint = this.m;
        e30Var.getClass();
        paint.setTypeface(null);
        this.m.setTextSize(this.q.d);
        this.m.setColor(this.q.e);
        this.m.setTextAlign(this.q.g);
        float width = getWidth();
        i82 i82Var = this.x;
        float f = (width - (i82Var.c - i82Var.b.right)) - this.q.b;
        float height = getHeight() - this.x.j();
        e30 e30Var2 = this.q;
        canvas.drawText(e30Var2.f, f, height - e30Var2.c, this.m);
    }

    public fj0 c(float f, float f2) {
        if (this.h == null) {
            return null;
        }
        return getHighlighter().a(f, f2);
    }

    public final void d(fj0 fj0Var) {
        if (fj0Var == null) {
            this.E = null;
        } else {
            if (this.g) {
                fj0Var.toString();
            }
            if (this.h.h(fj0Var) == null) {
                this.E = null;
            } else {
                this.E = new fj0[]{fj0Var};
            }
        }
        setLastHighlighted(this.E);
        invalidate();
    }

    public void e() {
        setWillNotDraw(false);
        il ilVar = new il(1, this);
        np npVar = new np();
        npVar.f695a = ilVar;
        this.y = npVar;
        n52.f(getContext());
        this.F = n52.c(500.0f);
        e30 e30Var = new e30();
        e30Var.f = "Description Label";
        e30Var.g = Paint.Align.RIGHT;
        e30Var.d = n52.c(8.0f);
        this.q = e30Var;
        qp0 qp0Var = new qp0();
        qp0Var.f = new rp0[0];
        qp0Var.g = 1;
        qp0Var.h = 3;
        qp0Var.i = 1;
        qp0Var.j = false;
        qp0Var.k = 1;
        qp0Var.l = 4;
        qp0Var.m = 8.0f;
        qp0Var.n = 3.0f;
        qp0Var.o = 6.0f;
        qp0Var.p = 5.0f;
        qp0Var.q = 3.0f;
        qp0Var.r = 0.95f;
        qp0Var.s = 0.0f;
        qp0Var.t = 0.0f;
        qp0Var.u = 0.0f;
        qp0Var.v = new ArrayList(16);
        qp0Var.w = new ArrayList(16);
        qp0Var.x = new ArrayList(16);
        qp0Var.d = n52.c(10.0f);
        qp0Var.b = n52.c(5.0f);
        qp0Var.c = n52.c(3.0f);
        this.r = qp0Var;
        tp0 tp0Var = new tp0(this.x);
        tp0Var.e = new ArrayList(16);
        tp0Var.f = new Paint.FontMetrics();
        tp0Var.g = new Path();
        tp0Var.d = qp0Var;
        Paint paint = new Paint(1);
        tp0Var.b = paint;
        paint.setTextSize(n52.c(9.0f));
        paint.setTextAlign(Paint.Align.LEFT);
        Paint paint2 = new Paint(1);
        tp0Var.c = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.u = tp0Var;
        dd2 dd2Var = new dd2();
        dd2Var.A = 1;
        dd2Var.B = 1;
        dd2Var.C = 1;
        dd2Var.c = n52.c(4.0f);
        this.o = dd2Var;
        this.m = new Paint(1);
        Paint paint3 = new Paint(1);
        this.n = paint3;
        paint3.setColor(Color.rgb(247, 189, 51));
        this.n.setTextAlign(Paint.Align.CENTER);
        this.n.setTextSize(n52.c(12.0f));
    }

    public abstract void f();

    public np getAnimator() {
        return this.y;
    }

    public it0 getCenter() {
        return it0.b(getWidth() / 2.0f, getHeight() / 2.0f);
    }

    public it0 getCenterOfView() {
        return getCenter();
    }

    public it0 getCenterOffsets() {
        RectF rectF = this.x.b;
        return it0.b(rectF.centerX(), rectF.centerY());
    }

    public Bitmap getChartBitmap() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return createBitmap;
    }

    public RectF getContentRect() {
        return this.x.b;
    }

    public op getData() {
        return this.h;
    }

    public q52 getDefaultValueFormatter() {
        return this.l;
    }

    public e30 getDescription() {
        return this.q;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.k;
    }

    public float getExtraBottomOffset() {
        return this.B;
    }

    public float getExtraLeftOffset() {
        return this.C;
    }

    public float getExtraRightOffset() {
        return this.A;
    }

    public float getExtraTopOffset() {
        return this.z;
    }

    public fj0[] getHighlighted() {
        return this.E;
    }

    public sk0 getHighlighter() {
        return this.w;
    }

    public ArrayList<Runnable> getJobs() {
        return this.G;
    }

    public qp0 getLegend() {
        return this.r;
    }

    public tp0 getLegendRenderer() {
        return this.u;
    }

    public tk0 getMarker() {
        return null;
    }

    @Deprecated
    public tk0 getMarkerView() {
        getMarker();
        return null;
    }

    @Override // defpackage.qp
    public float getMaxHighlightDistance() {
        return this.F;
    }

    public abstract /* synthetic */ int getMaxVisibleCount();

    public m41 getOnChartGestureListener() {
        return null;
    }

    public rp getOnTouchListener() {
        return this.s;
    }

    public v00 getRenderer() {
        return this.v;
    }

    public i82 getViewPortHandler() {
        return this.x;
    }

    public dd2 getXAxis() {
        return this.o;
    }

    public float getXChartMax() {
        return this.o.x;
    }

    public float getXChartMin() {
        return this.o.y;
    }

    public float getXRange() {
        return this.o.z;
    }

    public abstract /* synthetic */ float getYChartMax();

    public abstract /* synthetic */ float getYChartMin();

    public float getYMax() {
        return this.h.f751a;
    }

    public float getYMin() {
        return this.h.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.H) {
            g(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.h == null) {
            if (TextUtils.isEmpty(this.t)) {
                return;
            }
            it0 center = getCenter();
            canvas.drawText(this.t, center.h, center.i, this.n);
            return;
        }
        if (this.D) {
            return;
        }
        a();
        this.D = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).layout(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int c = (int) n52.c(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), View.resolveSize(c, i)), Math.max(getSuggestedMinimumHeight(), View.resolveSize(c, i2)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i > 0 && i2 > 0 && i < 10000 && i2 < 10000) {
            i82 i82Var = this.x;
            RectF rectF = i82Var.b;
            float f = rectF.left;
            float f2 = rectF.top;
            float f3 = i82Var.c - rectF.right;
            float j = i82Var.j();
            i82Var.d = i2;
            i82Var.c = i;
            i82Var.l(f, f2, f3, j);
        }
        f();
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            post((Runnable) obj);
        }
        arrayList.clear();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setData(op opVar) {
        this.h = opVar;
        int i = 0;
        this.D = false;
        if (opVar == null) {
            return;
        }
        float f = opVar.b;
        float f2 = opVar.f751a;
        float g = n52.g(opVar.g() < 2 ? Math.max(Math.abs(f), Math.abs(f2)) : Math.abs(f2 - f));
        int ceil = Float.isInfinite(g) ? 0 : ((int) Math.ceil(-Math.log10(g))) + 2;
        e10 e10Var = this.l;
        e10Var.b(ceil);
        ArrayList arrayList = this.h.i;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            w00 w00Var = (w00) ((rk0) obj);
            if (w00Var.d == null || w00Var.j() == e10Var) {
                w00Var.d = e10Var;
            }
        }
        f();
    }

    public void setDescription(e30 e30Var) {
        this.q = e30Var;
    }

    public void setDragDecelerationEnabled(boolean z) {
        this.j = z;
    }

    public void setDragDecelerationFrictionCoef(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f >= 1.0f) {
            f = 0.999f;
        }
        this.k = f;
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z) {
        setDrawMarkers(z);
    }

    public void setDrawMarkers(boolean z) {
    }

    public void setExtraBottomOffset(float f) {
        this.B = n52.c(f);
    }

    public void setExtraLeftOffset(float f) {
        this.C = n52.c(f);
    }

    public void setExtraRightOffset(float f) {
        this.A = n52.c(f);
    }

    public void setExtraTopOffset(float f) {
        this.z = n52.c(f);
    }

    public void setHardwareAccelerationEnabled(boolean z) {
        if (z) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void setHighlightPerTapEnabled(boolean z) {
        this.i = z;
    }

    public void setHighlighter(pp ppVar) {
        this.w = ppVar;
    }

    public void setLastHighlighted(fj0[] fj0VarArr) {
        fj0 fj0Var;
        if (fj0VarArr == null || fj0VarArr.length <= 0 || (fj0Var = fj0VarArr[0]) == null) {
            this.s.h = null;
        } else {
            this.s.h = fj0Var;
        }
    }

    public void setLogEnabled(boolean z) {
        this.g = z;
    }

    public void setMarker(tk0 tk0Var) {
    }

    @Deprecated
    public void setMarkerView(tk0 tk0Var) {
        setMarker(tk0Var);
    }

    public void setMaxHighlightDistance(float f) {
        this.F = n52.c(f);
    }

    public void setNoDataText(String str) {
        this.t = str;
    }

    public void setNoDataTextColor(int i) {
        this.n.setColor(i);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.n.setTypeface(typeface);
    }

    public void setOnChartGestureListener(m41 m41Var) {
    }

    public void setOnChartValueSelectedListener(n41 n41Var) {
    }

    public void setOnTouchListener(rp rpVar) {
        this.s = rpVar;
    }

    public void setRenderer(v00 v00Var) {
        if (v00Var != null) {
            this.v = v00Var;
        }
    }

    public void setTouchEnabled(boolean z) {
        this.p = z;
    }

    public void setUnbindEnabled(boolean z) {
        this.H = z;
    }
}
