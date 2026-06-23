package flar2.devcheck.systemGraphs;

import defpackage.a5;
import defpackage.fh;
import defpackage.lu1;
import defpackage.r60;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class SystemGraphsActivity extends a5 {
    public static final /* synthetic */ int G = 0;
    public lu1 F;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f4, code lost:
    
        if ((!android.os.Build.FINGERPRINT.equals(defpackage.i51.e("sysgraphs_thermal_fp")) ? true : ((defpackage.il1) defpackage.i51.f()).getBoolean("sysgraphs_has_gpu_die", true)) != false) goto L23;
     */
    @Override // defpackage.a5, defpackage.zt, defpackage.yt, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: flar2.devcheck.systemGraphs.SystemGraphsActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onPause() {
        super.onPause();
        lu1 lu1Var = this.F;
        if (lu1Var.G) {
            fh fhVar = lu1Var.e;
            synchronized (fhVar) {
                ScheduledFuture scheduledFuture = (ScheduledFuture) fhVar.j;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                    fhVar.j = null;
                }
            }
            lu1Var.G = false;
        }
    }

    @Override // defpackage.a5, android.app.Activity
    public final void onResume() {
        super.onResume();
        lu1 lu1Var = this.F;
        if (lu1Var.G) {
            return;
        }
        lu1Var.c.a();
        ((ConcurrentHashMap) lu1Var.d.i).clear();
        fh fhVar = lu1Var.e;
        synchronized (fhVar) {
            if (((ScheduledFuture) fhVar.j) == null) {
                fhVar.j = ((ScheduledExecutorService) fhVar.h).scheduleAtFixedRate(new r60(21, fhVar), 0L, 500L, TimeUnit.MILLISECONDS);
            }
        }
        lu1Var.G = true;
    }
}
