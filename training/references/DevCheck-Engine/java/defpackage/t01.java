package defpackage;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.BaselineLayout;

/* loaded from: classes.dex */
public abstract class t01 extends FrameLayout implements w01 {
    public static final int[] p0 = {R.attr.state_checked};
    public static final pg0 q0 = new pg0();
    public static final s01 r0 = new s01();
    public final BaselineLayout A;
    public final TextView B;
    public final TextView C;
    public final BaselineLayout D;
    public final TextView E;
    public final TextView F;
    public BaselineLayout G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public ColorStateList M;
    public boolean N;
    public sw0 O;
    public ColorStateList P;
    public Drawable Q;
    public Drawable R;
    public ValueAnimator S;
    public pg0 T;
    public float U;
    public boolean V;
    public int W;
    public int a0;
    public int b0;
    public int c0;
    public boolean d0;
    public int e0;
    public int f0;
    public boolean g;
    public dc g0;
    public ColorStateList h;
    public int h0;
    public Drawable i;
    public int i0;
    public int j;
    public int j0;
    public int k;
    public boolean k0;
    public int l;
    public boolean l0;
    public int m;
    public boolean m0;
    public float n;
    public boolean n0;
    public float o;
    public Rect o0;
    public float p;
    public float q;
    public float r;
    public float s;
    public int t;
    public boolean u;
    public final LinearLayout v;
    public final LinearLayout w;
    public final View x;
    public final FrameLayout y;
    public final ImageView z;

    public t01(Context context) {
        super(context);
        this.g = false;
        this.H = -1;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.N = false;
        this.T = q0;
        this.U = 0.0f;
        this.V = false;
        this.W = 0;
        this.a0 = 0;
        this.b0 = -2;
        this.c0 = 0;
        this.d0 = false;
        this.e0 = 0;
        this.f0 = 0;
        this.i0 = 0;
        this.j0 = 49;
        this.k0 = false;
        this.l0 = false;
        this.m0 = false;
        this.n0 = false;
        this.o0 = new Rect();
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.v = (LinearLayout) findViewById(flar2.devcheck.R.id.navigation_bar_item_content_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(flar2.devcheck.R.id.navigation_bar_item_inner_content_container);
        this.w = linearLayout;
        this.x = findViewById(flar2.devcheck.R.id.navigation_bar_item_active_indicator_view);
        this.y = (FrameLayout) findViewById(flar2.devcheck.R.id.navigation_bar_item_icon_container);
        this.z = (ImageView) findViewById(flar2.devcheck.R.id.navigation_bar_item_icon_view);
        BaselineLayout baselineLayout = (BaselineLayout) findViewById(flar2.devcheck.R.id.navigation_bar_item_labels_group);
        this.A = baselineLayout;
        TextView textView = (TextView) findViewById(flar2.devcheck.R.id.navigation_bar_item_small_label_view);
        this.B = textView;
        TextView textView2 = (TextView) findViewById(flar2.devcheck.R.id.navigation_bar_item_large_label_view);
        this.C = textView2;
        float dimension = getResources().getDimension(flar2.devcheck.R.dimen.default_navigation_text_size);
        float dimension2 = getResources().getDimension(flar2.devcheck.R.dimen.default_navigation_active_text_size);
        BaselineLayout baselineLayout2 = new BaselineLayout(getContext(), null, 0);
        baselineLayout2.g = -1;
        this.D = baselineLayout2;
        baselineLayout2.setVisibility(8);
        this.D.setDuplicateParentStateEnabled(true);
        this.D.setMeasurePaddingFromBaseline(this.m0);
        TextView textView3 = new TextView(getContext());
        this.E = textView3;
        textView3.setMaxLines(1);
        TextView textView4 = this.E;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView4.setEllipsize(truncateAt);
        this.E.setDuplicateParentStateEnabled(true);
        this.E.setIncludeFontPadding(false);
        this.E.setGravity(16);
        this.E.setTextSize(dimension);
        TextView textView5 = new TextView(getContext());
        this.F = textView5;
        textView5.setMaxLines(1);
        this.F.setEllipsize(truncateAt);
        this.F.setDuplicateParentStateEnabled(true);
        this.F.setVisibility(4);
        this.F.setIncludeFontPadding(false);
        this.F.setGravity(16);
        this.F.setTextSize(dimension2);
        this.D.addView(this.E);
        this.D.addView(this.F);
        this.G = baselineLayout;
        setBackgroundResource(getItemBackgroundResId());
        this.j = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.k = baselineLayout.getPaddingBottom();
        this.l = 0;
        this.m = 0;
        textView.setImportantForAccessibility(2);
        textView2.setImportantForAccessibility(2);
        this.E.setImportantForAccessibility(2);
        this.F.setImportantForAccessibility(2);
        setFocusable(true);
        a();
        this.c0 = getResources().getDimensionPixelSize(flar2.devcheck.R.dimen.m3_navigation_item_expanded_active_indicator_height_default);
        linearLayout.addOnLayoutChangeListener(new ui(2, (el) this));
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int indexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < indexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof t01) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private int getSuggestedIconWidth() {
        dc dcVar = this.g0;
        int minimumWidth = dcVar == null ? 0 : dcVar.getMinimumWidth() - this.g0.k.b.C.intValue();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.y.getLayoutParams();
        return Math.max(minimumWidth, layoutParams.rightMargin) + this.z.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.leftMargin);
    }

