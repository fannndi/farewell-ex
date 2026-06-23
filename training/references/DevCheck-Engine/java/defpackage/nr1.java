package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import flar2.devcheck.R;
import java.io.File;
import java.util.Locale;

/* loaded from: classes.dex */
public final class nr1 implements mj1 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f697a;
    public final ku1 b;
    public long c;

    public nr1(Application application, ku1 ku1Var) {
        this.f697a = application.getApplicationContext();
        this.b = ku1Var;
    }

    @Override // defpackage.mj1
    public final void a() {
        if (Build.VERSION.SDK_INT >= 26) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.c;
            if (j == 0 || uptimeMillis - j >= 5000) {
                this.c = uptimeMillis;
                Context context = this.f697a;
                long[] v = sl.v(context);
                if (v == null) {
                    return;
                }
                long j2 = v[0];
                long j3 = v[1];
                if (j2 <= 0) {
                    return;
                }
                long j4 = j2 - j3;
                double d = j2;
                int ceil = (int) Math.ceil((j4 / d) * 100.0d);
                boolean j0 = uz1.j0(j2);
                try {
                    StatFs statFs = new StatFs(new File(Environment.getExternalStorageDirectory().getPath()).getAbsolutePath());
                    long totalBytes = statFs.getTotalBytes();
                    long availableBytes = totalBytes - statFs.getAvailableBytes();
                    long max = Math.max(0L, j2 - totalBytes);
                    int ceil2 = (int) Math.ceil((availableBytes / d) * 100.0d);
                    this.b.f550a.i(new mr1(uz1.d0(context, j4, j0).replace(".00", "") + " " + ts0.b(context, R.string.used), uz1.d0(context, j2, j0).replace(".00", "") + " " + ts0.b(context, R.string.total).toLowerCase(Locale.getDefault()), uz1.d0(context, availableBytes, j0), uz1.d0(context, max, j0), uz1.d0(context, j3, j0), ceil2, ceil));
                } catch (Throwable unused) {
                }
            }
        }
    }
}
