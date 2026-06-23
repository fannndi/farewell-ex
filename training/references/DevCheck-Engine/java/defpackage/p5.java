package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class p5 extends k32 {
    public final /* synthetic */ int j;
    public final /* synthetic */ Object k;

    public /* synthetic */ p5(int i, Object obj) {
        this.j = i;
        this.k = obj;
    }

    @Override // defpackage.l82
    public final void a() {
        int i = this.j;
        Object obj = this.k;
        switch (i) {
            case 0:
                a6 a6Var = ((n5) obj).h;
                a6Var.A.setAlpha(1.0f);
                a6Var.D.d(null);
                a6Var.D = null;
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                a6 a6Var2 = (a6) obj;
                a6Var2.A.setAlpha(1.0f);
                a6Var2.D.d(null);
                a6Var2.D = null;
                break;
            default:
                a6 a6Var3 = (a6) ((i8) obj).h;
                a6Var3.A.setVisibility(8);
                PopupWindow popupWindow = a6Var3.B;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (a6Var3.A.getParent() instanceof View) {
                    View view = (View) a6Var3.A.getParent();
                    WeakHashMap weakHashMap = y62.f1215a;
                    view.requestApplyInsets();
                }
                a6Var3.A.e();
                a6Var3.D.d(null);
                a6Var3.D = null;
                ViewGroup viewGroup = a6Var3.G;
                WeakHashMap weakHashMap2 = y62.f1215a;
                viewGroup.requestApplyInsets();
                break;
        }
    }

    @Override // defpackage.k32, defpackage.l82
    public void c() {
        int i = this.j;
        Object obj = this.k;
        switch (i) {
            case 0:
                ((n5) obj).h.A.setVisibility(0);
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                a6 a6Var = (a6) obj;
                a6Var.A.setVisibility(0);
                if (a6Var.A.getParent() instanceof View) {
                    View view = (View) a6Var.A.getParent();
                    WeakHashMap weakHashMap = y62.f1215a;
                    view.requestApplyInsets();
                    break;
                }
                break;
        }
    }
}
