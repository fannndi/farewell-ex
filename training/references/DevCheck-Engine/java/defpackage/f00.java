package defpackage;

import android.widget.TextView;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class f00 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ f00(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.g = i;
        this.h = obj;
        this.i = obj2;
        this.j = obj3;
        this.k = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView;
        int i = this.g;
        Object obj = this.k;
        Object obj2 = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        switch (i) {
            case 0:
                p00 p00Var = (p00) obj4;
                String str = (String) obj3;
                String str2 = (String) obj2;
                String str3 = (String) obj;
                int i2 = p00.H1;
                if (p00Var.G() && p00Var.K0 != null && p00Var.L0 != null && (textView = p00Var.J0) != null) {
                    try {
                        textView.setText(str);
                        p00Var.K0.setText(str2);
                        p00Var.L0.setText(str3);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                List list = (List) obj4;
                xb2 xb2Var = (xb2) obj3;
                ju juVar = (ju) obj2;
                WorkDatabase workDatabase = (WorkDatabase) obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((bk1) it.next()).a(xb2Var.f1176a);
                }
                ek1.b(juVar, workDatabase, list);
                break;
        }
    }
}
