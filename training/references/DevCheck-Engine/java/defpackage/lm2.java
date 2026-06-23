package defpackage;

import com.google.android.material.card.ZyJo.nTAZxGMqQtZZAQ;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.impl.SimpleLog;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class lm2 implements rm2 {
    public static final int[] j = new int[0];
    public static final Unsafe k = en2.i();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f598a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final dl2 e;
    public final int[] f;
    public final int g;
    public final int h;
    public final x42 i;

    public lm2(int[] iArr, Object[] objArr, int i, int i2, dl2 dl2Var, int[] iArr2, int i3, int i4, x42 x42Var, m52 m52Var) {
        this.f598a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = iArr2;
        this.g = i3;
        this.h = i4;
        this.i = x42Var;
        this.e = dl2Var;
    }

    public static Field E(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    public static boolean r(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof vl2) {
            return ((vl2) obj).c();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0277  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.lm2 u(defpackage.qm2 r35, defpackage.x42 r36, defpackage.m52 r37) {
        /*
            Method dump skipped, instructions count: 1050
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm2.u(qm2, x42, m52):lm2");
    }

    public static int v(long j2, Object obj) {
        return ((Integer) en2.h(j2, obj)).intValue();
    }

    public static int x(int i) {
        return (i >>> 20) & 255;
    }

    public static long z(long j2, Object obj) {
        return ((Long) en2.h(j2, obj)).longValue();
    }

    public final cl2 A(int i) {
        int i2 = i / 3;
        return (cl2) this.b[i2 + i2 + 1];
    }

    public final rm2 B(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        rm2 rm2Var = (rm2) objArr[i3];
        if (rm2Var != null) {
            return rm2Var;
        }
        rm2 a2 = om2.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = a2;
        return a2;
    }

    public final Object C(int i, Object obj) {
        rm2 B = B(i);
        int y = y(i) & 1048575;
        if (!p(i, obj)) {
            return B.c();
        }
        Object object = k.getObject(obj, y);
        if (r(object)) {
            return object;
        }
        vl2 c = B.c();
        if (object != null) {
            B.b(c, object);
        }
        return c;
    }

    public final Object D(int i, int i2, Object obj) {
        rm2 B = B(i2);
        if (!s(i, i2, obj)) {
            return B.c();
        }
        Object object = k.getObject(obj, y(i2) & 1048575);
        if (r(object)) {
            return object;
        }
        vl2 c = B.c();
        if (object != null) {
            B.b(c, object);
        }
        return c;
    }

    @Override // defpackage.rm2
    public final void a(Object obj) {
        if (!r(obj)) {
            return;
        }
        if (obj instanceof vl2) {
            vl2 vl2Var = (vl2) obj;
            vl2Var.l();
            vl2Var.zza = 0;
            vl2Var.j();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.f598a;
            if (i >= iArr.length) {
                this.i.getClass();
                zm2 zm2Var = ((vl2) obj).zzc;
                if (zm2Var.e) {
                    zm2Var.e = false;
                    return;
                }
                return;
            }
            int y = y(i);
            int i2 = 1048575 & y;
            int x = x(y);
            long j2 = i2;
            if (x != 9) {
                if (x != 60 && x != 68) {
                    switch (x) {
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case rt0.q /* 32 */:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            el2 el2Var = (el2) ((yl2) en2.h(j2, obj));
                            if (!el2Var.g) {
                                break;
                            } else {
                                el2Var.g = false;
                                break;
                            }
                        case 50:
                            Unsafe unsafe = k;
                            Object object = unsafe.getObject(obj, j2);
                            if (object == null) {
                                break;
                            } else {
                                ((hm2) object).g = false;
                                unsafe.putObject(obj, j2, object);
                                break;
                            }
                    }
                } else if (s(iArr[i], i, obj)) {
                    B(i).a(k.getObject(obj, j2));
                }
                i += 3;
            }
            if (p(i, obj)) {
                B(i).a(k.getObject(obj, j2));
            }
            i += 3;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.rm2
    public final void b(Object obj, Object obj2) {
        Object obj3;
        if (!r(obj)) {
            c.m(nTAZxGMqQtZZAQ.xzQdSVJitnCV.concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f598a;
            if (i >= iArr.length) {
                sm2.o(obj, obj2);
                return;
            }
            int y = y(i);
            int i2 = y & 1048575;
            int x = x(y);
            int i3 = iArr[i];
            long j2 = i2;
            switch (x) {
                case 0:
                    if (p(i, obj2)) {
                        dn2 dn2Var = en2.c;
                        obj3 = obj;
                        dn2Var.i(obj3, j2, dn2Var.e(j2, obj2));
                        l(i, obj3);
                        break;
                    }
                    obj3 = obj;
                    break;
                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                    if (p(i, obj2)) {
                        dn2 dn2Var2 = en2.c;
                        dn2Var2.j(obj, j2, dn2Var2.f(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                    if (p(i, obj2)) {
                        en2.k(obj, j2, en2.f(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 3:
                    if (p(i, obj2)) {
                        en2.k(obj, j2, en2.f(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                    if (p(i, obj2)) {
                        en2.j(obj, j2, en2.e(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 5:
                    if (p(i, obj2)) {
                        en2.k(obj, j2, en2.f(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                    if (p(i, obj2)) {
                        en2.j(obj, j2, en2.e(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                    if (p(i, obj2)) {
                        dn2 dn2Var3 = en2.c;
                        dn2Var3.g(obj, j2, dn2Var3.k(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 8:
                    if (p(i, obj2)) {
                        en2.l(j2, obj, en2.h(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case rt0.o /* 9 */:
                    j(obj, i, obj2);
                    obj3 = obj;
                    break;
                case 10:
                    if (p(i, obj2)) {
                        en2.l(j2, obj, en2.h(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 11:
                    if (p(i, obj2)) {
                        en2.j(obj, j2, en2.e(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 12:
                    if (p(i, obj2)) {
                        en2.j(obj, j2, en2.e(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 13:
                    if (p(i, obj2)) {
                        en2.j(obj, j2, en2.e(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 14:
                    if (p(i, obj2)) {
                        en2.k(obj, j2, en2.f(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 15:
                    if (p(i, obj2)) {
                        en2.j(obj, j2, en2.e(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case 16:
                    if (p(i, obj2)) {
                        en2.k(obj, j2, en2.f(j2, obj2));
                        l(i, obj);
                    }
                    obj3 = obj;
                    break;
                case rt0.p /* 17 */:
                    j(obj, i, obj2);
                    obj3 = obj;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case rt0.q /* 32 */:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    yl2 yl2Var = (yl2) en2.h(j2, obj);
                    yl2 yl2Var2 = (yl2) en2.h(j2, obj2);
                    int size = yl2Var.size();
                    int size2 = yl2Var2.size();
                    if (size > 0 && size2 > 0) {
                        if (!((el2) yl2Var).g) {
                            yl2Var = yl2Var.a(size2 + size);
                        }
                        yl2Var.addAll(yl2Var2);
                    }
                    if (size > 0) {
                        yl2Var2 = yl2Var;
                    }
                    en2.l(j2, obj, yl2Var2);
                    obj3 = obj;
                    break;
                case 50:
                    x42 x42Var = sm2.f944a;
                    en2.l(j2, obj, m52.a(en2.h(j2, obj), en2.h(j2, obj2)));
                    obj3 = obj;
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (s(i3, i, obj2)) {
                        en2.l(j2, obj, en2.h(j2, obj2));
                        en2.j(obj, iArr[i + 2] & 1048575, i3);
                    }
                    obj3 = obj;
                    break;
                case 60:
                    k(obj, i, obj2);
                    obj3 = obj;
                    break;
                case 61:
                case 62:
                case 63:
                case rt0.r /* 64 */:
                case 65:
                case 66:
                case 67:
                    if (s(i3, i, obj2)) {
                        en2.l(j2, obj, en2.h(j2, obj2));
                        en2.j(obj, iArr[i + 2] & 1048575, i3);
                    }
                    obj3 = obj;
                    break;
                case 68:
                    k(obj, i, obj2);
                    obj3 = obj;
                    break;
                default:
                    obj3 = obj;
                    break;
            }
            i += 3;
            obj = obj3;
        }
    }

    @Override // defpackage.rm2
    public final vl2 c() {
        return (vl2) ((vl2) this.e).d(4);
    }

    @Override // defpackage.rm2
    public final boolean d(vl2 vl2Var, vl2 vl2Var2) {
        boolean e;
        int i = 0;
        while (true) {
            int[] iArr = this.f598a;
            if (i < iArr.length) {
                int y = y(i);
                long j2 = y & 1048575;
                switch (x(y)) {
                    case 0:
                        if (!o(vl2Var, vl2Var2, i)) {
                            break;
                        } else {
                            dn2 dn2Var = en2.c;
                            if (Double.doubleToLongBits(dn2Var.e(j2, vl2Var)) != Double.doubleToLongBits(dn2Var.e(j2, vl2Var2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        if (!o(vl2Var, vl2Var2, i)) {
                            break;
                        } else {
                            dn2 dn2Var2 = en2.c;
                            if (Float.floatToIntBits(dn2Var2.f(j2, vl2Var)) != Float.floatToIntBits(dn2Var2.f(j2, vl2Var2))) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        if (o(vl2Var, vl2Var2, i) && en2.f(j2, vl2Var) == en2.f(j2, vl2Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (o(vl2Var, vl2Var2, i) && en2.f(j2, vl2Var) == en2.f(j2, vl2Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        if (o(vl2Var, vl2Var2, i) && en2.e(j2, vl2Var) == en2.e(j2, vl2Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (o(vl2Var, vl2Var2, i) && en2.f(j2, vl2Var) == en2.f(j2, vl2Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                        if (o(vl2Var, vl2Var2, i) && en2.e(j2, vl2Var) == en2.e(j2, vl2Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                        if (!o(vl2Var, vl2Var2, i)) {
                            break;
                        } else {
                            dn2 dn2Var3 = en2.c;
                            if (dn2Var3.k(j2, vl2Var) != dn2Var3.k(j2, vl2Var2)) {
                                break;
                            } else {
                                continue;
                                i += 3;
                            }
                        }
                    case 8:
                        if (o(vl2Var, vl2Var2, i) && sm2.e(en2.h(j2, vl2Var), en2.h(j2, vl2Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case rt0.o /* 9 */:
                        if (o(vl2Var, vl2Var2, i) && sm2.e(en2.h(j2, vl2Var), en2.h(j2, vl2Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (o(vl2Var, vl2Var2, i) && sm2.e(en2.h(j2, vl2Var), en2.h(j2, vl2Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 11:
                        if (o(vl2Var, vl2Var2, i) && en2.e(j2, vl2Var) == en2.e(j2, vl2Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 12:
                        if (o(vl2Var, vl2Var2, i) && en2.e(j2, vl2Var) == en2.e(j2, vl2Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (o(vl2Var, vl2Var2, i) && en2.e(j2, vl2Var) == en2.e(j2, vl2Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (o(vl2Var, vl2Var2, i) && en2.f(j2, vl2Var) == en2.f(j2, vl2Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (o(vl2Var, vl2Var2, i) && en2.e(j2, vl2Var) == en2.e(j2, vl2Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (o(vl2Var, vl2Var2, i) && en2.f(j2, vl2Var) == en2.f(j2, vl2Var2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case rt0.p /* 17 */:
                        if (o(vl2Var, vl2Var2, i) && sm2.e(en2.h(j2, vl2Var), en2.h(j2, vl2Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case rt0.q /* 32 */:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        e = sm2.e(en2.h(j2, vl2Var), en2.h(j2, vl2Var2));
                        break;
                    case 50:
                        e = sm2.e(en2.h(j2, vl2Var), en2.h(j2, vl2Var2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case rt0.r /* 64 */:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j3 = iArr[i + 2] & 1048575;
                        if (en2.e(j3, vl2Var) == en2.e(j3, vl2Var2) && sm2.e(en2.h(j2, vl2Var), en2.h(j2, vl2Var2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        i += 3;
                }
                if (e) {
                    i += 3;
                }
            } else if (vl2Var.zzc.equals(vl2Var2.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.rm2
    public final void e(Object obj, byte[] bArr, int i, int i2, gl2 gl2Var) {
        t(obj, bArr, i, i2, 0, gl2Var);
    }

    @Override // defpackage.rm2
    public final int f(dl2 dl2Var) {
        int i;
        int q;
        int a2;
        int q2;
        int d;
        int q3;
        int a3;
        int i2;
        int q4;
        int i3;
        int i4;
        int a4;
        int q5;
        int size;
        int n;
        int q6;
        int q7;
        int q8;
        int size2;
        int q9;
        int i5;
        int q10;
        int a5;
        int q11;
        int d2;
        int v;
        int q12;
        lm2 lm2Var = this;
        dl2 dl2Var2 = dl2Var;
        Unsafe unsafe = k;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = lm2Var.f598a;
            if (i8 >= iArr.length) {
                return ((vl2) dl2Var).zzc.a() + i10;
            }
            int y = lm2Var.y(i8);
            int x = x(y);
            int i11 = iArr[i8];
            int i12 = iArr[i8 + 2];
            int i13 = i12 & i6;
            if (x <= 17) {
                if (i13 != i7) {
                    i9 = i13 == i6 ? 0 : unsafe.getInt(dl2Var2, i13);
                    i7 = i13;
                }
                i = 1 << (i12 >>> 20);
            } else {
                i = 0;
            }
            int i14 = y & i6;
            if (x >= sl2.h.g) {
                sl2.i.getClass();
            }
            long j2 = i14;
            switch (x) {
                case 0:
                    if (!lm2Var.q(dl2Var2, i8, i7, i9, i)) {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                    i10 = iy1.c(i11 << 3, 8, i10);
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                    if (!lm2Var.q(dl2Var2, i8, i7, i9, i)) {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                    i10 = iy1.c(i11 << 3, 4, i10);
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                    if (lm2Var.q(dl2Var2, i8, i7, i9, i)) {
                        long j3 = unsafe.getLong(dl2Var2, j2);
                        q = ml2.q(i11 << 3);
                        a2 = ml2.a(j3);
                        i3 = a2 + q;
                        i10 += i3;
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 3:
                    if (lm2Var.q(dl2Var2, i8, i7, i9, i)) {
                        long j4 = unsafe.getLong(dl2Var2, j2);
                        q = ml2.q(i11 << 3);
                        a2 = ml2.a(j4);
                        i3 = a2 + q;
                        i10 += i3;
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                    if (lm2Var.q(dl2Var2, i8, i7, i9, i)) {
                        long j5 = unsafe.getInt(dl2Var2, j2);
                        q = ml2.q(i11 << 3);
                        a2 = ml2.a(j5);
                        i3 = a2 + q;
                        i10 += i3;
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 5:
                    if (!lm2Var.q(dl2Var2, i8, i7, i9, i)) {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                    i10 = iy1.c(i11 << 3, 8, i10);
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                    if (!lm2Var.q(dl2Var2, i8, i7, i9, i)) {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                    i10 = iy1.c(i11 << 3, 4, i10);
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                    if (lm2Var.q(dl2Var2, i8, i7, i9, i)) {
                        i10 = iy1.c(i11 << 3, 1, i10);
                    }
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 8:
                    if (lm2Var.q(dl2Var2, i8, i7, i9, i)) {
                        int i15 = i11 << 3;
                        Object object = unsafe.getObject(dl2Var2, j2);
                        if (object instanceof ll2) {
                            q2 = ml2.q(i15);
                            d = ((ll2) object).d();
                            i10 = iy1.d(d, d, q2, i10);
                            i8 += 3;
                            lm2Var = this;
                            dl2Var2 = dl2Var;
                            i6 = 1048575;
                        } else {
                            q = ml2.q(i15);
                            a2 = ml2.p((String) object);
                            i3 = a2 + q;
                            i10 += i3;
                            i8 += 3;
                            lm2Var = this;
                            dl2Var2 = dl2Var;
                            i6 = 1048575;
                        }
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case rt0.o /* 9 */:
                    if (lm2Var.q(dl2Var2, i8, i7, i9, i)) {
                        Object object2 = unsafe.getObject(dl2Var2, j2);
                        rm2 B = lm2Var.B(i8);
                        x42 x42Var = sm2.f944a;
                        q3 = ml2.q(i11 << 3);
                        a3 = ((dl2) object2).a(B);
                        i10 = iy1.d(a3, a3, q3, i10);
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 10:
                    if (lm2Var.q(dl2Var2, i8, i7, i9, i)) {
                        ll2 ll2Var = (ll2) unsafe.getObject(dl2Var2, j2);
                        q2 = ml2.q(i11 << 3);
                        d = ll2Var.d();
                        i10 = iy1.d(d, d, q2, i10);
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 11:
                    if (lm2Var.q(dl2Var2, i8, i7, i9, i)) {
                        i2 = unsafe.getInt(dl2Var2, j2);
                        q4 = ml2.q(i11 << 3);
                        i10 = iy1.c(i2, q4, i10);
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 12:
                    if (lm2Var.q(dl2Var2, i8, i7, i9, i)) {
                        long j6 = unsafe.getInt(dl2Var2, j2);
                        q = ml2.q(i11 << 3);
                        a2 = ml2.a(j6);
                        i3 = a2 + q;
                        i10 += i3;
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 13:
                    if (!lm2Var.q(dl2Var2, i8, i7, i9, i)) {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                    i10 = iy1.c(i11 << 3, 4, i10);
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 14:
                    if (!lm2Var.q(dl2Var2, i8, i7, i9, i)) {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                    i10 = iy1.c(i11 << 3, 8, i10);
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 15:
                    if (lm2Var.q(dl2Var2, i8, i7, i9, i)) {
                        int i16 = unsafe.getInt(dl2Var2, j2);
                        q4 = ml2.q(i11 << 3);
                        i2 = (i16 >> 31) ^ (i16 + i16);
                        i10 = iy1.c(i2, q4, i10);
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 16:
                    if (lm2Var.q(dl2Var2, i8, i7, i9, i)) {
                        long j7 = unsafe.getLong(dl2Var2, j2);
                        q = ml2.q(i11 << 3);
                        a2 = ml2.a((j7 >> 63) ^ (j7 + j7));
                        i3 = a2 + q;
                        i10 += i3;
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case rt0.p /* 17 */:
                    if (lm2Var.q(dl2Var2, i8, i7, i9, i)) {
                        dl2 dl2Var3 = (dl2) unsafe.getObject(dl2Var2, j2);
                        rm2 B2 = lm2Var.B(i8);
                        int q13 = ml2.q(i11 << 3);
                        i4 = q13 + q13;
                        a4 = dl2Var3.a(B2);
                        i3 = a4 + i4;
                        i10 += i3;
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 18:
                    i3 = sm2.h(i11, (List) unsafe.getObject(dl2Var2, j2));
                    i10 += i3;
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 19:
                    i3 = sm2.g(i11, (List) unsafe.getObject(dl2Var2, j2));
                    i10 += i3;
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 20:
                    List list = (List) unsafe.getObject(dl2Var2, j2);
                    x42 x42Var2 = sm2.f944a;
                    if (list.size() != 0) {
                        q5 = (ml2.q(i11 << 3) * list.size()) + sm2.j(list);
                        i10 += q5;
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                    q5 = 0;
                    i10 += q5;
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 21:
                    List list2 = (List) unsafe.getObject(dl2Var2, j2);
                    x42 x42Var3 = sm2.f944a;
                    size = list2.size();
                    if (size != 0) {
                        n = sm2.n(list2);
                        q6 = ml2.q(i11 << 3);
                        q7 = (q6 * size) + n;
                        i10 += q7;
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                    q7 = 0;
                    i10 += q7;
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 22:
                    List list3 = (List) unsafe.getObject(dl2Var2, j2);
                    x42 x42Var4 = sm2.f944a;
                    size = list3.size();
                    if (size != 0) {
                        n = sm2.i(list3);
                        q6 = ml2.q(i11 << 3);
                        q7 = (q6 * size) + n;
                        i10 += q7;
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                    q7 = 0;
                    i10 += q7;
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 23:
                    i3 = sm2.h(i11, (List) unsafe.getObject(dl2Var2, j2));
                    i10 += i3;
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 24:
                    i3 = sm2.g(i11, (List) unsafe.getObject(dl2Var2, j2));
                    i10 += i3;
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 25:
                    List list4 = (List) unsafe.getObject(dl2Var2, j2);
                    x42 x42Var5 = sm2.f944a;
                    int size3 = list4.size();
                    if (size3 != 0) {
                        q5 = (ml2.q(i11 << 3) + 1) * size3;
                        i10 += q5;
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                    q5 = 0;
                    i10 += q5;
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 26:
                    List list5 = (List) unsafe.getObject(dl2Var2, j2);
                    x42 x42Var6 = sm2.f944a;
                    int size4 = list5.size();
                    if (size4 != 0) {
                        q7 = ml2.q(i11 << 3) * size4;
                        for (int i17 = 0; i17 < size4; i17++) {
                            Object obj = list5.get(i17);
                            if (obj instanceof ll2) {
                                int d3 = ((ll2) obj).d();
                                q7 = iy1.c(d3, d3, q7);
                            } else {
                                q7 = ml2.p((String) obj) + q7;
                            }
                        }
                        i10 += q7;
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                    q7 = 0;
                    i10 += q7;
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 27:
                    List list6 = (List) unsafe.getObject(dl2Var2, j2);
                    rm2 B3 = lm2Var.B(i8);
                    x42 x42Var7 = sm2.f944a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        q8 = 0;
                    } else {
                        q8 = ml2.q(i11 << 3) * size5;
                        for (int i18 = 0; i18 < size5; i18++) {
                            int a6 = ((dl2) list6.get(i18)).a(B3);
                            q8 = iy1.c(a6, a6, q8);
                        }
                    }
                    i10 += q8;
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 28:
                    List list7 = (List) unsafe.getObject(dl2Var2, j2);
                    x42 x42Var8 = sm2.f944a;
                    int size6 = list7.size();
                    if (size6 != 0) {
                        q7 = ml2.q(i11 << 3) * size6;
                        for (int i19 = 0; i19 < list7.size(); i19++) {
                            int d4 = ((ll2) list7.get(i19)).d();
                            q7 = iy1.c(d4, d4, q7);
                        }
                        i10 += q7;
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                    q7 = 0;
                    i10 += q7;
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 29:
                    List list8 = (List) unsafe.getObject(dl2Var2, j2);
                    x42 x42Var9 = sm2.f944a;
                    size = list8.size();
                    if (size != 0) {
                        n = sm2.m(list8);
                        q6 = ml2.q(i11 << 3);
                        q7 = (q6 * size) + n;
                        i10 += q7;
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                    q7 = 0;
                    i10 += q7;
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 30:
                    List list9 = (List) unsafe.getObject(dl2Var2, j2);
                    x42 x42Var10 = sm2.f944a;
                    size = list9.size();
                    if (size != 0) {
                        n = sm2.f(list9);
                        q6 = ml2.q(i11 << 3);
                        q7 = (q6 * size) + n;
                        i10 += q7;
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                    q7 = 0;
                    i10 += q7;
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 31:
                    i3 = sm2.g(i11, (List) unsafe.getObject(dl2Var2, j2));
                    i10 += i3;
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case rt0.q /* 32 */:
                    i3 = sm2.h(i11, (List) unsafe.getObject(dl2Var2, j2));
                    i10 += i3;
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 33:
                    List list10 = (List) unsafe.getObject(dl2Var2, j2);
                    x42 x42Var11 = sm2.f944a;
                    size = list10.size();
                    if (size != 0) {
                        n = sm2.k(list10);
                        q6 = ml2.q(i11 << 3);
                        q7 = (q6 * size) + n;
                        i10 += q7;
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                    q7 = 0;
                    i10 += q7;
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 34:
                    List list11 = (List) unsafe.getObject(dl2Var2, j2);
                    x42 x42Var12 = sm2.f944a;
                    size = list11.size();
                    if (size != 0) {
                        n = sm2.l(list11);
                        q6 = ml2.q(i11 << 3);
                        q7 = (q6 * size) + n;
                        i10 += q7;
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                    q7 = 0;
                    i10 += q7;
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 35:
                    List list12 = (List) unsafe.getObject(dl2Var2, j2);
                    x42 x42Var13 = sm2.f944a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        q9 = ml2.q(i11 << 3);
                        i10 = iy1.d(size2, q9, size2, i10);
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 36:
                    List list13 = (List) unsafe.getObject(dl2Var2, j2);
                    x42 x42Var14 = sm2.f944a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        q9 = ml2.q(i11 << 3);
                        i10 = iy1.d(size2, q9, size2, i10);
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 37:
                    size2 = sm2.j((List) unsafe.getObject(dl2Var2, j2));
                    if (size2 > 0) {
                        q9 = ml2.q(i11 << 3);
                        i10 = iy1.d(size2, q9, size2, i10);
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 38:
                    size2 = sm2.n((List) unsafe.getObject(dl2Var2, j2));
                    if (size2 > 0) {
                        q9 = ml2.q(i11 << 3);
                        i10 = iy1.d(size2, q9, size2, i10);
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 39:
                    size2 = sm2.i((List) unsafe.getObject(dl2Var2, j2));
                    if (size2 > 0) {
                        q9 = ml2.q(i11 << 3);
                        i10 = iy1.d(size2, q9, size2, i10);
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 40:
                    List list14 = (List) unsafe.getObject(dl2Var2, j2);
                    x42 x42Var15 = sm2.f944a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        q9 = ml2.q(i11 << 3);
                        i10 = iy1.d(size2, q9, size2, i10);
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 41:
                    List list15 = (List) unsafe.getObject(dl2Var2, j2);
                    x42 x42Var16 = sm2.f944a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        q9 = ml2.q(i11 << 3);
                        i10 = iy1.d(size2, q9, size2, i10);
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 42:
                    List list16 = (List) unsafe.getObject(dl2Var2, j2);
                    x42 x42Var17 = sm2.f944a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        q9 = ml2.q(i11 << 3);
                        i10 = iy1.d(size2, q9, size2, i10);
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 43:
                    size2 = sm2.m((List) unsafe.getObject(dl2Var2, j2));
                    if (size2 > 0) {
                        q9 = ml2.q(i11 << 3);
                        i10 = iy1.d(size2, q9, size2, i10);
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 44:
                    size2 = sm2.f((List) unsafe.getObject(dl2Var2, j2));
                    if (size2 > 0) {
                        q9 = ml2.q(i11 << 3);
                        i10 = iy1.d(size2, q9, size2, i10);
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 45:
                    List list17 = (List) unsafe.getObject(dl2Var2, j2);
                    x42 x42Var18 = sm2.f944a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        q9 = ml2.q(i11 << 3);
                        i10 = iy1.d(size2, q9, size2, i10);
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 46:
                    List list18 = (List) unsafe.getObject(dl2Var2, j2);
                    x42 x42Var19 = sm2.f944a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        q9 = ml2.q(i11 << 3);
                        i10 = iy1.d(size2, q9, size2, i10);
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 47:
                    size2 = sm2.k((List) unsafe.getObject(dl2Var2, j2));
                    if (size2 > 0) {
                        q9 = ml2.q(i11 << 3);
                        i10 = iy1.d(size2, q9, size2, i10);
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 48:
                    size2 = sm2.l((List) unsafe.getObject(dl2Var2, j2));
                    if (size2 > 0) {
                        q9 = ml2.q(i11 << 3);
                        i10 = iy1.d(size2, q9, size2, i10);
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 49:
                    List list19 = (List) unsafe.getObject(dl2Var2, j2);
                    rm2 B4 = lm2Var.B(i8);
                    x42 x42Var20 = sm2.f944a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        i5 = 0;
                    } else {
                        i5 = 0;
                        for (int i20 = 0; i20 < size7; i20++) {
                            dl2 dl2Var4 = (dl2) list19.get(i20);
                            int q14 = ml2.q(i11 << 3);
                            i5 += dl2Var4.a(B4) + q14 + q14;
                        }
                    }
                    i10 += i5;
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 50:
                    Object object3 = unsafe.getObject(dl2Var2, j2);
                    int i21 = i8 / 3;
                    hm2 hm2Var = (hm2) object3;
                    if (lm2Var.b[i21 + i21] != null) {
                        rw.b();
                        return 0;
                    }
                    if (hm2Var.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = hm2Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 51:
                    if (!lm2Var.s(i11, i8, dl2Var2)) {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                    i10 = iy1.c(i11 << 3, 8, i10);
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 52:
                    if (!lm2Var.s(i11, i8, dl2Var2)) {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                    i10 = iy1.c(i11 << 3, 4, i10);
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 53:
                    if (lm2Var.s(i11, i8, dl2Var2)) {
                        long z = z(j2, dl2Var2);
                        q10 = ml2.q(i11 << 3);
                        a5 = ml2.a(z);
                        i10 += a5 + q10;
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 54:
                    if (lm2Var.s(i11, i8, dl2Var2)) {
                        long z2 = z(j2, dl2Var2);
                        q10 = ml2.q(i11 << 3);
                        a5 = ml2.a(z2);
                        i10 += a5 + q10;
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 55:
                    if (lm2Var.s(i11, i8, dl2Var2)) {
                        long v2 = v(j2, dl2Var2);
                        q10 = ml2.q(i11 << 3);
                        a5 = ml2.a(v2);
                        i10 += a5 + q10;
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 56:
                    if (!lm2Var.s(i11, i8, dl2Var2)) {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                    i10 = iy1.c(i11 << 3, 8, i10);
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 57:
                    if (!lm2Var.s(i11, i8, dl2Var2)) {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                    i10 = iy1.c(i11 << 3, 4, i10);
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 58:
                    if (lm2Var.s(i11, i8, dl2Var2)) {
                        i10 = iy1.c(i11 << 3, 1, i10);
                    }
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 59:
                    if (lm2Var.s(i11, i8, dl2Var2)) {
                        int i22 = i11 << 3;
                        Object object4 = unsafe.getObject(dl2Var2, j2);
                        if (object4 instanceof ll2) {
                            q11 = ml2.q(i22);
                            d2 = ((ll2) object4).d();
                            i10 = iy1.d(d2, d2, q11, i10);
                            i8 += 3;
                            lm2Var = this;
                            dl2Var2 = dl2Var;
                            i6 = 1048575;
                        } else {
                            q10 = ml2.q(i22);
                            a5 = ml2.p((String) object4);
                            i10 += a5 + q10;
                            i8 += 3;
                            lm2Var = this;
                            dl2Var2 = dl2Var;
                            i6 = 1048575;
                        }
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 60:
                    if (lm2Var.s(i11, i8, dl2Var2)) {
                        Object object5 = unsafe.getObject(dl2Var2, j2);
                        rm2 B5 = lm2Var.B(i8);
                        x42 x42Var21 = sm2.f944a;
                        q3 = ml2.q(i11 << 3);
                        a3 = ((dl2) object5).a(B5);
                        i10 = iy1.d(a3, a3, q3, i10);
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 61:
                    if (lm2Var.s(i11, i8, dl2Var2)) {
                        ll2 ll2Var2 = (ll2) unsafe.getObject(dl2Var2, j2);
                        q11 = ml2.q(i11 << 3);
                        d2 = ll2Var2.d();
                        i10 = iy1.d(d2, d2, q11, i10);
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 62:
                    if (lm2Var.s(i11, i8, dl2Var2)) {
                        v = v(j2, dl2Var2);
                        q12 = ml2.q(i11 << 3);
                        i10 = iy1.c(v, q12, i10);
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 63:
                    if (lm2Var.s(i11, i8, dl2Var2)) {
                        long v3 = v(j2, dl2Var2);
                        q10 = ml2.q(i11 << 3);
                        a5 = ml2.a(v3);
                        i10 += a5 + q10;
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case rt0.r /* 64 */:
                    if (!lm2Var.s(i11, i8, dl2Var2)) {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                    i10 = iy1.c(i11 << 3, 4, i10);
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 65:
                    if (!lm2Var.s(i11, i8, dl2Var2)) {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                    i10 = iy1.c(i11 << 3, 8, i10);
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
                case 66:
                    if (lm2Var.s(i11, i8, dl2Var2)) {
                        int v4 = v(j2, dl2Var2);
                        q12 = ml2.q(i11 << 3);
                        v = (v4 >> 31) ^ (v4 + v4);
                        i10 = iy1.c(v, q12, i10);
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 67:
                    if (lm2Var.s(i11, i8, dl2Var2)) {
                        long z3 = z(j2, dl2Var2);
                        q10 = ml2.q(i11 << 3);
                        a5 = ml2.a((z3 >> 63) ^ (z3 + z3));
                        i10 += a5 + q10;
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                case 68:
                    if (lm2Var.s(i11, i8, dl2Var2)) {
                        dl2 dl2Var5 = (dl2) unsafe.getObject(dl2Var2, j2);
                        rm2 B6 = lm2Var.B(i8);
                        int q15 = ml2.q(i11 << 3);
                        i4 = q15 + q15;
                        a4 = dl2Var5.a(B6);
                        i3 = a4 + i4;
                        i10 += i3;
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    } else {
                        i8 += 3;
                        lm2Var = this;
                        dl2Var2 = dl2Var;
                        i6 = 1048575;
                    }
                default:
                    i8 += 3;
                    lm2Var = this;
                    dl2Var2 = dl2Var;
                    i6 = 1048575;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01ea, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d9, code lost:
    
        if (r2 != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        r6 = 1231;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
    
        r1 = r6 + r1;
     */
    @Override // defpackage.rm2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(defpackage.vl2 r11) {
        /*
            Method dump skipped, instructions count: 726
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm2.g(vl2):int");
    }

    @Override // defpackage.rm2
    public final void h(Object obj, my1 my1Var) {
        int i;
        int i2;
        lm2 lm2Var = this;
        Unsafe unsafe = k;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (true) {
            int[] iArr = lm2Var.f598a;
            if (i4 >= iArr.length) {
                ((vl2) obj).zzc.d(my1Var);
                return;
            }
            int y = lm2Var.y(i4);
            int x = x(y);
            int i7 = iArr[i4];
            if (x <= 17) {
                int i8 = iArr[i4 + 2];
                int i9 = i8 & i3;
                if (i9 != i6) {
                    i5 = i9 == i3 ? 0 : unsafe.getInt(obj, i9);
                    i6 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            long j2 = y & i3;
            switch (x) {
                case 0:
                    if (lm2Var.q(obj, i4, i6, i5, i)) {
                        ((ml2) my1Var.g).f(i7, Double.doubleToRawLongBits(en2.c.e(j2, obj)));
                        break;
                    } else {
                        break;
                    }
                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                    if (lm2Var.q(obj, i4, i6, i5, i)) {
                        ((ml2) my1Var.g).d(i7, Float.floatToRawIntBits(en2.c.f(j2, obj)));
                        break;
                    } else {
                        break;
                    }
                case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                    if (lm2Var.q(obj, i4, i6, i5, i)) {
                        ((ml2) my1Var.g).n(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (lm2Var.q(obj, i4, i6, i5, i)) {
                        ((ml2) my1Var.g).n(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                    if (lm2Var.q(obj, i4, i6, i5, i)) {
                        ((ml2) my1Var.g).h(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (lm2Var.q(obj, i4, i6, i5, i)) {
                        ((ml2) my1Var.g).f(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                    if (lm2Var.q(obj, i4, i6, i5, i)) {
                        ((ml2) my1Var.g).d(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                    if (lm2Var.q(obj, i4, i6, i5, i)) {
                        byte k2 = en2.c.k(j2, obj);
                        ml2 ml2Var = (ml2) my1Var.g;
                        ml2Var.m(i7 << 3);
                        int i10 = ml2Var.d;
                        try {
                            int i11 = i10 + 1;
                            try {
                                ml2Var.b[i10] = k2;
                                ml2Var.d = i11;
                                break;
                            } catch (IndexOutOfBoundsException e) {
                                e = e;
                                i10 = i11;
                                throw new nl2(i10, ml2Var.c, 1, e);
                            }
                        } catch (IndexOutOfBoundsException e2) {
                            e = e2;
                        }
                    } else {
                        continue;
                    }
                case 8:
                    if (lm2Var.q(obj, i4, i6, i5, i)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            ((ml2) my1Var.g).j(i7, (String) object);
                            break;
                        } else {
                            ((ml2) my1Var.g).c(i7, (ll2) object);
                            break;
                        }
                    } else {
                        break;
                    }
                case rt0.o /* 9 */:
                    if (lm2Var.q(obj, i4, i6, i5, i)) {
                        my1Var.c(i7, unsafe.getObject(obj, j2), lm2Var.B(i4));
                        break;
                    } else {
                        break;
                    }
                case 10:
                    if (lm2Var.q(obj, i4, i6, i5, i)) {
                        ((ml2) my1Var.g).c(i7, (ll2) unsafe.getObject(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (lm2Var.q(obj, i4, i6, i5, i)) {
                        ((ml2) my1Var.g).l(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (lm2Var.q(obj, i4, i6, i5, i)) {
                        ((ml2) my1Var.g).h(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (lm2Var.q(obj, i4, i6, i5, i)) {
                        ((ml2) my1Var.g).d(i7, unsafe.getInt(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (lm2Var.q(obj, i4, i6, i5, i)) {
                        ((ml2) my1Var.g).f(i7, unsafe.getLong(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (lm2Var.q(obj, i4, i6, i5, i)) {
                        int i12 = unsafe.getInt(obj, j2);
                        ((ml2) my1Var.g).l(i7, (i12 >> 31) ^ (i12 + i12));
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (lm2Var.q(obj, i4, i6, i5, i)) {
                        long j3 = unsafe.getLong(obj, j2);
                        ((ml2) my1Var.g).n(i7, (j3 >> 63) ^ (j3 + j3));
                        break;
                    } else {
                        break;
                    }
                case rt0.p /* 17 */:
                    if (lm2Var.q(obj, i4, i6, i5, i)) {
                        my1Var.b(i7, unsafe.getObject(obj, j2), lm2Var.B(i4));
                        break;
                    } else {
                        break;
                    }
                case 18:
                    sm2.q(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, false);
                    break;
                case 19:
                    sm2.u(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, false);
                    break;
                case 20:
                    sm2.w(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, false);
                    break;
                case 21:
                    sm2.d(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, false);
                    break;
                case 22:
                    sm2.v(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, false);
                    break;
                case 23:
                    sm2.t(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, false);
                    break;
                case 24:
                    sm2.s(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, false);
                    break;
                case 25:
                    sm2.p(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, false);
                    break;
                case 26:
                    int i13 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j2);
                    x42 x42Var = sm2.f944a;
                    if (list != null && !list.isEmpty()) {
                        my1Var.getClass();
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            ((ml2) my1Var.g).j(i13, (String) list.get(i14));
                        }
                        break;
                    }
                    break;
                case 27:
                    int i15 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    rm2 B = lm2Var.B(i4);
                    x42 x42Var2 = sm2.f944a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i16 = 0; i16 < list2.size(); i16++) {
                            my1Var.c(i15, list2.get(i16), B);
                        }
                        break;
                    }
                    break;
                case 28:
                    int i17 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    x42 x42Var3 = sm2.f944a;
                    if (list3 != null && !list3.isEmpty()) {
                        my1Var.getClass();
                        for (int i18 = 0; i18 < list3.size(); i18++) {
                            ((ml2) my1Var.g).c(i17, (ll2) list3.get(i18));
                        }
                        break;
                    }
                    break;
                case 29:
                    sm2.c(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, false);
                    break;
                case 30:
                    sm2.r(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, false);
                    break;
                case 31:
                    sm2.x(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, false);
                    break;
                case rt0.q /* 32 */:
                    sm2.y(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, false);
                    break;
                case 33:
                    sm2.a(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, false);
                    break;
                case 34:
                    sm2.b(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, false);
                    break;
                case 35:
                    sm2.q(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, true);
                    break;
                case 36:
                    sm2.u(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, true);
                    break;
                case 37:
                    sm2.w(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, true);
                    break;
                case 38:
                    sm2.d(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, true);
                    break;
                case 39:
                    sm2.v(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, true);
                    break;
                case 40:
                    sm2.t(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, true);
                    break;
                case 41:
                    sm2.s(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, true);
                    break;
                case 42:
                    sm2.p(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, true);
                    break;
                case 43:
                    sm2.c(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, true);
                    break;
                case 44:
                    sm2.r(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, true);
                    break;
                case 45:
                    sm2.x(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, true);
                    break;
                case 46:
                    sm2.y(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, true);
                    break;
                case 47:
                    sm2.a(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, true);
                    break;
                case 48:
                    sm2.b(iArr[i4], (List) unsafe.getObject(obj, j2), my1Var, true);
                    break;
                case 49:
                    int i19 = iArr[i4];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    rm2 B2 = lm2Var.B(i4);
                    x42 x42Var4 = sm2.f944a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i20 = 0; i20 < list4.size(); i20++) {
                            my1Var.b(i19, list4.get(i20), B2);
                        }
                        break;
                    }
                    break;
                case 50:
                    if (unsafe.getObject(obj, j2) != null) {
                        int i21 = i4 / 3;
                        throw d51.k(lm2Var.b[i21 + i21]);
                    }
                    break;
                case 51:
                    if (lm2Var.s(i7, i4, obj)) {
                        ((ml2) my1Var.g).f(i7, Double.doubleToRawLongBits(((Double) en2.h(j2, obj)).doubleValue()));
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (lm2Var.s(i7, i4, obj)) {
                        ((ml2) my1Var.g).d(i7, Float.floatToRawIntBits(((Float) en2.h(j2, obj)).floatValue()));
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (lm2Var.s(i7, i4, obj)) {
                        ((ml2) my1Var.g).n(i7, z(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (lm2Var.s(i7, i4, obj)) {
                        ((ml2) my1Var.g).n(i7, z(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (lm2Var.s(i7, i4, obj)) {
                        ((ml2) my1Var.g).h(i7, v(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (lm2Var.s(i7, i4, obj)) {
                        ((ml2) my1Var.g).f(i7, z(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (lm2Var.s(i7, i4, obj)) {
                        ((ml2) my1Var.g).d(i7, v(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (lm2Var.s(i7, i4, obj)) {
                        byte booleanValue = ((Boolean) en2.h(j2, obj)).booleanValue();
                        ml2 ml2Var2 = (ml2) my1Var.g;
                        ml2Var2.m(i7 << 3);
                        int i22 = ml2Var2.d;
                        try {
                            i2 = i22 + 1;
                        } catch (IndexOutOfBoundsException e3) {
                            e = e3;
                        }
                        try {
                            ml2Var2.b[i22] = booleanValue;
                            ml2Var2.d = i2;
                            break;
                        } catch (IndexOutOfBoundsException e4) {
                            e = e4;
                            i22 = i2;
                            throw new nl2(i22, ml2Var2.c, 1, e);
                        }
                    } else {
                        continue;
                    }
                case 59:
                    if (lm2Var.s(i7, i4, obj)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        if (object2 instanceof String) {
                            ((ml2) my1Var.g).j(i7, (String) object2);
                            break;
                        } else {
                            ((ml2) my1Var.g).c(i7, (ll2) object2);
                            break;
                        }
                    } else {
                        break;
                    }
                case 60:
                    if (lm2Var.s(i7, i4, obj)) {
                        my1Var.c(i7, unsafe.getObject(obj, j2), lm2Var.B(i4));
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (lm2Var.s(i7, i4, obj)) {
                        ((ml2) my1Var.g).c(i7, (ll2) unsafe.getObject(obj, j2));
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (lm2Var.s(i7, i4, obj)) {
                        ((ml2) my1Var.g).l(i7, v(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (lm2Var.s(i7, i4, obj)) {
                        ((ml2) my1Var.g).h(i7, v(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case rt0.r /* 64 */:
                    if (lm2Var.s(i7, i4, obj)) {
                        ((ml2) my1Var.g).d(i7, v(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (lm2Var.s(i7, i4, obj)) {
                        ((ml2) my1Var.g).f(i7, z(j2, obj));
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (lm2Var.s(i7, i4, obj)) {
                        int v = v(j2, obj);
                        ((ml2) my1Var.g).l(i7, (v >> 31) ^ (v + v));
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (lm2Var.s(i7, i4, obj)) {
                        long z = z(j2, obj);
                        ((ml2) my1Var.g).n(i7, (z >> 63) ^ (z + z));
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (lm2Var.s(i7, i4, obj)) {
                        my1Var.b(i7, unsafe.getObject(obj, j2), lm2Var.B(i4));
                        break;
                    } else {
                        break;
                    }
            }
            i4 += 3;
            i3 = 1048575;
            lm2Var = this;
        }
    }

    @Override // defpackage.rm2
    public final boolean i(Object obj) {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        int i5 = 0;
        int i6 = 1048575;
        while (i5 < this.g) {
            int i7 = this.f[i5];
            int[] iArr = this.f598a;
            int i8 = iArr[i7];
            int y = y(i7);
            int i9 = iArr[i7 + 2];
            int i10 = i9 & 1048575;
            int i11 = 1 << (i9 >>> 20);
            if (i10 != i6) {
                if (i10 != 1048575) {
                    i4 = k.getInt(obj, i10);
                }
                i2 = i7;
                i3 = i4;
                i = i10;
            } else {
                int i12 = i4;
                i = i6;
                i2 = i7;
                i3 = i12;
            }
            if ((268435456 & y) == 0 || q(obj, i2, i, i3, i11)) {
                int x = x(y);
                if (x == 9 || x == 17) {
                    if (q(obj, i2, i, i3, i11) && !B(i2).i(en2.h(y & 1048575, obj))) {
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                } else {
                    if (x != 27) {
                        if (x == 60 || x == 68) {
                            if (s(i8, i2, obj) && !B(i2).i(en2.h(y & 1048575, obj))) {
                            }
                        } else if (x != 49) {
                            if (x == 50 && !((hm2) en2.h(y & 1048575, obj)).isEmpty()) {
                                int i13 = i2 / 3;
                                throw d51.k(this.b[i13 + i13]);
                            }
                        }
                        i5++;
                        i6 = i;
                        i4 = i3;
                    }
                    List list = (List) en2.h(y & 1048575, obj);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        rm2 B = B(i2);
                        for (int i14 = 0; i14 < list.size(); i14++) {
                            if (B.i(list.get(i14))) {
                            }
                        }
                    }
                    i5++;
                    i6 = i;
                    i4 = i3;
                }
            }
            return false;
        }
        return true;
    }

    public final void j(Object obj, int i, Object obj2) {
        if (p(i, obj2)) {
            int y = y(i) & 1048575;
            Unsafe unsafe = k;
            long j2 = y;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + this.f598a[i] + " is present but null: " + obj2.toString());
            }
            rm2 B = B(i);
            if (!p(i, obj)) {
                if (r(object)) {
                    vl2 c = B.c();
                    B.b(c, object);
                    unsafe.putObject(obj, j2, c);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                l(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!r(object2)) {
                vl2 c2 = B.c();
                B.b(c2, object2);
                unsafe.putObject(obj, j2, c2);
                object2 = c2;
            }
            B.b(object2, object);
        }
    }

    public final void k(Object obj, int i, Object obj2) {
        int[] iArr = this.f598a;
        int i2 = iArr[i];
        if (s(i2, i, obj2)) {
            int y = y(i) & 1048575;
            Unsafe unsafe = k;
            long j2 = y;
            Object object = unsafe.getObject(obj2, j2);
            if (object == null) {
                throw new IllegalStateException("Source subfield " + iArr[i] + " is present but null: " + obj2.toString());
            }
            rm2 B = B(i);
            if (!s(i2, i, obj)) {
                if (r(object)) {
                    vl2 c = B.c();
                    B.b(c, object);
                    unsafe.putObject(obj, j2, c);
                } else {
                    unsafe.putObject(obj, j2, object);
                }
                en2.j(obj, iArr[i + 2] & 1048575, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, j2);
            if (!r(object2)) {
                vl2 c2 = B.c();
                B.b(c2, object2);
                unsafe.putObject(obj, j2, c2);
                object2 = c2;
            }
            B.b(object2, object);
        }
    }

    public final void l(int i, Object obj) {
        int i2 = this.f598a[i + 2];
        long j2 = 1048575 & i2;
        if (j2 == 1048575) {
            return;
        }
        en2.j(obj, j2, (1 << (i2 >>> 20)) | en2.e(j2, obj));
    }

    public final void m(Object obj, int i, Object obj2) {
        k.putObject(obj, y(i) & 1048575, obj2);
        l(i, obj);
    }

    public final void n(int i, int i2, Object obj, Object obj2) {
        k.putObject(obj, y(i2) & 1048575, obj2);
        en2.j(obj, this.f598a[i2 + 2] & 1048575, i);
    }

    public final boolean o(vl2 vl2Var, vl2 vl2Var2, int i) {
        return p(i, vl2Var) == p(i, vl2Var2);
    }

    public final boolean p(int i, Object obj) {
        int i2 = this.f598a[i + 2];
        long j2 = i2 & 1048575;
        if (j2 == 1048575) {
            int y = y(i);
            long j3 = y & 1048575;
            switch (x(y)) {
                case 0:
                    if (Double.doubleToRawLongBits(en2.c.e(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                    if (Float.floatToRawIntBits(en2.c.f(j3, obj)) == 0) {
                        return false;
                    }
                    break;
                case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                    if (en2.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 3:
                    if (en2.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                    if (en2.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 5:
                    if (en2.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                    if (en2.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                    return en2.c.k(j3, obj);
                case 8:
                    Object h = en2.h(j3, obj);
                    if (h instanceof String) {
                        if (((String) h).isEmpty()) {
                            return false;
                        }
                    } else {
                        if (!(h instanceof ll2)) {
                            throw new IllegalArgumentException();
                        }
                        if (ll2.i.equals(h)) {
                            return false;
                        }
                    }
                    break;
                case rt0.o /* 9 */:
                    if (en2.h(j3, obj) == null) {
                        return false;
                    }
                    break;
                case 10:
                    if (ll2.i.equals(en2.h(j3, obj))) {
                        return false;
                    }
                    break;
                case 11:
                    if (en2.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 12:
                    if (en2.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 13:
                    if (en2.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 14:
                    if (en2.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 15:
                    if (en2.e(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case 16:
                    if (en2.f(j3, obj) == 0) {
                        return false;
                    }
                    break;
                case rt0.p /* 17 */:
                    if (en2.h(j3, obj) == null) {
                        return false;
                    }
                    break;
                default:
                    throw new IllegalArgumentException();
            }
        } else if (((1 << (i2 >>> 20)) & en2.e(j2, obj)) == 0) {
            return false;
        }
        return true;
    }

    public final boolean q(Object obj, int i, int i2, int i3, int i4) {
        return i2 == 1048575 ? p(i, obj) : (i3 & i4) != 0;
    }

    public final boolean s(int i, int i2, Object obj) {
        return en2.e((long) (this.f598a[i2 + 2] & 1048575), obj) == i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0cfe, code lost:
    
        r1 = r31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0d3d, code lost:
    
        if (r1 == 1048575) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0d3f, code lost:
    
        r27.putInt(r9, r1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0d45, code lost:
    
        r2 = r38.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0d4b, code lost:
    
        if (r2 >= r38.h) goto L681;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x00e4, code lost:
    
        r5 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x00e6, code lost:
    
        r3 = r9;
        r8 = r10;
        r7 = r11;
        r9 = r12;
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0d4d, code lost:
    
        r3 = r38.f[r2];
        r6 = r21[r3];
        r6 = defpackage.en2.h(y(r3) & 1048575, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0d61, code lost:
    
        if (r6 != null) goto L561;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0157, code lost:
    
        r3 = r2;
        r2 = r1;
        r1 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0d68, code lost:
    
        if (A(r3) != null) goto L680;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0d6d, code lost:
    
        r6 = (defpackage.hm2) r6;
        r3 = r3 / 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0d78, code lost:
    
        throw defpackage.d51.k(r17[r3 + r3]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0462, code lost:
    
        r8 = r10;
        r7 = r11;
        r9 = r12;
        r3 = r13;
        r6 = r15;
        r15 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x04e0, code lost:
    
        r1 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0d6a, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x02fe, code lost:
    
        defpackage.p22.a(r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:628:0x0303, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0d7b, code lost:
    
        if (r0 != 0) goto L572;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0d7d, code lost:
    
        if (r4 != r5) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0d80, code lost:
    
        defpackage.p22.a("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:658:0x0368, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0d85, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0d8c, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:674:0x02a7, code lost:
    
        defpackage.p22.a(r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:675:0x02ac, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0d88, code lost:
    
        if (r4 > r5) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0d8a, code lost:
    
        if (r15 != r0) goto L576;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0d8d, code lost:
    
        defpackage.p22.a("Failed to parse the message.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0d90, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0a1c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0a0a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0cda A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0cf0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0cf9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:610:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:716:0x005d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0d0b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int t(java.lang.Object r39, byte[] r40, int r41, int r42, int r43, defpackage.gl2 r44) {
        /*
            Method dump skipped, instructions count: 3634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm2.t(java.lang.Object, byte[], int, int, int, gl2):int");
    }

    public final int w(int i, int i2) {
        int[] iArr = this.f598a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final int y(int i) {
        return this.f598a[i + 1];
    }
}
