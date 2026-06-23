package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Handler;

/* loaded from: classes.dex */
public final class e52 implements AppOpsManager.OnOpChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a40 f221a;

    public e52(a40 a40Var) {
        this.f221a = a40Var;
    }

    @Override // android.app.AppOpsManager.OnOpChangedListener
    public final void onOpChanged(String str, String str2) {
        a40 a40Var = this.f221a;
        if (a40Var.f7a) {
            if ((str2 == null || ((Context) a40Var.b).getPackageName().equals(str2)) && "android:get_usage_stats".equals(str)) {
                ((Handler) a40Var.d).post((f52) a40Var.h);
            }
        }
    }
}
