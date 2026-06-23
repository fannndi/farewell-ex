package defpackage;

import android.os.Bundle;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import java.util.Arrays;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class rj1 {

    /* renamed from: a, reason: collision with root package name */
    public static final pg0 f898a = new pg0();
    public static final ai1 b = new ai1();
    public static final j70 c = new j70(25);

    public static final oj1 a(py0 py0Var) {
        LinkedHashMap linkedHashMap = py0Var.f1057a;
        yj1 yj1Var = (yj1) linkedHashMap.get(f898a);
        Bundle bundle = null;
        if (yj1Var == null) {
            c.m("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        o72 o72Var = (o72) linkedHashMap.get(b);
        if (o72Var == null) {
            c.m(hTYJVDOvZnZlYL.Imjk);
            return null;
        }
        Bundle bundle2 = (Bundle) linkedHashMap.get(c);
        String str = (String) linkedHashMap.get(m72.f619a);
        if (str == null) {
            c.m("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        vj1 B = yj1Var.a().B();
        sj1 sj1Var = B instanceof sj1 ? (sj1) B : null;
        if (sj1Var == null) {
            c.n("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        LinkedHashMap linkedHashMap2 = c(o72Var).b;
        oj1 oj1Var = (oj1) linkedHashMap2.get(str);
        if (oj1Var != null) {
            return oj1Var;
        }
        sj1Var.b();
        Bundle bundle3 = sj1Var.c;
        if (bundle3 != null && bundle3.containsKey(str)) {
            Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = md2.d((z51[]) Arrays.copyOf(new z51[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                sj1Var.c = null;
            }
            bundle = bundle4;
        }
        oj1 h = tl2.h(bundle, bundle2);
        linkedHashMap2.put(str, h);
        return h;
    }

    public static final void b(yj1 yj1Var) {
        yp0 yp0Var = yj1Var.q().c;
        if (yp0Var != yp0.h && yp0Var != yp0.i) {
            c.m("Failed requirement.");
        } else if (yj1Var.a().B() == null) {
            sj1 sj1Var = new sj1(yj1Var.a(), (o72) yj1Var);
            yj1Var.a().K("androidx.lifecycle.internal.SavedStateHandlesProvider", sj1Var);
            yj1Var.q().a(new pd1(4, sj1Var));
        }
    }

    public static final tj1 c(o72 o72Var) {
        qj1 qj1Var = new qj1();
        uy h = o72Var instanceof ni0 ? ((ni0) o72Var).h() : ty.b;
        h.getClass();
        n72 l = o72Var.l();
        l.getClass();
        return (tj1) new gr(l, qj1Var, h).t(af1.a(tj1.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }
}
