package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class my1 implements jm2 {
    public Object g;

    public my1(Context context) {
        this.g = op0.m(context.getApplicationContext());
    }

    public /* synthetic */ my1(Object obj) {
        this.g = obj;
    }

    public String a() {
        go1 go1Var = (go1) this.g;
        if (go1Var != null) {
            try {
                if (go1Var.b() && go1Var.d()) {
                    String u = ju0.u("dumpsys thermalservice");
                    return u != null ? u : "";
                }
            } catch (Exception unused) {
                return "";
            }
        }
        if (!i51.b("prefRoot").booleanValue()) {
            return "";
        }
        rg1 o = wn1.a("dumpsys thermalservice").o();
        if (!o.e()) {
            return "";
        }
        List c = o.c();
        StringBuilder sb = new StringBuilder();
        Iterator it = c.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void b(int i, Object obj, rm2 rm2Var) {
        ml2 ml2Var = (ml2) this.g;
        ml2Var.k(i, 3);
        rm2Var.h((dl2) obj, ml2Var.f641a);
        ml2Var.k(i, 4);
    }

    public void c(int i, Object obj, rm2 rm2Var) {
        dl2 dl2Var = (dl2) obj;
        ml2 ml2Var = (ml2) this.g;
        ml2Var.m((i << 3) | 2);
        ml2Var.m(dl2Var.a(rm2Var));
        rm2Var.h(dl2Var, ml2Var.f641a);
    }

    @Override // defpackage.jm2
    public qm2 d(Class cls) {
        for (int i = 0; i < 2; i++) {
            jm2 jm2Var = ((jm2[]) this.g)[i];
            if (jm2Var.f(cls)) {
                return jm2Var.d(cls);
            }
        }
        rw.l("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // defpackage.jm2
    public boolean f(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((jm2[]) this.g)[i].f(cls)) {
                return true;
            }
        }
        return false;
    }
}
