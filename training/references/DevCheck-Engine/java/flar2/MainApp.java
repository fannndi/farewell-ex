package flar2.devcheck;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import com.google.android.material.slider.KtNX.kle.TjguQfQF;
import com.pairip.StartupLauncher;
import defpackage.TryRoom;
import defpackage.c70;
import defpackage.d10;
import defpackage.d70;
import defpackage.df;
import defpackage.i51;
import defpackage.k5;
import defpackage.m5;
import defpackage.n52;
import defpackage.pj;
import defpackage.pr;
import defpackage.qf1;
import defpackage.qy0;
import defpackage.r60;
import defpackage.rs0;
import defpackage.tm0;
import defpackage.ts0;
import defpackage.tx0;
import defpackage.uz1;
import defpackage.vm0;
import defpackage.wb;
import defpackage.yf;
import defpackage.yh;
import defpackage.yr1;
import defpackage.zr1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import rikka.shizuku.ShizukuProvider;

/* loaded from: classes.dex */
public class MainApp extends TryRoom {
    public static final ExecutorService h;
    public yh g;

    /* loaded from: classes2.dex */
    public abstract class c2020060317 extends Application {
        public static final void onCreate(MainApp mainApp) {
            super.onCreate();
            Context applicationContext = mainApp.getApplicationContext();
            if (d10.f == null) {
                d10.f = applicationContext.getApplicationContext();
            }
            AtomicReference atomicReference = ts0.f1004a;
            try {
                rs0 b = m5.b();
                if (b == null) {
                    b = rs0.b;
                }
                atomicReference.set(b);
            } catch (Throwable unused) {
                atomicReference.set(rs0.b);
            }
            try {
                ShizukuProvider.h = false;
                ShizukuProvider.g = true;
            } catch (Throwable unused2) {
            }
            String F = pr.F(i51.e("prefLanguage"));
            mainApp.getApplicationContext();
            pr.T(F);
            int[] iArr = d70.f178a;
            mainApp.registerActivityLifecycleCallbacks(new c70());
            int[] iArr2 = {R.font.lato, R.font.lato_semibold, R.font.nunito_sans_semibold, R.font.open_sans, R.font.open_sans_semibold, R.font.roboto_bold, R.font.roboto_semibold};
            ExecutorService executorService = MainApp.h;
            executorService.execute(new k5(mainApp, 23, iArr2));
            new vm0().b(mainApp);
            executorService.execute(new r60(7, mainApp));
            try {
                df.a(mainApp.getApplicationContext());
            } catch (Throwable unused3) {
            }
            yh yhVar = new yh();
            yhVar.g = new pj(wb.c(mainApp));
            tm0.b();
            tx0 tx0Var = new tx0(mainApp.getApplicationContext());
            yhVar.h = tx0Var;
            tx0Var.c();
            yhVar.i = new yf(mainApp.getApplicationContext(), 4);
            Context applicationContext2 = mainApp.getApplicationContext();
            yh yhVar2 = new yh();
            yhVar2.h = new qy0(new zr1(new yr1()));
            yhVar2.i = new Object();
            yhVar2.g = applicationContext2.getApplicationContext();
            yhVar.j = yhVar2;
            yhVar.k = new qf1();
            mainApp.g = yhVar;
            n52.f(mainApp);
            if (i51.b("prefNoShowCamWarning").booleanValue()) {
                i51.h("prefNoShowCamWarning", false);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                String e = i51.e("prefSysTheme");
                if (!i51.g("prefSysTheme") || "0".equals(e)) {
                    i51.h("prefSysTheme", true);
                }
            }
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectLeakedClosableObjects().penaltyLog().build());
            try {
                if (i51.b("prefBootReceiver").booleanValue()) {
                    return;
                }
                i51.h("prefCPUTimeSaveOffsets", false);
            } catch (Exception unused4) {
            }
        }
    }

    static {
        StartupLauncher.launch();
        h = Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()));
    }

    public static long ac(Context context) {
        String str = uz1.f1060a;
        return Long.parseLong(context.getResources().getString(R.color.custom_color).substring(3, 9));
    }

    @Override // android.app.Application
    public final void onCreate() {
        TjguQfQF.TgoqQLudAXdBEu.invoke(null, this);
    }

    @Override // android.app.Application
    public final void onTerminate() {
        super.onTerminate();
        h.shutdownNow();
    }
}
