package flar2.devcheck.batteryMonitor2.data;

import defpackage.dh1;
import defpackage.i8;
import defpackage.kp;
import defpackage.rx0;
import defpackage.u40;
import defpackage.xi0;
import defpackage.zf;

/* loaded from: classes.dex */
public abstract class BatteryMonitor2Db extends dh1 {
    public static volatile BatteryMonitor2Db l;
    public static final rx0 m;
    public static final rx0 n;

    static {
        int i = 2;
        m = new rx0(1, i, 10);
        n = new rx0(i, 3, 11);
    }

    public abstract xi0 A();

    public abstract zf B();

    public abstract i8 x();

    public abstract kp y();

    public abstract u40 z();
}
