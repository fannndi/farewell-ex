package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.focus.FocusRingDrawable;
import flar2.devcheck.R;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class cv0 {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f155a;
    public an1 b;
    public wp1 c;
    public p8 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public PorterDuff.Mode k;
    public ColorStateList l;
    public ColorStateList m;
    public ColorStateList n;
    public vv0 o;
    public boolean s;
    public RippleDrawable u;
    public int v;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public boolean t = true;

    public cv0(MaterialButton materialButton, an1 an1Var) {
        this.f155a = materialButton;
        this.b = an1Var;
    }

    public final vv0 a(boolean z) {
        RippleDrawable rippleDrawable = this.u;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (vv0) ((LayerDrawable) ((InsetDrawable) this.u.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b(int i, int i2, int i3, int i4) {
        MaterialButton materialButton = this.f155a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i5 = this.e;
        int i6 = this.g;
        int i7 = this.f;
        int i8 = this.h;
        this.e = i;
        this.g = i2;
        this.f = i3;
        this.h = i4;
        if (!this.q) {
            c();
        }
        materialButton.setPaddingRelative((paddingStart + i) - i5, (paddingTop + i2) - i6, (paddingEnd + i3) - i7, (paddingBottom + i4) - i8);
    }

    public final void c() {
        vv0 vv0Var = new vv0(this.b);
        wp1 wp1Var = this.c;
        if (wp1Var != null) {
            vv0Var.r(wp1Var);
        }
        p8 p8Var = this.d;
        if (p8Var != null) {
            vv0Var.K = p8Var;
        }
        MaterialButton materialButton = this.f155a;
        Context context = materialButton.getContext();
        vv0Var.p(context);
        vv0Var.setTintList(this.l);
        PorterDuff.Mode mode = this.k;
        if (mode != null) {
            vv0Var.setTintMode(mode);
        }
        float f = this.j;
        ColorStateList colorStateList = this.m;
        vv0Var.A(f);
        vv0Var.y(colorStateList);
        vv0 vv0Var2 = new vv0(this.b);
        wp1 wp1Var2 = this.c;
        if (wp1Var2 != null) {
            vv0Var2.r(wp1Var2);
        }
        vv0Var2.setTint(0);
        float f2 = this.j;
        int O = this.p ? je2.O(materialButton.getContext(), md2.v(materialButton, R.attr.colorSurface)) : 0;
        vv0Var2.A(f2);
        vv0Var2.y(ColorStateList.valueOf(O));
        vv0 vv0Var3 = new vv0(this.b);
        this.o = vv0Var3;
        wp1 wp1Var3 = this.c;
        if (wp1Var3 != null) {
            vv0Var3.r(wp1Var3);
        }
        this.o.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(rt0.B(this.n), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{vv0Var2, vv0Var}), this.e, this.g, this.f, this.h), this.o);
        this.u = rippleDrawable;
        FocusRingDrawable.f(context, rippleDrawable, null);
        materialButton.setInternalBackground(this.u);
        vv0 a2 = a(false);
        if (a2 != null) {
            a2.s(this.v);
            a2.setState(materialButton.getDrawableState());
        }
        FocusRingDrawable c = FocusRingDrawable.c(materialButton.getBackground());
        if (c != null) {
            c.n = new WeakReference(a2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r3 = this;
            r0 = 0
            vv0 r0 = r3.a(r0)
            if (r0 == 0) goto L13
            an1 r1 = r3.b
            r0.x(r1)
            wp1 r1 = r3.c
            if (r1 == 0) goto L13
            r0.r(r1)
        L13:
            r0 = 1
            vv0 r0 = r3.a(r0)
            if (r0 == 0) goto L26
            an1 r1 = r3.b
            r0.x(r1)
            wp1 r1 = r3.c
            if (r1 == 0) goto L26
            r0.r(r1)
        L26:
            android.graphics.drawable.RippleDrawable r0 = r3.u
            if (r0 == 0) goto L38
            r1 = 16908334(0x102002e, float:2.3877358E-38)
            android.graphics.drawable.Drawable r0 = r0.findDrawableByLayerId(r1)
            boolean r1 = r0 instanceof defpackage.nn1
            if (r1 == 0) goto L38
            nn1 r0 = (defpackage.nn1) r0
            goto L39
        L38:
            r0 = 0
        L39:
            if (r0 == 0) goto L55
            boolean r1 = r0 instanceof defpackage.vv0
            an1 r2 = r3.b
            if (r1 == 0) goto L4e
            vv0 r0 = (defpackage.vv0) r0
            r0.x(r2)
            wp1 r3 = r3.c
            if (r3 == 0) goto L55
            r0.r(r3)
            return
        L4e:
            cn1 r3 = r2.d()
            r0.setShapeAppearanceModel(r3)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cv0.d():void");
    }

    public final void e() {
        int i = 0;
        vv0 a2 = a(false);
        vv0 a3 = a(true);
        if (a2 != null) {
            float f = this.j;
            ColorStateList colorStateList = this.m;
            a2.A(f);
            a2.y(colorStateList);
            if (a3 != null) {
                float f2 = this.j;
                if (this.p) {
                    MaterialButton materialButton = this.f155a;
                    i = je2.O(materialButton.getContext(), md2.v(materialButton, R.attr.colorSurface));
                }
                a3.A(f2);
                a3.y(ColorStateList.valueOf(i));
            }
        }
    }
}
