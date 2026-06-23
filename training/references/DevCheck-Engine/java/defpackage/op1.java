package defpackage;

import android.content.res.ColorStateList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class op1 implements Cloneable {
    public /* synthetic */ int[] g;
    public /* synthetic */ Object[] h;
    public /* synthetic */ int i;

    public op1() {
        int i;
        int i2 = 4;
        while (true) {
            i = 40;
            if (i2 >= 32) {
                break;
            }
            int i3 = (1 << i2) - 12;
            if (40 <= i3) {
                i = i3;
                break;
            }
            i2++;
        }
        int i4 = i / 4;
        this.g = new int[i4];
        this.h = new Object[i4];
    }

    public final void a(int i, ColorStateList colorStateList) {
        int i2 = this.i;
        if (i2 != 0 && i <= this.g[i2 - 1]) {
            b(i, colorStateList);
            return;
        }
        if (i2 >= this.g.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            this.g = Arrays.copyOf(this.g, i6);
            this.h = Arrays.copyOf(this.h, i6);
        }
        this.g[i2] = i;
        this.h[i2] = colorStateList;
        this.i = i2 + 1;
    }

    public final void b(int i, Object obj) {
        int h = k32.h(this.i, i, this.g);
        if (h >= 0) {
            this.h[h] = obj;
            return;
        }
        int i2 = ~h;
        int i3 = this.i;
        if (i2 < i3) {
            Object[] objArr = this.h;
            if (objArr[i2] == c3.c) {
                this.g[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.g.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.g = Arrays.copyOf(this.g, i7);
            this.h = Arrays.copyOf(this.h, i7);
        }
        int i8 = this.i;
        if (i8 - i2 != 0) {
            int[] iArr = this.g;
            int i9 = i2 + 1;
            u9.f0(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.h;
            u9.g0(i9, i2, this.i, objArr2, objArr2);
        }
        this.g[i2] = i;
        this.h[i2] = obj;
        this.i++;
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        op1 op1Var = (op1) clone;
        op1Var.g = (int[]) this.g.clone();
        op1Var.h = (Object[]) this.h.clone();
        return op1Var;
    }

    public final String toString() {
        int i = this.i;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.i;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.g[i3]);
            sb.append('=');
            Object obj = this.h[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