    public static void i(View view, int i, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i2;
        layoutParams.gravity = i3;
        view.setLayoutParams(layoutParams);
    }

    private void setLabelPivots(TextView textView) {
        textView.setPivotX(textView.getWidth() / 2);
        textView.setPivotY(textView.getBaseline());
    }

    public final void a() {
        float textSize = this.B.getTextSize();
        float textSize2 = this.C.getTextSize();
        this.n = textSize - textSize2;
        this.o = (textSize2 * 1.0f) / textSize;
        this.p = (textSize * 1.0f) / textSize2;
        float textSize3 = this.E.getTextSize();
        float textSize4 = this.F.getTextSize();
        this.q = textSize3 - textSize4;
        this.r = (textSize4 * 1.0f) / textSize3;
        this.s = (textSize3 * 1.0f) / textSize4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    public final void b() {
        Drawable drawable = this.i;
        boolean z = true;
        if (this.h != null) {
            Drawable activeIndicatorDrawable = getActiveIndicatorDrawable();
            if (this.V && activeIndicatorDrawable != null) {
                ?? rippleDrawable = new RippleDrawable(rt0.B(this.h), null, activeIndicatorDrawable);
                FocusRingDrawable.f(getContext(), rippleDrawable, activeIndicatorDrawable instanceof vv0 ? (vv0) activeIndicatorDrawable : null);
                r3 = rippleDrawable;
                z = false;
            } else if (drawable == null) {
                RippleDrawable rippleDrawable2 = new RippleDrawable(rt0.f(this.h), null, null);
                Context context = getContext();
                ColorDrawable colorDrawable = FocusRingDrawable.v;
                drawable = !md2.s(context.getTheme(), flar2.devcheck.R.attr.focusRingsEnabled, false) ? rippleDrawable2 : new FocusRingDrawable(context, rippleDrawable2);
            }
        }
        FrameLayout frameLayout = this.y;
        frameLayout.setPadding(0, 0, 0, 0);
        frameLayout.setForeground(r3);
        setBackground(drawable);
        if (Build.VERSION.SDK_INT >= 26) {
            setDefaultFocusHighlightEnabled(z);
        }
    }

    @Override // defpackage.gx0
    public final void c(sw0 sw0Var) {
        this.O = sw0Var;
        setCheckable(sw0Var.isCheckable());
        setChecked(sw0Var.isChecked());
        setEnabled(sw0Var.isEnabled());
        setIcon(sw0Var.getIcon());
        setTitle(sw0Var.e);
        setId(sw0Var.f958a);
        if (!TextUtils.isEmpty(sw0Var.q)) {
            setContentDescription(sw0Var.q);
        }
        ym0.z(this, !TextUtils.isEmpty(sw0Var.r) ? sw0Var.r : sw0Var.e);
        l();
        this.g = true;
    }

    public final void d(float f, float f2) {
        pg0 pg0Var = this.T;
        pg0Var.getClass();
        float a2 = o4.a(0.4f, 1.0f, f);
        View view = this.x;
        view.setScaleX(a2);
        view.setScaleY(pg0Var.e(f));
        view.setAlpha(o4.b(0.0f, 1.0f, f2 == 0.0f ? 0.8f : 0.0f, f2 == 0.0f ? 1.0f : 0.2f, f));
        this.U = f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.V) {
            this.y.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        int i = this.z.getLayoutParams().width > 0 ? this.m : 0;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.D.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
            layoutParams.leftMargin = getLayoutDirection() != 1 ? i : 0;
        }
    }

