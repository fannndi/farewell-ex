package defpackage;

import androidx.core.widget.rsm.gXdyRQCGVlHW;
import androidx.media.RfwE.BIxeFreLLop;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.material.bottomsheet.QbYj.qJTtDWNCVUDjB;
import com.google.android.material.card.ZyJo.nTAZxGMqQtZZAQ;
import com.google.android.material.floatingactionbutton.ea.YHJbtPFAANaPQ;
import com.jjoe64.graphview.XZMC.MiGPiFgcCQCVh;
import flar2.devcheck.cputimes.Sd.tEegR;
import flar2.devcheck.dpreference.Eg.aEQQDLUUMo;
import flar2.devcheck.nativebridge.xm.oWuW;
import flar2.devcheck.sensors.JCZI.nyGJ;
import flar2.devcheck.ui.root.GXPA.hTYJVDOvZnZlYL;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import moe.shizuku.api.hYGD.yttXLrAeLjN;

/* loaded from: classes.dex */
public final class tb2 extends r70 {
    public final /* synthetic */ WorkDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb2(WorkDatabase_Impl workDatabase_Impl) {
        super(24, "08b926448d86528e697981ddd30459f7", "149fd8ad55885d3fe3549a37a0163243");
        this.d = workDatabase_Impl;
    }

