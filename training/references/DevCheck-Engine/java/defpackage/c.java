package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements ld1, wg, ww1, zo0, l31 {
    public final /* synthetic */ int g;

    public /* synthetic */ c(int i) {
        this.g = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(int i, String str, int i2) {
        throw new IllegalArgumentException((str + i + ((char) i2)).toString());
    }

    public static /* synthetic */ void b(ld0 ld0Var, String str) {
        throw new IllegalStateException(str + ((Object) ld0Var.toString()) + ((Object) " is already attached to a FragmentManager."));
    }

    public static /* synthetic */ void d(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void g(String str) {
        throw new IndexOutOfBoundsException(str);
    }

    public static /* synthetic */ void i(String str, int i, Object obj, int i2) {
        throw new IllegalArgumentException((str + i + obj + i2).toString());
    }

    public static /* synthetic */ void j(String str, long j) {
        throw new IllegalArgumentException((str + j).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void l(StringBuilder sb, Object obj) {
        sb.append(obj);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void m(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void n(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void o(String str) {
        throw new RuntimeException(str);
    }

    @Override // defpackage.ld1
    public String c(float f) {
        switch (this.g) {
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return String.format(Locale.getDefault(), "%.0f mA", Float.valueOf(f));
            case 3:
                return String.format(Locale.getDefault(), "%.3f V", Float.valueOf(f));
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return String.format(Locale.getDefault(), "%.2f W", Float.valueOf(f));
            case 5:
                return String.format(Locale.getDefault(), "%.2f %%/min", Float.valueOf(f));
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return String.format(Locale.getDefault(), "%.0f°C", Float.valueOf(f));
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                return String.format(Locale.getDefault(), "%.0f mAh", Float.valueOf(f));
            default:
                return String.format(Locale.getDefault(), "%.0f", Float.valueOf(f));
        }
    }

    @Override // defpackage.l31
    public Object e() {
        switch (this.g) {
            case 22:
                return new ArrayList();
            case 23:
                return new ConcurrentHashMap();
            case 24:
                return new ConcurrentSkipListMap();
            case 25:
                return new LinkedHashSet();
            case 26:
                return new TreeSet();
            case 27:
                return new ArrayDeque();
            case 28:
                return new ir0(true);
            default:
                return new LinkedHashMap();
        }
    }

    @Override // defpackage.ww1
    public void f(String str) {
    }

    @Override // defpackage.wg
    public void h(mi miVar) {
        switch (this.g) {
            case rt0.o /* 9 */:
                int i = miVar.g;
                miVar.d = null;
                miVar.e = null;
                miVar.f = -1;
                miVar.g = i;
                break;
            default:
                miVar.f634a = 2;
                miVar.o = 0;
                break;
        }
    }
}
