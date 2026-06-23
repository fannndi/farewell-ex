package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOverlay;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.slider.Slider;
import flar2.devcheck.R;
import flar2.devcheck.tests.BrightnessActivity;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public abstract class fe extends View {
    public static final /* synthetic */ int m1 = 0;
    public final int A;
    public int A0;
    public final int B;
    public float B0;
    public final int C;
    public int C0;
    public final int D;
    public float[] D0;
    public final int E;
    public int E0;
    public final int F;
    public int F0;
    public final int G;
    public int G0;
    public int H;
    public int H0;
    public final int I;
    public boolean I0;
    public int J;
    public boolean J0;
    public int K;
    public ColorStateList K0;
    public int L;
    public ColorStateList L0;
    public int M;
    public ColorStateList M0;
    public int N;
    public ColorStateList N0;
    public int O;
    public ColorStateList O0;
    public int P;
    public final Path P0;
    public int Q;
    public final RectF Q0;
    public int R;
    public final RectF R0;
    public int S;
    public final RectF S0;
    public int T;
    public final RectF T0;
    public int U;
    public final Rect U0;
    public int V;
    public final RectF V0;
    public int W;
    public final Rect W0;
    public final Matrix X0;
    public final ArrayList Y0;
    public Drawable Z0;
    public boolean a0;
    public List a1;
    public Drawable b0;
    public float b1;
    public boolean c0;
    public float c1;
    public Drawable d0;
    public ColorStateList d1;
    public boolean e0;
    public ColorStateList e1;
    public ColorStateList f0;
    public float f1;
    public final Paint g;
    public Drawable g0;
    public int g1;
    public final Paint h;
    public boolean h0;
    public final int h1;
    public final Paint i;
    public Drawable i0;
    public final ae i1;
    public final Paint j;
    public boolean j0;
    public final be j1;
    public final Paint k;
    public ColorStateList k0;
    public final l2 k1;
    public final Paint l;
    public int l0;
    public boolean l1;
    public final Paint m;
    public final int m0;
    public final de n;
    public final int n0;
    public final AccessibilityManager o;
    public float o0;
    public ce p;
    public float p0;
    public final int q;
    public MotionEvent q0;
    public final ArrayList r;
    public final Rect r0;
    public final ArrayList s;
    public final ArrayList s0;
    public final ArrayList t;
    public List t0;
    public boolean u;
    public zo0 u0;
    public ValueAnimator v;
    public boolean v0;
    public ValueAnimator w;
    public float w0;
    public final int x;
    public float x0;
    public final int y;
    public ArrayList y0;
    public final int z;
    public int z0;

    /* JADX WARN: Type inference failed for: r1v15, types: [ae] */
    /* JADX WARN: Type inference failed for: r1v16, types: [be] */
    public fe(Context context, AttributeSet attributeSet) {
        super(ym0.D(context, attributeSet, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider), attributeSet, R.attr.sliderStyle);
        int recommendedTimeoutMillis;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.t = new ArrayList();
        this.u = false;
        this.R = -1;
        this.S = -1;
        this.T = -1;
        this.a0 = false;
        this.c0 = false;
        this.e0 = false;
        this.h0 = false;
        this.j0 = false;
        this.r0 = new Rect();
        this.s0 = new ArrayList();
        this.t0 = new ArrayList();
        this.v0 = false;
        this.y0 = new ArrayList();
        this.z0 = -1;
        this.A0 = -1;
        this.B0 = 0.0f;
        this.C0 = 0;
        this.I0 = false;
        this.P0 = new Path();
        this.Q0 = new RectF();
        this.R0 = new RectF();
        this.S0 = new RectF();
        this.T0 = new RectF();
        this.U0 = new Rect();
        this.V0 = new RectF();
        this.W0 = new Rect();
        this.X0 = new Matrix();
        this.Y0 = new ArrayList();
        this.a1 = Collections.EMPTY_LIST;
        this.g1 = 0;
        final Slider slider = (Slider) this;
        this.i1 = new ViewTreeObserver.OnScrollChangedListener() { // from class: ae
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                Slider.this.H();
            }
        };
        this.j1 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: be
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Slider.this.H();
            }
        };
        this.k1 = new l2(5, slider);
        Context context2 = getContext();
        this.l1 = isShown();
        this.g = new Paint();
        this.h = new Paint();
        Paint paint = new Paint(1);
        this.i = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint2 = new Paint(1);
        this.j = paint2;
        paint2.setStyle(style);
        Paint paint3 = new Paint();
        this.k = paint3;
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint3.setStrokeCap(cap);
        Paint paint4 = new Paint();
        this.l = paint4;
        paint4.setStyle(style2);
        paint4.setStrokeCap(cap);
        Paint paint5 = new Paint();
        this.m = paint5;
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        this.y = context2.getResources().getDimensionPixelSize(R.dimen.m3_slider_focus_ring_thumb_height_decrease);
        Resources resources = context2.getResources();
        this.I = resources.getDimensionPixelSize(R.dimen.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_slider_track_side_padding);
        this.z = dimensionPixelOffset;
        this.M = dimensionPixelOffset;
        this.A = resources.getDimensionPixelSize(R.dimen.mtrl_slider_thumb_radius);
        this.B = resources.getDimensionPixelSize(R.dimen.mtrl_slider_track_height);
        this.C = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.D = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_radius);
        this.E = resources.getDimensionPixelSize(R.dimen.mtrl_slider_tick_min_spacing);
        this.n0 = resources.getDimensionPixelSize(R.dimen.mtrl_slider_label_padding);
        this.m0 = resources.getDimensionPixelOffset(R.dimen.m3_slider_track_icon_padding);
        this.G = resources.getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size);
        d10.c(context2, attributeSet, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider);
        int[] iArr = yb1.Q;
        d10.d(context2, attributeSet, iArr, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, R.attr.sliderStyle, R.style.Widget_MaterialComponents_Slider);
        setOrientation(obtainStyledAttributes.getInt(2, 0));
        this.q = obtainStyledAttributes.getResourceId(11, R.style.Widget_MaterialComponents_Tooltip);
        this.w0 = obtainStyledAttributes.getFloat(4, 0.0f);
        this.x0 = obtainStyledAttributes.getFloat(5, 1.0f);
        setCentered(obtainStyledAttributes.getBoolean(6, false));
        this.B0 = obtainStyledAttributes.getFloat(3, 0.0f);
        this.C0 = obtainStyledAttributes.getInt(7, 0);
        this.F = (int) Math.ceil(obtainStyledAttributes.getDimension(12, md2.t(context2)));
        boolean hasValue = obtainStyledAttributes.hasValue(28);
        int i = hasValue ? 28 : 30;
        int i2 = hasValue ? 28 : 29;
        ColorStateList o = tl2.o(context2, obtainStyledAttributes, i);
        setTrackInactiveTintList(o == null ? pr.q(context2, R.color.material_slider_inactive_track_color) : o);
        ColorStateList o2 = tl2.o(context2, obtainStyledAttributes, i2);
        setTrackActiveTintList(o2 == null ? pr.q(context2, R.color.material_slider_active_track_color) : o2);
        ColorStateList o3 = tl2.o(context2, obtainStyledAttributes, 13);
        setThumbTintList(o3 == null ? pr.q(context2, R.color.material_slider_thumb_color) : o3);
        if (obtainStyledAttributes.hasValue(17)) {
            setThumbStrokeColor(tl2.o(context2, obtainStyledAttributes, 17));
        }
        setThumbStrokeWidth(obtainStyledAttributes.getDimension(18, 0.0f));
        ColorStateList o4 = tl2.o(context2, obtainStyledAttributes, 8);
        setHaloTintList(o4 == null ? pr.q(context2, R.color.material_slider_halo_color) : o4);
        this.E0 = obtainStyledAttributes.hasValue(26) ? obtainStyledAttributes.getInt(26, -1) : obtainStyledAttributes.getBoolean(27, true) ? 0 : 2;
        boolean hasValue2 = obtainStyledAttributes.hasValue(21);
        int i3 = hasValue2 ? 21 : 23;
        int i4 = hasValue2 ? 21 : 22;
        ColorStateList o5 = tl2.o(context2, obtainStyledAttributes, i3);
        setTickInactiveTintList(o5 == null ? pr.q(context2, R.color.material_slider_inactive_tick_marks_color) : o5);
        ColorStateList o6 = tl2.o(context2, obtainStyledAttributes, i4);
        setTickActiveTintList(o6 == null ? pr.q(context2, R.color.material_slider_active_tick_marks_color) : o6);
        setThumbTrackGapSize(obtainStyledAttributes.getDimensionPixelSize(19, 0));
        setTrackStopIndicatorSize(obtainStyledAttributes.getDimensionPixelSize(41, 0));
        setTrackCornerSize(obtainStyledAttributes.getDimensionPixelSize(31, -1));
        setTrackInsideCornerSize(obtainStyledAttributes.getDimensionPixelSize(40, 0));
        setTrackIconActiveStart(tl2.t(context2, obtainStyledAttributes, 35));
        setTrackIconActiveEnd(tl2.t(context2, obtainStyledAttributes, 34));
        setTrackIconActiveColor(tl2.o(context2, obtainStyledAttributes, 33));
        setTrackIconInactiveStart(tl2.t(context2, obtainStyledAttributes, 38));
        setTrackIconInactiveEnd(tl2.t(context2, obtainStyledAttributes, 37));
        setTrackIconInactiveColor(tl2.o(context2, obtainStyledAttributes, 36));
        setTrackIconSize(obtainStyledAttributes.getDimensionPixelSize(39, 0));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(16, 0) * 2;
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(20, dimensionPixelSize);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(15, dimensionPixelSize);
        setThumbWidth(dimensionPixelSize2);
        setThumbHeight(dimensionPixelSize3);
        setHaloRadius(obtainStyledAttributes.getDimensionPixelSize(9, 0));
        setThumbElevation(obtainStyledAttributes.getDimension(14, 0.0f));
        setTrackHeight(obtainStyledAttributes.getDimensionPixelSize(32, 0));
        setTickActiveRadius(obtainStyledAttributes.getDimensionPixelSize(24, this.U / 2));
        setTickInactiveRadius(obtainStyledAttributes.getDimensionPixelSize(25, this.U / 2));
        setLabelBehavior(obtainStyledAttributes.getInt(10, 0));
        if (!obtainStyledAttributes.getBoolean(0, true)) {
            setEnabled(false);
        }
        setValues(Float.valueOf(this.w0));
        obtainStyledAttributes.recycle();
        setFocusable(true);
        setClickable(true);
        this.x = ViewConfiguration.get(context2).getScaledTouchSlop();
        de deVar = new de(slider);
        this.n = deVar;
        y62.o(this, deVar);
        AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.o = accessibilityManager;
        if (Build.VERSION.SDK_INT < 29) {
            this.h1 = 120000;
        } else {
            recommendedTimeoutMillis = accessibilityManager.getRecommendedTimeoutMillis(10000, 6);
            this.h1 = recommendedTimeoutMillis;
        }
    }

    public final void A(int i, int i2, Integer num) {
        int i3 = 0;
        while (true) {
            ArrayList arrayList = this.Y0;
            if (i3 >= arrayList.size()) {
                Q(false);
                return;
            }
            if (num == null || i3 == num.intValue()) {
                vv0 vv0Var = (vv0) arrayList.get(i3);
                j70 j70Var = new j70(0);
                j70 j70Var2 = new j70(0);
                j70 j70Var3 = new j70(0);
                j70 j70Var4 = new j70(0);
                float f = i / 2.0f;
                ym0 g = rt0.g(0);
                l lVar = new l(f);
                l lVar2 = new l(f);
                l lVar3 = new l(f);
                l lVar4 = new l(f);
                cn1 cn1Var = new cn1();
                cn1Var.f131a = g;
                cn1Var.b = g;
                cn1Var.c = g;
                cn1Var.d = g;
                cn1Var.e = lVar;
                cn1Var.f = lVar2;
                cn1Var.g = lVar3;
                cn1Var.h = lVar4;
                cn1Var.i = j70Var;
                cn1Var.j = j70Var2;
                cn1Var.k = j70Var3;
                cn1Var.l = j70Var4;
                vv0Var.setShapeAppearanceModel(cn1Var);
                ((vv0) arrayList.get(i3)).setBounds(0, 0, i, i2 >= 0 ? i2 : this.O);
            }
            i3++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(defpackage.g02 r5, float r6) {
        /*
            r4 = this;
            java.lang.String r0 = r4.n(r6)
            java.lang.CharSequence r1 = r5.N
            boolean r1 = android.text.TextUtils.equals(r1, r0)
            if (r1 != 0) goto L16
            r5.N = r0
            rx1 r0 = r5.Q
            r1 = 1
            r0.e = r1
            r5.invalidateSelf()
        L16:
            boolean r0 = r4.v()
            int r1 = r4.M
            int r2 = r4.n0
            if (r0 == 0) goto L5e
            float r6 = r4.x(r6)
            int r0 = r4.H0
            float r0 = (float) r0
            float r6 = r6 * r0
            int r6 = (int) r6
            int r1 = r1 + r6
            int r6 = r5.getIntrinsicHeight()
            int r6 = r6 / 2
            int r1 = r1 - r6
            int r6 = r5.getIntrinsicHeight()
            int r6 = r6 + r1
            boolean r0 = r4.u()
            if (r0 == 0) goto L4d
            int r0 = r4.e()
            int r3 = r4.O
            int r3 = r3 / 2
            int r3 = r3 + r2
            int r0 = r0 - r3
            int r2 = r5.getIntrinsicWidth()
        L4a:
            int r2 = r0 - r2
            goto L83
        L4d:
            int r0 = r4.e()
            int r3 = r4.O
            int r3 = r3 / 2
            int r3 = r3 + r2
            int r2 = r3 + r0
            int r0 = r5.getIntrinsicWidth()
            int r0 = r0 + r2
            goto L83
        L5e:
            float r6 = r4.x(r6)
            int r0 = r4.H0
            float r0 = (float) r0
            float r6 = r6 * r0
            int r6 = (int) r6
            int r1 = r1 + r6
            int r6 = r5.getIntrinsicWidth()
            int r6 = r6 / 2
            int r1 = r1 - r6
            int r6 = r5.getIntrinsicWidth()
            int r6 = r6 + r1
            int r0 = r4.e()
            int r3 = r4.O
            int r3 = r3 / 2
            int r3 = r3 + r2
            int r0 = r0 - r3
            int r2 = r5.getIntrinsicHeight()
            goto L4a
        L83:
            android.graphics.Rect r3 = r4.U0
            r3.set(r1, r2, r6, r0)
            boolean r6 = r4.v()
            if (r6 == 0) goto L9b
            android.graphics.RectF r6 = new android.graphics.RectF
            r6.<init>(r3)
            android.graphics.Matrix r0 = r4.X0
            r0.mapRect(r6)
            r6.round(r3)
        L9b:
            android.view.ViewGroup r6 = defpackage.ju0.E(r4)
            defpackage.d30.c(r6, r4, r3)
            r5.setBounds(r3)
            android.view.ViewGroup r4 = defpackage.ju0.E(r4)
            if (r4 != 0) goto Lad
            r4 = 0
            goto Lb1
        Lad:
            android.view.ViewOverlay r4 = r4.getOverlay()
        Lb1:
            if (r4 != 0) goto Lb4
            return
        Lb4:
            r4.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe.B(g02, float):void");
    }

    public final void C(ArrayList arrayList) {
        ViewGroup E;
        int resourceId;
        ViewGroup E2;
        if (arrayList.isEmpty()) {
            c.m("At least one value must be set");
            return;
        }
        Collections.sort(arrayList);
        if (this.y0.size() == arrayList.size() && this.y0.equals(arrayList)) {
            return;
        }
        this.y0 = arrayList;
        this.J0 = true;
        ArrayList arrayList2 = this.Y0;
        if (arrayList2.size() != this.y0.size()) {
            arrayList2.clear();
            for (int i = 0; i < this.y0.size(); i++) {
                vv0 vv0Var = new vv0();
                vv0Var.w();
                vv0Var.t(getThumbTintList());
                j70 j70Var = new j70(0);
                j70 j70Var2 = new j70(0);
                j70 j70Var3 = new j70(0);
                j70 j70Var4 = new j70(0);
                float f = this.N / 2.0f;
                ym0 g = rt0.g(0);
                l lVar = new l(f);
                l lVar2 = new l(f);
                l lVar3 = new l(f);
                l lVar4 = new l(f);
                cn1 cn1Var = new cn1();
                cn1Var.f131a = g;
                cn1Var.b = g;
                cn1Var.c = g;
                cn1Var.d = g;
                cn1Var.e = lVar;
                cn1Var.f = lVar2;
                cn1Var.g = lVar3;
                cn1Var.h = lVar4;
                cn1Var.i = j70Var;
                cn1Var.j = j70Var2;
                cn1Var.k = j70Var3;
                cn1Var.l = j70Var4;
                vv0Var.setShapeAppearanceModel(cn1Var);
                vv0Var.setBounds(0, 0, this.N, this.O);
                vv0Var.s(getThumbElevation());
                vv0Var.A(getThumbStrokeWidth());
                vv0Var.z(getThumbStrokeColor());
                vv0Var.setState(getDrawableState());
                arrayList2.add(vv0Var);
            }
        }
        this.A0 = 0;
        G();
        ArrayList arrayList3 = this.r;
        if (arrayList3.size() > this.y0.size()) {
            List<g02> subList = arrayList3.subList(this.y0.size(), arrayList3.size());
            for (g02 g02Var : subList) {
                if (isAttachedToWindow() && (E2 = ju0.E(this)) != null) {
                    E2.getOverlay().remove(g02Var);
                    E2.removeOnLayoutChangeListener(g02Var.R);
                }
            }
            subList.clear();
        }
        while (arrayList3.size() < this.y0.size()) {
            Context context = getContext();
            int i2 = this.q;
            g02 g02Var2 = new g02(context, i2);
            TypedArray J = d10.J(g02Var2.O, null, yb1.X, 0, i2, new int[0]);
            Context context2 = g02Var2.O;
            g02Var2.Y = context2.getResources().getDimensionPixelSize(R.dimen.mtrl_tooltip_arrowSize);
            boolean z = J.getBoolean(8, true);
            g02Var2.X = z;
            if (z) {
                bn1 l = g02Var2.k().l();
                l.k = g02Var2.G();
                g02Var2.setShapeAppearanceModel(l.a());
            } else {
                g02Var2.Y = 0;
            }
            CharSequence text = J.getText(6);
            boolean equals = TextUtils.equals(g02Var2.N, text);
            rx1 rx1Var = g02Var2.Q;
            if (!equals) {
                g02Var2.N = text;
                rx1Var.e = true;
                g02Var2.invalidateSelf();
            }
            ox1 ox1Var = (!J.hasValue(0) || (resourceId = J.getResourceId(0, 0)) == 0) ? null : new ox1(context2, resourceId);
            if (ox1Var != null && J.hasValue(1)) {
                ox1Var.k = tl2.o(context2, J, 1);
            }
            rx1Var.c(ox1Var, context2);
            g02Var2.t(ColorStateList.valueOf(J.getColor(7, ts.b(ts.e(je2.O(context2, md2.u(R.attr.colorOnBackground, context2, g02.class.getCanonicalName())), 153), ts.e(je2.O(context2, md2.u(android.R.attr.colorBackground, context2, g02.class.getCanonicalName())), 229)))));
            g02Var2.y(ColorStateList.valueOf(je2.O(context2, md2.u(R.attr.colorSurface, context2, g02.class.getCanonicalName()))));
            g02Var2.T = J.getDimensionPixelSize(2, 0);
            g02Var2.U = J.getDimensionPixelSize(4, 0);
            g02Var2.V = J.getDimensionPixelSize(5, 0);
            g02Var2.W = J.getDimensionPixelSize(3, 0);
            J.recycle();
            arrayList3.add(g02Var2);
            if (isAttachedToWindow() && (E = ju0.E(this)) != null) {
                int[] iArr = new int[2];
                E.getLocationOnScreen(iArr);
                g02Var2.Z = iArr[0];
                E.getWindowVisibleDisplayFrame(g02Var2.S);
                E.addOnLayoutChangeListener(g02Var2.R);
            }
        }
        int i3 = arrayList3.size() == 1 ? 0 : 1;
        int size = arrayList3.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList3.get(i4);
            i4++;
            ((g02) obj).A(i3);
        }
        ArrayList arrayList4 = this.s;
        int size2 = arrayList4.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList4.get(i5);
            i5++;
            bp1 bp1Var = (bp1) obj2;
            ArrayList arrayList5 = this.y0;
            int size3 = arrayList5.size();
            int i6 = 0;
            while (i6 < size3) {
                Object obj3 = arrayList5.get(i6);
                i6++;
                float floatValue = ((Float) obj3).floatValue();
                bp1Var.getClass();
                bp1Var.a(floatValue);
            }
        }
        postInvalidate();
    }

    public final boolean D(int i, float f) {
        ViewParent parent;
        this.A0 = i;
        if (Math.abs(f - ((Float) this.y0.get(i)).floatValue()) < 1.0E-4d) {
            return false;
        }
        float minSeparation = getMinSeparation();
        if (this.g1 == 0) {
            if (minSeparation == 0.0f) {
                minSeparation = 0.0f;
            } else {
                float f2 = this.w0;
                minSeparation = ((f2 - this.x0) * ((minSeparation - this.M) / this.H0)) + f2;
            }
        }
        if (u() || v()) {
            minSeparation = -minSeparation;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        this.y0.set(i, Float.valueOf(pr.j(f, i3 < 0 ? this.w0 : minSeparation + ((Float) this.y0.get(i3)).floatValue(), i2 >= this.y0.size() ? this.x0 : ((Float) this.y0.get(i2)).floatValue() - minSeparation)));
        ArrayList arrayList = this.s;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            bp1 bp1Var = (bp1) obj;
            float floatValue = ((Float) this.y0.get(i)).floatValue();
            bp1Var.getClass();
            bp1Var.a(floatValue);
        }
        AccessibilityManager accessibilityManager = this.o;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            Runnable runnable = this.p;
            if (runnable == null) {
                this.p = new ce(this);
            } else {
                removeCallbacks(runnable);
            }
            ce ceVar = this.p;
            ceVar.h = i;
            postDelayed(ceVar, 200L);
            de deVar = this.n;
            View view = deVar.i;
            if (i != Integer.MIN_VALUE && deVar.h.isEnabled() && (parent = view.getParent()) != null) {
                AccessibilityEvent k = deVar.k(i, rt0.w);
                k.setContentChangeTypes(0);
                parent.requestSendAccessibilityEvent(view, k);
            }
        }
        return true;
    }

    public final void E() {
        double d;
        float f = this.f1;
        float f2 = this.B0;
        if (f2 > 0.0f) {
            d = Math.round(f * r1) / ((int) ((this.x0 - this.w0) / f2));
        } else {
            d = f;
        }
        if (u() || v()) {
            d = 1.0d - d;
        }
        float f3 = this.x0;
        D(this.z0, (float) ((d * (f3 - r1)) + this.w0));
    }

    public final void F(int i, Rect rect) {
        int x = this.M + ((int) (x(getValues().get(i).floatValue()) * this.H0));
        int e = e();
        int max = Math.max(this.F, this.G) / 2;
        int max2 = Math.max(this.N / 2, max);
        int max3 = Math.max(this.O / 2, max);
        RectF rectF = new RectF(x - max2, e - max3, x + max2, e + max3);
        if (v()) {
            this.X0.mapRect(rectF);
        }
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    public final void G() {
        float f;
        float f2;
        float f3;
        float f4;
        RippleDrawable p;
        float x = (x(((Float) this.y0.get(this.A0)).floatValue()) * this.H0) + this.M;
        int e = e();
        if (p() != null && getMeasuredWidth() > 0 && (p = p()) != null) {
            float f5 = this.P;
            float[] fArr = {x - f5, e - r3, f5 + x, r3 + e};
            if (v()) {
                this.X0.mapPoints(fArr);
            }
            p.setHotspotBounds((int) fArr[0], (int) fArr[1], (int) fArr[2], (int) fArr[3]);
        }
        float f6 = e;
        FocusRingDrawable c = FocusRingDrawable.c(getBackground());
        if (c != null) {
            float dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.m3_slider_focus_ring_padding);
            float f7 = (dimensionPixelOffset * 2.0f) + (this.N / 2.0f);
            float f8 = (this.O / 2.0f) + dimensionPixelOffset;
            if (v()) {
                f = f6 - f8;
                float f9 = f6 + f8;
                f2 = x - f7;
                f3 = x + f7;
                f4 = f9;
            } else {
                f = x - f7;
                f4 = x + f7;
                f2 = f6 - f8;
                f3 = f6 + f8;
            }
            c.mutate();
            int i = (int) f;
            int i2 = (int) f2;
            int i3 = (int) f4;
            int i4 = (int) f3;
            jc0 jc0Var = c.u;
            if (jc0Var.w == null) {
                jc0Var.w = new Rect();
            }
            c.u.w.set(i, i2, i3, i4);
        }
    }

    public final void H() {
        float f;
        boolean v = v();
        boolean u = u();
        float f2 = 0.5f;
        if (v && u) {
            f = 0.5f;
            f2 = -0.2f;
        } else {
            f = 1.2f;
            if (v) {
                f2 = 1.2f;
                f = 0.5f;
            }
        }
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            g02 g02Var = (g02) obj;
            g02Var.c0 = f2;
            g02Var.d0 = f;
            g02Var.invalidateSelf();
        }
        int i2 = this.K;
        if (i2 == 0 || i2 == 1) {
            if (this.z0 == -1 || !isEnabled()) {
                m();
                return;
            } else {
                l(false);
                return;
            }
        }
        if (i2 == 2) {
            m();
            return;
        }
        if (i2 != 3) {
            rw.d(this.K, "Unexpected labelBehavior: ");
            return;
        }
        if (isEnabled()) {
            Rect rect = new Rect();
            ju0.E(this).getHitRect(rect);
            if (getLocalVisibleRect(rect) && this.l1) {
                l(true);
                return;
            }
        }
        m();
    }

    public final void I() {
        if (this.Q > 0 && this.Z0 == null && this.a1.isEmpty()) {
            int i = this.N;
            this.R = i;
            this.T = this.O;
            this.S = this.Q;
            int round = Math.round(i * 0.5f);
            FocusRingDrawable c = FocusRingDrawable.c(getBackground());
            A(round, (c == null || !c.u.c) ? -1 : this.O - this.y, Integer.valueOf(this.z0));
        }
    }

    public final void J() {
        int min;
        R();
        float f = this.B0;
        if (f <= 0.0f) {
            K(this.C0);
            return;
        }
        int i = this.E0;
        if (i != 0) {
            min = 0;
            if (i == 1) {
                int i2 = (int) (((this.x0 - this.w0) / f) + 1.0f);
                if (i2 <= (this.H0 / this.E) + 1) {
                    min = i2;
                }
            } else if (i != 2) {
                jw0.b(this.E0, "Unexpected tickVisibilityMode: ");
                return;
            }
        } else {
            min = Math.min((int) (((this.x0 - this.w0) / f) + 1.0f), (this.H0 / this.E) + 1);
        }
        K(min);
    }

    public final void K(int i) {
        if (i == 0) {
            this.D0 = null;
            return;
        }
        float[] fArr = this.D0;
        if (fArr == null || fArr.length != i * 2) {
            this.D0 = new float[i * 2];
        }
        float f = this.H0 / (i - 1);
        float e = e();
        for (int i2 = 0; i2 < i * 2; i2 += 2) {
            float[] fArr2 = this.D0;
            fArr2[i2] = ((i2 / 2.0f) * f) + this.M;
            fArr2[i2 + 1] = e;
        }
        if (v()) {
            this.X0.mapPoints(this.D0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(android.graphics.Canvas r11, android.graphics.Paint r12, android.graphics.RectF r13, float r14, int r15) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe.L(android.graphics.Canvas, android.graphics.Paint, android.graphics.RectF, float, int):void");
    }

    public final void M() {
        Drawable drawable = this.d0;
        if (drawable != null) {
            if (!this.e0 && this.f0 != null) {
                this.d0 = drawable.mutate();
                this.e0 = true;
            }
            if (this.e0) {
                this.d0.setTintList(this.f0);
            }
        }
    }

    public final void N() {
        Drawable drawable = this.b0;
        if (drawable != null) {
            if (!this.c0 && this.f0 != null) {
                this.b0 = drawable.mutate();
                this.c0 = true;
            }
            if (this.c0) {
                this.b0.setTintList(this.f0);
            }
        }
    }

    public final void O() {
        Drawable drawable = this.i0;
        if (drawable != null) {
            if (!this.j0 && this.k0 != null) {
                this.i0 = drawable.mutate();
                this.j0 = true;
            }
            if (this.j0) {
                this.i0.setTintList(this.k0);
            }
        }
    }

    public final void P() {
        Drawable drawable = this.g0;
        if (drawable != null) {
            if (!this.h0 && this.k0 != null) {
                this.g0 = drawable.mutate();
                this.h0 = true;
            }
            if (this.h0) {
                this.g0.setTintList(this.k0);
            }
        }
    }

    public final void Q(boolean z) {
        int paddingTop;
        int paddingBottom;
        boolean z2;
        if (v()) {
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        int i = paddingBottom + paddingTop;
        int max = Math.max(this.I, Math.max(this.L + i, this.O + i));
        boolean z3 = true;
        if (max == this.J) {
            z2 = false;
        } else {
            this.J = max;
            z2 = true;
        }
        int max2 = Math.max(Math.max(Math.max((this.N / 2) - this.A, 0), Math.max((this.L - this.B) / 2, 0)), Math.max(Math.max(this.F0 - this.C, 0), Math.max(this.G0 - this.D, 0))) + this.z;
        if (this.M == max2) {
            z3 = false;
        } else {
            this.M = max2;
            if (isLaidOut()) {
                this.H0 = Math.max((v() ? getHeight() : getWidth()) - (this.M * 2), 0);
                J();
            }
        }
        if (v()) {
            float e = e();
            Matrix matrix = this.X0;
            matrix.reset();
            matrix.setRotate(90.0f, e, e);
        }
        if (z2 || z) {
            requestLayout();
        } else if (z3) {
            postInvalidate();
        }
    }

    public final void R() {
        if (this.J0) {
            float f = this.w0;
            float f2 = this.x0;
            if (f >= f2) {
                throw new IllegalStateException("valueFrom(" + f + ") must be smaller than valueTo(" + f2 + ")");
            }
            ArrayList arrayList = this.y0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Float f3 = (Float) obj;
                if (f3.floatValue() < this.w0 || f3.floatValue() > this.x0) {
                    throw new IllegalStateException("Slider value(" + f3 + ") must be greater or equal to valueFrom(" + this.w0 + "), and lower or equal to valueTo(" + this.x0 + ")");
                }
                if (this.B0 > 0.0f && !S(f3.floatValue())) {
                    float f4 = this.w0;
                    float f5 = this.B0;
                    throw new IllegalStateException("Value(" + f3 + ") must be equal to valueFrom(" + f4 + ") plus a multiple of stepSize(" + f5 + ") when using stepSize(" + f5 + ")");
                }
            }
            if (this.B0 > 0.0f && !S(this.x0)) {
                throw new IllegalStateException("The stepSize(" + this.B0 + ") must be 0, or a factor of the valueFrom(" + this.w0 + ")-valueTo(" + this.x0 + ") range");
            }
            float minSeparation = getMinSeparation();
            if (minSeparation < 0.0f) {
                throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal to 0");
            }
            float f6 = this.B0;
            if (f6 > 0.0f && minSeparation > 0.0f) {
                if (this.g1 != 1) {
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") cannot be set as a dimension when using stepSize(" + f6 + ")");
                }
                if (minSeparation < f6 || !r(minSeparation)) {
                    float f7 = this.B0;
                    throw new IllegalStateException("minSeparation(" + minSeparation + ") must be greater or equal and a multiple of stepSize(" + f7 + ") when using stepSize(" + f7 + ")");
                }
            }
            if (this.B0 != 0.0f) {
                int i2 = (((int) r0) > this.x0 ? 1 : (((int) r0) == this.x0 ? 0 : -1));
            }
            this.J0 = false;
        }
    }

    public final boolean S(float f) {
        return r(new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.w0)), MathContext.DECIMAL64).doubleValue());
    }

    public final float T(float f) {
        return (x(f) * this.H0) + this.M;
    }

    public final void a(bp1 bp1Var) {
        this.s.add(bp1Var);
    }

    public final void b(int i, Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i, this.O);
        } else {
            float max = Math.max(i, this.O) / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * max), (int) (intrinsicHeight * max));
        }
    }

    public final void c(Canvas canvas, RectF rectF, Drawable drawable, boolean z) {
        if (drawable != null) {
            int i = this.l0;
            float f = rectF.right - rectF.left;
            int i2 = this.m0;
            float f2 = (i2 * 2) + i;
            RectF rectF2 = this.V0;
            if (f >= f2) {
                float f3 = z ^ (u() || v()) ? rectF.left + i2 : (rectF.right - i2) - i;
                float f4 = i;
                float e = e() - (f4 / 2.0f);
                rectF2.set(f3, e, f3 + f4, f4 + e);
            } else {
                rectF2.setEmpty();
            }
            if (rectF2.isEmpty()) {
                return;
            }
            if (v()) {
                this.X0.mapRect(rectF2);
            }
            Rect rect = this.W0;
            rectF2.round(rect);
            drawable.setBounds(rect);
            drawable.draw(canvas);
        }
    }

    public final int d(int i) {
        if (!this.v0 || i != this.z0 || this.Z0 != null || !this.a1.isEmpty()) {
            return this.Q;
        }
        return this.Q - ((this.N - Math.round(this.N * 0.5f)) / 2);
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.n.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.g.setColor(q(this.O0));
        this.h.setColor(q(this.N0));
        this.k.setColor(q(this.M0));
        this.l.setColor(q(this.L0));
        this.m.setColor(q(this.M0));
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            g02 g02Var = (g02) obj;
            if (g02Var.isStateful()) {
                g02Var.setState(getDrawableState());
            }
        }
        while (true) {
            ArrayList arrayList2 = this.Y0;
            if (i >= arrayList2.size()) {
                int q = q(this.K0);
                Paint paint = this.j;
                paint.setColor(q);
                paint.setAlpha(63);
                return;
            }
            if (((vv0) arrayList2.get(i)).isStateful()) {
                ((vv0) arrayList2.get(i)).setState(getDrawableState());
            }
            i++;
        }
    }

    public final int e() {
        int i = this.J / 2;
        int i2 = this.K;
        int i3 = 0;
        if (i2 == 1 || i2 == 3) {
            ArrayList arrayList = this.r;
            if (!arrayList.isEmpty()) {
                i3 = ((g02) arrayList.get(0)).getIntrinsicHeight();
            }
        }
        return i + i3;
    }

    public final ValueAnimator f(boolean z) {
        int J;
        TimeInterpolator K;
        float f = z ? 0.0f : 1.0f;
        ValueAnimator valueAnimator = z ? this.w : this.v;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            f = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f, z ? 1.0f : 0.0f);
        if (z) {
            J = kk1.J(getContext(), R.attr.motionDurationMedium4, 83);
            K = kk1.K(getContext(), R.attr.motionEasingEmphasizedInterpolator, o4.e);
        } else {
            J = kk1.J(getContext(), R.attr.motionDurationShort3, 117);
            K = kk1.K(getContext(), R.attr.motionEasingEmphasizedAccelerateInterpolator, o4.c);
        }
        ofFloat.setDuration(J);
        ofFloat.setInterpolator(K);
        ofFloat.addUpdateListener(new zd(0, this));
        return ofFloat;
    }

    public final void g(float f, float f2, float f3, float f4, Canvas canvas, RectF rectF, int i, int i2) {
        if (f2 - f > getTrackCornerSize() - i2) {
            rectF.set(f, f3, f2, f4);
        } else {
            rectF.setEmpty();
        }
        L(canvas, this.g, rectF, getTrackCornerSize(), i);
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.n.k;
    }

    public float getMinSeparation() {
        return 0.0f;
    }

    public abstract float getThumbElevation();

    public abstract int getThumbRadius();

    public abstract ColorStateList getThumbStrokeColor();

    public abstract float getThumbStrokeWidth();

    public abstract ColorStateList getThumbTintList();

    public abstract int getTrackCornerSize();

    public List<Float> getValues() {
        return new ArrayList(this.y0);
    }

    public final void h(Canvas canvas, float f, float f2) {
        for (int i = 0; i < this.y0.size(); i++) {
            float T = T(((Float) this.y0.get(i)).floatValue());
            float d = (this.N / 2.0f) + d(i);
            if (f >= T - d && f <= T + d) {
                return;
            }
        }
        boolean v = v();
        Paint paint = this.m;
        if (v) {
            canvas.drawPoint(f2, f, paint);
        } else {
            canvas.drawPoint(f, f2, paint);
        }
    }

    public final void i(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        if (v()) {
            canvas.concat(this.X0);
        }
        canvas.translate((this.M + ((int) (x(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    public final void j(int i, int i2, Canvas canvas, Paint paint) {
        int i3;
        while (i < i2) {
            boolean v = v();
            float[] fArr = this.D0;
            float f = v ? fArr[i + 1] : fArr[i];
            while (true) {
                if (i3 < this.y0.size()) {
                    float T = T(((Float) this.y0.get(i3)).floatValue());
                    float d = (this.N / 2.0f) + d(i3);
                    i3 = (f < T - d || f > T + d) ? i3 + 1 : 0;
                } else {
                    if (this.a0) {
                        float f2 = ((this.M * 2) + this.H0) / 2.0f;
                        float f3 = this.Q;
                        if (f >= f2 - f3 && f <= f2 + f3) {
                        }
                    }
                    float[] fArr2 = this.D0;
                    canvas.drawPoint(fArr2[i], fArr2[i + 1], paint);
                }
            }
            i += 2;
        }
    }

    public final void k(Canvas canvas, RectF rectF, RectF rectF2) {
        if (this.b0 == null && this.d0 == null && this.g0 == null && this.i0 == null) {
            return;
        }
        this.y0.size();
        c(canvas, rectF, this.b0, true);
        c(canvas, rectF2, this.g0, true);
        c(canvas, rectF, this.d0, false);
        c(canvas, rectF2, this.i0, false);
    }

    public final void l(boolean z) {
        if (!this.u) {
            this.u = true;
            ValueAnimator f = f(true);
            this.v = f;
            this.w = null;
            f.start();
        }
        ArrayList arrayList = this.r;
        Iterator it = arrayList.iterator();
        if (z) {
            for (int i = 0; i < this.y0.size() && it.hasNext(); i++) {
                if (i != this.A0) {
                    B((g02) it.next(), ((Float) this.y0.get(i)).floatValue());
                }
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(arrayList.size()), Integer.valueOf(this.y0.size())));
        }
        B((g02) it.next(), ((Float) this.y0.get(this.A0)).floatValue());
    }

    public final void m() {
        if (this.u) {
            this.u = false;
            ValueAnimator f = f(false);
            this.w = f;
            this.v = null;
            f.addListener(new r1(2, this));
            this.w.start();
        }
    }

    public final String n(float f) {
        zo0 zo0Var = this.u0;
        if (zo0Var == null) {
            return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
        }
        ((c) zo0Var).getClass();
        int i = BrightnessActivity.F;
        return d51.t(new StringBuilder(), (int) (f * 100.0f), "%");
    }

    public final float[] o() {
        float floatValue = ((Float) this.y0.get(0)).floatValue();
        float floatValue2 = ((Float) d51.m(this.y0, 1)).floatValue();
        if (this.y0.size() == 1) {
            floatValue = this.w0;
        }
        float x = x(floatValue);
        float x2 = x(floatValue2);
        if (this.a0) {
            float min = Math.min(0.5f, x2);
            x2 = Math.max(0.5f, x2);
            x = min;
        }
        return (this.a0 || !(u() || v())) ? new float[]{x, x2} : new float[]{x2, x};
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l1 = isShown();
        getViewTreeObserver().addOnScrollChangedListener(this.i1);
        getViewTreeObserver().addOnGlobalLayoutListener(this.j1);
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            g02 g02Var = (g02) obj;
            ViewGroup E = ju0.E(this);
            if (E == null) {
                g02Var.getClass();
            } else {
                g02Var.getClass();
                int[] iArr = new int[2];
                E.getLocationOnScreen(iArr);
                g02Var.Z = iArr[0];
                E.getWindowVisibleDisplayFrame(g02Var.S);
                E.addOnLayoutChangeListener(g02Var.R);
            }
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        ce ceVar = this.p;
        if (ceVar != null) {
            removeCallbacks(ceVar);
        }
        int i = 0;
        this.u = false;
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            g02 g02Var = (g02) obj;
            ViewGroup E = ju0.E(this);
            if (E != null) {
                E.getOverlay().remove(g02Var);
                E.removeOnLayoutChangeListener(g02Var.R);
            }
        }
        getViewTreeObserver().removeOnScrollChangedListener(this.i1);
        getViewTreeObserver().removeOnGlobalLayoutListener(this.j1);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02ee  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        de deVar = this.n;
        if (!z) {
            z();
            this.z0 = -1;
            deVar.j(this.A0);
            return;
        }
        if (this.z0 == -1) {
            if (i == 1) {
                w(Integer.MAX_VALUE);
            } else if (i == 2) {
                w(Integer.MIN_VALUE);
            } else if (i == 17) {
                w((u() || v()) ? -2147483647 : Integer.MAX_VALUE);
            } else if (i == 66) {
                if (!u() && !v()) {
                    r0 = Integer.MIN_VALUE;
                }
                w(r0);
            }
            this.z0 = this.A0;
        }
        z();
        I();
        deVar.v(this.A0);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setVisibleToUser(false);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Float valueOf;
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        this.z0 = this.A0;
        boolean isLongPress = this.I0 | keyEvent.isLongPress();
        this.I0 = isLongPress;
        float f = this.B0;
        if (isLongPress) {
            if (f == 0.0f) {
                f = 1.0f;
            }
            if ((this.x0 - this.w0) / f > 20.0f) {
                f *= Math.round(r0 / 20.0f);
            }
        } else if (f == 0.0f) {
            f = 1.0f;
        }
        if (i == 21) {
            if (!u()) {
                f = -f;
            }
            valueOf = Float.valueOf(f);
        } else if (i != 22) {
            valueOf = i != 69 ? (i == 70 || i == 81) ? Float.valueOf(f) : null : Float.valueOf(-f);
        } else {
            if (u()) {
                f = -f;
            }
            valueOf = Float.valueOf(f);
        }
        if (valueOf != null) {
            if (D(this.z0, valueOf.floatValue() + ((Float) this.y0.get(this.z0)).floatValue())) {
                G();
                postInvalidate();
            }
            return true;
        }
        if (i != 61) {
            return super.onKeyDown(i, keyEvent);
        }
        z();
        if (keyEvent.hasNoModifiers()) {
            return w(1);
        }
        if (keyEvent.isShiftPressed()) {
            return w(-1);
        }
        return false;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.I0 = false;
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Rect rect = this.r0;
        rect.left = 0;
        rect.top = 0;
        rect.right = i3 - i;
        rect.bottom = i4 - i2;
        ArrayList arrayList = this.s0;
        if (!arrayList.contains(rect)) {
            arrayList.add(rect);
        }
        WeakHashMap weakHashMap = y62.f1215a;
        if (Build.VERSION.SDK_INT >= 29) {
            u62.c(this, arrayList);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.K;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.J + ((i3 == 1 || i3 == 3) ? ((g02) this.r.get(0)).getIntrinsicHeight() : 0), 1073741824);
        if (v()) {
            super.onMeasure(makeMeasureSpec, i2);
        } else {
            super.onMeasure(i, makeMeasureSpec);
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ee eeVar = (ee) parcelable;
        super.onRestoreInstanceState(eeVar.getSuperState());
        this.w0 = eeVar.g;
        this.x0 = eeVar.h;
        C(eeVar.i);
        this.B0 = eeVar.j;
        if (eeVar.k) {
            requestFocus();
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ee eeVar = new ee(super.onSaveInstanceState());
        eeVar.g = this.w0;
        eeVar.h = this.x0;
        eeVar.i = new ArrayList(this.y0);
        eeVar.j = this.B0;
        eeVar.k = hasFocus();
        return eeVar;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (v()) {
            i = i2;
        }
        this.H0 = Math.max(i - (this.M * 2), 0);
        J();
        G();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i = 0;
        if (isEnabled()) {
            float y = v() ? motionEvent.getY() : motionEvent.getX();
            float x = v() ? motionEvent.getX() : motionEvent.getY();
            float f = (y - this.M) / this.H0;
            this.f1 = f;
            float max = Math.max(0.0f, f);
            this.f1 = max;
            this.f1 = Math.min(1.0f, max);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                ArrayList arrayList = this.t;
                int i2 = this.x;
                if (actionMasked == 1) {
                    this.v0 = false;
                    MotionEvent motionEvent2 = this.q0;
                    if (motionEvent2 != null && motionEvent2.getActionMasked() == 0) {
                        float f2 = i2;
                        if (Math.abs(this.q0.getX() - motionEvent.getX()) <= f2 && Math.abs(this.q0.getY() - motionEvent.getY()) <= f2) {
                            Slider slider = (Slider) this;
                            if (slider.getActiveThumbIndex() == -1) {
                                slider.setActiveThumbIndex(0);
                            }
                            y();
                        }
                    }
                    if (this.z0 != -1) {
                        E();
                        G();
                        z();
                        this.z0 = -1;
                        int size = arrayList.size();
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            ((wc) obj).a(this);
                        }
                    }
                    invalidate();
                } else if (actionMasked == 2) {
                    if (!this.v0) {
                        if ((v() || !t(motionEvent) || Math.abs(y - this.o0) >= i2) && (!v() || !s(motionEvent) || Math.abs(x - this.p0) >= i2 * 0.8f)) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            Slider slider2 = (Slider) this;
                            if (slider2.getActiveThumbIndex() == -1) {
                                slider2.setActiveThumbIndex(0);
                            }
                            this.v0 = true;
                            I();
                            y();
                        }
                    }
                    E();
                    G();
                    invalidate();
                } else if (actionMasked == 3) {
                    this.v0 = false;
                    if (this.z0 != -1 && !this.t0.isEmpty()) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= this.y0.size()) {
                                break;
                            }
                            if (i3 == this.z0) {
                                D(i3, ((Float) this.t0.get(i3)).floatValue());
                                break;
                            }
                            i3++;
                        }
                    }
                    G();
                    z();
                    this.z0 = -1;
                    int size2 = arrayList.size();
                    while (i < size2) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        ((wc) obj2).a(this);
                    }
                    invalidate();
                }
            } else {
                this.o0 = y;
                this.p0 = x;
                this.t0.clear();
                this.t0 = getValues();
                if ((v() || !t(motionEvent)) && (!v() || !s(motionEvent))) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                    Slider slider3 = (Slider) this;
                    if (slider3.getActiveThumbIndex() == -1) {
                        slider3.setActiveThumbIndex(0);
                    }
                    requestFocus();
                    this.v0 = true;
                    I();
                    y();
                    E();
                    G();
                    invalidate();
                }
            }
            setPressed(this.v0);
            this.q0 = MotionEvent.obtain(motionEvent);
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        this.l1 = z;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            ViewGroup E = ju0.E(this);
            ViewOverlay overlay = E == null ? null : E.getOverlay();
            if (overlay == null) {
                return;
            }
            ArrayList arrayList = this.r;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                overlay.remove((g02) obj);
            }
        }
    }

    public final RippleDrawable p() {
        Drawable background = getBackground();
        if (background instanceof DrawableWrapper) {
            background = ((DrawableWrapper) background).getDrawable();
        }
        if (background instanceof RippleDrawable) {
            return (RippleDrawable) background;
        }
        return null;
    }

    public final int q(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    public final boolean r(double d) {
        double doubleValue = new BigDecimal(Double.toString(d)).divide(new BigDecimal(Float.toString(this.B0)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(doubleValue)) - doubleValue) < 1.0E-4d;
    }

    public final boolean s(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollHorizontally(1) || viewGroup.canScrollHorizontally(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void setActiveThumbIndex(int i) {
        this.z0 = i;
    }

    public abstract void setCentered(boolean z);

    public void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    public void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.Z0 = null;
        this.a1 = new ArrayList();
        for (Drawable drawable : drawableArr) {
            List list = this.a1;
            Drawable newDrawable = drawable.mutate().getConstantState().newDrawable();
            b(this.N, newDrawable);
            list.add(newDrawable);
        }
        postInvalidate();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    public abstract void setHaloRadius(int i);

    public abstract void setHaloTintList(ColorStateList colorStateList);

    public abstract void setLabelBehavior(int i);

    public abstract void setOrientation(int i);

    public void setSeparationUnit(int i) {
        this.g1 = i;
        this.J0 = true;
        postInvalidate();
    }

    public abstract void setThumbElevation(float f);

    public abstract void setThumbHeight(int i);

    public abstract void setThumbStrokeColor(ColorStateList colorStateList);

    public abstract void setThumbStrokeWidth(float f);

    public abstract void setThumbTintList(ColorStateList colorStateList);

    public abstract void setThumbTrackGapSize(int i);

    public abstract void setThumbWidth(int i);

    public abstract void setTickActiveRadius(int i);

    public abstract void setTickActiveTintList(ColorStateList colorStateList);

    public abstract void setTickInactiveRadius(int i);

    public abstract void setTickInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackActiveTintList(ColorStateList colorStateList);

    public abstract void setTrackCornerSize(int i);

    public abstract void setTrackHeight(int i);

    public abstract void setTrackIconActiveColor(ColorStateList colorStateList);

    public abstract void setTrackIconActiveEnd(Drawable drawable);

    public abstract void setTrackIconActiveStart(Drawable drawable);

    public abstract void setTrackIconInactiveColor(ColorStateList colorStateList);

    public abstract void setTrackIconInactiveEnd(Drawable drawable);

    public abstract void setTrackIconInactiveStart(Drawable drawable);

    public abstract void setTrackIconSize(int i);

    public abstract void setTrackInactiveTintList(ColorStateList colorStateList);

    public abstract void setTrackInsideCornerSize(int i);

    public abstract void setTrackStopIndicatorSize(int i);

    public void setValues(List<Float> list) {
        C(new ArrayList(list));
    }

    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        C(arrayList);
    }

    public final boolean t(MotionEvent motionEvent) {
        if (motionEvent.getToolType(0) != 3) {
            for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean u() {
        return getLayoutDirection() == 1;
    }

    public final boolean v() {
        return this.H == 1;
    }

    public final boolean w(int i) {
        int i2 = this.A0;
        long j = i2 + i;
        long size = this.y0.size() - 1;
        if (j < 0) {
            j = 0;
        } else if (j > size) {
            j = size;
        }
        int i3 = (int) j;
        this.A0 = i3;
        if (i3 == i2) {
            return false;
        }
        this.z0 = i3;
        I();
        G();
        postInvalidate();
        return true;
    }

    public final float x(float f) {
        float f2 = this.w0;
        float f3 = (f - f2) / (this.x0 - f2);
        return (u() || v()) ? 1.0f - f3 : f3;
    }

    public final void y() {
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            switch (((wc) obj).f1125a) {
                case 0:
                    break;
                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                    break;
                default:
                    break;
            }
        }
    }

    public final void z() {
        int i;
        if (this.Q <= 0 || (i = this.R) == -1 || this.S == -1) {
            return;
        }
        A(i, this.T, Integer.valueOf(this.z0));
    }
}
