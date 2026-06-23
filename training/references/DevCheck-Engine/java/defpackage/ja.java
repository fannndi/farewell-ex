package defpackage;

/* loaded from: classes.dex */
public final class ja implements m31 {

    /* renamed from: a, reason: collision with root package name */
    public static final ja f470a = new ja();
    public static final kb0 b = kb0.a("eventTimeMs");
    public static final kb0 c = kb0.a("eventCode");
    public static final kb0 d = kb0.a("eventUptimeMs");
    public static final kb0 e = kb0.a("sourceExtension");
    public static final kb0 f = kb0.a("sourceExtensionJsonProto3");
    public static final kb0 g = kb0.a("timezoneOffsetSeconds");
    public static final kb0 h = kb0.a("networkConnectionInfo");

    @Override // defpackage.t80
    public final void a(Object obj, Object obj2) {
        zs0 zs0Var = (zs0) obj;
        n31 n31Var = (n31) obj2;
        n31Var.d(b, ((gb) zs0Var).f326a);
        gb gbVar = (gb) zs0Var;
        n31Var.a(c, gbVar.b);
        n31Var.d(d, gbVar.c);
        n31Var.a(e, gbVar.d);
        n31Var.a(f, gbVar.e);
        n31Var.d(g, gbVar.f);
        n31Var.a(h, gbVar.g);
    }
}
