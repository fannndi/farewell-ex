package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class gu0 implements Serializable, Map {
    public static final gu0 t;
    public Object[] g;
    public Object[] h;
    public int[] i;
    public int[] j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public hu0 p;
    public iu0 q;
    public hu0 r;
    public boolean s;

    static {
        gu0 gu0Var = new gu0(0);
        gu0Var.s = true;
        t = gu0Var;
    }

    public gu0() {
        this(8);
    }

    public gu0(int i) {
        if (i < 0) {
            c.m("capacity must be non-negative.");
            throw null;
        }
        Object[] objArr = new Object[i];
        int[] iArr = new int[i];
        int highestOneBit = Integer.highestOneBit((i < 1 ? 1 : i) * 3);
        this.g = objArr;
        this.h = null;
        this.i = iArr;
        this.j = new int[highestOneBit];
        this.k = 2;
        this.l = 0;
        this.m = Integer.numberOfLeadingZeros(highestOneBit) + 1;
    }

    public final int a(Object obj) {
        c();
        while (true) {
            int i = i(obj);
            int i2 = this.k * 2;
            int length = this.j.length / 2;
            if (i2 > length) {
                i2 = length;
            }
            int i3 = 0;
            while (true) {
                int[] iArr = this.j;
                int i4 = iArr[i];
                if (i4 <= 0) {
                    int i5 = this.l;
                    Object[] objArr = this.g;
                    if (i5 < objArr.length) {
                        int i6 = i5 + 1;
                        this.l = i6;
                        objArr[i5] = obj;
                        this.i[i5] = i;
                        iArr[i] = i6;
                        this.o++;
                        this.n++;
                        if (i3 > this.k) {
                            this.k = i3;
                        }
                        return i5;
                    }
                    f(1);
                } else {
                    if (ym0.b(this.g[i4 - 1], obj)) {
                        return -i4;
                    }
                    i3++;
                    if (i3 > i2) {
                        j(this.j.length * 2);
                        break;
                    }
                    i = i == 0 ? this.j.length - 1 : i - 1;
                }
            }
        }
    }

    public final gu0 b() {
        c();
        this.s = true;
        if (this.o > 0) {
            return this;
        }
        gu0 gu0Var = t;
        gu0Var.getClass();
        return gu0Var;
    }

    public final void c() {
        if (this.s) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void clear() {
        c();
        int i = this.l - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.i;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.j[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        bw0.x(this.g, 0, this.l);
        Object[] objArr = this.h;
        if (objArr != null) {
            bw0.x(objArr, 0, this.l);
        }
        this.o = 0;
        this.l = 0;
        this.n++;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public final void d(boolean z) {
        int i;
        Object[] objArr = this.h;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.l;
            if (i2 >= i) {
                break;
            }
            int[] iArr = this.i;
            int i4 = iArr[i2];
            if (i4 >= 0) {
                Object[] objArr2 = this.g;
                objArr2[i3] = objArr2[i2];
                if (objArr != null) {
                    objArr[i3] = objArr[i2];
                }
                if (z) {
                    iArr[i3] = i4;
                    this.j[i4] = i3 + 1;
                }
                i3++;
            }
            i2++;
        }
        bw0.x(this.g, i3, i);
        if (objArr != null) {
            bw0.x(objArr, i3, this.l);
        }
        this.l = i3;
    }

    public final boolean e(Collection collection) {
        boolean b;
        collection.getClass();
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    Map.Entry entry = (Map.Entry) obj;
                    int g = g(entry.getKey());
                    if (g < 0) {
                        b = false;
                    } else {
                        Object[] objArr = this.h;
                        objArr.getClass();
                        b = ym0.b(objArr[g], entry.getValue());
                    }
                    if (!b) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        hu0 hu0Var = this.r;
        if (hu0Var != null) {
            return hu0Var;
        }
        hu0 hu0Var2 = new hu0(this, 0);
        this.r = hu0Var2;
        return hu0Var2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        return this.o == map.size() && e(map.entrySet());
    }

    public final void f(int i) {
        Object[] objArr = this.g;
        int length = objArr.length;
        int i2 = this.l;
        int i3 = length - i2;
        int i4 = i2 - this.o;
        if (i3 < i && i3 + i4 >= i && i4 >= objArr.length / 4) {
            d(true);
            return;
        }
        int i5 = i2 + i;
        if (i5 < 0) {
            throw new OutOfMemoryError();
        }
        if (i5 > objArr.length) {
            int length2 = objArr.length;
            int i6 = length2 + (length2 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            if (i6 - 2147483639 > 0) {
                i6 = i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            this.g = Arrays.copyOf(objArr, i6);
            Object[] objArr2 = this.h;
            this.h = objArr2 != null ? Arrays.copyOf(objArr2, i6) : null;
            this.i = Arrays.copyOf(this.i, i6);
            int highestOneBit = Integer.highestOneBit((i6 >= 1 ? i6 : 1) * 3);
            if (highestOneBit > this.j.length) {
                j(highestOneBit);
            }
        }
    }

    public final int g(Object obj) {
        int i = i(obj);
        int i2 = this.k;
        while (true) {
            int i3 = this.j[i];
            if (i3 == 0) {
                return -1;
            }
            if (i3 > 0) {
                int i4 = i3 - 1;
                if (ym0.b(this.g[i4], obj)) {
                    return i4;
                }
            }
            i2--;
            if (i2 < 0) {
                return -1;
            }
            i = i == 0 ? this.j.length - 1 : i - 1;
        }
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        int g = g(obj);
        if (g < 0) {
            return null;
        }
        Object[] objArr = this.h;
        objArr.getClass();
        return objArr[g];
    }

    public final int h(Object obj) {
        int i = this.l;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.i[i] >= 0) {
                Object[] objArr = this.h;
                objArr.getClass();
                if (ym0.b(objArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        du0 du0Var = new du0(this, 0);
        int i = 0;
        while (du0Var.hasNext()) {
            int i2 = du0Var.g;
            gu0 gu0Var = (gu0) du0Var.j;
            if (i2 >= gu0Var.l) {
                rw.k();
                return 0;
            }
            du0Var.g = i2 + 1;
            du0Var.h = i2;
            Object obj = gu0Var.g[i2];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = gu0Var.h;
            objArr.getClass();
            Object obj2 = objArr[du0Var.h];
            int hashCode2 = obj2 != null ? obj2.hashCode() : 0;
            du0Var.e();
            i += hashCode ^ hashCode2;
        }
        return i;
    }

    public final int i(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.m;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.o == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0032, code lost:
    
        r3[r0] = r6;
        r5.i[r2] = r0;
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r6) {
        /*
            r5 = this;
            int r0 = r5.n
            int r0 = r0 + 1
            r5.n = r0
            int r0 = r5.l
            int r1 = r5.o
            r2 = 0
            if (r0 <= r1) goto L10
            r5.d(r2)
        L10:
            int[] r0 = new int[r6]
            r5.j = r0
            int r6 = java.lang.Integer.numberOfLeadingZeros(r6)
            int r6 = r6 + 1
            r5.m = r6
        L1c:
            int r6 = r5.l
            if (r2 >= r6) goto L4d
            int r6 = r2 + 1
            java.lang.Object[] r0 = r5.g
            r0 = r0[r2]
            int r0 = r5.i(r0)
            int r1 = r5.k
        L2c:
            int[] r3 = r5.j
            r4 = r3[r0]
            if (r4 != 0) goto L3a
            r3[r0] = r6
            int[] r1 = r5.i
            r1[r2] = r0
            r2 = r6
            goto L1c
        L3a:
            int r1 = r1 + (-1)
            if (r1 < 0) goto L48
            int r4 = r0 + (-1)
            if (r0 != 0) goto L46
            int r0 = r3.length
            int r0 = r0 + (-1)
            goto L2c
        L46:
            r0 = r4
            goto L2c
        L48:
            java.lang.String r5 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            defpackage.c.n(r5)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gu0.j(int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[LOOP:0: B:8:0x0022->B:25:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(int r12) {
        /*
            r11 = this;
            java.lang.Object[] r0 = r11.g
            r0.getClass()
            r1 = 0
            r0[r12] = r1
            java.lang.Object[] r0 = r11.h
            if (r0 == 0) goto Le
            r0[r12] = r1
        Le:
            int[] r0 = r11.i
            r0 = r0[r12]
            int r1 = r11.k
            int r1 = r1 * 2
            int[] r2 = r11.j
            int r2 = r2.length
            int r2 = r2 / 2
            if (r1 <= r2) goto L1e
            r1 = r2
        L1e:
            r2 = 0
            r3 = r1
            r4 = r2
            r1 = r0
        L22:
            int r5 = r0 + (-1)
            if (r0 != 0) goto L2c
            int[] r0 = r11.j
            int r0 = r0.length
            int r0 = r0 + (-1)
            goto L2d
        L2c:
            r0 = r5
        L2d:
            int r4 = r4 + 1
            int r5 = r11.k
            int[] r6 = r11.j
            r7 = -1
            if (r4 <= r5) goto L39
            r6[r1] = r2
            goto L68
        L39:
            r5 = r6[r0]
            if (r5 != 0) goto L40
            r6[r1] = r2
            goto L68
        L40:
            if (r5 >= 0) goto L47
            r6[r1] = r7
        L44:
            r1 = r0
            r4 = r2
            goto L61
        L47:
            java.lang.Object[] r6 = r11.g
            int r8 = r5 + (-1)
            r6 = r6[r8]
            int r6 = r11.i(r6)
            int r6 = r6 - r0
            int[] r9 = r11.j
            int r10 = r9.length
            int r10 = r10 + (-1)
            r6 = r6 & r10
            if (r6 < r4) goto L61
            r9[r1] = r5
            int[] r4 = r11.i
            r4[r8] = r1
            goto L44
        L61:
            int r3 = r3 + r7
            if (r3 >= 0) goto L22
            int[] r0 = r11.j
            r0[r1] = r7
        L68:
            int[] r0 = r11.i
            r0[r12] = r7
            int r12 = r11.o
            int r12 = r12 + r7
            r11.o = r12
            int r12 = r11.n
            int r12 = r12 + 1
            r11.n = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gu0.k(int):void");
    }

    @Override // java.util.Map
    public final Set keySet() {
        hu0 hu0Var = this.p;
        if (hu0Var != null) {
            return hu0Var;
        }
        hu0 hu0Var2 = new hu0(this, 1);
        this.p = hu0Var2;
        return hu0Var2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        c();
        int a2 = a(obj);
        Object[] objArr = this.h;
        if (objArr == null) {
            int length = this.g.length;
            if (length < 0) {
                c.m("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            this.h = objArr;
        }
        if (a2 >= 0) {
            objArr[a2] = obj2;
            return null;
        }
        int i = (-a2) - 1;
        Object obj3 = objArr[i];
        objArr[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        c();
        Set<Map.Entry> entrySet = map.entrySet();
        if (entrySet.isEmpty()) {
            return;
        }
        f(entrySet.size());
        for (Map.Entry entry : entrySet) {
            int a2 = a(entry.getKey());
            Object[] objArr = this.h;
            if (objArr == null) {
                int length = this.g.length;
                if (length < 0) {
                    c.m("capacity must be non-negative.");
                    return;
                } else {
                    objArr = new Object[length];
                    this.h = objArr;
                }
            }
            if (a2 >= 0) {
                objArr[a2] = entry.getValue();
            } else {
                int i = (-a2) - 1;
                if (!ym0.b(entry.getValue(), objArr[i])) {
                    objArr[i] = entry.getValue();
                }
            }
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        c();
        int g = g(obj);
        if (g < 0) {
            return null;
        }
        Object[] objArr = this.h;
        objArr.getClass();
        Object obj2 = objArr[g];
        k(g);
        return obj2;
    }

    @Override // java.util.Map
    public final int size() {
        return this.o;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.o * 3) + 2);
        sb.append("{");
        int i = 0;
        du0 du0Var = new du0(this, 0);
        while (du0Var.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            int i2 = du0Var.g;
            gu0 gu0Var = (gu0) du0Var.j;
            if (i2 >= gu0Var.l) {
                rw.k();
                return null;
            }
            du0Var.g = i2 + 1;
            du0Var.h = i2;
            Object obj = gu0Var.g[i2];
            if (obj == gu0Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = gu0Var.h;
            objArr.getClass();
            Object obj2 = objArr[du0Var.h];
            if (obj2 == gu0Var) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            du0Var.e();
            i++;
        }
        sb.append("}");
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        iu0 iu0Var = this.q;
        if (iu0Var != null) {
            return iu0Var;
        }
        iu0 iu0Var2 = new iu0(this);
        this.q = iu0Var2;
        return iu0Var2;
    }
}
