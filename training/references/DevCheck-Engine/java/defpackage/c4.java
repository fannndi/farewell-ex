package defpackage;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.Map;
import java.util.WeakHashMap;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class c4 implements Comparator {
    public final /* synthetic */ int g;

    public /* synthetic */ c4(int i) {
        this.g = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.g) {
            case 0:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return Double.compare(((pg) obj2).b, ((pg) obj).b);
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                int min = Math.min(str.length(), str2.length());
                int i = 4;
                while (true) {
                    if (i >= min) {
                        int length = str.length();
                        int length2 = str2.length();
                        if (length == length2) {
                            return 0;
                        }
                        if (length < length2) {
                            return -1;
                        }
                    } else {
                        char charAt = str.charAt(i);
                        char charAt2 = str2.charAt(i);
                        if (charAt == charAt2) {
                            i++;
                        } else if (ym0.d(charAt, charAt2) < 0) {
                            return -1;
                        }
                    }
                }
                return 1;
            case 3:
                return !((pm) obj).f.equals(((pm) obj2).f) ? 1 : 0;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return ((ms) obj).c - ((ms) obj2).c;
            case 5:
                WeakHashMap weakHashMap = y62.f1215a;
                float z = ((View) obj).getZ();
                float z2 = ((View) obj2).getZ();
                if (z > z2) {
                    return -1;
                }
                return z < z2 ? 1 : 0;
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return ((i30) obj).f409a.compareToIgnoreCase(((i30) obj2).f409a);
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                return ((j40) obj).f463a - ((j40) obj2).f463a;
            case 8:
                ag0 ag0Var = (ag0) obj;
                ag0 ag0Var2 = (ag0) obj2;
                RecyclerView recyclerView = ag0Var.d;
                if ((recyclerView == null) == (ag0Var2.d == null)) {
                    boolean z3 = ag0Var.f27a;
                    if (z3 == ag0Var2.f27a) {
                        int i2 = ag0Var2.b - ag0Var.b;
                        if (i2 != 0) {
                            return i2;
                        }
                        int i3 = ag0Var.c - ag0Var2.c;
                        if (i3 != 0) {
                            return i3;
                        }
                        return 0;
                    }
                    if (z3) {
                        return -1;
                    }
                } else if (recyclerView != null) {
                    return -1;
                }
                return 1;
            case rt0.o /* 9 */:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 10:
                return ((kp1) obj).h - ((kp1) obj2).h;
            case 11:
                return c3.d((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 12:
                return c3.d((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
            case 13:
                return c3.d(((hv1) obj).f402a, ((hv1) obj2).f402a);
            case 14:
                return c3.d(((jv1) obj).f499a, ((jv1) obj2).f499a);
            case 15:
                return Float.compare(((oy1) obj2).f, ((oy1) obj).f);
            case 16:
                oy1 oy1Var = (oy1) obj;
                oy1 oy1Var2 = (oy1) obj2;
                int a2 = pr.a(oy1Var.d);
                int a3 = pr.a(oy1Var2.d);
                if (a2 != a3 || (a2 = oy1Var.c) != (a3 = oy1Var2.c)) {
                    return a2 - a3;
                }
                String str3 = oy1Var.f768a;
                String str4 = oy1Var.b;
                String str5 = "";
                if (TextUtils.isEmpty(str3)) {
                    str3 = !TextUtils.isEmpty(str4) ? str4 : "";
                }
                String str6 = oy1Var2.f768a;
                String str7 = oy1Var2.b;
                if (!TextUtils.isEmpty(str6)) {
                    str5 = str6;
                } else if (!TextUtils.isEmpty(str7)) {
                    str5 = str7;
                }
                return str3.compareToIgnoreCase(str5);
            case rt0.p /* 17 */:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            default:
                return ((s72) obj).b - ((s72) obj2).b;
        }
    }
}