    @Override // defpackage.r70
    public final void a(ti1 ti1Var) {
        ti1Var.getClass();
        kk1.s(ti1Var, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        kk1.s(ti1Var, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        kk1.s(ti1Var, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        kk1.s(ti1Var, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        kk1.s(ti1Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        kk1.s(ti1Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        kk1.s(ti1Var, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        kk1.s(ti1Var, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        kk1.s(ti1Var, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        kk1.s(ti1Var, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        kk1.s(ti1Var, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        kk1.s(ti1Var, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        kk1.s(ti1Var, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        kk1.s(ti1Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        kk1.s(ti1Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '08b926448d86528e697981ddd30459f7')");
    }

    @Override // defpackage.r70
    public final void c(ti1 ti1Var) {
        ti1Var.getClass();
        kk1.s(ti1Var, "DROP TABLE IF EXISTS `Dependency`");
        kk1.s(ti1Var, aEQQDLUUMo.bfXFiNDtS);
        kk1.s(ti1Var, "DROP TABLE IF EXISTS `WorkTag`");
        kk1.s(ti1Var, "DROP TABLE IF EXISTS `SystemIdInfo`");
        kk1.s(ti1Var, "DROP TABLE IF EXISTS `WorkName`");
        kk1.s(ti1Var, "DROP TABLE IF EXISTS `WorkProgress`");
        kk1.s(ti1Var, "DROP TABLE IF EXISTS `Preference`");
    }

    @Override // defpackage.r70
    public final void r(ti1 ti1Var) {
        ti1Var.getClass();
    }

    @Override // defpackage.r70
    public final void s(ti1 ti1Var) {
        ti1Var.getClass();
        kk1.s(ti1Var, "PRAGMA foreign_keys = ON");
        this.d.s(ti1Var);
    }

    @Override // defpackage.r70
    public final void t(ti1 ti1Var) {
        ti1Var.getClass();
    }

    @Override // defpackage.r70
    public final void u(ti1 ti1Var) {
        ti1Var.getClass();
        tl2.k(ti1Var);
    }

    @Override // defpackage.r70
    public final eh1 v(ti1 ti1Var) {
        ti1Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("work_spec_id", new hv1("work_spec_id", hTYJVDOvZnZlYL.ypgqDs, true, 1, null, 1));
        linkedHashMap.put("prerequisite_id", new hv1("prerequisite_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new iv1("WorkSpec", "CASCADE", "CASCADE", tl2.z("work_spec_id"), tl2.z("id")));
        linkedHashSet.add(new iv1("WorkSpec", "CASCADE", "CASCADE", tl2.z("prerequisite_id"), tl2.z("id")));
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        linkedHashSet2.add(new jv1("index_Dependency_work_spec_id", false, tl2.z("work_spec_id"), tl2.z("ASC")));
        linkedHashSet2.add(new jv1("index_Dependency_prerequisite_id", false, tl2.z("prerequisite_id"), tl2.z("ASC")));
        kv1 kv1Var = new kv1("Dependency", linkedHashMap, linkedHashSet, linkedHashSet2);
        kv1 G = kk1.G(ti1Var, "Dependency");
        if (!kv1Var.equals(G)) {
            return new eh1(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + kv1Var + "\n Found:\n" + G);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new hv1("id", "TEXT", true, 1, null, 1));
        linkedHashMap2.put("state", new hv1("state", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("worker_class_name", new hv1("worker_class_name", "TEXT", true, 0, null, 1));
        linkedHashMap2.put(gXdyRQCGVlHW.dTPkvCWZhl, new hv1(aEQQDLUUMo.voknNsJycdH, "TEXT", true, 0, null, 1));
        linkedHashMap2.put("input", new hv1("input", "BLOB", true, 0, null, 1));
        linkedHashMap2.put("output", new hv1(BIxeFreLLop.lwQyXzkuiiwX, "BLOB", true, 0, null, 1));
        linkedHashMap2.put("initial_delay", new hv1("initial_delay", tEegR.SynunJGmqJoHb, true, 0, null, 1));
        linkedHashMap2.put("interval_duration", new hv1("interval_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("flex_duration", new hv1("flex_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_attempt_count", new hv1("run_attempt_count", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_policy", new hv1("backoff_policy", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("backoff_delay_duration", new hv1("backoff_delay_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("last_enqueue_time", new hv1("last_enqueue_time", "INTEGER", true, 0, "-1", 1));
        linkedHashMap2.put("minimum_retention_duration", new hv1("minimum_retention_duration", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("schedule_requested_at", new hv1("schedule_requested_at", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("run_in_foreground", new hv1("run_in_foreground", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("out_of_quota_policy", new hv1("out_of_quota_policy", YHJbtPFAANaPQ.sLOzl, true, 0, null, 1));
        linkedHashMap2.put("period_count", new hv1("period_count", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("generation", new hv1("generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("next_schedule_time_override", new hv1("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
        linkedHashMap2.put("next_schedule_time_override_generation", new hv1("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
        linkedHashMap2.put("stop_reason", new hv1(gXdyRQCGVlHW.ifw, "INTEGER", true, 0, "-256", 1));
        linkedHashMap2.put("trace_tag", new hv1("trace_tag", "TEXT", false, 0, null, 1));
        linkedHashMap2.put("backoff_on_system_interruptions", new hv1("backoff_on_system_interruptions", "INTEGER", false, 0, null, 1));
        linkedHashMap2.put("required_network_type", new hv1(yttXLrAeLjN.ryh, "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("required_network_request", new hv1("required_network_request", "BLOB", true, 0, "x''", 1));
        linkedHashMap2.put("requires_charging", new hv1("requires_charging", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_device_idle", new hv1("requires_device_idle", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("requires_battery_not_low", new hv1("requires_battery_not_low", qJTtDWNCVUDjB.LAZNzeHQlXtv, true, 0, null, 1));
        linkedHashMap2.put("requires_storage_not_low", new hv1("requires_storage_not_low", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_content_update_delay", new hv1("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("trigger_max_content_delay", new hv1("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("content_uri_triggers", new hv1("content_uri_triggers", "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet3 = new LinkedHashSet();
        LinkedHashSet linkedHashSet4 = new LinkedHashSet();
        linkedHashSet4.add(new jv1("index_WorkSpec_schedule_requested_at", false, tl2.z("schedule_requested_at"), tl2.z("ASC")));
        linkedHashSet4.add(new jv1("index_WorkSpec_last_enqueue_time", false, tl2.z("last_enqueue_time"), tl2.z("ASC")));
        String str = MiGPiFgcCQCVh.yVUczVt;
        kv1 kv1Var2 = new kv1(str, linkedHashMap2, linkedHashSet3, linkedHashSet4);
        kv1 G2 = kk1.G(ti1Var, str);
        if (!kv1Var2.equals(G2)) {
            return new eh1(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + kv1Var2 + "\n Found:\n" + G2);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("tag", new hv1("tag", "TEXT", true, 1, null, 1));
        linkedHashMap3.put("work_spec_id", new hv1("work_spec_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet5 = new LinkedHashSet();
        linkedHashSet5.add(new iv1("WorkSpec", "CASCADE", "CASCADE", tl2.z("work_spec_id"), tl2.z("id")));
        LinkedHashSet linkedHashSet6 = new LinkedHashSet();
        linkedHashSet6.add(new jv1("index_WorkTag_work_spec_id", false, tl2.z("work_spec_id"), tl2.z("ASC")));
        kv1 kv1Var3 = new kv1("WorkTag", linkedHashMap3, linkedHashSet5, linkedHashSet6);
        kv1 G3 = kk1.G(ti1Var, "WorkTag");
        if (!kv1Var3.equals(G3)) {
            return new eh1(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + kv1Var3 + "\n Found:\n" + G3);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("work_spec_id", new hv1("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap4.put("generation", new hv1("generation", "INTEGER", true, 2, "0", 1));
        linkedHashMap4.put("system_id", new hv1("system_id", "INTEGER", true, 0, null, 1));
        LinkedHashSet linkedHashSet7 = new LinkedHashSet();
        linkedHashSet7.add(new iv1("WorkSpec", oWuW.bXpTIsVW, nyGJ.XcuvFUTKDq, tl2.z("work_spec_id"), tl2.z("id")));
        kv1 kv1Var4 = new kv1("SystemIdInfo", linkedHashMap4, linkedHashSet7, new LinkedHashSet());
        kv1 G4 = kk1.G(ti1Var, "SystemIdInfo");
        if (!kv1Var4.equals(G4)) {
            return new eh1(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + kv1Var4 + "\n Found:\n" + G4);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        linkedHashMap5.put("name", new hv1("name", "TEXT", true, 1, null, 1));
        linkedHashMap5.put("work_spec_id", new hv1("work_spec_id", "TEXT", true, 2, null, 1));
        LinkedHashSet linkedHashSet8 = new LinkedHashSet();
        linkedHashSet8.add(new iv1("WorkSpec", "CASCADE", "CASCADE", tl2.z("work_spec_id"), tl2.z("id")));
        LinkedHashSet linkedHashSet9 = new LinkedHashSet();
        linkedHashSet9.add(new jv1("index_WorkName_work_spec_id", false, tl2.z("work_spec_id"), tl2.z("ASC")));
        kv1 kv1Var5 = new kv1("WorkName", linkedHashMap5, linkedHashSet8, linkedHashSet9);
        kv1 G5 = kk1.G(ti1Var, "WorkName");
        if (!kv1Var5.equals(G5)) {
            return new eh1(false, nTAZxGMqQtZZAQ.LdGqj + kv1Var5 + "\n Found:\n" + G5);
        }
        LinkedHashMap linkedHashMap6 = new LinkedHashMap();
        linkedHashMap6.put("work_spec_id", new hv1("work_spec_id", "TEXT", true, 1, null, 1));
        linkedHashMap6.put("progress", new hv1("progress", "BLOB", true, 0, null, 1));
        LinkedHashSet linkedHashSet10 = new LinkedHashSet();
        linkedHashSet10.add(new iv1("WorkSpec", "CASCADE", "CASCADE", tl2.z("work_spec_id"), tl2.z("id")));
        kv1 kv1Var6 = new kv1("WorkProgress", linkedHashMap6, linkedHashSet10, new LinkedHashSet());
        kv1 G6 = kk1.G(ti1Var, "WorkProgress");
        if (!kv1Var6.equals(G6)) {
            return new eh1(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + kv1Var6 + "\n Found:\n" + G6);
        }
        LinkedHashMap linkedHashMap7 = new LinkedHashMap();
        linkedHashMap7.put("key", new hv1("key", "TEXT", true, 1, null, 1));
        linkedHashMap7.put("long_value", new hv1("long_value", yttXLrAeLjN.MVCSYtxZXy, false, 0, null, 1));
        kv1 kv1Var7 = new kv1("Preference", linkedHashMap7, new LinkedHashSet(), new LinkedHashSet());
        kv1 G7 = kk1.G(ti1Var, "Preference");
        if (kv1Var7.equals(G7)) {
            return new eh1(true, (String) null);
        }
        return new eh1(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + kv1Var7 + "\n Found:\n" + G7);
    }
}
