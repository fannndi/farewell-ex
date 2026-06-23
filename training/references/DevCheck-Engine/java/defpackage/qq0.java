package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.view.animation.AccelerateInterpolator;
import com.jjoe64.graphview.GraphView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class qq0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f858a = new ArrayList();
    public final HashMap b = new HashMap();
    public int c = -16746548;
    public double d = Double.NaN;
    public double e = Double.NaN;
    public final ArrayList f = new ArrayList();
    public Boolean g;
    public final sh h;
    public final Paint i;
    public final Paint j;
    public final Paint k;
    public final Path l;

    public qq0() {
        sh shVar = new sh();
        shVar.f936a = 5;
        shVar.b = Color.argb(100, 172, 218, 255);
        this.h = shVar;
        Paint paint = new Paint();
        this.j = paint;
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.j.setStyle(Paint.Style.STROKE);
        this.k = new Paint();
        Paint paint2 = new Paint();
        this.i = paint2;
        paint2.setColor(Color.argb(80, 0, 0, 0));
        this.i.setStyle(Paint.Style.FILL);
        new Path();
        this.l = new Path();
        new AccelerateInterpolator(2.0f);
    }

    public static void h(Canvas canvas, float[] fArr, Paint paint) {
        if (fArr.length == 4 && fArr[0] == fArr[2] && fArr[1] == fArr[3]) {
            return;
        }
        canvas.drawLines(fArr, paint);
    }

    public final void a(u00 u00Var) {
        ArrayList arrayList = this.f858a;
        if (arrayList.size() > 1 && u00Var.g < ((u00) d51.m(arrayList, 1)).g) {
            c.m("new x-value must be greater then the last value. x-values has to be ordered in ASC.");
            return;
        }
        if (!this.f858a.isEmpty() && u00Var.g < ((u00) d51.m(this.f858a, 1)).g) {
            c.m("new x-value must be greater then the last value. x-values has to be ordered in ASC.");
            return;
        }
        synchronized (this.f858a) {
            try {
                int size = this.f858a.size();
                ArrayList arrayList2 = this.f858a;
                if (size < 60) {
                    arrayList2.add(u00Var);
                } else {
                    arrayList2.remove(0);
                    this.f858a.add(u00Var);
                }
                double d = u00Var.h;
                if (!Double.isNaN(this.e) && d > this.e) {
                    this.e = d;
                }
                if (!Double.isNaN(this.d) && d < this.d) {
                    this.d = d;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f858a.size();
        ArrayList arrayList3 = this.f;
        int size2 = arrayList3.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList3.get(i);
            i++;
            WeakReference weakReference = (WeakReference) obj;
            if (weakReference != null && weakReference.get() != null) {
                x82 viewport = ((GraphView) weakReference.get()).getViewport();
                hc1 hc1Var = viewport.d;
                if (viewport.o) {
                    double b = hc1Var.b();
                    hc1 hc1Var2 = viewport.e;
                    hc1Var.b = hc1Var2.b;
                    hc1Var.f375a = hc1Var2.b - b;
                    viewport.c.b(true, false);
                }
            }
        }
    }

    public final void b(GraphView graphView, Canvas canvas, boolean z) {
        double d;
        double d2;
        float f;
        float f2;
        double d3;
        boolean z2;
        double d4;
        boolean z3;
        boolean z4;
        boolean z5;
        ArrayList arrayList;
        HashMap hashMap = this.b;
        hashMap.clear();
        double a2 = graphView.getViewport().a(false);
        double b = graphView.getViewport().b(false);
        if (z) {
            d = graphView.getSecondScale().c.c;
            d2 = graphView.getSecondScale().c.d;
        } else {
            d = graphView.getViewport().d.c;
            d2 = graphView.getViewport().d.d;
        }
        Iterator g = g(b, a2);
        sh shVar = this.h;
        float f3 = shVar.f936a;
        Paint paint = this.j;
        paint.setStrokeWidth(f3);
        paint.setColor(this.c);
        this.k.setColor(shVar.b);
        this.l.reset();
        shVar.getClass();
        double d5 = d - d2;
        double d6 = a2 - b;
        float graphContentHeight = graphView.getGraphContentHeight();
        float graphContentWidth = graphView.getGraphContentWidth();
        float graphContentLeft = graphView.getGraphContentLeft();
        float graphContentTop = graphView.getGraphContentTop();
        float f4 = Float.NaN;
        boolean z6 = false;
        float f5 = 0.0f;
        float f6 = 0.0f;
        double d7 = 0.0d;
        double d8 = 0.0d;
        int i = 0;
        while (g.hasNext()) {
            double d9 = b;
            u00 u00Var = (u00) g.next();
            double d10 = d5;
            double d11 = graphContentHeight;
            double d12 = ((u00Var.h - d2) / d10) * d11;
            double d13 = d11;
            double d14 = graphContentWidth;
            double d15 = ((u00Var.g - d9) / d6) * d14;
            if (i > 0) {
                if (d15 > d14) {
                    d4 = (((d12 - d8) * (d14 - d7)) / (d15 - d7)) + d8;
                    z2 = true;
                } else {
                    z2 = false;
                    d4 = d12;
                    d14 = d15;
                }
                if (d4 < 0.0d) {
                    if (d8 < 0.0d) {
                        z4 = true;
                    } else {
                        d14 = (((d14 - d7) * (0.0d - d8)) / (d4 - d8)) + d7;
                        z4 = false;
                    }
                    d4 = 0.0d;
                    z3 = true;
                } else {
                    z3 = z2;
                    z4 = false;
                }
                if (d4 > d13) {
                    if (d8 > d13) {
                        z4 = true;
                    } else {
                        d14 = (((d14 - d7) * (d13 - d8)) / (d4 - d8)) + d7;
                    }
                    z3 = true;
                    d4 = d13;
                }
                if (d7 < 0.0d) {
                    d8 = d4 - (((d4 - d8) * (0.0d - d14)) / (d7 - d14));
                    d7 = 0.0d;
                }
                float f7 = graphContentLeft + 1.0f;
                if (d8 < 0.0d) {
                    if (!z4) {
                        d7 = d14 - (((d14 - d7) * (0.0d - d4)) / (d8 - d4));
                    }
                    d8 = 0.0d;
                }
                if (d8 <= d13) {
                    d13 = d8;
                } else if (!z4) {
                    d7 = d14 - (((d14 - d7) * (d13 - d4)) / (d8 - d4));
                }
                boolean z7 = z4;
                double d16 = d7;
                d3 = d2;
                float f8 = ((float) d16) + f7;
                double d17 = graphContentTop;
                f = graphContentTop;
                f2 = graphContentHeight;
                float f9 = ((float) (d17 - d13)) + f2;
                float f10 = ((float) d14) + f7;
                float f11 = ((float) (d17 - d4)) + f2;
                if (!(f10 < f8 ? true : z7) && !Float.isNaN(f9) && !Float.isNaN(f11)) {
                    if (!z3) {
                        shVar.getClass();
                        Boolean bool = this.g;
                        if (bool == null) {
                            ArrayList arrayList2 = this.f;
                            int size = arrayList2.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    this.g = Boolean.FALSE;
                                    z5 = false;
                                    break;
                                }
                                Object obj = arrayList2.get(i2);
                                i2++;
                                WeakReference weakReference = (WeakReference) obj;
                                if (weakReference == null || weakReference.get() == null) {
                                    arrayList = arrayList2;
                                } else {
                                    arrayList = arrayList2;
                                    if (((GraphView) weakReference.get()).p) {
                                        this.g = Boolean.TRUE;
                                        z5 = true;
                                        break;
                                    }
                                }
                                arrayList2 = arrayList;
                            }
                        } else {
                            z5 = bool.booleanValue();
                        }
                        if (z5) {
                            hashMap.put(new PointF(f10, f11), u00Var);
                        }
                    }
                    if (Float.isNaN(f4) || Math.abs(f10 - f4) > 0.3f) {
                        if (z6) {
                            h(canvas, new float[]{f4, f5, f4, f6}, paint);
                            z6 = false;
                        }
                        h(canvas, new float[]{f8, f9, f10, f11}, paint);
                        f4 = f10;
                    } else if (z6) {
                        f5 = Math.min(f5, f11);
                        f6 = Math.max(f6, f11);
                    } else {
                        f5 = Math.min(f9, f11);
                        f6 = Math.max(f9, f11);
                        z6 = true;
                    }
                }
                shVar.getClass();
            } else {
                f = graphContentTop;
                f2 = graphContentHeight;
                d3 = d2;
                shVar.getClass();
            }
            i++;
            d2 = d3;
            graphContentHeight = f2;
            graphContentTop = f;
            b = d9;
            d5 = d10;
            d8 = d12;
            d7 = d15;
        }
        shVar.getClass();
    }

    public final double c() {
        ArrayList arrayList = this.f858a;
        if (arrayList.isEmpty()) {
            return 0.0d;
        }
        return ((u00) d51.m(arrayList, 1)).g;
    }

    public final double d() {
        ArrayList arrayList = this.f858a;
        if (arrayList.isEmpty()) {
            return 0.0d;
        }
        if (!Double.isNaN(this.e)) {
            return this.e;
        }
        double d = ((u00) arrayList.get(0)).h;
        for (int i = 1; i < arrayList.size(); i++) {
            double d2 = ((u00) arrayList.get(i)).h;
            if (d < d2) {
                d = d2;
            }
        }
        this.e = d;
        return d;
    }

    public final double e() {
        ArrayList arrayList = this.f858a;
        if (arrayList.isEmpty()) {
            return 0.0d;
        }
        return ((u00) arrayList.get(0)).g;
    }

    public final double f() {
        ArrayList arrayList = this.f858a;
        if (arrayList.isEmpty()) {
            return 0.0d;
        }
        if (!Double.isNaN(this.d)) {
            return this.d;
        }
        double d = ((u00) arrayList.get(0)).h;
        for (int i = 1; i < arrayList.size(); i++) {
            double d2 = ((u00) arrayList.get(i)).h;
            if (d > d2) {
                d = d2;
            }
        }
        this.d = d;
        return d;
    }

    public final Iterator g(double d, double d2) {
        return (d > e() || d2 < c()) ? new yd(this, d, d2) : this.f858a.iterator();
    }
}
