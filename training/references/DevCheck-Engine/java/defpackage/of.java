package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.support.v4.media.session.VlWX.GFUHKHDfiFuPm;
import androidx.emoji2.text.Fk.Iyrs;
import androidx.media.RfwE.BIxeFreLLop;
import androidx.swiperefreshlayout.widget.ijWD.ILBLnlCHDVqsSN;
import androidx.work.impl.foreground.oo.bOxzFZXgEkjph;
import com.google.android.material.behavior.YqV.Gvyagftz;
import com.google.android.material.bottomappbar.HaCM.QCeVODiUkb;
import com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB;
import com.google.android.material.card.ZyJo.nTAZxGMqQtZZAQ;
import com.google.android.material.snackbar.qXlx.IGQCApxXGMWo;
import com.jjoe64.graphview.XZMC.MiGPiFgcCQCVh;
import flar2.devcheck.batteryMonitor2.data.BatteryMonitor2Db_Impl;
import flar2.devcheck.benchmarkSuite.history.BenchmarkHistoryDb_Impl;
import flar2.devcheck.dpreference.Eg.aEQQDLUUMo;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import moe.shizuku.api.hYGD.yttXLrAeLjN;

/* loaded from: classes.dex */
public final class of extends ko {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ dh1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of(BatteryMonitor2Db_Impl batteryMonitor2Db_Impl) {
        super(3);
        this.c = batteryMonitor2Db_Impl;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public of(BenchmarkHistoryDb_Impl benchmarkHistoryDb_Impl) {
        super(8);
        this.c = benchmarkHistoryDb_Impl;
    }

    private final void q() {
    }

    private final void r() {
    }

