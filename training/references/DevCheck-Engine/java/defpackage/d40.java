package defpackage;

import com.google.android.material.slider.KtNX.UQdsoaJMID;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d40 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f172a = 0;

    static {
        ai1.k("DiagnosticsWrkr");
    }

    public static final void a(cc2 cc2Var, mc2 mc2Var, ou1 ou1Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gc2 gc2Var = (gc2) it.next();
            xb2 q = xc1.q(gc2Var);
            String str = gc2Var.f332a;
            ou1Var.getClass();
            String str2 = q.f1176a;
            int i = q.b;
            str2.getClass();
            mu1 mu1Var = (mu1) tl2.E(ou1Var.f759a, true, false, new nu1(i, str2, 0));
            Integer valueOf = mu1Var != null ? Integer.valueOf(mu1Var.c) : null;
            cc2Var.getClass();
            str.getClass();
            String Z = yr.Z((List) tl2.E(cc2Var.f119a, true, false, new y20(5, str)), ",", null, null, null, 62);
            mc2Var.getClass();
            String Z2 = yr.Z((List) tl2.E(mc2Var.f625a, true, false, new y20(14, str)), ",", null, null, null, 62);
            StringBuilder w = d51.w(UQdsoaJMID.hRBbn, str, "\t ");
            w.append(gc2Var.c);
            w.append("\t ");
            w.append(valueOf);
            w.append("\t ");
            w.append(gc2Var.b.name());
            w.append("\t ");
            w.append(Z);
            w.append("\t ");
            w.append(Z2);
            w.append('\t');
        }
    }
}
