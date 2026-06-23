package defpackage;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class gt0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f353a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final Object f;
    public final Object g;

    public gt0(int i) {
        this.f353a = 0;
        this.b = i;
        if (i <= 0) {
            c.m(qJTtDWNCVUDjB.sLyWBgx);
            throw null;
        }
        this.f = new s00(1);
        this.g = new j70(20);
    }

    public gt0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f353a = 1;
        this.g = staggeredGridLayoutManager;
        this.f = new ArrayList();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
        this.e = i;
    }

    public void a() {
        View view = (View) d51.m((ArrayList) this.f, 1);
        gq1 gq1Var = (gq1) view.getLayoutParams();
        this.c = ((StaggeredGridLayoutManager) this.g).r.d(view);
        gq1Var.getClass();
    }

    public void b() {
        ((ArrayList) this.f).clear();
        this.b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public int c() {
        return ((StaggeredGridLayoutManager) this.g).w ? e(r1.size() - 1, -1) : e(0, ((ArrayList) this.f).size());
    }

    public int d() {
        return ((StaggeredGridLayoutManager) this.g).w ? e(0, ((ArrayList) this.f).size()) : e(r1.size() - 1, -1);
    }

    public int e(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        int m = staggeredGridLayoutManager.r.m();
        int i3 = staggeredGridLayoutManager.r.i();
        int i4 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) ((ArrayList) this.f).get(i);
            int g = staggeredGridLayoutManager.r.g(view);
            int d = staggeredGridLayoutManager.r.d(view);
            boolean z = g <= i3;
            boolean z2 = d >= m;
            if (z && z2 && (g < m || d > i3)) {
                return de1.G(view);
            }
            i += i4;
        }
        return -1;
    }

    public Object f(Object obj) {
        synchronized (((j70) this.g)) {
            s00 s00Var = (s00) this.f;
            s00Var.getClass();
            Object obj2 = s00Var.f913a.get(obj);
            if (obj2 != null) {
                this.d++;
                return obj2;
            }
            this.e++;
            return null;
        }
    }

    public int g(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.f).size() == 0) {
            return i;
        }
        a();
        return this.c;
    }

    public View h(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.g;
        ArrayList arrayList = (ArrayList) this.f;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.w && de1.G(view2) >= i) || ((!staggeredGridLayoutManager.w && de1.G(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
            return view;
        }
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            View view3 = (View) arrayList.get(i3);
            if ((staggeredGridLayoutManager.w && de1.G(view3) <= i) || ((!staggeredGridLayoutManager.w && de1.G(view3) >= i) || !view3.hasFocusable())) {
                break;
            }
            i3++;
            view = view3;
        }
        return view;
    }

    public int i(int i) {
        ArrayList arrayList = (ArrayList) this.f;
        int i2 = this.b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        gq1 gq1Var = (gq1) view.getLayoutParams();
        this.b = ((StaggeredGridLayoutManager) this.g).r.g(view);
        gq1Var.getClass();
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ac, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(java.lang.Object r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.g
            j70 r0 = (defpackage.j70) r0
            monitor-enter(r0)
            int r1 = r4.c     // Catch: java.lang.Throwable -> L1e
            int r1 = r1 + 1
            r4.c = r1     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r1 = r4.f     // Catch: java.lang.Throwable -> L1e
            s00 r1 = (defpackage.s00) r1     // Catch: java.lang.Throwable -> L1e
            java.util.LinkedHashMap r1 = r1.f913a     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r5 = r1.put(r5, r6)     // Catch: java.lang.Throwable -> L1e
            if (r5 == 0) goto L21
            int r6 = r4.c     // Catch: java.lang.Throwable -> L1e
            int r6 = r6 + (-1)
            r4.c = r6     // Catch: java.lang.Throwable -> L1e
            goto L21
        L1e:
            r4 = move-exception
            goto Lb7
        L21:
            monitor-exit(r0)
            int r6 = r4.b
        L24:
            java.lang.Object r0 = r4.g
            j70 r0 = (defpackage.j70) r0
            monitor-enter(r0)
            int r1 = r4.c     // Catch: java.lang.Throwable -> L3e
            if (r1 < 0) goto Lad
            java.lang.Object r1 = r4.f     // Catch: java.lang.Throwable -> L3e
            s00 r1 = (defpackage.s00) r1     // Catch: java.lang.Throwable -> L3e
            java.util.LinkedHashMap r1 = r1.f913a     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L41
            int r1 = r4.c     // Catch: java.lang.Throwable -> L3e
            if (r1 != 0) goto Lad
            goto L41
        L3e:
            r4 = move-exception
            goto Lb5
        L41:
            int r1 = r4.c     // Catch: java.lang.Throwable -> L3e
            if (r1 <= r6) goto Lab
            java.lang.Object r1 = r4.f     // Catch: java.lang.Throwable -> L3e
            s00 r1 = (defpackage.s00) r1     // Catch: java.lang.Throwable -> L3e
            java.util.LinkedHashMap r1 = r1.f913a     // Catch: java.lang.Throwable -> L3e
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L52
            goto Lab
        L52:
            java.lang.Object r1 = r4.f     // Catch: java.lang.Throwable -> L3e
            s00 r1 = (defpackage.s00) r1     // Catch: java.lang.Throwable -> L3e
            java.util.LinkedHashMap r1 = r1.f913a     // Catch: java.lang.Throwable -> L3e
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L3e
            r1.getClass()     // Catch: java.lang.Throwable -> L3e
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L3e
            r3 = 0
            if (r2 == 0) goto L73
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L3e
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3e
            if (r2 == 0) goto L6d
            goto L82
        L6d:
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L3e
            goto L82
        L73:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3e
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L3e
            if (r2 != 0) goto L7e
            goto L82
        L7e:
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L3e
        L82:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L3e
            if (r3 != 0) goto L88
            monitor-exit(r0)
            return r5
        L88:
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> L3e
            java.lang.Object r3 = r4.f     // Catch: java.lang.Throwable -> L3e
            s00 r3 = (defpackage.s00) r3     // Catch: java.lang.Throwable -> L3e
            r3.getClass()     // Catch: java.lang.Throwable -> L3e
            r1.getClass()     // Catch: java.lang.Throwable -> L3e
            java.util.LinkedHashMap r3 = r3.f913a     // Catch: java.lang.Throwable -> L3e
            r3.remove(r1)     // Catch: java.lang.Throwable -> L3e
            int r1 = r4.c     // Catch: java.lang.Throwable -> L3e
            r2.getClass()     // Catch: java.lang.Throwable -> L3e
            int r1 = r1 + (-1)
            r4.c = r1     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)
            goto L24
        Lab:
            monitor-exit(r0)
            return r5
        Lad:
            java.lang.String r4 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L3e
            throw r5     // Catch: java.lang.Throwable -> L3e
        Lb5:
            monitor-exit(r0)
            throw r4
        Lb7:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt0.j(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public String toString() {
        String str;
        switch (this.f353a) {
            case 0:
                synchronized (((j70) this.g)) {
                    try {
                        int i = this.d;
                        int i2 = this.e + i;
                        str = "LruCache[maxSize=" + this.b + ",hits=" + this.d + ",misses=" + this.e + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }
}
