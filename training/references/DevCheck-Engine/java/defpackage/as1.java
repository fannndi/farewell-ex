package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class as1 extends is1 {
    public static boolean c0(CharSequence charSequence, char c) {
        charSequence.getClass();
        return f0(charSequence, c, 0, 2) >= 0;
    }

    public static boolean d0(CharSequence charSequence, String str) {
        charSequence.getClass();
        return g0(charSequence, str, 0, 2) >= 0;
    }

    public static final int e0(CharSequence charSequence, String str, int i, boolean z) {
        charSequence.getClass();
        str.getClass();
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        rm0 rm0Var = new rm0(i, length, 1);
        boolean z2 = charSequence instanceof String;
        int i2 = rm0Var.i;
        int i3 = rm0Var.h;
        if (!z2) {
            boolean z3 = z;
            if ((i2 <= 0 || i > i3) && (i2 >= 0 || i3 > i)) {
                return -1;
            }
            while (true) {
                CharSequence charSequence2 = charSequence;
                boolean z4 = z3;
                z3 = z4;
                if (m0(str, 0, charSequence2, i, str.length(), z4)) {
                    return i;
                }
                if (i == i3) {
                    return -1;
                }
                i += i2;
                charSequence = charSequence2;
            }
        } else {
            if ((i2 <= 0 || i > i3) && (i2 >= 0 || i3 > i)) {
                return -1;
            }
            int i4 = i;
            while (true) {
                String str2 = str;
                boolean z5 = z;
                if (is1.Y(0, i4, str.length(), str2, (String) charSequence, z5)) {
                    return i4;
                }
                if (i4 == i3) {
                    return -1;
                }
                i4 += i2;
                str = str2;
                z = z5;
            }
        }
    }

    public static int f0(CharSequence charSequence, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        charSequence.getClass();
        return !(charSequence instanceof String) ? h0(charSequence, new char[]{c}, i, false) : ((String) charSequence).indexOf(c, i);
    }

    public static /* synthetic */ int g0(CharSequence charSequence, String str, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return e0(charSequence, str, i, false);
    }

    public static final int h0(CharSequence charSequence, char[] cArr, int i, boolean z) {
        charSequence.getClass();
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(u9.p0(cArr), i);
        }
        if (i < 0) {
            i = 0;
        }
        int length = charSequence.length() - 1;
        if (i > length) {
            return -1;
        }
        while (true) {
            char charAt = charSequence.charAt(i);
            for (char c : cArr) {
                if (ju0.t(c, charAt, z)) {
                    return i;
                }
            }
            if (i == length) {
                return -1;
            }
            i++;
        }
    }

    public static boolean i0(String str) {
        str.getClass();
        for (int i = 0; i < str.length(); i++) {
            if (!ju0.W(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int j0(String str, char c, int i, int i2) {
        if ((i2 & 2) != 0) {
            i = str.length() - 1;
        }
        return str.lastIndexOf(c, i);
    }

    public static List k0(String str) {
        er0 er0Var = new er0(str);
        if (!er0Var.hasNext()) {
            return p80.g;
        }
        Object next = er0Var.next();
        if (!er0Var.hasNext()) {
            return tl2.z(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (er0Var.hasNext()) {
            arrayList.add(er0Var.next());
        }
        return arrayList;
    }

    public static String l0(String str) {
        CharSequence charSequence;
        if (8 <= str.length()) {
            charSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb = new StringBuilder(8);
            int length = 8 - str.length();
            int i = 1;
            if (1 <= length) {
                while (true) {
                    sb.append('0');
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
            sb.append((CharSequence) str);
            charSequence = sb;
        }
        return charSequence.toString();
    }

    public static final boolean m0(CharSequence charSequence, int i, CharSequence charSequence2, int i2, int i3, boolean z) {
        charSequence.getClass();
        charSequence2.getClass();
        if (i2 < 0 || i < 0 || i > charSequence.length() - i3 || i2 > charSequence2.length() - i3) {
            return false;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            if (!ju0.t(charSequence.charAt(i + i4), charSequence2.charAt(i2 + i4), z)) {
                return false;
            }
        }
        return true;
    }

    public static String n0(String str, String str2) {
        return is1.b0(str, str2, false) ? str.substring(str2.length()) : str;
    }

    public static final List o0(CharSequence charSequence, String str) {
        int e0 = e0(charSequence, str, 0, false);
        if (e0 == -1) {
            return tl2.z(charSequence.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int i = 0;
        do {
            arrayList.add(charSequence.subSequence(i, e0).toString());
            i = str.length() + e0;
            e0 = e0(charSequence, str, i, false);
        } while (e0 != -1);
        arrayList.add(charSequence.subSequence(i, charSequence.length()).toString());
        return arrayList;
    }

    public static List p0(String str, char[] cArr) {
        if (cArr.length == 1) {
            return o0(str, String.valueOf(cArr[0]));
        }
        km1 km1Var = new km1(new u20(str, new ej1(2, cArr)));
        ArrayList arrayList = new ArrayList(as.U(km1Var));
        Iterator it = km1Var.iterator();
        while (true) {
            t20 t20Var = (t20) it;
            if (!t20Var.hasNext()) {
                return arrayList;
            }
            rm0 rm0Var = (rm0) t20Var.next();
            rm0Var.getClass();
            arrayList.add(str.subSequence(rm0Var.g, rm0Var.h + 1).toString());
        }
    }

    public static String q0(String str, String str2) {
        int g0 = g0(str, str2, 0, 6);
        return g0 == -1 ? str : str.substring(str2.length() + g0, str.length());
    }

    public static String r0(int i, String str) {
        str.getClass();
        if (i < 0) {
            c.d(d51.p(i, "Requested character count ", " is less than zero."));
            return null;
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        return str.substring(0, i);
    }

    public static CharSequence s0(String str) {
        str.getClass();
        int length = str.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean W = ju0.W(str.charAt(!z ? i : length));
            if (z) {
                if (!W) {
                    break;
                }
                length--;
            } else if (W) {
                i++;
            } else {
                z = true;
            }
        }
        return str.subSequence(i, length + 1);
    }
}
