package defpackage;

/* loaded from: classes.dex */
public abstract class co0 {

    /* renamed from: a, reason: collision with root package name */
    public static final o1 f132a = new o1(6, "COMPLETING_ALREADY");
    public static final o1 b = new o1(6, "COMPLETING_WAITING_CHILDREN");
    public static final o1 c = new o1(6, "COMPLETING_RETRY");
    public static final o1 d = new o1(6, "TOO_LATE_TO_CANCEL");
    public static final o1 e = new o1(6, "SEALED");
    public static final l80 f = new l80(false);
    public static final l80 g = new l80(true);

    public static final Object a(Object obj) {
        vl0 vl0Var;
        wl0 wl0Var = obj instanceof wl0 ? (wl0) obj : null;
        return (wl0Var == null || (vl0Var = wl0Var.f1138a) == null) ? obj : vl0Var;
    }
}
