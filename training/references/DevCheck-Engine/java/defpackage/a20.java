package defpackage;

import android.os.Handler;
import android.widget.FrameLayout;
import java.util.HashMap;
import java.util.List;
import java.util.WeakHashMap;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class a20 implements bq0 {
    public final /* synthetic */ int g;
    public final Object h;
    public final Object i;

    public a20(dq0 dq0Var) {
        this.g = 4;
        this.h = dq0Var;
        yq yqVar = yq.c;
        Class<?> cls = dq0Var.getClass();
        wq wqVar = (wq) yqVar.f1242a.get(cls);
        this.i = wqVar == null ? yqVar.a(cls, null) : wqVar;
    }

    public /* synthetic */ a20(Object obj, int i, Object obj2) {
        this.g = i;
        this.h = obj;
        this.i = obj2;
    }

    public a20(ju1 ju1Var, ne0 ne0Var) {
        this.g = 1;
        this.i = ju1Var;
        this.h = ne0Var;
    }

    public a20(y10 y10Var, bq0 bq0Var) {
        this.g = 0;
        y10Var.getClass();
        this.h = y10Var;
        this.i = bq0Var;
    }

    @Override // defpackage.bq0
    public final void e(eq0 eq0Var, xp0 xp0Var) {
        int i = this.g;
        Object obj = this.h;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                y10 y10Var = (y10) obj;
                switch (z10.f1252a[xp0Var.ordinal()]) {
                    case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                        y10Var.getClass();
                        break;
                    case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                        y10Var.getClass();
                        break;
                    case 3:
                        y10Var.a();
                        break;
                    case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                        y10Var.getClass();
                        break;
                    case 5:
                        y10Var.getClass();
                        break;
                    case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                        y10Var.getClass();
                        break;
                    case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                        c.m("ON_ANY must not been send by anybody");
                        return;
                    default:
                        throw new pt();
                }
                bq0 bq0Var = (bq0) obj2;
                if (bq0Var != null) {
                    bq0Var.e(eq0Var, xp0Var);
                    return;
                }
                return;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ne0 ne0Var = (ne0) obj;
                ju1 ju1Var = (ju1) obj2;
                if (ju1Var.e.M()) {
                    return;
                }
                eq0Var.q().f(this);
                FrameLayout frameLayout = (FrameLayout) ne0Var.g;
                WeakHashMap weakHashMap = y62.f1215a;
                if (frameLayout.isAttachedToWindow()) {
                    ju1Var.z(ne0Var);
                    return;
                }
                return;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                if (xp0Var == xp0.ON_DESTROY) {
                    ((Handler) obj).removeCallbacks((wa) obj2);
                    eq0Var.q().f(this);
                    return;
                }
                return;
            case 3:
                if (xp0Var == xp0.ON_START) {
                    ((gq0) obj).f(this);
                    ((zf) obj2).M();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((wq) obj2).f1142a;
                wq.a((List) hashMap.get(xp0Var), eq0Var, xp0Var, obj);
                wq.a((List) hashMap.get(xp0.ON_ANY), eq0Var, xp0Var, obj);
                return;
        }
    }
}
