package defpackage;

import android.app.Application;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes.dex */
public final /* synthetic */ class tt0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1006a;
    public final /* synthetic */ vt0 b;

    public /* synthetic */ tt0(vt0 vt0Var, int i) {
        this.f1006a = i;
        this.b = vt0Var;
    }

    public final void a(final boolean z, final boolean z2) {
        int i = this.f1006a;
        final vt0 vt0Var = this.b;
        switch (i) {
            case 0:
                if (z2) {
                    Application application = vt0Var.b;
                    application.getClass();
                    rt0.M(application.getApplicationContext());
                } else {
                    vt0Var.getClass();
                }
                final int i2 = 0;
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ut0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i2;
                        int i4 = 2;
                        boolean z3 = z2;
                        boolean z4 = z;
                        vt0 vt0Var2 = vt0Var;
                        switch (i3) {
                            case 0:
                                vt0Var2.e.k(Boolean.valueOf(z4));
                                if (z3) {
                                    vt0Var2.d.k(null);
                                }
                                if (Boolean.TRUE.equals(Boolean.valueOf(z4))) {
                                    vt0Var2.c.execute(new st0(vt0Var2, i4));
                                    break;
                                }
                                break;
                            default:
                                vt0Var2.e.k(Boolean.valueOf(z4));
                                if (z3) {
                                    vt0Var2.d.k(null);
                                }
                                if (Boolean.TRUE.equals(Boolean.valueOf(z4))) {
                                    vt0Var2.c.execute(new st0(vt0Var2, i4));
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                if (z2) {
                    Application application2 = vt0Var.b;
                    application2.getClass();
                    rt0.M(application2.getApplicationContext());
                } else {
                    vt0Var.getClass();
                }
                final int i3 = 1;
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ut0
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i32 = i3;
                        int i4 = 2;
                        boolean z3 = z2;
                        boolean z4 = z;
                        vt0 vt0Var2 = vt0Var;
                        switch (i32) {
                            case 0:
                                vt0Var2.e.k(Boolean.valueOf(z4));
                                if (z3) {
                                    vt0Var2.d.k(null);
                                }
                                if (Boolean.TRUE.equals(Boolean.valueOf(z4))) {
                                    vt0Var2.c.execute(new st0(vt0Var2, i4));
                                    break;
                                }
                                break;
                            default:
                                vt0Var2.e.k(Boolean.valueOf(z4));
                                if (z3) {
                                    vt0Var2.d.k(null);
                                }
                                if (Boolean.TRUE.equals(Boolean.valueOf(z4))) {
                                    vt0Var2.c.execute(new st0(vt0Var2, i4));
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
