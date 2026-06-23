package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import flar2.devcheck.R;
import flar2.devcheck.temperature.ThermalHeadroomNative;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class qi1 {
    public static final List n = Collections.unmodifiableList(Arrays.asList(ly1.g, ly1.h, ly1.i, ly1.l, ly1.m));

    /* renamed from: a, reason: collision with root package name */
    public final Context f846a;
    public final pi1 b;
    public my1 f;
    public ny1 g;
    public y41 i;
    public ScheduledExecutorService l;
    public ScheduledFuture m;
    public final Handler c = new Handler(Looper.getMainLooper());
    public final AtomicBoolean d = new AtomicBoolean(false);
    public volatile boolean e = false;
    public boolean h = false;
    public boolean j = false;
    public boolean k = false;

    public qi1(Context context, pi1 pi1Var) {
        this.f846a = context.getApplicationContext();
        this.b = pi1Var;
    }

    public final void a() {
        List list;
        oy1 oy1Var;
        ny1 ny1Var;
        my1 my1Var;
        if (this.d.get()) {
            if (!this.k) {
                this.k = true;
                Context context = this.f846a;
                try {
                    my1 my1Var2 = new my1(context);
                    this.f = my1Var2;
                    ny1 E = pr.E(context, my1Var2);
                    this.g = E;
                    this.h = E != null;
                } catch (Throwable unused) {
                    this.h = false;
                    this.g = null;
                }
                try {
                    y41 b = au1.b(context, new jw0(15));
                    this.i = b;
                    this.j = b != null;
                } catch (Throwable unused2) {
                    this.j = false;
                    this.i = null;
                }
            }
            List list2 = Collections.EMPTY_LIST;
            if (this.h && (ny1Var = this.g) != null && (my1Var = this.f) != null) {
                try {
                    List P = pr.P(ny1Var, my1Var);
                    if (P != null) {
                        list2 = P;
                    }
                } catch (Throwable unused3) {
                    list2 = Collections.EMPTY_LIST;
                }
            }
            if (list2.isEmpty() && this.j) {
                y41 y41Var = this.i;
                if (y41Var == null) {
                    list2 = Collections.EMPTY_LIST;
                } else {
                    try {
                        list2 = au1.d(y41Var);
                        if (list2 == null) {
                            list2 = Collections.EMPTY_LIST;
                        }
                    } catch (Throwable unused4) {
                        list2 = Collections.EMPTY_LIST;
                    }
                }
            }
            if (list2.isEmpty()) {
                list = Collections.EMPTY_LIST;
            } else {
                List<ly1> list3 = n;
                ArrayList arrayList = new ArrayList(list3.size());
                for (ly1 ly1Var : list3) {
                    Iterator it = list2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            oy1Var = null;
                            break;
                        }
                        oy1Var = (oy1) it.next();
                        if (oy1Var != null && oy1Var.d == ly1Var) {
                            break;
                        }
                    }
                    if (oy1Var != null) {
                        zw1 zw1Var = new zw1();
                        zw1Var.f1291a = "bench-key:" + ly1Var.name();
                        Context context2 = this.f846a;
                        int ordinal = ly1Var.ordinal();
                        int i = 2;
                        zw1Var.b = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 5 ? ordinal != 6 ? context2.getString(R.string.sensor) : context2.getString(R.string.device_surface) : context2.getString(R.string.battery) : context2.getString(R.string.soc) : context2.getString(R.string.gpu) : context2.getString(R.string.cpu);
                        float f = oy1Var.f;
                        zw1Var.c = f;
                        float f2 = oy1Var.g;
                        zw1Var.d = f2;
                        float f3 = oy1Var.h;
                        zw1Var.e = f3;
                        zw1Var.f = oy1Var.i;
                        zw1Var.g = oy1Var.j;
                        if (f3 > 0.0f && f >= f3) {
                            i = 3;
                        } else if (f2 <= 0.0f || f < f2) {
                            i = 1;
                        }
                        zw1Var.h = i;
                        zw1Var.i = false;
                        arrayList.add(zw1Var);
                        if (arrayList.size() >= 5) {
                            break;
                        }
                    }
                }
                list = arrayList;
            }
            if (!list.isEmpty()) {
                this.e = true;
            }
            float f4 = Float.NaN;
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    f4 = ThermalHeadroomNative.getThermalHeadroom(0);
                } catch (Throwable unused5) {
                }
            }
            this.c.post(new n51(this, 13, new l30(list, f4)));
        }
    }

    public final void b() {
        if (this.d.compareAndSet(false, true)) {
            ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new xf(3));
            this.l = newSingleThreadScheduledExecutor;
            this.m = newSingleThreadScheduledExecutor.scheduleAtFixedRate(new r60(20, this), 0L, 1000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void c() {
        if (this.d.compareAndSet(true, false)) {
            ScheduledFuture scheduledFuture = this.m;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.m = null;
            }
            ScheduledExecutorService scheduledExecutorService = this.l;
            if (scheduledExecutorService != null) {
                scheduledExecutorService.shutdownNow();
                this.l = null;
            }
            this.c.removeCallbacksAndMessages(null);
        }
    }
}
