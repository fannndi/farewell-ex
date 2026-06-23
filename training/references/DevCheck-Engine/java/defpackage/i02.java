package defpackage;

import android.view.View;
import flar2.devcheck.tools.USBActivity;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class i02 implements View.OnClickListener {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ i02(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.g;
        Object obj = this.h;
        switch (i) {
            case 0:
                p8 p8Var = ((k02) obj).f;
                if (p8Var != null) {
                    ((cj) p8Var.h).G0();
                    break;
                }
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                int i2 = USBActivity.S;
                ((USBActivity) obj).B();
                break;
            default:
                s92 s92Var = (s92) obj;
                t92 t92Var = s92Var.Q;
                int b = s92Var.b();
                if (b != -1) {
                    break;
                }
                break;
        }
    }
}
