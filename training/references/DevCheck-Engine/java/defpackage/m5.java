package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class m5 {
    public static final lm1 g = new lm1(new l5(0));
    public static final int h = -100;
    public static rs0 i = null;
    public static rs0 j = null;
    public static Boolean k = null;
    public static boolean l = false;
    public static final r9 m = new r9(0);
    public static final Object n = new Object();
    public static final Object o = new Object();

    public static void a() {
        rs0 rs0Var;
        r9 r9Var = m;
        r9Var.getClass();
        l9 l9Var = new l9(r9Var);
        while (l9Var.hasNext()) {
            m5 m5Var = (m5) ((WeakReference) l9Var.next()).get();
            if (m5Var != null) {
                a6 a6Var = (a6) m5Var;
                Context context = a6Var.q;
                if (e(context) && (rs0Var = i) != null && !rs0Var.equals(j)) {
                    g.execute(new h5(context, 1));
                }
                a6Var.p(true, true);
            }
        }
    }

    public static rs0 b() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object c = c();
            if (c != null) {
                return new rs0(new ss0(j5.a(c)));
            }
        } else {
            rs0 rs0Var = i;
            if (rs0Var != null) {
                return rs0Var;
            }
        }
        return rs0.b;
    }

    public static Object c() {
        Context context;
        r9 r9Var = m;
        r9Var.getClass();
        l9 l9Var = new l9(r9Var);
        while (l9Var.hasNext()) {
            m5 m5Var = (m5) ((WeakReference) l9Var.next()).get();
            if (m5Var != null && (context = ((a6) m5Var).q) != null) {
                return context.getSystemService("locale");
            }
        }
        return null;
    }

    public static boolean e(Context context) {
        if (k == null) {
            try {
                int i2 = a8.g;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) a8.class), z7.a() | rt0.s).metaData;
                if (bundle != null) {
                    k = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                k = Boolean.FALSE;
            }
        }
        return k.booleanValue();
    }

    public static void h(a6 a6Var) {
        synchronized (n) {
            try {
                r9 r9Var = m;
                r9Var.getClass();
                l9 l9Var = new l9(r9Var);
                while (l9Var.hasNext()) {
                    m5 m5Var = (m5) ((WeakReference) l9Var.next()).get();
                    if (m5Var == a6Var || m5Var == null) {
                        l9Var.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void o(Context context) {
        if (e(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (l) {
                    return;
                }
                g.execute(new h5(context, 0));
                return;
            }
            synchronized (o) {
                try {
                    rs0 rs0Var = i;
                    if (rs0Var == null) {
                        if (j == null) {
                            j = rs0.a(pr.Q(context));
                        }
                        if (j.b()) {
                        } else {
                            i = j;
                        }
                    } else if (!rs0Var.equals(j)) {
                        rs0 rs0Var2 = i;
                        j = rs0Var2;
                        pr.K(context, rs0Var2.f904a.f952a.toLanguageTags());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract void d();

    public abstract void f();

    public abstract void g();

    public abstract boolean i(int i2);

    public abstract void j(int i2);

    public abstract void k(View view);

    public abstract void l(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void m(CharSequence charSequence);

    public abstract j2 n(h2 h2Var);
}
