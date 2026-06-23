package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class q2 extends d10 {
    public final /* synthetic */ int g;

    public /* synthetic */ q2(int i) {
        this.g = i;
    }

    @Override // defpackage.d10
    public b1 E(Context context, Object obj) {
        switch (this.g) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    return new b1(q80.g);
                }
                for (String str : strArr) {
                    if (pr.g(context, str) != 0) {
                        return null;
                    }
                }
                int Z = ju0.Z(strArr.length);
                if (Z < 16) {
                    Z = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(Z);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new b1(linkedHashMap);
            default:
                return super.E(context, obj);
        }
    }

    @Override // defpackage.d10
    public final Object M(Intent intent, int i) {
        switch (this.g) {
            case 0:
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            arrayList.add(Boolean.valueOf(i2 == 0));
                        }
                        ArrayList n0 = u9.n0(stringArrayExtra);
                        Iterator it = n0.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(as.U(n0), as.U(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new z51(it.next(), it2.next()));
                        }
                        break;
                    }
                }
                break;
        }
        return new o2(intent, i);
    }

    @Override // defpackage.d10
    public final Intent i(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.g) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                putExtra.getClass();
                return putExtra;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                Intent intent = (Intent) obj;
                intent.getClass();
                return intent;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                wm0 wm0Var = (wm0) obj;
                wm0Var.getClass();
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", wm0Var);
                putExtra2.getClass();
                return putExtra2;
            default:
                wm0 wm0Var2 = (wm0) obj;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = wm0Var2.h;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = wm0Var2.g;
                        intentSender.getClass();
                        wm0Var2 = new wm0(intentSender, null, wm0Var2.i, wm0Var2.j);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", wm0Var2);
                if (ae0.H(2)) {
                    intent2.toString();
                }
                return intent2;
        }
    }
}
