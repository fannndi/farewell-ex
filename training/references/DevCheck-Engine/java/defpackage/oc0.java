package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class oc0 implements t70 {
    public final Context g;
    public final nc0 h;
    public final pg0 i;
    public final Object j = new Object();
    public Handler k;
    public ThreadPoolExecutor l;
    public ThreadPoolExecutor m;
    public tl2 n;

    public oc0(Context context, nc0 nc0Var) {
        op0.e("Context cannot be null", context);
        this.g = context.getApplicationContext();
        this.h = nc0Var;
        this.i = pc0.d;
    }

    @Override // defpackage.t70
    public final void a(tl2 tl2Var) {
        synchronized (this.j) {
            this.n = tl2Var;
        }
        synchronized (this.j) {
            try {
                if (this.n == null) {
                    return;
                }
                if (this.l == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new fu("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.m = threadPoolExecutor;
                    this.l = threadPoolExecutor;
                }
                this.l.execute(new r60(2, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.j) {
            try {
                this.n = null;
                Handler handler = this.k;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.k = null;
                ThreadPoolExecutor threadPoolExecutor = this.m;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.l = null;
                this.m = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final yc0 c() {
        try {
            pg0 pg0Var = this.i;
            Context context = this.g;
            nc0 nc0Var = this.h;
            pg0Var.getClass();
            ArrayList arrayList = new ArrayList(1);
            Object obj = new Object[]{nc0Var}[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            th2 a2 = mc0.a(context, Collections.unmodifiableList(arrayList));
            int i = a2.g;
            if (i != 0) {
                c.o(d51.p(i, "fetchFonts failed (", bOxzFZXgEkjph.kDFBKvIzDARTm));
                return null;
            }
            yc0[] yc0VarArr = (yc0[]) ((List) a2.h).get(0);
            if (yc0VarArr != null && yc0VarArr.length != 0) {
                return yc0VarArr[0];
            }
            c.o("fetchFonts failed (empty result)");
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            jw0.l("provider not found", e);
            return null;
        }
    }
}
