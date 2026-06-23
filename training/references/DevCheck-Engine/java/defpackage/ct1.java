package defpackage;

import java.util.Locale;

/* loaded from: classes.dex */
public final class ct1 implements ti1 {
    public final se0 g;

    public ct1(se0 se0Var) {
        se0Var.getClass();
        this.g = se0Var;
    }

    @Override // defpackage.ti1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final mt1 C(String str) {
        str.getClass();
        se0 se0Var = this.g;
        se0Var.getClass();
        String obj = as1.s0(str).toString();
        if (obj.length() >= 3) {
            String upperCase = obj.substring(0, 3).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            int hashCode = upperCase.hashCode();
            if (hashCode == 79487 ? upperCase.equals("PRA") : !(hashCode == 81978 ? !upperCase.equals("SEL") : !(hashCode == 85954 && upperCase.equals("WIT")))) {
                kt1 kt1Var = new kt1(se0Var, str);
                kt1Var.j = new int[0];
                kt1Var.k = new long[0];
                kt1Var.l = new double[0];
                kt1Var.m = new String[0];
                kt1Var.n = new byte[0][];
                return kt1Var;
            }
        }
        return new lt1(se0Var, str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.g.close();
    }
}
