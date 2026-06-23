package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class cr0 {

    /* renamed from: a, reason: collision with root package name */
    public int f151a = -1;
    public RecyclerView b;
    public de1 c;
    public boolean d;
    public boolean e;
    public View f;
    public final ne1 g;
    public final LinearInterpolator h;
    public final DecelerateInterpolator i;
    public PointF j;
    public final DisplayMetrics k;
    public boolean l;
    public float m;
    public int n;
    public int o;

    public cr0(Context context) {
        ne1 ne1Var = new ne1();
        ne1Var.d = -1;
        ne1Var.f = false;
        ne1Var.f678a = 0;
        ne1Var.b = 0;
        ne1Var.c = Integer.MIN_VALUE;
        ne1Var.e = null;
        this.g = ne1Var;
        this.h = new LinearInterpolator();
        this.i = new DecelerateInterpolator();
        this.l = false;
        this.n = 0;
        this.o = 0;
        this.k = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            c.m("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            return 0;
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    public int b(View view, int i) {
        de1 de1Var = this.c;
        if (de1Var == null || !de1Var.d()) {
            return 0;
        }
        ee1 ee1Var = (ee1) view.getLayoutParams();
        return a((view.getLeft() - ((ee1) view.getLayoutParams()).b.left) - ((ViewGroup.MarginLayoutParams) ee1Var).leftMargin, view.getRight() + ((ee1) view.getLayoutParams()).b.right + ((ViewGroup.MarginLayoutParams) ee1Var).rightMargin, de1Var.D(), de1Var.n - de1Var.E(), i);
    }

    public int c(View view, int i) {
        de1 de1Var = this.c;
        if (de1Var == null || !de1Var.e()) {
            return 0;
        }
        ee1 ee1Var = (ee1) view.getLayoutParams();
        return a((view.getTop() - ((ee1) view.getLayoutParams()).b.top) - ((ViewGroup.MarginLayoutParams) ee1Var).topMargin, view.getBottom() + ((ee1) view.getLayoutParams()).b.bottom + ((ViewGroup.MarginLayoutParams) ee1Var).bottomMargin, de1Var.F(), de1Var.o - de1Var.C(), i);
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.l) {
            this.m = d(this.k);
            this.l = true;
        }
        return (int) Math.ceil(abs * this.m);
    }

    public PointF f(int i) {
        Object obj = this.c;
        if (obj instanceof oe1) {
            return ((oe1) obj).a(i);
        }
        return null;
    }

    public final void g(int i, int i2) {
        PointF f;
        RecyclerView recyclerView = this.b;
        if (this.f151a == -1 || recyclerView == null) {
            i();
        }
        if (this.d && this.f == null && this.c != null && (f = f(this.f151a)) != null) {
            float f2 = f.x;
            if (f2 != 0.0f || f.y != 0.0f) {
                recyclerView.h0((int) Math.signum(f2), (int) Math.signum(f.y), null);
            }
        }
        this.d = false;
        View view = this.f;
        ne1 ne1Var = this.g;
        if (view != null) {
            this.b.getClass();
            te1 N = RecyclerView.N(view);
            if ((N != null ? N.c() : -1) == this.f151a) {
                View view2 = this.f;
                pe1 pe1Var = recyclerView.n0;
                h(view2, ne1Var);
                ne1Var.a(recyclerView);
                i();
            } else {
                this.f = null;
            }
        }
        if (this.e) {
            pe1 pe1Var2 = recyclerView.n0;
            if (this.b.t.v() == 0) {
                i();
            } else {
                int i3 = this.n;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.n = i4;
                int i5 = this.o;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.o = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF f3 = f(this.f151a);
                    if (f3 != null) {
                        if (f3.x != 0.0f || f3.y != 0.0f) {
                            float f4 = f3.y;
                            float sqrt = (float) Math.sqrt((f4 * f4) + (r10 * r10));
                            float f5 = f3.x / sqrt;
                            f3.x = f5;
                            float f6 = f3.y / sqrt;
                            f3.y = f6;
                            this.j = f3;
                            this.n = (int) (f5 * 10000.0f);
                            this.o = (int) (f6 * 10000.0f);
                            int e = e(10000);
                            ne1Var.f678a = (int) (this.n * 1.2f);
                            ne1Var.b = (int) (this.o * 1.2f);
                            ne1Var.c = (int) (e * 1.2f);
                            ne1Var.e = this.h;
                            ne1Var.f = true;
                        }
                    }
                    ne1Var.d = this.f151a;
                    i();
                }
            }
            boolean z = ne1Var.d >= 0;
            ne1Var.a(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.k0.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(android.view.View r7, defpackage.ne1 r8) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r6.j
            r1 = 0
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r3
            goto L16
        L13:
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            int r0 = r6.b(r7, r0)
            android.graphics.PointF r5 = r6.j
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r1 = r3
            goto L2a
        L29:
            r1 = r2
        L2a:
            int r7 = r6.c(r7, r1)
            int r1 = r0 * r0
            int r2 = r7 * r7
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r1 = r6.e(r1)
            double r1 = (double) r1
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r1 = r1 / r4
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            if (r1 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            r8.f678a = r0
            r8.b = r7
            r8.c = r1
            android.view.animation.DecelerateInterpolator r6 = r6.i
            r8.e = r6
            r8.f = r3
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cr0.h(android.view.View, ne1):void");
    }

    public final void i() {
        if (this.e) {
            this.e = false;
            this.o = 0;
            this.n = 0;
            this.j = null;
            this.b.n0.f787a = -1;
            this.f = null;
            this.f151a = -1;
            this.d = false;
            de1 de1Var = this.c;
            if (de1Var.e == this) {
                de1Var.e = null;
            }
            this.c = null;
            this.b = null;
        }
    }
}
