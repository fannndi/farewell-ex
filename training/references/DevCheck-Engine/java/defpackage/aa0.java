package defpackage;

/* loaded from: classes.dex */
public final class aa0 extends c22 {

    /* renamed from: a, reason: collision with root package name */
    public volatile c22 f18a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ nh0 d;
    public final /* synthetic */ l32 e;
    public final /* synthetic */ ba0 f;

    public aa0(ba0 ba0Var, boolean z, boolean z2, nh0 nh0Var, l32 l32Var) {
        this.f = ba0Var;
        this.b = z;
        this.c = z2;
        this.d = nh0Var;
        this.e = l32Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002a, code lost:
    
        if (r8 == r2) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005f, code lost:
    
        if (r8 == r2) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083 A[SYNTHETIC] */
    @Override // defpackage.c22
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ro0 r12) {
        /*
            r11 = this;
            boolean r0 = r11.b
            r1 = 0
            if (r0 == 0) goto L9
            r12.W()
            return r1
        L9:
            c22 r0 = r11.f18a
            if (r0 != 0) goto L92
            nh0 r0 = r11.d
            ba0 r2 = r11.f
            l32 r3 = r11.e
            fo0 r4 = r0.d
            r4.getClass()
            java.util.concurrent.ConcurrentHashMap r5 = r4.h
            eo0 r6 = defpackage.fo0.i
            r7 = 1
            if (r2 != r6) goto L20
            goto L61
        L20:
            java.lang.Class r6 = r3.f569a
            java.lang.Object r8 = r5.get(r6)
            d22 r8 = (defpackage.d22) r8
            if (r8 == 0) goto L2d
            if (r8 != r2) goto L62
            goto L61
        L2d:
            java.lang.Class<do0> r8 = defpackage.do0.class
            java.lang.annotation.Annotation r8 = r6.getAnnotation(r8)
            do0 r8 = (defpackage.do0) r8
            if (r8 != 0) goto L38
            goto L62
        L38:
            java.lang.Class r8 = r8.value()
            java.lang.Class<d22> r9 = defpackage.d22.class
            boolean r9 = r9.isAssignableFrom(r8)
            if (r9 != 0) goto L45
            goto L62
        L45:
            zf r9 = r4.g
            l32 r10 = new l32
            r10.<init>(r8)
            l31 r8 = r9.z(r10, r7)
            java.lang.Object r8 = r8.e()
            d22 r8 = (defpackage.d22) r8
            java.lang.Object r5 = r5.putIfAbsent(r6, r8)
            d22 r5 = (defpackage.d22) r5
            if (r5 == 0) goto L5f
            r8 = r5
        L5f:
            if (r8 != r2) goto L62
        L61:
            r2 = r4
        L62:
            java.util.List r4 = r0.e
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L69:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L83
            java.lang.Object r6 = r4.next()
            d22 r6 = (defpackage.d22) r6
            if (r5 != 0) goto L7b
            if (r6 != r2) goto L69
            r5 = r7
            goto L69
        L7b:
            c22 r6 = r6.a(r0, r3)
            if (r6 == 0) goto L69
            r0 = r6
            goto L89
        L83:
            if (r5 != 0) goto L8c
            c22 r0 = r0.b(r3)
        L89:
            r11.f18a = r0
            goto L92
        L8c:
            java.lang.String r11 = "GSON cannot serialize or deserialize "
            defpackage.rw.o(r11, r3)
            return r1
        L92:
            java.lang.Object r11 = r0.b(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa0.b(ro0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x005e, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082 A[SYNTHETIC] */
    @Override // defpackage.c22
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.to0 r11, java.lang.Object r12) {
        /*
            r10 = this;
            boolean r0 = r10.c
            if (r0 == 0) goto L8
            r11.D()
            return
        L8:
            c22 r0 = r10.f18a
            if (r0 != 0) goto L91
            nh0 r0 = r10.d
            ba0 r1 = r10.f
            l32 r2 = r10.e
            fo0 r3 = r0.d
            r3.getClass()
            java.util.concurrent.ConcurrentHashMap r4 = r3.h
            eo0 r5 = defpackage.fo0.i
            r6 = 1
            if (r1 != r5) goto L1f
            goto L60
        L1f:
            java.lang.Class r5 = r2.f569a
            java.lang.Object r7 = r4.get(r5)
            d22 r7 = (defpackage.d22) r7
            if (r7 == 0) goto L2c
            if (r7 != r1) goto L61
            goto L60
        L2c:
            java.lang.Class<do0> r7 = defpackage.do0.class
            java.lang.annotation.Annotation r7 = r5.getAnnotation(r7)
            do0 r7 = (defpackage.do0) r7
            if (r7 != 0) goto L37
            goto L61
        L37:
            java.lang.Class r7 = r7.value()
            java.lang.Class<d22> r8 = defpackage.d22.class
            boolean r8 = r8.isAssignableFrom(r7)
            if (r8 != 0) goto L44
            goto L61
        L44:
            zf r8 = r3.g
            l32 r9 = new l32
            r9.<init>(r7)
            l31 r7 = r8.z(r9, r6)
            java.lang.Object r7 = r7.e()
            d22 r7 = (defpackage.d22) r7
            java.lang.Object r4 = r4.putIfAbsent(r5, r7)
            d22 r4 = (defpackage.d22) r4
            if (r4 == 0) goto L5e
            r7 = r4
        L5e:
            if (r7 != r1) goto L61
        L60:
            r1 = r3
        L61:
            java.util.List r3 = r0.e
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L68:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L82
            java.lang.Object r5 = r3.next()
            d22 r5 = (defpackage.d22) r5
            if (r4 != 0) goto L7a
            if (r5 != r1) goto L68
            r4 = r6
            goto L68
        L7a:
            c22 r5 = r5.a(r0, r2)
            if (r5 == 0) goto L68
            r0 = r5
            goto L88
        L82:
            if (r4 != 0) goto L8b
            c22 r0 = r0.b(r2)
        L88:
            r10.f18a = r0
            goto L91
        L8b:
            java.lang.String r10 = "GSON cannot serialize or deserialize "
            defpackage.rw.o(r10, r2)
            return
        L91:
            r0.c(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aa0.c(to0, java.lang.Object):void");
    }
}
