package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class fo0 implements d22 {
    public static final eo0 i;
    public final zf g;
    public final ConcurrentHashMap h = new ConcurrentHashMap();

    static {
        int i2 = 0;
        i = new eo0(i2);
        new eo0(i2);
    }

    public fo0(zf zfVar) {
        this.g = zfVar;
    }

    @Override // defpackage.d22
    public final c22 a(nh0 nh0Var, l32 l32Var) {
        do0 do0Var = (do0) l32Var.f569a.getAnnotation(do0.class);
        if (do0Var == null) {
            return null;
        }
        return b(this.g, nh0Var, l32Var, do0Var, true);
    }

    public final c22 b(zf zfVar, nh0 nh0Var, l32 l32Var, do0 do0Var, boolean z) {
        c22 a2;
        Object e = zfVar.z(new l32(do0Var.value()), true).e();
        boolean nullSafe = do0Var.nullSafe();
        if (e instanceof c22) {
            a2 = (c22) e;
        } else {
            if (!(e instanceof d22)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + e.getClass().getName() + " as a @JsonAdapter for " + sl.q0(l32Var.b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            d22 d22Var = (d22) e;
            if (z) {
                d22 d22Var2 = (d22) this.h.putIfAbsent(l32Var.f569a, d22Var);
                if (d22Var2 != null) {
                    d22Var = d22Var2;
                }
            }
            a2 = d22Var.a(nh0Var, l32Var);
        }
        return (a2 == null || !nullSafe) ? a2 : a2.a();
    }
}
