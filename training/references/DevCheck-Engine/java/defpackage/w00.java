package defpackage;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class w00 implements rk0 {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1104a;
    public final ArrayList b;
    public final String c;
    public transient q52 d;
    public boolean e = true;
    public boolean f = true;
    public final it0 g = new it0();
    public float h = 17.0f;
    public final boolean i = true;
    public final List j;
    public float k;
    public float l;
    public float m;
    public float n;

    public w00(String str, List list) {
        this.f1104a = null;
        this.b = null;
        this.c = "DataSet";
        this.f1104a = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        this.f1104a.add(Integer.valueOf(Color.rgb(140, 234, 255)));
        arrayList.add(-16777216);
        this.c = str;
        this.k = -3.4028235E38f;
        this.l = Float.MAX_VALUE;
        this.m = -3.4028235E38f;
        this.n = Float.MAX_VALUE;
        this.j = list;
        if (list == null) {
            this.j = new ArrayList();
        }
        List list2 = this.j;
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        this.k = -3.4028235E38f;
        this.l = Float.MAX_VALUE;
        this.m = -3.4028235E38f;
        this.n = Float.MAX_VALUE;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            a((e90) it.next());
        }
    }

    public void a(e90 e90Var) {
        if (e90Var == null) {
            return;
        }
        b(e90Var);
        c(e90Var);
    }

    public final void b(e90 e90Var) {
        if (e90Var.a() < this.n) {
            this.n = e90Var.a();
        }
        if (e90Var.a() > this.m) {
            this.m = e90Var.a();
        }
    }

    public final void c(e90 e90Var) {
        if (e90Var.b() < this.l) {
            this.l = e90Var.b();
        }
        if (e90Var.b() > this.k) {
            this.k = e90Var.b();
        }
    }

    public final int d() {
        return ((Integer) this.f1104a.get(0)).intValue();
    }

    public final int e(int i) {
        ArrayList arrayList = this.f1104a;
        return ((Integer) arrayList.get(i % arrayList.size())).intValue();
    }

    public final ArrayList f(float f) {
        ArrayList arrayList = new ArrayList();
        List list = this.j;
        int size = list.size() - 1;
        int i = 0;
        while (true) {
            if (i > size) {
                break;
            }
            int i2 = (size + i) / 2;
            e90 e90Var = (e90) list.get(i2);
            if (f == e90Var.a()) {
                while (i2 > 0 && ((e90) list.get(i2 - 1)).a() == f) {
                    i2--;
                }
                int size2 = list.size();
                while (i2 < size2) {
                    e90 e90Var2 = (e90) list.get(i2);
                    if (e90Var2.a() != f) {
                        break;
                    }
                    arrayList.add(e90Var2);
                    i2++;
                }
            } else if (f > e90Var.a()) {
                i = i2 + 1;
            } else {
                size = i2 - 1;
            }
        }
        return arrayList;
    }

    public final e90 g(int i) {
        return (e90) this.j.get(i);
    }

    public final e90 h(float f, float f2, int i) {
        int i2 = i(f, f2, i);
        if (i2 > -1) {
            return (e90) this.j.get(i2);
        }
        return null;
    }

    public final int i(float f, float f2, int i) {
        int i2;
        e90 e90Var;
        List list = this.j;
        if (list == null || list.isEmpty()) {
            return -1;
        }
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 < size) {
            int i4 = (i3 + size) / 2;
            float a2 = ((e90) list.get(i4)).a() - f;
            int i5 = i4 + 1;
            float a3 = ((e90) list.get(i5)).a() - f;
            float abs = Math.abs(a2);
            float abs2 = Math.abs(a3);
            if (abs2 >= abs) {
                if (abs >= abs2) {
                    double d = a2;
                    if (d < 0.0d) {
                        if (d < 0.0d) {
                        }
                    }
                }
                size = i4;
            }
            i3 = i5;
        }
        if (size != -1) {
            float a4 = ((e90) list.get(size)).a();
            if (i == 1) {
                if (a4 < f && size < list.size() - 1) {
                    size++;
                }
            } else if (i == 2 && a4 > f && size > 0) {
                size--;
            }
            if (!Float.isNaN(f2)) {
                while (size > 0 && ((e90) list.get(size - 1)).a() == a4) {
                    size--;
                }
                float b = ((e90) list.get(size)).b();
                loop2: while (true) {
                    i2 = size;
                    do {
                        size++;
                        if (size >= list.size()) {
                            break loop2;
                        }
                        e90Var = (e90) list.get(size);
                        if (e90Var.a() != a4) {
                            break loop2;
                        }
                    } while (Math.abs(e90Var.b() - f2) >= Math.abs(b - f2));
                    b = f2;
                }
                return i2;
            }
        }
        return size;
    }

    public final q52 j() {
        q52 q52Var = this.d;
        return q52Var == null ? n52.h : q52Var;
    }

    public final int k(int i) {
        ArrayList arrayList = this.b;
        return ((Integer) arrayList.get(i % arrayList.size())).intValue();
    }

    public final void l(int i) {
        if (this.f1104a == null) {
            this.f1104a = new ArrayList();
        }
        this.f1104a.clear();
        this.f1104a.add(Integer.valueOf(i));
    }

    public final void m() {
        this.e = true;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder sb = new StringBuilder("DataSet, label: ");
        String str = this.c;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append(", entries: ");
        List list = this.j;
        sb.append(list.size());
        sb.append("\n");
        stringBuffer.append(sb.toString());
        for (int i = 0; i < list.size(); i++) {
            stringBuffer.append(((e90) list.get(i)).toString().concat(" "));
        }
        return stringBuffer.toString();
    }
}
