package defpackage;

import androidx.work.impl.WorkDatabase;
import com.google.android.material.card.ZyJo.nTAZxGMqQtZZAQ;
import flar2.devcheck.benchmarkSuite.history.Hq.CGvJMCDBOmCdj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class ek1 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f236a = 0;

    static {
        ai1.k("Schedulers");
    }

    public static void a(kc2 kc2Var, ai1 ai1Var, List list) {
        if (list.size() > 0) {
            ai1Var.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                kc2Var.c(((gc2) it.next()).f332a, currentTimeMillis);
            }
        }
    }

    public static void b(ju juVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        kc2 C = workDatabase.C();
        workDatabase.c();
        try {
            dh1 dh1Var = C.f528a;
            dh1 dh1Var2 = C.f528a;
            List list2 = (List) tl2.E(dh1Var, true, false, new ub(9));
            a(C, juVar.d, list2);
            final int i = juVar.k;
            List list3 = (List) tl2.E(dh1Var2, true, false, new lf0() { // from class: jc2
                @Override // defpackage.lf0
                public final Object j(Object obj) {
                    int i2;
                    Integer valueOf;
                    int i3 = i;
                    ti1 ti1Var = (ti1) obj;
                    ti1Var.getClass();
                    aj1 C2 = ti1Var.C("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))");
                    try {
                        C2.d(1, i3);
                        int w = k32.w(C2, "id");
                        int w2 = k32.w(C2, nTAZxGMqQtZZAQ.iloNobWZNLQ);
                        int w3 = k32.w(C2, "worker_class_name");
                        int w4 = k32.w(C2, "input_merger_class_name");
                        int w5 = k32.w(C2, "input");
                        int w6 = k32.w(C2, "output");
                        int w7 = k32.w(C2, "initial_delay");
                        int w8 = k32.w(C2, "interval_duration");
                        int w9 = k32.w(C2, "flex_duration");
                        int w10 = k32.w(C2, "run_attempt_count");
                        int w11 = k32.w(C2, "backoff_policy");
                        int w12 = k32.w(C2, "backoff_delay_duration");
                        int w13 = k32.w(C2, "last_enqueue_time");
                        int w14 = k32.w(C2, "minimum_retention_duration");
                        int w15 = k32.w(C2, "schedule_requested_at");
                        int w16 = k32.w(C2, "run_in_foreground");
                        int w17 = k32.w(C2, "out_of_quota_policy");
                        int w18 = k32.w(C2, "period_count");
                        int w19 = k32.w(C2, "generation");
                        int w20 = k32.w(C2, "next_schedule_time_override");
                        int w21 = k32.w(C2, "next_schedule_time_override_generation");
                        int w22 = k32.w(C2, "stop_reason");
                        int w23 = k32.w(C2, CGvJMCDBOmCdj.PGookGKYbV);
                        int w24 = k32.w(C2, "backoff_on_system_interruptions");
                        int w25 = k32.w(C2, "required_network_type");
                        int w26 = k32.w(C2, "required_network_request");
                        int w27 = k32.w(C2, "requires_charging");
                        int w28 = k32.w(C2, CGvJMCDBOmCdj.ZobnRFCOY);
                        int w29 = k32.w(C2, "requires_battery_not_low");
                        int w30 = k32.w(C2, "requires_storage_not_low");
                        int w31 = k32.w(C2, "trigger_content_update_delay");
                        int w32 = k32.w(C2, "trigger_max_content_delay");
                        int w33 = k32.w(C2, "content_uri_triggers");
                        ArrayList arrayList = new ArrayList();
                        while (C2.w()) {
                            String h = C2.h(w);
                            int i4 = w13;
                            int i5 = w14;
                            yb2 z = kk1.z((int) C2.getLong(w2));
                            String h2 = C2.h(w3);
                            String h3 = C2.h(w4);
                            byte[] blob = C2.getBlob(w5);
                            t00 t00Var = t00.b;
                            t00 k = c3.k(blob);
                            t00 k2 = c3.k(C2.getBlob(w6));
                            long j = C2.getLong(w7);
                            long j2 = C2.getLong(w8);
                            long j3 = C2.getLong(w9);
                            int i6 = (int) C2.getLong(w10);
                            int i7 = w;
                            int i8 = w2;
                            cc w34 = kk1.w((int) C2.getLong(w11));
                            long j4 = C2.getLong(w12);
                            long j5 = C2.getLong(i4);
                            long j6 = C2.getLong(i5);
                            int i9 = w15;
                            long j7 = C2.getLong(i9);
                            w15 = i9;
                            int i10 = w16;
                            int i11 = w3;
                            boolean z2 = ((int) C2.getLong(i10)) != 0;
                            int i12 = w17;
                            int i13 = w4;
                            l51 y = kk1.y((int) C2.getLong(i12));
                            int i14 = w18;
                            int i15 = (int) C2.getLong(i14);
                            int i16 = w19;
                            int i17 = (int) C2.getLong(i16);
                            int i18 = w20;
                            long j8 = C2.getLong(i18);
                            int i19 = w21;
                            int i20 = (int) C2.getLong(i19);
                            w21 = i19;
                            int i21 = w22;
                            int i22 = (int) C2.getLong(i21);
                            int i23 = w23;
                            Boolean bool = null;
                            String h4 = C2.isNull(i23) ? null : C2.h(i23);
                            int i24 = w24;
                            if (C2.isNull(i24)) {
                                i2 = i23;
                                w22 = i21;
                                valueOf = null;
                            } else {
                                i2 = i23;
                                w22 = i21;
                                valueOf = Integer.valueOf((int) C2.getLong(i24));
                            }
                            if (valueOf != null) {
                                bool = Boolean.valueOf(valueOf.intValue() != 0);
                            }
                            Boolean bool2 = bool;
                            int i25 = w25;
                            r21 x = kk1.x((int) C2.getLong(i25));
                            int i26 = w26;
                            h21 T = kk1.T(C2.getBlob(i26));
                            int i27 = w27;
                            boolean z3 = ((int) C2.getLong(i27)) != 0;
                            int i28 = w28;
                            boolean z4 = ((int) C2.getLong(i28)) != 0;
                            int i29 = w29;
                            boolean z5 = ((int) C2.getLong(i29)) != 0;
                            w29 = i29;
                            int i30 = w30;
                            int i31 = w31;
                            int i32 = w32;
                            w31 = i31;
                            int i33 = w33;
                            arrayList.add(new gc2(h, z, h2, h3, k, k2, j, j2, j3, new lw(T, x, z3, z4, z5, ((int) C2.getLong(i30)) != 0, C2.getLong(i31), C2.getLong(i32), kk1.h(C2.getBlob(i33))), i6, w34, j4, j5, j6, j7, z2, y, i15, i17, j8, i20, i22, h4, bool2));
                            w28 = i28;
                            w4 = i13;
                            w17 = i12;
                            w18 = i14;
                            w19 = i16;
                            w20 = i18;
                            w23 = i2;
                            w24 = i24;
                            w25 = i25;
                            w26 = i26;
                            w27 = i27;
                            w33 = i33;
                            w32 = i32;
                            w30 = i30;
                            w = i7;
                            w3 = i11;
                            w13 = i4;
                            w14 = i5;
                            w2 = i8;
                            w16 = i10;
                        }
                        C2.close();
                        return arrayList;
                    } catch (Throwable th) {
                        C2.close();
                        throw th;
                    }
                }
            });
            a(C, juVar.d, list3);
            list3.addAll(list2);
            List list4 = (List) tl2.E(dh1Var2, true, false, new ub(12));
            workDatabase.v();
            workDatabase.r();
            if (list3.size() > 0) {
                gc2[] gc2VarArr = (gc2[]) list3.toArray(new gc2[list3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    bk1 bk1Var = (bk1) it.next();
                    if (bk1Var.e()) {
                        bk1Var.c(gc2VarArr);
                    }
                }
            }
            if (list4.size() > 0) {
                gc2[] gc2VarArr2 = (gc2[]) list4.toArray(new gc2[list4.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    bk1 bk1Var2 = (bk1) it2.next();
                    if (!bk1Var2.e()) {
                        bk1Var2.c(gc2VarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.r();
            throw th;
        }
    }
}
