package flar2.devcheck.batteryMonitor2.data;

import android.content.Context;
import defpackage.en0;
import defpackage.fh1;
import defpackage.ft1;
import defpackage.g8;
import defpackage.h8;
import defpackage.i8;
import defpackage.kp;
import defpackage.of;
import defpackage.tp;
import defpackage.u40;
import defpackage.xi0;
import defpackage.y00;
import defpackage.zf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class BatteryMonitor2Db_Impl extends BatteryMonitor2Db {
    public volatile zf o;
    public volatile kp p;
    public volatile u40 q;
    public volatile i8 r;
    public volatile xi0 s;

    @Override // flar2.devcheck.batteryMonitor2.data.BatteryMonitor2Db
    public final xi0 A() {
        xi0 xi0Var;
        if (this.s != null) {
            return this.s;
        }
        synchronized (this) {
            try {
                if (this.s == null) {
                    xi0 xi0Var2 = new xi0();
                    xi0Var2.g = this;
                    new g8(this, 6);
                    xi0Var2.h = new h8(this, 12);
                    this.s = xi0Var2;
                }
                xi0Var = this.s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xi0Var;
    }

    @Override // flar2.devcheck.batteryMonitor2.data.BatteryMonitor2Db
    public final zf B() {
        zf zfVar;
        if (this.o != null) {
            return this.o;
        }
        synchronized (this) {
            try {
                if (this.o == null) {
                    this.o = new zf(this);
                }
                zfVar = this.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zfVar;
    }

    @Override // defpackage.dh1
    public final en0 e() {
        return new en0(this, new HashMap(0), new HashMap(0), "battery_sample", "charging_session", "discharge_session", "app_usage", "health_snapshot");
    }

    @Override // defpackage.dh1
    public final ft1 g(y00 y00Var) {
        fh1 fh1Var = new fh1(y00Var, new of(this), "0341937525c91133733ae53a50860169", "0d333a4db4249b41290d3b73ceaadf4d");
        Context context = y00Var.f1203a;
        context.getClass();
        return y00Var.c.b(new tp(context, y00Var.b, fh1Var, false, false));
    }

    @Override // defpackage.dh1
    public final List h(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // defpackage.dh1
    public final Set m() {
        return new HashSet();
    }

    @Override // defpackage.dh1
    public final Map o() {
        HashMap hashMap = new HashMap();
        List list = Collections.EMPTY_LIST;
        hashMap.put(zf.class, list);
        hashMap.put(kp.class, list);
        hashMap.put(u40.class, list);
        hashMap.put(i8.class, list);
        hashMap.put(xi0.class, list);
        return hashMap;
    }

    @Override // flar2.devcheck.batteryMonitor2.data.BatteryMonitor2Db
    public final i8 x() {
        i8 i8Var;
        if (this.r != null) {
            return this.r;
        }
        synchronized (this) {
            try {
                if (this.r == null) {
                    i8 i8Var2 = new i8();
                    i8Var2.g = this;
                    new g8(this, 0);
                    new h8(this, 0);
                    i8Var2.h = new h8(this, 1);
                    this.r = i8Var2;
                }
                i8Var = this.r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i8Var;
    }

    @Override // flar2.devcheck.batteryMonitor2.data.BatteryMonitor2Db
    public final kp y() {
        kp kpVar;
        if (this.p != null) {
            return this.p;
        }
        synchronized (this) {
            try {
                if (this.p == null) {
                    this.p = new kp(this);
                }
                kpVar = this.p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kpVar;
    }

    @Override // flar2.devcheck.batteryMonitor2.data.BatteryMonitor2Db
    public final u40 z() {
        u40 u40Var;
        if (this.q != null) {
            return this.q;
        }
        synchronized (this) {
            try {
                if (this.q == null) {
                    this.q = new u40((BatteryMonitor2Db) this);
                }
                u40Var = this.q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return u40Var;
    }
}
