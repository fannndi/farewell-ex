package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.focus.FocusRingDrawable;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class mv0 {
    public static final ColorDrawable A;
    public static final double z = Math.cos(Math.toRadians(45.0d));

    /* renamed from: a, reason: collision with root package name */
    public final MaterialCardView f656a;
    public final vv0 c;
    public final vv0 d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public Drawable j;
    public Drawable k;
    public ColorStateList l;
    public ColorStateList m;
    public an1 n;
    public ColorStateList o;
    public RippleDrawable p;
    public LayerDrawable q;
    public vv0 r;
    public boolean t;
    public ValueAnimator u;
    public final TimeInterpolator v;
    public final int w;
    public final int x;
    public final Rect b = new Rect();
    public boolean s = false;
    public float y = 0.0f;

    static {
        A = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public mv0(MaterialCardView materialCardView, AttributeSet attributeSet) {
        this.e = -1.0f;
        this.f656a = materialCardView;
        TypedArray obtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, qb1.f832a, R.attr.materialCardViewStyle, R.style.CardView);
        vv0 vv0Var = new vv0(materialCardView.getContext(), attributeSet, R.attr.materialCardViewStyle, R.style.Widget_MaterialComponents_CardView);
        this.c = vv0Var;
        vv0Var.p(materialCardView.getContext());
        vv0Var.v();
        bn1 l = vv0Var.k().l();
        if (obtainStyledAttributes.hasValue(3)) {
            float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
            this.e = dimension;
            l.b(dimension);
        }
        this.d = new vv0();
        h(l.a());
        this.v = kk1.K(materialCardView.getContext(), R.attr.motionEasingLinearInterpolator, o4.f715a);
        this.w = kk1.J(materialCardView.getContext(), R.attr.motionDurationShort2, 300);
        this.x = kk1.J(materialCardView.getContext(), R.attr.motionDurationShort1, 300);
        obtainStyledAttributes.recycle();
    }

    public static float b(ym0 ym0Var, float f) {
        if (ym0Var instanceof fi1) {
            return (float) ((1.0d - z) * f);
        }
        if (ym0Var instanceof hz) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        float f = 0.0f;
        for (cn1 cn1Var : this.n.c()) {
            if (cn1Var != null) {
                ym0 ym0Var = cn1Var.f131a;
                vv0 vv0Var = this.c;
                float b = b(ym0Var, vv0Var.m());
                ym0 ym0Var2 = cn1Var.b;
                float[] fArr = vv0Var.I;
                float max = Math.max(b, b(ym0Var2, fArr != null ? fArr[0] : vv0Var.h.f1010a.d().f.a(vv0Var.i())));
                ym0 ym0Var3 = cn1Var.c;
                float[] fArr2 = vv0Var.I;
                float b2 = b(ym0Var3, fArr2 != null ? fArr2[1] : vv0Var.h.f1010a.d().g.a(vv0Var.i()));
                ym0 ym0Var4 = cn1Var.d;
                float[] fArr3 = vv0Var.I;
                f = Math.max(f, Math.max(max, Math.max(b2, b(ym0Var4, fArr3 != null ? fArr3[2] : vv0Var.h.f1010a.d().h.a(vv0Var.i())))));
            }
        }
        return f;
    }

    public final LayerDrawable c() {
        if (this.p == null) {
            this.r = new vv0(this.n);
            this.p = new RippleDrawable(this.l, null, this.r);
        }
        if (this.q == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.p, this.d, this.k});
            FocusRingDrawable.f(this.f656a.getContext(), layerDrawable, this.r);
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
            this.q = layerDrawable;
        }
        return this.q;
    }

    public final lv0 d(Drawable drawable) {
        int i;
        int i2;
        if (this.f656a.getUseCompatPadding()) {
            int ceil = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            i = (int) Math.ceil(r0.getMaxCardElevation() + (i() ? a() : 0.0f));
            i2 = ceil;
        } else {
            i = 0;
            i2 = 0;
        }
        return new lv0(drawable, i, i2, i, i2);
    }

    public final void e(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        if (this.q != null) {
            MaterialCardView materialCardView = this.f656a;
            if (materialCardView.getUseCompatPadding()) {
                i3 = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                i4 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                i3 = 0;
                i4 = 0;
            }
            int i7 = this.h;
            boolean z2 = (i7 & 8388613) == 8388613;
            int i8 = this.f;
            int i9 = z2 ? ((i - i8) - this.g) - i4 : i8;
            int i10 = (i7 & 80) == 80 ? i8 : ((i2 - i8) - this.g) - i3;
            int i11 = (i7 & 8388613) == 8388613 ? i8 : ((i - i8) - this.g) - i4;
            if ((i7 & 80) == 80) {
                i8 = ((i2 - i8) - this.g) - i3;
            }
            int i12 = i8;
            if (materialCardView.getLayoutDirection() == 1) {
                i6 = i11;
                i5 = i9;
            } else {
                i5 = i11;
                i6 = i9;
            }
            this.q.setLayerInset(2, i6, i12, i5, i10);
        }
    }

    public final void f(boolean z2, boolean z3) {
        Drawable drawable = this.k;
        if (drawable != null) {
            if (!z3) {
                drawable.setAlpha(z2 ? 255 : 0);
                this.y = z2 ? 1.0f : 0.0f;
                return;
            }
            float f = z2 ? 1.0f : 0.0f;
            float f2 = this.y;
            if (z2) {
                f2 = 1.0f - f2;
            }
            ValueAnimator valueAnimator = this.u;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.u = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.y, f);
            this.u = ofFloat;
            ofFloat.addUpdateListener(new zd(4, this));
            this.u.setInterpolator(this.v);
            this.u.setDuration((long) ((z2 ? this.w : this.x) * f2));
            this.u.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.k = mutate;
            mutate.setTintList(this.m);
            f(this.f656a.o, false);
        } else {
            this.k = A;
        }
        LayerDrawable layerDrawable = this.q;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, this.k);
        }
    }

    public final void h(an1 an1Var) {
        this.n = an1Var;
        vv0 vv0Var = this.c;
        vv0Var.x(an1Var);
        this.d.x(an1Var);
        vv0 vv0Var2 = this.r;
        if (vv0Var2 != null) {
            vv0Var2.x(an1Var);
        }
        vv0Var.D = !vv0Var.q();
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.f656a;
        return materialCardView.getPreventCornerOverlap() && this.c.q() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.f656a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.j;
        Drawable c = j() ? c() : this.d;
        this.j = c;
        if (drawable != c) {
            MaterialCardView materialCardView = this.f656a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(c);
            } else {
                materialCardView.setForeground(d(c));
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.f656a;
        float f = 0.0f;
        float a2 = ((!materialCardView.getPreventCornerOverlap() || this.c.q()) && !i()) ? 0.0f : a();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            f = (float) ((1.0d - z) * materialCardView.getCardViewRadius());
        }
        int i = (int) (a2 - f);
        Rect rect = this.b;
        materialCardView.i.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        u40 u40Var = materialCardView.k;
        if (!((CardView) u40Var.i).getUseCompatPadding()) {
            u40Var.n(0, 0, 0, 0);
            return;
        }
        ci1 ci1Var = (ci1) u40Var.h;
        float f2 = ci1Var.e;
        float f3 = ci1Var.f126a;
        int ceil = (int) Math.ceil(di1.a(f2, f3, r0.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(di1.b(f2, f3, r0.getPreventCornerOverlap()));
        u40Var.n(ceil, ceil2, ceil, ceil2);
    }

    public final void m() {
        boolean z2 = this.s;
        MaterialCardView materialCardView = this.f656a;
        if (!z2) {
            materialCardView.setBackgroundInternal(d(this.c));
        }
        materialCardView.setForeground(d(this.j));
    }
}
