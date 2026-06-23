package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.PopupWindow;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class jq1 implements View.OnClickListener {
    public final /* synthetic */ int g;
    public final Object h;
    public final /* synthetic */ Object i;

    public jq1(mq1 mq1Var, PopupWindow popupWindow) {
        this.g = 0;
        this.h = mq1Var;
        this.i = popupWindow;
    }

    public jq1(tz1 tz1Var) {
        this.g = 1;
        this.i = tz1Var;
        Context context = tz1Var.f1015a.getContext();
        CharSequence charSequence = tz1Var.h;
        w1 w1Var = new w1();
        w1Var.e = rt0.x;
        w1Var.g = rt0.x;
        w1Var.l = null;
        w1Var.m = null;
        w1Var.n = false;
        w1Var.o = false;
        w1Var.p = 16;
        w1Var.i = context;
        w1Var.f1105a = charSequence;
        this.h = w1Var;
    }

    public /* synthetic */ jq1(z92 z92Var, View view, int i) {
        this.g = i;
        this.i = z92Var;
        this.h = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.g;
        Object obj = this.h;
        Object obj2 = this.i;
        switch (i) {
            case 0:
                ((mq1) obj).b.run();
                ((PopupWindow) obj2).dismiss();
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                tz1 tz1Var = (tz1) obj2;
                Window.Callback callback = tz1Var.k;
                if (callback != null && tz1Var.l) {
                    callback.onMenuItemSelected(0, (w1) obj);
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                ((z92) obj2).p.h().showAsDropDown((ImageView) obj);
                break;
            default:
                ((z92) obj2).p.h().showAsDropDown((View) obj);
                break;
        }
    }
}
