package defpackage;

/* loaded from: classes.dex */
public final class pj2 {
    public static final pj2 c;
    public static final pj2 d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f793a;
    public final Throwable b;

    static {
        if (zj2.j) {
            d = null;
            c = null;
        } else {
            d = new pj2(null, false);
            c = new pj2(null, true);
        }
    }

    public pj2(Throwable th, boolean z) {
        this.f793a = z;
        this.b = th;
    }
}
