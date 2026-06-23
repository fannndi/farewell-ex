package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.Worker;
import androidx.work.impl.WorkDatabase;
import com.google.android.material.bottomappbar.HaCM.QCeVODiUkb;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class qt implements af0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;

    public /* synthetic */ qt(int i, Object obj) {
        this.g = i;
        this.h = obj;
    }

    @Override // defpackage.af0
    public final Object a() {
        we0 we0Var;
        int i = this.g;
        boolean z = true;
        e42 e42Var = e42.f219a;
        int i2 = 0;
        Object obj = this.h;
        switch (i) {
            case 0:
                ((zt) obj).reportFullyDrawn();
                return null;
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return ((i8) obj).d(":memory:");
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                xe0 xe0Var = (xe0) obj;
                String str = xe0Var.h;
                if (str == null || !xe0Var.j) {
                    we0Var = new we0(xe0Var.g, xe0Var.h, new h70(6, false), xe0Var.i, xe0Var.k);
                } else {
                    Context context = xe0Var.g;
                    context.getClass();
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    noBackupFilesDir.getClass();
                    we0Var = new we0(xe0Var.g, new File(noBackupFilesDir, str).getAbsolutePath(), new h70(6, false), xe0Var.i, xe0Var.k);
                }
                we0Var.setWriteAheadLoggingEnabled(xe0Var.m);
                return we0Var;
            case 3:
                return (List) obj;
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                ek0 ek0Var = (ek0) obj;
                ek0Var.getClass();
                try {
                    ek0Var.C.o(2, 0, false);
                } catch (IOException e) {
                    j90 j90Var = j90.j;
                    ek0Var.a(j90Var, j90Var, e);
                }
                return e42Var;
            case 5:
                dh1 dh1Var = ((en0) obj).f239a;
                if (dh1Var.p() && !dh1Var.t()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                return rj1.c((o72) obj);
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                yj1 yj1Var = (yj1) obj;
                yj1Var.q().a(new pd1(i2, yj1Var));
                return e42Var;
            case 8:
                pn1 pn1Var = (pn1) obj;
                String b = pn1Var.b();
                dh1 dh1Var2 = pn1Var.f799a;
                dh1Var2.getClass();
                dh1Var2.a();
                dh1Var2.b();
                return dh1Var2.k().z().j(b);
            case rt0.o /* 9 */:
                pb2 pb2Var = (pb2) obj;
                int i3 = c90.f112a;
                zb2 zb2Var = pb2Var.f782a;
                HashSet hashSet = new HashSet();
                hashSet.addAll(pb2Var.c);
                HashSet a2 = pb2.a(pb2Var);
                Iterator it = hashSet.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        hashSet.removeAll(pb2Var.c);
                        z = false;
                    } else if (a2.contains((String) it.next())) {
                    }
                }
                if (z) {
                    p22.c("WorkContinuation has cycles (", pb2Var, ")");
                    return null;
                }
                WorkDatabase workDatabase = zb2Var.c;
                ju juVar = zb2Var.b;
                workDatabase.c();
                try {
                    pr.e(workDatabase, juVar, pb2Var);
                    boolean a3 = c90.a(pb2Var);
                    workDatabase.v();
                    if (a3) {
                        ek1.b(juVar, zb2Var.c, zb2Var.e);
                    }
                    return e42Var;
                } finally {
                    workDatabase.r();
                }
            case 10:
                zb2 zb2Var2 = (zb2) obj;
                WorkDatabase workDatabase2 = zb2Var2.c;
                Context context2 = zb2Var2.f1270a;
                int i4 = su1.l;
                if (Build.VERSION.SDK_INT >= 34) {
                    xn0.a(context2).cancelAll();
                }
                JobScheduler jobScheduler = (JobScheduler) context2.getSystemService(QCeVODiUkb.YVycoI);
                ArrayList d = su1.d(context2, jobScheduler);
                if (d != null && !d.isEmpty()) {
                    int size = d.size();
                    int i5 = 0;
                    while (i5 < size) {
                        Object obj2 = d.get(i5);
                        i5++;
                        su1.b(jobScheduler, ((JobInfo) obj2).getId());
                    }
                }
                ((Number) tl2.E(workDatabase2.C().f528a, false, true, new ub(13))).intValue();
                ek1.b(zb2Var2.b, workDatabase2, zb2Var2.e);
                return e42Var;
            default:
                return ((Worker) obj).c();
        }
    }
}
