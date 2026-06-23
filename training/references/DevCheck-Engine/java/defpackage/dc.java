package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import flar2.devcheck.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;

/* loaded from: classes.dex */
public final class dc extends Drawable implements qx1 {
    public final WeakReference g;
    public final vv0 h;
    public final rx1 i;
    public final Rect j;
    public final fc k;
    public float l;
    public float m;
    public final int n;
    public float o;
    public float p;
    public float q;
    public WeakReference r;
    public WeakReference s;

    public dc(Context context, ec ecVar) {
        ox1 ox1Var;
        WeakReference weakReference = new WeakReference(context);
        this.g = weakReference;
        d10.e(context, d10.e, "Theme.MaterialComponents");
        this.j = new Rect();
        rx1 rx1Var = new rx1(this);
        this.i = rx1Var;
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = rx1Var.f910a;
        textPaint.setTextAlign(align);
        fc fcVar = new fc(context, ecVar);
        this.k = fcVar;
        boolean g = g();
        ec ecVar2 = fcVar.b;
        vv0 vv0Var = new vv0(cn1.g(context, g ? ecVar2.m.intValue() : ecVar2.k.intValue(), g() ? ecVar2.n.intValue() : ecVar2.l.intValue()).a());
        this.h = vv0Var;
        i();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && rx1Var.g != (ox1Var = new ox1(context2, ecVar2.j.intValue()))) {
            rx1Var.c(ox1Var, context2);
            textPaint.setColor(ecVar2.i.intValue());
            invalidateSelf();
            k();
            invalidateSelf();
        }
        int i = ecVar2.r;
        if (i != -2) {
            this.n = ((int) Math.pow(10.0d, i - 1.0d)) - 1;
        } else {
            this.n = ecVar2.s;
        }
        rx1Var.e = true;
        k();
        invalidateSelf();
        rx1Var.e = true;
        i();
        k();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(ecVar2.h.intValue());
        if (vv0Var.h.c != valueOf) {
            vv0Var.t(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(ecVar2.i.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.r;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.r.get();
            WeakReference weakReference3 = this.s;
            j(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        k();
        setVisible(ecVar2.z.booleanValue(), false);
    }

    @Override // defpackage.qx1
    public final void a() {
        invalidateSelf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.view.ViewParent] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.view.ViewParent] */
    public final void b(View view, View view2) {
        float f;
        float f2;
        View view3;
        boolean z;
        FrameLayout e = e();
        if (e == null) {
            float y = view.getY();
            f2 = view.getX();
            view3 = view.getParent();
            f = y;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            view3 = e;
        }
        while (true) {
            z = view3 instanceof View;
            if (!z || view3 == view2) {
                break;
            }
            ViewParent parent = view3.getParent();
            if (!(parent instanceof ViewGroup) || ((ViewGroup) parent).getClipChildren()) {
                break;
            }
            View view4 = view3;
            f += view4.getY();
            f2 += view4.getX();
            view3 = view3.getParent();
        }
        if (z) {
            float f3 = (this.m - this.q) + f;
            float f4 = (this.l - this.p) + f2;
            View view5 = view3;
            float height = ((this.m + this.q) - view5.getHeight()) + f;
            float width = ((this.l + this.p) - view5.getWidth()) + f2;
            if (f3 < 0.0f) {
                this.m = Math.abs(f3) + this.m;
            }
            if (f4 < 0.0f) {
                this.l = Math.abs(f4) + this.l;
            }
            if (height > 0.0f) {
                this.m -= Math.abs(height);
            }
            if (width > 0.0f) {
                this.l -= Math.abs(width);
            }
        }
    }

    public final String c() {
        fc fcVar = this.k;
        ec ecVar = fcVar.b;
        ec ecVar2 = fcVar.b;
        String str = ecVar.p;
        WeakReference weakReference = this.g;
        if (str == null) {
            if (!h()) {
                return null;
            }
            int i = this.n;
            if (i == -2 || f() <= i) {
                return NumberFormat.getInstance(ecVar2.t).format(f());
            }
            Context context = (Context) weakReference.get();
            return context == null ? "" : String.format(ecVar2.t, context.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i), "+");
        }
        int i2 = ecVar.r;
        if (i2 == -2 || str == null || str.length() <= i2) {
            return str;
        }
        Context context2 = (Context) weakReference.get();
        if (context2 == null) {
            return "";
        }
        return String.format(context2.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i2 - 1), "…");
    }

    public final CharSequence d() {
        Context context;
        if (!isVisible()) {
            return null;
        }
        fc fcVar = this.k;
        ec ecVar = fcVar.b;
        if (ecVar.p != null) {
            CharSequence charSequence = ecVar.u;
            return charSequence != null ? charSequence : fcVar.b.p;
        }
        boolean h = h();
        ec ecVar2 = fcVar.b;
        if (!h) {
            return ecVar2.v;
        }
        if (ecVar2.w == 0 || (context = (Context) this.g.get()) == null) {
            return null;
        }
        int i = this.n;
        return (i == -2 || f() <= i) ? context.getResources().getQuantityString(ecVar2.w, f(), Integer.valueOf(f())) : context.getString(ecVar2.x, Integer.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String c;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.h.draw(canvas);
        if (!g() || (c = c()) == null) {
            return;
        }
        Rect rect = new Rect();
        rx1 rx1Var = this.i;
        rx1Var.f910a.getTextBounds(c, 0, c.length(), rect);
        float exactCenterY = this.m - rect.exactCenterY();
        canvas.drawText(c, this.l, rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY), rx1Var.f910a);
    }

    public final FrameLayout e() {
        WeakReference weakReference = this.s;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int f() {
        int i = this.k.b.q;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final boolean g() {
        return this.k.b.p != null || h();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.k.b.o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.j.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.j.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public final boolean h() {
        ec ecVar = this.k.b;
        return ecVar.p == null && ecVar.q != -1;
    }

    public final void i() {
        Context context = (Context) this.g.get();
        if (context == null) {
            return;
        }
        boolean g = g();
        fc fcVar = this.k;
        this.h.setShapeAppearanceModel(cn1.g(context, g ? fcVar.b.m.intValue() : fcVar.b.k.intValue(), g() ? fcVar.b.n.intValue() : fcVar.b.l.intValue()).a());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    public final void j(View view, FrameLayout frameLayout) {
        this.r = new WeakReference(view);
        this.s = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        k();
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dc.k():void");
    }

    @Override // android.graphics.drawable.Drawable, defpackage.qx1
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        fc fcVar = this.k;
        fcVar.f275a.o = i;
        fcVar.b.o = i;
        this.i.f910a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
