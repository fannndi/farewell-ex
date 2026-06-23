package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class oe0 implements ni0, yj1, o72 {
    public final ld0 g;
    public final n72 h;
    public l72 i;
    public gq0 j = null;
    public kp k = null;

    public oe0(ld0 ld0Var, n72 n72Var) {
        this.g = ld0Var;
        this.h = n72Var;
    }

    @Override // defpackage.yj1
    public final zf a() {
        c();
        return (zf) this.k.i;
    }

    public final void b(xp0 xp0Var) {
        this.j.d(xp0Var);
    }

    public final void c() {
        if (this.j == null) {
            this.j = new gq0(this);
            kp kpVar = new kp(new xj1(this, new qt(7, this)));
            this.k = kpVar;
            kpVar.g();
            rj1.b(this);
        }
    }

    @Override // defpackage.ni0
    public final l72 g() {
        Application application;
        ld0 ld0Var = this.g;
        l72 g = ld0Var.g();
        if (!g.equals(ld0Var.Y)) {
            this.i = g;
            return g;
        }
        if (this.i == null) {
            Context applicationContext = ld0Var.i0().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.i = new zj1(application, this, ld0Var.m);
        }
        return this.i;
    }

    @Override // defpackage.ni0
    public final py0 h() {
        Application application;
        ld0 ld0Var = this.g;
        Context applicationContext = ld0Var.i0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        py0 py0Var = new py0();
        LinkedHashMap linkedHashMap = py0Var.f1057a;
        if (application != null) {
            linkedHashMap.put(k72.j, application);
        }
        linkedHashMap.put(rj1.f898a, this);
        linkedHashMap.put(rj1.b, this);
        Bundle bundle = ld0Var.m;
        if (bundle != null) {
            linkedHashMap.put(rj1.c, bundle);
        }
        return py0Var;
    }

    @Override // defpackage.o72
    public final n72 l() {
        c();
        return this.h;
    }

    @Override // defpackage.eq0
    public final gq0 q() {
        c();
        return this.j;
    }
}