    public final void f(TextView textView, TextView textView2, float f, float f2) {
        i(this.v, this.h0 == 0 ? (int) (this.j + f2) : 0, 0, this.j0);
        int i = this.h0;
        i(this.w, i == 0 ? 0 : this.o0.top, i == 0 ? 0 : this.o0.bottom, i == 0 ? 17 : 8388627);
        int i2 = this.k;
        BaselineLayout baselineLayout = this.A;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), i2);
        this.G.setVisibility(0);
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        textView.setVisibility(0);
        textView2.setScaleX(f);
        textView2.setScaleY(f);
        textView2.setVisibility(4);
    }

    public final void g() {
        int i = this.j;
        i(this.v, i, i, this.h0 == 0 ? 17 : this.j0);
        i(this.w, 0, 0, 17);
        BaselineLayout baselineLayout = this.A;
        baselineLayout.setPadding(baselineLayout.getPaddingLeft(), baselineLayout.getPaddingTop(), baselineLayout.getPaddingRight(), 0);
        this.G.setVisibility(8);
    }

    public Drawable getActiveIndicatorDrawable() {
        return this.x.getBackground();
    }

    public dc getBadge() {
        return this.g0;
    }

    public BaselineLayout getExpandedLabelGroup() {
        return this.D;
    }

    public int getItemBackgroundResId() {
        return flar2.devcheck.R.drawable.mtrl_navigation_bar_item_background;
    }

    @Override // defpackage.gx0
    public sw0 getItemData() {
        return this.O;
    }

    public int getItemDefaultMarginResId() {
        return flar2.devcheck.R.dimen.mtrl_navigation_bar_item_default_margin;
    }

    public abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.H;
    }

    public BaselineLayout getLabelGroup() {
        return this.A;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        LinearLayout linearLayout = this.v;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
        return linearLayout.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        if (this.h0 == 1) {
            LinearLayout linearLayout = this.w;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            return linearLayout.getMeasuredWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
        }
        BaselineLayout baselineLayout = this.A;
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), baselineLayout.getMeasuredWidth() + layoutParams2.leftMargin + layoutParams2.rightMargin);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(android.widget.TextView r4, int r5) {
        /*
            r3 = this;
            boolean r3 = r3.n0
            if (r3 == 0) goto L8
            r4.setTextAppearance(r5)
            return
        L8:
            r4.setTextAppearance(r5)
            android.content.Context r3 = r4.getContext()
            r0 = 0
            if (r5 != 0) goto L13
            goto L27
        L13:
            int[] r1 = defpackage.zb1.x
            android.content.res.TypedArray r5 = r3.obtainStyledAttributes(r5, r1)
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            boolean r2 = r5.getValue(r0, r1)
            r5.recycle()
            if (r2 != 0) goto L29
        L27:
            r3 = r0
            goto L52
        L29:
            int r5 = r1.getComplexUnit()
            int r1 = r1.data
            r2 = 2
            if (r5 != r2) goto L46
            float r5 = android.util.TypedValue.complexToFloat(r1)
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r5 = r5 * r3
            int r3 = java.lang.Math.round(r5)
            goto L52
        L46:
            android.content.res.Resources r3 = r3.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = android.util.TypedValue.complexToDimensionPixelSize(r1, r3)
        L52:
            if (r3 == 0) goto L58
            float r3 = (float) r3
            r4.setTextSize(r0, r3)
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t01.h(android.widget.TextView, int):void");
    }

    public final void j(int i) {
        if (i > 0 || getVisibility() != 0) {
            int min = Math.min(this.W, i - (this.e0 * 2));
            int i2 = this.a0;
            if (this.h0 == 1) {
                int i3 = i - (this.f0 * 2);
                int i4 = this.b0;
                if (i4 != -1) {
                    i3 = i4 == -2 ? this.v.getMeasuredWidth() : Math.min(i4, i3);
                }
                min = i3;
                i2 = Math.max(this.c0, this.w.getMeasuredHeight());
            }
            View view = this.x;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            if (this.d0 && this.t == 2) {
                i2 = min;
            }
            layoutParams.height = i2;
            layoutParams.width = Math.max(0, min);
            view.setLayoutParams(layoutParams);
        }
    }

    public final void k(TextView textView, int i) {
        if (textView == null) {
            return;
        }
        h(textView, i);
        a();
        textView.setMinimumHeight(tl2.v(textView.getContext(), i));
        ColorStateList colorStateList = this.M;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
        TextView textView2 = this.C;
        textView2.setTypeface(textView2.getTypeface(), this.N ? 1 : 0);
        TextView textView3 = this.F;
        textView3.setTypeface(textView3.getTypeface(), this.N ? 1 : 0);
    }

    public final void l() {
        sw0 sw0Var = this.O;
        if (sw0Var != null) {
            setVisibility((!sw0Var.isVisible() || (!this.k0 && this.l0)) ? 8 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        sw0 sw0Var = this.O;
        if (sw0Var != null && sw0Var.isCheckable() && this.O.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, p0);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        dc dcVar = this.g0;
        if (dcVar != null && dcVar.isVisible()) {
            sw0 sw0Var = this.O;
            CharSequence charSequence = sw0Var.e;
            if (!TextUtils.isEmpty(sw0Var.q)) {
                charSequence = this.O.q;
            }
            accessibilityNodeInfo.setContentDescription(((Object) charSequence) + ", " + ((Object) this.g0.d()));
        }
        accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) b1.b(isSelected(), 0, 1, getItemVisiblePosition(), 1).g);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) v0.e.f1061a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(flar2.devcheck.R.string.item_view_role_description));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new ce(i, 4, this));
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        this.x.setBackground(drawable);
        b();
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.V = z;
        b();
        this.x.setVisibility(z ? 0 : 8);
        requestLayout();
    }

    public void setActiveIndicatorExpandedHeight(int i) {
        this.c0 = i;
        j(getWidth());
    }

    public void setActiveIndicatorExpandedMarginHorizontal(int i) {
        this.f0 = i;
        if (this.h0 == 1) {
            setPadding(i, 0, i, 0);
        }
        j(getWidth());
    }

    public void setActiveIndicatorExpandedPadding(Rect rect) {
        this.o0 = rect;
    }

    public void setActiveIndicatorExpandedWidth(int i) {
        this.b0 = i;
        j(getWidth());
    }

    public void setActiveIndicatorHeight(int i) {
        this.a0 = i;
        j(getWidth());
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.l != i) {
            this.l = i;
            ((LinearLayout.LayoutParams) this.A.getLayoutParams()).topMargin = i;
            BaselineLayout baselineLayout = this.D;
            if (baselineLayout.getLayoutParams() != null) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) baselineLayout.getLayoutParams();
                layoutParams.rightMargin = getLayoutDirection() == 1 ? i : 0;
                if (getLayoutDirection() == 1) {
                    i = 0;
                }
                layoutParams.leftMargin = i;
                requestLayout();
            }
        }
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.e0 = i;
        j(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.d0 = z;
    }

    public void setActiveIndicatorWidth(int i) {
        this.W = i;
        j(getWidth());
    }

    public void setBadge(dc dcVar) {
        dc dcVar2 = this.g0;
        if (dcVar2 == dcVar) {
            return;
        }
        ImageView imageView = this.z;
        if (dcVar2 != null && imageView != null && dcVar2 != null) {
            setClipChildren(true);
            setClipToPadding(true);
            dc dcVar3 = this.g0;
            if (dcVar3 != null) {
                if (dcVar3.e() != null) {
                    dcVar3.e().setForeground(null);
                } else {
                    imageView.getOverlay().remove(dcVar3);
                }
            }
            this.g0 = null;
        }
        this.g0 = dcVar;
        int i = this.i0;
        fc fcVar = dcVar.k;
        if (fcVar.l != i) {
            fcVar.l = i;
            dcVar.k();
        }
        if (imageView == null || this.g0 == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        dc dcVar4 = this.g0;
        Rect rect = new Rect();
        imageView.getDrawingRect(rect);
        dcVar4.setBounds(rect);
        dcVar4.j(imageView, null);
        if (dcVar4.e() != null) {
            dcVar4.e().setForeground(dcVar4);
        } else {
            imageView.getOverlay().add(dcVar4);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    public void setChecked(boolean z) {
        TextView textView = this.C;
        setLabelPivots(textView);
        TextView textView2 = this.B;
        setLabelPivots(textView2);
        TextView textView3 = this.F;
        setLabelPivots(textView3);
        TextView textView4 = this.E;
        setLabelPivots(textView4);
        float f = z ? 1.0f : 0.0f;
        if (this.V && this.g && isAttachedToWindow()) {
            ValueAnimator valueAnimator = this.S;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.S = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.U, f);
            this.S = ofFloat;
            ofFloat.addUpdateListener(new r01(this, f));
            this.S.setInterpolator(kk1.K(getContext(), flar2.devcheck.R.attr.motionEasingEmphasizedInterpolator, o4.b));
            this.S.setDuration(kk1.J(getContext(), flar2.devcheck.R.attr.motionDurationLong2, getResources().getInteger(flar2.devcheck.R.integer.material_motion_duration_long_1)));
            this.S.start();
        } else {
            d(f, f);
        }
        float f2 = this.n;
        float f3 = this.o;
        float f4 = this.p;
        if (this.h0 == 1) {
            f2 = this.q;
            f3 = this.r;
            f4 = this.s;
            textView = textView3;
            textView2 = textView4;
        }
        int i = this.t;
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        g();
                    }
                } else if (z) {
                    f(textView, textView2, f3, f2);
                } else {
                    f(textView2, textView, f4, 0.0f);
                }
            } else if (z) {
                f(textView, textView2, f3, 0.0f);
            } else {
                g();
            }
        } else if (this.u) {
            if (z) {
                f(textView, textView2, f3, 0.0f);
            } else {
                g();
            }
        } else if (z) {
            f(textView, textView2, f3, f2);
        } else {
            f(textView2, textView, f4, 0.0f);
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.B.setEnabled(z);
        this.C.setEnabled(z);
        this.E.setEnabled(z);
        this.F.setEnabled(z);
        this.z.setEnabled(z);
    }

    @Override // defpackage.w01
    public void setExpanded(boolean z) {
        this.k0 = z;
        l();
    }

    public void setHorizontalTextAppearanceActive(int i) {
        this.K = i;
        if (i == 0) {
            i = this.I;
        }
        k(this.F, i);
    }

    public void setHorizontalTextAppearanceInactive(int i) {
        this.L = i;
        if (i == 0) {
            i = this.J;
        }
        TextView textView = this.E;
        if (textView == null) {
            return;
        }
        h(textView, i);
        a();
        textView.setMinimumHeight(tl2.v(textView.getContext(), i));
        ColorStateList colorStateList = this.M;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.Q) {
            return;
        }
        this.Q = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = drawable.mutate();
            this.R = drawable;
            ColorStateList colorStateList = this.P;
            if (colorStateList != null) {
                drawable.setTintList(colorStateList);
            }
        }
        this.z.setImageDrawable(drawable);
    }

    public void setIconLabelHorizontalSpacing(int i) {
        if (this.m != i) {
            this.m = i;
            e();
            requestLayout();
        }
    }

    public void setIconSize(int i) {
        ImageView imageView = this.z;
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) imageView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        imageView.setLayoutParams(layoutParams);
        e();
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.P = colorStateList;
        if (this.O == null || (drawable = this.R) == null) {
            return;
        }
        drawable.setTintList(colorStateList);
        this.R.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : getContext().getDrawable(i));
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.i = drawable;
        b();
    }

    public void setItemGravity(int i) {
        this.j0 = i;
        requestLayout();
    }

    public void setItemIconGravity(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.h0 != i) {
            this.h0 = i;
            this.i0 = 0;
            BaselineLayout baselineLayout = this.A;
            this.G = baselineLayout;
            BaselineLayout baselineLayout2 = this.D;
            LinearLayout linearLayout = this.w;
            int i8 = 8;
            if (i == 1) {
                if (baselineLayout2.getParent() == null) {
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 17;
                    linearLayout.addView(baselineLayout2, layoutParams);
                    e();
                }
                Rect rect = this.o0;
                int i9 = rect.left;
                int i10 = rect.right;
                int i11 = rect.top;
                i2 = rect.bottom;
                this.i0 = 1;
                int i12 = this.f0;
                this.G = baselineLayout2;
                i6 = i11;
                i5 = i10;
                i4 = i9;
                i3 = i12;
                i7 = 0;
            } else {
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                i7 = 8;
                i8 = 0;
            }
            baselineLayout.setVisibility(i8);
            baselineLayout2.setVisibility(i7);
            ((FrameLayout.LayoutParams) this.v.getLayoutParams()).gravity = this.j0;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
            layoutParams2.leftMargin = i4;
            layoutParams2.rightMargin = i5;
            layoutParams2.topMargin = i6;
            layoutParams2.bottomMargin = i2;
            setPadding(i3, 0, i3, 0);
            j(getWidth());
            b();
        }
    }

    public void setItemPaddingBottom(int i) {
        if (this.k != i) {
            this.k = i;
            sw0 sw0Var = this.O;
            if (sw0Var != null) {
                setChecked(sw0Var.isChecked());
            }
        }
    }

    public void setItemPaddingTop(int i) {
        if (this.j != i) {
            this.j = i;
            sw0 sw0Var = this.O;
            if (sw0Var != null) {
                setChecked(sw0Var.isChecked());
            }
        }
    }

    public void setItemPosition(int i) {
        this.H = i;
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.h = colorStateList;
        b();
    }

    public void setLabelFontScalingEnabled(boolean z) {
        this.n0 = z;
        setTextAppearanceActive(this.I);
        setTextAppearanceInactive(this.J);
        setHorizontalTextAppearanceActive(this.K);
        setHorizontalTextAppearanceInactive(this.L);
    }

    public void setLabelMaxLines(int i) {
        TextView textView = this.B;
        textView.setMaxLines(i);
        TextView textView2 = this.C;
        textView2.setMaxLines(i);
        this.E.setMaxLines(i);
        this.F.setMaxLines(i);
        if (Build.VERSION.SDK_INT > 34) {
            textView.setGravity(17);
            textView2.setGravity(17);
        } else if (i > 1) {
            textView.setEllipsize(null);
            textView2.setEllipsize(null);
            textView.setGravity(17);
            textView2.setGravity(17);
        } else {
            textView.setGravity(16);
            textView2.setGravity(16);
        }
        requestLayout();
    }

    public void setLabelVisibilityMode(int i) {
        if (this.t != i) {
            this.t = i;
            if (this.d0 && i == 2) {
                this.T = r0;
            } else {
                this.T = q0;
            }
            j(getWidth());
            sw0 sw0Var = this.O;
            if (sw0Var != null) {
                setChecked(sw0Var.isChecked());
            }
        }
    }

    public void setMeasureBottomPaddingFromLabelBaseline(boolean z) {
        this.m0 = z;
        this.A.setMeasurePaddingFromBaseline(z);
        this.B.setIncludeFontPadding(z);
        this.C.setIncludeFontPadding(z);
        this.D.setMeasurePaddingFromBaseline(z);
        this.E.setIncludeFontPadding(z);
        this.F.setIncludeFontPadding(z);
        requestLayout();
    }

    @Override // defpackage.w01
    public void setOnlyShowWhenExpanded(boolean z) {
        this.l0 = z;
        l();
    }

    public void setShifting(boolean z) {
        if (this.u != z) {
            this.u = z;
            sw0 sw0Var = this.O;
            if (sw0Var != null) {
                setChecked(sw0Var.isChecked());
            }
        }
    }

    public void setTextAppearanceActive(int i) {
        this.I = i;
        k(this.C, i);
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) {
        this.N = z;
        setTextAppearanceActive(this.I);
        setHorizontalTextAppearanceActive(this.K);
        TextView textView = this.C;
        textView.setTypeface(textView.getTypeface(), this.N ? 1 : 0);
        TextView textView2 = this.F;
        textView2.setTypeface(textView2.getTypeface(), this.N ? 1 : 0);
    }

    public void setTextAppearanceInactive(int i) {
        this.J = i;
        TextView textView = this.B;
        if (textView == null) {
            return;
        }
        h(textView, i);
        a();
        textView.setMinimumHeight(tl2.v(textView.getContext(), i));
        ColorStateList colorStateList = this.M;
        if (colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.M = colorStateList;
        if (colorStateList != null) {
            this.B.setTextColor(colorStateList);
            this.C.setTextColor(colorStateList);
            this.E.setTextColor(colorStateList);
            this.F.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.B.setText(charSequence);
        this.C.setText(charSequence);
        this.E.setText(charSequence);
        this.F.setText(charSequence);
        sw0 sw0Var = this.O;
        if (sw0Var == null || TextUtils.isEmpty(sw0Var.q)) {
            setContentDescription(charSequence);
        }
        sw0 sw0Var2 = this.O;
        if (sw0Var2 != null && !TextUtils.isEmpty(sw0Var2.r)) {
            charSequence = this.O.r;
        }
        ym0.z(this, charSequence);
    }
}
