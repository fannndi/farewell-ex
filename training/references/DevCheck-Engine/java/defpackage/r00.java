package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class r00 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f868a = Collections.unmodifiableList(Arrays.asList(ly1.g, ly1.h, ly1.i, ly1.m));

    public static List a(Context context) {
        y41 a2;
        ArrayList arrayList;
        String string = context.getSharedPreferences("devcheck_sysfs_thermal_schema", 0).getString("sysfs_schema_json_v1", null);
        if (!TextUtils.isEmpty(string)) {
            try {
                a2 = y41.a(new JSONObject(string));
            } catch (JSONException unused) {
            }
            if (a2 != null || (arrayList = (ArrayList) a2.e) == null || arrayList.isEmpty()) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            for (ly1 ly1Var : f868a) {
                ArrayList arrayList3 = (ArrayList) a2.e;
                int size = arrayList3.size();
                int i = 0;
                zt1 zt1Var = null;
                while (i < size) {
                    Object obj = arrayList3.get(i);
                    i++;
                    zt1 zt1Var2 = (zt1) obj;
                    if (zt1Var2 != null && zt1Var2.k && zt1Var2.e == ly1Var && !TextUtils.isEmpty(zt1Var2.b) && !hashSet.contains(zt1Var2.b) && (zt1Var == null || zt1Var2.h > zt1Var.h)) {
                        zt1Var = zt1Var2;
                    }
                }
                if (zt1Var != null) {
                    hashSet.add(zt1Var.b);
                    if (TextUtils.isEmpty(zt1Var.d)) {
                        TextUtils.isEmpty(zt1Var.c);
                    }
                    arrayList2.add(new q00(zt1Var.b, zt1Var.e));
                    if (arrayList2.size() >= 2) {
                        return arrayList2;
                    }
                }
            }
            return arrayList2;
        }
        a2 = null;
        if (a2 != null) {
        }
        return Collections.EMPTY_LIST;
    }
}