    @Override // defpackage.ko
    public final void a(se0 se0Var) {
        switch (this.b) {
            case 0:
                SQLiteDatabase sQLiteDatabase = se0Var.g;
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `battery_sample` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `captured_at` INTEGER NOT NULL, `level_pct` INTEGER NOT NULL, `voltage_mv` INTEGER NOT NULL, `current_ua` INTEGER NOT NULL, `temperature_deci_c` INTEGER NOT NULL, `charge_counter_uah` INTEGER NOT NULL, `status` INTEGER NOT NULL, `plugged` INTEGER NOT NULL, `charging` INTEGER NOT NULL, `screen_on` INTEGER NOT NULL, `thermal_status` INTEGER NOT NULL, `resolution` INTEGER NOT NULL DEFAULT 0)");
                sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_battery_sample_captured_at` ON `battery_sample` (`captured_at`)");
                sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_battery_sample_captured_at_charging` ON `battery_sample` (`captured_at`, `charging`)");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `charging_session` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `started_at` INTEGER NOT NULL, `ended_at` INTEGER NOT NULL, `start_level_pct` INTEGER NOT NULL, `end_level_pct` INTEGER NOT NULL, `delivered_uah` INTEGER NOT NULL, `plugged_kind` INTEGER NOT NULL, `avg_power_mw` INTEGER NOT NULL, `peak_power_mw` INTEGER NOT NULL, `avg_temp_deci_c` INTEGER NOT NULL, `peak_temp_deci_c` INTEGER NOT NULL, `sample_count` INTEGER NOT NULL, `extrapolated_capacity_mah` INTEGER NOT NULL DEFAULT 0, `extrapolated_confidence` INTEGER NOT NULL DEFAULT 0, `soc_buckets_screen_on_ms` TEXT DEFAULT '', `soc_buckets_screen_off_ms` TEXT DEFAULT '')");
                sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_charging_session_started_at` ON `charging_session` (`started_at`)");
                sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_charging_session_ended_at` ON `charging_session` (`ended_at`)");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `discharge_session` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `started_at` INTEGER NOT NULL, `ended_at` INTEGER NOT NULL, `start_level_pct` INTEGER NOT NULL, `end_level_pct` INTEGER NOT NULL, `drained_uah` INTEGER NOT NULL, `duration_ms` INTEGER NOT NULL, `screen_on_ms` INTEGER NOT NULL, `active_drain_pct_per_hr_x100` INTEGER NOT NULL, `idle_drain_pct_per_hr_x100` INTEGER NOT NULL, `avg_power_mw` INTEGER NOT NULL, `peak_power_mw` INTEGER NOT NULL, `avg_temp_deci_c` INTEGER NOT NULL, `peak_temp_deci_c` INTEGER NOT NULL, `sample_count` INTEGER NOT NULL, `deep_sleep_baseline_ms` INTEGER NOT NULL DEFAULT 0, `soc_buckets_screen_on_ms` TEXT DEFAULT '', `soc_buckets_screen_off_ms` TEXT DEFAULT '', `app_usage_data` TEXT DEFAULT '')");
                sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_discharge_session_started_at` ON `discharge_session` (`started_at`)");
                sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_discharge_session_ended_at` ON `discharge_session` (`ended_at`)");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `app_usage` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `date_epoch_day` INTEGER NOT NULL, `package_name` TEXT, `energy_mwh` INTEGER NOT NULL, `foreground_ms` INTEGER NOT NULL, `background_ms` INTEGER NOT NULL, `category` INTEGER NOT NULL)");
                sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_app_usage_date_epoch_day_package_name` ON `app_usage` (`date_epoch_day`, `package_name`)");
                sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_app_usage_date_epoch_day` ON `app_usage` (`date_epoch_day`)");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `health_snapshot` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `captured_at` INTEGER NOT NULL, `estimated_capacity_mah` INTEGER NOT NULL, `design_capacity_mah` INTEGER NOT NULL, `cycle_count_x100` INTEGER NOT NULL, `confidence` INTEGER NOT NULL, `source_session_id` INTEGER NOT NULL)");
                sQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_health_snapshot_captured_at` ON `health_snapshot` (`captured_at`)");
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                sQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '0341937525c91133733ae53a50860169')");
                break;
            default:
                SQLiteDatabase sQLiteDatabase2 = se0Var.g;
                sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS `benchmark_run` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `started_at` INTEGER NOT NULL, `finished_at` INTEGER NOT NULL, `fingerprint_json` TEXT NOT NULL, `overall_score` REAL NOT NULL, `category_scores_json` TEXT NOT NULL, `thermal_throttle_pct` REAL NOT NULL, `stability_cv` REAL NOT NULL, `iterations` INTEGER NOT NULL, `cooldown_sec` INTEGER NOT NULL, `schema_version` INTEGER NOT NULL, `thermal_start` INTEGER NOT NULL, `thermal_end` INTEGER NOT NULL, `battery_start_pct` INTEGER NOT NULL, `battery_end_pct` INTEGER NOT NULL, `server_run_id` TEXT, `uploaded` INTEGER NOT NULL DEFAULT 0, `throttled_subtest_count` INTEGER NOT NULL DEFAULT 0, `completion_status` INTEGER NOT NULL DEFAULT 0)");
                sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS `subtest_value` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `run_id` INTEGER NOT NULL, `section_id` TEXT NOT NULL, `subtest_id` TEXT NOT NULL, `display_name` TEXT NOT NULL, `unit` TEXT NOT NULL, `higher_better` INTEGER NOT NULL, `median` REAL, `min_value` REAL, `max_value` REAL, `score` REAL, `raw_values_json` TEXT NOT NULL, `iteration_cpus_json` TEXT NOT NULL DEFAULT '[]', `elapsed_ms` INTEGER NOT NULL, `throttled` INTEGER NOT NULL DEFAULT 0, FOREIGN KEY(`run_id`) REFERENCES `benchmark_run`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                sQLiteDatabase2.execSQL("CREATE INDEX IF NOT EXISTS `index_subtest_value_run_id` ON `subtest_value` (`run_id`)");
                sQLiteDatabase2.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                sQLiteDatabase2.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8d7f41e739a0ef6a800b6c8693d47ee8')");
                break;
        }
    }

    @Override // defpackage.ko
    public final void c(se0 se0Var) {
        switch (this.b) {
            case 0:
                SQLiteDatabase sQLiteDatabase = se0Var.g;
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `battery_sample`");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `charging_session`");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `discharge_session`");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `app_usage`");
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS `health_snapshot`");
                break;
            default:
                SQLiteDatabase sQLiteDatabase2 = se0Var.g;
                sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS `benchmark_run`");
                sQLiteDatabase2.execSQL("DROP TABLE IF EXISTS `subtest_value`");
                break;
        }
    }

    @Override // defpackage.ko
    public final void j() {
        int i = this.b;
    }

    @Override // defpackage.ko
    public final void m(se0 se0Var) {
        int i = this.b;
        dh1 dh1Var = this.c;
        switch (i) {
            case 0:
                ((BatteryMonitor2Db_Impl) dh1Var).s(new ct1(se0Var));
                break;
            default:
                se0Var.g.execSQL("PRAGMA foreign_keys = ON");
                ((BenchmarkHistoryDb_Impl) dh1Var).s(new ct1(se0Var));
                break;
        }
    }

    @Override // defpackage.ko
    public final void n(se0 se0Var) {
        switch (this.b) {
            case 0:
                tl2.k(new ct1(se0Var));
                break;
            default:
                tl2.k(new ct1(se0Var));
                break;
        }
    }

    @Override // defpackage.ko
    public final eh1 p(se0 se0Var) {
        int i = this.b;
        String str = yttXLrAeLjN.kdQelhkIoxwvqzx;
        switch (i) {
            case 0:
                HashMap hashMap = new HashMap(13);
                hashMap.put("id", new hv1("id", "INTEGER", true, 1, null, 1));
                hashMap.put("captured_at", new hv1("captured_at", "INTEGER", true, 0, null, 1));
                hashMap.put("level_pct", new hv1("level_pct", "INTEGER", true, 0, null, 1));
                hashMap.put("voltage_mv", new hv1("voltage_mv", "INTEGER", true, 0, null, 1));
                hashMap.put("current_ua", new hv1("current_ua", "INTEGER", true, 0, null, 1));
                hashMap.put("temperature_deci_c", new hv1("temperature_deci_c", "INTEGER", true, 0, null, 1));
                hashMap.put("charge_counter_uah", new hv1(nTAZxGMqQtZZAQ.OHGQl, "INTEGER", true, 0, null, 1));
                hashMap.put("status", new hv1("status", "INTEGER", true, 0, null, 1));
                hashMap.put("plugged", new hv1("plugged", "INTEGER", true, 0, null, 1));
                hashMap.put("charging", new hv1("charging", "INTEGER", true, 0, null, 1));
                hashMap.put("screen_on", new hv1("screen_on", "INTEGER", true, 0, null, 1));
                hashMap.put("thermal_status", new hv1("thermal_status", "INTEGER", true, 0, null, 1));
                hashMap.put("resolution", new hv1("resolution", "INTEGER", true, 0, "0", 1));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new jv1("index_battery_sample_captured_at", false, Arrays.asList("captured_at"), Arrays.asList("ASC")));
                hashSet2.add(new jv1("index_battery_sample_captured_at_charging", false, Arrays.asList("captured_at", "charging"), Arrays.asList("ASC", "ASC")));
                kv1 kv1Var = new kv1("battery_sample", hashMap, hashSet, hashSet2);
                kv1 a2 = kv1.a(se0Var, "battery_sample");
                if (!kv1Var.equals(a2)) {
                    break;
                } else {
                    HashMap hashMap2 = new HashMap(16);
                    hashMap2.put("id", new hv1("id", "INTEGER", true, 1, null, 1));
                    hashMap2.put("started_at", new hv1("started_at", "INTEGER", true, 0, null, 1));
                    hashMap2.put("ended_at", new hv1("ended_at", "INTEGER", true, 0, null, 1));
                    hashMap2.put("start_level_pct", new hv1("start_level_pct", "INTEGER", true, 0, null, 1));
                    hashMap2.put("end_level_pct", new hv1(GFUHKHDfiFuPm.HhXx, "INTEGER", true, 0, null, 1));
                    hashMap2.put("delivered_uah", new hv1("delivered_uah", "INTEGER", true, 0, null, 1));
                    hashMap2.put("plugged_kind", new hv1("plugged_kind", "INTEGER", true, 0, null, 1));
                    hashMap2.put("avg_power_mw", new hv1("avg_power_mw", "INTEGER", true, 0, null, 1));
                    hashMap2.put("peak_power_mw", new hv1("peak_power_mw", "INTEGER", true, 0, null, 1));
                    hashMap2.put("avg_temp_deci_c", new hv1("avg_temp_deci_c", "INTEGER", true, 0, null, 1));
                    hashMap2.put("peak_temp_deci_c", new hv1("peak_temp_deci_c", "INTEGER", true, 0, null, 1));
                    hashMap2.put("sample_count", new hv1("sample_count", "INTEGER", true, 0, null, 1));
                    hashMap2.put("extrapolated_capacity_mah", new hv1("extrapolated_capacity_mah", "INTEGER", true, 0, "0", 1));
                    hashMap2.put("extrapolated_confidence", new hv1("extrapolated_confidence", "INTEGER", true, 0, "0", 1));
                    hashMap2.put("soc_buckets_screen_on_ms", new hv1("soc_buckets_screen_on_ms", "TEXT", false, 0, "''", 1));
                    hashMap2.put("soc_buckets_screen_off_ms", new hv1("soc_buckets_screen_off_ms", "TEXT", false, 0, "''", 1));
                    HashSet hashSet3 = new HashSet(0);
                    HashSet hashSet4 = new HashSet(2);
                    hashSet4.add(new jv1("index_charging_session_started_at", false, Arrays.asList("started_at"), Arrays.asList("ASC")));
                    hashSet4.add(new jv1("index_charging_session_ended_at", false, Arrays.asList("ended_at"), Arrays.asList("ASC")));
                    kv1 kv1Var2 = new kv1("charging_session", hashMap2, hashSet3, hashSet4);
                    kv1 a3 = kv1.a(se0Var, "charging_session");
                    if (!kv1Var2.equals(a3)) {
                        break;
                    } else {
                        HashMap hashMap3 = new HashMap(19);
                        hashMap3.put("id", new hv1("id", "INTEGER", true, 1, null, 1));
                        hashMap3.put("started_at", new hv1("started_at", qJTtDWNCVUDjB.hMw, true, 0, null, 1));
                        hashMap3.put("ended_at", new hv1("ended_at", "INTEGER", true, 0, null, 1));
                        hashMap3.put("start_level_pct", new hv1("start_level_pct", "INTEGER", true, 0, null, 1));
                        hashMap3.put("end_level_pct", new hv1("end_level_pct", "INTEGER", true, 0, null, 1));
                        hashMap3.put("drained_uah", new hv1(bOxzFZXgEkjph.sAqIW, "INTEGER", true, 0, null, 1));
                        hashMap3.put("duration_ms", new hv1("duration_ms", "INTEGER", true, 0, null, 1));
                        hashMap3.put("screen_on_ms", new hv1("screen_on_ms", "INTEGER", true, 0, null, 1));
                        hashMap3.put(aEQQDLUUMo.APmD, new hv1("active_drain_pct_per_hr_x100", Iyrs.gDgZgBruvJFXuW, true, 0, null, 1));
                        hashMap3.put("idle_drain_pct_per_hr_x100", new hv1("idle_drain_pct_per_hr_x100", "INTEGER", true, 0, null, 1));
                        hashMap3.put("avg_power_mw", new hv1("avg_power_mw", "INTEGER", true, 0, null, 1));
                        hashMap3.put("peak_power_mw", new hv1("peak_power_mw", "INTEGER", true, 0, null, 1));
                        hashMap3.put("avg_temp_deci_c", new hv1("avg_temp_deci_c", MiGPiFgcCQCVh.NdDPzduRxe, true, 0, null, 1));
                        hashMap3.put("peak_temp_deci_c", new hv1("peak_temp_deci_c", "INTEGER", true, 0, null, 1));
                        hashMap3.put("sample_count", new hv1(BIxeFreLLop.CxuctBzbB, "INTEGER", true, 0, null, 1));
                        hashMap3.put("deep_sleep_baseline_ms", new hv1("deep_sleep_baseline_ms", "INTEGER", true, 0, "0", 1));
                        hashMap3.put("soc_buckets_screen_on_ms", new hv1("soc_buckets_screen_on_ms", "TEXT", false, 0, "''", 1));
                        hashMap3.put("soc_buckets_screen_off_ms", new hv1("soc_buckets_screen_off_ms", "TEXT", false, 0, "''", 1));
                        hashMap3.put("app_usage_data", new hv1("app_usage_data", "TEXT", false, 0, "''", 1));
                        HashSet hashSet5 = new HashSet(0);
                        HashSet hashSet6 = new HashSet(2);
                        hashSet6.add(new jv1("index_discharge_session_started_at", false, Arrays.asList("started_at"), Arrays.asList("ASC")));
                        hashSet6.add(new jv1("index_discharge_session_ended_at", false, Arrays.asList("ended_at"), Arrays.asList("ASC")));
                        kv1 kv1Var3 = new kv1("discharge_session", hashMap3, hashSet5, hashSet6);
                        kv1 a4 = kv1.a(se0Var, "discharge_session");
                        if (!kv1Var3.equals(a4)) {
                            break;
                        } else {
                            HashMap hashMap4 = new HashMap(7);
                            hashMap4.put("id", new hv1("id", "INTEGER", true, 1, null, 1));
                            hashMap4.put("date_epoch_day", new hv1("date_epoch_day", "INTEGER", true, 0, null, 1));
                            hashMap4.put("package_name", new hv1("package_name", "TEXT", false, 0, null, 1));
                            hashMap4.put("energy_mwh", new hv1("energy_mwh", "INTEGER", true, 0, null, 1));
                            hashMap4.put(MiGPiFgcCQCVh.pRaoyMZmFRh, new hv1("foreground_ms", "INTEGER", true, 0, null, 1));
                            hashMap4.put("background_ms", new hv1("background_ms", "INTEGER", true, 0, null, 1));
                            hashMap4.put("category", new hv1("category", "INTEGER", true, 0, null, 1));
                            HashSet hashSet7 = new HashSet(0);
                            HashSet hashSet8 = new HashSet(2);
                            hashSet8.add(new jv1("index_app_usage_date_epoch_day_package_name", true, Arrays.asList("date_epoch_day", "package_name"), Arrays.asList("ASC", "ASC")));
                            hashSet8.add(new jv1("index_app_usage_date_epoch_day", false, Arrays.asList("date_epoch_day"), Arrays.asList("ASC")));
                            kv1 kv1Var4 = new kv1("app_usage", hashMap4, hashSet7, hashSet8);
                            kv1 a5 = kv1.a(se0Var, "app_usage");
                            if (!kv1Var4.equals(a5)) {
                                break;
                            } else {
                                HashMap hashMap5 = new HashMap(7);
                                hashMap5.put("id", new hv1("id", IGQCApxXGMWo.syZUrssIAksETM, true, 1, null, 1));
                                hashMap5.put("captured_at", new hv1("captured_at", "INTEGER", true, 0, null, 1));
                                hashMap5.put("estimated_capacity_mah", new hv1("estimated_capacity_mah", "INTEGER", true, 0, null, 1));
                                hashMap5.put("design_capacity_mah", new hv1("design_capacity_mah", "INTEGER", true, 0, null, 1));
                                hashMap5.put("cycle_count_x100", new hv1("cycle_count_x100", aEQQDLUUMo.ZTSUmjy, true, 0, null, 1));
                                hashMap5.put("confidence", new hv1("confidence", "INTEGER", true, 0, null, 1));
                                hashMap5.put("source_session_id", new hv1("source_session_id", "INTEGER", true, 0, null, 1));
                                HashSet hashSet9 = new HashSet(0);
                                HashSet hashSet10 = new HashSet(1);
                                hashSet10.add(new jv1("index_health_snapshot_captured_at", false, Arrays.asList("captured_at"), Arrays.asList("ASC")));
                                kv1 kv1Var5 = new kv1("health_snapshot", hashMap5, hashSet9, hashSet10);
                                kv1 a6 = kv1.a(se0Var, "health_snapshot");
                                if (!kv1Var5.equals(a6)) {
                                    break;
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                }
            default:
                HashMap hashMap6 = new HashMap(19);
                hashMap6.put("id", new hv1("id", "INTEGER", true, 1, null, 1));
                hashMap6.put("started_at", new hv1(yttXLrAeLjN.PIQZjJwV, "INTEGER", true, 0, null, 1));
                hashMap6.put("finished_at", new hv1("finished_at", "INTEGER", true, 0, null, 1));
                hashMap6.put("fingerprint_json", new hv1("fingerprint_json", "TEXT", true, 0, null, 1));
                hashMap6.put("overall_score", new hv1("overall_score", "REAL", true, 0, null, 1));
                hashMap6.put("category_scores_json", new hv1("category_scores_json", "TEXT", true, 0, null, 1));
                hashMap6.put(hTYJVDOvZnZlYL.hyGeZGtzCHoXyC, new hv1("thermal_throttle_pct", "REAL", true, 0, null, 1));
                hashMap6.put("stability_cv", new hv1("stability_cv", "REAL", true, 0, null, 1));
                hashMap6.put("iterations", new hv1("iterations", "INTEGER", true, 0, null, 1));
                hashMap6.put("cooldown_sec", new hv1("cooldown_sec", "INTEGER", true, 0, null, 1));
                hashMap6.put("schema_version", new hv1(QCeVODiUkb.XHYKas, "INTEGER", true, 0, null, 1));
                hashMap6.put("thermal_start", new hv1("thermal_start", "INTEGER", true, 0, null, 1));
                hashMap6.put("thermal_end", new hv1("thermal_end", "INTEGER", true, 0, null, 1));
                hashMap6.put("battery_start_pct", new hv1("battery_start_pct", "INTEGER", true, 0, null, 1));
                hashMap6.put("battery_end_pct", new hv1("battery_end_pct", "INTEGER", true, 0, null, 1));
                hashMap6.put("server_run_id", new hv1("server_run_id", "TEXT", false, 0, null, 1));
                hashMap6.put("uploaded", new hv1("uploaded", "INTEGER", true, 0, "0", 1));
                hashMap6.put("throttled_subtest_count", new hv1("throttled_subtest_count", "INTEGER", true, 0, "0", 1));
                hashMap6.put("completion_status", new hv1("completion_status", "INTEGER", true, 0, "0", 1));
                kv1 kv1Var6 = new kv1("benchmark_run", hashMap6, new HashSet(0), new HashSet(0));
                kv1 a7 = kv1.a(se0Var, "benchmark_run");
                if (!kv1Var6.equals(a7)) {
                    break;
                } else {
                    HashMap hashMap7 = new HashMap(15);
                    hashMap7.put("id", new hv1("id", "INTEGER", true, 1, null, 1));
                    hashMap7.put("run_id", new hv1("run_id", "INTEGER", true, 0, null, 1));
                    hashMap7.put("section_id", new hv1("section_id", "TEXT", true, 0, null, 1));
                    hashMap7.put("subtest_id", new hv1("subtest_id", "TEXT", true, 0, null, 1));
                    hashMap7.put("display_name", new hv1("display_name", "TEXT", true, 0, null, 1));
                    hashMap7.put("unit", new hv1("unit", "TEXT", true, 0, null, 1));
                    hashMap7.put("higher_better", new hv1("higher_better", "INTEGER", true, 0, null, 1));
                    hashMap7.put("median", new hv1("median", "REAL", false, 0, null, 1));
                    hashMap7.put(ILBLnlCHDVqsSN.imEwlwYoRCnaVYG, new hv1(Gvyagftz.YuaemMbCTAK, Gvyagftz.sfq, false, 0, null, 1));
                    hashMap7.put("max_value", new hv1("max_value", "REAL", false, 0, null, 1));
                    hashMap7.put("score", new hv1("score", "REAL", false, 0, null, 1));
                    hashMap7.put("raw_values_json", new hv1("raw_values_json", "TEXT", true, 0, null, 1));
                    hashMap7.put("iteration_cpus_json", new hv1("iteration_cpus_json", "TEXT", true, 0, "'[]'", 1));
                    hashMap7.put("elapsed_ms", new hv1("elapsed_ms", "INTEGER", true, 0, null, 1));
                    hashMap7.put("throttled", new hv1("throttled", "INTEGER", true, 0, "0", 1));
                    HashSet hashSet11 = new HashSet(1);
                    hashSet11.add(new iv1("benchmark_run", "CASCADE", BIxeFreLLop.hfKxMtfRuTjjt, Arrays.asList("run_id"), Arrays.asList("id")));
                    HashSet hashSet12 = new HashSet(1);
                    hashSet12.add(new jv1("index_subtest_value_run_id", false, Arrays.asList("run_id"), Arrays.asList("ASC")));
                    kv1 kv1Var7 = new kv1("subtest_value", hashMap7, hashSet11, hashSet12);
                    kv1 a8 = kv1.a(se0Var, "subtest_value");
                    if (!kv1Var7.equals(a8)) {
                        break;
                    } else {
                        break;
                    }
                }
        }
        return new eh1(true, (String) null);
    }
}
