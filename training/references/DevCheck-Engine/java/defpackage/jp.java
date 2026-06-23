package defpackage;

/* loaded from: classes.dex */
public final class jp extends d90 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jp(dh1 dh1Var, int i) {
        super(dh1Var);
        this.d = i;
    }

    @Override // defpackage.pn1
    public final String b() {
        switch (this.d) {
            case 0:
                return "UPDATE OR ABORT `charging_session` SET `id` = ?,`started_at` = ?,`ended_at` = ?,`start_level_pct` = ?,`end_level_pct` = ?,`delivered_uah` = ?,`plugged_kind` = ?,`avg_power_mw` = ?,`peak_power_mw` = ?,`avg_temp_deci_c` = ?,`peak_temp_deci_c` = ?,`sample_count` = ?,`extrapolated_capacity_mah` = ?,`extrapolated_confidence` = ?,`soc_buckets_screen_on_ms` = ?,`soc_buckets_screen_off_ms` = ? WHERE `id` = ?";
            default:
                return "UPDATE OR ABORT `discharge_session` SET `id` = ?,`started_at` = ?,`ended_at` = ?,`start_level_pct` = ?,`end_level_pct` = ?,`drained_uah` = ?,`duration_ms` = ?,`screen_on_ms` = ?,`active_drain_pct_per_hr_x100` = ?,`idle_drain_pct_per_hr_x100` = ?,`avg_power_mw` = ?,`peak_power_mw` = ?,`avg_temp_deci_c` = ?,`peak_temp_deci_c` = ?,`sample_count` = ?,`deep_sleep_baseline_ms` = ?,`soc_buckets_screen_on_ms` = ?,`soc_buckets_screen_off_ms` = ?,`app_usage_data` = ? WHERE `id` = ?";
        }
    }
}
