package defpackage;

import java.io.IOException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class rw implements l31, ld1, rn1 {
    public final /* synthetic */ int g;

    public static /* synthetic */ void b() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void d(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void f(String str) {
        throw new IOException(str);
    }

    public static /* synthetic */ void g(String str, Object obj) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void j(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void k() {
        throw new NoSuchElementException();
    }

    public static /* synthetic */ void l(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static /* synthetic */ void m(String str, Object obj) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void n(String str, Object obj) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void o(String str, Object obj) {
        throw new IllegalArgumentException(str + obj);
    }

    @Override // defpackage.rn1
    public void a(wn1 wn1Var) {
        try {
            Boolean bool = Boolean.TRUE;
            ExecutorService executorService = wn1.m;
            i51.h("prefRoot", bool.equals(ju0.U()));
        } catch (NullPointerException unused) {
            i51.h("prefRoot", false);
        }
    }

    @Override // defpackage.ld1
    public String c(float f) {
        switch (this.g) {
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return String.format(Locale.getDefault(), "%.0f%%", Float.valueOf(f));
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return String.format(Locale.getDefault(), "%.0f MHz", Float.valueOf(f));
            case 3:
                return String.format(Locale.getDefault(), "%.0f", Float.valueOf(f));
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return String.format(Locale.getDefault(), "%.0f%%", Float.valueOf(f));
            case 5:
                return String.format(Locale.getDefault(), "%.1f%%", Float.valueOf(f));
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return String.format(Locale.getDefault(), "%.0f°C", Float.valueOf(f));
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
            case 8:
            case rt0.o /* 9 */:
            case 10:
            case 11:
            case 14:
            case 15:
            case 16:
            case rt0.p /* 17 */:
            default:
                return String.format(Locale.getDefault(), "%.1f%%", Float.valueOf(f));
            case 12:
                return String.format(Locale.getDefault(), "%.1f%%", Float.valueOf(f));
            case 13:
                return v40.u0(f);
            case 18:
                return String.format(Locale.getDefault(), "%.0f", Float.valueOf(f));
            case 19:
                return String.format(Locale.getDefault(), "%.0f%%", Float.valueOf(f));
            case 20:
                return String.format(Locale.getDefault(), "%.0f°C", Float.valueOf(f));
            case 21:
                return String.format(Locale.getDefault(), "%.0f Hz", Float.valueOf(f));
        }
    }

    @Override // defpackage.l31
    public Object e() {
        return new TreeMap();
    }
}
