package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.material.behavior.YqV.Gvyagftz;
import flar2.devcheck.MainApp;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class vc1 extends a4 {
    public final qf1 c;
    public final ExecutorService d;
    public final Handler e;
    public final qy0 f;
    public volatile ic1 g;
    public volatile String h;
    public final AtomicLong i;
    public final ew0 j;

    public vc1(Application application) {
        super(application);
        this.d = MainApp.h;
        this.e = new Handler(Looper.getMainLooper());
        qy0 qy0Var = new qy0(null);
        this.f = qy0Var;
        this.i = new AtomicLong();
        ew0 ew0Var = new ew0(0);
        this.j = ew0Var;
        qf1 qf1Var = (qf1) ((MainApp) application).g.k;
        this.c = qf1Var;
        qy0 qy0Var2 = qf1Var.c;
        xg1 F = fh.u(application).F(1);
        String e = i51.e("prefdevicename2");
        String replace = (e == null || e.isEmpty()) ? "This device" : e.replace("\n", " ");
        String e2 = i51.e("prefProcessor");
        e2 = e2 == null ? "" : e2;
        String[] strArr = sc1.f928a;
        kc1 kc1Var = new kc1(replace, e2, false, null);
        List list = Collections.EMPTY_LIST;
        ew0Var.k(new rc1(1, kc1Var, null, list, list, false));
        ew0Var.l(qy0Var2, new uc1(this, 0));
        ew0Var.l(qy0Var, new uc1(this, 1));
        ew0Var.l(F, new uc1(this, 2));
    }

    public static void d(final vc1 vc1Var) {
        final ic1 ic1Var = vc1Var.g;
        if (ic1Var == null) {
            return;
        }
        final long incrementAndGet = vc1Var.i.incrementAndGet();
        final String str = vc1Var.h;
        Application application = vc1Var.b;
        application.getClass();
        final Context applicationContext = application.getApplicationContext();
        String e = i51.e("prefdevicename2");
        final String replace = (e == null || e.isEmpty()) ? "This device" : e.replace(Gvyagftz.NgGEnFEei, " ");
        String e2 = i51.e(hTYJVDOvZnZlYL.riImSnpf);
        if (e2 == null) {
            e2 = "";
        }
        final String str2 = e2;
        vc1Var.d.execute(new Runnable() { // from class: tc1
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
            java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
            	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
            	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:130:0x0455  */
            /* JADX WARN: Removed duplicated region for block: B:133:0x05cd A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:135:0x05ce  */
            /* JADX WARN: Removed duplicated region for block: B:137:0x045b  */
            /* JADX WARN: Removed duplicated region for block: B:46:0x0178 A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:60:0x01ec  */
            /* JADX WARN: Removed duplicated region for block: B:62:0x01ef  */
            /* JADX WARN: Type inference failed for: r1v27, types: [java.util.List] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 1598
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.tc1.run():void");
            }
        });
    }
}
