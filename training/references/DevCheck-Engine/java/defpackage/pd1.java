package defpackage;

import android.os.Bundle;
import android.view.View;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class pd1 implements bq0 {
    public final /* synthetic */ int g;
    public final Object h;

    public /* synthetic */ pd1(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    @Override // defpackage.bq0
    public final void e(eq0 eq0Var, xp0 xp0Var) {
        View view;
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                yj1 yj1Var = (yj1) obj;
                if (xp0Var != xp0.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                eq0Var.q().f(this);
                Bundle g = yj1Var.a().g("androidx.savedstate.Restarter");
                if (g == null) {
                    return;
                }
                ArrayList<String> stringArrayList = g.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    c.n("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                    return;
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> asSubclass = Class.forName(str2, false, pd1.class.getClassLoader()).asSubclass(uj1.class);
                        asSubclass.getClass();
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                newInstance.getClass();
                                if (!(yj1Var instanceof o72)) {
                                    jw0.g("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: ", yj1Var);
                                    return;
                                }
                                n72 l = ((o72) yj1Var).l();
                                zf a2 = yj1Var.a();
                                l.getClass();
                                LinkedHashMap linkedHashMap = l.f668a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str3 = (String) it.next();
                                    str3.getClass();
                                    i72 i72Var = (i72) linkedHashMap.get(str3);
                                    if (i72Var != null) {
                                        om0.b(i72Var, a2, yj1Var.q());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    a2.M();
                                }
                            } catch (Exception e) {
                                jw0.k("Failed to instantiate ", str2, e);
                                return;
                            }
                        } catch (NoSuchMethodException e2) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                        }
                    } catch (ClassNotFoundException e3) {
                        jw0.l(d51.y("Class ", str2, " wasn't found"), e3);
                        return;
                    }
                }
                return;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                new HashMap();
                cg0[] cg0VarArr = (cg0[]) obj;
                if (cg0VarArr.length > 0) {
                    cg0 cg0Var = cg0VarArr[0];
                    throw null;
                }
                if (cg0VarArr.length <= 0) {
                    return;
                }
                cg0 cg0Var2 = cg0VarArr[0];
                throw null;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                if (xp0Var != xp0.ON_STOP || (view = ((ld0) obj).M) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 3:
                ((ie0) obj).b(false);
                return;
            default:
                if (xp0Var != xp0.ON_CREATE) {
                    jw0.g("Next event must be ON_CREATE, it was ", xp0Var);
                    return;
                } else {
                    eq0Var.q().f(this);
                    ((sj1) obj).b();
                    return;
                }
        }
    }
}
