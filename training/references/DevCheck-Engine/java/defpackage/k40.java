package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class k40 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f514a;
    public final int[] b;
    public final int[] c;
    public final xc1 d;
    public final int e;
    public final int f;
    public final boolean g;

    public k40(xc1 xc1Var, ArrayList arrayList, int[] iArr, int[] iArr2) {
        int i;
        j40 j40Var;
        int i2;
        this.f514a = arrayList;
        this.b = iArr;
        this.c = iArr2;
        Arrays.fill(iArr, 0);
        Arrays.fill(iArr2, 0);
        this.d = xc1Var;
        int t = xc1Var.t();
        this.e = t;
        int s = xc1Var.s();
        this.f = s;
        this.g = true;
        j40 j40Var2 = arrayList.isEmpty() ? null : (j40) arrayList.get(0);
        if (j40Var2 == null || j40Var2.f463a != 0 || j40Var2.b != 0) {
            arrayList.add(0, new j40(0, 0, 0));
        }
        arrayList.add(new j40(t, s, 0));
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            j40 j40Var3 = (j40) obj;
            for (int i4 = 0; i4 < j40Var3.c; i4++) {
                int i5 = j40Var3.f463a + i4;
                int i6 = j40Var3.b + i4;
                int i7 = xc1Var.b(i5, i6) ? 1 : 2;
                iArr[i5] = (i6 << 4) | i7;
                iArr2[i6] = (i5 << 4) | i7;
            }
        }
        if (this.g) {
            int size2 = arrayList.size();
            int i8 = 0;
            int i9 = 0;
            while (i9 < size2) {
                Object obj2 = arrayList.get(i9);
                i9++;
                j40 j40Var4 = (j40) obj2;
                while (true) {
                    i = j40Var4.f463a;
                    if (i8 < i) {
                        if (iArr[i8] == 0) {
                            int size3 = arrayList.size();
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                if (i10 < size3) {
                                    j40Var = (j40) arrayList.get(i10);
                                    while (true) {
                                        i2 = j40Var.b;
                                        if (i11 < i2) {
                                            if (iArr2[i11] == 0 && xc1Var.c(i8, i11)) {
                                                int i12 = xc1Var.b(i8, i11) ? 8 : 4;
                                                iArr[i8] = (i11 << 4) | i12;
                                                iArr2[i11] = i12 | (i8 << 4);
                                            } else {
                                                i11++;
                                            }
                                        }
                                    }
                                }
                                i11 = j40Var.c + i2;
                                i10++;
                            }
                        }
                        i8++;
                    }
                }
                i8 = j40Var4.c + i;
            }
        }
    }

    public static l40 b(ArrayDeque arrayDeque, int i, boolean z) {
        l40 l40Var;
        Iterator it = arrayDeque.iterator();
        while (true) {
            if (!it.hasNext()) {
                l40Var = null;
                break;
            }
            l40Var = (l40) it.next();
            if (l40Var.f571a == i && l40Var.c == z) {
                it.remove();
                break;
            }
        }
        while (it.hasNext()) {
            l40 l40Var2 = (l40) it.next();
            if (z) {
                l40Var2.b--;
            } else {
                l40Var2.b++;
            }
        }
        return l40Var;
    }

    public final void a(gm2 gm2Var) {
        int[] iArr;
        xc1 xc1Var;
        int i;
        int i2;
        ArrayList arrayList;
        k40 k40Var = this;
        ye yeVar = new ye(gm2Var);
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList2 = k40Var.f514a;
        boolean z = true;
        int size = arrayList2.size() - 1;
        int i3 = k40Var.e;
        int i4 = k40Var.f;
        int i5 = i3;
        while (size >= 0) {
            j40 j40Var = (j40) arrayList2.get(size);
            int i6 = j40Var.f463a;
            int i7 = j40Var.c;
            int i8 = i6 + i7;
            int i9 = j40Var.b;
            int i10 = i9 + i7;
            while (true) {
                iArr = k40Var.b;
                xc1Var = k40Var.d;
                boolean z2 = z;
                i = 0;
                if (i5 <= i8) {
                    break;
                }
                i5--;
                int i11 = iArr[i5];
                if ((i11 & 12) != 0) {
                    arrayList = arrayList2;
                    int i12 = i11 >> 4;
                    l40 b = b(arrayDeque, i12, false);
                    if (b != null) {
                        int i13 = (i3 - b.b) - 1;
                        yeVar.j(i5, i13);
                        if ((i11 & 4) != 0) {
                            yeVar.F(i13, z2 ? 1 : 0, xc1Var.r(i5, i12));
                        }
                    } else {
                        arrayDeque.add(new l40(i5, (i3 - i5) - (z2 ? 1 : 0), z2));
                    }
                } else {
                    arrayList = arrayList2;
                    yeVar.i(i5, z2 ? 1 : 0);
                    i3--;
                }
                arrayList2 = arrayList;
                z = true;
            }
            ArrayList arrayList3 = arrayList2;
            while (i4 > i10) {
                i4--;
                int i14 = k40Var.c[i4];
                if ((i14 & 12) != 0) {
                    int i15 = i14 >> 4;
                    l40 b2 = b(arrayDeque, i15, true);
                    if (b2 == null) {
                        arrayDeque.add(new l40(i4, i3 - i5, false));
                        i2 = 0;
                    } else {
                        i2 = 0;
                        yeVar.j((i3 - b2.b) - 1, i5);
                        if ((i14 & 4) != 0) {
                            yeVar.F(i5, 1, xc1Var.r(i15, i4));
                        }
                    }
                } else {
                    i2 = i;
                    yeVar.B(i5, 1);
                    i3++;
                }
                k40Var = this;
                i = i2;
            }
            int i16 = i9;
            int i17 = i6;
            while (i < i7) {
                if ((iArr[i17] & 15) == 2) {
                    yeVar.F(i17, 1, xc1Var.r(i17, i16));
                }
                i17++;
                i16++;
                i++;
            }
            size--;
            k40Var = this;
            z = true;
            i4 = i9;
            i5 = i6;
            arrayList2 = arrayList3;
        }
        yeVar.a();
    }
}
