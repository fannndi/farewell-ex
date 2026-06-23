package defpackage;

import flar2.devcheck.permissionsSummary.xEua.bPnJ;
import flar2.devcheck.systemGraphs.widgets.VqYY.jYVJoqfHJs;
import java.io.Serializable;
import java.time.ZoneId;
import java.time.ZoneOffset;

/* loaded from: classes.dex */
public final class mn0 implements i32 {

    /* renamed from: a, reason: collision with root package name */
    public static final kn0 f646a = new kn0(new String[]{"seconds", "nanos"}, 2);
    public static final kn0 b = new kn0(new String[]{"seconds", "nanos"}, 3);
    public static final kn0 c;
    public static final kn0 d;
    public static final kn0 e;
    public static final kn0 f;
    public static final kn0 g;
    public static final kn0 h;
    public static final b22 i;
    public static final b j;

    public class a extends c22 {
        @Override // defpackage.c22
        public final Object b(ro0 ro0Var) {
            ZoneOffset ofTotalSeconds;
            ZoneId of;
            ro0Var.e();
            String str = null;
            Integer num = null;
            while (ro0Var.Q() != 4) {
                String K = ro0Var.K();
                if (K.equals("totalSeconds")) {
                    num = Integer.valueOf(ro0Var.I());
                } else if (K.equals("id")) {
                    str = ro0Var.O();
                } else {
                    ro0Var.W();
                }
            }
            ro0Var.o();
            if (str != null) {
                of = ZoneId.of(str);
                return of;
            }
            if (num == null) {
                throw new no0("Missing id or totalSeconds field; at path ".concat(ro0Var.v(true)));
            }
            ofTotalSeconds = ZoneOffset.ofTotalSeconds(num.intValue());
            return ofTotalSeconds;
        }

        @Override // defpackage.c22
        public final void c(to0 to0Var, Object obj) {
            String id;
            int totalSeconds;
            ZoneId o = ig0.o(obj);
            if (ln0.s(o)) {
                to0Var.j();
                to0Var.r("totalSeconds");
                totalSeconds = ln0.o(o).getTotalSeconds();
                to0Var.I(totalSeconds);
                to0Var.o();
                return;
            }
            to0Var.j();
            to0Var.r(jYVJoqfHJs.bSlYXnxFL);
            id = o.getId();
            to0Var.K(id);
            to0Var.o();
        }
    }

    public class b implements d22 {
        @Override // defpackage.d22
        public final c22 a(nh0 nh0Var, l32 l32Var) {
            Class cls = l32Var.f569a;
            if (!cls.getName().startsWith("java.time.")) {
                return null;
            }
            if (cls == ln0.e()) {
                return mn0.f646a;
            }
            if (cls == ln0.x()) {
                return mn0.b;
            }
            if (cls == ig0.h()) {
                return mn0.c;
            }
            if (cls == ig0.y()) {
                return mn0.d;
            }
            if (cls == ln0.y()) {
                return mn0.b(nh0Var);
            }
            if (cls == ln0.z()) {
                return mn0.e;
            }
            if (cls == ln0.A()) {
                return new wr(mn0.b(nh0Var), nh0Var.b(new l32(ig0.A())), 1).a();
            }
            if (cls == ln0.B()) {
                kn0 kn0Var = mn0.f646a;
                Class y = ig0.y();
                nh0Var.getClass();
                return new pn0(nh0Var.b(new l32(y)), nh0Var.b(new l32(ig0.A())), 1).a();
            }
            if (cls == ln0.C()) {
                return mn0.f;
            }
            if (cls == ln0.D()) {
                return mn0.g;
            }
            if (cls == ln0.t()) {
                return mn0.h;
            }
            if (cls == ig0.C() || cls == ig0.A()) {
                return mn0.i;
            }
            if (cls == ln0.w()) {
                return new nn0(mn0.b(nh0Var), nh0Var.b(new l32(ig0.A())), nh0Var.b(new l32(ig0.C())), 0).a();
            }
            return null;
        }
    }

    static {
        String str = bPnJ.lhCQuXsDweLE;
        c = new kn0(new String[]{"year", str, "day"}, 4);
        d = new kn0(new String[]{"hour", "minute", "second", "nano"}, 5);
        e = new kn0(new String[]{str, "day"}, 6);
        f = new kn0(new String[]{"years", "months", "days"}, 7);
        g = new kn0(new String[]{"year"}, 0);
        h = new kn0(new String[]{"year", str}, 1);
        i = new a().a();
        j = new b();
    }

    public static void a(Serializable serializable, String str, ro0 ro0Var) {
        if (serializable != null) {
            return;
        }
        StringBuilder w = d51.w("Missing ", str, " field; at path ");
        w.append(ro0Var.v(true));
        throw new no0(w.toString());
    }

    public static b22 b(nh0 nh0Var) {
        Class h2 = ig0.h();
        nh0Var.getClass();
        return new pn0(nh0Var.b(new l32(h2)), nh0Var.b(new l32(ig0.y())), 0).a();
    }
}
