package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class ev {
    public int b;
    public boolean c;
    public final iw d;
    public final int e;
    public ev f;
    public kp1 i;

    /* renamed from: a, reason: collision with root package name */
    public HashSet f250a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public ev(iw iwVar, int i) {
        this.d = iwVar;
        this.e = i;
    }

    public final void a(ev evVar, int i) {
        b(evVar, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(ev evVar, int i, int i2, boolean z) {
        if (evVar == null) {
            j();
            return true;
        }
        if (!z && !i(evVar)) {
            return false;
        }
        this.f = evVar;
        if (evVar.f250a == null) {
            evVar.f250a = new HashSet();
        }
        HashSet hashSet = this.f.f250a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, n92 n92Var, ArrayList arrayList) {
        HashSet hashSet = this.f250a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                sl.q(((ev) it.next()).d, i, arrayList, n92Var);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        ev evVar;
        if (this.d.g0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (evVar = this.f) == null || evVar.d.g0 != 8) ? this.g : i;
    }

    public final ev f() {
        int i = this.e;
        int A = d51.A(i);
        iw iwVar = this.d;
        switch (A) {
            case 0:
            case 5:
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
            case 8:
                return null;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return iwVar.K;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return iwVar.L;
            case 3:
                return iwVar.I;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return iwVar.J;
            default:
                throw new AssertionError(d51.z(i));
        }
    }

    public final boolean g() {
        HashSet hashSet = this.f250a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((ev) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0063 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean i(defpackage.ev r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L5
            goto L65
        L5:
            iw r1 = r10.d
            int r10 = r10.e
            r2 = 6
            int r3 = r9.e
            r4 = 1
            if (r10 != r3) goto L1c
            if (r3 != r2) goto L63
            boolean r10 = r1.E
            if (r10 == 0) goto L65
            iw r9 = r9.d
            boolean r9 = r9.E
            if (r9 != 0) goto L63
            goto L65
        L1c:
            int r9 = defpackage.d51.A(r3)
            r5 = 4
            r6 = 2
            r7 = 9
            r8 = 8
            switch(r9) {
                case 0: goto L65;
                case 1: goto L53;
                case 2: goto L3f;
                case 3: goto L53;
                case 4: goto L3f;
                case 5: goto L3a;
                case 6: goto L33;
                case 7: goto L65;
                case 8: goto L65;
                default: goto L29;
            }
        L29:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            java.lang.String r10 = defpackage.d51.z(r3)
            r9.<init>(r10)
            throw r9
        L33:
            if (r10 == r2) goto L65
            if (r10 == r8) goto L65
            if (r10 == r7) goto L65
            goto L63
        L3a:
            if (r10 == r6) goto L65
            if (r10 != r5) goto L63
            goto L65
        L3f:
            r9 = 3
            if (r10 == r9) goto L48
            r9 = 5
            if (r10 != r9) goto L46
            goto L48
        L46:
            r9 = r0
            goto L49
        L48:
            r9 = r4
        L49:
            boolean r1 = r1 instanceof defpackage.sh0
            if (r1 == 0) goto L52
            if (r9 != 0) goto L63
            if (r10 != r7) goto L65
            goto L63
        L52:
            return r9
        L53:
            if (r10 == r6) goto L5a
            if (r10 != r5) goto L58
            goto L5a
        L58:
            r9 = r0
            goto L5b
        L5a:
            r9 = r4
        L5b:
            boolean r1 = r1 instanceof defpackage.sh0
            if (r1 == 0) goto L64
            if (r9 != 0) goto L63
            if (r10 != r8) goto L65
        L63:
            return r4
        L64:
            return r9
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ev.i(ev):boolean");
    }

    public final void j() {
        HashSet hashSet;
        ev evVar = this.f;
        if (evVar != null && (hashSet = evVar.f250a) != null) {
            hashSet.remove(this);
            if (this.f.f250a.size() == 0) {
                this.f.f250a = null;
            }
        }
        this.f250a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        kp1 kp1Var = this.i;
        if (kp1Var == null) {
            this.i = new kp1(1);
        } else {
            kp1Var.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.h0 + ":" + d51.z(this.e);
    }
}
