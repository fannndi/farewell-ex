package defpackage;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class v12 {
    public static final String[] l = {"INSERT", "UPDATE", "DELETE"};

    /* renamed from: a, reason: collision with root package name */
    public final dh1 f1065a;
    public final HashMap b;
    public final HashMap c;
    public final boolean d;
    public final dn0 e;
    public final String[] g;
    public final oj h;
    public final h70 i;
    public final AtomicBoolean j = new AtomicBoolean(false);
    public af0 k = new re0(4);
    public final LinkedHashMap f = new LinkedHashMap();

    public v12(dh1 dh1Var, HashMap hashMap, HashMap hashMap2, String[] strArr, boolean z, dn0 dn0Var) {
        String str;
        this.f1065a = dh1Var;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = z;
        this.e = dn0Var;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr[i];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            this.f.put(lowerCase, Integer.valueOf(i));
            String str3 = (String) this.b.get(strArr[i]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                str.getClass();
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.g = strArr2;
        for (Map.Entry entry : this.b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = str4.toLowerCase(locale2);
            lowerCase2.getClass();
            if (this.f.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                lowerCase3.getClass();
                LinkedHashMap linkedHashMap = this.f;
                linkedHashMap.put(lowerCase3, ju0.S(linkedHashMap, lowerCase2));
            }
        }
        int length2 = this.g.length;
        oj ojVar = new oj();
        ojVar.b = new ReentrantLock();
        ojVar.c = new long[length2];
        ojVar.d = new boolean[length2];
        this.h = ojVar;
        int length3 = this.g.length;
        h70 h70Var = new h70();
        h70Var.g = new zq1(new int[length3]);
        this.i = h70Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (r4 == r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.v12 r4, defpackage.v71 r5, defpackage.ex r6) {
        /*
            boolean r0 = r6 instanceof defpackage.m12
            if (r0 == 0) goto L13
            r0 = r6
            m12 r0 = (defpackage.m12) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            m12 r0 = new m12
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.k
            int r6 = r0.m
            r1 = 2
            r2 = 1
            zx r3 = defpackage.zx.g
            if (r6 == 0) goto L3d
            if (r6 == r2) goto L35
            if (r6 != r1) goto L2e
            java.lang.Object r5 = r0.j
            java.util.Set r5 = (java.util.Set) r5
            defpackage.om0.O(r4)
            return r5
        L2e:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.n(r4)
            r4 = 0
            return r4
        L35:
            java.lang.Object r5 = r0.j
            v71 r5 = (defpackage.v71) r5
            defpackage.om0.O(r4)
            goto L53
        L3d:
            defpackage.om0.O(r4)
            ub r4 = new ub
            r6 = 5
            r4.<init>(r6)
            r0.j = r5
            r0.m = r2
            java.lang.String r6 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1"
            java.lang.Object r4 = r5.d(r6, r4, r0)
            if (r4 != r3) goto L53
            goto L67
        L53:
            java.util.Set r4 = (java.util.Set) r4
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L68
            r0.j = r4
            r0.m = r1
            java.lang.String r6 = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1"
            java.lang.Object r5 = defpackage.xc1.n(r5, r6, r0)
            if (r5 != r3) goto L68
        L67:
            return r3
        L68:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v12.a(v12, v71, ex):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0080 A[Catch: all -> 0x008b, TRY_LEAVE, TryCatch #1 {all -> 0x008b, blocks: (B:13:0x0078, B:15:0x0080, B:32:0x0045, B:36:0x0052, B:40:0x0064), top: B:31:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.v12 r8, defpackage.ex r9) {
        /*
            dh1 r0 = r8.f1065a
            boolean r1 = r9 instanceof defpackage.p12
            if (r1 == 0) goto L15
            r1 = r9
            p12 r1 = (defpackage.p12) r1
            int r2 = r1.n
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.n = r2
            goto L1a
        L15:
            p12 r1 = new p12
            r1.<init>(r8, r9)
        L1a:
            java.lang.Object r9 = r1.l
            int r2 = r1.n
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 != r4) goto L32
            xi0 r8 = r1.k
            v12 r0 = r1.j
            defpackage.om0.O(r9)     // Catch: java.lang.Throwable -> L30
            r7 = r9
            r9 = r8
            r8 = r0
            r0 = r7
            goto L78
        L30:
            r9 = move-exception
            goto L94
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.n(r8)
            return r3
        L38:
            defpackage.om0.O(r9)
            xi0 r9 = r0.g
            boolean r2 = r9.c()
            r80 r5 = defpackage.r80.g
            if (r2 == 0) goto L98
            java.util.concurrent.atomic.AtomicBoolean r2 = r8.j     // Catch: java.lang.Throwable -> L8b
            r6 = 0
            boolean r2 = r2.compareAndSet(r4, r6)     // Catch: java.lang.Throwable -> L8b
            if (r2 != 0) goto L52
            r9.k()
            return r5
        L52:
            af0 r2 = r8.k     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r2 = r2.a()     // Catch: java.lang.Throwable -> L8b
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L8b
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L8b
            if (r2 != 0) goto L64
            r9.k()
            return r5
        L64:
            q12 r2 = new q12     // Catch: java.lang.Throwable -> L8b
            r2.<init>(r8, r3, r4)     // Catch: java.lang.Throwable -> L8b
            r1.j = r8     // Catch: java.lang.Throwable -> L8b
            r1.k = r9     // Catch: java.lang.Throwable -> L8b
            r1.n = r4     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r0 = r0.w(r6, r2, r1)     // Catch: java.lang.Throwable -> L8b
            zx r1 = defpackage.zx.g
            if (r0 != r1) goto L78
            return r1
        L78:
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L8b
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L8b
            if (r1 != 0) goto L90
            h70 r1 = r8.i     // Catch: java.lang.Throwable -> L8b
            r1.p(r0)     // Catch: java.lang.Throwable -> L8b
            dn0 r8 = r8.e     // Catch: java.lang.Throwable -> L8b
            r8.j(r0)     // Catch: java.lang.Throwable -> L8b
            goto L90
        L8b:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L94
        L90:
            r9.k()
            return r0
        L94:
            r8.k()
            throw r9
        L98:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v12.b(v12, ex):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e6, code lost:
    
        if (defpackage.xc1.n(r6, r15, r0) == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e8, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        if (r15 == r4) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r13v6, types: [v71] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00e6 -> B:11:0x00e9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.v12 r12, defpackage.u02 r13, int r14, defpackage.ex r15) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v12.c(v12, u02, int, ex):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r3v5, types: [v71] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x008c -> B:10:0x008f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.v12 r7, defpackage.u02 r8, int r9, defpackage.ex r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof defpackage.s12
            if (r0 == 0) goto L16
            r0 = r10
            s12 r0 = (defpackage.s12) r0
            int r1 = r0.q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.q = r1
            goto L1b
        L16:
            s12 r0 = new s12
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.o
            int r1 = r0.q
            r2 = 1
            if (r1 == 0) goto L3b
            if (r1 != r2) goto L34
            int r7 = r0.n
            int r8 = r0.m
            java.lang.String[] r9 = r0.l
            java.lang.String r1 = r0.k
            v71 r3 = r0.j
            defpackage.om0.O(r10)
            r10 = r9
            r9 = r3
            goto L8f
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.n(r7)
            r7 = 0
            return r7
        L3b:
            defpackage.om0.O(r10)
            java.lang.String[] r7 = r7.g
            r7 = r7[r9]
            java.lang.String[] r9 = defpackage.v12.l
            r10 = 0
            r1 = 3
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L4d:
            if (r8 >= r7) goto L91
            r3 = r10[r8]
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "room_table_modification_trigger_"
            r4.<init>(r5)
            r4.append(r1)
            r5 = 95
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "DROP TRIGGER IF EXISTS `"
            r4.<init>(r5)
            r4.append(r3)
            r3 = 96
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.j = r9
            r0.k = r1
            r0.l = r10
            r0.m = r8
            r0.n = r7
            r0.q = r2
            java.lang.Object r3 = defpackage.xc1.n(r9, r3, r0)
            zx r4 = defpackage.zx.g
            if (r3 != r4) goto L8f
            return r4
        L8f:
            int r8 = r8 + r2
            goto L4d
        L91:
            e42 r7 = defpackage.e42.f219a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v12.d(v12, u02, int, ex):java.lang.Object");
    }

    public final void e(af0 af0Var, af0 af0Var2) {
        af0Var.getClass();
        af0Var2.getClass();
        if (this.j.compareAndSet(false, true)) {
            af0Var.a();
            ju0.X(this.f1065a.i(), new ux(), null, new od(this, af0Var2, null, 6), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.ex r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.t12
            if (r0 == 0) goto L13
            r0 = r7
            t12 r0 = (defpackage.t12) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            t12 r0 = new t12
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.k
            int r1 = r0.m
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            xi0 r6 = r0.j
            defpackage.om0.O(r7)     // Catch: java.lang.Throwable -> L28
            goto L52
        L28:
            r7 = move-exception
            goto L58
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.c.n(r6)
            return r2
        L30:
            defpackage.om0.O(r7)
            dh1 r7 = r6.f1065a
            xi0 r1 = r7.g
            boolean r4 = r1.c()
            if (r4 == 0) goto L5c
            q12 r4 = new q12     // Catch: java.lang.Throwable -> L56
            r5 = 2
            r4.<init>(r6, r2, r5)     // Catch: java.lang.Throwable -> L56
            r0.j = r1     // Catch: java.lang.Throwable -> L56
            r0.m = r3     // Catch: java.lang.Throwable -> L56
            r6 = 0
            java.lang.Object r6 = r7.w(r6, r4, r0)     // Catch: java.lang.Throwable -> L56
            zx r7 = defpackage.zx.g
            if (r6 != r7) goto L51
            return r7
        L51:
            r6 = r1
        L52:
            r6.k()
            goto L5c
        L56:
            r7 = move-exception
            r6 = r1
        L58:
            r6.k()
            throw r7
        L5c:
            e42 r6 = defpackage.e42.f219a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v12.f(ex):java.lang.Object");
    }

    public final z51 g(String[] strArr) {
        xm1 xm1Var = new xm1();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Set set = (Set) this.c.get(lowerCase);
            if (set != null) {
                xm1Var.addAll(set);
            } else {
                xm1Var.add(str);
            }
        }
        String[] strArr2 = (String[]) xc1.d(xm1Var).toArray(new String[0]);
        int length = strArr2.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArr2[i];
            String lowerCase2 = str2.toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            Integer num = (Integer) this.f.get(lowerCase2);
            if (num == null) {
                c.m("There is no table with name ".concat(str2));
                return null;
            }
            iArr[i] = num.intValue();
        }
        return new z51(strArr2, iArr);
    }
}
