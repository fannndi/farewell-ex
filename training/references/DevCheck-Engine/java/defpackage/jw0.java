package defpackage;

import flar2.devcheck.tools.ToolsActivity;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Locale;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class jw0 implements ux1, ld1, xt1, ur1, s41 {
    public static final jw0 h = new jw0(24);
    public static final jw0 i = new jw0(25);
    public static final jw0 j = new jw0(26);
    public static final jw0 k = new jw0(27);
    public static final jw0 l = new jw0(28);
    public final /* synthetic */ int g;

    public /* synthetic */ jw0(int i2) {
        this.g = i2;
    }

    public static /* synthetic */ void b(int i2, String str) {
        throw new IllegalStateException(str + i2);
    }

    public static /* synthetic */ void e(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void f(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void g(String str, Object obj) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException(str + obj + obj2 + obj3);
    }

    public static /* synthetic */ void k(String str, Object obj, Throwable th) {
        throw new RuntimeException(str + obj, th);
    }

    public static /* synthetic */ void l(String str, Throwable th) {
        throw new RuntimeException(str, th);
    }

    public static /* synthetic */ void m(int i2, String str) {
        throw new IllegalStateException((str + i2).toString());
    }

    public static /* synthetic */ void n(String str, Object obj) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void p(String str, Object obj) {
        throw new FileNotFoundException(str + obj);
    }

    private final void q() {
    }

    @Override // defpackage.ur1
    public void a(yr1 yr1Var) {
        switch (this.g) {
            case 16:
                yr1Var.f1244a = 6;
                break;
            case rt0.p /* 17 */:
                yr1Var.f1244a = 3;
                yr1Var.e = 30;
                break;
            default:
                yr1Var.g = null;
                break;
        }
    }

    @Override // defpackage.ld1
    public String c(float f) {
        switch (this.g) {
            case 0:
                return String.format(Locale.getDefault(), "%.0f/s", Float.valueOf(f));
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return w11.u0(f);
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return String.format(Locale.getDefault(), "%.0f dBm", Float.valueOf(f));
            case 3:
                return String.format(Locale.getDefault(), "%.0f Mbps", Float.valueOf(f));
            default:
                return et.f248a.d("prefFahrenheit") ? String.format(Locale.getDefault(), "%.0f°F", Float.valueOf(((f * 9.0f) / 5.0f) + 32.0f)) : String.format(Locale.getDefault(), "%.0f°C", Float.valueOf(f));
        }
    }

    @Override // defpackage.xt1
    public void d() {
        switch (this.g) {
            case 15:
                List list = qi1.n;
                break;
        }
    }

    @Override // defpackage.s41
    public void j(Exception exc) {
        String str = ToolsActivity.I;
    }
}
