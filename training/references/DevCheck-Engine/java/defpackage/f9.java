package defpackage;

import android.app.Application;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.text.TextUtils;
import flar2.devcheck.MainApp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public class f9 extends a4 {
    public static boolean k;
    public ew0 c;
    public final ArrayList d;
    public final Handler e;
    public final qy0 f;
    public final qy0 g;
    public final ExecutorService h;
    public final PackageManager i;
    public d9 j;

    public f9(Application application) {
        super(application);
        this.d = new ArrayList();
        this.f = new qy0();
        this.g = new qy0();
        this.h = MainApp.h;
        Application application2 = this.b;
        application2.getClass();
        this.i = application2.getPackageManager();
        this.e = new Handler(application.getMainLooper());
        k = false;
    }

    public final void d() {
        synchronized (this.d) {
            try {
                try {
                    ArrayList arrayList = new ArrayList(this.d);
                    if (TextUtils.isEmpty((CharSequence) this.f.d())) {
                        this.e.post(new k5(this, 4, arrayList));
                    } else {
                        e(arrayList);
                    }
                } catch (Exception unused) {
                    this.e.post(new y8(this, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(ArrayList arrayList) {
        this.e.post(new x8(this, (List) arrayList.stream().filter(new z8(0, ((String) this.f.d()).toLowerCase())).collect(Collectors.toList()), 1));
    }
}
