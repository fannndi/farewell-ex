package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import com.google.android.material.focus.FocusRingDrawable;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class fq extends vv0 implements qx1, Drawable.Callback {
    public static final int[] V0 = {R.attr.state_enabled};
    public static final ShapeDrawable W0 = new ShapeDrawable(new OvalShape());
    public final rx1 A0;
    public int B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public boolean H0;
    public int I0;
    public int J0;
    public ColorFilter K0;
    public PorterDuffColorFilter L0;
    public ColorStateList M0;
    public ColorStateList N;
    public PorterDuff.Mode N0;
    public ColorStateList O;
    public int[] O0;
    public float P;
    public ColorStateList P0;
    public float Q;
    public WeakReference Q0;
    public ColorStateList R;
    public TextUtils.TruncateAt R0;
    public float S;
    public boolean S0;
    public ColorStateList T;
    public int T0;
    public CharSequence U;
    public boolean U0;
    public boolean V;
    public Drawable W;
    public ColorStateList X;
    public float Y;
    public boolean Z;
    public boolean a0;
    public Drawable b0;
    public RippleDrawable c0;
    public ColorStateList d0;
    public float e0;
    public SpannableStringBuilder f0;
    public boolean g0;
    public boolean h0;
    public Drawable i0;
    public ColorStateList j0;
    public dy0 k0;
    public dy0 l0;
    public float m0;
    public float n0;
    public float o0;
    public float p0;
    public float q0;
    public float r0;
    public float s0;
    public float t0;
    public final Context u0;
    public final Paint v0;
    public final Paint.FontMetrics w0;
    public final RectF x0;
    public final PointF y0;
    public final Path z0;

    public fq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, flar2.devcheck.R.attr.chipStyle, flar2.devcheck.R.style.Widget_MaterialComponents_Chip_Action);
        this.Q = -1.0f;
        this.v0 = new Paint(1);
        this.w0 = new Paint.FontMetrics();
        this.x0 = new RectF();
        this.y0 = new PointF();
        this.z0 = new Path();
        this.J0 = 255;
        this.N0 = PorterDuff.Mode.SRC_IN;
        this.Q0 = new WeakReference(null);
        p(context);
        this.u0 = context;
        rx1 rx1Var = new rx1(this);
        this.A0 = rx1Var;
        this.U = "";
        rx1Var.f910a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = V0;
        setState(iArr);
        d0(iArr);
        this.S0 = true;
        W0.setTint(-1);
    }

    public static boolean K(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean L(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public static void m0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void F(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.b0) {
            drawable.setTintList(this.d0);
            if (drawable.isStateful()) {
                drawable.setState(this.O0);
                return;
            }
            return;
        }
        Drawable drawable2 = this.W;
        if (drawable == drawable2 && this.Z) {
            drawable2.setTintList(this.X);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void G(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (k0() || j0()) {
            float f = this.m0 + this.n0;
            Drawable drawable = this.H0 ? this.i0 : this.W;
            float f2 = this.Y;
            if (f2 <= 0.0f && drawable != null) {
                f2 = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = rect.right - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            Drawable drawable2 = this.H0 ? this.i0 : this.W;
            float f5 = this.Y;
            if (f5 <= 0.0f && drawable2 != null) {
                f5 = (float) Math.ceil(ju0.r(this.u0, 24));
                if (drawable2.getIntrinsicHeight() <= f5) {
                    f5 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    public final float H() {
        if (!k0() && !j0()) {
            return 0.0f;
        }
        float f = this.n0;
        Drawable drawable = this.H0 ? this.i0 : this.W;
        float f2 = this.Y;
        if (f2 <= 0.0f && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.o0;
    }

    public final float I() {
        if (l0()) {
            return this.r0 + this.e0 + this.s0;
        }
        return 0.0f;
    }

    public final float J() {
        return this.U0 ? m() : this.Q;
    }

    public final void M() {
        eq eqVar = (eq) this.Q0.get();
        if (eqVar != null) {
            Chip chip = (Chip) eqVar;
            chip.c(chip.w);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean N(int[] r10, int[] r11) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fq.N(int[], int[]):boolean");
    }

    public final void O(boolean z) {
        if (this.g0 != z) {
            this.g0 = z;
            float H = H();
            if (!z && this.H0) {
                this.H0 = false;
            }
            float H2 = H();
            invalidateSelf();
            if (H != H2) {
                M();
            }
        }
    }

    public final void P(Drawable drawable) {
        if (this.i0 != drawable) {
            float H = H();
            this.i0 = drawable;
            float H2 = H();
            m0(this.i0);
            F(this.i0);
            invalidateSelf();
            if (H != H2) {
                M();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.j0 != colorStateList) {
            this.j0 = colorStateList;
            if (this.h0 && (drawable = this.i0) != null && this.g0) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void R(boolean z) {
        if (this.h0 != z) {
            boolean j0 = j0();
            this.h0 = z;
            boolean j02 = j0();
            if (j0 != j02) {
                Drawable drawable = this.i0;
                if (j02) {
                    F(drawable);
                } else {
                    m0(drawable);
                }
                invalidateSelf();
                M();
            }
        }
    }

    public final void S(float f) {
        if (this.Q != f) {
            this.Q = f;
            setShapeAppearanceModel(k().a(f));
        }
    }

    public final void T(Drawable drawable) {
        Drawable drawable2 = this.W;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float H = H();
            this.W = drawable != null ? drawable.mutate() : null;
            float H2 = H();
            m0(drawable2);
            if (k0()) {
                F(this.W);
            }
            invalidateSelf();
            if (H != H2) {
                M();
            }
        }
    }

    public final void U(float f) {
        if (this.Y != f) {
            float H = H();
            this.Y = f;
            float H2 = H();
            invalidateSelf();
            if (H != H2) {
                M();
            }
        }
    }

    public final void V(ColorStateList colorStateList) {
        this.Z = true;
        if (this.X != colorStateList) {
            this.X = colorStateList;
            if (k0()) {
                this.W.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void W(boolean z) {
        if (this.V != z) {
            boolean k0 = k0();
            this.V = z;
            boolean k02 = k0();
            if (k0 != k02) {
                Drawable drawable = this.W;
                if (k02) {
                    F(drawable);
                } else {
                    m0(drawable);
                }
                invalidateSelf();
                M();
            }
        }
    }

    public final void X(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            if (this.U0) {
                y(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Y(float f) {
        if (this.S != f) {
            this.S = f;
            this.v0.setStrokeWidth(f);
            if (this.U0) {
                A(f);
            }
            invalidateSelf();
        }
    }

    public final void Z(Drawable drawable) {
        Drawable drawable2 = this.b0;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float I = I();
            this.b0 = drawable != null ? drawable.mutate() : null;
            RippleDrawable rippleDrawable = new RippleDrawable(rt0.B(this.T), this.b0, W0);
            FocusRingDrawable.f(this.u0, rippleDrawable, null);
            this.c0 = rippleDrawable;
            float I2 = I();
            m0(drawable2);
            if (l0()) {
                F(this.b0);
            }
            invalidateSelf();
            if (I != I2) {
                M();
            }
        }
    }

    @Override // defpackage.vv0, defpackage.qx1
    public final void a() {
        M();
        invalidateSelf();
    }

    public final void a0(float f) {
        if (this.s0 != f) {
            this.s0 = f;
            invalidateSelf();
            if (l0()) {
                M();
            }
        }
    }

    public final void b0(float f) {
        if (this.e0 != f) {
            this.e0 = f;
            invalidateSelf();
            if (l0()) {
                M();
            }
        }
    }

    public final void c0(float f) {
        if (this.r0 != f) {
            this.r0 = f;
            invalidateSelf();
            if (l0()) {
                M();
            }
        }
    }

    public final boolean d0(int[] iArr) {
        if (Arrays.equals(this.O0, iArr)) {
            return false;
        }
        this.O0 = iArr;
        if (l0()) {
            return N(getState(), iArr);
        }
        return false;
    }

    @Override // defpackage.vv0, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i2;
        float f;
        int i3;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.J0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            i2 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            i2 = 0;
        }
        boolean z = this.U0;
        Paint paint = this.v0;
        RectF rectF = this.x0;
        if (!z) {
            paint.setColor(this.B0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, J(), J(), paint);
        }
        if (!this.U0) {
            paint.setColor(this.C0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.K0;
            if (colorFilter == null) {
                colorFilter = this.L0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, J(), J(), paint);
        }
        if (this.U0) {
            super.draw(canvas);
        }
        if (this.S > 0.0f && !this.U0) {
            paint.setColor(this.E0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.U0) {
                ColorFilter colorFilter2 = this.K0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.L0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.S / 2.0f;
            rectF.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.Q - (this.S / 2.0f);
            canvas2.drawRoundRect(rectF, f4, f4, paint);
        }
        paint.setColor(this.F0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.U0) {
            RectF rectF2 = new RectF(bounds);
            cn1 d = this.h.f1010a.d();
            float[] fArr = this.I;
            float f5 = this.h.j;
            sv0 sv0Var = this.x;
            en1 en1Var = this.y;
            f = 2.0f;
            Path path = this.z0;
            en1Var.a(d, fArr, f5, rectF2, sv0Var, path);
            g(canvas2, paint, path, this.h.f1010a.d(), this.I, i());
        } else {
            canvas2.drawRoundRect(rectF, J(), J(), paint);
            f = 2.0f;
        }
        if (k0()) {
            G(bounds, rectF);
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas2.translate(f6, f7);
            this.W.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.W.draw(canvas2);
            canvas2.translate(-f6, -f7);
        }
        if (j0()) {
            G(bounds, rectF);
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas2.translate(f8, f9);
            this.i0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.i0.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (this.S0 && this.U != null) {
            PointF pointF = this.y0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.U;
            rx1 rx1Var = this.A0;
            if (charSequence != null) {
                float H = H() + this.m0 + this.p0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + H;
                } else {
                    pointF.x = bounds.right - H;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = rx1Var.f910a;
                Paint.FontMetrics fontMetrics = this.w0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / f);
            }
            rectF.setEmpty();
            if (this.U != null) {
                float H2 = H() + this.m0 + this.p0;
                float I = I() + this.t0 + this.q0;
                int layoutDirection = getLayoutDirection();
                int i4 = bounds.left;
                if (layoutDirection == 0) {
                    rectF.left = i4 + H2;
                    rectF.right = bounds.right - I;
                } else {
                    rectF.left = i4 + I;
                    rectF.right = bounds.right - H2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            ox1 ox1Var = rx1Var.g;
            TextPaint textPaint2 = rx1Var.f910a;
            if (ox1Var != null) {
                textPaint2.drawableState = getState();
                rx1Var.g.d(this.u0, textPaint2, rx1Var.b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(rx1Var.a(this.U.toString())) > Math.round(rectF.width());
            if (z2) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i3 = save;
            } else {
                i3 = 0;
            }
            CharSequence charSequence2 = this.U;
            if (z2 && this.R0 != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.R0);
            }
            canvas.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i3);
            }
        }
        if (l0()) {
            rectF.setEmpty();
            if (l0()) {
                float f10 = this.t0 + this.s0;
                if (getLayoutDirection() == 0) {
                    float f11 = bounds.right - f10;
                    rectF.right = f11;
                    rectF.left = f11 - this.e0;
                } else {
                    float f12 = bounds.left + f10;
                    rectF.left = f12;
                    rectF.right = f12 + this.e0;
                }
                float exactCenterY = bounds.exactCenterY();
                float f13 = this.e0;
                float f14 = exactCenterY - (f13 / f);
                rectF.top = f14;
                rectF.bottom = f14 + f13;
            }
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.b0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.c0.setBounds(this.b0.getBounds());
            this.c0.jumpToCurrentState();
            this.c0.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (this.J0 < 255) {
            canvas2.restoreToCount(i2);
        }
    }

    public final void e0(ColorStateList colorStateList) {
        if (this.d0 != colorStateList) {
            this.d0 = colorStateList;
            if (l0()) {
                this.b0.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void f0(boolean z) {
        if (this.a0 != z) {
            boolean l0 = l0();
            this.a0 = z;
            boolean l02 = l0();
            if (l0 != l02) {
                Drawable drawable = this.b0;
                if (l02) {
                    F(drawable);
                } else {
                    m0(drawable);
                }
                invalidateSelf();
                M();
            }
        }
    }

    public final void g0(float f) {
        if (this.o0 != f) {
            float H = H();
            this.o0 = f;
            float H2 = H();
            invalidateSelf();
            if (H != H2) {
                M();
            }
        }
    }

    @Override // defpackage.vv0, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.J0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.K0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.P;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(I() + this.A0.a(this.U.toString()) + H() + this.m0 + this.p0 + this.q0 + this.t0), this.T0);
    }

    @Override // defpackage.vv0, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.vv0, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.U0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.P, this.Q);
        } else {
            outline.setRoundRect(bounds, this.Q);
            outline2 = outline;
        }
        outline2.setAlpha(this.J0 / 255.0f);
    }

    public final void h0(float f) {
        if (this.n0 != f) {
            float H = H();
            this.n0 = f;
            float H2 = H();
            invalidateSelf();
            if (H != H2) {
                M();
            }
        }
    }

    public final void i0(ColorStateList colorStateList) {
        if (this.T != colorStateList) {
            this.T = colorStateList;
            this.P0 = null;
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.vv0, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (K(this.N) || K(this.O) || K(this.R)) {
            return true;
        }
        ox1 ox1Var = this.A0.g;
        if (ox1Var == null || (colorStateList = ox1Var.k) == null || !colorStateList.isStateful()) {
            return (this.h0 && this.i0 != null && this.g0) || L(this.W) || L(this.i0) || K(this.M0);
        }
        return true;
    }

    public final boolean j0() {
        return this.h0 && this.i0 != null && this.H0;
    }

    public final boolean k0() {
        return this.V && this.W != null;
    }

    public final boolean l0() {
        return this.a0 && this.b0 != null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (k0()) {
            onLayoutDirectionChanged |= this.W.setLayoutDirection(i);
        }
        if (j0()) {
            onLayoutDirectionChanged |= this.i0.setLayoutDirection(i);
        }
        if (l0()) {
            onLayoutDirectionChanged |= this.b0.setLayoutDirection(i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (k0()) {
            onLevelChange |= this.W.setLevel(i);
        }
        if (j0()) {
            onLevelChange |= this.i0.setLevel(i);
        }
        if (l0()) {
            onLevelChange |= this.b0.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // defpackage.vv0, android.graphics.drawable.Drawable, defpackage.qx1
    public final boolean onStateChange(int[] iArr) {
        if (this.U0) {
            super.onStateChange(iArr);
        }
        return N(iArr, this.O0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.vv0, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.J0 != i) {
            this.J0 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.vv0, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.K0 != colorFilter) {
            this.K0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.vv0, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.M0 != colorStateList) {
            this.M0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.vv0, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.N0 != mode) {
            this.N0 = mode;
            ColorStateList colorStateList = this.M0;
            this.L0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (k0()) {
            visible |= this.W.setVisible(z, z2);
        }
        if (j0()) {
            visible |= this.i0.setVisible(z, z2);
        }
        if (l0()) {
            visible |= this.b0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }
}
