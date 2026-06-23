package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.io.Serializable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class tm0 {
    public static volatile tm0 d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f996a;
    public final Serializable b;
    public volatile Object c;

    public tm0() {
        this.f996a = new Handler(Looper.getMainLooper());
        this.b = new CopyOnWriteArrayList();
        this.c = null;
    }

    public tm0(Class cls) {
        this.f996a = new hn();
        this.b = cls.getName();
    }

    public static tm0 b() {
        if (d == null) {
            synchronized (tm0.class) {
                try {
                    if (d == null) {
                        d = new tm0();
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public rw a(sm0 sm0Var) {
        if (((te2) this.c) != null) {
            ((Handler) this.f996a).post(new k5(this, 21, sm0Var));
            return new rw(25);
        }
        ((CopyOnWriteArrayList) this.b).add(sm0Var);
        ((Handler) this.f996a).postDelayed(new b9(10, this, new AtomicBoolean(false), sm0Var), Math.max(0L, 5000L));
        return new rw(25);
    }

    public Logger c() {
        Logger logger = (Logger) this.c;
        if (logger != null) {
            return logger;
        }
        synchronized (((hn) this.f996a)) {
            try {
                Logger logger2 = (Logger) this.c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger((String) this.b);
                this.c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
