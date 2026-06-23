package defpackage;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public abstract class sm2 {

    /* renamed from: a, reason: collision with root package name */
    public static final x42 f944a;

    static {
        om2 om2Var = om2.c;
        f944a = new x42();
    }

    public static void a(int i, List list, my1 my1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ml2 ml2Var = (ml2) my1Var.g;
        int i2 = 0;
        if (!(list instanceof wl2)) {
            if (!z) {
                while (i2 < list.size()) {
                    int intValue = ((Integer) list.get(i2)).intValue();
                    ml2Var.l(i, (intValue >> 31) ^ (intValue + intValue));
                    i2++;
                }
                return;
            }
            ml2Var.k(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue2 = ((Integer) list.get(i4)).intValue();
                i3 += ml2.q((intValue2 >> 31) ^ (intValue2 + intValue2));
            }
            ml2Var.m(i3);
            while (i2 < list.size()) {
                int intValue3 = ((Integer) list.get(i2)).intValue();
                ml2Var.m((intValue3 >> 31) ^ (intValue3 + intValue3));
                i2++;
            }
            return;
        }
        wl2 wl2Var = (wl2) list;
        if (!z) {
            while (i2 < wl2Var.i) {
                int c = wl2Var.c(i2);
                ml2Var.l(i, (c >> 31) ^ (c + c));
                i2++;
            }
            return;
        }
        ml2Var.k(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wl2Var.i; i6++) {
            int c2 = wl2Var.c(i6);
            i5 += ml2.q((c2 >> 31) ^ (c2 + c2));
        }
        ml2Var.m(i5);
        while (i2 < wl2Var.i) {
            int c3 = wl2Var.c(i2);
            ml2Var.m((c3 >> 31) ^ (c3 + c3));
            i2++;
        }
    }

    public static void b(int i, List list, my1 my1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ml2 ml2Var = (ml2) my1Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                long longValue = ((Long) list.get(i2)).longValue();
                ml2Var.n(i, (longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
            return;
        }
        ml2Var.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long longValue2 = ((Long) list.get(i4)).longValue();
            i3 += ml2.a((longValue2 >> 63) ^ (longValue2 + longValue2));
        }
        ml2Var.m(i3);
        while (i2 < list.size()) {
            long longValue3 = ((Long) list.get(i2)).longValue();
            ml2Var.o((longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    public static void c(int i, List list, my1 my1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ml2 ml2Var = (ml2) my1Var.g;
        int i2 = 0;
        if (!(list instanceof wl2)) {
            if (!z) {
                while (i2 < list.size()) {
                    ml2Var.l(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ml2Var.k(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ml2.q(((Integer) list.get(i4)).intValue());
            }
            ml2Var.m(i3);
            while (i2 < list.size()) {
                ml2Var.m(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        wl2 wl2Var = (wl2) list;
        if (!z) {
            while (i2 < wl2Var.i) {
                ml2Var.l(i, wl2Var.c(i2));
                i2++;
            }
            return;
        }
        ml2Var.k(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wl2Var.i; i6++) {
            i5 += ml2.q(wl2Var.c(i6));
        }
        ml2Var.m(i5);
        while (i2 < wl2Var.i) {
            ml2Var.m(wl2Var.c(i2));
            i2++;
        }
    }

    public static void d(int i, List list, my1 my1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ml2 ml2Var = (ml2) my1Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ml2Var.n(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ml2Var.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += ml2.a(((Long) list.get(i4)).longValue());
        }
        ml2Var.m(i3);
        while (i2 < list.size()) {
            ml2Var.o(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int f(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof wl2)) {
            int i2 = 0;
            while (i < size) {
                i2 += ml2.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        wl2 wl2Var = (wl2) list;
        int i3 = 0;
        while (i < size) {
            i3 += ml2.a(wl2Var.c(i));
            i++;
        }
        return i3;
    }

    public static int g(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ml2.q(i << 3) + 4) * size;
    }

    public static int h(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return (ml2.q(i << 3) + 8) * size;
    }

    public static int i(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof wl2)) {
            int i2 = 0;
            while (i < size) {
                i2 += ml2.a(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        wl2 wl2Var = (wl2) list;
        int i3 = 0;
        while (i < size) {
            i3 += ml2.a(wl2Var.c(i));
            i++;
        }
        return i3;
    }

    public static int j(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ml2.a(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static int k(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof wl2)) {
            int i2 = 0;
            while (i < size) {
                int intValue = ((Integer) list.get(i)).intValue();
                i2 += ml2.q((intValue >> 31) ^ (intValue + intValue));
                i++;
            }
            return i2;
        }
        wl2 wl2Var = (wl2) list;
        int i3 = 0;
        while (i < size) {
            int c = wl2Var.c(i);
            i3 += ml2.q((c >> 31) ^ (c + c));
            i++;
        }
        return i3;
    }

    public static int l(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            long longValue = ((Long) list.get(i2)).longValue();
            i += ml2.a((longValue >> 63) ^ (longValue + longValue));
        }
        return i;
    }

    public static int m(List list) {
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof wl2)) {
            int i2 = 0;
            while (i < size) {
                i2 += ml2.q(((Integer) list.get(i)).intValue());
                i++;
            }
            return i2;
        }
        wl2 wl2Var = (wl2) list;
        int i3 = 0;
        while (i < size) {
            i3 += ml2.q(wl2Var.c(i));
            i++;
        }
        return i3;
    }

    public static int n(List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ml2.a(((Long) list.get(i2)).longValue());
        }
        return i;
    }

    public static void o(Object obj, Object obj2) {
        vl2 vl2Var = (vl2) obj;
        zm2 zm2Var = vl2Var.zzc;
        zm2 zm2Var2 = ((vl2) obj2).zzc;
        zm2 zm2Var3 = zm2.f;
        if (!zm2Var3.equals(zm2Var2)) {
            if (zm2Var3.equals(zm2Var)) {
                int i = zm2Var.f1282a + zm2Var2.f1282a;
                int[] copyOf = Arrays.copyOf(zm2Var.b, i);
                System.arraycopy(zm2Var2.b, 0, copyOf, zm2Var.f1282a, zm2Var2.f1282a);
                Object[] copyOf2 = Arrays.copyOf(zm2Var.c, i);
                System.arraycopy(zm2Var2.c, 0, copyOf2, zm2Var.f1282a, zm2Var2.f1282a);
                zm2Var = new zm2(i, copyOf, copyOf2, true);
            } else {
                zm2Var.getClass();
                if (!zm2Var2.equals(zm2Var3)) {
                    if (!zm2Var.e) {
                        throw new UnsupportedOperationException();
                    }
                    int i2 = zm2Var.f1282a + zm2Var2.f1282a;
                    zm2Var.e(i2);
                    System.arraycopy(zm2Var2.b, 0, zm2Var.b, zm2Var.f1282a, zm2Var2.f1282a);
                    System.arraycopy(zm2Var2.c, 0, zm2Var.c, zm2Var.f1282a, zm2Var2.f1282a);
                    zm2Var.f1282a = i2;
                }
            }
        }
        vl2Var.zzc = zm2Var;
    }

    public static void p(int i, List list, my1 my1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ml2 ml2Var = (ml2) my1Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                byte booleanValue = ((Boolean) list.get(i2)).booleanValue();
                ml2Var.m(i << 3);
                int i3 = ml2Var.d;
                try {
                    int i4 = i3 + 1;
                    try {
                        ml2Var.b[i3] = booleanValue;
                        ml2Var.d = i4;
                        i2++;
                    } catch (IndexOutOfBoundsException e) {
                        e = e;
                        i3 = i4;
                        throw new nl2(i3, ml2Var.c, 1, e);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    e = e2;
                }
            }
            return;
        }
        ml2Var.k(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < list.size(); i6++) {
            ((Boolean) list.get(i6)).getClass();
            i5++;
        }
        ml2Var.m(i5);
        while (i2 < list.size()) {
            byte booleanValue2 = ((Boolean) list.get(i2)).booleanValue();
            int i7 = ml2Var.d;
            try {
                int i8 = i7 + 1;
                try {
                    ml2Var.b[i7] = booleanValue2;
                    ml2Var.d = i8;
                    i2++;
                } catch (IndexOutOfBoundsException e3) {
                    e = e3;
                    i7 = i8;
                    throw new nl2(i7, ml2Var.c, 1, e);
                }
            } catch (IndexOutOfBoundsException e4) {
                e = e4;
            }
        }
    }

    public static void q(int i, List list, my1 my1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ml2 ml2Var = (ml2) my1Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ml2Var.f(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        ml2Var.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Double) list.get(i4)).getClass();
            i3 += 8;
        }
        ml2Var.m(i3);
        while (i2 < list.size()) {
            ml2Var.g(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public static void r(int i, List list, my1 my1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ml2 ml2Var = (ml2) my1Var.g;
        int i2 = 0;
        if (!(list instanceof wl2)) {
            if (!z) {
                while (i2 < list.size()) {
                    ml2Var.h(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ml2Var.k(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ml2.a(((Integer) list.get(i4)).intValue());
            }
            ml2Var.m(i3);
            while (i2 < list.size()) {
                ml2Var.i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        wl2 wl2Var = (wl2) list;
        if (!z) {
            while (i2 < wl2Var.i) {
                ml2Var.h(i, wl2Var.c(i2));
                i2++;
            }
            return;
        }
        ml2Var.k(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wl2Var.i; i6++) {
            i5 += ml2.a(wl2Var.c(i6));
        }
        ml2Var.m(i5);
        while (i2 < wl2Var.i) {
            ml2Var.i(wl2Var.c(i2));
            i2++;
        }
    }

    public static void s(int i, List list, my1 my1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ml2 ml2Var = (ml2) my1Var.g;
        int i2 = 0;
        if (!(list instanceof wl2)) {
            if (!z) {
                while (i2 < list.size()) {
                    ml2Var.d(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ml2Var.k(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            ml2Var.m(i3);
            while (i2 < list.size()) {
                ml2Var.e(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        wl2 wl2Var = (wl2) list;
        if (!z) {
            while (i2 < wl2Var.i) {
                ml2Var.d(i, wl2Var.c(i2));
                i2++;
            }
            return;
        }
        ml2Var.k(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wl2Var.i; i6++) {
            wl2Var.c(i6);
            i5 += 4;
        }
        ml2Var.m(i5);
        while (i2 < wl2Var.i) {
            ml2Var.e(wl2Var.c(i2));
            i2++;
        }
    }

    public static void t(int i, List list, my1 my1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ml2 ml2Var = (ml2) my1Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ml2Var.f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ml2Var.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        ml2Var.m(i3);
        while (i2 < list.size()) {
            ml2Var.g(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void u(int i, List list, my1 my1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ml2 ml2Var = (ml2) my1Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ml2Var.d(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        ml2Var.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Float) list.get(i4)).getClass();
            i3 += 4;
        }
        ml2Var.m(i3);
        while (i2 < list.size()) {
            ml2Var.e(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }

    public static void v(int i, List list, my1 my1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ml2 ml2Var = (ml2) my1Var.g;
        int i2 = 0;
        if (!(list instanceof wl2)) {
            if (!z) {
                while (i2 < list.size()) {
                    ml2Var.h(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ml2Var.k(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += ml2.a(((Integer) list.get(i4)).intValue());
            }
            ml2Var.m(i3);
            while (i2 < list.size()) {
                ml2Var.i(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        wl2 wl2Var = (wl2) list;
        if (!z) {
            while (i2 < wl2Var.i) {
                ml2Var.h(i, wl2Var.c(i2));
                i2++;
            }
            return;
        }
        ml2Var.k(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wl2Var.i; i6++) {
            i5 += ml2.a(wl2Var.c(i6));
        }
        ml2Var.m(i5);
        while (i2 < wl2Var.i) {
            ml2Var.i(wl2Var.c(i2));
            i2++;
        }
    }

    public static void w(int i, List list, my1 my1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ml2 ml2Var = (ml2) my1Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ml2Var.n(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ml2Var.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            i3 += ml2.a(((Long) list.get(i4)).longValue());
        }
        ml2Var.m(i3);
        while (i2 < list.size()) {
            ml2Var.o(((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public static void x(int i, List list, my1 my1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ml2 ml2Var = (ml2) my1Var.g;
        int i2 = 0;
        if (!(list instanceof wl2)) {
            if (!z) {
                while (i2 < list.size()) {
                    ml2Var.d(i, ((Integer) list.get(i2)).intValue());
                    i2++;
                }
                return;
            }
            ml2Var.k(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).getClass();
                i3 += 4;
            }
            ml2Var.m(i3);
            while (i2 < list.size()) {
                ml2Var.e(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        wl2 wl2Var = (wl2) list;
        if (!z) {
            while (i2 < wl2Var.i) {
                ml2Var.d(i, wl2Var.c(i2));
                i2++;
            }
            return;
        }
        ml2Var.k(i, 2);
        int i5 = 0;
        for (int i6 = 0; i6 < wl2Var.i; i6++) {
            wl2Var.c(i6);
            i5 += 4;
        }
        ml2Var.m(i5);
        while (i2 < wl2Var.i) {
            ml2Var.e(wl2Var.c(i2));
            i2++;
        }
    }

    public static void y(int i, List list, my1 my1Var, boolean z) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ml2 ml2Var = (ml2) my1Var.g;
        int i2 = 0;
        if (!z) {
            while (i2 < list.size()) {
                ml2Var.f(i, ((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        ml2Var.k(i, 2);
        int i3 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            ((Long) list.get(i4)).getClass();
            i3 += 8;
        }
        ml2Var.m(i3);
        while (i2 < list.size()) {
            ml2Var.g(((Long) list.get(i2)).longValue());
            i2++;
        }
    }
}
