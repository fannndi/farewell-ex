package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class hp extends nl1 {
    public final bm g;
    public final /* synthetic */ AtomicReferenceArray h;

    public hp(long j, hp hpVar, bm bmVar, int i) {
        super(j, hpVar, i);
        this.g = bmVar;
        this.h = new AtomicReferenceArray(dm.b * 2);
    }

    @Override // defpackage.nl1
    public final int k() {
        return dm.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0047, code lost:
    
        r(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004a, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x004c, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // defpackage.nl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r5, defpackage.qx r6) {
        /*
            r4 = this;
            int r6 = defpackage.dm.b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.h
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.p(r5)
            boolean r1 = r6 instanceof defpackage.f92
            bm r2 = r4.g
            r3 = 0
            if (r1 != 0) goto L50
            boolean r1 = r6 instanceof defpackage.g92
            if (r1 == 0) goto L21
            goto L50
        L21:
            o1 r1 = defpackage.dm.j
            if (r6 == r1) goto L47
            o1 r1 = defpackage.dm.k
            if (r6 != r1) goto L2a
            goto L47
        L2a:
            o1 r1 = defpackage.dm.g
            if (r6 == r1) goto L11
            o1 r1 = defpackage.dm.f
            if (r6 != r1) goto L33
            goto L11
        L33:
            o1 r4 = defpackage.dm.i
            if (r6 == r4) goto L6a
            o1 r4 = defpackage.dm.d
            if (r6 != r4) goto L3c
            goto L6a
        L3c:
            o1 r4 = defpackage.dm.l
            if (r6 != r4) goto L41
            goto L6a
        L41:
            java.lang.String r4 = "unexpected state: "
            defpackage.rw.m(r4, r6)
            return
        L47:
            r4.r(r5, r3)
            if (r0 == 0) goto L6a
            r2.getClass()
            return
        L50:
            if (r0 == 0) goto L55
            o1 r1 = defpackage.dm.j
            goto L57
        L55:
            o1 r1 = defpackage.dm.k
        L57:
            boolean r6 = r4.o(r6, r5, r1)
            if (r6 == 0) goto L11
            r4.r(r5, r3)
            r6 = r0 ^ 1
            r4.q(r5, r6)
            if (r0 == 0) goto L6a
            r2.getClass()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hp.l(int, qx):void");
    }

    public final boolean o(Object obj, int i, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.h;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object p(int i) {
        return this.h.get((i * 2) + 1);
    }

    public final void q(int i, boolean z) {
        if (z) {
            bm bmVar = this.g;
            bmVar.getClass();
            bmVar.N((this.e * dm.b) + i);
        }
        m();
    }

    public final void r(int i, Object obj) {
        this.h.set(i * 2, obj);
    }

    public final void s(int i, Object obj) {
        this.h.set((i * 2) + 1, obj);
    }
}
