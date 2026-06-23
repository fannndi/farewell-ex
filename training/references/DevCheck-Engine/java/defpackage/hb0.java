package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import flar2.devcheck.R;

/* loaded from: classes.dex */
public final class hb0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f374a;
    public final int b;
    public final ViewGroup c;
    public final xi0 d;
    public final g10 e;
    public final int f;
    public final int g;
    public final int h;
    public final View i;
    public final View j;
    public final AppCompatTextView k;
    public boolean l;
    public int m;
    public float n;
    public float o;
    public float p;
    public float q;
    public int r;
    public boolean s;
    public final eb0 t;
    public final Rect u;

    public hb0(ViewGroup viewGroup, xi0 xi0Var, Drawable drawable, Drawable drawable2, sw swVar, g10 g10Var) {
        RecyclerView recyclerView = (RecyclerView) xi0Var.g;
        this.t = new eb0(this, 0);
        this.u = new Rect();
        this.f374a = viewGroup.getResources().getDimensionPixelSize(R.dimen.afs_min_touch_target_size);
        Context context = viewGroup.getContext();
        this.b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.c = viewGroup;
        this.d = xi0Var;
        this.e = g10Var;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (intrinsicWidth < 0) {
            c.m("trackDrawable.getIntrinsicWidth() < 0");
            throw null;
        }
        this.f = intrinsicWidth;
        int intrinsicWidth2 = drawable2.getIntrinsicWidth();
        if (intrinsicWidth2 < 0) {
            c.m("thumbDrawable.getIntrinsicWidth() < 0");
            throw null;
        }
        this.g = intrinsicWidth2;
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        if (intrinsicHeight < 0) {
            c.m("thumbDrawable.getIntrinsicHeight() < 0");
            throw null;
        }
        this.h = intrinsicHeight;
        View view = new View(context);
        this.i = view;
        view.setBackground(drawable);
        View view2 = new View(context);
        this.j = view2;
        view2.setBackground(drawable2);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        this.k = appCompatTextView;
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        swVar.accept(appCompatTextView);
        ViewGroupOverlay overlay = viewGroup.getOverlay();
        overlay.add(view);
        overlay.add(view2);
        overlay.add(appCompatTextView);
        f();
        appCompatTextView.setAlpha(0.0f);
        recyclerView.i(new we1(new eb0(this, 1)));
        recyclerView.j(new fb0(1, new eb0(this, 2)));
        recyclerView.w.add(new xe1(new p8(19, this)));
    }

    public final Rect a() {
        ViewGroup viewGroup = this.c;
        int paddingLeft = viewGroup.getPaddingLeft();
        int paddingTop = viewGroup.getPaddingTop();
        int paddingRight = viewGroup.getPaddingRight();
        int paddingBottom = viewGroup.getPaddingBottom();
        Rect rect = this.u;
        rect.set(paddingLeft, paddingTop, paddingRight, paddingBottom);
        return rect;
    }

    public final int b() {
        int B;
        int f;
        xi0 xi0Var = this.d;
        RecyclerView recyclerView = (RecyclerView) xi0Var.g;
        LinearLayoutManager g = xi0Var.g();
        int i = 0;
        if (g == null || (B = g.B()) == 0) {
            B = 0;
        } else if (g instanceof GridLayoutManager) {
            B = ((B - 1) / ((GridLayoutManager) g).F) + 1;
        }
        if (B != 0 && (f = xi0Var.f()) != 0) {
            i = recyclerView.getPaddingBottom() + (B * f) + recyclerView.getPaddingTop();
        }
        return i - this.c.getHeight();
    }

    public final boolean c(float f, int i, int i2, int i3) {
        int i4 = i2 - i;
        int i5 = this.f374a;
        if (i4 < i5) {
            int i6 = i - ((i5 - i4) / 2);
            if (i6 < 0) {
                i6 = 0;
            }
            int i7 = i6 + i5;
            if (i7 > i3) {
                i6 = i3 - i5;
                if (i6 < 0) {
                    i6 = 0;
                }
            } else {
                i3 = i7;
            }
            if (f >= i6 && f < i3) {
                return true;
            }
        } else if (f >= i && f < i2) {
            return true;
        }
        return false;
    }

    public final boolean d(View view, float f, float f2) {
        ViewGroup viewGroup = this.c;
        int scrollX = viewGroup.getScrollX();
        int scrollY = viewGroup.getScrollY();
        return c(f, view.getLeft() - scrollX, view.getRight() - scrollX, viewGroup.getWidth()) && c(f2, view.getTop() - scrollY, view.getBottom() - scrollY, viewGroup.getHeight());
    }

    public final void e(View view, int i, int i2, int i3, int i4) {
        ViewGroup viewGroup = this.c;
        int scrollX = viewGroup.getScrollX();
        int scrollY = viewGroup.getScrollY();
        view.layout(i + scrollX, i2 + scrollY, scrollX + i3, scrollY + i4);
    }

    public final void f() {
        ViewGroup viewGroup = this.c;
        eb0 eb0Var = this.t;
        viewGroup.removeCallbacks(eb0Var);
        this.e.getClass();
        viewGroup.postDelayed(eb0Var, 1500L);
    }

    public final void g(int i) {
        Rect a2 = a();
        int b = (int) ((b() * pr.k(i, 0, r1)) / (((this.c.getHeight() - a2.top) - a2.bottom) - this.h));
        xi0 xi0Var = this.d;
        RecyclerView recyclerView = (RecyclerView) xi0Var.g;
        recyclerView.q0();
        int paddingTop = b - recyclerView.getPaddingTop();
        int f = xi0Var.f();
        int max = Math.max(0, paddingTop / f);
        int i2 = (f * max) - paddingTop;
        LinearLayoutManager g = xi0Var.g();
        if (g == null) {
            return;
        }
        if (g instanceof GridLayoutManager) {
            max *= ((GridLayoutManager) g).F;
        }
        int paddingTop2 = i2 - recyclerView.getPaddingTop();
        g.x = max;
        g.y = paddingTop2;
        ar0 ar0Var = g.z;
        if (ar0Var != null) {
            ar0Var.g = -1;
        }
        g.q0();
    }

    public final void h(boolean z) {
        if (this.s == z) {
            return;
        }
        this.s = z;
        ViewGroup viewGroup = this.c;
        if (z) {
            viewGroup.getParent().requestDisallowInterceptTouchEvent(true);
        }
        boolean z2 = this.s;
        View view = this.i;
        view.setPressed(z2);
        boolean z3 = this.s;
        View view2 = this.j;
        view2.setPressed(z3);
        boolean z4 = this.s;
        AppCompatTextView appCompatTextView = this.k;
        g10 g10Var = this.e;
        if (!z4) {
            f();
            if (g10Var.c) {
                g10Var.c = false;
                appCompatTextView.animate().alpha(0.0f).setDuration(200L).start();
                return;
            }
            return;
        }
        viewGroup.removeCallbacks(this.t);
        g10Var.a(view, view2);
        if (g10Var.c) {
            return;
        }
        g10Var.c = true;
        appCompatTextView.animate().alpha(1.0f).setDuration(150L).start();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            r10 = this;
            int r0 = r10.b()
            r1 = 0
            if (r0 <= 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = r1
        La:
            r10.l = r2
            if (r2 == 0) goto L79
            android.graphics.Rect r2 = r10.a()
            android.view.ViewGroup r3 = r10.c
            int r3 = r3.getHeight()
            int r4 = r2.top
            int r3 = r3 - r4
            int r2 = r2.bottom
            int r3 = r3 - r2
            int r2 = r10.h
            int r3 = r3 - r2
            long r2 = (long) r3
            xi0 r4 = r10.d
            java.lang.Object r5 = r4.g
            androidx.recyclerview.widget.RecyclerView r5 = (androidx.recyclerview.widget.RecyclerView) r5
            int r6 = r5.getChildCount()
            r7 = -1
            if (r6 != 0) goto L30
            goto L3a
        L30:
            android.view.View r6 = r5.getChildAt(r1)
            androidx.recyclerview.widget.LinearLayoutManager r8 = r4.g()
            if (r8 != 0) goto L3c
        L3a:
            r6 = r7
            goto L40
        L3c:
            int r6 = defpackage.de1.G(r6)
        L40:
            androidx.recyclerview.widget.LinearLayoutManager r8 = r4.g()
            if (r8 != 0) goto L48
            r6 = r7
            goto L51
        L48:
            boolean r9 = r8 instanceof androidx.recyclerview.widget.GridLayoutManager
            if (r9 == 0) goto L51
            androidx.recyclerview.widget.GridLayoutManager r8 = (androidx.recyclerview.widget.GridLayoutManager) r8
            int r8 = r8.F
            int r6 = r6 / r8
        L51:
            if (r6 != r7) goto L54
            goto L74
        L54:
            int r8 = r4.f()
            java.lang.Object r4 = r4.h
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            int r9 = r5.getChildCount()
            if (r9 != 0) goto L63
            goto L6c
        L63:
            android.view.View r1 = r5.getChildAt(r1)
            androidx.recyclerview.widget.RecyclerView.O(r4, r1)
            int r7 = r4.top
        L6c:
            int r1 = r5.getPaddingTop()
            int r6 = r6 * r8
            int r6 = r6 + r1
            int r1 = r6 - r7
        L74:
            long r4 = (long) r1
            long r2 = r2 * r4
            long r0 = (long) r0
            long r2 = r2 / r0
            int r1 = (int) r2
        L79:
            r10.m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hb0.i():void");
    }
}
