package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.bottomappbar.HaCM.rQcwh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import moe.shizuku.api.hYGD.yttXLrAeLjN;

/* loaded from: classes.dex */
public abstract class ka0 extends o0 {
    public static final Rect n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final pg0 o = new pg0();
    public static final ai1 p = new ai1();
    public final AccessibilityManager h;
    public final View i;
    public ja0 j;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    public ka0(View view) {
        this.i = view;
        this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.o0
    public final gm2 b(View view) {
        if (this.j == null) {
            this.j = new ja0(this);
        }
        return this.j;
    }

    @Override // defpackage.o0
    public final void d(View view, c1 c1Var) {
        this.f709a.onInitializeAccessibilityNodeInfo(view, c1Var.f104a);
        s(c1Var);
    }

    public final boolean j(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        u(i, false);
        w(i, 8);
        return true;
    }

    public final AccessibilityEvent k(int i, int i2) {
        View view = this.i;
        if (i == -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(obtain);
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i2);
        c1 q = q(i);
        obtain2.getText().add(q.f());
        AccessibilityNodeInfo accessibilityNodeInfo = q.f104a;
        obtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        obtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        obtain2.setPassword(accessibilityNodeInfo.isPassword());
        obtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        obtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (obtain2.getText().isEmpty() && obtain2.getContentDescription() == null) {
            c.o("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            return null;
        }
        obtain2.setClassName(accessibilityNodeInfo.getClassName());
        obtain2.setSource(view, i);
        obtain2.setPackageName(view.getContext().getPackageName());
        return obtain2;
    }

    public final c1 l(int i) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        c1 c1Var = new c1(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        c1Var.i(yttXLrAeLjN.gKyzSwObtDeMp);
        Rect rect = n;
        c1Var.h(rect);
        obtain.setBoundsInScreen(rect);
        View view = this.i;
        obtain.setParent(view);
        t(i, c1Var);
        if (c1Var.f() == null && obtain.getContentDescription() == null) {
            c.o("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.e;
        obtain.getBoundsInParent(rect2);
        Rect rect3 = this.d;
        obtain.getBoundsInScreen(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            c.o(rQcwh.EuGHs);
            return null;
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            c.o("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & rt0.s) != 0) {
            c.o("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        obtain.setPackageName(view.getContext().getPackageName());
        c1Var.b = i;
        obtain.setSource(view, i);
        if (this.k == i) {
            obtain.setAccessibilityFocused(true);
            c1Var.a(rt0.s);
        } else {
            obtain.setAccessibilityFocused(false);
            c1Var.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            c1Var.a(2);
        } else if (obtain.isFocusable()) {
            c1Var.a(1);
        }
        obtain.setFocused(z);
        int[] iArr = this.g;
        view.getLocationOnScreen(iArr);
        if (rect3.equals(rect)) {
            c1Var.h(rect2);
            Rect rect4 = new Rect();
            rect4.set(rect2);
            view.getLocationOnScreen(iArr);
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            obtain.setBoundsInScreen(rect4);
            obtain.getBoundsInScreen(rect3);
        }
        Rect rect5 = this.f;
        if (view.getLocalVisibleRect(rect5)) {
            rect5.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect5)) {
                obtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view2 = (View) parent;
                            if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                break;
                            }
                            parent = view2.getParent();
                        } else if (parent != null) {
                            c1Var.f104a.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return c1Var;
    }

    public final boolean m(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int n2 = n(motionEvent.getX(), motionEvent.getY());
            int i2 = this.m;
            if (i2 != n2) {
                this.m = n2;
                w(n2, rt0.s);
                w(i2, rt0.t);
            }
            if (n2 == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i = this.m) == Integer.MIN_VALUE) {
                return false;
            }
            if (i != Integer.MIN_VALUE) {
                this.m = Integer.MIN_VALUE;
                w(Integer.MIN_VALUE, rt0.s);
                w(i, rt0.t);
                return true;
            }
        }
        return true;
    }

    public abstract int n(float f, float f2);

    public abstract void o(ArrayList arrayList);

    public final boolean p(int i, Rect rect) {
        Object obj;
        c1 c1Var;
        int i2;
        Object obj2;
        c1 c1Var2;
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        op1 op1Var = new op1();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            op1Var.b(((Integer) arrayList.get(i3)).intValue(), l(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.l;
        int i5 = Integer.MIN_VALUE;
        if (i4 == Integer.MIN_VALUE) {
            c1Var = null;
        } else {
            int h = k32.h(op1Var.i, i4, op1Var.g);
            if (h < 0 || (obj = op1Var.h[h]) == c3.c) {
                obj = null;
            }
            c1Var = (c1) obj;
        }
        pg0 pg0Var = o;
        ai1 ai1Var = p;
        View view = this.i;
        int i6 = -1;
        if (i == 1 || i == 2) {
            boolean z = view.getLayoutDirection() == 1;
            ai1Var.getClass();
            int i7 = op1Var.i;
            ArrayList arrayList2 = new ArrayList(i7);
            for (int i8 = 0; i8 < i7; i8++) {
                arrayList2.add((c1) op1Var.h[i8]);
            }
            Collections.sort(arrayList2, new kc0(pg0Var, z));
            if (i == 1) {
                i2 = 0;
                int size = arrayList2.size();
                if (c1Var != null) {
                    size = arrayList2.indexOf(c1Var);
                }
                int i9 = size - 1;
                obj2 = i9 >= 0 ? arrayList2.get(i9) : null;
            } else {
                if (i != 2) {
                    c.m("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size2 = arrayList2.size();
                int lastIndexOf = (c1Var == null ? -1 : arrayList2.lastIndexOf(c1Var)) + 1;
                i2 = 0;
                obj2 = lastIndexOf < size2 ? arrayList2.get(lastIndexOf) : null;
            }
            c1Var2 = (c1) obj2;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                c.m("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i10 = this.l;
            if (i10 != Integer.MIN_VALUE) {
                q(i10).f104a.getBoundsInScreen(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = view.getWidth();
                int height = view.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        c.m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i != 130) {
                    c.m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            ai1Var.getClass();
            int i11 = op1Var.i;
            Rect rect4 = new Rect();
            c1Var2 = null;
            for (int i12 = 0; i12 < i11; i12++) {
                c1 c1Var3 = (c1) op1Var.h[i12];
                if (c1Var3 != c1Var) {
                    pg0Var.getClass();
                    c1Var3.f104a.getBoundsInScreen(rect4);
                    if (ju0.V(i, rect2, rect4)) {
                        if (ju0.V(i, rect2, rect3) && !ju0.e(i, rect2, rect4, rect3)) {
                            if (!ju0.e(i, rect2, rect3, rect4)) {
                                int Y = ju0.Y(i, rect2, rect4);
                                int c0 = ju0.c0(i, rect2, rect4);
                                int i13 = (c0 * c0) + (Y * 13 * Y);
                                int Y2 = ju0.Y(i, rect2, rect3);
                                int c02 = ju0.c0(i, rect2, rect3);
                                if (i13 >= (c02 * c02) + (Y2 * 13 * Y2)) {
                                }
                            }
                        }
                        rect3.set(rect4);
                        c1Var2 = c1Var3;
                    }
                }
            }
            i2 = 0;
        }
        c1 c1Var4 = c1Var2;
        if (c1Var4 != null) {
            int i14 = op1Var.i;
            int i15 = i2;
            while (true) {
                if (i15 >= i14) {
                    break;
                }
                if (op1Var.h[i15] == c1Var4) {
                    i6 = i15;
                    break;
                }
                i15++;
            }
            i5 = op1Var.g[i6];
        }
        return v(i5);
    }

    public final c1 q(int i) {
        if (i != -1) {
            return l(i);
        }
        View view = this.i;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
        c1 c1Var = new c1(obtain);
        WeakHashMap weakHashMap = y62.f1215a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        o(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            c.o("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c1Var.f104a.addChild(view, ((Integer) arrayList.get(i2)).intValue());
        }
        return c1Var;
    }

    public abstract boolean r(int i, int i2, Bundle bundle);

    public void s(c1 c1Var) {
    }

    public abstract void t(int i, c1 c1Var);

    public void u(int i, boolean z) {
    }

    public final boolean v(int i) {
        int i2;
        View view = this.i;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        u(i, true);
        w(i, 8);
        return true;
    }

    public final void w(int i, int i2) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, k(i, i2));
    }
}
