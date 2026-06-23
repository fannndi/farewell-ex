package defpackage;

import java.io.Serializable;

/* loaded from: classes.dex */
public final class ve implements Cloneable, Serializable {
    public final String g;
    public final String h;

    public ve(String str, String str2) {
        this.g = str;
        this.h = str2;
    }

    public final Object clone() {
        return super.clone();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ve) {
                ve veVar = (ve) obj;
                if (this.g.equals(veVar.g)) {
                    String str = veVar.h;
                    String str2 = this.h;
                    if (str2 == null ? str == null : str2.equals(str)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.g.hashCode() + 629;
        String str = this.h;
        return (hashCode * 37) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String str = this.h;
        String str2 = this.g;
        if (str == null) {
            return str2;
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length() + 1);
        sb.append(str2);
        sb.append("=");
        sb.append(str);
        return sb.toString();
    }
}
