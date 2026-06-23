package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class gr0 extends AbstractSet {
    public final /* synthetic */ int g;
    public final /* synthetic */ Map h;

    public /* synthetic */ gr0(int i, Map map) {
        this.g = i;
        this.h = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        int i = this.g;
        Map map = this.h;
        switch (i) {
            case 0:
                ((ir0) map).clear();
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ((ir0) map).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean contains(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.g
            java.util.Map r1 = r3.h
            switch(r0) {
                case 0: goto L13;
                case 1: goto Lc;
                default: goto L7;
            }
        L7:
            boolean r3 = super.contains(r4)
            return r3
        Lc:
            ir0 r1 = (defpackage.ir0) r1
            boolean r3 = r1.containsKey(r4)
            return r3
        L13:
            boolean r3 = r4 instanceof java.util.Map.Entry
            r0 = 0
            if (r3 == 0) goto L3b
            ir0 r1 = (defpackage.ir0) r1
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r3 = r4.getKey()
            r2 = 0
            if (r3 == 0) goto L28
            hr0 r3 = r1.a(r3, r0)     // Catch: java.lang.ClassCastException -> L28
            goto L29
        L28:
            r3 = r2
        L29:
            if (r3 == 0) goto L38
            java.lang.Object r1 = r3.n
            java.lang.Object r4 = r4.getValue()
            boolean r4 = java.util.Objects.equals(r1, r4)
            if (r4 == 0) goto L38
            r2 = r3
        L38:
            if (r2 == 0) goto L3b
            r0 = 1
        L3b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gr0.contains(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.g;
        Map map = this.h;
        switch (i) {
            case 0:
                return new fr0((ir0) map, 0);
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return new fr0((ir0) map, 1);
            default:
                return new n9((p9) map);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean remove(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.g
            r1 = 0
            java.util.Map r2 = r5.h
            r3 = 0
            r4 = 1
            switch(r0) {
                case 0: goto L20;
                case 1: goto Lf;
                default: goto La;
            }
        La:
            boolean r5 = super.remove(r6)
            return r5
        Lf:
            ir0 r2 = (defpackage.ir0) r2
            if (r6 == 0) goto L17
            hr0 r1 = r2.a(r6, r3)     // Catch: java.lang.ClassCastException -> L17
        L17:
            if (r1 == 0) goto L1c
            r2.c(r1, r4)
        L1c:
            if (r1 == 0) goto L1f
            r3 = r4
        L1f:
            return r3
        L20:
            ir0 r2 = (defpackage.ir0) r2
            boolean r5 = r6 instanceof java.util.Map.Entry
            if (r5 != 0) goto L27
            goto L4b
        L27:
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r5 = r6.getKey()
            if (r5 == 0) goto L34
            hr0 r5 = r2.a(r5, r3)     // Catch: java.lang.ClassCastException -> L34
            goto L35
        L34:
            r5 = r1
        L35:
            if (r5 == 0) goto L44
            java.lang.Object r0 = r5.n
            java.lang.Object r6 = r6.getValue()
            boolean r6 = java.util.Objects.equals(r0, r6)
            if (r6 == 0) goto L44
            r1 = r5
        L44:
            if (r1 != 0) goto L47
            goto L4b
        L47:
            r2.c(r1, r4)
            r3 = r4
        L4b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gr0.remove(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.g;
        Map map = this.h;
        switch (i) {
            case 0:
                return ((ir0) map).j;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return ((ir0) map).j;
            default:
                return ((p9) map).i;
        }
    }
}
