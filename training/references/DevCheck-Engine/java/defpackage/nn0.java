package defpackage;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Map;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class nn0 extends c22 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f692a;
    public final Object b;
    public final c22 c;
    public final Object d;

    public /* synthetic */ nn0(Object obj, c22 c22Var, Object obj2, int i) {
        this.f692a = i;
        this.b = obj;
        this.c = c22Var;
        this.d = obj2;
    }

    public nn0(xr xrVar, nn0 nn0Var, nn0 nn0Var2, l31 l31Var) {
        this.f692a = 1;
        this.b = nn0Var;
        this.c = nn0Var2;
        this.d = l31Var;
    }

    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        ZonedDateTime ofInstant;
        LocalDateTime localDateTime = null;
        Map map = null;
        switch (this.f692a) {
            case 0:
                ro0Var.e();
                ZoneOffset zoneOffset = null;
                ZoneId zoneId = null;
                while (ro0Var.Q() != 4) {
                    switch (ro0Var.K()) {
                        case "offset":
                            zoneOffset = ln0.o(this.c.b(ro0Var));
                            break;
                        case "zone":
                            zoneId = ig0.o(((c22) this.d).b(ro0Var));
                            break;
                        case "dateTime":
                            localDateTime = ln0.k(((b22) this.b).b(ro0Var));
                            break;
                        default:
                            ro0Var.W();
                            break;
                    }
                }
                ro0Var.o();
                mn0.a(localDateTime, "dateTime", ro0Var);
                LocalDateTime u = ln0.u(localDateTime);
                mn0.a(zoneOffset, "offset", ro0Var);
                ZoneOffset v = ln0.v(zoneOffset);
                mn0.a(zoneId, "zone", ro0Var);
                ofInstant = ZonedDateTime.ofInstant(u, v, ln0.m(zoneId));
                return ofInstant;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                int Q = ro0Var.Q();
                if (Q == 9) {
                    ro0Var.M();
                } else {
                    map = (Map) ((l31) this.d).e();
                    if (Q == 1) {
                        ro0Var.a();
                        while (ro0Var.D()) {
                            ro0Var.a();
                            Object b = ((nn0) this.b).c.b(ro0Var);
                            Object b2 = ((nn0) this.c).c.b(ro0Var);
                            if (map.containsKey(b)) {
                                throw new no0("duplicate key: " + b);
                            }
                            map.put(b, b2);
                            ro0Var.m();
                        }
                        ro0Var.m();
                    } else {
                        ro0Var.e();
                        while (ro0Var.D()) {
                            pg0.n.getClass();
                            int i = ro0Var.m;
                            if (i == 0) {
                                i = ro0Var.l();
                            }
                            if (i == 13) {
                                ro0Var.m = 9;
                            } else if (i == 12) {
                                ro0Var.m = 8;
                            } else {
                                if (i != 14) {
                                    throw ro0Var.Y("a name");
                                }
                                ro0Var.m = 10;
                            }
                            Object b3 = ((nn0) this.b).c.b(ro0Var);
                            Object b4 = ((nn0) this.c).c.b(ro0Var);
                            if (map.containsKey(b3)) {
                                throw new no0("duplicate key: " + b3);
                            }
                            map.put(b3, b4);
                        }
                        ro0Var.o();
                    }
                }
                return map;
            default:
                return this.c.b(ro0Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0042, code lost:
    
        if ((r1 instanceof defpackage.hf1) == false) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.reflect.Type] */
    @Override // defpackage.c22
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(defpackage.to0 r4, java.lang.Object r5) {
        /*
            r3 = this;
            int r0 = r3.f692a
            java.lang.Object r1 = r3.b
            java.lang.Object r2 = r3.d
            c22 r3 = r3.c
            switch(r0) {
                case 0: goto L83;
                case 1: goto L4a;
                default: goto Lb;
            }
        Lb:
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            if (r5 == 0) goto L1c
            boolean r0 = r2 instanceof java.lang.Class
            if (r0 != 0) goto L17
            boolean r0 = r2 instanceof java.lang.reflect.TypeVariable
            if (r0 == 0) goto L1c
        L17:
            java.lang.Class r0 = r5.getClass()
            goto L1d
        L1c:
            r0 = r2
        L1d:
            if (r0 == r2) goto L46
            nh0 r1 = (defpackage.nh0) r1
            l32 r2 = new l32
            r2.<init>(r0)
            c22 r0 = r1.b(r2)
            boolean r1 = r0 instanceof defpackage.hf1
            if (r1 != 0) goto L2f
            goto L45
        L2f:
            r1 = r3
        L30:
            boolean r2 = r1 instanceof defpackage.nm1
            if (r2 == 0) goto L40
            r2 = r1
            nm1 r2 = (defpackage.nm1) r2
            c22 r2 = r2.d()
            if (r2 != r1) goto L3e
            goto L40
        L3e:
            r1 = r2
            goto L30
        L40:
            boolean r1 = r1 instanceof defpackage.hf1
            if (r1 != 0) goto L45
            goto L46
        L45:
            r3 = r0
        L46:
            r3.c(r4, r5)
            return
        L4a:
            java.util.Map r5 = (java.util.Map) r5
            if (r5 != 0) goto L52
            r4.D()
            goto L82
        L52:
            r4.j()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L5d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r4.r(r1)
            r1 = r3
            nn0 r1 = (defpackage.nn0) r1
            java.lang.Object r0 = r0.getValue()
            r1.c(r4, r0)
            goto L5d
        L7f:
            r4.o()
        L82:
            return
        L83:
            java.time.ZonedDateTime r5 = defpackage.ln0.q(r5)
            if (r5 != 0) goto L8d
            r4.D()
            goto Lbb
        L8d:
            r4.j()
            java.lang.String r0 = "dateTime"
            r4.r(r0)
            b22 r1 = (defpackage.b22) r1
            java.time.LocalDateTime r0 = defpackage.ln0.l(r5)
            r1.c(r4, r0)
            java.lang.String r0 = "offset"
            r4.r(r0)
            java.time.ZoneOffset r0 = defpackage.ln0.p(r5)
            r3.c(r4, r0)
            java.lang.String r3 = "zone"
            r4.r(r3)
            c22 r2 = (defpackage.c22) r2
            java.time.ZoneId r3 = defpackage.ln0.n(r5)
            r2.c(r4, r3)
            r4.o()
        Lbb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nn0.c(to0, java.lang.Object):void");
    }
}
