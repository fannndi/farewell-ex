package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class w2 {

    /* renamed from: a, reason: collision with root package name */
    public int f1107a;
    public final Object b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;

    public w2(View view) {
        this.f1107a = -1;
        this.b = view;
        this.c = e6.a();
    }

    public w2(sd1 sd1Var) {
        this.b = new f81(30);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.f1107a = 0;
        this.e = sd1Var;
        this.f = new h70(this);
    }

    public void a() {
        View view = (View) this.b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((wu) this.d) != null) {
                if (((wu) this.f) == null) {
                    this.f = new wu();
                }
                wu wuVar = (wu) this.f;
                wuVar.c = null;
                wuVar.b = false;
                wuVar.d = null;
                wuVar.f1148a = false;
                WeakHashMap weakHashMap = y62.f1215a;
                ColorStateList backgroundTintList = view.getBackgroundTintList();
                if (backgroundTintList != null) {
                    wuVar.b = true;
                    wuVar.c = backgroundTintList;
                }
                PorterDuff.Mode backgroundTintMode = view.getBackgroundTintMode();
                if (backgroundTintMode != null) {
                    wuVar.f1148a = true;
                    wuVar.d = backgroundTintMode;
                }
                if (wuVar.b || wuVar.f1148a) {
                    e6.e(background, wuVar, view.getDrawableState());
                    return;
                }
            }
            wu wuVar2 = (wu) this.e;
            if (wuVar2 != null) {
                e6.e(background, wuVar2, view.getDrawableState());
                return;
            }
            wu wuVar3 = (wu) this.d;
            if (wuVar3 != null) {
                e6.e(background, wuVar3, view.getDrawableState());
            }
        }
    }

    public boolean b(int i) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            v2 v2Var = (v2) arrayList.get(i2);
            int i3 = v2Var.f1066a;
            if (i3 != 8) {
                if (i3 == 1) {
                    int i4 = v2Var.b;
                    int i5 = v2Var.d + i4;
                    while (i4 < i5) {
                        if (g(i4, i2 + 1) == i) {
                            return true;
                        }
                        i4++;
                    }
                } else {
                    continue;
                }
            } else {
                if (g(v2Var.d, i2 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((sd1) this.e).a((v2) arrayList.get(i));
        }
        q(arrayList);
        this.f1107a = 0;
    }

    public void d() {
        sd1 sd1Var = (sd1) this.e;
        c();
        ArrayList arrayList = (ArrayList) this.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v2 v2Var = (v2) arrayList.get(i);
            int i2 = v2Var.f1066a;
            if (i2 == 1) {
                sd1Var.a(v2Var);
                sd1Var.d(v2Var.b, v2Var.d);
            } else if (i2 == 2) {
                sd1Var.a(v2Var);
                int i3 = v2Var.b;
                int i4 = v2Var.d;
                RecyclerView recyclerView = sd1Var.g;
                recyclerView.U(i3, i4, true);
                recyclerView.q0 = true;
                recyclerView.n0.c += i4;
            } else if (i2 == 4) {
                sd1Var.a(v2Var);
                sd1Var.c(v2Var.b, v2Var.d, v2Var.c);
            } else if (i2 == 8) {
                sd1Var.a(v2Var);
                sd1Var.e(v2Var.b, v2Var.d);
            }
        }
        q(arrayList);
        this.f1107a = 0;
    }

    public void e(v2 v2Var) {
        int i;
        f81 f81Var = (f81) this.b;
        int i2 = v2Var.f1066a;
        if (i2 == 1 || i2 == 8) {
            c.m("should not dispatch add or move for pre layout");
            return;
        }
        int u = u(v2Var.b, i2);
        int i3 = v2Var.b;
        int i4 = v2Var.f1066a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                rw.o("op should be remove or update.", v2Var);
                return;
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < v2Var.d; i6++) {
            int u2 = u((i * i6) + v2Var.b, v2Var.f1066a);
            int i7 = v2Var.f1066a;
            if (i7 == 2 ? u2 != u : !(i7 == 4 && u2 == u + 1)) {
                v2 l = l(v2Var.c, i7, u, i5);
                f(l, i3);
                l.c = null;
                f81Var.c(l);
                if (v2Var.f1066a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                u = u2;
            } else {
                i5++;
            }
        }
        Object obj = v2Var.c;
        v2Var.c = null;
        f81Var.c(v2Var);
        if (i5 > 0) {
            v2 l2 = l(obj, v2Var.f1066a, u, i5);
            f(l2, i3);
            l2.c = null;
            f81Var.c(l2);
        }
    }

    public void f(v2 v2Var, int i) {
        sd1 sd1Var = (sd1) this.e;
        sd1Var.a(v2Var);
        int i2 = v2Var.f1066a;
        if (i2 != 2) {
            if (i2 == 4) {
                sd1Var.c(i, v2Var.d, v2Var.c);
                return;
            } else {
                c.m("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = v2Var.d;
        RecyclerView recyclerView = sd1Var.g;
        recyclerView.U(i, i3, true);
        recyclerView.q0 = true;
        recyclerView.n0.c += i3;
    }

    public int g(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        while (i2 < size) {
            v2 v2Var = (v2) arrayList.get(i2);
            int i3 = v2Var.f1066a;
            int i4 = v2Var.b;
            if (i3 == 8) {
                if (i4 == i) {
                    i = v2Var.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (v2Var.d <= i) {
                        i++;
                    }
                }
            } else if (i4 > i) {
                continue;
            } else if (i3 == 2) {
                int i5 = v2Var.d;
                if (i < i4 + i5) {
                    return -1;
                }
                i -= i5;
            } else if (i3 == 1) {
                i += v2Var.d;
            }
            i2++;
        }
        return i;
    }

    public ColorStateList h() {
        wu wuVar = (wu) this.e;
        if (wuVar != null) {
            return (ColorStateList) wuVar.c;
        }
        return null;
    }

    public PorterDuff.Mode i() {
        wu wuVar = (wu) this.e;
        if (wuVar != null) {
            return (PorterDuff.Mode) wuVar.d;
        }
        return null;
    }

    public boolean j() {
        return ((ArrayList) this.c).size() > 0;
    }

    public void k(AttributeSet attributeSet, int i) {
        ColorStateList f;
        View view = (View) this.b;
        Context context = view.getContext();
        int[] iArr = zb1.A;
        fh G = fh.G(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) G.i;
        View view2 = (View) this.b;
        y62.n(view2, view2.getContext(), iArr, attributeSet, (TypedArray) G.i, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f1107a = typedArray.getResourceId(0, -1);
                e6 e6Var = (e6) this.c;
                Context context2 = view.getContext();
                int i2 = this.f1107a;
                synchronized (e6Var) {
                    f = e6Var.f222a.f(context2, i2);
                }
                if (f != null) {
                    r(f);
                }
            }
            if (typedArray.hasValue(1)) {
                view.setBackgroundTintList(G.v(1));
            }
            if (typedArray.hasValue(2)) {
                view.setBackgroundTintMode(z50.c(typedArray.getInt(2, -1), null));
            }
            G.L();
        } catch (Throwable th) {
            G.L();
            throw th;
        }
    }

    public v2 l(Object obj, int i, int i2, int i3) {
        v2 v2Var = (v2) ((f81) this.b).a();
        if (v2Var != null) {
            v2Var.f1066a = i;
            v2Var.b = i2;
            v2Var.d = i3;
            v2Var.c = obj;
            return v2Var;
        }
        v2 v2Var2 = new v2();
        v2Var2.f1066a = i;
        v2Var2.b = i2;
        v2Var2.d = i3;
        v2Var2.c = obj;
        return v2Var2;
    }

    public void m() {
        this.f1107a = -1;
        r(null);
        a();
    }

    public void n(int i) {
        ColorStateList colorStateList;
        this.f1107a = i;
        e6 e6Var = (e6) this.c;
        if (e6Var != null) {
            Context context = ((View) this.b).getContext();
            synchronized (e6Var) {
                colorStateList = e6Var.f222a.f(context, i);
            }
        } else {
            colorStateList = null;
        }
        r(colorStateList);
        a();
    }

    public void o(v2 v2Var) {
        sd1 sd1Var = (sd1) this.e;
        ((ArrayList) this.d).add(v2Var);
        int i = v2Var.f1066a;
        if (i == 1) {
            sd1Var.d(v2Var.b, v2Var.d);
            return;
        }
        if (i == 2) {
            int i2 = v2Var.b;
            int i3 = v2Var.d;
            RecyclerView recyclerView = sd1Var.g;
            recyclerView.U(i2, i3, false);
            recyclerView.q0 = true;
            return;
        }
        if (i == 4) {
            sd1Var.c(v2Var.b, v2Var.d, v2Var.c);
        } else if (i == 8) {
            sd1Var.e(v2Var.b, v2Var.d);
        } else {
            rw.o("Unknown update op type for ", v2Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0132 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0125 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p() {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w2.p():void");
    }

    public void q(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v2 v2Var = (v2) arrayList.get(i);
            v2Var.c = null;
            ((f81) this.b).c(v2Var);
        }
        arrayList.clear();
    }

    public void r(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((wu) this.d) == null) {
                this.d = new wu();
            }
            wu wuVar = (wu) this.d;
            wuVar.c = colorStateList;
            wuVar.b = true;
        } else {
            this.d = null;
        }
        a();
    }

    public void s(ColorStateList colorStateList) {
        if (((wu) this.e) == null) {
            this.e = new wu();
        }
        wu wuVar = (wu) this.e;
        wuVar.c = colorStateList;
        wuVar.b = true;
        a();
    }

    public void t(PorterDuff.Mode mode) {
        if (((wu) this.e) == null) {
            this.e = new wu();
        }
        wu wuVar = (wu) this.e;
        wuVar.d = mode;
        wuVar.f1148a = true;
        a();
    }

    public int u(int i, int i2) {
        int i3;
        int i4;
        f81 f81Var = (f81) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            v2 v2Var = (v2) arrayList.get(size);
            int i5 = v2Var.f1066a;
            int i6 = v2Var.b;
            if (i5 == 8) {
                int i7 = v2Var.d;
                if (i6 < i7) {
                    i4 = i7;
                    i3 = i6;
                } else {
                    i3 = i7;
                    i4 = i6;
                }
                if (i < i3 || i > i4) {
                    if (i < i6) {
                        if (i2 == 1) {
                            v2Var.b = i6 + 1;
                            v2Var.d = i7 + 1;
                        } else if (i2 == 2) {
                            v2Var.b = i6 - 1;
                            v2Var.d = i7 - 1;
                        }
                    }
                } else if (i3 == i6) {
                    if (i2 == 1) {
                        v2Var.d = i7 + 1;
                    } else if (i2 == 2) {
                        v2Var.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        v2Var.b = i6 + 1;
                    } else if (i2 == 2) {
                        v2Var.b = i6 - 1;
                    }
                    i--;
                }
            } else if (i6 <= i) {
                if (i5 == 1) {
                    i -= v2Var.d;
                } else if (i5 == 2) {
                    i += v2Var.d;
                }
            } else if (i2 == 1) {
                v2Var.b = i6 + 1;
            } else if (i2 == 2) {
                v2Var.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            v2 v2Var2 = (v2) arrayList.get(size2);
            int i8 = v2Var2.f1066a;
            int i9 = v2Var2.d;
            if (i8 == 8) {
                if (i9 == v2Var2.b || i9 < 0) {
                    arrayList.remove(size2);
                    v2Var2.c = null;
                    f81Var.c(v2Var2);
                }
            } else if (i9 <= 0) {
                arrayList.remove(size2);
                v2Var2.c = null;
                f81Var.c(v2Var2);
            }
        }
        return i;
    }
}
