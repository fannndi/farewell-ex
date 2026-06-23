package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class gh1 implements jt1, it1 {
    public static final TreeMap o = new TreeMap();
    public final int g;
    public volatile String h;
    public final long[] i;
    public final double[] j;
    public final String[] k;
    public final byte[][] l;
    public final int[] m;
    public int n;

    public gh1(int i) {
        this.g = i;
        int i2 = i + 1;
        this.m = new int[i2];
        this.i = new long[i2];
        this.j = new double[i2];
        this.k = new String[i2];
        this.l = new byte[i2][];
    }

    public static final gh1 a(int i, String str) {
        TreeMap treeMap = o;
        synchronized (treeMap) {
            Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (ceilingEntry == null) {
                gh1 gh1Var = new gh1(i);
                gh1Var.h = str;
                gh1Var.n = i;
                return gh1Var;
            }
            treeMap.remove(ceilingEntry.getKey());
            gh1 gh1Var2 = (gh1) ceilingEntry.getValue();
            gh1Var2.getClass();
            gh1Var2.h = str;
            gh1Var2.n = i;
            return gh1Var2;
        }
    }

    @Override // defpackage.it1
    public final void b(int i) {
        this.m[i] = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.it1
    public final void d(int i, long j) {
        this.m[i] = 2;
        this.i[i] = j;
    }

    public final void e() {
        TreeMap treeMap = o;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.g), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator it = treeMap.descendingKeySet().iterator();
                it.getClass();
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
        }
    }

    @Override // defpackage.it1
    public final void f(int i, byte[] bArr) {
        this.m[i] = 5;
        this.l[i] = bArr;
    }

    @Override // defpackage.jt1
    public final String j() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        c.n("Required value was null.");
        return null;
    }

    @Override // defpackage.it1
    public final void k(int i, String str) {
        this.m[i] = 4;
        this.k[i] = str;
    }

    @Override // defpackage.jt1
    public final void l(it1 it1Var) {
        int i = this.n;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.m[i2];
            if (i3 == 1) {
                it1Var.b(i2);
            } else if (i3 == 2) {
                it1Var.d(i2, this.i[i2]);
            } else if (i3 == 3) {
                it1Var.n(i2, this.j[i2]);
            } else if (i3 == 4) {
                String str = this.k[i2];
                if (str == null) {
                    c.m("Required value was null.");
                    return;
                }
                it1Var.k(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.l[i2];
                if (bArr == null) {
                    c.m("Required value was null.");
                    return;
                }
                it1Var.f(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.it1
    public final void n(int i, double d) {
        this.m[i] = 3;
        this.j[i] = d;
    }
}
