package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.telephony.fHMN.BFtDZYxPcpGN;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class de1 {

    /* renamed from: a, reason: collision with root package name */
    public ry1 f187a;
    public RecyclerView b;
    public final kp c;
    public final kp d;
    public cr0 e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public de1() {
        be1 be1Var = new be1(this, 0);
        be1 be1Var2 = new be1(this, 1);
        this.c = new kp(be1Var);
        this.d = new kp(be1Var2);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        Rect rect = ((ee1) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int G(View view) {
        return ((ee1) view.getLayoutParams()).f229a.c();
    }

    public static ce1 H(Context context, AttributeSet attributeSet, int i, int i2) {
        ce1 ce1Var = new ce1();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wb1.f1123a, i, i2);
        ce1Var.f121a = obtainStyledAttributes.getInt(0, 1);
        ce1Var.b = obtainStyledAttributes.getInt(10, 1);
        ce1Var.c = obtainStyledAttributes.getBoolean(9, false);
        ce1Var.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return ce1Var;
    }

    public static boolean M(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void N(View view, int i, int i2, int i3, int i4) {
        ee1 ee1Var = (ee1) view.getLayoutParams();
        Rect rect = ee1Var.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) ee1Var).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) ee1Var).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) ee1Var).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) ee1Var).bottomMargin);
    }

    public static int g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int w(boolean r4, int r5, int r6, int r7, int r8) {
        /*
            int r5 = r5 - r7
            r7 = 0
            int r5 = java.lang.Math.max(r7, r5)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L1d
            if (r8 < 0) goto L12
        L10:
            r6 = r3
            goto L30
        L12:
            if (r8 != r1) goto L1a
            if (r6 == r2) goto L22
            if (r6 == 0) goto L1a
            if (r6 == r3) goto L22
        L1a:
            r6 = r7
            r8 = r6
            goto L30
        L1d:
            if (r8 < 0) goto L20
            goto L10
        L20:
            if (r8 != r1) goto L24
        L22:
            r8 = r5
            goto L30
        L24:
            if (r8 != r0) goto L1a
            if (r6 == r2) goto L2e
            if (r6 != r3) goto L2b
            goto L2e
        L2b:
            r8 = r5
            r6 = r7
            goto L30
        L2e:
            r8 = r5
            r6 = r2
        L30:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de1.w(boolean, int, int, int, int):int");
    }

    public static int z(View view) {
        Rect rect = ((ee1) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public boolean A0() {
        return false;
    }

    public final int B() {
        RecyclerView recyclerView = this.b;
        td1 adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.c();
        }
        return 0;
    }

    public final boolean B0(View view, int i, int i2, ee1 ee1Var) {
        return (this.h && M(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) ee1Var).width) && M(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) ee1Var).height)) ? false : true;
    }

    public final int C() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public abstract void C0(RecyclerView recyclerView, int i);

    public final int D() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final void D0(cr0 cr0Var) {
        cr0 cr0Var2 = this.e;
        if (cr0Var2 != null && cr0Var != cr0Var2 && cr0Var2.e) {
            cr0Var2.i();
        }
        this.e = cr0Var;
        RecyclerView recyclerView = this.b;
        se1 se1Var = recyclerView.k0;
        se1Var.m.removeCallbacks(se1Var);
        se1Var.i.abortAnimation();
        cr0Var.b = recyclerView;
        cr0Var.c = this;
        int i = cr0Var.f151a;
        if (i == -1) {
            c.m(hTYJVDOvZnZlYL.cmwoFAxw);
            return;
        }
        recyclerView.n0.f787a = i;
        cr0Var.e = true;
        cr0Var.d = true;
        cr0Var.f = recyclerView.t.q(i);
        cr0Var.b.k0.b();
    }

    public final int E() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public boolean E0() {
        return false;
    }

    public final int F() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int I(ke1 ke1Var, pe1 pe1Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.s == null || !e()) {
            return 1;
        }
        return this.b.s.c();
    }

    public final void J(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((ee1) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.r;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean K();

    public boolean L() {
        return false;
    }

    public void O(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int e = recyclerView.l.e();
            for (int i2 = 0; i2 < e; i2++) {
                recyclerView.l.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void P(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int e = recyclerView.l.e();
            for (int i2 = 0; i2 < e; i2++) {
                recyclerView.l.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void Q() {
    }

    public void R(RecyclerView recyclerView) {
    }

    public abstract void S(RecyclerView recyclerView);

    public abstract View T(View view, int i, ke1 ke1Var, pe1 pe1Var);

    public void U(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        ke1 ke1Var = recyclerView.i;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z = true;
        if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        td1 td1Var = this.b.s;
        if (td1Var != null) {
            accessibilityEvent.setItemCount(td1Var.c());
        }
    }

    public void V(ke1 ke1Var, pe1 pe1Var, c1 c1Var) {
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            c1Var.a(rt0.y);
            c1Var.l(true);
            c1Var.g(67108864, true);
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            c1Var.a(rt0.x);
            c1Var.l(true);
            c1Var.g(67108864, true);
        }
        c1Var.f104a.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b1.a(I(ke1Var, pe1Var), x(ke1Var, pe1Var), 0).g);
    }

    public void W(ke1 ke1Var, pe1 pe1Var, View view, c1 c1Var) {
        c1Var.j(b1.b(false, e() ? G(view) : 0, 1, d() ? G(view) : 0, 1));
    }

    public final void X(View view, c1 c1Var) {
        te1 N = RecyclerView.N(view);
        if (N == null || N.i()) {
            return;
        }
        ry1 ry1Var = this.f187a;
        if (((ArrayList) ry1Var.e).contains(N.g)) {
            return;
        }
        RecyclerView recyclerView = this.b;
        W(recyclerView.i, recyclerView.n0, view, c1Var);
    }

    public void Y(int i, int i2) {
    }

    public void Z() {
    }

    public void a0(int i, int i2) {
    }

    public final void b(View view, int i, boolean z) {
        te1 N = RecyclerView.N(view);
        if (z || N.i()) {
            yo1 yo1Var = (yo1) this.b.m.h;
            g72 g72Var = (g72) yo1Var.get(N);
            if (g72Var == null) {
                g72Var = g72.a();
                yo1Var.put(N, g72Var);
            }
            g72Var.f322a |= 1;
        } else {
            this.b.m.j(N);
        }
        ee1 ee1Var = (ee1) view.getLayoutParams();
        if (N.q() || N.j()) {
            if (N.j()) {
                N.t.m(N);
            } else {
                N.p &= -33;
            }
            this.f187a.b(view, i, view.getLayoutParams(), false);
        } else {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            ry1 ry1Var = this.f187a;
            if (parent == recyclerView) {
                zp zpVar = (zp) ry1Var.d;
                int indexOfChild = ((sd1) ry1Var.c).g.indexOfChild(view);
                int b = (indexOfChild == -1 || zpVar.d(indexOfChild)) ? -1 : indexOfChild - zpVar.b(indexOfChild);
                if (i == -1) {
                    i = this.f187a.e();
                }
                if (b == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.C());
                }
                if (b != i) {
                    de1 de1Var = this.b.t;
                    View u = de1Var.u(b);
                    if (u == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + b + de1Var.b.toString());
                    }
                    de1Var.u(b);
                    de1Var.f187a.c(b);
                    ee1 ee1Var2 = (ee1) u.getLayoutParams();
                    te1 N2 = RecyclerView.N(u);
                    boolean i2 = N2.i();
                    RecyclerView recyclerView2 = de1Var.b;
                    if (i2) {
                        yo1 yo1Var2 = (yo1) recyclerView2.m.h;
                        g72 g72Var2 = (g72) yo1Var2.get(N2);
                        if (g72Var2 == null) {
                            g72Var2 = g72.a();
                            yo1Var2.put(N2, g72Var2);
                        }
                        g72Var2.f322a = 1 | g72Var2.f322a;
                    } else {
                        recyclerView2.m.j(N2);
                    }
                    de1Var.f187a.b(u, i, ee1Var2, N2.i());
                }
            } else {
                ry1Var.a(view, i, false);
                ee1Var.c = true;
                cr0 cr0Var = this.e;
                if (cr0Var != null && cr0Var.e) {
                    cr0Var.b.getClass();
                    te1 N3 = RecyclerView.N(view);
                    if ((N3 != null ? N3.c() : -1) == cr0Var.f151a) {
                        cr0Var.f = view;
                    }
                }
            }
        }
        if (ee1Var.d) {
            if (RecyclerView.J0) {
                Objects.toString(ee1Var.f229a);
            }
            N.g.invalidate();
            ee1Var.d = false;
        }
    }

    public void b0(int i, int i2) {
    }

    public void c(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public void c0(int i, int i2) {
    }

    public abstract boolean d();

    public abstract void d0(ke1 ke1Var, pe1 pe1Var);

    public abstract boolean e();

    public abstract void e0(pe1 pe1Var);

    public boolean f(ee1 ee1Var) {
        return ee1Var != null;
    }

    public void f0(Parcelable parcelable) {
    }

    public Parcelable g0() {
        return null;
    }

    public void h(int i, int i2, pe1 pe1Var, gd gdVar) {
    }

    public void h0(int i) {
    }

    public void i(int i, gd gdVar) {
    }

    public boolean i0(int i, Bundle bundle) {
        RecyclerView recyclerView = this.b;
        return j0(recyclerView.i, recyclerView.n0, i, bundle);
    }

    public abstract int j(pe1 pe1Var);

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean j0(defpackage.ke1 r8, defpackage.pe1 r9, int r10, android.os.Bundle r11) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de1.j0(ke1, pe1, int, android.os.Bundle):boolean");
    }

    public abstract int k(pe1 pe1Var);

    public final void k0(ke1 ke1Var) {
        for (int v = v() - 1; v >= 0; v--) {
            if (!RecyclerView.N(u(v)).p()) {
                n0(v, ke1Var);
            }
        }
    }

    public abstract int l(pe1 pe1Var);

    public final void l0(ke1 ke1Var) {
        ArrayList arrayList;
        int size = ke1Var.f531a.size();
        int i = size - 1;
        while (true) {
            arrayList = ke1Var.f531a;
            if (i < 0) {
                break;
            }
            View view = ((te1) arrayList.get(i)).g;
            te1 N = RecyclerView.N(view);
            if (!N.p()) {
                N.o(false);
                if (N.k()) {
                    this.b.removeDetachedView(view, false);
                }
                zd1 zd1Var = this.b.S;
                if (zd1Var != null) {
                    zd1Var.d(N);
                }
                N.o(true);
                te1 N2 = RecyclerView.N(view);
                N2.t = null;
                N2.u = false;
                N2.p &= -33;
                ke1Var.j(N2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = ke1Var.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public abstract int m(pe1 pe1Var);

    public final void m0(View view, ke1 ke1Var) {
        ry1 ry1Var = this.f187a;
        sd1 sd1Var = (sd1) ry1Var.c;
        int i = ry1Var.b;
        if (i == 1) {
            c.n("Cannot call removeView(At) within removeView(At)");
            return;
        }
        if (i == 2) {
            c.n(BFtDZYxPcpGN.hhpKeYhQclt);
            return;
        }
        try {
            ry1Var.b = 1;
            ry1Var.f = view;
            int indexOfChild = sd1Var.g.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (((zp) ry1Var.d).g(indexOfChild)) {
                    ry1Var.m(view);
                }
                sd1Var.k(indexOfChild);
            }
            ry1Var.b = 0;
            ry1Var.f = null;
            ke1Var.i(view);
        } catch (Throwable th) {
            ry1Var.b = 0;
            ry1Var.f = null;
            throw th;
        }
    }

    public abstract int n(pe1 pe1Var);

    public final void n0(int i, ke1 ke1Var) {
        View u = u(i);
        o0(i);
        ke1Var.i(u);
    }

    public abstract int o(pe1 pe1Var);

    public final void o0(int i) {
        if (u(i) != null) {
            ry1 ry1Var = this.f187a;
            sd1 sd1Var = (sd1) ry1Var.c;
            int i2 = ry1Var.b;
            if (i2 == 1) {
                c.n("Cannot call removeView(At) within removeView(At)");
                return;
            }
            if (i2 == 2) {
                c.n("Cannot call removeView(At) within removeViewIfHidden");
                return;
            }
            try {
                int g = ry1Var.g(i);
                View childAt = sd1Var.g.getChildAt(g);
                if (childAt == null) {
                    ry1Var.b = 0;
                    ry1Var.f = null;
                    return;
                }
                ry1Var.b = 1;
                ry1Var.f = childAt;
                if (((zp) ry1Var.d).g(g)) {
                    ry1Var.m(childAt);
                }
                sd1Var.k(g);
                ry1Var.b = 0;
                ry1Var.f = null;
            } catch (Throwable th) {
                ry1Var.b = 0;
                ry1Var.f = null;
                throw th;
            }
        }
    }

    public final void p(ke1 ke1Var) {
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            te1 N = RecyclerView.N(u);
            if (N.p()) {
                if (RecyclerView.J0) {
                    N.toString();
                }
            } else if (!N.g() || N.i() || this.b.s.b) {
                u(v);
                this.f187a.c(v);
                ke1Var.k(u);
                this.b.m.j(N);
            } else {
                o0(v);
                ke1Var.j(N);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean p0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.D()
            int r1 = r8.F()
            int r2 = r8.n
            int r3 = r8.E()
            int r2 = r2 - r3
            int r3 = r8.o
            int r4 = r8.C()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            androidx.recyclerview.widget.RecyclerView r3 = r8.b
            int r3 = r3.getLayoutDirection()
            r7 = 1
            if (r3 != r7) goto L5e
            if (r2 == 0) goto L59
            goto L66
        L59:
            int r2 = java.lang.Math.max(r6, r10)
            goto L66
        L5e:
            if (r6 == 0) goto L61
            goto L65
        L61:
            int r6 = java.lang.Math.min(r4, r2)
        L65:
            r2 = r6
        L66:
            if (r1 == 0) goto L69
            goto L6d
        L69:
            int r1 = java.lang.Math.min(r5, r11)
        L6d:
            int[] r10 = new int[]{r2, r1}
            r11 = r10[r0]
            r10 = r10[r7]
            if (r13 == 0) goto Lb0
            android.view.View r13 = r9.getFocusedChild()
            if (r13 != 0) goto L7e
            goto Lb5
        L7e:
            int r1 = r8.D()
            int r2 = r8.F()
            int r3 = r8.n
            int r4 = r8.E()
            int r3 = r3 - r4
            int r4 = r8.o
            int r5 = r8.C()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.b
            android.graphics.Rect r5 = r5.p
            r8.y(r5, r13)
            int r8 = r5.left
            int r8 = r8 - r11
            if (r8 >= r3) goto Lb5
            int r8 = r5.right
            int r8 = r8 - r11
            if (r8 <= r1) goto Lb5
            int r8 = r5.top
            int r8 = r8 - r10
            if (r8 >= r4) goto Lb5
            int r8 = r5.bottom
            int r8 = r8 - r10
            if (r8 > r2) goto Lb0
            goto Lb5
        Lb0:
            if (r11 != 0) goto Lb6
            if (r10 == 0) goto Lb5
            goto Lb6
        Lb5:
            return r0
        Lb6:
            if (r12 == 0) goto Lbc
            r9.scrollBy(r11, r10)
            return r7
        Lbc:
            r9.k0(r11, r10, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de1.p0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public View q(int i) {
        int v = v();
        for (int i2 = 0; i2 < v; i2++) {
            View u = u(i2);
            te1 N = RecyclerView.N(u);
            if (N != null && N.c() == i && !N.p() && (this.b.n0.g || !N.i())) {
                return u;
            }
        }
        return null;
    }

    public final void q0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract ee1 r();

    public abstract int r0(int i, ke1 ke1Var, pe1 pe1Var);

    public ee1 s(Context context, AttributeSet attributeSet) {
        return new ee1(context, attributeSet);
    }

    public abstract void s0(int i);

    public ee1 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ee1 ? new ee1((ee1) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new ee1((ViewGroup.MarginLayoutParams) layoutParams) : new ee1(layoutParams);
    }

    public abstract int t0(int i, ke1 ke1Var, pe1 pe1Var);

    public final View u(int i) {
        ry1 ry1Var = this.f187a;
        if (ry1Var != null) {
            return ry1Var.d(i);
        }
        return null;
    }

    public final void u0(RecyclerView recyclerView) {
        v0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final int v() {
        ry1 ry1Var = this.f187a;
        if (ry1Var != null) {
            return ry1Var.e();
        }
        return 0;
    }

    public final void v0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0 && !RecyclerView.M0) {
            this.n = 0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 != 0 || RecyclerView.M0) {
            return;
        }
        this.o = 0;
    }

    public void w0(Rect rect, int i, int i2) {
        int E = E() + D() + rect.width();
        int C = C() + F() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = y62.f1215a;
        this.b.setMeasuredDimension(g(i, E, recyclerView.getMinimumWidth()), g(i2, C, this.b.getMinimumHeight()));
    }

    public int x(ke1 ke1Var, pe1 pe1Var) {
        RecyclerView recyclerView = this.b;
        if (recyclerView == null || recyclerView.s == null || !d()) {
            return 1;
        }
        return this.b.s.c();
    }

    public final void x0(int i, int i2) {
        int v = v();
        if (v == 0) {
            this.b.q(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < v; i7++) {
            View u = u(i7);
            Rect rect = this.b.p;
            y(rect, u);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.b.p.set(i6, i4, i3, i5);
        w0(this.b.p, i, i2);
    }

    public void y(Rect rect, View view) {
        RecyclerView.O(rect, view);
    }

    public final void y0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.f187a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.f187a = recyclerView.l;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public final boolean z0(View view, int i, int i2, ee1 ee1Var) {
        return (!view.isLayoutRequested() && this.h && M(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) ee1Var).width) && M(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) ee1Var).height)) ? false : true;
    }
}
