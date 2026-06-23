package defpackage;

import com.google.android.datatransport.runtime.backends.XUas.yFbVsaLCWAtQC;
import com.google.android.material.snackbar.qXlx.IGQCApxXGMWo;

/* loaded from: classes.dex */
public final class v2 {

    /* renamed from: a, reason: collision with root package name */
    public int f1066a;
    public int b;
    public Object c;
    public int d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof v2)) {
                return false;
            }
            v2 v2Var = (v2) obj;
            int i = this.f1066a;
            if (i != v2Var.f1066a) {
                return false;
            }
            if (i != 8 || Math.abs(this.d - this.b) != 1 || this.d != v2Var.b || this.b != v2Var.d) {
                if (this.d != v2Var.d || this.b != v2Var.b) {
                    return false;
                }
                Object obj2 = this.c;
                Object obj3 = v2Var.c;
                if (obj2 != null) {
                    if (!obj2.equals(obj3)) {
                        return false;
                    }
                } else if (obj3 != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f1066a * 31) + this.b) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f1066a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : IGQCApxXGMWo.xhvhrKurnlqAs);
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.c);
        sb.append(yFbVsaLCWAtQC.CpGiJxICT);
        return sb.toString();
    }
}
