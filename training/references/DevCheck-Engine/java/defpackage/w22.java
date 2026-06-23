package defpackage;

import com.google.android.material.behavior.YqV.Gvyagftz;
import java.util.Currency;

/* loaded from: classes.dex */
public class w22 extends c22 {
    @Override // defpackage.c22
    public final Object b(ro0 ro0Var) {
        String O = ro0Var.O();
        try {
            return Currency.getInstance(O);
        } catch (IllegalArgumentException e) {
            StringBuilder w = d51.w(Gvyagftz.ftaDLF, O, "' as Currency; at path ");
            w.append(ro0Var.v(true));
            throw new no0(w.toString(), e);
        }
    }

    @Override // defpackage.c22
    public final void c(to0 to0Var, Object obj) {
        to0Var.K(((Currency) obj).getCurrencyCode());
    }
}
