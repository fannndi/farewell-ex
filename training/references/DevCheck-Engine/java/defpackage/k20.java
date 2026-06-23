package defpackage;

import android.animation.Animator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import flar2.devcheck.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class k20 {

    /* renamed from: a, reason: collision with root package name */
    public final ViewGroup f507a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public boolean d = false;
    public boolean e = false;

    public k20(ViewGroup viewGroup) {
        this.f507a = viewGroup;
    }

    public static k20 f(ViewGroup viewGroup, ai1 ai1Var) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof k20) {
            return (k20) tag;
        }
        ai1Var.getClass();
        k20 k20Var = new k20(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, k20Var);
        return k20Var;
    }

    public final void a(int i, int i2, je0 je0Var) {
        synchronized (this.b) {
            try {
                eo eoVar = new eo();
                up1 d = d(je0Var.c);
                if (d != null) {
                    d.c(i, i2);
                    return;
                }
                up1 up1Var = new up1(i, i2, je0Var, eoVar);
                this.b.add(up1Var);
                up1Var.d.add(new tp1(this, up1Var, 0));
                up1Var.d.add(new tp1(this, up1Var, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(ArrayList arrayList, boolean z) {
        int i;
        boolean z2;
        ArrayList arrayList2;
        int i2;
        ViewGroup viewGroup;
        int size = arrayList.size();
        boolean z3 = false;
        up1 up1Var = null;
        int i3 = 0;
        up1 up1Var2 = null;
        while (true) {
            i = 2;
            if (i3 >= size) {
                break;
            }
            Object obj = arrayList.get(i3);
            i3++;
            up1 up1Var3 = (up1) obj;
            int d = d51.d(up1Var3.c.M);
            int A = d51.A(up1Var3.f1051a);
            if (A != 0) {
                if (A != 1) {
                    if (A != 2 && A != 3) {
                    }
                } else if (d != 2) {
                    up1Var2 = up1Var3;
                }
            }
            if (d == 2 && up1Var == null) {
                up1Var = up1Var3;
            }
        }
        if (ae0.H(2)) {
            Objects.toString(up1Var);
            Objects.toString(up1Var2);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(arrayList);
        ld0 ld0Var = ((up1) d51.m(arrayList, 1)).c;
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            jd0 jd0Var = ((up1) obj2).c.P;
            jd0 jd0Var2 = ld0Var.P;
            jd0Var.b = jd0Var2.b;
            jd0Var.c = jd0Var2.c;
            jd0Var.d = jd0Var2.d;
            jd0Var.e = jd0Var2.e;
        }
        int size3 = arrayList.size();
        int i5 = 0;
        while (i5 < size3) {
            Object obj3 = arrayList.get(i5);
            i5++;
            up1 up1Var4 = (up1) obj3;
            eo eoVar = new eo();
            up1Var4.d();
            HashSet hashSet = up1Var4.e;
            hashSet.add(eoVar);
            i20 i20Var = new i20(up1Var4, eoVar);
            i20Var.d = z3;
            i20Var.c = z;
            arrayList3.add(i20Var);
            eo eoVar2 = new eo();
            up1Var4.d();
            hashSet.add(eoVar2);
            boolean z4 = (!z ? up1Var4 == up1Var2 : up1Var4 == up1Var) ? z3 : true;
            j20 j20Var = new j20(up1Var4, eoVar2);
            int i6 = up1Var4.f1051a;
            ld0 ld0Var2 = up1Var4.c;
            if (i6 == 2) {
                if (z) {
                    jd0 jd0Var3 = ld0Var2.P;
                } else {
                    ld0Var2.getClass();
                }
                if (z) {
                    jd0 jd0Var4 = ld0Var2.P;
                } else {
                    jd0 jd0Var5 = ld0Var2.P;
                }
            } else if (z) {
                jd0 jd0Var6 = ld0Var2.P;
            } else {
                ld0Var2.getClass();
            }
            if (z4) {
                if (z) {
                    jd0 jd0Var7 = ld0Var2.P;
                } else {
                    ld0Var2.getClass();
                }
            }
            arrayList4.add(j20Var);
            up1Var4.d.add(new hk2(this, arrayList5, up1Var4));
            z3 = false;
        }
        HashMap hashMap = new HashMap();
        int size4 = arrayList4.size();
        int i7 = 0;
        while (i7 < size4) {
            Object obj4 = arrayList4.get(i7);
            i7++;
            up1 up1Var5 = (up1) ((j20) obj4).f1165a;
            d51.d(up1Var5.c.M);
            int i8 = up1Var5.f1051a;
        }
        int size5 = arrayList4.size();
        int i9 = 0;
        while (i9 < size5) {
            Object obj5 = arrayList4.get(i9);
            i9++;
            j20 j20Var2 = (j20) obj5;
            hashMap.put((up1) j20Var2.f1165a, Boolean.FALSE);
            j20Var2.e();
        }
        boolean containsValue = hashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup2 = this.f507a;
        Context context = viewGroup2.getContext();
        ArrayList arrayList6 = new ArrayList();
        int size6 = arrayList3.size();
        boolean z5 = false;
        int i10 = 0;
        while (i10 < size6) {
            Object obj6 = arrayList3.get(i10);
            i10++;
            i20 i20Var2 = (i20) obj6;
            up1 up1Var6 = (up1) i20Var2.f1165a;
            int d2 = d51.d(up1Var6.c.M);
            int i11 = up1Var6.f1051a;
            if (d2 == i11 || !(d2 == i || i11 == i)) {
                z2 = containsValue;
                arrayList2 = arrayList3;
                i2 = i;
                viewGroup = viewGroup2;
                i20Var2.e();
            } else {
                i8 t = i20Var2.t(context);
                if (t == null) {
                    i20Var2.e();
                } else {
                    Animator animator = (Animator) t.h;
                    if (animator == null) {
                        arrayList6.add(i20Var2);
                    } else {
                        up1 up1Var7 = (up1) i20Var2.f1165a;
                        i2 = i;
                        ld0 ld0Var3 = up1Var7.c;
                        z2 = containsValue;
                        arrayList2 = arrayList3;
                        if (Boolean.TRUE.equals(hashMap.get(up1Var7))) {
                            if (ae0.H(i2)) {
                                Objects.toString(ld0Var3);
                            }
                            i20Var2.e();
                            viewGroup = viewGroup2;
                        } else {
                            boolean z6 = up1Var7.f1051a == 3;
                            if (z6) {
                                arrayList5.remove(up1Var7);
                            }
                            View view = ld0Var3.M;
                            viewGroup2.startViewTransition(view);
                            ViewGroup viewGroup3 = viewGroup2;
                            animator.addListener(new g20(viewGroup3, view, z6, up1Var7, i20Var2));
                            animator.setTarget(view);
                            animator.start();
                            if (ae0.H(i2)) {
                                up1Var7.toString();
                            }
                            ((eo) i20Var2.b).b(new u40(animator, 5, up1Var7));
                            containsValue = z2;
                            viewGroup2 = viewGroup3;
                            i = i2;
                            arrayList3 = arrayList2;
                            z5 = true;
                        }
                    }
                }
                z2 = containsValue;
                arrayList2 = arrayList3;
                i2 = i;
                viewGroup = viewGroup2;
            }
            containsValue = z2;
            viewGroup2 = viewGroup;
            i = i2;
            arrayList3 = arrayList2;
        }
        boolean z7 = containsValue;
        int i12 = i;
        ViewGroup viewGroup4 = viewGroup2;
        int size7 = arrayList6.size();
        int i13 = 0;
        while (i13 < size7) {
            Object obj7 = arrayList6.get(i13);
            i13++;
            i20 i20Var3 = (i20) obj7;
            up1 up1Var8 = (up1) i20Var3.f1165a;
            ld0 ld0Var4 = up1Var8.c;
            if (z7) {
                if (ae0.H(i12)) {
                    Objects.toString(ld0Var4);
                }
                i20Var3.e();
            } else if (z5) {
                if (ae0.H(i12)) {
                    Objects.toString(ld0Var4);
                }
                i20Var3.e();
            } else {
                View view2 = ld0Var4.M;
                i8 t2 = i20Var3.t(context);
                t2.getClass();
                Animation animation = (Animation) t2.g;
                animation.getClass();
                if (up1Var8.f1051a != 1) {
                    view2.startAnimation(animation);
                    i20Var3.e();
                } else {
                    viewGroup4.startViewTransition(view2);
                    od0 od0Var = new od0(animation, viewGroup4, view2);
                    od0Var.setAnimationListener(new h20(up1Var8, viewGroup4, view2, i20Var3));
                    view2.startAnimation(od0Var);
                    if (ae0.H(i12)) {
                        up1Var8.toString();
                    }
                }
                ViewGroup viewGroup5 = viewGroup4;
                ((eo) i20Var3.b).b(new gr(view2, viewGroup5, i20Var3, up1Var8, 2));
                viewGroup4 = viewGroup5;
            }
        }
        int size8 = arrayList5.size();
        int i14 = 0;
        while (i14 < size8) {
            Object obj8 = arrayList5.get(i14);
            i14++;
            up1 up1Var9 = (up1) obj8;
            d51.b(up1Var9.c.M, up1Var9.f1051a);
        }
        arrayList5.clear();
        if (ae0.H(i12)) {
            Objects.toString(up1Var);
            Objects.toString(up1Var2);
        }
    }

    public final void c() {
        if (this.e) {
            return;
        }
        ViewGroup viewGroup = this.f507a;
        WeakHashMap weakHashMap = y62.f1215a;
        if (!viewGroup.isAttachedToWindow()) {
            e();
            this.d = false;
            return;
        }
        synchronized (this.b) {
            try {
                if (!this.b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.c);
                    this.c.clear();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        up1 up1Var = (up1) obj;
                        if (ae0.H(2)) {
                            Objects.toString(up1Var);
                        }
                        up1Var.a();
                        if (!up1Var.g) {
                            this.c.add(up1Var);
                        }
                    }
                    g();
                    ArrayList arrayList2 = new ArrayList(this.b);
                    this.b.clear();
                    this.c.addAll(arrayList2);
                    ae0.H(2);
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = arrayList2.get(i2);
                        i2++;
                        ((up1) obj2).d();
                    }
                    b(arrayList2, this.d);
                    this.d = false;
                    ae0.H(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final up1 d(ld0 ld0Var) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            up1 up1Var = (up1) obj;
            ld0 ld0Var2 = up1Var.c;
            ld0Var2.getClass();
            if (ld0Var2 == ld0Var && !up1Var.f) {
                return up1Var;
            }
        }
        return null;
    }

    public final void e() {
        ae0.H(2);
        ViewGroup viewGroup = this.f507a;
        WeakHashMap weakHashMap = y62.f1215a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.b) {
            try {
                g();
                ArrayList arrayList = this.b;
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((up1) obj).d();
                }
                ArrayList arrayList2 = new ArrayList(this.c);
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = arrayList2.get(i3);
                    i3++;
                    up1 up1Var = (up1) obj2;
                    if (ae0.H(2)) {
                        if (!isAttachedToWindow) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Container ");
                            sb.append(this.f507a);
                            sb.append(" is not attached to window. ");
                        }
                        Objects.toString(up1Var);
                    }
                    up1Var.a();
                }
                ArrayList arrayList3 = new ArrayList(this.b);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    up1 up1Var2 = (up1) obj3;
                    if (ae0.H(2)) {
                        if (!isAttachedToWindow) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Container ");
                            sb2.append(this.f507a);
                            sb2.append(" is not attached to window. ");
                        }
                        Objects.toString(up1Var2);
                    }
                    up1Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            up1 up1Var = (up1) obj;
            if (up1Var.b == 2) {
                up1Var.c(d51.c(up1Var.c.j0().getVisibility()), 1);
            }
        }
    }
}
