package defpackage;

/* loaded from: classes.dex */
public final class um implements Comparable {
    public final String g;
    public final String h;
    public final String i;
    public final long j;
    public final int k;

    public um(String str, long j, String str2, String str3, int i) {
        this.g = str;
        this.j = j;
        this.h = str2;
        this.i = str3;
        this.k = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.j, ((um) obj).j);
    }
}
