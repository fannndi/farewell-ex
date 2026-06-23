package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public final /* synthetic */ class st implements q41 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f954a;
    public final /* synthetic */ zt b;

    public /* synthetic */ st(zt ztVar, int i) {
        this.f954a = i;
        this.b = ztVar;
    }

    @Override // defpackage.q41
    public final void a() {
        int i = this.f954a;
        zt ztVar = this.b;
        switch (i) {
            case 0:
                Bundle g = ((zf) ztVar.k.i).g("android:support:activity-result");
                if (g != null) {
                    tt ttVar = ztVar.r;
                    HashMap hashMap = ttVar.b;
                    HashMap hashMap2 = ttVar.f1005a;
                    Bundle bundle = ttVar.g;
                    ArrayList<Integer> integerArrayList = g.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = g.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ttVar.d = g.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        bundle.putAll(g.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                        for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
                            String str = stringArrayList.get(i2);
                            if (hashMap.containsKey(str)) {
                                Integer num = (Integer) hashMap.remove(str);
                                if (!bundle.containsKey(str)) {
                                    hashMap2.remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i2);
                            num2.intValue();
                            String str2 = stringArrayList.get(i2);
                            hashMap2.put(num2, str2);
                            ttVar.b.put(str2, num2);
                        }
                        break;
                    }
                }
                break;
            default:
                nd0 nd0Var = (nd0) ((a5) ztVar).z.g;
                nd0Var.q.b(nd0Var, nd0Var, null);
                break;
        }
    }
}
