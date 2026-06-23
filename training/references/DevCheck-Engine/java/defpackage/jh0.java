package defpackage;

import android.R;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.TypedValue;
import com.jjoe64.graphview.GraphView;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class jh0 {

    /* renamed from: a, reason: collision with root package name */
    public final ih0 f483a;
    public final GraphView b;
    public LinkedHashMap c;
    public LinkedHashMap d;
    public LinkedHashMap e;
    public Paint f;
    public Paint g;
    public Paint h;
    public boolean i;
    public Integer j;
    public Integer k;
    public Integer l;
    public Integer m;
    public Integer n;
    public Integer o;
    public final kp p;
    public final int q;
    public final int r;
    public final boolean s;
    public final boolean t;

    public jh0(GraphView graphView) {
        int i;
        this.b = graphView;
        kp kpVar = new kp(5);
        this.p = kpVar;
        kpVar.i = graphView.getViewport();
        this.f483a = new ih0();
        TypedValue typedValue = new TypedValue();
        graphView.getContext().getTheme().resolveAttribute(R.attr.textAppearanceSmall, typedValue, true);
        int i2 = -7829368;
        int i3 = -16777216;
        int i4 = 20;
        try {
            TypedArray obtainStyledAttributes = graphView.getContext().obtainStyledAttributes(typedValue.data, new int[]{R.attr.textColorPrimary, R.attr.textColorSecondary, R.attr.textSize, R.attr.horizontalGap});
            int color = obtainStyledAttributes.getColor(0, -16777216);
            int color2 = obtainStyledAttributes.getColor(1, -7829368);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 20);
            i = obtainStyledAttributes.getDimensionPixelSize(3, 20);
            obtainStyledAttributes.recycle();
            i3 = color;
            i2 = color2;
            i4 = dimensionPixelSize;
        } catch (Exception unused) {
            i = 20;
        }
        ih0 ih0Var = this.f483a;
        ih0Var.d = i3;
        ih0Var.e = i3;
        ih0Var.f = i3;
        ih0Var.g = i2;
        float f = i4;
        ih0Var.f430a = f;
        ih0Var.i = i;
        ih0Var.m = ((int) f) / 5;
        ih0Var.b = Paint.Align.RIGHT;
        ih0Var.c = Paint.Align.LEFT;
        ih0Var.h = true;
        ih0Var.j = true;
        ih0Var.k = true;
        ih0Var.l = 1;
        b();
        this.q = 5;
        this.r = 5;
        this.t = true;
        this.s = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0036, code lost:
    
        if (r9 < 10.0d) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0038, code lost:
    
        r9 = 10.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0057, code lost:
    
        if (r9 < 15.0d) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static double a(double r9, boolean r11) {
        /*
            r0 = 0
        L1:
            double r1 = java.lang.Math.abs(r9)
            r3 = 4621819117588971520(0x4024000000000000, double:10.0)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 < 0) goto Lf
            double r9 = r9 / r3
            int r0 = r0 + 1
            goto L1
        Lf:
            double r1 = java.lang.Math.abs(r9)
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 >= 0) goto L1d
            double r9 = r9 * r3
            int r0 = r0 + (-1)
            goto Lf
        L1d:
            r1 = 4617315517961601024(0x4014000000000000, double:5.0)
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            if (r11 == 0) goto L3a
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 != 0) goto L28
            goto L5a
        L28:
            int r11 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r11 > 0) goto L2e
        L2c:
            r9 = r7
            goto L5a
        L2e:
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L34
        L32:
            r9 = r1
            goto L5a
        L34:
            int r11 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r11 >= 0) goto L5a
        L38:
            r9 = r3
            goto L5a
        L3a:
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 != 0) goto L3f
            goto L5a
        L3f:
            r5 = 4617202927970916762(0x401399999999999a, double:4.9)
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 > 0) goto L49
            goto L2c
        L49:
            r5 = 4621762822593629389(0x4023cccccccccccd, double:9.9)
            int r11 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r11 > 0) goto L53
            goto L32
        L53:
            r1 = 4624633867356078080(0x402e000000000000, double:15.0)
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 >= 0) goto L5a
            goto L38
        L5a:
            double r0 = (double) r0
            double r0 = java.lang.Math.pow(r3, r0)
            double r0 = r0 * r9
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jh0.a(double, boolean):double");
    }

    public final void b() {
        Paint paint = new Paint();
        this.f = paint;
        ih0 ih0Var = this.f483a;
        paint.setColor(ih0Var.g);
        this.f.setStrokeWidth(0.0f);
        Paint paint2 = new Paint();
        this.g = paint2;
        paint2.setTextSize(ih0Var.f430a);
        this.g.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.h = paint3;
        paint3.setTextSize(ih0Var.f430a);
        this.h.setTextAlign(Paint.Align.CENTER);
    }
}
