package defpackage;

import flar2.devcheck.permissionsSummary.xEua.bPnJ;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class ft0 implements Cloneable {
    public /* synthetic */ boolean g;
    public /* synthetic */ long[] h;
    public /* synthetic */ Object[] i;
    public /* synthetic */ int j;

    public ft0() {
        this(10);
    }

    public ft0(int i) {
        if (i == 0) {
            this.h = k32.b;
            this.i = k32.c;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.h = new long[i5];
        this.i = new Object[i5];
    }

    public final void a() {
        int i = this.j;
        Object[] objArr = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.j = 0;
        this.g = false;
    }

    public final Object b(long j) {
        Object obj;
        int i = k32.i(this.h, this.j, j);
        if (i < 0 || (obj = this.i[i]) == om0.j) {
            return null;
        }
        return obj;
    }

    public final int c(long j) {
        if (this.g) {
            int i = this.j;
            long[] jArr = this.h;
            Object[] objArr = this.i;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != om0.j) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.g = false;
            this.j = i2;
        }
        return k32.i(this.h, this.j, j);
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        ft0 ft0Var = (ft0) clone;
        ft0Var.h = (long[]) this.h.clone();
        ft0Var.i = (Object[]) this.i.clone();
        return ft0Var;
    }

    public final long d(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.j)) {
            c.d(d51.q("Expected index to be within 0..size()-1, but was ", i));
            return 0L;
        }
        if (this.g) {
            long[] jArr = this.h;
            Object[] objArr = this.i;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != om0.j) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.g = false;
            this.j = i3;
        }
        return this.h[i];
    }

    public final void e(long j, Object obj) {
        Object obj2 = om0.j;
        int i = k32.i(this.h, this.j, j);
        if (i >= 0) {
            this.i[i] = obj;
            return;
        }
        int i2 = ~i;
        int i3 = this.j;
        if (i2 < i3) {
            Object[] objArr = this.i;
            if (objArr[i2] == obj2) {
                this.h[i2] = j;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.g) {
            long[] jArr = this.h;
            if (i3 >= jArr.length) {
                Object[] objArr2 = this.i;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj3 = objArr2[i5];
                    if (obj3 != obj2) {
                        if (i5 != i4) {
                            jArr[i4] = jArr[i5];
                            objArr2[i4] = obj3;
                            objArr2[i5] = null;
                        }
                        i4++;
                    }
                }
                this.g = false;
                this.j = i4;
                i2 = ~k32.i(this.h, i4, j);
            }
        }
        int i6 = this.j;
        if (i6 >= this.h.length) {
            int i7 = (i6 + 1) * 8;
            int i8 = 4;
            while (true) {
                if (i8 >= 32) {
                    break;
                }
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
                i8++;
            }
            int i10 = i7 / 8;
            this.h = Arrays.copyOf(this.h, i10);
            this.i = Arrays.copyOf(this.i, i10);
        }
        int i11 = this.j - i2;
        if (i11 != 0) {
            long[] jArr2 = this.h;
            int i12 = i2 + 1;
            jArr2.getClass();
            System.arraycopy(jArr2, i2, jArr2, i12, i11);
            Object[] objArr3 = this.i;
            u9.g0(i12, i2, this.j, objArr3, objArr3);
        }
        this.h[i2] = j;
        this.i[i2] = obj;
        this.j++;
    }

    public final void f(long j) {
        int i = k32.i(this.h, this.j, j);
        if (i >= 0) {
            Object[] objArr = this.i;
            Object obj = objArr[i];
            Object obj2 = om0.j;
            if (obj != obj2) {
                objArr[i] = obj2;
                this.g = true;
            }
        }
    }

    public final int g() {
        if (this.g) {
            int i = this.j;
            long[] jArr = this.h;
            Object[] objArr = this.i;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != om0.j) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.g = false;
            this.j = i2;
        }
        return this.j;
    }

    public final Object h(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.j)) {
            c.d(d51.q("Expected index to be within 0..size()-1, but was ", i));
            return null;
        }
        if (this.g) {
            long[] jArr = this.h;
            Object[] objArr = this.i;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != om0.j) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.g = false;
            this.j = i3;
        }
        return this.i[i];
    }

    public final String toString() {
        if (g() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.j * 28);
        sb.append('{');
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(d(i2));
            sb.append('=');
            Object h = h(i2);
            if (h != sb) {
                sb.append(h);
            } else {
                sb.append(bPnJ.TQsGxoiBwx);
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
