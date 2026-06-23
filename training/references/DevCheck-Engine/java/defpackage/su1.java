package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class su1 implements bk1 {
    public static final /* synthetic */ int l = 0;
    public final Context g;
    public final JobScheduler h;
    public final ru1 i;
    public final WorkDatabase j;
    public final ju k;

    static {
        ai1.k("SystemJobScheduler");
    }

    public su1(Context context, WorkDatabase workDatabase, ju juVar) {
        JobScheduler a2 = xn0.a(context);
        ru1 ru1Var = new ru1(context, juVar.d, juVar.l);
        this.g = context;
        this.h = a2;
        this.i = ru1Var;
        this.j = workDatabase;
        this.k = juVar;
    }

    public static void b(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable unused) {
            ai1 h = ai1.h();
            String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i));
            h.getClass();
        }
    }

    public static ArrayList d(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        int i = xn0.f1188a;
        jobScheduler.getClass();
        try {
            list = jobScheduler.getAllPendingJobs();
            list.getClass();
        } catch (Throwable unused) {
            ai1.h().getClass();
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static xb2 f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return new xb2(extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0), extras.getString("EXTRA_WORK_SPEC_ID"));
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.bk1
    public final void a(String str) {
        ArrayList arrayList;
        Context context = this.g;
        JobScheduler jobScheduler = this.h;
        ArrayList d = d(context, jobScheduler);
        if (d == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = d.size();
            int i = 0;
            while (i < size) {
                Object obj = d.get(i);
                i++;
                JobInfo jobInfo = (JobInfo) obj;
                xb2 f = f(jobInfo);
                if (f != null && str.equals(f.f1176a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size2 = arrayList.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            b(jobScheduler, ((Integer) obj2).intValue());
        }
        ou1 z = this.j.z();
        z.getClass();
        str.getClass();
        tl2.E(z.f759a, false, true, new y20(4, str));
    }

    @Override // defpackage.bk1
    public final void c(gc2... gc2VarArr) {
        int intValue;
        ju juVar = this.k;
        WorkDatabase workDatabase = this.j;
        int i = 0;
        final nl0 nl0Var = new nl0(workDatabase, 0);
        for (gc2 gc2Var : gc2VarArr) {
            workDatabase.c();
            try {
                gc2 b = workDatabase.C().b(gc2Var.f332a);
                if (b == null) {
                    ai1.h().getClass();
                    workDatabase.v();
                } else if (b.b != yb2.g) {
                    ai1.h().getClass();
                    workDatabase.v();
                } else {
                    xb2 q = xc1.q(gc2Var);
                    int i2 = q.b;
                    String str = q.f1176a;
                    ou1 z = workDatabase.z();
                    z.getClass();
                    str.getClass();
                    mu1 mu1Var = (mu1) tl2.E(z.f759a, true, false, new nu1(i2, str, i));
                    if (mu1Var != null) {
                        intValue = mu1Var.c;
                    } else {
                        juVar.getClass();
                        final int i3 = juVar.i;
                        Object u = nl0Var.f690a.u(new Callable() { // from class: ml0
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                WorkDatabase workDatabase2 = nl0.this.f690a;
                                Long a2 = workDatabase2.y().a("next_job_scheduler_id");
                                int i4 = 0;
                                int longValue = a2 != null ? (int) a2.longValue() : 0;
                                int i5 = longValue == Integer.MAX_VALUE ? 0 : longValue + 1;
                                q81 y = workDatabase2.y();
                                tl2.E(y.f824a, false, true, new x20(y, 3, new p81("next_job_scheduler_id", Long.valueOf(i5))));
                                if (longValue < 0 || longValue > i3) {
                                    q81 y2 = workDatabase2.y();
                                    tl2.E(y2.f824a, false, true, new x20(y2, 3, new p81("next_job_scheduler_id", 1L)));
                                } else {
                                    i4 = longValue;
                                }
                                return Integer.valueOf(i4);
                            }
                        });
                        u.getClass();
                        intValue = ((Number) u).intValue();
                    }
                    if (mu1Var == null) {
                        mu1 mu1Var2 = new mu1(i2, str, intValue);
                        ou1 z2 = workDatabase.z();
                        z2.getClass();
                        tl2.E(z2.f759a, false, true, new x20(z2, 5, mu1Var2));
                    }
                    g(gc2Var, intValue);
                    workDatabase.v();
                }
            } finally {
                workDatabase.r();
            }
        }
    }

    @Override // defpackage.bk1
    public final boolean e() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(gc2 gc2Var, int i) {
        int i2;
        List<JobInfo> list;
        String str;
        ru1 ru1Var = this.i;
        ru1Var.getClass();
        lw lwVar = gc2Var.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", gc2Var.f332a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", gc2Var.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", gc2Var.c());
        JobInfo.Builder builder = new JobInfo.Builder(i, ru1Var.f908a);
        boolean z = lwVar.c;
        Set<kw> set = lwVar.i;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = lwVar.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        NetworkRequest a2 = lwVar.a();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28 || a2 == null) {
            r21 r21Var = lwVar.f609a;
            if (i3 < 30 || r21Var != r21.l) {
                int ordinal = r21Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        i2 = 2;
                        if (ordinal != 2) {
                            i2 = 3;
                            if (ordinal != 3) {
                                i2 = 4;
                                if (ordinal != 4 || i3 < 26) {
                                    ai1 h = ai1.h();
                                    r21Var.toString();
                                    h.getClass();
                                }
                            }
                        }
                    }
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            extras.getClass();
            extras.setRequiredNetwork(a2);
        }
        if (!z2) {
            extras.setBackoffCriteria(gc2Var.m, gc2Var.l == cc.h ? 0 : 1);
        }
        long a3 = gc2Var.a();
        ru1Var.b.getClass();
        long max = Math.max(a3 - System.currentTimeMillis(), 0L);
        if (i3 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!gc2Var.q && ru1Var.c) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (kw kwVar : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(kwVar.f553a, kwVar.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(lwVar.g);
            extras.setTriggerContentMaxDelay(lwVar.h);
        }
        extras.setPersisted(false);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            extras.setRequiresBatteryNotLow(lwVar.e);
            extras.setRequiresStorageNotLow(lwVar.f);
        }
        Object[] objArr = gc2Var.k > 0;
        Object[] objArr2 = max > 0;
        if (i4 >= 31 && gc2Var.q && objArr == false && objArr2 == false) {
            extras.setExpedited(true);
        }
        if (i4 >= 35 && (str = gc2Var.x) != null) {
            extras.setTraceTag(str);
        }
        JobInfo build = extras.build();
        ai1.h().getClass();
        try {
            if (this.h.schedule(build) == 0) {
                ai1.h().getClass();
                if (gc2Var.q && gc2Var.r == l51.g) {
                    gc2Var.q = false;
                    ai1.h().getClass();
                    g(gc2Var, i);
                }
            }
        } catch (IllegalStateException e) {
            int i5 = xn0.f1188a;
            Context context = this.g;
            context.getClass();
            WorkDatabase workDatabase = this.j;
            workDatabase.getClass();
            ju juVar = this.k;
            juVar.getClass();
            int i6 = Build.VERSION.SDK_INT;
            int i7 = i6 >= 31 ? 150 : 100;
            int size = ((List) tl2.E(workDatabase.C().f528a, true, false, new ub(14))).size();
            String str2 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i6 >= 34) {
                JobScheduler a4 = xn0.a(context);
                try {
                    list = a4.getAllPendingJobs();
                    list.getClass();
                } catch (Throwable unused) {
                    ai1.h().getClass();
                    list = null;
                }
                if (list != null) {
                    ArrayList d = d(context, a4);
                    int size2 = d != null ? list.size() - d.size() : 0;
                    String o = size2 == 0 ? null : d51.o(size2, " of which are not owned by WorkManager");
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    ArrayList d2 = d(context, (JobScheduler) systemService);
                    int size3 = d2 != null ? d2.size() : 0;
                    str2 = yr.Z(u9.n0(new String[]{list.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", o, size3 != 0 ? d51.o(size3, " from WorkManager in the default namespace") : null}), qJTtDWNCVUDjB.YVAjkas, null, null, null, 62);
                }
            } else {
                ArrayList d3 = d(context, xn0.a(context));
                if (d3 != null) {
                    str2 = d3.size() + " jobs from WorkManager";
                }
            }
            String str3 = "JobScheduler " + i7 + " job limit exceeded.\nIn JobScheduler there are " + str2 + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is " + juVar.k + '.';
            ai1.h().getClass();
            throw new IllegalStateException(str3, e);
        } catch (Throwable unused2) {
            ai1 h2 = ai1.h();
            gc2Var.toString();
            h2.getClass();
        }
    }
}
