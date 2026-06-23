package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class c7 implements Runnable {
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public c7(TextView textView, Typeface typeface, int i) {
        this.g = 0;
        this.i = textView;
        this.j = typeface;
        this.h = i;
    }

    public c7(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.g = 1;
        this.j = bottomSheetBehavior;
        this.i = view;
        this.h = i;
    }

    public /* synthetic */ c7(tt ttVar, int i, Object obj, int i2) {
        this.g = i2;
        this.j = ttVar;
        this.h = i;
        this.i = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.g;
        Object obj = this.i;
        int i2 = this.h;
        Object obj2 = this.j;
        switch (i) {
            case 0:
                ((TextView) obj).setTypeface((Typeface) obj2, i2);
                break;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ((BottomSheetBehavior) obj2).R((View) obj, i2, false);
                break;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                tt ttVar = (tt) obj2;
                Object obj3 = ((b1) obj).g;
                String str = (String) ttVar.f1005a.get(Integer.valueOf(i2));
                if (str != null) {
                    t2 t2Var = (t2) ttVar.e.get(str);
                    if (t2Var == null) {
                        ttVar.g.remove(str);
                        ttVar.f.put(str, obj3);
                        break;
                    } else {
                        p2 p2Var = t2Var.f966a;
                        if (ttVar.d.remove(str)) {
                            p2Var.a(obj3);
                            break;
                        }
                    }
                }
                break;
            default:
                ((tt) obj2).a(i2, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", (IntentSender.SendIntentException) obj));
                break;
        }
    }
}
