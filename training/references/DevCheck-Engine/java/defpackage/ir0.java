package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* loaded from: classes.dex */
public final class ir0 extends AbstractMap implements Serializable {
    public static final c4 o = new c4(9);
    public final boolean h;
    public hr0 i;
    public final hr0 l;
    public gr0 m;
    public gr0 n;
    public int j = 0;
    public int k = 0;
    public final Comparator g = o;

    public ir0(boolean z) {
        this.h = z;
        this.l = new hr0(z);
    }

    public final hr0 a(Object obj, boolean z) {
        int i;
        hr0 hr0Var;
        hr0 hr0Var2 = this.i;
        c4 c4Var = o;
        Comparator comparator = this.g;
        if (hr0Var2 != null) {
            Comparable comparable = comparator == c4Var ? (Comparable) obj : null;
            while (true) {
                Object obj2 = hr0Var2.l;
                i = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (i == 0) {
                    return hr0Var2;
                }
                hr0 hr0Var3 = i < 0 ? hr0Var2.h : hr0Var2.i;
                if (hr0Var3 == null) {
                    break;
                }
                hr0Var2 = hr0Var3;
            }
        } else {
            i = 0;
        }
        hr0 hr0Var4 = hr0Var2;
        if (!z) {
            return null;
        }
        hr0 hr0Var5 = this.l;
        if (hr0Var4 != null) {
            hr0Var = new hr0(this.h, hr0Var4, obj, hr0Var5, hr0Var5.k);
            if (i < 0) {
                hr0Var4.h = hr0Var;
            } else {
                hr0Var4.i = hr0Var;
            }
            b(hr0Var4, true);
        } else {
            if (comparator == c4Var && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            hr0Var = new hr0(this.h, hr0Var4, obj, hr0Var5, hr0Var5.k);
            this.i = hr0Var;
        }
        this.j++;
        this.k++;
        return hr0Var;
    }

    public final void b(hr0 hr0Var, boolean z) {
        while (hr0Var != null) {
            hr0 hr0Var2 = hr0Var.h;
            hr0 hr0Var3 = hr0Var.i;
            int i = hr0Var2 != null ? hr0Var2.o : 0;
            int i2 = hr0Var3 != null ? hr0Var3.o : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                hr0 hr0Var4 = hr0Var3.h;
                hr0 hr0Var5 = hr0Var3.i;
                int i4 = (hr0Var4 != null ? hr0Var4.o : 0) - (hr0Var5 != null ? hr0Var5.o : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    e(hr0Var);
                } else {
                    f(hr0Var3);
                    e(hr0Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                hr0 hr0Var6 = hr0Var2.h;
                hr0 hr0Var7 = hr0Var2.i;
                int i5 = (hr0Var6 != null ? hr0Var6.o : 0) - (hr0Var7 != null ? hr0Var7.o : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    f(hr0Var);
                } else {
                    e(hr0Var2);
                    f(hr0Var);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                hr0Var.o = i + 1;
                if (z) {
                    return;
                }
            } else {
                hr0Var.o = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            hr0Var = hr0Var.g;
        }
    }

    public final void c(hr0 hr0Var, boolean z) {
        hr0 hr0Var2;
        hr0 hr0Var3;
        int i;
        if (z) {
            hr0 hr0Var4 = hr0Var.k;
            hr0Var4.j = hr0Var.j;
            hr0Var.j.k = hr0Var4;
        }
        hr0 hr0Var5 = hr0Var.h;
        hr0 hr0Var6 = hr0Var.i;
        hr0 hr0Var7 = hr0Var.g;
        int i2 = 0;
        if (hr0Var5 == null || hr0Var6 == null) {
            if (hr0Var5 != null) {
                d(hr0Var, hr0Var5);
                hr0Var.h = null;
            } else if (hr0Var6 != null) {
                d(hr0Var, hr0Var6);
                hr0Var.i = null;
            } else {
                d(hr0Var, null);
            }
            b(hr0Var7, false);
            this.j--;
            this.k++;
            return;
        }
        if (hr0Var5.o > hr0Var6.o) {
            hr0 hr0Var8 = hr0Var5.i;
            while (true) {
                hr0 hr0Var9 = hr0Var8;
                hr0Var3 = hr0Var5;
                hr0Var5 = hr0Var9;
                if (hr0Var5 == null) {
                    break;
                } else {
                    hr0Var8 = hr0Var5.i;
                }
            }
        } else {
            hr0 hr0Var10 = hr0Var6.h;
            while (true) {
                hr0Var2 = hr0Var6;
                hr0Var6 = hr0Var10;
                if (hr0Var6 == null) {
                    break;
                } else {
                    hr0Var10 = hr0Var6.h;
                }
            }
            hr0Var3 = hr0Var2;
        }
        c(hr0Var3, false);
        hr0 hr0Var11 = hr0Var.h;
        if (hr0Var11 != null) {
            i = hr0Var11.o;
            hr0Var3.h = hr0Var11;
            hr0Var11.g = hr0Var3;
            hr0Var.h = null;
        } else {
            i = 0;
        }
        hr0 hr0Var12 = hr0Var.i;
        if (hr0Var12 != null) {
            i2 = hr0Var12.o;
            hr0Var3.i = hr0Var12;
            hr0Var12.g = hr0Var3;
            hr0Var.i = null;
        }
        hr0Var3.o = Math.max(i, i2) + 1;
        d(hr0Var, hr0Var3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.i = null;
        this.j = 0;
        this.k++;
        hr0 hr0Var = this.l;
        hr0Var.k = hr0Var;
        hr0Var.j = hr0Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        hr0 hr0Var = null;
        if (obj != null) {
            try {
                hr0Var = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return hr0Var != null;
    }

    public final void d(hr0 hr0Var, hr0 hr0Var2) {
        hr0 hr0Var3 = hr0Var.g;
        hr0Var.g = null;
        if (hr0Var2 != null) {
            hr0Var2.g = hr0Var3;
        }
        if (hr0Var3 == null) {
            this.i = hr0Var2;
        } else if (hr0Var3.h == hr0Var) {
            hr0Var3.h = hr0Var2;
        } else {
            hr0Var3.i = hr0Var2;
        }
    }

    public final void e(hr0 hr0Var) {
        hr0 hr0Var2 = hr0Var.h;
        hr0 hr0Var3 = hr0Var.i;
        hr0 hr0Var4 = hr0Var3.h;
        hr0 hr0Var5 = hr0Var3.i;
        hr0Var.i = hr0Var4;
        if (hr0Var4 != null) {
            hr0Var4.g = hr0Var;
        }
        d(hr0Var, hr0Var3);
        hr0Var3.h = hr0Var;
        hr0Var.g = hr0Var3;
        int max = Math.max(hr0Var2 != null ? hr0Var2.o : 0, hr0Var4 != null ? hr0Var4.o : 0) + 1;
        hr0Var.o = max;
        hr0Var3.o = Math.max(max, hr0Var5 != null ? hr0Var5.o : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        gr0 gr0Var = this.m;
        if (gr0Var != null) {
            return gr0Var;
        }
        gr0 gr0Var2 = new gr0(0, this);
        this.m = gr0Var2;
        return gr0Var2;
    }

    public final void f(hr0 hr0Var) {
        hr0 hr0Var2 = hr0Var.h;
        hr0 hr0Var3 = hr0Var.i;
        hr0 hr0Var4 = hr0Var2.h;
        hr0 hr0Var5 = hr0Var2.i;
        hr0Var.h = hr0Var5;
        if (hr0Var5 != null) {
            hr0Var5.g = hr0Var;
        }
        d(hr0Var, hr0Var2);
        hr0Var2.i = hr0Var;
        hr0Var.g = hr0Var2;
        int max = Math.max(hr0Var3 != null ? hr0Var3.o : 0, hr0Var5 != null ? hr0Var5.o : 0) + 1;
        hr0Var.o = max;
        hr0Var2.o = Math.max(max, hr0Var4 != null ? hr0Var4.o : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            hr0 r2 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r2 = r0
        La:
            if (r2 == 0) goto Lf
            java.lang.Object r2 = r2.n
            return r2
        Lf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir0.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        gr0 gr0Var = this.n;
        if (gr0Var != null) {
            return gr0Var;
        }
        gr0 gr0Var2 = new gr0(1, this);
        this.n = gr0Var2;
        return gr0Var2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            jw0.f("key == null");
            return null;
        }
        if (obj2 == null && !this.h) {
            jw0.f("value == null");
            return null;
        }
        hr0 a2 = a(obj, true);
        Object obj3 = a2.n;
        a2.n = obj2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            hr0 r3 = r2.a(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            goto La
        L9:
            r3 = r0
        La:
            if (r3 == 0) goto L10
            r1 = 1
            r2.c(r3, r1)
        L10:
            if (r3 == 0) goto L15
            java.lang.Object r2 = r3.n
            return r2
        L15:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ir0.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.j;
    }
}
