package defpackage;

import android.content.ComponentName;
import android.content.Context;
import flar2.devcheck.ui.root.IShizukuAidlInterface;
import flar2.devcheck.ui.shizuku.ShizukuProcessService;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class fo1 {

    /* renamed from: a, reason: collision with root package name */
    public static IShizukuAidlInterface f298a;
    public static boolean b;
    public static co1 c;
    public static final ArrayList d = new ArrayList();
    public static final eo1 e = new eo1();

    public static boolean a(Context context) {
        if (b) {
            return true;
        }
        if (c == null) {
            co1 co1Var = new co1(new ComponentName(context.getPackageName(), ShizukuProcessService.class.getName()));
            co1Var.e = false;
            co1Var.c = "shzk";
            co1Var.d = (context.getApplicationInfo().flags & 2) != 0;
            co1Var.b = 64205;
            c = co1Var;
        }
        try {
            do1.e(c, e);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean b() {
        return b && f298a != null;
    }
}
