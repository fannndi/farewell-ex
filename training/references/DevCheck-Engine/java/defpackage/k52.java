package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k52 {
    public static final k52 f = new k52(0.0d, 0.0d, 0.0d, 0.0d, 0.0d);

    /* renamed from: a, reason: collision with root package name */
    public final double f516a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;

    public k52(double d, double d2, double d3, double d4, double d5) {
        this.f516a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
    }

    public static void a(double d, ArrayList arrayList) {
        if (!Double.isFinite(d) || d <= 0.0d) {
            return;
        }
        arrayList.add(Double.valueOf(d));
    }

    public static boolean b(double d, double d2) {
        return Math.abs(d - d2) < 0.5d;
    }

    public static k52 c(List list) {
        if (list == null || list.isEmpty()) {
            return f;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        ArrayList arrayList4 = new ArrayList(list.size());
        ArrayList arrayList5 = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            li liVar = (li) it.next();
            if (liVar != null) {
                a(liVar.e, arrayList);
                String str = liVar.f;
                if (str != null && !str.isEmpty()) {
                    try {
                        JSONObject jSONObject = new JSONObject(liVar.f);
                        a(jSONObject.optDouble("cpu", 0.0d), arrayList2);
                        a(jSONObject.optDouble("memory", 0.0d), arrayList3);
                        a(jSONObject.optDouble("disk", 0.0d), arrayList4);
                        a(jSONObject.optDouble("gpu", 0.0d), arrayList5);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return new k52(d(arrayList), d(arrayList2), d(arrayList3), d(arrayList4), d(arrayList5));
    }

    public static double d(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return 0.0d;
        }
        Collections.sort(arrayList);
        if (size % 2 != 0) {
            return ((Double) arrayList.get(size / 2)).doubleValue();
        }
        int i = size / 2;
        return (((Double) arrayList.get(i)).doubleValue() + ((Double) arrayList.get(i - 1)).doubleValue()) / 2.0d;
    }
}
