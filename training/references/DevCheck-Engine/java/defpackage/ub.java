package defpackage;

import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import android.telephony.fHMN.BFtDZYxPcpGN;
import androidx.core.widget.rsm.gXdyRQCGVlHW;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;
import com.imn.iivisu.ltkT.CDsMEtnUjndKau;
import com.jjoe64.graphview.XZMC.MiGPiFgcCQCVh;
import flar2.devcheck.benchmarkSuite.nativebridge.vGm.RIhTGWkqQvGL;
import flar2.devcheck.ui.root.GXPA.XmJDY;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class ub implements lf0 {
    public final /* synthetic */ int g;

    public /* synthetic */ ub(int i) {
        this.g = i;
    }

    private final Object c(Object obj) {
        int i;
        Integer valueOf;
        ti1 ti1Var = (ti1) obj;
        ti1Var.getClass();
        aj1 C = ti1Var.C("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?");
        try {
            C.d(1, 200L);
            int w = k32.w(C, "id");
            int w2 = k32.w(C, "state");
            int w3 = k32.w(C, "worker_class_name");
            int w4 = k32.w(C, "input_merger_class_name");
            int w5 = k32.w(C, "input");
            int w6 = k32.w(C, RIhTGWkqQvGL.ioNTGYFeiV);
            int w7 = k32.w(C, "initial_delay");
            int w8 = k32.w(C, "interval_duration");
            int w9 = k32.w(C, "flex_duration");
            int w10 = k32.w(C, "run_attempt_count");
            int w11 = k32.w(C, "backoff_policy");
            int w12 = k32.w(C, "backoff_delay_duration");
            int w13 = k32.w(C, "last_enqueue_time");
            int w14 = k32.w(C, "minimum_retention_duration");
            int w15 = k32.w(C, "schedule_requested_at");
            int w16 = k32.w(C, "run_in_foreground");
            int w17 = k32.w(C, "out_of_quota_policy");
            int w18 = k32.w(C, "period_count");
            int w19 = k32.w(C, "generation");
            int w20 = k32.w(C, "next_schedule_time_override");
            int w21 = k32.w(C, "next_schedule_time_override_generation");
            int w22 = k32.w(C, "stop_reason");
            int w23 = k32.w(C, "trace_tag");
            int w24 = k32.w(C, "backoff_on_system_interruptions");
            int w25 = k32.w(C, GFUHKHDfiFuPm.IKVD);
            int w26 = k32.w(C, "required_network_request");
            int w27 = k32.w(C, "requires_charging");
            int w28 = k32.w(C, "requires_device_idle");
            int w29 = k32.w(C, "requires_battery_not_low");
            int w30 = k32.w(C, "requires_storage_not_low");
            int w31 = k32.w(C, "trigger_content_update_delay");
            int w32 = k32.w(C, "trigger_max_content_delay");
            int w33 = k32.w(C, "content_uri_triggers");
            ArrayList arrayList = new ArrayList();
            while (C.w()) {
                String h = C.h(w);
                int i2 = w13;
                int i3 = w14;
                yb2 z = kk1.z((int) C.getLong(w2));
                String h2 = C.h(w3);
                String h3 = C.h(w4);
                byte[] blob = C.getBlob(w5);
                t00 t00Var = t00.b;
                t00 k = c3.k(blob);
                t00 k2 = c3.k(C.getBlob(w6));
                long j = C.getLong(w7);
                long j2 = C.getLong(w8);
                long j3 = C.getLong(w9);
                int i4 = (int) C.getLong(w10);
                int i5 = w;
                int i6 = w2;
                cc w34 = kk1.w((int) C.getLong(w11));
                long j4 = C.getLong(w12);
                long j5 = C.getLong(i2);
                long j6 = C.getLong(i3);
                int i7 = w15;
                long j7 = C.getLong(i7);
                w15 = i7;
                int i8 = w16;
                int i9 = w3;
                boolean z2 = ((int) C.getLong(i8)) != 0;
                int i10 = w17;
                int i11 = w4;
                l51 y = kk1.y((int) C.getLong(i10));
                int i12 = w18;
                int i13 = (int) C.getLong(i12);
                int i14 = w19;
                int i15 = (int) C.getLong(i14);
                int i16 = w20;
                long j8 = C.getLong(i16);
                int i17 = w21;
                int i18 = (int) C.getLong(i17);
                w21 = i17;
                int i19 = w22;
                int i20 = (int) C.getLong(i19);
                int i21 = w23;
                Boolean bool = null;
                String h4 = C.isNull(i21) ? null : C.h(i21);
                int i22 = w24;
                if (C.isNull(i22)) {
                    i = i21;
                    w22 = i19;
                    valueOf = null;
                } else {
                    i = i21;
                    w22 = i19;
                    valueOf = Integer.valueOf((int) C.getLong(i22));
                }
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
                Boolean bool2 = bool;
                int i23 = w25;
                r21 x = kk1.x((int) C.getLong(i23));
                int i24 = w26;
                h21 T = kk1.T(C.getBlob(i24));
                int i25 = w27;
                boolean z3 = ((int) C.getLong(i25)) != 0;
                int i26 = w28;
                boolean z4 = ((int) C.getLong(i26)) != 0;
                int i27 = w29;
                boolean z5 = ((int) C.getLong(i27)) != 0;
                w29 = i27;
                int i28 = w30;
                int i29 = w31;
                int i30 = w32;
                w31 = i29;
                int i31 = w33;
                arrayList.add(new gc2(h, z, h2, h3, k, k2, j, j2, j3, new lw(T, x, z3, z4, z5, ((int) C.getLong(i28)) != 0, C.getLong(i29), C.getLong(i30), kk1.h(C.getBlob(i31))), i4, w34, j4, j5, j6, j7, z2, y, i13, i15, j8, i18, i20, h4, bool2));
                w28 = i26;
                w4 = i11;
                w17 = i10;
                w18 = i12;
                w19 = i14;
                w20 = i16;
                w23 = i;
                w24 = i22;
                w25 = i23;
                w26 = i24;
                w27 = i25;
                w33 = i31;
                w32 = i30;
                w30 = i28;
                w = i5;
                w3 = i9;
                w13 = i2;
                w14 = i3;
                w2 = i6;
                w16 = i8;
            }
            C.close();
            return arrayList;
        } catch (Throwable th) {
            C.close();
            throw th;
        }
    }

    @Override // defpackage.lf0
    public final Object j(Object obj) {
        aj1 C;
        Integer valueOf;
        Boolean bool;
        Integer valueOf2;
        Boolean bool2;
        boolean z;
        Integer valueOf3;
        Boolean bool3;
        int i = this.g;
        String str = XmJDY.SWpVZLe;
        String str2 = gXdyRQCGVlHW.JEnKbzTtJca;
        switch (i) {
            case 0:
                return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ox oxVar = (ox) obj;
                if (oxVar instanceof sx) {
                    return (sx) oxVar;
                }
                return null;
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                String str3 = (String) entry.getKey();
                Object value = entry.getValue();
                StringBuilder sb = new StringBuilder();
                sb.append(str3);
                sb.append(" : ");
                if (value instanceof Object[]) {
                    value = Arrays.toString((Object[]) value);
                    value.getClass();
                }
                sb.append(value);
                return sb.toString();
            case 3:
                ti1 ti1Var = (ti1) obj;
                ti1Var.getClass();
                C = ti1Var.C("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList = new ArrayList();
                    while (C.w()) {
                        arrayList.add(C.h(0));
                    }
                    return arrayList;
                } finally {
                }
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                aj1 aj1Var = (aj1) obj;
                aj1Var.getClass();
                return Boolean.valueOf(aj1Var.w());
            case 5:
                aj1 aj1Var2 = (aj1) obj;
                aj1Var2.getClass();
                xm1 xm1Var = new xm1();
                while (aj1Var2.w()) {
                    xm1Var.add(Integer.valueOf((int) aj1Var2.getLong(0)));
                }
                return xc1.d(xm1Var);
            case SimpleLog.LOG_LEVEL_FATAL /* 6 */:
                gv gvVar = (gv) obj;
                gvVar.getClass();
                return gvVar.getClass().getSimpleName();
            case SimpleLog.LOG_LEVEL_OFF /* 7 */:
                ti1 ti1Var2 = (ti1) obj;
                ti1Var2.getClass();
                C = ti1Var2.C("DELETE FROM WorkProgress");
                try {
                    C.w();
                    C.close();
                    return e42.f219a;
                } finally {
                }
            case 8:
                ti1 ti1Var3 = (ti1) obj;
                ti1Var3.getClass();
                C = ti1Var3.C("SELECT * FROM workspec WHERE state=1");
                try {
                    int w = k32.w(C, "id");
                    int w2 = k32.w(C, "state");
                    int w3 = k32.w(C, "worker_class_name");
                    int w4 = k32.w(C, "input_merger_class_name");
                    int w5 = k32.w(C, "input");
                    int w6 = k32.w(C, "output");
                    int w7 = k32.w(C, "initial_delay");
                    int w8 = k32.w(C, "interval_duration");
                    int w9 = k32.w(C, "flex_duration");
                    int w10 = k32.w(C, "run_attempt_count");
                    int w11 = k32.w(C, "backoff_policy");
                    int w12 = k32.w(C, "backoff_delay_duration");
                    int w13 = k32.w(C, "last_enqueue_time");
                    int w14 = k32.w(C, str2);
                    int w15 = k32.w(C, "schedule_requested_at");
                    int w16 = k32.w(C, "run_in_foreground");
                    int w17 = k32.w(C, str);
                    int w18 = k32.w(C, "period_count");
                    int w19 = k32.w(C, "generation");
                    int w20 = k32.w(C, "next_schedule_time_override");
                    int w21 = k32.w(C, "next_schedule_time_override_generation");
                    int w22 = k32.w(C, bOxzFZXgEkjph.zUSx);
                    int w23 = k32.w(C, "trace_tag");
                    int w24 = k32.w(C, "backoff_on_system_interruptions");
                    int w25 = k32.w(C, "required_network_type");
                    int w26 = k32.w(C, CDsMEtnUjndKau.rPtsNgtaB);
                    int w27 = k32.w(C, "requires_charging");
                    int w28 = k32.w(C, "requires_device_idle");
                    int w29 = k32.w(C, "requires_battery_not_low");
                    int w30 = k32.w(C, "requires_storage_not_low");
                    int w31 = k32.w(C, "trigger_content_update_delay");
                    int w32 = k32.w(C, "trigger_max_content_delay");
                    int w33 = k32.w(C, "content_uri_triggers");
                    ArrayList arrayList2 = new ArrayList();
                    while (C.w()) {
                        String h = C.h(w);
                        int i2 = w14;
                        int i3 = w13;
                        yb2 z2 = kk1.z((int) C.getLong(w2));
                        String h2 = C.h(w3);
                        String h3 = C.h(w4);
                        byte[] blob = C.getBlob(w5);
                        t00 t00Var = t00.b;
                        t00 k = c3.k(blob);
                        t00 k2 = c3.k(C.getBlob(w6));
                        long j = C.getLong(w7);
                        long j2 = C.getLong(w8);
                        long j3 = C.getLong(w9);
                        int i4 = (int) C.getLong(w10);
                        int i5 = w5;
                        int i6 = w4;
                        cc w34 = kk1.w((int) C.getLong(w11));
                        long j4 = C.getLong(w12);
                        long j5 = C.getLong(i3);
                        long j6 = C.getLong(i2);
                        int i7 = w15;
                        long j7 = C.getLong(i7);
                        w15 = i7;
                        int i8 = w16;
                        int i9 = w3;
                        boolean z3 = ((int) C.getLong(i8)) != 0;
                        int i10 = w17;
                        int i11 = w2;
                        l51 y = kk1.y((int) C.getLong(i10));
                        int i12 = w18;
                        int i13 = (int) C.getLong(i12);
                        int i14 = w19;
                        int i15 = (int) C.getLong(i14);
                        int i16 = w20;
                        long j8 = C.getLong(i16);
                        int i17 = w21;
                        int i18 = (int) C.getLong(i17);
                        w21 = i17;
                        int i19 = w22;
                        int i20 = (int) C.getLong(i19);
                        int i21 = w23;
                        String h4 = C.isNull(i21) ? null : C.h(i21);
                        int i22 = w24;
                        if (C.isNull(i22)) {
                            w23 = i21;
                            w22 = i19;
                            valueOf = null;
                        } else {
                            w23 = i21;
                            w22 = i19;
                            valueOf = Integer.valueOf((int) C.getLong(i22));
                        }
                        if (valueOf != null) {
                            bool = Boolean.valueOf(valueOf.intValue() != 0);
                        } else {
                            bool = null;
                        }
                        int i23 = w25;
                        r21 x = kk1.x((int) C.getLong(i23));
                        int i24 = w26;
                        h21 T = kk1.T(C.getBlob(i24));
                        int i25 = w27;
                        boolean z4 = ((int) C.getLong(i25)) != 0;
                        int i26 = w28;
                        boolean z5 = ((int) C.getLong(i26)) != 0;
                        int i27 = w29;
                        boolean z6 = ((int) C.getLong(i27)) != 0;
                        w29 = i27;
                        int i28 = w30;
                        int i29 = w31;
                        int i30 = w32;
                        w31 = i29;
                        int i31 = w33;
                        arrayList2.add(new gc2(h, z2, h2, h3, k, k2, j, j2, j3, new lw(T, x, z4, z5, z6, ((int) C.getLong(i28)) != 0, C.getLong(i29), C.getLong(i30), kk1.h(C.getBlob(i31))), i4, w34, j4, j5, j6, j7, z3, y, i13, i15, j8, i18, i20, h4, bool));
                        w28 = i26;
                        w2 = i11;
                        w17 = i10;
                        w18 = i12;
                        w19 = i14;
                        w20 = i16;
                        w24 = i22;
                        w25 = i23;
                        w26 = i24;
                        w27 = i25;
                        w33 = i31;
                        w32 = i30;
                        w30 = i28;
                        w4 = i6;
                        w13 = i3;
                        w14 = i2;
                        w5 = i5;
                        w3 = i9;
                        w16 = i8;
                    }
                    return arrayList2;
                } finally {
                }
            case rt0.o /* 9 */:
                ti1 ti1Var4 = (ti1) obj;
                ti1Var4.getClass();
                C = ti1Var4.C("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time");
                try {
                    int w35 = k32.w(C, "id");
                    int w36 = k32.w(C, "state");
                    int w37 = k32.w(C, "worker_class_name");
                    int w38 = k32.w(C, "input_merger_class_name");
                    int w39 = k32.w(C, "input");
                    int w40 = k32.w(C, "output");
                    int w41 = k32.w(C, "initial_delay");
                    int w42 = k32.w(C, "interval_duration");
                    int w43 = k32.w(C, "flex_duration");
                    int w44 = k32.w(C, "run_attempt_count");
                    int w45 = k32.w(C, "backoff_policy");
                    int w46 = k32.w(C, "backoff_delay_duration");
                    int w47 = k32.w(C, "last_enqueue_time");
                    int w48 = k32.w(C, str2);
                    int w49 = k32.w(C, "schedule_requested_at");
                    int w50 = k32.w(C, "run_in_foreground");
                    int w51 = k32.w(C, str);
                    int w52 = k32.w(C, "period_count");
                    int w53 = k32.w(C, "generation");
                    int w54 = k32.w(C, "next_schedule_time_override");
                    int w55 = k32.w(C, "next_schedule_time_override_generation");
                    int w56 = k32.w(C, "stop_reason");
                    int w57 = k32.w(C, "trace_tag");
                    int w58 = k32.w(C, "backoff_on_system_interruptions");
                    int w59 = k32.w(C, "required_network_type");
                    int w60 = k32.w(C, "required_network_request");
                    int w61 = k32.w(C, ILBLnlCHDVqsSN.wJySxqoQ);
                    int w62 = k32.w(C, "requires_device_idle");
                    int w63 = k32.w(C, MiGPiFgcCQCVh.ITKSShsDq);
                    int w64 = k32.w(C, "requires_storage_not_low");
                    int w65 = k32.w(C, "trigger_content_update_delay");
                    int w66 = k32.w(C, "trigger_max_content_delay");
                    int w67 = k32.w(C, "content_uri_triggers");
                    ArrayList arrayList3 = new ArrayList();
                    while (C.w()) {
                        String h5 = C.h(w35);
                        int i32 = w48;
                        int i33 = w47;
                        yb2 z7 = kk1.z((int) C.getLong(w36));
                        String h6 = C.h(w37);
                        String h7 = C.h(w38);
                        byte[] blob2 = C.getBlob(w39);
                        t00 t00Var2 = t00.b;
                        t00 k3 = c3.k(blob2);
                        t00 k4 = c3.k(C.getBlob(w40));
                        long j9 = C.getLong(w41);
                        long j10 = C.getLong(w42);
                        long j11 = C.getLong(w43);
                        int i34 = (int) C.getLong(w44);
                        int i35 = w39;
                        int i36 = w38;
                        cc w68 = kk1.w((int) C.getLong(w45));
                        long j12 = C.getLong(w46);
                        long j13 = C.getLong(i33);
                        long j14 = C.getLong(i32);
                        int i37 = w49;
                        long j15 = C.getLong(i37);
                        int i38 = w37;
                        int i39 = w50;
                        boolean z8 = ((int) C.getLong(i39)) != 0;
                        int i40 = w36;
                        int i41 = w51;
                        l51 y2 = kk1.y((int) C.getLong(i41));
                        w51 = i41;
                        int i42 = w52;
                        int i43 = (int) C.getLong(i42);
                        w52 = i42;
                        int i44 = w53;
                        int i45 = (int) C.getLong(i44);
                        int i46 = w54;
                        long j16 = C.getLong(i46);
                        int i47 = w55;
                        int i48 = (int) C.getLong(i47);
                        w55 = i47;
                        int i49 = w56;
                        int i50 = (int) C.getLong(i49);
                        int i51 = w57;
                        String h8 = C.isNull(i51) ? null : C.h(i51);
                        int i52 = w58;
                        if (C.isNull(i52)) {
                            w57 = i51;
                            w56 = i49;
                            valueOf2 = null;
                        } else {
                            w57 = i51;
                            w56 = i49;
                            valueOf2 = Integer.valueOf((int) C.getLong(i52));
                        }
                        if (valueOf2 != null) {
                            bool2 = Boolean.valueOf(valueOf2.intValue() != 0);
                        } else {
                            bool2 = null;
                        }
                        int i53 = w59;
                        r21 x2 = kk1.x((int) C.getLong(i53));
                        int i54 = w60;
                        h21 T2 = kk1.T(C.getBlob(i54));
                        int i55 = w61;
                        boolean z9 = ((int) C.getLong(i55)) != 0;
                        int i56 = w62;
                        boolean z10 = ((int) C.getLong(i56)) != 0;
                        int i57 = w63;
                        boolean z11 = ((int) C.getLong(i57)) != 0;
                        w63 = i57;
                        int i58 = w64;
                        int i59 = w65;
                        int i60 = w66;
                        w65 = i59;
                        int i61 = w67;
                        arrayList3.add(new gc2(h5, z7, h6, h7, k3, k4, j9, j10, j11, new lw(T2, x2, z9, z10, z11, ((int) C.getLong(i58)) != 0, C.getLong(i59), C.getLong(i60), kk1.h(C.getBlob(i61))), i34, w68, j12, j13, j14, j15, z8, y2, i43, i45, j16, i48, i50, h8, bool2));
                        w36 = i40;
                        w50 = i39;
                        w53 = i44;
                        w54 = i46;
                        w58 = i52;
                        w59 = i53;
                        w60 = i54;
                        w61 = i55;
                        w62 = i56;
                        w67 = i61;
                        w66 = i60;
                        w64 = i58;
                        w48 = i32;
                        w38 = i36;
                        w39 = i35;
                        w37 = i38;
                        w49 = i37;
                        w47 = i33;
                    }
                    return arrayList3;
                } finally {
                }
            case 10:
                ti1 ti1Var5 = (ti1) obj;
                ti1Var5.getClass();
                C = ti1Var5.C("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)");
                try {
                    int i62 = C.w() ? (int) C.getLong(0) : 0;
                    C.close();
                    return Integer.valueOf(i62);
                } finally {
                }
            case 11:
                ti1 ti1Var6 = (ti1) obj;
                ti1Var6.getClass();
                C = ti1Var6.C("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1");
                try {
                    if (C.w()) {
                        z = ((int) C.getLong(0)) != 0;
                    } else {
                        z = false;
                    }
                    C.close();
                    return Boolean.valueOf(z);
                } finally {
                }
            case 12:
                return c(obj);
            case 13:
                ti1 ti1Var7 = (ti1) obj;
                ti1Var7.getClass();
                C = ti1Var7.C("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)");
                try {
                    C.w();
                    int x3 = op0.x(ti1Var7);
                    C.close();
                    return Integer.valueOf(x3);
                } finally {
                }
            default:
                ti1 ti1Var8 = (ti1) obj;
                ti1Var8.getClass();
                C = ti1Var8.C("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1");
                try {
                    int w69 = k32.w(C, "id");
                    int w70 = k32.w(C, "state");
                    int w71 = k32.w(C, "worker_class_name");
                    int w72 = k32.w(C, "input_merger_class_name");
                    int w73 = k32.w(C, "input");
                    int w74 = k32.w(C, "output");
                    int w75 = k32.w(C, "initial_delay");
                    int w76 = k32.w(C, "interval_duration");
                    int w77 = k32.w(C, "flex_duration");
                    int w78 = k32.w(C, "run_attempt_count");
                    int w79 = k32.w(C, "backoff_policy");
                    int w80 = k32.w(C, "backoff_delay_duration");
                    int w81 = k32.w(C, "last_enqueue_time");
                    int w82 = k32.w(C, str2);
                    int w83 = k32.w(C, "schedule_requested_at");
                    int w84 = k32.w(C, "run_in_foreground");
                    int w85 = k32.w(C, str);
                    int w86 = k32.w(C, "period_count");
                    int w87 = k32.w(C, "generation");
                    int w88 = k32.w(C, "next_schedule_time_override");
                    int w89 = k32.w(C, "next_schedule_time_override_generation");
                    int w90 = k32.w(C, "stop_reason");
                    int w91 = k32.w(C, "trace_tag");
                    int w92 = k32.w(C, "backoff_on_system_interruptions");
                    int w93 = k32.w(C, "required_network_type");
                    int w94 = k32.w(C, "required_network_request");
                    int w95 = k32.w(C, "requires_charging");
                    int w96 = k32.w(C, BFtDZYxPcpGN.vBNH);
                    int w97 = k32.w(C, "requires_battery_not_low");
                    int w98 = k32.w(C, "requires_storage_not_low");
                    int w99 = k32.w(C, "trigger_content_update_delay");
                    int w100 = k32.w(C, "trigger_max_content_delay");
                    int w101 = k32.w(C, "content_uri_triggers");
                    ArrayList arrayList4 = new ArrayList();
                    while (C.w()) {
                        String h9 = C.h(w69);
                        int i63 = w82;
                        int i64 = w81;
                        yb2 z12 = kk1.z((int) C.getLong(w70));
                        String h10 = C.h(w71);
                        String h11 = C.h(w72);
                        byte[] blob3 = C.getBlob(w73);
                        t00 t00Var3 = t00.b;
                        t00 k5 = c3.k(blob3);
                        t00 k6 = c3.k(C.getBlob(w74));
                        long j17 = C.getLong(w75);
                        long j18 = C.getLong(w76);
                        long j19 = C.getLong(w77);
                        int i65 = (int) C.getLong(w78);
                        int i66 = w73;
                        int i67 = w72;
                        cc w102 = kk1.w((int) C.getLong(w79));
                        long j20 = C.getLong(w80);
                        long j21 = C.getLong(i64);
                        long j22 = C.getLong(i63);
                        int i68 = w83;
                        long j23 = C.getLong(i68);
                        int i69 = w71;
                        int i70 = w84;
                        boolean z13 = ((int) C.getLong(i70)) != 0;
                        int i71 = w70;
                        int i72 = w85;
                        l51 y3 = kk1.y((int) C.getLong(i72));
                        w85 = i72;
                        int i73 = w86;
                        int i74 = (int) C.getLong(i73);
                        w86 = i73;
                        int i75 = w87;
                        int i76 = (int) C.getLong(i75);
                        int i77 = w88;
                        long j24 = C.getLong(i77);
                        int i78 = w89;
                        int i79 = (int) C.getLong(i78);
                        w89 = i78;
                        int i80 = w90;
                        int i81 = (int) C.getLong(i80);
                        int i82 = w91;
                        String h12 = C.isNull(i82) ? null : C.h(i82);
                        int i83 = w92;
                        if (C.isNull(i83)) {
                            w91 = i82;
                            w90 = i80;
                            valueOf3 = null;
                        } else {
                            w91 = i82;
                            w90 = i80;
                            valueOf3 = Integer.valueOf((int) C.getLong(i83));
                        }
                        if (valueOf3 != null) {
                            bool3 = Boolean.valueOf(valueOf3.intValue() != 0);
                        } else {
                            bool3 = null;
                        }
                        int i84 = w93;
                        r21 x4 = kk1.x((int) C.getLong(i84));
                        int i85 = w94;
                        h21 T3 = kk1.T(C.getBlob(i85));
                        int i86 = w95;
                        boolean z14 = ((int) C.getLong(i86)) != 0;
                        int i87 = w96;
                        boolean z15 = ((int) C.getLong(i87)) != 0;
                        int i88 = w97;
                        boolean z16 = ((int) C.getLong(i88)) != 0;
                        w97 = i88;
                        int i89 = w98;
                        int i90 = w99;
                        int i91 = w100;
                        w99 = i90;
                        int i92 = w101;
                        arrayList4.add(new gc2(h9, z12, h10, h11, k5, k6, j17, j18, j19, new lw(T3, x4, z14, z15, z16, ((int) C.getLong(i89)) != 0, C.getLong(i90), C.getLong(i91), kk1.h(C.getBlob(i92))), i65, w102, j20, j21, j22, j23, z13, y3, i74, i76, j24, i79, i81, h12, bool3));
                        w70 = i71;
                        w84 = i70;
                        w87 = i75;
                        w88 = i77;
                        w92 = i83;
                        w93 = i84;
                        w94 = i85;
                        w95 = i86;
                        w96 = i87;
                        w101 = i92;
                        w100 = i91;
                        w98 = i89;
                        w82 = i63;
                        w72 = i67;
                        w73 = i66;
                        w71 = i69;
                        w83 = i68;
                        w81 = i64;
                    }
                    return arrayList4;
                } finally {
                }
        }
    }
}
