package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import com.google.android.material.bottomappbar.HaCM.rQcwh;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes.dex */
public class vv0 extends Drawable implements nn1 {
    public static final Paint L;
    public static final uv0[] M;
    public PorterDuffColorFilter A;
    public int B;
    public final RectF C;
    public boolean D;
    public boolean E;
    public cn1 F;
    public wp1 G;
    public final vp1[] H;
    public float[] I;
    public float[] J;
    public p8 K;
    public final sv0 g;
    public tv0 h;
    public final ln1[] i;
    public final ln1[] j;
    public final BitSet k;
    public boolean l;
    public boolean m;
    public final Matrix n;
    public final Path o;
    public final Path p;
    public final RectF q;
    public final RectF r;
    public final Region s;
    public final Region t;
    public final Paint u;
    public final Paint v;
    public final zm1 w;
    public final sv0 x;
    public final en1 y;
    public PorterDuffColorFilter z;

    static {
        Paint paint = new Paint(1);
        L = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        M = new uv0[4];
        int i = 0;
        while (true) {
            uv0[] uv0VarArr = M;
            if (i >= uv0VarArr.length) {
                return;
            }
            uv0VarArr[i] = new uv0(i);
            i++;
        }
    }

    public vv0() {
        this(new cn1());
    }

    public vv0(an1 an1Var) {
        this(new tv0(an1Var));
    }

    public vv0(Context context, AttributeSet attributeSet, int i, int i2) {
        this(cn1.h(context, attributeSet, i, i2).a());
    }

    public vv0(cn1 cn1Var) {
        this(new tv0(cn1Var));
    }

    public vv0(tv0 tv0Var) {
        this.g = new sv0(this);
        this.i = new ln1[4];
        this.j = new ln1[4];
        this.k = new BitSet(8);
        this.n = new Matrix();
        this.o = new Path();
        this.p = new Path();
        this.q = new RectF();
        this.r = new RectF();
        this.s = new Region();
        this.t = new Region();
        Paint paint = new Paint(1);
        this.u = paint;
        Paint paint2 = new Paint(1);
        this.v = paint2;
        this.w = new zm1();
        this.y = en1.b();
        this.C = new RectF();
        this.D = true;
        this.E = true;
        this.H = new vp1[4];
        this.h = tv0Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        D();
        B(getState());
        this.x = new sv0(this);
    }

    public final void A(float f) {
        this.h.k = f;
        invalidateSelf();
    }

