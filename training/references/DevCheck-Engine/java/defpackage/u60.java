package defpackage;

/* loaded from: classes.dex */
public abstract class u60 implements Comparable {
    public static final j70 g = new j70(13);
    public static final long h = md2.h(4611686018427387903L);
    public static final long i = md2.h(-4611686018427387903L);

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long b = md2.b(j, j3);
        if (-4611686018426L > b || b >= 4611686018427L) {
            return md2.h(b);
        }
        long j4 = ((b * 1000000) + (j2 - (j3 * 1000000))) << 1;
        int i2 = v60.f1072a;
        return j4;
    }

    public static final long b(long j, w60 w60Var) {
        if (j == h) {
            return Long.MAX_VALUE;
        }
        if (j == i) {
            return Long.MIN_VALUE;
        }
        return w60Var.g.convert(j >> 1, ((((int) j) & 1) == 0 ? w60.NANOSECONDS : w60.MILLISECONDS).g);
    }
}
