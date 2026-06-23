package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class gd {

    /* renamed from: a, reason: collision with root package name */
    public int f333a;
    public int b;
    public int c;
    public Object d;

    public void a(zu zuVar) {
        Object[] objArr = (Object[]) this.d;
        int i = this.b;
        objArr[i] = zuVar;
        int i2 = this.c & (i + 1);
        this.b = i2;
        int i3 = this.f333a;
        if (i2 == i3) {
            int length = objArr.length;
            int i4 = length - i3;
            int i5 = length << 1;
            if (i5 < 0) {
                c.o("Max array capacity exceeded");
                return;
            }
            Object[] objArr2 = new Object[i5];
            u9.g0(0, i3, length, objArr, objArr2);
            u9.g0(i4, 0, this.f333a, (Object[]) this.d, objArr2);
            this.d = objArr2;
            this.f333a = 0;
            this.b = length;
            this.c = i5 - 1;
        }
    }

    public void b(int i, int i2) {
        if (i < 0) {
            c.m("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            c.m("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.c;
        int i4 = i3 * 2;
        int[] iArr = (int[]) this.d;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.d = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.d = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.d;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.c++;
    }

    public void c(RecyclerView recyclerView, boolean z) {
        this.c = 0;
        int[] iArr = (int[]) this.d;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        de1 de1Var = recyclerView.t;
        if (recyclerView.s == null || de1Var == null || !de1Var.i) {
            return;
        }
        if (z) {
            if (!recyclerView.k.j()) {
                de1Var.i(recyclerView.s.c(), this);
            }
        } else if (!recyclerView.Q()) {
            de1Var.h(this.f333a, this.b, recyclerView.n0, this);
        }
        int i = this.c;
        if (i > de1Var.j) {
            de1Var.j = i;
            de1Var.k = z;
            recyclerView.i.n();
        }
    }

    public void d(cd cdVar, pq0 pq0Var) {
        ((hd) this.d).b.getClass();
        float max = Math.max(0.0f, Math.min(1.0f, 1.0f));
        float lowestVisibleX = cdVar.getLowestVisibleX();
        float highestVisibleX = cdVar.getHighestVisibleX();
        e90 h = pq0Var.h(lowestVisibleX, Float.NaN, 2);
        List list = pq0Var.j;
        e90 h2 = pq0Var.h(highestVisibleX, Float.NaN, 1);
        this.f333a = h == null ? 0 : list.indexOf(h);
        this.b = h2 != null ? list.indexOf(h2) : 0;
        this.c = (int) ((r7 - this.f333a) * max);
    }
}