    public final boolean B(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.h.c == null || color2 == (colorForState2 = this.h.c.getColorForState(iArr, (color2 = (paint2 = this.u).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.h.d == null || color == (colorForState = this.h.d.getColorForState(iArr, (color = (paint = this.v).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(int[] r9, boolean r10) {
        /*
            r8 = this;
            android.graphics.RectF r0 = r8.i()
            tv0 r1 = r8.h
            an1 r1 = r1.f1010a
            boolean r1 = r1.f()
            if (r1 == 0) goto L98
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L16
            goto L98
        L16:
            wp1 r1 = r8.G
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L1e
            r1 = r3
            goto L1f
        L1e:
            r1 = r2
        L1f:
            r10 = r10 | r1
            float[] r1 = r8.I
            r4 = 4
            if (r1 != 0) goto L29
            float[] r1 = new float[r4]
            r8.I = r1
        L29:
            tv0 r1 = r8.h
            an1 r1 = r1.f1010a
            cn1 r9 = r1.b(r9)
            float[] r1 = r8.I
            int r5 = r1.length
            if (r5 > r3) goto L37
            goto L47
        L37:
            r5 = r1[r2]
            r6 = r3
        L3a:
            int r7 = r1.length
            if (r6 >= r7) goto L47
            r7 = r1[r6]
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 == 0) goto L44
            goto L53
        L44:
            int r6 = r6 + 1
            goto L3a
        L47:
            android.graphics.RectF r1 = r8.i()
            boolean r1 = r9.k(r1)
            if (r1 == 0) goto L53
            r1 = r3
            goto L54
        L53:
            r1 = r2
        L54:
            r8.E = r1
            if (r1 != 0) goto L5c
            r8.l = r3
            r8.m = r3
        L5c:
            if (r2 >= r4) goto L93
            en1 r1 = r8.y
            r1.getClass()
            if (r2 == r3) goto L74
            r1 = 2
            if (r2 == r1) goto L71
            r1 = 3
            if (r2 == r1) goto L6e
            nx r1 = r9.f
            goto L76
        L6e:
            nx r1 = r9.e
            goto L76
        L71:
            nx r1 = r9.h
            goto L76
        L74:
            nx r1 = r9.g
        L76:
            float r1 = r1.a(r0)
            if (r10 == 0) goto L80
            float[] r5 = r8.I
            r5[r2] = r1
        L80:
            vp1[] r5 = r8.H
            r6 = r5[r2]
            if (r6 == 0) goto L90
            r6.a(r1)
            if (r10 == 0) goto L90
            r1 = r5[r2]
            r1.d()
        L90:
            int r2 = r2 + 1
            goto L5c
        L93:
            if (r10 == 0) goto L98
            r8.invalidateSelf()
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vv0.C(int[], boolean):void");
    }

    public final boolean D() {
        PorterDuffColorFilter porterDuffColorFilter = this.z;
        PorterDuffColorFilter porterDuffColorFilter2 = this.A;
        tv0 tv0Var = this.h;
        this.z = d(tv0Var.f, tv0Var.g, this.u, true);
        tv0 tv0Var2 = this.h;
        this.A = d(tv0Var2.e, tv0Var2.g, this.v, false);
        this.h.getClass();
        return (Objects.equals(porterDuffColorFilter, this.z) && Objects.equals(porterDuffColorFilter2, this.A)) ? false : true;
    }

    public final void E() {
        tv0 tv0Var = this.h;
        float f = tv0Var.n + 0.0f;
        tv0Var.p = (int) Math.ceil(0.75f * f);
        this.h.q = (int) Math.ceil(f * 0.25f);
        D();
        if (n() || !q()) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        this.y.a(this.h.f1010a.d(), this.I, this.h.j, rectF, this.x, path);
        if (this.h.i != 1.0f) {
            Matrix matrix = this.n;
            matrix.reset();
            float f = this.h.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.C, true);
    }

    public final float c(RectF rectF, cn1 cn1Var, float[] fArr) {
        if (fArr == null) {
            if (cn1Var.k(rectF)) {
                return cn1Var.e.a(rectF);
            }
            return -1.0f;
        }
        if (this.E) {
            return fArr[0];
        }
        return -1.0f;
    }

    public final PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = e(colorForState);
            }
            this.B = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (!z) {
            return null;
        }
        int color = paint.getColor();
        int e = e(color);
        this.B = e;
        if (e != color) {
            return new PorterDuffColorFilter(e, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.z;
        Paint paint2 = this.u;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.h.l;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.A;
        Paint paint3 = this.v;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.h.k);
        int alpha2 = paint3.getAlpha();
        int i2 = this.h.l;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = n() || !q();
        Paint.Style style = this.h.r;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z2 = this.l;
            paint = paint2;
            Path path = this.o;
            if (z2) {
                if (z) {
                    b(i(), path);
                }
                this.l = false;
            }
            if (n()) {
                canvas.save();
                canvas.translate((int) (this.h.q * Math.sin(Math.toRadians(0.0d))), (int) (Math.cos(Math.toRadians(0.0d)) * this.h.q));
                if (this.D) {
                    Rect bounds = getBounds();
                    RectF rectF = this.C;
                    int width = (int) (rectF.width() - bounds.width());
                    int height = (int) (rectF.height() - bounds.height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException(rQcwh.PTZNitaurw + width + " extra height: " + height + " path bounds: " + rectF);
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.h.p * 2) + ((int) rectF.width()) + width, (this.h.p * 2) + ((int) rectF.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    int i3 = bounds.left;
                    int i4 = this.h.p;
                    float f = (i3 - i4) - width;
                    float f2 = (bounds.top - i4) - height;
                    canvas2.translate(-f, -f2);
                    f(canvas2);
                    canvas.drawBitmap(createBitmap, f, f2, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    f(canvas);
                    canvas.restore();
                }
            }
            g(canvas, paint, path, this.h.f1010a.d(), this.I, i());
        } else {
            paint = paint2;
        }
        if (o()) {
            if (this.m) {
                cn1 k = k();
                bn1 l = k.l();
                nx nxVar = k.e;
                sv0 sv0Var = this.g;
                l.e = sv0Var.a(nxVar);
                l.f = sv0Var.a(k.f);
                l.h = sv0Var.a(k.h);
                l.g = sv0Var.a(k.g);
                this.F = l.a();
                float[] fArr = this.I;
                if (fArr != null) {
                    if (this.J == null) {
                        this.J = new float[fArr.length];
                    }
                    float l2 = l();
                    int i5 = 0;
                    while (true) {
                        float[] fArr2 = this.I;
                        if (i5 >= fArr2.length) {
                            break;
                        }
                        this.J[i5] = Math.max(0.0f, fArr2[i5] - l2);
                        i5++;
                    }
                } else {
                    this.J = null;
                }
                if (z) {
                    cn1 cn1Var = this.F;
                    float[] fArr3 = this.J;
                    float f3 = this.h.j;
                    RectF i6 = i();
                    RectF rectF2 = this.r;
                    rectF2.set(i6);
                    float l3 = l();
                    rectF2.inset(l3, l3);
                    this.y.a(cn1Var, fArr3, f3, rectF2, null, this.p);
                }
                this.m = false;
            }
            h(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    public final int e(int i) {
        tv0 tv0Var = this.h;
        float f = tv0Var.n + 0.0f + tv0Var.m;
        o70 o70Var = tv0Var.b;
        return o70Var != null ? o70Var.a(i, f) : i;
    }

    public final void f(Canvas canvas) {
        this.k.cardinality();
        int i = this.h.q;
        Path path = this.o;
        zm1 zm1Var = this.w;
        if (i != 0) {
            canvas.drawPath(path, zm1Var.f1281a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            ln1 ln1Var = this.i[i2];
            int i3 = this.h.p;
            Matrix matrix = ln1.b;
            ln1Var.a(matrix, zm1Var, i3, canvas);
            this.j[i2].a(matrix, zm1Var, this.h.p, canvas);
        }
        if (this.D) {
            int sin = (int) (Math.sin(Math.toRadians(0.0d)) * this.h.q);
            int cos = (int) (Math.cos(Math.toRadians(0.0d)) * this.h.q);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, L);
            canvas.translate(sin, cos);
        }
    }

    public final void g(Canvas canvas, Paint paint, Path path, cn1 cn1Var, float[] fArr, RectF rectF) {
        float c = c(rectF, cn1Var, fArr);
        if (c < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = c * this.h.j;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.h.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.h;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.h.o == 2) {
            return;
        }
        RectF i = i();
        if (i.isEmpty()) {
            return;
        }
        float c = c(i, this.h.f1010a.d(), this.I);
        if (c >= 0.0f) {
            outline.setRoundRect(getBounds(), c * this.h.j);
            return;
        }
        boolean z = this.l;
        Path path = this.o;
        if (z) {
            b(i, path);
            this.l = false;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            y50.a(outline, path);
            return;
        }
        if (i2 >= 29) {
            try {
                x50.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            x50.a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.h.h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.s;
        region.set(bounds);
        RectF i = i();
        Path path = this.o;
        b(i, path);
        Region region2 = this.t;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public void h(Canvas canvas) {
        cn1 cn1Var = this.F;
        float[] fArr = this.J;
        RectF i = i();
        RectF rectF = this.r;
        rectF.set(i);
        float l = l();
        rectF.inset(l, l);
        g(canvas, this.v, this.p, cn1Var, fArr, rectF);
    }

    public final RectF i() {
        Rect bounds = getBounds();
        RectF rectF = this.q;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.l = true;
        this.m = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.h.f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.h.e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.h.d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.h.c;
        return (colorStateList4 != null && colorStateList4.isStateful()) || this.h.f1010a.f();
    }

    public final float j() {
        float[] fArr = this.I;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF i = i();
        cn1 k = k();
        en1 en1Var = this.y;
        en1Var.getClass();
        float a2 = k.e.a(i);
        cn1 k2 = k();
        en1Var.getClass();
        float a3 = k2.h.a(i) + a2;
        cn1 k3 = k();
        en1Var.getClass();
        float a4 = a3 - k3.g.a(i);
        cn1 k4 = k();
        en1Var.getClass();
        return (a4 - k4.f.a(i)) / 2.0f;
    }

    public final cn1 k() {
        return this.h.f1010a.d();
    }

    public final float l() {
        if (o()) {
            return this.v.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final float m() {
        float[] fArr = this.I;
        return fArr != null ? fArr[3] : this.h.f1010a.d().e.a(i());
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.h = new tv0(this.h);
        return this;
    }

    public final boolean n() {
        tv0 tv0Var = this.h;
        int i = tv0Var.o;
        if (i == 1 || tv0Var.p <= 0) {
            return false;
        }
        return i == 2 || !(q() || this.o.isConvex() || Build.VERSION.SDK_INT >= 29);
    }

    public final boolean o() {
        Paint.Style style = this.h.r;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.v.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.l = true;
        this.m = true;
        super.onBoundsChange(rect);
        if (!this.h.f1010a.f() || rect.isEmpty()) {
            return;
        }
        int[] state = getState();
        vp1[] vp1VarArr = this.H;
        int length = vp1VarArr.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i < length) {
                vp1 vp1Var = vp1VarArr[i];
                if (vp1Var != null && vp1Var.f) {
                    z = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        C(state, true ^ z);
    }

    @Override // android.graphics.drawable.Drawable, defpackage.qx1
    public boolean onStateChange(int[] iArr) {
        if (this.h.f1010a.f()) {
            C(iArr, false);
        }
        boolean z = B(iArr) || D();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p(Context context) {
        this.h.b = new o70(context);
        E();
    }

    public final boolean q() {
        if (this.h.f1010a.b(getState()).k(i())) {
            return this.I == null || this.E;
        }
        return false;
    }

    public final void r(wp1 wp1Var) {
        if (this.G == wp1Var) {
            return;
        }
        this.G = wp1Var;
        int i = 0;
        while (true) {
            vp1[] vp1VarArr = this.H;
            if (i >= vp1VarArr.length) {
                C(getState(), true);
                invalidateSelf();
                return;
            }
            if (vp1VarArr[i] == null) {
                vp1VarArr[i] = new vp1(this, M[i]);
            }
            vp1 vp1Var = vp1VarArr[i];
            wp1 wp1Var2 = new wp1();
            wp1Var2.a((float) wp1Var.b);
            double d = wp1Var.f1141a;
            wp1Var2.b((float) (d * d));
            vp1Var.k = wp1Var2;
            i++;
        }
    }

    public final void s(float f) {
        tv0 tv0Var = this.h;
        if (tv0Var.n != f) {
            tv0Var.n = f;
            E();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        tv0 tv0Var = this.h;
        if (tv0Var.l != i) {
            tv0Var.l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.h.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.nn1
    public final void setShapeAppearanceModel(cn1 cn1Var) {
        this.h.f1010a = cn1Var;
        this.I = null;
        this.J = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.h.f = colorStateList;
        D();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        tv0 tv0Var = this.h;
        if (tv0Var.g != mode) {
            tv0Var.g = mode;
            D();
            super.invalidateSelf();
        }
    }

    public final void t(ColorStateList colorStateList) {
        tv0 tv0Var = this.h;
        if (tv0Var.c != colorStateList) {
            tv0Var.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void u(float f) {
        tv0 tv0Var = this.h;
        if (tv0Var.j != f) {
            tv0Var.j = f;
            this.l = true;
            this.m = true;
            invalidateSelf();
        }
    }

    public final void v() {
        this.w.a(-12303292);
        this.h.getClass();
        super.invalidateSelf();
    }

    public final void w() {
        tv0 tv0Var = this.h;
        if (tv0Var.o != 2) {
            tv0Var.o = 2;
            super.invalidateSelf();
        }
    }

    public final void x(an1 an1Var) {
        if (an1Var instanceof cn1) {
            setShapeAppearanceModel((cn1) an1Var);
            return;
        }
        dr1 dr1Var = (dr1) an1Var;
        tv0 tv0Var = this.h;
        if (tv0Var.f1010a != dr1Var) {
            tv0Var.f1010a = dr1Var;
            C(getState(), true);
            invalidateSelf();
        }
    }

    public final void y(ColorStateList colorStateList) {
        tv0 tv0Var = this.h;
        if (tv0Var.d != colorStateList) {
            tv0Var.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void z(ColorStateList colorStateList) {
        this.h.e = colorStateList;
        D();
        super.invalidateSelf();
    }
}
