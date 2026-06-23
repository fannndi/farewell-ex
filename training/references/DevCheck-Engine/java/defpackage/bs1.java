package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class bs1 extends om0 {
    public static String T(String str) {
        return im1.D(new u20(new fs(2, str), new y20(3, "    ")), "\n");
    }

    public static String U(String str) {
        Comparable comparable;
        String str2;
        List k0 = as1.k0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : k0) {
            if (!as1.i0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(as.U(arrayList));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj2 = arrayList.get(i2);
            i2++;
            String str3 = (String) obj2;
            int length = str3.length();
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    i3 = -1;
                    break;
                }
                if (!ju0.W(str3.charAt(i3))) {
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                i3 = str3.length();
            }
            arrayList2.add(Integer.valueOf(i3));
        }
        Iterator it = arrayList2.iterator();
        if (it.hasNext()) {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        } else {
            comparable = null;
        }
        Integer num = (Integer) comparable;
        int intValue = num != null ? num.intValue() : 0;
        int length2 = str.length();
        k0.size();
        int size2 = k0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : k0) {
            int i4 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str4 = (String) obj3;
            if ((i == 0 || i == size2) && as1.i0(str4)) {
                str2 = null;
            } else {
                str4.getClass();
                if (intValue < 0) {
                    c.d(d51.p(intValue, "Requested character count ", " is less than zero."));
                    return null;
                }
                int length3 = str4.length();
                if (intValue <= length3) {
                    length3 = intValue;
                }
                str2 = str4.substring(length3);
            }
            if (str2 != null) {
                arrayList3.add(str2);
            }
            i = i4;
        }
        StringBuilder sb = new StringBuilder(length2);
        yr.X(arrayList3, sb, "\n", "", "", "...", null);
        return sb.toString();
    }

    public static String V(String str) {
        if (as1.i0("|")) {
            c.m("marginPrefix must be non-blank string.");
            return null;
        }
        List k0 = as1.k0(str);
        int length = str.length();
        k0.size();
        int size = k0.size() - 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : k0) {
            int i2 = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            String str2 = (String) obj;
            if ((i == 0 || i == size) && as1.i0(str2)) {
                str2 = null;
            } else {
                int length2 = str2.length();
                int i3 = 0;
                while (true) {
                    if (i3 >= length2) {
                        i3 = -1;
                        break;
                    }
                    if (!ju0.W(str2.charAt(i3))) {
                        break;
                    }
                    i3++;
                }
                String substring = (i3 != -1 && is1.a0(str2, "|", i3, false)) ? str2.substring("|".length() + i3) : null;
                if (substring != null) {
                    str2 = substring;
                }
            }
            if (str2 != null) {
                arrayList.add(str2);
            }
            i = i2;
        }
        StringBuilder sb = new StringBuilder(length);
        yr.X(arrayList, sb, "\n", "", "", "...", null);
        return sb.toString();
    }
}
