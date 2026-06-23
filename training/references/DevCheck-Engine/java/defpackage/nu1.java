package defpackage;

import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;
import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final /* synthetic */ class nu1 implements lf0 {
    public final /* synthetic */ int g;
    public final /* synthetic */ String h;
    public final /* synthetic */ int i;

    public /* synthetic */ nu1(int i, String str) {
        this.g = 2;
        this.i = i;
        this.h = str;
    }

    public /* synthetic */ nu1(int i, String str, int i2) {
        this.g = i2;
        this.h = str;
        this.i = i;
    }

    @Override // defpackage.lf0
    public final Object j(Object obj) {
        aj1 C;
        mu1 mu1Var;
        int i = this.g;
        e42 e42Var = e42.f219a;
        String str = this.h;
        int i2 = this.i;
        ti1 ti1Var = (ti1) obj;
        switch (i) {
            case 0:
                ti1Var.getClass();
                C = ti1Var.C("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    C.s(1, str);
                    C.d(2, i2);
                    int w = k32.w(C, "work_spec_id");
                    int w2 = k32.w(C, bOxzFZXgEkjph.ArdHPoiMnHLn);
                    int w3 = k32.w(C, "system_id");
                    if (C.w()) {
                        mu1Var = new mu1((int) C.getLong(w2), C.h(w), (int) C.getLong(w3));
                    } else {
                        mu1Var = null;
                    }
                    return mu1Var;
                } finally {
                }
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                ti1Var.getClass();
                C = ti1Var.C("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    C.s(1, str);
                    C.d(2, i2);
                    C.w();
                    return e42Var;
                } finally {
                }
            default:
                ti1Var.getClass();
                C = ti1Var.C("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    C.d(1, i2);
                    C.s(2, str);
                    C.w();
                    return e42Var;
                } finally {
                }
        }
    }
}
