package defpackage;

/* loaded from: classes.dex */
public abstract class is1 extends hs1 {
    public static boolean W(String str, String str2) {
        str.getClass();
        return str.endsWith(str2);
    }

    public static boolean X(String str, String str2) {
        return str == null ? str2 == null : str.equalsIgnoreCase(str2);
    }

    public static boolean Y(int i, int i2, int i3, String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    public static String Z(String str, String str2, String str3) {
        str.getClass();
        int e0 = as1.e0(str, str2, 0, false);
        if (e0 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, e0);
            sb.append(str3);
            i2 = e0 + length;
            if (e0 >= str.length()) {
                break;
            }
            e0 = as1.e0(str, str2, e0 + i, false);
        } while (e0 > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    public static boolean a0(String str, String str2, int i, boolean z) {
        str.getClass();
        return !z ? str.startsWith(str2, i) : Y(i, 0, str2.length(), str, str2, z);
    }

    public static boolean b0(String str, String str2, boolean z) {
        str.getClass();
        return !z ? str.startsWith(str2) : Y(0, 0, str2.length(), str, str2, z);
    }
}
