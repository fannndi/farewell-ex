package defpackage;

/* loaded from: classes.dex */
public final class cd0 implements Comparable {
    public final int g;
    public final int h;
    public final String i;
    public final String j;

    public cd0(int i, int i2, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.g = i;
        this.h = i2;
        this.i = str;
        this.j = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        cd0 cd0Var = (cd0) obj;
        cd0Var.getClass();
        int i = this.g - cd0Var.g;
        return i == 0 ? this.h - cd0Var.h : i;
    }
}
