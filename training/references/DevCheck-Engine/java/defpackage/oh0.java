package defpackage;

import defpackage.mn0;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

/* loaded from: classes.dex */
public final class oh0 {
    public static final zf o;
    public static final fo0 p;
    public static final oh0 q;
    public static final List r;
    public static final dd0 n = dd0.d;
    public static final int s = 1;
    public static final int t = 1;
    public static final int u = 2;

    /* renamed from: a, reason: collision with root package name */
    public final ba0 f734a = ba0.i;
    public final int j = 1;
    public final int k = s;
    public final HashMap b = new HashMap();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public final int e = 2;
    public final int f = 2;
    public final boolean g = true;
    public final dd0 h = n;
    public final int l = t;
    public final int m = u;
    public final ArrayDeque i = new ArrayDeque();

    static {
        z22 z22Var;
        z22 z22Var2;
        int i = 1;
        zf zfVar = new zf(Collections.EMPTY_MAP, 5, Collections.EMPTY_LIST);
        o = zfVar;
        fo0 fo0Var = new fo0(zfVar);
        p = fo0Var;
        oh0 oh0Var = new oh0();
        q = oh0Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(j32.B);
        int i2 = oh0Var.l;
        arrayList.add(i2 == 1 ? r31.c : new q31(i2));
        arrayList.add(oh0Var.f734a);
        ArrayList arrayList2 = oh0Var.c;
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList(arrayList2);
            Collections.reverse(arrayList3);
            arrayList.addAll(arrayList3);
        }
        ArrayList arrayList4 = oh0Var.d;
        if (!arrayList4.isEmpty()) {
            ArrayList arrayList5 = new ArrayList(arrayList4);
            Collections.reverse(arrayList5);
            arrayList.addAll(arrayList5);
        }
        boolean z = cq1.f149a;
        int i3 = 0;
        mn0.b bVar = null;
        int i4 = oh0Var.e;
        int i5 = oh0Var.f;
        if (i4 != 2 || i5 != 2) {
            z22 z22Var3 = new z22(Date.class, new l10(k10.b, i4, i5), i3);
            if (z) {
                bq1 bq1Var = cq1.c;
                bq1Var.getClass();
                z22Var2 = new z22(bq1Var.f505a, new l10(bq1Var, i4, i5), i3);
                bq1 bq1Var2 = cq1.b;
                bq1Var2.getClass();
                z22Var = new z22(bq1Var2.f505a, new l10(bq1Var2, i4, i5), i3);
            } else {
                z22Var = null;
                z22Var2 = null;
            }
            arrayList.add(z22Var3);
            if (z) {
                arrayList.add(z22Var2);
                arrayList.add(z22Var);
            }
        }
        arrayList.add(j32.r);
        arrayList.add(j32.g);
        arrayList.add(j32.d);
        arrayList.add(j32.e);
        arrayList.add(j32.f);
        if (oh0Var.j == 0) {
            throw null;
        }
        h22 h22Var = j32.k;
        arrayList.add(new a32(Long.TYPE, Long.class, h22Var));
        arrayList.add(new a32(Double.TYPE, Double.class, j32.m));
        arrayList.add(new a32(Float.TYPE, Float.class, j32.l));
        int i6 = oh0Var.m;
        arrayList.add(i6 == 2 ? k31.b : new j31(new k31(i6), i3));
        arrayList.add(j32.h);
        arrayList.add(j32.i);
        Objects.requireNonNull(h22Var);
        arrayList.add(new z22(AtomicLong.class, new g22(h22Var, 1).a(), i3));
        arrayList.add(new z22(AtomicLongArray.class, new g22(h22Var, 0).a(), i3));
        arrayList.add(j32.j);
        arrayList.add(j32.n);
        arrayList.add(j32.s);
        arrayList.add(j32.t);
        arrayList.add(j32.o);
        arrayList.add(j32.p);
        arrayList.add(j32.q);
        arrayList.add(j32.u);
        arrayList.add(j32.v);
        arrayList.add(j32.x);
        arrayList.add(j32.y);
        arrayList.add(j32.A);
        arrayList.add(j32.w);
        arrayList.add(j32.b);
        arrayList.add(l10.c);
        arrayList.add(j32.z);
        try {
            kn0 kn0Var = mn0.f646a;
            ((mn0) ((i32) mn0.class.getDeclaredConstructor(null).newInstance(null))).getClass();
            bVar = mn0.j;
        } catch (LinkageError | ReflectiveOperationException unused) {
        }
        if (bVar != null) {
            arrayList.add(bVar);
        }
        arrayList.addAll(cq1.d);
        arrayList.add(t9.c);
        arrayList.add(j32.f461a);
        arrayList.add(new xr(zfVar, i3));
        arrayList.add(new xr(zfVar, i));
        arrayList.add(fo0Var);
        arrayList.add(j32.C);
        arrayList.add(new lf1(zfVar, oh0Var.k, oh0Var.f734a, fo0Var, a(oh0Var.i)));
        arrayList.trimToSize();
        r = Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List a(AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        if (abstractCollection.size() == 1) {
            return Collections.singletonList(abstractCollection instanceof List ? ((List) abstractCollection).get(0) : abstractCollection.iterator().next());
        }
        return Collections.unmodifiableList(Arrays.asList(abstractCollection.toArray()));
    }
}
