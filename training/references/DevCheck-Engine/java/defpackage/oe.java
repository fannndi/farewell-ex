package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public abstract class oe extends FrameLayout {
    public static final ne r = new ne(0);
    public pe g;
    public final cn1 h;
    public int i;
    public final float j;
    public final float k;
    public final int l;
    public final int m;
    public ColorStateList n;
    public PorterDuff.Mode o;
    public Rect p;
    public boolean q;

    /* JADX WARN: Multi-variable type inference failed */
    public oe(Context context, AttributeSet attributeSet) {
        super(ym0.D(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, yb1.R);
        if (obtainStyledAttributes.hasValue(6)) {
            setElevation(obtainStyledAttributes.getDimensionPixelSize(6, 0));
        }
        this.i = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.h = cn1.h(context2, attributeSet, 0, 0).a();
        }
        this.j = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(tl2.o(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(ju0.f0(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.k = obtainStyledAttributes.getFloat(1, 1.0f);
        this.l = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.m = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        getPaddingEnd();
        setOnTouchListener(r);
        setFocusable(true);
        if (getBackground() == null) {
            int J = je2.J(je2.O(getContext(), md2.v(this, R.attr.colorSurface)), getBackgroundOverlayColorAlpha(), je2.O(getContext(), md2.v(this, R.attr.colorOnSurface)));
            cn1 cn1Var = this.h;
            if (cn1Var != null) {
                za0 za0Var = pe.u;
                vv0 vv0Var = new vv0(cn1Var);
                vv0Var.t(ColorStateList.valueOf(J));
                gradientDrawable = vv0Var;
            } else {
                Resources resources = getResources();
                za0 za0Var2 = pe.u;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(J);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.n;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            setBackground(gradientDrawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseTransientBottomBar(pe peVar) {
        this.g = peVar;
    }

    public float getActionTextColorAlpha() {
        return this.k;
    }

    public int getAnimationMode() {
        return this.i;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.j;
    }

    public int getMaxInlineActionWidth() {
        return this.m;
    }

    public int getMaxWidth() {
        return this.l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        WindowInsets rootWindowInsets;
        Insets mandatorySystemGestureInsets;
        int i;
        super.onAttachedToWindow();
        pe peVar = this.g;
        if (peVar != null && Build.VERSION.SDK_INT >= 29 && (rootWindowInsets = peVar.i.getRootWindowInsets()) != null) {
            mandatorySystemGestureInsets = rootWindowInsets.getMandatorySystemGestureInsets();
            i = mandatorySystemGestureInsets.bottom;
            peVar.p = i;
            peVar.e();
        }
        requestApplyInsets();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if ((r0 != null && r0.f244a.get() == r1) != false) goto L15;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDetachedFromWindow() {
        /*
            r5 = this;
            super.onDetachedFromWindow()
            pe r5 = r5.g
            if (r5 == 0) goto L3d
            gr r0 = defpackage.gr.s()
            me r1 = r5.t
            java.lang.Object r2 = r0.h
            monitor-enter(r2)
            boolean r3 = r0.v(r1)     // Catch: java.lang.Throwable -> L3a
            r4 = 1
            if (r3 != 0) goto L2b
            java.lang.Object r0 = r0.k     // Catch: java.lang.Throwable -> L3a
            ep1 r0 = (defpackage.ep1) r0     // Catch: java.lang.Throwable -> L3a
            r3 = 0
            if (r0 == 0) goto L28
            java.lang.ref.WeakReference r0 = r0.f244a     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L3a
            if (r0 != r1) goto L28
            r0 = r4
            goto L29
        L28:
            r0 = r3
        L29:
            if (r0 == 0) goto L2c
        L2b:
            r3 = r4
        L2c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L3d
            android.os.Handler r0 = defpackage.pe.x
            je r1 = new je
            r1.<init>(r5, r4)
            r0.post(r1)
            return
        L3a:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3a
            throw r5
        L3d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oe.onDetachedFromWindow():void");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        pe peVar = this.g;
        if (peVar == null || !peVar.r) {
            return;
        }
        peVar.d();
        peVar.r = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.l;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.i = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.n != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.n);
            drawable.setTintMode(this.o);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.n = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.o);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.o = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.q || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.p = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        pe peVar = this.g;
        if (peVar != null) {
            za0 za0Var = pe.u;
            peVar.e();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : r);
        super.setOnClickListener(onClickListener);
    }
}
