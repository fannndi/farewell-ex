package defpackage;

import android.content.Context;

/* loaded from: classes.dex */
public final class bd2 {
    public static final bd2 b;

    /* renamed from: a, reason: collision with root package name */
    public qz f78a;

    static {
        bd2 bd2Var = new bd2();
        bd2Var.f78a = null;
        b = bd2Var;
    }

    public static qz a(Context context) {
        qz qzVar;
        bd2 bd2Var = b;
        synchronized (bd2Var) {
            try {
                if (bd2Var.f78a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bd2Var.f78a = new qz(context, false);
                }
                qzVar = bd2Var.f78a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qzVar;
    }
}
