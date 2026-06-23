package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class rt implements vj1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f906a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rt(int i, Object obj) {
        this.f906a = i;
        this.b = obj;
    }

    @Override // defpackage.vj1
    public final Bundle a() {
        z51[] z51VarArr;
        int i = this.f906a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                tt ttVar = ((zt) obj).r;
                ttVar.getClass();
                HashMap hashMap = ttVar.b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(hashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(hashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(ttVar.d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) ttVar.g.clone());
                return bundle;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                a5 a5Var = (a5) obj;
                while (a5.t(a5Var.s())) {
                }
                a5Var.A.d(xp0.ON_STOP);
                return new Bundle();
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return ((ae0) obj).V();
            default:
                yh yhVar = (yh) obj;
                for (Map.Entry entry : ju0.v0((LinkedHashMap) yhVar.j).entrySet()) {
                    yhVar.d((String) entry.getKey(), ((zq1) entry.getValue()).e());
                }
                for (Map.Entry entry2 : ju0.v0((LinkedHashMap) yhVar.h).entrySet()) {
                    yhVar.d((String) entry2.getKey(), ((vj1) entry2.getValue()).a());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) yhVar.g;
                if (linkedHashMap.isEmpty()) {
                    z51VarArr = new z51[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        arrayList.add(new z51((String) entry3.getKey(), entry3.getValue()));
                    }
                    z51VarArr = (z51[]) arrayList.toArray(new z51[0]);
                }
                return md2.d((z51[]) Arrays.copyOf(z51VarArr, z51VarArr.length));
        }
    }
}
