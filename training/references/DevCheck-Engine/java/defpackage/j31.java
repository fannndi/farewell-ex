package defpackage;

import com.google.android.material.slider.KtNX.UQdsoaJMID;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class j31 implements d22 {
    public final /* synthetic */ int g;
    public final /* synthetic */ c22 h;

    public /* synthetic */ j31(c22 c22Var, int i) {
        this.g = i;
        this.h = c22Var;
    }

    @Override // defpackage.d22
    public final c22 a(nh0 nh0Var, l32 l32Var) {
        int i = this.g;
        c22 c22Var = this.h;
        switch (i) {
            case 0:
                if (l32Var.f569a == Number.class) {
                    return (k31) c22Var;
                }
                return null;
            default:
                Class cls = l32Var.f569a;
                if (cls == Calendar.class || cls == GregorianCalendar.class) {
                    return (kn0) c22Var;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.g) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((kn0) this.h) + UQdsoaJMID.EQq;
            default:
                return super.toString();
        }
    }
}
