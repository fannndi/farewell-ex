package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class kp1 implements Comparable {
    public boolean g;
    public float k;
    public int r;
    public int h = -1;
    public int i = -1;
    public int j = 0;
    public boolean l = false;
    public final float[] m = new float[9];
    public final float[] n = new float[9];
    public q9[] o = new q9[16];
    public int p = 0;
    public int q = 0;

    public kp1(int i) {
        this.r = i;
    }

    public final void a(q9 q9Var) {
        int i = 0;
        while (true) {
            int i2 = this.p;
            q9[] q9VarArr = this.o;
            if (i >= i2) {
                if (i2 >= q9VarArr.length) {
                    this.o = (q9[]) Arrays.copyOf(q9VarArr, q9VarArr.length * 2);
                }
                q9[] q9VarArr2 = this.o;
                int i3 = this.p;
                q9VarArr2[i3] = q9Var;
                this.p = i3 + 1;
                return;
            }
            if (q9VarArr[i] == q9Var) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(q9 q9Var) {
        int i = this.p;
        int i2 = 0;
        while (i2 < i) {
            if (this.o[i2] == q9Var) {
                while (i2 < i - 1) {
                    q9[] q9VarArr = this.o;
                    int i3 = i2 + 1;
                    q9VarArr[i2] = q9VarArr[i3];
                    i2 = i3;
                }
                this.p--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.r = 5;
        this.j = 0;
        this.h = -1;
        this.i = -1;
        this.k = 0.0f;
        this.l = false;
        int i = this.p;
        for (int i2 = 0; i2 < i; i2++) {
            this.o[i2] = null;
        }
        this.p = 0;
        this.q = 0;
        this.g = false;
        Arrays.fill(this.n, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.h - ((kp1) obj).h;
    }

    public final void d(dr0 dr0Var, float f) {
        this.k = f;
        this.l = true;
        int i = this.p;
        this.i = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.o[i2].h(dr0Var, this, false);
        }
        this.p = 0;
    }

    public final void e(dr0 dr0Var, q9 q9Var) {
        int i = this.p;
        for (int i2 = 0; i2 < i; i2++) {
            this.o[i2].i(dr0Var, q9Var, false);
        }
        this.p = 0;
    }

    public final String toString() {
        return "" + this.h;
    }
}
