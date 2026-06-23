package defpackage;

import org.apache.commons.logging.impl.SimpleLog;

/* loaded from: classes.dex */
public final class g8 extends d90 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g8(dh1 dh1Var) {
        super(dh1Var);
        this.d = 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(dh1 dh1Var, int i) {
        super(dh1Var);
        this.d = i;
        dh1Var.getClass();
    }

    @Override // defpackage.pn1
    public final String b() {
        switch (this.d) {
            case 0:
                return "INSERT OR REPLACE INTO `app_usage` (`id`,`date_epoch_day`,`package_name`,`energy_mwh`,`foreground_ms`,`background_ms`,`category`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
            case SimpleLog.LOG_LEVEL_TRACE /* 1 */:
                return "INSERT OR ABORT INTO `battery_sample` (`id`,`captured_at`,`level_pct`,`voltage_mv`,`current_ua`,`temperature_deci_c`,`charge_counter_uah`,`status`,`plugged`,`charging`,`screen_on`,`thermal_status`,`resolution`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?)";
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                return "INSERT OR ABORT INTO `benchmark_run` (`id`,`started_at`,`finished_at`,`fingerprint_json`,`overall_score`,`category_scores_json`,`thermal_throttle_pct`,`stability_cv`,`iterations`,`cooldown_sec`,`schema_version`,`thermal_start`,`thermal_end`,`battery_start_pct`,`battery_end_pct`,`server_run_id`,`uploaded`,`throttled_subtest_count`,`completion_status`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 3:
                return "INSERT OR ABORT INTO `subtest_value` (`id`,`run_id`,`section_id`,`subtest_id`,`display_name`,`unit`,`higher_better`,`median`,`min_value`,`max_value`,`score`,`raw_values_json`,`iteration_cpus_json`,`elapsed_ms`,`throttled`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case SimpleLog.LOG_LEVEL_WARN /* 4 */:
                return "INSERT OR ABORT INTO `charging_session` (`id`,`started_at`,`ended_at`,`start_level_pct`,`end_level_pct`,`delivered_uah`,`plugged_kind`,`avg_power_mw`,`peak_power_mw`,`avg_temp_deci_c`,`peak_temp_deci_c`,`sample_count`,`extrapolated_capacity_mah`,`extrapolated_confidence`,`soc_buckets_screen_on_ms`,`soc_buckets_screen_off_ms`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 5:
                return "INSERT OR ABORT INTO `discharge_session` (`id`,`started_at`,`ended_at`,`start_level_pct`,`end_level_pct`,`drained_uah`,`duration_ms`,`screen_on_ms`,`active_drain_pct_per_hr_x100`,`idle_drain_pct_per_hr_x100`,`avg_power_mw`,`peak_power_mw`,`avg_temp_deci_c`,`peak_temp_deci_c`,`sample_count`,`deep_sleep_baseline_ms`,`soc_buckets_screen_on_ms`,`soc_buckets_screen_off_ms`,`app_usage_data`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR ABORT INTO `health_snapshot` (`id`,`captured_at`,`estimated_capacity_mah`,`design_capacity_mah`,`cycle_count_x100`,`confidence`,`source_session_id`) VALUES (nullif(?, 0),?,?,?,?,?,?)";
        }
    }

    public void d(ze0 ze0Var, Object obj) {
        switch (this.d) {
            case SimpleLog.LOG_LEVEL_DEBUG /* 2 */:
                li liVar = (li) obj;
                ze0Var.d(1, liVar.f590a);
                ze0Var.d(2, liVar.b);
                ze0Var.d(3, liVar.c);
                String str = liVar.d;
                if (str == null) {
                    ze0Var.b(4);
                } else {
                    ze0Var.k(4, str);
                }
                ze0Var.n(5, liVar.e);
                String str2 = liVar.f;
                if (str2 == null) {
                    ze0Var.b(6);
                } else {
                    ze0Var.k(6, str2);
                }
                ze0Var.n(7, liVar.g);
                ze0Var.n(8, liVar.h);
                ze0Var.d(9, liVar.i);
                ze0Var.d(10, liVar.j);
                ze0Var.d(11, liVar.k);
                ze0Var.d(12, liVar.l);
                ze0Var.d(13, liVar.m);
                ze0Var.d(14, liVar.n);
                ze0Var.d(15, liVar.o);
                String str3 = liVar.p;
                if (str3 == null) {
                    ze0Var.b(16);
                } else {
                    ze0Var.k(16, str3);
                }
                ze0Var.d(17, liVar.q);
                ze0Var.d(18, liVar.r);
                ze0Var.d(19, liVar.s);
                break;
            default:
                qs1 qs1Var = (qs1) obj;
                ze0Var.d(1, qs1Var.f860a);
                ze0Var.d(2, qs1Var.b);
                String str4 = qs1Var.c;
                if (str4 == null) {
                    ze0Var.b(3);
                } else {
                    ze0Var.k(3, str4);
                }
                String str5 = qs1Var.d;
                if (str5 == null) {
                    ze0Var.b(4);
                } else {
                    ze0Var.k(4, str5);
                }
                String str6 = qs1Var.e;
                if (str6 == null) {
                    ze0Var.b(5);
                } else {
                    ze0Var.k(5, str6);
                }
                String str7 = qs1Var.f;
                if (str7 == null) {
                    ze0Var.b(6);
                } else {
                    ze0Var.k(6, str7);
                }
                ze0Var.d(7, qs1Var.g ? 1L : 0L);
                Double d = qs1Var.h;
                if (d == null) {
                    ze0Var.b(8);
                } else {
                    ze0Var.n(8, d.doubleValue());
                }
                Double d2 = qs1Var.i;
                if (d2 == null) {
                    ze0Var.b(9);
                } else {
                    ze0Var.n(9, d2.doubleValue());
                }
                Double d3 = qs1Var.j;
                if (d3 == null) {
                    ze0Var.b(10);
                } else {
                    ze0Var.n(10, d3.doubleValue());
                }
                Double d4 = qs1Var.k;
                if (d4 == null) {
                    ze0Var.b(11);
                } else {
                    ze0Var.n(11, d4.doubleValue());
                }
                String str8 = qs1Var.l;
                if (str8 == null) {
                    ze0Var.b(12);
                } else {
                    ze0Var.k(12, str8);
                }
                String str9 = qs1Var.m;
                if (str9 == null) {
                    ze0Var.b(13);
                } else {
                    ze0Var.k(13, str9);
                }
                ze0Var.d(14, qs1Var.n);
                ze0Var.d(15, qs1Var.o ? 1L : 0L);
                break;
        }
    }
}
