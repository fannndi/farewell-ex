package defpackage;

/* loaded from: classes.dex */
public enum cb1 {
    i("http/1.0"),
    j("http/1.1"),
    k("spdy/3.1"),
    l("h2"),
    m("h2_prior_knowledge"),
    n("quic"),
    o("h3");

    public static final ai1 h = new ai1();
    public final String g;

    cb1(String str) {
        this.g = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.g;
    }
}
