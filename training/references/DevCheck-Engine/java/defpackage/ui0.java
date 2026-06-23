package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class ui0 implements Iterable {
    public static final ui0 h = new ui0(new String[0]);
    public final String[] g;

    public ui0(String[] strArr) {
        strArr.getClass();
        this.g = strArr;
    }

    public final String b(String str) {
        String[] strArr = this.g;
        strArr.getClass();
        int length = strArr.length - 2;
        int z = je2.z(length, 0, -2);
        if (z > length) {
            return null;
        }
        while (!str.equalsIgnoreCase(strArr[length])) {
            if (length == z) {
                return null;
            }
            length -= 2;
        }
        return strArr[length + 1];
    }

    public final String c(int i) {
        String str = (String) u9.o0(i * 2, this.g);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("name[" + i + ']');
    }

    public final ti0 d() {
        ti0 ti0Var = new ti0();
        ArrayList arrayList = ti0Var.f989a;
        arrayList.getClass();
        String[] strArr = this.g;
        strArr.getClass();
        List asList = Arrays.asList(strArr);
        asList.getClass();
        arrayList.addAll(asList);
        return ti0Var;
    }

    public final String e(int i) {
        String str = (String) u9.o0((i * 2) + 1, this.g);
        if (str != null) {
            return str;
        }
        throw new IndexOutOfBoundsException("value[" + i + ']');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ui0) {
            return Arrays.equals(this.g, ((ui0) obj).g);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.g);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        z51[] z51VarArr = new z51[size];
        for (int i = 0; i < size; i++) {
            z51VarArr[i] = new z51(c(i), e(i));
        }
        return new r(1, z51VarArr);
    }

    public final int size() {
        return this.g.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i = 0; i < size; i++) {
            String c = c(i);
            String e = e(i);
            sb.append(c);
            sb.append(": ");
            if (pd2.j(c)) {
                e = "██";
            }
            sb.append(e);
            sb.append("\n");
        }
        return sb.toString();
    }
}
