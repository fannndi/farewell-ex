package defpackage;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public abstract class g82 extends ViewGroup {
    public static final int[] e0 = {R.attr.layout_gravity};
    public static final c4 f0 = new c4(18);
    public static final rd1 g0 = new rd1(2);
    public boolean A;
    public int B;
    public boolean C;
    public boolean D;
    public final int E;
    public int F;
    public final int G;
    public float H;
    public float I;
    public float J;
    public float K;
    public int L;
    public VelocityTracker M;
    public final int N;
    public final int O;
    public final int P;
    public final int Q;
    public final EdgeEffect R;
    public final EdgeEffect S;
    public boolean T;
    public boolean U;
    public int V;
    public ArrayList W;
    public u72 a0;
    public ArrayList b0;
    public final f52 c0;
    public int d0;
    public int g;
    public final ArrayList h;
    public final s72 i;
    public final Rect j;
    public w51 k;
    public int l;
    public int m;
    public Parcelable n;
    public final Scroller o;
    public boolean p;
    public az q;
    public int r;
    public Drawable s;
    public int t;
    public int u;
    public float v;
    public float w;
    public int x;
    public boolean y;
    public boolean z;

    public g82(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = new ArrayList();
        this.i = new s72();
        this.j = new Rect();
        this.m = -1;
        this.v = -3.4028235E38f;
        this.w = Float.MAX_VALUE;
        this.B = 1;
        this.L = -1;
        this.T = true;
        this.c0 = new f52(2, this);
        this.d0 = 0;
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context2 = getContext();
        this.o = new Scroller(context2, g0);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context2);
        float f = context2.getResources().getDisplayMetrics().density;
        this.G = viewConfiguration.getScaledPagingTouchSlop();
        this.N = (int) (400.0f * f);
        this.O = viewConfiguration.getScaledMaximumFlingVelocity();
        this.R = new EdgeEffect(context2);
        this.S = new EdgeEffect(context2);
        this.P = (int) (25.0f * f);
        this.Q = (int) (2.0f * f);
        this.E = (int) (f * 16.0f);
        y62.o(this, new le(9, this));
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        xi0 xi0Var = new xi0();
        xi0Var.h = this;
        xi0Var.g = new Rect();
        p62.c(this, xi0Var);
    }

    public static boolean d(int i, int i2, int i3, View view, boolean z) {
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i5 = i2 + scrollX;
                if (i5 >= childAt.getLeft() && i5 < childAt.getRight() && (i4 = i3 + scrollY) >= childAt.getTop() && i4 < childAt.getBottom() && d(i, i5 - childAt.getLeft(), i4 - childAt.getTop(), childAt, true)) {
                    break;
                }
            }
        }
        return z && view.canScrollHorizontally(-i);
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void setScrollingCacheEnabled(boolean z) {
        if (this.z != z) {
            this.z = z;
        }
    }

    public final s72 a(int i, int i2) {
        ld0 p00Var;
        s72 s72Var = new s72();
        s72Var.b = i;
        h82 h82Var = (h82) this.k;
        ae0 ae0Var = h82Var.b;
        if (h82Var.d == null) {
            ae0Var.getClass();
            h82Var.d = new yb(ae0Var);
        }
        long j = i;
        ld0 C = ae0Var.C("android:switcher:" + getId() + ":" + j);
        if (C != null) {
            yb ybVar = h82Var.d;
            ybVar.getClass();
            ybVar.b(new me0(7, C));
        } else {
            switch (i) {
                case 0:
                    p00Var = new p00();
                    break;
                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                    p00Var = new ei0();
                    break;
                case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                    p00Var = new gu1();
                    break;
                case 3:
                    p00Var = new lf();
                    break;
                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                    p00Var = new u11();
                    break;
                case 5:
                    p00Var = new w7();
                    break;
                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                    p00Var = new sn();
                    break;
                case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                    p00Var = new bm1();
                    break;
                default:
                    p00Var = new p00();
                    break;
            }
            C = p00Var;
            h82Var.d.g(getId(), C, "android:switcher:" + getId() + ":" + j, 1);
        }
        if (C != h82Var.e) {
            C.o0(false);
            if (h82Var.c == 1) {
                h82Var.d.l(C, yp0.j);
            } else {
                C.q0(false);
            }
        }
        s72Var.f920a = C;
        this.k.getClass();
        s72Var.d = 1.0f;
        ArrayList arrayList = this.h;
        if (i2 < 0 || i2 >= arrayList.size()) {
            arrayList.add(s72Var);
            return s72Var;
        }
        arrayList.add(i2, s72Var);
        return s72Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        s72 i3;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i4 = 0; i4 < getChildCount(); i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0 && (i3 = i(childAt)) != null && i3.b == this.l) {
                    childAt.addFocusables(arrayList, i, i2);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i2 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addTouchables(ArrayList arrayList) {
        s72 i;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (i = i(childAt)) != null && i.b == this.l) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateDefaultLayoutParams();
        }
        t72 t72Var = (t72) layoutParams;
        boolean z = t72Var.f969a | (view.getClass().getAnnotation(r72.class) != null);
        t72Var.f969a = z;
        if (!this.y) {
            super.addView(view, i, layoutParams);
        } else if (z) {
            c.n("Cannot add pager decor view during layout");
        } else {
            t72Var.d = true;
            addViewInLayout(view, i, layoutParams);
        }
    }

    public final void b(u72 u72Var) {
        if (this.W == null) {
            this.W = new ArrayList();
        }
        this.W.add(u72Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(int r8) {
        /*
            r7 = this;
            android.view.View r0 = r7.findFocus()
            r1 = 0
            if (r0 != r7) goto L9
        L7:
            r0 = r1
            goto L28
        L9:
            if (r0 == 0) goto L28
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r7) goto L16
            goto L28
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            android.view.ViewParent r0 = r0.getParent()
        L1f:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L7
            android.view.ViewParent r0 = r0.getParent()
            goto L1f
        L28:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r7, r0, r8)
            r2 = 1
            r3 = 0
            r4 = 66
            r5 = 17
            if (r1 == 0) goto L7b
            if (r1 == r0) goto L7b
            android.graphics.Rect r6 = r7.j
            if (r8 != r5) goto L5f
            android.graphics.Rect r4 = r7.h(r6, r1)
            int r4 = r4.left
            android.graphics.Rect r5 = r7.h(r6, r0)
            int r5 = r5.left
            if (r0 == 0) goto L59
            if (r4 < r5) goto L59
            int r0 = r7.l
            if (r0 <= 0) goto L95
            int r0 = r0 - r2
            r7.A = r3
            r7.v(r0, r3, r2, r3)
            goto L96
        L59:
            boolean r0 = r1.requestFocus()
        L5d:
            r3 = r0
            goto L97
        L5f:
            if (r8 != r4) goto L97
            android.graphics.Rect r2 = r7.h(r6, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r7.h(r6, r0)
            int r3 = r3.left
            if (r0 == 0) goto L76
            if (r2 > r3) goto L76
            boolean r0 = r7.n()
            goto L5d
        L76:
            boolean r0 = r1.requestFocus()
            goto L5d
        L7b:
            if (r8 == r5) goto L8a
            if (r8 != r2) goto L80
            goto L8a
        L80:
            if (r8 == r4) goto L85
            r0 = 2
            if (r8 != r0) goto L97
        L85:
            boolean r3 = r7.n()
            goto L97
        L8a:
            int r0 = r7.l
            if (r0 <= 0) goto L95
            int r0 = r0 - r2
            r7.A = r3
            r7.v(r0, r3, r2, r3)
            goto L96
        L95:
            r2 = r3
        L96:
            r3 = r2
        L97:
            if (r3 == 0) goto La0
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        La0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g82.c(int):boolean");
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        if (this.k == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        return i < 0 ? scrollX > ((int) (((float) clientWidth) * this.v)) : i > 0 && scrollX < ((int) (((float) clientWidth) * this.w));
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof t72) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void computeScroll() {
        this.p = true;
        Scroller scroller = this.o;
        if (scroller.isFinished() || !scroller.computeScrollOffset()) {
            e(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = scroller.getCurrX();
        int currY = scroller.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!o(currX)) {
                scroller.abortAnimation();
                scrollTo(0, currY);
            }
        }
        WeakHashMap weakHashMap = y62.f1215a;
        postInvalidateOnAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065 A[RETURN] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        /*
            r5 = this;
            boolean r0 = super.dispatchKeyEvent(r6)
            r1 = 1
            if (r0 != 0) goto L66
            int r0 = r6.getAction()
            r2 = 0
            if (r0 != 0) goto L61
            int r0 = r6.getKeyCode()
            r3 = 21
            r4 = 2
            if (r0 == r3) goto L48
            r3 = 22
            if (r0 == r3) goto L36
            r3 = 61
            if (r0 == r3) goto L20
            goto L61
        L20:
            boolean r0 = r6.hasNoModifiers()
            if (r0 == 0) goto L2b
            boolean r5 = r5.c(r4)
            goto L62
        L2b:
            boolean r6 = r6.hasModifiers(r1)
            if (r6 == 0) goto L61
            boolean r5 = r5.c(r1)
            goto L62
        L36:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L41
            boolean r5 = r5.n()
            goto L62
        L41:
            r6 = 66
            boolean r5 = r5.c(r6)
            goto L62
        L48:
            boolean r6 = r6.hasModifiers(r4)
            if (r6 == 0) goto L5a
            int r6 = r5.l
            if (r6 <= 0) goto L61
            int r6 = r6 - r1
            r5.A = r2
            r5.v(r6, r2, r1, r2)
            r5 = r1
            goto L62
        L5a:
            r6 = 17
            boolean r5 = r5.c(r6)
            goto L62
        L61:
            r5 = r2
        L62:
            if (r5 == 0) goto L65
            goto L66
        L65:
            return r2
        L66:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g82.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        s72 i;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (i = i(childAt)) != null && i.b == this.l && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r9) {
        /*
            r8 = this;
            super.draw(r9)
            int r0 = r8.getOverScrollMode()
            android.widget.EdgeEffect r1 = r8.S
            android.widget.EdgeEffect r2 = r8.R
            r3 = 0
            if (r0 == 0) goto L20
            r4 = 1
            if (r0 != r4) goto L19
            w51 r0 = r8.k
            if (r0 == 0) goto L19
            r0.getClass()
            goto L20
        L19:
            r2.finish()
            r1.finish()
            goto L96
        L20:
            boolean r0 = r2.isFinished()
            if (r0 != 0) goto L59
            int r0 = r9.save()
            int r3 = r8.getHeight()
            int r4 = r8.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r8.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r8.getWidth()
            r5 = 1132920832(0x43870000, float:270.0)
            r9.rotate(r5)
            int r5 = -r3
            int r6 = r8.getPaddingTop()
            int r6 = r6 + r5
            float r5 = (float) r6
            float r6 = r8.v
            float r7 = (float) r4
            float r6 = r6 * r7
            r9.translate(r5, r6)
            r2.setSize(r3, r4)
            boolean r3 = r2.draw(r9)
            r9.restoreToCount(r0)
        L59:
            boolean r0 = r1.isFinished()
            if (r0 != 0) goto L96
            int r0 = r9.save()
            int r2 = r8.getWidth()
            int r4 = r8.getHeight()
            int r5 = r8.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r8.getPaddingBottom()
            int r4 = r4 - r5
            r5 = 1119092736(0x42b40000, float:90.0)
            r9.rotate(r5)
            int r5 = r8.getPaddingTop()
            int r5 = -r5
            float r5 = (float) r5
            float r6 = r8.w
            r7 = 1065353216(0x3f800000, float:1.0)
            float r6 = r6 + r7
            float r6 = -r6
            float r7 = (float) r2
            float r6 = r6 * r7
            r9.translate(r5, r6)
            r1.setSize(r4, r2)
            boolean r1 = r1.draw(r9)
            r3 = r3 | r1
            r9.restoreToCount(r0)
        L96:
            if (r3 == 0) goto L9d
            java.util.WeakHashMap r9 = defpackage.y62.f1215a
            r8.postInvalidateOnAnimation()
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g82.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.s;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public final void e(boolean z) {
        boolean z2 = this.d0 == 2;
        if (z2) {
            setScrollingCacheEnabled(false);
            Scroller scroller = this.o;
            if (!scroller.isFinished()) {
                scroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = scroller.getCurrX();
                int currY = scroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        o(currX);
                    }
                }
            }
        }
        this.A = false;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i >= arrayList.size()) {
                break;
            }
            s72 s72Var = (s72) arrayList.get(i);
            if (s72Var.c) {
                s72Var.c = false;
                z2 = true;
            }
            i++;
        }
        if (z2) {
            f52 f52Var = this.c0;
            if (!z) {
                f52Var.run();
            } else {
                WeakHashMap weakHashMap = y62.f1215a;
                postOnAnimation(f52Var);
            }
        }
    }

    public final void f() {
        this.k.getClass();
        this.g = 8;
        ArrayList arrayList = this.h;
        boolean z = arrayList.size() < (this.B * 2) + 1 && arrayList.size() < 8;
        int i = this.l;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            s72 s72Var = (s72) arrayList.get(i2);
            w51 w51Var = this.k;
            ld0 ld0Var = s72Var.f920a;
            w51Var.getClass();
        }
        Collections.sort(arrayList, f0);
        if (z) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                t72 t72Var = (t72) getChildAt(i3).getLayoutParams();
                if (!t72Var.f969a) {
                    t72Var.c = 0.0f;
                }
            }
            v(i, 0, false, true);
            requestLayout();
        }
    }

    public final void g(int i) {
        u72 u72Var = this.a0;
        if (u72Var != null) {
            u72Var.b(i);
        }
        ArrayList arrayList = this.W;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                u72 u72Var2 = (u72) this.W.get(i2);
                if (u72Var2 != null) {
                    u72Var2.b(i);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        t72 t72Var = new t72(-1, -1);
        t72Var.c = 0.0f;
        return t72Var;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        t72 t72Var = new t72(context, attributeSet);
        t72Var.c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e0);
        t72Var.b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return t72Var;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    public w51 getAdapter() {
        return this.k;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        throw null;
    }

    public int getCurrentItem() {
        return this.l;
    }

    public int getOffscreenPageLimit() {
        return this.B;
    }

    public int getPageMargin() {
        return this.r;
    }

    public final Rect h(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    public final s72 i(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i >= arrayList.size()) {
                return null;
            }
            s72 s72Var = (s72) arrayList.get(i);
            w51 w51Var = this.k;
            ld0 ld0Var = s72Var.f920a;
            ((h82) w51Var).getClass();
            if (ld0Var.M == view) {
                return s72Var;
            }
            i++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.s72 j() {
        /*
            r13 = this;
            int r0 = r13.getClientWidth()
            r1 = 0
            if (r0 <= 0) goto Lf
            int r2 = r13.getScrollX()
            float r2 = (float) r2
            float r3 = (float) r0
            float r2 = r2 / r3
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r0 <= 0) goto L18
            int r3 = r13.r
            float r3 = (float) r3
            float r0 = (float) r0
            float r3 = r3 / r0
            goto L19
        L18:
            r3 = r1
        L19:
            r0 = 0
            r4 = -1
            r5 = 1
            r6 = 0
            r8 = r0
            r9 = r5
            r7 = r6
            r6 = r4
            r4 = r1
        L22:
            java.util.ArrayList r10 = r13.h
            int r11 = r10.size()
            if (r8 >= r11) goto L72
            java.lang.Object r11 = r10.get(r8)
            s72 r11 = (defpackage.s72) r11
            if (r9 != 0) goto L4c
            int r12 = r11.b
            int r6 = r6 + r5
            if (r12 == r6) goto L4c
            float r1 = r1 + r4
            float r1 = r1 + r3
            s72 r4 = r13.i
            r4.e = r1
            r4.b = r6
            w51 r1 = r13.k
            r1.getClass()
            r1 = 1065353216(0x3f800000, float:1.0)
            r4.d = r1
            int r8 = r8 + (-1)
            r6 = r4
            goto L4d
        L4c:
            r6 = r11
        L4d:
            float r1 = r6.e
            float r4 = r6.d
            float r4 = r4 + r1
            float r4 = r4 + r3
            if (r9 != 0) goto L59
            int r9 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r9 < 0) goto L72
        L59:
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L71
            int r4 = r10.size()
            int r4 = r4 - r5
            if (r8 != r4) goto L65
            goto L71
        L65:
            int r4 = r6.b
            float r7 = r6.d
            int r8 = r8 + 1
            r9 = r6
            r6 = r4
            r4 = r7
            r7 = r9
            r9 = r0
            goto L22
        L71:
            return r6
        L72:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g82.j():s72");
    }

    public final s72 k(int i) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i2 >= arrayList.size()) {
                return null;
            }
            s72 s72Var = (s72) arrayList.get(i2);
            if (s72Var.b == i) {
                return s72Var;
            }
            i2++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r14 = r11.V
            r0 = 0
            r1 = 1
            if (r14 <= 0) goto L6c
            int r14 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = r0
        L1b:
            if (r6 >= r5) goto L6c
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            t72 r8 = (defpackage.t72) r8
            boolean r9 = r8.f969a
            if (r9 != 0) goto L2c
            goto L69
        L2c:
            int r8 = r8.b
            r8 = r8 & 7
            if (r8 == r1) goto L50
            r9 = 3
            if (r8 == r9) goto L4a
            r9 = 5
            if (r8 == r9) goto L3a
            r8 = r2
            goto L5d
        L3a:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L46:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L5d
        L4a:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5d
        L50:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L46
        L5d:
            int r2 = r2 + r14
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L68
            r7.offsetLeftAndRight(r2)
        L68:
            r2 = r8
        L69:
            int r6 = r6 + 1
            goto L1b
        L6c:
            u72 r14 = r11.a0
            if (r14 == 0) goto L73
            r14.c(r12, r13)
        L73:
            java.util.ArrayList r14 = r11.W
            if (r14 == 0) goto L8d
            int r14 = r14.size()
        L7b:
            if (r0 >= r14) goto L8d
            java.util.ArrayList r2 = r11.W
            java.lang.Object r2 = r2.get(r0)
            u72 r2 = (defpackage.u72) r2
            if (r2 == 0) goto L8a
            r2.c(r12, r13)
        L8a:
            int r0 = r0 + 1
            goto L7b
        L8d:
            r11.U = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g82.l(int, float, int):void");
    }

    public final void m(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.L) {
            int i = actionIndex == 0 ? 1 : 0;
            this.H = motionEvent.getX(i);
            this.L = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.M;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean n() {
        int i;
        if (this.k == null || (i = this.l) >= 7) {
            return false;
        }
        this.A = false;
        v(i + 1, 0, true, false);
        return true;
    }

    public final boolean o(int i) {
        if (this.h.size() == 0) {
            if (!this.T) {
                this.U = false;
                l(0, 0.0f, 0);
                if (!this.U) {
                    c.n("onPageScrolled did not call superclass implementation");
                    return false;
                }
            }
            return false;
        }
        s72 j = j();
        int clientWidth = getClientWidth();
        int i2 = this.r;
        int i3 = clientWidth + i2;
        float f = clientWidth;
        int i4 = j.b;
        float f2 = ((i / f) - j.e) / (j.d + (i2 / f));
        this.U = false;
        l(i4, f2, (int) (i3 * f2));
        if (this.U) {
            return true;
        }
        c.n("onPageScrolled did not call superclass implementation");
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.T = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.c0);
        Scroller scroller = this.o;
        if (scroller != null && !scroller.isFinished()) {
            scroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        ArrayList arrayList;
        int i2;
        super.onDraw(canvas);
        if (this.r <= 0 || this.s == null) {
            return;
        }
        ArrayList arrayList2 = this.h;
        if (arrayList2.size() <= 0 || this.k == null) {
            return;
        }
        int scrollX = getScrollX();
        float width = getWidth();
        float f2 = this.r / width;
        int i3 = 0;
        s72 s72Var = (s72) arrayList2.get(0);
        float f3 = s72Var.e;
        int size = arrayList2.size();
        int i4 = s72Var.b;
        int i5 = ((s72) arrayList2.get(size - 1)).b;
        while (i4 < i5) {
            while (true) {
                i = s72Var.b;
                if (i4 <= i || i3 >= size) {
                    break;
                }
                i3++;
                s72Var = (s72) arrayList2.get(i3);
            }
            if (i4 == i) {
                float f4 = s72Var.e;
                float f5 = s72Var.d;
                f = (f4 + f5) * width;
                f3 = f4 + f5 + f2;
            } else {
                this.k.getClass();
                f = (f3 + 1.0f) * width;
                f3 = 1.0f + f2 + f3;
            }
            if (this.r + f > scrollX) {
                arrayList = arrayList2;
                i2 = scrollX;
                this.s.setBounds(Math.round(f), this.t, Math.round(this.r + f), this.u);
                this.s.draw(canvas);
            } else {
                arrayList = arrayList2;
                i2 = scrollX;
            }
            if (f > i2 + r3) {
                return;
            }
            i4++;
            arrayList2 = arrayList;
            scrollX = i2;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (action == 3 || action == 1) {
            t();
            return false;
        }
        if (action != 0) {
            if (this.C) {
                return true;
            }
            if (this.D) {
                return false;
            }
        }
        if (action == 0) {
            float x = motionEvent.getX();
            this.J = x;
            this.H = x;
            float y = motionEvent.getY();
            this.K = y;
            this.I = y;
            this.L = motionEvent.getPointerId(0);
            this.D = false;
            this.p = true;
            Scroller scroller = this.o;
            scroller.computeScrollOffset();
            if (this.d0 != 2 || Math.abs(scroller.getFinalX() - scroller.getCurrX()) <= this.Q) {
                e(false);
                this.C = false;
            } else {
                scroller.abortAnimation();
                this.A = false;
                q();
                this.C = true;
                ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                setScrollState(1);
            }
        } else if (action == 2) {
            int i = this.L;
            if (i != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i);
                float x2 = motionEvent.getX(findPointerIndex);
                float f = x2 - this.H;
                float abs = Math.abs(f);
                float y2 = motionEvent.getY(findPointerIndex);
                float abs2 = Math.abs(y2 - this.K);
                if (f != 0.0f) {
                    float f2 = this.H;
                    if ((f2 >= this.F || f <= 0.0f) && ((f2 <= getWidth() - this.F || f >= 0.0f) && d((int) f, (int) x2, (int) y2, this, false))) {
                        this.H = x2;
                        this.I = y2;
                        this.D = true;
                        return false;
                    }
                }
                int i2 = this.G;
                float f3 = i2;
                if (abs > f3 && abs * 0.5f > abs2) {
                    this.C = true;
                    ViewParent parent2 = getParent();
                    if (parent2 != null) {
                        parent2.requestDisallowInterceptTouchEvent(true);
                    }
                    setScrollState(1);
                    float f4 = this.J;
                    float f5 = i2;
                    this.H = f > 0.0f ? f4 + f5 : f4 - f5;
                    this.I = y2;
                    setScrollingCacheEnabled(true);
                } else if (abs2 > f3) {
                    this.D = true;
                }
                if (this.C && p(x2)) {
                    WeakHashMap weakHashMap = y62.f1215a;
                    postInvalidateOnAnimation();
                }
            }
        } else if (action == 6) {
            m(motionEvent);
        }
        if (this.M == null) {
            this.M = VelocityTracker.obtain();
        }
        this.M.addMovement(motionEvent);
        return this.C;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g82.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        t72 t72Var;
        t72 t72Var2;
        int i3;
        setMeasuredDimension(View.getDefaultSize(0, i), View.getDefaultSize(0, i2));
        int measuredWidth = getMeasuredWidth();
        this.F = Math.min(measuredWidth / 10, this.E);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i4 = 0;
        while (true) {
            boolean z = true;
            int i5 = 1073741824;
            if (i4 >= childCount) {
                break;
            }
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8 && (t72Var2 = (t72) childAt.getLayoutParams()) != null && t72Var2.f969a) {
                int i6 = t72Var2.b;
                int i7 = i6 & 7;
                int i8 = i6 & 112;
                boolean z2 = i8 == 48 || i8 == 80;
                if (i7 != 3 && i7 != 5) {
                    z = false;
                }
                int i9 = Integer.MIN_VALUE;
                if (z2) {
                    i3 = Integer.MIN_VALUE;
                    i9 = 1073741824;
                } else {
                    i3 = z ? 1073741824 : Integer.MIN_VALUE;
                }
                int i10 = ((ViewGroup.LayoutParams) t72Var2).width;
                if (i10 != -2) {
                    if (i10 == -1) {
                        i10 = paddingLeft;
                    }
                    i9 = 1073741824;
                } else {
                    i10 = paddingLeft;
                }
                int i11 = ((ViewGroup.LayoutParams) t72Var2).height;
                if (i11 == -2) {
                    i11 = measuredHeight;
                    i5 = i3;
                } else if (i11 == -1) {
                    i11 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10, i9), View.MeasureSpec.makeMeasureSpec(i11, i5));
                if (z2) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i4++;
        }
        View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.x = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.y = true;
        q();
        this.y = false;
        int childCount2 = getChildCount();
        for (int i12 = 0; i12 < childCount2; i12++) {
            View childAt2 = getChildAt(i12);
            if (childAt2.getVisibility() != 8 && ((t72Var = (t72) childAt2.getLayoutParams()) == null || !t72Var.f969a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * t72Var.c), 1073741824), this.x);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        int i2;
        int i3;
        int i4;
        s72 i5;
        int childCount = getChildCount();
        if ((i & 2) != 0) {
            i3 = childCount;
            i2 = 0;
            i4 = 1;
        } else {
            i2 = childCount - 1;
            i3 = -1;
            i4 = -1;
        }
        while (i2 != i3) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 0 && (i5 = i(childAt)) != null && i5.b == this.l && childAt.requestFocus(i, rect)) {
                return true;
            }
            i2 += i4;
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof v72)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v72 v72Var = (v72) parcelable;
        super.onRestoreInstanceState(v72Var.g);
        w51 w51Var = this.k;
        int i = v72Var.i;
        if (w51Var != null) {
            v(i, 0, false, true);
        } else {
            this.m = i;
            this.n = v72Var.j;
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        v72 v72Var = new v72(super.onSaveInstanceState());
        v72Var.i = this.l;
        w51 w51Var = this.k;
        if (w51Var != null) {
            w51Var.getClass();
            v72Var.j = null;
        }
        return v72Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            int i5 = this.r;
            s(i, i3, i5, i5);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || this.k == null) {
            return false;
        }
        if (this.M == null) {
            this.M = VelocityTracker.obtain();
        }
        this.M.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.o.abortAnimation();
            this.A = false;
            q();
            float x = motionEvent.getX();
            this.J = x;
            this.H = x;
            float y = motionEvent.getY();
            this.K = y;
            this.I = y;
            this.L = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action == 2) {
                if (!this.C) {
                    int findPointerIndex = motionEvent.findPointerIndex(this.L);
                    if (findPointerIndex == -1) {
                        z = t();
                    } else {
                        float x2 = motionEvent.getX(findPointerIndex);
                        float abs = Math.abs(x2 - this.H);
                        float y2 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y2 - this.I);
                        int i = this.G;
                        if (abs > i && abs > abs2) {
                            this.C = true;
                            ViewParent parent = getParent();
                            if (parent != null) {
                                parent.requestDisallowInterceptTouchEvent(true);
                            }
                            float f = this.J;
                            this.H = x2 - f > 0.0f ? f + i : f - i;
                            this.I = y2;
                            setScrollState(1);
                            setScrollingCacheEnabled(true);
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                        }
                    }
                }
                if (this.C) {
                    z = p(motionEvent.getX(motionEvent.findPointerIndex(this.L)));
                }
            } else if (action != 3) {
                if (action == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    this.H = motionEvent.getX(actionIndex);
                    this.L = motionEvent.getPointerId(actionIndex);
                } else if (action == 6) {
                    m(motionEvent);
                    this.H = motionEvent.getX(motionEvent.findPointerIndex(this.L));
                }
            } else if (this.C) {
                u(this.l, 0, true, false);
                z = t();
            }
        } else if (this.C) {
            VelocityTracker velocityTracker = this.M;
            velocityTracker.computeCurrentVelocity(1000, this.O);
            int xVelocity = (int) velocityTracker.getXVelocity(this.L);
            this.A = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            s72 j = j();
            float f2 = clientWidth;
            int i2 = j.b;
            float f3 = ((scrollX / f2) - j.e) / (j.d + (this.r / f2));
            if (Math.abs((int) (motionEvent.getX(motionEvent.findPointerIndex(this.L)) - this.J)) <= this.P || Math.abs(xVelocity) <= this.N) {
                i2 += (int) (f3 + (i2 >= this.l ? 0.4f : 0.6f));
            } else if (xVelocity <= 0) {
                i2++;
            }
            ArrayList arrayList = this.h;
            if (arrayList.size() > 0) {
                i2 = Math.max(((s72) arrayList.get(0)).b, Math.min(i2, ((s72) d51.m(arrayList, 1)).b));
            }
            v(i2, xVelocity, true, true);
            z = t();
        }
        if (z) {
            WeakHashMap weakHashMap = y62.f1215a;
            postInvalidateOnAnimation();
        }
        return true;
    }

    public final boolean p(float f) {
        boolean z;
        boolean z2;
        float f2 = this.H - f;
        this.H = f;
        float scrollX = getScrollX() + f2;
        float clientWidth = getClientWidth();
        float f3 = this.v * clientWidth;
        float f4 = this.w * clientWidth;
        ArrayList arrayList = this.h;
        boolean z3 = false;
        s72 s72Var = (s72) arrayList.get(0);
        s72 s72Var2 = (s72) d51.m(arrayList, 1);
        if (s72Var.b != 0) {
            f3 = s72Var.e * clientWidth;
            z = false;
        } else {
            z = true;
        }
        int i = s72Var2.b;
        this.k.getClass();
        if (i != 7) {
            f4 = s72Var2.e * clientWidth;
            z2 = false;
        } else {
            z2 = true;
        }
        if (scrollX < f3) {
            if (z) {
                this.R.onPull(Math.abs(f3 - scrollX) / clientWidth);
                z3 = true;
            }
            scrollX = f3;
        } else if (scrollX > f4) {
            if (z2) {
                this.S.onPull(Math.abs(scrollX - f4) / clientWidth);
                z3 = true;
            }
            scrollX = f4;
        }
        int i2 = (int) scrollX;
        this.H = (scrollX - i2) + this.H;
        scrollTo(i2, getScrollY());
        o(i2);
        return z3;
    }

    public final void q() {
        r(this.l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r11 == r12) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(int r20) {
        /*
            Method dump skipped, instructions count: 956
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g82.r(int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        if (this.y) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public final void s(int i, int i2, int i3, int i4) {
        if (i2 <= 0 || this.h.isEmpty()) {
            s72 k = k(this.l);
            int min = (int) ((k != null ? Math.min(k.e, this.w) : 0.0f) * ((i - getPaddingLeft()) - getPaddingRight()));
            if (min != getScrollX()) {
                e(false);
                scrollTo(min, getScrollY());
                return;
            }
            return;
        }
        Scroller scroller = this.o;
        if (!scroller.isFinished()) {
            scroller.setFinalX(getCurrentItem() * getClientWidth());
        } else {
            scrollTo((int) ((getScrollX() / (((i2 - getPaddingLeft()) - getPaddingRight()) + i4)) * (((i - getPaddingLeft()) - getPaddingRight()) + i3)), getScrollY());
        }
    }

    public void setAdapter(w51 w51Var) {
        ArrayList arrayList = this.h;
        w51 w51Var2 = this.k;
        if (w51Var2 != null) {
            synchronized (w51Var2) {
            }
            this.k.c(this);
            for (int i = 0; i < arrayList.size(); i++) {
                s72 s72Var = (s72) arrayList.get(i);
                w51 w51Var3 = this.k;
                int i2 = s72Var.b;
                w51Var3.a(s72Var.f920a);
            }
            this.k.b();
            arrayList.clear();
            int i3 = 0;
            while (i3 < getChildCount()) {
                if (!((t72) getChildAt(i3).getLayoutParams()).f969a) {
                    removeViewAt(i3);
                    i3--;
                }
                i3++;
            }
            this.l = 0;
            scrollTo(0, 0);
        }
        this.k = w51Var;
        this.g = 0;
        if (w51Var != null) {
            if (this.q == null) {
                this.q = new az(3, this);
            }
            synchronized (this.k) {
            }
            this.A = false;
            boolean z = this.T;
            this.T = true;
            this.k.getClass();
            this.g = 8;
            if (this.m >= 0) {
                this.k.getClass();
                v(this.m, 0, false, true);
                this.m = -1;
                this.n = null;
            } else if (z) {
                requestLayout();
            } else {
                q();
            }
        }
        ArrayList arrayList2 = this.b0;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            return;
        }
        int size = this.b0.size();
        for (int i4 = 0; i4 < size; i4++) {
            xu1 xu1Var = (xu1) this.b0.get(i4);
            TabLayout tabLayout = xu1Var.b;
            if (tabLayout.U == this) {
                tabLayout.m(w51Var, xu1Var.f1198a);
            }
        }
    }

    public void setCurrentItem(int i) {
        this.A = false;
        v(i, 0, !this.T, false);
    }

    public void setOffscreenPageLimit(int i) {
        if (i < 1) {
            i = 1;
        }
        if (i != this.B) {
            this.B = i;
            q();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(u72 u72Var) {
        this.a0 = u72Var;
    }

    public void setPageMargin(int i) {
        int i2 = this.r;
        this.r = i;
        int width = getWidth();
        s(width, width, i, i2);
        requestLayout();
    }

    public void setPageMarginDrawable(int i) {
        setPageMarginDrawable(getContext().getDrawable(i));
    }

    public void setPageMarginDrawable(Drawable drawable) {
        this.s = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setScrollState(int i) {
        if (this.d0 == i) {
            return;
        }
        this.d0 = i;
        u72 u72Var = this.a0;
        if (u72Var != null) {
            u72Var.a(i);
        }
        ArrayList arrayList = this.W;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                u72 u72Var2 = (u72) this.W.get(i2);
                if (u72Var2 != null) {
                    u72Var2.a(i);
                }
            }
        }
    }

    public final boolean t() {
        this.L = -1;
        this.C = false;
        this.D = false;
        VelocityTracker velocityTracker = this.M;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.M = null;
        }
        EdgeEffect edgeEffect = this.R;
        edgeEffect.onRelease();
        EdgeEffect edgeEffect2 = this.S;
        edgeEffect2.onRelease();
        return edgeEffect.isFinished() || edgeEffect2.isFinished();
    }

    public final void u(int i, int i2, boolean z, boolean z2) {
        int scrollX;
        int abs;
        s72 k = k(i);
        int max = k != null ? (int) (Math.max(this.v, Math.min(k.e, this.w)) * getClientWidth()) : 0;
        if (!z) {
            if (z2) {
                g(i);
            }
            e(false);
            scrollTo(max, 0);
            o(max);
            return;
        }
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
        } else {
            Scroller scroller = this.o;
            if (scroller == null || scroller.isFinished()) {
                scrollX = getScrollX();
            } else {
                scrollX = this.p ? scroller.getCurrX() : scroller.getStartX();
                scroller.abortAnimation();
                setScrollingCacheEnabled(false);
            }
            int i3 = scrollX;
            int scrollY = getScrollY();
            int i4 = max - i3;
            int i5 = 0 - scrollY;
            if (i4 == 0 && i5 == 0) {
                e(false);
                q();
                setScrollState(0);
            } else {
                setScrollingCacheEnabled(true);
                setScrollState(2);
                int clientWidth = getClientWidth();
                int i6 = clientWidth / 2;
                float f = clientWidth;
                float f2 = i6;
                float sin = (((float) Math.sin((Math.min(1.0f, (Math.abs(i4) * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
                int abs2 = Math.abs(i2);
                if (abs2 > 0) {
                    abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
                } else {
                    this.k.getClass();
                    abs = (int) (((Math.abs(i4) / ((f * 1.0f) + this.r)) + 1.0f) * 100.0f);
                }
                int min = Math.min(abs, 600);
                this.p = false;
                this.o.startScroll(i3, scrollY, i4, i5, min);
                WeakHashMap weakHashMap = y62.f1215a;
                postInvalidateOnAnimation();
            }
        }
        if (z2) {
            g(i);
        }
    }

    public final void v(int i, int i2, boolean z, boolean z2) {
        if (this.k == null) {
            setScrollingCacheEnabled(false);
            return;
        }
        ArrayList arrayList = this.h;
        if (!z2 && this.l == i && arrayList.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i < 0) {
            i = 0;
        } else {
            this.k.getClass();
            if (i >= 8) {
                this.k.getClass();
                i = 7;
            }
        }
        int i3 = this.B;
        int i4 = this.l;
        if (i > i4 + i3 || i < i4 - i3) {
            for (int i5 = 0; i5 < arrayList.size(); i5++) {
                ((s72) arrayList.get(i5)).c = true;
            }
        }
        boolean z3 = this.l != i;
        if (!this.T) {
            r(i);
            u(i, i2, z, z3);
        } else {
            this.l = i;
            if (z3) {
                g(i);
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.s;
    }
}
