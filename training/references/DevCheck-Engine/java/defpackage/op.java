package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class op {

    /* renamed from: a, reason: collision with root package name */
    public float f751a = -3.4028235E38f;
    public float b = Float.MAX_VALUE;
    public float c = -3.4028235E38f;
    public float d = Float.MAX_VALUE;
    public float e = -3.4028235E38f;
    public float f = Float.MAX_VALUE;
    public float g = -3.4028235E38f;
    public float h = Float.MAX_VALUE;
    public ArrayList i;

    public op(rk0... rk0VarArr) {
        ArrayList arrayList = new ArrayList();
        for (rk0 rk0Var : rk0VarArr) {
            arrayList.add(rk0Var);
        }
        this.i = arrayList;
        c();
    }

    public final void a(pq0 pq0Var) {
        d(pq0Var);
        this.i.add(pq0Var);
    }

    public final void b(e90 e90Var, int i) {
        ArrayList arrayList = this.i;
        if (arrayList.size() <= i || i < 0) {
            return;
        }
        w00 w00Var = (w00) ((rk0) arrayList.get(i));
        List list = w00Var.j;
        if (list == null) {
            list = new ArrayList();
        }
        w00Var.a(e90Var);
        if (list.add(e90Var)) {
            float f = this.f751a;
            float f2 = e90Var.g;
            if (f < f2) {
                this.f751a = f2;
            }
            if (this.b > f2) {
                this.b = f2;
            }
            float f3 = this.c;
            float f4 = e90Var.i;
            if (f3 < f4) {
                this.c = f4;
            }
            if (this.d > f4) {
                this.d = f4;
            }
            if (this.e < f2) {
                this.e = f2;
            }
            if (this.f > f2) {
                this.f = f2;
            }
        }
    }

    public final void c() {
        rk0 rk0Var;
        ArrayList arrayList = this.i;
        if (arrayList == null) {
            return;
        }
        this.f751a = -3.4028235E38f;
        this.b = Float.MAX_VALUE;
        this.c = -3.4028235E38f;
        this.d = Float.MAX_VALUE;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            d((rk0) obj);
        }
        this.e = -3.4028235E38f;
        this.f = Float.MAX_VALUE;
        this.g = -3.4028235E38f;
        this.h = Float.MAX_VALUE;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            rk0Var = (rk0) it.next();
            ((w00) rk0Var).getClass();
        } else {
            rk0Var = null;
        }
        if (rk0Var != null) {
            w00 w00Var = (w00) rk0Var;
            this.e = w00Var.k;
            this.f = w00Var.l;
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = arrayList.get(i3);
                i3++;
                rk0 rk0Var2 = (rk0) obj2;
                ((w00) rk0Var2).getClass();
                w00 w00Var2 = (w00) rk0Var2;
                float f = w00Var2.l;
                if (f < this.f) {
                    this.f = f;
                }
                float f2 = w00Var2.k;
                if (f2 > this.e) {
                    this.e = f2;
                }
            }
        }
        int size3 = arrayList.size();
        while (i < size3) {
            Object obj3 = arrayList.get(i);
            i++;
            ((w00) ((rk0) obj3)).getClass();
        }
    }

    public final void d(rk0 rk0Var) {
        if (this.f751a < ((w00) rk0Var).k) {
            this.f751a = ((w00) rk0Var).k;
        }
        float f = this.b;
        w00 w00Var = (w00) rk0Var;
        float f2 = w00Var.l;
        if (f > f2) {
            this.b = f2;
        }
        float f3 = this.c;
        float f4 = w00Var.m;
        if (f3 < f4) {
            this.c = f4;
        }
        float f5 = this.d;
        float f6 = w00Var.n;
        if (f5 > f6) {
            this.d = f6;
        }
        float f7 = this.e;
        float f8 = w00Var.k;
        if (f7 < f8) {
            this.e = f8;
        }
        if (this.f > f2) {
            this.f = f2;
        }
    }

    public rk0 e(int i) {
        ArrayList arrayList = this.i;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return (rk0) arrayList.get(i);
    }

    public final int f() {
        ArrayList arrayList = this.i;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final int g() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            i += ((w00) ((rk0) obj)).j.size();
        }
        return i;
    }

    public e90 h(fj0 fj0Var) {
        int i = fj0Var.e;
        ArrayList arrayList = this.i;
        if (i >= arrayList.size()) {
            return null;
        }
        return ((w00) ((rk0) arrayList.get(fj0Var.e))).h(fj0Var.f283a, fj0Var.b, 3);
    }

    public final float i(int i) {
        if (i == 1) {
            float f = this.e;
            return f == -3.4028235E38f ? this.g : f;
        }
        float f2 = this.g;
        return f2 == -3.4028235E38f ? this.e : f2;
    }

    public final float j(int i) {
        if (i == 1) {
            float f = this.f;
            return f == Float.MAX_VALUE ? this.h : f;
        }
        float f2 = this.h;
        return f2 == Float.MAX_VALUE ? this.f : f2;
    }

    public final void k() {
        ArrayList arrayList = this.i;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ArrayList arrayList2 = ((w00) ((rk0) obj)).b;
            arrayList2.clear();
            arrayList2.add(-1);
        }
    }
}
