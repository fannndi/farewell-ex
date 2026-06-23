package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class q21 extends uv {
    public final ConnectivityManager f;
    public final Object g;
    public volatile boolean h;
    public final cm0 i;

    public q21(Context context, gr grVar) {
        super(context, grVar);
        Object systemService = this.b.getSystemService("connectivity");
        systemService.getClass();
        this.f = (ConnectivityManager) systemService;
        this.g = new Object();
        this.i = new cm0(2, this);
    }

    @Override // defpackage.uv
    public final Object a() {
        return p21.a(this.f, this.h);
    }

    @Override // defpackage.uv
    public final void c() {
        try {
            ai1 h = ai1.h();
            int i = p21.f771a;
            h.getClass();
            ConnectivityManager connectivityManager = this.f;
            cm0 cm0Var = this.i;
            connectivityManager.getClass();
            cm0Var.getClass();
            connectivityManager.registerDefaultNetworkCallback(cm0Var);
        } catch (IllegalArgumentException unused) {
            ai1 h2 = ai1.h();
            int i2 = p21.f771a;
            h2.getClass();
        } catch (SecurityException unused2) {
            ai1 h3 = ai1.h();
            int i3 = p21.f771a;
            h3.getClass();
        }
    }

    @Override // defpackage.uv
    public final void d() {
        try {
            ai1 h = ai1.h();
            int i = p21.f771a;
            h.getClass();
            this.f.unregisterNetworkCallback(this.i);
        } catch (IllegalArgumentException unused) {
            ai1 h2 = ai1.h();
            int i2 = p21.f771a;
            h2.getClass();
        } catch (SecurityException unused2) {
            ai1 h3 = ai1.h();
            int i3 = p21.f771a;
            h3.getClass();
        }
    }
}
