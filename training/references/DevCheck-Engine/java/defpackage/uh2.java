package defpackage;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public abstract class uh2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Collector f1042a;

    static {
        final int i = 0;
        final int i2 = 0;
        final int i3 = 1;
        final int i4 = 1;
        f1042a = Collector.of(new Supplier() { // from class: oh2
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i) {
                    case 0:
                        return new mi2();
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        return new vi2();
                    default:
                        return new si2();
                }
            }
        }, new BiConsumer() { // from class: rh2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i2) {
                    case 0:
                        ((mi2) obj).a(obj2);
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        vi2 vi2Var = (vi2) obj;
                        vi2Var.getClass();
                        obj2.getClass();
                        vi2Var.a(obj2);
                        break;
                    default:
                        si2 si2Var = (si2) obj;
                        fj2 fj2Var = (fj2) obj2;
                        si2Var.getClass();
                        if (!fj2Var.g.equals(fj2Var.h)) {
                            si2Var.f939a.add(fj2Var);
                            break;
                        } else {
                            c.m(rt0.O("range must not be empty, but was %s", fj2Var));
                            break;
                        }
                }
            }
        }, new BinaryOperator() { // from class: ph2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                int i5 = 0;
                switch (i3) {
                    case 0:
                        si2 si2Var = (si2) obj;
                        si2Var.getClass();
                        ArrayList arrayList = ((si2) obj2).f939a;
                        int size = arrayList.size();
                        while (i5 < size) {
                            Object obj3 = arrayList.get(i5);
                            i5++;
                            fj2 fj2Var = (fj2) obj3;
                            if (fj2Var.g.equals(fj2Var.h)) {
                                c.m(rt0.O("range must not be empty, but was %s", fj2Var));
                                return null;
                            }
                            si2Var.f939a.add(fj2Var);
                        }
                        return si2Var;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        mi2 mi2Var = (mi2) obj;
                        mi2 mi2Var2 = (mi2) obj2;
                        Object[] objArr = mi2Var2.f434a;
                        int i6 = mi2Var2.b;
                        for (int i7 = 0; i7 < i6; i7++) {
                            mi2Var.getClass();
                            if (objArr[i7] == null) {
                                jw0.f(d51.q("at index ", i7));
                                return null;
                            }
                        }
                        mi2Var.c(i6);
                        System.arraycopy(objArr, 0, mi2Var.f434a, mi2Var.b, i6);
                        mi2Var.b += i6;
                        return mi2Var;
                    default:
                        vi2 vi2Var = (vi2) obj;
                        vi2 vi2Var2 = (vi2) obj2;
                        Object[] objArr2 = vi2Var2.f434a;
                        int i8 = vi2Var2.b;
                        for (int i9 = 0; i9 < i8; i9++) {
                            vi2Var.getClass();
                            if (objArr2[i9] == null) {
                                jw0.f(d51.q("at index ", i9));
                                return null;
                            }
                        }
                        vi2Var.c(i8);
                        System.arraycopy(objArr2, 0, vi2Var.f434a, vi2Var.b, i8);
                        vi2Var.b += i8;
                        return vi2Var;
                }
            }
        }, new Function() { // from class: qh2
            /* JADX WARN: Removed duplicated region for block: B:76:0x012c  */
            /* JADX WARN: Removed duplicated region for block: B:79:0x0130 A[SYNTHETIC] */
            @Override // java.util.function.Function
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object apply(java.lang.Object r13) {
                /*
                    Method dump skipped, instructions count: 428
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qh2.apply(java.lang.Object):java.lang.Object");
            }
        }, new Collector.Characteristics[0]);
        final int i5 = 1;
        final int i6 = 1;
        final int i7 = 2;
        final int i8 = 2;
        Collector.of(new Supplier() { // from class: oh2
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i5) {
                    case 0:
                        return new mi2();
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        return new vi2();
                    default:
                        return new si2();
                }
            }
        }, new BiConsumer() { // from class: rh2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i6) {
                    case 0:
                        ((mi2) obj).a(obj2);
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        vi2 vi2Var = (vi2) obj;
                        vi2Var.getClass();
                        obj2.getClass();
                        vi2Var.a(obj2);
                        break;
                    default:
                        si2 si2Var = (si2) obj;
                        fj2 fj2Var = (fj2) obj2;
                        si2Var.getClass();
                        if (!fj2Var.g.equals(fj2Var.h)) {
                            si2Var.f939a.add(fj2Var);
                            break;
                        } else {
                            c.m(rt0.O("range must not be empty, but was %s", fj2Var));
                            break;
                        }
                }
            }
        }, new BinaryOperator() { // from class: ph2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                int i52 = 0;
                switch (i7) {
                    case 0:
                        si2 si2Var = (si2) obj;
                        si2Var.getClass();
                        ArrayList arrayList = ((si2) obj2).f939a;
                        int size = arrayList.size();
                        while (i52 < size) {
                            Object obj3 = arrayList.get(i52);
                            i52++;
                            fj2 fj2Var = (fj2) obj3;
                            if (fj2Var.g.equals(fj2Var.h)) {
                                c.m(rt0.O("range must not be empty, but was %s", fj2Var));
                                return null;
                            }
                            si2Var.f939a.add(fj2Var);
                        }
                        return si2Var;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        mi2 mi2Var = (mi2) obj;
                        mi2 mi2Var2 = (mi2) obj2;
                        Object[] objArr = mi2Var2.f434a;
                        int i62 = mi2Var2.b;
                        for (int i72 = 0; i72 < i62; i72++) {
                            mi2Var.getClass();
                            if (objArr[i72] == null) {
                                jw0.f(d51.q("at index ", i72));
                                return null;
                            }
                        }
                        mi2Var.c(i62);
                        System.arraycopy(objArr, 0, mi2Var.f434a, mi2Var.b, i62);
                        mi2Var.b += i62;
                        return mi2Var;
                    default:
                        vi2 vi2Var = (vi2) obj;
                        vi2 vi2Var2 = (vi2) obj2;
                        Object[] objArr2 = vi2Var2.f434a;
                        int i82 = vi2Var2.b;
                        for (int i9 = 0; i9 < i82; i9++) {
                            vi2Var.getClass();
                            if (objArr2[i9] == null) {
                                jw0.f(d51.q("at index ", i9));
                                return null;
                            }
                        }
                        vi2Var.c(i82);
                        System.arraycopy(objArr2, 0, vi2Var.f434a, vi2Var.b, i82);
                        vi2Var.b += i82;
                        return vi2Var;
                }
            }
        }, new Function() { // from class: qh2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                /*
                    Method dump skipped, instructions count: 428
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qh2.apply(java.lang.Object):java.lang.Object");
            }
        }, new Collector.Characteristics[0]);
        final int i9 = 2;
        final int i10 = 2;
        final int i11 = 0;
        final int i12 = 0;
        Collector.of(new Supplier() { // from class: oh2
            @Override // java.util.function.Supplier
            public final Object get() {
                switch (i9) {
                    case 0:
                        return new mi2();
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        return new vi2();
                    default:
                        return new si2();
                }
            }
        }, new BiConsumer() { // from class: rh2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((mi2) obj).a(obj2);
                        break;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        vi2 vi2Var = (vi2) obj;
                        vi2Var.getClass();
                        obj2.getClass();
                        vi2Var.a(obj2);
                        break;
                    default:
                        si2 si2Var = (si2) obj;
                        fj2 fj2Var = (fj2) obj2;
                        si2Var.getClass();
                        if (!fj2Var.g.equals(fj2Var.h)) {
                            si2Var.f939a.add(fj2Var);
                            break;
                        } else {
                            c.m(rt0.O("range must not be empty, but was %s", fj2Var));
                            break;
                        }
                }
            }
        }, new BinaryOperator() { // from class: ph2
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                int i52 = 0;
                switch (i11) {
                    case 0:
                        si2 si2Var = (si2) obj;
                        si2Var.getClass();
                        ArrayList arrayList = ((si2) obj2).f939a;
                        int size = arrayList.size();
                        while (i52 < size) {
                            Object obj3 = arrayList.get(i52);
                            i52++;
                            fj2 fj2Var = (fj2) obj3;
                            if (fj2Var.g.equals(fj2Var.h)) {
                                c.m(rt0.O("range must not be empty, but was %s", fj2Var));
                                return null;
                            }
                            si2Var.f939a.add(fj2Var);
                        }
                        return si2Var;
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        mi2 mi2Var = (mi2) obj;
                        mi2 mi2Var2 = (mi2) obj2;
                        Object[] objArr = mi2Var2.f434a;
                        int i62 = mi2Var2.b;
                        for (int i72 = 0; i72 < i62; i72++) {
                            mi2Var.getClass();
                            if (objArr[i72] == null) {
                                jw0.f(d51.q("at index ", i72));
                                return null;
                            }
                        }
                        mi2Var.c(i62);
                        System.arraycopy(objArr, 0, mi2Var.f434a, mi2Var.b, i62);
                        mi2Var.b += i62;
                        return mi2Var;
                    default:
                        vi2 vi2Var = (vi2) obj;
                        vi2 vi2Var2 = (vi2) obj2;
                        Object[] objArr2 = vi2Var2.f434a;
                        int i82 = vi2Var2.b;
                        for (int i92 = 0; i92 < i82; i92++) {
                            vi2Var.getClass();
                            if (objArr2[i92] == null) {
                                jw0.f(d51.q("at index ", i92));
                                return null;
                            }
                        }
                        vi2Var.c(i82);
                        System.arraycopy(objArr2, 0, vi2Var.f434a, vi2Var.b, i82);
                        vi2Var.b += i82;
                        return vi2Var;
                }
            }
        }, new Function() { // from class: qh2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                /*
                    Method dump skipped, instructions count: 428
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.qh2.apply(java.lang.Object):java.lang.Object");
            }
        }, new Collector.Characteristics[0]);
    }
}
