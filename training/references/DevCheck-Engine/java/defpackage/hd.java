package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class hd extends v00 {
    public final gd f;

    public hd(np npVar, i82 i82Var) {
        super(npVar, i82Var);
        gd gdVar = new gd();
        gdVar.d = this;
        this.f = gdVar;
    }

    public static boolean t(fd fdVar) {
        if (fdVar.i) {
            return fdVar.e || fdVar.f;
        }
        return false;
    }

    public final boolean s(e90 e90Var, fd fdVar) {
        List list = fdVar.j;
        if (e90Var == null) {
            return false;
        }
        float indexOf = list.indexOf(e90Var);
        float size = list.size();
        this.b.getClass();
        return indexOf < size * 1.0f;
    }
}
