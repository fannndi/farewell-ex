package defpackage;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class va2 extends db2 {
    public static boolean m;
    public static Method n;
    public static Class o;
    public static Field p;
    public static Field q;
    public final WindowInsets c;
    public mm0[] d;
    public mm0 e;
    public gb2 f;
    public mm0 g;
    public int h;
    public int i;
    public int j;
    public Rect[][] k;
    public Rect[][] l;

    public va2(gb2 gb2Var, WindowInsets windowInsets) {
        super(gb2Var);
        this.e = null;
        this.k = new Rect[10][];
        this.l = new Rect[10][];
        this.c = windowInsets;
    }

    private l50 A(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f184a.f329a.s()) {
            return l50.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        ei1 y = k32.y(display, 0);
        ei1 y2 = k32.y(display, 1);
        ei1 y3 = k32.y(display, 2);
        ei1 y4 = k32.y(display, 3);
        return l50.a(point.x, point.y, false, y != null ? y.b : 0, y2 != null ? y2.b : 0, y3 != null ? y3.b : 0, y4 != null ? y4.b : 0);
    }

    public static List<Rect> B(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[d10.F(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] C(mm0 mm0Var) {
        ArrayList arrayList = new ArrayList();
        int i = mm0Var.f643a;
        int i2 = mm0Var.d;
        int i3 = mm0Var.c;
        int i4 = mm0Var.b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, mm0Var.f643a, this.i));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.j, i4));
        }
        if (i3 != 0) {
            int i5 = this.j;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.i));
        }
        if (i2 != 0) {
            int i6 = this.i;
            arrayList.add(new Rect(0, i6 - i2, this.j, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    private mm0 D(int i, boolean z) {
        mm0 mm0Var = mm0.e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                mm0Var = mm0.a(mm0Var, E(i2, z));
            }
        }
        return mm0Var;
    }

    private mm0 F() {
        gb2 gb2Var = this.f;
        return gb2Var != null ? gb2Var.f329a.k() : mm0.e;
    }

    private mm0 G(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            rw.l("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!m) {
            H();
        }
        Method method = n;
        if (method != null && o != null && p != null) {
            try {
                Object invoke = method.invoke(view, null);
                if (invoke == null) {
                    return null;
                }
                Rect rect = (Rect) p.get(q.get(invoke));
                if (rect != null) {
                    return mm0.c(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                e.getMessage();
            }
        }
        return null;
    }

    public static void H() {
        try {
            n = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            o = cls;
            p = cls.getDeclaredField("mVisibleInsets");
            q = Class.forName("android.view.ViewRootImpl").getDeclaredField(ILBLnlCHDVqsSN.cENMp);
            p.setAccessible(true);
            q.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        m = true;
    }

    public static boolean J(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    public mm0 E(int i, boolean z) {
        mm0 k;
        int i2;
        mm0 mm0Var = mm0.e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    mm0[] mm0VarArr = this.d;
                    k = mm0VarArr != null ? mm0VarArr[d10.F(8)] : null;
                    if (k != null) {
                        return k;
                    }
                    mm0 m2 = m();
                    mm0 F = F();
                    int i3 = m2.d;
                    if (i3 > F.d) {
                        return mm0.c(0, 0, 0, i3);
                    }
                    mm0 mm0Var2 = this.g;
                    if (mm0Var2 != null && !mm0Var2.equals(mm0Var) && (i2 = this.g.d) > F.d) {
                        return mm0.c(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return l();
                    }
                    if (i == 32) {
                        return j();
                    }
                    if (i == 64) {
                        return n();
                    }
                    if (i == 128) {
                        gb2 gb2Var = this.f;
                        f50 g = gb2Var != null ? gb2Var.f329a.g() : g();
                        if (g != null) {
                            int i4 = Build.VERSION.SDK_INT;
                            return mm0.c(i4 >= 28 ? r4.l(g.f262a) : 0, i4 >= 28 ? r4.n(g.f262a) : 0, i4 >= 28 ? r4.m(g.f262a) : 0, i4 >= 28 ? r4.k(g.f262a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    mm0 F2 = F();
                    mm0 k2 = k();
                    return mm0.c(Math.max(F2.f643a, k2.f643a), 0, Math.max(F2.c, k2.c), Math.max(F2.d, k2.d));
                }
                if ((this.h & 2) == 0) {
                    mm0 m3 = m();
                    gb2 gb2Var2 = this.f;
                    k = gb2Var2 != null ? gb2Var2.f329a.k() : null;
                    int i5 = m3.d;
                    if (k != null) {
                        i5 = Math.min(i5, k.d);
                    }
                    return mm0.c(m3.f643a, 0, m3.c, i5);
                }
            }
        } else {
            if (z) {
                return mm0.c(0, Math.max(F().b, m().b), 0, 0);
            }
            if ((this.h & 4) == 0) {
                return mm0.c(0, m().b, 0, 0);
            }
        }
        return mm0Var;
    }

    public void I(mm0 mm0Var) {
        this.g = mm0Var;
    }

    @Override // defpackage.db2
    public void d(View view) {
        this.j = view.getWidth();
        this.i = view.getHeight();
        mm0 G = G(view);
        if (G == null) {
            G = mm0.e;
        }
        I(G);
    }

    @Override // defpackage.db2
    public List<Rect> e(int i) {
        return B(this.k, i);
    }

    @Override // defpackage.db2
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        va2 va2Var = (va2) obj;
        return Objects.equals(this.g, va2Var.g) && J(this.h, va2Var.h);
    }

    @Override // defpackage.db2
    public List<Rect> f(int i) {
        return B(this.l, i);
    }

    @Override // defpackage.db2
    public mm0 h(int i) {
        return D(i, false);
    }

    @Override // defpackage.db2
    public mm0 i(int i) {
        return D(i, true);
    }

    @Override // defpackage.db2
    public final mm0 m() {
        if (this.e == null) {
            WindowInsets windowInsets = this.c;
            this.e = mm0.c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.e;
    }

    @Override // defpackage.db2
    public void o(View view) {
        A(view);
    }

    @Override // defpackage.db2
    public void p() {
        for (int i = 1; i <= 512; i <<= 1) {
            int F = d10.F(i);
            this.k[F] = C(h(i));
            if (i != 8) {
                this.l[F] = C(i(i));
            }
        }
    }

    @Override // defpackage.db2
    public gb2 q(int i, int i2, int i3, int i4) {
        gb2 h = gb2.h(null, this.c);
        int i5 = Build.VERSION.SDK_INT;
        ua2 ta2Var = i5 >= 36 ? new ta2(h) : i5 >= 35 ? new sa2(h) : i5 >= 34 ? new ra2(h) : i5 >= 31 ? new qa2(h) : i5 >= 30 ? new pa2(h) : i5 >= 29 ? new oa2(h) : new na2(h);
        ta2Var.h(gb2.e(m(), i, i2, i3, i4));
        ta2Var.f(gb2.e(k(), i, i2, i3, i4));
        return ta2Var.b();
    }

    @Override // defpackage.db2
    public boolean s() {
        return this.c.isRound();
    }

    @Override // defpackage.db2
    public void t(l50 l50Var) {
    }

    @Override // defpackage.db2
    public void u(mm0[] mm0VarArr) {
        this.d = mm0VarArr;
    }

    @Override // defpackage.db2
    public void v(gb2 gb2Var) {
        this.f = gb2Var;
    }

    @Override // defpackage.db2
    public void x(int i) {
        this.h = i;
    }

    @Override // defpackage.db2
    public void y(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.k = (Rect[][]) rectArr.clone();
    }

    @Override // defpackage.db2
    public void z(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.l = (Rect[][]) rectArr.clone();
    }
}
