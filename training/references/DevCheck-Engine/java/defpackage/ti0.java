package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ti0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f989a;

    public ti0() {
        this.f989a = new ArrayList(20);
    }

    public ti0(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new pa1(optJSONObject));
                }
            }
        }
        this.f989a = arrayList;
    }

    public ti0(yh yhVar) {
        yhVar.getClass();
        int i = ob2.f725a;
        uv uvVar = (uv) yhVar.h;
        q21 q21Var = (q21) yhVar.j;
        ArrayList T = zr.T(new ef(uvVar, 0), new ef((ff) yhVar.i), new ef((uv) yhVar.k, 4));
        if (Build.VERSION.SDK_INT >= 28) {
            Context context = (Context) yhVar.g;
            context.getClass();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            T.add(new i21((ConnectivityManager) systemService));
        } else {
            q21Var.getClass();
            T.addAll(zr.S(new ef(q21Var, 2), new ef(q21Var, 3), new g21(q21Var), new f21(q21Var)));
        }
        this.f989a = T;
    }

    public ui0 a() {
        return new ui0((String[]) this.f989a.toArray(new String[0]));
    }

    public void b(String str) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f989a;
            if (i >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i))) {
                arrayList.remove(i);
                arrayList.remove(i);
                i -= 2;
            }
            i += 2;
        }
    }

    public rb0 c(gc2 gc2Var) {
        gc2Var.getClass();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f989a;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            if (((gv) obj).b(gc2Var)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(as.U(arrayList));
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            arrayList3.add(((gv) obj2).a(gc2Var.j));
        }
        return op0.j(new ew(2, (rb0[]) yr.g0(arrayList3).toArray(new rb0[0])));
    }
}
