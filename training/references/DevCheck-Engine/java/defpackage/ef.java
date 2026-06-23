package defpackage;

import android.os.Build;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class ef extends pd {
    public final /* synthetic */ int b;
    public final int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef(ff ffVar) {
        super(ffVar);
        this.b = 1;
        ffVar.getClass();
        this.c = 5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef(q21 q21Var, int i) {
        super(q21Var);
        this.b = i;
        q21Var.getClass();
        switch (i) {
            case 3:
                super(q21Var);
                this.c = 7;
                break;
            default:
                this.c = 7;
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef(uv uvVar, int i) {
        super(uvVar);
        this.b = i;
        uvVar.getClass();
        switch (i) {
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                super(uvVar);
                this.c = 9;
                break;
            default:
                this.c = 6;
                break;
        }
    }

    @Override // defpackage.gv
    public final boolean b(gc2 gc2Var) {
        int i = this.b;
        gc2Var.getClass();
        switch (i) {
            case 0:
                return gc2Var.j.c;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return gc2Var.j.e;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return gc2Var.j.f609a == r21.h;
            case 3:
                return gc2Var.j.f609a == r21.i;
            default:
                return gc2Var.j.f;
        }
    }

    @Override // defpackage.pd
    public final int d() {
        switch (this.b) {
        }
        return this.c;
    }

    @Override // defpackage.pd
    public final boolean e(Object obj) {
        boolean booleanValue;
        switch (this.b) {
            case 0:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                o21 o21Var = (o21) obj;
                o21Var.getClass();
                return o21Var.e || !o21Var.f714a || (Build.VERSION.SDK_INT >= 26 && !o21Var.b);
            case 3:
                o21 o21Var2 = (o21) obj;
                o21Var2.getClass();
                return !o21Var2.f714a || o21Var2.c || o21Var2.e;
            default:
                booleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !booleanValue;
    }
}
