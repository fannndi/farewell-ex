package defpackage;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class om2 {
    public static final om2 c = new om2();
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final gm2 f748a = new gm2(0);

    public final rm2 a(Class cls) {
        rm2 mm2Var;
        Charset charset = zl2.f1280a;
        if (cls == null) {
            jw0.f("messageType");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.b;
        rm2 rm2Var = (rm2) concurrentHashMap.get(cls);
        if (rm2Var != null) {
            return rm2Var;
        }
        gm2 gm2Var = this.f748a;
        gm2Var.getClass();
        x42 x42Var = sm2.f944a;
        vl2.class.isAssignableFrom(cls);
        qm2 d = ((my1) gm2Var.h).d(cls);
        if ((d.d & 2) == 2) {
            x42 x42Var2 = sm2.f944a;
            m52 m52Var = pl2.f796a;
            mm2Var = new mm2(x42Var2, d.f851a);
        } else {
            int i = nm2.f691a;
            int i2 = fm2.f296a;
            x42 x42Var3 = sm2.f944a;
            m52 m52Var2 = d.a() + (-1) != 1 ? pl2.f796a : null;
            int i3 = im2.f440a;
            mm2Var = lm2.u(d, x42Var3, m52Var2);
        }
        rm2 rm2Var2 = (rm2) concurrentHashMap.putIfAbsent(cls, mm2Var);
        return rm2Var2 == null ? mm2Var : rm2Var2;
    }
}
