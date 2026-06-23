package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.core.widget.rsm.gXdyRQCGVlHW;

/* loaded from: classes.dex */
public final class ag1 extends qx0 {
    public final /* synthetic */ int c = 1;
    public final Context d;

    public ag1(Context context) {
        super(9, 10);
        this.d = context;
    }

    public ag1(Context context, int i, int i2) {
        super(i, i2);
        this.d = context;
    }

    @Override // defpackage.qx0
    public final void a(se0 se0Var) {
        int i = this.c;
        Context context = this.d;
        se0Var.getClass();
        switch (i) {
            case 0:
                if (this.b >= 10) {
                    se0Var.o(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    context.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                se0Var.m("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j2 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    se0Var.a();
                    try {
                        se0Var.o(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        se0Var.o(new Object[]{"reschedule_needed", Long.valueOf(j2)});
                        sharedPreferences.edit().clear().apply();
                        se0Var.D();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                String str = gXdyRQCGVlHW.FRVCuSQFa;
                if (sharedPreferences2.contains(str) || sharedPreferences2.contains(str)) {
                    int i2 = sharedPreferences2.getInt(str, 0);
                    int i3 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    se0Var.a();
                    try {
                        se0Var.o(new Object[]{str, Integer.valueOf(i2)});
                        se0Var.o(new Object[]{"next_alarm_manager_id", Integer.valueOf(i3)});
                        sharedPreferences2.edit().clear().apply();
                        se0Var.D();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }
}
